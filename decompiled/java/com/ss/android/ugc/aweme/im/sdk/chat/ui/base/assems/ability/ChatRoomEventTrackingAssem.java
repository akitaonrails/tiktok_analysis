package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0Y8T;
import X.C0YSQ;
import X.C123100dR;
import X.C13DA;
import X.C1559260qg8;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C909290Zln;
import X.InterfaceC876950Yaj;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.utils.ChatRoomEventTrackingStore;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatRoomEventTrackingAssem extends AbstractC738140SxQ {
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 708));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 707));

    public final SessionInfo bo() {
        return (SessionInfo) this.LLILLJJLI.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        String previousPage;
        C909290Zln c909290Zln;
        String enterProfileGroupId;
        Map<String, String> extraMobParams;
        String searchId;
        super.onCreate();
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(((C457780HxI) this.LL.getValue()).LL.getConversationId());
        long unreadCount = c0y8tLIZ != null ? c0y8tLIZ.getUnreadCount() : 0L;
        ChatRoomEventTrackingStore chatRoomEventTrackingStore = ChatRoomEventTrackingStore.LIZIZ;
        String uuid = bo().getUuid();
        C13DA c13da = new C13DA();
        c13da.put("has_local_cache", "1");
        c13da.put("enter_from", bo().getEnterFromForMob());
        c13da.put("enter_method", bo().getEnterMethod());
        c13da.put("is_message_unread", unreadCount > 0 ? "1" : CardStruct.IStatusCode.DEFAULT);
        c13da.put("unread_message_cnt", String.valueOf(unreadCount));
        c13da.put("enter_chat_time", String.valueOf(System.currentTimeMillis()));
        EnterChatParams enterChatParams = (EnterChatParams) this.LLILLL.getValue();
        c13da.put("is_recommended_chat", (enterChatParams == null || !enterChatParams.isRecommendedChat()) ? CardStruct.IStatusCode.DEFAULT : "1");
        String pushLabel = bo().getPushLabel();
        String str = "";
        if (pushLabel == null && (pushLabel = bo().getOutPushLabel()) == null) {
            pushLabel = "";
        }
        c13da.put("push_label", pushLabel);
        int innerPushType = bo().getInnerPushType();
        c13da.put("online_order", innerPushType != 27 ? innerPushType != 31 ? "" : CardStruct.IStatusCode.DEFAULT : "1");
        EnterChatParams enterChatParams2 = (EnterChatParams) this.LLILLL.getValue();
        if (enterChatParams2 != null && (searchId = enterChatParams2.getSearchId()) != null) {
            str = searchId;
        }
        c13da.put("search_id", str);
        String inboxSearchPosition = bo().getInboxSearchPosition();
        if (inboxSearchPosition != null) {
            c13da.put("inbox_search_position", inboxSearchPosition);
        }
        String inboxSearchCellType = bo().getInboxSearchCellType();
        if (inboxSearchCellType != null) {
            c13da.put("inbox_search_cell_type", inboxSearchCellType);
        }
        String inboxSearchTabName = bo().getInboxSearchTabName();
        if (inboxSearchTabName != null) {
            c13da.put("inbox_search_tab_name", inboxSearchTabName);
        }
        c13da.put("process_id", bo().getUuid());
        String trafficTypeForMob = bo().getTrafficTypeForMob();
        if (trafficTypeForMob != null) {
            c13da.put("traffic_type", trafficTypeForMob);
        }
        String extrasInfoMobParams = bo().getExtrasInfoMobParams();
        if (C123100dR.LIZ(extrasInfoMobParams)) {
            c13da.put("extra_info", extrasInfoMobParams);
        }
        String panelSourceForMob = bo().getPanelSourceForMob();
        if (C123100dR.LIZ(panelSourceForMob)) {
            c13da.put("panel_source", panelSourceForMob);
        }
        String positionForMob = bo().getPositionForMob();
        if (positionForMob != null) {
            c13da.put("position", positionForMob);
        }
        Integer siteId = bo().getSiteId();
        if (siteId != null) {
            c13da.put("social_info_site_id", String.valueOf(siteId.intValue()));
        }
        c13da.put("is_from_new_follow", bo().isFromNewFollow() ? "1" : CardStruct.IStatusCode.DEFAULT);
        c13da.put("is_from_external_url", Intrinsics.LJFF(bo().getTrafficType(), "external_url") ? "1" : CardStruct.IStatusCode.DEFAULT);
        EnterChatParams enterChatParams3 = (EnterChatParams) this.LLILLL.getValue();
        if (enterChatParams3 != null && (extraMobParams = enterChatParams3.getExtraMobParams()) != null) {
            c13da.putAll(extraMobParams);
        }
        SessionInfo sessionInfoBo = bo();
        if ((sessionInfoBo instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfoBo) != null && (enterProfileGroupId = c909290Zln.getEnterProfileGroupId()) != null) {
            c13da.put("from_group_id", enterProfileGroupId);
        }
        EnterChatParams enterChatParams4 = (EnterChatParams) this.LLILLL.getValue();
        if (enterChatParams4 != null && (previousPage = enterChatParams4.getPreviousPage()) != null && previousPage.length() > 0) {
            c13da.put("pre_enter_from", previousPage);
        }
        Map mapBuild = c13da.build();
        ConcurrentHashMap<String, Map<String, String>> concurrentHashMap = ChatRoomEventTrackingStore.LIZJ;
        C13DA c13da2 = new C13DA();
        c13da2.putAll(mapBuild);
        concurrentHashMap.put(uuid, c13da2.build());
        ChatRoomEventTrackingStore.LIZLLL.push(uuid);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ChatRoomEventTrackingStore chatRoomEventTrackingStore = ChatRoomEventTrackingStore.LIZIZ;
        ChatRoomEventTrackingStore.LIZJ.remove(bo().getUuid());
        ChatRoomEventTrackingStore.LIZLLL.poll();
    }
}
