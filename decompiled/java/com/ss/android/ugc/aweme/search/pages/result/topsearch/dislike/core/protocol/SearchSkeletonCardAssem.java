package com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.protocol;

import X.C07E5;
import X.C0IDR;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchSkeletonCardAssem extends ReusedUISlotAssem<SearchSkeletonCardAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eux;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (view.isAttachedToWindow()) {
            C786410Ut5.T4(view, 0.0f);
            view.animate().alpha(1.0f).setDuration(200L).start();
        } else {
            view.addOnAttachStateChangeListener(new C0IDR(view, 4));
        }
    }
}
