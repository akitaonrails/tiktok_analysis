package com.ss.android.ugc.now.interaction;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC111300bX;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class NowFeedMobHierarchyData implements InterfaceC111300bX, Serializable {

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_position")
    public final String enterPosition;

    @C09CT("is_blue_v_user")
    public final int isBlueVUser;

    @C09CT("is_new_page")
    public final int isNewPage;

    @C09CT("is_now_clear")
    public Integer isNowClear;

    @C09CT("now_feed_type")
    public final Integer nowFeedType;

    @C09CT("now_scene")
    public final String nowScene;

    @C09CT("now_tab_enter_method")
    public final String nowTabEnterMethod;

    @C09CT("previous_page")
    public final String previousPage;

    public final NowFeedMobHierarchyData copy(String str, int i, String str2, Integer num, Integer num2, int i2, String str3, String str4, String str5) {
        return new NowFeedMobHierarchyData(str, i, str2, num, num2, i2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowFeedMobHierarchyData)) {
            return false;
        }
        NowFeedMobHierarchyData nowFeedMobHierarchyData = (NowFeedMobHierarchyData) obj;
        return Intrinsics.LJFF(this.enterFrom, nowFeedMobHierarchyData.enterFrom) && this.isBlueVUser == nowFeedMobHierarchyData.isBlueVUser && Intrinsics.LJFF(this.enterPosition, nowFeedMobHierarchyData.enterPosition) && Intrinsics.LJFF(this.isNowClear, nowFeedMobHierarchyData.isNowClear) && Intrinsics.LJFF(this.nowFeedType, nowFeedMobHierarchyData.nowFeedType) && this.isNewPage == nowFeedMobHierarchyData.isNewPage && Intrinsics.LJFF(this.previousPage, nowFeedMobHierarchyData.previousPage) && Intrinsics.LJFF(this.nowTabEnterMethod, nowFeedMobHierarchyData.nowTabEnterMethod) && Intrinsics.LJFF(this.nowScene, nowFeedMobHierarchyData.nowScene);
    }

    public int hashCode() {
        int iHashCode = ((this.enterFrom.hashCode() * 31) + this.isBlueVUser) * 31;
        String str = this.enterPosition;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.isNowClear;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nowFeedType;
        int iHashCode4 = (((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.isNewPage) * 31;
        String str2 = this.previousPage;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nowTabEnterMethod;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nowScene;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NowFeedMobHierarchyData(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", isBlueVUser=");
        sbLIZ.append(this.isBlueVUser);
        sbLIZ.append(", enterPosition=");
        sbLIZ.append(this.enterPosition);
        sbLIZ.append(", isNowClear=");
        sbLIZ.append(this.isNowClear);
        sbLIZ.append(", nowFeedType=");
        sbLIZ.append(this.nowFeedType);
        sbLIZ.append(", isNewPage=");
        sbLIZ.append(this.isNewPage);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.previousPage);
        sbLIZ.append(", nowTabEnterMethod=");
        sbLIZ.append(this.nowTabEnterMethod);
        sbLIZ.append(", nowScene=");
        sbLIZ.append(this.nowScene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterPosition() {
        return this.enterPosition;
    }

    public final Integer getNowFeedType() {
        return this.nowFeedType;
    }

    public final String getNowScene() {
        return this.nowScene;
    }

    public final String getNowTabEnterMethod() {
        return this.nowTabEnterMethod;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final int isBlueVUser() {
        return this.isBlueVUser;
    }

    public final int isNewPage() {
        return this.isNewPage;
    }

    public final Integer isNowClear() {
        return this.isNowClear;
    }

    public final void setNowClear(Integer num) {
        this.isNowClear = num;
    }

    public NowFeedMobHierarchyData(String str, int i, String str2, Integer num, Integer num2, int i2, String str3, String str4, String str5) {
        this.enterFrom = str;
        this.isBlueVUser = i;
        this.enterPosition = str2;
        this.isNowClear = num;
        this.nowFeedType = num2;
        this.isNewPage = i2;
        this.previousPage = str3;
        this.nowTabEnterMethod = str4;
        this.nowScene = str5;
    }
}
