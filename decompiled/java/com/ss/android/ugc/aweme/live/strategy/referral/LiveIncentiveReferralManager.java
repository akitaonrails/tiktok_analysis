package com.ss.android.ugc.aweme.live.strategy.referral;

import X.AbstractC1387200mCc;
import X.C19322110iZ;
import X.C2436109gd;
import X.C520150Kab;
import X.C786410Ut5;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.api.revenue.strategy.channel.ILiveIncentiveReferralService;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: loaded from: classes22.dex */
public class LiveIncentiveReferralManager implements ILiveIncentiveReferralService {
    @Override // com.bytedance.android.livesdk.api.revenue.strategy.channel.ILiveIncentiveReferralService
    public final boolean DO0(C2436109gd c2436109gd) {
        FragmentManager fragmentManagerLJ;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
        AbstractC1387200mCc abstractC1387200mCcLIZLLL = C520150Kab.LIZLLL();
        if (abstractC1387200mCcLIZLLL != null && (fragmentManagerLJ = abstractC1387200mCcLIZLLL.LJ()) != null) {
            Uri uri = c2436109gd.LIZ;
            String str = "";
            if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "top_container_schema")) == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            Uri uri2 = c2436109gd.LIZ;
            if (uri2 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "share_link")) == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            }
            Uri uri3 = c2436109gd.LIZ;
            if (uri3 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "bottom_container_schema")) == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
            }
            Uri uri4 = c2436109gd.LIZ;
            if (uri4 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri4, "panel_background_color")) != null) {
                str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("top_container_schema", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, bundle);
            C786410Ut5.LJJJI("share_link", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, bundle);
            C786410Ut5.LJJJI("bottom_container_schema", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, bundle);
            C786410Ut5.LJJJI("panel_background_color", str, bundle);
            if (C19322110iZ.LIZLLL(fragmentManagerLJ, LiveIncentiveReferralSharePanel.class, "LiveIncentiveReferralSharePanel", null, bundle) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
