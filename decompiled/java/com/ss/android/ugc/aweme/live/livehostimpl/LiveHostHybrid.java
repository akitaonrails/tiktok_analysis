package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C08RQ;
import X.C0OU4;
import X.C1051980dTw;
import X.C1062430dkn;
import X.C1529870puj;
import X.C1537480q70;
import X.C1545590qK5;
import X.C2097608Jq;
import X.C21395818oG;
import X.C847400XMc;
import X.InterfaceC1541990qEH;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.ss.android.ugc.aweme.bridge.idlshelling.JSBAIMigrationALLJSBSSettings;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public class LiveHostHybrid implements IHostHybrid {
    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final String bg1() {
        return "99999";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final C1062430dkn B92() {
        C1062430dkn c1062430dkn = new C1062430dkn();
        JSBAIMigrationALLJSBSSettings.JSBAIMigrationALLJSBSModel jSBAIMigrationALLJSBSModelLIZ = JSBAIMigrationALLJSBSSettings.LIZ();
        c1062430dkn.LIZ = jSBAIMigrationALLJSBSModelLIZ.enable;
        c1062430dkn.LIZIZ = jSBAIMigrationALLJSBSModelLIZ.uploadImage;
        c1062430dkn.LIZJ = jSBAIMigrationALLJSBSModelLIZ.downloadMediaToSystem;
        c1062430dkn.LIZLLL = jSBAIMigrationALLJSBSModelLIZ.chooseImage;
        c1062430dkn.LJ = jSBAIMigrationALLJSBSModelLIZ.chooseImageForSub;
        c1062430dkn.LJFF = jSBAIMigrationALLJSBSModelLIZ.editImageForSub;
        return c1062430dkn;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final List<String> TN1() {
        C1537480q70 hybridContext;
        Set<String> setLJIILLIIL;
        ArrayList arrayList = new ArrayList();
        C1529870puj.LIZ.getClass();
        Iterator it2 = ((LinkedHashMap) C1529870puj.LIZJ()).values().iterator();
        while (it2.hasNext()) {
            InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) ((Reference) it2.next()).get();
            if (interfaceC1541990qEH != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null && (setLJIILLIIL = hybridContext.LJIILLIIL()) != null) {
                for (String str : setLJIILLIIL) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final List<String> hv1() {
        C1537480q70 hybridContext;
        ArrayList arrayList = new ArrayList();
        C1529870puj.LIZ.getClass();
        Iterator it2 = ((LinkedHashMap) C1529870puj.LIZJ()).values().iterator();
        while (it2.hasNext()) {
            InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) ((Reference) it2.next()).get();
            if (interfaceC1541990qEH != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null) {
                String str = hybridContext.bid;
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final Object jG1() {
        return new C21395818oG();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final Map<String, String> Wx2(String str) {
        return C847400XMc.LIZJ(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final void k40(String str) {
        String str2 = C08RQ.LIZJ(str).get("__spark_session_id");
        if (str2 != null) {
            C1051980dTw.LIZIZ(str2);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final boolean ki(String str) {
        return C0OU4.LIZ(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final String zF0(String str) {
        return C1545590qK5.LIZIZ.LIZIZ(str, C2097608Jq.LJ());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostHybrid
    public final void prefetchSchema(String str, Context context) {
        ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).prefetchSchema(str, context);
    }
}
