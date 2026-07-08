package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class AuthorizedPageDetail extends BaseResponse implements Serializable {

    @C09CT("bc_scope_list")
    public final List<AuthorizedScope> bcScopeList;

    @C09CT("client_info")
    public final AuthorizedClient clientInfo;

    @C09CT("scope_list")
    public List<AuthorizedScope> scopeList;

    @C09CT("text_list")
    public final List<AuthorizedPageText> textList;

    public AuthorizedPageDetail() {
        this(null, null, null, null);
    }

    public final AuthorizedPageDetail copy(AuthorizedClient authorizedClient, List<AuthorizedScope> list, List<AuthorizedPageText> list2, List<AuthorizedScope> list3) {
        return new AuthorizedPageDetail(authorizedClient, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizedPageDetail)) {
            return false;
        }
        AuthorizedPageDetail authorizedPageDetail = (AuthorizedPageDetail) obj;
        return Intrinsics.LJFF(this.clientInfo, authorizedPageDetail.clientInfo) && Intrinsics.LJFF(this.scopeList, authorizedPageDetail.scopeList) && Intrinsics.LJFF(this.textList, authorizedPageDetail.textList) && Intrinsics.LJFF(this.bcScopeList, authorizedPageDetail.bcScopeList);
    }

    public int hashCode() {
        AuthorizedClient authorizedClient = this.clientInfo;
        int iHashCode = (authorizedClient == null ? 0 : authorizedClient.hashCode()) * 31;
        List<AuthorizedScope> list = this.scopeList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AuthorizedPageText> list2 = this.textList;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AuthorizedScope> list3 = this.bcScopeList;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthorizedPageDetail(clientInfo=");
        sbLIZ.append(this.clientInfo);
        sbLIZ.append(", scopeList=");
        sbLIZ.append(this.scopeList);
        sbLIZ.append(", textList=");
        sbLIZ.append(this.textList);
        sbLIZ.append(", bcScopeList=");
        sbLIZ.append(this.bcScopeList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<AuthorizedScope> getBcScopeList() {
        return this.bcScopeList;
    }

    public final AuthorizedClient getClientInfo() {
        return this.clientInfo;
    }

    public final List<AuthorizedScope> getScopeList() {
        return this.scopeList;
    }

    public final List<AuthorizedPageText> getTextList() {
        return this.textList;
    }

    public final void setScopeList(List<AuthorizedScope> list) {
        this.scopeList = list;
    }

    public final String textValueByKey(String str) {
        List<AuthorizedPageText> list = this.textList;
        if (list != null) {
            for (AuthorizedPageText authorizedPageText : list) {
                if (Intrinsics.LJFF(authorizedPageText.textKey, str)) {
                    return authorizedPageText.textContent;
                }
            }
            return null;
        }
        return null;
    }

    public AuthorizedPageDetail(AuthorizedClient authorizedClient, List<AuthorizedScope> list, List<AuthorizedPageText> list2, List<AuthorizedScope> list3) {
        this.clientInfo = authorizedClient;
        this.scopeList = list;
        this.textList = list2;
        this.bcScopeList = list3;
    }
}
