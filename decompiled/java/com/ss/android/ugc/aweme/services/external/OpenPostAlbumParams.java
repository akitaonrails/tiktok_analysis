package com.ss.android.ugc.aweme.services.external;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class OpenPostAlbumParams implements Serializable {

    @C09CT("ai_alive_info")
    public final AIAliveInfo aiAliveInfo;

    @C09CT("delay_guide_show")
    public final boolean delayGuideShow;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("music")
    public final MusicModel music;

    @C09CT("origin_ai_alive_info")
    public final AIAliveInfo originAIAliveInfo;

    @C09CT("shoot_way")
    public final String shootWay;

    public final OpenPostAlbumParams copy(String str, AIAliveInfo aIAliveInfo, String str2, String str3, boolean z, AIAliveInfo aIAliveInfo2, MusicModel musicModel) {
        return new OpenPostAlbumParams(str, aIAliveInfo, str2, str3, z, aIAliveInfo2, musicModel);
    }

    public OpenPostAlbumParams(String str, AIAliveInfo aIAliveInfo, String str2, String str3, boolean z, AIAliveInfo aIAliveInfo2, MusicModel musicModel) {
        this.enterMethod = str;
        this.aiAliveInfo = aIAliveInfo;
        this.shootWay = str2;
        this.enterFrom = str3;
        this.delayGuideShow = z;
        this.originAIAliveInfo = aIAliveInfo2;
        this.music = musicModel;
    }
}
