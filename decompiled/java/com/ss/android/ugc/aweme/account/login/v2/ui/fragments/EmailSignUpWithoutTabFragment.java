package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C1236870iI9;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1748440vbG;
import X.C851910XbR;
import Y.ARunnableS116S0100000_16;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes14.dex */
public final class EmailSignUpWithoutTabFragment extends EmailSignUpFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP319HELIOSPSxiLz0yLygpJzsgZgAhKCY/GywrJxojHyw4ISAmPBEtKwkhKSIhLCEn";
    public View LLLLIL;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0x;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        c1237010iIN.LIZIZ = "";
        c1237010iIN.LJFF = true;
        c1237010iIN.LJIIIIZZ = getString(2131857326);
        c1237010iIN.LJIIJ = true;
        c1237010iIN.LJIILJJIL = true;
        c1237010iIN.LJIJ = new C1237030iIP(null, C1236870iI9.LIZ(true), C1236870iI9.LIZIZ(true), null, 9);
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLIL = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment
    public final void RS(boolean z) {
        boolean z2;
        C851910XbR c851910XbR = C851910XbR.LIZ;
        View viewFindViewById = this.LLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.gyh);
            } else {
                viewFindViewById = null;
            }
            this.LLLLIL = viewFindViewById;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1748440vbG inputBox = NS().getInputBox();
        inputBox.LJIIIZ();
        HandlerHook.viewPostDelay(inputBox, new ARunnableS116S0100000_16(inputBox, 17), 500L);
        RS(this.LLLL);
    }
}
