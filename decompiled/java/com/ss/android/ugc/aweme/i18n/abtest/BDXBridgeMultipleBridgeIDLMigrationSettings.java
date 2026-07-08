package com.ss.android.ugc.aweme.i18n.abtest;

import X.C09CT;
import X.C0C64;
import X.C1543330qGR;
import X.C1544000qHW;
import X.C667430QFx;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes29.dex */
public final class BDXBridgeMultipleBridgeIDLMigrationSettings {
    public static final BDXBridgeMultipleBridgeIDLMigrationModel LIZ = new BDXBridgeMultipleBridgeIDLMigrationModel(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);

    static {
        new BDXBridgeMultipleBridgeIDLMigrationModel(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    }

    public static final BDXBridgeMultipleBridgeIDLMigrationModel LIZ() {
        BDXBridgeMultipleBridgeIDLMigrationModel bDXBridgeMultipleBridgeIDLMigrationModel;
        if (C667430QFx.LIZ()) {
            bDXBridgeMultipleBridgeIDLMigrationModel = LIZ;
        } else {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            bDXBridgeMultipleBridgeIDLMigrationModel = LIZ;
            BDXBridgeMultipleBridgeIDLMigrationModel bDXBridgeMultipleBridgeIDLMigrationModel2 = (BDXBridgeMultipleBridgeIDLMigrationModel) c0c64LJIILLIIL.LJJIIJ(true, "BDXBridge_Multiple_Bridge_IDL_Migration", 31744, BDXBridgeMultipleBridgeIDLMigrationModel.class, bDXBridgeMultipleBridgeIDLMigrationModel, 2);
            if (bDXBridgeMultipleBridgeIDLMigrationModel2 != null) {
                bDXBridgeMultipleBridgeIDLMigrationModel = bDXBridgeMultipleBridgeIDLMigrationModel2;
            }
        }
        AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
        C1543330qGR c1543330qGR = C1544000qHW.LJIILLIIL;
        long j = bDXBridgeMultipleBridgeIDLMigrationModel.enable ? 1L : 0L;
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xGetContainerID) {
            j |= 2;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xGetStorageInfo) {
            j |= 4;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xGetStorageItem) {
            j |= 8;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xRemoveStorageItem) {
            j |= 16;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xSetStorageItem) {
            j |= 32;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xGetAppInfo) {
            j |= 64;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xGetUserInfo) {
            j |= 128;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xGetSettings) {
            j |= 256;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xReportADLog) {
            j |= 512;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xReportMonitorLog) {
            j |= 1024;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xReportALog) {
            j |= 2048;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xHideLoading) {
            j |= 4096;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xShowLoading) {
            j |= 8192;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xMakePhoneCall) {
            j |= 16384;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xShowToast) {
            j |= 32768;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xShowModal) {
            j |= 65536;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xScanCode) {
            j |= 131072;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xUpdateGecko) {
            j |= 262144;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xGetGeckoInfo) {
            j |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xChooseMedia) {
            j |= 1048576;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xGetDebugInfo) {
            j |= 2097152;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xUploadImage) {
            j |= 4194304;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xConfigureStatusBar) {
            j |= 8388608;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xBatchEvents) {
            j |= 16777216;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xSendSocketData) {
            j |= 33554432;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xConnectSocket) {
            j |= 67108864;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xCloseSocket) {
            j |= 134217728;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xCanIUse) {
            j |= 268435456;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xClose) {
            j |= 536870912;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xDownloadFile) {
            j |= 1073741824;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xLogin) {
            j |= 2147483648L;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xLogout) {
            j |= 4294967296L;
        }
        if (bDXBridgeMultipleBridgeIDLMigrationModel.xUploadFile) {
            j |= 8589934592L;
        }
        c1543330qGR.LJFF.setValue(c1543330qGR, C1543330qGR.LJIIIZ[5], Long.valueOf(j));
        return bDXBridgeMultipleBridgeIDLMigrationModel;
    }

