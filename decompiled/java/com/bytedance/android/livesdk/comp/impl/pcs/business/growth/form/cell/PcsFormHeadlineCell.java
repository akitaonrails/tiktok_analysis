package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell;

import X.C993600bxm;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public final class PcsFormHeadlineCell extends PowerCell<C993600bxm> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.hfy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C993600bxm c993600bxm = (C993600bxm) interfaceC1891350zJl;
        super.onBindItemView(c993600bxm);
        TextView textView = (TextView) this.itemView.findViewById(R.id.jl5);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.jl4);
        textView.setText(c993600bxm.LL);
        textView2.setText(c993600bxm.LLILLJJLI);
    }
}
