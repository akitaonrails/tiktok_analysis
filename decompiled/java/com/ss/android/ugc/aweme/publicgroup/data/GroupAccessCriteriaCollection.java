package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class GroupAccessCriteriaCollection {

    @C09CT("access_criteria_icon")
    public final String accessCriteriaIcon;

    @C09CT("access_criteria")
    public final List<GroupAccessCriteria> accessCriteriaSetting;

    @C09CT("collection_id")
    public final int collectionId;

    @C09CT("event_tracking")
    public final Map<String, String> eventTracking;

    @C09CT("has_multiple_access_criteria")
    public final boolean hasMultipleAccessCriteria;

    @C09CT("name")
    public final String name;

    @C09CT("selected_access_criteria")
    public final GroupAccessCriteria selectedAccessCriteria;

    @C09CT("selection_panel_title")
    public final String selectionPanelTitle;

    @C09CT("tips")
    public final String tips;

    public GroupAccessCriteriaCollection() {
        this(0, null, null, null, null, null, null, false, null, 511, null);
    }

    public final int hashCode() {
        int iHashCode = ((((this.collectionId * 31) + this.name.hashCode()) * 31) + this.tips.hashCode()) * 31;
        Map<String, String> map = this.eventTracking;
        int iHashCode2 = (((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.accessCriteriaSetting.hashCode()) * 31;
        GroupAccessCriteria groupAccessCriteria = this.selectedAccessCriteria;
        return ((((((iHashCode2 + (groupAccessCriteria != null ? groupAccessCriteria.hashCode() : 0)) * 31) + this.selectionPanelTitle.hashCode()) * 31) + C786410Ut5.Z2(this.hasMultipleAccessCriteria)) * 31) + this.accessCriteriaIcon.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupAccessCriteriaCollection(collectionId=");
        sbLIZ.append(this.collectionId);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", tips=");
        sbLIZ.append(this.tips);
        sbLIZ.append(", eventTracking=");
        sbLIZ.append(this.eventTracking);
        sbLIZ.append(", accessCriteriaSetting=");
        sbLIZ.append(this.accessCriteriaSetting);
        sbLIZ.append(", selectedAccessCriteria=");
        sbLIZ.append(this.selectedAccessCriteria);
        sbLIZ.append(", selectionPanelTitle=");
        sbLIZ.append(this.selectionPanelTitle);
        sbLIZ.append(", hasMultipleAccessCriteria=");
        sbLIZ.append(this.hasMultipleAccessCriteria);
        sbLIZ.append(", accessCriteriaIcon=");
        sbLIZ.append(this.accessCriteriaIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static GroupAccessCriteriaCollection LIZ(GroupAccessCriteriaCollection groupAccessCriteriaCollection, GroupAccessCriteria groupAccessCriteria) {
        int i = groupAccessCriteriaCollection.collectionId;
        String str = groupAccessCriteriaCollection.name;
        String str2 = groupAccessCriteriaCollection.tips;
        Map<String, String> map = groupAccessCriteriaCollection.eventTracking;
        List<GroupAccessCriteria> list = groupAccessCriteriaCollection.accessCriteriaSetting;
        String str3 = groupAccessCriteriaCollection.selectionPanelTitle;
        boolean z = groupAccessCriteriaCollection.hasMultipleAccessCriteria;
        String str4 = groupAccessCriteriaCollection.accessCriteriaIcon;
        groupAccessCriteriaCollection.getClass();
        return new GroupAccessCriteriaCollection(i, str, str2, map, list, groupAccessCriteria, str3, z, str4);
    }

    public GroupAccessCriteriaCollection(int i, String str, String str2, Map<String, String> map, List<GroupAccessCriteria> list, GroupAccessCriteria groupAccessCriteria, String str3, boolean z, String str4) {
        this.collectionId = i;
        this.name = str;
        this.tips = str2;
        this.eventTracking = map;
        this.accessCriteriaSetting = list;
        this.selectedAccessCriteria = groupAccessCriteria;
        this.selectionPanelTitle = str3;
        this.hasMultipleAccessCriteria = z;
        this.accessCriteriaIcon = str4;
    }

    public GroupAccessCriteriaCollection(int i, String str, String str2, Map map, List list, GroupAccessCriteria groupAccessCriteria, String str3, boolean z, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : map, (i2 & 16) != 0 ? C13BV.INSTANCE : list, (i2 & 32) == 0 ? groupAccessCriteria : null, (i2 & 64) != 0 ? "" : str3, (i2 & 128) == 0 ? z : false, (i2 & 256) == 0 ? str4 : "");
    }
}
