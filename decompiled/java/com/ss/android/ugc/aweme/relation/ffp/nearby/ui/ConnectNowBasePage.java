package com.ss.android.ugc.aweme.relation.ffp.nearby.ui;

import X.C1687630u1B;
import X.C19EG;
import X.C827203La;
import androidx.fragment.app.FragmentManager;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: loaded from: classes26.dex */
public abstract class ConnectNowBasePage extends UiComposableAssem<C1687630u1B> {
    public final void Jo() {
        C19EG c19egLIZ = C827203La.LIZ(getContext());
        FragmentManager supportFragmentManager = c19egLIZ.getSupportFragmentManager();
        if (supportFragmentManager.LJJLIIIIJ() == 0) {
            c19egLIZ.finish();
        } else {
            supportFragmentManager.LJLLILLLL();
        }
        ConnectNowFragment.LLJJJ.getClass();
        ConnectNowFragment.LLJJJJ = false;
    }
}
