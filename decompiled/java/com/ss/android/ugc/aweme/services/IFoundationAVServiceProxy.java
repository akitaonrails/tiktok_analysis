package com.ss.android.ugc.aweme.services;

import X.C12VK;
import X.InterfaceC1213410hgJ;
import X.InterfaceC1443800nfu;
import X.InterfaceC1445350niP;
import X.InterfaceC1457290o1f;
import X.InterfaceC1624140sMm;
import X.InterfaceC1631380sYS;
import X.InterfaceC1631390sYT;
import X.InterfaceC194501117r;
import X.InterfaceC2236708pZ;
import X.InterfaceC2269541DsO;
import X.InterfaceC2385909Wn;
import X.InterfaceC566530MJv;
import com.ss.android.ugc.aweme.services.appcontext.IAVAppContextManager;

/* JADX INFO: loaded from: classes36.dex */
public interface IFoundationAVServiceProxy {
    InterfaceC1443800nfu complianceService();

    InterfaceC2269541DsO getABService();

    IAVAppContextManager getAVAppContextManager();

    InterfaceC1457290o1f getAccountService();

    InterfaceC2236708pZ getApplicationService();

    C12VK getBridgeService();

    InterfaceC566530MJv getChallengeService();

    InterfaceC1631390sYT getCommerceService();

    InterfaceC1631380sYS getIStickerPropService();

    InterfaceC194501117r getLocalHashTagService();

    InterfaceC1445350niP getNetworkService();

    InterfaceC2385909Wn getRegionService();

    InterfaceC1213410hgJ getUiService();

    InterfaceC1624140sMm unlockStickerService();
}
