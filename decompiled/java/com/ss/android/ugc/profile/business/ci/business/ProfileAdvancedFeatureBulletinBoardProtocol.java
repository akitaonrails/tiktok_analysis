package com.ss.android.ugc.profile.business.ci.business;

import X.C1248950ibd;
import X.C13LP;
import X.C1954807lC;
import X.C20684815ws;
import X.C2344009Gk;
import X.C267770AeV;
import X.C995560c0w;
import X.EnumC995550c0v;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAdvancedFeatureBulletinBoardProtocol extends AdvancedFeatureProtocol {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "advanced_feature_bulletin_board";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        if (((Boolean) C267770AeV.LIZ.getValue()).booleanValue()) {
            IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
            if (iProfilePlatformVM != null) {
                iProfilePlatformVM.GQ2(new AwS595S0100000_16(this, 161));
                return;
            }
            return;
        }
        IProfilePlatformVM iProfilePlatformVM2 = this.LLIZLLLIL;
        if (iProfilePlatformVM2 != null) {
            iProfilePlatformVM2.JQ2(new AwS595S0100000_16(this, 162));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_bubble_announcement);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        LJLILLLLZI(EnumC995550c0v.CLICK);
        return false;
    }

    public final void LJLILLLLZI(EnumC995550c0v enumC995550c0v) {
        ProfileComponents profileComponents;
        List<Action> list;
        Action action;
        Action.RouterInfo router;
        String url;
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        try {
            C1248950ibd c1248950ibd = this.LLIZ;
            if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (list = profileComponents.actions) == null || (action = (Action) C13LP.LJJJLL(list)) == null || (router = action.getRouter()) == null || (url = router.getUrl()) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((uri = UriProtector.parse(url)), "bulletin_board_id")) == null) {
                return;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bulletin_account_status");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                i = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            } else {
                i = 1;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_subscribed");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                i2 = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
            } else {
                i2 = -1;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLJJIJIL);
            int i4 = C995560c0w.LIZ[enumC995550c0v.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new C1954807lC();
                }
                str = "click";
            } else {
                str = "show";
            }
            c2344009Gk.LJIIIIZZ("action_type", str);
            if (this.LLJI) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            c2344009Gk.LJIIIIZZ("is_author", String.valueOf(i3));
            c2344009Gk.LIZJ(i2, "is_subscribed");
            c2344009Gk.LJIIIIZZ("channel_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            if (i == 1) {
                str2 = "open";
            } else {
                str2 = "close";
            }
            c2344009Gk.LJIIIIZZ("channel_status", str2);
            if (enumC995550c0v == EnumC995550c0v.CLICK) {
                c2344009Gk.LJFF("click_type", "enter_cell");
            }
            C20684815ws.LJIILLIIL("bulletin_board_cell", c2344009Gk.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
