package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.C00GU;
import X.C09R9;
import X.C0ONX;
import X.C0OZB;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C340310DVt;
import X.C452070Ho5;
import X.C621400OYw;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C723600SZy;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC0148002o;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPollVoteDetailListViewModel extends AssemListViewModel<C340310DVt, C00GU, String> {
    public final C0OZB LL;
    public final C09R9 LLILLJJLI = new C09R9(this, C13LE.LIZ(C0ONX.class));
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723600SZy(this, C621400OYw.class, "BulletinPollVoteDetailCommonHierarchyData"), true);
    public final C736950SvV LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C340310DVt(0);
    }

    public final C621400OYw vQ2() {
        return (C621400OYw) this.LLILLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulletinPollVoteDetailListViewModel(C0OZB c0ozb) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        this.LL = c0ozb;
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 826);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinProfileViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(347);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(this);
        if (this instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        this.LLILZ = new C736950SvV(c19719912DlLIZ, awS553S0100000_9, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS240S0000000_9, null, null, null);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C00GU> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 212));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r20) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: wQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r19, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r20) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailListViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }
}
