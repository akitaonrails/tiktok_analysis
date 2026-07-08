package com.ss.android.ugc.gamora.recorder.sticker.ar;

import X.AbstractC1622390sJx;
import X.C09R3;
import X.C0ETY;
import X.C13LE;
import X.C1443960ngA;
import X.C1446130njf;
import X.C1622090sJT;
import X.C1623290sLP;
import X.C1623370sLX;
import X.C1627370sRz;
import X.C1645380sv2;
import X.C1664740tQG;
import X.C1664770tQJ;
import X.C19292410dm;
import X.C1DRG;
import X.C2217381BqS;
import X.C531060KsC;
import X.C537170L4x;
import X.EnumC1448980noG;
import X.InterfaceC1623110sL7;
import X.InterfaceC1626180sQ4;
import X.InterfaceC1628590sTx;
import X.InterfaceC1644770su3;
import X.InterfaceC1648570t0B;
import X.InterfaceC1650230t2r;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.creative.model.recordeffect.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ln3.a;
import lth.o;
import mn3.e0;
import pyl.s;

/* JADX INFO: loaded from: classes26.dex */
public final class SharedARStickerHandler extends AbstractC1622390sJx implements InterfaceC1623110sL7, InterfaceC379610EuV, GenericLifecycleObserver {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1626180sQ4 LLILLL;
    public final InterfaceC1650230t2r LLILZ;
    public final InterfaceC1648570t0B LLILZIL;
    public final InterfaceC1644770su3 LLILZLL;
    public final InterfaceC1628590sTx LLIZ;
    public final Function1<Boolean, Unit> LLIZLLLIL;
    public final Function0<Unit> LLJ;
    public final C1664740tQG LLJI;
    public final C1664740tQG LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SharedARStickerHandler.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SharedARStickerHandler.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final ShortVideoContext LJJIIJ() {
        return ((ShortVideoContextViewModel) ((ViewModelProvider) this.LLILLJJLI.LJII(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class)).LL;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        LJJIIJ().LJJLIIIJL(false);
        this.LLJ.invoke();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        Effect effect = c1627370sRz.LIZ;
        if (effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        return C1446130njf.LJIILJJIL(effect, "share_ar", false);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        boolean z;
        Mission mission;
        String sharedARSessionId;
        String strLJFF;
        if (c1627370sRz.LIZJ == EnumC1448980noG.RECOVER) {
            return;
        }
        this.LLILLL.LIZLLL(c1627370sRz.LIZ);
        LJJIIJ().LJJLIIIJL(true);
        if (c1627370sRz.LIZJ == EnumC1448980noG.MANUAL_SET) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SharedARModel sharedARModel = LJJIIJ().sharedARModel;
            if (sharedARModel != null) {
                sharedARSessionId = sharedARModel.getSharedARSessionId();
            } else {
                sharedARSessionId = null;
            }
            C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
            if (currentUser != null) {
                strLJFF = currentUser.LJFF();
            } else {
                strLJFF = null;
            }
            if (sharedARSessionId != null && sharedARSessionId.length() != 0 && strLJFF != null && strLJFF.length() != 0) {
                this.LLILLL.LIZJ(sharedARSessionId, strLJFF);
            }
        } else {
            SharedARModel sharedARModel2 = LJJIIJ().sharedARModel;
            if (sharedARModel2 != null) {
                sharedARModel2.setCurrentUserHost(true);
            }
        }
        this.LLIZLLLIL.invoke(Boolean.valueOf(z));
        this.LLILZIL.xP1(true, false, true);
        this.LLILZ.NF(s.NORMAL);
        ShortVideoContext shortVideoContextLJJIIJ = LJJIIJ();
        if (shortVideoContextLJJIIJ.LJJJJZI() && ((mission = shortVideoContextLJJIIJ.creativeModel.commerceModel.getMission()) == null || mission.getMusicId() == null)) {
            C1443960ngA.LIZIZ(shortVideoContextLJJIIJ);
            C1443960ngA.LIZ(shortVideoContextLJJIIJ);
            this.LLILZIL.ht1(new C531060KsC(shortVideoContextLJJIIJ.cameraComponentModel.mMaxDuration));
            InterfaceC1628590sTx interfaceC1628590sTx = this.LLIZ;
            if (interfaceC1628590sTx != null) {
                interfaceC1628590sTx.Jn();
            }
            InterfaceC1628590sTx interfaceC1628590sTx2 = this.LLIZ;
            if (interfaceC1628590sTx2 != null) {
                interfaceC1628590sTx2.FO1(null, null);
            }
        }
        C1664740tQG c1664740tQG = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        if (C1622090sJT.LIZ((C1645380sv2) c1664740tQG.getValue(this, interfaceC2217461BqaArr[1]))) {
            InterfaceC1644770su3 interfaceC1644770su3 = (InterfaceC1644770su3) ((C0ETY) this.LLILLJJLI.LJII(C0ETY.class, null)).MY1(InterfaceC1644770su3.class);
            if (interfaceC1644770su3 != null) {
                interfaceC1644770su3.yL2(true, "build_in");
            }
        } else {
            InterfaceC1644770su3 interfaceC1644770su32 = this.LLILZLL;
            if (interfaceC1644770su32 != null) {
                interfaceC1644770su32.yL2(true, "build_in");
            }
        }
        a aVar = (a) this.LLJI.getValue(this, interfaceC2217461BqaArr[0]);
        if (aVar != null) {
            aVar.Yz1(false);
        }
        this.LLILZ.ls();
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        this.LLILLL.onMessageReceived(i, i2, i3, str);
    }

    public SharedARStickerHandler(C1DRG c1drg, InterfaceC1626180sQ4 interfaceC1626180sQ4, e0 e0Var, InterfaceC1648570t0B interfaceC1648570t0B, InterfaceC1644770su3 interfaceC1644770su3, InterfaceC1628590sTx interfaceC1628590sTx, C537170L4x c537170L4x, C1623290sLP c1623290sLP) {
        this.LLILLJJLI = c1drg;
        this.LLILLL = interfaceC1626180sQ4;
        this.LLILZ = e0Var;
        this.LLILZIL = interfaceC1648570t0B;
        this.LLILZLL = interfaceC1644770su3;
        this.LLIZ = interfaceC1628590sTx;
        this.LLIZLLLIL = c537170L4x;
        this.LLJ = c1623290sLP;
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, a.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, C1645380sv2.class, "lazyBeautyFilter");
    }
}
