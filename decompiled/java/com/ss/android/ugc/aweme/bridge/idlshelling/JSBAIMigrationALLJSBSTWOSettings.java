package com.ss.android.ugc.aweme.bridge.idlshelling;

import X.C09CT;
import X.C0C64;
import X.C1543330qGR;
import X.C1544000qHW;
import X.C667430QFx;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public final class JSBAIMigrationALLJSBSTWOSettings {
    public static final JSBAIMigrationALLJSBSTWOModel LIZ = new JSBAIMigrationALLJSBSTWOModel(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);

    public static final JSBAIMigrationALLJSBSTWOModel LIZ() {
        JSBAIMigrationALLJSBSTWOModel jSBAIMigrationALLJSBSTWOModel;
        if (C667430QFx.LIZ()) {
            jSBAIMigrationALLJSBSTWOModel = LIZ;
        } else {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            jSBAIMigrationALLJSBSTWOModel = LIZ;
            JSBAIMigrationALLJSBSTWOModel jSBAIMigrationALLJSBSTWOModel2 = (JSBAIMigrationALLJSBSTWOModel) c0c64LJIILLIIL.LJJIIJ(true, "JSB_AI_Migration_ALL_JSBS_TWO", 31744, JSBAIMigrationALLJSBSTWOModel.class, jSBAIMigrationALLJSBSTWOModel, 2);
            if (jSBAIMigrationALLJSBSTWOModel2 != null) {
                jSBAIMigrationALLJSBSTWOModel = jSBAIMigrationALLJSBSTWOModel2;
            }
        }
        AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
        C1543330qGR c1543330qGR = C1544000qHW.LJIILLIIL;
        long j = jSBAIMigrationALLJSBSTWOModel.enable ? 1L : 0L;
        if (jSBAIMigrationALLJSBSTWOModel.createCalendarEvent) {
            j |= 2;
        }
        if (jSBAIMigrationALLJSBSTWOModel.followAction) {
            j |= 4;
        }
        if (jSBAIMigrationALLJSBSTWOModel.followPACheckMethod) {
            j |= 8;
        }
        if (jSBAIMigrationALLJSBSTWOModel.getDigitalWellbeingStatus) {
            j |= 16;
        }
        if (jSBAIMigrationALLJSBSTWOModel.getFormattedTime) {
            j |= 32;
        }
        if (jSBAIMigrationALLJSBSTWOModel.isCalendarEventExist) {
            j |= 64;
        }
        if (jSBAIMigrationALLJSBSTWOModel.setDigitalWellbeingStatus) {
            j |= 128;
        }
        if (jSBAIMigrationALLJSBSTWOModel.shareSearch) {
            j |= 256;
        }
        if (jSBAIMigrationALLJSBSTWOModel.syncSpecActFollowStatus) {
            j |= 512;
        }
        if (jSBAIMigrationALLJSBSTWOModel.fetch) {
            j |= 1024;
        }
        if (jSBAIMigrationALLJSBSTWOModel.pipoencryptString) {
            j |= 2048;
        }
        if (jSBAIMigrationALLJSBSTWOModel.pipoexecuteRiskJS) {
            j |= 4096;
        }
        if (jSBAIMigrationALLJSBSTWOModel.pipoAppInfo) {
            j |= 8192;
        }
        if (jSBAIMigrationALLJSBSTWOModel.onBackPressed) {
            j |= 16384;
        }
        if (jSBAIMigrationALLJSBSTWOModel.sendLog) {
            j |= 32768;
        }
        if (jSBAIMigrationALLJSBSTWOModel.sendLogV3) {
            j |= 65536;
        }
        if (jSBAIMigrationALLJSBSTWOModel.adInfo) {
            j |= 131072;
        }
        if (jSBAIMigrationALLJSBSTWOModel.copyToClipboard) {
            j |= 262144;
        }
        if (jSBAIMigrationALLJSBSTWOModel.close) {
            j |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        }
        if (jSBAIMigrationALLJSBSTWOModel.login) {
            j |= 1048576;
        }
        if (jSBAIMigrationALLJSBSTWOModel.userInfo) {
            j |= 2097152;
        }
        if (jSBAIMigrationALLJSBSTWOModel.appInfo) {
            j |= 4194304;
        }
        if (jSBAIMigrationALLJSBSTWOModel.apiParam) {
            j |= 8388608;
        }
        if (jSBAIMigrationALLJSBSTWOModel.uniAppInfo) {
            j |= 16777216;
        }
        c1543330qGR.LIZIZ.setValue(c1543330qGR, C1543330qGR.LJIIIZ[1], Long.valueOf(j));
        return jSBAIMigrationALLJSBSTWOModel;
    }

    public static final class JSBAIMigrationALLJSBSTWOModel {

        @C09CT("IBEDidFinishInteraction")
        public final boolean IBEDidFinishInteraction;

        @C09CT("IBEDidStartInteraction")
        public final boolean IBEDidStartInteraction;

        @C09CT("adInfo")
        public final boolean adInfo;

        @C09CT("apiParam")
        public final boolean apiParam;

        @C09CT("appInfo")
        public final boolean appInfo;

        @C09CT("close")
        public final boolean close;

        @C09CT("copyToClipboard")
        public final boolean copyToClipboard;

        @C09CT("createCalendarEvent")
        public final boolean createCalendarEvent;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("feedbackSubmitSuccess")
        public final boolean feedbackSubmitSuccess;

        @C09CT("fetch")
        public final boolean fetch;

        @C09CT("followAction")
        public final boolean followAction;

        @C09CT("followPACheckMethod")
        public final boolean followPACheckMethod;

        @C09CT("getDigitalWellbeingStatus")
        public final boolean getDigitalWellbeingStatus;

        @C09CT("getFormattedTime")
        public final boolean getFormattedTime;

        @C09CT("isCalendarEventExist")
        public final boolean isCalendarEventExist;

        @C09CT("login")
        public final boolean login;

        @C09CT("onBackPressed")
        public final boolean onBackPressed;

        @C09CT("openGBLOCRpage")
        public final boolean openGBLOCRpage;

        @C09CT("pipoAppInfo")
        public final boolean pipoAppInfo;

        @C09CT("pipoencryptString")
        public final boolean pipoencryptString;

        @C09CT("pipoexecuteRiskJS")
        public final boolean pipoexecuteRiskJS;

        @C09CT("pipofetch")
        public final boolean pipofetch;

        @C09CT("pipogetStarlingData")
        public final boolean pipogetStarlingData;

        @C09CT("pipoonEvent")
        public final boolean pipoonEvent;

        @C09CT("pipoopenWebView")
        public final boolean pipoopenWebView;

        @C09CT("preloadLiveWalletCashier")
        public final boolean preloadLiveWalletCashier;

        @C09CT("rechargeV3Failed")
        public final boolean rechargeV3Failed;

        @C09CT("sendLog")
        public final boolean sendLog;

        @C09CT("sendLogV3")
        public final boolean sendLogV3;

        @C09CT("setDigitalWellbeingStatus")
        public final boolean setDigitalWellbeingStatus;

        @C09CT("shareSearch")
        public final boolean shareSearch;

        @C09CT("syncSpecActFollowStatus")
        public final boolean syncSpecActFollowStatus;

        @C09CT("uniAppInfo")
        public final boolean uniAppInfo;

        @C09CT("userInfo")
        public final boolean userInfo;

        public JSBAIMigrationALLJSBSTWOModel() {
            this(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
        }

        public JSBAIMigrationALLJSBSTWOModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35) {
            this.enable = z;
            this.createCalendarEvent = z2;
            this.followAction = z3;
            this.followPACheckMethod = z4;
            this.getDigitalWellbeingStatus = z5;
            this.getFormattedTime = z6;
            this.isCalendarEventExist = z7;
            this.setDigitalWellbeingStatus = z8;
            this.shareSearch = z9;
            this.syncSpecActFollowStatus = z10;
            this.fetch = z11;
            this.pipoencryptString = z12;
            this.pipoexecuteRiskJS = z13;
            this.pipoAppInfo = z14;
            this.onBackPressed = z15;
            this.sendLog = z16;
            this.sendLogV3 = z17;
            this.adInfo = z18;
            this.copyToClipboard = z19;
            this.close = z20;
            this.login = z21;
            this.userInfo = z22;
            this.appInfo = z23;
            this.apiParam = z24;
            this.uniAppInfo = z25;
            this.feedbackSubmitSuccess = z26;
            this.IBEDidFinishInteraction = z27;
            this.rechargeV3Failed = z28;
            this.openGBLOCRpage = z29;
            this.preloadLiveWalletCashier = z30;
            this.IBEDidStartInteraction = z31;
            this.pipogetStarlingData = z32;
            this.pipofetch = z33;
            this.pipoonEvent = z34;
            this.pipoopenWebView = z35;
        }
    }
}
