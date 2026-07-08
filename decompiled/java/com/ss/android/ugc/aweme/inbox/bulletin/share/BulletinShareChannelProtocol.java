package com.ss.android.ugc.aweme.inbox.bulletin.share;

import X.InterfaceC1369790lkX;
import X.InterfaceC1371860lns;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class BulletinShareChannelProtocol extends TTShareChannelProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0lnc
            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final List<InterfaceC1369790lkX> KB0() {
        BulletinBoardInviteSharePackage bulletinBoardInviteSharePackage;
        List<InterfaceC1369790lkX> listKB0 = super.KB0();
        BaseSharePackage baseSharePackage = this.LL;
        if ((baseSharePackage instanceof BulletinBoardInviteSharePackage) && (bulletinBoardInviteSharePackage = (BulletinBoardInviteSharePackage) baseSharePackage) != null) {
            ListProtector.add(listKB0, 0, new BulletinQRShareChannel(bulletinBoardInviteSharePackage));
        }
        return listKB0;
    }

    public BulletinShareChannelProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }
}
