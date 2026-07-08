package com.ss.android.ugc.aweme.story.publish;

import X.AbstractC1433460nPE;
import X.C1434650nR9;
import X.C1434900nRY;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: loaded from: classes12.dex */
public interface SocialPublishCallback {
    void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj);

    void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str);

    void onPublishProgress(int i, C1434900nRY c1434900nRY);

    void onPublishStart(PublishModel publishModel);

    void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse);

    void onReadyToCreateAweme(PublishModel publishModel);

    void onReportPublish();

    void onSynthesisSuccess(PublishModel publishModel, String str);
}
