package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C098200Yq;
import X.C0P5G;
import X.C0PF9;
import X.C0PFK;
import X.C0PFN;
import X.C0PFX;
import X.C0PL1;
import X.C0PL2;
import X.C0PLT;
import X.C0QF5;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C189200o6;
import X.C19719912Dl;
import X.C1AF0;
import X.C1D66;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C647320PaE;
import X.C649470Pdh;
import X.C651830PhV;
import X.InterfaceC594520NTm;
import X.InterfaceC639160P5e;
import X.ViewOnAttachStateChangeListenerC648030PbN;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey;
import com.ss.android.ugc.aweme.search.lynx.core.ui.viewholder.DynamicViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TopMixAdapterControlAbilityImpl implements SearchServiceCenter$AdapterControlAbility, InterfaceC639160P5e {
    public final C0PF9 LL;
    public final GridLayoutManager LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final Integer D10(InterfaceC594520NTm interfaceC594520NTm) {
        InterfaceC594520NTm interfaceC594520NTmLIZ;
        C0PFN c0pfn;
        List<T> list = this.LL.mmItems;
        if (list == 0) {
            return null;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                InterfaceC594520NTm interfaceC594520NTm2 = (SearchMixFeed) obj;
                if (System.identityHashCode(interfaceC594520NTm2) != System.identityHashCode(interfaceC594520NTm)) {
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC594520NTm.class);
                    if ((interfaceC594520NTm2 instanceof C0PFN) && (c0pfn = (C0PFN) interfaceC594520NTm2) != null) {
                        interfaceC594520NTmLIZ = c0pfn.LIZ();
                    } else {
                        interfaceC594520NTmLIZ = null;
                    }
                    if (!c19719912DlLIZ.LIZIZ(interfaceC594520NTmLIZ)) {
                        interfaceC594520NTmLIZ = null;
                    }
                    if (!Intrinsics.LJFF(interfaceC594520NTmLIZ, interfaceC594520NTm)) {
                        i = i2;
                    }
                }
                return Integer.valueOf(i);
            }
            C1697810uHb.LJIJI();
            throw null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final boolean U02(InterfaceC594520NTm interfaceC594520NTm) {
        C0PF9 c0pf9 = this.LL;
        List<T> list = c0pf9.mmItems;
        if (list == 0) {
            return false;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (interfaceC594520NTm.retrieveIncrementalId() == ((SearchMixFeed) obj).retrieveIncrementalId()) {
                    SearchTopFragmentAbility searchTopFragmentAbility = (SearchTopFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJ(c0pf9.LLLFF, null), SearchTopFragmentAbility.class, null);
                    if (searchTopFragmentAbility != null) {
                        searchTopFragmentAbility.cy(c0pf9.LLLLILI() + i);
                    }
                    return true;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final int XR1(int i) {
        List<SearchMixFeed> arrayList;
        Collection collection = this.LL.mmItems;
        if (collection == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList(collection);
        }
        int i2 = 0;
        for (SearchMixFeed searchMixFeed : arrayList) {
            if (searchMixFeed != null && searchMixFeed.getFeedType() != 65465) {
                if (searchMixFeed.retrieveIncrementalId() != i) {
                    i2++;
                } else {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final Integer ej0(String str) {
        int iIntValue;
        String simpleName;
        C1D66 c1d66LIZ;
        SparkContext sparkContext;
        String str2;
        String str3;
        C1537720q7O c1537720q7O;
        C1537480q70 hybridContext;
        C0PF9 c0pf9 = this.LL;
        List<T> list = c0pf9.mmItems;
        if (list == 0) {
            return null;
        }
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                int basicItemViewType = c0pf9.getBasicItemViewType(i);
                if (basicItemViewType == 15 || basicItemViewType == 16 || basicItemViewType == 17 || C649470Pdh.LJIJ(basicItemViewType) || C649470Pdh.LJJII(basicItemViewType) || C651830PhV.LJ(basicItemViewType) || C651830PhV.LJI(Integer.valueOf(basicItemViewType))) {
                    Function0<Integer> function0 = c0pf9.LLJI;
                    if (function0 != null) {
                        iIntValue = function0.invoke().intValue();
                    } else {
                        iIntValue = 0;
                    }
                    int i3 = i + iIntValue;
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c0pf9.LLLFF.findViewHolderForAdapterPosition(i3);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("lynx type: ");
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        simpleName = viewHolderFindViewHolderForAdapterPosition.getClass().getSimpleName();
                    } else {
                        simpleName = null;
                    }
                    sbLIZ.append(simpleName);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (viewHolderFindViewHolderForAdapterPosition instanceof ViewOnAttachStateChangeListenerC648030PbN) {
                        LynxView lynxView = ((ViewOnAttachStateChangeListenerC648030PbN) viewHolderFindViewHolderForAdapterPosition).P5().LJ;
                        if ((lynxView instanceof C1537720q7O) && (c1537720q7O = (C1537720q7O) lynxView) != null && (hybridContext = c1537720q7O.getHybridContext()) != null) {
                            str3 = hybridContext.containerId;
                        } else {
                            str3 = null;
                        }
                        if (Intrinsics.LJFF(str3, str)) {
                            return Integer.valueOf(i3);
                        }
                    } else if ((viewHolderFindViewHolderForAdapterPosition instanceof DynamicViewHolder) && (c1d66LIZ = C647320PaE.LIZ(((DynamicViewHolder) viewHolderFindViewHolderForAdapterPosition).LL)) != null && (sparkContext = c1d66LIZ.LJFF) != null && (str2 = sparkContext.containerId) != null && Intrinsics.LJFF(str2, str)) {
                        return Integer.valueOf(i3);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final int qt2(String str) {
        List<C0PLT> arrayList;
        String aid;
        Collection collection = this.LL.mmItems;
        if (collection == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList(collection);
        }
        int i = 0;
        for (C0PLT c0plt : arrayList) {
            if (c0plt != null && c0plt.getFeedType() != 65465) {
                Aweme aweme = c0plt.getAweme();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (!Intrinsics.LJFF(aid, str)) {
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final boolean vn1(int i) {
        C0PLT c0plt;
        List<T> list = this.LL.mmItems;
        if (list != 0 && (c0plt = (C0PLT) C13LP.LJJJLZIJ(i, list)) != null && c0plt.getFeedType() == 112) {
            return true;
        }
        return false;
    }

    public TopMixAdapterControlAbilityImpl(C0PF9 c0pf9, GridLayoutManager gridLayoutManager) {
        this.LL = c0pf9;
        this.LLILLJJLI = gridLayoutManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility, X.InterfaceC639160P5e
    public final boolean vb(InterfaceC594520NTm interfaceC594520NTm, C0PL1 c0pl1) {
        InterfaceC594520NTm interfaceC594520NTmLIZ;
        C0PFN c0pfn;
        C0PF9 c0pf9 = this.LL;
        List<T> list = c0pf9.mmItems;
        if (list == 0) {
            return false;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            InterfaceC594520NTm interfaceC594520NTm2 = null;
            if (i >= 0) {
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                if (System.identityHashCode(searchMixFeed) != System.identityHashCode(interfaceC594520NTm)) {
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC594520NTm.class);
                    if ((searchMixFeed instanceof C0PFN) && (c0pfn = (C0PFN) searchMixFeed) != null) {
                        interfaceC594520NTmLIZ = c0pfn.LIZ();
                    } else {
                        interfaceC594520NTmLIZ = null;
                    }
                    if (c19719912DlLIZ.LIZIZ(interfaceC594520NTmLIZ)) {
                        interfaceC594520NTm2 = interfaceC594520NTmLIZ;
                    }
                    if (!Intrinsics.LJFF(interfaceC594520NTm2, interfaceC594520NTm)) {
                        i = i2;
                    }
                }
                List<T> list2 = c0pf9.mmItems;
                if (list2 != 0) {
                    ListProtector.remove(list2, i);
                }
                C0PFX.LIZ(c0pf9.LLLFF.findViewHolderForAdapterPosition(c0pf9.LLLLILI() + i), searchMixFeed, c0pl1);
                C0PFK c0pfkLLLZLL = c0pf9.LLLZLL();
                if (c0pfkLLLZLL != null) {
                    c0pfkLLLZLL.LIZLLL(searchMixFeed);
                }
                c0pf9.notifyItemRemoved(i);
                return true;
            }
            C1697810uHb.LJIJI();
            throw null;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final boolean ZG2(InterfaceC594520NTm interfaceC594520NTm, int i, C0PL2 c0pl2) {
        C0P5G c0p5gLIZJ;
        ISearchSurvey iSearchSurveyLIZ = C0QF5.LIZ();
        if (iSearchSurveyLIZ != null && (c0p5gLIZJ = iSearchSurveyLIZ.LIZJ()) != null && !c0p5gLIZJ.LIZIZ(c0pl2, this, this.LLILLJJLI)) {
            return false;
        }
        return this.LL.LLLZLZ(interfaceC594520NTm, i, c0pl2);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final boolean IU(InterfaceC594520NTm interfaceC594520NTm, int i, C0PL2 c0pl2, boolean z) {
        Object c098200Yq;
        int iLLLLILI;
        boolean zLLLZLZ;
        C0P5G c0p5gLIZJ;
        ISearchSurvey iSearchSurveyLIZ = C0QF5.LIZ();
        if (iSearchSurveyLIZ != null && (c0p5gLIZJ = iSearchSurveyLIZ.LIZJ()) != null && !c0p5gLIZJ.LIZIZ(c0pl2, this, this.LLILLJJLI)) {
            return false;
        }
        try {
            GridLayoutManager gridLayoutManager = this.LLILLJJLI;
            int iLJ = gridLayoutManager.LLIZ.LJ(i, gridLayoutManager.LLILLJJLI);
            int iLJFF = this.LLILLJJLI.LLIZ.LJFF(i);
            int i2 = this.LLILLJJLI.LLILLJJLI;
            if (iLJFF == i2) {
                iLLLLILI = (i + 1) - this.LL.LLLLILI();
            } else {
                iLLLLILI = ((i2 - iLJ) + i) - this.LL.LLLLILI();
            }
            if (!z || !(interfaceC594520NTm instanceof SearchMixFeed)) {
                zLLLZLZ = this.LL.LLLZLZ(interfaceC594520NTm, iLLLLILI, c0pl2);
            } else {
                zLLLZLZ = this.LL.LLLZZ((SearchMixFeed) interfaceC594520NTm, iLLLLILI, c0pl2);
            }
            c098200Yq = Boolean.valueOf(zLLLZLZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJFF(thM5exceptionOrNullimpl, "Insert");
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("position", String.valueOf(i));
            c2344009Gk.LIZJ(this.LL.getItemCount(), "size");
            c2344009Gk.LIZJ(this.LL.LLLLILI(), "header_size");
            C20684815ws.LJIILLIIL("search_result_insert_outofbound", c2344009Gk.LIZ);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final boolean f12(int i, InterfaceC594520NTm interfaceC594520NTm, C0PL1 c0pl1, C0PL2 c0pl2) {
        SearchMixFeed searchMixFeed;
        SearchMixFeed searchMixFeed2;
        Integer numValueOf;
        int iIntValue;
        List<SearchMixFeed> listLIZJ;
        List<SearchMixFeed> listLIZJ2;
        List<SearchMixFeed> listLIZJ3;
        C0PF9 c0pf9 = this.LL;
        List<T> list = c0pf9.mmItems;
        if (list != 0 && i >= 0 && i < list.size()) {
            List<T> list2 = c0pf9.mmItems;
            Integer numValueOf2 = null;
            if (list2 != 0) {
                searchMixFeed = (SearchMixFeed) C13LP.LJJJLZIJ(i - 1, list2);
            } else {
                searchMixFeed = null;
            }
            List<T> list3 = c0pf9.mmItems;
            if (list3 != 0) {
                searchMixFeed2 = (SearchMixFeed) C13LP.LJJJLZIJ(i, list3);
            } else {
                searchMixFeed2 = null;
            }
            SearchMixFeed searchMixFeed3 = (SearchMixFeed) interfaceC594520NTm;
            C0PFX.LIZ(c0pf9.LLLFF.findViewHolderForAdapterPosition(c0pf9.LLLLILI() + i), (SearchMixFeed) ListProtector.get(list, i), c0pl1);
            List<T> list4 = c0pf9.mmItems;
            if (list4 != 0) {
                ListProtector.set(list4, i, searchMixFeed3);
            }
            C0PFX.LIZIZ(searchMixFeed3, i, c0pl2);
            C0PFK c0pfkLLLZLL = c0pf9.LLLZLL();
            if (c0pfkLLLZLL != null && (listLIZJ3 = c0pfkLLLZLL.LIZJ()) != null) {
                numValueOf = Integer.valueOf(listLIZJ3.indexOf(searchMixFeed));
            } else {
                numValueOf = null;
            }
            C0PFK c0pfkLLLZLL2 = c0pf9.LLLZLL();
            if (c0pfkLLLZLL2 != null && (listLIZJ2 = c0pfkLLLZLL2.LIZJ()) != null) {
                numValueOf2 = Integer.valueOf(listLIZJ2.indexOf(searchMixFeed2));
            }
            int size = -1;
            if (numValueOf != null && numValueOf.intValue() != -1) {
                numValueOf2 = Integer.valueOf(numValueOf.intValue() + 1);
            }
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue();
            } else {
                iIntValue = i;
            }
            C0PFK c0pfkLLLZLL3 = c0pf9.LLLZLL();
            if (c0pfkLLLZLL3 != null && (listLIZJ = c0pfkLLLZLL3.LIZJ()) != null) {
                size = listLIZJ.size();
            }
            if (iIntValue <= size && iIntValue >= 0) {
                C0PFK c0pfkLLLZLL4 = c0pf9.LLLZLL();
                if (c0pfkLLLZLL4 != null) {
                    c0pfkLLLZLL4.LIZ(iIntValue, searchMixFeed3, searchMixFeed, searchMixFeed2);
                }
                c0pf9.notifyItemChanged(i);
                return true;
            }
            return false;
        }
        return false;
    }
}
