package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C0TJN;
import X.C19EG;
import X.C1AGV;
import X.C1AQR;
import X.C1AU7;
import X.C1AU9;
import X.C1AUC;
import X.C1AUE;
import X.C475030Ik1;
import X.InterfaceC19289210dG;
import X.InterfaceC19562711gH;
import X.InterfaceC420801kM;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public interface IHostAppContext extends C006A {
    int appId();

    String appName();

    Context context();

    Locale currentLocale();

    String currentRegionCode();

    long currentTimeMillis();

    void detectFragLeakOffline(Object obj);

    void fetchLocation(String str, String str2, C1AUC c1auc, Long l);

    void fetchLocationForHost(String str, String str2, C1AUC c1auc, Long l);

    String getAppBuildTime();

    long getAppFeedEndTime();

    String getAppLanguage();

    long getApplicationInitTime();

    String getBoeLane();

    String getBuildNumber();

    String getChannel();

    String getIDCTypeUpperCase();

    String getIapKey();

    LifecycleOwner getLifecycleOwner(View view, C19EG c19eg);

    long getPowerRate();

    String getPpeLane();

    InterfaceC665370Q7z getScope(View view, C19EG c19eg);

    String getServerDeviceId();

    String getSessionId();

    int getShortVersionCode();

    int getUpdateVersionCode();

    String getVersionCode();

    int getVersionCodeInt();

    String getVersionName();

    double getVolume();

    boolean hasPlayerHardDecodeSupport(boolean z);

    C0TJN initGameScanner(Context context, SurfaceHolder surfaceHolder, InterfaceC19289210dG interfaceC19289210dG, String str);

    boolean isAppBackground();

    boolean isAppForeground();

    boolean isBoe();

    boolean isCoin();

    boolean isEnableLive();

    boolean isInBottomLiveTab();

    boolean isInMusicallyRegion();

    boolean isLiveInhouse();

    boolean isLocalTest();

    boolean isLocationPermissionGranted(Context context);

    boolean isLocationServiceEnabled(Context context);

    boolean isM2();

    boolean isOffline();

    boolean isOfflineOrIsRegressionTest();

    boolean isPpe();

    boolean isRegressionTest();

    int liveId();

    /* bridge */ /* synthetic */ void onInit();

    void openQrScannerPage(Context context);

    void postHighLightImage(C1AU7 c1au7);

    InterfaceC420801kM registerAppEnterForeBackgroundCallback(InterfaceC19562711gH interfaceC19562711gH);

    void registerCrashCallback(C1AQR c1aqr);

    void registerLifeCycleCallback(C1AGV c1agv);

    void registerPageEventCallback(C1AU9 c1au9);

    void requestLocationPermission(String str, String str2, C19EG c19eg, C475030Ik1 c475030Ik1, C1AUE c1aue);

    void requestLocationPermissionForHost(String str, String str2, C19EG c19eg, Fragment fragment, C475030Ik1 c475030Ik1, C1AUE c1aue);

    void startPhoneAsCameraActivity(Context context, Map<String, String> map);
}
