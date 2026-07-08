package com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.log;

import X.C11NJ;
import X.C11PQ;
import X.C20684815ws;
import X.C2344009Gk;
import android.net.Uri;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: loaded from: classes4.dex */
public final class PdpLogHelper implements GenericLifecycleObserver {
    public final C11PQ<Integer> LL = new C11PQ<>();
    public final C11NJ LLILLJJLI = new C11NJ();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void dispose() {
        this.LLILLJJLI.dispose();
    }

    public static void LIZ(int i, long j) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "success");
        c2344009Gk.LJIIIIZZ("load_time", String.valueOf((System.currentTimeMillis() - j) / 1000.0f));
        c2344009Gk.LJIIIIZZ("schema_url", "");
        Uri uri = UriProtector.parse(null);
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
            c2344009Gk.LJFF("channel", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        }
        Uri uri2 = UriProtector.parse(null);
        if (uri2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "bundle")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
            c2344009Gk.LJFF("bundle", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        C20684815ws.LJIILLIIL("ttmp_oc_anchor_pdp_load", c2344009Gk.LIZ);
    }
}
