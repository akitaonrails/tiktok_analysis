package com.ss.android.ugc.aweme.services.dm;

import X.AbstractC1433570nPP;
import X.C0VSJ;
import X.InterfaceC1452170ntP;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes36.dex */
public interface IDMPublishService {
    void addPublishCallback(String str, AbstractC1433570nPP abstractC1433570nPP);

    void cancelPublish(String str, String str2);

    Pair<Boolean, BaseShortVideoContext> createPhotoPublishEditModel(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4);

    Pair<Boolean, BaseShortVideoContext> createVideoPublishEditModel(String str, String str2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str3);

    Pair<Boolean, BaseShortVideoContext> createVideoPublishEditModel(String str, String str2, String[] strArr, String[] strArr2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str3, boolean z4);

    ICreativePathServiceProxy creativePathServiceProxy();

    String generateMetadataString(BaseShortVideoContext baseShortVideoContext);

    BaseHeaderComponent getBaseHeaderComponent(BaseShortVideoContext baseShortVideoContext);

    File getCreativeToolsRootDir();

    String getCurrentUid();

    Map<String, String> getDMOpenCameraOrAlbumMobMap(BaseShortVideoContext baseShortVideoContext);

    String getEffectHandlerType(BaseShortVideoContext baseShortVideoContext);

    String getEffectHandlerTypeActive(BaseShortVideoContext baseShortVideoContext);

    String getEffectIconUrl(BaseShortVideoContext baseShortVideoContext);

    String getEffectId(BaseShortVideoContext baseShortVideoContext);

    String getEffectName(BaseShortVideoContext baseShortVideoContext);

    String getEnterDM(BaseShortVideoContext baseShortVideoContext);

    String getEnterFrom(BaseShortVideoContext baseShortVideoContext);

    String getEnterMethodType(BaseShortVideoContext baseShortVideoContext);

    FeatureAttachmentData getFeatureAttachmentData(BaseShortVideoContext baseShortVideoContext);

    String getIMCameraVideoPath(BaseShortVideoContext baseShortVideoContext);

    boolean getIsStoryImmersiveReply(BaseShortVideoContext baseShortVideoContext);

    Integer getMediaType(BaseShortVideoContext baseShortVideoContext);

    QuoteMode getQuoteMode(BaseShortVideoContext baseShortVideoContext);

    String getVideoPath(BaseShortVideoContext baseShortVideoContext);

    String isAllowSkip(BaseShortVideoContext baseShortVideoContext, InterfaceC1452170ntP interfaceC1452170ntP, String str);

    String publishDMMedia(PublishModel publishModel);

    void removePublishCallback(String str, AbstractC1433570nPP abstractC1433570nPP);

    void setUploadConfigDir();

    void storeUploadParams(TreeMap<String, Object> treeMap);

    public static final class DefaultImpls {
        public static void addPublishCallback(IDMPublishService iDMPublishService, String str, AbstractC1433570nPP abstractC1433570nPP) {
        }

        public static void cancelPublish(IDMPublishService iDMPublishService, String str, String str2) {
        }

        public static String generateMetadataString(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return "";
        }

        public static BaseHeaderComponent getBaseHeaderComponent(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String getCurrentUid(IDMPublishService iDMPublishService) {
            return "";
        }

        public static Map<String, String> getDMOpenCameraOrAlbumMobMap(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String getEffectHandlerType(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String getEffectHandlerTypeActive(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String getEffectIconUrl(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String getEffectId(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String getEffectName(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String getEnterDM(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String getEnterFrom(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String getEnterMethodType(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static FeatureAttachmentData getFeatureAttachmentData(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String getIMCameraVideoPath(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static boolean getIsStoryImmersiveReply(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return false;
        }

        public static Integer getMediaType(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String getVideoPath(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return null;
        }

        public static String isAllowSkip(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext, InterfaceC1452170ntP interfaceC1452170ntP, String str) {
            return null;
        }

        public static String publishDMMedia(IDMPublishService iDMPublishService, PublishModel publishModel) {
            return "";
        }

        public static void removePublishCallback(IDMPublishService iDMPublishService, String str, AbstractC1433570nPP abstractC1433570nPP) {
        }

        public static void setUploadConfigDir(IDMPublishService iDMPublishService) {
        }

        public static void storeUploadParams(IDMPublishService iDMPublishService, TreeMap<String, Object> treeMap) {
        }

        public static ICreativePathServiceProxy creativePathServiceProxy(IDMPublishService iDMPublishService) {
            return new ICreativePathServiceProxy() { // from class: com.ss.android.ugc.aweme.services.dm.IDMPublishService.creativePathServiceProxy.1
                public final String cacheRoot = "";
                public final String persistentRoot = "";
                public final String creativeRoot = "";

                @Override // com.ss.android.ugc.aweme.services.dm.ICreativePathServiceProxy
                public String getCacheRoot() {
                    return this.cacheRoot;
                }

                @Override // com.ss.android.ugc.aweme.services.dm.ICreativePathServiceProxy
                public String getCreativeRoot() {
                    return this.creativeRoot;
                }

                @Override // com.ss.android.ugc.aweme.services.dm.ICreativePathServiceProxy
                public String getPersistentRoot() {
                    return this.persistentRoot;
                }
            };
        }

        public static File getCreativeToolsRootDir(IDMPublishService iDMPublishService) {
            return new C0VSJ("");
        }

        public static QuoteMode getQuoteMode(IDMPublishService iDMPublishService, BaseShortVideoContext baseShortVideoContext) {
            return QuoteMode.None.INSTANCE;
        }

        public static Pair<Boolean, BaseShortVideoContext> createPhotoPublishEditModel(IDMPublishService iDMPublishService, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
            return new Pair<>(Boolean.FALSE, null);
        }

        public static Pair<Boolean, BaseShortVideoContext> createVideoPublishEditModel(IDMPublishService iDMPublishService, String str, String str2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str3) {
            return new Pair<>(Boolean.FALSE, null);
        }

        public static Pair<Boolean, BaseShortVideoContext> createVideoPublishEditModel(IDMPublishService iDMPublishService, String str, String str2, String[] strArr, String[] strArr2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str3, boolean z4) {
            return new Pair<>(Boolean.FALSE, null);
        }

        public static /* synthetic */ Pair createVideoPublishEditModel$default(IDMPublishService iDMPublishService, String str, String str2, String[] strArr, String[] strArr2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str3, boolean z4, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
                    z2 = false;
                }
                if ((i7 & 8192) != 0) {
                    z3 = false;
                }
                if ((i7 & 16384) != 0) {
                    str3 = null;
                }
                if ((i7 & 32768) != 0) {
                    z4 = true;
                }
                return iDMPublishService.createVideoPublishEditModel(str, str2, strArr, strArr2, i, i2, j, i3, i4, i5, i6, z, z2, z3, str3, z4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createVideoPublishEditModel");
        }
    }
}
