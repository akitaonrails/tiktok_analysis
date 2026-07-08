package com.bytedance.largetransaction;

import X.C1701250uN9;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public abstract class FixLargeTransactionFragment extends Fragment {
    public abstract boolean MR();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (MR()) {
            C1701250uN9.LIZ(C1701250uN9.LIZ, this);
        }
    }

    public final void NR(Bundle bundle) {
        if (getArguments() == null) {
            super.setArguments(bundle);
            return;
        }
        throw new IllegalStateException("setArguments is already invoked");
    }

    @Override // androidx.fragment.app.Fragment
    public final void setArguments(Bundle bundle) {
        if (!MR()) {
            super.setArguments(bundle);
            return;
        }
        if (bundle == null) {
            super.setArguments(bundle);
            return;
        }
        C1701250uN9 c1701250uN9 = C1701250uN9.LIZ;
        AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 38);
        c1701250uN9.getClass();
        C1701250uN9.LIZIZ(this, bundle, awS605S0100000_26);
    }
}
