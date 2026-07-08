package com.ss.android.ugc.aweme.detailpage.audit.viewmodel;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0I0B;
import X.C0PEM;
import X.C0Z5O;
import X.C1157130gDX;
import X.C1218000hni;
import X.C1218060hno;
import X.C1218870hp7;
import X.C1219490hq7;
import X.C13BV;
import X.C1509305vX;
import X.C1528205ya;
import X.C15438062q;
import X.C1559260qg8;
import X.C23250099c;
import X.C452501pT;
import X.C627660Ojc;
import X.EnumC1217960hne;
import X.EnumC1217990hnh;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC892370Yzb;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS39S0310000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class AuditRequestListViewModel extends AssemListViewModel<C1218060hno, C1218000hni, Long> {
    public long LLILZ;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1219490hq7.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1031));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1033));
    public final C01GW LLILZIL = C1509305vX.LIZ(AFwS207S0000000_19.get$arr$(99));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1034));
    public final C01GW LLIZ = C1509305vX.LIZ(new AwS563S0100000_19(this, 1032));

    public final String AQ2() {
        return (String) this.LLILLL.getValue();
    }

    public final C1219490hq7 BQ2() {
        return (C1219490hq7) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1218060hno(0);
    }

    public final long zQ2() {
        return ((Number) this.LLILLJJLI.getValue()).longValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0Z5O c0z5o = C0Z5O.LIZ;
        C0Z5O.LJ.remove(this.LLIZ.getValue());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C0Z5O c0z5o = C0Z5O.LIZ;
        C0Z5O.LJ.add((InterfaceC892370Yzb) this.LLIZ.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C627660Ojc<C1218000hni> CQ2(List<C1218000hni> list) {
        return C627660Ojc.LIZ(((C1218060hno) getState()).LL, null, null, null, list, 7);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1218000hni> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 137));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C1219470hq5
            if (r0 == 0) goto L69
            r11 = r13
            X.0hq5 r11 = (X.C1219470hq5) r11
            int r2 = r11.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r11.LLILZ = r2
        L12:
            java.lang.Object r5 = r11.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r11.LLILZ
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L26
            if (r1 == r0) goto L42
            if (r1 != r3) goto L6f
            X.C155000ia.LIZIZ(r5)
        L25:
            return r5
        L26:
            X.C155000ia.LIZIZ(r5)
            X.099F r2 = X.C090F.LIZIZ()
            X.0Z5O r5 = X.C0Z5O.LIZ
            long r7 = r12.zQ2()
            long r9 = r12.LLILZ
            r11.LL = r2
            r11.LLILZ = r0
            r6 = 20
            java.lang.Object r5 = r5.LJ(r6, r7, r9, r11)
            if (r5 != r4) goto L47
            return r4
        L42:
            X.099F r2 = r11.LL
            X.C155000ia.LIZIZ(r5)
        L47:
            com.ss.android.ugc.aweme.network.model.GetAuditListResponseBody r5 = (com.ss.android.ugc.aweme.network.model.GetAuditListResponseBody) r5
            if (r5 == 0) goto L5e
            long r0 = r5.nextCursor
            r12.LLILZ = r0
            r2.LJIIZILJ(r5)
        L52:
            r0 = 0
            r11.LL = r0
            r11.LLILZ = r3
            java.lang.Object r5 = r12.yQ2(r2, r11)
            if (r5 != r4) goto L25
            return r4
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unknown error"
            r1.<init>(r0)
            r2.LJJJJJ(r1)
            goto L52
        L69:
            X.0hq5 r11 = new X.0hq5
            r11.<init>(r12, r13)
            goto L12
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public final void xQ2(EnumC1217960hne enumC1217960hne) {
        ?? arrayList;
        ?? arrayList2;
        if (enumC1217960hne == EnumC1217960hne.SINGLE) {
            List<C1218000hni> list = ((C1218060hno) getState()).LL.LLILZ;
            if (list != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C1218000hni> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C1218000hni.LIZ(it2.next(), enumC1217960hne, false, 1));
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            setState(new AwS228S0300000_19(this, (AuditRequestListViewModel) arrayList2, (List<C1218000hni>) enumC1217960hne, (EnumC1217960hne) 5));
            return;
        }
        List<C1218000hni> list2 = ((C1218060hno) getState()).LL.LLILZ;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C1218000hni> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(C1218000hni.LIZ(it3.next(), enumC1217960hne, false, 5));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        setState(new AwS228S0300000_19(this, (AuditRequestListViewModel) arrayList, (List<C1218000hni>) enumC1217960hne, (EnumC1217960hne) 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void DQ2(long j, boolean z) {
        List<C1218000hni> list = ((C1218060hno) getState()).LL.LLILZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            Iterator it2 = arrayList.iterator();
            boolean z2 = false;
            int i = 0;
            while (it2.hasNext()) {
                if (j == ((C1218000hni) it2.next()).LL.LIZLLL) {
                    if (i != -1) {
                        ListProtector.set(arrayList, i, C1218000hni.LIZ((C1218000hni) ListProtector.get(arrayList, i), null, z, 3));
                        if (!arrayList.isEmpty()) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                if (!((C1218000hni) it3.next()).LLILLL) {
                                    break;
                                }
                            }
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (((C1218000hni) obj).LLILLL) {
                                arrayList2.add(obj);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(Long.valueOf(((C1218000hni) it4.next()).LL.LIZLLL));
                        }
                        setState(new AwS39S0310000_19(this, (AuditRequestListViewModel) arrayList, (List<C1218000hni>) z2, (boolean) arrayList3, (List<Long>) 1));
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EQ2(android.content.Context r11, X.C1218000hni r12) {
        /*
            r10 = this;
            r6 = r10
            X.002o r0 = r6.getState()
            X.0hno r0 = (X.C1218060hno) r0
            java.util.List<java.lang.Long> r0 = r0.LLILZIL
            int r8 = r0.size()
            r5 = r12
            if (r5 == 0) goto L1f
            X.0ho0 r0 = r5.LL
            if (r0 == 0) goto L1f
            long r0 = r0.LIZLLL
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            if (r1 != 0) goto L21
        L1c:
            if (r8 != 0) goto L21
            return
        L1f:
            r1 = 0
            goto L1c
        L21:
            r0 = 1
            r3 = 0
            r7 = r11
            if (r1 == 0) goto L4a
            r4 = 1
            r0 = 2131835221(0x7f113955, float:1.9303574E38)
            java.lang.String r0 = r7.getString(r0)
        L2e:
            X.0mTM r1 = new X.0mTM
            r1.<init>(r7)
            r1.LJII = r3
            r1.LIZIZ(r0)
            kotlin.jvm.internal.AwS2S0311000_19 r3 = new kotlin.jvm.internal.AwS2S0311000_19
            r9 = 2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.C985403tE.LIZ(r1, r3)
            X.0mTF r0 = new X.0mTF
            r0.<init>(r1)
            r0.LIZLLL()
            return
        L4a:
            r4 = 0
            android.content.res.Resources r2 = r7.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r3] = r0
            r0 = 2131755341(0x7f10014d, float:1.9141559E38)
            java.lang.String r0 = r2.getQuantityString(r0, r8, r1)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel.EQ2(android.content.Context, X.0hni):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r13, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C1219480hq6
            if (r0 == 0) goto L62
            r11 = r15
            X.0hq6 r11 = (X.C1219480hq6) r11
            int r2 = r11.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r11.LLILZ = r2
        L12:
            java.lang.Object r0 = r11.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r2 = r11.LLILZ
            r3 = 2
            r1 = 1
            if (r2 == 0) goto L26
            if (r2 == r1) goto L41
            if (r2 != r3) goto L68
            X.C155000ia.LIZIZ(r0)
        L25:
            return r0
        L26:
            X.C155000ia.LIZIZ(r0)
            X.099F r2 = X.C090F.LIZIZ()
            X.0Z5O r5 = X.C0Z5O.LIZ
            long r7 = r12.zQ2()
            r11.LL = r2
            r11.LLILZ = r1
            r6 = 20
            r9 = r13
            java.lang.Object r0 = r5.LJ(r6, r7, r9, r11)
            if (r0 != r4) goto L46
            return r4
        L41:
            X.099F r2 = r11.LL
            X.C155000ia.LIZIZ(r0)
        L46:
            if (r0 == 0) goto L57
            r2.LJIIZILJ(r0)
        L4b:
            r0 = 0
            r11.LL = r0
            r11.LLILZ = r3
            java.lang.Object r0 = r12.yQ2(r2, r11)
            if (r0 != r4) goto L25
            return r4
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unknown error"
            r1.<init>(r0)
            r2.LJJJJJ(r1)
            goto L4b
        L62:
            X.0hq6 r11 = new X.0hq6
            r11.<init>(r12, r15)
            goto L12
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vQ2(Context context, EnumC1217990hnh enumC1217990hnh) {
        int size;
        String str;
        if (((C1218060hno) getState()).LLILZIL.isEmpty()) {
            return;
        }
        if (((C1218060hno) getState()).LLILZ) {
            size = ((C1218060hno) getState()).LLILLL;
        } else {
            size = ((C1218060hno) getState()).LLILZIL.size();
        }
        C1528205ya c1528205ya = C1528205ya.LIZJ;
        String strAQ2 = AQ2();
        Pair<? extends Object, String>[] pairArr = new Pair[4];
        pairArr[0] = new Pair<>("enter_from", BQ2().LL);
        if (enumC1217990hnh == EnumC1217990hnh.APPROVE) {
            str = "accept";
        } else {
            str = "decline";
        }
        pairArr[1] = new Pair<>("operation", str);
        pairArr[2] = new Pair<>("is_batch", "1");
        pairArr[3] = new Pair<>("request_num", String.valueOf(size));
        c1528205ya.LJJIII("handle_group_audit_request", strAQ2, pairArr, C0I0B.LJFF.LIZIZ());
        withState(new AwS228S0300000_19(this, enumC1217990hnh, context, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8 A[Catch: Exception -> 0x0185, LOOP:0: B:37:0x00e2->B:39:0x00e8, LOOP_END, TryCatch #0 {Exception -> 0x0185, blocks: (B:35:0x00ce, B:36:0x00d1, B:37:0x00e2, B:39:0x00e8, B:40:0x010b, B:41:0x0121, B:43:0x0127, B:45:0x0132, B:46:0x0136, B:47:0x0143, B:49:0x0149, B:50:0x015b, B:52:0x016c, B:54:0x017a, B:19:0x0046, B:20:0x0049, B:22:0x004e, B:24:0x005b, B:25:0x006a, B:27:0x0070, B:28:0x0080, B:29:0x0093, B:31:0x0099, B:32:0x00a9, B:16:0x003b), top: B:59:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:35:0x00ce, B:36:0x00d1, B:37:0x00e2, B:39:0x00e8, B:40:0x010b, B:41:0x0121, B:43:0x0127, B:45:0x0132, B:46:0x0136, B:47:0x0143, B:49:0x0149, B:50:0x015b, B:52:0x016c, B:54:0x017a, B:19:0x0046, B:20:0x0049, B:22:0x004e, B:24:0x005b, B:25:0x006a, B:27:0x0070, B:28:0x0080, B:29:0x0093, B:31:0x0099, B:32:0x00a9, B:16:0x003b), top: B:59:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149 A[Catch: Exception -> 0x0185, LOOP:2: B:47:0x0143->B:49:0x0149, LOOP_END, TryCatch #0 {Exception -> 0x0185, blocks: (B:35:0x00ce, B:36:0x00d1, B:37:0x00e2, B:39:0x00e8, B:40:0x010b, B:41:0x0121, B:43:0x0127, B:45:0x0132, B:46:0x0136, B:47:0x0143, B:49:0x0149, B:50:0x015b, B:52:0x016c, B:54:0x017a, B:19:0x0046, B:20:0x0049, B:22:0x004e, B:24:0x005b, B:25:0x006a, B:27:0x0070, B:28:0x0080, B:29:0x0093, B:31:0x0099, B:32:0x00a9, B:16:0x003b), top: B:59:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016c A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:35:0x00ce, B:36:0x00d1, B:37:0x00e2, B:39:0x00e8, B:40:0x010b, B:41:0x0121, B:43:0x0127, B:45:0x0132, B:46:0x0136, B:47:0x0143, B:49:0x0149, B:50:0x015b, B:52:0x016c, B:54:0x017a, B:19:0x0046, B:20:0x0049, B:22:0x004e, B:24:0x005b, B:25:0x006a, B:27:0x0070, B:28:0x0080, B:29:0x0093, B:31:0x0099, B:32:0x00a9, B:16:0x003b), top: B:59:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017a A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:35:0x00ce, B:36:0x00d1, B:37:0x00e2, B:39:0x00e8, B:40:0x010b, B:41:0x0121, B:43:0x0127, B:45:0x0132, B:46:0x0136, B:47:0x0143, B:49:0x0149, B:50:0x015b, B:52:0x016c, B:54:0x017a, B:19:0x0046, B:20:0x0049, B:22:0x004e, B:24:0x005b, B:25:0x006a, B:27:0x0070, B:28:0x0080, B:29:0x0093, B:31:0x0099, B:32:0x00a9, B:16:0x003b), top: B:59:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.C05XL<com.ss.android.ugc.aweme.network.model.GetAuditListResponseBody> r16, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r17) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel.yQ2(X.05XL, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(l.longValue(), interfaceC1364105Vn);
    }

    public final void wQ2(Context context, EnumC1217990hnh enumC1217990hnh, C1218000hni c1218000hni) {
        String str;
        C1528205ya c1528205ya = C1528205ya.LIZJ;
        String strAQ2 = AQ2();
        Pair<? extends Object, String>[] pairArr = new Pair[4];
        pairArr[0] = new Pair<>("enter_from", BQ2().LL);
        if (enumC1217990hnh == EnumC1217990hnh.APPROVE) {
            str = "accept";
        } else {
            str = "decline";
        }
        pairArr[1] = new Pair<>("operation", str);
        pairArr[2] = new Pair<>("is_batch", CardStruct.IStatusCode.DEFAULT);
        pairArr[3] = new Pair<>("request_num", "1");
        c1528205ya.LJJIII("handle_group_audit_request", strAQ2, pairArr, C0I0B.LJFF.LIZIZ());
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1218870hp7(this, enumC1217990hnh, c1218000hni, context, null), 2);
    }
}
