package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class TextLink extends C1893670zNV {
    public Set<String> LJII;
    public Set<String> LJIIIIZZ;

    @C09CT("dismiss_after")
    public Integer dismissAfter;

    @C09CT("hashtag_ids")
    public List<String> hashtagIds;

    @C09CT("icon")
    public String icon;

    @C09CT("jump_link")
    public String jumpLink;

    @C09CT("show_in_hashtagpage")
    public Boolean showInHashTagPage;

    @C09CT("show_in_profilepage")
    public Boolean showInProfilePage;

    @C09CT("show_times")
    public Integer showTimes;

    @C09CT("text")
    public String text;

    @C09CT("video_icon")
    public String videoIcon;

    @C09CT("video_ids")
    public List<String> videoIds;

    @C09CT("video_jump_link")
    public String videoJumpLink;

    @C09CT("video_show_in_profilepage")
    public Boolean videoShowInProfilePage;

    @C09CT("video_text")
    public String videoText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLink)) {
            return false;
        }
        TextLink textLink = (TextLink) obj;
        return Intrinsics.LJFF(this.hashtagIds, textLink.hashtagIds) && Intrinsics.LJFF(this.videoIds, textLink.videoIds) && Intrinsics.LJFF(this.icon, textLink.icon) && Intrinsics.LJFF(this.videoIcon, textLink.videoIcon) && Intrinsics.LJFF(this.text, textLink.text) && Intrinsics.LJFF(this.videoText, textLink.videoText) && Intrinsics.LJFF(this.jumpLink, textLink.jumpLink) && Intrinsics.LJFF(this.videoJumpLink, textLink.videoJumpLink) && Intrinsics.LJFF(this.showTimes, textLink.showTimes) && Intrinsics.LJFF(this.dismissAfter, textLink.dismissAfter) && Intrinsics.LJFF(this.showInHashTagPage, textLink.showInHashTagPage) && Intrinsics.LJFF(this.showInProfilePage, textLink.showInProfilePage) && Intrinsics.LJFF(this.videoShowInProfilePage, textLink.videoShowInProfilePage);
    }

    public final int hashCode() {
        List<String> list = this.hashtagIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.videoIds;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.icon;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.videoIcon;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.videoText;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpLink;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.videoJumpLink;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.showTimes;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.dismissAfter;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.showInHashTagPage;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showInProfilePage;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.videoShowInProfilePage;
        return iHashCode12 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "TextLink(hashtagIds=" + this.hashtagIds + ", videoIds=" + this.videoIds + ", icon=" + this.icon + ", videoIcon=" + this.videoIcon + ", text=" + this.text + ", videoText=" + this.videoText + ", jumpLink=" + this.jumpLink + ", videoJumpLink=" + this.videoJumpLink + ", showTimes=" + this.showTimes + ", dismissAfter=" + this.dismissAfter + ", showInHashTagPage=" + this.showInHashTagPage + ", showInProfilePage=" + this.showInProfilePage + ", videoShowInProfilePage=" + this.videoShowInProfilePage + ')';
    }

    public TextLink(List<String> list, List<String> list2, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3) {
        this.hashtagIds = list;
        this.videoIds = list2;
        this.icon = str;
        this.videoIcon = str2;
        this.text = str3;
        this.videoText = str4;
        this.jumpLink = str5;
        this.videoJumpLink = str6;
        this.showTimes = num;
        this.dismissAfter = num2;
        this.showInHashTagPage = bool;
        this.showInProfilePage = bool2;
        this.videoShowInProfilePage = bool3;
    }
}
