package com.ss.android.ugc.aweme.ftc.components.corner;

import X.C194561119z;
import X.InterfaceC1455130nyB;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS46S0001000_35;
import kotlin.jvm.internal.AwS47S0010000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class FTCEditCornerViewModel extends LifecycleAwareViewModel<FTCEditCornerState> implements InterfaceC1455130nyB {
    public static final int LLILZLL = 8;

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public FTCEditCornerState zQ2() {
        return new FTCEditCornerState(null, null, null, new C194561119z());
    }

    @Override // X.InterfaceC1455130nyB
    public void u72() {
        setState(AFwS283S0000000_35.get$arr$(40));
    }

    @Override // X.InterfaceC1455130nyB
    public void Ip0(boolean z) {
        setState(new AwS47S0010000_35(z, 1));
    }

    @Override // X.InterfaceC1455130nyB
    public void Kj(int i) {
        setState(new AwS46S0001000_35(i, 1));
    }

    @Override // X.InterfaceC1455130nyB
    public void LLLIIL(int i) {
        setState(new AwS46S0001000_35(i, 0));
    }
}
