package com.ss.android.ugc.trill.setting;

import X.InterfaceC836760Ws6;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC836760Ws6
public final class DisplaySettingPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZjHELIOSYpPTs6JiJiDSYgOCktMBw2PDElJygDKSIp";
    public ViewGroup LLJ;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f68;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r0 = 2131388996(0x7f0a6a44, float:1.8398523E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7.LLJ = r0
            super.onViewCreated(r8, r9)
            android.view.ViewGroup r2 = r7.LLJ
            if (r2 == 0) goto L20
            android.content.Context r1 = r2.getContext()
            r0 = 2131230728(0x7f080008, float:1.8077517E38)
            int r0 = X.C446980Hfs.LIZ(r1, r0)
            r2.setBackgroundColor(r0)
        L20:
            X.19EG r0 = r7.getActivity()
            r6 = 0
            if (r0 == 0) goto L36
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L3c
            java.lang.String r0 = "enter_from"
            java.lang.String r5 = r1.getStringExtra(r0)     // Catch: java.lang.Exception -> L38
            if (r5 != 0) goto L40
            goto L3c
        L36:
            r1 = r6
            goto L3c
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3c:
            java.lang.String r5 = "other"
            if (r1 == 0) goto L4b
        L40:
            java.lang.String r0 = "enter_method"
            java.lang.String r4 = r1.getStringExtra(r0)     // Catch: java.lang.Exception -> L47
            goto L4c
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4b:
            r4 = r6
        L4c:
            X.19EG r0 = r7.getActivity()
            if (r0 == 0) goto L85
            androidx.fragment.app.FragmentManager r1 = r0.getSupportFragmentManager()
            if (r1 == 0) goto L85
            java.lang.String r3 = "language_app_fragment"
            androidx.fragment.app.Fragment r2 = r1.LJJJJZI(r3)
            boolean r0 = r2 instanceof com.ss.android.ugc.trill.language.view.AppLanguageListFragment
            if (r0 == 0) goto L66
            com.ss.android.ugc.trill.language.view.AppLanguageListFragment r2 = (com.ss.android.ugc.trill.language.view.AppLanguageListFragment) r2
            if (r2 != 0) goto L6b
        L66:
            com.ss.android.ugc.trill.language.view.AppLanguageListFragment r2 = new com.ss.android.ugc.trill.language.view.AppLanguageListFragment
            r2.<init>()
        L6b:
            r2.LLJILLL = r5
            r2.LLJJ = r4
            boolean r0 = r2.isAdded()
            if (r0 != 0) goto L85
            X.19EH r1 = r1.LJIIJ()
            r0 = 2131373640(0x7f0a2e48, float:1.8367377E38)
            r1.LIZJ(r0, r2, r3)
            r1.LJII(r6)
            r1.LJIIJ()
        L85:
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r7)
            java.lang.Class<com.ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel> r0 = com.ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel.class
            r1.get(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.setting.DisplaySettingPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
