package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui;

import X.C20605115k1;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC323450Cm7;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.pages.result.photosearch.ui.cell.footer.SearchListFooterCell;

/* JADX INFO: loaded from: classes19.dex */
public final class RemoteNoMoreHintFooter extends SearchListFooterCell {
    @Override // com.ss.android.ugc.aweme.search.pages.result.photosearch.ui.cell.footer.SearchListFooterCell, com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* JADX INFO: renamed from: I5 */
    public final void onBindItemView(C20605115k1 c20605115k1) {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
            C786410Ut5.W5(view, layoutParams);
            super.onBindItemView(c20605115k1);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.photosearch.ui.cell.footer.SearchListFooterCell
    public final void P5(EnumC323450Cm7 enumC323450Cm7) {
        super.P5(enumC323450Cm7);
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = 0;
            C786410Ut5.W5(view, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.photosearch.ui.cell.footer.SearchListFooterCell, com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C20605115k1) interfaceC1891350zJl);
    }
}
