package com.ss.android.ugc.aweme.services;

import X.AnonymousClass1208;
import X.C12VK;
import X.InterfaceC1402500mbI;
import X.InterfaceC1420020n3Y;
import X.InterfaceC1434690nRD;
import X.InterfaceC1439690nZH;
import X.InterfaceC1447080nlC;
import X.InterfaceC1631390sYT;
import X.InterfaceC1631430sYX;
import X.InterfaceC1655090tAh;
import X.InterfaceC194468116k;
import X.InterfaceC2236708pZ;
import X.InterfaceC2269521DsM;
import X.InterfaceC2269541DsO;
import X.InterfaceC2385909Wn;
import X.InterfaceC376620Epg;
import X.InterfaceC555500LqW;
import X.InterfaceC566960MLm;
import X.InterfaceC574770MgV;
import X.InterfaceC580190MpF;
import X.InterfaceC855410Xh5;
import X.InterfaceC855700XhY;
import X.InterfaceC856880XjS;
import com.ss.android.ugc.aweme.port.in.IHashTagService;
import com.ss.android.ugc.aweme.port.in.IMusicService;

/* JADX INFO: loaded from: classes36.dex */
public interface IAVServiceProxy extends IFoundationAVServiceProxy {
    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    InterfaceC2269521DsM getABService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    /* bridge */ /* synthetic */ InterfaceC2269541DsO getABService();

    InterfaceC1434690nRD getAVConverter();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    /* bridge */ /* synthetic */ InterfaceC2236708pZ getApplicationService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    InterfaceC376620Epg getApplicationService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    InterfaceC580190MpF getBridgeService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    /* bridge */ /* synthetic */ C12VK getBridgeService();

    InterfaceC555500LqW getBusinessGoodsService();

    InterfaceC856880XjS getCaptionMentionService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    /* bridge */ /* synthetic */ InterfaceC1631390sYT getCommerceService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    InterfaceC1631430sYX getCommerceService();

    InterfaceC194468116k getDmtChallengeService();

    IHashTagService getHashTagService();

    InterfaceC1655090tAh getLiveService();

    InterfaceC574770MgV getMiniAppService();

    IMusicService getMusicService();

    AnonymousClass1208 getPublishPreviewService();

    InterfaceC1439690nZH getPublishService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    /* bridge */ /* synthetic */ InterfaceC2385909Wn getRegionService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    InterfaceC1420020n3Y getRegionService();

    InterfaceC1447080nlC getShareService();

    InterfaceC855410Xh5 getSpService();

    InterfaceC566960MLm getStoryService();

    InterfaceC855700XhY getSyncShareService();

    InterfaceC1402500mbI getWikiService();
}
