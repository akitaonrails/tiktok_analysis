package com.ss.android.ugc.aweme.sticker.panel.info;

import X.AbstractC1627380sS0;
import X.C054G;
import X.C09R3;
import X.C0PEM;
import X.C13LE;
import X.C1623350sLV;
import X.C1623370sLX;
import X.C1627370sRz;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1DRG;
import X.C2217381BqS;
import X.C2296808zG;
import X.EnumC1155090gAF;
import X.InterfaceC1159800gHq;
import X.InterfaceC1622070sJR;
import X.InterfaceC1622080sJS;
import X.InterfaceC1623190sLF;
import X.InterfaceC1624240sMw;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.zhiliaoapp.musically.R;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectInfoStickerHandler implements InterfaceC1622080sJS, InterfaceC1159800gHq, InterfaceC379610EuV, GenericLifecycleObserver {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public C1627370sRz LLILLJJLI;
    public boolean LLILLL;
    public final C1664750tQH LLILZ;
    public final C054G LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectInfoStickerHandler.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EffectInfoStickerHandler.class, "effectInfoApiComponent", "getEffectInfoApiComponent()Lcom/ss/android/ugc/aweme/sticker/panel/info/EffectInfoApiComponent;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        InterfaceC1623190sLF interfaceC1623190sLFU = ((q) this.LLILZ.getValue(this, LLILZLL[0])).U();
        if (interfaceC1623190sLFU != null) {
            interfaceC1623190sLFU.zp();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C2296808zG.LIZJ(this.LLILZIL, null);
    }

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return C1623350sLV.LIZ();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        if (enumC1155090gAF == EnumC1155090gAF.AFTER_ANIMATE && !this.LLILLL) {
            this.LLILLL = true;
            if (this.LLILLJJLI != null) {
                LIZ();
            }
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        TextView textView;
        view.findViewById(R.id.m_g);
        View viewFindViewById = view.findViewById(R.id.mfq);
        if (viewFindViewById != null && (textView = (TextView) viewFindViewById.findViewById(R.id.w6i)) != null) {
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        this.LLILLL = false;
    }

    public EffectInfoStickerHandler(LifecycleOwner lifecycleOwner, C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILZ = C1664770tQJ.LIZ(c1drg, q.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1624240sMw.class, null);
        this.LLILZIL = C2296808zG.LIZ(C0PEM.LIZJ);
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
        if (abstractC1627380sS0 instanceof C1627370sRz) {
            if (this.LLILLL) {
                this.LLILLJJLI = null;
                LIZ();
            } else {
                this.LLILLJJLI = (C1627370sRz) abstractC1627380sS0;
            }
        } else {
            LIZ();
        }
        return interfaceC1622070sJR.LIZ(abstractC1627380sS0);
    }
}
