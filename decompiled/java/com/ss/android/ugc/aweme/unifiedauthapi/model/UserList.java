package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class UserList implements Serializable {

    @C09CT("hide_1st_avatar")
    public boolean hide1stAvatar;

    @C09CT("hide_1st_right_ic")
    public boolean hide1stRightIc;

    @C09CT("hide_2nd_user")
    public boolean hide2ndUser;

    @C09CT("hide_tt_ic_small")
    public boolean hideTTIcSmall;

    @C09CT("show_online_circle")
    public boolean showOnlineCircle;

    @C09CT("show_search_ic")
    public boolean showSearchIc;

    @C09CT("show_tt_ic")
    public boolean showTTIc;

    @C09CT("user_1st_right_ic_height")
    public int user1RightIcHeight;

    @C09CT("user_1st_right_margin_end")
    public Integer user1RightIcMarginEnd;

    @C09CT("user_1st_right_margin_top")
    public Integer user1RightIcMarginTop;

    @C09CT("user_1st_right_ic_name")
    public String user1RightIcName;

    @C09CT("user_1st_right_ic_raw_id")
    public int user1RightIcRawId;

    @C09CT("user_1st_right_ic_res_id")
    public int user1RightIcResId;

    @C09CT("user_1st_right_ic_tint_color_attr_name")
    public String user1RightIcTintName;

    @C09CT("user_1st_right_ic_width")
    public int user1RightIcWidth;

    @C09CT("user_1st_top_margin")
    public double user1TopMargin;

    @C09CT("user_2nd_right_ic_name")
    public String user2RightIcName;

    @C09CT("user_2nd_right_ic_raw_id")
    public int user2RightIcRawId;

    @C09CT("user_2nd_right_ic_res_id")
    public int user2RightIcResId;

    public UserList() {
        this(false, false, false, false, false, false, -1, -1, null, 0, 0, null, null, -1, -1, null, null, false, -1.0d);
    }

    public int hashCode() {
        int iZ2 = ((((((((((((((C786410Ut5.Z2(this.showSearchIc) * 31) + C786410Ut5.Z2(this.showTTIc)) * 31) + C786410Ut5.Z2(this.hideTTIcSmall)) * 31) + C786410Ut5.Z2(this.showOnlineCircle)) * 31) + C786410Ut5.Z2(this.hide1stRightIc)) * 31) + C786410Ut5.Z2(this.hide1stAvatar)) * 31) + this.user1RightIcRawId) * 31) + this.user2RightIcRawId) * 31;
        String str = this.user1RightIcTintName;
        int iHashCode = (((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + this.user1RightIcWidth) * 31) + this.user1RightIcHeight) * 31;
        Integer num = this.user1RightIcMarginTop;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.user1RightIcMarginEnd;
        int iHashCode3 = (((((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.user1RightIcResId) * 31) + this.user2RightIcResId) * 31;
        String str2 = this.user1RightIcName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.user2RightIcName;
        return ((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.hide2ndUser)) * 31) + C786410Ut5.X2(this.user1TopMargin);
    }

    public String toString() {
        return "UserList(showSearchIc=" + this.showSearchIc + ", showTTIc=" + this.showTTIc + ", hideTTIcSmall=" + this.hideTTIcSmall + ", showOnlineCircle=" + this.showOnlineCircle + ", hide1stRightIc=" + this.hide1stRightIc + ", hide1stAvatar=" + this.hide1stAvatar + ", user1RightIcRawId=" + this.user1RightIcRawId + ", user2RightIcRawId=" + this.user2RightIcRawId + ", user1RightIcTintName=" + this.user1RightIcTintName + ", user1RightIcWidth=" + this.user1RightIcWidth + ", user1RightIcHeight=" + this.user1RightIcHeight + ", user1RightIcMarginTop=" + this.user1RightIcMarginTop + ", user1RightIcMarginEnd=" + this.user1RightIcMarginEnd + ", user1RightIcResId=" + this.user1RightIcResId + ", user2RightIcResId=" + this.user2RightIcResId + ", user1RightIcName=" + this.user1RightIcName + ", user2RightIcName=" + this.user2RightIcName + ", hide2ndUser=" + this.hide2ndUser + ", user1TopMargin=" + this.user1TopMargin + ')';
    }

    public final void setHide1stAvatar(boolean z) {
        this.hide1stAvatar = z;
    }

    public final void setHide1stRightIc(boolean z) {
        this.hide1stRightIc = z;
    }

    public final void setHide2ndUser(boolean z) {
        this.hide2ndUser = z;
    }

    public final void setHideTTIcSmall(boolean z) {
        this.hideTTIcSmall = z;
    }

    public final void setShowOnlineCircle(boolean z) {
        this.showOnlineCircle = z;
    }

    public final void setShowSearchIc(boolean z) {
        this.showSearchIc = z;
    }

    public final void setShowTTIc(boolean z) {
        this.showTTIc = z;
    }

    public final void setUser1RightIcHeight(int i) {
        this.user1RightIcHeight = i;
    }

    public final void setUser1RightIcMarginEnd(Integer num) {
        this.user1RightIcMarginEnd = num;
    }

    public final void setUser1RightIcMarginTop(Integer num) {
        this.user1RightIcMarginTop = num;
    }

    public final void setUser1RightIcName(String str) {
        this.user1RightIcName = str;
    }

    public final void setUser1RightIcRawId(int i) {
        this.user1RightIcRawId = i;
    }

    public final void setUser1RightIcResId(int i) {
        this.user1RightIcResId = i;
    }

    public final void setUser1RightIcTintName(String str) {
        this.user1RightIcTintName = str;
    }

    public final void setUser1RightIcWidth(int i) {
        this.user1RightIcWidth = i;
    }

    public final void setUser1TopMargin(double d) {
        this.user1TopMargin = d;
    }

    public final void setUser2RightIcName(String str) {
        this.user2RightIcName = str;
    }

    public final void setUser2RightIcRawId(int i) {
        this.user2RightIcRawId = i;
    }

    public final void setUser2RightIcResId(int i) {
        this.user2RightIcResId = i;
    }

    public UserList(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, String str, int i3, int i4, Integer num, Integer num2, int i5, int i6, String str2, String str3, boolean z7, double d) {
        this.showSearchIc = z;
        this.showTTIc = z2;
        this.hideTTIcSmall = z3;
        this.showOnlineCircle = z4;
        this.hide1stRightIc = z5;
        this.hide1stAvatar = z6;
        this.user1RightIcRawId = i;
        this.user2RightIcRawId = i2;
        this.user1RightIcTintName = str;
        this.user1RightIcWidth = i3;
        this.user1RightIcHeight = i4;
        this.user1RightIcMarginTop = num;
        this.user1RightIcMarginEnd = num2;
        this.user1RightIcResId = i5;
        this.user2RightIcResId = i6;
        this.user1RightIcName = str2;
        this.user2RightIcName = str3;
        this.hide2ndUser = z7;
        this.user1TopMargin = d;
    }
}
