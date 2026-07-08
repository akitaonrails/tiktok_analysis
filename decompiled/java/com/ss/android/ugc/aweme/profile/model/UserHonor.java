package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public class UserHonor implements Serializable {

    @C09CT("now_diamond")
    public long currentDiamond;

    @C09CT("icon")
    public UrlModel currentHonorIcon;

    @C09CT("name")
    public String currentHonorName;

    @C09CT("diamond_icon")
    public UrlModel diamondIcon;

    @C09CT("im_icon")
    public UrlModel imIcon;

    @C09CT("level")
    public int level;

    @C09CT("live_icon")
    public UrlModel liveIcon;

    @C09CT("next_diamond")
    public long nextDiamond;

    @C09CT("next_icon")
    public UrlModel nextHonorIcon;

    @C09CT("next_name")
    public String nextHonorName;

    @C09CT("total_diamond_count")
    public long totalDiamond;

    public long getCurrentDiamond() {
        return this.currentDiamond;
    }

    public UrlModel getCurrentHonorIcon() {
        return this.currentHonorIcon;
    }

    public String getCurrentHonorName() {
        return this.currentHonorName;
    }

    public UrlModel getDiamondIcon() {
        return this.diamondIcon;
    }

    public UrlModel getImIcon() {
        return this.imIcon;
    }

    public int getLevel() {
        return this.level;
    }

    public UrlModel getLiveIcon() {
        return this.liveIcon;
    }

    public long getNextDiamond() {
        return this.nextDiamond;
    }

    public UrlModel getNextHonorIcon() {
        return this.nextHonorIcon;
    }

    public String getNextHonorName() {
        return this.nextHonorName;
    }

    public long getTotalDiamond() {
        return this.totalDiamond;
    }

    public void setCurrentDiamond(long j) {
        this.currentDiamond = j;
    }

    public void setCurrentHonorIcon(UrlModel urlModel) {
        this.currentHonorIcon = urlModel;
    }

    public void setCurrentHonorName(String str) {
        this.currentHonorName = str;
    }

    public void setDiamondIcon(UrlModel urlModel) {
        this.diamondIcon = urlModel;
    }

    public void setImIcon(UrlModel urlModel) {
        this.imIcon = urlModel;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setLiveIcon(UrlModel urlModel) {
        this.liveIcon = urlModel;
    }

    public void setNextDiamond(long j) {
        this.nextDiamond = j;
    }

    public void setNextHonorIcon(UrlModel urlModel) {
        this.nextHonorIcon = urlModel;
    }

    public void setNextHonorName(String str) {
        this.nextHonorName = str;
    }

    public void setTotalDiamond(long j) {
        this.totalDiamond = j;
    }
}
