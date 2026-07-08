package com.ss.android.ugc.aweme.wavepublish.dm.service;

import X.AbstractC1433570nPP;
import X.C00CN;
import X.C01GW;
import X.C098200Yq;
import X.C0CHQ;
import X.C13LP;
import X.C1433230nOr;
import X.C1434500nQu;
import X.C1435130nRv;
import X.C1436170nTb;
import X.C1462550oA9;
import X.C189200o6;
import X.C1AF0;
import X.C20021913Vp;
import X.C452501pT;
import X.C538310L9h;
import X.InterfaceC1452170ntP;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService;
import com.ss.android.ugc.aweme.services.dm.DMPath;
import com.ss.android.ugc.aweme.services.dm.ICreativePathServiceProxy;
import com.ss.android.ugc.aweme.services.dm.IDMPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class DMPublishServiceImpl implements IDMPublishService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(195));

    public final ICreativeSocialBridgeService LIZ() {
        return (ICreativeSocialBridgeService) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final ICreativePathServiceProxy creativePathServiceProxy() {
        return new ICreativePathServiceProxy() { // from class: X.0nXA
            @Override // com.ss.android.ugc.aweme.services.dm.ICreativePathServiceProxy
            public final String getCacheRoot() {
                return new C20022113Vr().LJ;
            }

            @Override // com.ss.android.ugc.aweme.services.dm.ICreativePathServiceProxy
            public final String getCreativeRoot() {
                return new C20022113Vr().LIZIZ;
            }

            @Override // com.ss.android.ugc.aweme.services.dm.ICreativePathServiceProxy
            public final String getPersistentRoot() {
                return new C20022113Vr().LIZLLL;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final File getCreativeToolsRootDir() {
        return C20021913Vp.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getCurrentUid() {
        return C0CHQ.LIZ().getAccountService().getCurrentUserID();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final void setUploadConfigDir() {
        C1462550oA9.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String generateMetadataString(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        String strLJIL;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        } else {
            videoPublishEditModel = null;
        }
        String str = "";
        if (videoPublishEditModel == null) {
            return "";
        }
        ICreativeSocialBridgeService iCreativeSocialBridgeServiceLIZ = LIZ();
        if (iCreativeSocialBridgeServiceLIZ != null && (strLJIL = iCreativeSocialBridgeServiceLIZ.LJIL(videoPublishEditModel, null)) != null) {
            str = strLJIL;
        }
        videoPublishEditModel.setMetadataMap(null);
        return str;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final BaseHeaderComponent getBaseHeaderComponent(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (dMCameraModel = creativeInitialModel.dmCameraModel) == null) {
            return null;
        }
        return dMCameraModel.baseHeaderComponent;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final Map<String, String> getDMOpenCameraOrAlbumMobMap(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (dMCameraModel = creativeInitialModel.dmCameraModel) == null) {
            return null;
        }
        return dMCameraModel.openCameraOrAlbumMobMap;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getEffectHandlerType(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        String str;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (dMCameraModel = creativeInitialModel.dmCameraModel) == null || (str = dMCameraModel.effectHandlerType) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getEffectHandlerTypeActive(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        String str;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (dMCameraModel = creativeInitialModel.dmCameraModel) == null || (str = dMCameraModel.effectHandlerTypeActive) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getEffectIconUrl(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        String str;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (dMCameraModel = creativeInitialModel.dmCameraModel) == null || (str = dMCameraModel.effectIconUrl) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getEffectId(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModelKt videoPublishEditModelKt;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext) == null) {
            return null;
        }
        return videoPublishEditModelKt.getStickerID();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getEffectName(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        String str;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (dMCameraModel = creativeInitialModel.dmCameraModel) == null || (str = dMCameraModel.effectName) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getEnterDM(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (dMCameraModel = creativeInitialModel.dmCameraModel) == null) {
            return null;
        }
        return dMCameraModel.enterDM;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getEnterFrom(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModelKt videoPublishEditModelKt;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext) == null) {
            return null;
        }
        return videoPublishEditModelKt.getEnterFrom();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getEnterMethodType(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (dMCameraModel = creativeInitialModel.dmCameraModel) == null) {
            return null;
        }
        return dMCameraModel.enterMethodType;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final FeatureAttachmentData getFeatureAttachmentData(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (dMCameraModel = creativeInitialModel.dmCameraModel) == null) {
            return null;
        }
        return dMCameraModel.featureAttachmentData;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getIMCameraVideoPath(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModelKt videoPublishEditModelKt;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext) == null) {
            return null;
        }
        return videoPublishEditModelKt.getOutputFile();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final boolean getIsStoryImmersiveReply(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (creativeInitialModel = creativeModel.initialModel) != null && (dMCameraModel = creativeInitialModel.dmCameraModel) != null) {
            return dMCameraModel.isStoryQuickImmersiveReply;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final Integer getMediaType(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        DMMediaModel dMMediaModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (dMMediaModel = creativeModel.dmMediaModel) == null) {
            return null;
        }
        return Integer.valueOf(dMMediaModel.type);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final QuoteMode getQuoteMode(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        QuoteMode quoteMode;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (dMCameraModel = creativeInitialModel.dmCameraModel) == null || (quoteMode = dMCameraModel.quoteMode) == null) {
            return QuoteMode.None.INSTANCE;
        }
        return quoteMode;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getVideoPath(BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (previewInfo = videoPublishEditModel.getPreviewInfo()) == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(videoList)) == null) {
            return null;
        }
        return editVideoSegment.getVideoPath();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String publishDMMedia(PublishModel publishModel) {
        ICreativeSocialBridgeService iCreativeSocialBridgeServiceLIZ = LIZ();
        if (iCreativeSocialBridgeServiceLIZ != null) {
            String strLJJIJIIJIL = iCreativeSocialBridgeServiceLIZ.LJJIJIIJIL(publishModel);
            ICreativeSocialBridgeService iCreativeSocialBridgeServiceLIZ2 = LIZ();
            if (iCreativeSocialBridgeServiceLIZ2 != null) {
                iCreativeSocialBridgeServiceLIZ2.LIZ();
                return strLJJIJIIJIL;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final void storeUploadParams(TreeMap<String, Object> treeMap) {
        Integer num;
        long jIntValue;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Boolean bool;
        Boolean bool2;
        Integer num2;
        Object obj = treeMap.get("durationMs");
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        long jIntValue2 = -1;
        if (num != null) {
            jIntValue = num.intValue();
        } else {
            jIntValue = -1;
        }
        Object obj2 = treeMap.get("bitrateKb");
        if ((obj2 instanceof Integer) && (num2 = (Integer) obj2) != null) {
            jIntValue2 = num2.intValue();
        }
        Object obj3 = treeMap.get("isHwEncode");
        if ((obj3 instanceof Boolean) && (bool2 = (Boolean) obj3) != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Object obj4 = treeMap.get("isReEncode");
        if ((obj4 instanceof Boolean) && (bool = (Boolean) obj4) != null) {
            zBooleanValue2 = bool.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        C1434500nQu.LIZIZ(new C1436170nTb(jIntValue, jIntValue2, zBooleanValue, zBooleanValue2, 16));
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final void addPublishCallback(String str, AbstractC1433570nPP abstractC1433570nPP) {
        ICreativeSocialBridgeService iCreativeSocialBridgeServiceLIZ = LIZ();
        if (iCreativeSocialBridgeServiceLIZ != null) {
            iCreativeSocialBridgeServiceLIZ.LJIIIIZZ(str, abstractC1433570nPP);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final void cancelPublish(String str, String str2) {
        ICreativeSocialBridgeService iCreativeSocialBridgeServiceLIZ = LIZ();
        if (iCreativeSocialBridgeServiceLIZ != null) {
            if (iCreativeSocialBridgeServiceLIZ.LJJIIJ(str)) {
                ICreativeSocialBridgeService iCreativeSocialBridgeServiceLIZ2 = LIZ();
                if (iCreativeSocialBridgeServiceLIZ2 != null) {
                    iCreativeSocialBridgeServiceLIZ2.LIZLLL(new C1433230nOr("DM cancel prepublish", null, 6), str);
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final void removePublishCallback(String str, AbstractC1433570nPP abstractC1433570nPP) {
        ICreativeSocialBridgeService iCreativeSocialBridgeServiceLIZ = LIZ();
        if (iCreativeSocialBridgeServiceLIZ != null) {
            iCreativeSocialBridgeServiceLIZ.LJJIJ(str, abstractC1433570nPP);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String isAllowSkip(BaseShortVideoContext baseShortVideoContext, InterfaceC1452170ntP interfaceC1452170ntP, String str) {
        Object c098200Yq;
        VideoPublishEditModel videoPublishEditModel;
        ICreativeSocialBridgeService iCreativeSocialBridgeServiceLIZ;
        String str2 = str;
        if (interfaceC1452170ntP != null) {
            try {
                interfaceC1452170ntP.isUseFilterProcess();
                try {
                    if (baseShortVideoContext instanceof VideoPublishEditModel) {
                        videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
                    } else {
                        videoPublishEditModel = null;
                    }
                    if (videoPublishEditModel != null && (iCreativeSocialBridgeServiceLIZ = LIZ()) != null) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        c098200Yq = iCreativeSocialBridgeServiceLIZ.LJJI(videoPublishEditModel, interfaceC1452170ntP, str2, C1435130nRv.LIZIZ, false, false, false);
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C1AF0.LJ(thM5exceptionOrNullimpl);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                VEVideoEncodeSettings vEVideoEncodeSettings = (VEVideoEncodeSettings) c098200Yq;
                if (vEVideoEncodeSettings == null) {
                    return "get_ve_encode_settings_failed";
                }
                int iKf = interfaceC1452170ntP.kf(vEVideoEncodeSettings);
                if (iKf != 0) {
                    return "ve_judge_" + Math.abs(iKf);
                }
            } catch (VEException e) {
                TryCatchGuardChecker.doCheck(e);
                return "ve_init_failed";
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final Pair<Boolean, BaseShortVideoContext> createPhotoPublishEditModel(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        int i2;
        String str3;
        String imageSynthesiseOutputPath = str2;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        CreativeModel creativeModel = new CreativeModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 2097151, null);
        if (i == C00CN.VIDEO_STICKER.getScene()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        String str4 = "";
        if (z3) {
            str3 = "";
            str4 = imageSynthesiseOutputPath;
        } else {
            str3 = imageSynthesiseOutputPath;
        }
        creativeModel.dmMediaModel = new DMMediaModel(i2, str3, str4, "", z3, false, z4, null);
        videoPublishEditModel.creativeModel = creativeModel;
        videoPublishEditModel.refreshOldFieldIfNeeded();
        videoPublishEditModel.setCreativeInfo(new CreativeInfo(str, 0, null, 6, null));
        videoPublishEditModel.setOrigin(0);
        videoPublishEditModel.mShootWay = "chat_shoot";
        videoPublishEditModel.setPreviewInfo(new EditPreviewInfo(new ArrayList(), 0, 0, 0L, 0L, "", 30, null));
        if (!z) {
            imageSynthesiseOutputPath = new DMPath(videoPublishEditModel.getCreativeInfo().getCreationId()).getImageSynthesiseOutputPath();
        }
        videoPublishEditModel.setOutputFile(imageSynthesiseOutputPath);
        videoPublishEditModel.setUploadScene(i);
        videoPublishEditModel.setEncryptType(z2 ? 1 : 0);
        return new Pair<>(Boolean.TRUE, videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final Pair<Boolean, BaseShortVideoContext> createVideoPublishEditModel(String str, String str2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str3) {
        String str4;
        String videoSynthesiseOutputPath = str2;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        CreativeModel creativeModel = new CreativeModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 2097151, null);
        String str5 = "";
        if (!z) {
            str4 = "";
        } else {
            str4 = videoSynthesiseOutputPath;
        }
        if (str3 != null) {
            str5 = str3;
        }
        creativeModel.dmMediaModel = new DMMediaModel(1, "", str4, str5, z, z3, z2, null);
        videoPublishEditModel.creativeModel = creativeModel;
        videoPublishEditModel.refreshOldFieldIfNeeded();
        videoPublishEditModel.setCreativeInfo(new CreativeInfo(str, 0, null, 6, null));
        videoPublishEditModel.setOrigin(0);
        videoPublishEditModel.mShootWay = "chat_shoot";
        videoPublishEditModel.setFastImport(true);
        videoPublishEditModel.setFromCut(true);
        videoPublishEditModel.setVoiceVolume(1.0f);
        videoPublishEditModel.setMultiEditVideoRecordData(new MultiEditVideoStatusRecordData());
        videoPublishEditModel.setPreviewInfo(new C538310L9h(C0CHQ.LIZ().LJJIIZ().getVideoWidth(), C0CHQ.LIZ().LJJIIZ().getVideoHeight(), 28).LIZ(Collections.singletonList(new EditVideoSegment(videoSynthesiseOutputPath, null, new VideoFileInfo(i, i2, j, i3, i4, i5, i6, 0, 0.0f, 384, null)))));
        DMPath dMPath = new DMPath(videoPublishEditModel.getCreativeInfo().getCreationId());
        if (!z) {
            videoSynthesiseOutputPath = dMPath.getVideoSynthesiseOutputPath();
        }
        videoPublishEditModel.setOutputFile(videoSynthesiseOutputPath);
        videoPublishEditModel.setParallelUploadOutputFile(dMPath.getParallelUploadOutputPath());
        return new Pair<>(Boolean.TRUE, videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final Pair<Boolean, BaseShortVideoContext> createVideoPublishEditModel(String str, String str2, String[] strArr, String[] strArr2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str3, boolean z4) {
        String str4;
        String videoSynthesiseOutputPath = str2;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.setCreativeInfo(new CreativeInfo(str, 0, null, 6, null));
        CreativeModel creativeModel = new CreativeModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 2097151, null);
        String strLJJJJLL = "";
        if (!z) {
            str4 = "";
        } else {
            str4 = videoSynthesiseOutputPath;
        }
        if (z4) {
            strLJJJJLL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJLL(creativeModel.creativeInfo);
        } else if (str3 != null) {
            strLJJJJLL = str3;
        }
        creativeModel.dmMediaModel = new DMMediaModel(3, "", str4, strLJJJJLL, z, z3, z2, null);
        videoPublishEditModel.creativeModel = creativeModel;
        videoPublishEditModel.refreshOldFieldIfNeeded();
        videoPublishEditModel.setOrigin(0);
        videoPublishEditModel.mShootWay = "chat_shoot";
        videoPublishEditModel.setFastImport(true);
        videoPublishEditModel.setFromCut(true);
        videoPublishEditModel.setVoiceVolume(1.0f);
        videoPublishEditModel.setMultiEditVideoRecordData(new MultiEditVideoStatusRecordData());
        ArrayList arrayList = new ArrayList();
        for (String str5 : strArr) {
            arrayList.add(new EditVideoSegment(str5, null, new VideoFileInfo(i, i2, j, i3, i4, i5, i6, 0, 0.0f, 384, null)));
        }
        videoPublishEditModel.setPreviewInfo(new C538310L9h(C0CHQ.LIZ().LJJIIZ().getVideoWidth(), C0CHQ.LIZ().LJJIIZ().getVideoHeight(), 28).LIZ(arrayList));
        DMPath dMPath = new DMPath(videoPublishEditModel.getCreativeInfo().getCreationId());
        if (!z) {
            videoSynthesiseOutputPath = dMPath.getVideoSynthesiseOutputPath();
        }
        videoPublishEditModel.setOutputFile(videoSynthesiseOutputPath);
        videoPublishEditModel.setParallelUploadOutputFile(dMPath.getParallelUploadOutputPath());
        return new Pair<>(Boolean.TRUE, videoPublishEditModel);
    }
}
