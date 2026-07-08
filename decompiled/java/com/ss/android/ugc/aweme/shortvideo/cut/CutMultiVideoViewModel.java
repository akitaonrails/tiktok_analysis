package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C0WIY;
import X.C574920Mgk;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class CutMultiVideoViewModel extends ViewModel implements GenericLifecycleObserver {
    public final MutableLiveData<C0WIY<Integer, Integer>> LL = new MutableLiveData<>();
    public final HashMap<String, Integer> LLILLJJLI = new HashMap<>();
    public final MutableLiveData<Long> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Long> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Float> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<Void> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<VideoSegment> LLIZ = new MutableLiveData<>();
    public final MutableLiveData<C0WIY<Integer, Integer>> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJ = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJI = new MutableLiveData<>();
    public final MutableLiveData<C574920Mgk> LLJIJIL = new MutableLiveData<>();
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public long LLJILLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void vQ2(int i, int i2) {
        this.LLIZLLLIL.setValue(new C0WIY<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public final void wQ2(float f, long j, List list) {
        int iIntValue;
        this.LLILZ.setValue(Long.valueOf(j));
        if (this.LL.getValue() != null) {
            iIntValue = this.LL.getValue().LIZIZ.intValue();
        } else {
            iIntValue = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (!((VideoSegment) ListProtector.get(list, i)).isDeleted) {
                arrayList.add(ListProtector.get(list, i));
            }
        }
        long jLIZLLL = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jLIZLLL = (long) (jLIZLLL + ((r0.LIZLLL() - r0.LJII()) / (((VideoSegment) ListProtector.get(arrayList, i2)).LJI() * f)));
            if (jLIZLLL > j) {
                this.LL.setValue(new C0WIY<>(Integer.valueOf(iIntValue), Integer.valueOf(i2)));
                return;
            }
        }
    }
}
