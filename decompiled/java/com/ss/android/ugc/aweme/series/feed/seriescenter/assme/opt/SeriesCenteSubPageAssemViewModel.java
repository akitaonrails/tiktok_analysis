package com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C048300Fl;
import X.C13LP;
import X.C1559050qfn;
import X.C1559260qg8;
import X.C1573150r2X;
import X.C1573210r2d;
import X.C1573330r2p;
import X.C1573360r2s;
import X.C1573420r2y;
import X.C2188811AlT;
import X.C316640Cb8;
import X.C317290CcB;
import X.C452501pT;
import X.C627660Ojc;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;
import com.ss.android.ugc.aweme.service.IDramaDiscoverService;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesCenteSubPageAssemViewModel extends AssemListViewModel<C1573210r2d, InterfaceC1891350zJl, String> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1559050qfn.class, "series_center_sub_page_key"), true);
    public boolean LLILLJJLI;
    public final Set<Long> LLILLL;
    public final C01GW LLILZ;
    public final C1573330r2p LLILZIL;
    public final C01GW LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1573210r2d(CardStruct.IStatusCode.DEFAULT, new SeriesCenterCenterScene(SeriesCenterSceneEnum.ALL, CardStruct.IStatusCode.DEFAULT, "", null), 57);
    }

    public SeriesCenteSubPageAssemViewModel() {
        new Object() { // from class: X.0r2u
        };
        this.LLILLL = new LinkedHashSet();
        this.LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(290));
        this.LLILZIL = C1573330r2p.LIZIZ;
        this.LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(289));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.LLILLJJLI) {
            IDramaDiscoverService.LIZ.getClass();
            C1573420r2y.LIZ().LIZJ();
            this.LLILLJJLI = false;
        }
        this.LLILLL.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SeriesCenterSceneEnum vQ2() {
        SeriesCenterSceneEnum seriesCenterSceneEnum;
        SeriesCenterCenterScene seriesCenterCenterScene = ((C1573210r2d) getState()).LLILLL;
        return (seriesCenterCenterScene == null || (seriesCenterSceneEnum = seriesCenterCenterScene.scene) == null) ? SeriesCenterSceneEnum.ALL : seriesCenterSceneEnum;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 217));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        boolean z;
        C1559050qfn c1559050qfn = (C1559050qfn) this.LL.getValue();
        if (c1559050qfn != null && c1559050qfn.LLILZIL) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            return xQ2("", true, interfaceC1364105Vn);
        }
        C1573360r2s c1573360r2sLIZ = this.LLILZIL.LIZ(((C1573210r2d) getState()).LLILLJJLI);
        if (c1573360r2sLIZ != null) {
            c1573360r2sLIZ.LJ = false;
            ArrayList arrayList = new ArrayList();
            List arrayList2 = c1573360r2sLIZ.LIZLLL;
            List<C1573150r2X> list = c1573360r2sLIZ.LIZ;
            if (!arrayList2.isEmpty()) {
                if (!list.isEmpty()) {
                    int size = arrayList2.size() % 3;
                    if (size != 0) {
                        arrayList2 = new ArrayList(C13LP.LL(arrayList2, arrayList2.size() - size));
                    }
                    arrayList.addAll(arrayList2);
                    arrayList.add(new C048300Fl(0));
                    c1573360r2sLIZ.LJ = true;
                } else {
                    Boolean.valueOf(arrayList.addAll(arrayList2));
                }
            }
            arrayList.addAll(list);
            wQ2(arrayList);
            if (c1573360r2sLIZ.LIZJ) {
                return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, c1573360r2sLIZ.LIZIZ, arrayList, 1);
            }
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(arrayList);
        }
        return xQ2("", true, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wQ2(List<InterfaceC1891350zJl> list) {
        String str = ((C1573210r2d) getState()).LLILLJJLI;
        if (!Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return;
        }
        IDramaDiscoverService.LIZ.getClass();
        IDramaDiscoverService iDramaDiscoverServiceLIZ = C1573420r2y.LIZ();
        iDramaDiscoverServiceLIZ.LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaNUJUndertake insertNUJUnderTakeData enter category(");
        sbLIZ.append(str);
        sbLIZ.append("): collectionId=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", currentItemsSize=");
        sbLIZ.append(((ArrayList) list).size());
        sbLIZ.append(", wrapper=");
        sbLIZ.append((Object) null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LLILLJJLI) {
            iDramaDiscoverServiceLIZ.LIZIZ();
            this.LLILLJJLI = true;
        }
        iDramaDiscoverServiceLIZ.LJ();
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(String str, InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        return xQ2(str, false, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[PHI: r5
      0x0027: PHI (r5v7 java.lang.Object) = (r5v4 java.lang.Object), (r5v0 java.lang.Object) binds: [B:37:0x009d, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(java.lang.String r14, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse> r15) {
        /*
            r13 = this;
            r7 = r14
            boolean r0 = r15 instanceof X.C1573350r2r
            if (r0 == 0) goto La0
            r3 = r15
            X.0r2r r3 = (X.C1573350r2r) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La0
            int r2 = r2 - r1
            r3.LLILZ = r2
        L13:
            java.lang.Object r5 = r3.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r2 = 0
            r1 = 2
            r6 = 1
            if (r0 == 0) goto L28
            if (r0 == r6) goto L5d
            if (r0 != r1) goto La7
            X.C155000ia.LIZIZ(r5)
        L27:
            return r5
        L28:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum r5 = r13.vQ2()
            com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum r0 = com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum.ALL
            if (r5 != r0) goto L80
            X.002o r0 = r13.getState()
            X.0r2d r0 = (X.C1573210r2d) r0
            java.lang.String r5 = r0.LLILLJJLI
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L80
            int r0 = r7.length()
            if (r0 != 0) goto L80
            X.01GW r0 = r13.LLILZLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.ColdStartOptimization r0 = (com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.ColdStartOptimization) r0
            r3.LL = r7
            r3.LLILZ = r6
            r0.LIZJ()
            if (r4 != 0) goto L5b
            return r4
        L5b:
            r5 = r2
            goto L64
        L5d:
            java.lang.Object r7 = r3.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r5)
        L64:
            com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse r5 = (com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse) r5
            if (r5 == 0) goto L80
            int r0 = r5.status_code
            if (r0 != 0) goto L80
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview> r0 = r5.collections
            if (r0 == 0) goto L76
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Laf
        L76:
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview> r0 = r5.safeCollections
            if (r0 == 0) goto L80
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Laf
        L80:
            com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum r6 = r13.vQ2()
            X.002o r0 = r13.getState()
            X.0r2d r0 = (X.C1573210r2d) r0
            java.lang.String r8 = r0.LLILLJJLI
            r9 = 0
            r12 = 120(0x78, float:1.68E-43)
            r10 = r9
            r11 = r9
            X.11NZ r0 = X.C1576960r8g.LIZ(r6, r7, r8, r9, r10, r11, r12)
            r3.LL = r2
            r3.LLILZ = r1
            java.lang.Object r5 = X.C11UD.LIZJ(r0, r3)
            if (r5 != r4) goto L27
            return r4
        La0:
            X.0r2r r3 = new X.0r2r
            r3.<init>(r13, r15)
            goto L13
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenteSubPageAssemViewModel.yQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a3 A[Catch: Exception -> 0x0415, TryCatch #0 {Exception -> 0x0415, blocks: (B:40:0x00e3, B:41:0x00e6, B:44:0x00ee, B:48:0x00fc, B:50:0x012c, B:51:0x0134, B:53:0x0140, B:54:0x0148, B:58:0x0155, B:70:0x017d, B:73:0x018a, B:74:0x0198, B:76:0x019e, B:78:0x01a6, B:80:0x01b6, B:82:0x01c2, B:85:0x01c9, B:86:0x01cc, B:88:0x01d7, B:92:0x01de, B:93:0x01e8, B:94:0x01ec, B:96:0x01f3, B:97:0x01f8, B:99:0x01fe, B:100:0x020c, B:102:0x0212, B:104:0x021a, B:106:0x022b, B:108:0x0237, B:111:0x023e, B:112:0x0241, B:114:0x0257, B:117:0x025c, B:121:0x026e, B:122:0x0276, B:123:0x027a, B:125:0x0281, B:126:0x0286, B:132:0x0292, B:134:0x0296, B:142:0x02a6, B:143:0x02ac, B:145:0x02b2, B:147:0x02c1, B:148:0x02c3, B:150:0x02c7, B:155:0x02cf, B:157:0x02d5, B:160:0x02db, B:167:0x02e7, B:169:0x02ef, B:172:0x02fd, B:180:0x030e, B:182:0x0315, B:184:0x0321, B:185:0x032f, B:187:0x0345, B:189:0x034a, B:190:0x034d, B:191:0x0360, B:193:0x0366, B:195:0x0372, B:196:0x0376, B:198:0x037e, B:199:0x039e, B:201:0x03b2, B:206:0x03bb, B:208:0x03bf, B:210:0x03c3, B:213:0x03c8, B:216:0x03d8, B:220:0x03ee, B:221:0x03f3, B:223:0x0400, B:225:0x040a, B:186:0x033e, B:141:0x02a3, B:124:0x027b, B:95:0x01ed, B:65:0x0169, B:67:0x0175, B:69:0x017b, B:42:0x00e9, B:43:0x00ec, B:17:0x0056, B:21:0x006c, B:23:0x0092, B:29:0x009e, B:32:0x00ad, B:34:0x00c3, B:35:0x00c9), top: B:230:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0315 A[Catch: Exception -> 0x0415, TryCatch #0 {Exception -> 0x0415, blocks: (B:40:0x00e3, B:41:0x00e6, B:44:0x00ee, B:48:0x00fc, B:50:0x012c, B:51:0x0134, B:53:0x0140, B:54:0x0148, B:58:0x0155, B:70:0x017d, B:73:0x018a, B:74:0x0198, B:76:0x019e, B:78:0x01a6, B:80:0x01b6, B:82:0x01c2, B:85:0x01c9, B:86:0x01cc, B:88:0x01d7, B:92:0x01de, B:93:0x01e8, B:94:0x01ec, B:96:0x01f3, B:97:0x01f8, B:99:0x01fe, B:100:0x020c, B:102:0x0212, B:104:0x021a, B:106:0x022b, B:108:0x0237, B:111:0x023e, B:112:0x0241, B:114:0x0257, B:117:0x025c, B:121:0x026e, B:122:0x0276, B:123:0x027a, B:125:0x0281, B:126:0x0286, B:132:0x0292, B:134:0x0296, B:142:0x02a6, B:143:0x02ac, B:145:0x02b2, B:147:0x02c1, B:148:0x02c3, B:150:0x02c7, B:155:0x02cf, B:157:0x02d5, B:160:0x02db, B:167:0x02e7, B:169:0x02ef, B:172:0x02fd, B:180:0x030e, B:182:0x0315, B:184:0x0321, B:185:0x032f, B:187:0x0345, B:189:0x034a, B:190:0x034d, B:191:0x0360, B:193:0x0366, B:195:0x0372, B:196:0x0376, B:198:0x037e, B:199:0x039e, B:201:0x03b2, B:206:0x03bb, B:208:0x03bf, B:210:0x03c3, B:213:0x03c8, B:216:0x03d8, B:220:0x03ee, B:221:0x03f3, B:223:0x0400, B:225:0x040a, B:186:0x033e, B:141:0x02a3, B:124:0x027b, B:95:0x01ed, B:65:0x0169, B:67:0x0175, B:69:0x017b, B:42:0x00e9, B:43:0x00ec, B:17:0x0056, B:21:0x006c, B:23:0x0092, B:29:0x009e, B:32:0x00ad, B:34:0x00c3, B:35:0x00c9), top: B:230:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x033e A[Catch: Exception -> 0x0415, TryCatch #0 {Exception -> 0x0415, blocks: (B:40:0x00e3, B:41:0x00e6, B:44:0x00ee, B:48:0x00fc, B:50:0x012c, B:51:0x0134, B:53:0x0140, B:54:0x0148, B:58:0x0155, B:70:0x017d, B:73:0x018a, B:74:0x0198, B:76:0x019e, B:78:0x01a6, B:80:0x01b6, B:82:0x01c2, B:85:0x01c9, B:86:0x01cc, B:88:0x01d7, B:92:0x01de, B:93:0x01e8, B:94:0x01ec, B:96:0x01f3, B:97:0x01f8, B:99:0x01fe, B:100:0x020c, B:102:0x0212, B:104:0x021a, B:106:0x022b, B:108:0x0237, B:111:0x023e, B:112:0x0241, B:114:0x0257, B:117:0x025c, B:121:0x026e, B:122:0x0276, B:123:0x027a, B:125:0x0281, B:126:0x0286, B:132:0x0292, B:134:0x0296, B:142:0x02a6, B:143:0x02ac, B:145:0x02b2, B:147:0x02c1, B:148:0x02c3, B:150:0x02c7, B:155:0x02cf, B:157:0x02d5, B:160:0x02db, B:167:0x02e7, B:169:0x02ef, B:172:0x02fd, B:180:0x030e, B:182:0x0315, B:184:0x0321, B:185:0x032f, B:187:0x0345, B:189:0x034a, B:190:0x034d, B:191:0x0360, B:193:0x0366, B:195:0x0372, B:196:0x0376, B:198:0x037e, B:199:0x039e, B:201:0x03b2, B:206:0x03bb, B:208:0x03bf, B:210:0x03c3, B:213:0x03c8, B:216:0x03d8, B:220:0x03ee, B:221:0x03f3, B:223:0x0400, B:225:0x040a, B:186:0x033e, B:141:0x02a3, B:124:0x027b, B:95:0x01ed, B:65:0x0169, B:67:0x0175, B:69:0x017b, B:42:0x00e9, B:43:0x00ec, B:17:0x0056, B:21:0x006c, B:23:0x0092, B:29:0x009e, B:32:0x00ad, B:34:0x00c3, B:35:0x00c9), top: B:230:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x034a A[Catch: Exception -> 0x0415, TryCatch #0 {Exception -> 0x0415, blocks: (B:40:0x00e3, B:41:0x00e6, B:44:0x00ee, B:48:0x00fc, B:50:0x012c, B:51:0x0134, B:53:0x0140, B:54:0x0148, B:58:0x0155, B:70:0x017d, B:73:0x018a, B:74:0x0198, B:76:0x019e, B:78:0x01a6, B:80:0x01b6, B:82:0x01c2, B:85:0x01c9, B:86:0x01cc, B:88:0x01d7, B:92:0x01de, B:93:0x01e8, B:94:0x01ec, B:96:0x01f3, B:97:0x01f8, B:99:0x01fe, B:100:0x020c, B:102:0x0212, B:104:0x021a, B:106:0x022b, B:108:0x0237, B:111:0x023e, B:112:0x0241, B:114:0x0257, B:117:0x025c, B:121:0x026e, B:122:0x0276, B:123:0x027a, B:125:0x0281, B:126:0x0286, B:132:0x0292, B:134:0x0296, B:142:0x02a6, B:143:0x02ac, B:145:0x02b2, B:147:0x02c1, B:148:0x02c3, B:150:0x02c7, B:155:0x02cf, B:157:0x02d5, B:160:0x02db, B:167:0x02e7, B:169:0x02ef, B:172:0x02fd, B:180:0x030e, B:182:0x0315, B:184:0x0321, B:185:0x032f, B:187:0x0345, B:189:0x034a, B:190:0x034d, B:191:0x0360, B:193:0x0366, B:195:0x0372, B:196:0x0376, B:198:0x037e, B:199:0x039e, B:201:0x03b2, B:206:0x03bb, B:208:0x03bf, B:210:0x03c3, B:213:0x03c8, B:216:0x03d8, B:220:0x03ee, B:221:0x03f3, B:223:0x0400, B:225:0x040a, B:186:0x033e, B:141:0x02a3, B:124:0x027b, B:95:0x01ed, B:65:0x0169, B:67:0x0175, B:69:0x017b, B:42:0x00e9, B:43:0x00ec, B:17:0x0056, B:21:0x006c, B:23:0x0092, B:29:0x009e, B:32:0x00ad, B:34:0x00c3, B:35:0x00c9), top: B:230:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0366 A[Catch: Exception -> 0x0415, TryCatch #0 {Exception -> 0x0415, blocks: (B:40:0x00e3, B:41:0x00e6, B:44:0x00ee, B:48:0x00fc, B:50:0x012c, B:51:0x0134, B:53:0x0140, B:54:0x0148, B:58:0x0155, B:70:0x017d, B:73:0x018a, B:74:0x0198, B:76:0x019e, B:78:0x01a6, B:80:0x01b6, B:82:0x01c2, B:85:0x01c9, B:86:0x01cc, B:88:0x01d7, B:92:0x01de, B:93:0x01e8, B:94:0x01ec, B:96:0x01f3, B:97:0x01f8, B:99:0x01fe, B:100:0x020c, B:102:0x0212, B:104:0x021a, B:106:0x022b, B:108:0x0237, B:111:0x023e, B:112:0x0241, B:114:0x0257, B:117:0x025c, B:121:0x026e, B:122:0x0276, B:123:0x027a, B:125:0x0281, B:126:0x0286, B:132:0x0292, B:134:0x0296, B:142:0x02a6, B:143:0x02ac, B:145:0x02b2, B:147:0x02c1, B:148:0x02c3, B:150:0x02c7, B:155:0x02cf, B:157:0x02d5, B:160:0x02db, B:167:0x02e7, B:169:0x02ef, B:172:0x02fd, B:180:0x030e, B:182:0x0315, B:184:0x0321, B:185:0x032f, B:187:0x0345, B:189:0x034a, B:190:0x034d, B:191:0x0360, B:193:0x0366, B:195:0x0372, B:196:0x0376, B:198:0x037e, B:199:0x039e, B:201:0x03b2, B:206:0x03bb, B:208:0x03bf, B:210:0x03c3, B:213:0x03c8, B:216:0x03d8, B:220:0x03ee, B:221:0x03f3, B:223:0x0400, B:225:0x040a, B:186:0x033e, B:141:0x02a3, B:124:0x027b, B:95:0x01ed, B:65:0x0169, B:67:0x0175, B:69:0x017b, B:42:0x00e9, B:43:0x00ec, B:17:0x0056, B:21:0x006c, B:23:0x0092, B:29:0x009e, B:32:0x00ad, B:34:0x00c3, B:35:0x00c9), top: B:230:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037e A[Catch: Exception -> 0x0415, TryCatch #0 {Exception -> 0x0415, blocks: (B:40:0x00e3, B:41:0x00e6, B:44:0x00ee, B:48:0x00fc, B:50:0x012c, B:51:0x0134, B:53:0x0140, B:54:0x0148, B:58:0x0155, B:70:0x017d, B:73:0x018a, B:74:0x0198, B:76:0x019e, B:78:0x01a6, B:80:0x01b6, B:82:0x01c2, B:85:0x01c9, B:86:0x01cc, B:88:0x01d7, B:92:0x01de, B:93:0x01e8, B:94:0x01ec, B:96:0x01f3, B:97:0x01f8, B:99:0x01fe, B:100:0x020c, B:102:0x0212, B:104:0x021a, B:106:0x022b, B:108:0x0237, B:111:0x023e, B:112:0x0241, B:114:0x0257, B:117:0x025c, B:121:0x026e, B:122:0x0276, B:123:0x027a, B:125:0x0281, B:126:0x0286, B:132:0x0292, B:134:0x0296, B:142:0x02a6, B:143:0x02ac, B:145:0x02b2, B:147:0x02c1, B:148:0x02c3, B:150:0x02c7, B:155:0x02cf, B:157:0x02d5, B:160:0x02db, B:167:0x02e7, B:169:0x02ef, B:172:0x02fd, B:180:0x030e, B:182:0x0315, B:184:0x0321, B:185:0x032f, B:187:0x0345, B:189:0x034a, B:190:0x034d, B:191:0x0360, B:193:0x0366, B:195:0x0372, B:196:0x0376, B:198:0x037e, B:199:0x039e, B:201:0x03b2, B:206:0x03bb, B:208:0x03bf, B:210:0x03c3, B:213:0x03c8, B:216:0x03d8, B:220:0x03ee, B:221:0x03f3, B:223:0x0400, B:225:0x040a, B:186:0x033e, B:141:0x02a3, B:124:0x027b, B:95:0x01ed, B:65:0x0169, B:67:0x0175, B:69:0x017b, B:42:0x00e9, B:43:0x00ec, B:17:0x0056, B:21:0x006c, B:23:0x0092, B:29:0x009e, B:32:0x00ad, B:34:0x00c3, B:35:0x00c9), top: B:230:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03bf A[Catch: Exception -> 0x0415, TryCatch #0 {Exception -> 0x0415, blocks: (B:40:0x00e3, B:41:0x00e6, B:44:0x00ee, B:48:0x00fc, B:50:0x012c, B:51:0x0134, B:53:0x0140, B:54:0x0148, B:58:0x0155, B:70:0x017d, B:73:0x018a, B:74:0x0198, B:76:0x019e, B:78:0x01a6, B:80:0x01b6, B:82:0x01c2, B:85:0x01c9, B:86:0x01cc, B:88:0x01d7, B:92:0x01de, B:93:0x01e8, B:94:0x01ec, B:96:0x01f3, B:97:0x01f8, B:99:0x01fe, B:100:0x020c, B:102:0x0212, B:104:0x021a, B:106:0x022b, B:108:0x0237, B:111:0x023e, B:112:0x0241, B:114:0x0257, B:117:0x025c, B:121:0x026e, B:122:0x0276, B:123:0x027a, B:125:0x0281, B:126:0x0286, B:132:0x0292, B:134:0x0296, B:142:0x02a6, B:143:0x02ac, B:145:0x02b2, B:147:0x02c1, B:148:0x02c3, B:150:0x02c7, B:155:0x02cf, B:157:0x02d5, B:160:0x02db, B:167:0x02e7, B:169:0x02ef, B:172:0x02fd, B:180:0x030e, B:182:0x0315, B:184:0x0321, B:185:0x032f, B:187:0x0345, B:189:0x034a, B:190:0x034d, B:191:0x0360, B:193:0x0366, B:195:0x0372, B:196:0x0376, B:198:0x037e, B:199:0x039e, B:201:0x03b2, B:206:0x03bb, B:208:0x03bf, B:210:0x03c3, B:213:0x03c8, B:216:0x03d8, B:220:0x03ee, B:221:0x03f3, B:223:0x0400, B:225:0x040a, B:186:0x033e, B:141:0x02a3, B:124:0x027b, B:95:0x01ed, B:65:0x0169, B:67:0x0175, B:69:0x017b, B:42:0x00e9, B:43:0x00ec, B:17:0x0056, B:21:0x006c, B:23:0x0092, B:29:0x009e, B:32:0x00ad, B:34:0x00c3, B:35:0x00c9), top: B:230:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0400 A[Catch: Exception -> 0x0415, TryCatch #0 {Exception -> 0x0415, blocks: (B:40:0x00e3, B:41:0x00e6, B:44:0x00ee, B:48:0x00fc, B:50:0x012c, B:51:0x0134, B:53:0x0140, B:54:0x0148, B:58:0x0155, B:70:0x017d, B:73:0x018a, B:74:0x0198, B:76:0x019e, B:78:0x01a6, B:80:0x01b6, B:82:0x01c2, B:85:0x01c9, B:86:0x01cc, B:88:0x01d7, B:92:0x01de, B:93:0x01e8, B:94:0x01ec, B:96:0x01f3, B:97:0x01f8, B:99:0x01fe, B:100:0x020c, B:102:0x0212, B:104:0x021a, B:106:0x022b, B:108:0x0237, B:111:0x023e, B:112:0x0241, B:114:0x0257, B:117:0x025c, B:121:0x026e, B:122:0x0276, B:123:0x027a, B:125:0x0281, B:126:0x0286, B:132:0x0292, B:134:0x0296, B:142:0x02a6, B:143:0x02ac, B:145:0x02b2, B:147:0x02c1, B:148:0x02c3, B:150:0x02c7, B:155:0x02cf, B:157:0x02d5, B:160:0x02db, B:167:0x02e7, B:169:0x02ef, B:172:0x02fd, B:180:0x030e, B:182:0x0315, B:184:0x0321, B:185:0x032f, B:187:0x0345, B:189:0x034a, B:190:0x034d, B:191:0x0360, B:193:0x0366, B:195:0x0372, B:196:0x0376, B:198:0x037e, B:199:0x039e, B:201:0x03b2, B:206:0x03bb, B:208:0x03bf, B:210:0x03c3, B:213:0x03c8, B:216:0x03d8, B:220:0x03ee, B:221:0x03f3, B:223:0x0400, B:225:0x040a, B:186:0x033e, B:141:0x02a3, B:124:0x027b, B:95:0x01ed, B:65:0x0169, B:67:0x0175, B:69:0x017b, B:42:0x00e9, B:43:0x00ec, B:17:0x0056, B:21:0x006c, B:23:0x0092, B:29:0x009e, B:32:0x00ad, B:34:0x00c3, B:35:0x00c9), top: B:230:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x040a A[Catch: Exception -> 0x0415, TryCatch #0 {Exception -> 0x0415, blocks: (B:40:0x00e3, B:41:0x00e6, B:44:0x00ee, B:48:0x00fc, B:50:0x012c, B:51:0x0134, B:53:0x0140, B:54:0x0148, B:58:0x0155, B:70:0x017d, B:73:0x018a, B:74:0x0198, B:76:0x019e, B:78:0x01a6, B:80:0x01b6, B:82:0x01c2, B:85:0x01c9, B:86:0x01cc, B:88:0x01d7, B:92:0x01de, B:93:0x01e8, B:94:0x01ec, B:96:0x01f3, B:97:0x01f8, B:99:0x01fe, B:100:0x020c, B:102:0x0212, B:104:0x021a, B:106:0x022b, B:108:0x0237, B:111:0x023e, B:112:0x0241, B:114:0x0257, B:117:0x025c, B:121:0x026e, B:122:0x0276, B:123:0x027a, B:125:0x0281, B:126:0x0286, B:132:0x0292, B:134:0x0296, B:142:0x02a6, B:143:0x02ac, B:145:0x02b2, B:147:0x02c1, B:148:0x02c3, B:150:0x02c7, B:155:0x02cf, B:157:0x02d5, B:160:0x02db, B:167:0x02e7, B:169:0x02ef, B:172:0x02fd, B:180:0x030e, B:182:0x0315, B:184:0x0321, B:185:0x032f, B:187:0x0345, B:189:0x034a, B:190:0x034d, B:191:0x0360, B:193:0x0366, B:195:0x0372, B:196:0x0376, B:198:0x037e, B:199:0x039e, B:201:0x03b2, B:206:0x03bb, B:208:0x03bf, B:210:0x03c3, B:213:0x03c8, B:216:0x03d8, B:220:0x03ee, B:221:0x03f3, B:223:0x0400, B:225:0x040a, B:186:0x033e, B:141:0x02a3, B:124:0x027b, B:95:0x01ed, B:65:0x0169, B:67:0x0175, B:69:0x017b, B:42:0x00e9, B:43:0x00ec, B:17:0x0056, B:21:0x006c, B:23:0x0092, B:29:0x009e, B:32:0x00ad, B:34:0x00c3, B:35:0x00c9), top: B:230:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(java.lang.String r21, boolean r22, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r23) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenteSubPageAssemViewModel.xQ2(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
