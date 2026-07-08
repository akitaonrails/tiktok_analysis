package com.ss.android.ugc.aweme.services.story;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: loaded from: classes12.dex */
public final class SimplePublishModelKt {
    public static final SimplePublishModel convert2SimplePublishModel(PublishModel publishModel) {
        return new SimplePublishModel(publishModel.creationId, publishModel.publishId, publishModel.shootWay, publishModel.storyType, publishModel.videoCoverPaths, publishModel);
    }
}
