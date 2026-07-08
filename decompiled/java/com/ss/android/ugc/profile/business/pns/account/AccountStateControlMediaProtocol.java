package com.ss.android.ugc.profile.business.pns.account;

import X.AbstractC848400XPy;
import X.C09YG;
import X.C0C64;
import X.C0XQ7;
import X.C1238130iKB;
import X.C1248840ibS;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C19EG;
import X.C20684815ws;
import X.C2222691Bz1;
import X.C2344009Gk;
import X.C268330AfP;
import X.C340190DVh;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.data.AccountInfoData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountStateControlMediaProtocol extends ProfilePlatformProtocol<AccountInfoData> {
    public boolean LLJJJIL = true;
    public String LLJJJJ;
    public AccountInfoData LLJJJJJIL;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "user_account_state_control_media";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        TextView textView;
        Describe describe;
        View view = this.LLILZLL;
        String text = null;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            T t = this.LLJILJIL;
            if (t != 0 && (describe = t.getDescribe()) != null) {
                text = describe.getText();
            }
            textView.setText(text);
        }
        if (this.LLJJJIL) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("object_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            c2344009Gk.LJIIIIZZ("country_code", C2222691Bz1.LIZ());
            c2344009Gk.LJIIIIZZ("page_name", "user_profile_scm");
            C20684815ws.LJIILLIIL("scm_page_view", c2344009Gk.LIZ);
            this.LLJJJIL = false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final TextUtils.TruncateAt LJJJJ() {
        if (C268330AfP.LJIIJJI()) {
            return TextUtils.TruncateAt.END;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        ProfileComponents profileComponents;
        List<Action> list;
        Action.RouterInfo router;
        String url;
        Fragment fragment;
        C19EG activity;
        ProfileComponents profileComponents2;
        List<EventParams> list2;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_about_this_account_client", true, false)) {
            C1248950ibd c1248950ibd = this.LLIZ;
            if (c1248950ibd != null && (profileComponents2 = c1248950ibd.LLILLJJLI) != null && (list2 = profileComponents2.eventParams) != null) {
                C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_CLICK.getType(), list2, null, 12);
            }
            C1248950ibd c1248950ibd2 = this.LLIZ;
            if (c1248950ibd2 != null && (profileComponents = c1248950ibd2.LLILLJJLI) != null && (list = profileComponents.actions) != null) {
                for (Action action : list) {
                    if (Intrinsics.LJFF(action.getType(), "router") && (router = action.getRouter()) != null && (url = router.getUrl()) != null && (fragment = this.LLILZ) != null && (activity = fragment.getActivity()) != null) {
                        SmartRouter.buildRoute(activity, url).open();
                        return true;
                    }
                }
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("object_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("country_code", C2222691Bz1.LIZ());
        c2344009Gk.LJIIIIZZ("enter_from", "account_profile_page");
        C20684815ws.LJIILLIIL("scm_tag_click", c2344009Gk.LIZ);
        Context context = getContext();
        if (context == null) {
            return true;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("object_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk2.LJIIIIZZ("country_code", C2222691Bz1.LIZ());
        c2344009Gk2.LJIIIIZZ("previous_page", "account_profile_page");
        C20684815ws.LJIILLIIL("scm_description_pop", c2344009Gk2.LIZ);
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(context.getString(2131847029));
        c1397580mTM.LJIIIZ = new C340190DVh(context, R.raw.icon_info_circle_fill, Integer.valueOf(R.attr.a1h), 8);
        c1397580mTM.LIZIZ(context.getString(2131847028));
        C1238130iKB.LIZ(c1397580mTM, new AwS377S0200000_11(context, this, 81));
        c1397580mTM.LIZLLL(AFwS243S0000000_11.get$arr$(587));
        new C1397510mTF(c1397580mTM).LIZLLL();
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        AccountInfoData accountInfoData;
        try {
            accountInfoData = (AccountInfoData) C1250210idf.LIZ(nVar.toString(), AccountInfoData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            accountInfoData = null;
        }
        this.LLJILJIL = accountInfoData;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        String string;
        n nVar;
        String text;
        Describe describe;
        n nVar2 = profileComponents.bizData;
        String text2 = null;
        if (nVar2 != null) {
            string = nVar2.toString();
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF(string, this.LLJJJJ) && (nVar = profileComponents.bizData) != null) {
            LJJJLZIJ(nVar);
            T t = this.LLJILJIL;
            AccountInfoData accountInfoData = this.LLJJJJJIL;
            if (accountInfoData != null && (describe = accountInfoData.getDescribe()) != null) {
                text = describe.getText();
            } else {
                text = null;
            }
            Describe describe2 = t.getDescribe();
            if (describe2 != null) {
                text2 = describe2.getText();
            }
            if (Intrinsics.LJFF(text, text2)) {
                return false;
            }
            LJJLIIIJILLIZJL();
            this.LLJJJJJIL = (AccountInfoData) this.LLJILJIL;
            this.LLJJJJ = string;
        }
        return false;
    }
}
