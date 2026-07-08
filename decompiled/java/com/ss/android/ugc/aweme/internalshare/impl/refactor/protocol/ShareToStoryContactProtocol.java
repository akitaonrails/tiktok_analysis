package com.ss.android.ugc.aweme.internalshare.impl.refactor.protocol;

import X.C1362160lYE;
import X.C1362170lYF;
import X.C1362180lYG;
import X.C1362460lYi;
import X.C1362510lYn;
import X.C1362810lZH;
import X.C1363310la5;
import X.InterfaceC1361730lXX;
import X.InterfaceC1361740lXY;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelShareToStoryPowerCell;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareToStoryContactProtocol implements IContactListProtocol<C1362460lYi> {
    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final int priority() {
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final Class<? extends PowerCell<C1362460lYi>> getWithCell() {
        return SharePanelShareToStoryPowerCell.class;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean Hl1(IMContact iMContact) {
        return iMContact instanceof C1363310la5;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361740lXY<C1362460lYi> iJ1(C1362160lYE c1362160lYE) {
        return new C1362810lZH(c1362160lYE);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX ag0(InterfaceC1361730lXX interfaceC1361730lXX, C1362170lYF c1362170lYF) {
        C1362460lYi c1362460lYi = (C1362460lYi) interfaceC1361730lXX;
        boolean z = !c1362170lYF.LIZ.LLILLL.isEmpty();
        return new C1362460lYi(c1362460lYi.LL, c1362460lYi.LLILLJJLI, new C1362180lYG(new C1362510lYn(z, false, 4), !z, 1));
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX xS(int i, IMContact iMContact) {
        return new C1362460lYi((C1363310la5) iMContact, i, new C1362180lYG((C1362510lYn) null, false, 7));
    }
}
