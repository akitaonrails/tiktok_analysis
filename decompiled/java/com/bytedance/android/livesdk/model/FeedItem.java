package com.bytedance.android.livesdk.model;

import X.C00UH;
import X.C09CT;
import X.InterfaceC468260IXw;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import java.util.List;
import java.util.Objects;
import webcast.api.feed.AwemeCommerceStructV2;
import webcast.api.feed.EventStruct;
import webcast.api.feed.SortStatsTags;
import webcast.api.feed.SpecialCard;
import webcast.api.feed.WatchLaterInfo;
import webcast.data.AILivePreviewHighlight;

/* JADX INFO: loaded from: classes.dex */
public class FeedItem {

    @C09CT("anchor_relation_type")
    public int anchorRelationType;

    @C09CT("banner")
    public FeedBannerContainer bannerContainer;
    public transient List<FeedBanner> banners;

    @C09CT("commerce_info")
    public AwemeCommerceStructV2 commerceInfo;

    @C09CT("data")
    public n data;

    @C09CT("debug_info")
    public String debugInfo;

    @C09CT("enter_room_cache_version")
    public long enterRoomCacheVersion;

    @C09CT("flare_info")
    public FlareInfo flareInfo;

    @C09CT("is_fresh")
    public boolean isFresh;

    @C09CT("is_recommend_card")
    public boolean isRecommendCard;

    @C09CT("is_show_highlight")
    public boolean isShowHighlight;
    public transient InterfaceC468260IXw item;

    @C09CT("live_event")
    public EventStruct liveEvent;

    @C09CT("live_reason")
    public String liveReason;
    public transient String logPb;
    public transient long receiveTime;
    public transient boolean repeatDisable;

    @C09CT("rid")
    public String resId;
    public transient Room room;

    @C09CT("skylight_multi_guest_apply_info")
    public GuestApplyInfo skylightMultiGuestApplyInfo;

    @C09CT("skylight_relation_type")
    public int skylightRelationType;

    @C09CT("sort_stats_tags")
    public SortStatsTags sortStatsTags;

    @C09CT("special_card")
    public SpecialCard specialCard;

    @C09CT("type")
    public int type;

    @C09CT("use_enter_room_cache")
    public boolean useEnterRoomCache;

    @C09CT("watch_later_info")
    public WatchLaterInfo watchLaterInfo;

    @C09CT("drawer_game_tag")
    public String drawerGameTag = "";

    @C09CT("unfollow_watch_type_name")
    public String unfollowWatchTypeName = "";

    @C09CT("room_event_tracking")
    public String roomEventTracking = "";

    @C09CT("enter_method")
    public String enterMethod = "";

    @C09CT("matched_friend_rec_type")
    public String matchedFriendRecType = "";
    public C00UH skylightItemStyle = C00UH.DEFAULT;

    public int hashCode() {
        return Objects.hash(this.item);
    }

    private void initHighlight() {
        AILivePreviewHighlight aILivePreviewHighlight;
        Room room = this.room;
        if (room == null || (aILivePreviewHighlight = room.aiLivePreviewHighlight) == null) {
            return;
        }
        aILivePreviewHighlight.LIZ = this.isShowHighlight;
    }

    public Room getRoom() {
        if (this.room != null) {
            initHighlight();
            return this.room;
        }
        Room room = (Room) GsonProtectorUtils.fromJson(new Gson(), (k) this.data, Room.class);
        this.room = room;
        if (room != null) {
            room.init();
            initHighlight();
        }
        return this.room;
    }

    public void init() {
        int i = this.type;
        if (i == 1 || i == 2 || i == 19 || i == 20 || i == 21) {
            this.item = getRoom();
        }
    }

    public boolean isVariantCard() {
        SpecialCard specialCard = this.specialCard;
        return (specialCard == null || specialCard.type == 0) ? false : true;
    }

    public String toString() {
        InterfaceC468260IXw interfaceC468260IXw = this.item;
        return interfaceC468260IXw == null ? "null" : interfaceC468260IXw.toString();
    }

    public String logPb() {
        return this.logPb;
    }

    public String requestId() {
        return this.resId;
    }

    /* JADX INFO: renamed from: item, reason: merged with bridge method [inline-methods] */
    public InterfaceC468260IXw m124item() {
        return this.item;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Objects.equals(this.item, ((FeedItem) obj).item);
        }
        return false;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setType(int i) {
        this.type = i;
    }
}
