package com.ss.android.ugc.aweme.im.creative.edit.impl.exit;

import X.C01GW;
import X.C0QSJ;
import X.C13LE;
import X.C2173421A4e;
import X.C2174131A6x;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19359510ob;
import X.InterfaceC1146704e9;
import X.InterfaceC19370810qQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS167S0100000_33;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.creative.edit.impl.ui.IMEditPageScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class IMEditExitAssem extends UISlotAssem implements InterfaceC19370810qQ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2396));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2397));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2398));
    public final EnumC19359510ob LLJJIJIIJIL = EnumC19359510ob.BACK_BUTTON;
    public volatile C2174131A6x LLJJIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public C0QSJ LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMEditExitAssem.class, "featureGraph", "getFeatureGraph()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/di/IMEditFeatureGraph;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cgu;
    }

    @Override // X.InterfaceC19370810qQ
    public final void Fd() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{IMEditPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IMEditPageScope.class);
        return arrayList;
    }

    public final C2174131A6x hp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJJIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJJ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{IMEditPageScope.class});
            this.LLJJJIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C2174131A6x c2174131A6x = (C2174131A6x) c0qsjLIZLLL.getAbility(C2174131A6x.class);
        C687700QyG.LJ(c2174131A6x, C2174131A6x.class);
        return c2174131A6x;
    }

    public final View ip() {
        return (View) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC19370810qQ
    public final EnumC19359510ob W() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        super.onViewCreated(view);
        if (((C2173421A4e) this.LLJJI.getValue()).LIZ.LIZIZ()) {
            C786410Ut5.T4(ip(), 0.0f);
            View viewIp = ip();
            if ((viewIp instanceof TuxIconView) && (tuxIconView2 = (TuxIconView) viewIp) != null) {
                tuxIconView2.setIconRes(R.raw.icon_x_mark);
                tuxIconView2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
                tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
            }
            C786410Ut5.I7(new ACListenerS167S0100000_33(this, 56), ip());
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ip(), "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            C786410Ut5.Pd(objectAnimatorOfFloat);
        } else {
            if (((C2173421A4e) this.LLJJI.getValue()).LIZ.LIZ()) {
                View viewIp2 = ip();
                if ((viewIp2 instanceof TuxIconView) && (tuxIconView = (TuxIconView) viewIp2) != null) {
                    tuxIconView.setIconRes(R.drawable.bx9);
                }
            }
            C786410Ut5.I7(new ACListenerS167S0100000_33(this, 57), ip());
        }
        ((C2173421A4e) this.LLJJI.getValue()).LIZIZ.getValue().LIZ(this);
    }

    @Override // X.InterfaceC19370810qQ
    public final void pi(int i) {
        C786410Ut5.LJLLLLLL(i, getContentView());
    }
}
