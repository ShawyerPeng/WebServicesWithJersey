// package services.JSON;
//
// import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;
//
// import javax.ws.rs.core.Application;
// import java.util.HashSet;
// import java.util.Set;
//
// public class UsingApplication extends Application {
//     @Override
//     public Set<Class<?>> getClasses() {
//         Set<Class<?>> s = new HashSet<Class<?>>();
//         s.add(UserResource.class);
//         return s;
//     }
//
//     @Override
//     public Set<Object> getSingletons() {
//         MOXyJsonProvider moxyJsonProvider = new MOXyJsonProvider();
//         moxyJsonProvider.setWrapperAsArrayName(true);
//         HashSet<Object> set = new HashSet<Object>(1);
//         set.add(moxyJsonProvider);
//         return set;
//     }
// }
