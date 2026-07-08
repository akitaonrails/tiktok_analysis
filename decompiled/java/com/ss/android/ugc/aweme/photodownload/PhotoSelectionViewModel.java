package com.ss.android.ugc.aweme.photodownload;

import X.C01GW;
import X.C452501pT;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoSelectionViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(305));

    public final MutableLiveData<Set<Integer>> wQ2() {
        return (MutableLiveData) this.LL.getValue();
    }

    public final void vQ2() {
        wQ2().setValue(new HashSet());
    }

    public final void xQ2(int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(Integer.valueOf(i2));
        }
        wQ2().setValue(hashSet);
    }

    public final void yQ2(int i) {
        Set<Integer> value = wQ2().getValue();
        if (value != null) {
            if (value.contains(Integer.valueOf(i))) {
                value.remove(Integer.valueOf(i));
            } else {
                value.add(Integer.valueOf(i));
            }
        }
        wQ2().setValue(value);
    }
}
