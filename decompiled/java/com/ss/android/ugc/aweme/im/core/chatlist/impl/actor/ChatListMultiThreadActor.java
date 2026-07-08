package com.ss.android.ugc.aweme.im.core.chatlist.impl.actor;

import X.AnonymousClass0956;
import X.C058M;
import X.C0WQX;
import X.C1138320fjC;
import X.C11RO;
import X.C11S5;
import X.C19501611Rm;
import X.C2123408To;
import X.C2123508Tp;
import X.C2188811AlT;
import X.C2232408os;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C23269099v;
import X.C2433609gE;
import X.C2502609rM;
import X.C309160C9y;
import X.C823050WQl;
import X.C878950Ydx;
import X.InterfaceC879010Ye3;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.core.chatlist.api.ability.actor.IChatListMultiThreadActor;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class ChatListMultiThreadActor implements IChatListMultiThreadActor {
    public static final ChatListMultiThreadActor LIZ = new ChatListMultiThreadActor();
    public static final List<ExecutorService> LIZIZ = new CopyOnWriteArrayList();
    public static final AtomicInteger LIZJ = new AtomicInteger(0);
    public static final ConcurrentHashMap<InterfaceC879010Ye3, C2433609gE> LIZLLL = new ConcurrentHashMap<>();
    public static final ThreadLocal<InterfaceC879010Ye3> LJ = new ThreadLocal<>();

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Service implements IChatListMultiThreadActor {
        public final /* synthetic */ ChatListMultiThreadActor LIZ = ChatListMultiThreadActor.LIZ;

        @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.ability.actor.IChatListMultiThreadActor
        public final AnonymousClass0956 LIZ(InterfaceC879010Ye3 interfaceC879010Ye3, Function2 function2) {
            return this.LIZ.LIZ(interfaceC879010Ye3, function2);
        }

        @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.ability.actor.IChatListMultiThreadActor
        public final void LIZIZ(InterfaceC879010Ye3 interfaceC879010Ye3, Function0<Unit> function0) {
            this.LIZ.LIZIZ(interfaceC879010Ye3, function0);
        }

        @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.ability.actor.IChatListMultiThreadActor
        public final C19501611Rm LIZJ(C878950Ydx c878950Ydx) {
            return this.LIZ.LIZJ(c878950Ydx);
        }
    }

    public static void LIZLLL(InterfaceC879010Ye3 interfaceC879010Ye3) {
        C2433609gE c2433609gERemove = LIZLLL.remove(interfaceC879010Ye3);
        if (c2433609gERemove != null) {
            C2296808zG.LIZJ(c2433609gERemove.LIZIZ, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cancel scope for pageKey: ");
            sbLIZ.append(interfaceC879010Ye3);
            C2188811AlT.LIZIZ(sbLIZ);
            C309160C9y.LIZ();
        }
    }

    public static C2433609gE LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
        int andIncrement;
        List<ExecutorService> list = LIZIZ;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
        if (copyOnWriteArrayList.size() < 3) {
            andIncrement = copyOnWriteArrayList.size();
            C2123408To c2123408To = new C2123408To(C0WQX.SERIAL);
            c2123408To.LIZJ = 1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ChatListMultiThreadActor-");
            sbLIZ.append(andIncrement);
            c2123408To.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            copyOnWriteArrayList.add(C823050WQl.LIZ(new C2123508Tp(c2123408To)));
        } else {
            andIncrement = LIZJ.getAndIncrement() % 3;
        }
        CoroutineContext coroutineContextPlus = new C2232408os((Executor) ListProtector.get(list, andIncrement)).plus(new C23269099v(interfaceC879010Ye3, LJ)).plus(C2296908zH.LIZ());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Actor-");
        sbLIZ2.append(interfaceC879010Ye3);
        CoroutineContext coroutineContextPlus2 = coroutineContextPlus.plus(new C1138320fjC(C2188811AlT.LIZIZ(sbLIZ2))).plus(new C2502609rM(CoroutineExceptionHandler.LJJLIL, interfaceC879010Ye3, 0));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Created a new CoroutineContext on thread index: ");
        sbLIZ3.append(andIncrement);
        sbLIZ3.append(" for pageKey: ");
        sbLIZ3.append(interfaceC879010Ye3);
        C2188811AlT.LIZIZ(sbLIZ3);
        C309160C9y.LIZ();
        return new C2433609gE(andIncrement, C2296808zG.LIZ(coroutineContextPlus2));
    }

    public static C2433609gE LJFF(InterfaceC879010Ye3 interfaceC879010Ye3) {
        ConcurrentHashMap<InterfaceC879010Ye3, C2433609gE> concurrentHashMap = LIZLLL;
        C2433609gE c2433609gELJ = concurrentHashMap.get(interfaceC879010Ye3);
        if (c2433609gELJ == null) {
            synchronized (concurrentHashMap) {
                try {
                    c2433609gELJ = concurrentHashMap.get(interfaceC879010Ye3);
                    if (c2433609gELJ == null) {
                        c2433609gELJ = LJ(interfaceC879010Ye3);
                        concurrentHashMap.put(interfaceC879010Ye3, c2433609gELJ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c2433609gELJ;
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.ability.actor.IChatListMultiThreadActor
    public final C19501611Rm LIZJ(C878950Ydx c878950Ydx) {
        Executor executor = (Executor) ListProtector.get(LIZIZ, LJFF(c878950Ydx).LIZ);
        C11RO c11ro = C11S5.LIZ;
        return new C19501611Rm(executor);
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.ability.actor.IChatListMultiThreadActor
    public final AnonymousClass0956 LIZ(InterfaceC879010Ye3 interfaceC879010Ye3, Function2 function2) {
        return C23250099c.LIZLLL(LJFF(interfaceC879010Ye3).LIZIZ, null, null, function2, 3);
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.ability.actor.IChatListMultiThreadActor
    public final void LIZIZ(InterfaceC879010Ye3 interfaceC879010Ye3, Function0<Unit> function0) {
        if (Intrinsics.LJFF(LJ.get(), interfaceC879010Ye3)) {
            function0.invoke();
        } else {
            LIZ(interfaceC879010Ye3, new C058M(function0, null));
        }
    }
}
