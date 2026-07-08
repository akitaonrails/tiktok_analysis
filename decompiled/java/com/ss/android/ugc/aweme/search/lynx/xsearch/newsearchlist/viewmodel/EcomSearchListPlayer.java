package com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel;

import X.AbstractC1585810rMx;
import X.AnonymousClass0956;
import X.C0R0K;
import X.C0R42;
import X.C0R44;
import X.C13DA;
import X.C13LP;
import X.C1558520qew;
import X.C640750PBh;
import X.C641080PCo;
import X.C648320Pbq;
import X.C650630PfZ;
import X.C653210Pjj;
import X.C948503nH;
import X.InterfaceC21676519sR;
import X.InterfaceC648270Pbl;
import X.InterfaceC652740Piy;
import X.InterfaceC665370Q7z;
import X.InterfaceC688940R0q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.SearchList;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomSearchListPlayer extends AbstractC1585810rMx implements SearchServiceCenter$AutoPlayAbility, View.OnAttachStateChangeListener, InterfaceC21676519sR, InterfaceC688940R0q {
    public final C0R0K LL;
    public final ArrayList<InterfaceC648270Pbl> LLILLJJLI = new ArrayList<>();
    public AnonymousClass0956 LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final RecyclerView LLILZLL;
    public SearchServiceCenter$AutoPlayAbility LLIZ;
    public final Map<WeakReference<View>, RecyclerView.ViewHolder> LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void J0() {
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        this.LLILZIL = true;
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLL = null;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2 = this.LLIZ;
        if (searchServiceCenter$AutoPlayAbility2 != null) {
            searchServiceCenter$AutoPlayAbility2.J0();
            if (this.LLILLL != null || this.LLILZ) {
                return;
            }
            this.LLILLL = C948503nH.LJII(this.LLILZLL, new C648320Pbq(this, null));
            return;
        }
        Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIL = LJJIL(vi());
        C653210Pjj c653210Pjj = this.LL.LJJII;
        if (c653210Pjj == null || (interfaceC652740PiyLIZIZ = c653210Pjj.LIZIZ(this.LLILZLL, 0, mapLJJIL.keySet())) == null || (searchServiceCenter$AutoPlayAbility = mapLJJIL.get(interfaceC652740PiyLIZIZ)) == null) {
            return;
        }
        LJJIJIIJIL(searchServiceCenter$AutoPlayAbility);
        if (this.LLILLL != null || this.LLILZ) {
            return;
        }
        this.LLILLL = C948503nH.LJII(this.LLILZLL, new C648320Pbq(this, null));
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void LLZZZZ() {
        this.LLILZIL = false;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LLIZ;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.LLZZZZ();
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final boolean N1() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final View Vt() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void kC0(int i) {
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final boolean mm() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC688940R0q
    public final void destroy() {
        this.LLILZLL.removeOnAttachStateChangeListener(this);
        this.LLILZLL.removeOnChildAttachStateChangeListener(this);
        ((HashMap) this.LLIZLLLIL).clear();
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C641080PCo.LIZIZ(this.LLILZLL);
        if (interfaceC665370Q7zLIZIZ != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, SearchServiceCenter$AutoPlayAbility.class, null);
        }
        reset();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final boolean isPlaying() {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LLIZ;
        if (searchServiceCenter$AutoPlayAbility != null) {
            return searchServiceCenter$AutoPlayAbility.isPlaying();
        }
        return false;
    }

    public final void reset() {
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLL = null;
        this.LLILLJJLI.clear();
    }

    public final List<RecyclerView.ViewHolder> vi() {
        return C13LP.LLIIII(((HashMap) this.LLIZLLLIL).values());
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final View getDetectView() {
        return this.LLILZLL;
    }

    public final void LJJIJIIJIL(SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2;
        if (!this.LLILZIL) {
            this.LLIZ = searchServiceCenter$AutoPlayAbility;
            return;
        }
        if (!Intrinsics.LJFF(this.LLIZ, searchServiceCenter$AutoPlayAbility) && (searchServiceCenter$AutoPlayAbility2 = this.LLIZ) != null) {
            searchServiceCenter$AutoPlayAbility2.LLZZZZ();
        }
        if (!searchServiceCenter$AutoPlayAbility.isPlaying()) {
            searchServiceCenter$AutoPlayAbility.J0();
        }
        this.LLIZ = searchServiceCenter$AutoPlayAbility;
    }

    public final Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> LJJIL(List<? extends RecyclerView.ViewHolder> list) {
        C13DA c13da = new C13DA();
        for (RecyclerView.ViewHolder viewHolder : list) {
            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = C641080PCo.LIZ(viewHolder);
            if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
                final View detectView = searchServiceCenter$AutoPlayAbilityLIZ.getDetectView();
                final AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(viewHolder, 326);
                c13da.put(new InterfaceC652740Piy(detectView, awS554S0100000_10) { // from class: X.0PfK
                    public final View LL;
                    public final Function0<Integer> LLILLJJLI;

                    @Override // X.InterfaceC652740Piy
                    public final boolean LIZJ() {
                        return true;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C650480PfK)) {
                            return false;
                        }
                        C650480PfK c650480PfK = (C650480PfK) obj;
                        return Intrinsics.LJFF(this.LL, c650480PfK.LL) && Intrinsics.LJFF(this.LLILLJJLI, c650480PfK.LLILLJJLI);
                    }

                    public final int hashCode() {
                        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("CheckItemAbility(view=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", positionFetcher=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC652740Piy
                    public final int getPosition() {
                        return this.LLILLJJLI.invoke().intValue();
                    }

                    @Override // X.InterfaceC652740Piy
                    public final View getView() {
                        return this.LL;
                    }

                    {
                        this.LL = detectView;
                        this.LLILLJJLI = awS554S0100000_10;
                    }
                }, searchServiceCenter$AutoPlayAbilityLIZ);
            }
        }
        return c13da.build();
    }

    @Override // X.InterfaceC21676519sR
    public final void g5(View view) {
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        ((HashMap) this.LLIZLLLIL).put(new WeakReference(view), this.LLILZLL.getChildViewHolder(view));
        RecyclerView recyclerView = this.LLILZLL;
        if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
            if (this.LLIZ == null) {
                Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIL = LJJIL(vi());
                C653210Pjj c653210Pjj = this.LL.LJJII;
                if (c653210Pjj != null && (interfaceC652740PiyLIZIZ = c653210Pjj.LIZIZ(this.LLILZLL, 0, mapLJJIL.keySet())) != null && (searchServiceCenter$AutoPlayAbility = mapLJJIL.get(interfaceC652740PiyLIZIZ)) != null) {
                    LJJIJIIJIL(searchServiceCenter$AutoPlayAbility);
                    return;
                }
                return;
            }
            return;
        }
        recyclerView.addOnLayoutChangeListener(new C0R42(this, 0));
    }

    @Override // X.InterfaceC21676519sR
    public final void m3(View view) {
        for (Object obj : ((HashMap) this.LLIZLLLIL).keySet()) {
            if (Intrinsics.LJFF(((Reference) obj).get(), view)) {
                if (obj != null) {
                    ((HashMap) this.LLIZLLLIL).remove(obj);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C641080PCo.LIZIZ(this.LLILZLL);
        if (interfaceC665370Q7zLIZIZ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, SearchServiceCenter$AutoPlayAbility.class, null, null);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LLIZ;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.LLZZZZ();
        }
        this.LLIZ = null;
        reset();
    }

    public EcomSearchListPlayer(SearchList searchList, C0R0K c0r0k) {
        this.LL = c0r0k;
        RecyclerView recyclerView = (RecyclerView) searchList.mView;
        this.LLILZLL = recyclerView;
        this.LLIZLLLIL = new HashMap();
        recyclerView.addOnAttachStateChangeListener(this);
        recyclerView.addOnScrollListener(this);
        recyclerView.addOnChildAttachStateChangeListener(this);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIL = LJJIL(vi());
        C653210Pjj c653210Pjj = this.LL.LJJII;
        if (c653210Pjj != null && (interfaceC652740PiyLIZIZ = c653210Pjj.LIZIZ(recyclerView, i, mapLJJIL.keySet())) != null && (searchServiceCenter$AutoPlayAbility = mapLJJIL.get(interfaceC652740PiyLIZIZ)) != null) {
            LJJIJIIJIL(searchServiceCenter$AutoPlayAbility);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
        this.LLILZLL.scrollToPosition(c640750PBh.LIZ);
        RecyclerView recyclerView = this.LLILZLL;
        if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.LLILZLL.findViewHolderForAdapterPosition(c640750PBh.LIZ);
            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = null;
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                searchServiceCenter$AutoPlayAbilityLIZ = C641080PCo.LIZ(viewHolderFindViewHolderForAdapterPosition);
            }
            this.LLIZ = searchServiceCenter$AutoPlayAbilityLIZ;
            if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
                C640750PBh c640750PBh2 = c640750PBh.LIZIZ;
                if (c640750PBh2 != null && c640750PBh2 != null) {
                    searchServiceCenter$AutoPlayAbilityLIZ.Ot0(c640750PBh2, function0);
                    return;
                } else {
                    function0.invoke();
                    return;
                }
            }
            return;
        }
        recyclerView.addOnLayoutChangeListener(new C0R44(this, c640750PBh, function0, 1));
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.LLILZ = true;
        reset();
        Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIL = LJJIL(vi());
        if (this.LL.LJJII != null) {
            mapLJJIL.keySet();
        }
    }
}
