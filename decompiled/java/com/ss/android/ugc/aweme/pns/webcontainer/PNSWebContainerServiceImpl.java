package com.ss.android.ugc.aweme.pns.webcontainer;

import X.C0PEM;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1594506Md;
import X.C1594706Mf;
import X.C1595406Mm;
import X.C1768406wE;
import X.C1770306wX;
import X.C1DFH;
import X.C2095008Iq;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1594906Mh;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes3.dex */
public final class PNSWebContainerServiceImpl implements PNSWebContainerService {
    @Override // com.ss.android.ugc.aweme.pns.webcontainer.PNSWebContainerService
    public final void LIZ() {
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        C1595406Mm c1595406Mm = new C1595406Mm();
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(c1595406Mm);
    }

    @Override // com.ss.android.ugc.aweme.pns.webcontainer.PNSWebContainerService
    public final void LIZIZ(String str, InterfaceC1594906Mh interfaceC1594906Mh) {
        Uri uri;
        int iIntValue;
        String strLJJIFFI;
        Integer numLJIIJJI;
        C1594706Mf c1594706Mf = new C1594706Mf();
        AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2(interfaceC1594906Mh, 279);
        c1594706Mf.LIZLLL = str;
        c1594706Mf.LIZIZ = interfaceC1594906Mh;
        c1594706Mf.LIZJ = awS581S0100000_2;
        try {
            uri = UriProtector.parse(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            uri = Uri.EMPTY;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "silent_load_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "transition_animation");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "bottom";
        }
        if (iIntValue == 3) {
            c1594706Mf.LJ = true;
            strLJJIFFI = u.LJJIFFI(str, "silent_load_type=3", "silent_load_type=1", false);
        } else {
            c1594706Mf.LJ = false;
            strLJJIFFI = str;
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLJJIFFI);
        sparkContext.LJJJJZI(new C1770306wX(c1594706Mf, 2));
        sparkContext.LJJLIIIJJIZ(new C1768406wE(c1594706Mf, 0));
        sparkContext.LJJJZ("transition_animation", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        c1594706Mf.LIZ = sparkContext;
        if (iIntValue == 0 || ((a0.LJJIIZI(str, "aweme://webview", false) && !a0.LJJIIZI(str, "webview_popup", false)) || (a0.LJJIIZI(str, "aweme://lynxview", false) && !a0.LJJIIZI(str, "lynxview_popup", false)))) {
            awS581S0100000_2.invoke(c1594706Mf);
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1594506Md(c1594706Mf, null), 3);
        }
    }
}
