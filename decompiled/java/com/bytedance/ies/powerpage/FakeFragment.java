package com.bytedance.ies.powerpage;

import X.C1074050e3X;
import X.C19EG;
import X.C19EH;
import X.InterfaceC891260Yxo;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes17.dex */
public final class FakeFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9OCo7HELIOSLD0jKSIpZwkyIyAKOy40JSAiPQ==";
    public InterfaceC891260Yxo LL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        super.onActivityResult(i, i2, intent);
        InterfaceC891260Yxo interfaceC891260Yxo = this.LL;
        if (interfaceC891260Yxo != null) {
            ((C1074050e3X) interfaceC891260Yxo).LIZ.getOnActivityResultCallback().onActivityResult(i, i2, intent);
        }
        this.LL = null;
        C19EG activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LJIIZILJ(this);
            c19ehLJIIJ.LJIIJJI();
        }
    }
}
