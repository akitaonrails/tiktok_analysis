package com.ss.android.ugc.aweme.bridge;

import X.C09CT;
import X.C1543330qGR;
import X.C1544000qHW;
import X.C667430QFx;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public final class JSBAIMigrationMonetizationSettings {
    public static final JSBAIMigrationMonetizationModel LIZ = new JSBAIMigrationMonetizationModel(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);

    public static final JSBAIMigrationMonetizationModel LIZ() {
        JSBAIMigrationMonetizationModel jSBAIMigrationMonetizationModel;
        if (C667430QFx.LIZ()) {
            jSBAIMigrationMonetizationModel = LIZ;
        } else {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            JSBAIMigrationMonetizationModel jSBAIMigrationMonetizationModel2 = LIZ;
            jSBAIMigrationMonetizationModel = (JSBAIMigrationMonetizationModel) settingsManagerLIZLLL.LJIIIIZZ("JSB_AI_Migration_Monetization", JSBAIMigrationMonetizationModel.class, jSBAIMigrationMonetizationModel2);
            if (jSBAIMigrationMonetizationModel == null) {
                jSBAIMigrationMonetizationModel = jSBAIMigrationMonetizationModel2;
            }
        }
        AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
        C1543330qGR c1543330qGR = C1544000qHW.LJIILLIIL;
        c1543330qGR.LJ.setValue(c1543330qGR, C1543330qGR.LJIIIZ[4], Long.valueOf(LIZIZ(jSBAIMigrationMonetizationModel)));
        return jSBAIMigrationMonetizationModel;
    }

    public static final long LIZIZ(JSBAIMigrationMonetizationModel jSBAIMigrationMonetizationModel) {
        long j;
        if (jSBAIMigrationMonetizationModel.enable) {
            j = 1;
        } else {
            j = 0;
        }
        if (jSBAIMigrationMonetizationModel.adLynxCardStatus) {
            j |= 2;
        }
        if (jSBAIMigrationMonetizationModel.adLynxSuperLikeStatus) {
            j |= 4;
        }
        if (jSBAIMigrationMonetizationModel.closeAdLynxCard) {
            j |= 8;
        }
        if (jSBAIMigrationMonetizationModel.closePopUpWindow) {
            j |= 16;
        }
        if (jSBAIMigrationMonetizationModel.collapseAdLynxCard) {
            j |= 32;
        }
        if (jSBAIMigrationMonetizationModel.downloadAppClick) {
            j |= 64;
        }
        if (jSBAIMigrationMonetizationModel.downloadClick) {
            j |= 128;
        }
        if (jSBAIMigrationMonetizationModel.launchChat) {
            j |= 256;
        }
        if (jSBAIMigrationMonetizationModel.loadGeckoResources) {
            j |= 512;
        }
        if (jSBAIMigrationMonetizationModel.openAdLandPageLinks) {
            j |= 1024;
        }
        if (jSBAIMigrationMonetizationModel.sendAdLog) {
            j |= 2048;
        }
        if (jSBAIMigrationMonetizationModel.sendAnalyticsEvent) {
            j |= 4096;
        }
        if (jSBAIMigrationMonetizationModel.sendEMailTo) {
            j |= 8192;
        }
        if (jSBAIMigrationMonetizationModel.sendThirdTrack) {
            j |= 16384;
        }
        if (jSBAIMigrationMonetizationModel.setScrollTop) {
            j |= 32768;
        }
        if (jSBAIMigrationMonetizationModel.adLynxStickerStatus) {
            j |= 65536;
        }
        if (jSBAIMigrationMonetizationModel.IBEGetViewSize) {
            j |= 131072;
        }
        if (jSBAIMigrationMonetizationModel.adMakePhoneCall) {
            j |= 262144;
        }
        if (jSBAIMigrationMonetizationModel.didSelectScore) {
            j |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        }
        if (jSBAIMigrationMonetizationModel.closePopUpWebPage) {
            return j | 1048576;
        }
        return j;
    }

    public static final class JSBAIMigrationMonetizationModel {

        @C09CT("IBEGetViewSize")
        public final boolean IBEGetViewSize;

        @C09CT("adLynxCardStatus")
        public final boolean adLynxCardStatus;

        @C09CT("adLynxStickerStatus")
        public final boolean adLynxStickerStatus;

        @C09CT("adLynxSuperLikeStatus")
        public final boolean adLynxSuperLikeStatus;

        @C09CT("adMakePhoneCall")
        public final boolean adMakePhoneCall;

        @C09CT("closeAdLynxCard")
        public final boolean closeAdLynxCard;

        @C09CT("closePopUpWebPage")
        public final boolean closePopUpWebPage;

        @C09CT("closePopUpWindow")
        public final boolean closePopUpWindow;

        @C09CT("collapseAdLynxCard")
        public final boolean collapseAdLynxCard;

        @C09CT("didSelectScore")
        public final boolean didSelectScore;

        @C09CT("download_app_click")
        public final boolean downloadAppClick;

        @C09CT("download_click")
        public final boolean downloadClick;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("launchChat")
        public final boolean launchChat;

        @C09CT("loadGeckoResources")
        public final boolean loadGeckoResources;

        @C09CT("openAdLandPageLinks")
        public final boolean openAdLandPageLinks;

        @C09CT("sendAdLog")
        public final boolean sendAdLog;

        @C09CT("sendAnalyticsEvent")
        public final boolean sendAnalyticsEvent;

        @C09CT("sendEMailTo")
        public final boolean sendEMailTo;

        @C09CT("sendThirdTrack")
        public final boolean sendThirdTrack;

        @C09CT("setScrollTop")
        public final boolean setScrollTop;

        public JSBAIMigrationMonetizationModel() {
            this(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
        }

        public JSBAIMigrationMonetizationModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21) {
            this.enable = z;
            this.adLynxCardStatus = z2;
            this.adLynxSuperLikeStatus = z3;
            this.closeAdLynxCard = z4;
            this.closePopUpWindow = z5;
            this.collapseAdLynxCard = z6;
            this.downloadAppClick = z7;
            this.downloadClick = z8;
            this.launchChat = z9;
            this.loadGeckoResources = z10;
            this.openAdLandPageLinks = z11;
            this.sendAdLog = z12;
            this.sendAnalyticsEvent = z13;
            this.sendEMailTo = z14;
            this.sendThirdTrack = z15;
            this.setScrollTop = z16;
            this.adLynxStickerStatus = z17;
            this.IBEGetViewSize = z18;
            this.adMakePhoneCall = z19;
            this.didSelectScore = z20;
            this.closePopUpWebPage = z21;
        }
    }
}
