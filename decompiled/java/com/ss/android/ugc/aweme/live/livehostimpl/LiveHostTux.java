package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C2095008Iq;
import X.C2248361CzK;
import X.C418440Gaw;
import X.C437801n6;
import X.C698190Ra5;
import X.C814420VxA;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdkapi.host.IHostTux;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveHostTux implements IHostTux {
    @Override // com.bytedance.android.livesdkapi.host.IHostTux
    public final Integer JJ1(String str) {
        return C2248361CzK.LIZIZ(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostTux
    public final C437801n6 fa0(Context context, String str) {
        C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(context, str);
        if (c698190Ra5LJFF != null) {
            return new C437801n6(c698190Ra5LJFF.LIZ, c698190Ra5LJFF.LIZIZ);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostTux
    public final Integer gA(Context context, String str) {
        return C2248361CzK.LJ(context, str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostTux
    public final boolean Xl2(TuxIconView tuxIconView, String str, Context context, boolean z) {
        C698190Ra5 c698190Ra5LJFF;
        Integer numLJIIJJI;
        if (tuxIconView == null || (c698190Ra5LJFF = C2248361CzK.LJFF(context, str)) == null) {
            return false;
        }
        tuxIconView.setIconRes(c698190Ra5LJFF.LIZ);
        Integer num = c698190Ra5LJFF.LIZIZ;
        if (num != null) {
            tuxIconView.setTintColor(num.intValue());
        }
        if (z) {
            try {
                Uri uri = UriProtector.parse(str);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "width");
                Integer numLJIIJJI2 = null;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                } else {
                    numLJIIJJI = null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "height");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    numLJIIJJI2 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                }
                if (numLJIIJJI != null) {
                    tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI)));
                }
                if (numLJIIJJI2 != null) {
                    tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI2)));
                    return true;
                }
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return true;
            }
        }
        return true;
    }
}
