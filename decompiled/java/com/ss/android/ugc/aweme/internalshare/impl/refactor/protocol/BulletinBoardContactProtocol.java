package com.ss.android.ugc.aweme.internalshare.impl.refactor.protocol;

import X.C1362160lYE;
import X.C1362170lYF;
import X.C1362180lYG;
import X.C1362450lYh;
import X.C1362510lYn;
import X.C1363190lZt;
import X.EnumC1362480lYk;
import X.InterfaceC1361730lXX;
import X.InterfaceC1361740lXY;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelBulletinBoardPowerCell;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public final class BulletinBoardContactProtocol implements IContactListProtocol<C1362450lYh> {
    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final int priority() {
        return 50;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final Class<? extends PowerCell<C1362450lYh>> getWithCell() {
        return SharePanelBulletinBoardPowerCell.class;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean Hl1(IMContact iMContact) {
        return iMContact instanceof C1363190lZt;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361740lXY<C1362450lYh> iJ1(final C1362160lYE c1362160lYE) {
        return new InterfaceC1361740lXY<C1362450lYh>(c1362160lYE) { // from class: X.0lYg
            public final C1362160lYE LIZ;

            {
                this.LIZ = c1362160lYE;
            }

            @Override // X.InterfaceC1361740lXY
            public final void LIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
                boolean z;
                String str;
                C1362450lYh c1362450lYh = (C1362450lYh) interfaceC1361730lXX;
                C1362180lYG c1362180lYG = c1362450lYh.LLILLL;
                if (c1362180lYG.LIZJ) {
                    if (c1362180lYG.LIZ != EnumC1362480lYk.SELECTED) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LIZ.LJFF.zQ2(c1362450lYh.LL, z);
                    HashMap<String, String> map = new HashMap<>();
                    C1362500lYm bbDetailInfo = c1362450lYh.LL.getBbDetailInfo();
                    if (bbDetailInfo == null || (str = bbDetailInfo.LIZ) == null) {
                        str = "";
                    }
                    map.put("to_user_id", str);
                    map.put("rank_index", String.valueOf(c1362450lYh.LLILLJJLI));
                    map.put("icon_type", "bulletin_board");
                    InterfaceC1362600lYw interfaceC1362600lYw = this.LIZ.LJ;
                    if (interfaceC1362600lYw != null) {
                        interfaceC1362600lYw.LJ(map);
                    }
                }
            }

            @Override // X.InterfaceC1361740lXY
            public final void LIZIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
                String str;
                C1362450lYh c1362450lYh = (C1362450lYh) interfaceC1361730lXX;
                HashMap<String, String> map = new HashMap<>();
                C1362500lYm bbDetailInfo = c1362450lYh.LL.getBbDetailInfo();
                if (bbDetailInfo == null || (str = bbDetailInfo.LIZ) == null) {
                    str = "";
                }
                map.put("to_user_id", str);
                map.put("rank_index", String.valueOf(c1362450lYh.LLILLJJLI));
                map.put("icon_type", "bulletin_board");
                InterfaceC1362600lYw interfaceC1362600lYw = this.LIZ.LJ;
                if (interfaceC1362600lYw != null) {
                    interfaceC1362600lYw.LIZLLL(map);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX ag0(InterfaceC1361730lXX interfaceC1361730lXX, C1362170lYF c1362170lYF) {
        boolean z;
        EnumC1362480lYk enumC1362480lYk;
        C1362450lYh c1362450lYh = (C1362450lYh) interfaceC1361730lXX;
        boolean zContains = c1362170lYF.LIZ.LLILLL.contains(c1362450lYh.LL);
        boolean z2 = c1362170lYF.LIZ.LLILZIL;
        if (!z2 && !zContains) {
            z = false;
        } else {
            z = true;
        }
        if (zContains) {
            enumC1362480lYk = EnumC1362480lYk.SELECTED;
        } else {
            enumC1362480lYk = EnumC1362480lYk.NONE;
        }
        return new C1362450lYh(c1362450lYh.LL, c1362450lYh.LLILLJJLI, new C1362180lYG(enumC1362480lYk, new C1362510lYn(z, false, 4), !z2));
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX xS(int i, IMContact iMContact) {
        return new C1362450lYh((C1363190lZt) iMContact, i, new C1362180lYG((C1362510lYn) null, false, 7));
    }
}
