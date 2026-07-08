package com.ss.android.ugc.aweme.profilerec.vm;

import X.C01GW;
import X.C09IR;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C452501pT;
import X.C632260Or2;
import X.C632880Os2;
import X.C632920Os6;
import X.C632940Os8;
import X.C632950Os9;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.service.profilerec.IProfileRecommendationService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ProfileRecViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(303));
    public final C01GW LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;
    public final C2252331DDr LLILZIL;
    public final MutableLiveData<C632260Or2> LLILZLL;
    public final MutableLiveData LLIZ;
    public String LLIZLLLIL;
    public final int LLJ;
    public final AtomicInteger LLJI;
    public final AtomicBoolean LLJIJIL;
    public final AtomicBoolean LLJILJIL;
    public final AtomicBoolean LLJILJILJ;

    public ProfileRecViewModel() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(304));
        this.LLILLJJLI = c01gwLIZIZ;
        this.LLILZIL = C09IR.LIZIZ(0, 0, null, 7);
        MutableLiveData<C632260Or2> mutableLiveData = new MutableLiveData<>();
        this.LLILZLL = mutableLiveData;
        this.LLIZ = mutableLiveData;
        this.LLIZLLLIL = "close";
        this.LLJ = Integer.MAX_VALUE;
        this.LLJI = new AtomicInteger(0);
        this.LLJIJIL = new AtomicBoolean(false);
        this.LLJILJIL = new AtomicBoolean(false);
        this.LLJILJILJ = new AtomicBoolean(false);
        IProfileRecommendationService iProfileRecommendationService = (IProfileRecommendationService) c01gwLIZIZ.getValue();
        C632880Os2 c632880Os2 = (iProfileRecommendationService == null || (c632880Os2 = iProfileRecommendationService.LIZJ()) == null) ? new C632880Os2() : c632880Os2;
        this.LLJ = c632880Os2.LJIIIIZZ.size() + 1;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C632950Os9(c632880Os2, true));
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = c2252321DDqLIZ;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C632920Os6(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C632940Os8(this, null), 3);
    }
}
