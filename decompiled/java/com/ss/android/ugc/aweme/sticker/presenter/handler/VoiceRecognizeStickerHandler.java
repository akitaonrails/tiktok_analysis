package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.AbstractC1622390sJx;
import X.AbstractC1622690sKR;
import X.C1622720sKU;
import X.C1622760sKY;
import X.C1622780sKa;
import X.C1623370sLX;
import X.C1624570sNT;
import X.C1627370sRz;
import X.C1638280sja;
import X.C19EG;
import X.C21366318jV;
import X.C2188811AlT;
import X.C2219091BtD;
import X.C385670FAf;
import X.InterfaceC1463990oCT;
import X.InterfaceC1622520sKA;
import Y.AObjectS246S0100000_25;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class VoiceRecognizeStickerHandler extends AbstractC1622390sJx implements GenericLifecycleObserver {
    public final LifecycleOwner LLILLJJLI;
    public final InterfaceC1622520sKA LLILLL;
    public final C385670FAf<Boolean> LLILZ;
    public final Context LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final Function0<Boolean> LLIZ;
    public final Function0<Boolean> LLIZLLLIL;
    public volatile Effect LLJ;
    public volatile boolean LLJI;
    public final String LLJIJIL;

    public VoiceRecognizeStickerHandler() {
        throw null;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLJ = null;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(" cancelSticker isStop ");
        sbLIZ.append(this.LLILZ);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(this.LLILZ.LIZJ(), Boolean.TRUE)) {
            this.LLJI = true;
        } else {
            this.LLILLL.LIZ(C1622720sKU.LIZ);
        }
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
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(" onStop currentSticker ");
        sbLIZ.append(this.LLJ);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJ != null) {
            this.LLILLL.LIZ(C1622760sKY.LIZ);
        }
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1624570sNT.LJJIIZ(c1627370sRz.LIZ);
    }

    public final void LJJIIJ(AbstractC1622690sKR abstractC1622690sKR) {
        if (this.LLILLJJLI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) && this.LLIZLLLIL.invoke().booleanValue()) {
            this.LLILLL.LIZIZ(abstractC1622690sKR, null);
        }
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(" useSticker lifecycleOwner isActive: sticker ");
        sbLIZ.append(c1627370sRz.LIZ);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        Function0<Unit> function0 = this.LLILZLL;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLJ = c1627370sRz.LIZ;
        if (this.LLIZ.invoke().booleanValue()) {
            this.LLJI = false;
            LJJIIJ(C1622780sKa.LIZ);
        } else {
            C1638280sja c1638280sja = C21366318jV.LIZLLL;
            Context context = this.LLILZIL;
            c1638280sja.getClass();
            C1638280sja.LIZJ(2131857306, 1, context).LIZ();
        }
    }

    public VoiceRecognizeStickerHandler(LifecycleOwner lifecycleOwner, InterfaceC1622520sKA interfaceC1622520sKA, C385670FAf c385670FAf, C19EG c19eg, AwS569S0100000_25 awS569S0100000_25, int i) {
        AFwS214S0000000_25 aFwS214S0000000_25;
        if ((i & 32) != 0) {
            aFwS214S0000000_25 = AFwS214S0000000_25.get$arr$(407);
        } else {
            aFwS214S0000000_25 = null;
        }
        Function0<Boolean> function0 = (i & 64) != 0 ? AFwS214S0000000_25.get$arr$(408) : awS569S0100000_25;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = interfaceC1622520sKA;
        this.LLILZ = c385670FAf;
        this.LLILZIL = c19eg;
        this.LLILZLL = null;
        this.LLIZ = aFwS214S0000000_25;
        this.LLIZLLLIL = function0;
        this.LLJIJIL = "VoiceRecognizeStickerHandler";
        lifecycleOwner.getLifecycle().addObserver(this);
        c385670FAf.LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 295));
    }
}
