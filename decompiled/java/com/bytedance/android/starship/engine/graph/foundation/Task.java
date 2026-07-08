package com.bytedance.android.starship.engine.graph.foundation;

import X.C09CT;
import X.C1307220k7c;
import X.EnumC1307350k7p;
import X.InterfaceC1307160k7W;
import X.InterfaceC1307210k7b;
import X.InterfaceC1307250k7f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class Task implements Comparable<Task> {
    public final InterfaceC1307210k7b LL;
    public final long LLILLJJLI;
    public EnumC1307350k7p LLILLL;
    public long LLILZ;
    public final Input LLILZIL;
    public final Output LLILZLL;
    public final HashSet<InterfaceC1307250k7f> LLIZ;
    public InterfaceC1307160k7W LLIZLLLIL;

    public Task(InterfaceC1307210k7b interfaceC1307210k7b) {
        this.LL = interfaceC1307210k7b;
        long jIncrementAndGet = C1307220k7c.LIZ.incrementAndGet();
        this.LLILLJJLI = jIncrementAndGet;
        this.LLILLL = EnumC1307350k7p.CREATED;
        this.LLILZ = jIncrementAndGet;
        this.LLILZIL = new Input(new HashMap(), null);
        this.LLILZLL = new Output(new ArrayList(), null, null, null, null);
        this.LLIZ = new HashSet<>();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Task task) {
        return Intrinsics.LJII(this.LLILZ, task.LLILZ);
    }

    public static final class Input {

        @C09CT("manual")
        public Packet manual;

        @C09CT("upstream")
        public final HashMap<Long, Packet> upstream;

        public Input() {
            this(new HashMap(), null);
        }

        public Input(HashMap<Long, Packet> map, Packet packet) {
            this.upstream = map;
            this.manual = packet;
        }
    }

    public static final class Output {
        public transient Throwable LIZ;

        @C09CT("delivery_id")
        public String deliveryId;

        @C09CT("extra")
        public Map<String, ? extends Object> extra;

        @C09CT("packets")
        public final List<Packet> packets;

        @C09CT("trace_id")
        public String traceId;

        public Output() {
            this(new ArrayList(), null, null, null, null);
        }

        public Output(List<Packet> list, Throwable th, Map<String, ? extends Object> map, String str, String str2) {
            this.packets = list;
            this.LIZ = th;
            this.extra = map;
            this.traceId = str;
            this.deliveryId = str2;
        }
    }
}
