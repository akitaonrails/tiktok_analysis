package com.ss.android.ugc.aweme.poi.detail.videolist;

import X.AbstractC316870CbV;
import X.C099R;
import X.C1184920gwM;
import X.C1186720gzG;
import X.C1187510h0X;
import X.C1187520h0Y;
import X.C1187540h0a;
import X.C1187600h0g;
import X.C1188010h1L;
import X.C1188110h1V;
import X.C14EU;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2189821An6;
import X.C285770BHz;
import X.C622680Oba;
import X.C627660Ojc;
import X.C737030Svd;
import X.EnumC1184730gw3;
import X.EnumC1188100h1U;
import X.InterfaceC0148002o;
import X.InterfaceC1181010gq3;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import com.ss.android.ugc.aweme.poi.experiment.PoiDetailVideoListAutoPlayExp;
import com.ss.android.ugc.aweme.poi.experiment.PoiDetailVideoReviewListExp;
import com.ss.android.ugc.aweme.poi.experiment.PoiPostOptExp;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiVideoListSharedViewModel extends BaseDetailShareVM<C1187520h0Y, InterfaceC1891350zJl, C1187510h0X> {
    public static final C1187540h0a LLJJJJJIL = new C1187540h0a();
    public PoiListApi.PostTab LLILZLL;
    public PoiListApi.PostTab LLIZ;
    public PoiListApi.PostTag LLIZLLLIL;
    public PoiDetailVideoListModel LLJ;
    public PoiListApi.PoiMergedListResponse LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public PoiListApi.PoiDetailResponse LLJJI;
    public Map<String, EventModel> LLJJIII;
    public InterfaceC1181010gq3 LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public C1187510h0X LLILZIL = new C1187510h0X(0, 0, 0, 1, 1);
    public final List<String> LLJILLL = new ArrayList();
    public final List<String> LLJJ = new ArrayList();
    public final List<Aweme> LLJJJ = Collections.synchronizedList(new ArrayList());
    public final Map<String, PoiDetailVideoListModel> LLJJJIL = new LinkedHashMap();
    public final Map<String, PoiDetailVideoListModel> LLJJJJ = new LinkedHashMap();

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 44;
    }

    public final boolean FQ2() {
        PoiDetailVideoListAutoPlayExp poiDetailVideoListAutoPlayExp = PoiDetailVideoListAutoPlayExp.LIZ;
        String str = this.LLJILJILJ;
        poiDetailVideoListAutoPlayExp.getClass();
        PoiDetailVideoListAutoPlayExp.PoiDetailVideoListConfig poiDetailVideoListConfigLIZ = PoiDetailVideoListAutoPlayExp.LIZ(str);
        if (poiDetailVideoListConfigLIZ == null || !poiDetailVideoListConfigLIZ.isTwoColumn) {
            PoiDetailVideoReviewListExp poiDetailVideoReviewListExp = PoiDetailVideoReviewListExp.LIZ;
            String str2 = this.LLJILJILJ;
            poiDetailVideoReviewListExp.getClass();
            if (!PoiDetailVideoReviewListExp.LIZ(str2)) {
                PoiPostOptExp poiPostOptExp = PoiPostOptExp.LIZ;
                String str3 = this.LLJILJILJ;
                poiPostOptExp.getClass();
                if (!PoiPostOptExp.LIZIZ(str3) && !C285770BHz.LIZ()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean HQ2() {
        C1184920gwM c1184920gwM = EnumC1184730gw3.Companion;
        String str = this.LLJILJILJ;
        c1184920gwM.getClass();
        return C1184920gwM.LIZ(str, false) != EnumC1184730gw3.REGIONAL;
    }

    public final boolean IQ2() {
        PoiPostOptExp poiPostOptExp = PoiPostOptExp.LIZ;
        String str = this.LLJILJILJ;
        poiPostOptExp.getClass();
        return PoiPostOptExp.LIZIZ(str) || GQ2();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1187520h0Y(0);
    }

    public final boolean GQ2() {
        return FQ2() && HQ2();
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

    public final void KQ2(String str) {
        if (!Intrinsics.LJFF(str, this.LLJILJILJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stage_request_retry typeLevel diff preTypeLevel: ");
            sbLIZ.append(this.LLJILJILJ);
            sbLIZ.append(" newTypeLevel: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLJILJIL = true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("stage_request_retry update typeLevel  preTypeLevel: ");
        sbLIZ2.append(this.LLJILJILJ);
        sbLIZ2.append(" newTypeLevel: ");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        this.LLJILJILJ = str;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadLatest(Object obj) {
        if (!Intrinsics.LJFF(null, Boolean.TRUE)) {
            InterfaceC1181010gq3 interfaceC1181010gq3 = this.LLJJIJI;
            if (interfaceC1181010gq3 != null && interfaceC1181010gq3.isLoading()) {
                return;
            }
            super.manualListLoadLatest(obj);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        if (!Intrinsics.LJFF(null, Boolean.TRUE)) {
            InterfaceC1181010gq3 interfaceC1181010gq3 = this.LLJJIJI;
            if (interfaceC1181010gq3 != null && interfaceC1181010gq3.isLoading()) {
                return;
            }
            super.manualListLoadMore(obj);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS384S0200000_18(this, (PoiVideoListSharedViewModel) c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 107));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1187510h0X>> interfaceC1364105Vn) {
        this.LLJJJ.clear();
        this.LLJJIJIL = null;
        return onLoadMore(new C1187510h0X(0L, 0L, 0L, 1, 1), interfaceC1364105Vn);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        String str2;
        int i = c737030Svd.LIZ;
        if (i != 2) {
            if (i == 13) {
                Object obj = c737030Svd.LIZIZ;
                if ((obj instanceof String) && (str2 = (String) obj) != null && str2.length() != 0) {
                    withState(new AwS132S1100000_18(str2, this, 9));
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1891350zJl EQ2(int r8, java.util.List r9) {
        /*
            r7 = this;
            int r3 = r9.size()
            X.15jK<ITEM extends X.0zJl> r0 = r7.state
            if (r0 == 0) goto L23
            java.util.List r0 = r0.LJII()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C1187600h0g
            if (r0 == 0) goto L12
            int r3 = r3 + 1
            goto L12
        L23:
            X.01GW r6 = X.C1188260h1k.LIZIZ
            java.lang.Object r0 = r6.getValue()
            com.ss.android.ugc.aweme.poi.detail.videolist.exp.PoiDetailSlashExpConfig r0 = (com.ss.android.ugc.aweme.poi.detail.videolist.exp.PoiDetailSlashExpConfig) r0
            int r1 = r0.enable
            r0 = 1
            if (r1 != r0) goto L8b
            r5 = 1
        L31:
            r0 = 50004(0xc354, float:7.007E-41)
            if (r8 == r0) goto L89
            r0 = 50001(0xc351, float:7.0066E-41)
            if (r8 == r0) goto L89
            r0 = 50002(0xc352, float:7.0068E-41)
            if (r8 == r0) goto L89
            r4 = 0
        L41:
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PostTag r0 = r7.LLIZLLLIL
            r2 = 0
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListResponse r0 = r7.LLJI
            if (r0 == 0) goto L5d
            java.util.List r0 = r0.getPostTagList()
            if (r0 == 0) goto L5d
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
        L54:
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PostTag r0 = r7.LLIZLLLIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L5f
        L5c:
            return r2
        L5d:
            r1 = r2
            goto L54
        L5f:
            if (r3 <= 0) goto L5c
            if (r5 == 0) goto L5c
            if (r4 == 0) goto L77
            java.lang.Object r0 = r6.getValue()
            com.ss.android.ugc.aweme.poi.detail.videolist.exp.PoiDetailSlashExpConfig r0 = (com.ss.android.ugc.aweme.poi.detail.videolist.exp.PoiDetailSlashExpConfig) r0
            int r0 = r0.doubleColumn
            if (r3 > r0) goto L5c
            X.07Z0 r2 = new X.07Z0
            X.07pV r0 = X.EnumC1981507pV.DOUBLE_COLUMN
            r2.<init>(r0, r3)
            return r2
        L77:
            java.lang.Object r0 = r6.getValue()
            com.ss.android.ugc.aweme.poi.detail.videolist.exp.PoiDetailSlashExpConfig r0 = (com.ss.android.ugc.aweme.poi.detail.videolist.exp.PoiDetailSlashExpConfig) r0
            int r0 = r0.tripleColumn
            if (r3 > r0) goto L5c
            X.07Z1 r2 = new X.07Z1
            X.07pV r0 = X.EnumC1981507pV.TRIPLE_COLUMN
            r2.<init>(r0, r3)
            return r2
        L89:
            r4 = 1
            goto L41
        L8b:
            r5 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel.EQ2(int, java.util.List):X.0zJl");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0111 A[Catch: Exception -> 0x029e, TryCatch #0 {Exception -> 0x029e, blocks: (B:40:0x009d, B:41:0x00a0, B:43:0x00a4, B:45:0x00a8, B:50:0x00b2, B:54:0x00b8, B:56:0x00c7, B:79:0x0111, B:81:0x0119, B:83:0x0128, B:85:0x012f, B:87:0x0153, B:88:0x015c, B:90:0x0162, B:92:0x016c, B:111:0x01b2, B:93:0x017b, B:95:0x0181, B:97:0x0185, B:98:0x018f, B:100:0x0195, B:102:0x0199, B:108:0x01a5, B:113:0x01b8, B:115:0x01c5, B:121:0x01cf, B:133:0x021a, B:135:0x021e, B:141:0x022e, B:143:0x0234, B:144:0x0238, B:146:0x023c, B:147:0x0240, B:149:0x0247, B:150:0x024b, B:152:0x024f, B:153:0x0253, B:155:0x0257, B:156:0x025b, B:158:0x025f, B:159:0x0263, B:137:0x0224, B:139:0x0228, B:166:0x027e, B:168:0x0284, B:170:0x0293, B:123:0x01d5, B:125:0x01d9, B:126:0x01e8, B:128:0x01ee, B:129:0x01fa, B:130:0x01fe, B:132:0x0204, B:112:0x01b6, B:59:0x00ce, B:61:0x00d9, B:64:0x00e8, B:66:0x00ee, B:72:0x00f8, B:37:0x0087), top: B:179:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f A[Catch: Exception -> 0x029e, TryCatch #0 {Exception -> 0x029e, blocks: (B:40:0x009d, B:41:0x00a0, B:43:0x00a4, B:45:0x00a8, B:50:0x00b2, B:54:0x00b8, B:56:0x00c7, B:79:0x0111, B:81:0x0119, B:83:0x0128, B:85:0x012f, B:87:0x0153, B:88:0x015c, B:90:0x0162, B:92:0x016c, B:111:0x01b2, B:93:0x017b, B:95:0x0181, B:97:0x0185, B:98:0x018f, B:100:0x0195, B:102:0x0199, B:108:0x01a5, B:113:0x01b8, B:115:0x01c5, B:121:0x01cf, B:133:0x021a, B:135:0x021e, B:141:0x022e, B:143:0x0234, B:144:0x0238, B:146:0x023c, B:147:0x0240, B:149:0x0247, B:150:0x024b, B:152:0x024f, B:153:0x0253, B:155:0x0257, B:156:0x025b, B:158:0x025f, B:159:0x0263, B:137:0x0224, B:139:0x0228, B:166:0x027e, B:168:0x0284, B:170:0x0293, B:123:0x01d5, B:125:0x01d9, B:126:0x01e8, B:128:0x01ee, B:129:0x01fa, B:130:0x01fe, B:132:0x0204, B:112:0x01b6, B:59:0x00ce, B:61:0x00d9, B:64:0x00e8, B:66:0x00ee, B:72:0x00f8, B:37:0x0087), top: B:179:0x0021 }] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel] */
    /* JADX WARN: Type inference failed for: r2v27, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.ArrayList] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: JQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1187510h0X r19, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1187510h0X>> r20) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel.onLoadMore(X.0h0X, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LQ2(X.C1187510h0X r16, java.lang.String r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel.LQ2(X.0h0X, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object MQ2(X.C1187510h0X r21, java.lang.String r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel.MQ2(X.0h0X, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final Object BQ2(C1187510h0X c1187510h0X, String str, EnumC1188100h1U enumC1188100h1U, C1188010h1L c1188010h1L) {
        Object objCQ2;
        String imprId;
        LogPbBean logPbBean;
        int i = C1188110h1V.LIZ[enumC1188100h1U.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (c1187510h0X.LIZ == 0) {
                        PoiDetailVideoListModel poiDetailVideoListModelLIZ = C1186720gzG.LIZ(this.LLJI, this.LLJJJ, GQ2(), FQ2());
                        this.LLJ = poiDetailVideoListModelLIZ;
                        if (this.LLJJIJIL == null) {
                            if (poiDetailVideoListModelLIZ != null && (logPbBean = poiDetailVideoListModelLIZ.logPb) != null) {
                                imprId = logPbBean.getImprId();
                            } else {
                                imprId = null;
                            }
                            this.LLJJIJIL = imprId;
                        }
                        objCQ2 = Unit.LIZ;
                    } else {
                        objCQ2 = CQ2(c1187510h0X, str, null, null, c1188010h1L);
                        if (objCQ2 != C099R.LJFF()) {
                            objCQ2 = Unit.LIZ;
                        }
                    }
                    if (objCQ2 == C099R.LJFF()) {
                        return objCQ2;
                    }
                    return Unit.LIZ;
                }
                throw new C1954807lC();
            }
            Object objMQ2 = MQ2(c1187510h0X, str, c1188010h1L);
            if (objMQ2 == C099R.LJFF()) {
                return objMQ2;
            }
            return Unit.LIZ;
        }
        Object objLQ2 = LQ2(c1187510h0X, str, c1188010h1L);
        if (objLQ2 == C099R.LJFF()) {
            return objLQ2;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C1187510h0X yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return this.LLILZIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(X.C1187510h0X r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, X.InterfaceC1364105Vn<? super kotlin.Unit> r26) {
        /*
            r21 = this;
            r3 = r26
            boolean r0 = r3 instanceof X.C1188080h1S
            r5 = r21
            if (r0 == 0) goto Lb5
            r4 = r3
            X.0h1S r4 = (X.C1188080h1S) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb5
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r6 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L57
            if (r0 != r2) goto Lbc
            X.C155000ia.LIZIZ(r6)
        L27:
            X.0gpQ r6 = (X.C1180620gpQ) r6
            if (r6 == 0) goto L52
            java.util.List r0 = r6.LJIL()
            if (r0 == 0) goto L55
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            X.0gpu r0 = (X.C1180920gpu) r0
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.slash.component.BaseComponentData r2 = r0.LIZLLL
        L3b:
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiMergedListResponse
            if (r0 == 0) goto L42
            r1 = r2
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListResponse r1 = (com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiMergedListResponse) r1
        L42:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r5.LLJJJ
            boolean r2 = r5.GQ2()
            boolean r0 = r5.FQ2()
            com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel r0 = X.C1186720gzG.LIZ(r1, r3, r2, r0)
            r5.LLJ = r0
        L52:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L55:
            r2 = r1
            goto L3b
        L57:
            X.C155000ia.LIZIZ(r6)
            com.ss.android.ugc.aweme.poi.detail.config.PoiDetailConfig r6 = com.ss.android.ugc.aweme.poi.detail.config.PoiDetailConfig.LIZ
            java.lang.String r0 = r5.LLJILJILJ
            r6.getClass()
            int r16 = com.ss.android.ugc.aweme.poi.detail.config.PoiDetailConfig.LIZ(r0)
            java.lang.String r15 = r5.LLJJIJIL
            X.0gq3 r8 = r5.LLJJIJI
            if (r8 == 0) goto L52
            java.lang.String r0 = r5.LLJJIJIIJIL
            if (r0 != 0) goto L8a
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.slash.data.EventModel> r7 = r5.LLJJIII
            if (r7 == 0) goto L8a
            X.04rF r6 = X.C1227904rF.LIZ
            java.lang.String r0 = "load_more"
            java.lang.Object r0 = r7.get(r0)
            com.ss.android.ugc.aweme.slash.data.EventModel r0 = (com.ss.android.ugc.aweme.slash.data.EventModel) r0
            if (r0 == 0) goto Lb3
            com.ss.android.ugc.aweme.slash.data.SlashParam r0 = r0.slashParam
        L81:
            r6.getClass()
            java.lang.String r0 = X.C1227904rF.LJI(r0)
            r5.LLJJIJIIJIL = r0
        L8a:
            java.lang.String r10 = r5.LLJJIJIIJIL
            r0 = r22
            long r11 = r0.LIZJ
            long r13 = r0.LIZIZ
            int r6 = r0.LIZLLL
            int r0 = r0.LJ
            r20 = r25
            r19 = r24
            r9 = r23
            r17 = r6
            r18 = r0
            com.ss.android.ugc.aweme.slash.data.SlashRequestParam r0 = X.C1175500ghA.LIZIZ(r8, r9, r10, r11, r13, r15, r16, r17, r18, r19, r20)
            X.11NZ r0 = r8.aQ(r0)
            if (r0 == 0) goto L52
            r4.LLILLL = r2
            java.lang.Object r6 = X.C11UD.LIZJ(r0, r4)
            if (r6 != r3) goto L27
            return r3
        Lb3:
            r0 = r1
            goto L81
        Lb5:
            X.0h1S r4 = new X.0h1S
            r4.<init>(r5, r3)
            goto L16
        Lbc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel.CQ2(X.0h0X, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
