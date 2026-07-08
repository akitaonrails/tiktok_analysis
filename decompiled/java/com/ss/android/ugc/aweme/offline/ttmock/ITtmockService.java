package com.ss.android.ugc.aweme.offline.ttmock;

import X.C1331510kkn;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.test_settings.settting.IDebugSettingRegistry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public interface ITtmockService {
    void addTTMockAnimationId(View view, int i);

    String addTTMockDescName(View view, String str);

    void addTTMockIconLabel(View view, Drawable drawable);

    String addTTMockResourceId(View view);

    String addTTMockResourceName(View view, int i);

    String addTTMockResourceName(View view, CharSequence charSequence);

    void addTTMockResourceName(View view, Drawable drawable);

    String addTTMockViewId(View view, int i);

    void addViewInfoForSetController(View view, C1331510kkn c1331510kkn);

    void analysisAndAppendInfoToView(View view, int i);

    void autoLogin(String str, String str2, int i);

    void autoLoginByEmailAndPwd(String str, String str2);

    Boolean bypass();

    Boolean closeAnimation();

    String createPic(View view, String str, Activity activity);

    Boolean disableRemoveConsentMock();

    boolean draw(Canvas canvas, View view);

    Boolean enableBoe();

    Boolean enableBoeJsbBypass();

    Boolean enablePPE();

    Boolean enableTTP();

    String exportTTMockToLocal(String str);

    View findTargetView(Activity activity);

    n generateEnvJson();

    n getABMockData();

    n getABSettingsMock();

    Integer getBRPreloginSwitch();

    String[] getBoeHostBypassList();

    String getBoeLane();

    Object getBoeMock();

    String[] getBoePathBypassList();

    String[] getBoeWebviewHostBypassList();

    String[] getBoeWebviewPathBypassList();

    ConcurrentHashMap<String, k> getByteBenchSettingsMap();

    String getCarrierRegion();

    Boolean getCastoreMock();

    String getChannelData();

    String getClientABMockValue(String str);

    Integer getDeviceCheckMock();

    String getEventVerifyUrl();

    n getFastConfigData();

    boolean getFastbotSwitch();

    int getGitBranchId();

    Integer getInstallM2Mock();

    Integer getInstallMMock();

    ConcurrentHashMap<String, k> getLiveAbSettingsMap();

    n getLiveSettingData();

    HashMap<Integer, Integer> getLoadStringInfo();

    String getMccRegion();

    String getMockChannel();

    Map<String, k> getMockExtraInfo();

    String getMockLanguage();

    String getOpRegion();

    String getPPELane();

    int getPageCodeActivityId();

    int getPageCodeFragmentId();

    int getPageNameActivityId();

    int getPageNameFragmentId();

    int getPageXMLId();

    JSONObject getPopupAllowList();

    Integer getPreloginLoginTimeLimit();

    void getRequestHeaderMock(Map<String, String> map);

    String getSsaid();

    boolean getStopEllipsize();

    String getSysRegion();

    n getTTMockABInner();

    Integer getTTMockAnimationId();

    Integer getTTMockContentDescriptionId();

    String getTTMockFakeImgUrl();

    String getTTMockHybridID();

    Integer getTTMockIconLabelId();

    Integer getTTMockImageUrl();

    n getTTMockNetworkInner();

    Integer getTTMockResourceId();

    String getTTPLane();

    String getTTnetProxyIP();

    Integer getTTnetProxyPort();

    ConcurrentHashMap<String, k> getVeAbSettingsMap();

    int getVersionNameId();

    String getViewPath(View view);

    void hideFloatView();

    void initArt();

    void initByteInsight();

    void initFastConfig(Activity activity);

    void initForAppCompatImageView(View view, Context context, AttributeSet attributeSet, Integer num);

    void initForAppCompatTextView(View view, Context context, AttributeSet attributeSet, Integer num);

    void initTTMock();

    void initTTMockMd5();

    void injectViewListener(View view);

    boolean interceptScanResult(String str, Context context);

    boolean isABReverse();

    boolean isAnimationSwitchClose();

    boolean isArtMode();

    boolean isBlackMode();

    boolean isEnablePreciseTest();

    boolean isEnableSParkDebug();

    boolean isMockPopup();

    boolean isOpen();

    boolean isOpenDebugSettings();

    boolean isProxyTTnet();

    boolean isStopPlay();

    void loadAbJson(String str);

    void loginWhenStart();

    void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    void onInitializeAccessibilityNodeInfo2(View view, AccessibilityNodeInfo accessibilityNodeInfo);

    void openFastConfig(String str, Context context);

    boolean openVMPreviewAdsConfig();

    void postTTMockEnvData(n nVar, String str, String str2);

    void putDrawableInfo(int i, int i2);

    void registerKitTools(IDebugSettingRegistry iDebugSettingRegistry, String str);

    void setAnimation(View view, String str);

    String setContentDescription(CharSequence charSequence, View view);

    void setIsLoggedIn(boolean z);

    void setSSOMock();

    void setVeAbDataToSp(String str, Object obj);

    void skipDialog(Object obj);

    boolean skipSnackbar(Object obj);

    void startShowFloatView(Activity activity);

    void ttmockInject(Activity activity, String str);
}
