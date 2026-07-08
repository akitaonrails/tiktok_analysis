package com.ss.android.ugc.aweme.feed.model.video;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TranslatedVideo implements Serializable {

    @C09CT("lang")
    public String lang;

    @C09CT("language_code")
    public String languageCode;

    @C09CT("show_dubbed_video")
    public Boolean showDubbedVideo;

    @C09CT("video")
    public Video video;

    public final String getLang() {
        return this.lang;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final Boolean getShowDubbedVideo() {
        return this.showDubbedVideo;
    }

    public final Video getVideo() {
        return this.video;
    }

    public final void setLang(String str) {
        this.lang = str;
    }

    public final void setLanguageCode(String str) {
        this.languageCode = str;
    }

    public final void setShowDubbedVideo(Boolean bool) {
        this.showDubbedVideo = bool;
    }

    public final void setVideo(Video video) {
        this.video = video;
    }
}
