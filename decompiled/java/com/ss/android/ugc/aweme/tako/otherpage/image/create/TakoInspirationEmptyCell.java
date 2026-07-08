package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.C1271504yH;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoInspirationEmptyCell extends PowerCell<C1271504yH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fmz;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1271504yH c1271504yH = (C1271504yH) interfaceC1891350zJl;
        super.onBindItemView(c1271504yH);
        ((TextView) this.itemView.findViewById(R.id.x_j)).setText(c1271504yH.LL);
    }
}
