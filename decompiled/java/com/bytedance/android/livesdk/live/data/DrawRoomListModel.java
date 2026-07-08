package com.bytedance.android.livesdk.live.data;

import X.C01GW;
import X.C0IFC;
import X.C0ISS;
import X.C0ITM;
import X.C1090000eTG;
import X.C1094620eai;
import X.C1161920gLG;
import X.C11NZ;
import X.C259800zU;
import X.C293501Bt;
import X.C467080ITi;
import X.C468070IXd;
import X.C470590Icr;
import X.C471300Ie0;
import X.C480460Ism;
import X.C483410IxX;
import X.EnumC1094630eaj;
import X.InterfaceC468260IXw;
import Y.AfS176S0100000_7;
import Y.AkS471S0100000_7;
import android.util.Pair;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.chatroom.bl.enterroomboost.LiveEnterRoomUpdateSetting;
import com.bytedance.android.livesdk.chatroom.detail.RoomApi;
import com.bytedance.android.livesdk.dataChannel.FastScrollBooleanData;
import com.bytedance.android.livesdk.livesetting.feed.LiveInnerFeedSurveyParam;
import com.bytedance.android.livesdk.livesetting.other.EnableLiveEcRecordsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedDynamicFeatureConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveKeyApiOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveFastScrollLoadmoreV2Setting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawRoomListModel {
    public static final C467080ITi Companion = new Object() { // from class: X.0ITi
    };

    private final String getDynamicFeatures() {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Map<String, List<String>>> entry : LiveFeedDynamicFeatureConfig.INSTANCE.getValue().entrySet()) {
            String key = entry.getKey();
            for (Map.Entry<String, List<String>> entry2 : entry.getValue().entrySet()) {
                String key2 = entry2.getKey();
                List<String> value = entry2.getValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str : value) {
                    if (str != null && str.length() != 0) {
                        ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
                        EnumC1094630eaj.Companion.getClass();
                        C1090000eTG c1090000eTGO3 = iLiveDecisionService.O3(C1094620eai.LIZ(key), key2, str);
                        if (c1090000eTGO3 != null && (obj = c1090000eTGO3.LIZJ) != null && (obj instanceof String)) {
                            linkedHashMap2.put(str, obj);
                        }
                    }
                }
                if (!linkedHashMap2.isEmpty()) {
                    linkedHashMap.put(key, linkedHashMap2);
                }
            }
        }
        return GsonProtectorUtils.toJson(C293501Bt.LIZ(), linkedHashMap);
    }

    private final String getObjectsStr(List<? extends Object> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(ListProtector.get(list, i).toString());
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        return "";
    }

    public final void handleRoomParams(FeedItem feedItem) {
        int i = feedItem.type;
        if (i == 1 || i == 2 || i == 19) {
            InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
            if (interfaceC468260IXw instanceof Room) {
                Room room = (Room) interfaceC468260IXw;
                room.setLog_pb(feedItem.logPb);
                User owner = room.getOwner();
                if (owner != null) {
                    owner.setLogPb(feedItem.logPb);
                }
                room.setRequestId(feedItem.resId);
                room.isFromRecommendCard = feedItem.isRecommendCard;
            }
        }
    }

    public final C11NZ<C470590Icr<Object>> collectUnreadRequest(long j, long j2, String str, List<Long> list) {
        C480460Ism.LIZ().getClass();
        return ((RoomApi) C480460Ism.LIZLLL(RoomApi.class)).collectUnreadRequest(j, j2, str, getObjectsStr(list));
    }

    public final C11NZ<C0ITM<Pair<List<FeedItem>, FeedExtra>>> getRoomList(long j, String str, String str2, long j2, long j3, String str3, C0ISS c0iss, EnterRoomConfig enterRoomConfig, String str4, boolean z, Map<String, String> map) {
        return getRoomList(j, str, str2, j2, j3, str3, c0iss, enterRoomConfig, str4, z, map, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C11NZ<C0ITM<Pair<List<FeedItem>, FeedExtra>>> getRoomList(long j, String str, String str2, long j2, long j3, String str3, C0ISS c0iss, EnterRoomConfig enterRoomConfig, String str4, boolean z, Map<String, String> map, boolean z2) {
        int iIntValue;
        long jLongValue;
        C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed;
        C1090000eTG c1090000eTGO3;
        Object obj;
        String str5;
        String str6 = str4;
        C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
        boolean zBooleanValue = false;
        String strLIZ = C468070IXd.LIZ(C0IFC.LIZ(), null, false, 3);
        Long l = C0IFC.LIZ().LJFF;
        C468070IXd c468070IXdLIZ = C0IFC.LIZ();
        int i = c468070IXdLIZ.LJII;
        c468070IXdLIZ.LJII = i + 1;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = str;
        HashMap map2 = new HashMap();
        map2.put("max_time", String.valueOf(j));
        map2.put("channel_id", str2);
        map2.put("is_draw", "1");
        map2.put("draw_room_id", String.valueOf(j2));
        map2.put("draw_room_owner_id", String.valueOf(j3));
        if (str6 == null) {
            str6 = "";
        }
        map2.put("exposure_items", str6);
        if (LiveEnterRoomUpdateSetting.INSTANCE.enableForInnerFlow()) {
            map2.put("need_enter_room_boost", "1");
            if (((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).Wh()) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("need_prefetch_pin", str5);
        }
        if (LiveInnerFeedSurveyParam.INSTANCE.enable()) {
            C483410IxX c483410IxX = C483410IxX.LIZ;
            boolean zLIZLLL = c483410IxX.LIZLLL();
            map2.put("survey_not_hit_fc", String.valueOf(!zLIZLLL));
            if (!zLIZLLL) {
                map2.put("survey_show_stats", c483410IxX.LJI());
            }
        }
        if (strLIZ != null && l != null) {
            c259800zU.element = "ecom_template_inner_loadmore";
            map2.put("ec_template_id", strLIZ);
            map2.put("ec_top_author", l.toString());
            map2.put("refresh_session_index", String.valueOf(i));
        } else if (C0IFC.LIZ().LJ != null) {
            c259800zU.element = "ecom_normal_feed_loadmore";
            map2.put("enter_source", "commerce_banner");
        } else if (c0iss != null) {
            Integer num = c0iss.LIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            map2.put("session_refresh_index", String.valueOf(iIntValue));
            Long l2 = c0iss.LIZIZ;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            map2.put("session_id", String.valueOf(jLongValue));
        }
        map2.put("req_from", c259800zU.element);
        if (EnableLiveEcRecordsSetting.INSTANCE.getValue()) {
            ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).ot();
            map2.put("related_live", C471300Ie0.LJII(enterRoomConfig));
            map2.put("last_show_lives", ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).ot().LIZLLL());
            map2.put("last_play_lives", ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).ot().LIZJ());
        }
        if (z) {
            map2.put("is_non_personalized", "1");
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(FastScrollBooleanData.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        if (LiveFastScrollLoadmoreV2Setting.isEnable() && (c1090000eTGO3 = ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).O3(EnumC1094630eaj.DEFAULT, "decision_group", "loadmore")) != null && (obj = c1090000eTGO3.LIZJ) != null) {
            map2.put("feed_count", obj.toString());
        }
        if (z2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!LiveFeedDynamicFeatureConfig.INSTANCE.getValue().isEmpty()) {
                linkedHashMap.put("live_dynamic_features", getDynamicFeatures());
            }
            if (LiveKeyApiOpt.enableFeedApiHighPriority() && zBooleanValue) {
                C480460Ism.LIZ().getClass();
                c11nzFeed = ((FeedApi) C480460Ism.LIZIZ(FeedApi.class)).highLevelFeedV2(str3, map2, linkedHashMap);
            } else {
                C480460Ism.LIZ().getClass();
                c11nzFeed = ((FeedApi) C480460Ism.LIZIZ(FeedApi.class)).feedV2(str3, map2, linkedHashMap);
            }
        } else if (LiveKeyApiOpt.enableFeedApiHighPriority() && zBooleanValue) {
            C480460Ism.LIZ().getClass();
            c11nzFeed = ((FeedApi) C480460Ism.LIZIZ(FeedApi.class)).highLevelFeed(str3, map2);
        } else {
            C480460Ism.LIZ().getClass();
            c11nzFeed = ((FeedApi) C480460Ism.LIZIZ(FeedApi.class)).feed(str3, map2);
        }
        return c11nzFeed.LJJJJZI(new AkS471S0100000_7(c259800zU, 5)).LJJIJIIJIL(new AfS176S0100000_7(this, 72));
    }
}
