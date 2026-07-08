package com.ss.android.ugc.aweme.music.assem.list;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0BVG;
import X.C0P6P;
import X.C0VWN;
import X.C1220000hqw;
import X.C1252710ihh;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C259800zU;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C615950ODx;
import X.C627260Oiy;
import X.C632540OrU;
import X.C633550Ot7;
import X.C723580SZw;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.EnumC1618420sDY;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC633400Oss;
import X.InterfaceC633980Oto;
import X.InterfaceC634000Otq;
import X.InterfaceC634580Oum;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS384S0100000_9;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCollectIconViewModelCompose;
import com.ss.android.ugc.aweme.music.highlight.HighlightSharedViewModel;
import com.ss.android.ugc.aweme.music.vm.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicListAssem extends UIListContentAssem<OriginMusicListViewModel> implements InterfaceC633980Oto, InterfaceC634580Oum {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public boolean LLJ;
    public boolean LLJI;
    public final AssemVMLazy LLJILJILJ;
    public final C736950SvV LLJILLL;
    public final C01GW LLJJ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public ViewModelProvider.Factory LLJJIJIIJIL;
    public boolean LLIZLLLIL = true;
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 925));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicListAssem.class, "legacyVM", "getLegacyVM()Lcom/ss/android/ugc/aweme/music/vm/LegacyCommunicateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MusicListAssem.class, "musicPlayModel", "getMusicPlayModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(MusicListAssem.class, "collectIconViewModelCompose", "getCollectIconViewModelCompose()Lcom/ss/android/ugc/aweme/music/assem/list/cell/compose/MusicCellCollectIconViewModelCompose;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJJ = 8;
    }

    private Function0 So() {
        return new AObjectS384S0100000_9(this, 13);
    }

    private final void ip() {
        AssemViewModel assemViewModel;
        OriginMusicListViewModel originMusicListViewModelIp = ip();
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelIp, new C2217381BqS() { // from class: X.0Osf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C632540OrU c632540OrU = (C632540OrU) obj;
                c632540OrU.getClass();
                return C627260Oiy.LIZ(c632540OrU);
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 92), 4);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelIp, new C2217381BqS() { // from class: X.0Osd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(18), 4);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelIp, new C2217381BqS() { // from class: X.0Osj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS618S0100000_4(this, 18), 4);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelIp, new C2217381BqS() { // from class: X.0Osg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C632540OrU) obj).LL);
            }
        }, null, new AwS623S0100000_9(this, 93), 6);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelIp, new C2217381BqS() { // from class: X.0Osh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS287S0000000_4.get$arr$(9), 4);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelIp, new C2217381BqS() { // from class: X.0Osk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 91), 4);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelIp, new C2217381BqS() { // from class: X.0Osc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS445S0200000_9(originMusicListViewModelIp, this, 8), 4);
        LegacyCommunicateViewModel legacyCommunicateViewModelCp = cp();
        C736680Sv4.LJIIIIZZ(this, legacyCommunicateViewModelCp, new C2217381BqS() { // from class: X.0OtD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C633640OtG) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 94), 4);
        C736680Sv4.LJIIIIZZ(this, legacyCommunicateViewModelCp, new C2217381BqS() { // from class: X.0OtF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C633640OtG) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 95), 4);
        HighlightSharedViewModel highlightSharedViewModelAp = ap();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C736680Sv4.LJIIIIZZ(this, highlightSharedViewModelAp, new C2217381BqS() { // from class: X.0Osi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C631810OqJ) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS445S0200000_9(this, (MusicListAssem) c259800zU, (C259800zU<String>) 9), 4);
        Object objZo = Zo();
        if ((objZo instanceof AssemViewModel) && (assemViewModel = (AssemViewModel) objZo) != null) {
            C736680Sv4.LJIIIIZZ(this, assemViewModel, new C2217381BqS() { // from class: X.0Osq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C230300uj) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), AFwS287S0000000_4.get$arr$(8), 4);
            C736680Sv4.LJIIIIZZ(this, assemViewModel, new C2217381BqS() { // from class: X.0Oso
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C230300uj) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 90), 4);
        }
        C1252710ihh.LJIIJ(this, C13LE.LIZ(InterfaceC634000Otq.class), new C2217381BqS() { // from class: X.0OrE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C631640Oq2) obj).LJII;
            }
        }, new AwS588S0100000_9(this, 261));
        if (C0BVG.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0OrF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C631690Oq7) obj).LLILLL;
                }
            }, null, AFwS287S0000000_4.get$arr$(10), 6);
        }
    }

    private Function0 op() {
        return new AObjectS384S0100000_9(this, 12);
    }

    private Function0 sp() {
        return new AObjectS384S0100000_9(this, 11);
    }

    @Override // X.InterfaceC633980Oto, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    public MusicListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 926), AFwS240S0000000_9.get$arr$(423), null, true);
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(217);
        this.LLJILLL = new C736950SvV(C13LE.LIZ(HighlightSharedViewModel.class), aFwS195S0000000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(427), new AwS553S0100000_9((AbstractC738140SxQ) this, 930), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 924));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LegacyCommunicateViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 927), AFwS240S0000000_9.get$arr$(424), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 928), AFwS240S0000000_9.get$arr$(425), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MusicCellCollectIconViewModelCompose.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ4, 929), AFwS240S0000000_9.get$arr$(426), null, true);
    }

    private final MusicCellCollectIconViewModelCompose Vo() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (MusicCellCollectIconViewModelCompose) assemVMLazy.getValue();
    }

    private final HighlightSharedViewModel ap() {
        return (HighlightSharedViewModel) this.LLJILLL.getValue();
    }

    private final LegacyCommunicateViewModel cp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (LegacyCommunicateViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 2;
        c20603715jn.LIZLLL = MusicFooterCell.class;
        return c20603715jn;
    }

    @Override // X.InterfaceC633980Oto
    public void K() {
        if (!this.LLILZ || Go().getChildCount() <= 0) {
            return;
        }
        Go().smoothScrollToPosition(0);
    }

    @Override // X.InterfaceC634580Oum
    public C633550Ot7 LJIIZILJ() {
        return new C633550Ot7(Go(), new C0P6P() { // from class: X.0Ose
            @Override // X.C0P6P
            public final void LJJIFFI() {
                this.LL.ip().manualListRetry(EnumC323450Cm7.Next);
            }
        });
    }

    @Override // X.InterfaceC633980Oto
    public View LJJLIIIJILLIZJL() {
        if (this.LLILZ) {
            return Go();
        }
        return null;
    }

    @Override // X.InterfaceC633980Oto
    public boolean W0() {
        if (!this.LLILZ) {
            return false;
        }
        if (Go().getChildCount() > 0) {
            Go().scrollToPosition(0);
        }
        ip().refresh();
        return true;
    }

    public final InterfaceC633400Oss Zo() {
        return (InterfaceC633400Oss) this.LLJJ.getValue();
    }

    public final OriginMusicArg bp() {
        return (OriginMusicArg) this.LLJIJIL.getValue();
    }

    public final MusicPlayViewModel dp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (MusicPlayViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: ep, reason: merged with bridge method [inline-methods] */
    public OriginMusicListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (OriginMusicListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC633980Oto
    public boolean isEmpty() {
        if (!this.LLILZ) {
            return false;
        }
        C632540OrU c632540OrU = (C632540OrU) ip().getState();
        c632540OrU.getClass();
        List listLIZ = C627260Oiy.LIZ(c632540OrU);
        return listLIZ == null || listLIZ.isEmpty();
    }

    private final void hp() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(new WrapLinearLayoutManager(viewOnAttachStateChangeListenerC20604515jvGo.getContext(), 1));
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).LIZJ("origin_music_new_fragment", EnumC1618420sDY.RECYCLER_VIEW, viewOnAttachStateChangeListenerC20604515jvGo, null, null);
        C0VWN.LIZ("profile_music_tab", false).LIZIZ(viewOnAttachStateChangeListenerC20604515jvGo);
        C2211631BhB.LJ(viewOnAttachStateChangeListenerC20604515jvGo, new AwS588S0100000_9(this, 260));
        C723850SaN.LIZLLL(this, new AwS588S0100000_9(this, 262));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        ViewModelProvider.Factory factory = this.LLJJIJIIJIL;
        if (factory == null) {
            synchronized (this) {
                factory = this.LLJJIJIIJIL;
                if (factory == null) {
                    C127G c127g = new C127G(new Object[]{OriginMusicListViewModel.class, sp(), MusicPlayViewModel.class, op(), MusicCellCollectIconViewModelCompose.class, So()}, defaultViewModelProviderFactory);
                    this.LLJJIJIIJIL = c127g;
                    return c127g;
                }
            }
        }
        return factory;
    }

    @Override // X.InterfaceC633980Oto
    public boolean LJLLL() {
        return this.LLIZLLLIL;
    }

    public static MusicCellCollectIconViewModelCompose kp(MusicListAssem musicListAssem) {
        return new MusicCellCollectIconViewModelCompose();
    }

    public static MusicPlayViewModel lp(MusicListAssem musicListAssem) {
        return new MusicPlayViewModel();
    }

    public static OriginMusicListViewModel mp(MusicListAssem musicListAssem) {
        return new OriginMusicListViewModel(new C615950ODx());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        hp();
        ip();
        List<InterfaceC1891350zJl> list = ((C632540OrU) ip().getState()).LLIZLLLIL.LLILZ;
        if (list != null && !list.isEmpty()) {
            ip().listClear();
        }
        ip().refresh();
    }
}
