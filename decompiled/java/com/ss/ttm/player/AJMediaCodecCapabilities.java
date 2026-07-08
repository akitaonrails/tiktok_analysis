package com.ss.ttm.player;

import X.C2188811AlT;
import X.C807510Vm1;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class AJMediaCodecCapabilities {
    public static boolean LIZLLL = false;
    public static boolean LJ = false;
    public static int LJFF = 1;
    public static final ArrayList<MediaCodecInfo> LJI = new ArrayList<>();
    public static final Object LJII = new Object();
    public MediaCodecInfo LIZ;
    public String LIZIZ;
    public int LIZJ = -1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    public int isAdaptivePlayback() {
        ?? IsFeatureSupported;
        String str;
        int i = this.LIZJ;
        if (i != -1) {
            return i;
        }
        MediaCodecInfo mediaCodecInfo = this.LIZ;
        if (mediaCodecInfo == null || (str = this.LIZIZ) == null) {
            IsFeatureSupported = 1;
        } else {
            try {
                IsFeatureSupported = mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("adaptive-playback");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                IsFeatureSupported = 1;
            }
        }
        this.LIZJ = IsFeatureSupported;
        if ("Q7-G1".equals(Build.MODEL) && "kunlun".equals(Build.HARDWARE)) {
            "GK6323V100C".equals(Build.BOARD);
        }
        return this.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AJMediaCodecCapabilities() {
        /*
            r6 = this;
            r6.<init>()
            r0 = -1
            r6.LIZJ = r0
            boolean r0 = com.ss.ttm.player.AJMediaCodecCapabilities.LIZLLL
            r5 = 1
            if (r0 != 0) goto L76
            java.lang.String r1 = "ro.board.platform"
            r0 = 0
            java.lang.String r2 = com.ss.ttm.player.AJMediaCodec.LIZIZ(r1, r0)
            int r1 = X.C1285020jXo.LIZ
            r0 = 26
            if (r1 != r0) goto L4c
            if (r2 == 0) goto L4c
            java.lang.String r0 = "kirin960"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "hi3660"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L4c
        L2a:
            java.lang.String r1 = "ro.config.hw_codec_support"
            java.lang.String r0 = "0.0"
            java.lang.String r0 = com.ss.ttm.player.AJMediaCodec.LIZIZ(r1, r0)
            double r3 = com.bytedance.mt.protector.impl.string2number.CastDoubleProtector.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L40
            r1 = 4595667975560726713(0x3fc717acc4ef88b9, double:0.18041)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4c
            goto L74
        L40:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r1 = "JAJMediaCodecCapabilities"
            java.lang.String r0 = "vendor property abnormal"
            X.C1285320jYI.LIZLLL(r6, r1, r0)
            goto L74
        L4c:
            java.lang.String r1 = X.C1285020jXo.LJ
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "mt6763"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L74
            java.lang.String r0 = "mt6757"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L74
            java.lang.String r0 = "mt6739"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L74
            java.lang.String r0 = "mt6750"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L76
        L74:
            com.ss.ttm.player.AJMediaCodecCapabilities.LJ = r5
        L76:
            com.ss.ttm.player.AJMediaCodecCapabilities.LIZLLL = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodecCapabilities.<init>():void");
    }

    public void setEnableVC1BlockList(int i) {
        LJFF = i;
    }

    public int getDolbyVisionProfileAndLevel(int i, int i2) {
        String[] strArrSplit;
        String strLIZ = C807510Vm1.LIZ(i, i2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dv codecs = ");
        sbLIZ.append(strLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZ != null) {
            strArrSplit = strLIZ.split("\\.");
        } else {
            strArrSplit = null;
        }
        Pair pairLIZIZ = C807510Vm1.LIZIZ(strArrSplit);
        if (pairLIZIZ != null) {
            return ((Integer) pairLIZIZ.first).intValue();
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getBestCodecName(java.lang.String r15, int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodecCapabilities.getBestCodecName(java.lang.String, int, int):java.lang.String");
    }
}
