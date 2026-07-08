package com.bytedance.touchpoint.core.model;

import X.C09CT;
import X.C1893670zNV;
import com.bytedance.touchpoint.api.model.InviteCodeResponse;
import com.bytedance.touchpoint.api.model.Title;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class DynamicToast extends C1893670zNV {

    @C09CT("body")
    public Body body;

    @C09CT("buttons")
    public final List<InviteCodeResponse.Button> buttons;

    @C09CT("cover_image")
    public String coverImage;

    @C09CT("description")
    public Title description;

    @C09CT("extra")
    public Map<String, String> extra;

    @C09CT("js_source")
    public String jsSource;

    @C09CT("popup_type")
    public String name;

    @C09CT("need_login_gate")
    public Boolean needLoginGate;

    @C09CT("notification_name")
    public String notificationName;

    @C09CT("popup_id")
    public String popId;

    @C09CT("popup_name")
    public String popName;

    @C09CT("round")
    public String round;

    @C09CT("show_after")
    public Integer showAfter;

    @C09CT("title")
    public Title title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicToast)) {
            return false;
        }
        DynamicToast dynamicToast = (DynamicToast) obj;
        return Intrinsics.LJFF(this.name, dynamicToast.name) && Intrinsics.LJFF(this.popId, dynamicToast.popId) && Intrinsics.LJFF(this.popName, dynamicToast.popName) && Intrinsics.LJFF(this.coverImage, dynamicToast.coverImage) && Intrinsics.LJFF(this.title, dynamicToast.title) && Intrinsics.LJFF(this.description, dynamicToast.description) && Intrinsics.LJFF(this.notificationName, dynamicToast.notificationName) && Intrinsics.LJFF(this.round, dynamicToast.round) && Intrinsics.LJFF(this.showAfter, dynamicToast.showAfter) && Intrinsics.LJFF(this.buttons, dynamicToast.buttons) && Intrinsics.LJFF(this.extra, dynamicToast.extra) && Intrinsics.LJFF(this.needLoginGate, dynamicToast.needLoginGate) && Intrinsics.LJFF(this.jsSource, dynamicToast.jsSource) && Intrinsics.LJFF(this.body, dynamicToast.body);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.popId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.popName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coverImage;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Title title = this.title;
        int iHashCode5 = (iHashCode4 + (title == null ? 0 : title.hashCode())) * 31;
        Title title2 = this.description;
        int iHashCode6 = (iHashCode5 + (title2 == null ? 0 : title2.hashCode())) * 31;
        String str5 = this.notificationName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.round;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.showAfter;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        List<InviteCodeResponse.Button> list = this.buttons;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.extra;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.needLoginGate;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.jsSource;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Body body = this.body;
        return iHashCode13 + (body != null ? body.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicToast(name=" + this.name + ", popId=" + this.popId + ", popName=" + this.popName + ", coverImage=" + this.coverImage + ", title=" + this.title + ", description=" + this.description + ", notificationName=" + this.notificationName + ", round=" + this.round + ", showAfter=" + this.showAfter + ", buttons=" + this.buttons + ", extra=" + this.extra + ", needLoginGate=" + this.needLoginGate + ", jsSource=" + this.jsSource + ", body=" + this.body + ')';
    }

    public DynamicToast(String str, String str2, String str3, String str4, Title title, Title title2, String str5, String str6, Integer num, List<InviteCodeResponse.Button> list, Map<String, String> map, Boolean bool, String str7, Body body) {
        this.name = str;
        this.popId = str2;
        this.popName = str3;
        this.coverImage = str4;
        this.title = title;
        this.description = title2;
        this.notificationName = str5;
        this.round = str6;
        this.showAfter = num;
        this.buttons = list;
        this.extra = map;
        this.needLoginGate = bool;
        this.jsSource = str7;
        this.body = body;
    }
}
