package com.ss.android.ugc.trill.setting;

import X.C19EG;
import X.C19EH;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC836760Ws6
public final class PreferredLanguageSettingPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZjYpPTs6JiHELIOSJiGT02LiA+Oyo3BCQiLjoyLyAfLDsnISsrGS40LQ==";
    public PreferredLanguageSettingFragment LLJ;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f7c;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentManager supportFragmentManager;
        PreferredLanguageSettingFragment preferredLanguageSettingFragment;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("preferred_language_fragment");
            if (!(fragmentLJJJJZI instanceof PreferredLanguageSettingFragment) || (preferredLanguageSettingFragment = (PreferredLanguageSettingFragment) fragmentLJJJJZI) == null) {
                preferredLanguageSettingFragment = new PreferredLanguageSettingFragment();
            }
            this.LLJ = preferredLanguageSettingFragment;
            preferredLanguageSettingFragment.setArguments(getArguments());
            PreferredLanguageSettingFragment preferredLanguageSettingFragment2 = this.LLJ;
            if (preferredLanguageSettingFragment2 == null) {
                preferredLanguageSettingFragment2 = null;
            }
            if (!preferredLanguageSettingFragment2.isAdded()) {
                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                PreferredLanguageSettingFragment preferredLanguageSettingFragment3 = this.LLJ;
                if (preferredLanguageSettingFragment3 == null) {
                    preferredLanguageSettingFragment3 = null;
                }
                c19ehLJIIJ.LIZJ(R.id.iiv, preferredLanguageSettingFragment3, "preferred_language_fragment");
                c19ehLJIIJ.LJII(null);
                c19ehLJIIJ.LJIIJ();
            }
        }
    }
}
