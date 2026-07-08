package com.bytedance.crash.looper;

import X.C08SE;
import X.C0VJO;
import X.C0VSJ;
import X.C2112008Pe;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class MessageRecorder {
    public static MessageObserver LIZ = null;
    public static int LIZIZ = -1;
    public static boolean LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: all -> 0x004d, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0009, B:10:0x000f, B:24:0x0049, B:15:0x0018, B:21:0x003c, B:23:0x0046, B:16:0x001e, B:17:0x0024, B:18:0x002a, B:19:0x0030, B:20:0x0036), top: B:30:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void LJFF() {
        /*
            java.lang.Class<com.bytedance.crash.looper.MessageRecorder> r3 = com.bytedance.crash.looper.MessageRecorder.class
            monitor-enter(r3)
            com.bytedance.crash.looper.MessageObserver r0 = com.bytedance.crash.looper.MessageRecorder.LIZ     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L9
            monitor-exit(r3)
            return
        L9:
            int r2 = com.bytedance.crash.looper.MessageRecorder.LIZIZ     // Catch: java.lang.Throwable -> L4d
            r1 = -1
            r0 = 0
            if (r2 != r1) goto L13
            com.bytedance.crash.looper.MessageRecorder.LIZIZ = r0     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r3)
            return
        L13:
            switch(r2) {
                case 1: goto L30;
                case 2: goto L2a;
                case 3: goto L24;
                case 4: goto L1e;
                case 5: goto L18;
                case 6: goto L36;
                default: goto L16;
            }
        L16:
            r1 = 0
            goto L49
        L18:
            com.bytedance.crash.looper.DeferredMessageObserver r1 = new com.bytedance.crash.looper.DeferredMessageObserver     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            goto L3c
        L1e:
            com.bytedance.crash.looper.IdleMessageObserver r1 = new com.bytedance.crash.looper.IdleMessageObserver     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            goto L3c
        L24:
            com.bytedance.crash.looper.FullMessageObserver r1 = new com.bytedance.crash.looper.FullMessageObserver     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4d
            goto L3c
        L2a:
            com.bytedance.crash.looper.SimpleMessageObserver r1 = new com.bytedance.crash.looper.SimpleMessageObserver     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            goto L3c
        L30:
            com.bytedance.crash.looper.SilentMessageObserver r1 = new com.bytedance.crash.looper.SilentMessageObserver     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            goto L3c
        L36:
            com.bytedance.crash.looper.FullMessageObserver r1 = new com.bytedance.crash.looper.FullMessageObserver     // Catch: java.lang.Throwable -> L4d
            r0 = 1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4d
        L3c:
            r1.start()     // Catch: java.lang.Throwable -> L4d
            X.C20664087q.LIZIZ()     // Catch: java.lang.Throwable -> L4d
            X.087r r0 = X.C20664087q.LJII     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L49
            r0.addMessageObserver(r1)     // Catch: java.lang.Throwable -> L4d
        L49:
            com.bytedance.crash.looper.MessageRecorder.LIZ = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r3)
            return
        L4d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.looper.MessageRecorder.LJFF():void");
    }

    public static synchronized void LIZ(File file) {
        LIZIZ(file);
        MessageObserver messageObserver = LIZ;
        if (messageObserver != null) {
            messageObserver.dumpMessages(file);
        }
    }

    public static void LIZIZ(File file) {
        String str;
        switch (LIZIZ) {
            case -1:
                str = "init";
                break;
            case 0:
                str = "none";
                break;
            case 1:
                str = "silent";
                break;
            case 2:
                str = "simple";
                break;
            case 3:
                str = "full";
                break;
            case 4:
                str = "idle";
                break;
            case 5:
                str = "deferred";
                break;
            case 6:
                str = "redex";
                break;
            default:
                str = "unknown";
                break;
        }
        try {
            C08SE.LJIIIIZZ(new C0VSJ(file, "start_mode.dat"), str, false);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(JSONObject jSONObject) {
        long jOptLong;
        int i;
        String str;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("history_message");
        JSONObject jSONObjectLIZIZ = FullJsonFormat.LIZIZ(jSONObject);
        if (!jSONObjectLIZIZ.optString("longestMsgType").equals("no_details")) {
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                long jOptLong2 = jSONObject.optLong("crash_time");
                long jOptLong3 = jSONObjectLIZIZ.optLong("last_wall_time");
                long jOptLong4 = jSONObjectLIZIZ.optLong("last_cpu_time");
                if (jOptLong2 != 0 && jOptLong3 != 0 && jOptLong4 != 0) {
                    C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgType", "not_found");
                    C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsg", "not_found");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("current_message");
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("block_stack");
                    if (jOptLong2 > jOptLong3 && jSONObjectOptJSONObject != null) {
                        jOptLong = jSONObjectOptJSONObject.optLong("currentMessageCost");
                        long j = jOptLong2 - jOptLong3;
                        if (j < jOptLong) {
                            jOptLong = j;
                        }
                        FullJsonFormat.LIZ(jSONArrayOptJSONArray2, jSONObjectOptJSONObject, jOptLong3, true);
                    } else {
                        jOptLong = 0;
                    }
                    if (jOptLong < Mp4ScreenVideoLoadTimeout.CONTROL) {
                        long j2 = jOptLong2 - jOptLong3;
                        long j3 = jOptLong;
                        i = -1;
                        for (int length = jSONArrayOptJSONArray.length() - 1; length >= 0 && j2 < 10000; length--) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(length);
                            if (jSONObjectOptJSONObject2 != null) {
                                long jOptLong5 = jSONObjectOptJSONObject2.optLong("duration");
                                j2 += jOptLong5;
                                FullJsonFormat.LIZ(jSONArrayOptJSONArray2, jSONObjectOptJSONObject2, jOptLong2 - j2, false);
                                if (j2 > 2500 && jOptLong5 > j3) {
                                    i = length;
                                    j3 = jOptLong5;
                                }
                            }
                        }
                    } else {
                        i = -1;
                    }
                    if (i >= 0) {
                        for (int length2 = jSONArrayOptJSONArray.length() - 1; length2 >= i; length2--) {
                            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(length2);
                            if (jSONObjectOptJSONObject3 != null) {
                                jOptLong3 -= jSONObjectOptJSONObject3.optLong("duration");
                                jOptLong4 -= jSONObjectOptJSONObject3.optLong("cpuDuration");
                            }
                        }
                        JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject4 != null) {
                            long jOptLong6 = jSONObjectOptJSONObject4.optLong("duration");
                            long jOptLong7 = jSONObjectOptJSONObject4.optLong("cpuDuration");
                            C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgWallDuration", Long.valueOf(jOptLong6));
                            C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMessageCpuDuration", Long.valueOf(jOptLong7));
                            C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgStartCpuTime", Long.valueOf(jOptLong4));
                            C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgEndCpuTime", Long.valueOf(jOptLong4 + jOptLong7));
                            C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgStartWallTime", Long.valueOf(jOptLong3));
                            C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgEndWallTime", Long.valueOf(jOptLong3 + jOptLong6));
                            int iOptInt = jSONObjectOptJSONObject4.optInt("type");
                            if (iOptInt == 1) {
                                if (jOptLong7 <= 1) {
                                    str = "idle";
                                } else if (2 * jOptLong7 > jOptLong6) {
                                    str = "native_busy";
                                } else if (jOptLong7 * 10 < jOptLong6) {
                                    str = "native_lock";
                                } else {
                                    str = "native_unknown";
                                }
                            } else if (iOptInt == 8) {
                                if (2 * jOptLong7 > jOptLong6) {
                                    str = "java_busy";
                                } else if (jOptLong7 * 10 < jOptLong6) {
                                    str = "java_lock";
                                } else {
                                    str = "java_unknown";
                                }
                            } else {
                                str = "normal";
                            }
                            C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgType", str);
                            C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsg", jSONObjectOptJSONObject4.optString("message"));
                            C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgBlockStack", jSONObjectOptJSONObject4.optString("block_stack"));
                            return;
                        }
                        return;
                    }
                    if (jSONObjectOptJSONObject != null) {
                        C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgWallDuration", Long.valueOf(jOptLong));
                        C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMessageCpuDuration", -1);
                        C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgStartCpuTime", Long.valueOf(jOptLong4));
                        C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgEndCpuTime", -1);
                        C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgStartWallTime", Long.valueOf(jOptLong3));
                        C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgEndWallTime", Long.valueOf(jOptLong3 + jOptLong));
                        C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgType", "current");
                        C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsg", jSONObjectOptJSONObject.optString("message"));
                        C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgBlockStack", jSONObjectOptJSONObject.optString("block_stack"));
                        return;
                    }
                    return;
                }
                C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgType", "no_last_times");
                C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsg", "no_last_times");
                return;
            }
            C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsgType", "no_history");
            C0VJO.LJIIIIZZ(jSONObjectLIZIZ, "longestMsg", "no_history");
        }
    }

    public static synchronized void LJ(int i) {
        if (i <= 0) {
            return;
        }
        int i2 = LIZIZ;
        if (i2 > 0) {
            return;
        }
        LIZIZ = i;
        if (i2 == 0) {
            LJFF();
        }
    }

    public static void LIZJ(JSONObject jSONObject, File file) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String strLJFF;
        String strLJFF2;
        JSONObject jSONObjectLIZJ = FullJsonFormat.LIZJ(file, "current.json");
        C0VJO.LIZLLL(jSONObjectLIZJ, FullJsonFormat.LIZJ(file, "current_update.json"));
        C0VJO.LJIIIIZZ(jSONObject, "current_message", jSONObjectLIZJ);
        JSONObject jSONObjectLIZJ2 = FullJsonFormat.LIZJ(file, "history.json");
        JSONArray jSONArrayOptJSONArray = jSONObjectLIZJ2.optJSONArray("history_message");
        JSONObject jSONObjectOptJSONObject = jSONObjectLIZJ2.optJSONObject("history_details");
        C0VJO.LJIIIIZZ(jSONObject, "history_message", jSONArrayOptJSONArray);
        C0VJO.LJIIIIZZ(jSONObject, "history_details", jSONObjectOptJSONObject);
        try {
            strLJFF2 = C2112008Pe.LJFF(new C0VSJ(file, "pending.json"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (strLJFF2 != null) {
            jSONArray = new JSONArray(strLJFF2);
        } else {
            jSONArray = new JSONArray();
        }
        C0VJO.LJIIIIZZ(jSONObject, "pending_messages", jSONArray);
        try {
            strLJFF = C2112008Pe.LJFF(new C0VSJ(file, "block_stack.json"));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (strLJFF != null) {
            jSONArray2 = new JSONArray(strLJFF);
        } else {
            jSONArray2 = new JSONArray();
        }
        C0VJO.LJIIIIZZ(jSONObject, "block_stack", jSONArray2);
    }
}
