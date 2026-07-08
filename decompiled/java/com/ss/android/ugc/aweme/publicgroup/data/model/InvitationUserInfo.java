package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class InvitationUserInfo {

    @C09CT("avatar_thumb")
    public final UrlModel avatarThumb;

    @C09CT("disable_invite")
    public final Boolean disableInvite;

    @C09CT("display_name")
    public final String displayName;

    @C09CT("event_track")
    public final Map<String, String> eventTrack;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("section_type")
    public final InvitationListSectionType sectionType;

    @C09CT("uniq_id")
    public final String uniqueId;

    @C09CT("user_id")
    public final String userId;

    @C09CT("user_tag")
    public final String userTag;

    public InvitationUserInfo() {
        this("", "", "", null, "", Boolean.FALSE, "", InvitationListSectionType.INVITATION_LIST_SECTION_TYPE_UNKNOWN, null);
    }

    public final int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nickname;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.avatarThumb;
        int iHashCode4 = (iHashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str4 = this.userTag;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.disableInvite;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.uniqueId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        InvitationListSectionType invitationListSectionType = this.sectionType;
        int iHashCode8 = (iHashCode7 + (invitationListSectionType == null ? 0 : invitationListSectionType.hashCode())) * 31;
        Map<String, String> map = this.eventTrack;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }

    public InvitationUserInfo(String str, String str2, String str3, UrlModel urlModel, String str4, Boolean bool, String str5, InvitationListSectionType invitationListSectionType, Map<String, String> map) {
        this.userId = str;
        this.nickname = str2;
        this.displayName = str3;
        this.avatarThumb = urlModel;
        this.userTag = str4;
        this.disableInvite = bool;
        this.uniqueId = str5;
        this.sectionType = invitationListSectionType;
        this.eventTrack = map;
    }
}
