package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RoomPrivateInfo {

    @C09CT("deprecated3")
    public Double deprecated3;

    @C09CT("deprecated4")
    public Double deprecated4;

    @C09CT("deprecated5")
    public String deprecated5;

    @C09CT("enter_region_match")
    public EnterRegionMatch enterRegionMatch;

    @C09CT("is_sandbox")
    public Boolean isSandbox;

    @C09CT("laneEnv")
    public String laneenv;

    @C09CT("locale")
    public String locale;

    @C09CT("pre_recorded")
    public int preRecorded;

    @C09CT("recommend_level")
    public Integer recommendLevel;

    @C09CT("region")
    public String region;

    @C09CT("tag_set")
    public String tagSet;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.isSandbox != null) {
            sb.append(", is_sandbox=");
            sb.append(this.isSandbox);
        }
        if (this.enterRegionMatch != null) {
            sb.append(", enter_region_match=");
            sb.append(this.enterRegionMatch);
        }
        if (this.locale != null) {
            sb.append(", locale=");
            sb.append(this.locale);
        }
        if (this.tagSet != null) {
            sb.append(", tag_set=");
            sb.append(this.tagSet);
        }
        if (this.deprecated3 != null) {
            sb.append(", deprecated3=");
            sb.append(this.deprecated3);
        }
        if (this.deprecated4 != null) {
            sb.append(", deprecated4=");
            sb.append(this.deprecated4);
        }
        if (this.deprecated5 != null) {
            sb.append(", deprecated5=");
            sb.append(this.deprecated5);
        }
        if (this.laneenv != null) {
            sb.append(", laneEnv=");
            sb.append(this.laneenv);
        }
        sb.append(", pre_recorded=");
        sb.append(this.preRecorded);
        if (this.region != null) {
            sb.append(", region=");
            sb.append(this.region);
        }
        if (this.recommendLevel != null) {
            sb.append(", recommend_level=");
            sb.append(this.recommendLevel);
        }
        sb.replace(0, 2, "RoomPrivateInfo{");
        sb.append('}');
        return sb.toString();
    }
}
