package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C0SQA;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1341780l1M;
import X.C20684815ws;
import X.C2344009Gk;
import X.C438710HIf;
import X.C786410Ut5;
import X.EnumC1341650l19;
import X.InterfaceC1891350zJl;
import Y.ACListenerS115S0200000_11;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class TaggedPeopleAvatarCell extends PowerCell<C0SQA> {
    public SmartImageView LL;
    public C0SQA LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C0SQA c0sqa = this.LLILLJJLI;
        if (c0sqa == null || c0sqa.LLILLL.contains(c0sqa.LL.getUid())) {
            return;
        }
        c0sqa.LLILLL.add(c0sqa.LL.getUid());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", c0sqa.LLILLJJLI.enterFrom);
        String str = c0sqa.LLILLJJLI.awemeId;
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        String str2 = c0sqa.LLILLJJLI.authorUid;
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", str2);
        String uid = c0sqa.LL.getUid();
        c2344009Gk.LJIIIIZZ("to_user_id", uid != null ? uid : "");
        c2344009Gk.LJIIIIZZ("anchor_type", "low_interest");
        C20684815ws.LJIILLIIL("show_tagged_user", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0SQA c0sqa = (C0SQA) interfaceC1891350zJl;
        super.onBindItemView(c0sqa);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c0sqa.LL.getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LIZLLL("TaggedPeopleAvatarCell");
        c1331670kl3LJIIIIZZ.LJJ(this.LL);
        c1331670kl3LJIIIIZZ.LIZLLL = true;
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            C786410Ut5.Q8(smartImageView, new ACListenerS115S0200000_11(this, c0sqa, 31));
        }
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, this.LL, EnumC1341650l19.AVATAR, 0.0f, null, 12);
        this.LLILLJJLI = c0sqa;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a4v, viewGroup, false);
        this.LL = (SmartImageView) viewTd.findViewById(R.id.bh8);
        return viewTd;
    }
}
