package com.bytedance.android.livesdk.shorttouch.service;

import X.AbstractC1098830ehV;
import X.C1083740eJA;
import X.C1101750emD;
import X.C1101820emK;
import X.C1161920gLG;
import X.InterfaceC1085330eLj;
import X.InterfaceC1098840ehW;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.shorttouch.service.ShortTouchService$simpleCreateView$1;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class ShortTouchService$simpleCreateView$1 implements InterfaceC1085330eLj, GenericLifecycleObserver {
    public final AbstractC1098830ehV LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Lifecycle LLILZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @Override // X.InterfaceC1085330eLj
    public final void Ec2() {
        if (!this.LLILLJJLI) {
            this.LL.LJI(this.LLILLL);
        }
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(C1083740eJA.LIZ(this));
        if (c1101820emKLIZIZ != null) {
            c1101820emKLIZIZ.LJIIL = 1;
        }
        Lifecycle lifecycle = this.LLILZ;
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // X.InterfaceC1085330eLj
    public final void LJLJL() {
        this.LL.LJIIIZ();
    }

    @Override // X.InterfaceC1085330eLj
    public final void LLLZI() {
        if (this.LLILLJJLI) {
            this.LL.LJI(this.LLILLL);
        }
    }

    @Override // X.InterfaceC1085330eLj
    public final void Pl() {
        Lifecycle lifecycle = this.LLILZ;
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        }
    }

    @Override // X.InterfaceC1085330eLj
    public final String dT1() {
        return this.LL.getCardContainerId();
    }

    @Override // X.InterfaceC1085330eLj
    public final String mP0() {
        return this.LL.getName();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LL.LJII();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LL.LJIIIIZZ();
    }

    @Override // X.InterfaceC1085330eLj
    public final String Sr() {
        return C1083740eJA.LIZ(this);
    }

    @Override // X.InterfaceC1085330eLj
    public final View LLLILZJ() {
        return this.LL;
    }

    @Override // X.InterfaceC1085330eLj
    public final void kk0(Map<String, String> map) {
        this.LL.LJFF(map);
    }

    @Override // X.InterfaceC1085330eLj
    public final void JG1(String str, JSONObject jSONObject) {
        this.LL.LJIIJ(str, jSONObject);
    }

    public ShortTouchService$simpleCreateView$1(Context context, Uri uri, Lifecycle lifecycle, String str, String str2, boolean z) {
        this.LLILLJJLI = z;
        this.LLILLL = str2;
        this.LLILZ = lifecycle;
        AbstractC1098830ehV abstractC1098830ehVVc1 = ((IBrowserService) C1161920gLG.LIZJ(IBrowserService.class)).vc1(uri, str, context);
        abstractC1098830ehVVc1.setLoadCallback(new InterfaceC1098840ehW() { // from class: X.0eha
            public long LIZ = System.currentTimeMillis();

            @Override // X.InterfaceC1098840ehW
            public final void LJJIZ() {
                ShortTouchService$simpleCreateView$1 shortTouchService$simpleCreateView$1 = this.LIZIZ;
                shortTouchService$simpleCreateView$1.getClass();
                C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(C1083740eJA.LIZ(shortTouchService$simpleCreateView$1));
                if (c1101820emKLIZIZ != null) {
                    c1101820emKLIZIZ.LJIIIZ = System.currentTimeMillis() - this.LIZ;
                }
            }

            @Override // X.InterfaceC1098840ehW
            public final void LIZ() {
                this.LIZ = System.currentTimeMillis();
            }

            @Override // X.InterfaceC1098840ehW
            public final void LIZIZ(String str3) {
                ShortTouchService$simpleCreateView$1 shortTouchService$simpleCreateView$1 = this.LIZIZ;
                shortTouchService$simpleCreateView$1.getClass();
                C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(C1083740eJA.LIZ(shortTouchService$simpleCreateView$1));
                if (c1101820emKLIZIZ != null) {
                    c1101820emKLIZIZ.LJIIIIZZ = 1;
                }
            }
        });
        this.LL = abstractC1098830ehVVc1;
    }
}
