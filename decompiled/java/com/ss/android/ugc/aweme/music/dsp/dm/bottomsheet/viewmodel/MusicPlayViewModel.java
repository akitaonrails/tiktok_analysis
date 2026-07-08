package com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.viewmodel;

import X.C01GW;
import X.C20498815Ja;
import X.C452501pT;
import X.C619550ORt;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicPlayViewModel extends AssemViewModel<C619550ORt> {
    public Music LL;
    public MusicModel LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(244));
    public boolean LLILZ;
    public float LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C619550ORt(0);
    }

    public final C20498815Ja vQ2() {
        return (C20498815Ja) this.LLILLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        vQ2().release();
    }
}
