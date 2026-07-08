package com.ss.android.ugc.aweme.services.dm;

import X.AbstractC1433570nPP;
import X.InterfaceC1452170ntP;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.services.dm.IDMPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes36.dex */
public final class DMPublishService implements IDMPublishService {
    public static final DMPublishService INSTANCE = new DMPublishService();
    public final /* synthetic */ IDMPublishService $$delegate_0;

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public void addPublishCallback(String str, AbstractC1433570nPP abstractC1433570nPP) {
        this.$$delegate_0.addPublishCallback(str, abstractC1433570nPP);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public void cancelPublish(String str, String str2) {
        this.$$delegate_0.cancelPublish(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public Pair<Boolean, BaseShortVideoContext> createPhotoPublishEditModel(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        return this.$$delegate_0.createPhotoPublishEditModel(str, str2, i, z, z2, z3, z4);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public Pair<Boolean, BaseShortVideoContext> createVideoPublishEditModel(String str, String str2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str3) {
        return this.$$delegate_0.createVideoPublishEditModel(str, str2, i, i2, j, i3, i4, i5, i6, z, z2, z3, str3);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public Pair<Boolean, BaseShortVideoContext> createVideoPublishEditModel(String str, String str2, String[] strArr, String[] strArr2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str3, boolean z4) {
        return this.$$delegate_0.createVideoPublishEditModel(str, str2, strArr, strArr2, i, i2, j, i3, i4, i5, i6, z, z2, z3, str3, z4);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public ICreativePathServiceProxy creativePathServiceProxy() {
        return this.$$delegate_0.creativePathServiceProxy();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String generateMetadataString(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.generateMetadataString(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public BaseHeaderComponent getBaseHeaderComponent(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getBaseHeaderComponent(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public File getCreativeToolsRootDir() {
        return this.$$delegate_0.getCreativeToolsRootDir();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getCurrentUid() {
        return this.$$delegate_0.getCurrentUid();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public Map<String, String> getDMOpenCameraOrAlbumMobMap(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getDMOpenCameraOrAlbumMobMap(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getEffectHandlerType(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getEffectHandlerType(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getEffectHandlerTypeActive(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getEffectHandlerTypeActive(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getEffectIconUrl(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getEffectIconUrl(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getEffectId(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getEffectId(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getEffectName(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getEffectName(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getEnterDM(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getEnterDM(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getEnterFrom(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getEnterFrom(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getEnterMethodType(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getEnterMethodType(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public FeatureAttachmentData getFeatureAttachmentData(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getFeatureAttachmentData(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getIMCameraVideoPath(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getIMCameraVideoPath(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public boolean getIsStoryImmersiveReply(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getIsStoryImmersiveReply(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public Integer getMediaType(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getMediaType(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public QuoteMode getQuoteMode(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getQuoteMode(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getVideoPath(BaseShortVideoContext baseShortVideoContext) {
        return this.$$delegate_0.getVideoPath(baseShortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String isAllowSkip(BaseShortVideoContext baseShortVideoContext, InterfaceC1452170ntP interfaceC1452170ntP, String str) {
        return this.$$delegate_0.isAllowSkip(baseShortVideoContext, interfaceC1452170ntP, str);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String publishDMMedia(PublishModel publishModel) {
        return this.$$delegate_0.publishDMMedia(publishModel);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public void removePublishCallback(String str, AbstractC1433570nPP abstractC1433570nPP) {
        this.$$delegate_0.removePublishCallback(str, abstractC1433570nPP);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public void setUploadConfigDir() {
        this.$$delegate_0.setUploadConfigDir();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public void storeUploadParams(TreeMap<String, Object> treeMap) {
        this.$$delegate_0.storeUploadParams(treeMap);
    }

    public DMPublishService() {
        IDMPublishService iDMPublishService = (IDMPublishService) PluggableExtentionKt.pluggableSpi$default(IDMPublishService.class, false, false, false, 14, null);
        this.$$delegate_0 = iDMPublishService == null ? new IDMPublishService() { // from class: com.ss.android.ugc.aweme.services.dm.DMPublishService.1
            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public ICreativePathServiceProxy creativePathServiceProxy() {
                return IDMPublishService.DefaultImpls.creativePathServiceProxy(this);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public File getCreativeToolsRootDir() {
                return IDMPublishService.DefaultImpls.getCreativeToolsRootDir(this);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String getCurrentUid() {
                return IDMPublishService.DefaultImpls.getCurrentUid(this);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public void setUploadConfigDir() {
                IDMPublishService.DefaultImpls.setUploadConfigDir(this);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String generateMetadataString(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.generateMetadataString(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public BaseHeaderComponent getBaseHeaderComponent(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getBaseHeaderComponent(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public Map<String, String> getDMOpenCameraOrAlbumMobMap(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getDMOpenCameraOrAlbumMobMap(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String getEffectHandlerType(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getEffectHandlerType(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String getEffectHandlerTypeActive(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getEffectHandlerTypeActive(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String getEffectIconUrl(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getEffectIconUrl(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String getEffectId(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getEffectId(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String getEffectName(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getEffectName(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String getEnterDM(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getEnterDM(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String getEnterFrom(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getEnterFrom(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String getEnterMethodType(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getEnterMethodType(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public FeatureAttachmentData getFeatureAttachmentData(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getFeatureAttachmentData(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String getIMCameraVideoPath(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getIMCameraVideoPath(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public boolean getIsStoryImmersiveReply(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getIsStoryImmersiveReply(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public Integer getMediaType(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getMediaType(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public QuoteMode getQuoteMode(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getQuoteMode(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String getVideoPath(BaseShortVideoContext baseShortVideoContext) {
                return IDMPublishService.DefaultImpls.getVideoPath(this, baseShortVideoContext);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String publishDMMedia(PublishModel publishModel) {
                return IDMPublishService.DefaultImpls.publishDMMedia(this, publishModel);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public void storeUploadParams(TreeMap<String, Object> treeMap) {
                IDMPublishService.DefaultImpls.storeUploadParams(this, treeMap);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public void addPublishCallback(String str, AbstractC1433570nPP abstractC1433570nPP) {
                IDMPublishService.DefaultImpls.addPublishCallback(this, str, abstractC1433570nPP);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public void cancelPublish(String str, String str2) {
                IDMPublishService.DefaultImpls.cancelPublish(this, str, str2);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public void removePublishCallback(String str, AbstractC1433570nPP abstractC1433570nPP) {
                IDMPublishService.DefaultImpls.removePublishCallback(this, str, abstractC1433570nPP);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public String isAllowSkip(BaseShortVideoContext baseShortVideoContext, InterfaceC1452170ntP interfaceC1452170ntP, String str) {
                return IDMPublishService.DefaultImpls.isAllowSkip(this, baseShortVideoContext, interfaceC1452170ntP, str);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public Pair<Boolean, BaseShortVideoContext> createPhotoPublishEditModel(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
                return IDMPublishService.DefaultImpls.createPhotoPublishEditModel(this, str, str2, i, z, z2, z3, z4);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public Pair<Boolean, BaseShortVideoContext> createVideoPublishEditModel(String str, String str2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str3) {
                return IDMPublishService.DefaultImpls.createVideoPublishEditModel(this, str, str2, i, i2, j, i3, i4, i5, i6, z, z2, z3, str3);
            }

            @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
            public Pair<Boolean, BaseShortVideoContext> createVideoPublishEditModel(String str, String str2, String[] strArr, String[] strArr2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str3, boolean z4) {
                return IDMPublishService.DefaultImpls.createVideoPublishEditModel(this, str, str2, strArr, strArr2, i, i2, j, i3, i4, i5, i6, z, z2, z3, str3, z4);
            }
        } : iDMPublishService;
    }
}
