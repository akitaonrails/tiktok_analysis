package com.ss.android.ugc.aweme.story.publish;

import X.AbstractC1433460nPE;
import X.C01GW;
import X.C1434650nR9;
import X.C1434900nRY;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C452501pT;
import X.C729320SjC;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollectionKt;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class SocialPublishBridgeServiceImpl implements ISocialPublishBridgeService {
    public final ConcurrentHashMap<SocialPublishCallback, Function1<PublishModel, Boolean>> LL = new ConcurrentHashMap<>();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C729320SjC());

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReportPublish() {
        Iterator<Map.Entry<SocialPublishCallback, Function1<PublishModel, Boolean>>> it2 = this.LL.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getKey().onReportPublish();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService
    public final String T4(Context context) {
        return context.getString(2131850108);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService
    public final void f8(SocialPublishCallback socialPublishCallback) {
        this.LL.remove(socialPublishCallback);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishStart(PublishModel publishModel) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPublishStart,creationID:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<SocialPublishCallback, Function1<PublishModel, Boolean>> concurrentHashMap = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<SocialPublishCallback, Function1<PublishModel, Boolean>> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().invoke(publishModel).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it2.next()).getKey()).onPublishStart(publishModel);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReadyToCreateAweme(PublishModel publishModel) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReadyToCreateAweme,creationID:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<SocialPublishCallback, Function1<PublishModel, Boolean>> concurrentHashMap = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<SocialPublishCallback, Function1<PublishModel, Boolean>> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().invoke(publishModel).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it2.next()).getKey()).onReadyToCreateAweme(publishModel);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService
    public final void Kg(SocialPublishCallback socialPublishCallback, Function1<? super PublishModel, Boolean> function1) {
        this.LL.put(socialPublishCallback, function1);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
        PublishModel publishModel;
        String str;
        String str2 = null;
        if (c1434900nRY != null) {
            publishModel = c1434900nRY.LIZJ;
        } else {
            publishModel = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPublishProgress,creationID:");
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<SocialPublishCallback, Function1<PublishModel, Boolean>> concurrentHashMap = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<SocialPublishCallback, Function1<PublishModel, Boolean>> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().invoke(publishModel).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it2.next()).getKey()).onPublishProgress(i, c1434900nRY);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
        String str;
        String str2;
        BaseShortVideoContext baseShortVideoContext;
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        StoryShootModel storyShootModel;
        StoryNoteInfoModel storyNoteInfoModel;
        Aweme aweme;
        UrlModel urlModel;
        List<PhotoModeImageUrlModel> imageList;
        List<PhotoModeImageUrlModel> imageList2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPublishSuccess,creationID:");
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<SocialPublishCallback, Function1<PublishModel, Boolean>> concurrentHashMap = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<SocialPublishCallback, Function1<PublishModel, Boolean>> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().invoke(publishModel).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it2.next()).getKey()).onPublishSuccess(publishModel, createAwemeResponse);
        }
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (storyShootModel = creativeModel.storyModel) != null && (storyNoteInfoModel = storyShootModel.getStoryNoteInfoModel()) != null && createAwemeResponse != null && (aweme = createAwemeResponse.aweme) != null) {
            PhotoModeImageUrlModel photoModeImageUrlModel = new PhotoModeImageUrlModel(new UrlModel(), new UrlModel(), new UrlModel(), new UrlModel(), null, null, null, null, null, null, null, null);
            String str3 = storyNoteInfoModel.animatedAvatarFilePath;
            if (str3 != null) {
                urlModel = StoryNoteDataCollectionKt.toUrlModel(str3);
            } else {
                urlModel = null;
            }
            photoModeImageUrlModel.setDynamicImage(urlModel);
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null) {
                imageList = photoModeImageInfo.getImageList();
            } else {
                imageList = null;
            }
            if (imageList == null) {
                PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo2 != null) {
                    photoModeImageInfo2.setImageList(C1697810uHb.LJ(photoModeImageUrlModel));
                }
            } else {
                PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo3 != null && (imageList2 = photoModeImageInfo3.getImageList()) != null) {
                    ListProtector.set(imageList2, 0, photoModeImageUrlModel);
                }
            }
            StoryNoteDataCollection storyNoteDataCollection = StoryNoteDataCollectionKt.toStoryNoteDataCollection(aweme);
            IStoryThoughtMyDataManager iStoryThoughtMyDataManager = (IStoryThoughtMyDataManager) this.LLILLJJLI.getValue();
            iStoryThoughtMyDataManager.Bq0(storyNoteDataCollection, aweme);
            iStoryThoughtMyDataManager.onStoryNotePublishFinished(publishModel.creationId, storyNoteDataCollection, aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onSynthesisSuccess(PublishModel publishModel, String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSynthetiseSuccess,creationID:");
        String str3 = null;
        if (publishModel != null) {
            str2 = publishModel.creationId;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(",publishId:");
        if (publishModel != null) {
            str3 = publishModel.publishId;
        }
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<SocialPublishCallback, Function1<PublishModel, Boolean>> concurrentHashMap = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<SocialPublishCallback, Function1<PublishModel, Boolean>> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().invoke(publishModel).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it2.next()).getKey()).onSynthesisSuccess(publishModel, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPublishCanceled,creationID:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<SocialPublishCallback, Function1<PublishModel, Boolean>> concurrentHashMap = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<SocialPublishCallback, Function1<PublishModel, Boolean>> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().invoke(publishModel).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it2.next()).getKey()).onPublishCanceled(publishModel, abstractC1433460nPE, obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
        String str2;
        String str3;
        BaseShortVideoContext baseShortVideoContext;
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        StoryShootModel storyShootModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPublishFailed,creationID:");
        if (publishModel != null) {
            str2 = publishModel.creationId;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(",publishId:");
        if (publishModel != null) {
            str3 = publishModel.publishId;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<SocialPublishCallback, Function1<PublishModel, Boolean>> concurrentHashMap = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<SocialPublishCallback, Function1<PublishModel, Boolean>> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().invoke(publishModel).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it2.next()).getKey()).onPublishFailed(publishModel, c1434650nR9, str);
        }
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (storyShootModel = creativeModel.storyModel) != null && storyShootModel.getStoryNoteInfoModel() != null) {
            IStoryThoughtMyDataManager iStoryThoughtMyDataManager = (IStoryThoughtMyDataManager) this.LLILLJJLI.getValue();
            iStoryThoughtMyDataManager.Bq0(null, null);
            iStoryThoughtMyDataManager.onStoryNotePublishFinished("", null, null);
        }
    }
}
