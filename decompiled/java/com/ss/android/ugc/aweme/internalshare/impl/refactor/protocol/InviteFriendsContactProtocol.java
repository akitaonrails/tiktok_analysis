package com.ss.android.ugc.aweme.internalshare.impl.refactor.protocol;

import X.C1362080lY6;
import X.C1362160lYE;
import X.C1362170lYF;
import X.C1362180lYG;
import X.C1362510lYn;
import X.C1363280la2;
import X.InterfaceC1361730lXX;
import X.InterfaceC1361740lXY;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelInviteFriendsPowerCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class InviteFriendsContactProtocol implements IContactListProtocol<C1362080lY6> {
    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final int priority() {
        return 60;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final Class<? extends PowerCell<C1362080lY6>> getWithCell() {
        return SharePanelInviteFriendsPowerCell.class;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean Hl1(IMContact iMContact) {
        return iMContact instanceof C1363280la2;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361740lXY<C1362080lY6> iJ1(final C1362160lYE c1362160lYE) {
        return new InterfaceC1361740lXY<C1362080lY6>(c1362160lYE) { // from class: X.0lYW
            public final C1362160lYE LIZ;

            public final void LIZJ() {
                Activity activityLIZIZ;
                Aweme awemeLJJIJIL = C621180OYa.LIZ.LJJIJIL(this.LIZ.LIZIZ);
                if (awemeLJJIJIL == null) {
                    return;
                }
                C1362090lY7.LIZ();
                C1362630lYz.LIZ.getClass();
                C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
                if (c2096308Jd != null) {
                    c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.CLICK_INVITE_FRIEND.getValue()));
                }
                InterfaceC1362600lYw interfaceC1362600lYw = this.LIZ.LJ;
                if (interfaceC1362600lYw != null) {
                    interfaceC1362600lYw.LJIILIIL();
                }
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("enter_from", this.LIZ.LIZJ, bundle);
                C786410Ut5.LJJIZ(bundle, "share_aweme", awemeLJJIJIL);
                C786410Ut5.LJJIJL(bundle, "aweme_share_pck", this.LIZ.LIZIZ);
                List<InterfaceC1369790lkX> list = this.LIZ.LIZLLL;
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1369790lkX interfaceC1369790lkX : list) {
                    if (interfaceC1369790lkX.LJJIII()) {
                        arrayList.add(interfaceC1369790lkX);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((InterfaceC1369790lkX) it2.next()).key());
                }
                C786410Ut5.LJJJIL(bundle, "prev_share_channel_key", new ArrayList(arrayList2));
                bundle.putInt("SHARE_INVITE_FRIENDS_PANEL_STYLE", 1);
                AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
                if (abstractC1387200mCcLJFF == null || (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) == null) {
                    return;
                }
                C1234690iEd.LIZIZ.LIZLLL(activityLIZIZ, bundle).show();
            }

            {
                this.LIZ = c1362160lYE;
            }

            @Override // X.InterfaceC1361740lXY
            public final void LIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
                LIZJ();
            }

            @Override // X.InterfaceC1361740lXY
            public final /* bridge */ /* synthetic */ void LIZIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX ag0(InterfaceC1361730lXX interfaceC1361730lXX, C1362170lYF c1362170lYF) {
        C1362080lY6 c1362080lY6 = (C1362080lY6) interfaceC1361730lXX;
        boolean z = !c1362170lYF.LIZ.LLILLL.isEmpty();
        return new C1362080lY6(c1362080lY6.LL, c1362080lY6.LLILLJJLI, new C1362180lYG(new C1362510lYn(z, false, 4), !z, 1));
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX xS(int i, IMContact iMContact) {
        return new C1362080lY6((C1363280la2) iMContact, i, new C1362180lYG((C1362510lYn) null, false, 7));
    }
}
