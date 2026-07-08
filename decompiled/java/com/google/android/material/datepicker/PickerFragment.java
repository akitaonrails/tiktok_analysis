package com.google.android.material.datepicker;

import X.AbstractC21562119Zz;
import X.C21561819Zw;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes34.dex */
public abstract class PickerFragment<S> extends Fragment {
    public final LinkedHashSet<AbstractC21562119Zz<S>> LL = new LinkedHashSet<>();

    public boolean MR(C21561819Zw c21561819Zw) {
        return this.LL.add(c21561819Zw);
    }
}
