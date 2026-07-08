package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicGroup implements Serializable {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("similar_music_list")
    public final List<Music> similarMusics;

    @C09CT("music")
    public final Music sourceMusic;

    @C09CT("source_music_id")
    public final String sourceMusicId;

    public MusicGroup() {
        this("", null, new ArrayList(), "", null);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final String getId() {
        return this.id;
    }

    public final List<Music> getSimilarMusics() {
        return this.similarMusics;
    }

    public final Music getSourceMusic() {
        return this.sourceMusic;
    }

    public final String getSourceMusicId() {
        return this.sourceMusicId;
    }

    public boolean equals(Object obj) {
        MusicGroup musicGroup;
        String str = null;
        if ((obj instanceof MusicGroup) && (musicGroup = (MusicGroup) obj) != null) {
            str = musicGroup.id;
        }
        return Intrinsics.LJFF(str, this.id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicGroup(String str, Music music, List<Music> list, String str2, List<? extends Aweme> list2) {
        this.id = str;
        this.sourceMusic = music;
        this.similarMusics = list;
        this.sourceMusicId = str2;
        this.awemeList = list2;
    }
}
