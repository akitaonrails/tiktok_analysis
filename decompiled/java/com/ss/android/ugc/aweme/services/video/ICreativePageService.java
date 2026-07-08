package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;

/* JADX INFO: loaded from: classes29.dex */
public interface ICreativePageService {

    public static final class DefaultImpls {
        public static boolean isImageEditPage(ICreativePageService iCreativePageService, Activity activity) {
            return false;
        }
    }

    boolean isImageEditPage(Activity activity);

    boolean isPublishPage(Activity activity);

    boolean isRecordPage(Activity activity);

    boolean isVideoEditPage(Activity activity);
}
