package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.AbstractC1622390sJx;
import X.C1622640sKM;
import X.C1623370sLX;
import X.C1624570sNT;
import X.C1627370sRz;
import X.InterfaceC1622590sKH;
import X.InterfaceC1622600sKI;
import X.InterfaceC1622620sKK;
import X.InterfaceC1623110sL7;
import Y.ARunnableS125S0100000_25;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes26.dex */
public final class StickerVideoStatusHandler extends AbstractC1622390sJx implements InterfaceC1623110sL7, GenericLifecycleObserver {
    public final InterfaceC1622590sKH LLILLJJLI;
    public final InterfaceC1622600sKI LLILLL;
    public Effect LLILZ;
    public int LLILZIL = 2;
    public volatile boolean LLILZLL;
    public boolean LLIZ;

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLILZ = null;
        if (this.LLILZLL) {
            this.LLILLJJLI.LIZ(false);
            this.LLILLJJLI.LIZIZ(null);
            this.LLILZLL = false;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroyed();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroyed() {
        if (C1624570sNT.LJIJJ(this.LLILZ) && this.LLILZLL) {
            this.LLILLJJLI.LIZ(false);
            this.LLILLJJLI.LIZIZ(null);
            this.LLILZLL = false;
        }
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1624570sNT.LJIJJ(this.LLILZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0sKJ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        this.LLILZ = c1627370sRz.LIZ;
        this.LLILZLL = true;
        this.LLIZ = false;
        this.LLILZIL = 2;
        this.LLILLJJLI.LIZ(true);
        this.LLILLJJLI.LIZIZ(new InterfaceC1622620sKK() { // from class: X.0sKJ
            @Override // X.InterfaceC1622620sKK
            public final void LIZ() {
                C786410Ut5.LJLIIL(100L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS125S0100000_25(this.LIZ, 53));
            }
        });
    }

    public StickerVideoStatusHandler(LifecycleOwner lifecycleOwner, C1622640sKM c1622640sKM, InterfaceC1622600sKI interfaceC1622600sKI) {
        this.LLILLJJLI = c1622640sKM;
        this.LLILLL = interfaceC1622600sKI;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (C1624570sNT.LJIJJ(this.LLILZ) && i == 52) {
            this.LLILZIL = i2;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.LLILLJJLI.start();
                        return;
                    }
                    return;
                }
                this.LLILLJJLI.pause();
                return;
            }
            if (this.LLIZ) {
                return;
            }
            InterfaceC1622600sKI interfaceC1622600sKI = this.LLILLL;
            if (interfaceC1622600sKI != null && interfaceC1622600sKI.LIZIZ() && this.LLILLL.LIZ()) {
                return;
            }
            this.LLILLJJLI.start();
        }
    }
}
