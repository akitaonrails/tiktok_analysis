package com.ss.android.ugc.aweme.ftc.components.volume;

import X.C194561119z;
import X.InterfaceC1455140nyC;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS79S1000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditVolumeViewModel extends LifecycleAwareViewModel<FTCEditVolumeState> implements InterfaceC1455140nyC {
    public static final int LLILZLL = 8;

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public FTCEditVolumeState zQ2() {
        return new FTCEditVolumeState(null, null, null, new C194561119z());
    }

    @Override // X.InterfaceC1455140nyC
    public void show() {
        setState(AFwS273S0000000_29.get$arr$(60));
    }

    @Override // X.InterfaceC1455140nyC
    public void Ei(String str) {
        setState(new AwS79S1000000_29(str, 1));
    }

    @Override // X.InterfaceC1455140nyC
    public void d9(int i) {
        setState(new AwS41S0001000_29(i, 5));
    }

    @Override // X.InterfaceC1455140nyC
    public void ro(String str) {
        setState(new AwS79S1000000_29(str, 0));
    }
}
