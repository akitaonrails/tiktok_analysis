package com.ss.android.ugc.aweme.commercialize.hybrid.impl.spark;

import X.AbstractC1051250dSl;
import X.AbstractC1542100qES;
import X.C00ZE;
import X.C1015060cWO;
import X.C1049260dPY;
import X.C1051220dSi;
import X.C1051290dSp;
import X.C1051340dSu;
import X.C1051390dSz;
import X.C1051410dT1;
import X.C1051600dTK;
import X.C1051630dTN;
import X.C1056540dbI;
import X.C1310660kDA;
import X.C1538200q8A;
import X.InterfaceC1020440cf4;
import X.InterfaceC1051160dSc;
import X.InterfaceC1540940qCa;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public final class AdHybridSparkLoader extends AbstractC1051250dSl {
    public static final C1051390dSz Companion = new Object() { // from class: X.0dSz
    };
    public final String tag = "AdHybridSparkLoader";

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public C1015060cWO getPerfMetricsModel() {
        SparkContext sparkContextLLIILZL;
        C1538200q8A c1538200q8A;
        C1310660kDA c1310660kDA;
        InterfaceC1541990qEH kitView;
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        View viewE1 = null;
        if (interfaceC1051160dSc == null || (sparkContextLLIILZL = interfaceC1051160dSc.LLIILZL()) == null || (c1538200q8A = (C1538200q8A) sparkContextLLIILZL.LJFF(C1538200q8A.class)) == null) {
            return null;
        }
        long orDefault = getOrDefault(c1538200q8A.LJFF) - getOrDefault(c1538200q8A.LJ);
        long orDefault2 = getOrDefault(c1538200q8A.LJII) - getOrDefault(c1538200q8A.LJI);
        long orDefault3 = getOrDefault(c1538200q8A.LJII) - getOrDefault(c1538200q8A.LIZIZ);
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
        boolean z;
        boolean z2;
        Boolean bool;
        Function2<String, String, Boolean> function2;
        C1051630dTN c1051630dTN = new C1051630dTN();
        c1051630dTN.LIZ = getScene();
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        if (c1049260dPY != null && (function2 = c1049260dPY.LJI) != null) {
            c1051630dTN.LJIIIIZZ = function2;
        }
        c1051630dTN.LIZIZ = c1051290dSp.LIZJ;
        c1051630dTN.LIZJ = c1051290dSp.LIZLLL;
        c1051630dTN.LIZLLL = c1051290dSp.LJ;
        boolean z3 = false;
        if (c1049260dPY != null && (bool = c1049260dPY.LJFF) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c1051630dTN.LJ = zBooleanValue;
        if (!C1056540dbI.LIZIZ() || (((Boolean) C1051600dTK.LIZLLL.getValue()).booleanValue() && c1051290dSp.LJIIIIZZ)) {
            z = true;
        } else {
            z = false;
        }
        c1051630dTN.LJIILIIL = z;
        if (((Boolean) C1051600dTK.LIZLLL.getValue()).booleanValue() && c1051290dSp.LJIIIIZZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1051630dTN.LJIILJJIL = z2;
        if (((Boolean) C1051600dTK.LJ.getValue()).booleanValue() && c1051290dSp.LJIIIIZZ) {
            z3 = true;
        }
        c1051630dTN.LJIILL = z3;
        c1051630dTN.LJI = ((Boolean) C00ZE.LIZIZ.getValue()).booleanValue();
        return c1051630dTN;
    }

    @Override // X.InterfaceC1051270dSn
    public boolean isPreloadViewLoadSuccess(InterfaceC1540940qCa interfaceC1540940qCa) {
        if ((interfaceC1540940qCa instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1540940qCa).LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1051270dSn
    public InterfaceC1051160dSc createSparkMixture(SparkContext sparkContext, InterfaceC1540940qCa interfaceC1540940qCa) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        if (interfaceC1540940qCa instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1540940qCa;
        } else {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
        }
        return new C1051220dSi(sparkContext, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
    }

    @Override // X.InterfaceC1051270dSn
    public AdSparkHybridContext createAdSparkContext(Context context, String str, String str2, Bundle bundle, InterfaceC1020440cf4 interfaceC1020440cf4, String str3, C1051340dSu c1051340dSu) {
        C1051410dT1.LIZ.getClass();
        return C1051410dT1.LIZ(context, str, str2, bundle, interfaceC1020440cf4, str3, null, null, null, false, c1051340dSu);
    }

    @Override // X.InterfaceC1051270dSn
    public InterfaceC1051160dSc createSparkMixture(Context context, String str, Bundle bundle, String str2, AbstractC1542100qES abstractC1542100qES, InterfaceC1020440cf4 interfaceC1020440cf4, String str3, C1051340dSu c1051340dSu) {
        return C1051410dT1.LIZ.LIZJ(context, str, bundle, str2, abstractC1542100qES, interfaceC1020440cf4, str3, c1051340dSu);
    }
}
