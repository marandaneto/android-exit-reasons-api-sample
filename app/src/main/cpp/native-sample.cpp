#include <jni.h>

extern "C" JNIEXPORT void JNICALL Java_com_marandaneto_androidrsample_MainActivity_crash(JNIEnv *env, jobject cls) {
    char *ptr = 0;
    *ptr += 1;
}
