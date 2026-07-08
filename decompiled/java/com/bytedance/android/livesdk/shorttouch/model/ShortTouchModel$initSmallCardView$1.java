package com.bytedance.android.livesdk.shorttouch.model;

import X.AbstractC1098830ehV;
import X.C1083740eJA;
import X.C1100170ejf;
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
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.model.SmallCardInfo;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class ShortTouchModel$initSmallCardView$1 implements InterfaceC1085330eLj, GenericLifecycleObserver {
    public final AbstractC1098830ehV LL;
    public final /* synthetic */ C1100170ejf LLILLJJLI;

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
        C1100170ejf c1100170ejf = this.LLILLJJLI;
        if (c1100170ejf.LLIZLLLIL.resourceLoadStrategy != 1) {
            this.LL.LJI(c1100170ejf.LJIJ());
        }
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(this.LLILLJJLI.LJII());
        if (c1101820emKLIZIZ != null) {
            c1101820emKLIZIZ.LJIIL = 1;
        }
        Lifecycle lifecycle = this.LLILLJJLI.LLJI;
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
        C1100170ejf c1100170ejf = this.LLILLJJLI;
        if (c1100170ejf.LLIZLLLIL.resourceLoadStrategy == 1) {
            this.LL.LJI(c1100170ejf.LJIJ());
        }
    }

    @Override // X.InterfaceC1085330eLj
    public final void Pl() {
        Lifecycle lifecycle = this.LLILLJJLI.LLJI;
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
        String str;
        SmallCardInfo smallCardInfo = this.LLILLJJLI.LLIZLLLIL.smallCardInfo;
        return (smallCardInfo == null || (str = smallCardInfo.containerSchema) == null) ? "" : str;
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

    public ShortTouchModel$initSmallCardView$1(final C1100170ejf c1100170ejf, String str) {
        String str2;
        this.LLILLJJLI = c1100170ejf;
        IBrowserService iBrowserService = (IBrowserService) C1161920gLG.LIZJ(IBrowserService.class);
        Context context = c1100170ejf.LLJ;
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).db0(c1100170ejf.LLJIJIL, null)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        builderBuildUpon.appendQueryParameter("is_black_bg", str2);
        final AbstractC1098830ehV abstractC1098830ehVVc1 = iBrowserService.vc1(builderBuildUpon.build(), c1100170ejf.LLIZ.subBusinessType, context);
        abstractC1098830ehVVc1.setLoadCallback(new InterfaceC1098840ehW() { // from class: X.0ehj
            public long LIZ = System.currentTimeMillis();
            public int LIZIZ;

            @Override // X.InterfaceC1098840ehW
            public final void LJJIZ() {
                c1100170ejf.getClass();
                C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(c1100170ejf.LJII());
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
                String str4 = c1100170ejf.LLJILJILJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download lynx failed, reason: ");
                sbLIZ.append(str3);
                C20441214yg.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ));
                C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(c1100170ejf.LJII());
                if (c1101820emKLIZIZ != null) {
                    c1101820emKLIZIZ.LJIIIIZZ = 1;
                }
                int i = this.LIZIZ;
                C1100170ejf c1100170ejf2 = c1100170ejf;
                if (i < c1100170ejf2.LLJILJIL) {
                    abstractC1098830ehVVc1.LJI(c1100170ejf2.LJIJ());
                    this.LIZIZ++;
                } else {
                    c1100170ejf2.LJIIZILJ(EnumC1101800emI.STOP);
                    c1100170ejf2.LJIIZILJ(EnumC1101800emI.DESTROY);
                }
            }
        });
        this.LL = abstractC1098830ehVVc1;
    }

    @Override // X.InterfaceC1085330eLj
    public final void JG1(String str, JSONObject jSONObject) {
        this.LL.LJIIJ(str, jSONObject);
    }
}
