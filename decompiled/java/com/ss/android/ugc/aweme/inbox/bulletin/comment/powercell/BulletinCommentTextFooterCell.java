package com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell;

import X.C0OY8;
import X.C0OYD;
import X.C1220000hqw;
import X.C13LE;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS144S0100000_9;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentTextFooterCell extends PowerCell<C0OYD> {
    public final C736950SvV LL = new C736950SvV(C13LE.LIZ(BulletinCommentListViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(296), null, null, null);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TuxTextView tuxTextView;
        C0OYD c0oyd = (C0OYD) interfaceC1891350zJl;
        View view = this.itemView;
        if ((view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
            if (C0OY8.LIZ[c0oyd.LL.ordinal()] == 1) {
                tuxTextView.setText(tuxTextView.getContext().getString(2131836751));
                C786410Ut5.h9(tuxTextView, new ACListenerS144S0100000_9(this, 134));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new ViewGroup.MarginLayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))));
        tuxTextView.setGravity(17);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        return tuxTextView;
    }
}
