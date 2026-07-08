package kotlin.jvm.internal;

import X.AbstractC1538740q92;
import X.C09AY;
import X.C1094360eaI;
import X.C1538590q8n;
import X.C19748512Ol;
import X.C20441214yg;
import X.C496760Jdy;
import X.C500260Jjc;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalAnchorAccessControlSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridLynxCodeCacheOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickEnabledSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickIntervalSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.QueueInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class AwS22S1100100_17 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS22S1100100_17 awS22S1100100_17, Object obj) {
        Integer numValueOf;
        Long lValueOf;
        Integer numValueOf2;
        Long lValueOf2;
        Throwable th = (Throwable) obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1094360eaI c1094360eaI = (C1094360eaI) awS22S1100100_17.l1;
        Long lValueOf3 = null;
        if (c1094360eaI != null) {
            numValueOf = Integer.valueOf(c1094360eaI.LIZ);
        } else {
            numValueOf = null;
        }
        C1094360eaI c1094360eaI2 = (C1094360eaI) awS22S1100100_17.l1;
        if (c1094360eaI2 != null) {
            lValueOf = Long.valueOf(c1094360eaI2.LIZIZ);
        } else {
            lValueOf = null;
        }
        C496760Jdy.LJFF(numValueOf, lValueOf, -1, -1L, -3);
        String str = awS22S1100100_17.s0;
        long j = jCurrentTimeMillis - awS22S1100100_17.j2;
        C1094360eaI c1094360eaI3 = (C1094360eaI) awS22S1100100_17.l1;
        if (c1094360eaI3 != null) {
            numValueOf2 = Integer.valueOf(c1094360eaI3.LIZ);
        } else {
            numValueOf2 = null;
        }
        C1094360eaI c1094360eaI4 = (C1094360eaI) awS22S1100100_17.l1;
        if (c1094360eaI4 != null) {
            lValueOf2 = Long.valueOf(c1094360eaI4.LIZIZ);
        } else {
            lValueOf2 = null;
        }
        C1094360eaI c1094360eaI5 = (C1094360eaI) awS22S1100100_17.l1;
        if (c1094360eaI5 != null) {
            lValueOf3 = Long.valueOf(c1094360eaI5.LJIILIIL);
        }
        C496760Jdy.LJII(true, str, j, true, -3, null, null, numValueOf2, lValueOf2, lValueOf3, null);
        C20441214yg.LJI("UserLevelViewModel", th);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS22S1100100_17 awS22S1100100_17, Object obj) {
        Boolean boolValueOf;
        List<String> list;
        String json;
        Room room;
        int i;
        String str;
        QueueInfo queueInfo;
        Room room2;
        LiveMode streamType;
        RoomAuthStatus roomAuthStatus;
        final SparkContext sparkContext = (SparkContext) obj;
        String str2 = "1";
        if (LiveHybridLynxCodeCacheOptimizeSetting.INSTANCE.middleTouchEnable()) {
            sparkContext.LJJJZ("enable_code_cache", "1");
        }
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LIZ = false;
        c1538590q8n.LJI = true;
        sparkContext.liteLynxConfig = c1538590q8n;
        LiveGoalsWidget liveGoalsWidget = (LiveGoalsWidget) awS22S1100100_17.l1;
        long j = awS22S1100100_17.j2;
        liveGoalsWidget.getClass();
        sparkContext.LJJJZ("container_create_start_timestamp", String.valueOf(j));
        DataChannel dataChannel = liveGoalsWidget.dataChannel;
        Boolean boolValueOf2 = null;
        if (dataChannel != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, LiveGoalAnchorAccessControlSetting.INSTANCE.getValue());
        } else {
            Gson gson = C19748512Ol.LIZIZ;
            DataChannel dataChannel2 = liveGoalsWidget.dataChannel;
            if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
                list = room.mIndicators;
            } else {
                list = null;
            }
            json = GsonProtectorUtils.toJson(gson, list);
        }
        sparkContext.LJJJZ("indicator_business_keys", json);
        Room room3 = liveGoalsWidget.LLILZIL;
        if (room3 != null) {
            i = room3.cppVersion;
        } else {
            i = 0;
        }
        sparkContext.LJJJZ("live_cpp_version", String.valueOf(i));
        sparkContext.LJJJZ("entrance", "live_entrance");
        Room room4 = liveGoalsWidget.LLILZIL;
        if (room4 != null && (roomAuthStatus = room4.getRoomAuthStatus()) != null) {
            boolValueOf2 = Boolean.valueOf(roomAuthStatus.gameGuessPermission);
        }
        if (!C500260Jjc.LJJJI(boolValueOf2)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        sparkContext.LJJJZ("show_game_guess", str2);
        if (FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue()) {
            sparkContext.LJJJLZIJ(1, "live_debounce_click");
            sparkContext.LJJJLZIJ(FirstScreenDebounceClickIntervalSetting.INSTANCE.getValue(), "live_debounce_click_delay_interval");
        }
        DataChannel dataChannel3 = liveGoalsWidget.dataChannel;
        if (dataChannel3 == null || (room2 = (Room) dataChannel3.gg0(RoomChannel.class)) == null || (streamType = room2.getStreamType()) == null || (str = streamType.logStreamingType) == null) {
            str = "";
        }
        sparkContext.LJJJZ("live_type", str);
        Room room5 = liveGoalsWidget.LLILZIL;
        if (room5 != null && (queueInfo = room5.queueInfo) != null && queueInfo.status == 2) {
            sparkContext.LJJJZ("queue_id", queueInfo.queueId);
            sparkContext.LJJJLZIJ((int) queueInfo.memberCount, "member_count");
            sparkContext.LJJJZ("current_user_id", queueInfo.currentUserId);
            sparkContext.LJJJLZIJ(queueInfo.joinStatus, "join_status");
        }
        final LiveGoalsWidget liveGoalsWidget2 = (LiveGoalsWidget) awS22S1100100_17.l1;
        final String str3 = awS22S1100100_17.s0;
        sparkContext.LJJIJIIJIL(new AbstractC1538740q92() { // from class: X.0egJ
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) throws JSONException {
                boolean zLJFF;
                C1098060egG c1098060egG = C1098060egG.LIZ;
                C1098060egG.LIZIZ().LJIIJ = System.currentTimeMillis();
                String simpleName = liveGoalsWidget2.getClass().getSimpleName();
                Map<String, C1098100egK> map = C0K70.LIZIZ;
                C1098100egK c1098100egK = (C1098100egK) ((LinkedHashMap) map).get(simpleName);
                if (c1098100egK != null) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_general_entrance_show");
                    c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - c1098100egK.LIZ), "tti_duration");
                    c474500IjALIZ.LJJII(c1098100egK.LIZIZ, "show_entrance");
                    c474500IjALIZ.LJJII(c1098100egK.LIZJ, "entrance");
                    c474500IjALIZ.LIZ();
                    map.remove(simpleName);
                }
                c1098060egG.LJI(liveGoalsWidget2.x1(sparkContext.containerId, str3));
                LiveGoalsWidget liveGoalsWidget3 = liveGoalsWidget2;
                String str4 = str3;
                liveGoalsWidget3.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str4);
                jSONObject.put("type", "init");
                interfaceC1541990qEH.LIZ("H5_roomStatusChange", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                DataChannel dataChannel4 = liveGoalsWidget3.dataChannel;
                if (dataChannel4 != null) {
                    zLJFF = Intrinsics.LJFF(dataChannel4.gg0(C0TZM.class), Boolean.TRUE);
                } else {
                    zLJFF = 0;
                }
                jSONObject2.put("orientation", !zLJFF);
                C389001fE.LIZ("goal_indicator_orientation_changed", jSONObject2, System.currentTimeMillis(), false);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str4) {
                C1098020egC c1098020egCLIZIZ = C1098060egG.LIZIZ();
                c1098020egCLIZIZ.LJIIIZ = System.currentTimeMillis();
                c1098020egCLIZIZ.LIZJ = str4;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str4, String str5) {
                C1098060egG c1098060egG = C1098060egG.LIZ;
                C1098060egG.LIZIZ().LJIIJ = System.currentTimeMillis();
                c1098060egG.LJFF(str5, liveGoalsWidget2.x1(sparkContext.containerId, str4));
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1100100_17(C1094360eaI c1094360eaI, String str, long j, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1094360eaI;
        this.s0 = str;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1100100_17(LiveGoalsWidget liveGoalsWidget, long j, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = liveGoalsWidget;
        this.j2 = j;
        this.s0 = str;
    }
}
