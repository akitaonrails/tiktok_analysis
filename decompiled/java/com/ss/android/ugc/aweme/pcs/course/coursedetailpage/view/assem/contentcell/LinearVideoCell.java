package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell;

import X.C16F5;
import X.C1836990xu5;
import X.C2188811AlT;
import android.text.format.DateUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class LinearVideoCell extends BaseVideoCell<C1836990xu5> {
    @Override // com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.BaseVideoCell
    public final int I5() {
        return R.layout.dc7;
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.BaseVideoCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1836990xu5 c1836990xu5) {
        super.onBindItemView(c1836990xu5);
        String elapsedTime = DateUtils.formatElapsedTime(c1836990xu5.LLILZ / 1000);
        View view = this.itemView;
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.video_stats);
            this.LLILZ = (C16F5) callbackFindViewById;
        }
        TextView textView = (TextView) callbackFindViewById;
        if (textView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1836990xu5.LLIZ);
            sbLIZ.append(" · ");
            sbLIZ.append(elapsedTime);
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
