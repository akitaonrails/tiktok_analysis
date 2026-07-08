package defpackage;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0HAW;
import X.C0NE4;
import X.C155000ia;
import X.C590350NDl;
import X.C590710NEv;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.localcache.database.HistoryVideoInfoStruct;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "ColdCachePoolSortWrapper$sortUnConsumedCache$1", f = "ColdCachePoolSortWrapper.kt", l = {}, m = "invokeSuspend")
public final class a1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ArrayList<C590350NDl> LL;
    public final /* synthetic */ Function1<C0HAW, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a1(ArrayList<C590350NDl> arrayList, Function1<? super C0HAW, Unit> function1, InterfaceC1364105Vn<? super a1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = arrayList;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new a1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.size() <= 1) {
            return Unit.LIZ;
        }
        CopyOnWriteArrayList<HistoryVideoInfoStruct> copyOnWriteArrayList = z0.LIZJ;
        if (copyOnWriteArrayList.size() < z0.LIZLLL) {
            z0.LIZ.LIZ();
        }
        System.currentTimeMillis();
        z0.LIZ.LJ(C0NE4.UNCONSUMED_CACHE, new C590710NEv(this.LL, new ArrayList(copyOnWriteArrayList)), this.LLILLJJLI);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
