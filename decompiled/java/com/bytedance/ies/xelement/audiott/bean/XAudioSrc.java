package com.bytedance.ies.xelement.audiott.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes34.dex */
public final class XAudioSrc {

    @C09CT("play_model")
    public final PlayModel playModel;

    @C09CT("play_url")
    public final String playUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String songId;

    public XAudioSrc() {
        this("", "", null);
    }

    public final PlayModel getPlayModel() {
        return this.playModel;
    }

    public final String getPlayUrl() {
        return this.playUrl;
    }

    public final String getSongId() {
        return this.songId;
    }

    public XAudioSrc(String str, String str2, PlayModel playModel) {
        this.songId = str;
        this.playUrl = str2;
        this.playModel = playModel;
    }
}
