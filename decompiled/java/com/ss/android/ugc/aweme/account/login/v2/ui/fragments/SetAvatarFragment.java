package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1169960gYE;
import X.C1237010iIN;
import X.C1237030iIP;
import X.EnumC638250P1r;
import X.EnumC852910Xd3;
import android.os.Bundle;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class SetAvatarFragment extends CommonSetAvatarFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0HELIOSIStiP319PSxiLz0yLygpJzsgZhYpPQ4lKTEtOwkhKSIhLCEn";
    public TuxTextView LLLLIILLL;
    public boolean LLLLIL = true;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String ZR() {
        return "AvatarFragment";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0o;
    }

    public final void VS() {
        C1169960gYE.LIZ.getClass();
        C1169960gYE.LJ.put(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
            arguments.putInt("previous_page", EnumC852910Xd3.CREATE_AVATAR.getValue());
            fo(arguments);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LIZ = getString(2131829374);
        c1237010iIN.LIZJ = EnumC638250P1r.PRIMARY;
        c1237010iIN.LJIIIIZZ = getString(2131824982);
        c1237010iIN.LJIIIZ = getString(2131824981);
        c1237010iIN.LIZIZ = getString(2131847626);
        c1237010iIN.LJIIJJI = "set_avatar";
        c1237010iIN.LJIJ = new C1237030iIP(null, null, null, null, 15);
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void ES() {
        super.ES();
        this.LLLLIL = false;
        VS();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return this.LLLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            super.onViewCreated(r5, r6)
            r0 = 2131382830(0x7f0a522e, float:1.8386016E38)
            android.view.View r0 = r5.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r4.LLLLIILLL = r0
            android.os.Bundle r1 = r4.getArguments()
            r3 = 0
            if (r1 == 0) goto L57
            java.lang.String r0 = "has_set_nickname"
            boolean r1 = r1.getBoolean(r0, r3)
            r0 = 1
            if (r1 != r0) goto L57
        L1e:
            r2 = 0
            if (r0 == 0) goto L4c
            com.bytedance.tux.input.TuxTextView r1 = r4.LLLLIILLL
            if (r1 != 0) goto L26
            r1 = r2
        L26:
            X.01GW r0 = r4.LLLIZZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r0 = r0.getNickname()
            r1.setText(r0)
            com.bytedance.tux.input.TuxTextView r0 = r4.LLLLIILLL
            if (r0 == 0) goto L3a
            r2 = r0
        L3a:
            X.C786410Ut5.LJLLLLLL(r3, r2)
        L3d:
            X.127h r2 = r4.QS()
            Y.ACListenerS154S0100000_19 r1 = new Y.ACListenerS154S0100000_19
            r0 = 71
            r1.<init>(r4, r0)
            r4.GS(r1, r2)
            return
        L4c:
            com.bytedance.tux.input.TuxTextView r0 = r4.LLLLIILLL
            if (r0 == 0) goto L51
            r2 = r0
        L51:
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r2)
            goto L3d
        L57:
            r0 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetAvatarFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
