package io.github.oyeprashar.server;

import io.github.oyeprashar.server.proto.Greeting.GreetingResponse;
import io.github.oyeprashar.server.proto.Greeting.UserData;
import io.github.oyeprashar.server.proto.GreetingServiceGrpc;

/*
    We write the logic for all APIs here
*/

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void getGreeting(UserData request,io.grpc.stub.StreamObserver<GreetingResponse> responseObserver){

        GreetingResponse greetingResponse = GreetingResponse.newBuilder().setGreeting("Good morning " + request.getName()).build();
        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();
    }
}
