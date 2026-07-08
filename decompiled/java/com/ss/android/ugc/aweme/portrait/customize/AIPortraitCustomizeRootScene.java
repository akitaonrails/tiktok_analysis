package com.ss.android.ugc.aweme.portrait.customize;

import X.AbstractC214814194y;
import X.C01GW;
import X.C0MGE;
import X.C13LP;
import X.C1686850tzv;
import X.C20244914Jj;
import X.C452501pT;
import X.C547790Le5;
import X.C786410Ut5;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC548110Leb;
import X.InterfaceC550350LiD;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitCustomizeRootScene extends AbstractC214814194y implements C0MGE, InterfaceC524950KiL {
    public final C01GW LLJJIJIL;
    public final ArrayList<InterfaceC484050IyZ> LLJJJ;
    public final ArrayList<InterfaceC362610EJn> LLJJJIL;

    @Override // X.AbstractC214814194y
    public final int getRootViewPaddingBottom(C20244914Jj c20244914Jj) {
        return 0;
    }

    public AIPortraitCustomizeRootScene() {
        LLLLJ(AFwS239S0000000_8.get$arr$(49));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 148));
        this.LLJJJ = new ArrayList<>();
        this.LLJJJIL = new ArrayList<>();
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLJJJIL, 0, interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLJJJ.add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLJJJ.remove(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLJJJIL.remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLJJJIL.add(interfaceC362610EJn);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC548110Leb interfaceC548110LebLJ;
        super.onActivityCreated(bundle);
        if (findSceneByTag("AIPortraitCustomizeChild") == null) {
            add(R.id.apy, new C1686850tzv(), "AIPortraitCustomizeChild");
        }
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null && (interfaceC548110LebLJ = iAIPortraitFeatureServiceLIZ.LJ()) != null) {
            interfaceC548110LebLJ.LIZIZ();
        }
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        InterfaceC550350LiD interfaceC550350LiDLIZLLL;
        super.onCreate(bundle);
        if (this.LLJJIJIL.getValue() == null) {
            finish();
            return;
        }
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null && (interfaceC550350LiDLIZLLL = iAIPortraitFeatureServiceLIZ.LIZLLL()) != null) {
            interfaceC550350LiDLIZLLL.LIZIZ();
        }
    }

    @Override // X.AbstractC214814194y
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it2 = C13LP.LLIIII(this.LLJJJIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC362610EJn) it2.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.AbstractC214814194y
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator it2 = C13LP.LLIIII(this.LLJJJ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        frameLayout.setId(R.id.apy);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }
}
