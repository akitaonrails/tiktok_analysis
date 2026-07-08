package com.ss.android.ugc.aweme.series.feed.mylist.assme.opt;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C15438062q;
import X.C1559170qfz;
import X.C1559260qg8;
import X.C1573160r2Y;
import X.C1573490r35;
import X.C1573510r37;
import X.C1573530r39;
import X.C316640Cb8;
import X.C317290CcB;
import X.C452501pT;
import X.C627660Ojc;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.ss.android.ugc.aweme.series.feed.model.MyListSceneEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesHistorySubPageViewModel extends AssemListViewModel<C1573490r35, C1573160r2Y, String> {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1559170qfz.class, "series_history_sub_page_key"), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(280));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(281));
    public final C1573510r37 LLILZ = new C1573510r37();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1573490r35(MyListSceneEnum.MY_LIST_SCENE_COLLECTION_HISTORY, 13);
    }

    public final C1559170qfz vQ2() {
        return (C1559170qfz) this.LL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MyListSceneEnum wQ2() {
        MyListSceneEnum myListSceneEnum = ((C1573490r35) getState()).LLILLJJLI;
        return myListSceneEnum == null ? MyListSceneEnum.MY_LIST_SCENE_COLLECTION_HISTORY : myListSceneEnum;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1573160r2Y> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 200));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        ArrayList arrayList;
        List<C1573160r2Y> list;
        String str;
        C1573510r37 c1573510r37 = this.LLILZ;
        String value = ((C1573490r35) getState()).LLILLJJLI.getValue();
        C1573530r39 c1573530r39 = c1573510r37.LIZ.get(value);
        if (c1573530r39 != null) {
            C1573530r39 c1573530r392 = c1573510r37.LIZ.get(value);
            if (c1573530r392 != null && (list = c1573530r392.LIZ) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C1573160r2Y> it2 = list.iterator();
                while (it2.hasNext()) {
                    ShortDramaOverview shortDramaOverview = it2.next().LL;
                    if (shortDramaOverview != null) {
                        str = shortDramaOverview.title;
                    } else {
                        str = null;
                    }
                    arrayList.add(str);
                }
            } else {
                arrayList = null;
            }
            Objects.toString(arrayList);
        }
        if (c1573530r39 != null) {
            if (c1573530r39.LIZJ) {
                return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, c1573530r39.LIZIZ, c1573530r39.LIZ, 1);
            }
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            List<C1573160r2Y> list2 = c1573530r39.LIZ;
            c317290CcB.getClass();
            return new C316640Cb8(list2);
        }
        return xQ2("", true, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(String str, InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        return xQ2(str, false, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[Catch: Exception -> 0x01f7, TryCatch #0 {Exception -> 0x01f7, blocks: (B:23:0x007d, B:24:0x0080, B:26:0x0084, B:28:0x0090, B:29:0x0094, B:33:0x009d, B:34:0x00ab, B:36:0x00b1, B:38:0x00b9, B:40:0x00c9, B:42:0x00d3, B:44:0x00d7, B:47:0x00de, B:48:0x00e1, B:50:0x00ea, B:53:0x00f6, B:52:0x00ee, B:54:0x0102, B:55:0x0105, B:56:0x0106, B:64:0x012c, B:65:0x0131, B:66:0x013a, B:68:0x0140, B:70:0x014c, B:71:0x0150, B:73:0x0169, B:75:0x016d, B:83:0x0192, B:84:0x019b, B:86:0x01a7, B:88:0x01ad, B:90:0x01bf, B:93:0x01d4, B:95:0x01e3, B:97:0x01ec, B:82:0x017c, B:60:0x0114, B:62:0x0120, B:63:0x0122, B:57:0x010c, B:15:0x003c, B:17:0x0053, B:20:0x0070, B:19:0x006e), top: B:102:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c A[Catch: Exception -> 0x01f7, TryCatch #0 {Exception -> 0x01f7, blocks: (B:23:0x007d, B:24:0x0080, B:26:0x0084, B:28:0x0090, B:29:0x0094, B:33:0x009d, B:34:0x00ab, B:36:0x00b1, B:38:0x00b9, B:40:0x00c9, B:42:0x00d3, B:44:0x00d7, B:47:0x00de, B:48:0x00e1, B:50:0x00ea, B:53:0x00f6, B:52:0x00ee, B:54:0x0102, B:55:0x0105, B:56:0x0106, B:64:0x012c, B:65:0x0131, B:66:0x013a, B:68:0x0140, B:70:0x014c, B:71:0x0150, B:73:0x0169, B:75:0x016d, B:83:0x0192, B:84:0x019b, B:86:0x01a7, B:88:0x01ad, B:90:0x01bf, B:93:0x01d4, B:95:0x01e3, B:97:0x01ec, B:82:0x017c, B:60:0x0114, B:62:0x0120, B:63:0x0122, B:57:0x010c, B:15:0x003c, B:17:0x0053, B:20:0x0070, B:19:0x006e), top: B:102:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(java.lang.String r16, boolean r17, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r18) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.mylist.assme.opt.SeriesHistorySubPageViewModel.xQ2(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
