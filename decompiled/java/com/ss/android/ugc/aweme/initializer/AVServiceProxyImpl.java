package com.ss.android.ugc.aweme.initializer;

import X.AnonymousClass1208;
import X.C120G;
import X.C1400500mY4;
import X.C1402840mbq;
import X.C1465270oEX;
import X.C1654960tAU;
import X.C1912970zsd;
import X.C19221910Hx;
import X.C19286810cs;
import X.C19305510ft;
import X.C19329010jg;
import X.C194463116f;
import X.C19512611Vs;
import X.C1B4F;
import X.C20186013yc;
import X.C20703515zt;
import X.C2214201BlK;
import X.C621180OYa;
import X.InterfaceC1213410hgJ;
import X.InterfaceC1402500mbI;
import X.InterfaceC1420020n3Y;
import X.InterfaceC1434690nRD;
import X.InterfaceC1439690nZH;
import X.InterfaceC1443800nfu;
import X.InterfaceC1445350niP;
import X.InterfaceC1447080nlC;
import X.InterfaceC1457290o1f;
import X.InterfaceC1624140sMm;
import X.InterfaceC1631380sYS;
import X.InterfaceC1631430sYX;
import X.InterfaceC1655090tAh;
import X.InterfaceC194468116k;
import X.InterfaceC194501117r;
import X.InterfaceC2269521DsM;
import X.InterfaceC376620Epg;
import X.InterfaceC555500LqW;
import X.InterfaceC566530MJv;
import X.InterfaceC566960MLm;
import X.InterfaceC574770MgV;
import X.InterfaceC580190MpF;
import X.InterfaceC855410Xh5;
import X.InterfaceC855700XhY;
import X.InterfaceC856880XjS;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.ToolsMainActivityAbility;
import com.ss.android.ugc.aweme.challenge.data.LocalHashTag;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import com.ss.android.ugc.aweme.port.in.IHashTagService;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.NetworkServiceImpl;
import com.ss.android.ugc.aweme.services.appcontext.IAVAppContextManager;
import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardVideoPlayerCacheProvider;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.AVAweme;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.IStoryService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class AVServiceProxyImpl implements IAVServiceProxy {
    public InterfaceC2269521DsM abTestService;
    public InterfaceC1457290o1f accountService;
    public InterfaceC376620Epg applicationService;
    public InterfaceC1434690nRD avConverter;
    public InterfaceC580190MpF bridgeService;
    public InterfaceC555500LqW businessGoodsService;
    public InterfaceC856880XjS captionMentionService;
    public InterfaceC194468116k challengeService;
    public InterfaceC1631430sYX commerceService;
    public InterfaceC1443800nfu complianceService;
    public IHashTagService hashTagService;
    public InterfaceC1655090tAh liveService;
    public InterfaceC194501117r localHashTagService;
    public InterfaceC574770MgV miniAppService;
    public InterfaceC1445350niP networkService;
    public AnonymousClass1208 publishPreviewService;
    public InterfaceC1439690nZH publishService;
    public InterfaceC1420020n3Y regionService;
    public InterfaceC855410Xh5 sharePrefService;
    public InterfaceC1447080nlC shareService;
    public InterfaceC1631380sYS stickerPropService;
    public InterfaceC566960MLm storyService;
    public InterfaceC855700XhY syncShareService;
    public InterfaceC1213410hgJ uiService;
    public InterfaceC1624140sMm unlockStickerService;
    public InterfaceC1402500mbI wikiService;

    private InterfaceC194468116k getChallengeServiceInternal() {
        if (this.challengeService == null) {
            this.challengeService = new C194463116f();
        }
        return this.challengeService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC1443800nfu complianceService() {
        if (this.complianceService == null) {
            this.complianceService = new InterfaceC1443800nfu() { // from class: X.1Dsc
            };
        }
        return this.complianceService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC2269521DsM getABService() {
        if (this.abTestService == null) {
            this.abTestService = new C1400500mY4();
        }
        return this.abTestService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public IAVAppContextManager getAVAppContextManager() {
        return new IAVAppContextManager() { // from class: X.1DsW
            @Override // com.ss.android.ugc.aweme.services.appcontext.IAVAppContextManager
            public final long getUpdateVersionCode() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZLLL();
            }

            @Override // com.ss.android.ugc.aweme.services.appcontext.IAVAppContextManager
            public final long getVersionCode() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LJ();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC1434690nRD getAVConverter() {
        if (this.avConverter == null) {
            this.avConverter = new InterfaceC1434690nRD() { // from class: X.1Dsd
            };
        }
        return this.avConverter;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC1457290o1f getAccountService() {
        if (this.accountService == null) {
            this.accountService = new C19305510ft();
        }
        return this.accountService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC376620Epg getApplicationService() {
        if (this.applicationService == null) {
            this.applicationService = new C19221910Hx();
        }
        return this.applicationService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC580190MpF getBridgeService() {
        if (this.bridgeService == null) {
            this.bridgeService = new C19329010jg();
        }
        return this.bridgeService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC555500LqW getBusinessGoodsService() {
        if (this.businessGoodsService == null) {
            this.businessGoodsService = new C1912970zsd();
        }
        return this.businessGoodsService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC856880XjS getCaptionMentionService() {
        if (this.captionMentionService == null) {
            this.captionMentionService = new InterfaceC856880XjS() { // from class: X.1DsX
            };
        }
        return this.captionMentionService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC1631430sYX getCommerceService() {
        if (this.commerceService == null) {
            this.commerceService = new C1465270oEX();
        }
        return this.commerceService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public IHashTagService getHashTagService() {
        if (this.hashTagService == null) {
            this.hashTagService = new IHashTagService() { // from class: X.11Er
                @Override // com.ss.android.ugc.aweme.port.in.IHashTagService
                public final void saveLocalHashTag(boolean z, String str) {
                    C19468511Et c19468511EtLIZJ = C19468511Et.LIZJ();
                    LocalHashTag localHashTag = new LocalHashTag(str, Boolean.TRUE);
                    ((ArrayList) c19468511EtLIZJ.LLILZLL).remove(localHashTag);
                    ListProtector.add(c19468511EtLIZJ.LLILZLL, 0, localHashTag);
                    if (c19468511EtLIZJ.LL > 0 && ((ArrayList) c19468511EtLIZJ.LLILZLL).size() > c19468511EtLIZJ.LL) {
                        ListProtector.remove(c19468511EtLIZJ.LLILZLL, ((ArrayList) r1).size() - 1);
                    }
                    c19468511EtLIZJ.LIZLLL();
                }
            };
        }
        return this.hashTagService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC1631380sYS getIStickerPropService() {
        if (this.stickerPropService == null) {
            this.stickerPropService = new InterfaceC1631380sYS() { // from class: X.1Dse
            };
        }
        return this.stickerPropService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC1655090tAh getLiveService() {
        if (this.liveService == null) {
            this.liveService = new C1654960tAU();
        }
        return this.liveService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC194501117r getLocalHashTagService() {
        if (this.localHashTagService == null) {
            this.localHashTagService = new InterfaceC194501117r() { // from class: X.1DsY
            };
        }
        return this.localHashTagService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC574770MgV getMiniAppService() {
        if (this.miniAppService == null) {
            this.miniAppService = new C19286810cs();
        }
        return this.miniAppService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC1445350niP getNetworkService() {
        if (this.networkService == null) {
            this.networkService = new NetworkServiceImpl();
        }
        return this.networkService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public AnonymousClass1208 getPublishPreviewService() {
        if (this.publishPreviewService == null) {
            this.publishPreviewService = new C120G();
        }
        return this.publishPreviewService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC1439690nZH getPublishService() {
        if (this.publishService == null) {
            this.publishService = new InterfaceC1439690nZH() { // from class: X.0njI
                @Override // X.InterfaceC1439690nZH
                public final void LIZ() {
                }

                @Override // X.InterfaceC1439690nZH
                public final List<InterfaceC1413210msZ> LIZJ() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(((IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class)).LIZJ());
                    ICommercializeFromMainOutService iCommercializeFromMainOutService = (ICommercializeFromMainOutService) PluggableExtentionKt.pluggableSpi(ICommercializeFromMainOutService.class);
                    if (iCommercializeFromMainOutService != null) {
                        arrayList.add(iCommercializeFromMainOutService.LJIIJJI());
                    }
                    arrayList.add(((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJII());
                    return arrayList;
                }

                @Override // X.InterfaceC1439690nZH
                public final int LJIIIZ() {
                    return C1479130oat.LJII();
                }

                @Override // X.InterfaceC1439690nZH
                public final boolean LIZIZ(C19EG c19eg, PublishModel publishModel) {
                    ToolsMainActivityAbility toolsMainActivityAbility = (ToolsMainActivityAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), ToolsMainActivityAbility.class, null);
                    if (toolsMainActivityAbility != null) {
                        return toolsMainActivityAbility.Mv2(publishModel);
                    }
                    return false;
                }

                @Override // X.InterfaceC1439690nZH
                public final void LJ(AbstractC1387200mCc abstractC1387200mCc, String str) {
                    if (abstractC1387200mCc != null && (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0)) {
                        C201955140j.LIZ("PublishService bindProgressHost direct bind");
                        new MainActivityCallback(abstractC1387200mCc, str);
                    } else {
                        C201955140j.LIZ("PublishService bindProgressHost post retry event");
                        C1440005kM.LIZIZ(new C7823033t(str));
                    }
                }

                @Override // X.InterfaceC1439690nZH
                public final MainActivityCallback LJFF(PublishModel publishModel, String str) {
                    return new MainActivityCallback(publishModel);
                }

                @Override // X.InterfaceC1439690nZH
                public final void LJII(C19EG c19eg, BaseShortVideoContext baseShortVideoContext) {
                    C0CHQ.LIZ().getPublishService().LJII(c19eg, baseShortVideoContext);
                }

                @Override // X.InterfaceC1439690nZH
                public final void LJIIIIZZ(boolean z, boolean z2) {
                    C1440005kM.LIZ(new C1445930njL(z, z2));
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
                @Override // X.InterfaceC1439690nZH
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.util.List<X.C0WIY<java.lang.Class<?>, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> LIZLLL(com.ss.android.ugc.aweme.services.publish.AVPublishContentType r5, boolean r6, java.lang.String r7) {
                    /*
                        r4 = this;
                        X.0njK r0 = new java.lang.Object() { // from class: X.0njK
                            static {
                                /*
                                    X.0njK r0 = new X.0njK
                                    r0.<init>()
                                    
                                    // error: 0x0005: SPUT (r0 I:X.0njK) X.0njK.LIZ X.0njK
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1445920njK.<clinit>():void");
                            }

                            {
                                /*
                                    r0 = this;
                                    r0.<init>()
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1445920njK.<init>():void");
                            }
                        }
                        r0.getClass()
                        if (r7 != 0) goto L9
                        java.lang.String r7 = ""
                    L9:
                        X.0nif r0 = new java.lang.Object() { // from class: X.0nif
                            static {
                                /*
                                    X.0nif r0 = new X.0nif
                                    r0.<init>()
                                    
                                    // error: 0x0005: SPUT (r0 I:X.0nif) X.0nif.LIZ X.0nif
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1445510nif.<clinit>():void");
                            }

                            {
                                /*
                                    r0 = this;
                                    r0.<init>()
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1445510nif.<init>():void");
                            }
                        }
                        r0.getClass()
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r3.<init>()
                        int[] r1 = X.C1445470nib.LIZ
                        int r0 = r5.ordinal()
                        r1 = r1[r0]
                        r2 = 1
                        if (r1 == r2) goto L3b
                        r0 = 2
                        if (r1 == r0) goto L3b
                        java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "unknown type: "
                        r1.append(r0)
                        java.lang.String r0 = r5.getContentType()
                        r1.append(r0)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                        r2.<init>(r0)
                        throw r2
                    L3b:
                        boolean r0 = X.C304920BxK.LIZ()
                        if (r0 == 0) goto L57
                        if (r6 == 0) goto L57
                        X.0lha r0 = X.C1367960lha.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.poi_api.service.IPoiService r1 = X.C1367960lha.LIZ()
                        com.ss.android.ugc.aweme.services.publish.AVPublishPageScene r0 = com.ss.android.ugc.aweme.services.publish.AVPublishPageScene.MAIN
                        X.0WIY r0 = r1.LJJJJLI(r0, r7)
                        if (r0 == 0) goto L57
                        r3.add(r0)
                    L57:
                        boolean r0 = X.C304920BxK.LIZ()
                        if (r0 != 0) goto L70
                        com.ss.android.ugc.aweme.base.AnchorListManager r0 = com.ss.android.ugc.aweme.base.AnchorListManager.LIZ
                        r0.getClass()
                        java.util.Map r0 = com.ss.android.ugc.aweme.base.AnchorListManager.LJII()
                        if (r0 == 0) goto L7f
                        boolean r0 = r0.isEmpty()
                        r0 = r0 ^ 1
                        if (r0 != r2) goto L7f
                    L70:
                        java.lang.Class<X.11Va> r2 = X.C19510811Va.class
                        X.11Va r1 = new X.11Va
                        r1.<init>()
                        X.0WIY r0 = new X.0WIY
                        r0.<init>(r2, r1)
                        r3.add(r0)
                    L7f:
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1445900njI.LIZLLL(com.ss.android.ugc.aweme.services.publish.AVPublishContentType, boolean, java.lang.String):java.util.List");
                }

                @Override // X.InterfaceC1439690nZH
                public final boolean LJI(C19EG c19eg, Intent intent, Boolean bool) {
                    Bundle extras;
                    String currentPublishTaskId;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PublishServiceImpl process publish intent:");
                    String stringExtra = null;
                    try {
                        extras = intent.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        extras = null;
                    }
                    sbLIZ.append(extras);
                    C2344809Gs.LIZLLL(4, "Tools-Client", C2188811AlT.LIZIZ(sbLIZ));
                    if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT")) {
                        C2344809Gs.LJ("processPublish. EXTRA_AWEME_DRAFT ");
                        return true;
                    }
                    if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_LIGHTENING_PUBLISH")) {
                        if (!intent.hasExtra("multi_publish_id")) {
                            return true;
                        }
                        try {
                            stringExtra = intent.getStringExtra("multi_publish_id");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        intent.removeExtra("multi_publish_id");
                        return new MainActivityCallback(new C1397950mTx(c19eg), bool, stringExtra).LLILZIL;
                    }
                    if (intent.hasExtra("multi_publish_id")) {
                        try {
                            stringExtra = intent.getStringExtra("multi_publish_id");
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                        intent.removeExtra("multi_publish_id");
                        return new MainActivityCallback(new C1397950mTx(c19eg), bool, stringExtra).LLILZIL;
                    }
                    IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
                    PublishModel publishModel = iAVPublishServicePublishService.getPublishModel(null);
                    if (publishModel == null || publishModel.publishType != 0 || !iAVPublishServicePublishService.isPublishing() || (currentPublishTaskId = iAVPublishServicePublishService.getCurrentPublishTaskId()) == null) {
                        return false;
                    }
                    return new MainActivityCallback(new C1397950mTx(c19eg), bool, currentPublishTaskId).LLILZIL;
                }

                @Override // X.InterfaceC1439690nZH
                public final boolean LJIIJ(AbstractC1387200mCc abstractC1387200mCc, String str, Boolean bool) {
                    return new MainActivityCallback(abstractC1387200mCc, bool, str).LLILZIL;
                }
            };
        }
        return this.publishService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC1420020n3Y getRegionService() {
        if (this.regionService == null) {
            this.regionService = new C20186013yc();
        }
        return this.regionService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC1447080nlC getShareService() {
        if (this.shareService == null) {
            this.shareService = new InterfaceC1447080nlC() { // from class: X.1Dsa
            };
        }
        return this.shareService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC855410Xh5 getSpService() {
        if (this.sharePrefService == null) {
            this.sharePrefService = new InterfaceC855410Xh5() { // from class: X.1DsZ
            };
        }
        return this.sharePrefService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC566960MLm getStoryService() {
        if (this.storyService == null) {
            this.storyService = new InterfaceC566960MLm() { // from class: X.0sDb
                public final C1618470sDd LIZ = new C1618470sDd();

                @Override // X.InterfaceC566960MLm
                public final ForwardVideoPlayerCacheProvider LIZIZ() {
                    return ((IStoryService) this.LIZ.get()).LJIJJLI().LIZIZ();
                }

                @Override // X.InterfaceC566960MLm
                public final ForwardMediaDownloader LIZJ() {
                    return ((IStoryService) this.LIZ.get()).LJIJJLI().LIZJ();
                }

                @Override // X.InterfaceC566960MLm
                public final ForwardImageDownloader LJFF() {
                    return ((IStoryService) this.LIZ.get()).LJIJJLI().LJFF();
                }

                @Override // X.InterfaceC566960MLm
                public final boolean LJIIIZ() {
                    return !((Boolean) C0C3Z.LIZIZ.getValue()).booleanValue();
                }

                @Override // X.InterfaceC566960MLm
                public final boolean LIZ() {
                    return C1601110rld.LIZ();
                }

                @Override // X.InterfaceC566960MLm
                public final boolean LJI() {
                    return C1601110rld.LIZ();
                }

                @Override // X.InterfaceC566960MLm
                public final void LJ(String str) {
                    C1618440sDa.LIZIZ.LJJIFFI().LJIILIIL(str);
                }

                @Override // X.InterfaceC566960MLm
                public final void LJII(String str) {
                    C1618440sDa.LIZIZ.LJJIFFI().LJI(str, true);
                }

                @Override // X.InterfaceC566960MLm
                public final void LJIIIIZZ(String str) {
                    C1618440sDa.LIZIZ.LJJIIZI().sendViewedMemorableView(str);
                }

                @Override // X.InterfaceC566960MLm
                public final void LIZLLL(Context context, String str, String str2) {
                    ((IStoryService) this.LIZ.get()).LJIJJLI().LJIL(new C20271514Tp(context, null, "", "", "create_tab", null, 2, -1, null, false, "", "", false, false, str, str2, "create_tab", null, 524288), "eoy");
                }
            };
        }
        return this.storyService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC855700XhY getSyncShareService() {
        if (this.syncShareService == null) {
            this.syncShareService = C621180OYa.LIZ.LJIJ();
        }
        return this.syncShareService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC1213410hgJ getUiService() {
        if (this.uiService == null) {
            this.uiService = new InterfaceC1213410hgJ() { // from class: X.1Dsb
            };
        }
        return this.uiService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC1402500mbI getWikiService() {
        if (this.wikiService == null) {
            this.wikiService = new C19512611Vs();
        }
        return this.wikiService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC1624140sMm unlockStickerService() {
        if (this.unlockStickerService == null) {
            this.unlockStickerService = new InterfaceC1624140sMm() { // from class: X.1Dsf
            };
        }
        return this.unlockStickerService;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean needLiveInRecordInner() {
        /*
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            boolean r0 = r0.isLogin()
            r5 = 0
            if (r0 == 0) goto L54
            java.lang.String r4 = "x86"
            java.lang.String r3 = "armeabi"
            java.lang.String r2 = "arm64"
            java.lang.String[] r1 = android.os.Build.SUPPORTED_ABIS     // Catch: java.lang.Exception -> L44
            int r0 = r1.length     // Catch: java.lang.Exception -> L44
            if (r0 <= 0) goto L32
            r0 = r1[r5]     // Catch: java.lang.Exception -> L44
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L44
            if (r0 != 0) goto L32
            r1 = r1[r5]     // Catch: java.lang.Exception -> L44
        L21:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L44
            if (r0 != 0) goto L48
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Exception -> L44
            boolean r0 = r1.startsWith(r4)     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L35
            goto L4c
        L32:
            java.lang.String r1 = android.os.Build.CPU_ABI     // Catch: java.lang.Exception -> L44
            goto L21
        L35:
            boolean r0 = r1.startsWith(r2)     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L3d
            r3 = r2
            goto L4d
        L3d:
            boolean r0 = r1.startsWith(r3)     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L48
            goto L4d
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L48:
            java.lang.String r3 = "unknown"
            goto L4d
        L4c:
            r3 = r4
        L4d:
            boolean r0 = r3.contains(r4)
            if (r0 != 0) goto L54
            r5 = 1
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.needLiveInRecordInner():boolean");
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC566530MJv getChallengeService() {
        return getChallengeServiceInternal();
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public InterfaceC194468116k getDmtChallengeService() {
        return getChallengeServiceInternal();
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public IMusicService getMusicService() {
        return (IMusicService) ServiceManager.get().getService(IMusicService.class);
    }

    public static AVAweme lambda$getAVConverter$0(CreateBaseAwemeResponse createBaseAwemeResponse) {
        CaptionStruct captionStruct = null;
        if (createBaseAwemeResponse instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) createBaseAwemeResponse;
            if (createAwemeResponse.aweme != null) {
                AVAweme aVAweme = new AVAweme();
                aVAweme.aid = createAwemeResponse.aweme.getAid();
                Aweme aweme = createAwemeResponse.aweme;
                C20703515zt c20703515zt = C20703515zt.LIZ;
                if (aweme != null && aweme.getInteractStickerStructs() != null && (!aweme.getInteractStickerStructs().isEmpty())) {
                    Iterator<InteractStickerStruct> it2 = aweme.getInteractStickerStructs().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InteractStickerStruct next = it2.next();
                        if (next.getCaptionStruct() != null) {
                            captionStruct = next.getCaptionStruct();
                            break;
                        }
                    }
                }
                aVAweme.captionStruct = captionStruct;
                return aVAweme;
            }
        }
        return null;
    }

    public static void onReturnThirdPlatformFailedInner(Activity activity, C1402840mbq c1402840mbq, C1B4F c1b4f) {
        if (activity != null || (activity = C2214201BlK.LJFF()) != null) {
            ((IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class)).LIZIZ(activity, c1402840mbq, c1b4f);
        }
    }
}
