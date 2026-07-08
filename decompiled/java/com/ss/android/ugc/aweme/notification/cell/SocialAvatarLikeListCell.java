package com.ss.android.ugc.aweme.notification.cell;

import X.C00GV;
import X.C1387050mCN;
import X.C427660Gpo;
import X.C438710HIf;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS137S0100000_2;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialAvatarLikeListCell extends PowerCell<C00GV> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C00GV c00gv = (C00GV) interfaceC1891350zJl;
        ((TextView) this.itemView.findViewById(R.id.p9_)).setText(c00gv.LL.getNickname());
        ((TextView) this.itemView.findViewById(R.id.unique_id)).setText(c00gv.LL.getUniqueId());
        C427660Gpo c427660Gpo = (C427660Gpo) this.itemView.findViewById(R.id.bir);
        List<String> urlList = c00gv.LL.getAvatarThumb().getUrlList();
        if (urlList != null && !urlList.isEmpty()) {
            C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(c00gv.LL.getAvatarThumb()), false, null, null, false, false, null, null, false, null, 1022);
        } else {
            C427660Gpo.LJIIJJI(c427660Gpo, Integer.valueOf(R.drawable.c5w), false, null, null, false, false, null, null, false, null, 1022);
        }
        C786410Ut5.I7(new ACListenerS137S0100000_2(c00gv, 83), this.itemView);
        ((RelationButton) this.itemView.findViewById(R.id.t4m)).LLLLZIL(new C1387050mCN(c00gv.LL).LIZ());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ab3, viewGroup, false);
    }
}
