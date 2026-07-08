package com.ss.android.ugc.aweme.ftc.components.toolbar;

import X.C01GW;
import X.C11A0;
import X.C1460620o72;
import X.C452501pT;
import X.InterfaceC1455030ny1;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS46S0001000_35;
import kotlin.jvm.internal.AwS47S0010000_35;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.AwS85S1000000_35;

/* JADX INFO: loaded from: classes23.dex */
public final class FTCEditToolbarViewModel extends LifecycleAwareViewModel<FTCEditToolbarState> implements InterfaceC1455030ny1 {
    public static final int LLJILLL = 8;
    public final MutableLiveData<Integer> LLILZLL = new MutableLiveData<>();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(66));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(71));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(68));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(70));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(69));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(67));
    public boolean LLJILJILJ;

    private final Map<Integer, MutableLiveData<Boolean>> mR2() {
        return (Map) this.LLJ.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> oR2() {
        return (Map) this.LLJIJIL.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> pR2() {
        return (Map) this.LLJI.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> qR2() {
        return (Map) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1455030ny1
    public void bo() {
        setState(AFwS283S0000000_35.get$arr$(44));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public FTCEditToolbarState zQ2() {
        return new FTCEditToolbarState(new C11A0(), null, null, null, null, null, null, null, null, null, null, null);
    }

    public final MutableLiveData<Boolean> kR2() {
        return (MutableLiveData) this.LLIZ.getValue();
    }

    public final MutableLiveData<Boolean> lR2() {
        return (MutableLiveData) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1455030ny1
    public boolean Dq() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1455030ny1
    public LiveData<Integer> ww() {
        return this.LLILZLL;
    }

    public final void FA1(int i) {
        setState(new AwS46S0001000_35(i, 4));
    }

    public final void Hp1(String str) {
        setState(new AwS85S1000000_35(str, 4));
    }

    public final void Kb0(String str) {
        setState(new AwS85S1000000_35(str, 5));
    }

    public final void Kj(int i) {
        setState(new AwS46S0001000_35(i, 5));
    }

    @Override // X.InterfaceC1455030ny1
    public void Ob(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void Wb2(int i) {
        setState(new AwS46S0001000_35(i, 3));
    }

    @Override // X.InterfaceC1455030ny1
    public void Ws(int i) {
        this.LLILZLL.setValue(Integer.valueOf(i));
    }

    public final LiveData<Boolean> dD2(int i) {
        return pR2().get(Integer.valueOf(i));
    }

    public final LiveData<Boolean> hB(int i) {
        return mR2().get(Integer.valueOf(i));
    }

    public final LiveData<Boolean> nR2(int i) {
        return oR2().get(Integer.valueOf(i));
    }

    public final void nf1(boolean z) {
        setState(new AwS47S0010000_35(z, 4));
    }

    public final void rR2(List<C1460620o72> list) {
        setState(new AwS614S0100000_35(list, (List<C1460620o72>) 98));
    }

    public final void rT(boolean z) {
        kR2().setValue(Boolean.valueOf(z));
    }

    public final void sR2(List<C1460620o72> list) {
        setState(new AwS614S0100000_35(list, (List<C1460620o72>) 99));
    }

    public final LiveData<Boolean> v01(int i) {
        return qR2().get(Integer.valueOf(i));
    }

    public final void zz0(boolean z) {
        setState(new AwS47S0010000_35(z, 3));
    }

    public final void Jj0(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = oR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.postValue(Boolean.valueOf(z));
        }
    }

    public final void Uh1(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = mR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1455030ny1
    public void rm(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = qR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    public final void tR2(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = pR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1455030ny1
    public void wv(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = oR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }
}
