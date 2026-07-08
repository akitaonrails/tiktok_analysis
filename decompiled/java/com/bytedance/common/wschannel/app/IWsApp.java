package com.bytedance.common.wschannel.app;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface IWsApp extends Parcelable {
    JSONObject LJLIIIL();

    List<Integer> TJ();

    List<String> ZL();

    int getAppId();

    String getAppKey();

    int getAppVersion();

    int getChannelId();

    String getDeviceId();

    String getExtra();

    Map<String, String> getHeaders();

    String getInstallId();

    int getPlatform();

    boolean lq();

    boolean oh();

    int pf();

    String sK();

    int uM();
}
