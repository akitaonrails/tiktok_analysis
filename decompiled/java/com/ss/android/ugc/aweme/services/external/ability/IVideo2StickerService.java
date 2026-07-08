package com.ss.android.ugc.aweme.services.external.ability;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;

/* JADX INFO: loaded from: classes22.dex */
public interface IVideo2StickerService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public interface Callback {
        void onFailed(Exception exc, String str, int i);

        void onSuccess();
    }

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    void downloadAndOpenVideoTrimForSticker(Activity activity, Aweme aweme, Callback callback);

    void openVideoTrimForSticker(Activity activity, String str, long j, String str2);

    void photo2Sticker(Activity activity, MediaModel mediaModel, Intent intent, Callback callback);

    void photo2Sticker(Activity activity, String str, Intent intent, Callback callback);

    void video2StickerEdit(Activity activity, Aweme aweme, VideoStickerEntryMethod videoStickerEntryMethod, Callback callback, String str, String str2);

    public static final class DefaultImpls {
        public static void downloadAndOpenVideoTrimForSticker(IVideo2StickerService iVideo2StickerService, Activity activity, Aweme aweme, Callback callback) {
        }

        public static void openVideoTrimForSticker(IVideo2StickerService iVideo2StickerService, Activity activity, String str, long j, String str2) {
        }

        public static /* synthetic */ void video2StickerEdit$default(IVideo2StickerService iVideo2StickerService, Activity activity, Aweme aweme, VideoStickerEntryMethod videoStickerEntryMethod, Callback callback, String str, String str2, int i, Object obj) {
            String str3 = str;
            Callback callback2 = callback;
            if (obj == null) {
                String str4 = null;
                if ((i & 8) != 0) {
                    callback2 = null;
                }
                if ((i & 16) != 0) {
                    str3 = null;
                }
                if ((i & 32) == 0) {
                    str4 = str2;
                }
                iVideo2StickerService.video2StickerEdit(activity, aweme, videoStickerEntryMethod, callback2, str3, str4);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: video2StickerEdit");
        }
    }
}
