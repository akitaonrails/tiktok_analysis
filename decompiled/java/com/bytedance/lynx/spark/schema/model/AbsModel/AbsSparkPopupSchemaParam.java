package com.bytedance.lynx.spark.schema.model.AbsModel;

import X.C1058140dds;
import X.C1545660qKC;
import X.EnumC1067640dtC;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public abstract class AbsSparkPopupSchemaParam extends SparkSchemaParam {
    public boolean delaySparkViewLoad;
    public boolean disableOutsideClickClose;
    public boolean dragBack;
    public boolean dragByGesture;
    public int dragDownCloseThreshold;
    public int dragDownThreshold;
    public boolean dragHandleForceFlat;
    public boolean dragHandleInvisible;
    public int dragHeight;
    public int dragMinMarginTop;
    public int dragUpThreshold;
    public boolean enableAutoAdaptation;
    public boolean enablePullDownClose;
    public boolean enableRelativeCalculation;
    public boolean enableSparkPopupSheetHandleOpt;
    public boolean enableUpdateScreenMetrics;
    public boolean fixTopViewHeightIssue;
    public boolean forceDialogNonCancelable;
    public String gravity;
    public String gravityWithoutDefault;
    public int height;
    public boolean ignoreKeyboardStatusChange;
    public String landscapeGravity;
    public int landscapeHeight;
    public String landscapeTransitionAnimation;
    public int landscapeWidth;
    public int loadingHeightInAdaptiveMode;
    public boolean lockVariableHeightExpanded;
    public int marginBottom;
    public int marginEnd;
    public int marginLeft;
    public int marginRight;
    public int marginStart;
    public int marginTop;
    public C1058140dds maskBgColor;
    public boolean maskCloseUntilLoaded;
    public int minMarginTop;
    public C1058140dds navigationBarBgColor;
    public String navigationFontMode;
    public int peekDownCloseThreshold;
    public boolean popupCompatShowEvent;
    public boolean popupFollowActivityUi;
    public int radius;
    public String resizeDuration;
    public boolean selfAdaptiveHeight;
    public boolean showMask;
    public int silentLoadType;
    public C1058140dds statusBarBgColor;
    public String statusFontMode;
    public boolean transNavigationBar;
    public boolean transStatusBar;
    public String transitionAnimation;
    public int variableHeight;
    public int width;

    /* JADX WARN: Multi-variable type inference failed */
    public AbsSparkPopupSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean getDelaySparkViewLoad() {
        return this.delaySparkViewLoad;
    }

    public final boolean getDisableOutsideClickClose() {
        return this.disableOutsideClickClose;
    }

    public final boolean getDragBack() {
        return this.dragBack;
    }

    public final boolean getDragByGesture() {
        return this.dragByGesture;
    }

    public final int getDragDownCloseThreshold() {
        return this.dragDownCloseThreshold;
    }

    public final int getDragDownThreshold() {
        return this.dragDownThreshold;
    }

    public final boolean getDragHandleForceFlat() {
        return this.dragHandleForceFlat;
    }

    public final boolean getDragHandleInvisible() {
        return this.dragHandleInvisible;
    }

    public final int getDragHeight() {
        return this.dragHeight;
    }

    public final int getDragMinMarginTop() {
        return this.dragMinMarginTop;
    }

    public final int getDragUpThreshold() {
        return this.dragUpThreshold;
    }

    public final boolean getEnableAutoAdaptation() {
        return this.enableAutoAdaptation;
    }

    public final boolean getEnablePullDownClose() {
        return this.enablePullDownClose;
    }

    public final boolean getEnableRelativeCalculation() {
        return this.enableRelativeCalculation;
    }

    public final boolean getEnableSparkPopupSheetHandleOpt() {
        return this.enableSparkPopupSheetHandleOpt;
    }

    public final boolean getEnableUpdateScreenMetrics() {
        return this.enableUpdateScreenMetrics;
    }

    public final boolean getFixTopViewHeightIssue() {
        return this.fixTopViewHeightIssue;
    }

    public final boolean getForceDialogNonCancelable() {
        return this.forceDialogNonCancelable;
    }

    public final String getGravity() {
        return this.gravity;
    }

    public final String getGravityWithoutDefault() {
        return this.gravityWithoutDefault;
    }

    public final int getHeight() {
        return this.height;
    }

    public final boolean getIgnoreKeyboardStatusChange() {
        return this.ignoreKeyboardStatusChange;
    }

    public final String getLandscapeGravity() {
        return this.landscapeGravity;
    }

    public final int getLandscapeHeight() {
        return this.landscapeHeight;
    }

    public final String getLandscapeTransitionAnimation() {
        return this.landscapeTransitionAnimation;
    }

    public final int getLandscapeWidth() {
        return this.landscapeWidth;
    }

    public final int getLoadingHeightInAdaptiveMode() {
        return this.loadingHeightInAdaptiveMode;
    }

    public final boolean getLockVariableHeightExpanded() {
        return this.lockVariableHeightExpanded;
    }

    public final int getMarginBottom() {
        return this.marginBottom;
    }

    public final int getMarginEnd() {
        return this.marginEnd;
    }

    public final int getMarginLeft() {
        return this.marginLeft;
    }

    public final int getMarginRight() {
        return this.marginRight;
    }

    public final int getMarginStart() {
        return this.marginStart;
    }

    public final int getMarginTop() {
        return this.marginTop;
    }

    public final C1058140dds getMaskBgColor() {
        return this.maskBgColor;
    }

    public final boolean getMaskCloseUntilLoaded() {
        return this.maskCloseUntilLoaded;
    }

    public final int getMinMarginTop() {
        return this.minMarginTop;
    }

    public final C1058140dds getNavigationBarBgColor() {
        return this.navigationBarBgColor;
    }

    public final String getNavigationFontMode() {
        return this.navigationFontMode;
    }

    public final int getPeekDownCloseThreshold() {
        return this.peekDownCloseThreshold;
    }

    public final boolean getPopupCompatShowEvent() {
        return this.popupCompatShowEvent;
    }

    public final boolean getPopupFollowActivityUi() {
        return this.popupFollowActivityUi;
    }

    public final int getRadius() {
        return this.radius;
    }

    public final String getResizeDuration() {
        return this.resizeDuration;
    }

    public final boolean getSelfAdaptiveHeight() {
        return this.selfAdaptiveHeight;
    }

    public final boolean getShowMask() {
        return this.showMask;
    }

    public final int getSilentLoadType() {
        return this.silentLoadType;
    }

    public final C1058140dds getStatusBarBgColor() {
        return this.statusBarBgColor;
    }

    public final String getStatusFontMode() {
        return this.statusFontMode;
    }

    public final boolean getTransNavigationBar() {
        return this.transNavigationBar;
    }

    public final boolean getTransStatusBar() {
        return this.transStatusBar;
    }

    public final String getTransitionAnimation() {
        return this.transitionAnimation;
    }

    public final int getVariableHeight() {
        return this.variableHeight;
    }

    public final int getWidth() {
        return this.width;
    }

    public AbsSparkPopupSchemaParam(EnumC1067640dtC enumC1067640dtC) {
        super(enumC1067640dtC);
        this.gravity = "bottom";
        this.gravityWithoutDefault = "";
        this.landscapeGravity = "";
        this.width = C1545660qKC.LIZ;
        this.landscapeWidth = -1;
        this.height = C1545660qKC.LIZIZ;
        this.landscapeHeight = -1;
        this.radius = 8;
        this.maskBgColor = new C1058140dds(0);
        this.transitionAnimation = "auto";
        this.landscapeTransitionAnimation = "";
        this.dragHeight = -1;
        this.dragUpThreshold = C1545660qKC.LIZJ;
        this.popupFollowActivityUi = true;
        this.resizeDuration = "0.3";
    }

    public final void setDelaySparkViewLoad(boolean z) {
        this.delaySparkViewLoad = z;
    }

    public final void setDisableOutsideClickClose(boolean z) {
        this.disableOutsideClickClose = z;
    }

    public final void setDragBack(boolean z) {
        this.dragBack = z;
    }

    public final void setDragByGesture(boolean z) {
        this.dragByGesture = z;
    }

    public final void setDragDownCloseThreshold(int i) {
        this.dragDownCloseThreshold = i;
    }

    public final void setDragDownThreshold(int i) {
        this.dragDownThreshold = i;
    }

    public final void setDragHandleForceFlat(boolean z) {
        this.dragHandleForceFlat = z;
    }

    public final void setDragHandleInvisible(boolean z) {
        this.dragHandleInvisible = z;
    }

    public final void setDragHeight(int i) {
        this.dragHeight = i;
    }

    public final void setDragMinMarginTop(int i) {
        this.dragMinMarginTop = i;
    }

    public final void setDragUpThreshold(int i) {
        this.dragUpThreshold = i;
    }

    public final void setEnableAutoAdaptation(boolean z) {
        this.enableAutoAdaptation = z;
    }

    public final void setEnablePullDownClose(boolean z) {
        this.enablePullDownClose = z;
    }

    public final void setEnableRelativeCalculation(boolean z) {
        this.enableRelativeCalculation = z;
    }

    public final void setEnableSparkPopupSheetHandleOpt(boolean z) {
        this.enableSparkPopupSheetHandleOpt = z;
    }

    public final void setEnableUpdateScreenMetrics(boolean z) {
        this.enableUpdateScreenMetrics = z;
    }

    public final void setFixTopViewHeightIssue(boolean z) {
        this.fixTopViewHeightIssue = z;
    }

    public final void setForceDialogNonCancelable(boolean z) {
        this.forceDialogNonCancelable = z;
    }

    public final void setGravity(String str) {
        this.gravity = str;
    }

    public final void setGravityWithoutDefault(String str) {
        this.gravityWithoutDefault = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setIgnoreKeyboardStatusChange(boolean z) {
        this.ignoreKeyboardStatusChange = z;
    }

    public final void setLandscapeGravity(String str) {
        this.landscapeGravity = str;
    }

    public final void setLandscapeHeight(int i) {
        this.landscapeHeight = i;
    }

    public final void setLandscapeTransitionAnimation(String str) {
        this.landscapeTransitionAnimation = str;
    }

    public final void setLandscapeWidth(int i) {
        this.landscapeWidth = i;
    }

    public final void setLoadingHeightInAdaptiveMode(int i) {
        this.loadingHeightInAdaptiveMode = i;
    }

    public final void setLockVariableHeightExpanded(boolean z) {
        this.lockVariableHeightExpanded = z;
    }

    public final void setMarginBottom(int i) {
        this.marginBottom = i;
    }

    public final void setMarginEnd(int i) {
        this.marginEnd = i;
    }

    public final void setMarginLeft(int i) {
        this.marginLeft = i;
    }

    public final void setMarginRight(int i) {
        this.marginRight = i;
    }

    public final void setMarginStart(int i) {
        this.marginStart = i;
    }

    public final void setMarginTop(int i) {
        this.marginTop = i;
    }

    public final void setMaskBgColor(C1058140dds c1058140dds) {
        this.maskBgColor = c1058140dds;
    }

    public final void setMaskCloseUntilLoaded(boolean z) {
        this.maskCloseUntilLoaded = z;
    }

    public final void setMinMarginTop(int i) {
        this.minMarginTop = i;
    }

    public final void setNavigationBarBgColor(C1058140dds c1058140dds) {
        this.navigationBarBgColor = c1058140dds;
    }

    public final void setNavigationFontMode(String str) {
        this.navigationFontMode = str;
    }

    public final void setPeekDownCloseThreshold(int i) {
        this.peekDownCloseThreshold = i;
    }

    public final void setPopupCompatShowEvent(boolean z) {
        this.popupCompatShowEvent = z;
    }

    public final void setPopupFollowActivityUi(boolean z) {
        this.popupFollowActivityUi = z;
    }

    public final void setRadius(int i) {
        this.radius = i;
    }

    public final void setResizeDuration(String str) {
        this.resizeDuration = str;
    }

    public final void setSelfAdaptiveHeight(boolean z) {
        this.selfAdaptiveHeight = z;
    }

    public final void setShowMask(boolean z) {
        this.showMask = z;
    }

    public final void setSilentLoadType(int i) {
        this.silentLoadType = i;
    }

    public final void setStatusBarBgColor(C1058140dds c1058140dds) {
        this.statusBarBgColor = c1058140dds;
    }

    public final void setStatusFontMode(String str) {
        this.statusFontMode = str;
    }

    public final void setTransNavigationBar(boolean z) {
        this.transNavigationBar = z;
    }

    public final void setTransStatusBar(boolean z) {
        this.transStatusBar = z;
    }

    public final void setTransitionAnimation(String str) {
        this.transitionAnimation = str;
    }

    public final void setVariableHeight(int i) {
        this.variableHeight = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public /* synthetic */ AbsSparkPopupSchemaParam(EnumC1067640dtC enumC1067640dtC, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC1067640dtC.UNKNOWN : enumC1067640dtC);
    }
}
