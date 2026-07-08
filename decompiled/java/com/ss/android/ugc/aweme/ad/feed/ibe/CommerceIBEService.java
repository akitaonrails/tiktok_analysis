package com.ss.android.ugc.aweme.ad.feed.ibe;

import X.C04TD;
import X.C089E;
import X.C0PEM;
import X.C1009740cNo;
import X.C1057930ddX;
import X.C1062870dlV;
import X.C1062900dlY;
import X.C1063000dli;
import X.C1063050dln;
import X.C1063080dlq;
import X.C1063100dls;
import X.C13LP;
import X.C1DFH;
import X.C2107308Nj;
import X.C2214201BlK;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C717610SCx;
import X.C987620bo8;
import X.EnumC1063200dm2;
import X.InterfaceC1364105Vn;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceIBEService implements ICommerceIBEService {
    public static ICommerceIBEService LJFF() {
        Object objLIZ = C04TD.LIZ(ICommerceIBEService.class, false);
        if (objLIZ != null) {
            return (ICommerceIBEService) objLIZ;
        }
        if (C04TD.LJLLJ == null) {
            synchronized (ICommerceIBEService.class) {
                if (C04TD.LJLLJ == null) {
                    C04TD.LJLLJ = new CommerceIBEService();
                }
            }
        }
        return C04TD.LJLLJ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService
    public final C1063050dln LIZ(C987620bo8 c987620bo8) {
        return new C1063050dln(c987620bo8);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService
    public final boolean LIZJ(String str) throws Exception {
        C1063000dli.LIZ.getClass();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "channel");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            return C1063000dli.LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        throw new Exception() { // from class: X.0dlg
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService
    public final void LIZLLL(List<? extends Aweme> list, EnumC1063200dm2 enumC1063200dm2, Integer num) {
        Object[] array;
        Activity activityLJFF;
        CommercialVideoInfo commercialVideoInfoLJ;
        List<IBEInfo> ibeInfos;
        IBEInfo iBEInfo;
        if (list == null || (array = list.toArray(new Aweme[0])) == null || (activityLJFF = C2214201BlK.LJFF()) == null) {
            return;
        }
        C717610SCx c717610SCx = new C717610SCx(new C089E(array));
        while (c717610SCx.hasNext()) {
            IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
            int i = indexedValue.LIZ;
            Aweme aweme = (Aweme) indexedValue.LIZIZ;
            if (aweme != null && (commercialVideoInfoLJ = C1009740cNo.LJ(aweme)) != null && (ibeInfos = commercialVideoInfoLJ.getIbeInfos()) != null && (iBEInfo = (IBEInfo) C13LP.LJJLIIIJL(ibeInfos)) != null) {
                C1062900dlY c1062900dlY = C1063100dls.LIZ;
                C1063080dlq c1063080dlq = new C1063080dlq(this, iBEInfo, activityLJFF, i, aweme, num, enumC1063200dm2);
                Boolean bool = c1062900dlY.LIZIZ.get(aweme.getAid());
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.LJFF(bool, bool2)) {
                    c1062900dlY.LIZIZ.put(aweme.getAid(), bool2);
                    c1063080dlq.invoke();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService
    public final Object LJ(IBEInfo iBEInfo, C1057930ddX c1057930ddX, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return C1063000dli.LIZ.LIZ(iBEInfo, c1057930ddX, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService
    public final void LIZIZ(IBEInfo iBEInfo, Context context, C1057930ddX c1057930ddX, Function1<? super SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Unit> function1, Function0<Unit> function0) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.plus(C23118094a.LIZ())), null, null, new C1062870dlV(iBEInfo, this, c1057930ddX, context, function1, function0, null), 3);
    }
}
