package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ChatInviteShareResponse extends BaseResponse {

    @C09CT("expire_time")
    public Long expireTime;

    @C09CT("long_url")
    public String longUrl;

    @C09CT("share_link_text")
    public String shareLinkText;

    @C09CT("short_url")
    public String shortUrl;

    public ChatInviteShareResponse() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatInviteShareResponse)) {
            return false;
        }
        ChatInviteShareResponse chatInviteShareResponse = (ChatInviteShareResponse) obj;
        return Intrinsics.LJFF(this.shareLinkText, chatInviteShareResponse.shareLinkText) && Intrinsics.LJFF(this.shortUrl, chatInviteShareResponse.shortUrl) && Intrinsics.LJFF(this.longUrl, chatInviteShareResponse.longUrl) && Intrinsics.LJFF(this.expireTime, chatInviteShareResponse.expireTime);
    }

    public final int hashCode() {
        String str = this.shareLinkText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shortUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.longUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.expireTime;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatInviteShareResponse(shareLinkText=");
        sbLIZ.append(this.shareLinkText);
        sbLIZ.append(", shortUrl=");
        sbLIZ.append(this.shortUrl);
        sbLIZ.append(", longUrl=");
        sbLIZ.append(this.longUrl);
        sbLIZ.append(", expireTime=");
        sbLIZ.append(this.expireTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ChatInviteShareResponse(String str, String str2, String str3, Long l) {
        this.shareLinkText = str;
        this.shortUrl = str2;
        this.longUrl = str3;
        this.expireTime = l;
    }
}
