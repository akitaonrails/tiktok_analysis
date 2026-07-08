package com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.viewmodel;

import X.AbstractC1511510pR7;
import X.C01GW;
import X.C04WM;
import X.C0PEM;
import X.C0PG0;
import X.C0PG1;
import X.C0PG2;
import X.C0PH7;
import X.C0PO5;
import X.C0QMR;
import X.C1108704Vh;
import X.C1112304Wr;
import X.C11JL;
import X.C11S5;
import X.C13LP;
import X.C15438062q;
import X.C1701940uOG;
import X.C1823307Cd;
import X.C19719512Dh;
import X.C2097608Jq;
import X.C2097808Js;
import X.C23250099c;
import X.C284340BCm;
import X.C452501pT;
import X.C641810PFj;
import X.C641840PFm;
import X.C641930PFv;
import X.C644060POa;
import X.C644560PPy;
import Y.AComparatorS23S0000000_4;
import Y.AfS106S0300000_10;
import Y.AfS179S0100000_10;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.search.SearchTabInfo;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.ai.SearchSmartDynamicTabConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.repo.SearchDynamicTabApi;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicTabViewModel extends ViewModel {
    public static final C01GW<AbstractC1511510pR7> LLJILJILJ = C452501pT.LIZIZ(new C0QMR());
    public final MutableLiveData<C0PG2> LL;
    public final MutableLiveData LLILLJJLI;
    public final MutableLiveData<C0PG2> LLILLL;
    public final MutableLiveData<Integer> LLILZ;
    public final MutableLiveData LLILZIL;
    public final MutableLiveData<Boolean> LLILZLL;
    public final MutableLiveData<Boolean> LLIZ;
    public final MutableLiveData<List<SearchTabInfo>> LLIZLLLIL;
    public final MutableLiveData<List<SearchTabInfo>> LLJ;
    public C11JL LLJI;
    public C641810PFj LLJIJIL;
    public C641840PFm LLJILJIL;

    public final boolean yQ2() {
        Integer value = this.LLILZ.getValue();
        return value != null && value.intValue() == 1 && this.LL.getValue() == C0PG2.REQUEST_RETURN;
    }

    public final void zQ2() {
        C11JL c11jl;
        if (this.LLJI != null && (!r0.isDisposed()) && (c11jl = this.LLJI) != null) {
            c11jl.dispose();
        }
        this.LLJI = null;
    }

    public SearchDynamicTabViewModel() {
        C0PG2 c0pg2 = C0PG2.INIT;
        MutableLiveData<C0PG2> mutableLiveData = new MutableLiveData<>(c0pg2);
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = new MutableLiveData<>(c0pg2);
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>(0);
        this.LLILZ = mutableLiveData2;
        this.LLILZIL = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>(Boolean.FALSE);
        this.LLILZLL = mutableLiveData3;
        this.LLIZ = mutableLiveData3;
        C644560PPy.LIZ.getClass();
        this.LLIZLLLIL = new MutableLiveData<>(C644560PPy.LIZJ);
        this.LLJ = new MutableLiveData<>();
        this.LLJIJIL = new C641810PFj();
        this.LLJILJIL = new C641840PFm(null);
    }

    public final void CQ2() {
        if (C1823307Cd.LIZ()) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                this.LL.setValue(C0PG2.REQUEST_REORDER_TAB_FINISH);
            } else {
                this.LL.postValue(C0PG2.REQUEST_REORDER_TAB_FINISH);
            }
        }
    }

    public final void AQ2(boolean z) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LLILZ.setValue(0);
            MutableLiveData<C0PG2> mutableLiveData = this.LLILLL;
            C0PG2 c0pg2 = C0PG2.RESET;
            mutableLiveData.setValue(c0pg2);
            if (z) {
                this.LL.setValue(c0pg2);
                return;
            } else {
                this.LL.setValue(C0PG2.RESET_BY_OTHER_TAB);
                return;
            }
        }
        if (z) {
            this.LL.postValue(C0PG2.RESET);
        } else {
            this.LL.postValue(C0PG2.RESET_BY_OTHER_TAB);
        }
        this.LLILLL.postValue(C0PG2.RESET);
        this.LLILZ.postValue(0);
    }

    public final void BQ2(C0PG2 c0pg2) {
        if (this.LL.getValue() == C0PG2.SEND_REQUEST_NOW) {
            this.LLJIJIL.LIZJ = System.currentTimeMillis();
        }
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LLILLL.setValue(c0pg2);
            C01GW c01gw = C1112304Wr.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 1) {
                if (this.LL.getValue() != C0PG2.SMART_MODEL_RETURN) {
                    this.LL.setValue(C0PG2.ABORT_REQUEST);
                }
            } else if (((Number) c01gw.getValue()).intValue() == 2 && this.LL.getValue() != C0PG2.REQUEST_RETURN) {
                vQ2(true);
            } else if (this.LL.getValue() != C0PG2.REQUEST_RETURN && this.LL.getValue() != C0PG2.REQUEST_REORDER_TAB_FINISH) {
                this.LL.setValue(C0PG2.ABORT_REQUEST);
            }
            if (C04WM.LIZ()) {
                if (yQ2()) {
                    C641810PFj c641810PFj = this.LLJIJIL;
                    if (c641810PFj.LJII == -1 && c641810PFj.LIZIZ > 0) {
                        c641810PFj.LJII = System.currentTimeMillis() - this.LLJIJIL.LIZIZ;
                        return;
                    }
                    return;
                }
                this.LLILZ.setValue(0);
                return;
            }
            this.LLILZ.setValue(0);
            return;
        }
        this.LLILLL.postValue(c0pg2);
        C01GW c01gw2 = C1112304Wr.LIZ;
        if (((Number) c01gw2.getValue()).intValue() == 1 && this.LL.getValue() != C0PG2.SMART_MODEL_RETURN) {
            this.LL.postValue(C0PG2.ABORT_REQUEST);
        } else if (((Number) c01gw2.getValue()).intValue() == 2 && this.LL.getValue() != C0PG2.REQUEST_RETURN) {
            vQ2(false);
        } else if (this.LL.getValue() != C0PG2.REQUEST_RETURN && this.LL.getValue() != C0PG2.REQUEST_REORDER_TAB_FINISH) {
            this.LL.postValue(C0PG2.ABORT_REQUEST);
        }
        if (C04WM.LIZ()) {
            if (yQ2()) {
                C641810PFj c641810PFj2 = this.LLJIJIL;
                if (c641810PFj2.LJII != -1 || c641810PFj2.LIZIZ <= 0) {
                    return;
                }
                c641810PFj2.LJII = System.currentTimeMillis() - this.LLJIJIL.LIZIZ;
                return;
            }
            this.LLILZ.postValue(0);
            return;
        }
        this.LLILZ.postValue(0);
    }

    public final void DQ2(SearchResultParam searchResultParam) {
        this.LLJIJIL.LJ = System.currentTimeMillis();
        C641810PFj c641810PFj = this.LLJIJIL;
        long j = c641810PFj.LJ - c641810PFj.LIZLLL;
        long j2 = (c641810PFj.LIZIZ - c641810PFj.LIZ) + j;
        if (searchResultParam != null) {
            C644060POa.LIZ.getClass();
            C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
            c0po5LJII.LJJIIJZLJL = j;
            c0po5LJII.LJJIIZ = j2;
        }
    }

    public final void vQ2(boolean z) {
        List<SearchTabInfo> value;
        List listLLIIII;
        if (this.LLJ.getValue() != null && (!r0.isEmpty()) && (value = this.LLJ.getValue()) != null && (listLLIIII = C13LP.LLIIII(value)) != null) {
            C644560PPy.LIZ.getClass();
            C644560PPy.LJJIFFI(listLLIIII);
            if (z) {
                this.LL.setValue(C0PG2.SMART_MODEL_RETURN);
                this.LLIZLLLIL.setValue(this.LLJ.getValue());
                this.LLILZLL.setValue(Boolean.TRUE);
                this.LLILZ.setValue(1);
                return;
            }
            this.LL.postValue(C0PG2.SMART_MODEL_RETURN);
            this.LLIZLLLIL.postValue(this.LLJ.getValue());
            this.LLILZLL.postValue(Boolean.TRUE);
            this.LLILZ.postValue(1);
        }
    }

    public final List<SearchTabInfo> xQ2(Map<String, Double> map) {
        List<SearchTabInfo> list;
        Object next;
        Object next2;
        Object obj;
        Map<String, String> map2 = ((SearchSmartDynamicTabConfig) C0PH7.LIZIZ.getValue()).outputMapping;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = C2097608Jq.LJIILLIIL(C13LP.LJLLLL(new AComparatorS23S0000000_4(3), C2097808Js.LJIL(map))).entrySet().iterator();
        while (it2.hasNext()) {
            Object obj2 = C641930PFv.LIZJ().get(C2097608Jq.LJFF(((Map.Entry) it2.next()).getKey(), map2));
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            this.LLJIJIL.LJFF = C0PG1.SMART_MODEL_POSTPROCESSING_MAPPING_ERROR;
            return new ArrayList();
        }
        ListProtector.add(arrayList, 0, new SearchTabInfo("general", -1, false, false));
        C644560PPy.LIZ.getClass();
        for (SearchTabInfo searchTabInfo : (CopyOnWriteArrayList) C644560PPy.LIZIZ) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((SearchTabInfo) it3.next()).tabName);
            }
            if (!arrayList2.contains(searchTabInfo.tabName) && (obj = C641930PFv.LIZJ().get(searchTabInfo.tabName)) != null) {
                arrayList.add(obj);
            }
        }
        List listLJJII = C644560PPy.LJJII(arrayList, null);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listLJJII) {
            C644560PPy.LIZ.getClass();
            if (C644560PPy.LJJIIJZLJL((SearchTabInfo) obj3, null)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        C641840PFm c641840PFm = this.LLJILJIL;
        c641840PFm.getClass();
        if (((Boolean) C284340BCm.LIZ.getValue()).booleanValue()) {
            list = (List) c641840PFm.LIZIZ.getValue();
        } else {
            list = C641930PFv.LIZLLL().specifiedTabOrderList;
        }
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList5 = new ArrayList();
            for (SearchTabInfo searchTabInfo2 : list) {
                String str = searchTabInfo2.tabName;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (Intrinsics.LJFF(((SearchTabInfo) next2).tabName, searchTabInfo2.tabName)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                arrayList5.add(new SearchTabInfo(str, arrayList4.indexOf(next2), false, false));
            }
            for (SearchTabInfo searchTabInfo3 : C13LP.LJLLLL(new AComparatorS23S0000000_4(8), arrayList5)) {
                Iterator it5 = arrayList4.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next = it5.next();
                        if (Intrinsics.LJFF(((SearchTabInfo) next).tabName, searchTabInfo3.tabName)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C19719512Dh.LIZ(arrayList4).remove(next);
            }
            for (SearchTabInfo searchTabInfo4 : C13LP.LJLLLL(new AComparatorS23S0000000_4(7), arrayList5)) {
                Object obj4 = C641930PFv.LIZJ().get(searchTabInfo4.tabName);
                if (obj4 != null) {
                    ListProtector.add(arrayList4, searchTabInfo4.tabFixedPosition, obj4);
                }
            }
        }
        List<SearchTabInfo> value = this.LLIZLLLIL.getValue();
        if (value != null && arrayList4.size() != value.size()) {
            this.LLJIJIL.LJFF = C0PG1.SMART_MODEL_POSTPROCESSING_LIST_SIZE_ERROR;
            return new ArrayList();
        }
        return arrayList4;
    }

    public final void wQ2(String str, ISearchContextAbility iSearchContextAbility) {
        String str2;
        boolean zLJI = MethodIDManager.LJI(202461);
        zQ2();
        this.LL.postValue(C0PG2.SEND_REQUEST_NOW);
        List<SearchTabInfo> list = C644560PPy.LIZJ;
        C01GW c01gw = C1112304Wr.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0 && ((Number) C1108704Vh.LIZ.getValue()).intValue() != 3) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0PG0(str, this, null), 2);
            if (((Number) c01gw.getValue()).intValue() == 1) {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        this.LLJIJIL.LIZ = System.currentTimeMillis();
        C641840PFm c641840PFm = this.LLJILJIL;
        c641840PFm.getClass();
        if (((Boolean) C284340BCm.LIZ.getValue()).booleanValue()) {
            str2 = (String) c641840PFm.LIZJ.getValue();
        } else {
            str2 = (String) C641930PFv.LIZJ.getValue();
        }
        this.LLJI = (C11JL) SearchDynamicTabApi.LIZ(str, list, str2).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS106S0300000_10(list, this, iSearchContextAbility, 0), new AfS179S0100000_10(this, 6));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
