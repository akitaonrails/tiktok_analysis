package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell;

import X.C1273104yX;
import X.C1546210qL5;
import X.C16F5;
import X.C384050F3z;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoCountCell extends PowerCell<C1273104yX> {
    public C16F5 LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1273104yX c1273104yX = (C1273104yX) interfaceC1891350zJl;
        super.onBindItemView(c1273104yX);
        View view = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        C1546210qL5.LIZ.getClass();
        c384050F3z.LJIIIIZZ = Float.valueOf(C1546210qL5.LIZ(22));
        c384050F3z.LJIIIZ = Float.valueOf(C1546210qL5.LIZ(22));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.exx);
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        View view2 = this.itemView;
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = view2.findViewById(R.id.video_count);
            this.LL = (C16F5) callbackFindViewById;
        }
        TextView textView = (TextView) callbackFindViewById;
        if (textView != null) {
            int i = c1273104yX.LL;
            textView.setText(C497740JfY.LJIIL(2131755959, i, Integer.valueOf(i)));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dc8, viewGroup, false);
    }
}
