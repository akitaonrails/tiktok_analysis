package com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt;

import X.AbstractC316870CbV;
import X.C1165920gRi;
import X.C13LP;
import X.C1559190qg1;
import X.C1559260qg8;
import X.C627660Ojc;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaCenterNewStyleViewModel extends AssemListViewModel<C1165920gRi, InterfaceC1891350zJl, String> {
    public HashMap<String, MiniDramaCenterFilterOption> LL;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1559190qg1.class, "mini_drama_center_new_style_hierarchy_key"), true);
    public boolean LLILLL = true;
    public boolean LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1165920gRi(0);
    }

    public final String vQ2() {
        HashMap<String, MiniDramaCenterFilterOption> map = this.LL;
        if (map == null) {
            return "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, MiniDramaCenterFilterOption> entry : map.entrySet()) {
            if (entry.getValue() == null || (!Intrinsics.LJFF(r0.shouldHideWhenCollapsed, Boolean.TRUE))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            MiniDramaCenterFilterOption miniDramaCenterFilterOption = (MiniDramaCenterFilterOption) ((Map.Entry) it2.next()).getValue();
            arrayList.add(miniDramaCenterFilterOption != null ? miniDramaCenterFilterOption.name : null);
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJJJJLI(arrayList), " · ", null, null, 0, null, null, 62);
        return strLJJLIIIJ != null ? strLJJLIIIJ : "";
    }

    public final C1559190qg1 wQ2() {
        return (C1559190qg1) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String xQ2() {
        /*
            r5 = this;
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption> r0 = r5.LL
            if (r0 == 0) goto L3c
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption r0 = (com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption) r0
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.metricName
            if (r1 == 0) goto L11
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L11
        L36:
            java.util.Map r1 = X.C2097608Jq.LJIILLIIL(r4)
            if (r1 != 0) goto L41
        L3c:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L41:
            X.0r3j r0 = com.ss.android.ugc.aweme.service.MiniDramaHostService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.MiniDramaHostService r0 = X.C1573890r3j.LIZ()
            if (r0 == 0) goto L58
            com.google.gson.Gson r0 = r0.getGson()
            if (r0 == 0) goto L58
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r1)
            if (r0 != 0) goto L5a
        L58:
            java.lang.String r0 = ""
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.MiniDramaCenterNewStyleViewModel.xQ2():java.lang.String");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 211));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        return zQ2("", true, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(java.util.Map<java.lang.String, ? extends java.util.List<com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption>> r21) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0.LLILZ
            if (r1 == 0) goto L7
            return
        L7:
            r11 = 1
            r0.LLILZ = r11
            X.0rG2 r4 = X.C1581520rG2.LJI
            X.0qg1 r1 = r0.wQ2()
            java.lang.String r3 = ""
            if (r1 == 0) goto L18
            java.lang.String r5 = r1.LL
            if (r5 != 0) goto L19
        L18:
            r5 = r3
        L19:
            java.lang.String r6 = X.C1577260r9A.LIZ
            if (r6 != 0) goto L1e
            r6 = r3
        L1e:
            r7 = 0
            if (r21 == 0) goto L5c
            java.util.Collection r1 = r21.values()
            if (r1 == 0) goto L5c
            java.util.List r1 = X.C15438062q.LJIJJLI(r1)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r2 = r1.iterator()
        L36:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption r1 = (com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption) r1
            java.lang.String r1 = r1.id
            if (r1 == 0) goto L36
            r12.add(r1)
            goto L36
        L4a:
            java.lang.String r13 = ","
            r16 = 0
            r19 = 62
            r14 = r7
            r15 = r7
            r17 = r7
            r18 = r7
            java.lang.String r8 = X.C13LP.LJJLIIIJ(r12, r13, r14, r15, r16, r17, r18, r19)
            if (r8 != 0) goto L5d
        L5c:
            r8 = r3
        L5d:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption> r1 = r0.LL
            if (r1 == 0) goto L9c
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r2 = r1.iterator()
        L6e:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption r1 = (com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption) r1
            if (r1 == 0) goto L6e
            java.lang.String r1 = r1.id
            if (r1 == 0) goto L6e
            r12.add(r1)
            goto L6e
        L8a:
            java.lang.String r13 = ","
            r16 = 0
            r19 = 62
            r14 = r7
            r15 = r7
            r17 = r7
            r18 = r7
            java.lang.String r9 = X.C13LP.LJJLIIIJ(r12, r13, r14, r15, r16, r17, r18, r19)
            if (r9 != 0) goto L9d
        L9c:
            r9 = r3
        L9d:
            java.lang.String r10 = r0.xQ2()
            X.0qg1 r0 = r0.wQ2()
            if (r0 == 0) goto Lb1
            boolean r0 = r0.LLILZIL
            if (r0 != r11) goto Lb1
        Lab:
            r12 = 8
            X.C1611660s2e.LJJJ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        Lb1:
            r11 = 0
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.MiniDramaCenterNewStyleViewModel.yQ2(java.util.Map):void");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(String str, InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        return zQ2(str, false, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02bc A[Catch: Exception -> 0x0357, TryCatch #0 {Exception -> 0x0357, blocks: (B:81:0x015d, B:83:0x0169, B:85:0x016d, B:88:0x0173, B:94:0x017f, B:95:0x018e, B:97:0x0194, B:99:0x01a0, B:105:0x01ac, B:107:0x01b0, B:108:0x01be, B:110:0x01c4, B:112:0x01d5, B:114:0x01d9, B:115:0x01e5, B:117:0x01ee, B:119:0x01f2, B:120:0x0207, B:122:0x020d, B:124:0x0213, B:125:0x0217, B:127:0x021b, B:128:0x022b, B:130:0x0231, B:132:0x0239, B:134:0x0248, B:135:0x024b, B:137:0x024e, B:138:0x0257, B:140:0x025d, B:142:0x0269, B:143:0x026d, B:145:0x0284, B:150:0x029b, B:152:0x029f, B:154:0x02a3, B:160:0x02b2, B:163:0x02d3, B:164:0x02d6, B:165:0x02df, B:167:0x02e5, B:169:0x02f1, B:170:0x02f5, B:174:0x0311, B:177:0x032b, B:179:0x0334, B:182:0x033f, B:184:0x034a, B:161:0x02bc, B:146:0x028a, B:148:0x0290, B:149:0x0292, B:136:0x024c), top: B:191:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3 A[Catch: Exception -> 0x0355, TryCatch #1 {Exception -> 0x0355, blocks: (B:12:0x0034, B:16:0x0044, B:18:0x004d, B:20:0x0053, B:22:0x0057, B:23:0x005b, B:25:0x0061, B:26:0x0063, B:46:0x00c5, B:48:0x00cd, B:50:0x00d3, B:51:0x00db, B:52:0x00e7, B:69:0x011d, B:71:0x012b, B:72:0x0131, B:74:0x0144, B:77:0x014c, B:76:0x014a, B:55:0x00f5, B:57:0x00fd, B:60:0x0105, B:66:0x0111, B:44:0x00bf, B:32:0x007c, B:34:0x0080, B:35:0x0095, B:37:0x009b, B:39:0x00b0, B:42:0x00b6, B:43:0x00ba), top: B:192:0x0025 }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.HashMap] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(java.lang.String r19, boolean r20, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r21) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.MiniDramaCenterNewStyleViewModel.zQ2(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
