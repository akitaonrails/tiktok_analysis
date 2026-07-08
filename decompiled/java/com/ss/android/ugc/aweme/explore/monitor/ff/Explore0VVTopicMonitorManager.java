package com.ss.android.ugc.aweme.explore.monitor.ff;

import X.C098200Yq;
import X.C09JN;
import X.C15UD;
import X.C189200o6;
import X.C1906580ziK;
import X.InterfaceC586170Myt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTopicMonitorManager;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitorTopic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public final class Explore0VVTopicMonitorManager implements InterfaceC586170Myt {
    public static final Explore0VVTopicMonitorManager INSTANCE;
    public static volatile Long currentTopicId;
    public static final ConcurrentHashMap<Long, Explore0VVTrackerMonitorTopic> monitors;

    static {
        Unit unit;
        Explore0VVTopicMonitorManager explore0VVTopicMonitorManager = new Explore0VVTopicMonitorManager();
        INSTANCE = explore0VVTopicMonitorManager;
        monitors = new ConcurrentHashMap<>();
        try {
            IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
            if (iAccountService != null) {
                iAccountService.LJIILL(explore0VVTopicMonitorManager);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            C189200o6.m2constructorimpl(C1906580ziK.LIZJ().LIZJ().LJJLJLI(new C09JN() { // from class: X.15UM
                @Override // X.C09JN
                public final void accept(Object obj) throws JSONException {
                    C1C7U.LIZ("Explore0VVTopicMonitorManager@a608.<init>$2$1");
                    Boolean bool = (Boolean) obj;
                    Long l = Explore0VVTopicMonitorManager.currentTopicId;
                    if (l != null) {
                        Explore0VVTrackerMonitorTopic explore0VVTrackerMonitorTopic = Explore0VVTopicMonitorManager.monitors.get(Long.valueOf(l.longValue()));
                        if (explore0VVTrackerMonitorTopic != null) {
                            if (bool.booleanValue()) {
                                if (explore0VVTrackerMonitorTopic.isInExplorePage()) {
                                    explore0VVTrackerMonitorTopic.leaveReason(C15UD.BECOME_INACTIVE);
                                    explore0VVTrackerMonitorTopic.report();
                                    explore0VVTrackerMonitorTopic.setInBackground$explore_release(true);
                                }
                            } else {
                                explore0VVTrackerMonitorTopic.setInBackground$explore_release(false);
                                explore0VVTrackerMonitorTopic.start(C15UE.BECOME_INACTIVE.getValue());
                            }
                        }
                    }
                    C1C7U.LIZIZ("Explore0VVTopicMonitorManager@a608.<init>$2$1");
                }
            }));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public final Long getCurrentTopicId() {
        return currentTopicId;
    }

    public final Explore0VVTrackerMonitorTopic monitorFor(long j) {
        Explore0VVTrackerMonitorTopic explore0VVTrackerMonitorTopicPutIfAbsent;
        ConcurrentHashMap<Long, Explore0VVTrackerMonitorTopic> concurrentHashMap = monitors;
        Long lValueOf = Long.valueOf(j);
        Explore0VVTrackerMonitorTopic explore0VVTrackerMonitorTopic = concurrentHashMap.get(lValueOf);
        if (explore0VVTrackerMonitorTopic == null && (explore0VVTrackerMonitorTopicPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (explore0VVTrackerMonitorTopic = new Explore0VVTrackerMonitorTopic(j)))) != null) {
            explore0VVTrackerMonitorTopic = explore0VVTrackerMonitorTopicPutIfAbsent;
        }
        return explore0VVTrackerMonitorTopic;
    }

    public final void reportCurrentTopic(C15UD c15ud) {
        Long l = currentTopicId;
        if (l != null) {
            reportSession(l.longValue(), c15ud);
        }
    }

    public final void restartCurrentTopic(String str) {
        Long l = currentTopicId;
        if (l != null) {
            monitorFor(l.longValue()).start(str);
        }
    }

    public final void reportSession(long j, C15UD c15ud) {
        Long l;
        Explore0VVTrackerMonitorTopic explore0VVTrackerMonitorTopic = monitors.get(Long.valueOf(j));
        if (explore0VVTrackerMonitorTopic != null) {
            explore0VVTrackerMonitorTopic.leaveReason(c15ud);
            explore0VVTrackerMonitorTopic.report();
        }
        if (c15ud != C15UD.ENTER_DETAIL && (l = currentTopicId) != null && l.longValue() == j) {
            currentTopicId = null;
        }
    }

    @Override // X.InterfaceC586170Myt
    public void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            Iterator<T> it2 = monitors.values().iterator();
            while (it2.hasNext()) {
                ((Explore0VVTrackerMonitorTopic) it2.next()).clearData$explore_release();
            }
            monitors.clear();
            currentTopicId = null;
        }
    }

    public final void startSession(long j, String str, String str2, String str3, String str4) {
        Explore0VVTrackerMonitorTopic explore0VVTrackerMonitorTopic;
        Long l = currentTopicId;
        if (l != null && l.longValue() != j && (explore0VVTrackerMonitorTopic = monitors.get(l)) != null && explore0VVTrackerMonitorTopic.isInExplorePage()) {
            explore0VVTrackerMonitorTopic.leaveReason(C15UD.SWITCH_TAB);
            explore0VVTrackerMonitorTopic.report();
        }
        currentTopicId = Long.valueOf(j);
        Explore0VVTrackerMonitorTopic explore0VVTrackerMonitorTopicMonitorFor = monitorFor(j);
        explore0VVTrackerMonitorTopicMonitorFor.setTopicName(str);
        explore0VVTrackerMonitorTopicMonitorFor.setSchemaContext(str3, str4);
        explore0VVTrackerMonitorTopicMonitorFor.start(str2);
    }
}
