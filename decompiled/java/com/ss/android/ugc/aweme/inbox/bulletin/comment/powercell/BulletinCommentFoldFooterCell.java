package com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell;

import X.C0OYH;
import X.C1220000hqw;
import X.C13LE;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentFoldFooterCell extends PowerCell<C0OYH> {
    public final C736950SvV LL = new C736950SvV(C13LE.LIZ(BulletinCommentListViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(291), null, null, null);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a6f;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new AbS691S0100000_9(this, 7, 42), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
    }
}
