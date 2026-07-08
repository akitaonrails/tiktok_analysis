package com.ss.android.ugc.aweme.notification.cell;

import X.C10EU;
import X.C1242520iRG;
import X.C1582320rHK;
import X.C20684815ws;
import X.C2344009Gk;
import X.C427660Gpo;
import X.C438710HIf;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class BioMentionListCell extends PowerCell<C1582320rHK> {
    public String LL;
    public String LLILLJJLI;

    public final void I5(String str) {
        String str2 = this.LL;
        String str3 = null;
        if (str2 == null) {
            str2 = null;
        }
        String str4 = this.LLILLJJLI;
        if (str4 == null) {
            str4 = null;
        }
        C1242520iRG.LIZ(str2, str4, "notification_page", null);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("account_type", "mention_in_bio");
        c2344009Gk.LJIIIIZZ("from_user_id", C10EU.LIZ().getUid());
        c2344009Gk.LJIIIIZZ("tab_name", "mentions");
        C20684815ws.LJIILLIIL("notification_message_folded_message", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", "notification_page");
        String str5 = this.LL;
        if (str5 != null) {
            str3 = str5;
        }
        c2344009Gk2.LJIIIIZZ("to_user_id", str3);
        c2344009Gk2.LJIIIIZZ("enter_method", str);
        c2344009Gk2.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
        C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk2.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        C1582320rHK c1582320rHK = (C1582320rHK) interfaceC1891350zJl;
        List<String> urlList = c1582320rHK.LLILLL.getUrlList();
        if (urlList != null && !urlList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C427660Gpo.LJIIJJI((C427660Gpo) this.itemView.findViewById(R.id.bir), Integer.valueOf(R.drawable.c5w), false, null, null, false, false, null, null, false, null, 1006);
        } else {
            C427660Gpo.LJIIJJI((C427660Gpo) this.itemView.findViewById(R.id.bir), C438710HIf.LIZ(c1582320rHK.LLILLL), false, null, null, false, false, null, null, false, null, 1006);
        }
        C786410Ut5.T8((C427660Gpo) this.itemView.findViewById(R.id.bir), new ACListenerS158S0100000_24(this, 109));
        ((TextView) this.itemView.findViewById(R.id.o7l)).setText(c1582320rHK.LLILZ);
        C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.o7l), new ACListenerS158S0100000_24(this, 110));
        ((TextView) this.itemView.findViewById(R.id.o7z)).setText(c1582320rHK.LLILZIL);
        this.LL = c1582320rHK.LL;
        this.LLILLJJLI = c1582320rHK.LLILLJJLI;
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 111), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a5u, viewGroup, false);
    }
}
