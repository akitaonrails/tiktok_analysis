package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.AbstractC1627380sS0;
import X.C1446130njf;
import X.C1622720sKU;
import X.C1622780sKa;
import X.C1623350sLV;
import X.C1623370sLX;
import X.C1627360sRy;
import X.C1627370sRz;
import X.C1638280sja;
import X.C1954807lC;
import X.C21366318jV;
import X.C2188811AlT;
import X.C2219091BtD;
import X.InterfaceC1463990oCT;
import X.InterfaceC1622070sJR;
import X.InterfaceC1622080sJS;
import X.InterfaceC1622700sKS;
import X.InterfaceC1631630sYr;
import Y.ARunnableS94S0200000_25;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class AudioGraphStickerHandler implements InterfaceC1622080sJS, GenericLifecycleObserver {
    public static AudioGraph LLILLL;
    public static boolean LLILZ;
    public static boolean LLILZIL;
    public static boolean LLILZLL;
    public final MicStickerAudioController LL;
    public final InterfaceC1622700sKS LLILLJJLI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        }
    }

    public final void LIZLLL() {
        if (LLILLL == null || !this.LLILLJJLI.LIZJ()) {
            return;
        }
        this.LLILLJJLI.t1();
    }

    public final void LJ() {
        if (LLILLL == null || LLILZLL || !this.LLILLJJLI.LIZJ()) {
            return;
        }
        this.LLILLJJLI.t1();
    }

    public final void LJFF() {
        if (LLILLL != null && LLILZLL && this.LLILLJJLI.LIZJ()) {
            this.LLILLJJLI.LJLL();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (LLILLL == null) {
            return;
        }
        LIZIZ(false);
        this.LLILLJJLI.LJLL();
    }

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return C1623350sLV.LIZ();
    }

    public final void LIZIZ(boolean z) {
        this.LLILLJJLI.LJLL();
        LLILLL = null;
        this.LLILLJJLI.LIZ(false, false, false, false);
        LLILZ = false;
        LLILZIL = false;
        AudioGraph audioGraph = LLILLL;
        if (audioGraph != null && audioGraph.enableMic()) {
            MicStickerAudioController micStickerAudioController = this.LL;
            C1622720sKU c1622720sKU = C1622720sKU.LIZ;
            micStickerAudioController.getClass();
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(micStickerAudioController.LLJI);
            sbLIZ.append(" cancelSticker isStop ");
            sbLIZ.append(micStickerAudioController.LLILLL);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
            micStickerAudioController.LLIZLLLIL = null;
            Function1<Boolean, Unit> function1 = micStickerAudioController.LLILZIL;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            if (Intrinsics.LJFF(micStickerAudioController.LLILLL.LIZJ(), Boolean.TRUE)) {
                micStickerAudioController.LIZ(c1622720sKU);
            } else {
                micStickerAudioController.LLJ = true;
            }
        }
        this.LLILLJJLI.release(z);
    }

    public final void LIZJ(C1627370sRz c1627370sRz) {
        AudioGraph audioGraph = LLILLL;
        if (audioGraph != null && audioGraph.enableMusic()) {
            this.LLILLJJLI.LJIIIZ(c1627370sRz.LIZ);
        }
        if (!LLILZLL) {
            this.LLILLJJLI.t1();
            this.LLILLJJLI.LJLL();
        }
        if (this.LLILLJJLI.LIZJ()) {
            if (LLILZLL) {
                this.LLILLJJLI.LJLL();
            }
            this.LLILLJJLI.t1();
        }
    }

    @Override // X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
        boolean zBooleanValue;
        Boolean bool;
        if (abstractC1627380sS0 instanceof C1627370sRz) {
            C1627370sRz c1627370sRz = (C1627370sRz) abstractC1627380sS0;
            C1446130njf c1446130njf = C1446130njf.LIZ;
            Effect effect = c1627370sRz.LIZ;
            c1446130njf.getClass();
            AudioGraph audioGraph = (AudioGraph) GsonProtectorUtils.fromJson(C2219091BtD.LIZJ(), C1446130njf.LJIIJ(effect, "audio_graph"), AudioGraph.class);
            LLILLL = audioGraph;
            if (audioGraph != null) {
                this.LLILLJJLI.init();
                this.LLILLJJLI.LJLL();
                LLILZ = this.LLILLJJLI.LJ();
                LLILZIL = this.LLILLJJLI.LJI();
                this.LLILLJJLI.LJII(true);
                this.LLILLJJLI.LJFF();
                InterfaceC1622700sKS interfaceC1622700sKS = this.LLILLJJLI;
                AudioGraph audioGraph2 = LLILLL;
                if (audioGraph2 != null && (bool = audioGraph2.useOutput) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                interfaceC1622700sKS.LIZ(zBooleanValue, true, false, false);
                this.LLILLJJLI.LIZLLL();
                this.LLILLJJLI.LJIIIIZZ();
                AudioGraph audioGraph3 = LLILLL;
                if (audioGraph3 != null && audioGraph3.enableMic()) {
                    this.LLILLJJLI.LIZIZ();
                }
                AudioGraph audioGraph4 = LLILLL;
                if (audioGraph4 != null && audioGraph4.enableMic()) {
                    MicStickerAudioController micStickerAudioController = this.LL;
                    Effect effect2 = c1627370sRz.LIZ;
                    C1622780sKa c1622780sKa = C1622780sKa.LIZ;
                    ARunnableS94S0200000_25 aRunnableS94S0200000_25 = new ARunnableS94S0200000_25(this, c1627370sRz, 18);
                    micStickerAudioController.getClass();
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(micStickerAudioController.LLJI);
                    sbLIZ.append(" useSticker lifecycleOwner isActive: sticker ");
                    sbLIZ.append(effect2);
                    interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
                    micStickerAudioController.LLIZLLLIL = effect2;
                    Function1<Boolean, Unit> function1 = micStickerAudioController.LLILZIL;
                    if (function1 != null) {
                        function1.invoke(Boolean.TRUE);
                    }
                    if (micStickerAudioController.LLILZLL.invoke().booleanValue()) {
                        micStickerAudioController.LLJ = false;
                        if (micStickerAudioController.LL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                            micStickerAudioController.LLILLJJLI.LIZIZ(c1622780sKa, aRunnableS94S0200000_25);
                            AudioGraph audioGraph5 = LLILLL;
                            if (audioGraph5 != null) {
                                InterfaceC1631630sYr<Boolean, Boolean, Boolean, Boolean, Unit> interfaceC1631630sYr = micStickerAudioController.LLIZ;
                                Boolean bool2 = audioGraph5.useOutput;
                                Boolean bool3 = Boolean.TRUE;
                                interfaceC1631630sYr.invoke(Boolean.valueOf(Intrinsics.LJFF(bool2, bool3)), bool3, Boolean.valueOf(LLILZ), Boolean.valueOf(LLILZIL));
                            }
                        }
                    } else {
                        C1638280sja c1638280sja = C21366318jV.LIZLLL;
                        Context context = micStickerAudioController.LLILZ;
                        c1638280sja.getClass();
                        C1638280sja.LIZJ(2131857306, 1, context).LIZ();
                        aRunnableS94S0200000_25.run();
                    }
                } else {
                    LIZJ(c1627370sRz);
                }
            } else {
                LIZIZ(true);
            }
        } else if (abstractC1627380sS0 instanceof C1627360sRy) {
            LIZIZ(false);
        } else {
            throw new C1954807lC();
        }
        return interfaceC1622070sJR.LIZ(abstractC1627380sS0);
    }

    public AudioGraphStickerHandler(LifecycleOwner lifecycleOwner, MicStickerAudioController micStickerAudioController, InterfaceC1622700sKS interfaceC1622700sKS) {
        this.LL = micStickerAudioController;
        this.LLILLJJLI = interfaceC1622700sKS;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler r5, java.lang.Boolean r6, java.lang.Boolean r7, boolean r8, int r9) {
        /*
            r0 = r9 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r6 = r1
        L6:
            r0 = r9 & 2
            if (r0 == 0) goto Lb
            r7 = r1
        Lb:
            r0 = r9 & 4
            r4 = 0
            if (r0 == 0) goto L11
            r8 = 0
        L11:
            com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LLILLL
            r3 = 1
            if (r0 == 0) goto L1c
            if (r6 != 0) goto L1d
            if (r7 != 0) goto L2b
            if (r8 != 0) goto L39
        L1c:
            return
        L1d:
            boolean r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LLILZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L39
            if (r7 == 0) goto L37
        L2b:
            boolean r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LLILZIL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L39
        L37:
            if (r8 == 0) goto L1c
        L39:
            X.0sKS r2 = r5.LLILLJJLI
            com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LLILLL
            if (r0 == 0) goto L47
            java.lang.Boolean r1 = r0.useOutput
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L47:
            if (r6 == 0) goto L6a
            boolean r1 = r6.booleanValue()
        L4d:
            if (r7 == 0) goto L67
            boolean r0 = r7.booleanValue()
        L53:
            r2.LIZ(r4, r3, r1, r0)
            if (r6 == 0) goto L5e
            boolean r0 = r6.booleanValue()
            com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LLILZ = r0
        L5e:
            if (r7 == 0) goto L1c
            boolean r0 = r7.booleanValue()
            com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LLILZIL = r0
            return
        L67:
            boolean r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LLILZIL
            goto L53
        L6a:
            boolean r1 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LLILZ
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LIZ(com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler, java.lang.Boolean, java.lang.Boolean, boolean, int):void");
    }
}
