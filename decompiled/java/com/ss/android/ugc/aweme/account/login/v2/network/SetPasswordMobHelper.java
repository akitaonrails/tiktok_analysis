package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C01GW;
import X.C11NJ;
import X.C11S5;
import X.C11SU;
import X.C1489320orK;
import X.C1701940uOG;
import X.C19475711Hn;
import X.C452501pT;
import X.EnumC1489220orA;
import X.InterfaceC626120Oh8;
import X.InterfaceC852200Xbu;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class SetPasswordMobHelper implements GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public final C11NJ LLILLJJLI = new C11NJ();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(78));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLILLJJLI.LJ();
        this.LL.getLifecycle().removeObserver(this);
    }

    public SetPasswordMobHelper(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public final void LIZ(final boolean z, final String str, final String str2, final String str3, final String str4, final int i, final InterfaceC852200Xbu interfaceC852200Xbu, String str5) {
        this.LL.getLifecycle().addObserver(this);
        ((C1489320orK) this.LLILLL.getValue()).LIZ(str5);
        C11SU<EnumC1489220orA> c11su = ((C1489320orK) this.LLILLL.getValue()).LIZIZ;
        c11su.getClass();
        new C19475711Hn(c11su).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<EnumC1489220orA>() { // from class: X.0Xby
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(EnumC1489220orA enumC1489220orA) {
                String str6;
                Bundle extras;
                String str7;
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                boolean z2 = z;
                String str8 = str;
                String str9 = str2;
                String str10 = str3;
                String str11 = str4;
                int i2 = i;
                InterfaceC852200Xbu interfaceC852200Xbu2 = interfaceC852200Xbu;
                String etValue = enumC1489220orA.getEtValue();
                c852170Xbr.getClass();
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("platform", str8);
                c0xgr.LIZLLL("enter_from", str9);
                c0xgr.LIZLLL("enter_method", str10);
                c0xgr.LIZLLL("login_panel_type", str11);
                c0xgr.LIZ(z2 ? 1 : 0, "is_success");
                if (z2) {
                    str6 = "success";
                } else {
                    str6 = "fail";
                }
                c0xgr.LIZLLL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str6);
                c0xgr.LIZ(i2, "error_code");
                Object obj = null;
                if (interfaceC852200Xbu2 != null) {
                    extras = interfaceC852200Xbu2.getExtras();
                } else {
                    extras = null;
                }
                Map mapLJI = C852170Xbr.LJI(extras);
                if (mapLJI != null) {
                    obj = mapLJI.get("page");
                }
                if (!(obj instanceof String) || (str7 = (String) obj) == null) {
                    str7 = "";
                }
                c0xgr.LIZLLL("page", str7);
                if (etValue != null) {
                    c0xgr.LIZJ("pw_strength", etValue);
                }
                C20684815ws.LJIILLIIL("set_password_response", c0xgr.LIZ);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL.LLILLJJLI.LIZ(interfaceC420801kM);
            }
        });
    }
}
