package com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.C077Y;
import X.C0DYC;
import X.C0R0K;
import X.C0R42;
import X.C0R44;
import X.C0R48;
import X.C13DA;
import X.C13LP;
import X.C1537720q7O;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2188811AlT;
import X.C301440Bri;
import X.C640750PBh;
import X.C641080PCo;
import X.C650630PfZ;
import X.C653210Pjj;
import X.C653720PkY;
import X.C661440Px0;
import X.C946803n0;
import X.InterfaceC21676519sR;
import X.InterfaceC652740Piy;
import X.InterfaceC665370Q7z;
import X.InterfaceC688940R0q;
import Y.ARunnableS110S0100000_10;
import Y.AsS37S0100000_10;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.SearchList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import j27.s;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchListPlayer extends AbstractC1585810rMx implements SearchServiceCenter$AutoPlayAbility, View.OnAttachStateChangeListener, InterfaceC21676519sR, InterfaceC688940R0q, ISearchAwemePoolCompatParentAbility {
    public final SearchList LL;
    public final C0R0K LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final RecyclerView LLILZIL;
    public InterfaceC652740Piy LLILZLL;
    public SearchServiceCenter$AutoPlayAbility LLIZ;
    public final Map<WeakReference<View>, RecyclerView.ViewHolder> LLIZLLLIL;
    public boolean LLJ;
    public final AsS37S0100000_10 LLJI;
    public SearchTopFragmentAbility LLJIJIL;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void J0() {
        C653210Pjj c653210Pjj;
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        this.LLILLL = true;
        s sVar = this.LL.mContext;
        if (sVar != null) {
            C0DYC.LIZIZ(sVar, "search_list_play_state", Boolean.TRUE);
        }
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LLIZ;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.J0();
            return;
        }
        if (this.LLJ) {
            return;
        }
        Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIZ = LJJIZ(vi());
        C653210Pjj c653210Pjj2 = this.LLILLJJLI.LJJII;
        if (c653210Pjj2 != null && (interfaceC652740PiyLIZIZ = c653210Pjj2.LIZIZ(this.LLILZIL, 0, mapLJJIZ.keySet())) != null) {
            LJJIL(interfaceC652740PiyLIZIZ, mapLJJIZ.get(interfaceC652740PiyLIZIZ), true);
        }
        if (!C301440Bri.LIZ() || (c653210Pjj = this.LLILLJJLI.LJJII) == null) {
            return;
        }
        SearchTopFragmentAbility searchTopFragmentAbilityLJJIJIIJIL = LJJIJIIJIL(this.LLILZIL);
        InterfaceC652740Piy interfaceC652740PiyLJII = c653210Pjj.LJII(searchTopFragmentAbilityLJJIJIIJIL != null ? searchTopFragmentAbilityLJJIJIIJIL.LLII() : null, this.LLILZIL, mapLJJIZ.keySet());
        if (interfaceC652740PiyLJII != null) {
            LJJIL(interfaceC652740PiyLJII, mapLJJIZ.get(interfaceC652740PiyLJII), true);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void LLZZZZ() {
        this.LLILLL = false;
        s sVar = this.LL.mContext;
        if (sVar != null) {
            C0DYC.LIZIZ(sVar, "search_list_play_state", Boolean.FALSE);
        }
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LLIZ;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.LLZZZZ();
        }
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
        this.LLILZIL.removeOnAttachStateChangeListener(this);
        this.LLILZIL.removeOnChildAttachStateChangeListener(this);
        ((HashMap) this.LLIZLLLIL).clear();
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C641080PCo.LIZIZ(this.LLILZIL);
        if (interfaceC665370Q7zLIZIZ != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, SearchServiceCenter$AutoPlayAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final boolean isPlaying() {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LLIZ;
        if (searchServiceCenter$AutoPlayAbility != null) {
            return searchServiceCenter$AutoPlayAbility.isPlaying();
        }
        return false;
    }

    public final List<RecyclerView.ViewHolder> vi() {
        return C13LP.LLIIII(((HashMap) this.LLIZLLLIL).values());
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final View getDetectView() {
        return this.LLILZIL;
    }

    public final SearchTopFragmentAbility LJJIJIIJIL(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI;
        if (this.LLJIJIL == null) {
            Fragment fragmentLIZ = C946803n0.LIZ(view);
            SearchTopFragmentAbility searchTopFragmentAbility = null;
            if (fragmentLIZ != null && (interfaceC665370Q7zLJIIJJI = C1558360qeg.LJIIJJI(fragmentLIZ, null)) != null) {
                searchTopFragmentAbility = (SearchTopFragmentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI, SearchTopFragmentAbility.class, null);
            }
            this.LLJIJIL = searchTopFragmentAbility;
        }
        return this.LLJIJIL;
    }

    public final Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> LJJIZ(List<? extends RecyclerView.ViewHolder> list) {
        C13DA c13da = new C13DA();
        for (RecyclerView.ViewHolder viewHolder : list) {
            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = C641080PCo.LIZ(viewHolder);
            if (this.LLILZ) {
                JavaOnlyArray javaOnlyArray = this.LLILLJJLI.LJIJ;
                if (javaOnlyArray != null && !javaOnlyArray.contains(Integer.valueOf(viewHolder.getBindingAdapterPosition()))) {
                    c13da.put(new C653720PkY(viewHolder.itemView, new AwS554S0100000_10(viewHolder, 328)), searchServiceCenter$AutoPlayAbilityLIZ);
                }
            } else if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
                c13da.put(new C653720PkY(searchServiceCenter$AutoPlayAbilityLIZ.getDetectView(), new AwS554S0100000_10(viewHolder, 329)), searchServiceCenter$AutoPlayAbilityLIZ);
            }
        }
        return c13da.build();
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.ISearchAwemePoolCompatParentAbility
    public final void NB(C661440Px0 c661440Px0) {
        RecyclerView.ViewHolder next;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = this.LLILZIL.findContainingViewHolder(c661440Px0);
        if (viewHolderFindContainingViewHolder == null) {
            return;
        }
        Iterator<RecyclerView.ViewHolder> it2 = vi().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next, viewHolderFindContainingViewHolder)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        RecyclerView.ViewHolder viewHolder = next;
        if (viewHolder != null && (searchServiceCenter$AutoPlayAbilityLIZ = C641080PCo.LIZ(viewHolder)) != null) {
            this.LLILLL = true;
            this.LLIZ = searchServiceCenter$AutoPlayAbilityLIZ;
            searchServiceCenter$AutoPlayAbilityLIZ.J0();
        }
    }

    @Override // X.InterfaceC21676519sR
    public final void g5(View view) {
        Integer numValueOf;
        boolean z;
        C653210Pjj c653210Pjj;
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChildViewAttachedToWindow[");
        sbLIZ.append(view);
        sbLIZ.append("], current size[");
        sbLIZ.append(this.LLILZIL.getChildCount());
        sbLIZ.append("], adapter size[");
        AbstractC21673619ry adapter = this.LLILZIL.getAdapter();
        RecyclerView recyclerViewLLII = null;
        if (adapter != null) {
            numValueOf = Integer.valueOf(adapter.getItemCount());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", currentAbilityCarrier is null: ");
        if (this.LLIZ == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        RecyclerView.ViewHolder childViewHolder = this.LLILZIL.getChildViewHolder(view);
        JavaOnlyArray javaOnlyArray = this.LLILLJJLI.LJIJ;
        if (javaOnlyArray != null && !javaOnlyArray.contains(Integer.valueOf(childViewHolder.getBindingAdapterPosition()))) {
            ((HashMap) this.LLIZLLLIL).put(new WeakReference(view), childViewHolder);
        }
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
            if (this.LLIZ == null) {
                Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIZ = LJJIZ(vi());
                C653210Pjj c653210Pjj2 = this.LLILLJJLI.LJJII;
                if (c653210Pjj2 != null && (interfaceC652740PiyLIZIZ = c653210Pjj2.LIZIZ(this.LLILZIL, 0, mapLJJIZ.keySet())) != null) {
                    LJJIL(interfaceC652740PiyLIZIZ, mapLJJIZ.get(interfaceC652740PiyLIZIZ), true);
                }
                if (C301440Bri.LIZ() && (c653210Pjj = this.LLILLJJLI.LJJII) != null) {
                    SearchTopFragmentAbility searchTopFragmentAbilityLJJIJIIJIL = LJJIJIIJIL(this.LLILZIL);
                    if (searchTopFragmentAbilityLJJIJIIJIL != null) {
                        recyclerViewLLII = searchTopFragmentAbilityLJJIJIIJIL.LLII();
                    }
                    InterfaceC652740Piy interfaceC652740PiyLJII = c653210Pjj.LJII(recyclerViewLLII, this.LLILZIL, mapLJJIZ.keySet());
                    if (interfaceC652740PiyLJII != null) {
                        LJJIL(interfaceC652740PiyLJII, mapLJJIZ.get(interfaceC652740PiyLJII), true);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        recyclerView.addOnLayoutChangeListener(new C0R42(this, 1));
    }

    @Override // X.InterfaceC21676519sR
    public final void m3(View view) {
        Integer numValueOf;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        View detectView;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChildViewDetachedFromWindow[");
        sbLIZ.append(view);
        sbLIZ.append("], current size[");
        sbLIZ.append(this.LLILZIL.getChildCount());
        sbLIZ.append("], adapter size[");
        AbstractC21673619ry adapter = this.LLILZIL.getAdapter();
        if (adapter != null) {
            numValueOf = Integer.valueOf(adapter.getItemCount());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (((Number) C077Y.LIZ.getValue()).intValue() == 0 && (searchServiceCenter$AutoPlayAbility = this.LLIZ) != null && (detectView = searchServiceCenter$AutoPlayAbility.getDetectView()) != null && !detectView.isAttachedToWindow()) {
            this.LLIZ = null;
            if (this.LLILZ) {
                this.LLILZLL = null;
            }
            HandlerHook.viewPost(this.LLILZIL, new ARunnableS110S0100000_10(this, 41));
        }
        Iterator it2 = ((HashMap) this.LLIZLLLIL).keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((Reference) next).get(), view)) {
                if (next != null) {
                    ((HashMap) this.LLIZLLLIL).remove(next);
                }
            }
        }
        if (((HashMap) this.LLIZLLLIL).keySet().size() == 0) {
            this.LLIZ = null;
            if (this.LLILZ) {
                this.LLILZLL = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        SearchTopFragmentAbility searchTopFragmentAbilityLJJIJIIJIL;
        RecyclerView recyclerViewLLII;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C641080PCo.LIZIZ(this.LLILZIL);
        if (interfaceC665370Q7zLIZIZ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, SearchServiceCenter$AutoPlayAbility.class, null, null);
        }
        if (C301440Bri.LIZ() && (searchTopFragmentAbilityLJJIJIIJIL = LJJIJIIJIL(this.LLILZIL)) != null && (recyclerViewLLII = searchTopFragmentAbilityLJJIJIIJIL.LLII()) != null) {
            recyclerViewLLII.addOnScrollListener(this.LLJI);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        SearchTopFragmentAbility searchTopFragmentAbilityLJJIJIIJIL;
        RecyclerView recyclerViewLLII;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LLIZ;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.LLZZZZ();
        }
        this.LLIZ = null;
        if (this.LLILZ) {
            this.LLILZLL = null;
        }
        if (C301440Bri.LIZ() && (searchTopFragmentAbilityLJJIJIIJIL = LJJIJIIJIL(this.LLILZIL)) != null && (recyclerViewLLII = searchTopFragmentAbilityLJJIJIIJIL.LLII()) != null) {
            recyclerViewLLII.removeOnScrollListener(this.LLJI);
        }
    }

    public SearchListPlayer(SearchList searchList, C0R0K c0r0k) {
        this.LL = searchList;
        this.LLILLJJLI = c0r0k;
        RecyclerView recyclerView = (RecyclerView) searchList.mView;
        this.LLILZIL = recyclerView;
        this.LLIZLLLIL = new HashMap();
        recyclerView.addOnAttachStateChangeListener(this);
        recyclerView.addOnScrollListener(this);
        recyclerView.addOnChildAttachStateChangeListener(this);
        c0r0k.LJIJJLI = this;
        c0r0k.LIZLLL = this;
        c0r0k.LJIILLIIL = this;
        c0r0k.LJIILL = this;
        if (recyclerView.isAttachedToWindow()) {
            C1558520qew.LJII(C1558360qeg.LJ(recyclerView, "search-list-player"), this, ISearchAwemePoolCompatParentAbility.class, null, null);
        } else {
            recyclerView.addOnAttachStateChangeListener(new C0R48(this, recyclerView, 3));
        }
        this.LLJI = new AsS37S0100000_10(this, 4);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        if (i == 0 && !this.LLILLL) {
            SearchTopFragmentAbility searchTopFragmentAbilityLJJIJIIJIL = LJJIJIIJIL(recyclerView);
            if (searchTopFragmentAbilityLJJIJIIJIL != null) {
                searchTopFragmentAbilityLJJIJIIJIL.k01();
                return;
            }
            return;
        }
        Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIZ = LJJIZ(vi());
        C653210Pjj c653210Pjj = this.LLILLJJLI.LJJII;
        if (c653210Pjj != null && (interfaceC652740PiyLIZIZ = c653210Pjj.LIZIZ(recyclerView, i, mapLJJIZ.keySet())) != null) {
            LJJIL(interfaceC652740PiyLIZIZ, mapLJJIZ.get(interfaceC652740PiyLIZIZ), true);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
        int i;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ;
        C1537720q7O c1537720q7O;
        View view;
        C1537720q7O c1537720q7O2;
        Object objValueOf;
        LinearLayoutManager linearLayoutManager;
        int itemCount;
        this.LLJ = true;
        C653720PkY c653720PkY = null;
        this.LLIZ = null;
        if (this.LLILZ) {
            this.LLILZLL = null;
        }
        AbstractC21673619ry adapter = this.LLILZIL.getAdapter();
        if (adapter != null && (itemCount = adapter.getItemCount()) > 0 && c640750PBh.LIZ == itemCount - 1) {
            i = c640750PBh.LIZLLL - this.LLILLJJLI.LJIL;
        } else {
            i = c640750PBh.LIZLLL;
        }
        RecyclerView.LayoutManager layoutManager = this.LLILZIL.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            linearLayoutManager.scrollToPositionWithOffset(c640750PBh.LIZ, i);
        } else {
            this.LLILZIL.scrollToPosition(c640750PBh.LIZ);
        }
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.LLILZIL.findViewHolderForAdapterPosition(c640750PBh.LIZ);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                searchServiceCenter$AutoPlayAbilityLIZ = C641080PCo.LIZ(viewHolderFindViewHolderForAdapterPosition);
            } else {
                searchServiceCenter$AutoPlayAbilityLIZ = null;
            }
            for (Map.Entry<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> entry : LJJIZ(vi()).entrySet()) {
                SearchServiceCenter$AutoPlayAbility value = entry.getValue();
                if ((value != null && value.isPlaying()) || this.LLILZ) {
                    SearchServiceCenter$AutoPlayAbility value2 = entry.getValue();
                    if (value2 != null) {
                        value2.LLZZZZ();
                    }
                }
            }
            if (this.LLILZ) {
                LynxView lynxViewLJIILJJIL = this.LL.mContext.LJIILJJIL();
                if (lynxViewLJIILJJIL instanceof C1537720q7O) {
                    c1537720q7O = (C1537720q7O) lynxViewLJIILJJIL;
                } else {
                    c1537720q7O = null;
                }
                if (c1537720q7O != null) {
                    JSONObject jSONObject = new JSONObject();
                    InterfaceC652740Piy interfaceC652740Piy = this.LLILZLL;
                    if (interfaceC652740Piy != null) {
                        objValueOf = Integer.valueOf(interfaceC652740Piy.getPosition());
                    } else {
                        objValueOf = "-1";
                    }
                    jSONObject.put("position", objValueOf);
                    c1537720q7O.LIZ("autoplayDeactivate", jSONObject);
                }
                LynxView lynxViewLJIILJJIL2 = this.LL.mContext.LJIILJJIL();
                if ((lynxViewLJIILJJIL2 instanceof C1537720q7O) && (c1537720q7O2 = (C1537720q7O) lynxViewLJIILJJIL2) != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("position", c640750PBh.LIZ);
                    c1537720q7O2.LIZ("autoplayActivate", jSONObject2);
                }
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = this.LLILZIL.findViewHolderForAdapterPosition(c640750PBh.LIZ);
                if (viewHolderFindViewHolderForAdapterPosition2 != null && (view = viewHolderFindViewHolderForAdapterPosition2.itemView) != null) {
                    c653720PkY = new C653720PkY(view, new AwS554S0100000_10(c640750PBh, 327));
                }
                this.LLILZLL = c653720PkY;
            }
            this.LLIZ = searchServiceCenter$AutoPlayAbilityLIZ;
            if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
                C640750PBh c640750PBh2 = c640750PBh.LIZIZ;
                if (c640750PBh2 != null && c640750PBh2 != null) {
                    searchServiceCenter$AutoPlayAbilityLIZ.Ot0(c640750PBh2, function0);
                } else {
                    function0.invoke();
                    searchServiceCenter$AutoPlayAbilityLIZ.J0();
                }
                this.LLJ = false;
                return;
            }
            return;
        }
        recyclerView.addOnLayoutChangeListener(new C0R44(this, c640750PBh, function0, 2));
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIZ = LJJIZ(vi());
        if (this.LLILLJJLI.LJJII != null) {
            mapLJJIZ.keySet();
        }
    }

    public final void LJJIL(InterfaceC652740Piy interfaceC652740Piy, SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility, boolean z) {
        boolean z2;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2;
        C1537720q7O c1537720q7O;
        C1537720q7O c1537720q7O2;
        Object objValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCheckedPassed, isAbleToPlay[");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("], child is null?：[");
        if (searchServiceCenter$AutoPlayAbility == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LLILLL) {
            this.LLIZ = searchServiceCenter$AutoPlayAbility;
            if (this.LLILZ) {
                this.LLILZLL = interfaceC652740Piy;
                return;
            }
            return;
        }
        if (this.LLILZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onCheckedPassed, before: ");
            InterfaceC652740Piy interfaceC652740Piy2 = this.LLILZLL;
            Integer numValueOf = null;
            if (interfaceC652740Piy2 != null) {
                numValueOf = Integer.valueOf(interfaceC652740Piy2.getPosition());
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(", now: ");
            sbLIZ2.append(interfaceC652740Piy.getPosition());
            C2188811AlT.LIZIZ(sbLIZ2);
            if (!Intrinsics.LJFF(this.LLILZLL, interfaceC652740Piy)) {
                LynxView lynxViewLJIILJJIL = this.LL.mContext.LJIILJJIL();
                if ((lynxViewLJIILJJIL instanceof C1537720q7O) && (c1537720q7O2 = (C1537720q7O) lynxViewLJIILJJIL) != null) {
                    JSONObject jSONObject = new JSONObject();
                    InterfaceC652740Piy interfaceC652740Piy3 = this.LLILZLL;
                    if (interfaceC652740Piy3 != null) {
                        objValueOf = Integer.valueOf(interfaceC652740Piy3.getPosition());
                    } else {
                        objValueOf = "-1";
                    }
                    jSONObject.put("position", objValueOf);
                    c1537720q7O2.LIZ("autoplayDeactivate", jSONObject);
                }
            }
            if (z) {
                LynxView lynxViewLJIILJJIL2 = this.LL.mContext.LJIILJJIL();
                if ((lynxViewLJIILJJIL2 instanceof C1537720q7O) && (c1537720q7O = (C1537720q7O) lynxViewLJIILJJIL2) != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("position", interfaceC652740Piy.getPosition());
                    c1537720q7O.LIZ("autoplayActivate", jSONObject2);
                }
            }
            this.LLILZLL = interfaceC652740Piy;
        }
        if (!Intrinsics.LJFF(this.LLIZ, searchServiceCenter$AutoPlayAbility) && (searchServiceCenter$AutoPlayAbility2 = this.LLIZ) != null) {
            searchServiceCenter$AutoPlayAbility2.LLZZZZ();
        }
        if (z && searchServiceCenter$AutoPlayAbility != null && !searchServiceCenter$AutoPlayAbility.isPlaying()) {
            searchServiceCenter$AutoPlayAbility.J0();
        }
        this.LLIZ = searchServiceCenter$AutoPlayAbility;
    }
}
