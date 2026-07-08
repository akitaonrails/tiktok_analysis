package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class BlueVBrandInfo implements Serializable {

    @C09CT("brand_id")
    public int brandId;

    @C09CT("brand_name")
    public String brandName;

    @C09CT("category_id")
    public int categoryId;

    @C09CT("category_name")
    public String categoryName;

    @C09CT("heat")
    public long heat;

    @C09CT("logo_url")
    public UrlModel logoUrl;

    @C09CT("rank")
    public int rank;

    @C09CT("rank_diff")
    public int rankDiff;

    @C09CT("tag_name")
    public String tagName;

    public int getBrandId() {
        return this.brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public long getHeat() {
        return this.heat;
    }

    public UrlModel getLogoUrl() {
        return this.logoUrl;
    }

    public int getRank() {
        return this.rank;
    }

    public int getRankDiff() {
        return this.rankDiff;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setBrandId(int i) {
        this.brandId = i;
    }

    public void setBrandName(String str) {
        this.brandName = str;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setHeat(long j) {
        this.heat = j;
    }

    public void setLogoUrl(UrlModel urlModel) {
        this.logoUrl = urlModel;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setRankDiff(int i) {
        this.rankDiff = i;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }
}
