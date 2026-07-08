package com.ss.android.ugc.aweme.local_test;

import X.C0WLA;
import X.C1887100zCu;
import X.InterfaceC1887090zCt;
import X.InterfaceC1909280zmg;
import X.InterfaceC1909500zn2;
import X.InterfaceC435500H5w;
import X.InterfaceC639200P5i;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public interface LocalTestApi {
    boolean bypassUrlForWebViewIsolation(String str);

    void copyContent(String str, Context context);

    boolean enableBoe();

    boolean enableBoeJsbBypass();

    boolean enableDeeplinkIntercept();

    boolean enableLynxSec();

    Boolean enableManualDowngrade();

    boolean enablePpe();

    boolean enableWebHttps();

    boolean forceUpdateSlardarSetting();

    InterfaceC1887090zCt getAccountDebugService();

    List<String> getBoeBypassHostList();

    List<String> getBoeBypassPathList();

    List<String> getBoeGeckoChannelBlockList();

    String getBoeLane();

    Map<String, String> getDownGradeList();

    String getEcommerceBoeHost();

    String getFrontierBoeUrl();

    List<String> getJsbSafeHost();

    String getLiveBoeWsDomain();

    String getLiveBoeWsDomainNewFrontier();

    String getPPELane();

    String getPpeLane();

    Boolean getQualityProtectionSwitch();

    InterfaceC435500H5w getSearchAutoTestService();

    Boolean getSearchCoinDebugSwitch();

    Boolean getSearchDebugSwitch();

    Boolean getSearchMarkdownSpaceHighlightSwitch();

    InterfaceC639200P5i getSearchNullifyDebugHelper();

    Boolean getSearchPerfDebugSwitch();

    Boolean getSearchVideoAutoplayGuideLineSwitch();

    CharSequence getSparkErrorMessageDetail(View view, String str, String str2);

    InterfaceC1909280zmg getSpecActDebugService();

    InterfaceC1909500zn2 getTabletService();

    Boolean getVisualSearchTagComponentsAvoidanceRecordsToast();

    Boolean getVisualSearchTagFailTipSwitch();

    Boolean getVisualSearchTagVersionSwitch();

    void handleDurlForLocaltest(SparkContext sparkContext);

    void initSDUIDebugger();

    boolean injectJsGuardEnabled();

    boolean isEnableShowTranslateKey();

    boolean isLynxSSRPermissionByPassEnable();

    boolean isOpen();

    boolean isOpenPopupDebug();

    boolean isPPEEnable();

    Boolean isSearchLynxTemplateBundleCacheDisabled();

    void openChatNoticeDebugBottomSheet(FragmentManager fragmentManager, Object obj, C1887100zCu c1887100zCu);

    boolean seclinkEnable();

    void setIsLoggedIn(boolean z);

    void shareSocialAvatarToDM();

    boolean shouldCompatibleWithSearchUIAutoTest();

    void showBridgeBlockTips(C0WLA c0wla, String str);

    void showDeeplinkInterceptorRemind(String str, String str2);
}
