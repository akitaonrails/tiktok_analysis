package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class ContactUploadResponse extends BaseResponse {

    @C09CT("client_next_upload_ts")
    public final Long cacheValidTimestamp;

    @C09CT("log_pb")
    public final LogPbBean logPbBean;

    @C09CT("provide_matched_len")
    public final Long provideMatchedLen;

    @C09CT("registered_user")
    public final List<RegisteredContactUser> registerUserListInternal;

    @C09CT("unregistered_contact")
    public final List<UnRegisteredContactUser> unregisteredContact;

    public ContactUploadResponse() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactUploadResponse)) {
            return false;
        }
        ContactUploadResponse contactUploadResponse = (ContactUploadResponse) obj;
        return Intrinsics.LJFF(this.unregisteredContact, contactUploadResponse.unregisteredContact) && Intrinsics.LJFF(this.registerUserListInternal, contactUploadResponse.registerUserListInternal) && Intrinsics.LJFF(this.logPbBean, contactUploadResponse.logPbBean) && Intrinsics.LJFF(this.cacheValidTimestamp, contactUploadResponse.cacheValidTimestamp) && Intrinsics.LJFF(this.provideMatchedLen, contactUploadResponse.provideMatchedLen);
    }

    public final int hashCode() {
        List<UnRegisteredContactUser> list = this.unregisteredContact;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<RegisteredContactUser> list2 = this.registerUserListInternal;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        LogPbBean logPbBean = this.logPbBean;
        int iHashCode3 = (iHashCode2 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        Long l = this.cacheValidTimestamp;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.provideMatchedLen;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContactUploadResponse(unregisteredContact=");
        sbLIZ.append(this.unregisteredContact);
        sbLIZ.append(", registerUserListInternal=");
        sbLIZ.append(this.registerUserListInternal);
        sbLIZ.append(", logPbBean=");
        sbLIZ.append(this.logPbBean);
        sbLIZ.append(", cacheValidTimestamp=");
        sbLIZ.append(this.cacheValidTimestamp);
        sbLIZ.append(", provideMatchedLen=");
        sbLIZ.append(this.provideMatchedLen);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<RegisteredContactUser> LJ() {
        String imprId;
        LogPbBean logPbBean = this.logPbBean;
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            return this.registerUserListInternal;
        }
        List<RegisteredContactUser> list = this.registerUserListInternal;
        if (list == null) {
            return null;
        }
        Iterator<RegisteredContactUser> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().setRequestId(imprId);
        }
        return list;
    }

    public ContactUploadResponse(List<UnRegisteredContactUser> list, List<RegisteredContactUser> list2, LogPbBean logPbBean, Long l, Long l2) {
        this.unregisteredContact = list;
        this.registerUserListInternal = list2;
        this.logPbBean = logPbBean;
        this.cacheValidTimestamp = l;
        this.provideMatchedLen = l2;
    }
}
