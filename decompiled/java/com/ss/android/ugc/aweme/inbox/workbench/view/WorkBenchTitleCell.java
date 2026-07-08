package com.ss.android.ugc.aweme.inbox.workbench.view;

import X.C1875807Wi;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class WorkBenchTitleCell extends PowerCell<C1875807Wi> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aa_;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iLIZIZ;
        C1875807Wi c1875807Wi = (C1875807Wi) interfaceC1891350zJl;
        super.onBindItemView(c1875807Wi);
        boolean z = c1875807Wi.LLILLJJLI;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.workbench_list_title);
        if (tuxTextView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxTextView.getLayoutParams();
            if (z) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            marginLayoutParams.topMargin = iLIZIZ;
            C786410Ut5.R6(tuxTextView, marginLayoutParams);
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.workbench_list_title);
        if (textView != null) {
            textView.setText(c1875807Wi.LL);
        }
    }
}
