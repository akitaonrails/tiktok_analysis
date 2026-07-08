package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.C1601690rmZ;
import X.InterfaceC1581730rGN;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;

/* JADX INFO: loaded from: classes25.dex */
public final class MainPageTabA11yAssem extends BaseMainPageFragmentAssem {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC1570850qyp
    public final void t(String str, Fragment fragment, Fragment fragment2) {
        View viewYC;
        if ((fragment instanceof InterfaceC1581730rGN) && C1601690rmZ.LIZJ() && (viewYC = ((InterfaceC1581730rGN) fragment).yC()) != null) {
            viewYC.performAccessibilityAction(64, null);
        }
    }
}
