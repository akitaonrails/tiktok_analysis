package com.ss.android.ugc.aweme.offlinemode.viewmodel;

import X.AbstractC1604130rqV;
import X.AbstractC316870CbV;
import X.C01GW;
import X.C09YA;
import X.C0O10;
import X.C15438062q;
import X.C19319410i8;
import X.C2188811AlT;
import X.C2189821An6;
import X.C452501pT;
import X.C607950Nsv;
import X.C623470Ocr;
import X.C627260Oiy;
import X.C627660Ojc;
import X.EnumC624770Oex;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC624740Oeu;
import X.InterfaceC625450Og3;
import X.InterfaceC736910SvR;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeListVM extends BaseDetailShareVM<C0O10, C607950Nsv, Integer> implements InterfaceC625450Og3 {
    public static volatile long LLJJIII;
    public static final /* synthetic */ int LLJJIJI = 0;
    public volatile boolean LLIZLLLIL;
    public C2189821An6 LLJIJIL;
    public volatile boolean LLJILJIL;
    public volatile List<C607950Nsv> LLJILJILJ;
    public volatile boolean LLJILLL;
    public volatile boolean LLJJ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(297));
    public final int LLILZLL = 40;
    public final int LLIZ = 40;
    public final C09YA LLJ = new C09YA(this, AFwS195S0000000_9.get$arr$(298));
    public final C19319410i8 LLJI = new C19319410i8("OfflineModeListVM");
    public boolean LLJJI = true;

    @Override // X.InterfaceC625450Og3
    public final void SL2(EnumC624770Oex enumC624770Oex) {
    }

    @Override // X.InterfaceC625450Og3
    public final void Wz1(int i) {
    }

    @Override // X.InterfaceC625450Og3
    public final void cU1() {
    }

    @Override // X.InterfaceC625450Og3
    public final void dL1(int i) {
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 50;
    }

    @Override // X.InterfaceC625450Og3
    public final void n11(double d) {
    }

    @Override // X.InterfaceC625450Og3
    public final void tF(boolean z) {
    }

    public final InterfaceC736910SvR<InterfaceC624740Oeu> DQ2() {
        return (InterfaceC736910SvR) this.LLJ.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0O10(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C19319410i8 c19319410i8 = this.LLJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("listVM cleared ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z = AbstractC1604130rqV.LIZLLL;
        c19319410i8.LIZ(strLIZIZ, null);
        super.onCleared();
        this.LLJIJIL = null;
        ((InterfaceC624740Oeu) DQ2().getOperator()).LLLIZZ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C19319410i8 c19319410i8 = this.LLJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("listVM Prepared ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z = AbstractC1604130rqV.LIZLLL;
        c19319410i8.LIZ(strLIZIZ, null);
        super.onPrepared();
        ((InterfaceC624740Oeu) DQ2().getOperator()).LLLLLIL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM.BQ2(X.05Vn):java.lang.Object");
    }

    public final void EQ2(String str) {
        this.LLJILJILJ = null;
        this.LLJILLL = false;
        C19319410i8 c19319410i8 = this.LLJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalidateHeadStash from=");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z = AbstractC1604130rqV.LIZLLL;
        c19319410i8.LIZ(strLIZIZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[Catch: Exception -> 0x01c8, TryCatch #0 {Exception -> 0x01c8, blocks: (B:44:0x00b9, B:45:0x00bc, B:48:0x00c3, B:51:0x00e0, B:52:0x00e9, B:54:0x00ef, B:56:0x0100, B:58:0x0105, B:59:0x0118, B:61:0x011e, B:63:0x0131, B:64:0x0135, B:65:0x0144, B:67:0x014a, B:69:0x0156, B:71:0x015c, B:73:0x0162, B:75:0x0168, B:76:0x016c, B:77:0x016f, B:79:0x017a, B:81:0x017e, B:82:0x0181, B:30:0x007a, B:31:0x007d, B:32:0x0085, B:34:0x008b, B:36:0x009c, B:38:0x00a0, B:17:0x0046, B:19:0x0051, B:25:0x005d, B:27:0x0065), top: B:87:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object GQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r12) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM.GQ2(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC625450Og3
    public final void RX0(List<String> list) {
        EQ2("onDeleteCaches");
        List<Aweme> awemeList = getAwemeList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) awemeList) {
            if (!list.contains(((Aweme) obj).getAid())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != ((ArrayList) getAwemeList()).size()) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C607950Nsv((Aweme) it2.next()));
            }
            listSetItems(arrayList2);
            setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 362));
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C607950Nsv> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 361));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:63:0x012a, B:64:0x012d, B:67:0x0135, B:68:0x0140, B:70:0x0146, B:72:0x0159, B:73:0x015d, B:74:0x016c, B:76:0x0172, B:78:0x017e, B:80:0x0184, B:82:0x018a, B:84:0x0190, B:85:0x0194, B:86:0x0197, B:88:0x01a2, B:65:0x0130, B:66:0x0133, B:51:0x00ec, B:52:0x00ef, B:54:0x00f3, B:57:0x0104, B:60:0x0117, B:55:0x00fb, B:48:0x00d9), top: B:93:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0172 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:63:0x012a, B:64:0x012d, B:67:0x0135, B:68:0x0140, B:70:0x0146, B:72:0x0159, B:73:0x015d, B:74:0x016c, B:76:0x0172, B:78:0x017e, B:80:0x0184, B:82:0x018a, B:84:0x0190, B:85:0x0194, B:86:0x0197, B:88:0x01a2, B:65:0x0130, B:66:0x0133, B:51:0x00ec, B:52:0x00ef, B:54:0x00f3, B:57:0x0104, B:60:0x0117, B:55:0x00fb, B:48:0x00d9), top: B:93:0x0020 }] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r13) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        EQ2("deleteItemByAid");
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((C607950Nsv) it2.next()).LLILLJJLI.getAid(), str)) {
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
        return ((C607950Nsv) interfaceC1891350zJl).LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(int r8, X.InterfaceC1364105Vn<? super java.util.List<X.C607950Nsv>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C607990Nsz
            if (r0 == 0) goto L22
            r6 = r9
            X.0Nsz r6 = (X.C607990Nsz) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 0
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            goto L58
        L22:
            X.0Nsz r6 = new X.0Nsz
            r6.<init>(r7, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C0BVM.LIZ()
            if (r0 != 0) goto L3a
            return r4
        L3a:
            java.util.List<X.0Nsv> r0 = r7.LLJILJILJ
            if (r0 == 0) goto L3f
            return r0
        L3f:
            boolean r0 = r7.LLJILLL
            if (r0 == 0) goto L46
            java.util.List<X.0Nsv> r0 = r7.LLJILJILJ
            return r0
        L46:
            r7.LLJILLL = r2
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            X.0Nsw r0 = new X.0Nsw     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            r0.<init>(r7, r8, r4)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            r6.LLILLL = r2     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            java.lang.Object r1 = X.C23250099c.LJI(r6, r1, r0)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            if (r1 != r3) goto L5b
            return r3
        L58:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
        L5b:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            r7.LLJILLL = r5
            return r1
        L60:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L7c
            X.10i8 r2 = r7.LLJI     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "ensureHeadStash failed: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L7c
            r1.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7c
            r2.LJ(r0)     // Catch: java.lang.Throwable -> L7c
            r7.LLJILLL = r5
            return r4
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7c
            r7.LLJILLL = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM.CQ2(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object FQ2(int r9, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r10) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM.FQ2(int, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadLatest(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return FQ2(((Number) obj).intValue(), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(int r8, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r9) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM.onLoadMore(int, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return onLoadMore(((Number) obj).intValue(), (InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>>) interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        int size;
        this.LLJIJIL = c2189821An6;
        C0O10 c0o10 = (C0O10) getState();
        c0o10.getClass();
        List listLIZ = C627260Oiy.LIZ(c0o10);
        if (listLIZ != null) {
            size = listLIZ.size();
        } else {
            size = 0;
        }
        return Integer.valueOf(size);
    }
}
