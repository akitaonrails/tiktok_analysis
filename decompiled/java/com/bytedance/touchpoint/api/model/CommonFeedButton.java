package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class CommonFeedButton extends C1893670zNV {

    @C09CT("action_type")
    public final String actionType;

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("dismiss_after")
    public final int dismissAfter;

    @C09CT("follow_info")
    public final FollowInfo followInfo;

    @C09CT("icon")
    public final String icon;

    @C09CT("jump_link")
    public final String jumpLink;

    @C09CT("priority")
    public final int priority;

    @C09CT("show_times")
    public final int showTimes;

    @C09CT("title")
    public final Title title;

    @C09CT("video_ids")
    public final List<String> videoIds;

    public CommonFeedButton() {
        this(null, null, null, 0, 0, 0, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonFeedButton)) {
            return false;
        }
        CommonFeedButton commonFeedButton = (CommonFeedButton) obj;
        return Intrinsics.LJFF(this.actionType, commonFeedButton.actionType) && Intrinsics.LJFF(this.jumpLink, commonFeedButton.jumpLink) && Intrinsics.LJFF(this.videoIds, commonFeedButton.videoIds) && this.priority == commonFeedButton.priority && this.showTimes == commonFeedButton.showTimes && this.dismissAfter == commonFeedButton.dismissAfter && Intrinsics.LJFF(this.title, commonFeedButton.title) && Intrinsics.LJFF(this.backgroundColor, commonFeedButton.backgroundColor) && Intrinsics.LJFF(this.icon, commonFeedButton.icon) && Intrinsics.LJFF(this.followInfo, commonFeedButton.followInfo);
    }

    public final int hashCode() {
        String str = this.actionType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jumpLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.videoIds;
        int iHashCode3 = (((((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.priority) * 31) + this.showTimes) * 31) + this.dismissAfter) * 31;
        Title title = this.title;
        int iHashCode4 = (iHashCode3 + (title == null ? 0 : title.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FollowInfo followInfo = this.followInfo;
        return iHashCode6 + (followInfo != null ? followInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonFeedButton(actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(", jumpLink=");
        sbLIZ.append(this.jumpLink);
        sbLIZ.append(", videoIds=");
        sbLIZ.append(this.videoIds);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", showTimes=");
        sbLIZ.append(this.showTimes);
        sbLIZ.append(", dismissAfter=");
        sbLIZ.append(this.dismissAfter);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", followInfo=");
        sbLIZ.append(this.followInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommonFeedButton(String str, String str2, List<String> list, int i, int i2, int i3, Title title, String str3, String str4, FollowInfo followInfo) {
        this.actionType = str;
        this.jumpLink = str2;
        this.videoIds = list;
        this.priority = i;
        this.showTimes = i2;
        this.dismissAfter = i3;
        this.title = title;
        this.backgroundColor = str3;
        this.icon = str4;
        this.followInfo = followInfo;
    }
}
