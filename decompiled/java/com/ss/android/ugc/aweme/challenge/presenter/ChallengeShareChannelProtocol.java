package com.ss.android.ugc.aweme.challenge.presenter;

import X.InterfaceC1371860lns;
import android.content.Context;
import com.ss.android.ugc.aweme.challenge.presenter.ChallengeSharePackageV2;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class ChallengeShareChannelProtocol extends TTShareChannelProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0lt6
            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                Challenge challenge;
                ShareModel shareModel = baseSharePackage.shareModel;
                Serializable serializable = null;
                if (shareModel != null) {
                    serializable = shareModel.customModel;
                }
                if ((serializable instanceof Challenge) && (challenge = (Challenge) serializable) != null) {
                    C1374970lst c1374970lst = ChallengeSharePackageV2.Companion;
                    String strKey = interfaceC1369790lkX.key();
                    c1374970lst.getClass();
                    C1374970lst.LIZ(strKey, z, challenge);
                }
            }
        };
    }

    public ChallengeShareChannelProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }
}
