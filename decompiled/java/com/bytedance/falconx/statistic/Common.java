package com.bytedance.falconx.statistic;

import X.C09CT;
import android.os.Build;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;

/* JADX INFO: loaded from: classes31.dex */
public class Common {

    @C09CT("app_version")
    public String appVersion;

    @C09CT("device_id")
    public String deviceId;

    @C09CT("os")
    public int os;

    @C09CT("region")
    public String region;

    @C09CT("sdk_version")
    public String sdkVersion = BuildConfig.VERSION_NAME;

    @C09CT("device_model")
    public String deviceModel = Build.MODEL;
}
