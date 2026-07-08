package com.ss.android.ugc.aweme.comment.viewerlist.adapter;

import X.C064L;
import X.C1383370m6R;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoViewerNoMoreLimitCell extends PowerCell<C064L> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a3e, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Integer num;
        C064L item = getItem();
        if (item != null && (num = item.LL) != null) {
            ((TextView) this.itemView.findViewById(R.id.p_q)).setText(C1383370m6R.LJIIJ(num.intValue()));
        }
    }
}
