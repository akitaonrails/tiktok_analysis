package com.ss.android.ugc.aweme.inbox.workbench.view.card;

import X.C0P0L;
import X.C635240Ovq;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionLineTextStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTextStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class MiddleContentCell extends PowerCell<C0P0L> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aa5;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        MissionTextStruct missionTextStruct;
        C0P0L c0p0l = (C0P0L) interfaceC1891350zJl;
        super.onBindItemView(c0p0l);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.dfe);
        MissionTextStruct missionTextStruct2 = null;
        if (tuxTextView != null) {
            MissionLineTextStruct missionLineTextStruct = c0p0l.LL;
            if (missionLineTextStruct != null) {
                missionTextStruct = missionLineTextStruct.leftText;
            } else {
                missionTextStruct = null;
            }
            C635240Ovq.LIZ(tuxTextView, missionTextStruct);
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.dff);
        if (tuxTextView2 != null) {
            MissionLineTextStruct missionLineTextStruct2 = c0p0l.LL;
            if (missionLineTextStruct2 != null) {
                missionTextStruct2 = missionLineTextStruct2.rightText;
            }
            C635240Ovq.LIZ(tuxTextView2, missionTextStruct2);
        }
    }
}
