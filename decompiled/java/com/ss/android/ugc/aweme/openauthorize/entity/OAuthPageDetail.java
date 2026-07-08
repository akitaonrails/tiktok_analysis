package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class OAuthPageDetail extends BaseResponse implements Serializable {

    @C09CT("bc_scope_list")
    public final List<OAuthScope> bcScopeList;

    @C09CT("bc_scope_list_pinned")
    public final List<OAuthScope> bcScopeListPinned;

    @C09CT("check_result")
    public final CheckResultInfo checkResultInfo;

    @C09CT("client_info")
    public final OAuthClientInfo clientInfo;

    @C09CT("page_button")
    public final PageButton pageButton;

    @C09CT("scope_list")
    public OAuthScopeStruct scopeListStruct;

    @C09CT("text_list")
    public final List<OAuthPageText> textList;

    @C09CT("user_info")
    public final UserInfo userInfo;

    public OAuthPageDetail() {
        this(null, null, null, null, null, null, null, null);
    }

    public final OAuthPageDetail copy(OAuthClientInfo oAuthClientInfo, OAuthScopeStruct oAuthScopeStruct, List<OAuthPageText> list, List<OAuthScope> list2, List<OAuthScope> list3, UserInfo userInfo, PageButton pageButton, CheckResultInfo checkResultInfo) {
        return new OAuthPageDetail(oAuthClientInfo, oAuthScopeStruct, list, list2, list3, userInfo, pageButton, checkResultInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthPageDetail)) {
            return false;
        }
        OAuthPageDetail oAuthPageDetail = (OAuthPageDetail) obj;
        return Intrinsics.LJFF(this.clientInfo, oAuthPageDetail.clientInfo) && Intrinsics.LJFF(this.scopeListStruct, oAuthPageDetail.scopeListStruct) && Intrinsics.LJFF(this.textList, oAuthPageDetail.textList) && Intrinsics.LJFF(this.bcScopeList, oAuthPageDetail.bcScopeList) && Intrinsics.LJFF(this.bcScopeListPinned, oAuthPageDetail.bcScopeListPinned) && Intrinsics.LJFF(this.userInfo, oAuthPageDetail.userInfo) && Intrinsics.LJFF(this.pageButton, oAuthPageDetail.pageButton) && Intrinsics.LJFF(this.checkResultInfo, oAuthPageDetail.checkResultInfo);
    }

    public int hashCode() {
        OAuthClientInfo oAuthClientInfo = this.clientInfo;
        int iHashCode = (oAuthClientInfo == null ? 0 : oAuthClientInfo.hashCode()) * 31;
        OAuthScopeStruct oAuthScopeStruct = this.scopeListStruct;
        int iHashCode2 = (iHashCode + (oAuthScopeStruct == null ? 0 : oAuthScopeStruct.hashCode())) * 31;
        List<OAuthPageText> list = this.textList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<OAuthScope> list2 = this.bcScopeList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<OAuthScope> list3 = this.bcScopeListPinned;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        UserInfo userInfo = this.userInfo;
        int iHashCode6 = (iHashCode5 + (userInfo == null ? 0 : userInfo.hashCode())) * 31;
        PageButton pageButton = this.pageButton;
        int iHashCode7 = (iHashCode6 + (pageButton == null ? 0 : pageButton.hashCode())) * 31;
        CheckResultInfo checkResultInfo = this.checkResultInfo;
        return iHashCode7 + (checkResultInfo != null ? checkResultInfo.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OAuthPageDetail(clientInfo=");
        sbLIZ.append(this.clientInfo);
        sbLIZ.append(", scopeListStruct=");
        sbLIZ.append(this.scopeListStruct);
        sbLIZ.append(", textList=");
        sbLIZ.append(this.textList);
        sbLIZ.append(", bcScopeList=");
        sbLIZ.append(this.bcScopeList);
        sbLIZ.append(", bcScopeListPinned=");
        sbLIZ.append(this.bcScopeListPinned);
        sbLIZ.append(", userInfo=");
        sbLIZ.append(this.userInfo);
        sbLIZ.append(", pageButton=");
        sbLIZ.append(this.pageButton);
        sbLIZ.append(", checkResultInfo=");
        sbLIZ.append(this.checkResultInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<OAuthScope> getBcScopeList() {
        return this.bcScopeList;
    }

    public final List<OAuthScope> getBcScopeListPinned() {
        return this.bcScopeListPinned;
    }

    public final CheckResultInfo getCheckResultInfo() {
        return this.checkResultInfo;
    }

    public final OAuthClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public final PageButton getPageButton() {
        return this.pageButton;
    }

    public final OAuthScopeStruct getScopeListStruct() {
        return this.scopeListStruct;
    }

    public final List<OAuthPageText> getTextList() {
        return this.textList;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final void setScopeListStruct(OAuthScopeStruct oAuthScopeStruct) {
        this.scopeListStruct = oAuthScopeStruct;
    }

    public OAuthPageDetail(OAuthClientInfo oAuthClientInfo, OAuthScopeStruct oAuthScopeStruct, List<OAuthPageText> list, List<OAuthScope> list2, List<OAuthScope> list3, UserInfo userInfo, PageButton pageButton, CheckResultInfo checkResultInfo) {
        this.clientInfo = oAuthClientInfo;
        this.scopeListStruct = oAuthScopeStruct;
        this.textList = list;
        this.bcScopeList = list2;
        this.bcScopeListPinned = list3;
        this.userInfo = userInfo;
        this.pageButton = pageButton;
        this.checkResultInfo = checkResultInfo;
    }
}
