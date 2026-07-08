package com.ss.android.ugc.aweme.inbox.search.view.cell;

import X.C0DTR;
import X.C1908030zkf;
import X.C427660Gpo;
import X.C438710HIf;
import X.C786410Ut5;
import X.C994050byV;
import X.InterfaceC1891350zJl;
import Y.ACListenerS119S0200000_16;
import android.content.Context;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public final class InboxSearchUserFilterResultCell extends PowerCell<C994050byV> {
    public C427660Gpo LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a9v;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LL = (C427660Gpo) this.itemView.findViewById(R.id.biz);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.y3j);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.ewz);
        C0DTR.LIZIZ(this.itemView.findViewById(R.id.kjm));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C994050byV c994050byV = (C994050byV) interfaceC1891350zJl;
        super.onBindItemView(c994050byV);
        User user = c994050byV.LL;
        C427660Gpo c427660Gpo = this.LL;
        C427660Gpo c427660Gpo2 = null;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(user.getAvatarThumb()), false, null, null, false, false, null, null, false, null, 1022);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(user.getNickname());
        Context context = this.itemView.getContext();
        String customVerify = user.getCustomVerify();
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C1908030zkf.LJI(context, customVerify, enterpriseVerifyReason, tuxTextView2);
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setText(user.getUniqueId());
        C427660Gpo c427660Gpo3 = this.LL;
        if (c427660Gpo3 != null) {
            c427660Gpo2 = c427660Gpo3;
        }
        C786410Ut5.T8(c427660Gpo2, new ACListenerS119S0200000_16(c994050byV, user, 12));
        C786410Ut5.I7(new ACListenerS119S0200000_16(c994050byV, user, 13), this.itemView);
    }
}
