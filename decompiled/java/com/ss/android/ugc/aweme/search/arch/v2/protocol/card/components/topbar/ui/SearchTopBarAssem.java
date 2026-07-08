package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.ui;

import X.AbstractC1585810rMx;
import X.C019F;
import X.C01GW;
import X.C07BI;
import X.C07E5;
import X.C09R3;
import X.C09U0;
import X.C0BC4;
import X.C0HU6;
import X.C0HV5;
import X.C0HXV;
import X.C0P7K;
import X.C0P92;
import X.C0PGO;
import X.C0PGP;
import X.C0PO5;
import X.C0PRC;
import X.C0PRV;
import X.C0PSW;
import X.C0Q3E;
import X.C118300cf;
import X.C1342130l1v;
import X.C13IQ;
import X.C13LE;
import X.C1537720q7O;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19746312Np;
import X.C19746412Nq;
import X.C21647019ng;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C259800zU;
import X.C291290BbL;
import X.C357001a4;
import X.C418440Gaw;
import X.C430110Gtl;
import X.C452501pT;
import X.C640510PAj;
import X.C640870PBt;
import X.C640950PCb;
import X.C642000PGc;
import X.C644060POa;
import X.C648330Pbr;
import X.C650240Pew;
import X.C654040Pl4;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.EnumC19746112Nn;
import X.InterfaceC21641019mi;
import X.InterfaceC2217461Bqa;
import Y.AsS16S0110000_10;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.viewmodel.SearchHubNativeViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.ui.SearchTopBarAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.viewmodel.SearchTopBarAssemViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TopBarDisplay;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS25S0010000_10;
import kotlin.jvm.internal.AwS288S0300000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS446S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTopBarAssem extends UISlotAssem implements SearchComponentCenter.TopBarComponent.ISearchTopBarAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final AssemVMLazy LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public C1537720q7O LLJJIJIL;
    public C0PRV LLJJJ;
    public C648330Pbr LLJJJIL;
    public Function1<? super Integer, Unit> LLJJJJ;
    public Function1<? super Integer, Unit> LLJJJJJIL;
    public final AsS16S0110000_10 LLJJJJLIIL;
    public boolean LLJJL;
    public final C0PGP LLJJLIIIJLLLLLLLZ;
    public C642000PGc LLJL;
    public volatile C09U0 LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchTopBarAssem.class, "topBarAssemVM", "getTopBarAssemVM()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/topbar/viewmodel/SearchTopBarAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchTopBarAssem.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0PGP] */
    public SearchTopBarAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchTopBarAssemViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 281), AFwS241S0000000_10.get$arr$(169), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 275));
        this.LLJJJJLIIL = new AsS16S0110000_10(this, 0);
        new AbstractC1585810rMx() { // from class: X.0PGS
            public int LL;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    this.LL = 0;
                }
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                SearchTopBarAssem searchTopBarAssem = this.LLILLJJLI;
                if (searchTopBarAssem.LLJJIJIL == null && searchTopBarAssem.LLJJJ == null) {
                    return;
                }
                int iHp = searchTopBarAssem.hp();
                if (this.LLILLJJLI.getContentView().getVisibility() != 8 && iHp != 0) {
                    int i3 = 0;
                    if (i2 < 0) {
                        int i4 = this.LL + (-i2);
                        this.LL = i4;
                        if (i4 < iHp) {
                            return;
                        }
                    } else {
                        this.LL = 0;
                    }
                    int i5 = (-((int) this.LLILLJJLI.LJJIJL().getTranslationY())) + i2;
                    if (i5 >= iHp) {
                        i3 = iHp;
                    } else if (i5 >= 0) {
                        i3 = i5;
                    }
                    C786410Ut5.ed(this.LLILLJJLI.LJJIJL(), -i3);
                    this.LLILLJJLI.ip().wQ2(iHp - i3, i3);
                }
            }
        };
        this.LLJJLIIIJLLLLLLLZ = new AbstractC1585810rMx() { // from class: X.0PGP
            public long LL;
            public int LLILLJJLI;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    if (i == 1) {
                        this.LL = System.currentTimeMillis();
                        return;
                    }
                    return;
                }
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int iHp = this.LLILLL.hp();
                if (iComputeVerticalScrollOffset <= iHp && this.LLILLJJLI >= 0) {
                    recyclerView.smoothScrollBy(0, iHp - iComputeVerticalScrollOffset);
                }
                if (this.LLILLJJLI >= 0) {
                    SearchTopBarAssem searchTopBarAssem = this.LLILLL;
                    float translationY = searchTopBarAssem.LJJIJL().getTranslationY();
                    float f = iHp * (-1.0f);
                    if (translationY > f) {
                        new C21647019ng(searchTopBarAssem.LJJIJL().getContext(), searchTopBarAssem.LJJIJL(), new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(631.65f), new C1342130l1v(50.27f)), Collections.singletonList(new C19746412Nq("translationY", new C0HV5(translationY, f)))), false).LJI(true);
                    }
                    this.LLILLL.ip().wQ2(0, iHp);
                    return;
                }
                SearchTopBarAssem searchTopBarAssem2 = this.LLILLL;
                searchTopBarAssem2.mp(searchTopBarAssem2.LJJIJL().getTranslationY());
                this.LLILLL.ip().wQ2(iHp, 0);
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                SearchTopBarAssem searchTopBarAssem = this.LLILLL;
                if (searchTopBarAssem.LLJJIJIL == null && searchTopBarAssem.LLJJJ == null) {
                    return;
                }
                int iHp = searchTopBarAssem.hp();
                if (this.LLILLL.getContentView().getVisibility() != 8 && iHp != 0) {
                    this.LLILLJJLI = i2;
                    int i3 = 0;
                    if (i2 < 0) {
                        if (this.LL <= 0) {
                            this.LL = System.currentTimeMillis();
                            return;
                        } else {
                            if (System.currentTimeMillis() - this.LL < 200) {
                                return;
                            }
                            SearchTopBarAssem searchTopBarAssem2 = this.LLILLL;
                            searchTopBarAssem2.mp(searchTopBarAssem2.LJJIJL().getTranslationY());
                            this.LLILLL.ip().wQ2(iHp, 0);
                            return;
                        }
                    }
                    this.LL = 0L;
                    int i4 = (-((int) this.LLILLL.LJJIJL().getTranslationY())) + i2;
                    SearchTopBarAssem searchTopBarAssem3 = this.LLILLL;
                    if (searchTopBarAssem3.LLJJL) {
                        return;
                    }
                    if (i4 >= iHp) {
                        i3 = iHp;
                    } else if (i4 >= 0) {
                        i3 = i4;
                    }
                    C786410Ut5.ed(searchTopBarAssem3.LJJIJL(), -i3);
                    this.LLILLL.ip().wQ2(iHp - i3, i3);
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f3m;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final Map<String, Object> id1() {
        SearchTopBarStruct searchTopBarStruct;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ip().getState().LL && (searchTopBarStruct = ip().getState().LLILLL) != null) {
            String str = searchTopBarStruct.topBarId;
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("top_bar_id", str);
            Integer num = searchTopBarStruct.topBarType;
            linkedHashMap.put("top_bar_type", Integer.valueOf(num != null ? num.intValue() : -1));
            linkedHashMap.put("top_bar_keyword", ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLIZLLLIL);
        }
        return linkedHashMap;
    }

    public final SearchTopBarAssemViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (SearchTopBarAssemViewModel) assemVMLazy.getValue();
    }

    public final SearchTopFragmentAbility kp() {
        if (this.LLJJIII) {
            return null;
        }
        return (SearchTopFragmentAbility) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final void ET1() {
        ip().setStateImmediate(new AwS25S0010000_10(false, 17));
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final int Gf0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (getData() == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return 0;
        }
        return marginLayoutParams.topMargin;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final int Qc1() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i = 0;
        if (!so()) {
            return 0;
        }
        Rect rect = new Rect();
        LJJIJL().getGlobalVisibleRect(rect);
        int measuredHeight = rect.top + LJJIJL().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.bottomMargin;
        }
        return measuredHeight + i;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final int Qr() {
        Integer num;
        if (getData() == null || C291290BbL.LIZ() || (num = ip().getState().LLILZIL) == null) {
            return 0;
        }
        return num.intValue() - (ni2() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) : 0);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final boolean Uj1() {
        return ip().getState().LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final boolean WN() {
        return ip().getState().LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final void YO0() {
        RecyclerView recyclerViewLLII;
        ViewGroup viewGroup;
        C1537720q7O c1537720q7O;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        int i = 0;
        if (ip().getState().LLILLL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resetViews before childCount = ");
            View contentView = getContentView();
            sbLIZ.append((!(contentView instanceof ViewGroup) || (viewGroup3 = (ViewGroup) contentView) == null) ? null : Integer.valueOf(viewGroup3.getChildCount()));
            sbLIZ.append(" lynxContainerView = ");
            sbLIZ.append(this.LLJJJIL);
            C2188811AlT.LIZIZ(sbLIZ);
            C648330Pbr c648330Pbr = this.LLJJJIL;
            if (c648330Pbr != null) {
                View contentView2 = getContentView();
                if ((contentView2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) contentView2) != null) {
                    C786410Ut5.LJJJLZIJ(c648330Pbr, viewGroup2);
                }
            }
            this.LLJL = null;
            if (C0BC4.LIZ() && (c1537720q7O = this.LLJJIJIL) != null) {
                c1537720q7O.LLD(true);
            }
            this.LLJJIJIL = null;
            this.LLJJJIL = null;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("resetViews after childCount = ");
            View contentView3 = getContentView();
            sbLIZ2.append((!(contentView3 instanceof ViewGroup) || (viewGroup = (ViewGroup) contentView3) == null) ? null : Integer.valueOf(viewGroup.getChildCount()));
            sbLIZ2.append(" lynxContainerView = ");
            sbLIZ2.append(this.LLJJJIL);
            C2188811AlT.LIZIZ(sbLIZ2);
            SearchTopFragmentAbility searchTopFragmentAbilityKp = kp();
            if (searchTopFragmentAbilityKp != null && (recyclerViewLLII = searchTopFragmentAbilityKp.LLII()) != null) {
                C0HXV.LJFF(0, recyclerViewLLII);
            }
            SearchTopFragmentAbility searchTopFragmentAbilityKp2 = kp();
            if (searchTopFragmentAbilityKp2 != null) {
                searchTopFragmentAbilityKp2.oR(0.0f);
            }
            lp(LJJIJL());
            ip().vQ2(null);
            ip().setStateImmediate(new AwS589S0100000_10((SearchTopBarStruct) null, 583));
        }
        C644060POa c644060POa = C644060POa.LIZ;
        String str = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLIZLLLIL;
        c644060POa.getClass();
        C0PO5 c0po5LJIIIIZZ = C644060POa.LJIIIIZZ(str);
        c0po5LJIIIIZZ.getClass();
        if (!Intrinsics.LJFF(c0po5LJIIIIZZ, C640870PBt.LIZ)) {
            c0po5LJIIIIZZ.LJJLIIIJL = null;
        }
        ip().setStateImmediate(new AwS25S0010000_10(false, 15));
        SearchHubNativeViewModel searchHubNativeViewModelLIZ = C654040Pl4.LIZ(C724240Sb0.LJI(this));
        if (searchHubNativeViewModelLIZ != null) {
            searchHubNativeViewModelLIZ.LLILLL = null;
            searchHubNativeViewModelLIZ.vQ2(-1);
            searchHubNativeViewModelLIZ.LLILZ = 0L;
            searchHubNativeViewModelLIZ.LLILZIL = null;
            searchHubNativeViewModelLIZ.LLILZLL = 0.0f;
            ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
            iSearchContextAbilityLJI.fe(new C640950PCb(-1));
            iSearchContextAbilityLJI.fe(new C640510PAj(i));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final SearchTopBarStruct getData() {
        return ip().getState().LLILLL;
    }

    public final int hp() {
        SearchHubNativeViewModel searchHubNativeViewModelLIZ = C654040Pl4.LIZ(C946803n0.LIZ(LJJIJL()));
        return LJJIJL().getHeight() + (searchHubNativeViewModelLIZ != null ? (int) searchHubNativeViewModelLIZ.LLILZLL : 0);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final boolean ni2() {
        TopBarDisplay topBarDisplay;
        Integer num;
        SearchTopBarStruct data = getData();
        return (data == null || (topBarDisplay = data.topBarDisplay) == null || (num = topBarDisplay.fixedHeight) == null || num.intValue() <= 0) ? false : true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1537720q7O c1537720q7O;
        super.onDestroy();
        this.LLJL = null;
        if (C0BC4.LIZ() && (c1537720q7O = this.LLJJIJIL) != null) {
            c1537720q7O.LLD(true);
        }
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), SearchComponentCenter.TopBarComponent.ISearchTopBarAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, SearchComponentCenter.TopBarComponent.ISearchTopBarAbility.class, null, null);
        }
    }

    public final void op() {
        RecyclerView recyclerViewLLII;
        TopBarDisplay topBarDisplay;
        Integer num;
        int iLIZIZ = C650240Pew.LIZ() ? 0 : ((Boolean) C07BI.LIZ.getValue()).booleanValue() ^ true ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(ip().getState().LLJ))) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int iHp = hp();
        if (iHp <= 0) {
            SearchTopBarStruct searchTopBarStruct = ip().getState().LLILLL;
            iHp = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((searchTopBarStruct == null || (topBarDisplay = searchTopBarStruct.topBarDisplay) == null || (num = topBarDisplay.totalHeight) == null) ? 0 : num.intValue())));
        }
        Integer numValueOf = Integer.valueOf(Math.max(0, iHp - iLIZIZ));
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            SearchTopFragmentAbility searchTopFragmentAbilityKp = kp();
            int iIZ1 = searchTopFragmentAbilityKp != null ? searchTopFragmentAbilityKp.IZ1() : 0;
            SearchTopFragmentAbility searchTopFragmentAbilityKp2 = kp();
            if (searchTopFragmentAbilityKp2 == null || (recyclerViewLLII = searchTopFragmentAbilityKp2.LLII()) == null) {
                return;
            }
            C0HXV.LJFF(iIntValue + iIZ1, recyclerViewLLII);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final void wy1() {
        ip().setStateImmediate(new AwS25S0010000_10(false, 14));
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final boolean xL1() {
        return this.LLJJIJI;
    }

    public static void lp(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            C786410Ut5.W5(view, marginLayoutParams);
            if (C291290BbL.LIZ()) {
                C786410Ut5.ed(view, 0.0f);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        super.Eo(context);
        return context;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final void Lp1(AwS589S0100000_10 awS589S0100000_10) {
        this.LLJJJJ = awS589S0100000_10;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final void OM(AwS589S0100000_10 awS589S0100000_10) {
        this.LLJJJJJIL = awS589S0100000_10;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final void PL1(boolean z) {
        if (!so()) {
            return;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            LJJIJL().setClickable(false);
            if (Build.VERSION.SDK_INT >= 26) {
                LJJIJL().setFocusable(0);
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(4, LJJIJL());
        LJJIJL().setClickable(true);
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        LJJIJL().setFocusable(1);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final void We2(boolean z) {
        RecyclerView recyclerViewLLII;
        ip().setStateImmediate(new AwS25S0010000_10(true, 15));
        ip().setStateImmediate(new AwS25S0010000_10(true, 14));
        SearchTopFragmentAbility searchTopFragmentAbilityKp = kp();
        if (searchTopFragmentAbilityKp != null && (recyclerViewLLII = searchTopFragmentAbilityKp.LLII()) != null) {
            if (!z) {
                C0P7K.LIZ(recyclerViewLLII);
            }
            C430110Gtl.LIZ(recyclerViewLLII, new AwS554S0100000_10(this, 280));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final void eD(Drawable drawable) {
        LJJIJL().setBackground(drawable);
    }

    public final void mp(float f) {
        if (f >= 0.0f || this.LLJJL) {
            return;
        }
        C21647019ng c21647019ng = new C21647019ng(LJJIJL().getContext(), LJJIJL(), new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(631.65f), new C1342130l1v(50.27f)), Collections.singletonList(new C19746412Nq("translationY", new C0HV5(f, 0.0f)))), false);
        c21647019ng.LIZJ("translationY", new InterfaceC21641019mi() { // from class: X.0PGZ
            @Override // X.InterfaceC21641019mi
            public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
            }

            @Override // X.InterfaceC21641019mi
            public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                this.LIZ.LLJJL = false;
            }
        });
        this.LLJJL = true;
        c21647019ng.LJI(true);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final void oC1(boolean z) {
        C0PSW c0psw;
        if (!so()) {
            return;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
        }
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof C0PSW) && (c0psw = (C0PSW) viewLJJIJL) != null) {
            c0psw.setContainAlphaForStreamPatch(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.0PGO, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        final RecyclerView recyclerViewLLII = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            SearchTopFragmentAbility searchTopFragmentAbilityKp = kp();
            if (searchTopFragmentAbilityKp != null) {
                recyclerViewLLII = searchTopFragmentAbilityKp.LLII();
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = this;
            C357001a4.LIZ((LifecycleOwner) c259800zU.element, new AwS554S0100000_10(C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0PGU
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0PGR) obj).LLILZ;
                }
            }, C736820SvI.LJ(), new AwS288S0300000_10(this, (SearchTopBarAssem) viewGroup, (ViewGroup) c259800zU, (C259800zU<LifecycleOwner>) 1), 4), 277));
            C357001a4.LIZ((LifecycleOwner) c259800zU.element, new AwS554S0100000_10(C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0PGV
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0PGR) obj).LLIZ;
                }
            }, C736820SvI.LJ(), new AwS624S0100000_10(this, 20), 4), 278));
            LifecycleOwner lifecycleOwner = (LifecycleOwner) c259800zU.element;
            final View viewLJJIJL = LJJIJL();
            final C118300cf c118300cf = new C118300cf();
            c118300cf.element = hp();
            ?? r4 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0PGO
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    ViewGroup.MarginLayoutParams marginLayoutParams2;
                    ViewGroup.MarginLayoutParams marginLayoutParams3;
                    ViewGroup.MarginLayoutParams marginLayoutParams4;
                    SearchTopFragmentAbility searchTopFragmentAbilityKp2;
                    int i = 0;
                    if (viewLJJIJL.getVisibility() == 0) {
                        int iHp = this.hp();
                        if (c118300cf.element == iHp) {
                            if (iHp > 0) {
                                SearchTopFragmentAbility searchTopFragmentAbilityKp3 = this.kp();
                                float f = iHp;
                                if ((searchTopFragmentAbilityKp3 != null ? searchTopFragmentAbilityKp3.nj2() : 0.0f) == f || (searchTopFragmentAbilityKp2 = this.kp()) == null) {
                                    return;
                                }
                                searchTopFragmentAbilityKp2.oR(f);
                                return;
                            }
                            return;
                        }
                        Function1<? super Integer, Unit> function1 = this.LLJJJJ;
                        if (function1 != null) {
                            function1.invoke(Integer.valueOf(iHp));
                        }
                        int i2 = iHp - c118300cf.element;
                        this.op();
                        if (i2 > 0) {
                            if (c118300cf.element == 0) {
                                RecyclerView recyclerView = recyclerViewLLII;
                                if (recyclerView != null) {
                                    recyclerView.scrollBy(0, -recyclerView.getPaddingTop());
                                }
                            } else {
                                RecyclerView recyclerView2 = recyclerViewLLII;
                                if (recyclerView2 != null) {
                                    recyclerView2.scrollBy(0, -i2);
                                }
                            }
                        }
                        c118300cf.element = iHp;
                        SearchTopFragmentAbility searchTopFragmentAbilityKp4 = this.kp();
                        if (searchTopFragmentAbilityKp4 != null) {
                            searchTopFragmentAbilityKp4.oR(iHp);
                        }
                        SearchTopBarAssemViewModel searchTopBarAssemViewModelIp = this.ip();
                        ViewGroup.LayoutParams layoutParams = viewLJJIJL.getLayoutParams();
                        int i3 = ((!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) == null) ? 0 : marginLayoutParams4.topMargin) + iHp;
                        ViewGroup.LayoutParams layoutParams2 = viewLJJIJL.getLayoutParams();
                        searchTopBarAssemViewModelIp.wQ2(i3, -((!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) ? 0 : marginLayoutParams3.topMargin));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("marginTop:");
                        ViewGroup.LayoutParams layoutParams3 = viewLJJIJL.getLayoutParams();
                        sbLIZ.append((!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) == null) ? 0 : marginLayoutParams2.topMargin);
                        sbLIZ.append(", viewHeight:");
                        sbLIZ.append(iHp);
                        sbLIZ.append(", visible:");
                        ViewGroup.LayoutParams layoutParams4 = viewLJJIJL.getLayoutParams();
                        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                            i = marginLayoutParams.topMargin;
                        }
                        sbLIZ.append(iHp + i);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            };
            C357001a4.LIZ(lifecycleOwner, new AwS411S0200000_10(viewLJJIJL, (C0PGO) r4, 92));
            AwS411S0200000_10 awS411S0200000_10LIZ = C0P92.LIZ(viewLJJIJL, r4);
            if (awS411S0200000_10LIZ != null) {
                C357001a4.LIZ(lifecycleOwner, new AwS554S0100000_10(awS411S0200000_10LIZ, 1169));
            }
            C357001a4.LIZ((LifecycleOwner) c259800zU.element, new AwS554S0100000_10(C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0PGW
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0PGR) obj).LLIZLLLIL;
                }
            }, C736820SvI.LJ(), new AwS446S0200000_10(this, recyclerViewLLII, 2), 4), 279));
            C357001a4.LIZ((LifecycleOwner) c259800zU.element, new AwS554S0100000_10(C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0PGT
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0PGR) obj).LLILZLL;
                }
            }, C736820SvI.LJ(), new AwS624S0100000_10(this, 19), 4), 276));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final void px(boolean z) {
        ip().setStateImmediate(new AwS25S0010000_10(z, 16));
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    public final void yx0(int i, int i2) {
        RecyclerView recyclerViewLLII;
        boolean z;
        SearchTopFragmentAbility searchTopFragmentAbilityKp = kp();
        if (searchTopFragmentAbilityKp != null && (recyclerViewLLII = searchTopFragmentAbilityKp.LLII()) != null) {
            RecyclerView.LayoutManager layoutManager = recyclerViewLLII.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && i2 == 0) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (i >= linearLayoutManager.findFirstCompletelyVisibleItemPosition() && i <= linearLayoutManager.findLastCompletelyVisibleItemPosition()) {
                    z = true;
                } else {
                    z = false;
                }
                ip().setStateImmediate(new AwS25S0010000_10(!z, 17));
                return;
            }
            ip().setStateImmediate(new AwS25S0010000_10(true, 17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a9 A[PHI: r4
      0x01a9: PHI (r4v2 com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct) = 
      (r4v4 com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct)
      (r4v7 com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct)
     binds: [B:19:0x004d, B:107:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[PHI: r4
      0x0030: PHI (r4v5 com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct) = 
      (r4v0 com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct)
      (r4v6 com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct)
     binds: [B:112:0x01c9, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.TopBarComponent.ISearchTopBarAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Rl1(androidx.fragment.app.Fragment r8, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct r9, boolean r10, int r11) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.ui.SearchTopBarAssem.Rl1(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct, boolean, int):void");
    }
}
