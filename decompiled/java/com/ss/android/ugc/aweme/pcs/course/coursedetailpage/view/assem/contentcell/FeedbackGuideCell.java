package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell;

import X.C1119920fFW;
import X.C1672206gi;
import X.C16F5;
import X.C1766906vz;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackGuideCell extends PowerCell<C1672206gi> {
    public C16F5 LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        String strLJIJI = C497740JfY.LJIJI(2131851960);
        String strLJIJJ = C497740JfY.LJIJJ(2131851959, strLJIJI);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIJJ);
        C1766906vz c1766906vz = new C1766906vz(this, 0);
        int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
        int length = strLJIJI.length() + iLJJJ;
        if (iLJJJ != -1) {
            C786410Ut5.q2(spannableStringBuilder, c1766906vz, iLJJJ, length, 33);
        }
        C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, length, 34, 500);
        View view = this.itemView;
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.hvx);
            this.LL = (C16F5) callbackFindViewById;
        }
        TextView textView = (TextView) callbackFindViewById;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.dc4, false, 4, null);
    }
}
