package com.ss.android.ugc.aweme.services.story;

import X.C19EG;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public interface IStoryPublishService {

    public static final class DefaultImpls {
        public static String resolveCoverPathFallback(IStoryPublishService iStoryPublishService, SimplePublishModel simplePublishModel) {
            return null;
        }

        public static void updatePreviewCoverPath(IStoryPublishService iStoryPublishService, String str, String str2) {
        }
    }

    boolean checkHavePermission(Context context);

    void getCover(SimplePublishModel simplePublishModel, StoryCoverExtractConfig storyCoverExtractConfig, Function1<? super Bitmap, Unit> function1);

    String getCoverPath(SimplePublishModel simplePublishModel);

    IStoryGroupScheduleService getGroupScheduleService();

    String resolveCoverPathFallback(SimplePublishModel simplePublishModel);

    void retryPublish(C19EG c19eg, SimplePublishModel simplePublishModel, PublishFailureReason publishFailureReason, Function1<? super Boolean, Unit> function1);

    void updatePreviewCoverPath(String str, String str2);
}
