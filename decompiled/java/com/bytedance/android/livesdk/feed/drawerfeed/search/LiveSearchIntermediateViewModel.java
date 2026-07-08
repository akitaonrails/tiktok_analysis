package com.bytedance.android.livesdk.feed.drawerfeed.search;

import X.AbstractC1556290qbL;
import X.C01GW;
import X.C452501pT;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.widget.NextLiveData;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveSearchIntermediateViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(73));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(72));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(74));
    public String LLILZ;

    public final NextLiveData<AbstractC1556290qbL> wQ2() {
        return (NextLiveData) this.LL.getValue();
    }

    public final void vQ2(int i, String str) {
        if (str != null && !a0.LJJJIL(str)) {
            ((LiveData) this.LLILLJJLI.getValue()).setValue(new Pair(str, Integer.valueOf(i)));
        }
    }
}
