package com.ss.android.ugc.aweme.ftc.components.effect;

import X.C194561119z;
import X.InterfaceC1455100ny8;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0001000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditEffectViewModel extends LifecycleAwareViewModel<FTCEditEffectState> implements InterfaceC1455100ny8 {
    public static final int LLILZLL = 8;

    @Override // X.InterfaceC1455100ny8
    public void Fq() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(46));
    }

    @Override // X.InterfaceC1455100ny8
    public void P5() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(47));
    }

    @Override // X.InterfaceC1455100ny8
    public void Qh() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(45));
    }

    @Override // X.InterfaceC1455100ny8
    public void hide() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(44));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public FTCEditEffectState zQ2() {
        return new FTCEditEffectState(new C194561119z(), null, null, null, null, null);
    }

    @Override // X.InterfaceC1455100ny8
    public void show() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(48));
    }

    @Override // X.InterfaceC1455100ny8
    public void LLLL(int i) {
        setStateImmediate(new AwS41S0001000_29(i, 2));
    }

    @Override // X.InterfaceC1455100ny8
    public void Tj(int i) {
        setStateImmediate(new AwS41S0001000_29(i, 3));
    }
}
