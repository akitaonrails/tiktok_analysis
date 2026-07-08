package com.ttnet.org.chromium.base;

import android.os.StrictMode;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public class TimezoneUtils {
    public static String getDefaultTimeZoneId() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String id = TimeZone.getDefault().getID();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return id;
    }
}
