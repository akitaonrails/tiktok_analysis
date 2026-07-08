package com.ss.android.ttve.mediacodec;

import X.C2188811AlT;
import X.C2484209oO;
import android.os.Build;
import com.ss.android.vesdk.VEConfigCenter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class TEMediaCodecResourceManager {
    public static int sMaxCodecBlocksSize;
    public static int sUsedCodecBlocksSize;
    public static List<Integer> sMediaCodecInstance = new ArrayList();
    public static int sSafeLimitSize = 2304000;
    public static volatile boolean sHWEncoderStateIsBeforeRunning = false;
    public static volatile boolean sExistHWEncoder = false;

    public static synchronized int getMaxCodecBlocksSize() {
        if (sMaxCodecBlocksSize == 0) {
            sMaxCodecBlocksSize = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sMaxCodecBlocksSize: ");
            sbLIZ.append(sMaxCodecBlocksSize);
            C2484209oO.LJI("TEMediaCodecResourceManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        return sMaxCodecBlocksSize;
    }

    public static int getReuseDecoderType() {
        return Build.MODEL.toLowerCase().contains("nth-an00") ? 1 : 0;
    }

    public static synchronized int getUsedCodecBlocksSize() {
        return sUsedCodecBlocksSize;
    }

    public static synchronized void resetCodecBlocksSize() {
        sUsedCodecBlocksSize = 0;
        sMaxCodecBlocksSize = 0;
        sMediaCodecInstance.clear();
        C2484209oO.LIZ("TEMediaCodecResourceManager", "resetCodecBlocksSize");
    }

    public static int getAvailableCodecSize() {
        int maxCodecBlocksSize;
        if (!VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue() || (maxCodecBlocksSize = getMaxCodecBlocksSize()) <= 0) {
            return -1;
        }
        return maxCodecBlocksSize - sUsedCodecBlocksSize;
    }

    public static synchronized int canUseHardwareDecoder(int i) {
        int i2 = 0;
        if (!VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue()) {
            return -1;
        }
        if (sMaxCodecBlocksSize == 0) {
            sMaxCodecBlocksSize = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sMaxCodecBlocksSize: ");
            sbLIZ.append(sMaxCodecBlocksSize);
            C2484209oO.LJI("TEMediaCodecResourceManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        int i3 = sMaxCodecBlocksSize;
        if (i3 <= 0) {
            return -1;
        }
        if (sUsedCodecBlocksSize + i > i3) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("can't use hw decoder, sMaxCodecBlocksSize:");
            sbLIZ2.append(sMaxCodecBlocksSize);
            sbLIZ2.append(", sUsedCodecBlocksSize:");
            sbLIZ2.append(sUsedCodecBlocksSize);
            sbLIZ2.append(", blocksSize:");
            sbLIZ2.append(i);
            C2484209oO.LJIIIIZZ("TEMediaCodecResourceManager", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            i2 = 1;
        }
        return i2;
    }

    public static synchronized void freeCodecBlocksSize(int i, int i2) {
        if (!sMediaCodecInstance.contains(Integer.valueOf(i2))) {
            return;
        }
        sUsedCodecBlocksSize -= i;
        sMediaCodecInstance.remove(Integer.valueOf(i2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("freeCodecBlocksSize blocksSize: ");
        sbLIZ.append(i);
        sbLIZ.append(", sUsedCodecBlocksSize: ");
        sbLIZ.append(sUsedCodecBlocksSize);
        sbLIZ.append(", ");
        sbLIZ.append(i2);
        C2484209oO.LIZ("TEMediaCodecResourceManager", C2188811AlT.LIZIZ(sbLIZ));
        if (sUsedCodecBlocksSize < 0) {
            C2484209oO.LJIIIIZZ("TEMediaCodecResourceManager", "freeCodecBlocksSize sUsedCodecBlocksSize < 0");
            sUsedCodecBlocksSize = 0;
        }
    }

    public static synchronized boolean tryUseCodecBlocksSize(int i, int i2) {
        if (sMaxCodecBlocksSize == 0) {
            sMaxCodecBlocksSize = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sMaxCodecBlocksSize: ");
            sbLIZ.append(sMaxCodecBlocksSize);
            C2484209oO.LJI("TEMediaCodecResourceManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (sMaxCodecBlocksSize == -1) {
            return true;
        }
        if (sMediaCodecInstance.contains(Integer.valueOf(i2))) {
            return true;
        }
        int i3 = sUsedCodecBlocksSize;
        if (i3 + i > sMaxCodecBlocksSize) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sUsedCodecBlocksSize + blocksSize > sMaxCodecBlocksSize, sUsedCodecBlocksSize: ");
            sbLIZ2.append(sUsedCodecBlocksSize);
            sbLIZ2.append(", blocksSize:");
            sbLIZ2.append(i);
            C2484209oO.LJIIIIZZ("TEMediaCodecResourceManager", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        sUsedCodecBlocksSize = i3 + i;
        sMediaCodecInstance.add(Integer.valueOf(i2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("tryUseCodecBlocksSize success blocksSize: ");
        sbLIZ3.append(i);
        sbLIZ3.append(", sUsedCodecBlocksSize: ");
        sbLIZ3.append(sUsedCodecBlocksSize);
        sbLIZ3.append(", ");
        sbLIZ3.append(i2);
        C2484209oO.LIZ("TEMediaCodecResourceManager", C2188811AlT.LIZIZ(sbLIZ3));
        return true;
    }

    public static synchronized boolean checkCanFastImport(int i, int i2, int i3) {
        if (sMaxCodecBlocksSize == 0) {
            sMaxCodecBlocksSize = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sMaxCodecBlocksSize: ");
            sbLIZ.append(sMaxCodecBlocksSize);
            C2484209oO.LJI("TEMediaCodecResourceManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        int i4 = sMaxCodecBlocksSize;
        if (i4 == -1) {
            return true;
        }
        int i5 = sUsedCodecBlocksSize;
        int i6 = i * i2 * i3;
        if (i5 + i6 > i4) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkCanFastImport is false, sUsedCodecBlocksSize: ");
            sbLIZ2.append(sUsedCodecBlocksSize);
            sbLIZ2.append(", width: ");
            sbLIZ2.append(i);
            sbLIZ2.append(", height: ");
            sbLIZ2.append(i2);
            sbLIZ2.append(", fps: ");
            sbLIZ2.append(i3);
            C2484209oO.LIZ("TEMediaCodecResourceManager", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        if (i5 > 0) {
            int i7 = sSafeLimitSize;
            if (i4 - i7 > 0 && i5 + i6 > i4 - i7) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("checkCanFastImport is false, sUsedCodecBlocksSize: ");
                sbLIZ3.append(sUsedCodecBlocksSize);
                sbLIZ3.append(", width: ");
                sbLIZ3.append(i);
                sbLIZ3.append(", height: ");
                sbLIZ3.append(i2);
                sbLIZ3.append(", fps: ");
                sbLIZ3.append(i3);
                C2484209oO.LIZ("TEMediaCodecResourceManager", C2188811AlT.LIZIZ(sbLIZ3));
                return false;
            }
        }
        C2484209oO.LIZ("TEMediaCodecResourceManager", "checkCanFastImport is true");
        return true;
    }
}
