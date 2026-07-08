package com.ss.android.ugc.aweme.relation.usercard.vm;

import X.AbstractC2252651DEx;
import X.C0KBN;
import X.C0PEM;
import X.C13LP;
import X.C15438062q;
import X.C1623606Xi;
import X.C1DFB;
import X.C1DFH;
import X.C209400rM;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2189821An6;
import X.C23250099c;
import X.C322930ClH;
import X.C322940ClI;
import X.C323370Clz;
import X.C323490CmB;
import X.C323500CmC;
import X.C325580CpY;
import X.C626160OhC;
import X.C627660Ojc;
import X.EnumC1262370ixH;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.InterfaceC323360Cly;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class RecUserVideoListSharedVM extends BaseDetailShareVM<C325580CpY, C209400rM, C323370Clz> {
    public static final C323370Clz LLJILJIL = new C323370Clz(0);
    public final User LLILZIL;
    public final InterfaceC323360Cly LLILZLL;
    public final EnumC1262370ixH LLIZ;
    public final AbstractC2252651DEx LLIZLLLIL;
    public C323370Clz LLJ;
    public List<? extends Aweme> LLJI;
    public Map<String, String> LLJIJIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325580CpY(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        C23250099c.LIZLLL(getAssemVMScope(), this.LLIZLLLIL, null, new C322930ClH(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C323500CmC(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public final void BQ2(Aweme aweme) {
        for (Map.Entry<String, String> entry : this.LLJIJIL.entrySet()) {
            AwemeExtKt.appendMobParam(aweme, entry.getKey(), entry.getValue());
        }
    }

    public final void EQ2(List<? extends Aweme> list) {
        boolean z;
        this.LLJI = list;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C209400rM(it2.next()));
        }
        if (list.size() >= 3) {
            z = true;
        } else {
            z = false;
        }
        setState(new AwS370S0200000_4(new C1623606Xi(new C626160OhC(false, z, 1)), (C1623606Xi<C626160OhC>) arrayList, (List<C209400rM>) 26));
        InterfaceC323360Cly interfaceC323360Cly = this.LLILZLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends Aweme> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().getAid());
        }
        interfaceC323360Cly.LIZIZ(arrayList2);
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        if (C323490CmB.LIZ[this.LLIZ.ordinal()] == 1) {
            return 54;
        }
        return 0;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        C323370Clz c323370Clz = (C323370Clz) obj;
        super.manualListLoadMore(c323370Clz);
        C23250099c.LIZLLL(getAssemVMScope(), this.LLIZLLLIL, null, new C322940ClI(this, c323370Clz, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C209400rM> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 109));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C323370Clz>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C323470Cm9
            if (r0 == 0) goto Lac
            r5 = r7
            X.0Cm9 r5 = (X.C323470Cm9) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lac
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r3 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L95
            if (r0 != r2) goto Lb3
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0Clv r3 = (X.AbstractC323330Clv) r3
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r4 = r6.LLJI
            if (r4 == 0) goto L93
            boolean r0 = r3 instanceof X.C323310Clt
            if (r0 == 0) goto L6b
            X.0Clu r2 = new X.0Clu
            r2.<init>(r4)
        L31:
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onRefresh, "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", compose result: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "[UserCard]_videoVM"
            X.C1720106oR.LJI(r0, r1)
            kotlin.jvm.internal.AwS583S0100000_4 r1 = new kotlin.jvm.internal.AwS583S0100000_4
            r0 = 111(0x6f, float:1.56E-43)
            r1.<init>(r6, r0)
            X.0CbV r1 = X.C323240Clm.LIZ(r2, r1)
            boolean r0 = r1 instanceof X.C323380Cm0
            if (r0 == 0) goto L6a
            r0 = r1
            X.0Cm0 r0 = (X.C323380Cm0) r0
            T r0 = r0.LIZJ
            X.0Clz r0 = (X.C323370Clz) r0
            if (r0 == 0) goto L6a
            r6.LLJ = r0
        L6a:
            return r1
        L6b:
            boolean r0 = r3 instanceof X.C323320Clu
            if (r0 == 0) goto L7e
            r0 = r3
            X.0Clu r0 = (X.C323320Clu) r0
            java.util.List<T> r0 = r0.LIZIZ
            java.util.List r0 = r6.CQ2(r0, r4)
            X.0Clu r2 = new X.0Clu
            r2.<init>(r0)
            goto L31
        L7e:
            boolean r0 = r3 instanceof X.C323350Clx
            if (r0 == 0) goto L93
            r0 = r3
            X.0Clx r0 = (X.C323350Clx) r0
            Params r1 = r0.LIZIZ
            java.util.List<T> r0 = r0.LIZJ
            java.util.List r0 = r6.CQ2(r0, r4)
            X.0Clx r2 = new X.0Clx
            r2.<init>(r1, r0)
            goto L31
        L93:
            r2 = r3
            goto L31
        L95:
            X.C155000ia.LIZIZ(r3)
            X.0Cly r0 = r6.LLILZLL
            r0.reset()
            X.0Cly r1 = r6.LLILZLL
            r5.LLILLL = r2
            X.0CmQ r0 = r1.LJ()
            java.lang.Object r3 = r1.LIZLLL(r0, r5)
            if (r3 != r4) goto L22
            return r4
        Lac:
            X.0Cm9 r5 = new X.0Cm9
            r5.<init>(r6, r7)
            goto L12
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM.onRefresh(X.05Vn):java.lang.Object");
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
                if (Intrinsics.LJFF(((C209400rM) it2.next()).LL.getAid(), str)) {
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
        return ((C209400rM) interfaceC1891350zJl).LL;
    }

    public final List<Aweme> CQ2(List<? extends Aweme> list, List<? extends Aweme> list2) {
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: DQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C323370Clz r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C323370Clz>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C323460Cm8
            if (r0 == 0) goto L64
            r4 = r7
            X.0Cm8 r4 = (X.C323460Cm8) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L56
            if (r0 != r1) goto L6a
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0Clv r3 = (X.AbstractC323330Clv) r3
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onLoadMore, "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "[UserCard]_videoVM"
            X.C1720106oR.LJI(r0, r1)
            kotlin.jvm.internal.AwS583S0100000_4 r1 = new kotlin.jvm.internal.AwS583S0100000_4
            r0 = 110(0x6e, float:1.54E-43)
            r1.<init>(r5, r0)
            X.0CbV r1 = X.C323240Clm.LIZ(r3, r1)
            boolean r0 = r1 instanceof X.C323380Cm0
            if (r0 == 0) goto L55
            r0 = r1
            X.0Cm0 r0 = (X.C323380Cm0) r0
            T r0 = r0.LIZJ
            X.0Clz r0 = (X.C323370Clz) r0
            if (r0 == 0) goto L55
            r5.LLJ = r0
        L55:
            return r1
        L56:
            X.C155000ia.LIZIZ(r3)
            X.0Cly r0 = r5.LLILZLL
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZLLL(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L64:
            X.0Cm8 r4 = new X.0Cm8
            r4.<init>(r5, r7)
            goto L12
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM.onLoadMore(X.0Clz, X.05Vn):java.lang.Object");
    }

    public RecUserVideoListSharedVM(User user, InterfaceC323360Cly interfaceC323360Cly, EnumC1262370ixH enumC1262370ixH) {
        C1DFB c1dfb = C0PEM.LIZJ;
        this.LLILZIL = user;
        this.LLILZLL = interfaceC323360Cly;
        this.LLIZ = enumC1262370ixH;
        this.LLIZLLLIL = c1dfb;
        this.LLJ = LLJILJIL;
        this.LLJIJIL = C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C323370Clz yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return this.LLJ;
    }
}
