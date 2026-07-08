package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C01GW;
import X.C07E5;
import X.C07P0;
import X.C098200Yq;
import X.C0PRC;
import X.C0SVP;
import X.C1011980cRQ;
import X.C1012300cRw;
import X.C1558520qew;
import X.C1559260qg8;
import X.C189200o6;
import X.C19EG;
import X.C20684815ws;
import X.C2174741A9g;
import X.C2344009Gk;
import X.C2367809Po;
import X.C301290BrT;
import X.C427690Gpr;
import X.C452501pT;
import X.C646370PWx;
import X.C657340PqO;
import X.C659060PtA;
import X.C659080PtC;
import X.C661470Px3;
import X.C663180Pzo;
import X.C723580SZw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1012120cRe;
import X.EnumC655500PnQ;
import X.InterfaceC1294060jmO;
import X.InterfaceC1399350mWD;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC583720Muw;
import X.InterfaceC655270Pn3;
import X.InterfaceC661540PxA;
import X.InterfaceC712990Rxx;
import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardPlayerSoundIconAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class SearchCardPlayerSoundIconAssem extends ReusedUISlotAssem<SearchCardPlayerSoundIconAssem> implements View.OnAttachStateChangeListener, InterfaceC1399350mWD, InterfaceC712990Rxx<InterfaceC435460H5s> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C657340PqO.class, null), checkSupervisorPrepared());
    public final ArrayList<Function1<Boolean, Unit>> LLJL = new ArrayList<>();
    public final ArrayList<Function0<Unit>> LLJLIL = new ArrayList<>();
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 218));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 217));
    public SearchComponentCenter$Player$PlayerControlAbility LLJLLIL;
    public Aweme LLJLLL;

    @Override // X.InterfaceC1399350mWD
    public final /* synthetic */ boolean Fi() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.euv;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        try {
            C1558520qew.LJIIJ(this, SearchPlayerScope.class, SearchComponentCenter.SoundIcon.SoundIconAbility.class, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final Map<String, String> op() {
        String aid;
        Map<String, String> mapXE0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchContextAbility.class, null);
        if (iSearchContextAbility != null) {
            C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
            linkedHashMap.put("search_id", c0prc.LLILLL);
            linkedHashMap.put("search_keyword", c0prc.LLIZLLLIL);
            linkedHashMap.put("enter_from", ((C646370PWx) iSearchContextAbility.wO2().LIZJ()).LLILLL);
            linkedHashMap.put("search_type", "general");
            linkedHashMap.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        }
        SearchServiceCenter$MobAbility searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchServiceCenter$MobAbility.class, null);
        String str = "";
        if (searchServiceCenter$MobAbility != null && (mapXE0 = searchServiceCenter$MobAbility.XE0()) != null) {
            String str2 = mapXE0.get("search_result_id");
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("search_result_id", str2);
        }
        Aweme aweme = this.LLJLLL;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str = aid;
        }
        linkedHashMap.put("group_id", str);
        return linkedHashMap;
    }

    public final TuxIconView sp() {
        return (TuxIconView) this.LLJLL.getValue();
    }

    public final C1012300cRw tp() {
        return (C1012300cRw) this.LLJLILLLLZIIL.getValue();
    }

    public final boolean up() {
        C657340PqO c657340PqO = (C657340PqO) this.LLJJLIIIJLLLLLLLZ.getValue();
        return c657340PqO != null && c657340PqO.LL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view, c19egLIZ);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.registerActivityOnKeyDownListener(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view, c19egLIZ);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.registerActivityOnKeyDownListener(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        view.addOnAttachStateChangeListener(this);
        try {
            C1558520qew.LJI(this, SearchPlayerScope.class, new SearchComponentCenter.SoundIcon.SoundIconAbility() { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardPlayerSoundIconAssem$initAbility$1
                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.SoundIcon.SoundIconAbility
                public final void fv1(AwS589S0100000_10 awS589S0100000_10) {
                    this.LL.LLJL.add(awS589S0100000_10);
                }
            }, SearchComponentCenter.SoundIcon.SoundIconAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C786410Ut5.r1(tp(), 8);
        C786410Ut5.Ja(tp(), new ACListenerS145S0100000_10(this, 42));
        if (up()) {
            C427690Gpr.LJI(sp(), null);
            C786410Ut5.a9(sp(), new ACListenerS145S0100000_10(this, 43));
        }
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class, null);
        this.LLJLLIL = searchComponentCenter$Player$PlayerControlAbility;
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            searchComponentCenter$Player$PlayerControlAbility.Im2(new InterfaceC583720Muw() { // from class: X.0Pr2
                @Override // X.InterfaceC583720Muw
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC583720Muw
                public final void LJII() {
                }

                @Override // X.InterfaceC583720Muw
                public final void onBuffering(boolean z) {
                }

                @Override // X.InterfaceC583720Muw
                public final void onLoading() {
                }

                @Override // X.InterfaceC583720Muw
                public final void LIZ() {
                    C786410Ut5.r1(this.LIZ.tp(), 8);
                    if (this.LIZ.up() && C2367809Po.LIZ()) {
                        C786410Ut5.LLLLLLZZ(this.LIZ.sp(), 8);
                    }
                }

                @Override // X.InterfaceC583720Muw
                public final void LIZJ() {
                    C786410Ut5.r1(this.LIZ.tp(), 8);
                    if (this.LIZ.up() && C2367809Po.LIZ()) {
                        C786410Ut5.LLLLLLZZ(this.LIZ.sp(), 8);
                    }
                }

                @Override // X.InterfaceC583720Muw
                public final void LJJZ() {
                    C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
                    C659080PtC.LJFF();
                    int i = C659080PtC.LIZIZ;
                    c1011980cRQ.getClass();
                    EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(i);
                    if (enumC1012120cReLIZ != null) {
                        this.LIZ.tp().LIZ(enumC1012120cReLIZ, false);
                    }
                    if (this.LIZ.up() || !C07P0.LIZIZ()) {
                        C659060PtA c659060PtA = C659060PtA.LIZ;
                        SearchCardPlayerSoundIconAssem searchCardPlayerSoundIconAssem = this.LIZ;
                        C659060PtA.LIZLLL(c659060PtA, searchCardPlayerSoundIconAssem.LLJLLL, searchCardPlayerSoundIconAssem.tp(), this.LIZ.sp(), null, this.LIZ.op(), 8);
                    } else {
                        C786410Ut5.r1(this.LIZ.tp(), 0);
                    }
                    SearchCardPlayerSoundIconAssem searchCardPlayerSoundIconAssem2 = this.LIZ;
                    SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility2 = searchCardPlayerSoundIconAssem2.LLJLLIL;
                    if (searchComponentCenter$Player$PlayerControlAbility2 != null) {
                        searchComponentCenter$Player$PlayerControlAbility2.LJIILJJIL(C659080PtC.LIZ(C07P0.LIZIZ() ? 1 : 0, 0, searchCardPlayerSoundIconAssem2.LLJLLL));
                    }
                }

                @Override // X.InterfaceC583720Muw
                public final void onPause() {
                    C786410Ut5.r1(this.LIZ.tp(), 8);
                    if (this.LIZ.up() && C2367809Po.LIZ()) {
                        C786410Ut5.LLLLLLZZ(this.LIZ.sp(), 8);
                    }
                }
            });
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view, c19egLIZ);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(this);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        Aweme aweme = interfaceC435460H5s.getAweme();
        this.LLJLLL = aweme;
        C659060PtA.LIZJ(C659060PtA.LIZ, aweme, C2367809Po.LIZ(), tp(), sp(), null, op(), 16);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    public final void yp(EnumC655500PnQ enumC655500PnQ) {
        C661470Px3 c661470Px3;
        InterfaceC661540PxA interfaceC661540PxA;
        Map<String, String> mapXE0;
        String str;
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILJJIL()) {
            C659080PtC.LIZ = false;
            c2174741A9g.LJIILL("general_search", enumC655500PnQ, C0SVP.STYLE_NO_BUTTON);
        }
        int i = !C659080PtC.LIZIZ() ? 1 : 0;
        C659080PtC.LIZJ(i);
        boolean zLIZ = C659080PtC.LIZ(C07P0.LIZIZ() ? 1 : 0, 0, this.LLJLLL);
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = this.LLJLLIL;
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            searchComponentCenter$Player$PlayerControlAbility.LJIILJJIL(zLIZ);
        }
        C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
        C659080PtC.LJFF();
        int i2 = C659080PtC.LIZIZ;
        c1011980cRQ.getClass();
        EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(i2);
        if (enumC1012120cReLIZ != null) {
            tp().LIZ(enumC1012120cReLIZ, false);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        View viewLLLLLLLZIL = null;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchContextAbility.class, null);
        if (iSearchContextAbility != null) {
            C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
            c2344009Gk.LJFF("search_id", c0prc.LLILLL);
            c2344009Gk.LJFF("search_keyword", c0prc.LLIZLLLIL);
            c2344009Gk.LJFF("enter_from", ((C646370PWx) iSearchContextAbility.wO2().LIZJ()).LLILLL);
            c2344009Gk.LJFF("search_type", "general");
            c2344009Gk.LIZJ(0, "is_fullscreen");
            if (C659080PtC.LIZIZ()) {
                str = "off";
            } else {
                str = "on";
            }
            c2344009Gk.LJFF("switch_status", str);
        }
        SearchServiceCenter$MobAbility searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchServiceCenter$MobAbility.class, null);
        if (searchServiceCenter$MobAbility != null && (mapXE0 = searchServiceCenter$MobAbility.XE0()) != null) {
            c2344009Gk.LJFF("search_result_id", mapXE0.get("search_result_id"));
            c2344009Gk.LJFF("token_type", mapXE0.get("token_type"));
        }
        C20684815ws.LJIILLIIL("sounds_switch_click", c2344009Gk.LIZ);
        Iterator<Function1<Boolean, Unit>> it2 = this.LLJL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Boolean.valueOf(!zLIZ));
        }
        if (up()) {
            C659060PtA.LIZLLL(C659060PtA.LIZ, this.LLJLLL, tp(), sp(), null, op(), 8);
        }
        if (C663180Pzo.LJI() && C301290BrT.LIZIZ() && i == 0) {
            SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility2 = this.LLJLLIL;
            if (searchComponentCenter$Player$PlayerControlAbility2 != null) {
                viewLLLLLLLZIL = searchComponentCenter$Player$PlayerControlAbility2.LLLLLLLZIL();
            }
            if ((viewLLLLLLLZIL instanceof C661470Px3) && (c661470Px3 = (C661470Px3) viewLLLLLLLZIL) != null && (interfaceC661540PxA = c661470Px3.LLJ) != null) {
                interfaceC661540PxA.LIZ();
            }
        }
        Aweme aweme = this.LLJLLL;
        if (aweme != null) {
            C663180Pzo c663180Pzo = C663180Pzo.LIZ;
            String aid = aweme.getAid();
            c663180Pzo.getClass();
            C663180Pzo.LJII(i, aid);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC1399350mWD
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        EnumC655500PnQ enumC655500PnQ;
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = this.LLJLLIL;
        if (searchComponentCenter$Player$PlayerControlAbility != null && searchComponentCenter$Player$PlayerControlAbility.isPlaying() && C2174741A9g.LIZIZ.LJIILJJIL()) {
            if (i != 24) {
                if (i == 25) {
                    enumC655500PnQ = EnumC655500PnQ.TURN_DOWN_VOLUME;
                }
            } else {
                enumC655500PnQ = EnumC655500PnQ.TURN_UP_VOLUME;
            }
            yp(enumC655500PnQ);
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
