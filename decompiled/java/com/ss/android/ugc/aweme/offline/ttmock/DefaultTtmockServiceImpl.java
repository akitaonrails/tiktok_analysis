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

/* JADX INFO: loaded from: classes21.dex */
public final class DefaultTtmockServiceImpl implements ITtmockService {
    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void addTTMockAnimationId(View view, int i) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String addTTMockDescName(View view, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void addTTMockIconLabel(View view, Drawable drawable) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String addTTMockResourceId(View view) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String addTTMockResourceName(View view, int i) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String addTTMockResourceName(View view, CharSequence charSequence) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void addTTMockResourceName(View view, Drawable drawable) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String addTTMockViewId(View view, int i) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void addViewInfoForSetController(View view, C1331510kkn c1331510kkn) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void analysisAndAppendInfoToView(View view, int i) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void autoLogin(String str, String str2, int i) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void autoLoginByEmailAndPwd(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String createPic(View view, String str, Activity activity) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Boolean disableRemoveConsentMock() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean draw(Canvas canvas, View view) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Boolean enableBoe() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Boolean enableBoeJsbBypass() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Boolean enablePPE() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Boolean enableTTP() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String exportTTMockToLocal(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public View findTargetView(Activity activity) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public n generateEnvJson() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public n getABMockData() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public n getABSettingsMock() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Integer getBRPreloginSwitch() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String[] getBoeHostBypassList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getBoeLane() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Object getBoeMock() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String[] getBoePathBypassList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String[] getBoeWebviewHostBypassList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String[] getBoeWebviewPathBypassList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public ConcurrentHashMap<String, k> getByteBenchSettingsMap() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getCarrierRegion() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Boolean getCastoreMock() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getChannelData() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getClientABMockValue(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Integer getDeviceCheckMock() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getEventVerifyUrl() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public n getFastConfigData() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean getFastbotSwitch() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public int getGitBranchId() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Integer getInstallM2Mock() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Integer getInstallMMock() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public ConcurrentHashMap<String, k> getLiveAbSettingsMap() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public n getLiveSettingData() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getMccRegion() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getMockChannel() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Map<String, k> getMockExtraInfo() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getMockLanguage() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getOpRegion() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getPPELane() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public int getPageCodeActivityId() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public int getPageCodeFragmentId() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public int getPageNameActivityId() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public int getPageNameFragmentId() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public int getPageXMLId() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public JSONObject getPopupAllowList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Integer getPreloginLoginTimeLimit() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void getRequestHeaderMock(Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getSsaid() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean getStopEllipsize() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getSysRegion() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public n getTTMockABInner() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Integer getTTMockAnimationId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Integer getTTMockContentDescriptionId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getTTMockFakeImgUrl() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getTTMockHybridID() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Integer getTTMockIconLabelId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Integer getTTMockImageUrl() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public n getTTMockNetworkInner() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Integer getTTMockResourceId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getTTPLane() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getTTnetProxyIP() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Integer getTTnetProxyPort() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public ConcurrentHashMap<String, k> getVeAbSettingsMap() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public int getVersionNameId() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String getViewPath(View view) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void hideFloatView() {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void initArt() {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void initByteInsight() {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void initFastConfig(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void initForAppCompatImageView(View view, Context context, AttributeSet attributeSet, Integer num) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void initForAppCompatTextView(View view, Context context, AttributeSet attributeSet, Integer num) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void initTTMock() {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void initTTMockMd5() {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void injectViewListener(View view) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean interceptScanResult(String str, Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean isABReverse() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean isAnimationSwitchClose() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean isArtMode() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean isBlackMode() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean isEnablePreciseTest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean isEnableSParkDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean isMockPopup() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean isOpen() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean isOpenDebugSettings() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean isProxyTTnet() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean isStopPlay() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void loadAbJson(String str) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void loginWhenStart() {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void onInitializeAccessibilityNodeInfo2(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void openFastConfig(String str, Context context) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean openVMPreviewAdsConfig() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void postTTMockEnvData(n nVar, String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void putDrawableInfo(int i, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void registerKitTools(IDebugSettingRegistry iDebugSettingRegistry, String str) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void setAnimation(View view, String str) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public String setContentDescription(CharSequence charSequence, View view) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void setIsLoggedIn(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void setSSOMock() {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void setVeAbDataToSp(String str, Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void skipDialog(Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public boolean skipSnackbar(Object obj) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void startShowFloatView(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public void ttmockInject(Activity activity, String str) {
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public HashMap<Integer, Integer> getLoadStringInfo() {
        return new HashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Boolean bypass() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockService
    public Boolean closeAnimation() {
        return Boolean.FALSE;
    }
}
