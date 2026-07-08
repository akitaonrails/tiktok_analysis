package com.ss.android.ugc.profile.business.profile.info.identifier.page.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileIdentifierAvatar extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("avatar_medium")
    public final UrlModel avatarModel;

    public ProfileIdentifierAvatar() {
        this(null);
    }

    public final ProfileIdentifierAvatar copy(UrlModel urlModel) {
        return new ProfileIdentifierAvatar(urlModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileIdentifierAvatar) && Intrinsics.LJFF(this.avatarModel, ((ProfileIdentifierAvatar) obj).avatarModel);
    }

    public int hashCode() {
        UrlModel urlModel = this.avatarModel;
        if (urlModel == null) {
            return 0;
        }
        return urlModel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileIdentifierAvatar(avatarModel=");
        sbLIZ.append(this.avatarModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final UrlModel getAvatarModel() {
        return this.avatarModel;
    }

    public ProfileIdentifierAvatar(UrlModel urlModel) {
        this.avatarModel = urlModel;
    }
}
