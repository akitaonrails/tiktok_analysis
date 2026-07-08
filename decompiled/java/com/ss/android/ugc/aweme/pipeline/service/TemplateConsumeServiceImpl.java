package com.ss.android.ugc.aweme.pipeline.service;

import X.C0ADF;
import X.C0ADQ;
import X.C0E4S;
import X.C0L00;
import X.C0L1W;
import X.C1394440mOI;
import X.C1412390mrF;
import X.C1412660mrg;
import X.C1416310mxZ;
import X.C1443560nfW;
import X.C14D2;
import X.C1734980vFY;
import X.C19EG;
import X.C258900ACq;
import X.C259060ADg;
import X.C531990Kth;
import X.C532130Ktv;
import X.C532520KuY;
import X.C539530LDz;
import X.C573700Mem;
import X.EnumC1394470mOL;
import X.EnumC1412640mre;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.TemplateAnchorData;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.aweme.template.anchor.ITemplateAnchorService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateConsumeServiceImpl implements ITemplateConsumeService {
    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService
    public final boolean LIZIZ() {
        return C0L00.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService
    public final C1734980vFY LIZLLL(C19EG c19eg) {
        return new C1734980vFY(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService
    public final boolean LIZ(Activity activity, UgcTemplateAlbumConfig ugcTemplateAlbumConfig) {
        int i;
        EnumC1412640mre enumC1412640mreLJIIIIZZ;
        String templateId;
        String str;
        Integer numValueOf;
        EnumC1412640mre enumC1412640mreLIZJ;
        AutoSelectedAnchorInfos autoSelectedAnchorInfos;
        EnumC1394470mOL enumC1394470mOLLJ;
        if (Intrinsics.LJFF(ugcTemplateAlbumConfig.getShootWay(), "mdp_square")) {
            i = 4;
        } else {
            i = 3;
        }
        AnchorCommonStruct anchor = ugcTemplateAlbumConfig.getAnchor();
        String strLIZIZ = null;
        if (anchor != null && (enumC1394470mOLLJ = C1394440mOI.LJ(anchor)) != null) {
            enumC1412640mreLJIIIIZZ = C1394440mOI.LJIIIIZZ(enumC1394470mOLLJ);
        } else {
            enumC1412640mreLJIIIIZZ = null;
        }
        if (!LJFF(i, enumC1412640mreLJIIIIZZ, null, ugcTemplateAlbumConfig.getShootWay()) || (templateId = ugcTemplateAlbumConfig.getTemplateId()) == null) {
            return false;
        }
        C573700Mem.LIZ.getClass();
        ITemplateAnchorService iTemplateAnchorService = (ITemplateAnchorService) PluggableExtentionKt.pluggableSpi$default(ITemplateAnchorService.class, false, false, false, 14, null);
        if (iTemplateAnchorService != null) {
            String strLJJLIIIJJI = C1416310mxZ.LJJLIIIJJI(ugcTemplateAlbumConfig.getAnchor());
            if (strLJJLIIIJJI != null) {
                str = new C1412390mrF(strLJJLIIIJJI).LIZ;
            } else {
                str = null;
            }
            String strLIZ = iTemplateAnchorService.LIZ(str, ugcTemplateAlbumConfig.getShootWay());
            if (strLIZ != null) {
                C1412390mrF c1412390mrF = new C1412390mrF(strLIZ);
                ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
                shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(ugcTemplateAlbumConfig.getCreativeInfo());
                shortVideoContext.creativeInfo = ugcTemplateAlbumConfig.getCreativeInfo();
                shortVideoContext.LJ().setCreationId(ugcTemplateAlbumConfig.getCreativeInfo().getCreationId());
                shortVideoContext.creativeModel.socialModel.relationEnterMethod = ugcTemplateAlbumConfig.getRelationEnterMethod();
                shortVideoContext.shootWay = ugcTemplateAlbumConfig.getShootWay();
                shortVideoContext.enterFrom = ugcTemplateAlbumConfig.getEnterFrom();
                String enterMethod = ugcTemplateAlbumConfig.getEnterMethod();
                if (enterMethod == null) {
                    enterMethod = "";
                }
                shortVideoContext.enterMethod = enterMethod;
                shortVideoContext.ugcTemplateTag = ugcTemplateAlbumConfig.getUgcTemplateTag();
                shortVideoContext.creativeModel.ugcTemplateData.ugcTemplateTag = ugcTemplateAlbumConfig.getUgcTemplateTag();
                shortVideoContext.creativeModel.ugcTemplateData.isFromEPTemplateAnchor = ugcTemplateAlbumConfig.getEpTemplateInfo().isEPTemplate();
                shortVideoContext.creativeModel.ugcTemplateData.anchorTemplateUsedFunctions = ugcTemplateAlbumConfig.getEpTemplateInfo().usedFunctions;
                shortVideoContext.creativeModel.followUpPublishTrackerModel.followedMainAnchorType = ugcTemplateAlbumConfig.getMainAnchorType();
                shortVideoContext.creativeModel.followUpPublishTrackerModel.followedTemplateType = ugcTemplateAlbumConfig.getTtTemplateType();
                MDPRecommendTemplateInfo mdpRecommendTemplateInfo = ugcTemplateAlbumConfig.getMdpRecommendTemplateInfo();
                if (mdpRecommendTemplateInfo != null) {
                    shortVideoContext.creativeModel.ugcTemplateData.mdpRecommendTemplateInfo = mdpRecommendTemplateInfo;
                }
                String openPlatformExtra = ugcTemplateAlbumConfig.getOpenPlatformExtra();
                if (openPlatformExtra != null && (autoSelectedAnchorInfos = shortVideoContext.creativeFlowData.getAutoSelectedAnchorInfos()) != null) {
                    autoSelectedAnchorInfos.setOpenPlatFormExtra(openPlatformExtra);
                }
                AnchorCommonStruct anchor2 = ugcTemplateAlbumConfig.getAnchor();
                if (c1412390mrF.LIZIZ()) {
                    TemplateAnchorData templateAnchorData = shortVideoContext.creativeModel.templateAnchorData;
                    templateAnchorData.isFollowPublishFromAnchor = true;
                    templateAnchorData.followedTemplateDispatchType = C1416310mxZ.LJJLIIIJJI(anchor2);
                    EnumC1412640mre enumC1412640mreLJ = C1412660mrg.LJ(C1412660mrg.LIZ(anchor2));
                    if (enumC1412640mreLJ != null && (numValueOf = Integer.valueOf(enumC1412640mreLJ.getValue())) != null && (enumC1412640mreLIZJ = C1412660mrg.LIZJ(numValueOf.intValue())) != null) {
                        strLIZIZ = C1412660mrg.LIZIZ(enumC1412640mreLIZJ);
                    }
                    templateAnchorData.ttTemplateType = strLIZIZ;
                    FollowUpPublishTrackerModel followUpPublishTrackerModel = shortVideoContext.creativeModel.followUpPublishTrackerModel;
                    followUpPublishTrackerModel.followUpFirstItemId = C1443560nfW.LJI;
                    followUpPublishTrackerModel.followUpItemIdGroups = C1443560nfW.LJII;
                    followUpPublishTrackerModel.enterRecordFromFeed = true;
                    followUpPublishTrackerModel.followUpPromoId = C1443560nfW.LJIIJJI;
                }
                shortVideoContext.creativeModel.ugcTemplateData.awemeMusicInfo = ugcTemplateAlbumConfig.getAwemeMusicInfo();
                shortVideoContext.creativeModel.ugcTemplateData.templateMusicInfo = ugcTemplateAlbumConfig.getTemplateMusicInfo();
                shortVideoContext.creativeModel.ugcTemplateData.ugcTemplateOriginAnchor = ugcTemplateAlbumConfig.getAnchor();
                shortVideoContext.creativeModel.templateConsumeData.nleSummary = C539530LDz.LIZLLL(anchor2);
                C531990Kth.LIZIZ(activity, enumC1412640mreLJIIIIZZ, shortVideoContext, c1412390mrF, templateId);
                return true;
            }
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService
    public final boolean LJI(Activity activity, TemplateAnchorConfig templateAnchorConfig) {
        int i;
        String str;
        String strLIZIZ;
        Integer numValueOf;
        EnumC1412640mre enumC1412640mreLIZJ;
        if (Intrinsics.LJFF(templateAnchorConfig.getShootWay(), "mdp_square")) {
            i = 4;
        } else {
            i = 3;
        }
        EnumC1412640mre enumC1412640mreLIZJ2 = C1412660mrg.LIZJ(templateAnchorConfig.getTemplateType());
        if (enumC1412640mreLIZJ2 == null || !LJFF(i, enumC1412640mreLIZJ2, templateAnchorConfig, null)) {
            return false;
        }
        C573700Mem.LIZ.getClass();
        ITemplateAnchorService iTemplateAnchorService = (ITemplateAnchorService) PluggableExtentionKt.pluggableSpi$default(ITemplateAnchorService.class, false, false, false, 14, null);
        if (iTemplateAnchorService != null) {
            String strLJJLIIIJJI = C1416310mxZ.LJJLIIIJJI(templateAnchorConfig.getAnchor());
            if (strLJJLIIIJJI != null) {
                str = new C1412390mrF(strLJJLIIIJJI).LIZ;
            } else {
                str = null;
            }
            String strLIZ = iTemplateAnchorService.LIZ(str, templateAnchorConfig.getShootWay());
            if (strLIZ != null) {
                C1412390mrF c1412390mrF = new C1412390mrF(strLIZ);
                ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
                CreativeInfo creativeInfo = templateAnchorConfig.getCreativeInfo();
                shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfo);
                shortVideoContext.creativeInfo = creativeInfo;
                shortVideoContext.LJ().setCreationId(creativeInfo.getCreationId());
                shortVideoContext.shootWay = templateAnchorConfig.getShootWay();
                shortVideoContext.enterFrom = templateAnchorConfig.getEnterFrom();
                shortVideoContext.enterMethod = templateAnchorConfig.getEnterMethod();
                shortVideoContext.creativeModel.followUpPublishTrackerModel.followedMainAnchorType = templateAnchorConfig.getMainAnchorType();
                shortVideoContext.creativeModel.followUpPublishTrackerModel.followedTemplateType = templateAnchorConfig.getFollowedTemplateType();
                shortVideoContext.creativeModel.eventData.shootEnterMethod = templateAnchorConfig.getEnterMethod();
                shortVideoContext.creativeModel.socialModel.relationEnterMethod = templateAnchorConfig.getRelationEnterMethod();
                if (templateAnchorConfig.getShootEnterFrom() != null && shortVideoContext.creativeFlowData.getShootExtraData() == null) {
                    shortVideoContext.creativeFlowData.setShootExtraData(new ShootExtraData(templateAnchorConfig.getShootEnterFrom(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null));
                }
                AnchorCommonStruct anchor = templateAnchorConfig.getAnchor();
                if (c1412390mrF.LIZIZ()) {
                    TemplateAnchorData templateAnchorData = shortVideoContext.creativeModel.templateAnchorData;
                    templateAnchorData.isFollowPublishFromAnchor = true;
                    templateAnchorData.followedTemplateDispatchType = C1416310mxZ.LJJLIIIJJI(anchor);
                    EnumC1412640mre enumC1412640mreLJ = C1412660mrg.LJ(C1412660mrg.LIZ(anchor));
                    if (enumC1412640mreLJ != null && (numValueOf = Integer.valueOf(enumC1412640mreLJ.getValue())) != null && (enumC1412640mreLIZJ = C1412660mrg.LIZJ(numValueOf.intValue())) != null) {
                        strLIZIZ = C1412660mrg.LIZIZ(enumC1412640mreLIZJ);
                    } else {
                        strLIZIZ = null;
                    }
                    templateAnchorData.ttTemplateType = strLIZIZ;
                }
                if (enumC1412640mreLIZJ2 == EnumC1412640mre.PUGC_TEMPLATE) {
                    String strLJI = C539530LDz.LJI(anchor);
                    if (strLJI != null) {
                        shortVideoContext.creativeModel.ugcTemplateData.templateTags = strLJI;
                    }
                    shortVideoContext.creativeModel.pugcTemplateData.aiTemplateFuncList = templateAnchorConfig.getAiTemplateFuncList();
                }
                MDPRecommendTemplateInfo mdpRecommendTemplateInfo = templateAnchorConfig.getMdpRecommendTemplateInfo();
                if (mdpRecommendTemplateInfo != null) {
                    shortVideoContext.creativeModel.ugcTemplateData.mdpRecommendTemplateInfo = mdpRecommendTemplateInfo;
                }
                shortVideoContext.creativeModel.ugcTemplateData.awemeMusicInfo = templateAnchorConfig.getAwemeMusicInfo();
                shortVideoContext.creativeModel.ugcTemplateData.templateMusicInfo = templateAnchorConfig.getTemplateMusicInfo();
                shortVideoContext.creativeModel.ugcTemplateData.ugcTemplateOriginAnchor = templateAnchorConfig.getAnchor();
                shortVideoContext.creativeModel.templateConsumeData.nleSummary = C539530LDz.LIZLLL(anchor);
                C531990Kth.LIZIZ(activity, enumC1412640mreLIZJ2, shortVideoContext, c1412390mrF, templateAnchorConfig.getTemplateId());
                return true;
            }
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService
    public final boolean LJFF(int i, EnumC1412640mre enumC1412640mre, TemplateAnchorConfig templateAnchorConfig, String str) {
        if (enumC1412640mre != EnumC1412640mre.UGC_TEMPLATE && enumC1412640mre != EnumC1412640mre.PUGC_TEMPLATE) {
            return false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || !C0L00.LIZ() || !((Boolean) C0ADF.LIZ.getValue()).booleanValue()) {
                        return false;
                    }
                    if (templateAnchorConfig != null) {
                        EnumC1412640mre enumC1412640mreLIZJ = C1412660mrg.LIZJ(templateAnchorConfig.getTemplateType());
                        if (enumC1412640mreLIZJ == null || enumC1412640mreLIZJ == EnumC1412640mre.CUT_SAME) {
                            return false;
                        }
                    } else if (str == null) {
                        return false;
                    }
                } else {
                    if (!C0L00.LIZ() || !((Boolean) C258900ACq.LIZ.getValue()).booleanValue()) {
                        return false;
                    }
                    if (templateAnchorConfig != null) {
                        EnumC1412640mre enumC1412640mreLIZJ2 = C1412660mrg.LIZJ(templateAnchorConfig.getTemplateType());
                        if (enumC1412640mreLIZJ2 == null || enumC1412640mreLIZJ2 == EnumC1412640mre.CUT_SAME) {
                            return false;
                        }
                    } else if (str == null) {
                        return false;
                    }
                }
            } else if (!C0L00.LIZ() || !((Boolean) C0ADQ.LIZ.getValue()).booleanValue() || enumC1412640mre == EnumC1412640mre.CUT_SAME) {
                return false;
            }
        } else if (!C0L00.LIZ() || !((Boolean) C259060ADg.LIZ.getValue()).booleanValue() || enumC1412640mre == EnumC1412640mre.CUT_SAME) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService
    public final Object LIZJ(String str, List<C0E4S> list, Intent intent, C532520KuY c532520KuY, InterfaceC1364105Vn<? super C0L1W> interfaceC1364105Vn) {
        return C532130Ktv.LIZ(str, list, intent, c532520KuY, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService
    public final void LJ(Activity activity, EnumC1412640mre enumC1412640mre, ShortVideoContext shortVideoContext, C1412390mrF c1412390mrF, String str) {
        if (enumC1412640mre == EnumC1412640mre.CUT_SAME) {
            return;
        }
        C531990Kth.LIZIZ(activity, enumC1412640mre, shortVideoContext, c1412390mrF, str);
    }
}
