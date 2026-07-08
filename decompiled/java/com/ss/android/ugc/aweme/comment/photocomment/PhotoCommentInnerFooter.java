package com.ss.android.ugc.aweme.comment.photocomment;

import X.C1351950lHl;
import X.C1370020lku;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoCommentInnerFooter extends PowerCell<Object> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a2u;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if ((viewGroup instanceof View) && viewGroup != null) {
            C1351950lHl.LJIJI(C1370020lku.LIZ(60.0d), viewGroup);
        }
        return super.onCreateItemView(viewGroup);
    }
}
