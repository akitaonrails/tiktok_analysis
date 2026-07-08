package com.ss.android.ugc.aweme.property;

import X.C07ML;
import X.C07MM;
import X.C0C64;
import X.C0CHQ;
import X.C0IKQ;
import X.C13LQ;
import X.C1409905fV;
import X.C1436570nUF;
import X.C1437510nVl;
import X.C1440300naG;
import X.C1442310ndV;
import X.C1442330ndX;
import X.C1442340ndY;
import X.C1442360nda;
import X.C1442370ndb;
import X.C1442380ndc;
import X.C1442400nde;
import X.C1442410ndf;
import X.C1983207pm;
import X.C2188811AlT;
import X.C564000MAc;
import X.InterfaceC1442420ndg;
import X.InterfaceC1442530ndr;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class AVSettingsWrapper {
    public static volatile boolean isHardCodeFallback;
    public static volatile boolean isHardCodeFallbackForRecord;

    public static int clampDefault(int i, int i2, int i3, int i4) {
        return (i < i2 || i > i3) ? i4 : i;
    }

    public static float com_ss_android_ugc_aweme_property_AVSettingsWrapper__getRecordBitrate$___twin___() {
        return getRecordBitrate(false);
    }

    public static float getRecordBitrate() {
        return com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordBitrate();
    }

    public static int getRecordQuality() {
        return com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality();
    }

    public static String getRecordVideoResolution() {
        return getRecordVideoResolution(false);
    }

    public static int[] getRecordVideoSize() {
        return getRecordVideoSize(false);
    }

    public static VESize getNowTakePhotoSize() {
        InterfaceC1442420ndg.LJFF.getClass();
        VESize vESizeLIZ = C1442310ndV.LIZ();
        if (vESizeLIZ != null) {
            int i = vESizeLIZ.width;
            return new VESize(i, (int) (i / 0.75f));
        }
        int[] recordVideoSize = getRecordVideoSize(true);
        if (recordVideoSize == null || recordVideoSize.length != 2) {
            return null;
        }
        int i2 = recordVideoSize[0];
        return new VESize(i2, (int) (i2 / 0.75f));
    }

    public static int com_ss_android_ugc_aweme_property_AVSettingsWrapper__getRecordQuality$___twin___() {
        int iIntValue;
        SettingsManager.LIZLLL().getClass();
        int iClampDefault = clampDefault(SettingsManager.LJ("video_quality", 18), 1, 51, 18);
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "video_quality_category_index", true);
        List<Integer> listLJJLJ = null;
        try {
            int[] iArr = (int[]) SettingsManager.LIZLLL().LJIIIIZZ("video_quality_category", int[].class, null);
            if (iArr != null) {
                listLJJLJ = C13LQ.LJJLJ(iArr);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return (!C0IKQ.LIZIZ(listLJJLJ) || iLJIJ >= listLJJLJ.size() || (iIntValue = ((Integer) ListProtector.get(listLJJLJ, iLJIJ)).intValue()) == 0) ? iClampDefault : iIntValue;
    }

    public static float com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordBitrate() {
        if (C1442410ndf.LIZ() <= 0) {
            return com_ss_android_ugc_aweme_property_AVSettingsWrapper__getRecordBitrate$___twin___();
        }
        if (C1409905fV.LJI == null) {
            C1409905fV.LJI = Float.valueOf(com_ss_android_ugc_aweme_property_AVSettingsWrapper__getRecordBitrate$___twin___());
        }
        return C1409905fV.LJI.floatValue();
    }

    public static int com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality() {
        if (C1442410ndf.LIZ() <= 0) {
            return com_ss_android_ugc_aweme_property_AVSettingsWrapper__getRecordQuality$___twin___();
        }
        if (C1409905fV.LJII == null) {
            C1409905fV.LJII = Integer.valueOf(com_ss_android_ugc_aweme_property_AVSettingsWrapper__getRecordQuality$___twin___());
        }
        return C1409905fV.LJII.intValue();
    }

    public static boolean enableHardEncodeForRecord() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("use_hardcode", 0) == 1 && !isIsHardCodeFallbackForRecord();
    }

    public static boolean enableHardEncodeForSynthetic() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("use_synthetic_hardcode", 0) == 1;
    }

    public static boolean enableHardEncodeForWaterMark() {
        C0CHQ.LIZ().getPublishService().LIZIZ();
        return C1436570nUF.LIZ();
    }

    public static boolean enableSaveUploadVideo() {
        boolean zEnableHardEncodeForWaterMark = enableHardEncodeForWaterMark();
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "upload_save_local", true, true);
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hardEncodeConfig: ");
        sbLIZ.append(zEnableHardEncodeForWaterMark);
        sbLIZ.append(", saveEnabled: ");
        sbLIZ.append(zLJIIIZ);
        c1437510nVlLJJLIIIJ.LIZ("post_save_local", C2188811AlT.LIZIZ(sbLIZ));
        return zEnableHardEncodeForWaterMark && zLJIIIZ;
    }

    public static String getImportVideoResolution() {
        int[] importVideoSize = getImportVideoSize();
        if (importVideoSize == null || importVideoSize.length < 2) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(importVideoSize[0]);
        sbLIZ.append("*");
        sbLIZ.append(importVideoSize[1]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static int[] getImportVideoSize() {
        int[] videoSize;
        int[] videoSize2 = getVideoSize(C1442380ndc.LIZ());
        int iLIZ = C1442340ndY.LIZ();
        List<String> listLIZ = C07ML.LIZ();
        if (C0IKQ.LIZIZ(listLIZ) && iLIZ < listLIZ.size() && (videoSize = getVideoSize((String) ListProtector.get(listLIZ, iLIZ))) != null) {
            videoSize2 = videoSize;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImportResolution ; ");
        sbLIZ.append(Arrays.toString(videoSize2));
        C564000MAc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return videoSize2;
    }

    public static int[] getNowEncodeSize() {
        int[] videoSize;
        int[] videoSize2 = getVideoSize(C1442380ndc.LIZ());
        int iRecordVideoEncodeSizeIndex = C1442370ndb.LIZ(true) ? InterfaceC1442420ndg.LJFF.recordVideoEncodeSizeIndex() : C1442330ndX.LIZIZ();
        List<String> listLIZ = C07MM.LIZ();
        if (C0IKQ.LIZIZ(listLIZ) && iRecordVideoEncodeSizeIndex < listLIZ.size() && (videoSize = getVideoSize((String) ListProtector.get(listLIZ, iRecordVideoEncodeSizeIndex))) != null) {
            videoSize2 = videoSize;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordResolution ; ");
        sbLIZ.append(Arrays.toString(videoSize2));
        C564000MAc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return videoSize2;
    }

    public static int[] getNowShotScreenEncodeSize() {
        int[] videoSize;
        int[] videoSize2 = getVideoSize(C1442380ndc.LIZ());
        int iShotScreenEncodeSizeIndex = C1442370ndb.LIZ(true) ? InterfaceC1442420ndg.LJFF.shotScreenEncodeSizeIndex() : C1442330ndX.LIZIZ();
        List<String> listLIZ = C07MM.LIZ();
        if (C0IKQ.LIZIZ(listLIZ) && iShotScreenEncodeSizeIndex < listLIZ.size() && (videoSize = getVideoSize((String) ListProtector.get(listLIZ, iShotScreenEncodeSizeIndex))) != null) {
            videoSize2 = videoSize;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShotScreenResolution ; ");
        sbLIZ.append(Arrays.toString(videoSize2));
        C564000MAc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return videoSize2;
    }

    public static boolean isIsHardCodeFallback() {
        return isHardCodeFallback;
    }

    public static boolean isIsHardCodeFallbackForRecord() {
        return isHardCodeFallbackForRecord;
    }

    public static int[] getCompileVideoSize(int i) {
        List<String> listLIZ = C07MM.LIZ();
        if (C0IKQ.LIZIZ(listLIZ) && i < listLIZ.size()) {
            return getVideoSize((String) ListProtector.get(listLIZ, i));
        }
        return null;
    }

    public static float getRecordBitrate(boolean z) {
        float fLIZ;
        String json;
        String json2;
        if (C1442370ndb.LIZ(z)) {
            fLIZ = InterfaceC1442420ndg.LJFF.sourceBitrateFactor();
        } else {
            fLIZ = C1442360nda.LIZ();
        }
        Integer numValueOf = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "video_bitrate_category_index", true));
        Integer numValueOf2 = Integer.valueOf(InterfaceC1442530ndr.LIZ.videoBitrateCategoryIndex());
        if (C1442400nde.LIZ()) {
            StringBuilder sb = new StringBuilder("key : video_bitrate_category_index , byteBenchValue : ");
            if (C1983207pm.LIZ(Integer.class)) {
                json2 = String.valueOf(numValueOf2);
            } else {
                json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), numValueOf2);
            }
            sb.append(json2);
            C1440300naG.LIZ(sb.toString());
            numValueOf = numValueOf2;
        } else {
            StringBuilder sb2 = new StringBuilder("key : video_bitrate_category_index , libraValue : ");
            if (C1983207pm.LIZ(Integer.class)) {
                json = String.valueOf(numValueOf);
            } else {
                json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), numValueOf);
            }
            sb2.append(json);
            C1440300naG.LIZ(sb2.toString());
        }
        int iIntValue = numValueOf.intValue();
        List<Float> listLJJLIL = null;
        try {
            float[] fArr = (float[]) SettingsManager.LIZLLL().LJIIIIZZ("video_bitrate_category", float[].class, null);
            if (fArr != null) {
                listLJJLIL = C13LQ.LJJLIL(fArr);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C0IKQ.LIZIZ(listLJJLIL) && iIntValue >= 0 && iIntValue < listLJJLIL.size()) {
            float fFloatValue = ((Float) ListProtector.get(listLJJLIL, iIntValue)).floatValue();
            if (fFloatValue != 0.0f) {
                fLIZ = fFloatValue;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordBitrate ; ");
        sbLIZ.append(fLIZ);
        C564000MAc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return fLIZ;
    }

    public static String getRecordVideoResolution(boolean z) {
        int[] recordVideoSize = getRecordVideoSize(z);
        if (recordVideoSize != null && recordVideoSize.length >= 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(recordVideoSize[0]);
            sbLIZ.append("*");
            sbLIZ.append(recordVideoSize[1]);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] getRecordVideoSize(boolean r4) {
        /*
            java.lang.String r0 = X.C1442380ndc.LIZ()
            int[] r3 = getVideoSize(r0)
            if (r4 == 0) goto L41
            int r2 = X.C1442330ndX.LIZIZ()
            java.util.List r1 = X.C07MM.LIZ()
            boolean r0 = X.C0IKQ.LIZIZ(r1)
            if (r0 == 0) goto L2b
            int r0 = r1.size()
            if (r2 >= r0) goto L2b
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            int[] r0 = getVideoSize(r0)
        L28:
            if (r0 == 0) goto L2b
            r3 = r0
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "RecordResolution ; "
            r1.<init>(r0)
            java.lang.String r0 = java.util.Arrays.toString(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C564000MAc.LIZIZ(r0)
            return r3
        L41:
            X.01GW r0 = X.C21142717oX.LIZJ
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L56
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L56
            int[] r0 = getVideoSize(r1)
            goto L28
        L56:
            int r2 = X.C1442330ndX.LIZ()
            java.util.List r1 = X.C07MM.LIZ()
            boolean r0 = X.C0IKQ.LIZIZ(r1)
            if (r0 == 0) goto L2b
            int r0 = r1.size()
            if (r2 >= r0) goto L2b
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            int[] r0 = getVideoSize(r0)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.AVSettingsWrapper.getRecordVideoSize(boolean):int[]");
    }

    public static int[] getVideoSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int[] iArrStringArrToIntArr = new int[0];
        try {
            iArrStringArrToIntArr = stringArrToIntArr(str.split("x"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (iArrStringArrToIntArr.length != 2) {
            return null;
        }
        return iArrStringArrToIntArr;
    }

    public static void setIsHardCodeFallback(boolean z) {
        isHardCodeFallback = z;
    }

    public static void setIsHardCodeFallbackForRecord(boolean z) {
        isHardCodeFallbackForRecord = z;
    }

    public static int[] stringArrToIntArr(String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = CastIntegerProtector.parseInt(strArr[i]);
        }
        return iArr;
    }

    public static float getRecordBitrate(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        if (videoPublishEditModel.creativeModel.nowsShootModel != null) {
            z = true;
        } else {
            z = false;
        }
        return getRecordBitrate(z);
    }

    public static int[] getRecordVideoSize(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        if (videoPublishEditModel.creativeModel.nowsShootModel != null) {
            z = true;
        } else {
            z = false;
        }
        return getRecordVideoSize(z);
    }
}
