package com.ss.android.ugc.aweme.poi.detail.post;

import X.AbstractC316870CbV;
import X.C099R;
import X.C0PEM;
import X.C0TT3;
import X.C1165730gRP;
import X.C1186720gzG;
import X.C1186760gzK;
import X.C1187510h0X;
import X.C1187600h0g;
import X.C1187610h0h;
import X.C1187970h1H;
import X.C1188090h1T;
import X.C14EU;
import X.C2188811AlT;
import X.C2189821An6;
import X.C23250099c;
import X.C322910ClF;
import X.C322920ClG;
import X.C622680Oba;
import X.C627660Ojc;
import X.C737030Svd;
import X.InterfaceC0148002o;
import X.InterfaceC1181010gq3;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS6S2400000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostPageShareVM extends BaseDetailShareVM<C1187970h1H, InterfaceC1891350zJl, C1187510h0X> {
    public C1187610h0h LLILZIL;
    public PoiDetailVideoListModel LLIZ;
    public String LLIZLLLIL;
    public String LLJIJIL;
    public C1187510h0X LLILZLL = new C1187510h0X(0, 0, 0, 1, 1);
    public final List<Aweme> LLJ = Collections.synchronizedList(new ArrayList());
    public final Map<String, PoiDetailVideoListModel> LLJI = new LinkedHashMap();

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 51;
    }

    public final C1187970h1H DQ2() {
        return (C1187970h1H) this.vmDispatcher.getState();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1187970h1H(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        C1188090h1T c1188090h1T = ((C1187970h1H) getState()).LLILLJJLI;
        if ((c1188090h1T != null ? c1188090h1T.poiPostBusinessType : null) == C0TT3.POI_LIMITED) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322920ClG(this, null), 2);
        }
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

    public static String CQ2(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
        List<PoiListApi.PostTag> postTagList;
        PoiListApi.PostTag next;
        if (poiMergedListResponse == null || (postTagList = poiMergedListResponse.getPostTagList()) == null) {
            return null;
        }
        Iterator<PoiListApi.PostTag> it2 = postTagList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.isSelected(), Boolean.TRUE)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PoiListApi.PostTag postTag = next;
        if (postTag == null) {
            return null;
        }
        return postTag.tagCode;
    }

    public final void IQ2(PoiListApi.PostTag postTag) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSelectedTag selectedTag:");
        sbLIZ.append(postTag);
        C2188811AlT.LIZIZ(sbLIZ);
        setStateImmediate(new AwS597S0100000_18(postTag, 341));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void NQ2(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePoiPostResponse poiPostResponse:");
        sbLIZ.append(poiMergedListResponse);
        C2188811AlT.LIZIZ(sbLIZ);
        if (poiMergedListResponse == null) {
            return;
        }
        this.LLJ.clear();
        ((LinkedHashMap) this.LLJI).clear();
        IQ2(null);
        if (((C1187970h1H) getState()).LLILLJJLI != null) {
            setStateImmediate(new AwS384S0200000_18(this, poiMergedListResponse, 101));
        }
        manualListRefresh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        C0TT3 c0tt3;
        C1187510h0X c1187510h0X = (C1187510h0X) obj;
        super.manualListLoadMore(c1187510h0X);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("manualListLoadMore cursor:");
        sbLIZ.append(c1187510h0X);
        C2188811AlT.LIZIZ(sbLIZ);
        C1188090h1T c1188090h1T = ((C1187970h1H) getState()).LLILLJJLI;
        if (c1188090h1T != null) {
            c0tt3 = c1188090h1T.poiPostBusinessType;
        } else {
            c0tt3 = null;
        }
        if (c0tt3 == C0TT3.POI_LIMITED) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322910ClF(this, c1187510h0X, null), 2);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newState newListState:");
        sbLIZ.append(c627660Ojc);
        C2188811AlT.LIZIZ(sbLIZ);
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 340));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1187510h0X>> interfaceC1364105Vn) {
        this.LLJ.clear();
        this.LLIZLLLIL = null;
        return onLoadMore(new C1187510h0X(0L, 0L, 0L, 1, 1), interfaceC1364105Vn);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        String str2;
        Aweme awemeLLILZ;
        List<C1186760gzK> list;
        int i = c737030Svd.LIZ;
        if (i != 2) {
            if (i == 13) {
                Object obj = c737030Svd.LIZIZ;
                if ((obj instanceof String) && (str2 = (String) obj) != null && str2.length() != 0) {
                    IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                    if (iAwemeService != null && (awemeLLILZ = iAwemeService.LLILZ(str2)) != null) {
                        for (PoiDetailVideoListModel poiDetailVideoListModel : ((LinkedHashMap) this.LLJI).values()) {
                            if (poiDetailVideoListModel != null && (list = poiDetailVideoListModel.dataList) != null) {
                                Iterator<C1186760gzK> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    Aweme aweme = it2.next().LIZ;
                                    if (aweme != null && Intrinsics.LJFF(aweme.getAid(), str2)) {
                                        JQ2(aweme, awemeLLILZ);
                                    }
                                }
                            }
                        }
                    }
                    withState(new AwS132S1100000_18(this, str2, 8));
                    return;
                }
                return;
            }
            return;
        }
        Object obj2 = c737030Svd.LIZIZ;
        if ((obj2 instanceof String) && (str = (String) obj2) != null && str.length() != 0) {
            vQ2(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
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
                if ((interfaceC1891350zJl instanceof C1187600h0g) && Intrinsics.LJFF(((C1187600h0g) interfaceC1891350zJl).LLILLJJLI.getAid(), str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1187600h0g) {
            return ((C1187600h0g) interfaceC1891350zJl).LLILLJJLI;
        }
        return null;
    }

    public static void JQ2(Aweme aweme, Aweme aweme2) {
        if (aweme2 == null || aweme2 == aweme) {
            return;
        }
        aweme.setUserDigg(aweme2.getUserDigg());
        AwemeStatistics statistics = aweme2.getStatistics();
        if (statistics != null) {
            long jLongValue = Long.valueOf(statistics.getDiggCount()).longValue();
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null) {
                statistics2.setDiggCount(jLongValue);
            }
        }
    }

    public final void BQ2(String str, PoiDetailVideoListModel poiDetailVideoListModel) {
        if (str != null && str.length() != 0 && poiDetailVideoListModel != null) {
            this.LLJI.put(str, poiDetailVideoListModel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: Exception -> 0x0212, TryCatch #1 {Exception -> 0x0212, blocks: (B:48:0x00b1, B:50:0x00b9, B:52:0x00bd, B:54:0x00c1, B:55:0x00c5, B:56:0x00c7, B:60:0x00d0, B:62:0x00d5, B:66:0x00de, B:70:0x00e5, B:72:0x00e9, B:73:0x00f2, B:75:0x00f8, B:88:0x0150, B:78:0x0103, B:80:0x0119, B:81:0x0121, B:83:0x0136, B:84:0x0139, B:90:0x0156, B:93:0x015c, B:99:0x016c, B:101:0x0170, B:102:0x0174, B:104:0x0178, B:105:0x017c, B:107:0x0184, B:108:0x0188, B:110:0x018c, B:111:0x0190, B:113:0x0194, B:114:0x0198, B:116:0x019c, B:117:0x01a0, B:95:0x0162, B:97:0x0166, B:124:0x01d7, B:89:0x0154, B:126:0x01f9, B:24:0x0066, B:26:0x006c, B:28:0x0070, B:30:0x0074, B:32:0x007a, B:37:0x0086, B:39:0x008b, B:42:0x0097, B:45:0x00a4, B:38:0x0089), top: B:139:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0 A[Catch: Exception -> 0x0212, TRY_ENTER, TryCatch #1 {Exception -> 0x0212, blocks: (B:48:0x00b1, B:50:0x00b9, B:52:0x00bd, B:54:0x00c1, B:55:0x00c5, B:56:0x00c7, B:60:0x00d0, B:62:0x00d5, B:66:0x00de, B:70:0x00e5, B:72:0x00e9, B:73:0x00f2, B:75:0x00f8, B:88:0x0150, B:78:0x0103, B:80:0x0119, B:81:0x0121, B:83:0x0136, B:84:0x0139, B:90:0x0156, B:93:0x015c, B:99:0x016c, B:101:0x0170, B:102:0x0174, B:104:0x0178, B:105:0x017c, B:107:0x0184, B:108:0x0188, B:110:0x018c, B:111:0x0190, B:113:0x0194, B:114:0x0198, B:116:0x019c, B:117:0x01a0, B:95:0x0162, B:97:0x0166, B:124:0x01d7, B:89:0x0154, B:126:0x01f9, B:24:0x0066, B:26:0x006c, B:28:0x0070, B:30:0x0074, B:32:0x007a, B:37:0x0086, B:39:0x008b, B:42:0x0097, B:45:0x00a4, B:38:0x0089), top: B:139:0x0066 }] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: GQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1187510h0X r25, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1187510h0X>> r26) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM.onLoadMore(X.0h0X, X.05Vn):java.lang.Object");
    }

    public final Object LQ2(C1187510h0X c1187510h0X, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        C1188090h1T c1188090h1T;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryDefaultLoadMore cursor:");
        sbLIZ.append(c1187510h0X);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1187510h0X.LIZ == 0) {
            C1187970h1H c1187970h1HDQ2 = DQ2();
            if (c1187970h1HDQ2 != null && (c1188090h1T = c1187970h1HDQ2.LLILLJJLI) != null) {
                poiMergedListResponse = c1188090h1T.poiInitPostModule;
            } else {
                poiMergedListResponse = null;
            }
            this.LLIZ = C1186720gzG.LIZ(poiMergedListResponse, this.LLJ, false, false);
            return Unit.LIZ;
        }
        Object objEQ2 = EQ2(c1187510h0X, str, null, null, interfaceC1364105Vn);
        if (objEQ2 == C099R.LJFF()) {
            return objEQ2;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object MQ2(X.C1187510h0X r18, java.lang.String r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM.MQ2(X.0h0X, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C1187510h0X yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCursorByFeedParam queryType:");
        sbLIZ.append(i);
        sbLIZ.append(" , lastCursor:");
        sbLIZ.append(this.LLILZLL);
        C2188811AlT.LIZIZ(sbLIZ);
        return this.LLILZLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EQ2(X.C1187510h0X r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, X.InterfaceC1364105Vn<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM.EQ2(X.0h0X, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void HQ2(String str, String str2, Map<String, EventModel> map, InterfaceC1181010gq3 interfaceC1181010gq3, PoiListApi.PoiMergedListResponse poiMergedListResponse, C0TT3 c0tt3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setInitData poiId:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        setStateImmediate(new AwS6S2400000_18(str, str2, (String) map, (Map<String, EventModel>) interfaceC1181010gq3, (InterfaceC1181010gq3) poiMergedListResponse, (PoiListApi.PoiMergedListResponse) c0tt3, (C0TT3) 3));
    }
}
