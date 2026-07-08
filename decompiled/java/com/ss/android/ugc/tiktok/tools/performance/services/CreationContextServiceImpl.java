package com.ss.android.ugc.tiktok.tools.performance.services;

import X.C0BXW;
import X.C1428470nHB;
import X.C2097608Jq;
import X.InterfaceC2255911DRl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationContextServiceImpl implements InterfaceC2255911DRl {
    public static WeakReference<VideoPublishEditModel> publishEditModelRef;
    public static volatile Function0<? extends Map<String, ? extends Object>> recordRuntimeStateProvider;
    public static WeakReference<ShortVideoContext> shortVideoContextRef;
    public static final CreationContextServiceImpl INSTANCE = new CreationContextServiceImpl();
    public static final int $stable = 8;

    public final void clear() {
        shortVideoContextRef = null;
        publishEditModelRef = null;
        recordRuntimeStateProvider = null;
    }

    @Override // X.InterfaceC2255911DRl
    public String getContentSource() {
        String strLJIILIIL = null;
        try {
            VideoPublishEditModel publishEditModel = getPublishEditModel();
            if (publishEditModel != null) {
                strLJIILIIL = C1428470nHB.LJIILIIL(publishEditModel);
                return strLJIILIIL;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return strLJIILIIL;
    }

    @Override // X.InterfaceC2255911DRl
    public String getContentType() {
        String strLJIILL = null;
        try {
            VideoPublishEditModel publishEditModel = getPublishEditModel();
            if (publishEditModel != null) {
                strLJIILL = C1428470nHB.LJIILL(publishEditModel);
                return strLJIILL;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return strLJIILL;
    }

    @Override // X.InterfaceC2255911DRl
    public Integer getDraftCount() {
        return null;
    }

    @Override // X.InterfaceC2255911DRl
    public Map<String, Object> getPublishParams() {
        return null;
    }

    @Override // X.InterfaceC2255911DRl
    public Boolean isBackup() {
        return null;
    }

    private final VideoPublishEditModel getPublishEditModel() {
        WeakReference<VideoPublishEditModel> weakReference = publishEditModelRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private final ShortVideoContext getShortVideoContext() {
        WeakReference<ShortVideoContext> weakReference = shortVideoContextRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC2255911DRl
    public Integer getCreationDuration() {
        EditPreviewInfo previewInfo;
        int previewVideoLength;
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel == null || (previewInfo = publishEditModel.getPreviewInfo()) == null || (previewVideoLength = previewInfo.getPreviewVideoLength()) <= 0) {
            return null;
        }
        return Integer.valueOf(previewVideoLength);
    }

    @Override // X.InterfaceC2255911DRl
    public Map<String, Object> getEditExtra() {
        CommonMobParamModel commonMobParamModel;
        String str;
        CommonMobParamModel commonMobParamModel2;
        String str2;
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel == null) {
            return getShootExtra();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = publishEditModel.mShootWay;
        if (str3 != null) {
            linkedHashMap.put("shoot_way", str3);
        }
        String creationId = publishEditModel.getCreationId();
        if (creationId != null) {
            linkedHashMap.put("creation_id", creationId);
        }
        CreativeModel creativeModel = publishEditModel.creativeModel;
        if (creativeModel != null && (commonMobParamModel2 = creativeModel.commonMobModel) != null && (str2 = commonMobParamModel2.shootEnterFrom) != null) {
            linkedHashMap.put("enter_from", str2);
        }
        CreativeModel creativeModel2 = publishEditModel.creativeModel;
        if (creativeModel2 != null && (commonMobParamModel = creativeModel2.commonMobModel) != null && (str = commonMobParamModel.shootEnterMethod) != null) {
            linkedHashMap.put("enter_method", str);
        }
        return linkedHashMap.isEmpty() ? INSTANCE.getShootExtra() : linkedHashMap;
    }

    @Override // X.InterfaceC2255911DRl
    public Map<String, Object> getEditFun() {
        Integer numValueOf;
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_music", Boolean.valueOf(publishEditModel.hasMusic()));
        linkedHashMap.put("is_draft", Boolean.valueOf(publishEditModel.creativeModel.draftInfoModel.isDraft));
        String contentType = getContentType();
        if (contentType != null) {
            linkedHashMap.put("content_type", contentType);
        }
        String contentSource = getContentSource();
        if (contentSource != null) {
            linkedHashMap.put("content_source", contentSource);
        }
        EditPreviewInfo previewInfo = publishEditModel.getPreviewInfo();
        if (previewInfo != null && (numValueOf = Integer.valueOf(previewInfo.getPreviewVideoLength())) != null && numValueOf.intValue() > 0) {
            linkedHashMap.put("creation_duration", Integer.valueOf(numValueOf.intValue()));
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC2255911DRl
    public Map<String, Integer> getMediaCount() {
        int i;
        CommonMobParamModel commonMobParamModel;
        CommonMobParamModel commonMobParamModel2;
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel == null) {
            return null;
        }
        CreativeModel creativeModel = publishEditModel.creativeModel;
        int i2 = (creativeModel == null || (commonMobParamModel2 = creativeModel.commonMobModel) == null) ? 0 : commonMobParamModel2.originalUserSelectedPicCnt;
        if (creativeModel == null || (commonMobParamModel = creativeModel.commonMobModel) == null) {
            EditPreviewInfo previewInfo = publishEditModel.getPreviewInfo();
            i = (previewInfo == null || Integer.valueOf(previewInfo.getPreviewVideoLength()) == null || publishEditModel.getPreviewInfo().getPreviewVideoLength() <= 0) ? 0 : 1;
        } else {
            i = commonMobParamModel.originalUserSelectedVideoCnt;
        }
        return C2097608Jq.LJIIIIZZ(new Pair("pic_cnt", Integer.valueOf(i2)), new Pair("video_cnt", Integer.valueOf(i)));
    }

    @Override // X.InterfaceC2255911DRl
    public Map<String, Object> getPostFun() {
        Integer numValueOf;
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String creationId = publishEditModel.getCreationId();
        if (creationId != null) {
            linkedHashMap.put("creation_id", creationId);
        }
        linkedHashMap.put("has_music", Boolean.valueOf(publishEditModel.hasMusic()));
        linkedHashMap.put("is_draft", Boolean.valueOf(publishEditModel.creativeModel.draftInfoModel.isDraft));
        String contentType = getContentType();
        if (contentType != null) {
            linkedHashMap.put("content_type", contentType);
        }
        String str = publishEditModel.mShootWay;
        if (str != null) {
            linkedHashMap.put("shoot_way", str);
        }
        EditPreviewInfo previewInfo = publishEditModel.getPreviewInfo();
        if (previewInfo != null && (numValueOf = Integer.valueOf(previewInfo.getPreviewVideoLength())) != null && numValueOf.intValue() > 0) {
            linkedHashMap.put("creation_duration", Integer.valueOf(numValueOf.intValue()));
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC2255911DRl
    public String getShootEnterFrom() {
        CreativeModel creativeModel;
        CommonMobParamModel commonMobParamModel;
        String str;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext != null && (str = shortVideoContext.enterFrom) != null) {
            return str;
        }
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel == null || (creativeModel = publishEditModel.creativeModel) == null || (commonMobParamModel = creativeModel.commonMobModel) == null) {
            return null;
        }
        return commonMobParamModel.shootEnterFrom;
    }

    @Override // X.InterfaceC2255911DRl
    public String getShootEnterMethod() {
        CreativeModel creativeModel;
        CommonMobParamModel commonMobParamModel;
        String str;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext != null && (str = shortVideoContext.enterMethod) != null) {
            return str;
        }
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel == null || (creativeModel = publishEditModel.creativeModel) == null || (commonMobParamModel = creativeModel.commonMobModel) == null) {
            return null;
        }
        return commonMobParamModel.shootEnterMethod;
    }

    @Override // X.InterfaceC2255911DRl
    public Map<String, Object> getShootExtra() {
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = shortVideoContext.shootWay;
        if (str != null) {
            linkedHashMap.put("shoot_way", str);
        }
        String creationId = shortVideoContext.getCreationId();
        if (creationId != null) {
            linkedHashMap.put("creation_id", creationId);
        }
        String str2 = shortVideoContext.enterFrom;
        if (str2 != null) {
            linkedHashMap.put("enter_from", str2);
        }
        String str3 = shortVideoContext.enterMethod;
        if (str3 != null) {
            linkedHashMap.put("enter_method", str3);
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC2255911DRl
    public Map<String, Object> getShootFun() {
        Boolean boolValueOf;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        String strLJIJJLI = null;
        if (shortVideoContext != null) {
            boolValueOf = Boolean.valueOf(INSTANCE.hasShootMusic(shortVideoContext));
            strLJIJJLI = shortVideoContext.LJIJJLI();
        } else {
            boolValueOf = null;
        }
        return buildShootFunMap$tools_perf_impl_release(boolValueOf, strLJIJJLI, safelyInvokeRuntimeStateProvider$tools_perf_impl_release(recordRuntimeStateProvider));
    }

    @Override // X.InterfaceC2255911DRl
    public String getShootWay() {
        String str;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext != null && (str = shortVideoContext.shootWay) != null) {
            return str;
        }
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel != null) {
            return publishEditModel.mShootWay;
        }
        return null;
    }

    @Override // X.InterfaceC2255911DRl
    public Boolean hasMusic() {
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel != null) {
            return Boolean.valueOf(publishEditModel.hasMusic());
        }
        return null;
    }

    @Override // X.InterfaceC2255911DRl
    public Boolean isDraft() {
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel != null) {
            return Boolean.valueOf(publishEditModel.creativeModel.draftInfoModel.isDraft);
        }
        return null;
    }

    @Override // X.InterfaceC2255911DRl
    public Boolean isLongVideo() {
        EditPreviewInfo previewInfo;
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel == null || (previewInfo = publishEditModel.getPreviewInfo()) == null) {
            return null;
        }
        return Boolean.valueOf(previewInfo.getPreviewVideoLength() > 60000);
    }

    @Override // X.InterfaceC2255911DRl
    public Boolean isUploadDirectEnter() {
        CreativeModel creativeModel;
        CommonMobParamModel commonMobParamModel;
        VideoPublishEditModel publishEditModel = getPublishEditModel();
        if (publishEditModel == null || (creativeModel = publishEditModel.creativeModel) == null || (commonMobParamModel = creativeModel.commonMobModel) == null) {
            return null;
        }
        return Boolean.valueOf(commonMobParamModel.isUploadDirectEnter);
    }

    private final boolean hasShootMusic(ShortVideoContext shortVideoContext) {
        MusicBuzModel musicBuzModel;
        String str = shortVideoContext.cameraComponentModel.mMusicPath;
        if (str != null && str.length() != 0) {
            return true;
        }
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        if (creativeModel != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
            if (musicBuzModel.music == null) {
                String str2 = musicBuzModel.songId;
                if (str2 != null && str2.length() != 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final Map<String, Object> safelyInvokeRuntimeStateProvider$tools_perf_impl_release(Function0<? extends Map<String, ? extends Object>> function0) {
        if (function0 != null) {
            try {
                return function0.invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public void setRecordRuntimeStateProvider(Function0<? extends Map<String, ? extends Object>> function0) {
        if (function0 != null && !C0BXW.LIZ()) {
            return;
        }
        recordRuntimeStateProvider = function0;
    }

    public void updateEditModel(Object obj) {
        if (!C0BXW.LIZ()) {
            return;
        }
        WeakReference<VideoPublishEditModel> weakReference = null;
        if ((obj instanceof VideoPublishEditModel) && obj != null) {
            weakReference = new WeakReference<>(obj);
        }
        publishEditModelRef = weakReference;
    }

    public void updateShootContext(Object obj) {
        if (!C0BXW.LIZ()) {
            return;
        }
        WeakReference<ShortVideoContext> weakReference = null;
        if ((obj instanceof ShortVideoContext) && obj != null) {
            weakReference = new WeakReference<>(obj);
        }
        shortVideoContextRef = weakReference;
    }

    public final Map<String, Object> buildShootFunMap$tools_perf_impl_release(Boolean bool, String str, Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bool != null) {
            linkedHashMap.put("has_music", Boolean.valueOf(bool.booleanValue()));
        }
        if (str != null) {
            linkedHashMap.put("shoot_tab_name", str);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
