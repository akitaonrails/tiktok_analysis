package com.ss.bytertc.audio.device.router;

import android.content.Context;
import com.bytedance.realx.base.ContextUtils;

/* JADX INFO: loaded from: classes35.dex */
public class AudioRouteUtil {
    public static String modeString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static Context getContext() {
        return ContextUtils.getApplicationContext();
    }
}
