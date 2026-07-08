package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinAccountInvitationResponse extends BaseResponse {

    @C09CT("avatar")
    public final UrlModel avatar;

    @C09CT("creator_type_str")
    public final String creatorTypeStr;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("text")
    public final String text;

    @C09CT("title")
    public final String title;

    public BulletinAccountInvitationResponse() {
        this(null, null, null, null, null);
    }

    public final BulletinAccountInvitationResponse copy(String str, String str2, String str3, UrlModel urlModel, String str4) {
        return new BulletinAccountInvitationResponse(str, str2, str3, urlModel, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinAccountInvitationResponse)) {
            return false;
        }
        BulletinAccountInvitationResponse bulletinAccountInvitationResponse = (BulletinAccountInvitationResponse) obj;
        return Intrinsics.LJFF(this.title, bulletinAccountInvitationResponse.title) && Intrinsics.LJFF(this.text, bulletinAccountInvitationResponse.text) && Intrinsics.LJFF(this.schemaUrl, bulletinAccountInvitationResponse.schemaUrl) && Intrinsics.LJFF(this.avatar, bulletinAccountInvitationResponse.avatar) && Intrinsics.LJFF(this.creatorTypeStr, bulletinAccountInvitationResponse.creatorTypeStr);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schemaUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.avatar;
        int iHashCode4 = (iHashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str4 = this.creatorTypeStr;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinAccountInvitationResponse(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.schemaUrl);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", creatorTypeStr=");
        sbLIZ.append(this.creatorTypeStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final String getCreatorTypeStr() {
        return this.creatorTypeStr;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public BulletinAccountInvitationResponse(String str, String str2, String str3, UrlModel urlModel, String str4) {
        this.title = str;
        this.text = str2;
        this.schemaUrl = str3;
        this.avatar = urlModel;
        this.creatorTypeStr = str4;
    }
}
