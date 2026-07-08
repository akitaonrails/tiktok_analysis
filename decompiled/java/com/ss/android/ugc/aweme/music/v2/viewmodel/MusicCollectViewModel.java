package com.ss.android.ugc.aweme.music.v2.viewmodel;

import X.C0OG4;
import X.C0OGJ;
import X.C14EU;
import X.C1623606Xi;
import X.C2217381BqS;
import X.C291001Au;
import X.C297090Bkh;
import X.C622680Oba;
import X.C629770On1;
import X.C632130Oqp;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS24S0001000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCollectViewModel extends AssemViewModel<C0OG4> implements FavoriteAbility {
    public String LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OG4(new C1623606Xi(0), 6);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility
    public final void oD2() {
        withState(new AwS588S0100000_9(this, 337));
        if (C297090Bkh.LIZ()) {
            C632130Oqp.LIZ.getClass();
            C632130Oqp.LIZ();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility
    public final void H30(Function1<? super Boolean, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0OGK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OG4) obj).LL;
            }
        }, null, null, null, new AwS588S0100000_9(function1, (Function1<? super C291001Au<Boolean>, Unit>) 336), 14, null);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMusicCollectEvent(C629770On1 c629770On1) {
        String musicId = c629770On1.LIZIZ.getMusicId();
        int i = c629770On1.LIZ;
        if (Intrinsics.LJFF(musicId, this.LL)) {
            setState(new AwS24S0001000_9(i, 15));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceiveCollectMusicEvent(C0OGJ c0ogj) {
        if (c0ogj.LIZJ) {
            String str = c0ogj.LIZ;
            int i = c0ogj.LIZIZ;
            if (Intrinsics.LJFF(str, this.LL)) {
                setState(new AwS24S0001000_9(i, 15));
            }
        }
    }
}
