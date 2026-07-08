package com.ss.android.ugc.aweme.inbox.workbench.view;

import X.C00X9;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class WorkbenchSettingTitleCell extends PowerCell<C00X9> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.abr;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C00X9 c00x9 = (C00X9) interfaceC1891350zJl;
        super.onBindItemView(c00x9);
        TextView textView = (TextView) this.itemView.findViewById(R.id.workbench_setting_title_content);
        if (textView != null) {
            textView.setText(this.itemView.getContext().getString(c00x9.LL));
        }
    }
}
