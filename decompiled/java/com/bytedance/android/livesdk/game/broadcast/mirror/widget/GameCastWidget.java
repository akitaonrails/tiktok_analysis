package com.bytedance.android.livesdk.game.broadcast.mirror.widget;

import X.C011Z;
import X.C0TFE;
import X.C0THC;
import X.C1324720kZq;
import X.C1519760peQ;
import X.C16F5;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C497740JfY;
import X.C743540TEq;
import X.C782110Um9;
import X.C786410Ut5;
import X.InterfaceC743640TFa;
import Y.ACListenerS147S0100000_12;
import Y.AcS495S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes13.dex */
public abstract class GameCastWidget extends LiveRecyclableWidget {
    public static final /* synthetic */ int LLIZ = 0;
    public final int LL;
    public final Bundle LLILLJJLI;
    public C1324720kZq LLILLL;
    public C16F5 LLILZ;
    public C1324720kZq LLILZIL;
    public boolean LLILZLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hys;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract void x1(boolean z);

    public abstract void z1();

    public void LIZIZ() {
        String strLJJIFFI;
        for (Map.Entry entry : ((ConcurrentHashMap) C0THC.LIZJ).entrySet()) {
            if (!Intrinsics.LJFF(entry.getKey(), getClass()) && ((Boolean) entry.getValue()).booleanValue()) {
                boolean zLJFF = Intrinsics.LJFF(getClass(), GameCastWiredWidget.class);
                C0TFE c0tfe = C0TFE.LIZ;
                Context context = this.context;
                AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 286);
                c0tfe.getClass();
                if (context != null) {
                    String strLJIJI = C497740JfY.LJIJI(2131841756);
                    if (strLJIJI != null) {
                        String strLJIJI2 = !zLJFF ? C497740JfY.LJIJI(2131841760) : C497740JfY.LJIJI(2131841761);
                        strLJJIFFI = strLJIJI2 != null ? u.LJJIFFI(strLJIJI, "{cast_type}", strLJIJI2, false) : null;
                    }
                    C782110Um9 c782110Um9 = new C782110Um9(context);
                    c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131841758), new AcS495S0100000_12(awS556S0100000_12, 21));
                    c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131841757), new InterfaceC743640TFa() { // from class: X.0THD
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            liveDialog.dismiss();
                        }
                    });
                    c782110Um9.LIZJ = C497740JfY.LJIJI(2131841759);
                    c782110Um9.LJIIIZ(strLJJIFFI);
                    c782110Um9.LJIILL = false;
                    c782110Um9.LJIILLIIL = true;
                    C786410Ut5.E4(c782110Um9.LIZ());
                }
                C743540TEq.LJJII("manual", !Intrinsics.LJFF(getClass(), GameCastWirelessWidget.class));
                return;
            }
        }
        x1(false);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1519760peQ<GameCastWidget> c1519760peQ;
        C1519760peQ<GameCastWidget> c1519760peQ2 = C0THC.LIZIZ;
        if (c1519760peQ2 == null || !c1519760peQ2.contains(this) || (c1519760peQ = C0THC.LIZIZ) == null) {
            return;
        }
        c1519760peQ.LJ(this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLILLL = (C1324720kZq) findViewById(R.id.dhl);
        this.LLILZIL = (C1324720kZq) findViewById(R.id.dhg);
        this.LLILZ = (C16F5) findViewById(R.id.widget_text);
        if (C0THC.LIZIZ == null) {
            C0THC.LIZIZ = new C1519760peQ<>();
        }
        C1519760peQ<GameCastWidget> c1519760peQ = C0THC.LIZIZ;
        if (c1519760peQ == null || !c1519760peQ.contains(this)) {
            C1519760peQ<GameCastWidget> c1519760peQ2 = C0THC.LIZIZ;
            if (c1519760peQ2 != null) {
                c1519760peQ2.LIZJ(this);
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C0THC.LIZJ;
            if (!concurrentHashMap.containsKey(getClass())) {
                concurrentHashMap.put(getClass(), Boolean.FALSE);
            }
        }
        this.LLILZLL = C0THC.LIZ(getClass());
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 195), view);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        y1(this.LLILZLL);
    }

    public final void y1(boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("selected: true , class: ");
            sbLIZ.append(getClass());
            C20441214yg.LJ("cast_wired", C2188811AlT.LIZIZ(sbLIZ));
            C1324720kZq c1324720kZq = this.LLILZIL;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 0);
            }
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                c16f5.setTextColor(C20736316Cj.LIZJ(R.attr.fxr, c16f5));
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("selected: false , class: ");
        sbLIZ2.append(getClass());
        C20441214yg.LJ("cast_wired", C2188811AlT.LIZIZ(sbLIZ2));
        C1324720kZq c1324720kZq2 = this.LLILZIL;
        if (c1324720kZq2 != null) {
            C786410Ut5.LLJJIII(c1324720kZq2, 8);
        }
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 == null) {
            return;
        }
        c16f52.setTextColor(C20736316Cj.LIZJ(R.attr.fy3, c16f52));
    }

    public GameCastWidget(int i, Bundle bundle) {
        this.LL = i;
        this.LLILLJJLI = bundle;
    }
}
