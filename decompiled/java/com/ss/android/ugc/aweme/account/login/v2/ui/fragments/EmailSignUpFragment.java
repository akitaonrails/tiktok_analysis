package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C0I7D;
import X.C1236870iI9;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237880iJm;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851910XbR;
import X.EnumC1913590ztd;
import X.EnumC852910Xd3;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public class EmailSignUpFragment extends BaseI18nLoginFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiP319PSxiLz0yLygpJzsgZgAhKCY/GywrJxojDjctLiI2JjE=";
    public View LLLIILIL;
    public C1237880iJm LLLIL;
    public TuxTextView LLLILZ;
    public RecyclerView LLLILZJ;
    public RecyclerView LLLILZLLLI;
    public ConstraintLayout LLLIZZ;
    public View LLLJ;
    public boolean LLLJL;
    public boolean LLLL;
    public RecyclerView LLLLII;
    public C0I7D LLLLIIIILLL;
    public View LLLLIIL;
    public final long LLLJIL = System.currentTimeMillis();
    public final C01GW LLLLIILL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 71));
    public final String LLLLIILLL = "email/username";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public int sS() {
        return R.layout.a0d;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void LLIIIZ() {
        RecyclerView recyclerView = this.LLLLII;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 8);
        }
    }

    public final C1237880iJm NS() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gyz) : null;
            this.LLLIL = (C1237880iJm) viewFindViewById;
        }
        return (C1237880iJm) viewFindViewById;
    }

    public final TuxTextView PS() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gye) : null;
            this.LLLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public C1237010iIN iS() {
        return new C1237010iIN(null, null, false, null, null, true, null, false, true, new C1237030iIP(null, C1236870iI9.LIZ(true), C1236870iI9.LIZIZ(true), null, 9), false, null, null, null, null, 66549759);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void ln() {
        RecyclerView recyclerView = this.LLLLII;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final List<View> qS() {
        View viewFindViewById = this.LLLIZZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gyd) : null;
            this.LLLIZZ = (ConstraintLayout) viewFindViewById;
        }
        return Collections.singletonList(viewFindViewById);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        nS().setLoading(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        nS().setLoading(false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
        this.LLLIZZ = null;
        this.LLLJ = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        RS(this.LLLL);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLLJL = false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLIILLL;
    }

    public static void US(String str) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            EnumC1913590ztd.ACCOUNT_EMAIL_SIGNUP.getValue();
            iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
        }
    }

    public void RS(boolean z) {
        boolean z2;
        C851910XbR c851910XbR = C851910XbR.LIZ;
        View viewFindViewById = this.LLLJ;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.gyg);
            } else {
                viewFindViewById = null;
            }
            this.LLLJ = viewFindViewById;
        }
        if (((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LIZIZ() && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zWS = wS();
        String strPR = PR();
        String str = this.LLLLIILLL;
        c851910XbR.getClass();
        this.LLLF = C851910XbR.LIZ(viewFindViewById, z2, zWS, strPR, str, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7 A[PHI: r1
      0x01d7: PHI (r1v4 android.view.View) = (r1v3 android.view.View), (r1v6 android.view.View) binds: [B:53:0x01c7, B:58:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e0  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        NS().LIZIZ(str);
    }

    public final void QS(Bundle bundle, EnumC852910Xd3 enumC852910Xd3, String str) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("next_page", enumC852910Xd3.getValue());
        C786410Ut5.LJJJI("args_email", str, bundle);
        bundle.putBoolean("code_sent", true);
        bundle.putBoolean("is_need_verify_email", true);
        bundle.putBoolean("is_register", true);
        JS(bundle);
        fo(bundle);
    }
}
