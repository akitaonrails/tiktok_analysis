package com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1743460vTE;
import X.C1743560vTO;
import X.C1743580vTQ;
import X.C1752630vi1;
import X.InterfaceC1063790dmz;
import X.InterfaceC1541990qEH;
import X.InterfaceC1743450vTD;
import X.InterfaceC1748810vbr;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpLepusBridgeModule extends LynxModule {
    public final Context context;
    public final C1743580vTQ paramModel;
    public static final C1743560vTO Companion = new Object() { // from class: X.0vTO
    };
    public static final int $stable = 8;

    private final InterfaceC1748810vbr node() {
        return null;
    }

    private final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB view() {
        return null;
    }

    private final InterfaceC1743450vTD viewModel() {
        return null;
    }

    public final Context getContext() {
        return this.context;
    }

    public PdpLepusBridgeModule(Context context, Object obj) {
        C1743580vTQ c1743580vTQ;
        super(context);
        this.context = context;
        if (obj instanceof C1743580vTQ) {
            c1743580vTQ = (C1743580vTQ) obj;
        } else {
            c1743580vTQ = null;
        }
        this.paramModel = c1743580vTQ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC1063790dmz
    public final WritableMap callSync(String str, ReadableMap readableMap) throws Throwable {
        ViewParent parent;
        InterfaceC1541990qEH kitView;
        View viewE1;
        ViewParent parent2;
        View view = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/ss/android/ugc/aweme/ecommerce/base/pdp/jsb/service/PdpLepusBridgeModule", "callSync", this, new Object[]{str, readableMap}, "com.lynx.react.bridge.WritableMap", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LMck702zqtsSSXf267Tp15SGPlf9DpI3AKHTO6ifdcojemieQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                readableMap = (ReadableMap) obj2;
            }
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("code", 1);
        switch (str.hashCode()) {
            case 91242765:
                if (str.equals("ec_page_get_distance")) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBView = view();
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBView != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBView.getKitView()) != null && (viewE1 = kitView.e1()) != null && (parent2 = viewE1.getParent()) != null) {
                        parent = parent2.getParent();
                    } else {
                        parent = null;
                    }
                    if (parent instanceof C1752630vi1) {
                        view = (View) parent;
                    }
                    C1743460vTE c1743460vTELIZJ = ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LIZJ(view);
                    JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                    javaOnlyMap2.put("is_bottom", Boolean.valueOf(c1743460vTELIZJ.LIZ));
                    javaOnlyMap2.put("distance", Integer.valueOf(c1743460vTELIZJ.LIZIZ));
                    javaOnlyMap.put("data", javaOnlyMap2);
                    return javaOnlyMap;
                }
                return javaOnlyMap;
            case 266463344:
                if (str.equals("ec_fetch_item_data")) {
                    String strLIZ = ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LIZ(viewModel(), readableMap.getInt("brick_name"));
                    JavaOnlyMap javaOnlyMap3 = new JavaOnlyMap();
                    javaOnlyMap3.put("raw_data", strLIZ);
                    javaOnlyMap.put("data", javaOnlyMap3);
                    return javaOnlyMap;
                }
                return javaOnlyMap;
            case 813019925:
                if (str.equals("ec_open_schema")) {
                    ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LIZIZ(node(), this.context, readableMap.getString("schema"), readableMap.getMap("params").toHashMap());
                    return javaOnlyMap;
                }
                return javaOnlyMap;
            case 1278371700:
                if (str.equals("ec_refresh_page")) {
                    ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LJFF(viewModel());
                    return javaOnlyMap;
                }
                return javaOnlyMap;
            case 1564484234:
                if (str.equals("ec_send_page_log")) {
                    ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LJ(node(), readableMap.getString("eventName"), readableMap.getMap("params").toHashMap());
                    return javaOnlyMap;
                }
                return javaOnlyMap;
            case 1571971608:
                if (str.equals("ec_fetch_common_data")) {
                    HashMap<String, Object> mapLIZLLL = ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LIZLLL(node());
                    JavaOnlyMap javaOnlyMap4 = new JavaOnlyMap();
                    javaOnlyMap4.put("data", mapLIZLLL);
                    javaOnlyMap.put("data", javaOnlyMap4);
                    return javaOnlyMap;
                }
                return javaOnlyMap;
            default:
                return javaOnlyMap;
        }
    }
}
