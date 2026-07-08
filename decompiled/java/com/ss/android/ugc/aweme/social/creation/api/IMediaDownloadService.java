package com.ss.android.ugc.aweme.social.creation.api;

import X.C095D;
import X.C0MML;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;

/* JADX INFO: loaded from: classes9.dex */
public interface IMediaDownloadService {
    C095D LIZ(Context context, CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MML c0mml);

    C095D LIZIZ(ForwardMedia forwardMedia, ForwardMediaDownloader.DownloadConfig downloadConfig);

    C095D LIZJ(Context context, CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MML c0mml);

    C095D LIZLLL(CreativeInfo creativeInfo, ForwardMedia forwardMedia);
}
