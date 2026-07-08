package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components;

import X.C2188811AlT;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.AbsPigeonGlobalProtocol;

/* JADX INFO: loaded from: classes15.dex */
public final class MonitorComponent extends AbsPigeonGlobalProtocol {
    public final GECPigeon LL;

    @Override // X.C0YXB
    public final GECPigeon LJJJJLL() {
        return this.LL;
    }

    public MonitorComponent(GECPigeon gECPigeon) {
        this.LL = gECPigeon;
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YWQ
    public final void LJ(String str, String str2, Throwable th) {
        if (th == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GEC-IMSDK");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("GEC-IMSDK");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YWQ
    public final void LJFF(String str, String str2, Throwable th) {
        if (th == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GEC-IMSDK");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("GEC-IMSDK");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
