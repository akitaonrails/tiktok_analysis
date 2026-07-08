package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxEntranceCellUIInfo {

    @C09CT("avatar_image_url")
    public UrlModel avatarImageUrl;

    @C09CT("avatar_dark_image_url")
    public UrlModel avatarImageUrlDark;

    @C09CT("content")
    public String content;

    @C09CT("content_struct")
    public NoticeTextStruct contentStruct;

    @C09CT("icons")
    public List<EntranceIcon> icons;

    @C09CT("preview_users")
    public List<? extends User> previewUsers;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("title")
    public String title;

    @C09CT("ui_style")
    public int uiStyle;

    @C09CT("unread_count_style")
    public int unreadType;

    public InboxEntranceCellUIInfo() {
        this(0, null, null, null, null, 0, null, null, null, null, 1023, null);
    }

    public final InboxEntranceCellUIInfo copy(int i, UrlModel urlModel, UrlModel urlModel2, String str, String str2, int i2, String str3, List<EntranceIcon> list, NoticeTextStruct noticeTextStruct, List<? extends User> list2) {
        return new InboxEntranceCellUIInfo(i, urlModel, urlModel2, str, str2, i2, str3, list, noticeTextStruct, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxEntranceCellUIInfo)) {
            return false;
        }
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo = (InboxEntranceCellUIInfo) obj;
        return this.uiStyle == inboxEntranceCellUIInfo.uiStyle && Intrinsics.LJFF(this.avatarImageUrl, inboxEntranceCellUIInfo.avatarImageUrl) && Intrinsics.LJFF(this.avatarImageUrlDark, inboxEntranceCellUIInfo.avatarImageUrlDark) && Intrinsics.LJFF(this.title, inboxEntranceCellUIInfo.title) && Intrinsics.LJFF(this.content, inboxEntranceCellUIInfo.content) && this.unreadType == inboxEntranceCellUIInfo.unreadType && Intrinsics.LJFF(this.schemaUrl, inboxEntranceCellUIInfo.schemaUrl) && Intrinsics.LJFF(this.icons, inboxEntranceCellUIInfo.icons) && Intrinsics.LJFF(this.contentStruct, inboxEntranceCellUIInfo.contentStruct) && Intrinsics.LJFF(this.previewUsers, inboxEntranceCellUIInfo.previewUsers);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxEntranceCellUIInfo(uiStyle=");
        sbLIZ.append(this.uiStyle);
        sbLIZ.append(", avatarImageUrl=");
        sbLIZ.append(this.avatarImageUrl);
        sbLIZ.append(", avatarImageUrlDark=");
        sbLIZ.append(this.avatarImageUrlDark);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", unreadType=");
        sbLIZ.append(this.unreadType);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.schemaUrl);
        sbLIZ.append(", icons=");
        sbLIZ.append(this.icons);
        sbLIZ.append(", contentStruct=");
        sbLIZ.append(this.contentStruct);
        sbLIZ.append(", previewUsers=");
        sbLIZ.append(this.previewUsers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setAvatarImageUrl(UrlModel urlModel) {
        this.avatarImageUrl = urlModel;
    }

    public final void setAvatarImageUrlDark(UrlModel urlModel) {
        this.avatarImageUrlDark = urlModel;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setContentStruct(NoticeTextStruct noticeTextStruct) {
        this.contentStruct = noticeTextStruct;
    }

    public final void setIcons(List<EntranceIcon> list) {
        this.icons = list;
    }

    public final void setPreviewUsers(List<? extends User> list) {
        this.previewUsers = list;
    }

    public final void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUiStyle(int i) {
        this.uiStyle = i;
    }

    public final void setUnreadType(int i) {
        this.unreadType = i;
    }

    public InboxEntranceCellUIInfo(int i, UrlModel urlModel, UrlModel urlModel2, String str, String str2, int i2, String str3, List<EntranceIcon> list, NoticeTextStruct noticeTextStruct, List<? extends User> list2) {
        this.uiStyle = i;
        this.avatarImageUrl = urlModel;
        this.avatarImageUrlDark = urlModel2;
        this.title = str;
        this.content = str2;
        this.unreadType = i2;
        this.schemaUrl = str3;
        this.icons = list;
        this.contentStruct = noticeTextStruct;
        this.previewUsers = list2;
    }

    public InboxEntranceCellUIInfo(int i, UrlModel urlModel, UrlModel urlModel2, String str, String str2, int i2, String str3, List list, NoticeTextStruct noticeTextStruct, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 2 : i, (i3 & 2) != 0 ? null : urlModel, (i3 & 4) != 0 ? null : urlModel2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) == 0 ? str3 : "", (i3 & 128) != 0 ? C13BV.INSTANCE : list, (i3 & 256) != 0 ? null : noticeTextStruct, (i3 & 512) == 0 ? list2 : null);
    }
}
