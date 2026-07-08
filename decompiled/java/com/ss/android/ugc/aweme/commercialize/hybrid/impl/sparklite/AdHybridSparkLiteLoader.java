package com.ss.android.ugc.aweme.commercialize.hybrid.impl.sparklite;

import X.AbstractC1051250dSl;
import X.AbstractC1542100qES;
import X.C0BJ4;
import X.C1015060cWO;
import X.C1049260dPY;
import X.C1051290dSp;
import X.C1051340dSu;
import X.C1051510dTB;
import X.C1051630dTN;
import X.C1056540dbI;
import X.C1097680efe;
import X.C1310660kDA;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1537810q7X;
import X.C1537820q7Y;
import X.C1537830q7Z;
import X.C1537910q7h;
import X.C1546180qL2;
import X.C23250099c;
import X.C373201cg;
import X.C817503Hh;
import X.InterfaceC1020440cf4;
import X.InterfaceC1051160dSc;
import X.InterfaceC1105930esx;
import X.InterfaceC1531560pxS;
import X.InterfaceC1540940qCa;
import X.InterfaceC1541990qEH;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public final class AdHybridSparkLiteLoader extends AbstractC1051250dSl {
    public final String tag = "AdHybridSparkLiteLoader";

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public C1015060cWO getPerfMetricsModel() {
        SparkContext sparkContextLLIILZL;
        C1537810q7X c1537810q7X;
        C1310660kDA c1310660kDA;
        InterfaceC1541990qEH kitView;
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        View viewE1 = null;
        if (interfaceC1051160dSc == null || (sparkContextLLIILZL = interfaceC1051160dSc.LLIILZL()) == null || (c1537810q7X = (C1537810q7X) sparkContextLLIILZL.LJFF(C1537810q7X.class)) == null) {
            return null;
        }
        long orDefault = getOrDefault(c1537810q7X.LIZJ) - getOrDefault(c1537810q7X.LIZIZ);
        long orDefault2 = getOrDefault(c1537810q7X.LJJ) - getOrDefault(c1537810q7X.LJIL);
        long orDefault3 = getOrDefault(c1537810q7X.LJJ) - getOrDefault(c1537810q7X.LIZ);
        InterfaceC1051160dSc interfaceC1051160dSc2 = this.sparkMixture;
        if (interfaceC1051160dSc2 != null && (kitView = interfaceC1051160dSc2.getKitView()) != null) {
            viewE1 = kitView.e1();
        }
        if ((viewE1 instanceof LynxView) && (c1310660kDA = (C1310660kDA) viewE1) != null) {
            c1310660kDA.getMeaningfulPaintTiming();
        }
        return new C1015060cWO(orDefault + orDefault2, (orDefault3 - orDefault) - orDefault2);
    }

    @Override // X.InterfaceC1051270dSn
    public String getTag() {
        return this.tag;
    }

    @Override // X.InterfaceC1051270dSn
    public C1051630dTN getPrerenderConfig(C1051290dSp c1051290dSp) {
        boolean zBooleanValue;
        Boolean bool;
        Function2<String, String, Boolean> function2;
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LIZ = getScene();
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        if (c1049260dPY != null && (function2 = c1049260dPY.LJI) != null) {
            c1097680efe.LJIIIIZZ = function2;
        }
        c1097680efe.LIZIZ = c1051290dSp.LIZJ;
        c1097680efe.LIZJ = c1051290dSp.LIZLLL;
        c1097680efe.LIZLLL = c1051290dSp.LJ;
        if (c1049260dPY != null && (bool = c1049260dPY.LJFF) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c1097680efe.LJ = zBooleanValue;
        c1097680efe.LJIJJ = new InterfaceC1631620sYq<Context, String, C1537480q70, InterfaceC1105930esx>() { // from class: X.0dSy
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [X.0esx] */
            /* JADX WARN: Type inference failed for: r1v7 */
            @Override // X.InterfaceC1631620sYq
            public final InterfaceC1105930esx invoke(Context context, String str, C1537480q70 c1537480q70) {
                InterfaceC1531560pxS interfaceC1531560pxS;
                ?? LIZIZ;
                C1537910q7h c1537910q7h;
                HybridSchemaParam hybridSchemaParam;
                Context context2 = context;
                C1537480q70 c1537480q702 = c1537480q70;
                if (c1537480q702 != null) {
                    interfaceC1531560pxS = c1537480q702.hybridParams;
                } else {
                    interfaceC1531560pxS = null;
                }
                if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null && (hybridSchemaParam = c1537910q7h.LJJIIJ) != null) {
                    LIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParam, c1537480q702, context2, null);
                } else {
                    LIZIZ = 0;
                }
                if (!(LIZIZ instanceof C1537720q7O)) {
                    return null;
                }
                return LIZIZ;
            }
        };
        c1097680efe.LJIILIIL = !C1056540dbI.LIZIZ();
        return c1097680efe;
    }

    @Override // X.InterfaceC1051270dSn
    public boolean isPreloadViewLoadSuccess(InterfaceC1540940qCa interfaceC1540940qCa) {
        if ((interfaceC1540940qCa instanceof C1537720q7O) && ((C1537720q7O) interfaceC1540940qCa).LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1051250dSl
    public void preDecodeIfNeed(SparkContext sparkContext) {
        if (((Boolean) C0BJ4.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C373201cg(sparkContext, null), 3);
        }
    }

    @Override // X.InterfaceC1051270dSn
    public InterfaceC1051160dSc createSparkMixture(SparkContext sparkContext, InterfaceC1540940qCa interfaceC1540940qCa) {
        C1537720q7O c1537720q7O;
        if (interfaceC1540940qCa instanceof C1537720q7O) {
            c1537720q7O = (C1537720q7O) interfaceC1540940qCa;
        } else {
            c1537720q7O = null;
        }
        return new C1546180qL2(sparkContext, c1537720q7O);
    }

    @Override // X.InterfaceC1051270dSn
    public AdSparkHybridContext createAdSparkContext(Context context, String str, String str2, Bundle bundle, InterfaceC1020440cf4 interfaceC1020440cf4, String str3, C1051340dSu c1051340dSu) {
        return C1051510dTB.LIZ(context, str, str2, bundle, interfaceC1020440cf4, str3, c1051340dSu);
    }

    @Override // X.InterfaceC1051270dSn
    public InterfaceC1051160dSc createSparkMixture(Context context, String str, Bundle bundle, String str2, AbstractC1542100qES abstractC1542100qES, InterfaceC1020440cf4 interfaceC1020440cf4, String str3, C1051340dSu c1051340dSu) {
        C1537910q7h c1537910q7h;
        HybridSchemaParam hybridSchemaParam;
        AdSparkHybridContext adSparkHybridContextLIZ = C1051510dTB.LIZ(context, str, str2, bundle, interfaceC1020440cf4, str3, c1051340dSu);
        adSparkHybridContextLIZ.LJJLJ(abstractC1542100qES);
        InterfaceC1531560pxS interfaceC1531560pxS = adSparkHybridContextLIZ.hybridParams;
        C1537720q7O c1537720q7O = null;
        if (!(interfaceC1531560pxS instanceof C1537830q7Z) || (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) == null || (hybridSchemaParam = c1537910q7h.LJJIIJ) == null) {
            return null;
        }
        InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParam, adSparkHybridContextLIZ, context, null);
        if (interfaceC1541990qEHLIZIZ instanceof C1537720q7O) {
            c1537720q7O = (C1537720q7O) interfaceC1541990qEHLIZIZ;
        }
        return new C1546180qL2(adSparkHybridContextLIZ, c1537720q7O);
    }
}
