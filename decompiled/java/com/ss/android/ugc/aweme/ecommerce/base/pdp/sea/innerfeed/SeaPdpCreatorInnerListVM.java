package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed;

import X.AbstractC316870CbV;
import X.C08HX;
import X.C098200Yq;
import X.C0KBN;
import X.C0PEM;
import X.C1227904rF;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1741890vQh;
import X.C189200o6;
import X.C1AF0;
import X.C207500r3;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2296808zG;
import X.C23250099c;
import X.C2341109Fh;
import X.C319301Lr;
import X.C323010ClP;
import X.C323020ClQ;
import X.C323030ClR;
import X.C323040ClS;
import X.C325530CpT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class SeaPdpCreatorInnerListVM extends BaseDetailShareVM<C325530CpT, C207500r3, C323030ClR> {
    public String LLILZIL;
    public Map<String, String> LLILZLL;
    public Map<String, ? extends Object> LLIZ;
    public List<String> LLIZLLLIL;
    public int LLJ = 5;
    public final List<String> LLJI = new ArrayList();
    public int LLJIJIL;
    public int LLJILJIL;
    public C2189821An6 LLJILJILJ;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 126;
    }

    public final boolean DQ2() {
        Map<String, String> extra;
        Map<String, String> extra2;
        C2189821An6 c2189821An6 = this.LLJILJILJ;
        String str = null;
        if (Intrinsics.LJFF((c2189821An6 == null || (extra2 = c2189821An6.getExtra()) == null) ? null : extra2.get("pdp_enter_from"), "from_black_light_creator_video")) {
            return true;
        }
        C2189821An6 c2189821An62 = this.LLJILJILJ;
        if (c2189821An62 != null && (extra = c2189821An62.getExtra()) != null) {
            str = extra.get("pdp_enter_from");
        }
        return Intrinsics.LJFF(str, "from_creator_video_window");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325530CpT(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    public final List<Aweme> getAwemeList() {
        if (!DQ2()) {
            return super.getAwemeList();
        }
        ArrayList arrayList = new ArrayList();
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null) {
            C2189821An6 c2189821An6 = this.LLJILJILJ;
            Aweme awemeLLILZ = iAwemeService.LLILZ(c2189821An6 != null ? c2189821An6.getAid() : null);
            if (awemeLLILZ != null) {
                arrayList.add(awemeLLILZ);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C323010ClP(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sea_pdp_creator_video, InnerListVM onCleared, ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
    }

    public final List<C207500r3> GQ2(List<String> list) {
        Object c098200Yq;
        Aweme aweme;
        String str;
        String aid;
        StringBuilder sbLIZ;
        String str2;
        String str3;
        HashMap<String, Object> mapLJIIJ;
        List<String> list2;
        String str4;
        HashMap<String, Object> mapLJIIJ2;
        String str5;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str6 : list) {
                C207500r3 c207500r3 = null;
                try {
                    C1227904rF.LIZ.getClass();
                    c098200Yq = (Aweme) C1227904rF.LIZIZ(str6, Aweme.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                try {
                    aweme = (Aweme) c098200Yq;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJFF(e, "process aweme data error");
                }
                if (aweme != null) {
                    Map<String, ? extends Object> map = this.LLIZ;
                    if (map != null) {
                        Object obj = map.get("request_id");
                        if (obj instanceof String) {
                            str5 = (String) obj;
                        } else {
                            str5 = null;
                        }
                        if (str5 != null) {
                            aweme.setRequestId(str5);
                        }
                        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                            AwemeExtKt.appendMobParam(aweme, entry.getKey(), entry.getValue().toString());
                        }
                    }
                    int iIndexOf = ((ArrayList) this.LLJI).indexOf(aweme.getAid());
                    if (iIndexOf >= 0 && (list2 = this.LLIZLLLIL) != null && (str4 = (String) C13LP.LJJJLZIJ(iIndexOf, list2)) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str4)) != null) {
                        for (Map.Entry<String, Object> entry2 : mapLJIIJ2.entrySet()) {
                            AwemeExtKt.appendMobParam(aweme, entry2.getKey(), entry2.getValue().toString());
                        }
                    }
                    Map<String, String> map2 = this.LLILZLL;
                    if (map2 != null) {
                        for (Map.Entry<String, String> entry3 : map2.entrySet()) {
                            AwemeExtKt.appendMobParam(aweme, entry3.getKey(), entry3.getValue());
                        }
                    }
                    AwemeExtKt.appendMobParam(aweme, "ranking", String.valueOf(((ArrayList) this.LLJI).indexOf(aweme.getAid())));
                    HashMap<String, String> mobParams = aweme.getMobParams();
                    if (mobParams == null || (str = mobParams.get("source_module")) == null) {
                        str = "rec_product_detail_inner_pdp_creator_video_module";
                    }
                    String aid2 = aweme.getAid();
                    C2189821An6 c2189821An6 = this.LLJILJILJ;
                    if (c2189821An6 != null) {
                        aid = c2189821An6.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid2, aid)) {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        str2 = "_outer_flow";
                    } else {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        str2 = "_inner_flow";
                    }
                    sbLIZ.append(str2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    AwemeExtKt.appendMobParam(aweme, "source_module", strLIZIZ);
                    HashMap<String, String> mobParams2 = aweme.getMobParams();
                    if (mobParams2 != null && (str3 = mobParams2.get("entrance_info")) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str3)) != null) {
                        mapLJIIJ.put("source_page_type", "video");
                        mapLJIIJ.put("source_previous_page", "pdp_creator_video");
                        mapLJIIJ.put("source_module", strLIZIZ);
                        mapLJIIJ.put("entrance_form", "video_single_anchor");
                        AwemeExtKt.appendMobParam(aweme, "entrance_info", C1741890vQh.LJIIIIZZ(mapLJIIJ));
                    }
                } else {
                    aweme = null;
                }
                if (aweme != null) {
                    c207500r3 = new C207500r3(aweme);
                }
                if (c207500r3 != null) {
                    arrayList.add(c207500r3);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadLatest(Object obj) {
        C323030ClR c323030ClR = (C323030ClR) obj;
        super.manualListLoadLatest(c323030ClR);
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C323040ClS(this, c323030ClR, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        C323030ClR c323030ClR = (C323030ClR) obj;
        super.manualListLoadMore(c323030ClR);
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C323020ClQ(this, c323030ClR, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C207500r3> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 69));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C323030ClR>> interfaceC1364105Vn) {
        return onLoadMore(new C323030ClR(this.LLJILJIL), interfaceC1364105Vn);
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
                if (Intrinsics.LJFF(((C207500r3) it2.next()).LL.getAid(), str)) {
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
        String aid;
        Aweme aweme;
        C207500r3 c207500r3 = (C207500r3) interfaceC1891350zJl;
        if (DQ2()) {
            String aid2 = c207500r3.LL.getAid();
            C2189821An6 c2189821An6 = this.LLJILJILJ;
            if (c2189821An6 != null) {
                aid = c2189821An6.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid2, aid) && (aweme = c207500r3.LL) != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C319301Lr(aweme, null), 3);
            }
        }
        return c207500r3.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(java.util.List<java.lang.String> r16, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.VideoDetailResponse> r17) {
        /*
            r15 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C323140Clc
            if (r0 == 0) goto L92
            r5 = r3
            X.0Clc r5 = (X.C323140Clc) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L92
            int r2 = r2 - r1
            r5.LLILLL = r2
        L14:
            java.lang.Object r3 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            r6 = 0
            if (r0 == 0) goto L44
            if (r0 != r2) goto La5
            X.C155000ia.LIZIZ(r3)
        L25:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r3 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r3
            if (r3 == 0) goto L9f
            T r1 = r3.data
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.VideoDetailResponse r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.VideoDetailResponse) r1
            if (r1 == 0) goto L9f
            boolean r0 = r3.isCodeOK()
            if (r0 == 0) goto L99
            java.util.List<java.lang.String> r0 = r1.videos
            if (r0 == 0) goto L99
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L99
            T r0 = r3.data
            return r0
        L44:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r0 = r15.LLILZIL
            if (r0 == 0) goto Lad
            java.util.HashMap r3 = X.C1741890vQh.LJIIJ(r0)
            if (r3 == 0) goto Lad
            java.lang.String r8 = ","
            r9 = 0
            r11 = 0
            r14 = 62
            r7 = r16
            r10 = r9
            r12 = r9
            r13 = r9
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = "ids"
            r3.put(r0, r1)
            java.lang.String r1 = "id"
            java.lang.String r0 = ""
            r3.put(r1, r0)
            X.09YK r0 = X.C09YL.LIZ
            r5.LLILLL = r2
            r0.getClass()
            X.011f r1 = X.C09YK.LIZIZ
            if (r1 == 0) goto L90
            java.lang.Class<X.09YL> r0 = X.C09YL.class
            java.lang.Object r0 = r1.create(r0)
            X.09YL r0 = (X.C09YL) r0
            if (r0 == 0) goto L90
            java.lang.Object r3 = r0.LIZ(r3, r5)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r3 == r0) goto L8d
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r3 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r3
        L8d:
            if (r3 != r4) goto L25
            return r4
        L90:
            r3 = r6
            goto L8d
        L92:
            X.0Clc r5 = new X.0Clc
            r5.<init>(r15, r3)
            goto L14
        L99:
            java.lang.String r0 = "response data error"
            X.C1AF0.LIZJ(r0)
            return r6
        L9f:
            java.lang.String r0 = "response body is null"
            X.C1AF0.LIZJ(r0)
            return r6
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lad:
            java.lang.String r0 = "request body is null"
            X.C1AF0.LIZJ(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM.CQ2(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: EQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadLatest(X.C323030ClR r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C323030ClR>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C323170Clf
            if (r0 == 0) goto L20
            r5 = r8
            X.0Clf r5 = (X.C323170Clf) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L26
        L20:
            X.0Clf r5 = new X.0Clf
            r5.<init>(r6, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L58
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.09Fh r2 = X.C2341109Fh.LIZ     // Catch: java.lang.Exception -> L58
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L58
            java.lang.String r0 = "sea_pdp_creator_video, onLoadLatest, "
            r1.append(r0)     // Catch: java.lang.Exception -> L58
            r1.append(r7)     // Catch: java.lang.Exception -> L58
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L58
            r2.getClass()     // Catch: java.lang.Exception -> L58
            X.C2341109Fh.LJ(r0)     // Catch: java.lang.Exception -> L58
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L58
            r0 = 2
            java.lang.Object r1 = r6.BQ2(r7, r0, r5)     // Catch: java.lang.Exception -> L58
            if (r1 != r4) goto L57
            return r4
        L57:
            return r1
        L58:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "fetch video detail error"
            X.C1AF0.LJFF(r1, r0)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM.onLoadLatest(X.0ClR, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: FQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C323030ClR r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C323030ClR>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C323150Cld
            if (r0 == 0) goto L20
            r5 = r8
            X.0Cld r5 = (X.C323150Cld) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L26
        L20:
            X.0Cld r5 = new X.0Cld
            r5.<init>(r6, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L60
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.09Fh r2 = X.C2341109Fh.LIZ     // Catch: java.lang.Exception -> L60
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = "sea_pdp_creator_video, onLoadMore, "
            r1.append(r0)     // Catch: java.lang.Exception -> L60
            r1.append(r7)     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = ", "
            r1.append(r0)     // Catch: java.lang.Exception -> L60
            r1.append(r6)     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L60
            r2.getClass()     // Catch: java.lang.Exception -> L60
            X.C2341109Fh.LJ(r0)     // Catch: java.lang.Exception -> L60
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L60
            r0 = 4
            java.lang.Object r1 = r6.BQ2(r7, r0, r5)     // Catch: java.lang.Exception -> L60
            if (r1 != r4) goto L5f
            return r4
        L5f:
            return r1
        L60:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "fetch video detail error"
            X.C1AF0.LJFF(r1, r0)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM.onLoadMore(X.0ClR, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6 A[Catch: Exception -> 0x00f1, TryCatch #0 {Exception -> 0x00f1, blocks: (B:33:0x007a, B:34:0x007d, B:36:0x0081, B:37:0x0083, B:44:0x0097, B:45:0x009e, B:47:0x00a6, B:51:0x00b6, B:56:0x00bf, B:58:0x00ca, B:60:0x00ce, B:63:0x00d9, B:64:0x00e0, B:66:0x00e4, B:43:0x008f, B:15:0x0037, B:27:0x0060, B:28:0x0062, B:30:0x006f, B:19:0x003e, B:22:0x004d, B:23:0x0052, B:26:0x005b), top: B:71:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4 A[Catch: Exception -> 0x00f1, TryCatch #0 {Exception -> 0x00f1, blocks: (B:33:0x007a, B:34:0x007d, B:36:0x0081, B:37:0x0083, B:44:0x0097, B:45:0x009e, B:47:0x00a6, B:51:0x00b6, B:56:0x00bf, B:58:0x00ca, B:60:0x00ce, B:63:0x00d9, B:64:0x00e0, B:66:0x00e4, B:43:0x008f, B:15:0x0037, B:27:0x0060, B:28:0x0062, B:30:0x006f, B:19:0x003e, B:22:0x004d, B:23:0x0052, B:26:0x005b), top: B:71:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.C323030ClR r12, int r13, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C323030ClR>> r14) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM.BQ2(X.0ClR, int, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C323030ClR yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        Object obj;
        int iIntValue;
        int iIntValue2;
        Integer numLIZIZ;
        Integer numLIZIZ2;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return new C323030ClR(this.LLJILJIL);
                }
            } else {
                return new C323030ClR(this.LLJIJIL);
            }
        } else {
            c2189821An6.getProductId();
            String str = c2189821An6.getExtra().get("request_body");
            if (str != null) {
                this.LLILZIL = str;
            }
            this.LLILZLL = c2189821An6.getLogExtra();
            String str2 = c2189821An6.getExtra().get("detail_load_page_count");
            if (str2 != null && (numLIZIZ2 = C123100dR.LIZIZ(str2)) != null) {
                this.LLJ = numLIZIZ2.intValue();
            }
            String str3 = c2189821An6.getExtra().get("module_da_info");
            if (str3 != null) {
                this.LLIZ = C1741890vQh.LJIIJ(str3);
            }
            String str4 = c2189821An6.getExtra().get("card_da_info_list");
            if (str4 != null) {
                try {
                    List<Object> listLIZLLL = C08HX.LIZLLL(new JSONArray(str4));
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
                    Iterator it2 = ((ArrayList) listLIZLLL).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(it2.next()));
                    }
                    C189200o6.m2constructorimpl(arrayList);
                    obj = arrayList;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                Object obj2 = obj;
                if (zM7isFailureimpl) {
                    obj2 = null;
                }
                this.LLIZLLLIL = (List) obj2;
            }
            String ids = c2189821An6.getIds();
            int i3 = 0;
            if (ids != null) {
                ((ArrayList) this.LLJI).addAll(a0.LJJLIIIJILLIZJL(ids, new String[]{","}, 0, 6));
            }
            String aid = c2189821An6.getAid();
            if (aid != null) {
                Integer numValueOf = Integer.valueOf(((ArrayList) this.LLJI).indexOf(aid));
                if (numValueOf.intValue() >= 0) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                String str5 = c2189821An6.getExtra().get("click_into_inner_feed_offset");
                if (str5 != null && (numLIZIZ = C123100dR.LIZIZ(str5)) != null) {
                    iIntValue2 = numLIZIZ.intValue();
                } else {
                    iIntValue2 = 3;
                }
                int i4 = iIntValue - iIntValue2;
                if (i4 >= 0) {
                    i3 = i4;
                }
                this.LLJIJIL = i3;
                this.LLJILJIL = i3;
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sea_pdp_creator_video, click to inner feed, init index=");
                sbLIZ.append(i3);
                sbLIZ.append(", offset=");
                sbLIZ.append(iIntValue2);
                sbLIZ.append(", newInitIndex=");
                sbLIZ.append(i3 - iIntValue2);
                sbLIZ.append(",pageCount=");
                sbLIZ.append(this.LLJ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
            }
            this.LLJILJILJ = c2189821An6;
        }
        return new C323030ClR(this.LLJILJIL);
    }
}
