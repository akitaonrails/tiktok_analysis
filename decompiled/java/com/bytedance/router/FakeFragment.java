package com.bytedance.router;

import X.C19EG;
import X.C19EH;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes17.dex */
public class FakeFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs+JjHELIOSonLTdiDy44LQM+KCg+LSs4";
    public OnActivityResultCallback mCallback;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mCallback = null;
    }

    public void setCallback(OnActivityResultCallback onActivityResultCallback) {
        this.mCallback = onActivityResultCallback;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        OnActivityResultCallback onActivityResultCallback = this.mCallback;
        if (onActivityResultCallback != null) {
            onActivityResultCallback.onActivityResult(i, i2, intent);
            this.mCallback = null;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C19EH c19ehLJIIJ = activity.getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(this);
            c19ehLJIIJ.LJIIJJI();
        }
    }
}
