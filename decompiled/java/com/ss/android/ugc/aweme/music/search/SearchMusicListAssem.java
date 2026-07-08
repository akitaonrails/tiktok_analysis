package com.ss.android.ugc.aweme.music.search;

import X.C019F;
import X.C01GW;
import X.C036E;
import X.C09R3;
import X.C0P6P;
import X.C127G;
import X.C1389890mGx;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C615960ODy;
import X.C627260Oiy;
import X.C632540OrU;
import X.C633550Ot7;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1618420sDY;
import X.InterfaceC2217461Bqa;
import X.InterfaceC633980Oto;
import X.InterfaceC634580Oum;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS384S0100000_9;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.assem.list.MusicFooterCell;
import com.ss.android.ugc.aweme.music.vm.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchMusicListAssem extends UIListContentAssem<SearchMusicListViewModel> implements InterfaceC633980Oto, InterfaceC634580Oum {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1184));
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;
    public ViewModelProvider.Factory LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMusicListAssem.class, "musicPlayModel", "getMusicPlayModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchMusicListAssem.class, "legacyVM", "getLegacyVM()Lcom/ss/android/ugc/aweme/music/vm/LegacyCommunicateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SearchMusicListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/music/search/SearchMusicListViewModel;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJIII = 8;
    }

    public SearchMusicListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicPlayViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1181), AFwS240S0000000_9.get$arr$(498), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LegacyCommunicateViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1182), AFwS240S0000000_9.get$arr$(499), null, true);
        this.LLJIJIL = true;
        this.LLJILJIL = true;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SearchMusicListViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 1183), AFwS240S0000000_9.get$arr$(500), null, true);
        this.LLJILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1178));
    }

    private Function0 dp() {
        return new AObjectS384S0100000_9(this, 21);
    }

    private Function0 hp() {
        return new AObjectS384S0100000_9(this, 20);
    }

    @Override // X.InterfaceC633980Oto, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILLL.getValue();
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
        return new C633550Ot7(Go(), new C0P6P() { // from class: X.0Ot5
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

    public final LegacyCommunicateViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (LegacyCommunicateViewModel) assemVMLazy.getValue();
    }

    public final MusicPlayViewModel Vo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (MusicPlayViewModel) assemVMLazy.getValue();
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

    public final C1749280vcc Zo() {
        return (C1749280vcc) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: ap, reason: merged with bridge method [inline-methods] */
    public SearchMusicListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (SearchMusicListViewModel) assemVMLazy.getValue();
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

    public final void ep() {
        C786410Ut5.LLLZLZ(Zo(), 0);
        C1749280vcc c1749280vccZo = Zo();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LIZ(c1722300uv6, new AwS553S0100000_9(this, 1180));
        c1749280vccZo.setStatus(c1722300uv6);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        ViewModelProvider.Factory factory = this.LLJJ;
        if (factory == null) {
            synchronized (this) {
                factory = this.LLJJ;
                if (factory == null) {
                    C127G c127g = new C127G(new Object[]{MusicPlayViewModel.class, dp(), SearchMusicListViewModel.class, hp()}, defaultViewModelProviderFactory);
                    this.LLJJ = c127g;
                    return c127g;
                }
            }
        }
        return factory;
    }

    @Override // X.InterfaceC633980Oto
    public boolean LJLLL() {
        return this.LLJILJIL;
    }

    public static boolean Oo(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static MusicPlayViewModel bp(SearchMusicListAssem searchMusicListAssem) {
        return new MusicPlayViewModel();
    }

    public static SearchMusicListViewModel cp(SearchMusicListAssem searchMusicListAssem) {
        return new SearchMusicListViewModel(new C615960ODy());
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).LIZJ("origin_music_new_fragment", EnumC1618420sDY.RECYCLER_VIEW, Go(), null, null);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getContext());
        wrapLinearLayoutManager.setOrientation(1);
        Go().setLayoutManager(wrapLinearLayoutManager);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Ot6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C632540OrU c632540OrU = (C632540OrU) obj;
                c632540OrU.getClass();
                return C627260Oiy.LIZ(c632540OrU);
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 111), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Ot0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(30), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Ot1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C632540OrU) obj).LL);
            }
        }, null, new AwS623S0100000_9(this, 112), 6);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0Ot4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C632540OrU c632540OrU = (C632540OrU) obj;
                c632540OrU.getClass();
                return C627260Oiy.LIZLLL(c632540OrU);
            }
        }, null, new AwS588S0100000_9(this, 304), new AwS553S0100000_9(this, 1179), new AwS588S0100000_9(this, 303), 2, null);
        C844470XAv.LIZ.getClass();
        if (!Oo(C844470XAv.LIZ())) {
            new C1389890mGx(view).LJIIIZ(2131837962);
        } else if (So().LLILLJJLI) {
            ip().refresh();
        }
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0Ot8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C633640OtG) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(29), 4);
    }
}
