package com.bytedance.android.livesdk.gift.assets;

import X.C09CT;
import X.C215600sM;
import X.C786410Ut5;
import com.bytedance.android.livesdk.gift.model.AssetExtra;
import com.bytedance.android.livesdk.gift.model.DistributionStrategy;
import com.bytedance.android.livesdk.gift.model.LokiExtraContent;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AssetsModel {
    public static final int DOWNLOAD_TYPE_UNKONW = 0;

    @C09CT("asset_extra")
    public AssetExtra assetExtra;

    @C09CT("bytevc1_md5")
    public String bytevc1Md5;

    @C09CT("describe")
    public String describe;

    @C09CT("distribution_strategy")
    public List<DistributionStrategy> distributionStrategy;

    @C09CT("downgrade_resource_type")
    public int downgradeResourceType;

    @C09CT("download_type")
    public int downloadType;

    @C09CT("face_recognition_archive_meta")
    public FaceRecognitionMeta faceRecognitionArchiveMeta;

    @C09CT("force_use_im_or_resp_asset")
    public boolean forceUseImOrRespAsset;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("immediate_download")
    public boolean immediateDownload;

    @C09CT("loki_content")
    public LokiExtraContent lokiExtraContent;

    @C09CT("lynx_resource")
    public final LynxResource lynxResource;

    @C09CT("lynx_url_settings_key")
    public String lynxUrlSettingsKey;

    @C09CT("md5")
    public String md5;

    @C09CT("name")
    public String name;

    @C09CT("resource_bytevc1_url")
    public ResourceModel resourceByteVC1Model;

    @C09CT("resource_url")
    public ResourceModel resourceModel;

    @C09CT("resource_type")
    public int resourceType;

    @C09CT("resource_uri")
    public String resourceUri;

    @C09CT("size")
    public long size;

    @C09CT("sticker_asset_variant")
    public int stickerAssetVariant;

    @C09CT("sticker_asset_variant_reason")
    public int stickerAssetVariantReason;

    @C09CT("video_resource_list")
    public List<VideoResource> videoResourceList;
    public static final C215600sM Companion = new Object() { // from class: X.00sM
    };
    public static final int RESOURCE_TYPE_WEBP = 1;
    public static final int RESOURCE_TYPE_LOTTIE = 2;
    public static final int RESOURCE_TYPE_MP4 = 4;
    public static final int RESOURCE_TYPE_STICKER = 5;
    public static final int RESOURCE_TYPE_EFFECT_LOKI = 6;
    public static final int RESOURCE_TYPE_LYNX = 8;
    public static final int RESOURCE_TYPE_PREFAB_TEMPLATE = 9;
    public static final int RESOURCE_TYPE_EFFECT_STREAM_EXTRA = 10;
    public static final int DOWNLOAD_TYPE_YES = 1;
    public static final int DOWNLOAD_TYPE_NO = 2;

    public AssetsModel() {
        this(0L, "", "", "", 0, "", new ResourceModel(null, null, 3, null), null, null, 0L, 0, null, new ArrayList(), null, null, 0, null, null, 0, false, 0, false, new ArrayList());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getResourceFormat() {
        /*
            r6 = this;
            java.util.List<com.bytedance.android.livesdk.gift.assets.VideoResource> r0 = r6.videoResourceList
            r5 = 1
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            r0 = 0
        Lc:
            java.lang.String r4 = "h264"
            java.lang.String r3 = "bytevc1"
            if (r0 != 0) goto L45
            java.util.List<com.bytedance.android.livesdk.gift.assets.VideoResource> r1 = r6.videoResourceList
            if (r1 == 0) goto L39
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.gift.assets.VideoResource r0 = (com.bytedance.android.livesdk.gift.assets.VideoResource) r0
            java.lang.String r0 = r0.videoTypeName
            r2.add(r0)
            goto L25
        L37:
            r0 = 1
            goto Lc
        L39:
            r2 = 0
        L3a:
            java.lang.String r1 = "bytevc1opt"
            if (r2 == 0) goto L4f
            boolean r0 = r2.contains(r1)
            if (r0 != r5) goto L50
            return r1
        L45:
            java.lang.String r0 = r6.bytevc1Md5
            if (r0 == 0) goto L4f
            int r0 = r0.length()
            if (r0 != 0) goto L56
        L4f:
            return r4
        L50:
            boolean r0 = r2.contains(r3)
            if (r0 != r5) goto L4f
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.assets.AssetsModel.getResourceFormat():java.lang.String");
    }

    public int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.id) * 31) + this.name.hashCode()) * 31) + this.describe.hashCode()) * 31) + this.md5.hashCode()) * 31) + this.resourceType) * 31) + this.resourceUri.hashCode()) * 31;
        String str = this.bytevc1Md5;
        return ((((iY2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.size)) * 31) + this.downloadType;
    }

    public final int getDowngradeResType() {
        return this.downgradeResourceType;
    }

    public final String getResourceFormat(String str) {
        VideoResource next;
        String str2;
        if (str != null) {
            List<VideoResource> list = this.videoResourceList;
            if (list != null) {
                Iterator<VideoResource> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.videoMd5, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                VideoResource videoResource = next;
                if (videoResource != null && (str2 = videoResource.videoTypeName) != null) {
                    return str2;
                }
            }
            if (Intrinsics.LJFF(str, this.bytevc1Md5)) {
                return "bytevc1";
            }
            if (Intrinsics.LJFF(str, this.md5)) {
                return "h264";
            }
            return "unknown";
        }
        return "unknown";
    }

    public AssetsModel(long j, String str, String str2, String str3, int i, String str4, ResourceModel resourceModel, ResourceModel resourceModel2, String str5, long j2, int i2, LokiExtraContent lokiExtraContent, List<VideoResource> list, FaceRecognitionMeta faceRecognitionMeta, String str6, int i3, LynxResource lynxResource, AssetExtra assetExtra, int i4, boolean z, int i5, boolean z2, List<DistributionStrategy> list2) {
        this.id = j;
        this.name = str;
        this.describe = str2;
        this.md5 = str3;
        this.resourceType = i;
        this.resourceUri = str4;
        this.resourceModel = resourceModel;
        this.resourceByteVC1Model = resourceModel2;
        this.bytevc1Md5 = str5;
        this.size = j2;
        this.downloadType = i2;
        this.lokiExtraContent = lokiExtraContent;
        this.videoResourceList = list;
        this.faceRecognitionArchiveMeta = faceRecognitionMeta;
        this.lynxUrlSettingsKey = str6;
        this.downgradeResourceType = i3;
        this.lynxResource = lynxResource;
        this.assetExtra = assetExtra;
        this.stickerAssetVariant = i4;
        this.immediateDownload = z;
        this.stickerAssetVariantReason = i5;
        this.forceUseImOrRespAsset = z2;
        this.distributionStrategy = list2;
    }
}
