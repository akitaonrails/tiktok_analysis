package com.ss.android.ugc.aweme.download.component_api.depend;

import android.content.Context;

/* JADX INFO: loaded from: classes35.dex */
public interface IDownloadSdkMonitorDepend {
    String getAid();

    String getAppVersionName();

    String getChannel();

    Context getContext();

    String getDeviceId();

    String[] getMonitorHosts();

    String getPackageName();

    long getUpdateVersionCode();
}
