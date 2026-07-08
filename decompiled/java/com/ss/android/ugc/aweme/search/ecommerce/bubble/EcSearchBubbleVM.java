package com.ss.android.ugc.aweme.search.ecommerce.bubble;

import X.C639450P6h;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchBubbleVM extends ViewModel {
    public static final /* synthetic */ int LLILLL = 0;
    public final MutableLiveData<C639450P6h> LL = new MutableLiveData<>();
    public boolean LLILLJJLI;

    public final void vQ2(boolean z) {
        C639450P6h c639450P6h;
        C639450P6h value = this.LL.getValue();
        if (value != null && value.LIZIZ == z) {
            return;
        }
        MutableLiveData<C639450P6h> mutableLiveData = this.LL;
        C639450P6h value2 = mutableLiveData.getValue();
        if (value2 != null) {
            c639450P6h = C639450P6h.LIZ(value2, null, z, false, 29);
        } else {
            c639450P6h = new C639450P6h(null, z, false, 29);
        }
        mutableLiveData.setValue(c639450P6h);
    }
}
