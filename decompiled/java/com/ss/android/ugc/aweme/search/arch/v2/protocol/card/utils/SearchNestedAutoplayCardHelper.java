package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils;

import X.C01GW;
import X.C07BT;
import X.C098200Yq;
import X.C0T6R;
import X.C1558420qem;
import X.C1558520qew;
import X.C189200o6;
import X.C1DWE;
import X.C1DWH;
import X.C2188811AlT;
import X.C259800zU;
import X.C452501pT;
import X.C640750PBh;
import X.C650630PfZ;
import X.InterfaceC652740Piy;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC2325331G0l;
import X.ViewOnLayoutChangeListenerC2325311G0j;
import Y.AsS59S0100000_35;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class SearchNestedAutoplayCardHelper implements NestedAutoPlayCardAbility {
    public static final /* synthetic */ int LLIZ = 0;
    public final RecyclerView LL;
    public final View LLILLJJLI;
    public final C1DWH LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(244));
    public SearchServiceCenter$AutoPlayAbility LLILZIL;
    public boolean LLILZLL;

    public final void LIZ() {
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        if (this.LLILZLL && this.LLILZIL == null) {
            RecyclerView recyclerView = this.LL;
            if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2325311G0j(this, 0));
            } else {
                if (!this.LLILZLL || this.LLILZIL != null || (interfaceC652740PiyLIZIZ = this.LLILLL.LIZIZ(this.LL, 0, LIZIZ().keySet())) == null || (searchServiceCenter$AutoPlayAbility = LIZIZ().get(interfaceC652740PiyLIZIZ)) == null) {
                    return;
                }
                LIZLLL(searchServiceCenter$AutoPlayAbility);
            }
        }
    }

    public final HashMap<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> LIZIZ() {
        return (HashMap) this.LLILZ.getValue();
    }

    public final void LIZLLL(SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2;
        if (!this.LLILZLL) {
            this.LLILZIL = searchServiceCenter$AutoPlayAbility;
            return;
        }
        if (!Intrinsics.LJFF(this.LLILZIL, searchServiceCenter$AutoPlayAbility) && (searchServiceCenter$AutoPlayAbility2 = this.LLILZIL) != null) {
            searchServiceCenter$AutoPlayAbility2.LLZZZZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("child.isPlaying().not() = ");
        sbLIZ.append(!searchServiceCenter$AutoPlayAbility.isPlaying());
        C2188811AlT.LIZIZ(sbLIZ);
        if (!searchServiceCenter$AutoPlayAbility.isPlaying()) {
            searchServiceCenter$AutoPlayAbility.J0();
        }
        this.LLILZIL = searchServiceCenter$AutoPlayAbility;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.NestedAutoPlayCardAbility
    public final void Sn2(SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility) {
        Iterator<Map.Entry<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility>> it2 = LIZIZ().entrySet().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getValue(), searchServiceCenter$AutoPlayAbility)) {
                it2.remove();
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.NestedAutoPlayCardAbility
    public final void ms0(SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility) {
        LJFF(searchServiceCenter$AutoPlayAbility.getDetectView(), new AwS401S0200000_35(searchServiceCenter$AutoPlayAbility, this, 39));
    }

    public final void LJFF(View view, Function1<? super RecyclerView.ViewHolder, Unit> function1) {
        while (view != null) {
            if (!view.isAttachedToWindow()) {
                view.addOnAttachStateChangeListener(new C0T6R(view, new AwS401S0200000_35(this, (SearchNestedAutoplayCardHelper) function1, (Function1<? super RecyclerView.ViewHolder, Unit>) 40)));
                return;
            } else {
                if (Intrinsics.LJFF(view.getParent(), this.LL)) {
                    function1.invoke(this.LL.getChildViewHolder(view));
                    return;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return;
                } else {
                    view = (View) parent;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.01wD, com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayCardHelper$1] */
    public SearchNestedAutoplayCardHelper(ReusedUIAssem reusedUIAssem, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, View view, C1DWH c1dwh) {
        RecyclerView recyclerViewLJ;
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILLJJLI = view;
        this.LLILLL = c1dwh;
        final C259800zU c259800zU = new C259800zU();
        ?? r5 = new SearchServiceCenter$AutoPlayAbilityDefaultImpl() { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayCardHelper.1
            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Mu(C650630PfZ c650630PfZ) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void wp(C650630PfZ c650630PfZ) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void J0() {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
                View detectView;
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2;
                SearchNestedAutoplayCardHelper.this.LLILZLL = true;
                if (((Boolean) C07BT.LIZ.getValue()).booleanValue()) {
                    SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper = SearchNestedAutoplayCardHelper.this;
                    InterfaceC652740Piy interfaceC652740PiyLJI = searchNestedAutoplayCardHelper.LLILLL.LJI(0, searchNestedAutoplayCardHelper.LL, true, searchNestedAutoplayCardHelper.LLILZLL, searchNestedAutoplayCardHelper.LIZIZ().keySet());
                    if (interfaceC652740PiyLJI != null && (searchServiceCenter$AutoPlayAbility2 = SearchNestedAutoplayCardHelper.this.LIZIZ().get(interfaceC652740PiyLJI)) != null) {
                        SearchNestedAutoplayCardHelper.this.LIZLLL(searchServiceCenter$AutoPlayAbility2);
                    }
                    SearchNestedAutoplayCardHelper.this.LLILLL.LJFF(true);
                }
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility3 = SearchNestedAutoplayCardHelper.this.LLILZIL;
                if (searchServiceCenter$AutoPlayAbility3 != null && ((detectView = searchServiceCenter$AutoPlayAbility3.getDetectView()) == null || detectView.isAttachedToWindow())) {
                    SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility4 = SearchNestedAutoplayCardHelper.this.LLILZIL;
                    if (searchServiceCenter$AutoPlayAbility4 != null) {
                        searchServiceCenter$AutoPlayAbility4.J0();
                        return;
                    }
                    return;
                }
                SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper2 = SearchNestedAutoplayCardHelper.this;
                InterfaceC652740Piy interfaceC652740PiyLIZIZ = searchNestedAutoplayCardHelper2.LLILLL.LIZIZ(searchNestedAutoplayCardHelper2.LL, 0, searchNestedAutoplayCardHelper2.LIZIZ().keySet());
                if (interfaceC652740PiyLIZIZ == null || (searchServiceCenter$AutoPlayAbility = SearchNestedAutoplayCardHelper.this.LIZIZ().get(interfaceC652740PiyLIZIZ)) == null) {
                    return;
                }
                SearchNestedAutoplayCardHelper.this.LIZLLL(searchServiceCenter$AutoPlayAbility);
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void LLZZZZ() {
                SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper = SearchNestedAutoplayCardHelper.this;
                searchNestedAutoplayCardHelper.LLILZLL = false;
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = searchNestedAutoplayCardHelper.LLILZIL;
                if (searchServiceCenter$AutoPlayAbility != null) {
                    searchServiceCenter$AutoPlayAbility.LLZZZZ();
                }
                SearchNestedAutoplayCardHelper.this.LLILLL.LJFF(false);
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean N1() {
                SearchNestedAutoplayCardHelper.this.LLILLL.LIZJ();
                if (!SearchNestedAutoplayCardHelper.this.LIZIZ().isEmpty()) {
                    Collection<SearchServiceCenter$AutoPlayAbility> collectionValues = SearchNestedAutoplayCardHelper.this.LIZIZ().values();
                    if (collectionValues.isEmpty()) {
                        return false;
                    }
                    Iterator<T> it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        if (((SearchServiceCenter$AutoPlayAbility) it2.next()).N1()) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View getDetectView() {
                return SearchNestedAutoplayCardHelper.this.LLILLJJLI;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean isPlaying() {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = SearchNestedAutoplayCardHelper.this.LLILZIL;
                if (searchServiceCenter$AutoPlayAbility != null) {
                    return searchServiceCenter$AutoPlayAbility.isPlaying();
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void kC0(int i) {
                for (Object obj : SearchNestedAutoplayCardHelper.this.LIZIZ().keySet()) {
                    if (((InterfaceC652740Piy) obj).getPosition() == i) {
                        if (obj != null) {
                            SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper = SearchNestedAutoplayCardHelper.this;
                            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = searchNestedAutoplayCardHelper.LIZIZ().get(obj);
                            if (searchServiceCenter$AutoPlayAbility != null) {
                                searchNestedAutoplayCardHelper.LIZLLL(searchServiceCenter$AutoPlayAbility);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Ot0(final C640750PBh c640750PBh, final Function0<Unit> function0) {
                C640750PBh c640750PBh2;
                InterfaceC713360RyY interfaceC713360RyY;
                InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
                LinearLayoutManager linearLayoutManager;
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2 = null;
                if (c640750PBh.LIZJ && (SearchNestedAutoplayCardHelper.this.LL.getLayoutManager() instanceof LinearLayoutManager)) {
                    RecyclerView.LayoutManager layoutManager = SearchNestedAutoplayCardHelper.this.LL.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                        linearLayoutManager.scrollToPositionWithOffset(c640750PBh.LIZ, 0);
                    }
                } else {
                    SearchNestedAutoplayCardHelper.this.LL.scrollToPosition(c640750PBh.LIZ);
                }
                final SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper = SearchNestedAutoplayCardHelper.this;
                RecyclerView recyclerView = searchNestedAutoplayCardHelper.LL;
                final C259800zU<SearchServiceCenter$AutoPlayAbility> c259800zU2 = c259800zU;
                if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
                    Object objFindViewHolderForAdapterPosition = searchNestedAutoplayCardHelper.LL.findViewHolderForAdapterPosition(c640750PBh.LIZ);
                    if (objFindViewHolderForAdapterPosition != null && (objFindViewHolderForAdapterPosition instanceof InterfaceC713360RyY) && (interfaceC713360RyY = (InterfaceC713360RyY) objFindViewHolderForAdapterPosition) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyY)) != null && (searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, SearchServiceCenter$AutoPlayAbility.class, null)) != null && (!Intrinsics.LJFF(searchServiceCenter$AutoPlayAbility, c259800zU2.element))) {
                        searchServiceCenter$AutoPlayAbility2 = searchServiceCenter$AutoPlayAbility;
                    }
                    searchNestedAutoplayCardHelper.LLILZIL = searchServiceCenter$AutoPlayAbility2;
                    if (searchServiceCenter$AutoPlayAbility2 != null && (c640750PBh2 = c640750PBh.LIZIZ) != null) {
                        searchServiceCenter$AutoPlayAbility2.Ot0(c640750PBh2, function0);
                        return;
                    } else {
                        function0.invoke();
                        return;
                    }
                }
                recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.1DWG
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        C640750PBh c640750PBh3;
                        InterfaceC713360RyY interfaceC713360RyY2;
                        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
                        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility3;
                        view2.removeOnLayoutChangeListener(this);
                        Object objFindViewHolderForAdapterPosition2 = searchNestedAutoplayCardHelper.LL.findViewHolderForAdapterPosition(c640750PBh.LIZ);
                        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility4 = null;
                        if (objFindViewHolderForAdapterPosition2 != null && (objFindViewHolderForAdapterPosition2 instanceof InterfaceC713360RyY) && (interfaceC713360RyY2 = (InterfaceC713360RyY) objFindViewHolderForAdapterPosition2) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyY2)) != null && (searchServiceCenter$AutoPlayAbility3 = (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, SearchServiceCenter$AutoPlayAbility.class, null)) != null && (!Intrinsics.LJFF(searchServiceCenter$AutoPlayAbility3, c259800zU2.element))) {
                            searchServiceCenter$AutoPlayAbility4 = searchServiceCenter$AutoPlayAbility3;
                        }
                        searchNestedAutoplayCardHelper.LLILZIL = searchServiceCenter$AutoPlayAbility4;
                        if (searchServiceCenter$AutoPlayAbility4 != null && (c640750PBh3 = c640750PBh.LIZIZ) != null) {
                            searchServiceCenter$AutoPlayAbility4.Ot0(c640750PBh3, function0);
                        } else {
                            function0.invoke();
                        }
                    }
                });
            }
        };
        c259800zU.element = r5;
        try {
            C1558520qew.LJI(reusedUIAssem, SearchPlayerScope.class, r5, SearchServiceCenter$AutoPlayAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LL.addOnChildAttachStateChangeListener(new C1DWE(reusedUIAssem, this, c259800zU));
        this.LL.addOnScrollListener(new AsS59S0100000_35(this, 0));
        if (((Boolean) C07BT.LIZ.getValue()).booleanValue() && (recyclerViewLJ = this.LLILLL.LJ()) != null) {
            recyclerViewLJ.addOnScrollListener(new AsS59S0100000_35(this, 1));
        }
        this.LL.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2325331G0l(this, 0));
    }
}
