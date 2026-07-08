package com.ss.android.ugc.nearby.notice;

import X.C21681819tI;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.nearby.container.model.NearbyPlaceHolderModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class NearbyFeedPlaceHolderCell extends PowerCell<NearbyPlaceHolderModel> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C21681819tI c21681819tI;
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (!(layoutParams instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams) == null) {
            return;
        }
        c21681819tI.LLILLJJLI = true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ds_, viewGroup, false);
    }
}
