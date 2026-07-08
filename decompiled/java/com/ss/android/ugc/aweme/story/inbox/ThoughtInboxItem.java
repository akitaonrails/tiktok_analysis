package com.ss.android.ugc.aweme.story.inbox;

import X.C0ZB9;
import X.C1595950rdJ;
import X.C1598110rgn;
import X.C1600110rk1;
import X.C1600120rk2;
import X.C2188811AlT;
import X.InterfaceC1595240rcA;
import X.InterfaceC1596280rdq;
import X.InterfaceC1598460rhM;
import X.InterfaceC1890700zIi;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ThoughtInboxItem implements InterfaceC1891350zJl, InterfaceC1890700zIi, InterfaceC1598460rhM, InterfaceC1595240rcA, InterfaceC1596280rdq {
    public static final int $stable = 8;
    public int dataFrom;
    public int priority;
    public int rankState;
    public int reRankSequence;
    public Integer reRankType;
    public final ThoughtInfo thoughtInfo;
    public final User thoughtUser;
    public int storyStatusForInbox = -1;
    public final boolean isSingleUser = true;

    public final ThoughtInboxItem copy(User user, ThoughtInfo thoughtInfo, int i, int i2, Integer num, int i3) {
        return new ThoughtInboxItem(user, thoughtInfo, i, i2, num, i3);
    }

    @Override // X.InterfaceC1595240rcA
    public String getCellType() {
        return "thought";
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThoughtInboxItem(thoughtUser=");
        sbLIZ.append(this.thoughtUser);
        sbLIZ.append(", thoughtInfo=");
        sbLIZ.append(this.thoughtInfo);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", reRankSequence=");
        sbLIZ.append(this.reRankSequence);
        sbLIZ.append(", reRankType=");
        sbLIZ.append(this.reRankType);
        sbLIZ.append(", dataFrom=");
        sbLIZ.append(this.dataFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        String uid = this.thoughtUser.getUid();
        if (uid != null) {
            return uid.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC1595240rcA
    public String getUid() {
        return C1595950rdJ.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1890700zIi
    public String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skylight_thought_");
        sbLIZ.append(this.thoughtUser.getUid());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public C0ZB9 biz() {
        return C1598110rgn.LIZIZ;
    }

    public final int getDataFrom() {
        return this.dataFrom;
    }

    public final int getPriority() {
        return this.priority;
    }

    public int getRankState() {
        return this.rankState;
    }

    @Override // X.InterfaceC1595240rcA
    public int getReRankSequence() {
        return this.reRankSequence;
    }

    @Override // X.InterfaceC1595240rcA
    public Integer getReRankType() {
        return this.reRankType;
    }

    public int getStoryStatusForInbox() {
        return this.storyStatusForInbox;
    }

    public final ThoughtInfo getThoughtInfo() {
        return this.thoughtInfo;
    }

    public final User getThoughtUser() {
        return this.thoughtUser;
    }

    @Override // X.InterfaceC1595240rcA
    public User getUser() {
        return this.thoughtUser;
    }

    @Override // X.InterfaceC1595240rcA
    public boolean isSingleUser() {
        return this.isSingleUser;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uri;
        if (!(interfaceC1891350zJl instanceof ThoughtInboxItem)) {
            return false;
        }
        ThoughtInboxItem thoughtInboxItem = (ThoughtInboxItem) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.thoughtInfo, thoughtInboxItem.thoughtInfo)) {
            return false;
        }
        UrlModel avatarThumb = this.thoughtUser.getAvatarThumb();
        String uri2 = null;
        if (avatarThumb != null) {
            uri = avatarThumb.getUri();
        } else {
            uri = null;
        }
        UrlModel avatarThumb2 = thoughtInboxItem.thoughtUser.getAvatarThumb();
        if (avatarThumb2 != null) {
            uri2 = avatarThumb2.getUri();
        }
        if (!Intrinsics.LJFF(uri, uri2) || !Intrinsics.LJFF(this.thoughtUser.getNickname(), thoughtInboxItem.thoughtUser.getNickname())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof ThoughtInboxItem)) {
            return false;
        }
        return Intrinsics.LJFF(this.thoughtUser.getUid(), ((ThoughtInboxItem) interfaceC1891350zJl).thoughtUser.getUid());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1891350zJl)) {
            return false;
        }
        return areItemTheSame((InterfaceC1891350zJl) obj);
    }

    @Override // X.InterfaceC1598460rhM
    public String getItemFilterUid(String str) {
        String uid = this.thoughtUser.getUid();
        if (uid == null) {
            return "";
        }
        return uid;
    }

    @Override // X.InterfaceC1598460rhM
    public int getItemPriority(int i) {
        return this.priority;
    }

    @Override // X.InterfaceC1890700zIi
    public C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uri;
        if (!(interfaceC1891350zJl instanceof ThoughtInboxItem)) {
            return C1600110rk1.LIZ("unknown");
        }
        ThoughtInboxItem thoughtInboxItem = (ThoughtInboxItem) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(thoughtInboxItem.thoughtUser.getNickname(), this.thoughtUser.getNickname())) {
            return C1600110rk1.LIZ("nickname");
        }
        UrlModel avatarThumb = thoughtInboxItem.thoughtUser.getAvatarThumb();
        String uri2 = null;
        if (avatarThumb != null) {
            uri = avatarThumb.getUri();
        } else {
            uri = null;
        }
        UrlModel avatarThumb2 = this.thoughtUser.getAvatarThumb();
        if (avatarThumb2 != null) {
            uri2 = avatarThumb2.getUri();
        }
        if (!Intrinsics.LJFF(uri, uri2)) {
            return C1600110rk1.LIZ("avatar");
        }
        if (!Intrinsics.LJFF(thoughtInboxItem.thoughtInfo.textContent, this.thoughtInfo.textContent)) {
            return C1600110rk1.LIZ("thoughtinfo");
        }
        return C1600110rk1.LIZJ();
    }

    public final void setDataFrom(int i) {
        this.dataFrom = i;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    @Override // X.InterfaceC1596280rdq
    public void setRankState(int i) {
        this.rankState = i;
    }

    public void setReRankSequence(int i) {
        this.reRankSequence = i;
    }

    public void setReRankType(Integer num) {
        this.reRankType = num;
    }

    public void setStoryStatusForInbox(int i) {
        this.storyStatusForInbox = i;
    }

    public ThoughtInboxItem(User user, ThoughtInfo thoughtInfo, int i, int i2, Integer num, int i3) {
        this.thoughtUser = user;
        this.thoughtInfo = thoughtInfo;
        this.priority = i;
        this.reRankSequence = i2;
        this.reRankType = num;
        this.dataFrom = i3;
    }
}
