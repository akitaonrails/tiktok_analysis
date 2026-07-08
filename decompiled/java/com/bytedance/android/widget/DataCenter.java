package com.bytedance.android.widget;

import X.C786410Ut5;
import X.C998850c6F;
import Y.ARunnableS20S1200000_16;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class DataCenter extends ViewModel {
    public LifecycleOwner LLILLL;
    public Thread LLILZ;
    public final Map<String, Object> LL = new HashMap();
    public final Map<String, NextLiveData<C998850c6F>> LLILLJJLI = new HashMap();
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        ((HashMap) this.LL).clear();
        ((HashMap) this.LLILLJJLI).clear();
        this.LLILLL = null;
        this.LLILZIL.removeCallbacksAndMessages(null);
    }

    public final void vQ2(Object obj, String str) {
        if (this.LLILZ == null) {
            this.LLILZ = Looper.getMainLooper().getThread();
        }
        if (C786410Ut5.u3() != this.LLILZ) {
            C786410Ut5.LJJZZIII(this.LLILZIL, new ARunnableS20S1200000_16(this, obj, str, 0));
            return;
        }
        ((HashMap) this.LL).put(str, obj);
        LiveData liveData = (LiveData) ((HashMap) this.LLILLJJLI).get(str);
        if (liveData != null) {
            liveData.setValue(new C998850c6F(str, obj));
        }
    }
}
