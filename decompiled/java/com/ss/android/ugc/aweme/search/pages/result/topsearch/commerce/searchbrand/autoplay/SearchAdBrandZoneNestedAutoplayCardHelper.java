package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.autoplay;

import X.C01GW;
import X.C0T6R;
import X.C1558420qem;
import X.C1558520qew;
import X.C19719512Dh;
import X.C1DWF;
import X.C1DWH;
import X.C2188811AlT;
import X.C452501pT;
import X.C640750PBh;
import X.C650630PfZ;
import X.C652830Pj7;
import X.C653210Pjj;
import X.InterfaceC21676519sR;
import X.InterfaceC652740Piy;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC2325331G0l;
import X.ViewOnLayoutChangeListenerC2325311G0j;
import X.ViewOnLayoutChangeListenerC2325321G0k;
import Y.AsS59S0100000_35;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.NestedAutoPlayCardAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class SearchAdBrandZoneNestedAutoplayCardHelper implements NestedAutoPlayCardAbility {
    public final RecyclerView LL;
    public final View LLILLJJLI;
    public final C1DWH LLILLL;
    public final List<Aweme> LLILZ;
    public SearchServiceCenter$AutoPlayAbility LLILZLL;
    public boolean LLIZ;
    public AnonymousClass2.AnonymousClass1 LLJ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(846));
    public final ArrayList<C1DWF> LLJI = new ArrayList<>();
    public final AnonymousClass1 LLIZLLLIL = new AnonymousClass1();

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.autoplay.SearchAdBrandZoneNestedAutoplayCardHelper$1, reason: invalid class name */
    public final class AnonymousClass1 extends SearchServiceCenter$AutoPlayAbilityDefaultImpl {
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
            SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = SearchAdBrandZoneNestedAutoplayCardHelper.this;
            searchAdBrandZoneNestedAutoplayCardHelper.LLIZ = true;
            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2 = searchAdBrandZoneNestedAutoplayCardHelper.LLILZLL;
            if (searchServiceCenter$AutoPlayAbility2 != null && ((detectView = searchServiceCenter$AutoPlayAbility2.getDetectView()) == null || detectView.isAttachedToWindow())) {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility3 = SearchAdBrandZoneNestedAutoplayCardHelper.this.LLILZLL;
                if (searchServiceCenter$AutoPlayAbility3 != null) {
                    searchServiceCenter$AutoPlayAbility3.J0();
                    return;
                }
                return;
            }
            SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper2 = SearchAdBrandZoneNestedAutoplayCardHelper.this;
            InterfaceC652740Piy interfaceC652740PiyLIZIZ = searchAdBrandZoneNestedAutoplayCardHelper2.LLILLL.LIZIZ(searchAdBrandZoneNestedAutoplayCardHelper2.LL, 0, searchAdBrandZoneNestedAutoplayCardHelper2.LIZIZ().keySet());
            if (interfaceC652740PiyLIZIZ == null || (searchServiceCenter$AutoPlayAbility = SearchAdBrandZoneNestedAutoplayCardHelper.this.LIZIZ().get(interfaceC652740PiyLIZIZ)) == null) {
                return;
            }
            SearchAdBrandZoneNestedAutoplayCardHelper.this.LIZLLL(searchServiceCenter$AutoPlayAbility);
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final void LLZZZZ() {
            SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = SearchAdBrandZoneNestedAutoplayCardHelper.this;
            searchAdBrandZoneNestedAutoplayCardHelper.LLIZ = false;
            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = searchAdBrandZoneNestedAutoplayCardHelper.LLILZLL;
            if (searchServiceCenter$AutoPlayAbility != null) {
                searchServiceCenter$AutoPlayAbility.LLZZZZ();
            }
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final boolean N1() {
            SearchAdBrandZoneNestedAutoplayCardHelper.this.LLILLL.LIZJ();
            if (!SearchAdBrandZoneNestedAutoplayCardHelper.this.LIZIZ().isEmpty()) {
                Collection<SearchServiceCenter$AutoPlayAbility> collectionValues = SearchAdBrandZoneNestedAutoplayCardHelper.this.LIZIZ().values();
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
            return SearchAdBrandZoneNestedAutoplayCardHelper.this.LLILLJJLI;
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final boolean isPlaying() {
            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = SearchAdBrandZoneNestedAutoplayCardHelper.this.LLILZLL;
            if (searchServiceCenter$AutoPlayAbility != null) {
                return searchServiceCenter$AutoPlayAbility.isPlaying();
            }
            return false;
        }

        public AnonymousClass1() {
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final void kC0(int i) {
            for (Object obj : SearchAdBrandZoneNestedAutoplayCardHelper.this.LIZIZ().keySet()) {
                if (((InterfaceC652740Piy) obj).getPosition() == i) {
                    if (obj != null) {
                        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = SearchAdBrandZoneNestedAutoplayCardHelper.this;
                        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = searchAdBrandZoneNestedAutoplayCardHelper.LIZIZ().get(obj);
                        if (searchServiceCenter$AutoPlayAbility != null) {
                            searchAdBrandZoneNestedAutoplayCardHelper.LIZLLL(searchServiceCenter$AutoPlayAbility);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbilityDefaultImpl, com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
            InterfaceC713360RyY interfaceC713360RyY;
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
            LinearLayoutManager linearLayoutManager;
            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2 = null;
            if (c640750PBh.LIZJ && (SearchAdBrandZoneNestedAutoplayCardHelper.this.LL.getLayoutManager() instanceof LinearLayoutManager)) {
                RecyclerView.LayoutManager layoutManager = SearchAdBrandZoneNestedAutoplayCardHelper.this.LL.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    linearLayoutManager.scrollToPositionWithOffset(c640750PBh.LIZ, 0);
                }
            } else {
                SearchAdBrandZoneNestedAutoplayCardHelper.this.LL.scrollToPosition(c640750PBh.LIZ);
            }
            SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = SearchAdBrandZoneNestedAutoplayCardHelper.this;
            RecyclerView recyclerView = searchAdBrandZoneNestedAutoplayCardHelper.LL;
            if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
                Object objFindViewHolderForAdapterPosition = searchAdBrandZoneNestedAutoplayCardHelper.LL.findViewHolderForAdapterPosition(c640750PBh.LIZ);
                if (objFindViewHolderForAdapterPosition != null && (objFindViewHolderForAdapterPosition instanceof InterfaceC713360RyY) && (interfaceC713360RyY = (InterfaceC713360RyY) objFindViewHolderForAdapterPosition) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyY)) != null && (searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, SearchServiceCenter$AutoPlayAbility.class, null)) != null && (!Intrinsics.LJFF(searchServiceCenter$AutoPlayAbility, searchAdBrandZoneNestedAutoplayCardHelper.LLIZLLLIL))) {
                    searchServiceCenter$AutoPlayAbility2 = searchServiceCenter$AutoPlayAbility;
                }
                searchAdBrandZoneNestedAutoplayCardHelper.LLILZLL = searchServiceCenter$AutoPlayAbility2;
                C640750PBh c640750PBh2 = c640750PBh.LIZIZ;
                if (c640750PBh2 != null) {
                    if (searchServiceCenter$AutoPlayAbility2 != null) {
                        searchServiceCenter$AutoPlayAbility2.Ot0(c640750PBh2, function0);
                        return;
                    }
                    return;
                }
                function0.invoke();
                return;
            }
            recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2325321G0k(searchAdBrandZoneNestedAutoplayCardHelper, c640750PBh, function0, 0));
        }
    }

    public final void LIZ() {
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        if (this.LLIZ && this.LLILZLL == null) {
            RecyclerView recyclerView = this.LL;
            if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2325311G0j(this, 1));
            } else {
                if (!this.LLIZ || this.LLILZLL != null || (interfaceC652740PiyLIZIZ = this.LLILLL.LIZIZ(this.LL, 0, LIZIZ().keySet())) == null || (searchServiceCenter$AutoPlayAbility = LIZIZ().get(interfaceC652740PiyLIZIZ)) == null) {
                    return;
                }
                LIZLLL(searchServiceCenter$AutoPlayAbility);
            }
        }
    }

    public final HashMap<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> LIZIZ() {
        return (HashMap) this.LLILZIL.getValue();
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.autoplay.SearchAdBrandZoneNestedAutoplayCardHelper$2, reason: invalid class name */
    public final class AnonymousClass2 implements InterfaceC21676519sR {
        public final HashMap<View, InterfaceC652740Piy> LL;

        /* JADX INFO: renamed from: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.autoplay.SearchAdBrandZoneNestedAutoplayCardHelper$2$1, reason: invalid class name */
        public final class AnonymousClass1 implements SearchServiceCenter$AutoPlayAbility.DeferredLoadNotifierAbility {
            public final /* synthetic */ SearchAdBrandZoneNestedAutoplayCardHelper LL;
            public final /* synthetic */ AnonymousClass2 LLILLJJLI;

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility.DeferredLoadNotifierAbility
            public final void Vy0(View view) {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
                View detectView;
                SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = this.LL;
                if (searchAdBrandZoneNestedAutoplayCardHelper.LLIZ && (searchServiceCenter$AutoPlayAbility = searchAdBrandZoneNestedAutoplayCardHelper.LLILZLL) != null && (detectView = searchServiceCenter$AutoPlayAbility.getDetectView()) != null && detectView.isAttachedToWindow()) {
                    SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2 = this.LL.LLILZLL;
                    if (searchServiceCenter$AutoPlayAbility2 != null) {
                        searchServiceCenter$AutoPlayAbility2.J0();
                        return;
                    }
                    return;
                }
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = this.LL.LL.findContainingViewHolder(view);
                if (viewHolderFindContainingViewHolder == null) {
                    return;
                }
                this.LLILLJJLI.LIZ(viewHolderFindContainingViewHolder);
            }

            public AnonymousClass1(SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper, AnonymousClass2 anonymousClass2) {
                this.LL = searchAdBrandZoneNestedAutoplayCardHelper;
                this.LLILLJJLI = anonymousClass2;
            }
        }

        public AnonymousClass2() {
            SearchAdBrandZoneNestedAutoplayCardHelper.this.LLJ = new AnonymousClass1(SearchAdBrandZoneNestedAutoplayCardHelper.this, this);
            this.LL = new HashMap<>();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void LIZ(RecyclerView.ViewHolder viewHolder) {
            if (!(viewHolder instanceof InterfaceC713360RyY)) {
                return;
            }
            InterfaceC652740Piy interfaceC652740Piy = null;
            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(C1558420qem.LIZIZ((InterfaceC713360RyY) viewHolder), SearchServiceCenter$AutoPlayAbility.class, null);
            if (searchServiceCenter$AutoPlayAbility != null && (!Intrinsics.LJFF(searchServiceCenter$AutoPlayAbility, SearchAdBrandZoneNestedAutoplayCardHelper.this.LLIZLLLIL))) {
                SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = SearchAdBrandZoneNestedAutoplayCardHelper.this;
                InterfaceC652740Piy interfaceC652740Piy2 = this.LL.get(viewHolder.itemView);
                if (interfaceC652740Piy2 != null) {
                    interfaceC652740Piy = interfaceC652740Piy2;
                }
                C19719512Dh.LIZJ(searchAdBrandZoneNestedAutoplayCardHelper.LIZIZ()).remove(interfaceC652740Piy);
                C652830Pj7 c652830Pj7 = new C652830Pj7(searchServiceCenter$AutoPlayAbility.getDetectView(), new AwS579S0100000_35(viewHolder, 150), new AwS579S0100000_35(searchServiceCenter$AutoPlayAbility, 151));
                this.LL.put(viewHolder.itemView, c652830Pj7);
                searchAdBrandZoneNestedAutoplayCardHelper.LIZIZ().put(c652830Pj7, searchServiceCenter$AutoPlayAbility);
                searchAdBrandZoneNestedAutoplayCardHelper.LIZ();
            }
        }

        @Override // X.InterfaceC21676519sR
        public final void g5(View view) {
            C1DWF c1dwf;
            RecyclerView.ViewHolder childViewHolder = SearchAdBrandZoneNestedAutoplayCardHelper.this.LL.getChildViewHolder(view);
            if (childViewHolder != null) {
                LIZ(childViewHolder);
            }
            SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = SearchAdBrandZoneNestedAutoplayCardHelper.this;
            searchAdBrandZoneNestedAutoplayCardHelper.getClass();
            try {
                Object childViewHolder2 = searchAdBrandZoneNestedAutoplayCardHelper.LL.getChildViewHolder(view);
                if ((childViewHolder2 instanceof C1DWF) && (c1dwf = (C1DWF) childViewHolder2) != null) {
                    if ((!searchAdBrandZoneNestedAutoplayCardHelper.LLJI.isEmpty()) && searchAdBrandZoneNestedAutoplayCardHelper.LLJI.contains(c1dwf)) {
                        return;
                    }
                    searchAdBrandZoneNestedAutoplayCardHelper.LLJI.add(c1dwf);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }

        @Override // X.InterfaceC21676519sR
        public final void m3(View view) {
            C1DWF c1dwf;
            InterfaceC652740Piy interfaceC652740Piy = this.LL.get(view);
            if (interfaceC652740Piy != null) {
                SearchAdBrandZoneNestedAutoplayCardHelper.this.LIZIZ().remove(interfaceC652740Piy);
            }
            SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = SearchAdBrandZoneNestedAutoplayCardHelper.this;
            searchAdBrandZoneNestedAutoplayCardHelper.getClass();
            try {
                Object childViewHolder = searchAdBrandZoneNestedAutoplayCardHelper.LL.getChildViewHolder(view);
                if ((childViewHolder instanceof C1DWF) && (c1dwf = (C1DWF) childViewHolder) != null) {
                    c1dwf.N6();
                    searchAdBrandZoneNestedAutoplayCardHelper.LLJI.remove(c1dwf);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZLLL(SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2;
        if (!this.LLIZ) {
            this.LLILZLL = searchServiceCenter$AutoPlayAbility;
            return;
        }
        if (!Intrinsics.LJFF(this.LLILZLL, searchServiceCenter$AutoPlayAbility) && (searchServiceCenter$AutoPlayAbility2 = this.LLILZLL) != null) {
            searchServiceCenter$AutoPlayAbility2.LLZZZZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("child.isPlaying().not() = ");
        sbLIZ.append(!searchServiceCenter$AutoPlayAbility.isPlaying());
        C2188811AlT.LIZIZ(sbLIZ);
        if (!searchServiceCenter$AutoPlayAbility.isPlaying()) {
            searchServiceCenter$AutoPlayAbility.J0();
        }
        this.LLILZLL = searchServiceCenter$AutoPlayAbility;
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
        LJFF(searchServiceCenter$AutoPlayAbility.getDetectView(), new AwS401S0200000_35(searchServiceCenter$AutoPlayAbility, this, 41));
    }

    public final void LJFF(View view, Function1<? super RecyclerView.ViewHolder, Unit> function1) {
        while (view != null) {
            if (!view.isAttachedToWindow()) {
                view.addOnAttachStateChangeListener(new C0T6R(view, new AwS401S0200000_35(this, (SearchAdBrandZoneNestedAutoplayCardHelper) function1, (Function1<? super RecyclerView.ViewHolder, Unit>) 42)));
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

    public SearchAdBrandZoneNestedAutoplayCardHelper(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2, C653210Pjj c653210Pjj, List list) {
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILLJJLI = viewOnAttachStateChangeListenerC20604515jv2;
        this.LLILLL = c653210Pjj;
        this.LLILZ = list;
        viewOnAttachStateChangeListenerC20604515jv.addOnChildAttachStateChangeListener(new AnonymousClass2());
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS59S0100000_35(this, 2));
        viewOnAttachStateChangeListenerC20604515jv.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2325331G0l(this, 1));
    }
}
