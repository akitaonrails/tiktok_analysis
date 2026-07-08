package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell;

import X.C0JO6;
import X.C16F5;
import X.C1837000xu6;
import X.C418440Gaw;
import X.C426750GoL;
import X.C814420VxA;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class GridVideoCell extends BaseVideoCell<C1837000xu6> {
    @Override // com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.BaseVideoCell
    public final int I5() {
        return R.layout.dc5;
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.BaseVideoCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1837000xu6 c1837000xu6) {
        super.onBindItemView(c1837000xu6);
        if (c1837000xu6.LLIZ) {
            C426750GoL.LJIIIZ(this.itemView, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 16);
        }
        View view = this.itemView;
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.video_stats);
            this.LLILZ = (C16F5) callbackFindViewById;
        }
        TextView textView = (TextView) callbackFindViewById;
        if (textView != null) {
            textView.setText(C0JO6.LIZIZ(c1837000xu6.LLILZ));
        }
    }
}
