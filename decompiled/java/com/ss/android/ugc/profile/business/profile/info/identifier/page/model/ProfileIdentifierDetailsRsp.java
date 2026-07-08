package com.ss.android.ugc.profile.business.profile.info.identifier.page.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileIdentifierDetailsRsp extends BaseResponse {

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("root")
    public final ProfileComponents root;

    public ProfileIdentifierDetailsRsp() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileIdentifierDetailsRsp)) {
            return false;
        }
        ProfileIdentifierDetailsRsp profileIdentifierDetailsRsp = (ProfileIdentifierDetailsRsp) obj;
        return Intrinsics.LJFF(this.logPb, profileIdentifierDetailsRsp.logPb) && Intrinsics.LJFF(this.root, profileIdentifierDetailsRsp.root);
    }

    public final int hashCode() {
        LogPbBean logPbBean = this.logPb;
        int iHashCode = (logPbBean == null ? 0 : logPbBean.hashCode()) * 31;
        ProfileComponents profileComponents = this.root;
        return iHashCode + (profileComponents != null ? profileComponents.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileIdentifierDetailsRsp(logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", root=");
        sbLIZ.append(this.root);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileIdentifierDetailsRsp(LogPbBean logPbBean, ProfileComponents profileComponents) {
        this.logPb = logPbBean;
        this.root = profileComponents;
    }
}
