package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.AbstractC1622690sKR;
import X.C1622720sKU;
import X.C1622760sKY;
import X.C19EG;
import X.C2188811AlT;
import X.C2219091BtD;
import X.C385670FAf;
import X.InterfaceC1463990oCT;
import X.InterfaceC1622520sKA;
import X.InterfaceC1631630sYr;
import Y.AObjectS246S0100000_25;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class MicStickerAudioController implements GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public final InterfaceC1622520sKA LLILLJJLI;
    public final C385670FAf<Boolean> LLILLL;
    public final Context LLILZ;
    public final Function1<Boolean, Unit> LLILZIL;
    public final Function0<Boolean> LLILZLL;
    public final InterfaceC1631630sYr<Boolean, Boolean, Boolean, Boolean, Unit> LLIZ;
    public volatile Effect LLIZLLLIL;
    public volatile boolean LLJ;
    public final String LLJI;

    public MicStickerAudioController() {
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJI);
        sbLIZ.append(" onStop currentSticker ");
        sbLIZ.append(this.LLIZLLLIL);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLIZLLLIL != null) {
            LIZ(C1622760sKY.LIZ);
        }
    }

    public final void LIZ(AbstractC1622690sKR abstractC1622690sKR) {
        this.LLILLJJLI.LIZ(abstractC1622690sKR);
        if ((AudioGraphStickerHandler.LLILLL != null || AudioGraphStickerHandler.LLILZ || AudioGraphStickerHandler.LLILZIL) && (Intrinsics.LJFF(C1622760sKY.LIZ, abstractC1622690sKR) || Intrinsics.LJFF(new AbstractC1622690sKR() { // from class: X.0sKZ
        }, abstractC1622690sKR) || Intrinsics.LJFF(C1622720sKU.LIZ, abstractC1622690sKR))) {
            InterfaceC1631630sYr<Boolean, Boolean, Boolean, Boolean, Unit> interfaceC1631630sYr = this.LLIZ;
            Boolean bool = Boolean.FALSE;
            interfaceC1631630sYr.invoke(bool, bool, bool, bool);
            AudioGraphStickerHandler.LLILLL = null;
            AudioGraphStickerHandler.LLILZ = false;
            AudioGraphStickerHandler.LLILZIL = false;
            return;
        }
        AudioGraph audioGraph = AudioGraphStickerHandler.LLILLL;
        if (audioGraph == null) {
            return;
        }
        this.LLIZ.invoke(Boolean.valueOf(Intrinsics.LJFF(audioGraph.useOutput, Boolean.TRUE)), Boolean.TRUE, Boolean.FALSE, Boolean.valueOf(AudioGraphStickerHandler.LLILZIL));
    }

    public MicStickerAudioController(LifecycleOwner lifecycleOwner, InterfaceC1622520sKA interfaceC1622520sKA, C385670FAf c385670FAf, C19EG c19eg, Function0 function0, InterfaceC1631630sYr interfaceC1631630sYr) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC1622520sKA;
        this.LLILLL = c385670FAf;
        this.LLILZ = c19eg;
        this.LLILZIL = null;
        this.LLILZLL = function0;
        this.LLIZ = interfaceC1631630sYr;
        this.LLJI = "MicStickerAudioController";
        lifecycleOwner.getLifecycle().addObserver(this);
        c385670FAf.LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 294));
    }
}
