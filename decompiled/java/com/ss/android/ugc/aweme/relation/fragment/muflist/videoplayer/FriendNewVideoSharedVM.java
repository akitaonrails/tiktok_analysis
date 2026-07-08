package com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer;

import X.C0KBN;
import X.C0PEM;
import X.C13LP;
import X.C15438062q;
import X.C208600rE;
import X.C2189821An6;
import X.C23250099c;
import X.C322850Cl9;
import X.C322860ClA;
import X.C323270Clp;
import X.C323280Clq;
import X.C325590CpZ;
import X.C627660Ojc;
import X.EnumC323250Cln;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FriendNewVideoSharedVM extends BaseDetailShareVM<C325590CpZ, C208600rE, C323280Clq> {
    public static final C323280Clq LLIZLLLIL = new C323280Clq("", "", EnumC323250Cln.UNKNOWN, "", 10);
    public final List<Aweme> LLILZIL;
    public final C323270Clp LLILZLL;
    public C323280Clq LLIZ;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 0;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325590CpZ(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322850Cl9(this, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        C323280Clq c323280Clq = (C323280Clq) obj;
        super.manualListLoadMore(c323280Clq);
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322860ClA(this, c323280Clq, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C208600rE> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 108));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C323280Clq>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C323230Cll
            if (r0 == 0) goto L9e
            r4 = r6
            X.0Cll r4 = (X.C323230Cll) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L8c
            if (r1 != r0) goto La5
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0Clv r3 = (X.AbstractC323330Clv) r3
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onRefresh loadResult:"
            r1.append(r0)
            java.util.List r0 = r3.LIZ()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MUF-LIST VideoVM"
            X.C1720106oR.LJI(r0, r1)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r5.LLILZIL
            if (r2 == 0) goto L4c
            boolean r0 = r3 instanceof X.C323310Clt
            if (r0 == 0) goto L66
            X.0Clu r3 = new X.0Clu
            r3.<init>(r2)
        L4c:
            r0 = 59
            kotlin.jvm.internal.AFwS232S0000000_4 r0 = kotlin.jvm.internal.AFwS232S0000000_4.get$arr$(r0)
            X.0CbV r1 = X.C323240Clm.LIZ(r3, r0)
            boolean r0 = r1 instanceof X.C323380Cm0
            if (r0 == 0) goto L65
            r0 = r1
            X.0Cm0 r0 = (X.C323380Cm0) r0
            T r0 = r0.LIZJ
            X.0Clq r0 = (X.C323280Clq) r0
            if (r0 == 0) goto L65
            r5.LLIZ = r0
        L65:
            return r1
        L66:
            boolean r0 = r3 instanceof X.C323320Clu
            if (r0 == 0) goto L78
            X.0Clu r3 = (X.C323320Clu) r3
            java.util.List<T> r0 = r3.LIZIZ
            java.util.List r0 = r5.BQ2(r0, r2)
            X.0Clu r3 = new X.0Clu
            r3.<init>(r0)
            goto L4c
        L78:
            boolean r0 = r3 instanceof X.C323350Clx
            if (r0 == 0) goto L4c
            X.0Clx r3 = (X.C323350Clx) r3
            Params r1 = r3.LIZIZ
            java.util.List<T> r0 = r3.LIZJ
            java.util.List r0 = r5.BQ2(r0, r2)
            X.0Clx r3 = new X.0Clx
            r3.<init>(r1, r0)
            goto L4c
        L8c:
            X.C155000ia.LIZIZ(r3)
            X.0Clp r1 = r5.LLILZLL
            r4.LLILLL = r0
            X.0CmQ r0 = r1.LJ()
            java.lang.Object r3 = r1.LIZLLL(r0, r4)
            if (r3 != r2) goto L22
            return r2
        L9e:
            X.0Cll r4 = new X.0Cll
            r4.<init>(r5, r6)
            goto L12
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM.onRefresh(X.05Vn):java.lang.Object");
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
                if (Intrinsics.LJFF(((C208600rE) it2.next()).LL.getAid(), str)) {
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
        return ((C208600rE) interfaceC1891350zJl).LL;
    }

    public final List<Aweme> BQ2(List<? extends Aweme> list, List<? extends Aweme> list2) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<? extends Aweme> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAid());
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Aweme aweme : list) {
            if (!setLLIIJI.contains(aweme.getAid())) {
                arrayList2.add(aweme);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.addAll(0, list2);
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: CQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C323280Clq r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C323280Clq>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C323220Clk
            if (r0 == 0) goto L67
            r4 = r7
            X.0Clk r4 = (X.C323220Clk) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L59
            if (r0 != r1) goto L6d
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0Clv r3 = (X.AbstractC323330Clv) r3
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onLoadMore loadResult:"
            r1.append(r0)
            java.util.List r0 = r3.LIZ()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MUF-LIST VideoVM"
            X.C1720106oR.LJI(r0, r1)
            r0 = 58
            kotlin.jvm.internal.AFwS232S0000000_4 r0 = kotlin.jvm.internal.AFwS232S0000000_4.get$arr$(r0)
            X.0CbV r1 = X.C323240Clm.LIZ(r3, r0)
            boolean r0 = r1 instanceof X.C323380Cm0
            if (r0 == 0) goto L58
            r0 = r1
            X.0Cm0 r0 = (X.C323380Cm0) r0
            T r0 = r0.LIZJ
            X.0Clq r0 = (X.C323280Clq) r0
            if (r0 == 0) goto L58
            r5.LLIZ = r0
        L58:
            return r1
        L59:
            X.C155000ia.LIZIZ(r3)
            X.0Clp r0 = r5.LLILZLL
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZLLL(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L67:
            X.0Clk r4 = new X.0Clk
            r4.<init>(r5, r7)
            goto L12
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM.onLoadMore(X.0Clq, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendNewVideoSharedVM(User user, EnumC323250Cln enumC323250Cln, List<? extends Aweme> list) {
        this.LLILZIL = list;
        String uid = user.getUid();
        uid = uid == null ? "" : uid;
        String secUid = user.getSecUid();
        this.LLILZLL = new C323270Clp(new C323280Clq(uid, secUid == null ? "" : secUid, enumC323250Cln, "", 10));
        this.LLIZ = LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C323280Clq yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return this.LLIZ;
    }
}
