package com.ss.android.ugc.aweme.influencer.ecommercelive.common.service;

import X.C1051660dTQ;
import X.C2203531BLz;
import X.InterfaceC1051730dTX;
import X.InterfaceC1051760dTa;
import android.content.Context;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface IECommerceLiveBridgeService {
    Map<String, InterfaceC1051760dTa> LIZ(C2203531BLz c2203531BLz, WeakReference<Context> weakReference);

    void LIZIZ(String str, JSONObject jSONObject);

    Map<String, Class<?>> LIZJ();

    InterfaceC1051730dTX LIZLLL(C1051660dTQ c1051660dTQ, String str);

    InterfaceC1051760dTa LJ(C2203531BLz c2203531BLz, WeakReference<Context> weakReference, String str);

    InterfaceC1051760dTa LJFF(String str, WeakReference weakReference, IESJsBridge iESJsBridge);
}
