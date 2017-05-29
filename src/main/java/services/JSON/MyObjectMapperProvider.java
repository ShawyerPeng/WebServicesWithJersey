// package services.JSON;
//
//
// import com.fasterxml.jackson.databind.AnnotationIntrospector;
// import com.fasterxml.jackson.databind.DeserializationConfig;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.databind.SerializationConfig;
// import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
// import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
// import javafx.util.Pair;
// import services.Parameter.User;
//
// import javax.ws.rs.ext.ContextResolver;
// import javax.ws.rs.ext.Provider;
//
// @Provider
// public class MyObjectMapperProvider implements ContextResolver<ObjectMapper> {
//     /**
//      Default Object Mapper will be used for other POJOs
//      */
//     final ObjectMapper defaultObjectMapper;
//
//     /**
//      user Object Mapper will be used for User POJO ONLY.
//      */
//     final ObjectMapper userObjectMapper;
//
//     /**
//      MyObjectMapperProvider() constructor initializes the
//      defaultObjectMapper and userObjectMapper.
//      */
//     public MyObjectMapperProvider() {
//         defaultObjectMapper = createDefaultMapper();
//         userObjectMapper = createUserObjectMapper();
//     }
//
//     // specific ObjectMapper instance
//     public ObjectMapper getContext(Class<?> aClass) {
//         if (aClass == User.class) {
//             return userObjectMapper;
//         } else {
//             return defaultObjectMapper;
//         }
//     }
//
//     private static ObjectMapper createUserObjectMapper() {
//         Pair combinedIntrospector = createJaxbJacksonAnnotationIntrospector();
//         ObjectMapper result = new ObjectMapper();
//         result.configure(SerializationConfig.Feature.WRAP_ROOT_VALUE, true);
//         result.configure(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE, true);
//         result.setDeserializationConfig(result.getDeserializationConfig().withAnnotationIntrospector(combinedIntrospector));
//         result.setSerializationConfig(result.getSerializationConfig().withAnnotationIntrospector(combinedIntrospector));
//         return result;
//     }
//
//     private static ObjectMapper createDefaultMapper() {
//         ObjectMapper result = new ObjectMapper();
//         result.configure(Feature.INDENT_OUTPUT, true);
//         return result;
//     }
//
//     private static Pair createJaxbJacksonAnnotationIntrospector() {
//         AnnotationIntrospector jaxbIntrospector = new JaxbAnnotationIntrospector();
//         AnnotationIntrospector jacksonIntrospector = new JacksonAnnotationIntrospector();
//         return new AnnotationIntrospector.Pair(
//                 jacksonIntrospector, jaxbIntrospector);
//     }
//
// }
