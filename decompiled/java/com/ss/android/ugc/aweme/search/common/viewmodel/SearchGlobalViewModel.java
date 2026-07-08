package com.ss.android.ugc.aweme.search.common.viewmodel;

import X.C2097608Jq;
import X.C648540PcC;
import X.InterfaceC1294060jmO;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class SearchGlobalViewModel extends ViewModel {
    public final NextLiveData LL;
    public final NextLiveData LLILLJJLI;
    public final NextLiveData LLILLL;
    public final NextLiveData LLILZ;
    public final NextLiveData LLILZIL;
    public final NextLiveData LLILZLL;

    public SearchGlobalViewModel() {
        NextLiveData nextLiveData = new NextLiveData();
        this.LL = nextLiveData;
        this.LLILLJJLI = nextLiveData;
        NextLiveData nextLiveData2 = new NextLiveData();
        this.LLILLL = nextLiveData2;
        this.LLILZ = nextLiveData2;
        NextLiveData nextLiveData3 = new NextLiveData();
        this.LLILZIL = nextLiveData3;
        this.LLILZLL = nextLiveData3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vQ2(int i, String str) {
        Map<String, Integer> map;
        C648540PcC c648540PcC = (C648540PcC) this.LL.getValue();
        if (c648540PcC != null && (map = c648540PcC.LIZIZ) != null) {
            map.put(str, Integer.valueOf(i));
            this.LL.postValue(new C648540PcC(str, map));
        } else {
            this.LL.postValue(new C648540PcC(str, C2097608Jq.LJIIJ(new Pair(str, Integer.valueOf(i)))));
        }
    }
}
