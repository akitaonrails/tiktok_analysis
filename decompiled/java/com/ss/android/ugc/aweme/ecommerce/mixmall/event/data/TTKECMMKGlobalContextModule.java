package com.ss.android.ugc.aweme.ecommerce.mixmall.event.data;

import X.C01GW;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13LP;
import X.C1771980wDE;
import X.C189200o6;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C452501pT;
import X.C599770Nfj;
import X.C599800Nfm;
import X.C599820Nfo;
import X.EnumC599450NfD;
import X.EnumC599640NfW;
import X.EnumC599720Nfe;
import X.InterfaceC1063790dmz;
import X.InterfaceC599750Nfh;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.jsbridge.LynxContextModule;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import j27.s;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TTKECMMKGlobalContextModule extends LynxContextModule {
    public static final C599770Nfj Companion = new Object() { // from class: X.0Nfj
    };
    public InterfaceC599750Nfh globalContext;
    public C599800Nfm globalContextWrapper;
    public final Object params;
    public final C01GW schema$delegate;

    private final String getSchema() {
        return (String) this.schema$delegate.getValue();
    }

    @InterfaceC1063790dmz
    public final WritableMap getAllData() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/mixmall/event/data/TTKECMMKGlobalContextModule", "getAllData", this, new Object[0], "com.lynx.react.bridge.WritableMap", new C0WZW(false, "()Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnupZ/9Qq68UzfYq2Kc2o0gb4LhtQsOmgNUE+V1QGxeRZLfTR3kNiz8oBxXgM4LA", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        InterfaceC599750Nfh globalContext = getGlobalContext(EnumC599640NfW.GET_DATA, "get_all_data");
        if (globalContext != null) {
            getExtra();
            JavaOnlyMap javaOnlyMapLIZ = globalContext.LIZ();
            if (javaOnlyMapLIZ != null) {
                return javaOnlyMapLIZ;
            }
        }
        return new JavaOnlyMap();
    }

    private final Map<String, Object> getExtra() {
        String schema = getSchema();
        if (schema == null) {
            schema = "";
        }
        return C2097908Jt.LIZJ(new Pair("schema", schema));
    }

    public final Object getParams() {
        return this.params;
    }

    @InterfaceC1063790dmz
    public final WritableMap getData(ReadableMap readableMap) throws Throwable {
        Iterable iterable;
        InterfaceC599750Nfh globalContext;
        JavaOnlyMap javaOnlyMapLJFF;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/mixmall/event/data/TTKECMMKGlobalContextModule", "getData", this, new Object[]{readableMap}, "com.lynx.react.bridge.WritableMap", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnupZ/9Qq68UzfYq2Kc2o0gb4LhtQsOmgNUE+V1QGxeRZLfTR3kNiz8oBxXgM4LA", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            readableMap = (ReadableMap) obj;
        }
        ReadableArray array = readableMap.getArray("data");
        if ((array instanceof List) && (iterable = (Iterable) array) != null && (globalContext = getGlobalContext(EnumC599640NfW.GET_DATA, iterable)) != null && (javaOnlyMapLJFF = globalContext.LJFF(C13LP.LLIIII(iterable), EnumC599720Nfe.LYNX, getExtra())) != null) {
            return javaOnlyMapLJFF;
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        readableMap.toString();
        Objects.toString(getGlobalContext(EnumC599640NfW.GET_DATA, ""));
        C599820Nfo.LJ(c599820Nfo);
        return new JavaOnlyMap();
    }

    @InterfaceC1063790dmz
    public final String registerDataObserver(String str) throws Throwable {
        String strLIZIZ;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/mixmall/event/data/TTKECMMKGlobalContextModule", "registerDataObserver", this, new Object[]{str}, "java.lang.String", new C0WZW(false, "(Ljava/lang/String;)Ljava/lang/String;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnupZ/9Qq68UzfYq2Kc2o0gb4LhtQsOmgNUE+V1QGxeRZLfTR3kNiz8oBxXgM4LA", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        InterfaceC599750Nfh globalContext = getGlobalContext(EnumC599640NfW.OBSERVER_DATA, str);
        if (globalContext == null || (strLIZIZ = globalContext.LIZIZ(str, this.mLynxContext.LJIILJJIL(), EnumC599720Nfe.LYNX, getExtra())) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return strLIZIZ;
    }

    @InterfaceC1063790dmz
    public final boolean setData(ReadableMap readableMap) throws Throwable {
        Map map;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/mixmall/event/data/TTKECMMKGlobalContextModule", "setData", this, new Object[]{readableMap}, "boolean", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)Z", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnupZ/9Qq68UzfYq2Kc2o0gb4LhtQsOmgNUE+V1QGxeRZLfTR3kNiz8oBxXgM4LA", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            readableMap = (ReadableMap) obj;
        }
        ReadableMap map2 = readableMap.getMap("data");
        if (map2 == null || !(map2 instanceof Map) || (map = (Map) map2) == null) {
            return false;
        }
        InterfaceC599750Nfh globalContext = getGlobalContext(EnumC599640NfW.SET_DATA, map);
        if (globalContext != null) {
            getExtra();
            globalContext.setData(map);
        }
        return true;
    }

    public TTKECMMKGlobalContextModule(s sVar, Object obj) {
        super(sVar, obj);
        this.params = obj;
        if ((obj instanceof List) && (!((Collection) obj).isEmpty())) {
            Object obj2 = ListProtector.get((List) obj, 0);
            if (obj2 instanceof InterfaceC599750Nfh) {
                this.globalContext = (InterfaceC599750Nfh) ListProtector.get((List) obj, 0);
            } else if (obj2 instanceof C599800Nfm) {
                this.globalContextWrapper = (C599800Nfm) ListProtector.get((List) obj, 0);
            }
        }
        this.schema$delegate = C452501pT.LIZIZ(new AwS553S0100000_9(this, 117));
    }

    private final InterfaceC599750Nfh getGlobalContext(EnumC599640NfW enumC599640NfW, Object obj) {
        Object c098200Yq;
        String strLJJLIIIJ;
        InterfaceC599750Nfh interfaceC599750Nfh = this.globalContext;
        if (interfaceC599750Nfh != null) {
            return interfaceC599750Nfh;
        }
        try {
            if (obj instanceof String) {
                strLJJLIIIJ = (String) obj;
            } else if (obj instanceof List) {
                strLJJLIIIJ = C13LP.LJJLIIIJ((Iterable) obj, ",", null, null, 0, null, null, 62);
            } else if (obj instanceof Map) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(((Map) obj).keySet(), ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = "";
            }
            C1771980wDE.LJFF(enumC599640NfW, EnumC599450NfD.EMPTY_CONTEXT, strLJJLIIIJ, EnumC599720Nfe.LYNX, getExtra());
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GlobalContextModule, getGlobalContext null, operation=");
            sbLIZ.append(enumC599640NfW);
            sbLIZ.append(", data=");
            sbLIZ.append(obj);
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZIZ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("GlobalContextModule, report getGlobalContext null, error=>");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            c599820Nfo2.getClass();
            C599820Nfo.LIZIZ();
            return null;
        }
        return null;
    }

    @InterfaceC1063790dmz
    public final boolean unregisterDataObserver(String str, String str2) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/mixmall/event/data/TTKECMMKGlobalContextModule", "unregisterDataObserver", this, new Object[]{str, str2}, "boolean", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)Z", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnupZ/9Qq68UzfYq2Kc2o0gb4LhtQsOmgNUE+V1QGxeRZLfTR3kNiz8oBxXgM4LA", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        InterfaceC599750Nfh globalContext = getGlobalContext(EnumC599640NfW.UNOBSERVER_DATA, str);
        if (globalContext == null) {
            return false;
        }
        return globalContext.LIZJ(str, str2, EnumC599720Nfe.LYNX, getExtra());
    }
}
