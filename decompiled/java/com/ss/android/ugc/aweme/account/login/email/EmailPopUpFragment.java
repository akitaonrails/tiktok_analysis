package com.ss.android.ugc.aweme.account.login.email;

import X.AbstractC19483511Kn;
import X.C0HZQ;
import X.C0I7D;
import X.C0OM1;
import X.C0XGR;
import X.C0XZ4;
import X.C123100dR;
import X.C1237010iIN;
import X.C1238070iK5;
import X.C1239130iLn;
import X.C1239250iLz;
import X.C1239720iMk;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1390920mIc;
import X.C18167079p;
import X.C19EG;
import X.C20656615sK;
import X.C20684815ws;
import X.C2093608Ic;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C497820Jfg;
import X.C786120Usc;
import X.C786410Ut5;
import X.C814420VxA;
import X.C816470W1d;
import X.C850040XWg;
import X.C851430Xaf;
import X.C854360XfO;
import X.C960203pA;
import X.DialogInterfaceOnDismissListenerC1265960j34;
import X.EnumC1237810iJf;
import Y.ACListenerS154S0100000_19;
import Y.AfS181S0100000_12;
import Y.AfS46S1100000_13;
import Y.AfS59S0110000_19;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EmailPopUpFragment extends CommonInputEmailFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiJSA0IStiLCIyISliDCIyISkcJj8GOAM+KCg+LSs4";
    public C1239720iMk LLLLIL;
    public C0HZQ LLLLILI;
    public TuxTextView LLLLJ;
    public final int LLLLJI;
    public final C19EG LLLLL;
    public final boolean LLLLLIL;
    public final boolean LLLLLILLIL;
    public final C20656615sK LLLLLJIL;
    public final String LLLLLJLJLL = "start_text";
    public final String LLLLLL = "is_not_external";
    public final String LLLLLLIL = "click_add_email_page";
    public TuxSheet LLLLLLJ;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void LLIIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void ln() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0_;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, X.InterfaceC852200Xbu
    public final String LJJLIIIJJI() {
        C1238070iK5 c1238070iK5 = C1238070iK5.LIZ;
        Integer numValueOf = Integer.valueOf(this.LLLLJI);
        c1238070iK5.getClass();
        return C1238070iK5.LIZIZ(numValueOf);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void eT() {
        RecyclerView recyclerView = this.LLLLIILL;
        if (recyclerView != null) {
            C426750GoL.LJIIIZ(recyclerView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, false, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004e A[PHI: r1
      0x004e: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v3 java.lang.String) binds: [B:13:0x0072, B:8:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1237010iIN iS() {
        /*
            r20 = this;
            X.0iIN r3 = new X.0iIN
            r4 = 0
            r6 = 0
            r3 = r3
            r19 = 67108863(0x3ffffff, float:1.5046327E-36)
            r5 = r4
            r7 = r4
            r8 = r4
            r9 = r6
            r10 = r4
            r11 = r6
            r12 = r6
            r13 = r4
            r14 = r6
            r15 = r4
            r16 = r4
            r17 = r4
            r18 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$PassportEmailPopupSettingsModel r0 = com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting.LIZ()
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$AddEmailPopupStrings r0 = r0.addEmailPopupStrings
            java.lang.String r2 = r0.actionSheetTitle
            r0 = 2131830642(0x7f112772, float:1.9294287E38)
            r4 = r20
            java.lang.String r1 = r4.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L33
            r2 = r1
        L33:
            r3.LJIIIIZZ = r2
            boolean r0 = r4.LLLLLIL
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$PassportEmailPopupSettingsModel r0 = com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting.LIZ()
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$AddEmailPopupStrings r0 = r0.addEmailPopupStrings
            java.lang.String r2 = r0.twoStepActionSheetBody
            r0 = 2131830640(0x7f112770, float:1.9294283E38)
            java.lang.String r1 = r4.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L4f
        L4e:
            r2 = r1
        L4f:
            r3.LJIIIZ = r2
            r0 = 1
            r3.LJIIJ = r0
            r3.LJIIL = r0
            java.lang.String r0 = " "
            r3.LIZ = r0
            java.lang.String r0 = "bind_email_without_verify"
            r3.LJIIJJI = r0
            return r3
        L5f:
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$PassportEmailPopupSettingsModel r0 = com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting.LIZ()
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$AddEmailPopupStrings r0 = r0.addEmailPopupStrings
            java.lang.String r2 = r0.oneStepActionSheetBody
            r0 = 2131847785(0x7f116a69, float:1.9329057E38)
            java.lang.String r1 = r4.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L4f
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment.iS():X.0iIN");
    }

    public final C0HZQ jT() {
        View viewFindViewById = this.LLLLILI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gyi) : null;
            this.LLLLILI = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final TuxTextView kT() {
        View viewFindViewById = this.LLLLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gyt) : null;
            this.LLLLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final void show() {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = this;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(1);
        int iLIZ = (int) (((double) C497820Jfg.LIZ(this.LLLLL)) * ((C18167079p.LIZ() == 5 && this.LLLLLILLIL) ? 0.88d : 0.82d));
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLIZ;
        tuxSheet2.LLILLJJLI = new DialogInterfaceOnDismissListenerC1265960j34(this, 0);
        tuxSheet2.LLJLL = true;
        tuxSheet2.LLJLILLLLZIIL = false;
        this.LLLLLLJ = tuxSheet2;
        tuxSheet2.show(this.LLLLL.getSupportFragmentManager(), "BindUserEmail");
        C1238070iK5 c1238070iK5 = C1238070iK5.LIZ;
        Integer numValueOf = Integer.valueOf(this.LLLLJI);
        Boolean boolValueOf = Boolean.valueOf(this.LLLLLIL);
        c1238070iK5.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", C1238070iK5.LIZIZ(numValueOf));
        c0xgr.LIZLLL("enter_method", C1238070iK5.LIZ(boolValueOf));
        c0xgr.LIZ(C854360XfO.LIZIZ(numValueOf), "show_index");
        c0xgr.LIZLLL("bind_type", "email");
        C20684815ws.LJIILLIIL("add_email_page_show", c0xgr.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void bS() {
        if (gS().getVisibility() == 8) {
            return;
        }
        C1237010iIN c1237010iINIS = iS();
        C0OM1 c0om1 = new C0OM1();
        String str = c1237010iINIS.LIZ;
        if (str != null && C123100dR.LIZ(str)) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = str;
            c0om1.LIZJ = c1250250idj;
        }
        c0om1.LIZLLL = false;
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 73));
        c0om1.LIZIZ(c1251150ifB);
        gS().setNavActions(c0om1);
        View viewLJII = gS().LJII(this.LLLLLJLJLL);
        if (viewLJII != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            layoutParams.gravity = 16;
            C786410Ut5.W5(viewLJII, layoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLIL = null;
        this.LLLLILI = null;
        this.LLLLJ = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, X.InterfaceC852200Xbu
    public final String LLIIJI() {
        return this.LLLLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void iT(String str) {
        EnumC1237810iJf enumC1237810iJf;
        int i = this.LLLLJI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    enumC1237810iJf = EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_UNKNOWN;
                } else {
                    enumC1237810iJf = EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_PROFILE;
                }
            } else {
                enumC1237810iJf = EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_INBOX;
            }
        } else {
            enumC1237810iJf = EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_FEED;
        }
        boolean zIsChecked = jT().isChecked();
        C0XZ4.LIZ.getClass();
        C851430Xaf.LJFF(LJJLIIIJJI(), "email", Qm(), this.LLLLLLIL, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("email", C2093608Ic.LIZIZ(str));
        linkedHashMap.put("email_source", String.valueOf(enumC1237810iJf.getValue()));
        linkedHashMap.put("mix_mode", "1");
        C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new C850040XWg(this, "/passport/email/bind_without_verify/", linkedHashMap)).LJIIIIZZ(new AfS46S1100000_13(this, 2)).LJII(new AfS46S1100000_13(this, 3))).LJIIIIZZ(new AfS59S0110000_19(this, zIsChecked, 0)).LJII(new AfS181S0100000_12(this, 117)).LJIILL();
        C1238070iK5 c1238070iK5 = C1238070iK5.LIZ;
        Integer numValueOf = Integer.valueOf(this.LLLLJI);
        Boolean boolValueOf = Boolean.valueOf(this.LLLLLIL);
        c1238070iK5.getClass();
        C1238070iK5.LIZJ(boolValueOf, numValueOf, "add");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLLLIL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.kpr);
            } else {
                viewFindViewById = null;
            }
            this.LLLLIL = (C1239720iMk) viewFindViewById;
        }
        ((C1239720iMk) viewFindViewById).setButtonText(getString(2131830637));
        C0I7D c0i7d = this.LLLJIL;
        if (c0i7d != null) {
            if (TextUtils.isEmpty(EmailPopUpSetting.LIZ().addEmailPopupStrings.actionSheetPlaceHolder)) {
                string = getString(2131830641);
            } else {
                string = EmailPopUpSetting.LIZ().addEmailPopupStrings.actionSheetPlaceHolder;
            }
            c0i7d.setHint(string);
        }
        C0I7D c0i7d2 = this.LLLJIL;
        if (c0i7d2 != null) {
            c0i7d2.setHintTextColor(C960203pA.LIZ(R.attr.a1p, view.getContext()));
        }
        C0I7D c0i7d3 = this.LLLJIL;
        if (c0i7d3 != null) {
            c0i7d3.addTextChangedListener(new C786120Usc(this, 12));
        }
        if (C18167079p.LIZ() == 5 && this.LLLLLILLIL) {
            C786410Ut5.LLLLLZ(jT(), 0);
            C786410Ut5.b9(jT(), new ACListenerS154S0100000_19(this, 206));
            C786410Ut5.LLLLZLL(kT(), 0);
            kT().setText(ComplianceServiceProvider.LJIJ().LIZ("profile_page"));
            C0HZQ c0hzqJT = jT();
            C1239130iLn.LIZ.getClass();
            c0hzqJT.setChecked(C1239130iLn.LIZ());
        } else {
            C786410Ut5.LLLLLZ(jT(), 8);
            C786410Ut5.LLLLZLL(kT(), 8);
        }
        C0I7D c0i7d4 = this.LLLJIL;
        if ((c0i7d4 instanceof C0I7D) && c0i7d4 != null) {
            c0i7d4.setTuxFont(41);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void ZS(RecyclerView recyclerView, EditText editText, String str) {
        C816470W1d.LIZ(recyclerView, editText, str, this.LLLLLLIL);
    }

    public EmailPopUpFragment(C19EG c19eg, int i, boolean z, boolean z2, C20656615sK c20656615sK) {
        this.LLLLJI = i;
        this.LLLLL = c19eg;
        this.LLLLLIL = z2;
        this.LLLLLILLIL = z;
        this.LLLLLJIL = c20656615sK;
    }
}
