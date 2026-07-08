package com.ss.android.ugc.aweme.ftc.components.audiorecord;

import X.C194561119z;
import X.C560530Lyd;
import X.InterfaceC1455040ny2;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditAudioRecordViewModel extends LifecycleAwareViewModel<FTCEditAudioRecordState> implements InterfaceC1455040ny2 {
    public static final int LLJ = 8;
    public final MutableLiveData<Boolean> LLILZLL = new MutableLiveData<>();
    public final C560530Lyd<Pair<Float, Float>> LLIZ;
    public final LiveEvent<Pair<Float, Float>> LLIZLLLIL;

    @Override // X.InterfaceC1455040ny2
    public void LLJJJJ() {
        setState(AFwS273S0000000_29.get$arr$(41));
    }

    @Override // X.InterfaceC1455040ny2
    public void hide() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(42));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: kR2, reason: merged with bridge method [inline-methods] */
    public FTCEditAudioRecordState zQ2() {
        return new FTCEditAudioRecordState(new C194561119z(), null);
    }

    @Override // X.InterfaceC1455040ny2
    public void show() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(43));
    }

    public FTCEditAudioRecordViewModel() {
        C560530Lyd<Pair<Float, Float>> c560530Lyd = new C560530Lyd<>();
        this.LLIZ = c560530Lyd;
        this.LLIZLLLIL = c560530Lyd;
    }

    @Override // X.InterfaceC1455040ny2
    public LiveData<Boolean> g5() {
        return this.LLILZLL;
    }

    public final LiveEvent<Pair<Float, Float>> lR2() {
        return this.LLIZLLLIL;
    }

    public final void Fd0(boolean z) {
        this.LLILZLL.setValue(Boolean.valueOf(z));
    }

    public final void jR2(float f, float f2) {
        this.LLIZ.LJIIJ(new Pair<>(Float.valueOf(f), Float.valueOf(f2)));
    }
}
