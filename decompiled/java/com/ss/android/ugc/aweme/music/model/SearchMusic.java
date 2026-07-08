package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.DynamicMusicModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class SearchMusic implements Serializable {

    @C09CT("aweme_list")
    public List<? extends Aweme> awemeList;

    @C09CT("card_type")
    public int cardType = 1;

    @C09CT("has_more")
    public boolean hasMore;
    public LogPbBean logPb;

    @C09CT("dynamic_patch")
    public DynamicPatch mDynamicPatch;

    @C09CT("music")
    public Music music;

    @C09CT("type")
    public int type;

    public MusicModel convertToMusicModel() {
        if (this.type != 999 || this.mDynamicPatch == null) {
            Music music = this.music;
            return music != null ? music.convertToMusicModel() : new MusicModel();
        }
        DynamicMusicModel dynamicMusicModel = new DynamicMusicModel();
        dynamicMusicModel.setDynamicPatch(this.mDynamicPatch);
        return dynamicMusicModel;
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final DynamicPatch getMDynamicPatch() {
        return this.mDynamicPatch;
    }

    public final Music getMusic() {
        return this.music;
    }

    public final int getType() {
        return this.type;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setMDynamicPatch(DynamicPatch dynamicPatch) {
        this.mDynamicPatch = dynamicPatch;
    }

    public final void setMusic(Music music) {
        this.music = music;
    }

    public final void setRequestId(String str) {
        Music music = this.music;
        if (music != null) {
            music.requestId = str;
        }
    }

    public final void setType(int i) {
        this.type = i;
    }
}
