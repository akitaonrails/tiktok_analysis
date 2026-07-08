package com.ss.android.ugc.gamora.recorder.sticker.optionlist;

import X.AbstractC1622390sJx;
import X.C09R3;
import X.C0C64;
import X.C11NJ;
import X.C13LE;
import X.C1449600npG;
import X.C1623370sLX;
import X.C1624550sNR;
import X.C1627370sRz;
import X.C1664740tQG;
import X.C1664770tQJ;
import X.C1DRG;
import X.C201955140j;
import X.C2217381BqS;
import X.C356901a3;
import X.EnumC1155090gAF;
import X.InterfaceC1159800gHq;
import X.InterfaceC1624530sNP;
import X.InterfaceC1625000sOA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes26.dex */
public final class OptionListHandler extends AbstractC1622390sJx implements InterfaceC379610EuV, InterfaceC1159800gHq, GenericLifecycleObserver {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LLILLJJLI;
    public final C1664740tQG LLILLL;
    public final C1664740tQG LLILZ;
    public final C11NJ LLILZIL;
    public Effect LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OptionListHandler.class, "stickerApi", "getStickerApi()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(OptionListHandler.class, "optionListApiComponent", "getOptionListApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/optionlist/OptionListApiComponent;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final InterfaceC1624530sNP LJJIIJ() {
        return (InterfaceC1624530sNP) this.LLILZ.getValue(this, LLIZ[1]);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        InterfaceC1625000sOA interfaceC1625000sOA = (InterfaceC1625000sOA) this.LLILLL.getValue(this, LLIZ[0]);
        if (interfaceC1625000sOA != null) {
            interfaceC1625000sOA.sb(this);
        }
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        InterfaceC1624530sNP interfaceC1624530sNPLJJIIJ = LJJIIJ();
        if (interfaceC1624530sNPLJJIIJ != null) {
            interfaceC1624530sNPLJJIIJ.LJJJJLL(false);
        }
        this.LLILZLL = null;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionListHandler$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes13.dex */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
            OptionListHandler.this.LLILZIL.dispose();
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        InterfaceC1624530sNP interfaceC1624530sNPLJJIIJ;
        InterfaceC1624530sNP interfaceC1624530sNPLJJIIJ2;
        C201955140j.LIZIZ("OptionListHandler", "onStickerViewShow");
        Effect effect = this.LLILZLL;
        if (effect != null && (interfaceC1624530sNPLJJIIJ = LJJIIJ()) != null && !interfaceC1624530sNPLJJIIJ.isShowing() && (interfaceC1624530sNPLJJIIJ2 = LJJIIJ()) != null) {
            interfaceC1624530sNPLJJIIJ2.s(effect);
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        InterfaceC1624530sNP interfaceC1624530sNPLJJIIJ;
        InterfaceC1624530sNP interfaceC1624530sNPLJJIIJ2;
        C201955140j.LIZIZ("OptionListHandler", "onStickerViewHide");
        if (this.LLILZLL != null && (interfaceC1624530sNPLJJIIJ = LJJIIJ()) != null && interfaceC1624530sNPLJJIIJ.isShowing() && (interfaceC1624530sNPLJJIIJ2 = LJJIIJ()) != null) {
            interfaceC1624530sNPLJJIIJ2.LJJJJLL(false);
        }
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        if ((C1624550sNR.LIZLLL(c1627370sRz.LIZ) || ((C1624550sNR.LJ(c1627370sRz.LIZ) && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_add_effect_button", true, false)) || (C1624550sNR.LIZJ(c1627370sRz.LIZ) && C1449600npG.LJII(c1627370sRz.LIZ)))) && !C1449600npG.LIZJ(c1627370sRz.LIZ)) {
            return true;
        }
        return false;
    }

    public OptionListHandler(LifecycleOwner lifecycleOwner, C1DRG c1drg) {
        this.LLILLJJLI = c1drg;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1625000sOA.class, null);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1624530sNP.class, null);
        this.LLILZIL = new C11NJ();
        lifecycleOwner.getLifecycle().addObserver(new AnonymousClass1());
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        InterfaceC1624530sNP interfaceC1624530sNPLJJIIJ = LJJIIJ();
        if (interfaceC1624530sNPLJJIIJ != null) {
            interfaceC1624530sNPLJJIIJ.s(c1627370sRz.LIZ);
        }
        this.LLILZLL = c1627370sRz.LIZ;
    }
}
