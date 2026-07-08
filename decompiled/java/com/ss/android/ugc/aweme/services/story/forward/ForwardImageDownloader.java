package com.ss.android.ugc.aweme.services.story.forward;

import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface ForwardImageDownloader {
    void downloadPhotoModeResource(ForwardMedia forwardMedia, List<ForwardMediaDownloader.DownloadConfig> list, boolean z, ImageDownloadListener imageDownloadListener);

    public interface ImageDownloadListener {
        void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult);

        void onFileHeaderInfoReady(boolean z);

        void onSuccess(List<String> list);

        public static final class DefaultImpls {
            public static /* synthetic */ void onError$default(ImageDownloadListener imageDownloadListener, int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult, int i2, Object obj) {
                if (obj == null) {
                    if ((i2 & 8) != 0) {
                        videoDownloadPartialResult = null;
                    }
                    imageDownloadListener.onError(i, str, exc, videoDownloadPartialResult);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
            }
        }
    }
}
