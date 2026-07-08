package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import X.C01GW;
import X.C1446160nji;
import X.C1449630npJ;
import X.C194561119z;
import X.C1DRG;
import X.C364410EQl;
import X.C560530Lyd;
import X.InterfaceC1455050ny3;
import X.InterfaceC1455860nzM;
import X.InterfaceC379610EuV;
import com.bytedance.als.LiveEvent;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditAudioEffectViewModel extends LifecycleAwareViewModel<FTCEditAudioEffectState> implements InterfaceC1455050ny3, InterfaceC379610EuV {
    public static final int LLJ = 8;
    public final C1DRG LLILZLL;
    public final C01GW LLIZ = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final LiveEvent<CategoryPageModel> LLIZLLLIL = new C560530Lyd();

    private final InterfaceC1455860nzM lR2() {
        return (InterfaceC1455860nzM) this.LLIZ.getValue();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public FTCEditAudioEffectState zQ2() {
        return new FTCEditAudioEffectState(null, new C194561119z());
    }

    @Override // X.InterfaceC1455050ny3
    public void show() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(40));
    }

    @Override // X.InterfaceC1455050ny3
    public LiveEvent<CategoryPageModel> SG1() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    public FTCEditAudioEffectViewModel(C1DRG c1drg) {
        this.LLILZLL = c1drg;
    }

    public final void kR2(CategoryPageModel categoryPageModel) {
        ((C560530Lyd) SG1()).LJIIJ(categoryPageModel);
    }

    @Override // X.InterfaceC1455050ny3
    public void xU0(VideoPublishEditModel videoPublishEditModel) {
        lR2().tH1(C364410EQl.LIZIZ());
        C1446160nji.LIZLLL(videoPublishEditModel);
        setStateImmediate(AFwS273S0000000_29.get$arr$(39));
    }
}
