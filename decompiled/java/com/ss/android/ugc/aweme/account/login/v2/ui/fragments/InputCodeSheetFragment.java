package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0HZQ;
import X.C0OM1;
import X.C0XQ5;
import X.C0XUD;
import X.C0XZ4;
import X.C11JS;
import X.C1236860iI8;
import X.C1237010iIN;
import X.C1237680iJS;
import X.C1237730iJX;
import X.C1251150ifB;
import X.C1265750j2j;
import X.C1266060j3E;
import X.C1754640vlG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C424320GkQ;
import X.C426750GoL;
import X.C444920HcY;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C814420VxA;
import X.C851910XbR;
import X.C852810Xct;
import X.C854460XfY;
import X.EnumC850750XYz;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC344240DeY;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS71S0200000_2;
import Y.ARunnableS88S0200000_19;
import Y.AfS188S0100000_19;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class InputCodeSheetFragment extends InputCodeFragmentV2 implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSP319PSxiLz0yLygpJzsgZgwiOTonCyooLBw7LSA4Dz0yLygpJzs=";
    public TuxTextView LLLLLJLJLL;
    public TuxTextView LLLLLL;
    public TuxTextView LLLLLLIL;
    public TuxTextView LLLLLLJ;
    public TuxTextView LLLLLLL;
    public boolean LLLLLLLZIL;
    public InputFilter[] LLLLLLZ;
    public C1237680iJS LLLLLLZZ;
    public final C01GW LLLLLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 286));
    public final C01GW LLLLLLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 287));
    public final String LLLLLZ = "phone";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0f;
    }

    public final TuxTextView AT() {
        View viewFindViewById = this.LLLLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpf) : null;
            this.LLLLLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView CT() {
        View viewFindViewById = this.LLLLLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kph) : null;
            this.LLLLLLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView DT() {
        View viewFindViewById = this.LLLLLLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpi) : null;
            this.LLLLLLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final String FT() {
        return (String) this.LLLLLLLLLL.getValue();
    }

    public final boolean GT() {
        return ((Boolean) this.LLLLLLLLL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C852810Xct.LIZ.getClass();
        if (C852810Xct.LJIIIZ(this)) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS563S0100000_19(this, 285));
            c0om1.LIZIZ(c1251150ifB);
        }
        return c0om1;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = FT();
        c1236860iI8.LIZIZ = GT();
        C852810Xct.LIZ.getClass();
        c1236860iI8.LJ = C852810Xct.LIZIZ(this);
        c1236860iI8.LJI = false;
        c1236860iI8.LJFF = false;
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        C11JS c11jsLJJIII;
        View viewFindViewById = this.LLLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpa) : null;
            this.LLLJ = (C424320GkQ) viewFindViewById;
        }
        ((C424320GkQ) viewFindViewById).LIZ();
        if (GT()) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            String strFT = FT();
            EnumC852660Xce enumC852660XceSR = SR();
            EnumC852910Xd3 enumC852910Xd3VR = VR();
            String strRR = RR();
            C854460XfY.LIZ.getClass();
            c11jsLJJIII = C0XZ4.LJJ(c0xz4, this, this, strFT, enumC852660XceSR, enumC852910Xd3VR, null, null, "resend", "phone", strRR, null, C854460XfY.LJIIJJI(this), 2400);
        } else {
            c11jsLJJIII = C0XZ4.LJJIII(C0XZ4.LIZ, this, this, FT(), 8, "resend", null, null, null, EnumC850750XYz.CODE, null, 736);
        }
        c11jsLJJIII.LJFF(new C1266060j3E(this, 6)).LJIILL();
    }

    public final TuxTextView zT() {
        View viewFindViewById = this.LLLLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpg) : null;
            this.LLLLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC1237610iJL
    public final void LJJJLIIL() {
        if (isViewValid()) {
            C1237680iJS c1237680iJSLT = lT();
            c1237680iJSLT.getFormViewFromXml().setFooter(null);
            c1237680iJSLT.LLILLJJLI.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLLJLJLL = null;
        this.LLLLLL = null;
        this.LLLLLLIL = null;
        this.LLLLLLJ = null;
        this.LLLLLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        PhoneBindSheetFragment.LLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(InputCodeSheetFragment.class.getName());
        }
        super.onResume();
        C854460XfY.LIZ.getClass();
        C854460XfY.LJI().put("enter_from", getEnterFrom());
        C854460XfY.LJI().put("enter_method", getEnterMethod());
        C854460XfY.LJI().put("exit_page", "verification_page");
        C854460XfY.LJI().put("current_page", GT() ? "PHONE_BIND_SHEET" : "EMAIL_BIND_SHEET");
        C1237680iJS c1237680iJS = this.LLLLLLZZ;
        if (c1237680iJS != null) {
            C1754640vlG pinField = c1237680iJS.getPinField();
            pinField.requestFocus();
            HandlerHook.viewPostDelay(pinField, new ARunnableS104S0100000_4(pinField, 11), 500L);
            PhoneBindSheetFragment.LLLL = c1237680iJS.getPinField().getWindowToken();
        }
        C0HZQ c0hzq = this.LLLF;
        if (c0hzq != null) {
            HandlerHook.viewPostDelay(c0hzq, new ARunnableS119S0100000_19(this, 26), 100L);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLLZ;
    }

    public final CharSequence ET(Integer num) {
        SpannableStringBuilder spannableStringBuilder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(FT());
        sbLIZ.append(' ');
        sbLIZ.append(" ");
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (num != null) {
            spannableStringBuilder = new SpannableStringBuilder(getString(num.intValue(), strLIZIZ));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
        }
        int iLJJJ = a0.LJJJ(spannableStringBuilder, FT(), 0, false, 6);
        int length = FT().length() + iLJJJ + 1;
        if (num != null) {
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(42, false), iLJJJ, FT().length() + iLJJJ, 34);
        }
        Context context = getContext();
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_pen;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
            C786410Ut5.q2(spannableStringBuilder, new C419890GdH(tuxIconDrawableLIZ, 2), length, length + 1, 34);
            C786410Ut5.q2(spannableStringBuilder, new C1265750j2j(this, context, 1), iLJJJ, strLIZIZ.length() + iLJJJ, 34);
        }
        return spannableStringBuilder;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC1237610iJL
    public final void Tk(String str, String str2) {
        if (this.LLLLLLLZIL) {
            return;
        }
        this.LLLLLLLZIL = true;
        iT().setFilters(new C1237730iJX[]{C1237730iJX.LL});
        super.Tk(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        TuxTextView tuxTextView;
        C1754640vlG pinField;
        super.onViewCreated(view, bundle);
        if (GT()) {
            i = 2131838784;
        } else {
            i = 2131838783;
        }
        CharSequence charSequenceET = ET(Integer.valueOf(i));
        View viewFindViewById = this.LLLLLJLJLL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.kpk);
            } else {
                viewFindViewById = null;
            }
            this.LLLLLJLJLL = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(getString(2131838785));
        View view3 = this.LLLLLJLJLL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.kpk);
            }
            this.LLLLLJLJLL = (TuxTextView) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        ((TuxTextView) view3).LJJJJI(28.0f);
        AT().setText(charSequenceET);
        AT().setMovementMethod(LinkMovementMethod.getInstance());
        gT().setTuxFont(42);
        this.LLLLLLZ = iT().getFilters();
        View viewFindViewById3 = view.findViewById(R.id.phl);
        if (viewFindViewById3 != null) {
            C851910XbR c851910XbR = C851910XbR.LIZ;
            C0XUD.LIZ.getClass();
            boolean z = !C0XUD.LJIIJJI;
            String str = this.LLLLLZ;
            AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(62);
            c851910XbR.getClass();
            this.LLLF = C851910XbR.LIZ(viewFindViewById3, true, z, "", str, aFwS257S0000000_19, false);
        }
        C1237680iJS c1237680iJS = (C1237680iJS) view.findViewById(R.id.qgj);
        this.LLLLLLZZ = c1237680iJS;
        if (c1237680iJS != null && (pinField = c1237680iJS.getPinField()) != null) {
            pinField.setDimOnComplete(false);
        }
        C1237680iJS c1237680iJS2 = this.LLLLLLZZ;
        if (c1237680iJS2 != null) {
            C426750GoL.LJIIIZ(c1237680iJS2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, null, false, 29);
        }
        C0XQ5.LIZIZ.LJIIJ();
        if (!AbstractC848400XPy.LJJIJIIJIL() && (tuxTextView = (TuxTextView) view.findViewById(R.id.dnx)) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(getString(2131821286));
            GS(new ACListenerS154S0100000_19(this, 66), tuxTextView);
        }
        HandlerHook.viewPost(AT(), new ARunnableS88S0200000_19(this, charSequenceET, 5));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.kpj);
        if (linearLayout != null) {
            HandlerHook.viewPost(linearLayout, new ARunnableS71S0200000_2(linearLayout, this, 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        if (GT()) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            String strFT = FT();
            EnumC852660Xce enumC852660XceSR = SR();
            EnumC852910Xd3 enumC852910Xd3VR = VR();
            String strRR = RR();
            c0xz4.getClass();
            C0XZ4.LIZJ(this, this, strFT, enumC852660XceSR, enumC852910Xd3VR, str, false, "phone", strRR, null).LJIIIIZZ(new AfS188S0100000_19(this, 14)).LJFF(new C1266060j3E(this, 4)).LJIILL();
            return;
        }
        C0XZ4 c0xz42 = C0XZ4.LIZ;
        String strFT2 = FT();
        getEnterFrom();
        getEnterMethod();
        RR();
        String strMT = mT();
        c0xz42.getClass();
        C0XZ4.LIZ(this, this, strFT2, str, false, str2, strMT, null).LJIIIIZZ(new AfS188S0100000_19(this, 15)).LJFF(new C1266060j3E(this, 5)).LJIILL();
    }
}
