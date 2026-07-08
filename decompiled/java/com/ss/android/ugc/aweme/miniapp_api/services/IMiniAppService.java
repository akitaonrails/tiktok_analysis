package com.ss.android.ugc.aweme.miniapp_api.services;

import X.C1611490s2N;
import X.InterfaceC1030630cvV;
import X.InterfaceC1030640cvW;
import X.InterfaceC1030650cvX;
import X.InterfaceC1030660cvY;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface IMiniAppService {
    String addScene(String str, String str2);

    boolean checkMiniAppEnable(Context context);

    String getJsSdkVersion(Application application);

    InterfaceC1030650cvX getMobClickCombinerIpcService();

    void getShareInfo(String str, InterfaceC1030640cvW interfaceC1030640cvW);

    InterfaceC1030660cvY getTTDownloaderIpcService();

    void handleActivityImageResult(int i, int i2, Intent intent);

    void initMiniApp(InterfaceC1030630cvV interfaceC1030630cvV);

    void initWebViewSuffix(ContextWrapper contextWrapper, String str);

    boolean isMinAppAvailable(Context context, String str);

    void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4);

    void logExcitingVideoAd(Context context, String str, long j, String str2);

    void notifyFollowAwemeState(int i);

    void notifyLocaleChange(Locale locale);

    void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr);

    boolean openMiniApp(Context context, MicroAppInfo microAppInfo, C1611490s2N c1611490s2N);

    boolean openMiniApp(Context context, String str, C1611490s2N c1611490s2N);

    boolean openShortcut(Context context, Intent intent);

    void preloadMiniApp(String str);

    void preloadMiniApp(String str, int i);

    void remoteMobV3(String str, JSONObject jSONObject);

    String setLaunchModeHostTask(String str);

    void tryMoveMiniAppActivityToFront(String str);
}
