package com.ss.android.ugc.aweme.favorites.profile;

import X.AbstractC1259000irq;
import X.AbstractC1259210isB;
import X.C1206700hVU;
import X.C1258820irY;
import X.C1260360iu2;
import X.EnumC1258840ira;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FavoriteInvalidVideosSharedVM extends ViewModel {
    public static final /* synthetic */ int LLJJIII = 0;
    public final MutableLiveData<C1206700hVU<C1260360iu2>> LL;
    public final MutableLiveData LLILLJJLI;
    public final MutableLiveData<Integer> LLILLL;
    public final MutableLiveData LLILZ;
    public final MutableLiveData<C1206700hVU<Unit>> LLILZIL;
    public final MutableLiveData LLILZLL;
    public final MutableLiveData<Boolean> LLIZ;
    public final MutableLiveData LLIZLLLIL;
    public final MutableLiveData<Boolean> LLJ;
    public final MutableLiveData LLJI;
    public final MutableLiveData<C1258820irY> LLJIJIL;
    public final MutableLiveData LLJILJIL;
    public final MutableLiveData<C1206700hVU<AbstractC1259000irq>> LLJILJILJ;
    public final MutableLiveData LLJILLL;
    public final MutableLiveData<C1206700hVU<AbstractC1259210isB>> LLJJ;
    public final MutableLiveData LLJJI;

    public FavoriteInvalidVideosSharedVM() {
        MutableLiveData<C1206700hVU<C1260360iu2>> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.LLILLL = mutableLiveData2;
        this.LLILZ = mutableLiveData2;
        MutableLiveData<C1206700hVU<Unit>> mutableLiveData3 = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData3;
        this.LLILZLL = mutableLiveData3;
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>(bool);
        this.LLIZ = mutableLiveData4;
        this.LLIZLLLIL = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>(bool);
        this.LLJ = mutableLiveData5;
        this.LLJI = mutableLiveData5;
        MutableLiveData<C1258820irY> mutableLiveData6 = new MutableLiveData<>(new C1258820irY(EnumC1258840ira.DEFAULT, null, null, null));
        this.LLJIJIL = mutableLiveData6;
        this.LLJILJIL = mutableLiveData6;
        MutableLiveData<C1206700hVU<AbstractC1259000irq>> mutableLiveData7 = new MutableLiveData<>();
        this.LLJILJILJ = mutableLiveData7;
        this.LLJILLL = mutableLiveData7;
        MutableLiveData<C1206700hVU<AbstractC1259210isB>> mutableLiveData8 = new MutableLiveData<>();
        this.LLJJ = mutableLiveData8;
        this.LLJJI = mutableLiveData8;
    }

    public final void vQ2(boolean z) {
        if (!Intrinsics.LJFF(this.LLJ.getValue(), Boolean.valueOf(z))) {
            this.LLJ.setValue(Boolean.valueOf(z));
        }
    }
}
