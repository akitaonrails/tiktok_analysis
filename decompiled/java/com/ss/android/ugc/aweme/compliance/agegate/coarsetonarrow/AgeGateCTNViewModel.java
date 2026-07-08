package com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow;

import X.C1A4O;
import X.C786410Ut5;
import Y.ARunnableS28S0101000_17;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Date;

/* JADX INFO: loaded from: classes18.dex */
public final class AgeGateCTNViewModel extends ViewModel {
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final MutableLiveData<String> LL = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Date> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZ = new MutableLiveData<>(Boolean.FALSE);
    public int LLILZIL = -1;
    public int LLILZLL = -1;
    public int LLIZ = -1;
    public C1A4O LLJILJILJ = C1A4O.RANGE1;
    public final BPEAHandler LLJILLL = new BPEAHandler(Looper.getMainLooper());

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJILLL.removeCallbacksAndMessages(null);
    }

    public final void vQ2(int i) {
        C786410Ut5.LJLIIL(300L, this.LLJILLL, new ARunnableS28S0101000_17(i, this, 6));
    }
}
