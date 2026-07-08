package com.ss.ugc.live.sdk.message;

import X.C08FF;
import X.C20338614i8;
import X.C2188811AlT;
import X.C2221841Bxe;
import X.C2222081By2;
import X.C2222121By6;
import X.C786410Ut5;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageMonitorSamplingConfig;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class MessageMonitor {
    public C2222121By6 mMessageContext;

    public interface LiveMessageInfo {
    }

    public interface LiveMessageStage {
        public static final String[] STAGES = {"api_call_time", "all_time", "receive_raw_msg", "deal_raw_msg", "decode_whole_message_time", "decode_self_message_time", "enqueue_time", "interceptor_time", "dispatch_time"};
    }

    /* JADX INFO: renamed from: com.ss.ugc.live.sdk.message.MessageMonitor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$ugc$live$sdk$message$MessageMonitor$Stage;

        static {
            int[] iArr = new int[Stage.values().length];
            $SwitchMap$com$ss$ugc$live$sdk$message$MessageMonitor$Stage = iArr;
            try {
                iArr[Stage.START.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$ugc$live$sdk$message$MessageMonitor$Stage[Stage.END.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public enum DispatchStatus {
        SUCCESS(0),
        EXCEPTION_BIZ_CODE(-1),
        EXCEPTION_OTHER(-99),
        SKIPPING_SELF_SEND(1),
        SKIPPING_EXPLICIT(2),
        SKIPPING_NOT_CURRENT_ROOM(3),
        SKIPPING_OTHER(99);

        public final int intType;

        public static DispatchStatus valueOf(String str) {
            return (DispatchStatus) C08FF.LIZ(DispatchStatus.class, str);
        }

        DispatchStatus(int i) {
            this.intType = i;
        }
    }

    public enum Stage {
        START,
        END;

        public static Stage valueOf(String str) {
            return (Stage) C08FF.LIZ(Stage.class, str);
        }
    }

    public MessageMonitor(C2222121By6 c2222121By6) {
        this.mMessageContext = c2222121By6;
    }

    public static int getWindowCountWaitExtra(Map<String, Object> map) {
        if (map != null) {
            try {
                if (map.containsKey("window_count_enqueue") && map.containsKey("window_count_dequeue")) {
                    Object obj = map.get("window_count_enqueue");
                    Object obj2 = map.get("window_count_dequeue");
                    if ((obj2 instanceof Integer) && (obj instanceof Integer)) {
                        Integer num = (Integer) obj;
                        Integer num2 = (Integer) obj2;
                        if (num2.intValue() >= 0 && num.intValue() >= 0) {
                            return num2.intValue() - num.intValue();
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }

    public static String listToString(List<String> list) {
        if (list != null && list.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
            return sb.toString();
        }
        return null;
    }

    public void monitorWSReuseCount(int i) {
        if (i != 0 && this.mMessageContext != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("room_count", i);
                jSONObject3.put("room_count", i);
                this.mMessageContext.monitor("ws_reuse_count", jSONObject2, jSONObject3, jSONObject);
                if (C20338614i8.LIZ) {
                    C2222121By6 c2222121By6 = this.mMessageContext;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("monitorWSReuseCount, extra: ");
                    sbLIZ.append(C786410Ut5.J3(jSONObject));
                    c2222121By6.log("MessageMonitor", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void dealExtraParamsStageInfo(JSONObject jSONObject, Map<String, Object> map) {
        try {
            for (String str : LiveMessageStage.STAGES) {
                Object obj = map.get(getLiveMessageStageName(str, Stage.START));
                Object obj2 = map.get(getLiveMessageStageName(str, Stage.END));
                if ((obj instanceof Long) && (obj2 instanceof Long)) {
                    Long l = (Long) obj;
                    Long l2 = (Long) obj2;
                    if (l.longValue() != 0 && l2.longValue() != 0 && l2.longValue() >= l.longValue()) {
                        jSONObject.put(str, l2.longValue() - l.longValue());
                    }
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String getLiveMessageStageName(String str, Stage stage) {
        int i = AnonymousClass1.$SwitchMap$com$ss$ugc$live$sdk$message$MessageMonitor$Stage[stage.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return str;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_end");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_start");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void markDispatchStatus(IMessage iMessage, DispatchStatus dispatchStatus) {
        if (iMessage != null && iMessage.getExtraParams() != null) {
            iMessage.getExtraParams().put("extra_message_dispatch_status", dispatchStatus);
        }
    }

    public void log(String str, String str2) {
        double dLogSamplingRate;
        if (C20338614i8.LIZ) {
            this.mMessageContext.log(str, str2);
            return;
        }
        C2222121By6 c2222121By6 = this.mMessageContext;
        C2222081By2 c2222081By2 = c2222121By6.LIZLLL;
        if (c2222081By2 == null) {
            dLogSamplingRate = c2222121By6.LIZJ;
        } else {
            if (c2222081By2.LIZLLL == null) {
                c2222081By2.LIZJ.getClass();
                this.mMessageContext.log(str, str2);
            }
            dLogSamplingRate = LiveMessageMonitorSamplingConfig.INSTANCE.logSamplingRate();
        }
        if (dLogSamplingRate < 1.0d && ThreadLocalRandom.current().nextDouble() >= dLogSamplingRate) {
            return;
        }
        this.mMessageContext.log(str, str2);
    }

    public void monitorHoldDispatchRelease(Long l, Integer num) {
        if (this.mMessageContext != null && C2221841Bxe.LIZIZ("message_hold_dispatch_release")) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("duration", l);
                jSONObject3.put("queue_size", num);
                this.mMessageContext.monitor("message_hold_dispatch_release", jSONObject2, jSONObject3, jSONObject);
                if (C20338614i8.LIZ) {
                    C2222121By6 c2222121By6 = this.mMessageContext;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("monitorHoldDispatchRelease, duration = ");
                    sbLIZ.append(l);
                    sbLIZ.append(", queueSize = ");
                    sbLIZ.append(num);
                    c2222121By6.log("MessageMonitor", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void monitorImEnterRoomDelay(long j, int i) {
        if (this.mMessageContext != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("delay", j);
                jSONObject.put("room_count", i);
                jSONObject2.put("delay", j);
                jSONObject2.put("room_count", i);
                this.mMessageContext.monitor("im_enter_room_delay", jSONObject3, jSONObject2, jSONObject);
                if (C20338614i8.LIZ) {
                    C2222121By6 c2222121By6 = this.mMessageContext;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("monitorImEnterRoomDelay, extra: ");
                    sbLIZ.append(C786410Ut5.J3(jSONObject));
                    c2222121By6.log("MessageMonitor", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static long getExtraParamsTime(Map<String, Object> map, String str, Stage stage) {
        try {
            Object obj = map.get(getLiveMessageStageName(str, stage));
            if (obj instanceof Long) {
                return ((Long) obj).longValue();
            }
            return 0L;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static long getStageDuration(Map<String, Object> map, String str, String str2) {
        try {
            Object obj = map.get(str);
            Object obj2 = map.get(str2);
            if ((obj2 instanceof Long) && (obj instanceof Long)) {
                Long l = (Long) obj2;
                Long l2 = (Long) obj;
                if (l.longValue() != 0 && l2.longValue() != 0 && l2.longValue() >= l.longValue()) {
                    return l2.longValue() - l.longValue();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return 0L;
    }

    public void monitorMsgStreamInteractDelay(long j, long j2, String str) {
        if (this.mMessageContext != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("delay", j);
                jSONObject.put("predict_delay", Math.abs(j2));
                jSONObject.put("predict_delay_sync_rate", Math.abs((j2 * 1.0d) / j));
                jSONObject.put("method", str);
                this.mMessageContext.monitor("message_stream_interact_delay", null, null, jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void monitorNoListenerMessageConsume(String str, Boolean bool, long j) {
        if (this.mMessageContext != null && C2221841Bxe.LIZIZ("message_no_listener_consume")) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject2.put("is_sticky", bool);
                jSONObject2.put("method", str);
                jSONObject3.put("consume_after_ready_milliseconds", j);
                this.mMessageContext.monitor("message_no_listener_consume", jSONObject2, jSONObject3, jSONObject);
                if (C20338614i8.LIZ) {
                    C2222121By6 c2222121By6 = this.mMessageContext;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("monitorNoListenerMessageConsume, isSticky = ");
                    sbLIZ.append(bool);
                    sbLIZ.append(", consumeAfterReadyMills = ");
                    sbLIZ.append(j);
                    c2222121By6.log("MessageMonitor", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void monitorStickyMessageRelease(String str, String str2, int i, long j) {
        if (this.mMessageContext != null && C2221841Bxe.LIZIZ("message_sticky_release")) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject2.put("method", str);
                jSONObject2.put("listener_cls_name", str2);
                jSONObject3.put("sticky_release_count", i);
                jSONObject3.put("release_after_ready_milliseconds", j);
                this.mMessageContext.monitor("message_sticky_release", jSONObject2, jSONObject3, jSONObject);
                if (C20338614i8.LIZ) {
                    C2222121By6 c2222121By6 = this.mMessageContext;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("monitorStickyMessageRelease, listenerClsName = ");
                    sbLIZ.append(str2);
                    sbLIZ.append(", stickyReleaseCount = ");
                    sbLIZ.append(i);
                    sbLIZ.append(", releaseAfterReadyMills = ");
                    sbLIZ.append(j);
                    c2222121By6.log("MessageMonitor", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void monitorMessageFirstDispatch(IMessage iMessage, long j, int i, int i2, Map<String, Object> map) {
        try {
            long extraParamsTime = getExtraParamsTime(iMessage.getExtraParams(), "all_time", Stage.START);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            long j2 = extraParamsTime - j;
            jSONObject.put("im_message_first_msgs", j2);
            long j3 = jElapsedRealtime - extraParamsTime;
            jSONObject.put("im_message_first_dispatch", j3);
            long j4 = jElapsedRealtime - j;
            jSONObject.put("message_first_dispatch_total", j4);
            jSONObject.put("msg_from", iMessage.getMessageFrom());
            jSONObject.put("room_count", i);
            jSONObject.put("dispatch_strategy", i2);
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject3.put("msg_from", iMessage.getMessageFrom());
            jSONObject2.put("room_count", i);
            jSONObject2.put("receive_message_2_start_message", j2);
            jSONObject2.put("dispatch_message_2_receive_message", j3);
            jSONObject2.put("dispatch_message_2_start_message", j4);
            this.mMessageContext.monitor("message_first_dispatch", jSONObject3, jSONObject2, jSONObject);
            if (C20338614i8.LIZ) {
                C2222121By6 c2222121By6 = this.mMessageContext;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("monitorMessageFirstDispatch, extra: ");
                sbLIZ.append(C786410Ut5.J3(jSONObject));
                c2222121By6.log("MessageMonitor", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void monitorMsgDispatchListDelay(long j, int i, int i2, int i3, int i4) {
        if (this.mMessageContext != null && C2221841Bxe.LIZIZ("message_dispatch_list_delay")) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("delay", j);
                jSONObject.put("dispatch_size", i);
                jSONObject.put("queue_size", i3);
                jSONObject.put("dispatch_strategy", i4);
                jSONObject3.put("delay", j);
                jSONObject3.put("dispatch_size", i);
                jSONObject3.put("actual_dispatch_size", i2);
                jSONObject3.put("queue_size", i3);
                jSONObject3.put("dispatch_strategy", i4);
                this.mMessageContext.monitor("message_dispatch_list_delay", jSONObject2, jSONObject3, jSONObject);
                if (C20338614i8.LIZ) {
                    C2222121By6 c2222121By6 = this.mMessageContext;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("monitorMsgDispatchListDelay, extra: ");
                    sbLIZ.append(C786410Ut5.J3(jSONObject));
                    c2222121By6.log("MessageMonitor", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void monitorMsgStreamInteractStatus(int i, String str, String str2, long j, long j2) {
        if (this.mMessageContext != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method", str);
                jSONObject.put(Scene.SCENE_SERVICE, str2);
                jSONObject.put("delay", j);
                jSONObject.put("predict_delay", j2);
                this.mMessageContext.monitorStatus("message_stream_interact_status", i, jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void monitorWSReuseMessage(int i, int i2, int i3, int i4, int i5, Map<String, Object> map) {
        if (this.mMessageContext != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("room_count", i);
                jSONObject.put("ws_connect_count", i2);
                jSONObject.put("ws_connect_success_count", i3);
                int i6 = i4 + i5;
                if (i6 != 0) {
                    double d = (((double) i4) * 1.0d) / ((double) i6);
                    try {
                        jSONObject.put("im_enter_room_success_ratio", d);
                        jSONObject3.put("im_enter_room_success_ratio", d);
                    } catch (JSONException e) {
                        e = e;
                    }
                }
                if (i2 != 0) {
                    jSONObject3.put("ws_connect_success_ratio", (((double) i3) * 1.0d) / ((double) i2));
                }
                jSONObject.put("im_enter_room_success_count", i4);
                jSONObject.put("im_enter_room_fail_count", i5);
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry != null) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject3.put("room_count", i);
                jSONObject3.put("ws_connect_count", i2);
                jSONObject3.put("ws_connect_success_count", i3);
                jSONObject3.put("im_enter_room_success_count", i4);
                jSONObject3.put("im_enter_room_fail_count", i5);
                this.mMessageContext.monitor("ws_reuse_message", jSONObject2, jSONObject3, jSONObject);
                if (C20338614i8.LIZ) {
                    C2222121By6 c2222121By6 = this.mMessageContext;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("monitorWSReuseMessage, extra: ");
                    sbLIZ.append(C786410Ut5.J3(jSONObject));
                    c2222121By6.log("MessageMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            } catch (JSONException e2) {
                e = e2;
            }
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void monitorMsgDispatchSize(int i, int i2, long j, long j2, int i3, long j3, int i4) {
        if (this.mMessageContext != null && C2221841Bxe.LIZIZ("message_dispatch_size")) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("dispatch_size", i);
                jSONObject.put("queue_size", i2);
                jSONObject.put("interval", j);
                jSONObject.put("window_time", j2);
                try {
                    jSONObject.put("msg_strategy", i3);
                    jSONObject.put("room_id", j3);
                    jSONObject.put("dispatch_strategy", i4);
                    jSONObject2.put("dispatch_strategy", i4);
                    jSONObject3.put("dispatch_size", i);
                    jSONObject3.put("queue_size", i2);
                    jSONObject3.put("interval", j);
                    jSONObject3.put("window_time", j2);
                    this.mMessageContext.monitor("message_dispatch_size", jSONObject2, jSONObject3, jSONObject);
                } catch (JSONException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
    }
}
