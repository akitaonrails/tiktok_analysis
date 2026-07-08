package com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel;

import X.AbstractC1642960sr8;
import X.C01GW;
import X.C1642970sr9;
import X.C1643080srK;
import X.C1643270srd;
import X.C1643280sre;
import X.C1643300srg;
import X.C1643340srk;
import X.C19EG;
import X.C21360518iZ;
import X.C23250099c;
import X.C452501pT;
import Y.AObserverS227S0100000_25;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class OptionCategoryPanelViewModel extends ViewModel {
    public final Effect LL;
    public final Effect LLILLJJLI;
    public final String LLILLL;
    public final C19EG LLILZ;
    public final C1643270srd LLILZIL;
    public final MutableLiveData<List<C1643080srK>> LLILZLL;
    public final MutableLiveData<Pair<Map<C1643340srk, List<C1643080srK>>, C1643300srg>> LLIZ;
    public final MediatorLiveData<AbstractC1642960sr8> LLIZLLLIL;
    public final MediatorLiveData LLJ;
    public final C01GW LLJI;

    public final void wQ2() {
        AbstractC1642960sr8 value = this.LLIZLLLIL.getValue();
        C1642970sr9 c1642970sr9 = C1642970sr9.LIZ;
        if (Intrinsics.LJFF(value, c1642970sr9)) {
            return;
        }
        this.LLIZLLLIL.setValue(c1642970sr9);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1643280sre(this, null), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C21360518iZ c21360518iZ = (C21360518iZ) this.LLJI.getValue();
        if (c21360518iZ != null) {
            c21360518iZ.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0219 A[PHI: r4
      0x0219: PHI (r4v6 java.util.ArrayList) = (r4v5 java.util.ArrayList), (r4v7 java.util.ArrayList), (r4v8 java.util.ArrayList) binds: [B:108:0x0215, B:61:0x0141, B:42:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1642960sr8 vQ2(androidx.lifecycle.MutableLiveData r13, androidx.lifecycle.MutableLiveData r14) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelViewModel.vQ2(androidx.lifecycle.MutableLiveData, androidx.lifecycle.MutableLiveData):X.0sr8");
    }

    public OptionCategoryPanelViewModel(Effect effect, Effect effect2, String str, C19EG c19eg, C1643270srd c1643270srd) {
        this.LL = effect;
        this.LLILLJJLI = effect2;
        this.LLILLL = str;
        this.LLILZ = c19eg;
        this.LLILZIL = c1643270srd;
        MutableLiveData<List<C1643080srK>> mutableLiveData = new MutableLiveData<>();
        this.LLILZLL = mutableLiveData;
        MutableLiveData<Pair<Map<C1643340srk, List<C1643080srK>>, C1643300srg>> mutableLiveData2 = new MutableLiveData<>();
        this.LLIZ = mutableLiveData2;
        MediatorLiveData<AbstractC1642960sr8> mediatorLiveData = new MediatorLiveData<>();
        this.LLIZLLLIL = mediatorLiveData;
        this.LLJ = mediatorLiveData;
        this.LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 643));
        mediatorLiveData.addSource(mutableLiveData, new AObserverS227S0100000_25(this, 70));
        mediatorLiveData.addSource(mutableLiveData2, new AObserverS227S0100000_25(this, 71));
        wQ2();
    }
}
