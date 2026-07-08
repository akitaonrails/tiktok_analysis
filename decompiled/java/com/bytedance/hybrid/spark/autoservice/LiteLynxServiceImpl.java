package com.bytedance.hybrid.spark.autoservice;

import X.C04TD;
import X.C1058140dds;
import X.C1100000ejO;
import X.C1535630q41;
import X.C1537480q70;
import X.C1540320qBa;
import X.C1542150qEX;
import X.C1546010qKl;
import X.C446980Hfs;
import X.EnumC1067640dtC;
import X.InterfaceC1531560pxS;
import X.InterfaceC1542060qEO;
import X.InterfaceC1545600qK6;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.lite.autoservice.ILiteLynxApi;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes24.dex */
public final class LiteLynxServiceImpl implements ILiteLynxApi {
    public static ILiteLynxApi createILiteLynxApibyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ILiteLynxApi.class, z);
        if (objLIZ != null) {
            return (ILiteLynxApi) objLIZ;
        }
        if (C04TD.LJJ == null) {
            synchronized (ILiteLynxApi.class) {
                if (C04TD.LJJ == null) {
                    C04TD.LJJ = new LiteLynxServiceImpl();
                }
            }
        }
        return C04TD.LJJ;
    }

    private final C1058140dds getBgPrimary(Context context, HybridSchemaParam hybridSchemaParam) {
        int iLIZ;
        InterfaceC1545600qK6 interfaceC1545600qK6LIZLLL;
        Integer numLIZIZ;
        EnumC1067640dtC engineType;
        int iLIZ2;
        if (!(hybridSchemaParam instanceof SparkPageSchemaParam) && !(hybridSchemaParam instanceof SparkPopupSchemaParam)) {
            Context context2 = null;
            if (hybridSchemaParam != null) {
                engineType = hybridSchemaParam.getEngineType();
            } else {
                engineType = null;
            }
            if (engineType == EnumC1067640dtC.WEB) {
                return new C1058140dds(C1542150qEX.LIZ());
            }
            try {
                Context context3 = C1100000ejO.LIZ;
                if (context3 != null) {
                    context2 = context3;
                }
                iLIZ2 = C446980Hfs.LIZ(context2, R.color.d4);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iLIZ2 = 0;
            }
            return new C1058140dds(iLIZ2);
        }
        if (C1540320qBa.LIZ) {
            InterfaceC1542060qEO interfaceC1542060qEO = C1546010qKl.LIZ;
            if (interfaceC1542060qEO != null && (interfaceC1545600qK6LIZLLL = interfaceC1542060qEO.LIZLLL()) != null && (numLIZIZ = interfaceC1545600qK6LIZLLL.LIZIZ(context)) != null) {
                iLIZ = numLIZIZ.intValue();
            } else {
                iLIZ = C1542150qEX.LIZ();
            }
            return new C1058140dds(iLIZ);
        }
        return new C1058140dds(C1542150qEX.LIZ());
    }

    @Override // com.bytedance.lynx.hybrid.lite.autoservice.ILiteLynxApi
    public Integer getContainerBgColor(Context context, C1537480q70 c1537480q70) {
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1058140dds bgPrimary;
        SparkContext sparkContext;
        HybridSchemaParam hybridSchemaParamLIZJ2;
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        String strLJJJIL = null;
        if (interfaceC1531560pxS == null || (hybridSchemaParamLIZJ2 = interfaceC1531560pxS.LIZJ()) == null || (bgPrimary = hybridSchemaParamLIZJ2.getContainerBgColor()) == null) {
            InterfaceC1531560pxS interfaceC1531560pxS2 = c1537480q70.hybridParams;
            if (interfaceC1531560pxS2 != null) {
                hybridSchemaParamLIZJ = interfaceC1531560pxS2.LIZJ();
            } else {
                hybridSchemaParamLIZJ = null;
            }
            bgPrimary = getBgPrimary(context, hybridSchemaParamLIZJ);
        }
        if ((c1537480q70 instanceof SparkContext) && (sparkContext = (SparkContext) c1537480q70) != null) {
            strLJJJIL = sparkContext.LJJJIL();
        }
        return Integer.valueOf(bgPrimary.getColor(context, strLJJJIL));
    }

    @Override // com.bytedance.lynx.hybrid.lite.autoservice.ILiteLynxApi
    public Integer getLoadingBgColor(Context context, C1537480q70 c1537480q70) {
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1058140dds bgPrimary;
        SparkContext sparkContext;
        HybridSchemaParam hybridSchemaParamLIZJ2;
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        String strLJJJIL = null;
        if (interfaceC1531560pxS == null || (hybridSchemaParamLIZJ2 = interfaceC1531560pxS.LIZJ()) == null || (bgPrimary = hybridSchemaParamLIZJ2.getLoadingBgColor()) == null) {
            if (C1535630q41.LIZ(c1537480q70.LJIJI())) {
                bgPrimary = new C1058140dds(0);
            } else {
                InterfaceC1531560pxS interfaceC1531560pxS2 = c1537480q70.hybridParams;
                if (interfaceC1531560pxS2 != null) {
                    hybridSchemaParamLIZJ = interfaceC1531560pxS2.LIZJ();
                } else {
                    hybridSchemaParamLIZJ = null;
                }
                bgPrimary = getBgPrimary(context, hybridSchemaParamLIZJ);
            }
        }
        if ((c1537480q70 instanceof SparkContext) && (sparkContext = (SparkContext) c1537480q70) != null) {
            strLJJJIL = sparkContext.LJJJIL();
        }
        return Integer.valueOf(bgPrimary.getColor(context, strLJJJIL));
    }
}
