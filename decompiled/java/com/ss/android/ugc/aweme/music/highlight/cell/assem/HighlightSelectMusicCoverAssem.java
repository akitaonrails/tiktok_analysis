package com.ss.android.ugc.aweme.music.highlight.cell.assem;

import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem;

/* JADX INFO: loaded from: classes7.dex */
public final class HighlightSelectMusicCoverAssem extends DefaultCoverAssem {
    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        super.Eo(view);
        View contentView = getContentView();
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
            C786410Ut5.W5(contentView, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
