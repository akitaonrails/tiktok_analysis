package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C2188811AlT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MatchedPGCSoundInfo implements Serializable {

    @C09CT("author")
    public String author;

    @C09CT("cover_medium")
    public UrlModel coverMedium;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("uncert_artists")
    public List<UncertMusicOwnerInfo> mUncertMusicOwnerInfos;

    @C09CT("mixed_author")
    public String mixedAuthor;

    @C09CT("mixed_title")
    public String mixedTitle;

    @C09CT("artist_infos")
    public List<MusicOwnerInfo> musicOwnerInfos;

    @C09CT("music_release_info")
    public MusicReleaseInfo musicReleaseInfo;

    @C09CT("title")
    public String title;

    public String getShowInfo() {
        if (TextUtils.isEmpty(this.title) && TextUtils.isEmpty(this.author)) {
            return "";
        }
        if (TextUtils.isEmpty(this.title)) {
            return this.author;
        }
        if (TextUtils.isEmpty(this.author)) {
            return this.title;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.title);
        sbLIZ.append(" - ");
        sbLIZ.append(this.author);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getAuthor() {
        return this.author;
    }

    public UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public String getId() {
        return this.id;
    }

    public String getMixedAuthor() {
        return this.mixedAuthor;
    }

    public String getMixedTitle() {
        return this.mixedTitle;
    }

    public List<MusicOwnerInfo> getMusicOwnerInfos() {
        return this.musicOwnerInfos;
    }

    public MusicReleaseInfo getMusicReleaseInfo() {
        return this.musicReleaseInfo;
    }

    public String getTitle() {
        return this.title;
    }

    public List<UncertMusicOwnerInfo> getUncertMusicOwnerInfos() {
        return this.mUncertMusicOwnerInfos;
    }
}
