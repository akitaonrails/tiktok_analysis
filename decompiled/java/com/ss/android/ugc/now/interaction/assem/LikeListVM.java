package com.ss.android.ugc.now.interaction.assem;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C1157130gDX;
import X.C1218150hnx;
import X.C452501pT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes22.dex */
public final class LikeListVM extends AssemListViewModel<C1218150hnx, LikeItem, PaginationCursor> {
    public Aweme LLILLJJLI;
    public NowFeedMobHierarchyData LLILLL;
    public String LL = CardStruct.IStatusCode.DEFAULT;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(407));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1218150hnx(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<LikeItem> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 289));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<PaginationCursor>> interfaceC1364105Vn) {
        return vQ2(new PaginationCursor(0L, 0L), this.LL, new LinkedHashMap(), interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(PaginationCursor paginationCursor, InterfaceC1364105Vn<? super AbstractC316870CbV<PaginationCursor>> interfaceC1364105Vn) {
        return vQ2(paginationCursor, this.LL, new LinkedHashMap(), interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r10 == com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState.ALL_CACHE) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor r21, java.lang.String r22, java.util.Map<java.lang.String, java.lang.Integer> r23, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor>> r24) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.LikeListVM.vQ2(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }
}
