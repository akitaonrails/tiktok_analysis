package com.ss.android.ugc.aweme.poi.detail.videolist.container;

import X.C07Z0;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CreatePostCellFor2Columns extends BaseCreatePostCell<C07Z0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.BaseCreatePostCell
    public final int I5() {
        C07Z0 c07z0 = (C07Z0) getItem();
        if (c07z0 != null) {
            return c07z0.LLILLJJLI;
        }
        return 0;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dz3, viewGroup, false);
    }
}
