package com.ss.android.ugc.aweme.relation.auth.widget.cell;

import X.C1074760e4g;
import X.C1074770e4h;
import X.C1074830e4n;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C197039127h;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS119S0200000_16;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public final class ContactUnRegisterCell extends PowerCell<C1074770e4h> {
    public SmartAvatarImageView LL;
    public C197039127h LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.rw;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (SmartAvatarImageView) this.itemView.findViewById(R.id.bkz);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.ru2);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.ugd);
        this.LLILLJJLI = (C197039127h) this.itemView.findViewById(R.id.kz0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1074770e4h c1074770e4h = (C1074770e4h) interfaceC1891350zJl;
        super.onBindItemView(c1074770e4h);
        C1074830e4n c1074830e4n = c1074770e4h.LLILLJJLI;
        String str = c1074830e4n.photoUri;
        C197039127h c197039127h = null;
        if (str != null) {
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
            SmartAvatarImageView smartAvatarImageView = this.LL;
            if (smartAvatarImageView == null) {
                smartAvatarImageView = null;
            }
            c1331670kl3LJI.LJJ(smartAvatarImageView);
            C786410Ut5.h3(c1331670kl3LJI);
        } else {
            SmartAvatarImageView smartAvatarImageView2 = this.LL;
            if (smartAvatarImageView2 == null) {
                smartAvatarImageView2 = null;
            }
            smartAvatarImageView2.setActualImageResource(R.drawable.c5w);
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(c1074830e4n.contactName);
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.setText(c1074830e4n.phoneNumber);
        if (!c1074770e4h.LLILLL) {
            C197039127h c197039127h2 = this.LLILLJJLI;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            c197039127h2.setEnabled(true);
            C197039127h c197039127h3 = this.LLILLJJLI;
            if (c197039127h3 == null) {
                c197039127h3 = null;
            }
            c197039127h3.setButtonVariant(0);
            C197039127h c197039127h4 = this.LLILLJJLI;
            if (c197039127h4 == null) {
                c197039127h4 = null;
            }
            c197039127h4.setText(2131836221);
            ContactMaFWidgetVM contactMaFWidgetVMLIZ = C1074760e4g.LIZ(c1074770e4h.LLILZ);
            C197039127h c197039127h5 = this.LLILLJJLI;
            if (c197039127h5 != null) {
                c197039127h = c197039127h5;
            }
            C786410Ut5.U8(c197039127h, new ACListenerS119S0200000_16(contactMaFWidgetVMLIZ, c1074770e4h, 36));
            return;
        }
        C197039127h c197039127h6 = this.LLILLJJLI;
        if (c197039127h6 == null) {
            c197039127h6 = null;
        }
        c197039127h6.setButtonVariant(1);
        C197039127h c197039127h7 = this.LLILLJJLI;
        if (c197039127h7 == null) {
            c197039127h7 = null;
        }
        c197039127h7.setEnabled(false);
        C197039127h c197039127h8 = this.LLILLJJLI;
        if (c197039127h8 == null) {
            c197039127h8 = null;
        }
        c197039127h8.setText(2131836234);
        C197039127h c197039127h9 = this.LLILLJJLI;
        if (c197039127h9 == null) {
            c197039127h9 = null;
        }
        C786410Ut5.U8(c197039127h9, null);
    }
}
