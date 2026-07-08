package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicInfo implements Serializable {

    @C09CT("album")
    public String album;

    @C09CT("author")
    public String author;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("play_urls")
    public List<String> playUrls;

    @C09CT("title")
    public String title;

    public MusicInfo() {
        this("", "", "", "", null);
    }

    public final String getAlbum() {
        return this.album;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getPlayUrls() {
        return this.playUrls;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAlbum(String str) {
        this.album = str;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setPlayUrls(List<String> list) {
        this.playUrls = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public MusicInfo(String str, String str2, String str3, String str4, List<String> list) {
        this.author = str;
        this.album = str2;
        this.id = str3;
        this.title = str4;
        this.playUrls = list;
    }
}
