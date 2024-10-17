# fastjson2-native

To demonstrate fastjson2 does not deserialize boolean field with false value in native image.

The root cause is incorrectly Using Unsafe safely in GraalVM Native Image.

To run:

mvn clean package -Pnative

./target/my-app
