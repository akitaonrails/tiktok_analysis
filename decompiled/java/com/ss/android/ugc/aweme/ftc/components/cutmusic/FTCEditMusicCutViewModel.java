package com.ss.android.ugc.aweme.ftc.components.cutmusic;

import X.C194561119z;
import X.InterfaceC1454940nxs;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS37S0102000_35;
import kotlin.jvm.internal.AwS46S0001000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class FTCEditMusicCutViewModel extends LifecycleAwareViewModel<FTCEditMusicCutState> implements InterfaceC1454940nxs {
    public static final int LLILZLL = 8;

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public FTCEditMusicCutState zQ2() {
        return new FTCEditMusicCutState(null, null, new C194561119z());
    }

    @Override // X.InterfaceC1454940nxs
    public void show() {
        setState(AFwS283S0000000_35.get$arr$(41));
    }

    @Override // X.InterfaceC1454940nxs
    public void LLLL(int i) {
        setState(new AwS46S0001000_35(i, 2));
    }

    @Override // X.InterfaceC1454940nxs
    public void KM2(AVMusicWaveBean aVMusicWaveBean, int i, int i2) {
        setState(new AwS37S0102000_35(aVMusicWaveBean, i, i2, 0));
    }
}
