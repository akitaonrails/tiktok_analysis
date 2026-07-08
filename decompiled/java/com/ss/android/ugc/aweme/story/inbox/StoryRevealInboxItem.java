package com.ss.android.ugc.aweme.story.inbox;

import X.C13BV;
import X.C1595950rdJ;
import X.C1598110rgn;
import X.C1598120rgo;
import X.C1600110rk1;
import X.C1600120rk2;
import X.C1605650rsx;
import X.C2188811AlT;
import X.C712780Rxc;
import X.C729510SjV;
import X.EnumC1615506Uf;
import X.InterfaceC1595240rcA;
import X.InterfaceC1596280rdq;
import X.InterfaceC1598460rhM;
import X.InterfaceC1890700zIi;
import X.InterfaceC1891350zJl;
import X.InterfaceC714040Rze;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryRevealInboxItem implements InterfaceC1891350zJl, InterfaceC714040Rze, InterfaceC1890700zIi, InterfaceC1595240rcA, InterfaceC1596280rdq, InterfaceC1598460rhM {
    public static final int $stable = 8;
    public final List<User> displayUsers;
    public final boolean isSingleUser;
    public int priority;
    public int rankState;
    public int reRankSequence;
    public Integer reRankType;
    public final Aweme storyCollection;
    public int storyStatusForInbox;

    public final StoryRevealInboxItem copy(Aweme aweme, List<? extends User> list, int i, int i2, Integer num) {
        return new StoryRevealInboxItem(aweme, list, i, i2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryRevealInboxItem)) {
            return false;
        }
        StoryRevealInboxItem storyRevealInboxItem = (StoryRevealInboxItem) obj;
        return Intrinsics.LJFF(this.storyCollection, storyRevealInboxItem.storyCollection) && Intrinsics.LJFF(this.displayUsers, storyRevealInboxItem.displayUsers) && this.priority == storyRevealInboxItem.priority && this.reRankSequence == storyRevealInboxItem.reRankSequence && Intrinsics.LJFF(this.reRankType, storyRevealInboxItem.reRankType);
    }

    @Override // X.InterfaceC1595240rcA
    public String getCellType() {
        return "story_reveal";
    }

    public int hashCode() {
        int iHashCode = ((((((this.storyCollection.hashCode() * 31) + this.displayUsers.hashCode()) * 31) + this.priority) * 31) + this.reRankSequence) * 31;
        Integer num = this.reRankType;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryRevealInboxItem(storyCollection=");
        sbLIZ.append(this.storyCollection);
        sbLIZ.append(", displayUsers=");
        sbLIZ.append(this.displayUsers);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", reRankSequence=");
        sbLIZ.append(this.reRankSequence);
        sbLIZ.append(", reRankType=");
        sbLIZ.append(this.reRankType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Aweme getSocialItem() {
        return getStoryCollection();
    }

    @Override // X.InterfaceC1595240rcA
    public String getUid() {
        return C1595950rdJ.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public User getUser() {
        return getStoryCollection().getAuthor();
    }

    @Override // X.InterfaceC714040Rze
    public boolean hasUnreadStory() {
        return C712780Rxc.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1890700zIi
    public String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skylight_story_reveal_");
        sbLIZ.append(C729510SjV.LJIIIZ(getStoryCollection()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<User> getDisplayUsers() {
        return this.displayUsers;
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

    @Override // X.InterfaceC714040Rze
    public Aweme getStoryCollection() {
        return this.storyCollection;
    }

    public int getStoryStatusForInbox() {
        return this.storyStatusForInbox;
    }

    @Override // X.InterfaceC1595240rcA
    public boolean isSingleUser() {
        return this.isSingleUser;
    }

    @Override // X.InterfaceC1890700zIi
    public C1598110rgn biz() {
        return C1598110rgn.LIZIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof StoryRevealInboxItem)) {
            return false;
        }
        StoryRevealInboxItem storyRevealInboxItem = (StoryRevealInboxItem) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(getStoryCollection(), storyRevealInboxItem.getStoryCollection()) || getReRankSequence() != storyRevealInboxItem.getReRankSequence() || !Intrinsics.LJFF(getReRankType(), storyRevealInboxItem.getReRankType()) || this.priority != storyRevealInboxItem.priority) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof StoryRevealInboxItem)) {
            return false;
        }
        return Intrinsics.LJFF(C729510SjV.LJIIIZ(getStoryCollection()), C729510SjV.LJIIIZ(((StoryRevealInboxItem) interfaceC1891350zJl).getStoryCollection()));
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof StoryRevealInboxItem)) {
            return null;
        }
        Intrinsics.LJFF(getStoryCollection().getRequestId(), ((StoryRevealInboxItem) interfaceC1891350zJl).getStoryCollection().getRequestId());
        return new C1598120rgo(!Intrinsics.LJFF(getStoryCollection(), r4.getStoryCollection()));
    }

    @Override // X.InterfaceC1598460rhM
    public String getItemFilterUid(String str) {
        return AwemeExtKt.getAuthorUid(getStoryCollection());
    }

    @Override // X.InterfaceC1598460rhM
    public int getItemPriority(int i) {
        return this.priority;
    }

    @Override // X.InterfaceC1890700zIi
    public C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof StoryRevealInboxItem)) {
            return C1600110rk1.LIZ("unknown");
        }
        if (((StoryRevealInboxItem) interfaceC1891350zJl).getStoryStatusForInbox() != getStoryStatusForInbox() && getStoryStatusForInbox() > 0) {
            return C1600110rk1.LIZ("is_story");
        }
        return C1600110rk1.LIZJ();
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

    /* JADX WARN: Multi-variable type inference failed */
    public StoryRevealInboxItem(Aweme aweme, List<? extends User> list, int i, int i2, Integer num) {
        this.storyCollection = aweme;
        this.displayUsers = list;
        this.priority = i;
        this.reRankSequence = i2;
        this.reRankType = num;
        this.storyStatusForInbox = C1605650rsx.LIZIZ.LJIIZILJ(EnumC1615506Uf.STORY, C729510SjV.LJIIIZ(getStoryCollection()));
        this.isSingleUser = true;
    }

    public StoryRevealInboxItem(Aweme aweme, List list, int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(aweme, (i3 & 2) != 0 ? C13BV.INSTANCE : list, (i3 & 4) != 0 ? Integer.MAX_VALUE : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? -1 : num);
    }
}
