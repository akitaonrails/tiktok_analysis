package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ApplySkin {

    @C09CT("exipre_time")
    public final Long exipreTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("name")
    public final String name;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("style_struct")
    public final BulletinStyleStruct styleStruct;

    public ApplySkin() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplySkin)) {
            return false;
        }
        ApplySkin applySkin = (ApplySkin) obj;
        return Intrinsics.LJFF(this.id, applySkin.id) && Intrinsics.LJFF(this.exipreTime, applySkin.exipreTime) && Intrinsics.LJFF(this.status, applySkin.status) && Intrinsics.LJFF(this.styleStruct, applySkin.styleStruct) && Intrinsics.LJFF(this.name, applySkin.name) && Intrinsics.LJFF(this.jumpSchema, applySkin.jumpSchema);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.exipreTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        BulletinStyleStruct bulletinStyleStruct = this.styleStruct;
        int iHashCode4 = (iHashCode3 + (bulletinStyleStruct == null ? 0 : bulletinStyleStruct.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jumpSchema;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplySkin(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", exipreTime=");
        sbLIZ.append(this.exipreTime);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", styleStruct=");
        sbLIZ.append(this.styleStruct);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.jumpSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ApplySkin(String str, Long l, Integer num, BulletinStyleStruct bulletinStyleStruct, String str2, String str3) {
        this.id = str;
        this.exipreTime = l;
        this.status = num;
        this.styleStruct = bulletinStyleStruct;
        this.name = str2;
        this.jumpSchema = str3;
    }
}
