package com.bytedance.codecx.video;

import com.bytedance.codecx.video.EglBase;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class EglBaseCheckerHelper {
    public static WeakReference<EglBase.EglContextChecker> eglContextChecker;

    public static void EglContextDestoryEnd() {
        WeakReference<EglBase.EglContextChecker> weakReference = eglContextChecker;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        eglContextChecker.get().EglContextDestoryEnd();
    }

    public static void EglContextDestoryStart() {
        WeakReference<EglBase.EglContextChecker> weakReference = eglContextChecker;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        eglContextChecker.get().EglContextDestoryStart();
    }

    public static void setEglContextChecker(EglBase.EglContextChecker eglContextChecker2) {
        eglContextChecker = new WeakReference<>(eglContextChecker2);
    }
}
