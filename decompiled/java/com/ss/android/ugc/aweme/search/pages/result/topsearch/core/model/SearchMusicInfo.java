package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C654080Pl8;
import X.EnumC654060Pl6;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicInfo implements Serializable {

    @C09CT("album")
    public final String album;

    @C09CT("artists")
    public final List<SearchMusicArtistInfo> artists;

    @C09CT("audition_duration")
    public final Integer auditionDuration;

    @C09CT("author")
    public final String author;

    @C09CT("cover_thumb")
    public final UrlModel coverThumb;

    @C09CT("duration")
    public final Integer duration;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long id;

    @C09CT("id_str")
    public final String idStr;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer musicStatus;

    @C09CT("play_url")
    public final UrlModel playUrl;

    @C09CT("shoot_duration")
    public final Integer shootDuration;

    @C09CT("title")
    public final String title;

    @C09CT("user_count")
    public final int userCount;

    public final Music toMusic() {
        List<SearchMusicArtistInfo> list = this.artists;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (SearchMusicArtistInfo searchMusicArtistInfo : list) {
            MusicOwnerInfo musicOwnerInfo = new MusicOwnerInfo();
            musicOwnerInfo.setNickName(searchMusicArtistInfo.nickName);
            arrayList.add(musicOwnerInfo);
        }
        List<MusicOwnerInfo> listLLIIII = C13LP.LLIIII(arrayList);
        Music music = new Music();
        Long l = this.id;
        music.setId(l != null ? l.longValue() : 0L);
        music.setIdStr(this.idStr);
        music.setMusicName(this.title);
        music.setAlbum(this.album);
        music.setCoverThumb(this.coverThumb);
        music.setPlayUrl(this.playUrl);
        music.setMusicOwnerInfos(listLLIIII);
        Integer num = this.musicStatus;
        music.setMusicStatus(num != null ? num.intValue() : 0);
        Integer num2 = this.duration;
        music.setDuration(num2 != null ? num2.intValue() : 0);
        Integer num3 = this.auditionDuration;
        music.setAuditionDuration(Integer.valueOf(num3 != null ? num3.intValue() : 0));
        Integer num4 = this.shootDuration;
        music.setShootDuration(Integer.valueOf(num4 != null ? num4.intValue() : 0));
        music.setPgc(true);
        music.setUserCount(this.userCount);
        music.setAuthorName(this.author);
        return music;
    }

    public final C654080Pl8 toSearchHubMobParams(String str, int i, String str2) {
        String str3 = str;
        String str4 = this.idStr;
        if (str3 == null) {
            str3 = "";
        }
        return new C654080Pl8(str4, str3, "", EnumC654060Pl6.MUSIC, i, 0, str2);
    }

    public SearchMusicInfo(Long l, String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, List<SearchMusicArtistInfo> list, Integer num, Integer num2, Integer num3, Integer num4, int i, String str4) {
        this.id = l;
        this.idStr = str;
        this.title = str2;
        this.album = str3;
        this.coverThumb = urlModel;
        this.playUrl = urlModel2;
        this.artists = list;
        this.musicStatus = num;
        this.duration = num2;
        this.auditionDuration = num3;
        this.shootDuration = num4;
        this.userCount = i;
        this.author = str4;
    }

    public SearchMusicInfo(Long l, String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, List list, Integer num, Integer num2, Integer num3, Integer num4, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? null : urlModel, (i2 & 32) != 0 ? null : urlModel2, (i2 & 64) != 0 ? C13BV.INSTANCE : list, num, num2, num3, num4, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str4 : null);
    }
}
