package com.bytedance.android.livesdk.gift.assets;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.AssetBase;
import com.bytedance.android.livesdk.gift.model.DistributionStrategy;
import com.bytedance.android.livesdk.gift.model.LokiExtraContent;
import com.bytedance.android.livesdk.gift.model._AssetBase_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._AssetExtra_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._DistributionStrategy_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LokiExtraContent_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AssetsModel_ProtoDecoder implements C0IMD<AssetsModel> {
    public static AssetsModel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AssetsModel assetsModel = new AssetsModel();
        assetsModel.distributionStrategy = new ArrayList();
        assetsModel.videoResourceList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 26) {
                            switch (iLJI) {
                                case 4:
                                    assetsModel.resourceModel = _ResourceModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 5:
                                    assetsModel.describe = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 6:
                                    assetsModel.id = c1516680pZS.LJIIJJI();
                                    break;
                                case 7:
                                    assetsModel.resourceType = c1516680pZS.LJIIJ();
                                    break;
                                case 8:
                                    assetsModel.md5 = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    assetsModel.size = c1516680pZS.LJIIJJI();
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    assetsModel.lokiExtraContent = _LokiExtraContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    switch (iLJI) {
                                        case 28:
                                            assetsModel.resourceByteVC1Model = _ResourceModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 29:
                                            assetsModel.bytevc1Md5 = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        case 30:
                                            assetsModel.videoResourceList.add(_VideoResource_ProtoDecoder.LIZLLL(c1516680pZS));
                                            break;
                                        case 31:
                                            assetsModel.faceRecognitionArchiveMeta = _FaceRecognitionMeta_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 32:
                                            assetsModel.lynxUrlSettingsKey = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                            assetsModel.downgradeResourceType = c1516680pZS.LJIIJ();
                                            break;
                                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                            assetsModel.assetExtra = _AssetExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 35:
                                            assetsModel.stickerAssetVariant = c1516680pZS.LJIIJ();
                                            break;
                                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                            assetsModel.immediateDownload = C1516700pZU.LIZ(c1516680pZS);
                                            break;
                                        case 37:
                                            assetsModel.stickerAssetVariantReason = c1516680pZS.LJIIJ();
                                            break;
                                        case 38:
                                            assetsModel.forceUseImOrRespAsset = C1516700pZU.LIZ(c1516680pZS);
                                            break;
                                        case 39:
                                            assetsModel.distributionStrategy.add(_DistributionStrategy_ProtoDecoder.LIZLLL(c1516680pZS));
                                            break;
                                        default:
                                            C1516700pZU.LJ(c1516680pZS);
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            assetsModel.downloadType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        assetsModel.resourceUri = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    assetsModel.name = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return assetsModel;
            }
        }
    }

    public static void LJ(AssetsModel assetsModel) {
        ResourceModel resourceModel;
        AssetBase assetBase;
        ResourceModel resourceModel2 = assetsModel.resourceModel;
        if (resourceModel2 != null) {
            _ResourceModel_ProtoDecoder.LJ(resourceModel2);
        }
        LokiExtraContent lokiExtraContent = assetsModel.lokiExtraContent;
        if (lokiExtraContent != null && lokiExtraContent.requirements == null) {
            lokiExtraContent.requirements = new ArrayList();
        }
        ResourceModel resourceModel3 = assetsModel.resourceByteVC1Model;
        if (resourceModel3 != null) {
            _ResourceModel_ProtoDecoder.LJ(resourceModel3);
        }
        List<VideoResource> list = assetsModel.videoResourceList;
        if (list == null) {
            assetsModel.videoResourceList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (VideoResource videoResource : assetsModel.videoResourceList) {
                if (videoResource != null && (resourceModel = videoResource.videoUrl) != null) {
                    _ResourceModel_ProtoDecoder.LJ(resourceModel);
                }
            }
        }
        FaceRecognitionMeta faceRecognitionMeta = assetsModel.faceRecognitionArchiveMeta;
        if (faceRecognitionMeta != null && faceRecognitionMeta.requirements == null) {
            faceRecognitionMeta.requirements = new ArrayList();
        }
        List<DistributionStrategy> list2 = assetsModel.distributionStrategy;
        if (list2 == null) {
            assetsModel.distributionStrategy = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (DistributionStrategy distributionStrategy : assetsModel.distributionStrategy) {
            if (distributionStrategy != null && (assetBase = distributionStrategy.assetBase) != null) {
                _AssetBase_ProtoDecoder.LJ(assetBase);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AssetsModel assetsModel) {
        LJ(assetsModel);
    }

    @Override // X.C0IMD
    public final AssetsModel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AssetsModel assetsModel, List list) {
    }
}
