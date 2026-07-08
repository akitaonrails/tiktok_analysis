package com.ss.android.ugc.aweme.story.inbox;

import X.AnonymousClass0068;
import X.C10EU;
import X.C1245160iVW;
import X.C1595950rdJ;
import X.C1598110rgn;
import X.C1598120rgo;
import X.C1600110rk1;
import X.C1600120rk2;
import X.C1605650rsx;
import X.C2188811AlT;
import X.C712780Rxc;
import X.C727450SgB;
import X.C729510SjV;
import X.EnumC1615506Uf;
import X.InterfaceC1595240rcA;
import X.InterfaceC1596280rdq;
import X.InterfaceC1598460rhM;
import X.InterfaceC1890700zIi;
import X.InterfaceC1891350zJl;
import X.InterfaceC714040Rze;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryInboxItem implements InterfaceC1891350zJl, InterfaceC714040Rze, InterfaceC1890700zIi, InterfaceC1595240rcA, InterfaceC1596280rdq, InterfaceC1598460rhM {
    public static final int $stable = 8;
    public final boolean concernUserAvatarChanged;
    public int dataFrom;
    public final boolean isMe;
    public final Aweme latestStoryNoteInfo;
    public int priority;
    public int rankState;
    public int reRankSequence;
    public Integer reRankType;
    public long receiveTime;
    public final AnonymousClass0068 revealInfo;
    public final Aweme storyCollection;
    public final ThoughtInfo thoughtInfo;
    public int storyStatusForInbox = C1605650rsx.LIZIZ.LJIIZILJ(EnumC1615506Uf.STORY, C729510SjV.LJIIIZ(getStoryCollection()));
    public final boolean isSingleUser = true;

    public final StoryInboxItem copy(Aweme aweme, int i, boolean z, Aweme aweme2, ThoughtInfo thoughtInfo, boolean z2, int i2, Integer num, AnonymousClass0068 anonymousClass0068, int i3, long j) {
        return new StoryInboxItem(aweme, i, z, aweme2, thoughtInfo, z2, i2, num, anonymousClass0068, i3, j);
    }

    public int hashCode() {
        int iHashCode = 0;
        try {
            Aweme storyCollection = getStoryCollection();
            if (storyCollection != null) {
                iHashCode = storyCollection.hashCode();
                return iHashCode;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return iHashCode;
    }

    public String toString() {
        return "StoryInboxItem(storyCollection=" + this.storyCollection + ", priority=" + this.priority + ", isMe=" + this.isMe + ", latestStoryNoteInfo=" + this.latestStoryNoteInfo + ", thoughtInfo=" + this.thoughtInfo + ", concernUserAvatarChanged=" + this.concernUserAvatarChanged + ", reRankSequence=" + this.reRankSequence + ", reRankType=" + this.reRankType + ", revealInfo=" + this.revealInfo + ", dataFrom=" + this.dataFrom + ", receiveTime=" + this.receiveTime + ')';
    }

    @Override // X.InterfaceC1595240rcA
    public String getCellType() {
        User user = getUser();
        if (C10EU.LJIIZILJ(user != null ? user.getUid() : null)) {
            return "create";
        }
        User user2 = getUser();
        return (user2 == null || !C727450SgB.LIZ(user2)) ? "story" : "story_reveal";
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
        Aweme storyCollection = getStoryCollection();
        if (storyCollection != null) {
            return storyCollection.getAuthor();
        }
        return null;
    }

    @Override // X.InterfaceC714040Rze
    public boolean hasUnreadStory() {
        return C712780Rxc.LIZ(this);
    }

    public final boolean isReveal() {
        return C729510SjV.LJIJI(getStoryCollection()) || Intrinsics.LJFF(getStoryCollection().getAid(), "reveal_story") || this.revealInfo != null;
    }

    @Override // X.InterfaceC1595240rcA
    public boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1890700zIi
    public String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skylight_story_");
        sbLIZ.append(C729510SjV.LJIIIZ(getStoryCollection()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getConcernUserAvatarChanged() {
        return this.concernUserAvatarChanged;
    }

    public final int getDataFrom() {
        return this.dataFrom;
    }

    public final Aweme getLatestStoryNoteInfo() {
        return this.latestStoryNoteInfo;
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

    public final long getReceiveTime() {
        return this.receiveTime;
    }

    public final AnonymousClass0068 getRevealInfo() {
        return this.revealInfo;
    }

    @Override // X.InterfaceC714040Rze
    public Aweme getStoryCollection() {
        return this.storyCollection;
    }

    public int getStoryStatusForInbox() {
        return this.storyStatusForInbox;
    }

    public final ThoughtInfo getThoughtInfo() {
        return this.thoughtInfo;
    }

    public final boolean isMe() {
        return this.isMe;
    }

    @Override // X.InterfaceC1595240rcA
    public boolean isSingleUser() {
        return this.isSingleUser;
    }

    @Override // X.InterfaceC1890700zIi
    public C1598110rgn biz() {
        return C1598110rgn.LIZIZ;
    }

    private final boolean areRevealDisplayUserUidsTheSame(StoryInboxItem storyInboxItem) {
        List<User> revealDisplayUsers;
        User author = getStoryCollection().getAuthor();
        List<User> revealDisplayUsers2 = null;
        if (author != null) {
            revealDisplayUsers = author.getRevealDisplayUsers();
        } else {
            revealDisplayUsers = null;
        }
        User author2 = storyInboxItem.getStoryCollection().getAuthor();
        if (author2 != null) {
            revealDisplayUsers2 = author2.getRevealDisplayUsers();
        }
        if (revealDisplayUsers == revealDisplayUsers2) {
            return true;
        }
        if (revealDisplayUsers != null && revealDisplayUsers2 != null) {
            return Intrinsics.LJFF(toUidSet(revealDisplayUsers), toUidSet(revealDisplayUsers2));
        }
        return false;
    }

    private final boolean findSpecialStoryStatusInMe(StoryInboxItem storyInboxItem) {
        Integer numValueOf;
        if (!storyInboxItem.isMe || !this.isMe) {
            return false;
        }
        User author = getStoryCollection().getAuthor();
        Integer numValueOf2 = null;
        if (author != null) {
            numValueOf = Integer.valueOf(author.getStoryStatus());
        } else {
            numValueOf = null;
        }
        User author2 = storyInboxItem.getStoryCollection().getAuthor();
        if (author2 != null) {
            numValueOf2 = Integer.valueOf(author2.getStoryStatus());
        }
        if ((numValueOf2 == null || numValueOf2.intValue() != -56831 || Intrinsics.LJFF(numValueOf, numValueOf2)) && (numValueOf == null || numValueOf.intValue() != -56831 || Intrinsics.LJFF(numValueOf, numValueOf2))) {
            return false;
        }
        return true;
    }

    private final boolean isContentTheSame(StoryInboxItem storyInboxItem) {
        String uri;
        String uri2;
        Integer num;
        AvatarMetaInfo avatarMetaInfoLIZIZ;
        AvatarMetaInfo avatarMetaInfoLIZIZ2;
        UrlModel avatarThumb;
        UrlModel avatarThumb2;
        if (this.concernUserAvatarChanged) {
            User author = getStoryCollection().getAuthor();
            Integer num2 = null;
            if (author != null && (avatarThumb2 = author.getAvatarThumb()) != null) {
                uri = avatarThumb2.getUri();
            } else {
                uri = null;
            }
            User author2 = storyInboxItem.getStoryCollection().getAuthor();
            if (author2 != null && (avatarThumb = author2.getAvatarThumb()) != null) {
                uri2 = avatarThumb.getUri();
            } else {
                uri2 = null;
            }
            if (!Intrinsics.LJFF(uri, uri2)) {
                return false;
            }
            User author3 = getStoryCollection().getAuthor();
            if (author3 != null && (avatarMetaInfoLIZIZ2 = C1245160iVW.LIZIZ(author3)) != null) {
                num = avatarMetaInfoLIZIZ2.avatarChoice;
            } else {
                num = null;
            }
            User author4 = storyInboxItem.getStoryCollection().getAuthor();
            if (author4 != null && (avatarMetaInfoLIZIZ = C1245160iVW.LIZIZ(author4)) != null) {
                num2 = avatarMetaInfoLIZIZ.avatarChoice;
            }
            if (!Intrinsics.LJFF(num, num2)) {
                return false;
            }
        }
        if ((isReveal() && !areRevealDisplayUserUidsTheSame(storyInboxItem)) || !Intrinsics.LJFF(getStoryCollection(), storyInboxItem.getStoryCollection()) || !Intrinsics.LJFF(this.thoughtInfo, storyInboxItem.thoughtInfo)) {
            return false;
        }
        return true;
    }

    private final boolean isReRankSequenceTheSame(StoryInboxItem storyInboxItem) {
        if (getReRankSequence() == storyInboxItem.getReRankSequence()) {
            return true;
        }
        return false;
    }

    private final boolean isRequestIdTheSame(StoryInboxItem storyInboxItem) {
        return Intrinsics.LJFF(getStoryCollection().getRequestId(), storyInboxItem.getStoryCollection().getRequestId());
    }

    private final Set<String> toUidSet(List<? extends User> list) {
        HashSet hashSet = new HashSet(list.size());
        Iterator<? extends User> it2 = list.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getUid());
        }
        return hashSet;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof StoryInboxItem)) {
            return false;
        }
        StoryInboxItem storyInboxItem = (StoryInboxItem) interfaceC1891350zJl;
        if (findSpecialStoryStatusInMe(storyInboxItem) || !isRequestIdTheSame(storyInboxItem) || !isReRankSequenceTheSame(storyInboxItem) || !isContentTheSame(storyInboxItem)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof StoryInboxItem) && getStoryCollection() != null) {
            StoryInboxItem storyInboxItem = (StoryInboxItem) interfaceC1891350zJl;
            if (storyInboxItem.getStoryCollection() != null) {
                return Intrinsics.LJFF(C729510SjV.LJIIIZ(getStoryCollection()), C729510SjV.LJIIIZ(storyInboxItem.getStoryCollection()));
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1891350zJl)) {
            return false;
        }
        return areItemTheSame((InterfaceC1891350zJl) obj);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof StoryInboxItem)) {
            return null;
        }
        isRequestIdTheSame((StoryInboxItem) interfaceC1891350zJl);
        return new C1598120rgo(!isContentTheSame(r3));
    }

    @Override // X.InterfaceC1598460rhM
    public String getItemFilterUid(String str) {
        if (this.isMe) {
            return str;
        }
        return AwemeExtKt.getAuthorUid(getStoryCollection());
    }

    @Override // X.InterfaceC1598460rhM
    public int getItemPriority(int i) {
        return this.priority;
    }

    public final boolean isCacheData(long j) {
        int i = this.dataFrom;
        if (i == 1 || i == 2 || this.receiveTime <= j) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numValueOf;
        List<Aweme> stories;
        List<Aweme> stories2;
        if (!(interfaceC1891350zJl instanceof StoryInboxItem)) {
            return C1600110rk1.LIZ("unknown");
        }
        StoryInboxItem storyInboxItem = (StoryInboxItem) interfaceC1891350zJl;
        if (storyInboxItem.getStoryStatusForInbox() != getStoryStatusForInbox() && getStoryStatusForInbox() > 0) {
            return C1600110rk1.LIZ("is_story");
        }
        UserStory userStory = storyInboxItem.getStoryCollection().getUserStory();
        Integer numValueOf2 = null;
        if (userStory != null && (stories2 = userStory.getStories()) != null) {
            numValueOf = Integer.valueOf(stories2.size());
        } else {
            numValueOf = null;
        }
        UserStory userStory2 = getStoryCollection().getUserStory();
        if (userStory2 != null && (stories = userStory2.getStories()) != null) {
            numValueOf2 = Integer.valueOf(stories.size());
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
            return C1600110rk1.LIZ("title");
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

    public final void setReceiveTime(long j) {
        this.receiveTime = j;
    }

    public void setStoryStatusForInbox(int i) {
        this.storyStatusForInbox = i;
    }

    public StoryInboxItem(Aweme aweme, int i, boolean z, Aweme aweme2, ThoughtInfo thoughtInfo, boolean z2, int i2, Integer num, AnonymousClass0068 anonymousClass0068, int i3, long j) {
        this.storyCollection = aweme;
        this.priority = i;
        this.isMe = z;
        this.latestStoryNoteInfo = aweme2;
        this.thoughtInfo = thoughtInfo;
        this.concernUserAvatarChanged = z2;
        this.reRankSequence = i2;
        this.reRankType = num;
        this.revealInfo = anonymousClass0068;
        this.dataFrom = i3;
        this.receiveTime = j;
    }
}
