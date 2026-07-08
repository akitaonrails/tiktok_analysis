package com.ss.android.ugc.aweme.services.story.forward;

import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;

/* JADX INFO: loaded from: classes9.dex */
public class EmptyDownloadListener implements ForwardMediaDownloader.DownloadListener {
    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public void onFileHeaderInfoReady(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public void onSuccess(String str) {
    }
}
