package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class CollectMusicResponse extends BaseResponse {
    public int action;

    @C09CT("resso_info")
    public RessoCollectInfo ressoCollectInfo;

    @C09CT("ttmusic_info")
    public TikTokMusicCollectInfo ttmCollectInfo;

    public final int getAction() {
        return this.action;
    }

    public final RessoCollectInfo getRessoCollectInfo() {
        return this.ressoCollectInfo;
    }

    public final TikTokMusicCollectInfo getTtmCollectInfo() {
        return this.ttmCollectInfo;
    }

    public final void setAction(int i) {
        this.action = i;
    }

    public final void setRessoCollectInfo(RessoCollectInfo ressoCollectInfo) {
        this.ressoCollectInfo = ressoCollectInfo;
    }

    public final void setTtmCollectInfo(TikTokMusicCollectInfo tikTokMusicCollectInfo) {
        this.ttmCollectInfo = tikTokMusicCollectInfo;
    }
}
