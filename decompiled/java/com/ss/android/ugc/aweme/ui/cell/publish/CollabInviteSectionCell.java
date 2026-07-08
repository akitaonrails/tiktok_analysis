package com.ss.android.ugc.aweme.ui.cell.publish;

import X.C01GW;
import X.C0283007t;
import X.C1388190mED;
import X.C20673215v0;
import X.C452501pT;
import X.C786410Ut5;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CollabInviteSectionCell extends PowerCell<C0283007t> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 298));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0013  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r4) {
        /*
            r3 = this;
            X.007t r4 = (X.C0283007t) r4
            X.01GW r0 = r3.LL
            java.lang.Object r2 = r0.getValue()
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r1 = r4.LL
            int r0 = r1.hashCode()
            switch(r0) {
                case -934918565: goto L5b;
                case -600094315: goto L45;
                case 765915793: goto L2f;
                case 1798309801: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.String r0 = ""
        L15:
            r2.setText(r0)
            return
        L19:
            java.lang.String r0 = "all_user"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            android.view.View r0 = r3.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131826711(0x7f111817, float:1.9286314E38)
            java.lang.String r0 = r1.getString(r0)
            goto L15
        L2f:
            java.lang.String r0 = "following"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            android.view.View r0 = r3.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131834769(0x7f113791, float:1.9302658E38)
            java.lang.String r0 = r1.getString(r0)
            goto L15
        L45:
            java.lang.String r0 = "friends"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            android.view.View r0 = r3.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131835747(0x7f113b63, float:1.9304641E38)
            java.lang.String r0 = r1.getString(r0)
            goto L15
        L5b:
            java.lang.String r0 = "recent"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            android.view.View r0 = r3.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131835773(0x7f113b7d, float:1.9304694E38)
            java.lang.String r0 = r1.getString(r0)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.cell.publish.CollabInviteSectionCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZJ;
        Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
        if (activityLIZ == null || (viewLIZJ = C20673215v0.LIZJ(R.layout.agh, activityLIZ)) == null) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.agh, viewGroup, false);
        }
        return viewLIZJ;
    }
}
