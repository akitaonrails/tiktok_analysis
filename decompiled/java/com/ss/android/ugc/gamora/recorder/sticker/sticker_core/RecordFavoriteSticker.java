package com.ss.android.ugc.gamora.recorder.sticker.sticker_core;

import X.C0C64;
import X.C1635820sfc;
import X.C1695930uEZ;
import X.C19GS;
import X.C297940Bm4;
import X.C786410Ut5;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625220sOW;
import X.InterfaceC1628180sTI;
import X.InterfaceC1630220sWa;
import Y.ARunnableS106S0100000_6;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public final class RecordFavoriteSticker extends FavoriteSticker {
    public final C19GS LLJJIJI;
    public final FrameLayout LLJJIJIIJIL;
    public final InterfaceC1630220sWa LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker, X.InterfaceC1623100sL6
    public final void LIZ(boolean z) {
        if (z) {
            if (this.LLJJIJI.isFinishing()) {
                return;
            }
            C786410Ut5.LJZ(0, this.LLJJIJIIJIL);
            if (!this.LLJJIJIL.LIZLLL() && !C297940Bm4.LIZ() && !C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_offline_effect_collect", true, false)) {
                HandlerHook.viewPost(this.LLJJIJIIJIL, new ARunnableS106S0100000_6(this, 218));
                this.LLJJIJIL.LIZJ();
                return;
            }
            return;
        }
        C786410Ut5.LJZ(8, this.LLJJIJIIJIL);
    }

    public RecordFavoriteSticker(C19GS c19gs, LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625220sOW interfaceC1625220sOW, InterfaceC1628180sTI interfaceC1628180sTI, FrameLayout frameLayout, C1695930uEZ c1695930uEZ, InterfaceC1630220sWa interfaceC1630220sWa, Function0<C1635820sfc> function0, Function2<? super Effect, ? super Boolean, Unit> function2) {
        super(c19gs, lifecycleOwner, interfaceC1624480sNK, interfaceC1625220sOW, interfaceC1628180sTI, frameLayout, c1695930uEZ, interfaceC1630220sWa, function0, function2);
        this.LLJJIJI = c19gs;
        this.LLJJIJIIJIL = frameLayout;
        this.LLJJIJIL = interfaceC1630220sWa;
    }
}
