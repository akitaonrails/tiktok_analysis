package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C01GW;
import X.C1051660dTQ;
import X.C1063990dnJ;
import X.C1388190mED;
import X.C1389890mGx;
import X.C21566519ah;
import X.C21566919al;
import X.C2230608oa;
import X.C452501pT;
import X.C663340Q0e;
import X.EnumC663360Q0g;
import X.InterfaceC1019840ce6;
import X.InterfaceC1051470dT7;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class FollowPACheckMethod extends BaseBridgeMethod {
    public final C663340Q0e helper;
    public final C01GW mContextProvider$delegate;
    public final String name;
    public static final C1063990dnJ Companion = new Object() { // from class: X.0dnJ
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final InterfaceC1051470dT7<Context> getMContextProvider() {
        return (InterfaceC1051470dT7) this.mContextProvider$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public FollowPACheckMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.mContextProvider$delegate = C452501pT.LIZIZ(new AwS560S0100000_16(c1051660dTQ, 570));
        this.name = "followPACheckMethod";
        this.helper = new C663340Q0e(c1051660dTQ, getName(), EnumC663360Q0g.STABLE);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        InterfaceC1051470dT7<Context> mContextProvider;
        Context contextLIZ;
        Activity activityLIZ;
        if (!this.helper.LIZ(interfaceC1019840ce6) && (mContextProvider = getMContextProvider()) != null && (contextLIZ = mContextProvider.LIZ()) != null && (activityLIZ = C1388190mED.LIZ(contextLIZ)) != null) {
            C2230608oa<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
            Integer numLIZ = privacyAccountFollowCount.LIZ();
            if (numLIZ != null && numLIZ.intValue() == 0) {
                C21566919al c21566919al = new C21566919al(activityLIZ);
                c21566919al.LIZ(2131845226);
                c21566919al.LJIIJ(2131835646, null, false);
                new C21566519ah(c21566919al).LIZLLL();
            } else if (numLIZ.intValue() >= 1 && numLIZ.intValue() < 4) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131845227);
                c1389890mGx.LJIIJJI();
            }
            privacyAccountFollowCount.LJ(Integer.valueOf(numLIZ.intValue() + 1));
        }
    }
}
