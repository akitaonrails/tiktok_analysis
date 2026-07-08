package com.ss.android.ugc.aweme.ecommerce.content.sea.datacontext;

import X.C01GW;
import X.C034S;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1120604Zw;
import X.C13LP;
import X.C189200o6;
import X.C1AQS;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C452501pT;
import X.C599380Nf6;
import X.C599760Nfi;
import X.C599810Nfn;
import X.EnumC599400Nf8;
import X.EnumC599440NfC;
import X.EnumC599630NfV;
import X.InterfaceC1063790dmz;
import X.InterfaceC599740Nfg;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.jsbridge.LynxContextModule;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import j27.s;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class SeaContentStateContextModule extends LynxContextModule {
    public static final C599760Nfi Companion = new Object() { // from class: X.0Nfi
    };
    public final Object params;
    public final C01GW schema$delegate;
    public C599380Nf6 seaContentAlarmReporter;
    public InterfaceC599740Nfg seaContentStateContext;

    private final String getSchema() {
        return (String) this.schema$delegate.getValue();
    }

    @InterfaceC1063790dmz
    public final WritableMap getAllData() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/content/sea/datacontext/SeaContentStateContextModule", "getAllData", this, new Object[0], "com.lynx.react.bridge.WritableMap", new C0WZW(false, "()Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYelJr60MzeA53OcmOXP2HfHwRFPMt3VuXHCQ4FTtATM6LRF5hmcUZy7tBG0vMENLRtk0", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        InterfaceC599740Nfg stateContext = getStateContext(EnumC599630NfV.GET_DATA, "get_all_data");
        if (stateContext != null) {
            getExtra();
            JavaOnlyMap javaOnlyMapLIZ = stateContext.LIZ();
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
        IECommerceHostService iECommerceHostService;
        boolean z;
        Iterable iterable;
        InterfaceC599740Nfg stateContext;
        JavaOnlyMap javaOnlyMapLJ;
        Object obj;
        ReadableMap readableMap2 = readableMap;
        String name = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/content/sea/datacontext/SeaContentStateContextModule", "getData", this, new Object[]{readableMap2}, "com.lynx.react.bridge.WritableMap", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYelJr60MzeA53OcmOXP2HfHwRFPMt3VuXHCQ4FTtATM6LRF5hmcUZy7tBG0vMENLRtk0", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            readableMap2 = (ReadableMap) obj;
        }
        ReadableArray array = readableMap2.getArray("data");
        if ((array instanceof List) && (iterable = (Iterable) array) != null && (stateContext = getStateContext(EnumC599630NfV.GET_DATA, iterable)) != null && (javaOnlyMapLJ = stateContext.LJ(C13LP.LLIIII(iterable), EnumC599400Nf8.LYNX, getExtra())) != null) {
            return javaOnlyMapLJ;
        }
        C599810Nfn c599810Nfn = C599810Nfn.LIZ;
        readableMap2.toString();
        Objects.toString(getStateContext(EnumC599630NfV.GET_DATA, ""));
        c599810Nfn.getClass();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        ((IApplicationDependencyService) iECommerceHostService).isLocalTest();
        return new JavaOnlyMap();
    }

    @InterfaceC1063790dmz
    public final String registerDataObserver(String str) throws Throwable {
        String strLJFF;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/content/sea/datacontext/SeaContentStateContextModule", "registerDataObserver", this, new Object[]{str}, "java.lang.String", new C0WZW(false, "(Ljava/lang/String;)Ljava/lang/String;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYelJr60MzeA53OcmOXP2HfHwRFPMt3VuXHCQ4FTtATM6LRF5hmcUZy7tBG0vMENLRtk0", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        InterfaceC599740Nfg stateContext = getStateContext(EnumC599630NfV.OBSERVER_DATA, str);
        if (stateContext == null || (strLJFF = stateContext.LJFF(str, this.mLynxContext.LJIILJJIL(), EnumC599400Nf8.LYNX, getExtra())) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return strLJFF;
    }

    @InterfaceC1063790dmz
    public final boolean setData(ReadableMap readableMap) throws Throwable {
        Map map;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/content/sea/datacontext/SeaContentStateContextModule", "setData", this, new Object[]{readableMap}, "boolean", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)Z", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYelJr60MzeA53OcmOXP2HfHwRFPMt3VuXHCQ4FTtATM6LRF5hmcUZy7tBG0vMENLRtk0", null)));
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
        InterfaceC599740Nfg stateContext = getStateContext(EnumC599630NfV.SET_DATA, map);
        if (stateContext != null) {
            getExtra();
            stateContext.setData(map);
        }
        return true;
    }

    public SeaContentStateContextModule(s sVar, Object obj) {
        InterfaceC599740Nfg interfaceC599740Nfg;
        super(sVar, obj);
        this.params = obj;
        if ((obj instanceof List) && (!((Collection) obj).isEmpty())) {
            Object obj2 = ListProtector.get((List) obj, 0);
            if (obj2 instanceof InterfaceC599740Nfg) {
                interfaceC599740Nfg = (InterfaceC599740Nfg) obj2;
            } else {
                interfaceC599740Nfg = null;
            }
            this.seaContentStateContext = interfaceC599740Nfg;
            Object obj3 = ListProtector.get((List) obj, 1);
            this.seaContentAlarmReporter = obj3 instanceof C599380Nf6 ? (C599380Nf6) obj3 : null;
        }
        this.schema$delegate = C452501pT.LIZIZ(new AwS553S0100000_9(this, 114));
    }

    private final InterfaceC599740Nfg getStateContext(EnumC599630NfV enumC599630NfV, Object obj) {
        Object c098200Yq;
        String strLJJLIIIJ;
        InterfaceC599740Nfg interfaceC599740Nfg = this.seaContentStateContext;
        if (interfaceC599740Nfg != null) {
            return interfaceC599740Nfg;
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
            C599380Nf6 c599380Nf6 = this.seaContentAlarmReporter;
            if (c599380Nf6 != null) {
                c599380Nf6.LJ(enumC599630NfV, EnumC599440NfC.EMPTY_CONTEXT, strLJJLIIIJ, EnumC599400Nf8.LYNX, getExtra());
            }
            C599810Nfn c599810Nfn = C599810Nfn.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SeaContentContextModule, getGlobalContext null, operation=");
            sbLIZ.append(enumC599630NfV);
            sbLIZ.append(", data=");
            sbLIZ.append(obj);
            C2188811AlT.LIZIZ(sbLIZ);
            C599810Nfn.LIZIZ(c599810Nfn);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C599810Nfn c599810Nfn2 = C599810Nfn.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SeaContentContextModule, report getGlobalContext null, error=>");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            C599810Nfn.LIZIZ(c599810Nfn2);
            return null;
        }
        return null;
    }

    @InterfaceC1063790dmz
    public final boolean unregisterDataObserver(String str, String str2) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/content/sea/datacontext/SeaContentStateContextModule", "unregisterDataObserver", this, new Object[]{str, str2}, "boolean", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)Z", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYelJr60MzeA53OcmOXP2HfHwRFPMt3VuXHCQ4FTtATM6LRF5hmcUZy7tBG0vMENLRtk0", null)));
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
        InterfaceC599740Nfg stateContext = getStateContext(EnumC599630NfV.UNOBSERVER_DATA, str);
        if (stateContext == null) {
            return false;
        }
        return stateContext.LIZJ(str, str2, EnumC599400Nf8.LYNX, getExtra());
    }
}
