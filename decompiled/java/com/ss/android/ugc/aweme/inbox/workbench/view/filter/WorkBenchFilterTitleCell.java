package com.ss.android.ugc.aweme.inbox.workbench.view.filter;

import X.C1586406Ja;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkBenchFilterTitleCell extends PowerCell<C1586406Ja> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aa9;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1586406Ja c1586406Ja = (C1586406Ja) interfaceC1891350zJl;
        super.onBindItemView(c1586406Ja);
        if (c1586406Ja.LLILLL) {
            TextView textView = (TextView) this.itemView.findViewById(R.id.workbench_filter_item_title);
            if (textView != null) {
                textView.setPadding(0, 0, 0, 0);
            }
        } else {
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.workbench_filter_item_title);
            if (textView2 != null) {
                textView2.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, 0);
            }
        }
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.workbench_filter_item_title);
        if (textView3 != null) {
            textView3.setText(c1586406Ja.LL);
        }
    }
}
