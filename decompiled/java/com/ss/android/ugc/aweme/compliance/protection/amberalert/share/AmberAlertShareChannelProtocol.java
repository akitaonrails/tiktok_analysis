package com.ss.android.ugc.aweme.compliance.protection.amberalert.share;

import X.InterfaceC1371860lns;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo;
import com.ss.android.ugc.aweme.compliance.protection.amberalert.share.AmberAlertSharePackage;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import java.util.List;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class AmberAlertShareChannelProtocol extends TTShareChannelProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0m2X
            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                String str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("external onChannelShare channel: ");
                sbLIZ.append(interfaceC1369790lkX.label());
                sbLIZ.append(", success ");
                sbLIZ.append(z);
                sbLIZ.append(", ");
                AmberAlertSharePackage amberAlertSharePackage = null;
                if (baseSharePackage != null) {
                    str = baseSharePackage.title;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                if (baseSharePackage instanceof AmberAlertSharePackage) {
                    amberAlertSharePackage = (AmberAlertSharePackage) baseSharePackage;
                }
                if (z && amberAlertSharePackage != null) {
                    C1389390mG9 c1389390mG9 = C1389390mG9.LIZ;
                    AmberAlertCardInfo amberAlertCardInfo = amberAlertSharePackage.amberAlertCardInfo;
                    AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(interfaceC1369790lkX, 105);
                    c1389390mG9.getClass();
                    C1389390mG9.LIZIZ(amberAlertCardInfo, "tt_amber_alert_share_initiated", awS600S0100000_21);
                }
            }
        };
    }

    public AmberAlertShareChannelProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }
}
