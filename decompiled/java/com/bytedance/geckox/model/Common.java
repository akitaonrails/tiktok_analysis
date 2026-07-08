package com.bytedance.geckox.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Build;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;

/* JADX INFO: loaded from: classes24.dex */
public class Common {

    @C09CT("aid")
    public long aid;

    @C09CT("app_name")
    public String appName;

    @C09CT("app_version")
    public String appVersion;

    @C09CT("device_id")
    public String deviceId;

    @C09CT("device_model")
    public String deviceModel;

    @C09CT("device_platform")
    public String devicePlatform;

    @C09CT("os")
    public int os;

    @C09CT("os_version")
    public String osVersion;

    @C09CT("region")
    public String region;

    @C09CT("sdk_version")
    public String sdkVersion;

    public Common(long j, String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Build.VERSION.SDK_INT);
        sbLIZ.append("");
        this.osVersion = C2188811AlT.LIZIZ(sbLIZ);
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = BuildConfig.VERSION_NAME;
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.region = str3;
    }
}
