package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.C09AY;
import X.C09HN;
import X.C0IJT;
import X.C0XQ7;
import X.C13LP;
import X.C15438062q;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C477500Io0;
import X.C477860Ioa;
import X.C477910Iof;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.OptimizeEnterRoomPipelineSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.hangout.component.interact.view.MultiTopLiveInteractModuleAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.NoticeItem;

/* JADX INFO: loaded from: classes8.dex */
public class AwS44S0100100_7 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS44S0100100_7 awS44S0100100_7, Object obj) {
        boolean z;
        Room room;
        Room room2;
        String strValueOf;
        String str;
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        List<T> list = baseListResponse.data;
        if (list != 0 && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        List listLJJJJIZL = null;
        if (z) {
            C477500Io0 c477500Io0 = C477500Io0.LIZ;
            long j = awS44S0100100_7.j1;
            c477500Io0.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            String str2 = baseListResponse.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(baseListResponse.LJ.message);
            sbLIZ.append(", feedItems is ");
            if (list == 0) {
                str = "null";
            } else if (list.isEmpty()) {
                str = "empty";
            } else {
                str = "?";
            }
            sbLIZ.append(str);
            C477860Ioa.LJIIL(new C477910Iof(32, jCurrentTimeMillis, "top_module_room", "MultiTopLiveInteractModuleAssem#enterRoomByRealtimeData, but feedItems isNullOrEmpty", "empty", str2, C2188811AlT.LIZIZ(sbLIZ)));
            C477500Io0.LJIILLIIL("MultiTopLiveInteractAssem", "topModuleAssem feedItems is empty, so return", null);
        } else {
            FeedItem feedItem = (FeedItem) C13LP.LJJJLZIJ(0, list);
            if (feedItem != null && (room2 = feedItem.getRoom()) != null) {
                long id = room2.getId();
                String str3 = feedItem.resId;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("InteractModule first roomId is ");
                sbLIZ2.append(id);
                C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ2));
                if (list.size() >= 1) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Long.valueOf(((FeedItem) it2.next()).getRoom().getId()));
                    }
                    ArrayList arrayListLIZ = C09HN.LIZ(arrayList);
                    if (arrayListLIZ != null) {
                        listLJJJJIZL = C13LP.LJJJJIZL(arrayListLIZ, 1);
                    }
                    strValueOf = String.valueOf(listLJJJJIZL);
                } else {
                    strValueOf = "";
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("InteractModule roomIdList is ");
                sbLIZ3.append(strValueOf);
                C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ3));
                String str4 = ((MGModuleInteraction) awS44S0100100_7.l0).name;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_top_module_enter_room");
                c474500IjALIZ.LJJII(0, "use_cache");
                c474500IjALIZ.LJJII(str4, "enter_method");
                c474500IjALIZ.LIZ();
                Room room3 = feedItem.getRoom();
                if (OptimizeEnterRoomPipelineSetting.INSTANCE.enable() && room3 != null && room3.getId() > 0) {
                    C477500Io0 c477500Io02 = C477500Io0.LIZ;
                    MGModuleInteraction mGModuleInteraction = (MGModuleInteraction) awS44S0100100_7.l0;
                    String str5 = mGModuleInteraction.name;
                    long j2 = mGModuleInteraction.innerFeedMgAggId;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Room room4 = ((FeedItem) it3.next()).getRoom();
                        if (room4 != null) {
                            arrayList2.add(room4);
                        }
                    }
                    C477500Io0.LJIJI(c477500Io02, id, room3, str5, Long.valueOf(j2), str3, true, null, strValueOf, null, null, arrayList2, 0, null, null, null, 29504);
                } else {
                    C477500Io0 c477500Io03 = C477500Io0.LIZ;
                    MGModuleInteraction mGModuleInteraction2 = (MGModuleInteraction) awS44S0100100_7.l0;
                    C477500Io0.LIZLLL(c477500Io03, id, strValueOf, mGModuleInteraction2.name, Long.valueOf(mGModuleInteraction2.innerFeedMgAggId), str3);
                }
                C477500Io0 c477500Io04 = C477500Io0.LIZ;
                long j3 = awS44S0100100_7.j1;
                c477500Io04.getClass();
                C477860Ioa.LJIIL(new C477910Iof(96, System.currentTimeMillis() - j3, "top_module_room", "MultiTopLiveInteractModuleAssem#enterRoomByRealtimeData, success", "success", baseListResponse.LIZLLL, (String) null));
            } else {
                long j4 = awS44S0100100_7.j1;
                C477500Io0.LIZ.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - j4;
                String str6 = baseListResponse.LIZLLL;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(baseListResponse.LJ.message);
                sbLIZ4.append(", room: ");
                if (feedItem != null) {
                    room = feedItem.getRoom();
                } else {
                    room = null;
                }
                sbLIZ4.append(room);
                C477860Ioa.LJIIL(new C477910Iof(32, jCurrentTimeMillis2, "top_module_room", "MultiTopLiveInteractModuleAssem#enterRoomByRealtimeData, but roomId is null", "error", str6, C2188811AlT.LIZIZ(sbLIZ4)));
                C477500Io0.LJIILLIIL("MultiTopLiveInteractAssem", "topModuleAssem first roomID is null, so return", null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS44S0100100_7 awS44S0100100_7, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        sparkContext.LJJJZ("event_id", String.valueOf(((NoticeItem) awS44S0100100_7.l0).eventId));
        sparkContext.LJJJZ("enter_from", "toplive_live_activity_notification");
        sparkContext.LJJJZ("host_user_id", String.valueOf(awS44S0100100_7.j1));
        sparkContext.LJJJZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        sparkContext.LJJJZ("target_handler", "webcast");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0100100_7(NoticeItem noticeItem, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = noticeItem;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0100100_7(long j, MultiTopLiveInteractModuleAssem multiTopLiveInteractModuleAssem, MGModuleInteraction mGModuleInteraction, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = mGModuleInteraction;
    }
}
