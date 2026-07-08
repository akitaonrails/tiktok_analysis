package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.ui;

import X.C1390410mHn;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailMediaGridLoadingCell extends PowerLoadingCell {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.coy;
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = 0;
        }
        this.itemView.setPadding(0, 0, 0, 0);
        C1390410mHn c1390410mHn = (C1390410mHn) this.itemView.findViewById(R.id.v3o);
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
            C786410Ut5.LLLZZIL(c1390410mHn, 8);
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        this.itemView.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)), 0, 0);
        C1390410mHn c1390410mHn = (C1390410mHn) this.itemView.findViewById(R.id.v3o);
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
            c1390410mHn.LIZJ();
        }
    }
}
