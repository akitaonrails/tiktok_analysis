package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC1598130rgp;
import X.AbstractC895380ZAq;
import X.C09CT;
import X.C1209404oG;
import X.C13BV;
import X.C1596480reA;
import X.C1598110rgn;
import X.C1599090riN;
import X.C1599110riP;
import X.C1600110rk1;
import X.C1600120rk2;
import X.C1697810uHb;
import X.C295190Bhd;
import X.C729510SjV;
import X.C890610Ywl;
import X.EnumC1596540reG;
import X.InterfaceC1891350zJl;
import X.InterfaceC1903450zdH;
import X.InterfaceC712200Rwg;
import X.InterfaceC714040Rze;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.bean.MixRankSkylightBusinessControl;
import com.ss.android.ugc.aweme.bean.MixRankSkylightItem;
import com.ss.android.ugc.aweme.bean.MixRankSkylightItemBizData;
import com.ss.android.ugc.aweme.bean.MixRankSkylightPageControl;
import com.ss.android.ugc.aweme.bean.MixRankSkylightResponse;
import com.ss.android.ugc.aweme.bean.MixRankSkylightSceneResponse;
import com.ss.android.ugc.aweme.bean.MixRankSkylightStoryBiz;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightFriendPostResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;
import com.ss.android.ugc.aweme.story.inbox.SkylightStoryUser;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxHorizontalTopListCombinePod extends AbstractC895380ZAq implements Serializable, InterfaceC1903450zdH {
    public static final int $stable = 8;
    public transient Long LLILLJJLI;
    public boolean LLILLL;
    public final SkylightDataResponse LLILZ;
    public MixRankSkylightResponse LLILZIL;
    public final OnThisDayResponse LLILZLL;
    public final SkylightFriendPostResponse LLIZ;
    public Boolean LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public String LLJJ;
    public final boolean LLJJI;
    public final transient List<InterfaceC1891350zJl> LLJJIII;
    public final transient String LLJJIJI;
    public long LLJJIJIIJIL;
    public final int LLJJIJIL;

    @C09CT("cache_time")
    public final long cacheTime;

    @C09CT("live_notices")
    public final List<CombineLiveNotice> liveNotices;

    @C09CT("story_response")
    public StoryGetFeedByPageResponse storyGetFeedByPageResponse;

    public InboxHorizontalTopListCombinePod() {
        this(null, null, null, 0L, false, null, null, null, null, null, false, null, 0L, false, 0, 0, null, false, null, null, 1048575, null);
    }

    public final InboxHorizontalTopListCombinePod copy(List<CombineLiveNotice> list, Long l, StoryGetFeedByPageResponse storyGetFeedByPageResponse, long j, boolean z, SkylightDataResponse skylightDataResponse, MixRankSkylightResponse mixRankSkylightResponse, OnThisDayResponse onThisDayResponse, SkylightFriendPostResponse skylightFriendPostResponse, Boolean bool, boolean z2, String str, long j2, boolean z3, int i, int i2, String str2, boolean z4, List<? extends InterfaceC1891350zJl> list2, String str3) {
        return new InboxHorizontalTopListCombinePod(list, l, storyGetFeedByPageResponse, j, z, skylightDataResponse, mixRankSkylightResponse, onThisDayResponse, skylightFriendPostResponse, bool, z2, str, j2, z3, i, i2, str2, z4, list2, str3);
    }

    @Override // X.AbstractC895380ZAq
    public boolean isUnread() {
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public String itemUniqueId() {
        return "skylight";
    }

    public String toString() {
        return "InboxHorizontalTopListCombinePod(liveNotices=" + this.liveNotices + ", liveResponseTime=" + this.LLILLJJLI + ", storyGetFeedByPageResponse=" + this.storyGetFeedByPageResponse + ", cacheTime=" + this.cacheTime + ", isDefault=" + this.LLILLL + ", skylightData=" + this.LLILZ + ", mixRankSkylightData=" + this.LLILZIL + ", onThisDayData=" + this.LLILZLL + ", friendsPost=" + this.LLIZ + ", activeSwitchStatus=" + this.LLIZLLLIL + ", originalState=" + this.LLJ + ", insertStoryUid=" + this.LLJI + ", cacheTimeStamp=" + this.LLJIJIL + ", shouldScroll=" + this.LLJILJIL + ", reRankSequence=" + this.LLJILJILJ + ", reRankType=" + this.LLJILLL + ", targetUid=" + this.LLJJ + ", isLoadMoreData=" + this.LLJJI + ", coordinatorDisplayItems=" + this.LLJJIII + ", coordinatorPageCursor=" + this.LLJJIJI + ')';
    }

    @Override // X.InterfaceC1903450zdH
    public String uniqueItemIdForFirstScreen() {
        return "skylight";
    }

    @Override // X.AbstractC895380ZAq
    public C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
        return new C890610Ywl(600, 0L, this.type, isUnread(), this, null, 96);
    }

    public final List<String> extractLiveUserIds() {
        List<SkylightData> dataList;
        Long l;
        String string;
        AbstractC1598130rgp abstractC1598130rgp;
        InboxLiveNotice inboxLiveNoticeLIZIZ;
        User user;
        String uid;
        List<InterfaceC1891350zJl> list = this.LLJJIII;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if ((interfaceC1891350zJl instanceof AbstractC1598130rgp) && (abstractC1598130rgp = (AbstractC1598130rgp) interfaceC1891350zJl) != null && (inboxLiveNoticeLIZIZ = abstractC1598130rgp.LIZIZ()) != null && (user = inboxLiveNoticeLIZIZ.user) != null && (uid = user.getUid()) != null) {
                    arrayList.add(uid);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            return null;
        }
        if (C1209404oG.LIZ()) {
            MixRankSkylightResponse mixRankSkylightResponse = this.LLILZIL;
            if (mixRankSkylightResponse != null) {
                return C1596480reA.LIZ(mixRankSkylightResponse, EnumC1596540reG.INBOX_TAB.getValue());
            }
            return null;
        }
        SkylightDataResponse skylightDataResponse = this.LLILZ;
        if (skylightDataResponse == null || (dataList = skylightDataResponse.getDataList()) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (SkylightData skylightData : dataList) {
            if (skylightData.bizType == 3 && (l = skylightData.uid) != null && (string = l.toString()) != null) {
                arrayList2.add(string);
            }
        }
        return arrayList2;
    }

    public final List<User> extractLiveUsers() {
        List<SkylightData> dataList;
        CustomBizData customBizData;
        User user;
        List<MixRankSkylightItem> listLIZIZ;
        MixRankSkylightItemBizData mixRankSkylightItemBizData;
        User user2;
        AbstractC1598130rgp abstractC1598130rgp;
        InboxLiveNotice inboxLiveNoticeLIZIZ;
        User user3;
        List<InterfaceC1891350zJl> list = this.LLJJIII;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if ((interfaceC1891350zJl instanceof AbstractC1598130rgp) && (abstractC1598130rgp = (AbstractC1598130rgp) interfaceC1891350zJl) != null && (inboxLiveNoticeLIZIZ = abstractC1598130rgp.LIZIZ()) != null && (user3 = inboxLiveNoticeLIZIZ.user) != null) {
                    arrayList2.add(user3);
                }
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
            return null;
        }
        if (C1209404oG.LIZ()) {
            MixRankSkylightResponse mixRankSkylightResponse = this.LLILZIL;
            if (mixRankSkylightResponse != null && (listLIZIZ = C1596480reA.LIZIZ(mixRankSkylightResponse, EnumC1596540reG.INBOX_TAB.getValue())) != null) {
                arrayList = new ArrayList();
                for (MixRankSkylightItem mixRankSkylightItem : listLIZIZ) {
                    Integer num = mixRankSkylightItem.bizGroup;
                    if (num != null && num.intValue() == 2 && (mixRankSkylightItemBizData = mixRankSkylightItem.bizData) != null && (user2 = mixRankSkylightItemBizData.user) != null) {
                        arrayList.add(user2);
                    }
                }
            }
        } else {
            SkylightDataResponse skylightDataResponse = this.LLILZ;
            if (skylightDataResponse != null && (dataList = skylightDataResponse.getDataList()) != null) {
                arrayList = new ArrayList();
                for (SkylightData skylightData : dataList) {
                    if (skylightData.bizType == 3 && (customBizData = skylightData.customBizData) != null && (user = customBizData.user) != null) {
                        arrayList.add(user);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Aweme> extractStories() {
        Aweme storyCollection;
        List<InterfaceC1891350zJl> list = this.LLJJIII;
        if (list == null) {
            if (C1209404oG.LIZ()) {
                MixRankSkylightResponse mixRankSkylightResponse = this.LLILZIL;
                if (mixRankSkylightResponse != null) {
                    return C1596480reA.LIZJ(mixRankSkylightResponse, EnumC1596540reG.INBOX_TAB.getValue());
                }
                return null;
            }
            StoryGetFeedByPageResponse storyGetFeedByPageResponse = this.storyGetFeedByPageResponse;
            if (storyGetFeedByPageResponse != null) {
                return storyGetFeedByPageResponse.getAwemes();
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if (interfaceC1891350zJl instanceof InterfaceC714040Rze) {
                storyCollection = ((InterfaceC714040Rze) interfaceC1891350zJl).getStoryCollection();
            } else if (interfaceC1891350zJl instanceof InterfaceC712200Rwg) {
                storyCollection = ((InterfaceC712200Rwg) interfaceC1891350zJl).getHighlightCollection();
            }
            if (storyCollection != null) {
                arrayList.add(storyCollection);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    public final String passthroughPageToken() {
        StoryGetFeedByPageResponse storyGetFeedByPageResponse;
        if (this.LLJJIII != null || C1209404oG.LIZ() || (storyGetFeedByPageResponse = this.storyGetFeedByPageResponse) == null) {
            return null;
        }
        return storyGetFeedByPageResponse.getPageControlToken();
    }

    public final boolean allMafStories() {
        List<SkylightStoryUser> skylightStoryUsers;
        Integer num;
        List<MixRankSkylightSceneResponse> sceneResponses;
        MixRankSkylightSceneResponse next;
        MixRankSkylightBusinessControl mixRankSkylightBusinessControl;
        MixRankSkylightStoryBiz mixRankSkylightStoryBiz;
        List<SkylightStoryUser> list;
        Integer num2;
        if (C1209404oG.LIZ()) {
            MixRankSkylightResponse mixRankSkylightResponse = this.LLILZIL;
            if (mixRankSkylightResponse == null || (sceneResponses = mixRankSkylightResponse.getSceneResponses()) == null) {
                return false;
            }
            Iterator<MixRankSkylightSceneResponse> it2 = sceneResponses.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.scene == EnumC1596540reG.INBOX_TAB.getValue()) {
                    break;
                }
            }
            MixRankSkylightSceneResponse mixRankSkylightSceneResponse = next;
            if (mixRankSkylightSceneResponse == null || (mixRankSkylightBusinessControl = mixRankSkylightSceneResponse.businessControl) == null || (mixRankSkylightStoryBiz = mixRankSkylightBusinessControl.storyControl) == null || (list = mixRankSkylightStoryBiz.users) == null) {
                return false;
            }
            if (!list.isEmpty()) {
                for (SkylightStoryUser skylightStoryUser : list) {
                    Long l = skylightStoryUser.userId;
                    if (!C729510SjV.LJIILJJIL(l != null ? l.toString() : null) && ((num2 = skylightStoryUser.relationType) == null || num2.intValue() != 3)) {
                        return false;
                    }
                }
            }
        } else {
            StoryGetFeedByPageResponse storyGetFeedByPageResponse = this.storyGetFeedByPageResponse;
            if (storyGetFeedByPageResponse == null || (skylightStoryUsers = storyGetFeedByPageResponse.getSkylightStoryUsers()) == null) {
                return false;
            }
            if (!skylightStoryUsers.isEmpty()) {
                for (SkylightStoryUser skylightStoryUser2 : skylightStoryUsers) {
                    Long l2 = skylightStoryUser2.userId;
                    if (!C729510SjV.LJIILJJIL(l2 != null ? l2.toString() : null) && ((num = skylightStoryUser2.relationType) == null || num.intValue() != 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final List<User> extractThoughtUsers() {
        MixRankSkylightResponse mixRankSkylightResponse;
        List<MixRankSkylightItem> listLIZIZ;
        MixRankSkylightItemBizData mixRankSkylightItemBizData;
        User user;
        ArrayList arrayList = null;
        if (C1209404oG.LIZ() && (mixRankSkylightResponse = this.LLILZIL) != null && (listLIZIZ = C1596480reA.LIZIZ(mixRankSkylightResponse, EnumC1596540reG.INBOX_TAB.getValue())) != null) {
            arrayList = new ArrayList();
            for (MixRankSkylightItem mixRankSkylightItem : listLIZIZ) {
                Integer num = mixRankSkylightItem.bizGroup;
                if (num != null && num.intValue() == 4 && (mixRankSkylightItemBizData = mixRankSkylightItem.bizData) != null && (user = mixRankSkylightItemBizData.user) != null) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public final int getTotalLiveStoryCountExcludingMainStateStory() {
        List<String> listExtractLiveUserIds = extractLiveUserIds();
        int i = 0;
        int size = listExtractLiveUserIds != null ? listExtractLiveUserIds.size() : 0;
        List<Aweme> listExtractStories = extractStories();
        if (listExtractStories == null) {
            listExtractStories = C13BV.INSTANCE;
        }
        if (!(listExtractStories instanceof Collection) || !listExtractStories.isEmpty()) {
            Iterator<Aweme> it2 = listExtractStories.iterator();
            while (it2.hasNext()) {
                if ((!C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid(it2.next()))) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return size + i;
    }

    @Override // X.AbstractC895380ZAq
    public int hashCode() {
        int iHashCode = super.hashCode();
        StoryGetFeedByPageResponse storyGetFeedByPageResponse = this.storyGetFeedByPageResponse;
        int iHashCode2 = iHashCode + (storyGetFeedByPageResponse != null ? storyGetFeedByPageResponse.hashCode() : 0) + this.liveNotices.hashCode();
        List<InterfaceC1891350zJl> list = this.LLJJIII;
        int iIdentityHashCode = iHashCode2 + (list != null ? System.identityHashCode(list) : 0);
        String str = this.LLJJIJI;
        return iIdentityHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String pageToken() {
        StoryGetFeedByPageResponse storyGetFeedByPageResponse;
        List<MixRankSkylightSceneResponse> sceneResponses;
        MixRankSkylightSceneResponse next;
        MixRankSkylightPageControl mixRankSkylightPageControl;
        if (!C1599090riN.LIZ()) {
            return null;
        }
        if (this.LLJJIII != null) {
            return this.LLJJIJI;
        }
        boolean z = !C295190Bhd.LIZ();
        if (!C1209404oG.LIZ()) {
            if (!z || (storyGetFeedByPageResponse = this.storyGetFeedByPageResponse) == null || !storyGetFeedByPageResponse.getHasMore()) {
                return null;
            }
            StoryGetFeedByPageResponse storyGetFeedByPageResponse2 = this.storyGetFeedByPageResponse;
            return String.valueOf(storyGetFeedByPageResponse2 != null ? Long.valueOf(storyGetFeedByPageResponse2.getCursor()) : null);
        }
        C1599110riP.LIZ().LIZIZ();
        MixRankSkylightResponse mixRankSkylightResponse = this.LLILZIL;
        if (mixRankSkylightResponse == null || (sceneResponses = mixRankSkylightResponse.getSceneResponses()) == null) {
            return null;
        }
        Iterator<MixRankSkylightSceneResponse> it2 = sceneResponses.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.scene == EnumC1596540reG.INBOX_TAB.getValue()) {
                break;
            }
        }
        MixRankSkylightSceneResponse mixRankSkylightSceneResponse = next;
        if (mixRankSkylightSceneResponse == null || (mixRankSkylightPageControl = mixRankSkylightSceneResponse.pageControl) == null || !mixRankSkylightPageControl.hasMore) {
            return null;
        }
        return mixRankSkylightPageControl.pageControlToken;
    }

    public final Boolean getActiveSwitchStatus() {
        return this.LLIZLLLIL;
    }

    public final long getCacheTime() {
        return this.cacheTime;
    }

    public final long getCacheTimeStamp() {
        return this.LLJIJIL;
    }

    public final List<InterfaceC1891350zJl> getCoordinatorDisplayItems() {
        return this.LLJJIII;
    }

    public final String getCoordinatorPageCursor() {
        return this.LLJJIJI;
    }

    public final SkylightFriendPostResponse getFriendsPost() {
        return this.LLIZ;
    }

    public final String getInsertStoryUid() {
        return this.LLJI;
    }

    public final List<CombineLiveNotice> getLiveNotices() {
        return this.liveNotices;
    }

    public final Long getLiveResponseTime() {
        return this.LLILLJJLI;
    }

    public final MixRankSkylightResponse getMixRankSkylightData() {
        return this.LLILZIL;
    }

    public final OnThisDayResponse getOnThisDayData() {
        return this.LLILZLL;
    }

    public final boolean getOriginalState() {
        return this.LLJ;
    }

    @Override // X.InterfaceC887560Yrq
    public int getPriorityInInbox() {
        return this.LLJJIJIL;
    }

    public final int getReRankSequence() {
        return this.LLJILJILJ;
    }

    public final int getReRankType() {
        return this.LLJILLL;
    }

    public final boolean getShouldScroll() {
        return this.LLJILJIL;
    }

    public final SkylightDataResponse getSkylightData() {
        return this.LLILZ;
    }

    public final StoryGetFeedByPageResponse getStoryGetFeedByPageResponse() {
        return this.storyGetFeedByPageResponse;
    }

    public final String getTargetUid() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC887560Yrq
    public long getTimestampInInbox() {
        return this.LLJJIJIIJIL;
    }

    public final boolean isDefault() {
        return this.LLILLL;
    }

    public final boolean isLoadMoreData() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1890700zIi
    public C1598110rgn biz() {
        return C1598110rgn.LIZIZ;
    }

    @Override // X.AbstractC895380ZAq, X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof InboxHorizontalTopListCombinePod;
    }

    @Override // X.AbstractC895380ZAq
    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof InboxHorizontalTopListCombinePod)) {
            InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = (InboxHorizontalTopListCombinePod) obj;
            if (this.liveNotices == inboxHorizontalTopListCombinePod.liveNotices && this.storyGetFeedByPageResponse == inboxHorizontalTopListCombinePod.storyGetFeedByPageResponse && this.LLILZ == inboxHorizontalTopListCombinePod.LLILZ && this.LLILZIL == inboxHorizontalTopListCombinePod.LLILZIL && this.LLILZLL == inboxHorizontalTopListCombinePod.LLILZLL && this.LLIZLLLIL == inboxHorizontalTopListCombinePod.LLIZLLLIL && this.LLJJIII == inboxHorizontalTopListCombinePod.LLJJIII && Intrinsics.LJFF(this.LLJJIJI, inboxHorizontalTopListCombinePod.LLJJIJI)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof InboxHorizontalTopListCombinePod)) {
            return C1600110rk1.LIZ("unknown");
        }
        return C1600110rk1.LIZJ();
    }

    public final boolean isUserOnLive(String str) {
        List<String> listExtractLiveUserIds = extractLiveUserIds();
        if (listExtractLiveUserIds == null || !listExtractLiveUserIds.contains(str)) {
            return false;
        }
        return true;
    }

    public final void setActiveSwitchStatus(Boolean bool) {
        this.LLIZLLLIL = bool;
    }

    public final void setCacheTimeStamp(long j) {
        this.LLJIJIL = j;
    }

    public final void setDefault(boolean z) {
        this.LLILLL = z;
    }

    public final void setInsertStoryUid(String str) {
        this.LLJI = str;
    }

    public final void setLiveResponseTime(Long l) {
        this.LLILLJJLI = l;
    }

    public final void setMixRankSkylightData(MixRankSkylightResponse mixRankSkylightResponse) {
        this.LLILZIL = mixRankSkylightResponse;
    }

    public final void setOriginalState(boolean z) {
        this.LLJ = z;
    }

    public final void setReRankSequence(int i) {
        this.LLJILJILJ = i;
    }

    public final void setReRankType(int i) {
        this.LLJILLL = i;
    }

    public final void setShouldScroll(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setStoryGetFeedByPageResponse(StoryGetFeedByPageResponse storyGetFeedByPageResponse) {
        this.storyGetFeedByPageResponse = storyGetFeedByPageResponse;
    }

    public final void setTargetUid(String str) {
        this.LLJJ = str;
    }

    public void setTimestampInInbox(long j) {
        this.LLJJIJIIJIL = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxHorizontalTopListCombinePod(List<CombineLiveNotice> list, Long l, StoryGetFeedByPageResponse storyGetFeedByPageResponse, long j, boolean z, SkylightDataResponse skylightDataResponse, MixRankSkylightResponse mixRankSkylightResponse, OnThisDayResponse onThisDayResponse, SkylightFriendPostResponse skylightFriendPostResponse, Boolean bool, boolean z2, String str, long j2, boolean z3, int i, int i2, String str2, boolean z4, List<? extends InterfaceC1891350zJl> list2, String str3) {
        super(9);
        this.liveNotices = list;
        this.LLILLJJLI = l;
        this.storyGetFeedByPageResponse = storyGetFeedByPageResponse;
        this.cacheTime = j;
        this.LLILLL = z;
        this.LLILZ = skylightDataResponse;
        this.LLILZIL = mixRankSkylightResponse;
        this.LLILZLL = onThisDayResponse;
        this.LLIZ = skylightFriendPostResponse;
        this.LLIZLLLIL = bool;
        this.LLJ = z2;
        this.LLJI = str;
        this.LLJIJIL = j2;
        this.LLJILJIL = z3;
        this.LLJILJILJ = i;
        this.LLJILLL = i2;
        this.LLJJ = str2;
        this.LLJJI = z4;
        this.LLJJIII = list2;
        this.LLJJIJI = str3;
        this.LLJJIJIL = 600;
    }

    public InboxHorizontalTopListCombinePod(List list, Long l, StoryGetFeedByPageResponse storyGetFeedByPageResponse, long j, boolean z, SkylightDataResponse skylightDataResponse, MixRankSkylightResponse mixRankSkylightResponse, OnThisDayResponse onThisDayResponse, SkylightFriendPostResponse skylightFriendPostResponse, Boolean bool, boolean z2, String str, long j2, boolean z3, int i, int i2, String str2, boolean z4, List list2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C13BV.INSTANCE : list, (i3 & 2) != 0 ? null : l, (i3 & 4) != 0 ? null : storyGetFeedByPageResponse, (i3 & 8) != 0 ? System.currentTimeMillis() : j, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? null : skylightDataResponse, (i3 & 64) != 0 ? null : mixRankSkylightResponse, (i3 & 128) != 0 ? null : onThisDayResponse, (i3 & 256) != 0 ? null : skylightFriendPostResponse, (i3 & 512) != 0 ? null : bool, (i3 & 1024) != 0 ? false : z2, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0L : j2, (i3 & 8192) != 0 ? false : z3, (i3 & 16384) != 0 ? 0 : i, (32768 & i3) != 0 ? 0 : i2, (65536 & i3) != 0 ? null : str2, (131072 & i3) != 0 ? false : z4, (262144 & i3) != 0 ? null : list2, (i3 & 524288) != 0 ? null : str3);
    }
}
