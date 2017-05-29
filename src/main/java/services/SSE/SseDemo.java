// package services.SSE;
//
// import org.glassfish.jersey.media.sse.OutboundEvent;
// import org.glassfish.jersey.media.sse.SseBroadcaster;
// import org.glassfish.jersey.media.sse.SseFeature;
//
// import javax.ws.rs.GET;
// import javax.ws.rs.Path;
// import javax.ws.rs.Produces;
// import javax.ws.rs.core.Context;
//
// @Path("events")
// public class SseDemo {
//     @GET
//     @Produces(SseFeature.SERVER_SENT_EVENTS)
//     public void getServerSentEvents(@Context SseEventSink eventSink, @Context Sse sse) {
//         new Thread(() -> {
//             for (int i = 0; i < 10; i++) {
//                 final OutboundEvent event = sse.newEventBuilder()
//                         .name("message-to-client")
//                         .data(String.class, "Hello world " + i + "!")
//                         .build();
//                 eventSink.onNext(event);
//             }
//         }).start();
//     }
// }
