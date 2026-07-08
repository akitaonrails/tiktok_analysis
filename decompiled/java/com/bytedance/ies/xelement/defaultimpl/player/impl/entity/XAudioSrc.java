package com.bytedance.ies.xelement.defaultimpl.player.impl.entity;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2179261AQq;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class XAudioSrc implements InterfaceC2179261AQq {

    @C09CT("album_title")
    public final String mAlbumName;

    @C09CT("artist")
    public final String mArtistName;

    @C09CT("can_background_play")
    public final Boolean mCanBackgroundPlay;

    @C09CT("artwork_url")
    public final String mCoverUrl;

    @C09CT("playback_duration")
    public final Long mDuration;

    @C09CT("event_data")
    public final Map<String, String> mEventData;

    @C09CT("local_path")
    public final String mLocalPath;

    @C09CT("play_model")
    public final PlayModel mPlayModel;

    @C09CT("play_url")
    public final String mPlayUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String mSongId;

    @C09CT("title")
    public final String mSongName;

    public XAudioSrc() {
        this("", "", "", "", "", "", "", 0L, Boolean.FALSE, null, null);
    }

    @Override // X.InterfaceC2179261AQq
    public String getAlbumName() {
        String str = this.mAlbumName;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC2179261AQq
    public String getArtistName() {
        String str = this.mArtistName;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC2179261AQq
    public String getCoverUrl() {
        String str = this.mCoverUrl;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC2179261AQq
    public long getDuration() {
        Long l = this.mDuration;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public Map<String, String> getExtras() {
        Map<String, String> map = this.mEventData;
        return map == null ? new HashMap() : map;
    }

    @Override // X.InterfaceC2179261AQq
    public String getId() {
        String str = this.mSongId;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC2179261AQq
    public String getLocalPath() {
        String str = this.mLocalPath;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC2179261AQq
    public PlayModel getPlayModel() {
        PlayModel playModel = this.mPlayModel;
        return playModel == null ? new PlayModel("", "", null) : playModel;
    }

    @Override // X.InterfaceC2179261AQq
    public String getPlayUrl() {
        String str = this.mPlayUrl;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC2179261AQq
    public String getSongName() {
        String str = this.mSongName;
        return str == null ? "" : str;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("XAudioDataSource(mSongId=");
        sbLIZ.append(this.mSongId);
        sbLIZ.append(", mSongName=");
        sbLIZ.append(this.mSongName);
        sbLIZ.append(", mCoverUrl=");
        sbLIZ.append(this.mCoverUrl);
        sbLIZ.append(", mArtistName=");
        sbLIZ.append(this.mArtistName);
        sbLIZ.append(", mPlayUrl=");
        sbLIZ.append(this.mPlayUrl);
        sbLIZ.append(", mCoverUrl=");
        sbLIZ.append(this.mCoverUrl);
        sbLIZ.append(", mAlbumName=");
        sbLIZ.append(this.mAlbumName);
        sbLIZ.append(", mDuration=");
        sbLIZ.append(this.mDuration);
        sbLIZ.append(", mCanBackgroundPlay=");
        sbLIZ.append(this.mCanBackgroundPlay);
        sbLIZ.append(", mEventData=");
        sbLIZ.append(this.mEventData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getMAlbumName() {
        return this.mAlbumName;
    }

    public final String getMArtistName() {
        return this.mArtistName;
    }

    public final Boolean getMCanBackgroundPlay() {
        return this.mCanBackgroundPlay;
    }

    public final String getMCoverUrl() {
        return this.mCoverUrl;
    }

    public final Long getMDuration() {
        return this.mDuration;
    }

    public final Map<String, String> getMEventData() {
        return this.mEventData;
    }

    public final String getMLocalPath() {
        return this.mLocalPath;
    }

    public final PlayModel getMPlayModel() {
        return this.mPlayModel;
    }

    public final String getMPlayUrl() {
        return this.mPlayUrl;
    }

    public final String getMSongId() {
        return this.mSongId;
    }

    public final String getMSongName() {
        return this.mSongName;
    }

    public XAudioSrc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Boolean bool, Map<String, String> map, PlayModel playModel) {
        this.mSongId = str;
        this.mSongName = str2;
        this.mCoverUrl = str3;
        this.mArtistName = str4;
        this.mPlayUrl = str5;
        this.mLocalPath = str6;
        this.mAlbumName = str7;
        this.mDuration = l;
        this.mCanBackgroundPlay = bool;
        this.mEventData = map;
        this.mPlayModel = playModel;
    }
}
