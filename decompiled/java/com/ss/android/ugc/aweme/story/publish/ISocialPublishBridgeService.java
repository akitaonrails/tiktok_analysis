package com.ss.android.ugc.aweme.story.publish;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public interface ISocialPublishBridgeService extends SocialPublishCallback {
    void Kg(SocialPublishCallback socialPublishCallback, Function1<? super PublishModel, Boolean> function1);

    String T4(Context context);

    void f8(SocialPublishCallback socialPublishCallback);
}
