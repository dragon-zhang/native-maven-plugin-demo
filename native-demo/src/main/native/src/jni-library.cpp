#include <jni.h>
#include <jni_md.h>
#include "com_example_JniWrapper.h"

extern "C"
JNIEXPORT jstring JNICALL Java_com_example_JniWrapper_getString
  (JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("OK");
}