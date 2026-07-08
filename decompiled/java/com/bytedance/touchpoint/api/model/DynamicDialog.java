package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import com.bytedance.touchpoint.api.model.InviteCodeResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class DynamicDialog extends C1893670zNV {

    @C09CT("body")
    public DialogBody body;

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

    @C09CT("valid_pages")
    public List<String> validPages;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicDialog)) {
            return false;
        }
        DynamicDialog dynamicDialog = (DynamicDialog) obj;
        return Intrinsics.LJFF(this.name, dynamicDialog.name) && Intrinsics.LJFF(this.popId, dynamicDialog.popId) && Intrinsics.LJFF(this.popName, dynamicDialog.popName) && Intrinsics.LJFF(this.coverImage, dynamicDialog.coverImage) && Intrinsics.LJFF(this.title, dynamicDialog.title) && Intrinsics.LJFF(this.description, dynamicDialog.description) && Intrinsics.LJFF(this.notificationName, dynamicDialog.notificationName) && Intrinsics.LJFF(this.round, dynamicDialog.round) && Intrinsics.LJFF(this.showAfter, dynamicDialog.showAfter) && Intrinsics.LJFF(this.buttons, dynamicDialog.buttons) && Intrinsics.LJFF(this.extra, dynamicDialog.extra) && Intrinsics.LJFF(this.needLoginGate, dynamicDialog.needLoginGate) && Intrinsics.LJFF(this.body, dynamicDialog.body) && Intrinsics.LJFF(this.jsSource, dynamicDialog.jsSource) && Intrinsics.LJFF(this.validPages, dynamicDialog.validPages);
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
        DialogBody dialogBody = this.body;
        int iHashCode13 = (iHashCode12 + (dialogBody == null ? 0 : dialogBody.hashCode())) * 31;
        String str7 = this.jsSource;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list2 = this.validPages;
        return iHashCode14 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicDialog(name=" + this.name + ", popId=" + this.popId + ", popName=" + this.popName + ", coverImage=" + this.coverImage + ", title=" + this.title + ", description=" + this.description + ", notificationName=" + this.notificationName + ", round=" + this.round + ", showAfter=" + this.showAfter + ", buttons=" + this.buttons + ", extra=" + this.extra + ", needLoginGate=" + this.needLoginGate + ", body=" + this.body + ", jsSource=" + this.jsSource + ", validPages=" + this.validPages + ')';
    }

    public final DynamicDialog LIZ() {
        DynamicDialog dynamicDialog = new DynamicDialog(this.name, this.popId, this.popName, this.coverImage, this.title, this.description, this.notificationName, this.round, this.showAfter, this.buttons, this.extra, this.needLoginGate, this.body, this.jsSource, this.validPages);
        dynamicDialog.LIZ = this.LIZ;
        dynamicDialog.LIZIZ = this.LIZIZ;
        dynamicDialog.LIZJ = this.LIZJ;
        dynamicDialog.LIZLLL = this.LIZLLL;
        dynamicDialog.LJ = this.LJ;
        dynamicDialog.LJFF = this.LJFF;
        dynamicDialog.LJI = this.LJI;
        return dynamicDialog;
    }

    public DynamicDialog(String str, String str2, String str3, String str4, Title title, Title title2, String str5, String str6, Integer num, List<InviteCodeResponse.Button> list, Map<String, String> map, Boolean bool, DialogBody dialogBody, String str7, List<String> list2) {
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
        this.body = dialogBody;
        this.jsSource = str7;
        this.validPages = list2;
    }
}
