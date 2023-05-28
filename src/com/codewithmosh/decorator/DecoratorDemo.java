package com.codewithmosh.decorator;

public class DecoratorDemo {

    public void execute() {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
        storeCreditCard(new CompressedCloudStream(new EncryptedCloudStream(new CloudStream())));
        storeCreditCard(new CompressedCloudStream(new CloudStream()));
        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
    }

    public void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
