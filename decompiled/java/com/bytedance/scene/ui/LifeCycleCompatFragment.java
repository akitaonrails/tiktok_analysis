package com.bytedance.scene.ui;

import X.C19AK;
import X.C19EH;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes33.dex */
public class LifeCycleCompatFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs/Kio9LWs5IGEfHELIOSISMpCjYwJCAPJiIjKTEKOy40JSAiPQ==";
    public C19AK LL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C19AK c19ak = this.LL;
        if (c19ak != null) {
            c19ak.LJI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C19AK c19ak = this.LL;
        if (c19ak != null) {
            c19ak.LIZIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C19AK c19ak = this.LL;
        if (c19ak != null) {
            c19ak.LIZJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C19AK c19ak = this.LL;
        if (c19ak != null) {
            c19ak.LJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C19AK c19ak = this.LL;
        if (c19ak != null) {
            c19ak.LJFF();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C19AK c19ak = this.LL;
        if (c19ak != null) {
            c19ak.LIZ(getActivity(), bundle);
            return;
        }
        C19EH c19ehLJIIJ = getFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIIZILJ(this);
        c19ehLJIIJ.LJIIJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C19AK c19ak = this.LL;
        if (c19ak != null) {
            c19ak.LIZLLL(bundle);
        }
    }
}
