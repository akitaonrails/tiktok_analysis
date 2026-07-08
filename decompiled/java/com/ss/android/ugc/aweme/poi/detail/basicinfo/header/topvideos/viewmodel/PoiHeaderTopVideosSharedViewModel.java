package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel;

import X.AbstractC316870CbV;
import X.C0PEM;
import X.C1165730gRP;
import X.C1183810guZ;
import X.C1185430gxB;
import X.C1187230h05;
import X.C1187300h0C;
import X.C1187410h0N;
import X.C13BV;
import X.C2189821An6;
import X.C23250099c;
import X.C322950ClJ;
import X.C322960ClK;
import X.C627660Ojc;
import X.EnumC1987807qW;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderTopVideosSharedViewModel extends BaseDetailShareVM<C1187300h0C, InterfaceC1891350zJl, C1187410h0N> {
    public C1187230h05 LLILZIL;
    public PoiInnerPageMobData LLILZLL;
    public EnumC1987807qW LLIZ;
    public PoiDetailApi.PoiTopVideosLoadMoreResponse LLIZLLLIL;
    public String LLJ;
    public Integer LLJI;
    public C1187410h0N LLJIJIL = new C1187410h0N(null);
    public final Set<String> LLJILJIL = Collections.synchronizedSet(new LinkedHashSet());
    public int LLJILJILJ;
    public int LLJILLL;
    public String LLJJ;
    public String LLJJI;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 53;
    }

    public final C1187300h0C BQ2() {
        return (C1187300h0C) this.vmDispatcher.getState();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1187300h0C(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        if (this.LLIZ == EnumC1987807qW.POI_HEADER_TOP_VIDEOS) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322950ClJ(this, null), 2);
        }
    }

    public final List<PoiListApi.PoiMergedListItem> CQ2(List<PoiListApi.PoiMergedListItem> list) {
        Aweme aweme;
        String aid;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (PoiListApi.PoiMergedListItem poiMergedListItem : list) {
                if (poiMergedListItem != null && (aweme = poiMergedListItem.getAweme()) != null && (aid = aweme.getAid()) != null && aid.length() != 0 && !this.LLJILJIL.contains(aid)) {
                    this.LLJILJIL.add(aid);
                    arrayList.add(poiMergedListItem);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        C1187410h0N c1187410h0N = (C1187410h0N) obj;
        super.manualListLoadMore(c1187410h0N);
        if (this.LLIZ == EnumC1987807qW.POI_HEADER_TOP_VIDEOS) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322960ClK(this, c1187410h0N, null), 2);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 310));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1187410h0N>> interfaceC1364105Vn) {
        return onLoadMore(new C1187410h0N(null), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        String aid;
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                if (interfaceC1891350zJl instanceof C1183810guZ) {
                    Aweme aweme = ((C1183810guZ) interfaceC1891350zJl).LLILLJJLI.getAweme();
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid, str)) {
                        i = i2;
                        if (i2 >= 0) {
                            listRemoveItemAt(i2);
                        }
                    }
                }
                i2++;
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1183810guZ c1183810guZ;
        PoiListApi.PoiMergedListItem poiMergedListItem;
        if (!(interfaceC1891350zJl instanceof C1183810guZ) || (c1183810guZ = (C1183810guZ) interfaceC1891350zJl) == null || (poiMergedListItem = c1183810guZ.LLILLJJLI) == null) {
            return null;
        }
        return poiMergedListItem.getAweme();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9 A[Catch: Exception -> 0x026b, TryCatch #0 {Exception -> 0x026b, blocks: (B:67:0x0134, B:68:0x0137, B:70:0x013b, B:71:0x013f, B:73:0x0145, B:74:0x0167, B:78:0x0178, B:122:0x0229, B:124:0x022d, B:131:0x0241, B:134:0x024b, B:136:0x0259, B:138:0x0260, B:126:0x0233, B:128:0x0239, B:130:0x023d, B:79:0x017c, B:81:0x0182, B:83:0x0188, B:85:0x018e, B:121:0x0227, B:92:0x019c, B:93:0x01aa, B:95:0x01b0, B:96:0x01c5, B:98:0x01cb, B:100:0x01d7, B:102:0x01dd, B:111:0x01fa, B:113:0x0202, B:118:0x020b, B:119:0x020d, B:105:0x01e7, B:107:0x01ed, B:120:0x0224, B:53:0x00d2, B:54:0x00d5, B:56:0x00d9, B:57:0x00dd, B:59:0x00e3, B:25:0x006b, B:28:0x0077, B:31:0x0081, B:33:0x0087, B:35:0x008d, B:37:0x0093, B:47:0x00a6, B:50:0x00b7, B:61:0x0108, B:64:0x0119), top: B:143:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3 A[Catch: Exception -> 0x026b, TryCatch #0 {Exception -> 0x026b, blocks: (B:67:0x0134, B:68:0x0137, B:70:0x013b, B:71:0x013f, B:73:0x0145, B:74:0x0167, B:78:0x0178, B:122:0x0229, B:124:0x022d, B:131:0x0241, B:134:0x024b, B:136:0x0259, B:138:0x0260, B:126:0x0233, B:128:0x0239, B:130:0x023d, B:79:0x017c, B:81:0x0182, B:83:0x0188, B:85:0x018e, B:121:0x0227, B:92:0x019c, B:93:0x01aa, B:95:0x01b0, B:96:0x01c5, B:98:0x01cb, B:100:0x01d7, B:102:0x01dd, B:111:0x01fa, B:113:0x0202, B:118:0x020b, B:119:0x020d, B:105:0x01e7, B:107:0x01ed, B:120:0x0224, B:53:0x00d2, B:54:0x00d5, B:56:0x00d9, B:57:0x00dd, B:59:0x00e3, B:25:0x006b, B:28:0x0077, B:31:0x0081, B:33:0x0087, B:35:0x008d, B:37:0x0093, B:47:0x00a6, B:50:0x00b7, B:61:0x0108, B:64:0x0119), top: B:143:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b A[Catch: Exception -> 0x026b, TryCatch #0 {Exception -> 0x026b, blocks: (B:67:0x0134, B:68:0x0137, B:70:0x013b, B:71:0x013f, B:73:0x0145, B:74:0x0167, B:78:0x0178, B:122:0x0229, B:124:0x022d, B:131:0x0241, B:134:0x024b, B:136:0x0259, B:138:0x0260, B:126:0x0233, B:128:0x0239, B:130:0x023d, B:79:0x017c, B:81:0x0182, B:83:0x0188, B:85:0x018e, B:121:0x0227, B:92:0x019c, B:93:0x01aa, B:95:0x01b0, B:96:0x01c5, B:98:0x01cb, B:100:0x01d7, B:102:0x01dd, B:111:0x01fa, B:113:0x0202, B:118:0x020b, B:119:0x020d, B:105:0x01e7, B:107:0x01ed, B:120:0x0224, B:53:0x00d2, B:54:0x00d5, B:56:0x00d9, B:57:0x00dd, B:59:0x00e3, B:25:0x006b, B:28:0x0077, B:31:0x0081, B:33:0x0087, B:35:0x008d, B:37:0x0093, B:47:0x00a6, B:50:0x00b7, B:61:0x0108, B:64:0x0119), top: B:143:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145 A[Catch: Exception -> 0x026b, TryCatch #0 {Exception -> 0x026b, blocks: (B:67:0x0134, B:68:0x0137, B:70:0x013b, B:71:0x013f, B:73:0x0145, B:74:0x0167, B:78:0x0178, B:122:0x0229, B:124:0x022d, B:131:0x0241, B:134:0x024b, B:136:0x0259, B:138:0x0260, B:126:0x0233, B:128:0x0239, B:130:0x023d, B:79:0x017c, B:81:0x0182, B:83:0x0188, B:85:0x018e, B:121:0x0227, B:92:0x019c, B:93:0x01aa, B:95:0x01b0, B:96:0x01c5, B:98:0x01cb, B:100:0x01d7, B:102:0x01dd, B:111:0x01fa, B:113:0x0202, B:118:0x020b, B:119:0x020d, B:105:0x01e7, B:107:0x01ed, B:120:0x0224, B:53:0x00d2, B:54:0x00d5, B:56:0x00d9, B:57:0x00dd, B:59:0x00e3, B:25:0x006b, B:28:0x0077, B:31:0x0081, B:33:0x0087, B:35:0x008d, B:37:0x0093, B:47:0x00a6, B:50:0x00b7, B:61:0x0108, B:64:0x0119), top: B:143:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172 A[PHI: r0
      0x0172: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v21 java.lang.String) binds: [B:58:0x00e1, B:72:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0174  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v30, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v35, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v37, types: [X.13BV] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: EQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1187410h0N r24, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1187410h0N>> r25) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel.onLoadMore(X.0h0N, X.05Vn):java.lang.Object");
    }

    public final void DQ2(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        String str2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        PoiInnerPageMobData poiInnerPageMobData = this.LLILZLL;
        if (poiInnerPageMobData != null) {
            str2 = poiInnerPageMobData.enterFrom;
        } else {
            str2 = null;
        }
        C1185430gxB.LJJIJL(c1185430gxB, str2, str, interfaceC665370Q7z, "poi_secondary_gallery_page", "category_background_album", pageFinder);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FQ2(java.lang.String r12, java.lang.String r13, com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule r14, X.EnumC1987807qW r15) {
        /*
            r11 = this;
            java.util.Set<java.lang.String> r0 = r11.LLJILJIL
            r0.clear()
            r9 = 0
            if (r14 == 0) goto L66
            java.util.List r0 = r14.getTabList()
            if (r0 == 0) goto L66
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab r0 = (com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PoiMultiMediumTab) r0
            if (r0 == 0) goto L67
            java.lang.String r1 = r0.getTabCode()
        L1a:
            r11.LLJ = r1
            r11.LLJJ = r12
            r11.LLJJI = r13
            r11.LLIZ = r15
            if (r14 == 0) goto L64
            java.util.List r1 = r14.getMergedListItems()
        L28:
            java.util.List r2 = r11.CQ2(r1)
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiTopVideosLoadMoreResponse r1 = new com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiTopVideosLoadMoreResponse
            if (r14 == 0) goto L5d
            java.lang.String r3 = r14.getCursor()
            java.lang.Boolean r4 = r14.getHasMore()
            java.lang.String r5 = r14.getDataVersion()
            java.util.List r6 = r14.getTabList()
            java.lang.String r7 = r14.getTitle()
            java.lang.Integer r8 = r14.getPostBottomBarStyle()
            java.lang.Integer r9 = r14.getItemLayoutStyle()
        L4c:
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.LLIZLLLIL = r1
            kotlin.jvm.internal.AwS384S0200000_18 r2 = new kotlin.jvm.internal.AwS384S0200000_18
            r1 = 93
            r2.<init>(r11, r0, r1)
            r11.setStateImmediate(r2)
            return
        L5d:
            r3 = r9
            r4 = r9
            r5 = r9
            r6 = r9
            r7 = r9
            r8 = r9
            goto L4c
        L64:
            r1 = r9
            goto L28
        L66:
            r0 = r9
        L67:
            r1 = r9
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel.FQ2(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule, X.07qW):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C1187410h0N yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return this.LLJIJIL;
    }
}
