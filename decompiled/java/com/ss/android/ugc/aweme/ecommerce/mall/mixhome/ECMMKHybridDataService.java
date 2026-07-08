package com.ss.android.ugc.aweme.ecommerce.mall.mixhome;

import X.C1768340w7M;
import X.C1769810w9j;
import X.C1770900wBU;
import X.C1771410wCJ;
import X.C1771420wCK;
import X.C1848407Lu;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallBridgeCenterModel;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallFpsOptModelV1;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPerfConfigV1Model;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMMKHybridDataService implements IHybridDataService {
    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final String LIZIZ() {
        return "tiktok_ecom_hybrid_mall";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean LIZJ() {
        /*
            r2 = this;
            X.0wCK r0 = X.C1771420wCK.LIZ
            r0.getClass()
            X.01GW r0 = X.C1771420wCK.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallFpsOptModelV1 r0 = (com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallFpsOptModelV1) r0
            if (r0 == 0) goto L1f
            java.lang.Integer r0 = r0.enableSparkActivePredecode
            if (r0 == 0) goto L1f
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L1f
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L1f:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ECMMKHybridDataService.LIZJ():java.lang.Boolean");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final boolean LIZLLL() {
        Integer num;
        C1769810w9j.LIZ.getClass();
        EcMixMallPerfConfigV1Model ecMixMallPerfConfigV1ModelLIZ = C1769810w9j.LIZ();
        return (ecMixMallPerfConfigV1ModelLIZ == null || (num = ecMixMallPerfConfigV1ModelLIZ.enableVideoTimeViewByJava) == null || num.intValue() != 1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final void LJFF() {
        C1770900wBU.LIZ.getClass();
        C1770900wBU.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final boolean LJII() {
        C1768340w7M.LIZ.getClass();
        return ((Boolean) C1768340w7M.LJIIIIZZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final boolean LJIIIZ() {
        C1769810w9j.LIZ.getClass();
        return ((Number) C1769810w9j.LJFF.getValue()).intValue() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean LJIIJ() {
        /*
            r2 = this;
            X.0wCK r0 = X.C1771420wCK.LIZ
            r0.getClass()
            X.01GW r0 = X.C1771420wCK.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallFpsOptModelV1 r0 = (com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallFpsOptModelV1) r0
            if (r0 == 0) goto L1f
            java.lang.Integer r0 = r0.asyncReportLivePlayerApplog
            if (r0 == 0) goto L1f
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L1f
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L1f:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ECMMKHybridDataService.LJIIJ():java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean LJIIL() {
        /*
            r2 = this;
            X.0wCK r0 = X.C1771420wCK.LIZ
            r0.getClass()
            X.01GW r0 = X.C1771420wCK.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallFpsOptModelV1 r0 = (com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallFpsOptModelV1) r0
            if (r0 == 0) goto L1f
            java.lang.Integer r0 = r0.optInitDataFormat
            if (r0 == 0) goto L1f
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L1f
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L1f:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ECMMKHybridDataService.LJIIL():java.lang.Boolean");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final C1848407Lu LJIILJJIL() {
        return C1768340w7M.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final Double LJIILL() {
        C1771420wCK.LIZ.getClass();
        EcMixMallFpsOptModelV1 ecMixMallFpsOptModelV1 = (EcMixMallFpsOptModelV1) C1771420wCK.LIZJ.getValue();
        if (ecMixMallFpsOptModelV1 != null) {
            return ecMixMallFpsOptModelV1.disableBlankCardDetectThreshold;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final int LJIILLIIL() {
        C1769810w9j.LIZ.getClass();
        return ((Number) C1769810w9j.LJ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final Integer LJIJ() {
        C1769810w9j.LIZ.getClass();
        return C1769810w9j.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final Map<String, Object> LJIJI() {
        return C1768340w7M.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final List<String> LJIJJ() {
        C1771420wCK.LIZ.getClass();
        EcMixMallFpsOptModelV1 ecMixMallFpsOptModelV1 = (EcMixMallFpsOptModelV1) C1771420wCK.LIZJ.getValue();
        if (ecMixMallFpsOptModelV1 != null) {
            return ecMixMallFpsOptModelV1.activePredecodeExcludeTypeList;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final boolean LJIJJLI() {
        Integer num;
        C1769810w9j.LIZ.getClass();
        EcMixMallPerfConfigV1Model ecMixMallPerfConfigV1ModelLIZ = C1769810w9j.LIZ();
        return (ecMixMallPerfConfigV1ModelLIZ == null || (num = ecMixMallPerfConfigV1ModelLIZ.enableSetSkeletonLayerBelow) == null || num.intValue() != 1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final boolean LJIL() {
        Integer num;
        C1769810w9j.LIZ.getClass();
        EcMixMallPerfConfigV1Model ecMixMallPerfConfigV1ModelLIZ = C1769810w9j.LIZ();
        return (ecMixMallPerfConfigV1ModelLIZ == null || (num = ecMixMallPerfConfigV1ModelLIZ.enableRunBlockPostAtFrontOfQueue) == null || num.intValue() != 1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final boolean LJ(String str) {
        return C1768340w7M.LIZ.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final boolean LJIIIIZZ(String str) {
        Integer num;
        EcMixMallBridgeCenterModel ecMixMallBridgeCenterModelLIZ;
        List<String> list;
        C1771410wCJ c1771410wCJ = C1771410wCJ.LIZ;
        if (str == null) {
            str = "";
        }
        c1771410wCJ.getClass();
        EcMixMallBridgeCenterModel ecMixMallBridgeCenterModelLIZ2 = C1771410wCJ.LIZ();
        if (ecMixMallBridgeCenterModelLIZ2 != null && (num = ecMixMallBridgeCenterModelLIZ2.enableTrackSendEventPerf) != null) {
            if (num.intValue() == 1 || (num.intValue() == 2 && (ecMixMallBridgeCenterModelLIZ = C1771410wCJ.LIZ()) != null && (list = ecMixMallBridgeCenterModelLIZ.trackSendEventPerfAllowList) != null && list.contains(str))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final Long LJIIJJI(String str) {
        return C1768340w7M.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final boolean LJIILIIL(String str) {
        Integer num;
        EcMixMallBridgeCenterModel ecMixMallBridgeCenterModelLIZ;
        List<String> list;
        C1771410wCJ c1771410wCJ = C1771410wCJ.LIZ;
        if (str == null) {
            str = "";
        }
        c1771410wCJ.getClass();
        EcMixMallBridgeCenterModel ecMixMallBridgeCenterModelLIZ2 = C1771410wCJ.LIZ();
        if (ecMixMallBridgeCenterModelLIZ2 != null && (num = ecMixMallBridgeCenterModelLIZ2.enableTrackCallMethodMonitor) != null) {
            if (num.intValue() == 1 || (num.intValue() == 2 && (ecMixMallBridgeCenterModelLIZ = C1771410wCJ.LIZ()) != null && (list = ecMixMallBridgeCenterModelLIZ.trackCallMethodMonitorAllowList) != null && list.contains(str))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final boolean LJIIZILJ(String str) {
        Integer num;
        EcMixMallBridgeCenterModel ecMixMallBridgeCenterModelLIZ;
        List<String> list;
        C1771410wCJ c1771410wCJ = C1771410wCJ.LIZ;
        if (str == null) {
            str = "";
        }
        c1771410wCJ.getClass();
        EcMixMallBridgeCenterModel ecMixMallBridgeCenterModelLIZ2 = C1771410wCJ.LIZ();
        if (ecMixMallBridgeCenterModelLIZ2 != null && (num = ecMixMallBridgeCenterModelLIZ2.enableTrackCallMethodError) != null) {
            if (num.intValue() == 1 || (num.intValue() == 2 && (ecMixMallBridgeCenterModelLIZ = C1771410wCJ.LIZ()) != null && (list = ecMixMallBridgeCenterModelLIZ.trackCallMethodErrorAllowList) != null && list.contains(str))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService
    public final boolean LJI(Object obj, String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
        if (str != null && obj != null && (sharedPreferences = MMKStorageUtil.LIZLLL) != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString(str, MMKStorageUtil.LJII(obj))) != null) {
            editorPutString.apply();
            return true;
        }
        return false;
    }
}
