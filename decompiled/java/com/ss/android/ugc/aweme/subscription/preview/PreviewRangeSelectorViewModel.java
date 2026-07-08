package com.ss.android.ugc.aweme.subscription.preview;

import X.AbstractC1159950gI5;
import X.AbstractC1160160gIQ;
import X.AbstractC19215010Fg;
import X.C10FW;
import X.C1688490u2Z;
import X.C1688500u2a;
import X.C19214410Fa;
import X.C19215210Fi;
import X.C19215310Fj;
import X.C19220210Hg;
import X.C443120HZe;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.subscription.utils.SingleLiveData;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PreviewRangeSelectorViewModel extends ViewModel {
    public final C19214410Fa LL;
    public final MutableLiveData<C19214410Fa> LLILLJJLI;
    public final LiveData<Pair<C10FW, Float>> LLILLL;
    public final LiveData<AbstractC19215010Fg> LLILZ;
    public final LiveData<Float> LLILZIL;
    public final LiveData<Float> LLILZLL;
    public final LiveData<C443120HZe<String, String, String>> LLIZ;
    public final LiveData<Float> LLIZLLLIL;
    public final LiveData<String> LLJ;
    public final LiveData<String> LLJI;
    public final LiveData<String> LLJIJIL;
    public final LiveData<AbstractC1159950gI5> LLJILJIL;
    public final LiveData<Float> LLJILJILJ;
    public final LiveData<Float> LLJILLL;
    public final SingleLiveData<Float> LLJJ;
    public final SingleLiveData LLJJI;
    public final SingleLiveData<Float> LLJJIII;
    public final SingleLiveData LLJJIJI;
    public final SingleLiveData<AbstractC1160160gIQ> LLJJIJIIJIL;
    public final SingleLiveData LLJJIJIL;

    public PreviewRangeSelectorViewModel() {
        this(0);
    }

    public final C19214410Fa vQ2() {
        C19214410Fa value = this.LLILLJJLI.getValue();
        return value == null ? this.LL : value;
    }

    public final void wQ2() {
        AbstractC19215010Fg abstractC19215010Fg = vQ2().LIZIZ;
        if (Intrinsics.LJFF(abstractC19215010Fg, C19215310Fj.LIZ) || Intrinsics.LJFF(abstractC19215010Fg, C19215210Fi.LIZ) || (abstractC19215010Fg instanceof C1688500u2a)) {
            C19214410Fa c19214410FaVQ2 = vQ2();
            c19214410FaVQ2.getClass();
            this.LLILLJJLI.postValue(C19214410Fa.LIZ(c19214410FaVQ2, null, C1688490u2Z.LIZ, 0.0f, 0.0f, 0.0f, null, 0.0f, false, 0.0f, 509));
        }
    }

    public PreviewRangeSelectorViewModel(int i) {
        C19214410Fa c19214410Fa = new C19214410Fa(0);
        this.LL = c19214410Fa;
        MutableLiveData<C19214410Fa> mutableLiveData = new MutableLiveData<>(c19214410Fa);
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(369)));
        this.LLILZ = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(370)));
        this.LLILZIL = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(366)));
        this.LLILZLL = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(372)));
        this.LLIZ = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(365)));
        this.LLIZLLLIL = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(375)));
        this.LLJ = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(368)));
        this.LLJI = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(367)));
        this.LLJIJIL = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(373)));
        this.LLJILJIL = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(374)));
        this.LLJILJILJ = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(371)));
        this.LLJILLL = Transformations.distinctUntilChanged(C19220210Hg.LIZ(mutableLiveData, AFwS271S0000000_28.get$arr$(364)));
        SingleLiveData<Float> singleLiveData = new SingleLiveData<>();
        this.LLJJ = singleLiveData;
        this.LLJJI = singleLiveData;
        SingleLiveData<Float> singleLiveData2 = new SingleLiveData<>();
        this.LLJJIII = singleLiveData2;
        this.LLJJIJI = singleLiveData2;
        SingleLiveData<AbstractC1160160gIQ> singleLiveData3 = new SingleLiveData<>();
        this.LLJJIJIIJIL = singleLiveData3;
        this.LLJJIJIL = singleLiveData3;
    }
}
