package com.google.gson.reflect;

import X.C202094145s;
import X.C2277531ECp;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final ConcurrentHashMap<Object, TypeToken> LIZ = new ConcurrentHashMap<>(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
    public static Boolean LIZIZ = null;

    public static boolean LIZ() {
        if (C202094145s.LJIILL == 0) {
            return false;
        }
        Boolean boolValueOf = LIZIZ;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(!((Boolean) C2277531ECp.LJII.getValue()).booleanValue());
            LIZIZ = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
