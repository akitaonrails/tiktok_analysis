package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SearchPullFeedbackOptions {

    @C09CT("top_tab")
    public List<String> topTab = new ArrayList();

    @C09CT("user_tab")
    public List<String> userTab = new ArrayList();

    @C09CT("sound_tab")
    public List<String> soundTab = new ArrayList();

    @C09CT("hashtag_tab")
    public List<String> hashtagTab = new ArrayList();

    @C09CT("video_tab")
    public List<String> videoTab = new ArrayList();

    public List<String> getHashtagTab() {
        return this.hashtagTab;
    }

    public List<String> getSoundTab() {
        return this.soundTab;
    }

    public List<String> getTopTab() {
        return this.topTab;
    }

    public List<String> getUserTab() {
        return this.userTab;
    }

    public List<String> getVideoTab() {
        return this.videoTab;
    }
}
