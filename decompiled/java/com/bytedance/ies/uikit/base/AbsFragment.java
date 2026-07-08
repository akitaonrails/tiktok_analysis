package com.bytedance.ies.uikit.base;

import X.C0CBL;
import X.C0CMU;
import X.C0PO1;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AbsFragment extends Fragment implements C0PO1 {
    public long mDestroyTime;
    public boolean mStatusActive;
    public boolean mStatusDestroyed;
    public boolean mStatusViewValid;

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        com_bytedance_ies_uikit_base_AbsFragment_com_ss_android_ugc_aweme_lancet_CoreSceneLancet_onResume(this);
    }

    public void com_bytedance_ies_uikit_base_AbsFragment__onResume$___twin___() {
        super.onResume();
        this.mStatusActive = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.mDestroyTime = System.currentTimeMillis();
        super.onDestroy();
        this.mStatusViewValid = false;
        this.mStatusDestroyed = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mStatusViewValid = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mStatusActive = false;
    }

    public boolean isActive() {
        return this.mStatusActive;
    }

    public boolean isDestroyed() {
        return this.mStatusDestroyed;
    }

    @Override // X.C0PO1
    public boolean isViewValid() {
        return this.mStatusViewValid;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    public static void com_bytedance_ies_uikit_base_AbsFragment_com_ss_android_ugc_aweme_lancet_CoreSceneLancet_onResume(AbsFragment absFragment) {
        C0CMU c0cmu = C0CMU.LIZ;
        if (C0CMU.LIZIZ == C0CBL.ENTERED) {
            c0cmu.LIZ();
        }
        absFragment.com_bytedance_ies_uikit_base_AbsFragment__onResume$___twin___();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mStatusActive = false;
        this.mStatusViewValid = false;
        this.mStatusDestroyed = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mStatusViewValid = true;
    }
}
