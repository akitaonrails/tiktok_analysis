package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class Movie implements Serializable {

    @C09CT("challenge_id")
    public String challengeId;

    @C09CT("cid")
    public String cid;

    @C09CT("dtime")
    public String dtime;

    @C09CT("episodes")
    public int episodes;

    @C09CT("img")
    public String img;

    @C09CT("is_medium_anchor")
    public Boolean isMediumAnchor;
    public boolean isNewStyleCard;

    @C09CT("is_collect")
    public boolean is_collect;

    @C09CT("light_app_tickets_url")
    public String light_app_tickets_url;

    @C09CT("light_app_url")
    public String light_app_url;

    @C09CT("loc")
    public String loc;

    @C09CT("maoyan_score")
    public String maoyan_score;

    @C09CT("maoyan_score_url")
    public String maoyan_score_url;

    @C09CT("medium_type")
    public int medium_type;

    @C09CT("medium_ui_style")
    public int medium_ui_style = -1;

    @C09CT("rank")
    public String rank;

    @C09CT("rate_text")
    public String rateText;

    @C09CT("schema")
    public String schema;

    @C09CT("showurl")
    public String showurl;

    @C09CT("stat")
    public Integer stat;

    @C09CT("stat_text")
    public String statText;

    @C09CT("title")
    public String title;

    @C09CT("tmaid")
    public String tmaid;

    @C09CT("type")
    public String type;

    @C09CT("url")
    public String url;

    @C09CT("wish")
    public Integer wish;

    public final float getMaoyanScore() {
        String str = this.maoyan_score;
        if (str == null) {
            return 0.0f;
        }
        try {
            return CastFloatProtector.parseFloat(str) / 2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0.0f;
        }
    }

    public final int getMedium_ui_style() {
        int i = this.medium_ui_style;
        if (i != -1) {
            return i;
        }
        int i2 = this.medium_type;
        if (i2 == 1 || i2 == 9) {
            return 1;
        }
        return (i2 == 4 || i2 == 8) ? 2 : 0;
    }

    public final int getMovieRank() {
        String str = this.rank;
        if (str == null) {
            return 0;
        }
        try {
            return CastIntegerProtector.parseInt(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public final boolean isMovie() {
        return this.medium_type == 3;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getDtime() {
        return this.dtime;
    }

    public final int getEpisodes() {
        return this.episodes;
    }

    public final String getImg() {
        return this.img;
    }

    public final String getLight_app_tickets_url() {
        return this.light_app_tickets_url;
    }

    public final String getLight_app_url() {
        return this.light_app_url;
    }

    public final String getLoc() {
        return this.loc;
    }

    public final String getMaoyan_score() {
        return this.maoyan_score;
    }

    public final String getMaoyan_score_url() {
        return this.maoyan_score_url;
    }

    public final int getMedium_type() {
        return this.medium_type;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getRateText() {
        return this.rateText;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getShowurl() {
        return this.showurl;
    }

    public final Integer getStat() {
        return this.stat;
    }

    public final String getStatText() {
        return this.statText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTmaid() {
        return this.tmaid;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getWish() {
        return this.wish;
    }

    public final Boolean isMediumAnchor() {
        return this.isMediumAnchor;
    }

    public final boolean isNewStyleCard() {
        return this.isNewStyleCard;
    }

    public final boolean is_collect() {
        return this.is_collect;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setDtime(String str) {
        this.dtime = str;
    }

    public final void setEpisodes(int i) {
        this.episodes = i;
    }

    public final void setImg(String str) {
        this.img = str;
    }

    public final void setLight_app_tickets_url(String str) {
        this.light_app_tickets_url = str;
    }

    public final void setLight_app_url(String str) {
        this.light_app_url = str;
    }

    public final void setLoc(String str) {
        this.loc = str;
    }

    public final void setMaoyan_score(String str) {
        this.maoyan_score = str;
    }

    public final void setMaoyan_score_url(String str) {
        this.maoyan_score_url = str;
    }

    public final void setMediumAnchor(Boolean bool) {
        this.isMediumAnchor = bool;
    }

    public final void setMedium_type(int i) {
        this.medium_type = i;
    }

    public final void setMedium_ui_style(int i) {
        this.medium_ui_style = i;
    }

    public final void setNewStyleCard(boolean z) {
        this.isNewStyleCard = z;
    }

    public final void setRank(String str) {
        this.rank = str;
    }

    public final void setRateText(String str) {
        this.rateText = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setShowurl(String str) {
        this.showurl = str;
    }

    public final void setStat(Integer num) {
        this.stat = num;
    }

    public final void setStatText(String str) {
        this.statText = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTmaid(String str) {
        this.tmaid = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setWish(Integer num) {
        this.wish = num;
    }

    public final void set_collect(boolean z) {
        this.is_collect = z;
    }
}
