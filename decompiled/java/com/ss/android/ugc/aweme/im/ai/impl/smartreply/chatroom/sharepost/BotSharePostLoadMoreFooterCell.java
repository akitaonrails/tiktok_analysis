package com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost;

import X.C06XM;
import X.C1390410mHn;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class BotSharePostLoadMoreFooterCell extends PowerCell<C06XM> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        C1390410mHn c1390410mHn = (C1390410mHn) this.itemView.findViewById(R.id.c_z);
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1390410mHn c1390410mHn = (C1390410mHn) this.itemView.findViewById(R.id.c_z);
        if (c1390410mHn != null) {
            c1390410mHn.LIZJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.ckd, false, 4, null);
    }
}
