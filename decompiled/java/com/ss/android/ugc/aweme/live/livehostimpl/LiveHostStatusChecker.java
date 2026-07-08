package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C01GW;
import X.C0J60;
import X.C0J65;
import X.C0J66;
import X.C0XE1;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2203431BLp;
import X.C452501pT;
import X.C481640Iug;
import X.C481660Iui;
import X.C481670Iuj;
import X.C481940IvA;
import X.C482240Ive;
import X.C486300J5g;
import X.C486320J5i;
import X.C486330J5j;
import X.C486370J5n;
import X.C486380J5o;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.android.livesdkapi.host.ILiveStatusCheckService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostStatusChecker implements ILiveStatusCheckService {
    public final C01GW LL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(148));
    public final Set<String> LLILLJJLI = new LinkedHashSet();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 314));

    @Override // com.bytedance.android.livesdkapi.host.ILiveStatusCheckService
    public final boolean C82(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) {
        return this.LLILLJJLI.contains(String.valueOf(feedUserRoomMonitorMessage.anchorId));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdkapi.host.ILiveStatusCheckService
    public final void oj1(int i, Set set, Set set2) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        if (i != 5) {
            if (i == 6) {
                this.LLILLJJLI.removeAll(set);
            }
        } else {
            this.LLILLJJLI.clear();
            this.LLILLJJLI.addAll(set);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveHostStatusChecker.registerRoomStatusCheck: anchorIds: ");
        sbLIZ.append(C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62));
        sbLIZ.append("roomIds: ");
        sbLIZ.append(C13LP.LJJLIIIJ(set2, ",", null, null, 0, null, null, 62));
        C20441214yg.LIZIZ("SignalingRoomState", C2188811AlT.LIZIZ(sbLIZ));
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486370J5n.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C486370J5n.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        boolean z = obj instanceof C486370J5n;
        Object obj3 = obj;
        if (!z) {
            obj3 = null;
        }
        C0J66 c0j66 = (C0J66) obj3;
        if (c0j66 != null) {
            C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
            if (c2203431BLp.getState() == C0XE1.CONNECTION_UNKNOWN) {
                c2203431BLp.LJ("live_status");
            }
            C486380J5o c486380J5o = new C486380J5o(null, null, null, 63);
            c486380J5o.LIZJ = "live_inner_feed";
            c486380J5o.LIZLLL = set;
            c0j66.LJIIJ(c486380J5o);
        }
    }
}
