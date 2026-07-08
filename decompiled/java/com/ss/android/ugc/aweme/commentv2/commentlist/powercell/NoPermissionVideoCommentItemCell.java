package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C1340400kz8;
import X.C1340450kzD;
import X.C21146717pB;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class NoPermissionVideoCommentItemCell extends BaseCommentCell<C1340450kzD> implements InterfaceC1146704e9 {
    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final boolean I7() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final boolean L7() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final boolean T6() {
        return false;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    /* JADX INFO: renamed from: U6 */
    public final void onBindItemView(C1340400kz8 c1340400kz8) throws Throwable {
        super.onBindItemView(c1340400kz8);
        TuxTextView tuxTextView = this.LLLIIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final View m7(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a2z, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) throws Throwable {
        super.onBindItemView((C1340400kz8) interfaceC1891350zJl);
        TuxTextView tuxTextView = this.LLLIIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }
}
