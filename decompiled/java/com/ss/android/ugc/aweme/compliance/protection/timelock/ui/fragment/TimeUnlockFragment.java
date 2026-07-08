package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment;

import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C0XQ7;
import X.C15XM;
import X.C15YE;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C204683157h;
import X.C786410Ut5;
import Y.ACListenerS165S0100000_31;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public class TimeUnlockFragment extends AbsTimeLockFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODcjPSowPCHELIOSwjJ2EnISgpJSAwI2s5IGE1OiQrJCo9PGsYICI2HSsgJiw4DjctLiI2JjE=";
    public TextView LLILLL;
    public TuxTextView LLILZ;
    public String LLILZIL;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.AbsTimeLockFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = X.C297270Bkz.LIZ()
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2 r0 = com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2.LIZ
        L8:
            X.15Xy r1 = r0.LIZIZ()
            X.15Xy r0 = X.EnumC20537615Xy.CHILD
            if (r1 != r0) goto L8d
            int r0 = r7.length()
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r5 = r0.getCurUserId()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L66
            goto L2a
        L27:
            com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager r0 = com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager.LIZ
            goto L8
        L2a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L62
            r1.append(r5)     // Catch: java.lang.Exception -> L62
            r0 = 58
            r1.append(r0)     // Catch: java.lang.Exception -> L62
            r1.append(r7)     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L62
            java.lang.String r4 = X.C08HM.LIZJ(r0)     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = "HmacSHA256"
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L62
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L62
            byte[] r0 = r5.getBytes(r2)     // Catch: java.lang.Exception -> L62
            r3.<init>(r0, r1)     // Catch: java.lang.Exception -> L62
            javax.crypto.Mac r1 = javax.crypto.Mac.getInstance(r1)     // Catch: java.lang.Exception -> L62
            r1.init(r3)     // Catch: java.lang.Exception -> L62
            byte[] r0 = r4.getBytes(r2)     // Catch: java.lang.Exception -> L62
            byte[] r0 = r1.doFinal(r0)     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = X.C08HM.LJ(r0)     // Catch: java.lang.Exception -> L62
            goto L68
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L66:
            java.lang.String r0 = ""
        L68:
            X.11Kf r1 = X.C15YQ.LIZIZ(r0)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r3 = r1.LJJJLZIJ(r0)
            Y.AfS200S0100000_31 r2 = new Y.AfS200S0100000_31
            r0 = 20
            r2.<init>(r6, r0)
            Y.AfS188S0100000_19 r1 = new Y.AfS188S0100000_19
            r0 = 63
            r1.<init>(r6, r0)
            r3.LJJLL(r2, r1)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.TimeUnlockFragment.MR(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.AbsTimeLockFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        int i;
        int i2;
        this.LLILLL = (TextView) view.findViewById(R.id.txt_desc);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.txt_title);
        super.onViewCreated(view, bundle);
        C204683157h<Boolean> c204683157hLIZ = C15XM.LIZ();
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("from");
        } else {
            string = "";
        }
        this.LLILZIL = string;
        if (c204683157hLIZ != null) {
            C15YE.LIZ.getClass();
            boolean zLJIIJ = C15YE.LJIIJ();
            TextView textView = this.LLILLL;
            if (zLJIIJ) {
                if (TextUtils.equals(this.LLILZIL, "add_account")) {
                    i = 2131825107;
                } else if (TextUtils.equals(this.LLILZIL, "switch_account")) {
                    i = 2131849417;
                } else if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    i = 2131847658;
                } else {
                    i = 2131850431;
                }
            } else {
                i = 2131850432;
            }
            textView.setText(getString(i));
            TuxTextView tuxTextView = this.LLILZ;
            if (zLJIIJ) {
                i2 = 2131850435;
            } else {
                i2 = 2131850436;
            }
            tuxTextView.setText(getString(i2));
            this.LLILZ.LJJJJI(26.0f);
            ImageView imageView = (ImageView) view.findViewById(R.id.xwq);
            C786410Ut5.LJZI(0, imageView);
            C786410Ut5.Q7(imageView, new ACListenerS165S0100000_31(this, 63));
            return;
        }
        C15YE.LIZ.getClass();
        this.LLILLL.setText(getString(2131850433, String.valueOf(C15YE.LJFF())));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bcu, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
