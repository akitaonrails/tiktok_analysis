package com.ss.android.ugc.aweme.discover.model;

import X.AbstractC2126608Uu;
import X.C09CS;
import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class TrendingTopic extends AbstractC2126608Uu implements Serializable, LazyDeserializeItem {

    @C09CT("ad_data")
    @C09CS(StringJsonAdapterFactory.class)
    public final TrendingTopicsAdInfo adData;

    @C09CT("creator_info")
    public final User author;

    @C09CT("category_type")
    public final int categoryType;

    @C09CT("challenge_info")
    public final Challenge challenge;

    @C09CT("desc")
    public final String desc;

    @C09CT("effect_info")
    public final NewFaceStickerBean effect;

    @C09CT("aweme_list")
    public final List<Aweme> items;

    @C09CT("music_info")
    public final Music music;
    public transient boolean needToBeSupplied;

    @C09CT("word_record")
    public final Word word;

    public TrendingTopic() {
        this(0, null, null, null, null, null, "", null, null);
    }

    public final TrendingTopic copy(int i, List<? extends Aweme> list, Challenge challenge, Music music, NewFaceStickerBean newFaceStickerBean, User user, String str, Word word, TrendingTopicsAdInfo trendingTopicsAdInfo) {
        return new TrendingTopic(i, list, challenge, music, newFaceStickerBean, user, str, word, trendingTopicsAdInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingTopic)) {
            return false;
        }
        TrendingTopic trendingTopic = (TrendingTopic) obj;
        return this.categoryType == trendingTopic.categoryType && Intrinsics.LJFF(this.items, trendingTopic.items) && Intrinsics.LJFF(this.challenge, trendingTopic.challenge) && Intrinsics.LJFF(this.music, trendingTopic.music) && Intrinsics.LJFF(this.effect, trendingTopic.effect) && Intrinsics.LJFF(this.author, trendingTopic.author) && Intrinsics.LJFF(this.desc, trendingTopic.desc) && Intrinsics.LJFF(this.word, trendingTopic.word) && Intrinsics.LJFF(this.adData, trendingTopic.adData);
    }

    public int hashCode() {
        int i = this.categoryType * 31;
        List<Aweme> list = this.items;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        Challenge challenge = this.challenge;
        int iHashCode2 = (iHashCode + (challenge == null ? 0 : challenge.hashCode())) * 31;
        Music music = this.music;
        int iHashCode3 = (iHashCode2 + (music == null ? 0 : music.hashCode())) * 31;
        NewFaceStickerBean newFaceStickerBean = this.effect;
        int iHashCode4 = (iHashCode3 + (newFaceStickerBean == null ? 0 : newFaceStickerBean.hashCode())) * 31;
        User user = this.author;
        int iHashCode5 = (((iHashCode4 + (user == null ? 0 : user.hashCode())) * 31) + this.desc.hashCode()) * 31;
        Word word = this.word;
        int iHashCode6 = (iHashCode5 + (word == null ? 0 : word.hashCode())) * 31;
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        return iHashCode6 + (trendingTopicsAdInfo != null ? trendingTopicsAdInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrendingTopic(categoryType=");
        sbLIZ.append(this.categoryType);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", challenge=");
        sbLIZ.append(this.challenge);
        sbLIZ.append(", music=");
        sbLIZ.append(this.music);
        sbLIZ.append(", effect=");
        sbLIZ.append(this.effect);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", word=");
        sbLIZ.append(this.word);
        sbLIZ.append(", adData=");
        sbLIZ.append(this.adData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final UrlModel getClickTrackUrlList() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.clickTrackUrlList;
        }
        return null;
    }

    public final long getCreativeId() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.creativeId;
        }
        return 0L;
    }

    public final String getLogExtra() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.logExtra;
        }
        return null;
    }

    public final UrlModel getTrackUrlList() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.trackUrlList;
        }
        return null;
    }

    public final boolean isAd() {
        return this.adData != null;
    }

    public final boolean isChallenge() {
        return this.challenge != null;
    }

    public final boolean isMusic() {
        return this.music != null;
    }

    public final boolean isChallengeAd() {
        return isAd() && this.challenge != null;
    }

    public final boolean isPicAd() {
        return isAd() && this.challenge == null;
    }

    public final TrendingTopicsAdInfo getAdData() {
        return this.adData;
    }

    public final User getAuthor() {
        return this.author;
    }

    public final int getCategoryType() {
        return this.categoryType;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final NewFaceStickerBean getEffect() {
        return this.effect;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final Music getMusic() {
        return this.music;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyDeserializeItem
    public boolean getNeedToBeSupplied() {
        return this.needToBeSupplied;
    }

    public final Word getWord() {
        return this.word;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyDeserializeItem
    public void setNeedToBeSupplied(boolean z) {
        this.needToBeSupplied = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTopic(int i, List<? extends Aweme> list, Challenge challenge, Music music, NewFaceStickerBean newFaceStickerBean, User user, String str, Word word, TrendingTopicsAdInfo trendingTopicsAdInfo) {
        this.categoryType = i;
        this.items = list;
        this.challenge = challenge;
        this.music = music;
        this.effect = newFaceStickerBean;
        this.author = user;
        this.desc = str;
        this.word = word;
        this.adData = trendingTopicsAdInfo;
    }
}
