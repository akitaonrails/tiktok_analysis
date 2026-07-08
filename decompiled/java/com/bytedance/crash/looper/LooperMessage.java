package com.bytedance.crash.looper;

import android.os.Message;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class LooperMessage {
    public static boolean LIZ;

    public static class HistoryMessageGroup extends HistoryMessage {
        public int LJI;
    }

    public static class LinkableHistoryMessageGroup extends HistoryMessageGroup {
        public LinkableHistoryMessageGroup LJII;
    }

    public static class LinkableMessagePool {
        public LinkableHistoryMessageGroup LIZ;

        public LinkableMessagePool() {
            int i = 30;
            do {
                LinkableHistoryMessageGroup linkableHistoryMessageGroup = new LinkableHistoryMessageGroup();
                linkableHistoryMessageGroup.LJII = this.LIZ;
                this.LIZ = linkableHistoryMessageGroup;
                i--;
            } while (i > 0);
        }
    }

    public static class PackedMessages extends TimePeriodHistoryMessages {
        public int LJIIJ;
        public long LJIIJJI;
        public long LJIIL;
        public long LJIILIIL;

        @Override // com.bytedance.crash.looper.LooperMessage.TimePeriodHistoryMessages
        public final void LIZLLL() {
            super.LIZLLL();
            this.LJIIJ = 0;
            this.LJIIJJI = 0L;
            this.LJIIL = 0L;
        }

        @Override // com.bytedance.crash.looper.LooperMessage.TimePeriodHistoryMessages, com.bytedance.crash.looper.LooperMessage.HistoryMessage, com.bytedance.crash.looper.LooperMessage.ShadowMessage
        public final void LIZJ(JSONObject jSONObject) throws JSONException {
            super.LIZJ(jSONObject);
            int i = this.LJI;
            int i2 = 1;
            if (i != 0) {
                if (i == 1 && this.LJ - this.LJII > 200) {
                    i2 = 8;
                } else {
                    i2 = 9;
                    jSONObject.put("LongestGroupMessageCount", this.LJIIJ);
                    jSONObject.put("LongestGroupDuration", this.LJIIJJI);
                    jSONObject.put("LongestGroupCpuDuration", this.LJIIL);
                    jSONObject.put("LongestGroupDelay", this.LJIILIIL);
                    jSONObject.put("messageCount", this.LJI);
                }
            }
            String str = this.LIZIZ;
            if (str == null && (str = this.LIZ) == null) {
                str = "no message running";
            }
            jSONObject.put("msg", str);
            jSONObject.put("type", i2);
        }
    }

    public static class PackedMessagesChunk {
        public final PackedMessages[] LIZ = new PackedMessages[50];
        public final int LIZIZ;
        public int LIZJ;
        public int LIZLLL;

        public PackedMessagesChunk() {
            int i = 0;
            do {
                this.LIZ[i] = new PackedMessages();
                i++;
            } while (i < 50);
            this.LIZIZ = 50;
            this.LIZJ = -1;
        }
    }

    public static class PackingMessages extends TimePeriodHistoryMessages {
        public final HashMap<String, LinkableHistoryMessageGroup> LJIIJ = new HashMap<>(30);
        public final LinkableMessagePool LJIIJJI = new LinkableMessagePool();
        public final PackedMessagesChunk LJIIL = new PackedMessagesChunk();
        public LinkableHistoryMessageGroup LJIILIIL;

        @Override // com.bytedance.crash.looper.LooperMessage.TimePeriodHistoryMessages
        public final void LIZLLL() {
            super.LIZLLL();
            this.LJIILIIL = null;
            for (LinkableHistoryMessageGroup linkableHistoryMessageGroup : this.LJIIJ.values()) {
                if (linkableHistoryMessageGroup != null) {
                    LinkableMessagePool linkableMessagePool = this.LJIIJJI;
                    linkableHistoryMessageGroup.LJII = linkableMessagePool.LIZ;
                    linkableMessagePool.LIZ = linkableHistoryMessageGroup;
                }
            }
            this.LJIIJ.clear();
        }

        public final void LJ(boolean z) {
            long j = this.LJ;
            if (j != 0 || this.LJI != 0) {
                if (!z && j <= 200) {
                    return;
                }
                PackedMessagesChunk packedMessagesChunk = this.LJIIL;
                int i = packedMessagesChunk.LIZJ + 1;
                packedMessagesChunk.LIZJ = i;
                if (i == packedMessagesChunk.LIZIZ) {
                    packedMessagesChunk.LIZJ = 0;
                }
                PackedMessages packedMessages = packedMessagesChunk.LIZ[packedMessagesChunk.LIZJ];
                packedMessages.LIZLLL();
                packedMessages.LJI = this.LJI;
                packedMessages.LJ = this.LJ;
                packedMessages.LJFF = this.LJFF;
                packedMessages.LIZJ = this.LIZJ;
                packedMessages.LJIIIZ = this.LJIIIZ;
                packedMessages.LJII = this.LJII;
                packedMessages.LJIIIIZZ = this.LJIIIIZZ;
                LinkableHistoryMessageGroup linkableHistoryMessageGroup = this.LJIILIIL;
                if (linkableHistoryMessageGroup != null) {
                    packedMessages.LJIIJ = linkableHistoryMessageGroup.LJI;
                    packedMessages.LJIIJJI = linkableHistoryMessageGroup.LJ;
                    packedMessages.LJIIL = linkableHistoryMessageGroup.LJFF;
                    packedMessages.LJIILIIL = linkableHistoryMessageGroup.LIZJ;
                    packedMessages.LIZ = linkableHistoryMessageGroup.LIZ;
                    packedMessages.LIZIZ = linkableHistoryMessageGroup.LIZIZ;
                    packedMessages.LIZLLL = linkableHistoryMessageGroup.LIZLLL;
                }
                LIZLLL();
            }
        }
    }

    public static class HistoryMessage extends ShadowMessage {
        public long LJ;
        public long LJFF;

        @Override // com.bytedance.crash.looper.LooperMessage.ShadowMessage
        public void LIZJ(JSONObject jSONObject) throws JSONException {
            super.LIZJ(jSONObject);
            jSONObject.put("duration", this.LJ);
            jSONObject.put("cpuDuration", this.LJFF);
        }
    }

    public static class ShadowMessage {
        public String LIZ;
        public String LIZIZ;
        public long LIZJ = Long.MAX_VALUE;
        public int LIZLLL;

        public void LIZJ(JSONObject jSONObject) throws JSONException {
            String str = this.LIZIZ;
            if (str != null) {
                jSONObject.put("callback", str);
            }
            String str2 = this.LIZ;
            if (str2 != null) {
                jSONObject.put("target", str2);
            }
            int i = this.LIZLLL;
            if (i != -1) {
                jSONObject.put("what", i);
            }
            long j = this.LIZJ;
            if (j != Long.MAX_VALUE) {
                jSONObject.put("when", j);
            }
        }

        public static long LIZIZ(Message message, long j) {
            if (message.getWhen() > 100) {
                return message.getWhen() - j;
            }
            return Long.MAX_VALUE;
        }

        public final void LIZ(Message message, long j) {
            if (message == null) {
                return;
            }
            if (message.getTarget() != null) {
                this.LIZ = message.getTarget().getClass().getName();
            }
            if (message.getCallback() != null) {
                String name = message.getCallback().getClass().getName();
                this.LIZIZ = name;
                if (LooperMessage.LIZ && name.startsWith("Y.ARunnable")) {
                    String string = message.getCallback().toString();
                    if (string.charAt(0) >= '0' && string.charAt(0) <= '9') {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.LIZIZ);
                        sb.append(".run$");
                        for (int i = 0; i < string.length() && string.charAt(i) != '_'; i++) {
                            sb.append(string.charAt(i));
                        }
                        this.LIZIZ = sb.toString();
                    }
                }
            }
            this.LIZJ = LIZIZ(message, j);
            this.LIZLLL = message.what;
        }
    }

    public static class TimePeriodHistoryMessages extends HistoryMessageGroup {
        public long LJII;
        public long LJIIIIZZ;
        public int LJIIIZ;

        public void LIZLLL() {
            this.LIZ = null;
            this.LIZIZ = null;
            this.LIZJ = Long.MAX_VALUE;
            this.LIZLLL = -1;
            this.LJ = 0L;
            this.LJFF = 0L;
            this.LJI = 0;
            this.LJII = 0L;
            this.LJIIIIZZ = 0L;
            this.LJIIIZ = 0;
        }

        @Override // com.bytedance.crash.looper.LooperMessage.HistoryMessage, com.bytedance.crash.looper.LooperMessage.ShadowMessage
        public void LIZJ(JSONObject jSONObject) throws JSONException {
            super.LIZJ(jSONObject);
            if (this.LJIIIZ != 0) {
                jSONObject.put("idleDuration", this.LJII);
                jSONObject.put("idleCpuDuration", this.LJIIIIZZ);
                jSONObject.put("idleCount", this.LJIIIZ);
            }
        }
    }
}
