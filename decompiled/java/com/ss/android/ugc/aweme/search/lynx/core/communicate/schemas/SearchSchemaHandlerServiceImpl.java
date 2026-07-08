package com.ss.android.ugc.aweme.search.lynx.core.communicate.schemas;

import X.C2097608Jq;
import X.InterfaceC663520Q0w;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSchemaHandlerServiceImpl implements ISchemaHandlerService {
    public static final Map<String, Function0<InterfaceC663520Q0w>> LIZ = C2097608Jq.LJIIJ(new Pair("enterMixInnerFlow", AFwS196S0000000_10.get$arr$(201)), new Pair("enterVideoInnerFlow", AFwS196S0000000_10.get$arr$(202)), new Pair("enterLiveInnerFlow", AFwS196S0000000_10.get$arr$(203)), new Pair("openSheetPanel", AFwS196S0000000_10.get$arr$(204)), new Pair("enterImageViewer", AFwS196S0000000_10.get$arr$(205)), new Pair("adEnterMixInnerFlow", AFwS196S0000000_10.get$arr$(206)), new Pair("openGooglePlay", AFwS196S0000000_10.get$arr$(207)), new Pair("enterDramaInnerFlowAction", AFwS196S0000000_10.get$arr$(208)));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.lynx.core.communicate.schemas.ISchemaHandlerService
    public final HashMap<String, InterfaceC663520Q0w> LIZIZ() {
        HashMap<String, InterfaceC663520Q0w> map = new HashMap<>();
        for (Map.Entry entry : ((LinkedHashMap) LIZ).entrySet()) {
            map.put(entry.getKey(), ((Function0) entry.getValue()).invoke());
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.core.communicate.schemas.ISchemaHandlerService
    public final InterfaceC663520Q0w LIZ(String str) {
        Function0 function0;
        if (str == null || (function0 = (Function0) ((LinkedHashMap) LIZ).get(str)) == null) {
            return null;
        }
        return (InterfaceC663520Q0w) function0.invoke();
    }
}
