package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message._GuestApplyInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.api.feed.EventStruct;
import webcast.api.feed.SortStatsTags;
import webcast.api.feed.WatchLaterInfo;
import webcast.api.feed._AwemeCommerceStructV2_ProtoDecoder;
import webcast.api.feed._EventStruct_ProtoDecoder;
import webcast.api.feed._SortStatsTags_ProtoDecoder;
import webcast.api.feed._SpecialCard_ProtoDecoder;
import webcast.api.feed._WatchLaterInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _FeedItem_ProtoDecoder implements C0IMD<FeedItem> {
    @Override // X.C0IMD
    public final void LIZ(FeedItem feedItem) {
        User user;
        FeedItem feedItem2 = feedItem;
        Room room = feedItem2.room;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
        FeedBannerContainer feedBannerContainer = feedItem2.bannerContainer;
        if (feedBannerContainer != null) {
            _FeedBannerContainer_ProtoDecoder.LJ(feedBannerContainer);
        }
        EventStruct eventStruct = feedItem2.liveEvent;
        if (eventStruct != null && (user = eventStruct.owner) != null) {
            _User_ProtoDecoder.LJ(user);
        }
        SortStatsTags sortStatsTags = feedItem2.sortStatsTags;
        if (sortStatsTags != null) {
            _SortStatsTags_ProtoDecoder.LJ(sortStatsTags);
        }
        WatchLaterInfo watchLaterInfo = feedItem2.watchLaterInfo;
        if (watchLaterInfo != null) {
            _WatchLaterInfo_ProtoDecoder.LJ(watchLaterInfo);
        }
    }

    @Override // X.C0IMD
    public final FeedItem LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FeedItem feedItem = new FeedItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 6) {
                                if (iLJI != 9) {
                                    if (iLJI != 13) {
                                        switch (iLJI) {
                                            case 16:
                                                feedItem.debugInfo = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                feedItem.flareInfo = _FlareInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                feedItem.anchorRelationType = c1516680pZS.LJIIJ();
                                                break;
                                            case 19:
                                                feedItem.isFresh = C1516700pZU.LIZ(c1516680pZS);
                                                break;
                                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                feedItem.drawerGameTag = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case 21:
                                                feedItem.liveEvent = _EventStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 22:
                                                feedItem.unfollowWatchTypeName = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case 23:
                                                feedItem.sortStatsTags = _SortStatsTags_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                                feedItem.roomEventTracking = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case 25:
                                                feedItem.enterMethod = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case 26:
                                                feedItem.isShowHighlight = C1516700pZU.LIZ(c1516680pZS);
                                                break;
                                            case 27:
                                                feedItem.skylightRelationType = c1516680pZS.LJIIJ();
                                                break;
                                            case 28:
                                                feedItem.commerceInfo = _AwemeCommerceStructV2_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 29:
                                                feedItem.matchedFriendRecType = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case 30:
                                                feedItem.useEnterRoomCache = C1516700pZU.LIZ(c1516680pZS);
                                                break;
                                            case 31:
                                                feedItem.enterRoomCacheVersion = c1516680pZS.LJIIJJI();
                                                break;
                                            case 32:
                                                feedItem.skylightMultiGuestApplyInfo = _GuestApplyInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                feedItem.watchLaterInfo = _WatchLaterInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                feedItem.specialCard = _SpecialCard_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            default:
                                                C1516700pZU.LJ(c1516680pZS);
                                                break;
                                        }
                                    } else {
                                        feedItem.liveReason = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    feedItem.isRecommendCard = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                feedItem.bannerContainer = _FeedBannerContainer_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            feedItem.room = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        feedItem.resId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    feedItem.type = (int) c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                feedItem.init();
                return feedItem;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FeedItem feedItem, List list) {
    }
}
