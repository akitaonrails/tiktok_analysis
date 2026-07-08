package com.ss.android.ugc.gamora.recorder.sticker.childeffectpanel;

import X.AbstractC1622390sJx;
import X.C09R3;
import X.C11NJ;
import X.C13LE;
import X.C1444560nh8;
import X.C1623370sLX;
import X.C1627370sRz;
import X.C1664740tQG;
import X.C1664770tQJ;
import X.C1DRG;
import X.C2217381BqS;
import X.C356901a3;
import X.EnumC1155090gAF;
import X.InterfaceC1159800gHq;
import X.InterfaceC1624540sNQ;
import X.InterfaceC1625000sOA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class ChildEffectButtonHandler extends AbstractC1622390sJx implements InterfaceC379610EuV, InterfaceC1159800gHq, GenericLifecycleObserver {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LLILLJJLI;
    public final C1664740tQG LLILLL;
    public final C1664740tQG LLILZ;
    public final C11NJ LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChildEffectButtonHandler.class, "stickerApi", "getStickerApi()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ChildEffectButtonHandler.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(ChildEffectButtonHandler.class, "childEffectButtonApiComponent", "getChildEffectButtonApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/childeffectpanel/ChildEffectButtonApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(ChildEffectButtonHandler.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        InterfaceC1624540sNQ interfaceC1624540sNQ = (InterfaceC1624540sNQ) this.LLILZ.getValue(this, LLILZLL[2]);
        if (interfaceC1624540sNQ != null) {
            interfaceC1624540sNQ.LJJJJLL(false);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        InterfaceC1625000sOA interfaceC1625000sOA = (InterfaceC1625000sOA) this.LLILLL.getValue(this, LLILZLL[0]);
        if (interfaceC1625000sOA != null) {
            interfaceC1625000sOA.sb(this);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.gamora.recorder.sticker.childeffectpanel.ChildEffectButtonHandler$1, reason: invalid class name */
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
            ChildEffectButtonHandler.this.LLILZIL.dispose();
        }
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        Effect effect;
        if (!C1444560nh8.LIZ() || (effect = c1627370sRz.LIZ) == null || !DiyPropParser.LJIIJJI(effect) || DiyPropParser.LJ(effect).length() == 0) {
            return false;
        }
        return true;
    }

    public ChildEffectButtonHandler(LifecycleOwner lifecycleOwner, C1DRG c1drg) {
        this.LLILLJJLI = c1drg;
        lifecycleOwner.getLifecycle().addObserver(this);
        lifecycleOwner.getLifecycle().addObserver(new AnonymousClass1());
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1625000sOA.class, null);
        C1664770tQJ.LIZ(c1drg, q.class, null);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1624540sNQ.class, null);
        C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLILZIL = new C11NJ();
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        Effect effect;
        if (C1444560nh8.LIZ() && (effect = c1627370sRz.LIZ) != null) {
            if (DiyPropParser.LJIIJJI(effect) && DiyPropParser.LJ(effect).length() > 0) {
                InterfaceC1624540sNQ interfaceC1624540sNQ = (InterfaceC1624540sNQ) this.LLILZ.getValue(this, LLILZLL[2]);
                if (interfaceC1624540sNQ != null) {
                    interfaceC1624540sNQ.s(effect);
                    return;
                }
                return;
            }
            InterfaceC1624540sNQ interfaceC1624540sNQ2 = (InterfaceC1624540sNQ) this.LLILZ.getValue(this, LLILZLL[2]);
            if (interfaceC1624540sNQ2 == null) {
                return;
            }
            interfaceC1624540sNQ2.LJJJJLL(false);
        }
    }
}
