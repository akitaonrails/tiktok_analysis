package com.ss.android.ugc.aweme.sticker;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: loaded from: classes3.dex */
public final class AddYoursModelCheckService implements AddYoursModelCheckServiceApi {
    @Override // com.ss.android.ugc.aweme.sticker.AddYoursModelCheckServiceApi
    public final boolean LIZ(PublishModel publishModel) {
        BaseShortVideoContext baseShortVideoContext;
        VideoPublishEditModel videoPublishEditModel = null;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        }
        if (videoPublishEditModel == null || !u4.LJJIII(videoPublishEditModel)) {
            return false;
        }
        return true;
    }
}
