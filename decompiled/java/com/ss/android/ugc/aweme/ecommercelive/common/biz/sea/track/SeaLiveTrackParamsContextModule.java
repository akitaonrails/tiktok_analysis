package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.track;

import X.C01GW;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13LP;
import X.C189200o6;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C452501pT;
import X.C599410Nf9;
import X.C599680Nfa;
import X.C599730Nff;
import X.C599810Nfn;
import X.EnumC599400Nf8;
import X.EnumC599420NfA;
import X.EnumC599440NfC;
import X.InterfaceC1063790dmz;
import X.InterfaceC599460NfE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.jsbridge.LynxContextModule;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import j27.s;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class SeaLiveTrackParamsContextModule extends LynxContextModule {
    public static final C599730Nff Companion = new Object() { // from class: X.0Nff
    };
    public final C01GW schema$delegate;
    public ISeaLiveContextAbility seaLiveContextAbility;

    private final WritableMap getAllTrackParams() {
        Map<String, Object> trackParams;
        InterfaceC599460NfE context = getContext(EnumC599420NfA.GET_TRACK_PARAMS, null);
        return (context == null || (trackParams = context.getTrackParams()) == null) ? new JavaOnlyMap() : !(trackParams instanceof JavaOnlyMap) ? JavaOnlyMap.from(trackParams) : (WritableMap) trackParams;
    }

    private final String getSchema() {
        return (String) this.schema$delegate.getValue();
    }

    private final Map<String, Object> getExtra() {
        String schema = getSchema();
        if (schema == null) {
            schema = "";
        }
        return C2097908Jt.LIZJ(new Pair("schema", schema));
    }

    @InterfaceC1063790dmz
    public final WritableMap getTrackParams(ReadableMap readableMap) throws Throwable {
        Map map;
        Map<String, Object> mapLIZIZ;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommercelive/common/biz/sea/track/SeaLiveTrackParamsContextModule", "getTrackParams", this, new Object[]{readableMap}, "com.lynx.react.bridge.WritableMap", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodjmteOITqawVjvwyk6srywMVkthib2x6Ga3U6JyEYEwFNfCkO06JXCpTQtrDwa4Hox3EOt4kwfNSJQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            readableMap = (ReadableMap) obj;
        }
        ReadableMap map2 = readableMap.getMap("data");
        if (map2 != null && (map2 instanceof Map) && (map = (Map) map2) != null) {
            InterfaceC599460NfE context = getContext(EnumC599420NfA.GET_TRACK_PARAMS, map);
            if (context != null && (mapLIZIZ = context.LIZIZ(C13LP.LLIIII(map.keySet()))) != null) {
                if (!(mapLIZIZ instanceof JavaOnlyMap)) {
                    return JavaOnlyMap.from(mapLIZIZ);
                }
                return (WritableMap) mapLIZIZ;
            }
            return getAllTrackParams();
        }
        return getAllTrackParams();
    }

    @InterfaceC1063790dmz
    public final void putTrackParams(ReadableMap readableMap) throws Throwable {
        Map map;
        Object objLIZ;
        InterfaceC599460NfE context;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommercelive/common/biz/sea/track/SeaLiveTrackParamsContextModule", "putTrackParams", this, new Object[]{readableMap}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodjmteOITqawVjvwyk6srywMVkthib2x6Ga3U6JyEYEwFNfCkO06JXCpTQtrDwa4Hox3EOt4kwfNSJQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            readableMap = (ReadableMap) obj;
        }
        ReadableMap map2 = readableMap.getMap("data");
        if (map2 != null && (map2 instanceof Map) && (map = (Map) map2) != null) {
            for (Map.Entry entry : map.entrySet()) {
                ISeaLiveContextAbility iSeaLiveContextAbility = this.seaLiveContextAbility;
                if (iSeaLiveContextAbility != null && (objLIZ = C599680Nfa.LIZ(iSeaLiveContextAbility.MF(), (String) entry.getKey(), entry.getValue(), null, null)) != null && (context = getContext(EnumC599420NfA.PUT_TRACK_PARAMS, map)) != null) {
                    context.LIZ(objLIZ, (String) entry.getKey());
                }
            }
        }
    }

    public SeaLiveTrackParamsContextModule(s sVar, Object obj) {
        ISeaLiveContextAbility iSeaLiveContextAbility;
        super(sVar, obj);
        if ((obj instanceof List) && (!((Collection) obj).isEmpty())) {
            List list = (List) obj;
            if (ListProtector.get(list, 0) instanceof ISeaLiveContextAbility) {
                Object obj2 = ListProtector.get(list, 0);
                if (obj2 instanceof ISeaLiveContextAbility) {
                    iSeaLiveContextAbility = (ISeaLiveContextAbility) obj2;
                } else {
                    iSeaLiveContextAbility = null;
                }
                this.seaLiveContextAbility = iSeaLiveContextAbility;
            }
        }
        this.schema$delegate = C452501pT.LIZIZ(new AwS553S0100000_9(this, 120));
    }

    private final InterfaceC599460NfE getContext(EnumC599420NfA enumC599420NfA, Object obj) {
        Object c098200Yq;
        String strLJJLIIIJ;
        C599410Nf9 c599410Nf9Cu2;
        InterfaceC599460NfE interfaceC599460NfEHW1;
        ISeaLiveContextAbility iSeaLiveContextAbility = this.seaLiveContextAbility;
        if (iSeaLiveContextAbility != null && (interfaceC599460NfEHW1 = iSeaLiveContextAbility.hW1()) != null) {
            return interfaceC599460NfEHW1;
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
            ISeaLiveContextAbility iSeaLiveContextAbility2 = this.seaLiveContextAbility;
            if (iSeaLiveContextAbility2 != null && (c599410Nf9Cu2 = iSeaLiveContextAbility2.cu2()) != null) {
                c599410Nf9Cu2.LIZ(enumC599420NfA, EnumC599440NfC.EMPTY_CONTEXT, strLJJLIIIJ, EnumC599400Nf8.LYNX, getExtra());
            }
            C599810Nfn c599810Nfn = C599810Nfn.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SeaContentContextModule, getContext null, operation=");
            sbLIZ.append(enumC599420NfA);
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
            sbLIZ2.append("SeaContentContextModule, report getContext null, error=>");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            C599810Nfn.LIZIZ(c599810Nfn2);
            return null;
        }
        return null;
    }
}
