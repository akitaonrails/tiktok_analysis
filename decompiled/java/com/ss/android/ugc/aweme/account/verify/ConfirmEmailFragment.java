package com.ss.android.ugc.aweme.account.verify;

import X.AbstractC19483511Kn;
import X.C0DYO;
import X.C0I7D;
import X.C1237220iIi;
import X.C1748440vbG;
import X.C784500Uq0;
import X.C786410Ut5;
import X.C851360XaY;
import X.C851370XaZ;
import X.C851430Xaf;
import X.C852810Xct;
import X.C854820Xg8;
import X.C960203pA;
import X.EnumC852910Xd3;
import Y.ACListenerS148S0100000_13;
import Y.AfS46S1100000_13;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes14.dex */
public final class ConfirmEmailFragment extends CommonInputEmailFragment {
    public static final C854820Xg8 LLLLJ = C854820Xg8.get$arr$(0);
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmHELIOSJjFiPyohISM1Zww8JiMlOyIWJSQlJQkhKSIhLCEn";
    public TuxTextView LLLLIL;
    public TuxTextView LLLLILI;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1237010iIN iS() {
        /*
            r29 = this;
            X.0iIN r7 = new X.0iIN
            r8 = 0
            r6 = 0
            r10 = 0
            r2 = 0
            r24 = 0
            r1 = r7
            r23 = 67108863(0x3ffffff, float:1.5046327E-36)
            r9 = r8
            r11 = r8
            r12 = r8
            r13 = r10
            r14 = r8
            r15 = r10
            r16 = r10
            r17 = r8
            r18 = r10
            r19 = r8
            r20 = r8
            r21 = r8
            r22 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = 2131847695(0x7f116a0f, float:1.9328875E38)
            r5 = r29
            java.lang.String r0 = r5.getString(r0)
            r1.LJIIIIZZ = r0
            android.os.Bundle r3 = r5.getArguments()
            if (r3 == 0) goto L99
            java.lang.String r0 = "purpose"
            java.lang.String r3 = r3.getString(r0)
        L3a:
            java.lang.String r0 = "security"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            r4 = 1
            if (r0 != 0) goto L91
            android.os.Bundle r3 = r5.getArguments()
            if (r3 == 0) goto L4f
            java.lang.String r0 = "page"
            java.lang.String r6 = r3.getString(r0)
        L4f:
            java.lang.String r0 = "twosv_setup"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 != 0) goto L91
            r0 = 2131847785(0x7f116a69, float:1.9329057E38)
            java.lang.String r0 = r5.getString(r0)
        L5f:
            r1.LJIIIZ = r0
            boolean r0 = r5.jT()
            if (r0 == 0) goto L8e
            r0 = 2131857337(0x7f118fb9, float:1.934843E38)
            java.lang.String r0 = r5.getString(r0)
        L6e:
            r1.LIZ = r0
            r1.LJIIL = r2
            r1.LJIIJ = r4
            boolean r0 = r5.jT()
            if (r0 == 0) goto L7c
            r1.LJI = r4
        L7c:
            X.0iIP r0 = new X.0iIP
            r28 = 15
            r25 = r24
            r26 = r24
            r27 = r24
            r23 = r0
            r23.<init>(r24, r25, r26, r27, r28)
            r1.LJIJ = r0
            return r1
        L8e:
            java.lang.String r0 = " "
            goto L6e
        L91:
            r0 = 2131857325(0x7f118fad, float:1.9348407E38)
            java.lang.String r0 = r5.getString(r0)
            goto L5f
        L99:
            r3 = r6
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.verify.ConfirmEmailFragment.iS():X.0iIN");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLIL = null;
        this.LLLLILI = null;
    }

    public final boolean jT() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getInt("progress", -1) >= 0;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        if (!jT()) {
            super.onBackPressed();
            return false;
        }
        if (C784500Uq0.LIZJ(getActivity())) {
            return true;
        }
        super.onBackPressed();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void iT(String str) {
        C1237220iIi c1237220iIi;
        C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(getActivity(), str, SR());
        if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIIZILJ(this, str);
            C852810Xct.LJIILJJIL(this, false);
            Bundle arguments = getArguments();
            arguments.putInt("next_page", EnumC852910Xd3.EMAIL_SMS_VERIFY.getValue());
            fo(arguments);
            return;
        }
        ((AbstractC19483511Kn) LLLLJ.invoke(this, this, str, "user_click")).LJIIIIZZ(new AfS46S1100000_13(this, str, 11)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        C1748440vbG c1748440vbG = this.LLLLII;
        if (c1748440vbG != null) {
            c1748440vbG.LJIILLIIL(false);
        }
        C0I7D c0i7d = this.LLLJIL;
        if (c0i7d != null) {
            c0i7d.setEnabled(false);
            c0i7d.setTextColor(C960203pA.LIZ(R.attr.a1p, c0i7d.getContext()));
        }
        View viewFindViewById = this.LLLLIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.dnx);
            } else {
                viewFindViewById = null;
            }
            this.LLLLIL = (TuxTextView) viewFindViewById;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("use_phone")) {
            View viewFindViewById3 = this.LLLLILI;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.dny);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLLLILI = (TuxTextView) viewFindViewById3;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
            View view4 = this.LLLLILI;
            if (view4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById2 = view5.findViewById(R.id.dny);
                }
                this.LLLLILI = (TuxTextView) viewFindViewById2;
                view4 = viewFindViewById2;
            }
            TuxTextView tuxTextView = (TuxTextView) view4;
            View.OnClickListener aCListenerS148S0100000_13 = new ACListenerS148S0100000_13(this, 45);
            tuxTextView.setText(getString(2131823023));
            tuxTextView.setTextColorRes(R.attr.a1n);
            C0DYO.LIZ(tuxTextView);
            GS(aCListenerS148S0100000_13, tuxTextView);
        }
        String enterFrom = getEnterFrom();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("page")) == null) {
            string = "";
        }
        String enterMethod = getEnterMethod();
        C852810Xct.LIZ.getClass();
        C851430Xaf.LIZLLL(enterFrom, string, enterMethod, C852810Xct.LIZ(this), C852810Xct.LIZJ(this));
    }
}
