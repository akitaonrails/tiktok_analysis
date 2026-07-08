package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MatchedSoundInfo implements Serializable {

    @C09CT("author")
    public String author;

    @C09CT("chorus_info")
    public MusicChorusInfo chorusInfo;

    @C09CT("cover_medium")
    public UrlModel coverMedium;

    @C09CT("full_duration")
    public Long fullDuration;

    @C09CT("h5_url")
    public String h5Url;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("label_ids")
    public List<Integer> labelIds;

    @C09CT("performers")
    public List<MusicPerformer> performers;

    @C09CT("title")
    public String title;

    public final String getAuthor() {
        return this.author;
    }

    public final MusicChorusInfo getChorusInfo() {
        return this.chorusInfo;
    }

    public final UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public final Long getFullDuration() {
        return this.fullDuration;
    }

    public final String getH5Url() {
        return this.h5Url;
    }

    public final String getId() {
        return this.id;
    }

    public final List<Integer> getLabelIds() {
        return this.labelIds;
    }

    public final List<MusicPerformer> getPerformers() {
        return this.performers;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final void setChorusInfo(MusicChorusInfo musicChorusInfo) {
        this.chorusInfo = musicChorusInfo;
    }

    public final void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public final void setFullDuration(Long l) {
        this.fullDuration = l;
    }

    public final void setH5Url(String str) {
        this.h5Url = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLabelIds(List<Integer> list) {
        this.labelIds = list;
    }

    public final void setPerformers(List<MusicPerformer> list) {
        this.performers = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
