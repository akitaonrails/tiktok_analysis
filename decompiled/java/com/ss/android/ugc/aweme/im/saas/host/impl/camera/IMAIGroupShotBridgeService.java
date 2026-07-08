package com.ss.android.ugc.aweme.im.saas.host.impl.camera;

import X.AbstractC1682806iQ;
import X.C1700606lI;
import X.C1701006lM;
import X.C19EG;
import X.C912070ZqH;
import X.EnumC1699206l4;
import X.EnumC1711006my;
import X.EnumC1786290waJ;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMAIGroupShotBridgeApi;

/* JADX INFO: loaded from: classes3.dex */
public final class IMAIGroupShotBridgeService implements IMAIGroupShotBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMAIGroupShotBridgeApi
    public final void LIZ() {
        C912070ZqH.LIZIZ.LJIIZILJ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMAIGroupShotBridgeApi
    public final IMMessageListProtocol LJ(Fragment fragment) {
        return C1701006lM.LIZIZ.LJ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMAIGroupShotBridgeApi
    public final IMMessageListProtocol LJFF(Fragment fragment) {
        return C1701006lM.LIZIZ.LJFF(fragment);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMAIGroupShotBridgeApi
    public final void LIZJ(EnumC1786290waJ enumC1786290waJ, EnumC1711006my enumC1711006my, EnumC1699206l4 enumC1699206l4, Integer num) {
        C912070ZqH.LIZIZ.LJIIL().LJIIJJI("chat", enumC1786290waJ, enumC1711006my, enumC1699206l4, num);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMAIGroupShotBridgeApi
    public final void LIZIZ(C19EG c19eg, AIGroupShotEntry.InChat inChat, AbstractC1682806iQ abstractC1682806iQ, String str, Integer num) {
        C1700606lI.LIZIZ.LIZJ(c19eg, inChat, abstractC1682806iQ, null, str, "chat", num);
    }
}
