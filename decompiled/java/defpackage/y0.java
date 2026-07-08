package defpackage;

import X.C098200Yq;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C1227904rF;
import X.C155000ia;
import X.C189200o6;
import X.C2286608xc;
import X.C590420NDs;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localcache.database.HistoryVideoInfoStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "ColdCachePoolSortWrapper$historyVideoOnPlayStop$1", f = "ColdCachePoolSortWrapper.kt", l = {}, m = "invokeSuspend")
public final class y0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Aweme aweme, int i, long j, int i2, InterfaceC1364105Vn<? super y0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new y0(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        System.currentTimeMillis();
        HistoryVideoInfoStruct historyVideoInfoStruct = new HistoryVideoInfoStruct(this.LL.getAid(), this.LL, this.LLILLJJLI, this.LLILLL, C2286608xc.LJ(this.LLILZ));
        CopyOnWriteArrayList<HistoryVideoInfoStruct> copyOnWriteArrayList = z0.LIZJ;
        copyOnWriteArrayList.add(0, historyVideoInfoStruct);
        z0.LIZ.LIZIZ();
        int i = z0.LJIIIZ;
        int i2 = z0.LJ;
        if (1 <= i2 && i2 <= i) {
            C590420NDs.LIZ.getClass();
            C1227904rF.LIZ.getClass();
            Gson gsonLJ = C1227904rF.LJ();
            Keva kevaLJI = C590420NDs.LJI();
            ArrayList arrayList = new ArrayList();
            Iterator<HistoryVideoInfoStruct> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                try {
                    c098200Yq = gsonLJ.LJIILL(it2.next());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
                    arrayList.add(c098200Yq);
                }
            }
            kevaLJI.storeStringArray("key_history_video_info", (String[]) arrayList.toArray(new String[0]));
            z0 z0Var = z0.LIZ;
            z0.LJIIIZ = 0;
        }
        z0.LJIIIZ++;
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
