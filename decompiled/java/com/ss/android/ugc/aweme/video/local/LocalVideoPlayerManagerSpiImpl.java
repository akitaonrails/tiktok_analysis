package com.ss.android.ugc.aweme.video.local;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: loaded from: classes31.dex */
public final class LocalVideoPlayerManagerSpiImpl implements ILocalVideoPlayerManager {
    @Override // com.ss.android.ugc.aweme.video.local.ILocalVideoPlayerManager
    public final void LIZ(Aweme aweme, String str) {
        int i;
        LocalVideoPlayerManager localVideoPlayerManagerLJ = LocalVideoPlayerManager.LJ();
        localVideoPlayerManagerLJ.getClass();
        if (LocalVideoPlayerManager.LJFF() && aweme != null) {
            localVideoPlayerManagerLJ.LIZ();
            String aid = aweme.getAid();
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            boolean zIsVr = aweme.isVr();
            Video video = aweme.getVideo();
            LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel(aid);
            localVideoUrlModel.authorId = authorUid;
            localVideoUrlModel.setVr(zIsVr);
            if (video != null) {
                localVideoUrlModel.setDuration(video.getDuration());
                localVideoUrlModel.setWidth(video.getWidth());
                localVideoUrlModel.setHeight(video.getHeight());
                if (video.getProperPlayAddr() != null) {
                    localVideoUrlModel.setUri(video.getProperPlayAddr().getUri());
                    if (video.getPlayAddrBytevc1() != null) {
                        if (video.getPlayAddrBytevc1() != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        localVideoUrlModel.setCodecType(i);
                    }
                }
            }
            localVideoUrlModel.localPath = str;
            localVideoPlayerManagerLJ.LL.LJ(localVideoUrlModel);
            localVideoPlayerManagerLJ.LL.LIZJ = true;
            localVideoPlayerManagerLJ.LJI();
        }
    }
}
