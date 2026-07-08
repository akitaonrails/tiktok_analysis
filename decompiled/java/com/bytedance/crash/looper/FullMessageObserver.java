package com.bytedance.crash.looper;

import X.C08SE;
import X.C0VJO;
import X.C0VSJ;
import android.os.Build;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.looper.LooperMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.File;
import java.lang.reflect.Field;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class FullMessageObserver implements MessageObserver {
    public RecordingStateRunning LL;
    public volatile RecordingState LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;
    public BlockMonitor LLIZ;

    public interface RecordingState {
        void LIZ(Message message, long j, long j2, long j3);
    }

    @Override // com.bytedance.crash.looper.MessageObserver
    public final void stop() {
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.crash.looper.MessageObserver
    public void start() {
        if (MessageRecorder.LIZJ) {
            long jLJJJ = NativeBridge.LJJJ();
            this.LLIZ = jLJJJ != 0 ? new BlockMonitor(jLJJJ) : null;
        }
        RecordingStateRunning recordingStateRunning = new RecordingStateRunning();
        this.LL = recordingStateRunning;
        LIZ(recordingStateRunning);
    }

    public class RecordingStateDumping implements RecordingState {
        public File LIZ;
        public LinkedList<LooperMessage.HistoryMessage> LIZIZ;
        public LinkedList<LooperMessage.ShadowMessage> LIZJ;

        public RecordingStateDumping() {
        }

        @Override // com.bytedance.crash.looper.FullMessageObserver.RecordingState
        public final void LIZ(Message message, long j, long j2, long j3) {
            if (this.LIZIZ == null) {
                LooperMessage.HistoryMessage historyMessage = new LooperMessage.HistoryMessage();
                historyMessage.LJ = j;
                historyMessage.LJFF = j2;
                historyMessage.LIZ(message, j3);
                if (this.LIZ != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        String str = historyMessage.LIZIZ;
                        if (str == null && (str = historyMessage.LIZ) == null) {
                            str = "no message running";
                        }
                        jSONObject.put("message", str);
                        jSONObject.put("currentMessageLastCost", historyMessage.LJ);
                        jSONObject.put("currentMessageLastCpu", historyMessage.LJFF);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C08SE.LJIIIZ(new C0VSJ(this.LIZ, "current_update.json"), jSONObject);
                }
                this.LIZIZ = new LinkedList<>();
                if (this.LIZJ != null) {
                    FullMessageObserver fullMessageObserver = FullMessageObserver.this;
                    fullMessageObserver.LIZ(fullMessageObserver.LL);
                    return;
                }
                return;
            }
            if (message != null) {
                LooperMessage.HistoryMessage historyMessage2 = new LooperMessage.HistoryMessage();
                historyMessage2.LJ = j;
                historyMessage2.LJFF = j2;
                historyMessage2.LIZ(message, j3);
                this.LIZIZ.add(historyMessage2);
            }
        }
    }

    public FullMessageObserver(boolean z) {
        LooperMessage.LIZ = z;
    }

    public final void LIZ(RecordingState recordingState) {
        synchronized (this) {
            try {
                this.LLILLJJLI = recordingState;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.os.Message r18) {
        /*
            r17 = this;
            r6 = r17
            com.bytedance.crash.looper.FullMessageObserver$RecordingState r0 = r6.LLILLJJLI
            if (r0 != 0) goto L7
            return
        L7:
            long r2 = android.os.SystemClock.currentThreadTimeMillis()
            long r0 = java.lang.System.currentTimeMillis()
            long r7 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.LLILLL
            r10 = 0
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            r10 = r18
            if (r9 == 0) goto L3d
            long r11 = r0 - r4
            long r4 = r6.LLILZ
            long r13 = r2 - r4
            monitor-enter(r6)
            com.bytedance.crash.looper.FullMessageObserver$RecordingState r9 = r6.LLILLJJLI     // Catch: java.lang.Throwable -> L37
            long r4 = r6.LLILZIL     // Catch: java.lang.Throwable -> L37
            r15 = r4
            r9.LIZ(r10, r11, r13, r15)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L37
            com.bytedance.crash.looper.BlockMonitor r9 = r6.LLIZ
            if (r9 == 0) goto L3d
            if (r10 == 0) goto L49
            X.C0VXF.removeCallbacks(r9)
            goto L3f
        L37:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L37
            throw r0
        L3d:
            if (r10 == 0) goto L4e
        L3f:
            r4 = 1
        L40:
            r6.LLILZLL = r4
            r6.LLILLL = r0
            r6.LLILZ = r2
            r6.LLILZIL = r7
            return
        L49:
            r4 = 3000(0xbb8, double:1.482E-320)
            X.C0VXF.postDelayed(r9, r4)
        L4e:
            r4 = 0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.looper.FullMessageObserver.LIZIZ(android.os.Message):void");
    }

    @Override // com.bytedance.crash.looper.MessageObserver
    public final void dumpMessages(File file) {
        boolean z;
        MessageQueue messageQueueLIZ;
        Field declaredField;
        Field declaredField2;
        Object obj;
        Object obj2;
        String str;
        if (this.LLILLJJLI != this.LL) {
            return;
        }
        RecordingStateDumping recordingStateDumping = new RecordingStateDumping();
        RecordingStateRunning recordingStateRunning = (RecordingStateRunning) this.LLILLJJLI;
        LIZ(recordingStateDumping);
        long j = this.LLILLL;
        long j2 = this.LLILZ;
        boolean z2 = this.LLILZLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (j != 0) {
            long j3 = jCurrentTimeMillis - j;
            recordingStateDumping.LIZ = file;
            JSONObject jSONObject = new JSONObject();
            if (z2) {
                str = "message is running";
            } else {
                str = "no message running";
            }
            try {
                jSONObject.put("message", str);
                jSONObject.put("currentMessageCost", j3);
                jSONObject.put("currentMessageCpu", -1);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C08SE.LJIIIZ(new C0VSJ(file, "current.json"), jSONObject);
            LooperMessage.PackingMessages packingMessages = recordingStateRunning.LIZ;
            packingMessages.LJ(true);
            LooperMessage.PackedMessagesChunk packedMessagesChunk = packingMessages.LJIIL;
            packedMessagesChunk.getClass();
            JSONArray jSONArray = new JSONArray();
            int i = packedMessagesChunk.LIZJ;
            if (i != -1) {
                int i2 = i + 1;
                packedMessagesChunk.LIZLLL = i2;
                if (i2 == packedMessagesChunk.LIZIZ || packedMessagesChunk.LIZ[i2].LJ == 0) {
                    packedMessagesChunk.LIZLLL = 0;
                }
                for (LooperMessage.PackedMessages packedMessages = packedMessagesChunk.LIZ[packedMessagesChunk.LIZLLL]; packedMessages != null; packedMessages = packedMessagesChunk.LIZ[packedMessagesChunk.LIZLLL]) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        packedMessages.LIZJ(jSONObject2);
                        jSONArray.put(jSONObject2);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    int i3 = packedMessagesChunk.LIZLLL + 1;
                    packedMessagesChunk.LIZLLL = i3;
                    if (i3 == packedMessagesChunk.LIZJ + 1) {
                        break;
                    }
                    if (i3 == packedMessagesChunk.LIZIZ) {
                        packedMessagesChunk.LIZLLL = 0;
                    }
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("dump_wall_time", jCurrentTimeMillis);
                jSONObject3.put("dump_up_time", jUptimeMillis);
                jSONObject3.put("last_wall_time", j);
                jSONObject3.put("last_cpu_time", j2);
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            JSONObject jSONObject4 = new JSONObject();
            C0VJO.LJIIIIZZ(jSONObject4, "history_message", jSONArray);
            C0VJO.LJIIIIZZ(jSONObject4, "history_details", jSONObject3);
            C08SE.LJIIIZ(new C0VSJ(file, "history.json"), jSONObject4);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (messageQueueLIZ = MessageQueueWrapper.LIZ()) != null) {
            try {
                declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                declaredField.setAccessible(true);
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                declaredField = null;
            }
            try {
                declaredField2 = Class.forName("android.os.Message").getDeclaredField("next");
                try {
                    declaredField2.setAccessible(true);
                } catch (Exception e5) {
                    e = e5;
                    TryCatchGuardChecker.doCheck(e);
                    declaredField2 = null;
                }
            } catch (Exception e6) {
                e = e6;
            }
            if (declaredField != null && declaredField2 != null) {
                LinkedList<LooperMessage.ShadowMessage> linkedList = new LinkedList<>();
                try {
                } catch (Throwable th) {
                }
                synchronized (messageQueueLIZ) {
                    try {
                        try {
                            obj = declaredField.get(messageQueueLIZ);
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } catch (Exception e7) {
                        TryCatchGuardChecker.doCheck(e7);
                        obj = null;
                    }
                    Message message = (Message) obj;
                    int i4 = 0;
                    while (message != null) {
                        int i5 = i4 + 1;
                        if (i4 >= 200) {
                            break;
                        }
                        LooperMessage.ShadowMessage shadowMessage = new LooperMessage.ShadowMessage();
                        shadowMessage.LIZ(message, jUptimeMillis);
                        linkedList.add(shadowMessage);
                        try {
                            obj2 = declaredField2.get(message);
                        } catch (Exception e8) {
                            TryCatchGuardChecker.doCheck(e8);
                            obj2 = null;
                        }
                        message = (Message) obj2;
                        i4 = i5;
                        recordingStateDumping.LIZJ = linkedList;
                    }
                }
                recordingStateDumping.LIZJ = linkedList;
            }
        }
        if (recordingStateDumping.LIZIZ != null) {
            FullMessageObserver fullMessageObserver = FullMessageObserver.this;
            fullMessageObserver.LIZ(fullMessageObserver.LL);
        }
        JSONArray jSONArray2 = new JSONArray();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        do {
            LinkedList<LooperMessage.HistoryMessage> linkedList2 = recordingStateDumping.LIZIZ;
            if (linkedList2 != null && i7 < linkedList2.size()) {
                int i9 = i7 + 1;
                LooperMessage.HistoryMessage historyMessage = recordingStateDumping.LIZIZ.get(i7);
                JSONObject jSONObject5 = new JSONObject();
                try {
                    historyMessage.LIZJ(jSONObject5);
                    int i10 = i6 + 1;
                    try {
                        jSONObject5.put(FollowStatusChangeMethod.PARAM_UID, i6);
                        jSONArray2.put(jSONObject5);
                        i6 = i10;
                    } catch (JSONException e9) {
                        e = e9;
                        i6 = i10;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (JSONException e10) {
                    e = e10;
                }
                LinkedList<LooperMessage.ShadowMessage> linkedList3 = recordingStateDumping.LIZJ;
                if (linkedList3 != null && i8 < linkedList3.size()) {
                    LooperMessage.ShadowMessage shadowMessage2 = recordingStateDumping.LIZJ.get(i8);
                    if (historyMessage.LIZJ == shadowMessage2.LIZJ && historyMessage.LIZLLL == shadowMessage2.LIZLLL && historyMessage.LIZ == shadowMessage2.LIZ && historyMessage.LIZIZ == shadowMessage2.LIZIZ) {
                        i8++;
                    }
                }
                i7 = i9;
            } else {
                LinkedList<LooperMessage.ShadowMessage> linkedList4 = recordingStateDumping.LIZJ;
                if (linkedList4 == null || i8 >= linkedList4.size()) {
                    break;
                }
                int i11 = i8 + 1;
                LooperMessage.ShadowMessage shadowMessage3 = recordingStateDumping.LIZJ.get(i8);
                JSONObject jSONObject6 = new JSONObject();
                try {
                    shadowMessage3.LIZJ(jSONObject6);
                    int i12 = i6 + 1;
                    try {
                        jSONObject6.put(FollowStatusChangeMethod.PARAM_UID, i6);
                        jSONArray2.put(jSONObject6);
                        i6 = i12;
                    } catch (JSONException e11) {
                        e = e11;
                        i6 = i12;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (JSONException e12) {
                    e = e12;
                }
                i8 = i11;
            }
        } while (i6 < 200);
        C08SE.LJII(new C0VSJ(file, "pending.json"), jSONArray2);
        BlockMonitor blockMonitor = this.LLIZ;
        blockMonitor.getClass();
        NativeBridge.LJJJI(blockMonitor.LL, new C0VSJ(file, "block_stack.json").getAbsolutePath());
    }

    @Override // com.bytedance.crash.looper.MessageObserver, X.InterfaceC20666087s
    public final void messageDispatchStarting(String str) {
        LIZIZ(null);
    }

    @Override // com.bytedance.crash.looper.MessageObserver, X.InterfaceC20666087s
    public final void messageDispatched(String str, Message message) {
        LIZIZ(message);
    }

    public static class RecordingStateRunning implements RecordingState {
        public final LooperMessage.PackingMessages LIZ = new LooperMessage.PackingMessages();

        @Override // com.bytedance.crash.looper.FullMessageObserver.RecordingState
        public final void LIZ(Message message, long j, long j2, long j3) {
            String name;
            if (message != null) {
                LooperMessage.PackingMessages packingMessages = this.LIZ;
                if (j > 200) {
                    packingMessages.LJ(true);
                } else {
                    packingMessages.getClass();
                }
                if (message.getCallback() != null) {
                    name = message.getCallback().getClass().getName();
                } else if (message.getTarget() != null) {
                    name = message.getTarget().getClass().getName();
                } else {
                    name = "unknown";
                }
                LooperMessage.LinkableHistoryMessageGroup linkableHistoryMessageGroup = packingMessages.LJIIJ.get(name);
                if (linkableHistoryMessageGroup == null) {
                    LooperMessage.LinkableMessagePool linkableMessagePool = packingMessages.LJIIJJI;
                    linkableHistoryMessageGroup = linkableMessagePool.LIZ;
                    if (linkableHistoryMessageGroup != null) {
                        linkableMessagePool.LIZ = linkableHistoryMessageGroup.LJII;
                        linkableHistoryMessageGroup.LJII = null;
                        linkableHistoryMessageGroup.LIZ = null;
                        linkableHistoryMessageGroup.LIZIZ = null;
                        linkableHistoryMessageGroup.LIZJ = Long.MAX_VALUE;
                        linkableHistoryMessageGroup.LIZLLL = -1;
                        linkableHistoryMessageGroup.LJ = 0L;
                        linkableHistoryMessageGroup.LJFF = 0L;
                        linkableHistoryMessageGroup.LJI = 0;
                    } else {
                        packingMessages.LJ(true);
                        LooperMessage.LinkableMessagePool linkableMessagePool2 = packingMessages.LJIIJJI;
                        linkableHistoryMessageGroup = linkableMessagePool2.LIZ;
                        if (linkableHistoryMessageGroup == null) {
                            return;
                        }
                        linkableMessagePool2.LIZ = linkableHistoryMessageGroup.LJII;
                        linkableHistoryMessageGroup.LJII = null;
                        linkableHistoryMessageGroup.LIZ = null;
                        linkableHistoryMessageGroup.LIZIZ = null;
                        linkableHistoryMessageGroup.LIZJ = Long.MAX_VALUE;
                        linkableHistoryMessageGroup.LIZLLL = -1;
                        linkableHistoryMessageGroup.LJ = 0L;
                        linkableHistoryMessageGroup.LJFF = 0L;
                        linkableHistoryMessageGroup.LJI = 0;
                    }
                    packingMessages.LJIIJ.put(name, linkableHistoryMessageGroup);
                    linkableHistoryMessageGroup.LIZ(message, j3);
                }
                linkableHistoryMessageGroup.LJ += j;
                linkableHistoryMessageGroup.LJFF += j2;
                linkableHistoryMessageGroup.LJI++;
                long jLIZIZ = LooperMessage.ShadowMessage.LIZIZ(message, j3);
                if (linkableHistoryMessageGroup.LIZJ > jLIZIZ) {
                    linkableHistoryMessageGroup.LIZJ = jLIZIZ;
                }
                packingMessages.LJI++;
                if (packingMessages.LIZJ == Long.MAX_VALUE) {
                    long jLIZIZ2 = LooperMessage.ShadowMessage.LIZIZ(message, j3);
                    if (jLIZIZ2 <= 0) {
                        long j4 = jLIZIZ2 + packingMessages.LJ;
                        if (j4 > 0) {
                            packingMessages.LIZJ = 0L;
                        } else {
                            packingMessages.LIZJ = j4;
                        }
                    }
                }
                packingMessages.LJ += j;
                packingMessages.LJFF += j2;
                LooperMessage.LinkableHistoryMessageGroup linkableHistoryMessageGroup2 = packingMessages.LJIILIIL;
                if (linkableHistoryMessageGroup2 == null || linkableHistoryMessageGroup.LJ > linkableHistoryMessageGroup2.LJ) {
                    packingMessages.LJIILIIL = linkableHistoryMessageGroup;
                }
                packingMessages.LJ(false);
                return;
            }
            LooperMessage.PackingMessages packingMessages2 = this.LIZ;
            if (j > 200) {
                packingMessages2.LJ(true);
            }
            packingMessages2.LJII += j;
            packingMessages2.LJIIIIZZ += j2;
            if (j > 1) {
                packingMessages2.LJIIIZ++;
            }
            packingMessages2.LJ += j;
            packingMessages2.LJFF += j2;
            packingMessages2.LJ(false);
        }
    }
}
