package com.ss.android.ugc.aweme.music.assem.list;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C05P0;
import X.C05P1;
import X.C05YC;
import X.C09IR;
import X.C09R3;
import X.C0BVG;
import X.C1220000hqw;
import X.C1252710ihh;
import X.C127G;
import X.C13LE;
import X.C13ZC;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C2217381BqS;
import X.C259800zU;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C615950ODx;
import X.C632540OrU;
import X.C633160OsU;
import X.C634240OuE;
import X.C636150OxJ;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.InterfaceC1680500tpg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC633400Oss;
import X.InterfaceC633980Oto;
import X.InterfaceC634000Otq;
import Y.AObjectS384S0100000_9;
import android.os.Trace;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellAdd2DspViewModelCompose;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCollectIconViewModelCompose;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellFeaturedVideosIconViewModelCompose;
import com.ss.android.ugc.aweme.music.fanspotlight.profilemusictab.detail.vm.FanSpotlightProfileDetailShareVM;
import com.ss.android.ugc.aweme.music.highlight.HighlightSharedViewModel;
import com.ss.android.ugc.aweme.music.vm.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicHighlightBackgroundViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS121S0201000_9;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicListComposableAssem extends UiComposableAssem<C632540OrU> implements InterfaceC633980Oto {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public volatile int LLJIJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final C736950SvV LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C736950SvV LLJJJ;
    public final C05YC<Unit> LLJJJIL;
    public final C01GW LLJJJJ;
    public boolean LLJJJJJIL;
    public final C05P0 LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public ViewModelProvider.Factory LLJL;
    public final C05YC<Boolean> LLJI = C09IR.LIZIZ(0, 1, null, 5);
    public final C1559260qg8 LLJILJIL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicListComposableAssem.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicListComposableAssem.class, "musicPlayModel", "getMusicPlayModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MusicListComposableAssem.class, "legacyVM", "getLegacyVM()Lcom/ss/android/ugc/aweme/music/vm/LegacyCommunicateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(MusicListComposableAssem.class, "collectIconViewModelCompose", "getCollectIconViewModelCompose()Lcom/ss/android/ugc/aweme/music/assem/list/cell/compose/MusicCellCollectIconViewModelCompose;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(MusicListComposableAssem.class, "highlightBackgroundViewModel", "getHighlightBackgroundViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicHighlightBackgroundViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(MusicListComposableAssem.class, "musicCellAdd2DspViewModelCompose", "getMusicCellAdd2DspViewModelCompose()Lcom/ss/android/ugc/aweme/music/assem/list/cell/compose/MusicCellAdd2DspViewModelCompose;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(MusicListComposableAssem.class, "featuredVideosIconViewModel", "getFeaturedVideosIconViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/compose/MusicCellFeaturedVideosIconViewModelCompose;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJLILLLLZIIL = 8;
    }

    private final void Fp() {
        AssemViewModel assemViewModel;
        OriginMusicListViewModel originMusicListViewModelAp = Ap();
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelAp, new C2217381BqS() { // from class: X.0Osb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(22), 4);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelAp, new C2217381BqS() { // from class: X.0OsW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C632540OrU) obj).LL);
            }
        }, null, new AwS623S0100000_9(this, 101), 6);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelAp, new C2217381BqS() { // from class: X.0OsX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(19), 4);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelAp, new C2217381BqS() { // from class: X.0Osl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 96), 4);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelAp, new C2217381BqS() { // from class: X.0OsY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 100), 4);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelAp, new C2217381BqS() { // from class: X.0Osa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS445S0200000_9(originMusicListViewModelAp, this, 11), 4);
        LegacyCommunicateViewModel legacyCommunicateViewModelZp = zp();
        C736680Sv4.LJIIIIZZ(this, legacyCommunicateViewModelZp, new C2217381BqS() { // from class: X.0OtE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C633640OtG) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 97), 4);
        C736680Sv4.LJIIIIZZ(this, legacyCommunicateViewModelZp, new C2217381BqS() { // from class: X.0OtH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C633640OtG) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 98), 4);
        HighlightSharedViewModel highlightSharedViewModelTp = tp();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C736680Sv4.LJIIIIZZ(this, highlightSharedViewModelTp, new C2217381BqS() { // from class: X.0OsZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C631810OqJ) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS445S0200000_9(this, (MusicListComposableAssem) c259800zU, (C259800zU<String>) 10), 4);
        Object objLp = lp();
        if ((objLp instanceof AssemViewModel) && (assemViewModel = (AssemViewModel) objLp) != null) {
            C736680Sv4.LJIIIIZZ(this, assemViewModel, new C2217381BqS() { // from class: X.0Osr
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C230300uj) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(20), 4);
            C736680Sv4.LJIIIIZZ(this, assemViewModel, new C2217381BqS() { // from class: X.0Osp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C230300uj) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 99), 4);
        }
        C1252710ihh.LJIIJ(this, C13LE.LIZ(InterfaceC634000Otq.class), new C2217381BqS() { // from class: X.0Oq8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C631640Oq2) obj).LJII;
            }
        }, new AwS588S0100000_9(this, 263));
        if (C0BVG.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Oqc
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C631690Oq7) obj).LLILLL;
                }
            }, null, AFwS292S0000000_9.get$arr$(21), 6);
        }
    }

    private Function0 Qp() {
        return new AObjectS384S0100000_9(this, 14);
    }

    private Function0 Tp() {
        return new AObjectS384S0100000_9(this, 15);
    }

    private Function0 hp() {
        return new AObjectS384S0100000_9(this, 16);
    }

    @Override // X.InterfaceC633980Oto, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    public MusicListComposableAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 944), AFwS240S0000000_9.get$arr$(428), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 931), AFwS240S0000000_9.get$arr$(429), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(LegacyCommunicateViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 932), AFwS240S0000000_9.get$arr$(430), null, true);
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(218);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(HighlightSharedViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(432);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9((AbstractC738140SxQ) this, 935);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJI = new C736950SvV(c19719912DlLIZ4, aFwS195S0000000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, awS553S0100000_9, c451610HnL, c723700Sa8);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(MusicCellCollectIconViewModelCompose.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ5, 933), AFwS240S0000000_9.get$arr$(431), null, true);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(MusicHighlightBackgroundViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ6, 934), AFwS240S0000000_9.get$arr$(434), null, true);
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(MusicCellAdd2DspViewModelCompose.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ7), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ7, 942), AFwS240S0000000_9.get$arr$(435), null, true);
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(MusicCellFeaturedVideosIconViewModelCompose.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ8), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ8, 943), AFwS240S0000000_9.get$arr$(436), null, true);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(this, 939);
        this.LLJJJ = new C736950SvV(C13LE.LIZ(FanSpotlightProfileDetailShareVM.class), awS553S0100000_92, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(433), new AwS553S0100000_9((AbstractC738140SxQ) this, 936), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJIL = C09IR.LIZIZ(0, 1, null, 5);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 940));
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = C20028913Yh.LJI(Boolean.FALSE);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 941));
    }

    private final MusicCellAdd2DspViewModelCompose Bp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (MusicCellAdd2DspViewModelCompose) assemVMLazy.getValue();
    }

    private final MusicCellCollectIconViewModelCompose ip() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (MusicCellCollectIconViewModelCompose) assemVMLazy.getValue();
    }

    private final FanSpotlightProfileDetailShareVM kp() {
        return (FanSpotlightProfileDetailShareVM) this.LLJJJ.getValue();
    }

    private final MusicCellFeaturedVideosIconViewModelCompose mp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (MusicCellFeaturedVideosIconViewModelCompose) assemVMLazy.getValue();
    }

    private final MusicHighlightBackgroundViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (MusicHighlightBackgroundViewModel) assemVMLazy.getValue();
    }

    private final HighlightSharedViewModel tp() {
        return (HighlightSharedViewModel) this.LLJJI.getValue();
    }

    private final LegacyCommunicateViewModel zp() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (LegacyCommunicateViewModel) assemVMLazy.getValue();
    }

    public final OriginMusicListViewModel Ap() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (OriginMusicListViewModel) assemVMLazy.getValue();
    }

    public final MusicPlayViewModel Ep() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (MusicPlayViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC633980Oto
    public void K() {
        if (!this.LLILZ || this.LLJIJIL <= 0) {
            return;
        }
        this.LLJI.LIZJ(Boolean.TRUE);
    }

    @Override // X.InterfaceC633980Oto
    public View LJJLIIIJILLIZJL() {
        if (this.LLILZ) {
            return yp();
        }
        return null;
    }

    @Override // X.InterfaceC633980Oto
    public boolean W0() {
        if (!this.LLILZ) {
            return false;
        }
        if (this.LLJIJIL > 0) {
            this.LLJI.LIZJ(Boolean.FALSE);
        }
        Ap().refresh();
        return true;
    }

    @Override // X.InterfaceC633980Oto
    public boolean isEmpty() {
        return this.LLILZ && this.LLJIJIL <= 0;
    }

    public final InterfaceC633400Oss lp() {
        return (InterfaceC633400Oss) this.LLJJJJ.getValue();
    }

    public final boolean op() {
        return ((Boolean) this.LLJJJJLIIL.getValue()).booleanValue();
    }

    public final OriginMusicArg up() {
        return (OriginMusicArg) this.LLJILJIL.getValue();
    }

    public final C633160OsU yp() {
        return (C633160OsU) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        ViewModelProvider.Factory factory = this.LLJL;
        if (factory == null) {
            synchronized (this) {
                factory = this.LLJL;
                if (factory == null) {
                    C127G c127g = new C127G(new Object[]{OriginMusicListViewModel.class, Qp(), MusicPlayViewModel.class, Tp(), MusicCellCollectIconViewModelCompose.class, hp()}, defaultViewModelProviderFactory);
                    this.LLJL = c127g;
                    return c127g;
                }
            }
        }
        return factory;
    }

    @Override // X.InterfaceC633980Oto
    public boolean LJLLL() {
        return this.LLJJJJJIL;
    }

    public static MusicCellCollectIconViewModelCompose Gp(MusicListComposableAssem musicListComposableAssem) {
        return new MusicCellCollectIconViewModelCompose();
    }

    public static OriginMusicListViewModel Ip(MusicListComposableAssem musicListComposableAssem) {
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static MusicPlayViewModel Jp(MusicListComposableAssem musicListComposableAssem) {
        return new MusicPlayViewModel();
    }

    public static final boolean Vo(C05P0<Boolean> c05p0) {
        return c05p0.getValue().booleanValue();
    }

    public static final boolean ap(C05P0<Boolean> c05p0) {
        return c05p0.getValue().booleanValue();
    }

    public static final boolean cp(C05P1<Boolean> c05p1) {
        return c05p1.getValue().booleanValue();
    }

    public final void ca1(boolean z) {
        this.LLJJJJLIIL.setValue(Boolean.valueOf(z));
    }

    @Override // tiktok.compose.assem.UiComposableAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        Fp();
    }

    public static final void Zo(C05P0<Boolean> c05p0, boolean z) {
        c05p0.setValue(Boolean.valueOf(z));
    }

    public static final void bp(C05P0<Boolean> c05p0, boolean z) {
        c05p0.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo(X.C632540OrU r6, X.InterfaceC1680500tpg r7, int r8) {
        /*
            r5 = this;
            r0 = -15004836(0xffffffffff1b0b5c, float:-2.0608932E38)
            X.13ZC r4 = r7.LJIIJ(r0)
            r0 = r8 & 6
            if (r0 != 0) goto L7d
            boolean r0 = r4.LJII(r6)
            if (r0 == 0) goto L7b
            r1 = 4
        L12:
            r1 = r1 | r8
        L13:
            r0 = r8 & 48
            if (r0 != 0) goto L20
            boolean r0 = r4.LJII(r5)
            if (r0 == 0) goto L78
            r0 = 32
        L1f:
            r1 = r1 | r0
        L20:
            r1 = r1 & 19
            r0 = 18
            if (r1 != r0) goto L3e
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L3e
            r4.LIZJ()
        L2f:
            X.13Ys r2 = r4.LJJJJZI()
            if (r2 == 0) goto L3d
            kotlin.jvm.internal.AwS121S0201000_9 r1 = new kotlin.jvm.internal.AwS121S0201000_9
            r0 = 0
            r1.<init>(r5, r6, r8, r0)
            r2.LIZLLL = r1
        L3d:
            return
        L3e:
            r6.getClass()
            X.0Ojc r0 = r6.getListState()
            java.util.List<ITEM> r3 = r0.LLILZ
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            boolean r2 = r4.LJII(r6)
            boolean r0 = r4.LJII(r5)
            r2 = r2 | r0
            java.lang.Object r1 = r4.LJJ()
            if (r2 != 0) goto L65
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L6e
        L65:
            X.0Or9 r1 = new X.0Or9
            r0 = 0
            r1.<init>(r6, r5, r0)
            r4.LJJIJIIJI(r1)
        L6e:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0 = 0
            r4.LJJJJL(r0)
            X.C1680540tpk.LJFF(r3, r1, r4)
            goto L2f
        L78:
            r0 = 16
            goto L1f
        L7b:
            r1 = 2
            goto L12
        L7d:
            r1 = r8
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem.Oo(X.0OrU, X.0tpg, int):void");
    }

    @Override // tiktok.compose.assem.UiComposableAssem
    /* JADX INFO: renamed from: ep, reason: merged with bridge method [inline-methods] */
    public void Co(C632540OrU c632540OrU, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1813058232);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c632540OrU)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Trace.beginSection("zprofile_music_tab");
            try {
                C636150OxJ<InterfaceC1891350zJl> c636150OxJLIZ = C634240OuE.LIZ(Ap(), c13zcLJIIJ, 0);
                Oo(c632540OrU, c13zcLJIIJ, (i2 & 14) | (i2 & 112));
                c13zcLJIIJ.LJJIIJZLJL(1407767949);
                Trace.beginSection("zprofile_music_tab:recompose");
                int i5 = i2 << 3;
                try {
                    So(c636150OxJLIZ, c632540OrU, c13zcLJIIJ, (i5 & 896) | (i5 & 112) | 8);
                    Trace.endSection();
                    c13zcLJIIJ.LJJJJL(false);
                    Trace.endSection();
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                    Trace.endSection();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS121S0201000_9(this, c632540OrU, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x03fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void So(X.C636150OxJ<X.InterfaceC1891350zJl> r35, X.C632540OrU r36, X.InterfaceC1680500tpg r37, int r38) {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem.So(X.0OxJ, X.0OrU, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[Catch: all -> 0x00f8, TryCatch #3 {all -> 0x00f8, blocks: (B:42:0x00bf, B:44:0x00d3, B:47:0x00e4, B:46:0x00dc), top: B:99:0x00bf, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dp(X.InterfaceC1891350zJl r14, int r15, X.InterfaceC1680500tpg r16, int r17) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem.dp(X.0zJl, int, X.0tpg, int):void");
    }
}
