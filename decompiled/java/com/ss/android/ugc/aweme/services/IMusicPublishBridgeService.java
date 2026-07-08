package com.ss.android.ugc.aweme.services;

import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: loaded from: classes22.dex */
public interface IMusicPublishBridgeService {

    public static final class DefaultImpls {
        public static void onPublishSuccess(IMusicPublishBridgeService iMusicPublishBridgeService, PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
        }
    }

    boolean enableBAUserMusicExperienceOpt();

    void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse);

    void requestBusinessAccountType(String str);
}
