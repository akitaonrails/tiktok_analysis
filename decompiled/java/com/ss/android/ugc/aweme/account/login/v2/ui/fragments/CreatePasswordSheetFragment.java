package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C0I7D;
import X.C0OM1;
import X.C0WZX;
import X.C0XZ4;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1251150ifB;
import X.C197039127h;
import X.C2187451AjH;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C426750GoL;
import X.C616540OGe;
import X.C814420VxA;
import X.C852810Xct;
import X.C854460XfY;
import X.InterfaceC344240DeY;
import Y.ARunnableS70S0200000_1;
import Y.AfS188S0100000_19;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.eventtracking.SetPasswordClickNextEvent;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class CreatePasswordSheetFragment extends BaseUpdatePasswordFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP319HELIOSPSxiLz0yLygpJzsgZgY+LC4nLRUtOjwkJzcoGic2LTEKOy40JSAiPQ==";

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0b;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C852810Xct.LIZ.getClass();
        if (C852810Xct.LJIIIZ(this)) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS563S0100000_19(this, 249));
            c0om1.LIZIZ(c1251150ifB);
        }
        return c0om1;
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment
    public final void hT() {
        String string;
        Editable editableLLJILLL;
        SetPasswordClickNextEvent setPasswordClickNextEvent = new SetPasswordClickNextEvent();
        setPasswordClickNextEvent.LJI(RR(), "page");
        setPasswordClickNextEvent.LJI(getEnterFrom(), "enter_from");
        setPasswordClickNextEvent.LJI(getEnterMethod(), "enter_method");
        setPasswordClickNextEvent.LJIIIIZZ();
        C0I7D c0i7d = this.LLLLIL;
        if (c0i7d == null || (editableLLJILLL = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABvkznnOFAK0X6fjqI5jhMMNLDQZaxHPw0KBNg==", null))) == null || (string = editableLLJILLL.toString()) == null) {
            string = "";
        }
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        String strXS = XS();
        c0xz4.getClass();
        C0XZ4.LJJIJIL(this, this, string, strXS, null).LJIIIIZZ(new AfS188S0100000_19(this, 7)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIJ = new C1237030iIP(getString(2131829384), null, null, null, 14);
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(CreatePasswordSheetFragment.class.getName());
        }
        super.onResume();
        C854460XfY.LIZ.getClass();
        C854460XfY.LJI().put("enter_from", getEnterFrom());
        C854460XfY.LJI().put("enter_method", getEnterMethod());
        C854460XfY.LJI().put("current_page", "CREATE_PASSWORD_SHEET");
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.f69);
        if (tuxTextView != null) {
            tuxTextView.setText(getString(2131829354));
            tuxTextView.LJJJJI(28.0f);
        }
        C197039127h c197039127h = this.LLLLILI;
        if (c197039127h != null) {
            C426750GoL.LJIIIZ(c197039127h, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 23);
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.f68);
        if (linearLayout != null) {
            HandlerHook.viewPost(linearLayout, new ARunnableS70S0200000_1(linearLayout, this, 2));
        }
    }
}
