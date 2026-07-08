package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C01GW;
import X.C07E5;
import X.C098200Yq;
import X.C0HHT;
import X.C0R12;
import X.C1010120cOQ;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C2217381BqS;
import X.C452501pT;
import X.C655390PnF;
import X.C655610Pnb;
import X.C657320PqM;
import X.C657440PqY;
import X.C658800Psk;
import X.C659080PtC;
import X.C687700QyG;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1011400cQU;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC435460H5s;
import X.InterfaceC494301wD;
import X.InterfaceC583720Muw;
import X.InterfaceC656730PpP;
import X.InterfaceC657510Pqf;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.viewmodel.SearchMediaPlayStateVM;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS334S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdPhotoPlayerAssem extends ReusedUISlotAssem<SearchAdPhotoPlayerAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s>, SearchComponentCenter$Player$PlayerControlAbility, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public InterfaceC656730PpP LLJLILLLLZIIL;
    public boolean LLJLLIL;
    public final InterfaceC1731706qJ LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 201));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 198));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 200));
    public final C1559260qg8 LLJLL = new C1559260qg8(new C723580SZw(this, C657440PqY.class, null), checkSupervisorPrepared());
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(142));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchAdPhotoPlayerAssem.class, "playStateVM", "getPlayStateVM()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/mediaplayer/viewmodel/SearchMediaPlayStateVM;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchAdPhotoPlayerAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchMediaPlayStateVM.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 202), null, AFwS241S0000000_10.get$arr$(138));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 199));
        this.LLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 197));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.esv;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void VV1(C657320PqM c657320PqM) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPlayerScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void qq1(C657320PqM c657320PqM) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final View LLLLLLLZIL() {
        View view = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
        return view == null ? getContentView() : view;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC656730PpP interfaceC656730PpP = this.LLJLILLLLZIIL;
        if (interfaceC656730PpP != null) {
            interfaceC656730PpP.onDestroy();
        }
    }

    public final C657440PqY op() {
        return (C657440PqY) this.LLJLL.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        try {
            C1558520qew.LJIIJ(this, SearchPlayerScope.class, SearchServiceCenter$AutoPlayAbility.class, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        InterfaceC656730PpP interfaceC656730PpP = this.LLJLILLLLZIIL;
        if (interfaceC656730PpP != null) {
            interfaceC656730PpP.unBind();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final boolean isMute() {
        return C659080PtC.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final boolean isPlaying() {
        return this.LLJLLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void Im2(InterfaceC583720Muw interfaceC583720Muw) {
        ((CopyOnWriteArrayList) this.LLJLLL.getValue()).add(interfaceC583720Muw);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void LJIILJJIL(boolean z) {
        C659080PtC.LIZJ(z ? 1 : 0);
        InterfaceC656730PpP interfaceC656730PpP = this.LLJLILLLLZIIL;
        if (interfaceC656730PpP != null) {
            interfaceC656730PpP.LJIILJJIL(z);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        try {
            C1558520qew.LJI(this, SearchPlayerScope.class, this, SearchComponentCenter$Player$PlayerControlAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        Function0<C658800Psk> function0;
        C658800Psk c658800PskInvoke;
        Function0<Unit> function02;
        InterfaceC656730PpP interfaceC656730PpP;
        int i;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL;
        Function0<C658800Psk> function03;
        final InterfaceC435460H5s interfaceC435460H5s2 = interfaceC435460H5s;
        try {
            C1558520qew.LJI(this, SearchPlayerScope.class, (InterfaceC494301wD) this.LLL.getValue(), SearchServiceCenter$AutoPlayAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C657440PqY c657440PqYOp = op();
        final C658800Psk c658800PskInvoke2 = null;
        if (c657440PqYOp != null && (function03 = c657440PqYOp.LLILLJJLI) != null) {
            c658800PskInvoke2 = function03.invoke();
        }
        InterfaceC656730PpP interfaceC656730PpPLJIJJ = C0R12.LIZIZ.LJIJJ(new InterfaceC1011400cQU(interfaceC435460H5s2, c658800PskInvoke2) { // from class: X.0Psi
            public final EnumC658790Psj LIZ;
            public final Integer LIZIZ;
            public final AFwS334S0000000_10 LIZJ;
            public final /* synthetic */ InterfaceC435460H5s LJ;

            @Override // X.InterfaceC1011400cQU
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC589020N8i
            public final C622570ObP LJIILJJIL() {
                return null;
            }

            @Override // X.InterfaceC1011350cQP
            public final ViewGroup LJFF() {
                return (ViewGroup) this.LIZLLL.LLJJLIIIJLLLLLLLZ.getValue();
            }

            @Override // X.InterfaceC1011350cQP
            public final ViewGroup LJIIJJI() {
                return (ViewGroup) this.LIZLLL.LLJL.getValue();
            }

            @Override // X.InterfaceC1011350cQP
            public final Function0<Unit> LJIIL() {
                return AFwS196S0000000_10.get$arr$(375);
            }

            @Override // X.InterfaceC1010250cOd
            public final Aweme getAweme() {
                return this.LJ.getAweme();
            }

            @Override // X.InterfaceC1010250cOd
            public final Context getContext() {
                return this.LIZLLL.getContext();
            }

            @Override // X.InterfaceC1011350cQP
            public final ViewGroup getItemView() {
                View contentView = this.LIZLLL.getContentView();
                if (contentView instanceof ViewGroup) {
                    return (ViewGroup) contentView;
                }
                return null;
            }

            @Override // X.InterfaceC1011400cQU
            public final int LJII() {
                C659080PtC.LJFF();
                return C659080PtC.LIZIZ;
            }

            @Override // X.InterfaceC1011400cQU
            public final boolean isMute() {
                return C659080PtC.LIZIZ();
            }

            @Override // X.InterfaceC1011350cQP
            public final InterfaceC1631620sYq<Aweme, String, View, Unit> LIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1011400cQU
            public final Integer LJ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1011400cQU
            public final EnumC658790Psj getSubType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1011400cQU
            public final void LIZJ(boolean z) {
                if (z) {
                    this.LIZLLL.sp(Lifecycle.State.STARTED);
                } else {
                    this.LIZLLL.sp(Lifecycle.State.RESUMED);
                }
            }

            @Override // X.InterfaceC1011400cQU
            public final void LJI(boolean z) {
                C659080PtC.LIZJ(z ? 1 : 0);
            }

            {
                EnumC658790Psj enumC658790Psj;
                AwemeRawAd awemeRawAd;
                Integer numValueOf;
                this.LJ = interfaceC435460H5s2;
                Aweme aweme = interfaceC435460H5s2.getAweme();
                this.LIZLLL.getClass();
                if (c658800PskInvoke2 != null && c658800PskInvoke2.LIZ) {
                    enumC658790Psj = EnumC658790Psj.MIXED_CREATIVE_SUB_SINGLE_CARD;
                } else if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && C1010120cOQ.LJJIIZI(awemeRawAd)) {
                    enumC658790Psj = EnumC658790Psj.OLE_PAC_SUB_CARD;
                } else {
                    enumC658790Psj = EnumC658790Psj.MIXED_CREATIVE_SUB_CARD;
                }
                this.LIZ = enumC658790Psj;
                if (c658800PskInvoke2 != null && c658800PskInvoke2.LIZ) {
                    numValueOf = Integer.valueOf(c658800PskInvoke2.LIZIZ);
                } else {
                    numValueOf = null;
                }
                this.LIZIZ = numValueOf;
                this.LIZJ = AFwS334S0000000_10.get$arr$(1);
            }
        });
        this.LLJLILLLLZIIL = interfaceC656730PpPLJIJJ;
        if (interfaceC656730PpPLJIJJ != null) {
            interfaceC656730PpPLJIJJ.bind();
        }
        AwemeRawAd awemeRawAd = interfaceC435460H5s2.getAweme().getAwemeRawAd();
        if (awemeRawAd != null && C1010120cOQ.LJIIZILJ(awemeRawAd) && (interfaceC656730PpP = this.LLJLILLLLZIIL) != null) {
            Aweme aweme = interfaceC435460H5s2.getAweme();
            if (c658800PskInvoke2 != null) {
                i = c658800PskInvoke2.LIZIZ;
            } else {
                i = 0;
            }
            String strLIZJ = C655390PnF.LIZJ(i, aweme);
            C655610Pnb c655610Pnb = C655610Pnb.LIZIZ;
            if (c655610Pnb != null && (interfaceC657510PqfLIZLLL = c655610Pnb.LIZLLL()) != null) {
                interfaceC657510PqfLIZLLL.LJIIIIZZ(strLIZJ, interfaceC656730PpP);
            }
        }
        C657440PqY c657440PqYOp2 = op();
        if (c657440PqYOp2 != null && (function02 = c657440PqYOp2.LL) != null) {
            function02.invoke();
        }
        C657440PqY c657440PqYOp3 = op();
        if (c657440PqYOp3 != null && (function0 = c657440PqYOp3.LLILLJJLI) != null && (c658800PskInvoke = function0.invoke()) != null && c658800PskInvoke.LIZ) {
            View view = (View) this.LLJLIL.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        View view2 = (View) this.LLJLIL.getValue();
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view2);
    }

    public final void sp(Lifecycle.State state) {
        Fragment fragmentLJI;
        FragmentManager fragmentManager;
        Fragment fragmentLJJJJZI;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        sAFHelper.getClass();
        if (!SAFHelper.LJJJJJ(fragmentLJI2, c19egLIZ) && !SAFHelper.LJJJJI(C724240Sb0.LJI(this), c19egLIZ) && (fragmentLJI = C724240Sb0.LJI(this)) != null && fragmentLJI.isAdded() && (fragmentManager = (FragmentManager) this.LLJZIJLIL.getValue()) != null && (fragmentLJJJJZI = fragmentManager.LJJJJZI("container")) != null) {
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LJIL(fragmentLJJJJZI, state);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void yA2(InterfaceC583720Muw interfaceC583720Muw) {
        ((CopyOnWriteArrayList) this.LLJLLL.getValue()).remove(interfaceC583720Muw);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
