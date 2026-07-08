package com.bytedance.android.livesdkapi.host.dummy;

import X.C0TJN;
import X.C1796550wqr;
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
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class LiveHostAppContextDummy implements IHostAppContext {
    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int appId() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String appName() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final Context context() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String currentRegionCode() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final long currentTimeMillis() {
        return 0L;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final /* synthetic */ void detectFragLeakOffline(Object obj) {
        C1796550wqr.LIZ(this, obj);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void fetchLocation(String str, String str2, C1AUC c1auc, Long l) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void fetchLocationForHost(String str, String str2, C1AUC c1auc, Long l) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getAppBuildTime() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final long getAppFeedEndTime() {
        return 0L;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getAppLanguage() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final long getApplicationInitTime() {
        return 0L;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getBoeLane() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getBuildNumber() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getChannel() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getIDCTypeUpperCase() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getIapKey() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final LifecycleOwner getLifecycleOwner(View view, C19EG c19eg) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final long getPowerRate() {
        return 0L;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getPpeLane() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final InterfaceC665370Q7z getScope(View view, C19EG c19eg) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getServerDeviceId() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getSessionId() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int getShortVersionCode() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int getUpdateVersionCode() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getVersionCode() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int getVersionCodeInt() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getVersionName() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final double getVolume() {
        return 0.0d;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean hasPlayerHardDecodeSupport(boolean z) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final C0TJN initGameScanner(Context context, SurfaceHolder surfaceHolder, InterfaceC19289210dG interfaceC19289210dG, String str) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isAppBackground() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isAppForeground() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isBoe() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isCoin() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isEnableLive() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isInBottomLiveTab() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isInMusicallyRegion() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isLiveInhouse() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isLocalTest() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isLocationPermissionGranted(Context context) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isLocationServiceEnabled(Context context) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isM2() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isOffline() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isOfflineOrIsRegressionTest() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isPpe() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isRegressionTest() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int liveId() {
        return 12;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void openQrScannerPage(Context context) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void postHighLightImage(C1AU7 c1au7) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final InterfaceC420801kM registerAppEnterForeBackgroundCallback(InterfaceC19562711gH interfaceC19562711gH) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void registerCrashCallback(C1AQR c1aqr) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void registerLifeCycleCallback(C1AGV c1agv) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void registerPageEventCallback(C1AU9 c1au9) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void requestLocationPermission(String str, String str2, C19EG c19eg, C475030Ik1 c475030Ik1, C1AUE c1aue) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void requestLocationPermissionForHost(String str, String str2, C19EG c19eg, Fragment fragment, C475030Ik1 c475030Ik1, C1AUE c1aue) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void startPhoneAsCameraActivity(Context context, Map<String, String> map) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final Locale currentLocale() {
        return Locale.getDefault();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final /* bridge */ /* synthetic */ void onInit() {
    }
}
