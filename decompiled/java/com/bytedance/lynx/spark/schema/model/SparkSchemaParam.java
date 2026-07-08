package com.bytedance.lynx.spark.schema.model;

import X.EnumC1067640dtC;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public class SparkSchemaParam extends HybridSchemaParam {
    public boolean blockBackPress;
    public String clickTime;
    public boolean disableAutoRemoveLoading;
    public boolean disableBackPress;
    public boolean disableHardwareAccelerate;
    public boolean enableSaf;
    public boolean forbiddenAnim;
    public boolean forceBlockBackPress;
    public boolean forceReleaseContextWhenDestroyedForSparkFragment;
    public boolean hideError;
    public boolean hideLoading;
    public boolean ignoreRestoreMain;
    public String initDataUrl;
    public int keyboardAdjust;
    public boolean keyboardCompat;
    public boolean needBottomOut;
    public boolean needWrapperView;
    public String pageName;
    public String romaSession;
    public boolean showProgressBarInAllPage;
    public Integer skeletonDuration;
    public String skeletonFromAlpha;
    public String skeletonPath;
    public String skeletonToAlpha;
    public boolean skeletonWithAnimation;
    public String sparkPerfBid;
    public boolean sparkPerfBidStrictMode;
    public boolean subscribeNetworkLevel;
    public boolean usePreload;
    public boolean webviewProgressBar;

    /* JADX WARN: Multi-variable type inference failed */
    public SparkSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bytedance.lynx.hybrid.param.HybridSchemaParam
    public void adjustValues() {
    }

    public final boolean getBlockBackPress() {
        return this.blockBackPress;
    }

    public final String getClickTime() {
        return this.clickTime;
    }

    public final boolean getDisableAutoRemoveLoading() {
        return this.disableAutoRemoveLoading;
    }

    public final boolean getDisableBackPress() {
        return this.disableBackPress;
    }

    public final boolean getDisableHardwareAccelerate() {
        return this.disableHardwareAccelerate;
    }

    public final boolean getEnableSaf() {
        return this.enableSaf;
    }

    public final boolean getForbiddenAnim() {
        return this.forbiddenAnim;
    }

    public final boolean getForceBlockBackPress() {
        return this.forceBlockBackPress;
    }

    public final boolean getForceReleaseContextWhenDestroyedForSparkFragment() {
        return this.forceReleaseContextWhenDestroyedForSparkFragment;
    }

    public final boolean getHideError() {
        return this.hideError;
    }

    public final boolean getHideLoading() {
        return this.hideLoading;
    }

    public final boolean getIgnoreRestoreMain() {
        return this.ignoreRestoreMain;
    }

    public final String getInitDataUrl() {
        return this.initDataUrl;
    }

    public final int getKeyboardAdjust() {
        return this.keyboardAdjust;
    }

    public final boolean getKeyboardCompat() {
        return this.keyboardCompat;
    }

    public final boolean getNeedBottomOut() {
        return this.needBottomOut;
    }

    public final boolean getNeedWrapperView() {
        return this.needWrapperView;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final String getRomaSession() {
        return this.romaSession;
    }

    public final boolean getShowProgressBarInAllPage() {
        return this.showProgressBarInAllPage;
    }

    public final Integer getSkeletonDuration() {
        return this.skeletonDuration;
    }

    public final String getSkeletonFromAlpha() {
        return this.skeletonFromAlpha;
    }

    public final String getSkeletonPath() {
        return this.skeletonPath;
    }

    public final String getSkeletonToAlpha() {
        return this.skeletonToAlpha;
    }

    public final boolean getSkeletonWithAnimation() {
        return this.skeletonWithAnimation;
    }

    public final String getSparkPerfBid() {
        return this.sparkPerfBid;
    }

    public final boolean getSparkPerfBidStrictMode() {
        return this.sparkPerfBidStrictMode;
    }

    public final boolean getSubscribeNetworkLevel() {
        return this.subscribeNetworkLevel;
    }

    public final boolean getUsePreload() {
        return this.usePreload;
    }

    public final boolean getWebviewProgressBar() {
        return this.webviewProgressBar;
    }

    public SparkSchemaParam(EnumC1067640dtC enumC1067640dtC) {
        super(enumC1067640dtC);
        this.keyboardAdjust = 1;
        this.forceReleaseContextWhenDestroyedForSparkFragment = true;
    }

    public final void setBlockBackPress(boolean z) {
        this.blockBackPress = z;
    }

    public final void setClickTime(String str) {
        this.clickTime = str;
    }

    public final void setDisableAutoRemoveLoading(boolean z) {
        this.disableAutoRemoveLoading = z;
    }

    public final void setDisableBackPress(boolean z) {
        this.disableBackPress = z;
    }

    public final void setDisableHardwareAccelerate(boolean z) {
        this.disableHardwareAccelerate = z;
    }

    public final void setEnableSaf(boolean z) {
        this.enableSaf = z;
    }

    public final void setForbiddenAnim(boolean z) {
        this.forbiddenAnim = z;
    }

    public final void setForceBlockBackPress(boolean z) {
        this.forceBlockBackPress = z;
    }

    public final void setForceReleaseContextWhenDestroyedForSparkFragment(boolean z) {
        this.forceReleaseContextWhenDestroyedForSparkFragment = z;
    }

    public final void setHideError(boolean z) {
        this.hideError = z;
    }

    public final void setHideLoading(boolean z) {
        this.hideLoading = z;
    }

    public final void setIgnoreRestoreMain(boolean z) {
        this.ignoreRestoreMain = z;
    }

    public final void setInitDataUrl(String str) {
        this.initDataUrl = str;
    }

    public final void setKeyboardAdjust(int i) {
        this.keyboardAdjust = i;
    }

    public final void setKeyboardCompat(boolean z) {
        this.keyboardCompat = z;
    }

    public final void setNeedBottomOut(boolean z) {
        this.needBottomOut = z;
    }

    public final void setNeedWrapperView(boolean z) {
        this.needWrapperView = z;
    }

    public final void setPageName(String str) {
        this.pageName = str;
    }

    public final void setRomaSession(String str) {
        this.romaSession = str;
    }

    public final void setShowProgressBarInAllPage(boolean z) {
        this.showProgressBarInAllPage = z;
    }

    public final void setSkeletonDuration(Integer num) {
        this.skeletonDuration = num;
    }

    public final void setSkeletonFromAlpha(String str) {
        this.skeletonFromAlpha = str;
    }

    public final void setSkeletonPath(String str) {
        this.skeletonPath = str;
    }

    public final void setSkeletonToAlpha(String str) {
        this.skeletonToAlpha = str;
    }

    public final void setSkeletonWithAnimation(boolean z) {
        this.skeletonWithAnimation = z;
    }

    public final void setSparkPerfBid(String str) {
        this.sparkPerfBid = str;
    }

    public final void setSparkPerfBidStrictMode(boolean z) {
        this.sparkPerfBidStrictMode = z;
    }

    public final void setSubscribeNetworkLevel(boolean z) {
        this.subscribeNetworkLevel = z;
    }

    public final void setUsePreload(boolean z) {
        this.usePreload = z;
    }

    public final void setWebviewProgressBar(boolean z) {
        this.webviewProgressBar = z;
    }

    public /* synthetic */ SparkSchemaParam(EnumC1067640dtC enumC1067640dtC, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC1067640dtC.UNKNOWN : enumC1067640dtC);
    }
}
