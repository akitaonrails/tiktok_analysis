package com.ss.android.ugc.aweme.relation.mutual;

import X.AbstractC2211791BhR;
import X.C1164490gPP;
import X.C1243240iSQ;
import X.C1387050mCN;
import X.C2211631BhB;
import X.C427660Gpo;
import X.C438710HIf;
import X.C786410Ut5;
import X.EnumC1387060mCO;
import X.InterfaceC1891350zJl;
import Y.ACListenerS122S0200000_19;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MutualRelationCell extends PowerCell<C1164490gPP> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LIZJ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0hvw
            public final C1266070j3F LJ;

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJ;
            }

            {
                this.LJ = new C1266070j3F(this, 1);
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1164490gPP c1164490gPP = (C1164490gPP) interfaceC1891350zJl;
        View view = this.itemView;
        C427660Gpo.LJIIJJI((C427660Gpo) view.findViewById(R.id.user_avatar), C438710HIf.LIZ(c1164490gPP.LL.getAvatarThumb()), false, null, null, false, false, null, null, false, null, 1022);
        TextView textView = (TextView) view.findViewById(R.id.user_name);
        C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
        User user = c1164490gPP.LL;
        c1243240iSQ.getClass();
        textView.setText(C1243240iSQ.LIZ(user, true));
        TextView textView2 = (TextView) view.findViewById(R.id.user_desc);
        String uniqueId = c1164490gPP.LL.getUniqueId();
        if (uniqueId == null) {
            uniqueId = "";
        }
        textView2.setText(uniqueId);
        RelationButton relationButton = (RelationButton) view.findViewById(R.id.user_relation_button);
        C1387050mCN c1387050mCN = new C1387050mCN(c1164490gPP.LL);
        c1387050mCN.LIZIZ = true;
        c1387050mCN.LJIIJJI = this;
        c1387050mCN.LJIIJ = false;
        c1387050mCN.LJ = EnumC1387060mCO.MESSAGE;
        relationButton.LLLLZIL(c1387050mCN.LIZ());
        ((RelationButton) view.findViewById(R.id.user_relation_button)).setTracker(new AwS563S0100000_19(c1164490gPP, 2795));
        C786410Ut5.I7(new ACListenerS122S0200000_19(this, c1164490gPP, 32), view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dro, viewGroup, false);
    }
}
