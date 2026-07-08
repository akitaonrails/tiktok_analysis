package com.bytedance.android.livesdk.gift.assets;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.gift.model.AssetExtra;
import com.bytedance.android.livesdk.gift.model.DistributionStrategy;
import com.bytedance.android.livesdk.gift.model.LokiExtraContent;
import com.bytedance.android.livesdk.gift.model._DistributionStrategy_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model._LokiExtraContent_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _AssetsModel_ProtoEncoder implements InterfaceC1132110fZB<AssetsModel> {
    public static int LIZLLL(AssetsModel assetsModel) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        if (assetsModel == null) {
            return 0;
        }
        int iLJIILL = C1142340fpg.LJIILL(1, assetsModel.name) + C1142340fpg.LJIILL(2, assetsModel.resourceUri) + _ResourceModel_ProtoEncoder.LJ(4, assetsModel.resourceModel) + C1142340fpg.LJIILL(5, assetsModel.describe) + C1142340fpg.LJIIL(6, assetsModel.id) + C1142340fpg.LJIIIZ(7, assetsModel.resourceType) + C1142340fpg.LJIILL(8, assetsModel.md5) + C1142340fpg.LJIIL(9, assetsModel.size);
        LokiExtraContent lokiExtraContent = assetsModel.lokiExtraContent;
        if (lokiExtraContent == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _LokiExtraContent_ProtoEncoder.LIZJ(lokiExtraContent);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(10);
        }
        int iLJIIIZ = iLJIILL + iLIZIZ + C1142340fpg.LJIIIZ(26, assetsModel.downloadType) + _ResourceModel_ProtoEncoder.LJ(28, assetsModel.resourceByteVC1Model) + C1142340fpg.LJIILL(29, assetsModel.bytevc1Md5);
        List<VideoResource> list = assetsModel.videoResourceList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < assetsModel.videoResourceList.size(); i++) {
                VideoResource videoResource = (VideoResource) ListProtector.get(assetsModel.videoResourceList, i);
                if (videoResource == null) {
                    iLIZIZ5 = 0;
                } else {
                    int iLIZIZ6 = _VideoResource_ProtoEncoder.LIZIZ(videoResource);
                    iLIZIZ5 = iLIZIZ6 + C1142350fph.LIZIZ(iLIZIZ6) + C1142350fph.LIZ(30);
                }
                iLJIIIZ += iLIZIZ5;
            }
        }
        FaceRecognitionMeta faceRecognitionMeta = assetsModel.faceRecognitionArchiveMeta;
        if (faceRecognitionMeta == null) {
            iLIZIZ2 = 0;
        } else {
            int iLIZJ2 = _FaceRecognitionMeta_ProtoEncoder.LIZJ(faceRecognitionMeta);
            iLIZIZ2 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(31);
        }
        int iLJIILL2 = iLJIIIZ + iLIZIZ2 + C1142340fpg.LJIILL(32, assetsModel.lynxUrlSettingsKey) + C1142340fpg.LJIIIZ(33, assetsModel.downgradeResourceType);
        AssetExtra assetExtra = assetsModel.assetExtra;
        if (assetExtra == null) {
            iLIZIZ3 = 0;
        } else {
            int iLJIILL3 = C1142340fpg.LJIILL(1, assetExtra.effectStarlingKey);
            iLIZIZ3 = iLJIILL3 + C1142350fph.LIZIZ(iLJIILL3) + C1142350fph.LIZ(34);
        }
        int iLJIIIZ2 = iLJIILL2 + iLIZIZ3 + C1142340fpg.LJIIIZ(35, assetsModel.stickerAssetVariant) + C1142340fpg.LJI(36) + C1142340fpg.LJIIIZ(37, assetsModel.stickerAssetVariantReason) + C1142340fpg.LJI(38);
        List<DistributionStrategy> list2 = assetsModel.distributionStrategy;
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < assetsModel.distributionStrategy.size(); i2++) {
                DistributionStrategy distributionStrategy = (DistributionStrategy) ListProtector.get(assetsModel.distributionStrategy, i2);
                if (distributionStrategy == null) {
                    iLIZIZ4 = 0;
                } else {
                    int iLIZJ3 = _DistributionStrategy_ProtoEncoder.LIZJ(distributionStrategy);
                    iLIZIZ4 = iLIZJ3 + C1142350fph.LIZIZ(iLIZJ3) + C1142350fph.LIZ(39);
                }
                iLJIIIZ2 += iLIZIZ4;
            }
        }
        return iLJIIIZ2;
    }

    public static void LIZIZ(C1142350fph c1142350fph, AssetsModel assetsModel) {
        C1142340fpg.LJFF(c1142350fph, 1, assetsModel.name);
        C1142340fpg.LJFF(c1142350fph, 2, assetsModel.resourceUri);
        _ResourceModel_ProtoEncoder.LIZJ(c1142350fph, 4, assetsModel.resourceModel);
        C1142340fpg.LJFF(c1142350fph, 5, assetsModel.describe);
        long j = assetsModel.id;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j);
        int i = assetsModel.resourceType;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 8, assetsModel.md5);
        long j2 = assetsModel.size;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LJFF(j2);
        LokiExtraContent lokiExtraContent = assetsModel.lokiExtraContent;
        if (lokiExtraContent != null) {
            c1142350fph.LIZLLL(10, 2);
            c1142350fph.LJ(_LokiExtraContent_ProtoEncoder.LIZJ(lokiExtraContent));
            _LokiExtraContent_ProtoEncoder.LIZIZ(c1142350fph, lokiExtraContent);
        }
        int i2 = assetsModel.downloadType;
        c1142350fph.LIZLLL(26, 0);
        c1142350fph.LIZJ(i2);
        _ResourceModel_ProtoEncoder.LIZJ(c1142350fph, 28, assetsModel.resourceByteVC1Model);
        C1142340fpg.LJFF(c1142350fph, 29, assetsModel.bytevc1Md5);
        List<VideoResource> list = assetsModel.videoResourceList;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < assetsModel.videoResourceList.size(); i3++) {
                VideoResource videoResource = (VideoResource) ListProtector.get(assetsModel.videoResourceList, i3);
                if (videoResource != null) {
                    c1142350fph.LIZLLL(30, 2);
                    c1142350fph.LJ(_VideoResource_ProtoEncoder.LIZIZ(videoResource));
                    C1142340fpg.LJFF(c1142350fph, 1, videoResource.videoTypeName);
                    _ResourceModel_ProtoEncoder.LIZJ(c1142350fph, 2, videoResource.videoUrl);
                    C1142340fpg.LJFF(c1142350fph, 3, videoResource.videoMd5);
                }
            }
        }
        FaceRecognitionMeta faceRecognitionMeta = assetsModel.faceRecognitionArchiveMeta;
        if (faceRecognitionMeta != null) {
            c1142350fph.LIZLLL(31, 2);
            c1142350fph.LJ(_FaceRecognitionMeta_ProtoEncoder.LIZJ(faceRecognitionMeta));
            _FaceRecognitionMeta_ProtoEncoder.LIZIZ(c1142350fph, faceRecognitionMeta);
        }
        C1142340fpg.LJFF(c1142350fph, 32, assetsModel.lynxUrlSettingsKey);
        int i4 = assetsModel.downgradeResourceType;
        c1142350fph.LIZLLL(33, 0);
        c1142350fph.LIZJ(i4);
        AssetExtra assetExtra = assetsModel.assetExtra;
        if (assetExtra != null) {
            c1142350fph.LIZLLL(34, 2);
            c1142350fph.LJ(C1142340fpg.LJIILL(1, assetExtra.effectStarlingKey));
            C1142340fpg.LJFF(c1142350fph, 1, assetExtra.effectStarlingKey);
        }
        int i5 = assetsModel.stickerAssetVariant;
        c1142350fph.LIZLLL(35, 0);
        c1142350fph.LIZJ(i5);
        boolean z = assetsModel.immediateDownload;
        c1142350fph.LIZLLL(36, 0);
        c1142350fph.LJ(z ? 1 : 0);
        int i6 = assetsModel.stickerAssetVariantReason;
        c1142350fph.LIZLLL(37, 0);
        c1142350fph.LIZJ(i6);
        boolean z2 = assetsModel.forceUseImOrRespAsset;
        c1142350fph.LIZLLL(38, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        List<DistributionStrategy> list2 = assetsModel.distributionStrategy;
        if (list2 != null && !list2.isEmpty()) {
            for (int i7 = 0; i7 < assetsModel.distributionStrategy.size(); i7++) {
                DistributionStrategy distributionStrategy = (DistributionStrategy) ListProtector.get(assetsModel.distributionStrategy, i7);
                if (distributionStrategy != null) {
                    c1142350fph.LIZLLL(39, 2);
                    c1142350fph.LJ(_DistributionStrategy_ProtoEncoder.LIZJ(distributionStrategy));
                    _DistributionStrategy_ProtoEncoder.LIZIZ(c1142350fph, distributionStrategy);
                }
            }
        }
    }

    public static int LJ(int i, AssetsModel assetsModel) {
        if (assetsModel == null) {
            return 0;
        }
        int iLIZLLL = LIZLLL(assetsModel);
        return iLIZLLL + C1142350fph.LIZIZ(iLIZLLL) + C1142350fph.LIZ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, AssetsModel assetsModel) {
        LIZIZ(c1142350fph, assetsModel);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, AssetsModel assetsModel) {
        if (assetsModel == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        c1142350fph.LJ(LIZLLL(assetsModel));
        LIZIZ(c1142350fph, assetsModel);
    }
}
