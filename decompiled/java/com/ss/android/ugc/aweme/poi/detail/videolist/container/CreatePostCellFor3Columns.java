package com.ss.android.ugc.aweme.poi.detail.videolist.container;

import X.C07Z1;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CreatePostCellFor3Columns extends BaseCreatePostCell<C07Z1> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.BaseCreatePostCell
    public final int I5() {
        C07Z1 c07z1 = (C07Z1) getItem();
        if (c07z1 != null) {
            return c07z1.LLILLJJLI;
        }
        return 0;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dz4, viewGroup, false);
    }
}
