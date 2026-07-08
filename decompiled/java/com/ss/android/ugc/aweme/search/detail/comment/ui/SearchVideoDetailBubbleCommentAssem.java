package com.ss.android.ugc.aweme.search.detail.comment.ui;

import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C420860Geq;
import X.C736680Sv4;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchVideoDetailBubbleCommentAssem extends BaseSearchVideoDetailCommentAssem<SearchVideoDetailBubbleCommentAssem> {
    public final boolean LLLIILIL = true;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f4a;
    }

    @Override // com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem
    public final boolean Ip() {
        return this.LLLIILIL;
    }

    @Override // com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem
    public final TuxTextView Tp(View view) {
        return (TuxTextView) view.findViewById(R.id.u88);
    }

    @Override // com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ij);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0H99
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C448260Hhw) obj).LL;
            }
        }, null, new AwS620S0100000_6((SmartImageView) view.findViewById(R.id.u87), 55), 6);
    }

    @Override // com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem
    public final void Gp(C420860Geq c420860Geq, int i) {
        C420860Geq.LIZ(c420860Geq, getContentView(), null, LJJIJL(), null, null);
    }

    @Override // com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem
    public final void Qp(C420860Geq c420860Geq, int i) {
        C420860Geq.LIZIZ(c420860Geq, getContentView(), null, LJJIJL(), null, null);
    }
}
