package com.ss.android.ugc.tiktok.location_api.service;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationRegion implements InterfaceC1891350zJl, Serializable {

    @C09CT("en_name")
    public final String enName;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("l0_code")
    public final String l0Code;

    @C09CT("level")
    public final Integer level;

    @C09CT("locate_method")
    public final Integer locateMethod;

    @C09CT("name")
    public final String name;

    @C09CT("parent_en_name")
    public final String parentEnName;

    @C09CT("parent_id")
    public final Long parentId;

    @C09CT("parent_level")
    public final Integer parentLevel;

    @C09CT("parent_name")
    public final String parentName;

    public LocationRegion() {
        this(0L, null, null, null, null, null, null, null, null, null);
    }

    public final LocationRegion copy(long j, String str, String str2, Integer num, Long l, String str3, String str4, Integer num2, String str5, Integer num3) {
        return new LocationRegion(j, str, str2, num, l, str3, str4, num2, str5, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRegion)) {
            return false;
        }
        LocationRegion locationRegion = (LocationRegion) obj;
        return this.id == locationRegion.id && Intrinsics.LJFF(this.name, locationRegion.name) && Intrinsics.LJFF(this.enName, locationRegion.enName) && Intrinsics.LJFF(this.level, locationRegion.level) && Intrinsics.LJFF(this.parentId, locationRegion.parentId) && Intrinsics.LJFF(this.parentName, locationRegion.parentName) && Intrinsics.LJFF(this.parentEnName, locationRegion.parentEnName) && Intrinsics.LJFF(this.parentLevel, locationRegion.parentLevel) && Intrinsics.LJFF(this.l0Code, locationRegion.l0Code) && Intrinsics.LJFF(this.locateMethod, locationRegion.locateMethod);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        int iY2 = C786410Ut5.Y2(this.id) * 31;
        String str = this.name;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.enName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.level;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.parentId;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.parentName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.parentEnName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.parentLevel;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.l0Code;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.locateMethod;
        return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationRegion(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", enName=");
        sbLIZ.append(this.enName);
        sbLIZ.append(", level=");
        sbLIZ.append(this.level);
        sbLIZ.append(", parentId=");
        sbLIZ.append(this.parentId);
        sbLIZ.append(", parentName=");
        sbLIZ.append(this.parentName);
        sbLIZ.append(", parentEnName=");
        sbLIZ.append(this.parentEnName);
        sbLIZ.append(", parentLevel=");
        sbLIZ.append(this.parentLevel);
        sbLIZ.append(", l0Code=");
        sbLIZ.append(this.l0Code);
        sbLIZ.append(", locateMethod=");
        sbLIZ.append(this.locateMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getRegionCode() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.l0Code);
        sbLIZ.append('_');
        sbLIZ.append(this.id);
        sbLIZ.append('_');
        Integer num = this.level;
        sbLIZ.append(num != null ? num.intValue() : LocationLevel.LEVEL_L0.getLevel());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getEnName() {
        return this.enName;
    }

    public final long getId() {
        return this.id;
    }

    public final String getL0Code() {
        return this.l0Code;
    }

    public final Integer getLevel() {
        return this.level;
    }

    public final Integer getLocateMethod() {
        return this.locateMethod;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParentEnName() {
        return this.parentEnName;
    }

    public final Long getParentId() {
        return this.parentId;
    }

    public final Integer getParentLevel() {
        return this.parentLevel;
    }

    public final String getParentName() {
        return this.parentName;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public LocationRegion(long j, String str, String str2, Integer num, Long l, String str3, String str4, Integer num2, String str5, Integer num3) {
        this.id = j;
        this.name = str;
        this.enName = str2;
        this.level = num;
        this.parentId = l;
        this.parentName = str3;
        this.parentEnName = str4;
        this.parentLevel = num2;
        this.l0Code = str5;
        this.locateMethod = num3;
    }
}
