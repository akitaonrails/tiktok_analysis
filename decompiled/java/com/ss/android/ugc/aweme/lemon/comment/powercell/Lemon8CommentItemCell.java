package com.ss.android.ugc.aweme.lemon.comment.powercell;

import X.C1340920kzy;
import X.C1340940l00;
import X.C13LP;
import X.C21146717pB;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class Lemon8CommentItemCell<T> extends Lemon8BaseCommentCell<C1340940l00> {
    @Override // com.ss.android.ugc.aweme.lemon.comment.powercell.Lemon8BaseCommentCell
    public final View S5(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.da2, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.lemon.comment.powercell.Lemon8BaseCommentCell
    /* JADX INFO: renamed from: P5 */
    public final void onBindItemView(C1340920kzy c1340920kzy, List list) throws Throwable {
        super.onBindItemView(c1340920kzy, list);
        C13LP.LJJJLZIJ(0, list);
    }

    @Override // com.ss.android.ugc.aweme.lemon.comment.powercell.Lemon8BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) throws Throwable {
        super.onBindItemView((C1340920kzy) interfaceC1891350zJl, list);
        C13LP.LJJJLZIJ(0, list);
    }
}
