package com.ss.android.ugc.aweme.social.creation.edit.serviceimpl;

import X.C095D;
import X.C0MML;
import X.C567140MMe;
import X.C567150MMf;
import X.C567160MMg;
import X.C567170MMh;
import X.C567320MMw;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.social.creation.api.IMediaDownloadService;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaDownloadServiceImpl implements IMediaDownloadService {
    public final C567320MMw LIZ = new C567320MMw();

    @Override // com.ss.android.ugc.aweme.social.creation.api.IMediaDownloadService
    public final C095D LIZIZ(ForwardMedia forwardMedia, ForwardMediaDownloader.DownloadConfig downloadConfig) {
        C567320MMw c567320MMw = this.LIZ;
        c567320MMw.getClass();
        return new C095D(new C567160MMg(c567320MMw, downloadConfig, forwardMedia, null));
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.IMediaDownloadService
    public final C095D LIZLLL(CreativeInfo creativeInfo, ForwardMedia forwardMedia) {
        C567320MMw c567320MMw = this.LIZ;
        c567320MMw.getClass();
        return new C095D(new C567170MMh(c567320MMw, forwardMedia, creativeInfo, null));
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.IMediaDownloadService
    public final C095D LIZ(Context context, CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MML c0mml) {
        C567320MMw c567320MMw = this.LIZ;
        c567320MMw.getClass();
        return new C095D(new C567140MMe(c567320MMw, forwardMedia, c0mml, creativeInfo, context, null));
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.IMediaDownloadService
    public final C095D LIZJ(Context context, CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MML c0mml) {
        C567320MMw c567320MMw = this.LIZ;
        c567320MMw.getClass();
        return new C095D(new C567150MMf(c567320MMw, forwardMedia, c0mml, creativeInfo, context, null));
    }
}
