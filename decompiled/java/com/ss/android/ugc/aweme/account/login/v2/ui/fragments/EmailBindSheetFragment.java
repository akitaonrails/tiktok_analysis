package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C0I7D;
import X.C0OM1;
import X.C0XGR;
import X.C0XQ5;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237710iJV;
import X.C1251150ifB;
import X.C1266120j3K;
import X.C1391190mJ3;
import X.C19EG;
import X.C20684815ws;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.C852810Xct;
import X.C854460XfY;
import X.EnumC852660Xce;
import X.InterfaceC1058150ddt;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.BackToPreviousPageEvent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class EmailBindSheetFragment extends CommonInputEmailFragment implements InterfaceC344240DeY, InterfaceC1058150ddt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSP319PSxiLz0yLygpJzsgZgAhKCY/CiwiLRw7LSA4Dz0yLygpJzs=";
    public TuxTextView LLLLIL;
    public TuxTextView LLLLILI;
    public final C01GW LLLLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 250));
    public final C01GW LLLLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 252));
    public final C01GW LLLLL = C452501pT.LIZIZ(new C1237710iJV(this));
    public final C01GW LLLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 253));
    public final C01GW LLLLLILLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 254));

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final boolean hT() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0c;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C852810Xct.LIZ.getClass();
        if (C852810Xct.LJIIIZ(this)) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS563S0100000_19(this, 251));
            c0om1.LIZIZ(c1251150ifB);
        }
        return c0om1;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIJ = new C1237030iIP(null, null, null, null, 15);
        if (!C0XQ5.LIZJ().isPhoneBinded()) {
            c1237010iIN.LJIJI = new C1237030iIP(jT() ? getString(2131836800) : getString(2131836809), null, null, new AwS598S0100000_19(this, 86), 6);
        }
        c1237010iIN.LJIIJ = true;
        return c1237010iIN;
    }

    public final boolean jT() {
        return ((Boolean) this.LLLLJ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        C854460XfY.LIZ.getClass();
        if (!Intrinsics.LJFF(C854460XfY.LJI().get("exit_page"), "verification_page")) {
            return false;
        }
        boolean zLJFF = Intrinsics.LJFF(C854460XfY.LJI().get("current_page"), "PHONE_BIND_SHEET");
        BackToPreviousPageEvent backToPreviousPageEvent = new BackToPreviousPageEvent();
        backToPreviousPageEvent.LJI(zLJFF ? "phone_binding_show" : "email_binding_show", "current_page");
        backToPreviousPageEvent.LJI(zLJFF ? "sms_verification" : "email_verification", "pre_page");
        backToPreviousPageEvent.LJI(getEnterFrom(), "enter_from");
        backToPreviousPageEvent.LJI("press_back", "enter_method");
        backToPreviousPageEvent.LJI(RR(), "page");
        backToPreviousPageEvent.LJIIIIZZ();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLIL = null;
        this.LLLLILI = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        PhoneBindSheetFragment.LLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(EmailBindSheetFragment.class.getName());
        }
        super.onResume();
        this.LLLJL = true;
        C854460XfY.LIZ.getClass();
        C854460XfY.LJI().put("enter_from", getEnterFrom());
        C854460XfY.LJI().put("enter_method", getEnterMethod());
        C854460XfY.LJI().put("exit_page", "binding_page");
        C854460XfY.LJI().put("current_page", "EMAIL_BIND_SHEET");
        C0I7D c0i7d = this.LLLJIL;
        if (c0i7d != null) {
            PhoneBindSheetFragment.LLLL = c0i7d.getWindowToken();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iT(java.lang.String r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r6 = r17
            X.01GW r0 = r6.LLLLLIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 0
            r8 = r18
            if (r0 == 0) goto L2d
            X.0Xce r0 = r6.SR()
            X.0XaZ r0 = X.C1236990iIL.LIZ(r8, r0)
            if (r0 == 0) goto L3e
            X.0iIi r0 = r0.LIZ
        L1f:
            r3 = 1
            r1 = 0
            if (r0 == 0) goto L40
            boolean r0 = r0.LIZIZ()
            if (r0 != r3) goto L40
            r6.kT(r1)
            return
        L2d:
            X.19EG r1 = r6.getActivity()
            X.0Xce r0 = r6.SR()
            X.0XaZ r0 = X.C851360XaY.LIZ(r1, r8, r0)
            if (r0 == 0) goto L3e
            X.0iIi r0 = r0.LIZ
            goto L1f
        L3e:
            r0 = r5
            goto L1f
        L40:
            X.0Xct r4 = X.C852810Xct.LIZ
            X.0I7D r2 = r6.LLLJIL
            if (r2 == 0) goto L51
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB37ynHWMzu7SKkkJHIQzqGHSo0/1h4="
            r1.<init>(r0, r5)
            android.text.Editable r5 = X.C2204961BRm.LLJILLL(r2, r1)
        L51:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r4.getClass()
            X.C852810Xct.LJIIZILJ(r6, r0)
            X.0XZ4 r5 = X.C0XZ4.LIZ
            r9 = 8
            java.lang.String r10 = "user_click"
            r11 = 0
            X.0XYz r14 = X.EnumC850750XYz.CODE
            r16 = 736(0x2e0, float:1.031E-42)
            r7 = r6
            r12 = r11
            r13 = r11
            r15 = r11
            X.11JS r2 = X.C0XZ4.LJJIII(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            Y.AfS188S0100000_19 r1 = new Y.AfS188S0100000_19
            r0 = 8
            r1.<init>(r6, r0)
            X.11JS r0 = r2.LJIIIIZZ(r1)
            r0.LJIILL()
            X.0XVn r0 = X.C849850XVn.LIZIZ
            X.0rSd r2 = r0.LIZJ()
            java.lang.String r1 = "101"
            java.lang.String r0 = "onepLoginOpti_profilePage_linkEmailBottomSheet_btn1"
            r2.LJIJI(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailBindSheetFragment.iT(java.lang.String):void");
    }

    public final void kT(boolean z) {
        if (((Boolean) this.LLLLLIL.getValue()).booleanValue()) {
            C19EG activity = getActivity();
            if (activity == null) {
                return;
            }
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            Bundle bundle = new Bundle(arguments);
            bundle.putBoolean("code_sent", z);
            bundle.putInt("current_scene", EnumC852660Xce.BIND_EMAIL.getValue());
            C1266120j3K c1266120j3K = new C1266120j3K(activity, this, 0);
            IBindService iBindService = (IBindService) PluggableExtentionKt.pluggableSpi$default(IBindService.class, false, false, false, 14, null);
            if (iBindService != null) {
                iBindService.startBindEmailCodeVerify(activity, getEnterFrom(), getEnterMethod(), bundle, c1266120j3K);
                return;
            }
            return;
        }
        this.LLLJL = true;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.putBoolean("keyboard_auto_raise", true);
        }
        InputCodeSheetFragment inputCodeSheetFragment = new InputCodeSheetFragment();
        Bundle arguments3 = getArguments();
        if (arguments3 == null) {
            arguments3 = new Bundle();
        }
        Bundle bundle2 = new Bundle(arguments3);
        bundle2.putBoolean("code_sent", z);
        bundle2.putBoolean("is_phone", false);
        bundle2.putInt("view_height", uS().getHeight());
        inputCodeSheetFragment.setArguments(bundle2);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIJI(this, inputCodeSheetFragment, false, null, 12);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        c0xgr.LIZLLL("page", RR());
        C852810Xct.LIZ.getClass();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("popup_freq")) == null) {
            string = "";
        }
        c0xgr.LIZLLL("popup_freq", string);
        c0xgr.LIZLLL("config_key", C852810Xct.LIZJ(this));
        C20684815ws.LJIILLIIL("email_binding_show", c0xgr.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ee A[PHI: r2
      0x01ee: PHI (r2v22 java.lang.String) = (r2v4 java.lang.String), (r2v25 java.lang.String) binds: [B:99:0x01e8, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0236 A[PHI: r3
      0x0236: PHI (r3v14 java.lang.String) = (r3v1 java.lang.String), (r3v17 java.lang.String) binds: [B:116:0x0230, B:21:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailBindSheetFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
