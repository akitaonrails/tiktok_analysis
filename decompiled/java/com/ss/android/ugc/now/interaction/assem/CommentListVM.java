package com.ss.android.ugc.now.interaction.assem;

import X.AbstractC316870CbV;
import X.C1158140gFA;
import X.C1352780lJ6;
import X.C1352910lJJ;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.model.CommentCursor;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentListVM extends AssemListViewModel<C1352910lJJ, CommentItem, CommentCursor> {
    public Aweme LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public CommentCursor LLILZIL;
    public boolean LLILZLL;
    public NowFeedMobHierarchyData LLIZ;
    public final C1352780lJ6 LLJ;
    public String LL = CardStruct.IStatusCode.DEFAULT;
    public final Set<String> LLIZLLLIL = new LinkedHashSet();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1352910lJJ(0);
    }

    public CommentListVM() {
        C1352780lJ6 c1352780lJ6 = new C1352780lJ6();
        c1352780lJ6.LJIIIIZZ = new AwS600S0100000_21(this, 192);
        this.LLJ = c1352780lJ6;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<CommentItem> c627660Ojc) {
        setState(new AwS600S0100000_21(c627660Ojc, (C627660Ojc<C1158140gFA>) 193));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<CommentCursor>> interfaceC1364105Vn) {
        return vQ2(new CommentCursor(0L), this.LL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(CommentCursor commentCursor, InterfaceC1364105Vn<? super AbstractC316870CbV<CommentCursor>> interfaceC1364105Vn) {
        return vQ2(commentCursor, this.LL, null, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (r12 == com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState.ALL_CACHE) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(com.ss.android.ugc.now.interaction.model.CommentCursor r22, java.lang.String r23, java.lang.String r24, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<com.ss.android.ugc.now.interaction.model.CommentCursor>> r25) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.CommentListVM.vQ2(com.ss.android.ugc.now.interaction.model.CommentCursor, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
