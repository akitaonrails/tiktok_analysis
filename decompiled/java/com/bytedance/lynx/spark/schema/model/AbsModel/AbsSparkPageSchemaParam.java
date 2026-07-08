package com.bytedance.lynx.spark.schema.model.AbsModel;

import X.C1058140dds;
import X.C1100000ejO;
import X.C446980Hfs;
import X.EnumC1067640dtC;
import android.content.Context;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public abstract class AbsSparkPageSchemaParam extends SparkSchemaParam {
    public String autoAdaptationScrollViewId;
    public boolean disableGetResourcesCallback;
    public boolean enableAutoAdaptation;
    public boolean hideBackButton;
    public boolean hideNavBar;
    public boolean hideStatusBar;
    public C1058140dds navBarColor;
    public String navBtnType;
    public C1058140dds navigationBarBgColor;
    public boolean optTitle;
    public int pageDepthOfReportShow;
    public String screenOrientation;
    public String showCloseAll;
    public boolean showNavBarInTransStatusBar;
    public boolean showWebUrl;
    public C1058140dds statusBarBgColor;
    public String statusFontMode;
    public String title;
    public C1058140dds titleColor;
    public boolean transNavigationBar;
    public boolean transStatusBar;
    public boolean useWebviewTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public AbsSparkPageSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String getAutoAdaptationScrollViewId() {
        return this.autoAdaptationScrollViewId;
    }

    public final boolean getDisableGetResourcesCallback() {
        return this.disableGetResourcesCallback;
    }

    public final boolean getEnableAutoAdaptation() {
        return this.enableAutoAdaptation;
    }

    public final boolean getHideBackButton() {
        return this.hideBackButton;
    }

    public final boolean getHideNavBar() {
        return this.hideNavBar;
    }

    public final boolean getHideStatusBar() {
        return this.hideStatusBar;
    }

    public final C1058140dds getNavBarColor() {
        return this.navBarColor;
    }

    public final String getNavBtnType() {
        return this.navBtnType;
    }

    public final C1058140dds getNavigationBarBgColor() {
        return this.navigationBarBgColor;
    }

    public final boolean getOptTitle() {
        return this.optTitle;
    }

    public final int getPageDepthOfReportShow() {
        return this.pageDepthOfReportShow;
    }

    public final String getScreenOrientation() {
        return this.screenOrientation;
    }

    public final String getShowCloseAll() {
        return this.showCloseAll;
    }

    public final boolean getShowNavBarInTransStatusBar() {
        return this.showNavBarInTransStatusBar;
    }

    public final boolean getShowWebUrl() {
        return this.showWebUrl;
    }

    public final C1058140dds getStatusBarBgColor() {
        return this.statusBarBgColor;
    }

    public final String getStatusFontMode() {
        return this.statusFontMode;
    }

    public final String getTitle() {
        return this.title;
    }

    public final C1058140dds getTitleColor() {
        return this.titleColor;
    }

    public final boolean getTransNavigationBar() {
        return this.transNavigationBar;
    }

    public final boolean getTransStatusBar() {
        return this.transStatusBar;
    }

    public final boolean getUseWebviewTitle() {
        return this.useWebviewTitle;
    }

    public AbsSparkPageSchemaParam(EnumC1067640dtC enumC1067640dtC) {
        int iLIZ;
        super(enumC1067640dtC);
        this.title = "";
        try {
            Context context = C1100000ejO.LIZ;
            iLIZ = C446980Hfs.LIZ(context == null ? null : context, R.color.d5);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLIZ = -16777216;
        }
        this.titleColor = new C1058140dds(iLIZ);
        this.showCloseAll = "";
        this.useWebviewTitle = true;
        this.screenOrientation = "portrait";
    }

    public final void setAutoAdaptationScrollViewId(String str) {
        this.autoAdaptationScrollViewId = str;
    }

    public final void setDisableGetResourcesCallback(boolean z) {
        this.disableGetResourcesCallback = z;
    }

    public final void setEnableAutoAdaptation(boolean z) {
        this.enableAutoAdaptation = z;
    }

    public final void setHideBackButton(boolean z) {
        this.hideBackButton = z;
    }

    public final void setHideNavBar(boolean z) {
        this.hideNavBar = z;
    }

    public final void setHideStatusBar(boolean z) {
        this.hideStatusBar = z;
    }

    public final void setNavBarColor(C1058140dds c1058140dds) {
        this.navBarColor = c1058140dds;
    }

    public final void setNavBtnType(String str) {
        this.navBtnType = str;
    }

    public final void setNavigationBarBgColor(C1058140dds c1058140dds) {
        this.navigationBarBgColor = c1058140dds;
    }

    public final void setOptTitle(boolean z) {
        this.optTitle = z;
    }

    public final void setPageDepthOfReportShow(int i) {
        this.pageDepthOfReportShow = i;
    }

    public final void setScreenOrientation(String str) {
        this.screenOrientation = str;
    }

    public final void setShowCloseAll(String str) {
        this.showCloseAll = str;
    }

    public final void setShowNavBarInTransStatusBar(boolean z) {
        this.showNavBarInTransStatusBar = z;
    }

    public final void setShowWebUrl(boolean z) {
        this.showWebUrl = z;
    }

    public final void setStatusBarBgColor(C1058140dds c1058140dds) {
        this.statusBarBgColor = c1058140dds;
    }

    public final void setStatusFontMode(String str) {
        this.statusFontMode = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTitleColor(C1058140dds c1058140dds) {
        this.titleColor = c1058140dds;
    }

    public final void setTransNavigationBar(boolean z) {
        this.transNavigationBar = z;
    }

    public final void setTransStatusBar(boolean z) {
        this.transStatusBar = z;
    }

    public final void setUseWebviewTitle(boolean z) {
        this.useWebviewTitle = z;
    }

    public /* synthetic */ AbsSparkPageSchemaParam(EnumC1067640dtC enumC1067640dtC, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC1067640dtC.UNKNOWN : enumC1067640dtC);
    }
}
