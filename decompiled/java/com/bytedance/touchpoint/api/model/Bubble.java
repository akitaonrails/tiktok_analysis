package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class Bubble extends C1893670zNV {
    public String LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;

    @C09CT("bubble_id")
    public String bubbleId;

    @C09CT("bubble_type")
    public int bubbleType;

    @C09CT("content_struct")
    public Title contentStruct;

    @C09CT("highlight_content")
    public String highlightContent;

    @C09CT("highlight_content_struct")
    public Title highlightContentStruct;

    @C09CT("jump_link")
    public String jumpLink;

    @C09CT("long_content")
    public String longContent;

    @C09CT("notification_id")
    public String notificationId;

    @C09CT("notification_name")
    public String notificationName;

    @C09CT("short_content")
    public String shortContent;

    @C09CT("show_again_time")
    public int showAgainTime;

    @C09CT("show_again_time_x")
    public int showAgainTimeX;

    @C09CT("show_again_time_y")
    public int showAgainTimeY;

    @C09CT("show_arrow")
    public Boolean showArrow;

    @C09CT("show_duration")
    public Integer showDuration;

    @C09CT("show_interval")
    public int showInterval;

    @C09CT("show_time_vv")
    public int showTimeVV;

    @C09CT("show_times")
    public Integer showTimes;

    @C09CT("show_times_every_launch")
    public Integer showTimesEveryLaunch;

    @C09CT("task_key")
    public String taskKey;

    @C09CT("total_times")
    public int totalTimes;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bubble)) {
            return false;
        }
        Bubble bubble = (Bubble) obj;
        return this.bubbleType == bubble.bubbleType && Intrinsics.LJFF(this.bubbleId, bubble.bubbleId) && Intrinsics.LJFF(this.shortContent, bubble.shortContent) && Intrinsics.LJFF(this.longContent, bubble.longContent) && Intrinsics.LJFF(this.contentStruct, bubble.contentStruct) && Intrinsics.LJFF(this.highlightContentStruct, bubble.highlightContentStruct) && Intrinsics.LJFF(this.highlightContent, bubble.highlightContent) && this.showTimeVV == bubble.showTimeVV && this.showAgainTimeX == bubble.showAgainTimeX && this.showAgainTimeY == bubble.showAgainTimeY && this.showAgainTime == bubble.showAgainTime && this.totalTimes == bubble.totalTimes && this.showInterval == bubble.showInterval && Intrinsics.LJFF(this.taskKey, bubble.taskKey) && Intrinsics.LJFF(this.showDuration, bubble.showDuration) && Intrinsics.LJFF(this.notificationId, bubble.notificationId) && Intrinsics.LJFF(this.notificationName, bubble.notificationName) && Intrinsics.LJFF(this.showTimesEveryLaunch, bubble.showTimesEveryLaunch) && Intrinsics.LJFF(this.showTimes, bubble.showTimes) && Intrinsics.LJFF(this.jumpLink, bubble.jumpLink) && Intrinsics.LJFF(this.showArrow, bubble.showArrow);
    }

    public final int hashCode() {
        int iHashCode = ((this.bubbleType * 31) + this.bubbleId.hashCode()) * 31;
        String str = this.shortContent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.longContent;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Title title = this.contentStruct;
        int iHashCode4 = (iHashCode3 + (title == null ? 0 : title.hashCode())) * 31;
        Title title2 = this.highlightContentStruct;
        int iHashCode5 = (iHashCode4 + (title2 == null ? 0 : title2.hashCode())) * 31;
        String str3 = this.highlightContent;
        int iHashCode6 = (((((((((((((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.showTimeVV) * 31) + this.showAgainTimeX) * 31) + this.showAgainTimeY) * 31) + this.showAgainTime) * 31) + this.totalTimes) * 31) + this.showInterval) * 31;
        String str4 = this.taskKey;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.showDuration;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.notificationId;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.notificationName;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.showTimesEveryLaunch;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.showTimes;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.jumpLink;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.showArrow;
        return iHashCode13 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "Bubble(bubbleType=" + this.bubbleType + ", bubbleId=" + this.bubbleId + ", shortContent=" + this.shortContent + ", longContent=" + this.longContent + ", contentStruct=" + this.contentStruct + ", highlightContentStruct=" + this.highlightContentStruct + ", highlightContent=" + this.highlightContent + ", showTimeVV=" + this.showTimeVV + ", showAgainTimeX=" + this.showAgainTimeX + ", showAgainTimeY=" + this.showAgainTimeY + ", showAgainTime=" + this.showAgainTime + ", totalTimes=" + this.totalTimes + ", showInterval=" + this.showInterval + ", taskKey=" + this.taskKey + ", showDuration=" + this.showDuration + ", notificationId=" + this.notificationId + ", notificationName=" + this.notificationName + ", showTimesEveryLaunch=" + this.showTimesEveryLaunch + ", showTimes=" + this.showTimes + ", jumpLink=" + this.jumpLink + ", showArrow=" + this.showArrow + ')';
    }

    public Bubble(int i, String str, String str2, String str3, Title title, Title title2, String str4, int i2, int i3, int i4, int i5, int i6, int i7, String str5, Integer num, String str6, String str7, Integer num2, Integer num3, String str8, Boolean bool) {
        this.bubbleType = i;
        this.bubbleId = str;
        this.shortContent = str2;
        this.longContent = str3;
        this.contentStruct = title;
        this.highlightContentStruct = title2;
        this.highlightContent = str4;
        this.showTimeVV = i2;
        this.showAgainTimeX = i3;
        this.showAgainTimeY = i4;
        this.showAgainTime = i5;
        this.totalTimes = i6;
        this.showInterval = i7;
        this.taskKey = str5;
        this.showDuration = num;
        this.notificationId = str6;
        this.notificationName = str7;
        this.showTimesEveryLaunch = num2;
        this.showTimes = num3;
        this.jumpLink = str8;
        this.showArrow = bool;
    }
}