    public static final class BDXBridgeMultipleBridgeIDLMigrationModel {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("xBatchEvents")
        public final boolean xBatchEvents;

        @C09CT("xCanIUse")
        public final boolean xCanIUse;

        @C09CT("xChooseMedia")
        public final boolean xChooseMedia;

        @C09CT("xClose")
        public final boolean xClose;

        @C09CT("xCloseSocket")
        public final boolean xCloseSocket;

        @C09CT("xConfigureStatusBar")
        public final boolean xConfigureStatusBar;

        @C09CT("xConnectSocket")
        public final boolean xConnectSocket;

        @C09CT("xDownloadFile")
        public final boolean xDownloadFile;

        @C09CT("xGetAppInfo")
        public final boolean xGetAppInfo;

        @C09CT("xGetContainerID")
        public final boolean xGetContainerID;

        @C09CT("xGetDebugInfo")
        public final boolean xGetDebugInfo;

        @C09CT("xGetGeckoInfo")
        public final boolean xGetGeckoInfo;

        @C09CT("xGetSettings")
        public final boolean xGetSettings;

        @C09CT("xGetStorageInfo")
        public final boolean xGetStorageInfo;

        @C09CT("xGetStorageItem")
        public final boolean xGetStorageItem;

        @C09CT("xGetUserInfo")
        public final boolean xGetUserInfo;

        @C09CT("xHideLoading")
        public final boolean xHideLoading;

        @C09CT("xLogin")
        public final boolean xLogin;

        @C09CT("xLogout")
        public final boolean xLogout;

        @C09CT("xMakePhoneCall")
        public final boolean xMakePhoneCall;

        @C09CT("xRemoveStorageItem")
        public final boolean xRemoveStorageItem;

        @C09CT("xReportADLog")
        public final boolean xReportADLog;

        @C09CT("xReportALog")
        public final boolean xReportALog;

        @C09CT("xReportMonitorLog")
        public final boolean xReportMonitorLog;

        @C09CT("xScanCode")
        public final boolean xScanCode;

        @C09CT("xSendSocketData")
        public final boolean xSendSocketData;

        @C09CT("xSetStorageItem")
        public final boolean xSetStorageItem;

        @C09CT("xShowLoading")
        public final boolean xShowLoading;

        @C09CT("xShowModal")
        public final boolean xShowModal;

        @C09CT("xShowToast")
        public final boolean xShowToast;

        @C09CT("xUpdateGecko")
        public final boolean xUpdateGecko;

        @C09CT("xUploadFile")
        public final boolean xUploadFile;

        @C09CT("xUploadImage")
        public final boolean xUploadImage;

        public BDXBridgeMultipleBridgeIDLMigrationModel() {
            this(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
        }

        public BDXBridgeMultipleBridgeIDLMigrationModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34) {
            this.enable = z;
            this.xGetContainerID = z2;
            this.xGetStorageInfo = z3;
            this.xGetStorageItem = z4;
            this.xRemoveStorageItem = z5;
            this.xSetStorageItem = z6;
            this.xGetAppInfo = z7;
            this.xGetUserInfo = z8;
            this.xGetSettings = z9;
            this.xReportADLog = z10;
            this.xReportMonitorLog = z11;
            this.xReportALog = z12;
            this.xHideLoading = z13;
            this.xShowLoading = z14;
            this.xMakePhoneCall = z15;
            this.xShowToast = z16;
            this.xShowModal = z17;
            this.xScanCode = z18;
            this.xUpdateGecko = z19;
            this.xGetGeckoInfo = z20;
            this.xChooseMedia = z21;
            this.xGetDebugInfo = z22;
            this.xUploadImage = z23;
            this.xConfigureStatusBar = z24;
            this.xBatchEvents = z25;
            this.xSendSocketData = z26;
            this.xConnectSocket = z27;
            this.xCloseSocket = z28;
            this.xCanIUse = z29;
            this.xClose = z30;
            this.xDownloadFile = z31;
            this.xLogin = z32;
            this.xLogout = z33;
            this.xUploadFile = z34;
        }
    }
}
