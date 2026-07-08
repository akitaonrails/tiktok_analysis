package com.ss.android.ugc.aweme.im.actionbar.api.protocol;

import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C908850Zl5;
import X.C908860Zl6;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes15.dex */
public class LocalIconAndTitleCell<T extends C908860Zl6> extends ActionBarCell<T> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ce7;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(T t) {
        boolean z;
        super.onBindItemView(t);
        C908850Zl5 c908850Zl5 = t.LLILZ;
        String str = c908850Zl5.LIZ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.vrc));
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.a1z));
            C426750GoL.LJIIIZ(this.itemView.findViewById(R.id.a1i), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, false, 26);
        } else {
            TextView textView = (TextView) this.itemView.findViewById(R.id.a1z);
            if (textView != null) {
                C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.vrc));
                C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.a1z));
                textView.setText(c908850Zl5.LIZ);
                c908850Zl5.LIZIZ.invoke((TuxTextView) textView);
            }
            C426750GoL.LJIIIZ(this.itemView.findViewById(R.id.a1i), 0, null, 0, null, false, 26);
        }
        C419910GdJ c419910GdJ = t.LLILLL;
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.a1i);
        tuxIconView.setTuxIcon(c419910GdJ);
        C786410Ut5.LJLLLLLL(0, tuxIconView);
    }
}
