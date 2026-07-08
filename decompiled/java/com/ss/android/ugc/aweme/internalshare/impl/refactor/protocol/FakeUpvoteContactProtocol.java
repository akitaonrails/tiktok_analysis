package com.ss.android.ugc.aweme.internalshare.impl.refactor.protocol;

import X.C1360460lVU;
import X.C1360480lVW;
import X.C1361600lXK;
import X.C1362160lYE;
import X.C1362170lYF;
import X.C1362180lYG;
import X.C1362510lYn;
import X.C1363320la6;
import X.C13LQ;
import X.InterfaceC1361730lXX;
import X.InterfaceC1361740lXY;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelUpvotePowerCell;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class FakeUpvoteContactProtocol implements IContactListProtocol<C1361600lXK> {
    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final int priority() {
        return 70;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final Class<? extends PowerCell<C1361600lXK>> getWithCell() {
        return SharePanelUpvotePowerCell.class;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean Hl1(IMContact iMContact) {
        return iMContact instanceof C1363320la6;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361740lXY<C1361600lXK> iJ1(C1362160lYE c1362160lYE) {
        return new C1360480lVW(c1362160lYE);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX ag0(InterfaceC1361730lXX interfaceC1361730lXX, C1362170lYF c1362170lYF) {
        boolean z;
        C1361600lXK c1361600lXK = (C1361600lXK) interfaceC1361730lXX;
        String string = c1362170lYF.LIZJ.extras.getString("aid");
        if (string == null) {
            string = "";
        }
        Set<IMContact> set = c1362170lYF.LIZ.LLILLL;
        int iLJIILIIL = C1360460lVU.LIZIZ.LJJII().LJIILIIL(string);
        if (!set.isEmpty()) {
            if (iLJIILIIL != 0 && iLJIILIIL != 1) {
                if (iLJIILIIL == 2 || iLJIILIIL == 3) {
                    iLJIILIIL = 3;
                }
            } else {
                iLJIILIIL = 1;
            }
        }
        if (C13LQ.LJJIJIIJI(Integer.valueOf(iLJIILIIL), new Integer[]{1, 3}) >= 0) {
            z = true;
        } else {
            z = false;
        }
        return new C1361600lXK(c1361600lXK.LL, c1361600lXK.LLILLJJLI, new C1362180lYG(new C1362510lYn(z, false, 4), !z, 1), iLJIILIIL);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX xS(int i, IMContact iMContact) {
        return new C1361600lXK((C1363320la6) iMContact, i, new C1362180lYG((C1362510lYn) null, false, 7), 0);
    }
}
