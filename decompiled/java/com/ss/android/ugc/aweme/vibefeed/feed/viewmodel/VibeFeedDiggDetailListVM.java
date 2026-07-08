package com.ss.android.ugc.aweme.vibefeed.feed.viewmodel;

import X.C01GW;
import X.C09R9;
import X.C13BV;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1575440r6E;
import X.C2188811AlT;
import X.C2189821An6;
import X.C299700Bou;
import X.C452501pT;
import X.C622680Oba;
import X.C623470Ocr;
import X.C627260Oiy;
import X.C627660Ojc;
import X.C628860OlY;
import X.C628920Ole;
import X.C628930Olf;
import X.C629160Om2;
import X.C629210Om7;
import X.C723600SZy;
import X.C737030Svd;
import X.EnumC628900Olc;
import X.EnumC912680ZrG;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS36S2100000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeFeedDiggDetailListVM extends BaseDetailShareVM<C628860OlY, C628920Ole, String> {
    public boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final String LLILZIL = "";
    public boolean LLJIJIL = true;
    public final C09R9 LLJILJIL = new C09R9(this, C13LE.LIZ(C629210Om7.class));
    public final C1559260qg8 LLJILJILJ = new C1559260qg8(new C723600SZy(this, C628930Olf.class, "VibeFeedDiggDetailHierarchyData"), true);
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1606));

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 57;
    }

    public static boolean HQ2() {
        C629160Om2.LIZ.getClass();
        return C629160Om2.LIZ();
    }

    public final C628930Olf CQ2() {
        return (C628930Olf) this.LLJILJILJ.getValue();
    }

    public final EnumC912680ZrG FQ2() {
        return (EnumC912680ZrG) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C628860OlY(0);
    }

    public final int DQ2() {
        if (!HQ2()) {
            return 15;
        }
        if (FQ2().isGroup()) {
            C629160Om2.LIZ.getClass();
            return C629160Om2.LIZIZ().groupPageSize;
        }
        C629160Om2.LIZ.getClass();
        return C629160Om2.LIZIZ().pageSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    public final List<Aweme> getAwemeList() {
        ?? arrayList;
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAwemeList ");
        sbLIZ.append(((ArrayList) super.getAwemeList()).size());
        C2188811AlT.LIZIZ(sbLIZ);
        ArrayList arrayList2 = new ArrayList();
        C628860OlY c628860OlY = (C628860OlY) this.vmDispatcher.getState();
        c628860OlY.getClass();
        List listLIZ = C627260Oiy.LIZ(c628860OlY);
        if (listLIZ != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : listLIZ) {
                if (((C628920Ole) obj).LLIZLLLIL == EnumC628900Olc.FEED_ITEM) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                VibeFeedItem vibeFeedItem = ((C628920Ole) it2.next()).LLILLL;
                if (vibeFeedItem != null && (aweme = vibeFeedItem.aweme) != null) {
                    arrayList.add(aweme);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C622680Oba.LIZJ(this);
    }

    public final C628920Ole BQ2(String str) {
        String str2;
        String str3;
        String str4;
        Aweme aweme = new Aweme();
        aweme.setAid(str);
        C628930Olf c628930OlfCQ2 = CQ2();
        String str5 = null;
        if (c628930OlfCQ2 != null) {
            str2 = c628930OlfCQ2.LLILLL;
        } else {
            str2 = null;
        }
        String strValueOf = String.valueOf(str2);
        C628930Olf c628930OlfCQ22 = CQ2();
        if (c628930OlfCQ22 != null) {
            str3 = c628930OlfCQ22.LLILZLL;
        } else {
            str3 = null;
        }
        String strValueOf2 = String.valueOf(str3);
        C628930Olf c628930OlfCQ23 = CQ2();
        if (c628930OlfCQ23 != null) {
            str5 = c628930OlfCQ23.LL;
        }
        String strValueOf3 = String.valueOf(str5);
        EnumC628900Olc enumC628900Olc = EnumC628900Olc.DATE_TITLE;
        EnumC912680ZrG enumC912680ZrGFQ2 = FQ2();
        C628930Olf c628930OlfCQ24 = CQ2();
        if (c628930OlfCQ24 == null || (str4 = c628930OlfCQ24.LLIZ) == null) {
            str4 = "shared_feed";
        }
        return new C628920Ole(aweme, null, str, strValueOf, strValueOf2, strValueOf3, enumC628900Olc, enumC912680ZrGFQ2, str4);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    /* JADX INFO: renamed from: EQ2, reason: merged with bridge method [inline-methods] */
    public final List<C628920Ole> zQ2(C628860OlY c628860OlY) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getItemList state = ");
        c628860OlY.getClass();
        List listLIZ = C627260Oiy.LIZ(c628860OlY);
        if (listLIZ != null) {
            numValueOf = Integer.valueOf(listLIZ.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C628860OlY c628860OlY2 = (C628860OlY) this.vmDispatcher.getState();
        c628860OlY2.getClass();
        List listLIZ2 = C627260Oiy.LIZ(c628860OlY2);
        if (listLIZ2 != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLIZ2) {
                if (hashSet.add(((C628920Ole) obj).LLILLJJLI.getAid())) {
                    arrayList.add(obj);
                }
            }
        }
        List<C628920Ole> listItemState = c628860OlY.getListItemState();
        if (listItemState == null) {
            return C13BV.INSTANCE;
        }
        return listItemState;
    }

    public final Long GQ2(String str) {
        Object next;
        VibeFeedItem vibeFeedItem;
        String aid;
        Aweme aweme;
        List<ITEM> listListGetAll = listGetAll();
        if (listListGetAll == 0) {
            return null;
        }
        Iterator it2 = listListGetAll.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                VibeFeedItem vibeFeedItem2 = ((C628920Ole) next).LLILLL;
                if (vibeFeedItem2 != null && (aweme = vibeFeedItem2.aweme) != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C628920Ole c628920Ole = (C628920Ole) next;
        if (c628920Ole == null || (vibeFeedItem = c628920Ole.LLILLL) == null) {
            return null;
        }
        return vibeFeedItem.refreshTime;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C628920Ole> c627660Ojc) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newState size: ");
        List<C628920Ole> list = c627660Ojc.LLILZ;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" refreshState: ");
        sbLIZ.append(c627660Ojc.LL);
        sbLIZ.append(" loadMoreState:");
        sbLIZ.append(c627660Ojc.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 416));
    }

    @C14EU
    public final void onReceiveVideoEvent(C737030Svd c737030Svd) {
        Aweme awemeLLILZ;
        Object obj = c737030Svd.LIZIZ;
        String str = (String) obj;
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null) {
            awemeLLILZ = iAwemeService.LLILZ(str);
        } else {
            awemeLLILZ = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveVideoEvent: event type: ");
        sbLIZ.append(c737030Svd.LIZ);
        sbLIZ.append(" awemeId:");
        sbLIZ.append(str);
        sbLIZ.append(" param:");
        sbLIZ.append(obj);
        C299700Bou.LIZIZ("VibeFeedDiggDetailListVM", C2188811AlT.LIZIZ(sbLIZ));
        if (c737030Svd.LIZ == 13 && awemeLLILZ != null && awemeLLILZ.getAwemeType() != 13 && awemeLLILZ.getUserDigg() != 1) {
            withState(new AwS36S2100000_9(this, str, C1575440r6E.LIZ(), 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0185  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r23) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        String aid;
        Aweme aweme;
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                VibeFeedItem vibeFeedItem = ((C628920Ole) it2.next()).LLILLL;
                if (vibeFeedItem != null && (aweme = vibeFeedItem.aweme) != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteItemByAid aid = ");
        sbLIZ.append(str);
        sbLIZ.append(" deleteItemPos = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i >= 0) {
            listRemoveItemAt(i);
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        VibeFeedItem vibeFeedItem;
        C628920Ole c628920Ole = (C628920Ole) interfaceC1891350zJl;
        if (c628920Ole.LLIZLLLIL == EnumC628900Olc.FEED_ITEM && (vibeFeedItem = c628920Ole.LLILLL) != null) {
            return vibeFeedItem.aweme;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: IQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadLatest(java.lang.String r26, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r27) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM.onLoadLatest(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: JQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r27, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r28) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0284 A[LOOP:7: B:104:0x027e->B:106:0x0284, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C628920Ole> KQ2(java.util.List<com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItem> r29, java.util.List<X.C628920Ole> r30, X.AbstractC629110Olx r31) {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM.KQ2(java.util.List, java.util.List, X.0Olx):java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final String yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return this.LLILZIL;
    }
}
