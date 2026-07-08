package com.ss.android.ugc.aweme.shortvideo.effectdiscover;

import X.AbstractC1638880skY;
import X.AbstractC1638950skf;
import X.C090E;
import X.C09R3;
import X.C0LAB;
import X.C11LE;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C13LE;
import X.C1633110sbF;
import X.C1638860skW;
import X.C1638920skc;
import X.C1641640sp0;
import X.C1664770tQJ;
import X.C1701940uOG;
import X.C194561119z;
import X.C1DRG;
import X.C2217381BqS;
import X.C2341909Fp;
import X.C385670FAf;
import X.C560530Lyd;
import X.InterfaceC1487280oo2;
import X.InterfaceC1635700sfQ;
import X.InterfaceC1636820shE;
import X.InterfaceC1731706qJ;
import X.InterfaceC19483011Ki;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2342209Fs;
import X.InterfaceC379610EuV;
import Y.AfS194S0100000_25;
import Y.AkS486S0100000_25;
import androidx.lifecycle.LiveDataReactiveStreams;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponseV2;
import duk.p;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectDiscoverViewModel extends LifecycleAwareViewModel<EffectDiscoverPanelState> implements InterfaceC1635700sfQ, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C1DRG LLILZLL;
    public final C11NZ<String> LLIZ;
    public final C11NJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public long LLJIJIL;
    public final C11LE<C1641640sp0<SearchEffectResponseV2>> LLJILJIL;
    public final C11LE<C090E> LLJILJILJ;
    public final C560530Lyd<AbstractC1638950skf> LLJILLL;
    public final h0<Boolean> LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectDiscoverViewModel.class, "searchStickViewModel", "getSearchStickViewModel()Lcom/ss/android/ugc/aweme/sticker/view/internal/search/ISearchStickerViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EffectDiscoverViewModel.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIII = 8;
    }

    private final q nR2() {
        return (q) this.LLJI.getValue(this, LLJJI[1]);
    }

    @Override // X.InterfaceC1635700sfQ
    public void hide() {
        setStateImmediate(AFwS266S0000000_25.get$arr$(135));
        this.LLJJ.LJII(Boolean.FALSE);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public EffectDiscoverPanelState zQ2() {
        return new EffectDiscoverPanelState(C1638920skc.LIZ, true, "", new C194561119z());
    }

    public final InterfaceC1636820shE mR2() {
        return (InterfaceC1636820shE) this.LLJ.getValue(this, LLJJI[0]);
    }

    @Override // X.InterfaceC1635700sfQ
    public void show() {
        setStateImmediate(AFwS266S0000000_25.get$arr$(136));
        this.LLJJ.LJII(Boolean.TRUE);
        rR2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void rR2() {
        p pVarLJJJJIZL = nR2().C0().LJJJJIZL();
        int i = pVarLJJJJIZL != null ? pVarLJJJJIZL.LIZIZ : 0;
        Integer num = (Integer) nR2().C0().getStickerRepository().LJFF().LJFF().getValue();
        if (num == null || i != num.intValue()) {
            mR2().AA2(C1633110sbF.LIZ(mR2().Qq0(), i));
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.LLIZLLLIL.LJ();
    }

    @Override // X.InterfaceC1635700sfQ
    public C385670FAf<Boolean> FS() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1635700sfQ
    public LiveEvent<AbstractC1638950skf> Kr0() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    public final C11LE<C1641640sp0<SearchEffectResponseV2>> lR2() {
        return this.LLJILJIL;
    }

    public final C11LE<C090E> oR2() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1635700sfQ
    public void MB0(boolean z) {
        this.LLJJ.LJII(Boolean.valueOf(z));
    }

    public final void kR2(AbstractC1638950skf abstractC1638950skf) {
        this.LLJILLL.LJIIJ(abstractC1638950skf);
    }

    public final void pR2(AbstractC1638880skY abstractC1638880skY) {
        if (abstractC1638880skY instanceof C1638860skW) {
            withState(new AwS391S0200000_25(abstractC1638880skY, this, 56));
        } else {
            setStateImmediate(new AwS604S0100000_25(abstractC1638880skY, 149));
        }
    }

    public EffectDiscoverViewModel(C1DRG c1drg, C11NZ<String> c11nz) {
        this.LLILZLL = c1drg;
        this.LLIZ = c11nz;
        C11NJ c11nj = new C11NJ();
        this.LLIZLLLIL = c11nj;
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1636820shE.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
        C11LE<C1641640sp0<SearchEffectResponseV2>> publisher = LiveDataReactiveStreams.toPublisher(this, nR2().C0().getStickerRepository().LJFF().LJIIZILJ());
        this.LLJILJIL = publisher;
        this.LLJILJILJ = LiveDataReactiveStreams.toPublisher(this, mR2().gB0());
        this.LLJILLL = new C560530Lyd<>();
        this.LLJJ = new h0<>(Boolean.FALSE);
        c11nj.LIZ(c11nz.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0skP
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                boolean z;
                if (((String) obj).length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }).LJJIFFI().LJJLJLI(new AfS194S0100000_25(this, 11)));
        c11nj.LIZ(c11nz.LJJIFFI().LJJLJLI(new AfS194S0100000_25(this, 12)));
        c11nj.LIZ(c11nz.LJJIL(new InterfaceC19483011Ki() { // from class: X.0skU
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((String) obj).length() > 0) {
                    return true;
                }
                return false;
            }
        }).LJIL(500L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZIZ).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 13), new AfS194S0100000_25(this, 14)));
        c11nj.LIZ(C11NZ.LJJJJJ(publisher).LJJJ(new AkS486S0100000_25(this, 1), false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 15), new AfS194S0100000_25(this, 16)));
    }

    private final void qR2(String str, Function0<? extends HashMap<String, String>> function0) {
        ShortVideoContext shortVideoContext = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("music_id", shortVideoContext.getMusicId());
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        c0lab.LJ("enter_from", "video_shoot_page");
        if (function0 != null) {
            c0lab.LJI(function0.invoke());
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ(str, c0lab.LIZ);
    }
}
