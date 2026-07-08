package com.ss.android.ugc.aweme.badge;

import X.AbstractC20579315fr;
import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EditProfileBadgeModel extends AbstractC20579315fr implements Serializable {
    public static final int $stable = 0;

    @C09CT("description")
    public final String description;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long id;

    @C09CT("name")
    public final String name;

    @C09CT("should_show")
    public final Boolean shouldShow;

    @C09CT("url")
    public final String url;

    public final EditProfileBadgeModel copy(Long l, String str, String str2, String str3, Boolean bool) {
        return new EditProfileBadgeModel(l, str, str2, str3, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProfileBadgeModel)) {
            return false;
        }
        EditProfileBadgeModel editProfileBadgeModel = (EditProfileBadgeModel) obj;
        return Intrinsics.LJFF(this.id, editProfileBadgeModel.id) && Intrinsics.LJFF(this.name, editProfileBadgeModel.name) && Intrinsics.LJFF(this.description, editProfileBadgeModel.description) && Intrinsics.LJFF(this.url, editProfileBadgeModel.url) && Intrinsics.LJFF(this.shouldShow, editProfileBadgeModel.shouldShow);
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.shouldShow;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditProfileBadgeModel(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", shouldShow=");
        sbLIZ.append(this.shouldShow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC20579315fr
    public String getDescription() {
        return this.description;
    }

    @Override // X.AbstractC20579315fr
    public Long getId() {
        return this.id;
    }

    @Override // X.AbstractC20579315fr
    public String getName() {
        return this.name;
    }

    @Override // X.AbstractC20579315fr
    public Boolean getShouldShow() {
        return this.shouldShow;
    }

    @Override // X.AbstractC20579315fr
    public String getUrl() {
        return this.url;
    }

    public EditProfileBadgeModel(Long l, String str, String str2, String str3, Boolean bool) {
        this.id = l;
        this.name = str;
        this.description = str2;
        this.url = str3;
        this.shouldShow = bool;
    }
}
