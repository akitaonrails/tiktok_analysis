package com.ss.android.ugc.aweme.service.downgrade;

import X.C0CCZ;
import X.C0WLA;
import X.C13BV;
import X.C1865580yeC;
import X.C1887100zCu;
import X.InterfaceC1887090zCt;
import X.InterfaceC1909280zmg;
import X.InterfaceC1909500zn2;
import X.InterfaceC435500H5w;
import X.InterfaceC639200P5i;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.test_settings.settting.IDebugSettingRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultLocalTestImpl implements LocalTestApi {
    public static final C1865580yeC Companion = new Object() { // from class: X.0yeC
    };
    public static InterfaceC1909280zmg defaultSpecActDebugService;

    public String appendDeviceId(String str) {
        return str;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean bypassUrlForWebViewIsolation(String str) {
        return false;
    }

    public void checkApi(String str, String str2, boolean z, String str3, boolean z2, String str4) {
    }

    public boolean closeAnimation() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void copyContent(String str, Context context) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enableBoe() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enableBoeJsbBypass() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enableDeeplinkIntercept() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enableLynxSec() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enablePpe() {
        return false;
    }

    public boolean enableStark() {
        return false;
    }

    public boolean enableTTP() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enableWebHttps() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean forceUpdateSlardarSetting() {
        return false;
    }

    public Aweme getAdPreviewAweme(Context context) {
        return null;
    }

    public String getAdPreviewBaseUrl() {
        return null;
    }

    public int getAdminOpsIconId() {
        return 0;
    }

    public int getAdminOpsLabelId() {
        return 0;
    }

    public int getAdminOpsThinIconId() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getBoeLane() {
        return "";
    }

    public void getDebugUrlMessage(Context context, String str, String str2) {
    }

    public String getDefaultRNTestHost() {
        return "";
    }

    public C0CCZ getDmBootFinishTask() {
        return null;
    }

    public C0CCZ getDmTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Map<String, String> getDownGradeList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getEcommerceBoeHost() {
        return "";
    }

    public Class<? extends Fragment> getFeaturesFragment() {
        return null;
    }

    public int getFillIconId() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getFrontierBoeUrl() {
        return null;
    }

    public C0CCZ getInitBPEAToolTask() {
        return null;
    }

    public C0CCZ getInitHDTTask() {
        return null;
    }

    public C0CCZ getInitWebviewJsInjectionTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public List<String> getJsbSafeHost() {
        return null;
    }

    public String getKidsModeAllowListJsonStr(Context context) {
        return null;
    }

    public Object getLabelAssem(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getLiveBoeWsDomain() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getLiveBoeWsDomainNewFrontier() {
        return null;
    }

    public String getLynxDurlDataBaseUrl() {
        return "";
    }

    public String getMiniAppListH5Url() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getPPELane() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getPpeLane() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public InterfaceC435500H5w getSearchAutoTestService() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public InterfaceC639200P5i getSearchNullifyDebugHelper() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public CharSequence getSparkErrorMessageDetail(View view, String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public InterfaceC1909500zn2 getTabletService() {
        return null;
    }

    public String getTtpLane() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void handleDurlForLocaltest(SparkContext sparkContext) {
    }

    public void handleUrl(String str, String str2, String str3) {
    }

    public boolean ignoreAuthPopupRule() {
        return false;
    }

    public void initBtm() {
    }

    public void initCronyManager(Application application) {
    }

    public void initHybridDevtoolScanService() {
    }

    public void initPreciseTest() {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void initSDUIDebugger() {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean injectJsGuardEnabled() {
        return true;
    }

    public boolean isEnablePreciseTest(Context context) {
        return false;
    }

    public boolean isEnableRestrictiveRuleToast() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean isEnableShowTranslateKey() {
        return false;
    }

    public boolean isEnvWindowEnabled() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean isLynxSSRPermissionByPassEnable() {
        return false;
    }

    public boolean isMockPopup() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean isOpen() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean isOpenPopupDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean isPPEEnable() {
        return false;
    }

    public boolean isTTMBoe() {
        return false;
    }

    public boolean isTTWebViewEnabled(Context context) {
        return false;
    }

    public void logEnterPhone(boolean z, String str, String str2, int i, String str3) {
    }

    public void logEnterSms(boolean z, int i, String str) {
    }

    public boolean lynxDebugEnable() {
        return true;
    }

    public boolean lynxDevToolDebugEnable() {
        return false;
    }

    public boolean mynaPreviewUrlHandler(Context context, String str) {
        return false;
    }

    public Boolean onShouldOverrideUrlLoading(WebView webView, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void openChatNoticeDebugBottomSheet(FragmentManager fragmentManager, Object obj, C1887100zCu c1887100zCu) {
    }

    public void performAdminAction(Aweme aweme, String str, Context context) {
    }

    public ViewGroup provideWebSocketDebugView(Context context) {
        return null;
    }

    public void registerTools(IDebugSettingRegistry iDebugSettingRegistry, String str) {
    }

    public boolean saveGeckoValueWithKeva(int i) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean seclinkEnable() {
        return true;
    }

    public void setBoe(Context context, boolean z) {
    }

    public void setBoeLane(String str) {
    }

    public void setBoePathBypassList(String[] strArr) {
    }

    public void setEnableEnvWindow(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void setIsLoggedIn(boolean z) {
    }

    public void setPpe(Context context, boolean z) {
    }

    public void setPpeLane(String str) {
    }

    public void setTtpLane(String str) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void shareSocialAvatarToDM() {
    }

    public boolean shouldBulletShowDebugTagView() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean shouldCompatibleWithSearchUIAutoTest() {
        return false;
    }

    public void showBoeToast(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void showBridgeBlockTips(C0WLA c0wla, String str) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void showDeeplinkInterceptorRemind(String str, String str2) {
    }

    public void showEcSchemaVerifyToast(String str, String str2, int i, String str3) {
    }

    public void startDebugConnectMonitor() {
    }

    public boolean switchLanguage(Context context, String str) {
        return false;
    }

    public void toastRule(WebView webView) {
    }

    public boolean turnOffContactPopup() {
        return false;
    }

    public boolean turnOffFacebookPopup() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public InterfaceC1887090zCt getAccountDebugService() {
        return new InterfaceC1887090zCt() { // from class: X.0zBi
            @Override // X.InterfaceC1887090zCt
            public final void LIZ() {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public List<String> getBoeBypassHostList() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public List<String> getBoeBypassPathList() {
        return new ArrayList();
    }

    public List<String> getPpeBypassHostList() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public InterfaceC1909280zmg getSpecActDebugService() {
        if (defaultSpecActDebugService == null) {
            defaultSpecActDebugService = new InterfaceC1909280zmg() { // from class: X.0zBh
                @Override // X.InterfaceC1909280zmg
                public final void LIZ() {
                }
            };
        }
        return defaultSpecActDebugService;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean enableManualDowngrade() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public List<String> getBoeGeckoChannelBlockList() {
        return C13BV.INSTANCE;
    }

    public List<String> getBoeWebviewHostBypassList() {
        return C13BV.INSTANCE;
    }

    public List<String> getBoeWebviewPathBypassList() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getQualityProtectionSwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getSearchCoinDebugSwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getSearchDebugSwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getSearchMarkdownSpaceHighlightSwitch() {
        return Boolean.FALSE;
    }

    public Boolean getSearchMobVerifySwitch() {
        return Boolean.FALSE;
    }

    public Boolean getSearchNimbleDebugTagSwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getSearchPerfDebugSwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getSearchVideoAutoplayGuideLineSwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getVisualSearchTagComponentsAvoidanceRecordsToast() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getVisualSearchTagFailTipSwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getVisualSearchTagVersionSwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean isSearchLynxTemplateBundleCacheDisabled() {
        return Boolean.FALSE;
    }
}
