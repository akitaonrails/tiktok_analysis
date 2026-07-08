package defpackage;

import X.AbstractC2238408pq;
import X.AnonymousClass0956;
import X.AnonymousClass0958;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C09JN;
import X.C0J7M;
import X.C0PEM;
import X.C0T6L;
import X.C11S5;
import X.C13LP;
import X.C15438062q;
import X.C155000ia;
import X.C1701940uOG;
import X.C1DFH;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344809Gs;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.util.Log;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class l9 {
    public final CopyOnWriteArrayList<String> LIZ = new CopyOnWriteArrayList<>();
    public AnonymousClass0956 LIZIZ;
    public final LiveStateApi LIZJ;
    public AwS586S0100000_7 LIZLLL;

    public static final class a {
    }

    public l9() {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(Live.getLiveDomain());
        this.LIZJ = (LiveStateApi) iRetrofitService.createNewRetrofit(C2188811AlT.LIZIZ(sbLIZ)).create(LiveStateApi.class);
    }

    public final void LIZ() {
        boolean zLJI = MethodIDManager.LJI(138011);
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C0T6L.LIZIZ(this.LIZ), ",", null, null, 0, null, null, 62);
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.LIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        Iterator<String> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), null);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        this.LIZ.clear();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start request, paramStr: ");
        sbLIZ.append(strLJJLIIIJ);
        C0J7M.LIZ("UserLiveRoomApiManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ.liveStates(strLJJLIIIJ, "tiktok_inbox_head").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new b(linkedHashMap2), c.LL);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @C09DV(c = "UserLiveRoomApiManager$updateRoomId$1", f = "UserLiveRoomApiManager.kt", l = {48, 49}, m = "invokeSuspend")
    public final class d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int LL;

        public d(InterfaceC1364105Vn<? super d> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return l9.this.new d(interfaceC1364105Vn);
        }

        @C09DV(c = "UserLiveRoomApiManager$updateRoomId$1$1", f = "UserLiveRoomApiManager.kt", l = {}, m = "invokeSuspend")
        public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public final /* synthetic */ l9 LL;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l9 l9Var, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.LL = l9Var;
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new a(this.LL, interfaceC1364105Vn);
            }

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                C099R.LJFF();
                C155000ia.LIZIZ(obj);
                C0J7M.LIZIZ("UserLiveRoomApiManager", "start request internet, because timeout");
                this.LL.LIZ();
                return Unit.LIZ;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
            }
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object objLJFF = C099R.LJFF();
            int i = this.LL;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                        return Unit.LIZ;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                    return objLJFF;
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            a aVar = new a(l9.this, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, aVar) == objLJFF) {
                return objLJFF;
            }
            return Unit.LIZ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    public final class b<T> implements C09JN {
        public final /* synthetic */ Map<String, Long> LLILLJJLI;

        public b(Map<String, Long> map) {
            this.LLILLJJLI = map;
        }

        @Override // X.C09JN
        public final void accept(Object obj) {
            LiveStateResponse.MapUserIdRoomId mapUserIdRoomId;
            Map<Long, Long> mapLIZ;
            LiveStateResponse liveStateResponse = (LiveStateResponse) obj;
            if (liveStateResponse != null && (mapUserIdRoomId = liveStateResponse.mapUserIdRoomId) != null && (mapLIZ = mapUserIdRoomId.LIZ()) != null && (!mapLIZ.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZ.size()));
                Iterator<T> it2 = mapLIZ.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap.put(((Long) entry.getKey()).toString(), entry.getValue());
                }
                Map<String, Long> map = this.LLILLJJLI;
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    map.put((String) entry2.getKey(), (Long) entry2.getValue());
                }
            }
            AwS586S0100000_7 awS586S0100000_7 = l9.this.LIZLLL;
            if (awS586S0100000_7 != null) {
                awS586S0100000_7.invoke(this.LLILLJJLI);
            }
        }
    }

    public final class c<T> implements C09JN {
        public static final c<T> LL = new c<>();

        @Override // X.C09JN
        public final void accept(Object obj) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onResult:");
            sbLIZ.append(Log.getStackTraceString((Throwable) obj));
            C2344809Gs.LJFF("UserLiveRoomDataCenter", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZIZ(String str) {
        this.LIZ.add(str);
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null && !anonymousClass0956.isCompleted()) {
            if (this.LIZ.size() >= 50) {
                AnonymousClass0956 anonymousClass09562 = this.LIZIZ;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                C0J7M.LIZIZ("UserLiveRoomApiManager", "start request internet, because cache is fulled");
                LIZ();
                return;
            }
            return;
        }
        this.LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new d(null), 3);
    }
}
