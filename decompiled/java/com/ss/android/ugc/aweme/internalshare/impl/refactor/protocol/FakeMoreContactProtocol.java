package com.ss.android.ugc.aweme.internalshare.impl.refactor.protocol;

import X.C1362100lY8;
import X.C1362160lYE;
import X.C1362170lYF;
import X.C1362560lYs;
import X.C1363150lZp;
import X.InterfaceC1361730lXX;
import X.InterfaceC1361740lXY;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelMorePowerCell;

/* JADX INFO: loaded from: classes22.dex */
public final class FakeMoreContactProtocol implements IContactListProtocol<C1362100lY8> {
    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final int priority() {
        return 80;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final Class<? extends PowerCell<C1362100lY8>> getWithCell() {
        return SharePanelMorePowerCell.class;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean Hl1(IMContact iMContact) {
        return iMContact instanceof C1363150lZp;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361740lXY<C1362100lY8> iJ1(C1362160lYE c1362160lYE) {
        return new C1362560lYs(c1362160lYE);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX xS(int i, IMContact iMContact) {
        return new C1362100lY8((C1363150lZp) iMContact, i);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX ag0(InterfaceC1361730lXX interfaceC1361730lXX, C1362170lYF c1362170lYF) {
        return interfaceC1361730lXX;
    }
}
