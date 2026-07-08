package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.ui;

import X.C01GW;
import X.C03IJ;
import X.C07E5;
import X.C0PCY;
import X.C0PRC;
import X.C123100dR;
import X.C1308910kAL;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1865890yeh;
import X.C19719912Dl;
import X.C19ME;
import X.C1A5S;
import X.C1A5V;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C285450BGt;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C646370PWx;
import X.C661350Pwr;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1870830ymf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC655050Pmh;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchUIComponentScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.model.SearchInteractionModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.vm.SearchInteractionViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import g1c.AjS47S0200000_33;
import g1c.AjS73S0100000_33;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS45S0010000_33;
import kotlin.jvm.internal.AwS468S0200000_33;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class SearchTop1InteractionAssem extends ReusedUISlotAssem<SearchTop1InteractionAssem> implements InterfaceC712990Rxx<InterfaceC655050Pmh>, SearchComponentCenter.Top1Interaction.ISearchInteractAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C1865890yeh.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchTop1InteractionAssem.class, "interactionVm", "getInteractionVm()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/top1/interaction/vm/SearchInteractionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchTop1InteractionAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchInteractionViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS576S0100000_32(c19719912DlLIZ, 235), AFwS279S0000000_33.get$arr$(219), null, true);
        this.LLJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3170));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(442));
        this.LLJLL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(443));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(78));
        this.LLJLLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(77));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ev5;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1558520qew.LJI(this, SearchUIComponentScope.class, this, SearchComponentCenter.Top1Interaction.ISearchInteractAbility.class, null, null);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final Map<String, String> op() {
        String str;
        String str2;
        Function0<String> function0;
        String strInvoke;
        Function0<? extends Map<String, String>> function02;
        String str3;
        C0PCY<C646370PWx> c0pcyWO2;
        C0PCY<C0PRC> c0pcyPh1;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLJLIL.getValue();
        C0PRC c0prc = (iSearchContextAbility == null || (c0pcyPh1 = iSearchContextAbility.Ph1()) == null) ? null : (C0PRC) c0pcyPh1.LIZJ();
        ISearchContextAbility iSearchContextAbility2 = (ISearchContextAbility) this.LLJLIL.getValue();
        C646370PWx c646370PWx = (iSearchContextAbility2 == null || (c0pcyWO2 = iSearchContextAbility2.wO2()) == null) ? null : (C646370PWx) c0pcyWO2.LIZJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str4 = c0prc != null ? c0prc.LLILLL : null;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("search_id", str4);
        if (c0prc == null || (str = c0prc.LLIZLLLIL) == null) {
            str = "";
        }
        linkedHashMap.put("search_keyword", str);
        if (c646370PWx == null || (str2 = c646370PWx.LLILLL) == null) {
            str2 = "";
        }
        linkedHashMap.put("enter_from", str2);
        linkedHashMap.put("rank", String.valueOf(c646370PWx != null ? Integer.valueOf(c646370PWx.LLILZLL) : null));
        linkedHashMap.put("universal_rank", String.valueOf(c646370PWx != null ? c646370PWx.LLJILJIL : null));
        if (c646370PWx != null && (str3 = c646370PWx.LLJILJILJ) != null) {
            str5 = str3;
        }
        linkedHashMap.put("insert_type", str5);
        C1865890yeh c1865890yehTp = tp();
        if (c1865890yehTp != null && (function02 = c1865890yehTp.LLILLL) != null) {
            linkedHashMap.putAll(function02.invoke());
        }
        C1865890yeh c1865890yehTp2 = tp();
        if (c1865890yehTp2 != null && (function0 = c1865890yehTp2.LLILLJJLI) != null && (strInvoke = function0.invoke()) != null) {
            linkedHashMap.put("unique_id", strInvoke);
        }
        return linkedHashMap;
    }

    public final Drawable sp() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1e, getContentView().getContext());
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(8));
        return c384050F3z.LIZ(getContentView().getContext());
    }

    public final C1865890yeh tp() {
        return (C1865890yeh) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final SearchInteractionViewModel up() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (SearchInteractionViewModel) assemVMLazy.getValue();
    }

    public final C1A5S yp() {
        Object objLIZ = ((InterfaceC1870830ymf) this.LLJLLIL.getValue()).LIZ(zp());
        String str = objLIZ instanceof String ? (String) objLIZ : null;
        SearchInteractionModel searchInteractionModel = (SearchInteractionModel) GsonProtectorUtils.fromJson((Gson) this.LLJLLL.getValue(), str, SearchInteractionModel.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLikeStateFromStorage, stateJson =");
        sbLIZ.append(str);
        sbLIZ.append(", interactionModel = ");
        sbLIZ.append(searchInteractionModel != null ? Integer.valueOf(searchInteractionModel.likeStatus) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        Integer numValueOf = searchInteractionModel != null ? Integer.valueOf(searchInteractionModel.likeStatus) : null;
        C1A5S c1a5s = C1A5S.LIKE;
        int state = c1a5s.getState();
        if (numValueOf != null && numValueOf.intValue() == state) {
            return c1a5s;
        }
        C1A5S c1a5s2 = C1A5S.DISLIKE;
        return (numValueOf == null || numValueOf.intValue() != c1a5s2.getState()) ? C1A5S.DEFAULT : c1a5s2;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.Top1Interaction.ISearchInteractAbility
    public final void Zy() {
        up().setState(new AwS612S0100000_33(yp(), 245));
    }

    public final String zp() {
        Function0<String> function0;
        String strInvoke;
        C1865890yeh c1865890yehTp;
        Function0<String> function02;
        String strInvoke2;
        C1865890yeh c1865890yehTp2 = tp();
        if (c1865890yehTp2 == null || (function0 = c1865890yehTp2.LL) == null || (strInvoke = function0.invoke()) == null || (c1865890yehTp = tp()) == null || (function02 = c1865890yehTp.LLILLJJLI) == null || (strInvoke2 = function02.invoke()) == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("search_top1_interact_");
        sbLIZ.append(strInvoke);
        sbLIZ.append('_');
        sbLIZ.append(strInvoke2);
        sbLIZ.append('_');
        sbLIZ.append(((IAccountUserService) this.LLJLL.getValue()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.Top1Interaction.ISearchInteractAbility
    public final void Jx2(boolean z) {
        if (z) {
            C339190DRl.LIZLLL(LJJIJL());
        } else {
            C661350Pwr.LIZJ(LJJIJL());
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
        C19ME c19me;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ub1);
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.ub0);
        TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.ub2);
        tuxIconView.setBackground(sp());
        tuxIconView2.setBackground(sp());
        tuxIconView3.setBackground(sp());
        ViewGroup.LayoutParams layoutParams = tuxIconView3.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            boolean z = true;
            if (((Number) C285450BGt.LIZ.getValue()).intValue() != 1) {
                z = false;
            }
            if (z) {
                c19me.endToEnd = 0;
                c19me.startToEnd = -1;
            } else {
                c19me.startToEnd = R.id.ub0;
                c19me.endToEnd = -1;
            }
            tuxIconView3.requestLayout();
        }
        C427690Gpr.LJ(tuxIconView, C418440Gaw.LIZIZ(8));
        C427690Gpr.LJ(tuxIconView2, C418440Gaw.LIZIZ(8));
        C427690Gpr.LJ(tuxIconView3, C418440Gaw.LIZIZ(8));
        C786410Ut5.I7(new AjS73S0100000_33(this, 3), tuxIconView);
        C786410Ut5.I7(new AjS73S0100000_33(this, 4), tuxIconView2);
        C786410Ut5.I7(new AjS47S0200000_33(this, view, 0), tuxIconView3);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.1A5Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1A5X) obj).LL;
            }
        }, null, new AwS468S0200000_33(tuxIconView, tuxIconView2, 2), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.1A5W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1A5X) obj).LLILLJJLI);
            }
        }, null, new AwS647S0100000_33(tuxIconView3, 26), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.1A5Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1A5X) obj).LLILLL);
            }
        }, null, new AwS468S0200000_33(tuxIconView, tuxIconView2, 3), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC655050Pmh interfaceC655050Pmh) {
        String strInvoke;
        Function0<String> function0;
        C1865890yeh c1865890yehTp;
        Function0<Boolean> function02;
        Function0<String> function03;
        up().setState(new AwS612S0100000_33(yp(), 245));
        C1865890yeh c1865890yehTp2 = tp();
        String strInvoke2 = null;
        if (c1865890yehTp2 != null && (function03 = c1865890yehTp2.LLILZ) != null) {
            strInvoke = function03.invoke();
        } else {
            strInvoke = null;
        }
        boolean z = true;
        if (!C123100dR.LIZ(strInvoke) && ((c1865890yehTp = tp()) == null || (function02 = c1865890yehTp.LLILZIL) == null || !function02.invoke().booleanValue())) {
            z = false;
        }
        up().setState(new AwS45S0010000_33(z, 7));
        C1865890yeh c1865890yehTp3 = tp();
        if (c1865890yehTp3 != null && (function0 = c1865890yehTp3.LLILLJJLI) != null) {
            strInvoke2 = function0.invoke();
        }
        up().setState(new AwS45S0010000_33(C123100dR.LIZ(strInvoke2), 8));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC655050Pmh interfaceC655050Pmh) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC655050Pmh interfaceC655050Pmh) {
    }

    public final void Ap(C1A5S c1a5s, SearchInteractionViewModel searchInteractionViewModel) {
        SearchInteractionModel searchInteractionModel;
        searchInteractionViewModel.getClass();
        searchInteractionViewModel.setState(new AwS612S0100000_33(c1a5s, 245));
        int i = C1A5V.LIZ[c1a5s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                searchInteractionModel = new SearchInteractionModel(C1A5S.DEFAULT.getState());
            } else {
                searchInteractionModel = new SearchInteractionModel(C1A5S.DISLIKE.getState());
            }
        } else {
            searchInteractionModel = new SearchInteractionModel(C1A5S.LIKE.getState());
        }
        ((InterfaceC1870830ymf) this.LLJLLIL.getValue()).LJIIIIZZ(GsonProtectorUtils.toJson((Gson) this.LLJLLL.getValue(), searchInteractionModel, SearchInteractionModel.class), zp());
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
