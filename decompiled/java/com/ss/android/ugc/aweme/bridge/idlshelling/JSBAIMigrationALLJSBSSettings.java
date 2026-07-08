package com.ss.android.ugc.aweme.bridge.idlshelling;

import X.C09CT;
import X.C1543330qGR;
import X.C1544000qHW;
import X.C667430QFx;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public final class JSBAIMigrationALLJSBSSettings {
    public static final JSBAIMigrationALLJSBSModel LIZ = new JSBAIMigrationALLJSBSModel(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);

    public static final JSBAIMigrationALLJSBSModel LIZ() {
        JSBAIMigrationALLJSBSModel jSBAIMigrationALLJSBSModel;
        if (C667430QFx.LIZ()) {
            jSBAIMigrationALLJSBSModel = LIZ;
        } else {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            JSBAIMigrationALLJSBSModel jSBAIMigrationALLJSBSModel2 = LIZ;
            jSBAIMigrationALLJSBSModel = (JSBAIMigrationALLJSBSModel) settingsManagerLIZLLL.LJIIIIZZ("JSB_AI_Migration_ALL_JSBS", JSBAIMigrationALLJSBSModel.class, jSBAIMigrationALLJSBSModel2);
            if (jSBAIMigrationALLJSBSModel == null) {
                jSBAIMigrationALLJSBSModel = jSBAIMigrationALLJSBSModel2;
            }
        }
        AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
        C1543330qGR c1543330qGR = C1544000qHW.LJIILLIIL;
        long j = jSBAIMigrationALLJSBSModel.enable ? 1L : 0L;
        if (jSBAIMigrationALLJSBSModel.request) {
            j |= 2;
        }
        if (jSBAIMigrationALLJSBSModel.open2sv) {
            j |= 4;
        }
        if (jSBAIMigrationALLJSBSModel.popDigitalWellbeingVerifyView) {
            j |= 8;
        }
        if (jSBAIMigrationALLJSBSModel.openHybrid) {
            j |= 16;
        }
        if (jSBAIMigrationALLJSBSModel.getSharedMemoryItem) {
            j |= 32;
        }
        if (jSBAIMigrationALLJSBSModel.setSharedMemoryItem) {
            j |= 64;
        }
        if (jSBAIMigrationALLJSBSModel.getTheme) {
            j |= 128;
        }
        if (jSBAIMigrationALLJSBSModel.initPipo) {
            j |= 256;
        }
        if (jSBAIMigrationALLJSBSModel.share) {
            j |= 512;
        }
        if (jSBAIMigrationALLJSBSModel.uniUserInfo) {
            j |= 1024;
        }
        if (jSBAIMigrationALLJSBSModel.getContainerData) {
            j |= 2048;
        }
        if (jSBAIMigrationALLJSBSModel.searchKeywordChange) {
            j |= 4096;
        }
        if (jSBAIMigrationALLJSBSModel.IBEPreRenderReady) {
            j |= 8192;
        }
        if (jSBAIMigrationALLJSBSModel.closeLynxFeedMask) {
            j |= 16384;
        }
        if (jSBAIMigrationALLJSBSModel.recentLoginUsersInfo) {
            j |= 32768;
        }
        if (jSBAIMigrationALLJSBSModel.loginFromH5) {
            j |= 65536;
        }
        if (jSBAIMigrationALLJSBSModel.loginH5Failed) {
            j |= 131072;
        }
        if (jSBAIMigrationALLJSBSModel.loginWithPlatform) {
            j |= 262144;
        }
        if (jSBAIMigrationALLJSBSModel.noticePermission) {
            j |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        }
        if (jSBAIMigrationALLJSBSModel.getPurchaseItemList) {
            j |= 1048576;
        }
        if (jSBAIMigrationALLJSBSModel.isAppInstall) {
            j |= 2097152;
        }
        if (jSBAIMigrationALLJSBSModel.setTitle) {
            j |= 4194304;
        }
        if (jSBAIMigrationALLJSBSModel.update_account_info) {
            j |= 8388608;
        }
        if (jSBAIMigrationALLJSBSModel.uploadALog) {
            j |= 16777216;
        }
        if (jSBAIMigrationALLJSBSModel.downloadMedia) {
            j |= 33554432;
        }
        if (jSBAIMigrationALLJSBSModel.copyTextToPasteBoard) {
            j |= 67108864;
        }
        if (jSBAIMigrationALLJSBSModel.accountLogout) {
            j |= 134217728;
        }
        if (jSBAIMigrationALLJSBSModel.hasFeedback) {
            j |= 268435456;
        }
        if (jSBAIMigrationALLJSBSModel.openLiveRoom) {
            j |= 536870912;
        }
        if (jSBAIMigrationALLJSBSModel.subscribe_app_ad) {
            j |= 1073741824;
        }
        if (jSBAIMigrationALLJSBSModel.open_effect_record) {
            j |= 2147483648L;
        }
        if (jSBAIMigrationALLJSBSModel.xrequest) {
            j |= 4294967296L;
        }
        if (jSBAIMigrationALLJSBSModel.xopen) {
            j |= 8589934592L;
        }
        if (jSBAIMigrationALLJSBSModel.prefetch) {
            j |= 17179869184L;
        }
        if (jSBAIMigrationALLJSBSModel.open_short_video) {
            j |= 34359738368L;
        }
        if (jSBAIMigrationALLJSBSModel.popTuringVerifyView) {
            j |= 68719476736L;
        }
        if (jSBAIMigrationALLJSBSModel.routeToWhatsapp) {
            j |= 137438953472L;
        }
        if (jSBAIMigrationALLJSBSModel.scan) {
            j |= 274877906944L;
        }
        if (jSBAIMigrationALLJSBSModel.openAwemeDetail) {
            j |= 549755813888L;
        }
        if (jSBAIMigrationALLJSBSModel.openRecord) {
            j |= 1099511627776L;
        }
        if (jSBAIMigrationALLJSBSModel.openVideoEdit) {
            j |= 2199023255552L;
        }
        if (jSBAIMigrationALLJSBSModel.getAppInfo) {
            j |= 4398046511104L;
        }
        if (jSBAIMigrationALLJSBSModel.getSettings) {
            j |= 8796093022208L;
        }
        if (jSBAIMigrationALLJSBSModel.loadFeedsFlow) {
            j |= 17592186044416L;
        }
        if (jSBAIMigrationALLJSBSModel.setNativeItem) {
            j |= 35184372088832L;
        }
        if (jSBAIMigrationALLJSBSModel.showToast) {
            j |= 70368744177664L;
        }
        if (jSBAIMigrationALLJSBSModel.uploadFile) {
            j |= 140737488355328L;
        }
        if (jSBAIMigrationALLJSBSModel.fileSelection) {
            j |= 281474976710656L;
        }
        if (jSBAIMigrationALLJSBSModel.broadcast) {
            j |= 562949953421312L;
        }
        if (jSBAIMigrationALLJSBSModel.isAppInstalled) {
            j |= 1125899906842624L;
        }
        if (jSBAIMigrationALLJSBSModel.openSingletonSchema) {
            j |= 2251799813685248L;
        }
        if (jSBAIMigrationALLJSBSModel.openRechargePanel) {
            j |= 4503599627370496L;
        }
        if (jSBAIMigrationALLJSBSModel.charge) {
            j |= 9007199254740992L;
        }
        if (jSBAIMigrationALLJSBSModel.playGift) {
            j |= 18014398509481984L;
        }
        if (jSBAIMigrationALLJSBSModel.uploadImage) {
            j |= 36028797018963968L;
        }
        if (jSBAIMigrationALLJSBSModel.downloadMediaToSystem) {
            j |= 72057594037927936L;
        }
        if (jSBAIMigrationALLJSBSModel.chooseImage) {
            j |= 144115188075855872L;
        }
        if (jSBAIMigrationALLJSBSModel.chooseImageForSub) {
            j |= 288230376151711744L;
        }
        if (jSBAIMigrationALLJSBSModel.editImageForSub) {
            j |= 576460752303423488L;
        }
        if (jSBAIMigrationALLJSBSModel.loadGeckoResources) {
            j |= 1152921504606846976L;
        }
        c1543330qGR.LIZ.setValue(c1543330qGR, C1543330qGR.LJIIIZ[0], Long.valueOf(j));
        return jSBAIMigrationALLJSBSModel;
    }

    public static final class JSBAIMigrationALLJSBSModel {

        @C09CT("IBEPreRenderReady")
        public final boolean IBEPreRenderReady;

        @C09CT("accountLogout")
        public final boolean accountLogout;

        @C09CT("broadcast")
        public final boolean broadcast;

        @C09CT("charge")
        public final boolean charge;

        @C09CT("chooseImage")
        public final boolean chooseImage;

        @C09CT("chooseImageForSub")
        public final boolean chooseImageForSub;

        @C09CT("closeLynxFeedMask")
        public final boolean closeLynxFeedMask;

        @C09CT("copyTextToPasteBoard")
        public final boolean copyTextToPasteBoard;

        @C09CT("downloadMedia")
        public final boolean downloadMedia;

        @C09CT("downloadMediaToSystem")
        public final boolean downloadMediaToSystem;

        @C09CT("editImageForSub")
        public final boolean editImageForSub;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("fileSelection")
        public final boolean fileSelection;

        @C09CT("getAppInfo")
        public final boolean getAppInfo;

        @C09CT("getContainerData")
        public final boolean getContainerData;

        @C09CT("getPurchaseItemList")
        public final boolean getPurchaseItemList;

        @C09CT("getSettings")
        public final boolean getSettings;

        @C09CT("getSharedMemoryItem")
        public final boolean getSharedMemoryItem;

        @C09CT("getTheme")
        public final boolean getTheme;

        @C09CT("hasFeedback")
        public final boolean hasFeedback;

        @C09CT("initPipo")
        public final boolean initPipo;

        @C09CT("isAppInstall")
        public final boolean isAppInstall;

        @C09CT("isAppInstalled")
        public final boolean isAppInstalled;

        @C09CT("loadFeedsFlow")
        public final boolean loadFeedsFlow;

        @C09CT("loadGeckoResources")
        public final boolean loadGeckoResources;

        @C09CT("loginFromH5")
        public final boolean loginFromH5;

        @C09CT("loginH5Failed")
        public final boolean loginH5Failed;

        @C09CT("loginWithPlatform")
        public final boolean loginWithPlatform;

        @C09CT("noticePermission")
        public final boolean noticePermission;

        @C09CT("open_2sv")
        public final boolean open2sv;

        @C09CT("openAwemeDetail")
        public final boolean openAwemeDetail;

        @C09CT("openHybrid")
        public final boolean openHybrid;

        @C09CT("openLiveRoom")
        public final boolean openLiveRoom;

        @C09CT("openRechargePanel")
        public final boolean openRechargePanel;

        @C09CT("openRecord")
        public final boolean openRecord;

        @C09CT("openSingletonSchema")
        public final boolean openSingletonSchema;

        @C09CT("openVideoEdit")
        public final boolean openVideoEdit;

        @C09CT("open_effect_record")
        public final boolean open_effect_record;

        @C09CT("open_short_video")
        public final boolean open_short_video;

        @C09CT("playGift")
        public final boolean playGift;

        @C09CT("popDigitalWellbeingVerifyView")
        public final boolean popDigitalWellbeingVerifyView;

        @C09CT("popTuringVerifyView")
        public final boolean popTuringVerifyView;

        @C09CT("prefetch")
        public final boolean prefetch;

        @C09CT("recentLoginUsersInfo")
        public final boolean recentLoginUsersInfo;

        @C09CT("request")
        public final boolean request;

        @C09CT("routeToWhatsapp")
        public final boolean routeToWhatsapp;

        @C09CT("scan")
        public final boolean scan;

        @C09CT("searchKeywordChange")
        public final boolean searchKeywordChange;

        @C09CT("setNativeItem")
        public final boolean setNativeItem;

        @C09CT("setSharedMemoryItem")
        public final boolean setSharedMemoryItem;

        @C09CT("setTitle")
        public final boolean setTitle;

        @C09CT("share")
        public final boolean share;

        @C09CT("showToast")
        public final boolean showToast;

        @C09CT("subscribe_app_ad")
        public final boolean subscribe_app_ad;

        @C09CT("uniUserInfo")
        public final boolean uniUserInfo;

        @C09CT("update_account_info")
        public final boolean update_account_info;

        @C09CT("uploadALog")
        public final boolean uploadALog;

        @C09CT("uploadFile")
        public final boolean uploadFile;

        @C09CT("uploadImage")
        public final boolean uploadImage;

        @C09CT("xopen")
        public final boolean xopen;

        @C09CT("xrequest")
        public final boolean xrequest;

        public JSBAIMigrationALLJSBSModel() {
            this(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
        }

        public JSBAIMigrationALLJSBSModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, boolean z47, boolean z48, boolean z49, boolean z50, boolean z51, boolean z52, boolean z53, boolean z54, boolean z55, boolean z56, boolean z57, boolean z58, boolean z59, boolean z60, boolean z61) {
            this.enable = z;
            this.request = z2;
            this.open2sv = z3;
            this.popDigitalWellbeingVerifyView = z4;
            this.openHybrid = z5;
            this.getSharedMemoryItem = z6;
            this.setSharedMemoryItem = z7;
            this.getTheme = z8;
            this.initPipo = z9;
            this.share = z10;
            this.uniUserInfo = z11;
            this.getContainerData = z12;
            this.searchKeywordChange = z13;
            this.IBEPreRenderReady = z14;
            this.closeLynxFeedMask = z15;
            this.recentLoginUsersInfo = z16;
            this.loginFromH5 = z17;
            this.loginH5Failed = z18;
            this.loginWithPlatform = z19;
            this.noticePermission = z20;
            this.getPurchaseItemList = z21;
            this.isAppInstall = z22;
            this.setTitle = z23;
            this.update_account_info = z24;
            this.uploadALog = z25;
            this.downloadMedia = z26;
            this.copyTextToPasteBoard = z27;
            this.accountLogout = z28;
            this.hasFeedback = z29;
            this.openLiveRoom = z30;
            this.subscribe_app_ad = z31;
            this.open_effect_record = z32;
            this.xrequest = z33;
            this.xopen = z34;
            this.prefetch = z35;
            this.open_short_video = z36;
            this.popTuringVerifyView = z37;
            this.routeToWhatsapp = z38;
            this.scan = z39;
            this.openAwemeDetail = z40;
            this.openRecord = z41;
            this.openVideoEdit = z42;
            this.getAppInfo = z43;
            this.getSettings = z44;
            this.loadFeedsFlow = z45;
            this.setNativeItem = z46;
            this.showToast = z47;
            this.uploadFile = z48;
            this.fileSelection = z49;
            this.broadcast = z50;
            this.isAppInstalled = z51;
            this.openSingletonSchema = z52;
            this.openRechargePanel = z53;
            this.charge = z54;
            this.playGift = z55;
            this.uploadImage = z56;
            this.downloadMediaToSystem = z57;
            this.chooseImage = z58;
            this.chooseImageForSub = z59;
            this.editImageForSub = z60;
            this.loadGeckoResources = z61;
        }
    }
}
