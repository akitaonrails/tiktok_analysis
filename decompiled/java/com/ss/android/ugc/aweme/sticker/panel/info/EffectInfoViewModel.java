package com.ss.android.ugc.aweme.sticker.panel.info;

import X.AbstractC1638950skf;
import X.AbstractC1638990skj;
import X.AbstractC1639150skz;
import X.C05YC;
import X.C09IC;
import X.C09IR;
import X.C09R3;
import X.C0CHS;
import X.C1206680hVS;
import X.C13LE;
import X.C1408830mlV;
import X.C1408840mlW;
import X.C1440005kM;
import X.C1446130njf;
import X.C1446840nko;
import X.C1631810sZ9;
import X.C1631820sZA;
import X.C1638940ske;
import X.C1638970skh;
import X.C1638980ski;
import X.C1639000skk;
import X.C1639010skl;
import X.C1639020skm;
import X.C1639030skn;
import X.C1639040sko;
import X.C1639060skq;
import X.C1639070skr;
import X.C1639080sks;
import X.C1639090skt;
import X.C1639100sku;
import X.C1639160sl0;
import X.C1639170sl1;
import X.C1664770tQJ;
import X.C194561119z;
import X.C1954807lC;
import X.C1DRG;
import X.C2217381BqS;
import X.C2252331DDr;
import X.C23250099c;
import X.C560530Lyd;
import X.C861640Xr8;
import X.InterfaceC1441305kZ;
import X.InterfaceC1624240sMw;
import X.InterfaceC1624480sNK;
import X.InterfaceC1627350sRx;
import X.InterfaceC1628180sTI;
import X.InterfaceC1628970sUZ;
import X.InterfaceC1635700sfQ;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC579050MnP;
import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import uuk.l;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectInfoViewModel extends LifecycleAwareViewModel<EffectInfoPanelState> implements InterfaceC1624240sMw, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final C1DRG LLILZLL;
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC579050MnP.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1635700sfQ.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1628180sTI.class, null);
    public final InterfaceC1624480sNK LLJILJIL;
    public final InterfaceC1628970sUZ LLJILJILJ;
    public final C05YC<AbstractC1638990skj> LLJILLL;
    public final C560530Lyd<AbstractC1639150skz> LLJJ;
    public final InterfaceC1441305kZ<AbstractC1638950skf> LLJJI;
    public final LiveEvent<AbstractC1639150skz> LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectInfoViewModel.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EffectInfoViewModel.class, "stickerPanelApiComponent", "getStickerPanelApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(EffectInfoViewModel.class, "effectDiscoverApiComponent", "getEffectDiscoverApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/effectdiscover/EffectDiscoverApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(EffectInfoViewModel.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(EffectInfoViewModel.class, "favoriteProcessor", "getFavoriteProcessor()Lcom/ss/android/ugc/aweme/sticker/favorite/FavoriteStickerProcessor;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJJIJIIJIL = 8;
    }

    private final InterfaceC1635700sfQ lR2() {
        return (InterfaceC1635700sfQ) this.LLJ.getValue(this, LLJJIJI[2]);
    }

    private final InterfaceC579050MnP pR2() {
        return (InterfaceC579050MnP) this.LLIZLLLIL.getValue(this, LLJJIJI[1]);
    }

    private final void tR2() {
        withState(new AwS601S0100000_22(this, 253));
    }

    private final void uR2() {
        withState(new AwS601S0100000_22(this, 254));
    }

    private final void vR2() {
        withState(new AwS601S0100000_22(this, 255));
    }

    private final void wR2() {
        withState(new AwS601S0100000_22(this, 256));
    }

    public final void CR2() {
        InterfaceC1627350sRx stickerRepository;
        InterfaceC1624480sNK interfaceC1624480sNK = this.LLJILJIL;
        if (interfaceC1624480sNK == null || (stickerRepository = interfaceC1624480sNK.getStickerRepository()) == null) {
            return;
        }
        stickerRepository.LIZIZ(new C1631810sZ9("sticker_category:favorite", 0, 0, 0, false, 0, null, 1022));
    }

    @Override // X.InterfaceC1624240sMw
    public void hide() {
        setStateImmediate(AFwS266S0000000_25.get$arr$(241));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public EffectInfoPanelState zQ2() {
        return new EffectInfoPanelState(null, null, null, false, false, false, false, false, false, new C194561119z());
    }

    public final InterfaceC1628180sTI mR2() {
        return (InterfaceC1628180sTI) this.LLJIJIL.getValue(this, LLJJIJI[4]);
    }

    public final ShortVideoContext nR2() {
        return (ShortVideoContext) this.LLJI.getValue(this, LLJJIJI[3]);
    }

    public final q oR2() {
        return (q) this.LLIZ.getValue(this, LLJJIJI[0]);
    }

    private final void AR2() {
        if (mR2().isLogin()) {
            withState(new AwS601S0100000_22(this, 257));
        } else {
            this.LLJJ.LJIIJ(new C1639100sku(new C1638980ski(this)));
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public void onStart() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1627350sRx stickerRepository;
        InterfaceC1628970sUZ interfaceC1628970sUZLJIILJJIL;
        l lVarLJJ;
        MutableLiveData<C1631820sZA> mutableLiveData;
        super.onStart();
        q qVarOR2 = oR2();
        if (qVarOR2 == null || (interfaceC1624480sNKC0 = qVarOR2.C0()) == null || (stickerRepository = interfaceC1624480sNKC0.getStickerRepository()) == null || (interfaceC1628970sUZLJIILJJIL = stickerRepository.LJIILJJIL()) == null || (lVarLJJ = interfaceC1628970sUZLJIILJJIL.LJJ()) == null || (mutableLiveData = lVarLJJ.LJIIJJI) == null) {
            return;
        }
        mutableLiveData.observe(this, new AObserverS227S0100000_25(this, 38));
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    public final LiveEvent<AbstractC1639150skz> qR2() {
        return this.LLJJIII;
    }

    public EffectInfoViewModel(C1DRG c1drg) {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1628970sUZ interfaceC1628970sUZLJIILJJIL;
        InterfaceC1627350sRx stickerRepository;
        this.LLILZLL = c1drg;
        q qVarOR2 = oR2();
        if (qVarOR2 != null) {
            interfaceC1624480sNKC0 = qVarOR2.C0();
        } else {
            interfaceC1624480sNKC0 = null;
        }
        this.LLJILJIL = interfaceC1624480sNKC0;
        if (interfaceC1624480sNKC0 != null && (stickerRepository = interfaceC1624480sNKC0.getStickerRepository()) != null) {
            interfaceC1628970sUZLJIILJJIL = stickerRepository.LJIILJJIL();
        } else {
            interfaceC1628970sUZLJIILJJIL = null;
        }
        this.LLJILJILJ = interfaceC1628970sUZLJIILJJIL;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJILLL = c2252331DDrLIZIZ;
        C560530Lyd<AbstractC1639150skz> c560530Lyd = new C560530Lyd<>();
        this.LLJJ = c560530Lyd;
        this.LLJJI = new AObjectS246S0100000_25(this, 292);
        this.LLJJIII = c560530Lyd;
        C09IC.LJJI(ViewModelKt.getViewModelScope(this), new C861640Xr8(new C1408830mlV(this, null), c2252331DDrLIZIZ));
    }

    public final void BR2(AbstractC1638990skj abstractC1638990skj) {
        if (abstractC1638990skj instanceof C1639060skq) {
            withState(new AwS604S0100000_25(this, 304));
            wR2();
            return;
        }
        if (abstractC1638990skj instanceof C1639030skn) {
            AR2();
            uR2();
            return;
        }
        if (abstractC1638990skj instanceof C1639010skl) {
            this.LLJJ.LJIIIZ(C1639160sl0.LIZ);
            InterfaceC579050MnP interfaceC579050MnPPR2 = pR2();
            if (interfaceC579050MnPPR2 != null) {
                interfaceC579050MnPPR2.My0(false, false);
            }
            setStateImmediate(AFwS266S0000000_25.get$arr$(243));
            tR2();
            return;
        }
        if (abstractC1638990skj instanceof C1639000skk) {
            withState(new AwS604S0100000_25(this, 305));
            return;
        }
        if (abstractC1638990skj instanceof C1639080sks) {
            withState(new AwS604S0100000_25(this, 306));
            return;
        }
        if (abstractC1638990skj instanceof C1639040sko) {
            CR2();
            return;
        }
        if (abstractC1638990skj instanceof C1639070skr) {
            hide();
        } else if (abstractC1638990skj instanceof C1639020skm) {
            this.LLJJ.LJIIJ(C1639170sl1.LIZ);
        } else {
            if (abstractC1638990skj instanceof C1639090skt) {
                withState(new AwS604S0100000_25(this, 307));
                return;
            }
            throw new C1954807lC();
        }
    }

    public final void kR2(AbstractC1638990skj abstractC1638990skj) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1408840mlW(this, abstractC1638990skj, null), 3);
    }

    public final boolean rR2(Effect effect) {
        boolean z;
        if (C0CHS.LIZ() && (((effect instanceof MobileEffect) && ((MobileEffect) effect).getModerationStatus() != 3) || C1446840nko.LJ(effect) || (effect instanceof DraftEffect))) {
            z = true;
        } else {
            z = false;
        }
        C1446130njf.LIZ.getClass();
        boolean zLJFF = Intrinsics.LJFF(C1446130njf.LJFF(effect, "forbid_favorite"), "true");
        if (z || zLJFF) {
            return true;
        }
        return false;
    }

    public final boolean sR2(Effect effect) {
        if (!C0CHS.LIZ()) {
            return false;
        }
        if (!(effect instanceof MobileEffect) && !(effect instanceof DraftEffect)) {
            return false;
        }
        return true;
    }

    public final void xR2(Activity activity) {
        InterfaceC1628180sTI interfaceC1628180sTIMR2 = mR2();
        mR2().LIZJ();
        interfaceC1628180sTIMR2.LIZ(activity, "favorite_sticker", 242, null, new AwS569S0100000_25(this, 414));
    }

    public final void zR2(AbstractC1638950skf abstractC1638950skf) {
        if (abstractC1638950skf instanceof C1638940ske) {
            setStateImmediate(AFwS266S0000000_25.get$arr$(242));
            return;
        }
        throw new C1954807lC();
    }

    public final void yR2(Effect effect, boolean z) {
        NewFaceStickerBean newFaceStickerBean = new NewFaceStickerBean();
        newFaceStickerBean.id = effect.getId();
        newFaceStickerBean.isFavorite = z;
        C1440005kM.LIZ(new C1206680hVS(newFaceStickerBean));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1624240sMw
    public void NW1(Effect effect, String str, String str2) {
        InterfaceC1635700sfQ interfaceC1635700sfQLR2;
        LiveEvent<AbstractC1638950skf> liveEventKr0;
        if (!((EffectInfoPanelState) FQ2()).getWasVisible() && (interfaceC1635700sfQLR2 = lR2()) != null && (liveEventKr0 = interfaceC1635700sfQLR2.Kr0()) != null) {
            liveEventKr0.LIZ(this, this.LLJJI);
        }
        setStateImmediate(new C1638970skh(this, effect, str, str2));
        vR2();
    }
}
