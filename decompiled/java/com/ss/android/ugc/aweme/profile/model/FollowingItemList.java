package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class FollowingItemList extends BaseResponse {

    @C09CT("alias_permissions")
    public List<AliasPermissionUserData> aliasPermissions;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("hotsoon_has_more")
    public int hotSoonHasMore;

    @C09CT("hotsoon_text")
    public String hotSoonText;

    @C09CT("max_time")
    public long maxTime;

    @C09CT("min_time")
    public long minTime;

    @C09CT("offset")
    public int offset;

    @C09CT("total")
    public int total;

    @C09CT("vcd_count")
    public int vcdCount;

    @C09CT("followings")
    public List<User> items = new ArrayList();

    @C09CT("show_cut_off")
    public boolean showCutOff = false;

    @C09CT("rec_has_more")
    public boolean recommendHasMore = true;

    @C09CT("next_page_token")
    public String nextPageToken = "";

    public boolean isHotSoonHasMore() {
        return this.hotSoonHasMore == 1;
    }

    public List<AliasPermissionUserData> getAliasPermissions() {
        return this.aliasPermissions;
    }

    public String getHotSoonText() {
        return this.hotSoonText;
    }

    public List<User> getItems() {
        return this.items;
    }

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public int getOffset() {
        return this.offset;
    }

    public boolean getRecommendHasMore() {
        return this.recommendHasMore;
    }

    public int getTotal() {
        return this.total;
    }

    public int getVcdCount() {
        return this.vcdCount;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public boolean isShowCutOff() {
        return this.showCutOff;
    }

    public void setAliasPermissions(List<AliasPermissionUserData> list) {
        this.aliasPermissions = list;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setHotSoonHasMore(int i) {
        this.hotSoonHasMore = i;
    }

    public void setHotSoonText(String str) {
        this.hotSoonText = str;
    }

    public void setItems(List<User> list) {
        this.items = list;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setNextPageToken(String str) {
        this.nextPageToken = str;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setRecommendHasMore(boolean z) {
        this.recommendHasMore = z;
    }

    public void setShowCutOff(boolean z) {
        this.showCutOff = z;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public void setVcdCount(int i) {
        this.vcdCount = i;
    }
}
