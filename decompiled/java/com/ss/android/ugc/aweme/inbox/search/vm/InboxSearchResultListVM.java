package com.ss.android.ugc.aweme.inbox.search.vm;

import X.AnonymousClass0956;
import X.C0PEM;
import X.C1157130gDX;
import X.C1241480iPa;
import X.C1241730iPz;
import X.C1241760iQ2;
import X.C1241790iQ5;
import X.C1241860iQC;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C627660Ojc;
import X.EnumC1241490iPb;
import X.InterfaceC0148002o;
import X.InterfaceC1240590iO9;
import X.InterfaceC1241780iQ4;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchResultListVM extends AssemListViewModel<C1241760iQ2, InterfaceC1240590iO9, String> implements InterfaceC1241780iQ4 {
    public InboxSearchTabProtocol LL;
    public String LLILLJJLI = "";
    public String LLILLL;
    public int LLILZ;
    public AnonymousClass0956 LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1241760iQ2(EnumC1241490iPb.INIT, null, new C627660Ojc(null, null, null, null, 15));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        InboxSearchTabProtocol inboxSearchTabProtocol = this.LL;
        if (inboxSearchTabProtocol != null) {
            inboxSearchTabProtocol.LLILLL = null;
        }
        super.onCleared();
    }

    @Override // X.InterfaceC1241780iQ4
    public final void clearData() {
        listClear();
        setState(AFwS257S0000000_19.get$arr$(203));
    }

    @Override // X.InterfaceC1241780iQ4
    public final void refresh() {
        C1241480iPa c1241480iPa;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh() - tabName = ");
        InboxSearchTabProtocol inboxSearchTabProtocol = this.LL;
        sbLIZ.append(inboxSearchTabProtocol != null ? inboxSearchTabProtocol.LJIIIIZZ() : null);
        C1720106oR.LJI("InboxSearchResultListVM", C2188811AlT.LIZIZ(sbLIZ));
        InboxSearchTabProtocol inboxSearchTabProtocol2 = this.LL;
        if (inboxSearchTabProtocol2 != null && (c1241480iPa = inboxSearchTabProtocol2.LLILZ) != null) {
            String str = this.LLILLJJLI;
            if (str.length() > 0) {
                c1241480iPa.LIZIZ++;
                c1241480iPa.LIZLLL = str;
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZIL = C23250099c.LIZLLL(getLifecycleScope(), C0PEM.LIZJ, null, new C1241730iPz(this, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1240590iO9> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 184));
    }

    @Override // X.InterfaceC1241780iQ4
    public final void oH0(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateKeyWord() - keyWord = ");
        sbLIZ.append(str);
        C1720106oR.LJI("InboxSearchResultListVM", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r8) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM.onRefresh(X.05Vn):java.lang.Object");
    }

    public final boolean vQ2(C1241860iQC c1241860iQC) {
        if (Intrinsics.LJFF(c1241860iQC.LIZ, this.LLILLJJLI) && Intrinsics.LJFF(c1241860iQC.LIZIZ, this.LLILLL)) {
            return true;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkOutResult failed - nowKeyWord = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", nowUserFilter = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", result.keyword = ");
        sbLIZ.append(c1241860iQC.LIZ);
        sbLIZ.append(", result.filter = ");
        sbLIZ.append(c1241860iQC.LIZIZ);
        C1720106oR.LJI("InboxSearchResultListVM", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: wQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1241850iQB
            if (r0 == 0) goto L51
            r3 = r8
            X.0iQB r3 = (X.C1241850iQB) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r5 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L43
            if (r0 != r4) goto L8f
            X.C155000ia.LIZIZ(r5)
        L22:
            X.0iQC r5 = (X.C1241860iQC) r5
            X.0iP6 r0 = r5.LIZLLL
            int[] r1 = X.C1241230iPB.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r4) goto L67
            r0 = 2
            if (r1 == r0) goto L57
            X.0CcB r1 = X.AbstractC316870CbV.LIZ
            X.0iPj r0 = new X.0iPj
            r0.<init>()
            r1.getClass()
            X.0Cb9 r1 = new X.0Cb9
            r1.<init>(r0)
            return r1
        L43:
            X.C155000ia.LIZIZ(r5)
            int r0 = r6.LLILZ
            r3.LLILLL = r4
            java.lang.Object r5 = r6.xQ2(r0, r7, r3)
            if (r5 != r1) goto L22
            return r1
        L51:
            X.0iQB r3 = new X.0iQB
            r3.<init>(r6, r8)
            goto L12
        L57:
            X.0CcB r1 = X.AbstractC316870CbV.LIZ
            X.0iPk r0 = new X.0iPk
            r0.<init>()
            r1.getClass()
            X.0Cb9 r1 = new X.0Cb9
            r1.<init>(r0)
            return r1
        L67:
            int r1 = r6.LLILZ
            java.util.List<X.0zJl> r0 = r5.LJFF
            int r0 = r0.size()
            int r1 = r1 + r0
            r6.LLILZ = r1
            boolean r0 = r5.LIZJ
            if (r0 == 0) goto L82
            X.0CcB r3 = X.AbstractC316870CbV.LIZ
            java.lang.String r2 = r5.LJ
            java.util.List<X.0zJl> r1 = r5.LJFF
            r0 = 0
            X.0Cm0 r1 = X.C317290CcB.LJ(r3, r0, r2, r1, r4)
            return r1
        L82:
            X.0CcB r1 = X.AbstractC316870CbV.LIZ
            java.util.List<X.0zJl> r0 = r5.LJFF
            r1.getClass()
            X.0Cb8 r1 = new X.0Cb8
            r1.<init>(r0)
            return r1
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(int r14, java.lang.String r15, X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM.xQ2(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1241780iQ4
    public final void YL(String str, String str2, UrlModel urlModel, boolean z) {
        if (Intrinsics.LJFF(this.LLILLL, str)) {
            return;
        }
        this.LLILLL = str;
        if (str != null && str2 != null && urlModel != null) {
            setState(new AwS598S0100000_19(new C1241790iQ5(str, str2, urlModel), 185));
        } else {
            setState(AFwS257S0000000_19.get$arr$(208));
        }
        if (z) {
            refresh();
        }
    }
}
