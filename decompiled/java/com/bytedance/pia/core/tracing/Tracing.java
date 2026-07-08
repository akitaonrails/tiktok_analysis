package com.bytedance.pia.core.tracing;

import X.C09CT;
import X.C09EI;
import X.C1287700jc8;
import X.InterfaceC2203841BNe;
import com.bytedance.pia.core.tracing.Tracing;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes35.dex */
public final class Tracing {
    public final List<Event> LIZ = new ArrayList();
    public final Set<InterfaceC2203841BNe> LIZIZ = new HashSet();
    public final AtomicLong LIZJ = new AtomicLong(0);

    public class Event {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("name")
        public final EventName name;

        @C09CT("ts")
        public final Long timestamp;

        @C09EI
        public boolean LIZ = false;

        @C09CT("args")
        public final Map<String, Object> args = new HashMap();

        public final void LIZ() {
            final Tracing tracing = Tracing.this;
            tracing.getClass();
            C1287700jc8.LIZJ(new Runnable() { // from class: X.1BNc
                @Override // java.lang.Runnable
                public final void run() {
                    Tracing tracing2 = tracing;
                    Tracing.Event event = this;
                    tracing2.getClass();
                    C1C7U.LIZ("Tracing@6da2.flush$1L");
                    if (event.LIZ) {
                        C1C7U.LIZIZ("Tracing@6da2.flush$1L");
                        return;
                    }
                    event.LIZ = true;
                    ((ArrayList) tracing2.LIZ).add(event);
                    Iterator it2 = ((HashSet) tracing2.LIZIZ).iterator();
                    while (it2.hasNext()) {
                        InterfaceC2203841BNe interfaceC2203841BNe = (InterfaceC2203841BNe) it2.next();
                        interfaceC2203841BNe.accept(event);
                        if (interfaceC2203841BNe.LIZ()) {
                            it2.remove();
                        }
                    }
                    C1C7U.LIZIZ("Tracing@6da2.flush$1L");
                }
            });
        }

        public Event(EventName eventName, long j) {
            this.id = Tracing.this.LIZJ.getAndIncrement();
            this.name = eventName;
            this.timestamp = Long.valueOf(j);
        }
    }

    public final Event LIZ(EventName eventName) {
        return new Event(eventName, System.currentTimeMillis());
    }
}
