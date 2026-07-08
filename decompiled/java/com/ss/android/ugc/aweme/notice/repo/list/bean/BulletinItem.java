package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinItem implements InterfaceC1891350zJl {

    @C09CT("forward_aweme")
    public final Aweme aweme;

    @C09CT("bottom_struct")
    public final BulletinItemBottomStruct bottomStruct;

    @C09CT("card_struct")
    public final BulletinCardInfo cardInfo;

    @C09CT("comment_overview")
    public BulletinCommentOverview commentOverview;

    @C09CT("create_time")
    public final long creatorTime;

    @C09CT("emoji_list")
    public final List<BulletinEmojiInfo> emojiList;

    @C09CT("has_read")
    public final boolean hasRead;

    @C09CT("images")
    public final List<BulletinImage> images;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String itemId;

    @C09CT("links")
    public final List<String> links;

    @C09CT("poll")
    public final BulletinPoll poll;

    @C09CT("publish_user")
    public final User publishUser;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("style_id")
    public final String styleId;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final int type;

    @C09CT("update_time")
    public final Long updateTime;

    @C09CT("view_count")
    public final int viewCount;

    @C09CT("voices")
    public final List<BulletinAudioInfo> voices;

    public static /* synthetic */ void getAweme$annotations() {
    }

    public static /* synthetic */ void getCardInfo$annotations() {
    }

    public static /* synthetic */ void getImages$annotations() {
    }

    public static /* synthetic */ void getLinks$annotations() {
    }

    public static /* synthetic */ void getPoll$annotations() {
    }

    public static /* synthetic */ void getText$annotations() {
    }

    public static /* synthetic */ void getVoices$annotations() {
    }

    public final BulletinItem copy(String str, int i, long j, Long l, int i2, int i3, String str2, String str3, List<String> list, List<BulletinImage> list2, BulletinPoll bulletinPoll, Aweme aweme, User user, BulletinCardInfo bulletinCardInfo, boolean z, List<BulletinEmojiInfo> list3, BulletinItemBottomStruct bulletinItemBottomStruct, BulletinCommentOverview bulletinCommentOverview, List<BulletinAudioInfo> list4) {
        return new BulletinItem(str, i, j, l, i2, i3, str2, str3, list, list2, bulletinPoll, aweme, user, bulletinCardInfo, z, list3, bulletinItemBottomStruct, bulletinCommentOverview, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinItem)) {
            return false;
        }
        BulletinItem bulletinItem = (BulletinItem) obj;
        return Intrinsics.LJFF(this.itemId, bulletinItem.itemId) && this.type == bulletinItem.type && this.creatorTime == bulletinItem.creatorTime && Intrinsics.LJFF(this.updateTime, bulletinItem.updateTime) && this.status == bulletinItem.status && this.viewCount == bulletinItem.viewCount && Intrinsics.LJFF(this.styleId, bulletinItem.styleId) && Intrinsics.LJFF(this.text, bulletinItem.text) && Intrinsics.LJFF(this.links, bulletinItem.links) && Intrinsics.LJFF(this.images, bulletinItem.images) && Intrinsics.LJFF(this.poll, bulletinItem.poll) && Intrinsics.LJFF(this.aweme, bulletinItem.aweme) && Intrinsics.LJFF(this.publishUser, bulletinItem.publishUser) && Intrinsics.LJFF(this.cardInfo, bulletinItem.cardInfo) && this.hasRead == bulletinItem.hasRead && Intrinsics.LJFF(this.emojiList, bulletinItem.emojiList) && Intrinsics.LJFF(this.bottomStruct, bulletinItem.bottomStruct) && Intrinsics.LJFF(this.commentOverview, bulletinItem.commentOverview) && Intrinsics.LJFF(this.voices, bulletinItem.voices);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.itemId;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.type) * 31) + C786410Ut5.Y2(this.creatorTime)) * 31;
        Long l = this.updateTime;
        int iHashCode2 = (((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + this.status) * 31) + this.viewCount) * 31;
        String str2 = this.styleId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.links;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<BulletinImage> list2 = this.images;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BulletinPoll bulletinPoll = this.poll;
        int iHashCode7 = (iHashCode6 + (bulletinPoll == null ? 0 : bulletinPoll.hashCode())) * 31;
        Aweme aweme = this.aweme;
        int iHashCode8 = (iHashCode7 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        User user = this.publishUser;
        int iHashCode9 = (iHashCode8 + (user == null ? 0 : user.hashCode())) * 31;
        BulletinCardInfo bulletinCardInfo = this.cardInfo;
        int iHashCode10 = (((iHashCode9 + (bulletinCardInfo == null ? 0 : bulletinCardInfo.hashCode())) * 31) + C786410Ut5.Z2(this.hasRead)) * 31;
        List<BulletinEmojiInfo> list3 = this.emojiList;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        BulletinItemBottomStruct bulletinItemBottomStruct = this.bottomStruct;
        int iHashCode12 = (iHashCode11 + (bulletinItemBottomStruct == null ? 0 : bulletinItemBottomStruct.hashCode())) * 31;
        BulletinCommentOverview bulletinCommentOverview = this.commentOverview;
        int iHashCode13 = (iHashCode12 + (bulletinCommentOverview == null ? 0 : bulletinCommentOverview.hashCode())) * 31;
        List<BulletinAudioInfo> list4 = this.voices;
        return iHashCode13 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        return "BulletinItem(itemId=" + this.itemId + ", type=" + this.type + ", creatorTime=" + this.creatorTime + ", updateTime=" + this.updateTime + ", status=" + this.status + ", viewCount=" + this.viewCount + ", styleId=" + this.styleId + ", text=" + this.text + ", links=" + this.links + ", images=" + this.images + ", poll=" + this.poll + ", aweme=" + this.aweme + ", publishUser=" + this.publishUser + ", cardInfo=" + this.cardInfo + ", hasRead=" + this.hasRead + ", emojiList=" + this.emojiList + ", bottomStruct=" + this.bottomStruct + ", commentOverview=" + this.commentOverview + ", voices=" + this.voices + ')';
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final BulletinItemBottomStruct getBottomStruct() {
        return this.bottomStruct;
    }

    public final BulletinCardInfo getCardInfo() {
        return this.cardInfo;
    }

    public final BulletinCommentOverview getCommentOverview() {
        return this.commentOverview;
    }

    public final long getCreatorTime() {
        return this.creatorTime;
    }

    public final List<BulletinEmojiInfo> getEmojiList() {
        return this.emojiList;
    }

    public final boolean getHasRead() {
        return this.hasRead;
    }

    public final List<BulletinImage> getImages() {
        return this.images;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final List<String> getLinks() {
        return this.links;
    }

    public final BulletinPoll getPoll() {
        return this.poll;
    }

    public final User getPublishUser() {
        return this.publishUser;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getStyleId() {
        return this.styleId;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public final List<BulletinAudioInfo> getVoices() {
        return this.voices;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final void setCommentOverview(BulletinCommentOverview bulletinCommentOverview) {
        this.commentOverview = bulletinCommentOverview;
    }

    public BulletinItem(String str, int i, long j, Long l, int i2, int i3, String str2, String str3, List<String> list, List<BulletinImage> list2, BulletinPoll bulletinPoll, Aweme aweme, User user, BulletinCardInfo bulletinCardInfo, boolean z, List<BulletinEmojiInfo> list3, BulletinItemBottomStruct bulletinItemBottomStruct, BulletinCommentOverview bulletinCommentOverview, List<BulletinAudioInfo> list4) {
        this.itemId = str;
        this.type = i;
        this.creatorTime = j;
        this.updateTime = l;
        this.status = i2;
        this.viewCount = i3;
        this.styleId = str2;
        this.text = str3;
        this.links = list;
        this.images = list2;
        this.poll = bulletinPoll;
        this.aweme = aweme;
        this.publishUser = user;
        this.cardInfo = bulletinCardInfo;
        this.hasRead = z;
        this.emojiList = list3;
        this.bottomStruct = bulletinItemBottomStruct;
        this.commentOverview = bulletinCommentOverview;
        this.voices = list4;
    }
}
