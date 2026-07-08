package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C0OZS;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBubbleStruct {
    public static final C0OZS Companion = new Object() { // from class: X.0OZS
    };

    @C09CT("content")
    public final String content;

    @C09CT("icon_url")
    public final TuxImageModel iconUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("state")
    public final Boolean state;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    public BulletinBubbleStruct() {
        this(null, null, null, null, null, null, null);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TuxImageModel tuxImageModel = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (tuxImageModel == null ? 0 : tuxImageModel.hashCode())) * 31;
        Boolean bool = this.state;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.schemaUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.id;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinBubbleStruct(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.schemaUrl);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinBubbleStruct(String str, String str2, String str3, TuxImageModel tuxImageModel, Boolean bool, String str4, String str5) {
        this.title = str;
        this.subTitle = str2;
        this.content = str3;
        this.iconUrl = tuxImageModel;
        this.state = bool;
        this.schemaUrl = str4;
        this.id = str5;
    }
}
