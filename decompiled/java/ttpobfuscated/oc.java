package ttpobfuscated;

import X.AbstractC23273099z;
import X.AbstractC842510X3h;
import X.C098200Yq;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C13LE;
import X.C1500770p9n;
import X.C155000ia;
import X.C189200o6;
import X.C1C7U;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.app.domain.usecase.TTPError;
import ttp.orbu.sdk.app.domain.usecase.TTPResult;
import ttp.orbu.sdk.constants.TTPErrorCode;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class oc implements w9 {
    public final String a = C13LE.LIZ(oc.class).LJI();

    /* JADX INFO: Add missing generic type declarations: [DATA] */
    @C09DV(c = "ttp.orbu.sdk.network.RetrofitNetworkManager$execute$2", f = "RetrofitNetworkManager.kt", l = {23}, m = "invokeSuspend")
    public final class a<DATA> extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TTPResult<DATA>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function1<InterfaceC1364105Vn<? super C1500770p9n<DATA>>, Object> c;
        public final /* synthetic */ oc d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object c098200Yq;
            oc ocVar;
            String strString;
            C1C7U.LIZ("oc@1125.a$1");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            String str = "";
            try {
                if (i != 0) {
                    if (i == 1) {
                        ocVar = (oc) this.b;
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    Function1<InterfaceC1364105Vn<? super C1500770p9n<DATA>>, Object> function1 = this.c;
                    ocVar = this.d;
                    this.b = ocVar;
                    this.a = 1;
                    obj = function1.invoke(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("oc@1125.a$1");
                        return objLJFF;
                    }
                }
                C1500770p9n c1500770p9n = (C1500770p9n) obj;
                TreeMap treeMap = (TreeMap) c1500770p9n.LIZ.LLILZLL.LJIIIZ();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(treeMap.size()));
                for (Object obj2 : treeMap.entrySet()) {
                    linkedHashMap.put(((String) ((Map.Entry) obj2).getKey()).toLowerCase(Locale.ROOT), ((Map.Entry) obj2).getValue());
                }
                if (c1500770p9n.LIZ()) {
                    T t = c1500770p9n.LIZIZ;
                    if (t != 0) {
                        c098200Yq = new TTPResult.b(t, linkedHashMap);
                    } else {
                        c098200Yq = new TTPResult.a(new TTPError(TTPErrorCode.Unknown, ""), null);
                    }
                    q3.a aVar = q3.a;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Network executed with result: ");
                    sbLIZ.append(c098200Yq);
                    sbLIZ.append(" and response ");
                    sbLIZ.append(c1500770p9n);
                    q3.b.c(aVar, C2188811AlT.LIZIZ(sbLIZ), ocVar.a, null, 4, null);
                } else {
                    q3.a aVar2 = q3.a;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Network error: ");
                    sbLIZ2.append(c1500770p9n);
                    q3.b.b(aVar2, C2188811AlT.LIZIZ(sbLIZ2), ocVar.a, null, 4, null);
                    TTPErrorCode tTPErrorCodeA = TTPErrorCode.Companion.a(c1500770p9n.LIZ.LLILLL);
                    AbstractC842510X3h abstractC842510X3h = c1500770p9n.LIZJ;
                    if (abstractC842510X3h != null) {
                        strString = abstractC842510X3h.string();
                    } else {
                        strString = null;
                    }
                    if (strString == null) {
                        strString = "";
                    }
                    c098200Yq = new TTPResult.a(new TTPError(tTPErrorCodeA, strString), linkedHashMap);
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            oc ocVar2 = this.d;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                if (thM5exceptionOrNullimpl instanceof UnknownHostException) {
                    q3.a aVar3 = q3.a;
                    String str2 = ocVar2.a;
                    aVar3.getClass();
                    q3.a.c.b("Network error UnknownHostException:", str2, thM5exceptionOrNullimpl);
                    TTPErrorCode tTPErrorCode = TTPErrorCode.UnknownHostException;
                    String message = thM5exceptionOrNullimpl.getMessage();
                    if (message != null) {
                        str = message;
                    }
                    c098200Yq = new TTPResult.a(new TTPError(tTPErrorCode, str), null);
                } else if (thM5exceptionOrNullimpl instanceof IOException) {
                    q3.a aVar4 = q3.a;
                    String str3 = ocVar2.a;
                    aVar4.getClass();
                    q3.a.c.b("Network error IOException:", str3, thM5exceptionOrNullimpl);
                    TTPErrorCode tTPErrorCode2 = TTPErrorCode.IOException;
                    String message2 = thM5exceptionOrNullimpl.getMessage();
                    if (message2 != null) {
                        str = message2;
                    }
                    c098200Yq = new TTPResult.a(new TTPError(tTPErrorCode2, str), null);
                } else {
                    q3.a aVar5 = q3.a;
                    String str4 = ocVar2.a;
                    aVar5.getClass();
                    q3.a.c.b("Network error Exception:", str4, thM5exceptionOrNullimpl);
                    TTPErrorCode tTPErrorCode3 = TTPErrorCode.Exception;
                    String message3 = thM5exceptionOrNullimpl.getMessage();
                    if (message3 != null) {
                        str = message3;
                    }
                    c098200Yq = new TTPResult.a(new TTPError(tTPErrorCode3, str), null);
                }
            }
            C1C7U.LIZIZ("oc@1125.a$1");
            return c098200Yq;
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TTPResult<DATA>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            a aVar = new a(this.c, this.d, interfaceC1364105Vn);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, Object obj) {
            return ((njp.a) create(interfaceC497601wk, (InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super InterfaceC1364105Vn<? super C1500770p9n<DATA>>, ? extends Object> function1, oc ocVar, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.c = function1;
            this.d = ocVar;
        }
    }

    @Override // ttpobfuscated.w9
    public <DATA> Object a(Function1<? super InterfaceC1364105Vn<? super C1500770p9n<DATA>>, ? extends Object> function1, InterfaceC1364105Vn<? super TTPResult<DATA>> interfaceC1364105Vn) {
        bf.a.getClass();
        return C23250099c.LJI(interfaceC1364105Vn, (AbstractC23273099z) bf.b.getValue(), new a(function1, this, null));
    }
}
