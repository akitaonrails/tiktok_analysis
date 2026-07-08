package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C0OL2;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardInfo implements Serializable {

    @C09CT("account_icon")
    public final TuxImageModel accountIcon;

    @C09CT("account_type")
    public final long accountType;

    @C09CT("avatar")
    public final UrlModel avatarUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long bulletinId;

    @C09CT("channel_owner")
    public final User channelOwner;

    @C09CT("desc")
    public final String description;

    @C09CT("edit_quota")
    public final Long editQuota;

    @C09CT("is_reply_enable")
    public final Boolean enableReply;

    @C09CT("name")
    public final String name;

    @C09CT("publish_quota")
    public final Long quota;

    @C09CT("reopen_deadline")
    public final Long reopenDeadline;

    @C09CT("account_status")
    public final Integer status;

    @C09CT("subscriber_count")
    public final Long subscriberCount;

    public BulletinBoardInfo() {
        this(-1L, "", null, null, null, null, null, null, null, null, null, C0OL2.BULLETIN_ACCOUNT_TYPE_NORMAL.getType(), null);
    }

    public final BulletinBoardInfo copy(long j, String str, UrlModel urlModel, String str2, Long l, Boolean bool, Long l2, Integer num, Long l3, Long l4, User user, long j2, TuxImageModel tuxImageModel) {
        return new BulletinBoardInfo(j, str, urlModel, str2, l, bool, l2, num, l3, l4, user, j2, tuxImageModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinBoardInfo)) {
            return false;
        }
        BulletinBoardInfo bulletinBoardInfo = (BulletinBoardInfo) obj;
        return this.bulletinId == bulletinBoardInfo.bulletinId && Intrinsics.LJFF(this.name, bulletinBoardInfo.name) && Intrinsics.LJFF(this.avatarUrl, bulletinBoardInfo.avatarUrl) && Intrinsics.LJFF(this.description, bulletinBoardInfo.description) && Intrinsics.LJFF(this.subscriberCount, bulletinBoardInfo.subscriberCount) && Intrinsics.LJFF(this.enableReply, bulletinBoardInfo.enableReply) && Intrinsics.LJFF(this.quota, bulletinBoardInfo.quota) && Intrinsics.LJFF(this.status, bulletinBoardInfo.status) && Intrinsics.LJFF(this.reopenDeadline, bulletinBoardInfo.reopenDeadline) && Intrinsics.LJFF(this.editQuota, bulletinBoardInfo.editQuota) && Intrinsics.LJFF(this.channelOwner, bulletinBoardInfo.channelOwner) && this.accountType == bulletinBoardInfo.accountType && Intrinsics.LJFF(this.accountIcon, bulletinBoardInfo.accountIcon);
    }

    public String toString() {
        return "BulletinBoardInfo(bulletinId=" + this.bulletinId + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", description=" + this.description + ", subscriberCount=" + this.subscriberCount + ", enableReply=" + this.enableReply + ", quota=" + this.quota + ", status=" + this.status + ", reopenDeadline=" + this.reopenDeadline + ", editQuota=" + this.editQuota + ", channelOwner=" + this.channelOwner + ", accountType=" + this.accountType + ", accountIcon=" + this.accountIcon + ')';
    }

    public BulletinBoardInfo(long j, String str, UrlModel urlModel, String str2, Long l, Boolean bool, Long l2, Integer num, Long l3, Long l4, User user, long j2, TuxImageModel tuxImageModel) {
        this.bulletinId = j;
        this.name = str;
        this.avatarUrl = urlModel;
        this.description = str2;
        this.subscriberCount = l;
        this.enableReply = bool;
        this.quota = l2;
        this.status = num;
        this.reopenDeadline = l3;
        this.editQuota = l4;
        this.channelOwner = user;
        this.accountType = j2;
        this.accountIcon = tuxImageModel;
    }
}
