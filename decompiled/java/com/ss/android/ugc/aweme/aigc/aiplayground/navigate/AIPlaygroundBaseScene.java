package com.ss.android.ugc.aweme.aigc.aiplayground.navigate;

import X.AbstractC214814194y;
import X.C0EHM;
import X.C0FGC;
import X.C0LE3;
import X.C0MWS;
import X.C0TVI;
import X.C14K9;
import X.C1851620yHg;
import X.C381630Exl;
import X.C560580Lyi;
import X.C560700Lyu;
import X.C786410Ut5;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPlaygroundBaseScene extends AbstractC214814194y implements InterfaceC524950KiL, C0MWS {
    public C1851620yHg LLJJIJIL;
    public C560580Lyi LLJJJ;
    public C381630Exl LLJJJIL;
    public final List<InterfaceC484050IyZ> LLJJJJ;
    public final C560700Lyu LLJJJJJIL;

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.C0MWS
    public final C0LE3 getType() {
        return null;
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        C560580Lyi c560580Lyi = this.LLJJJ;
        if (c560580Lyi != null && c560580Lyi.onBackPressed()) {
            return true;
        }
        C1851620yHg c1851620yHg = this.LLJJIJIL;
        if (c1851620yHg == null || !c1851620yHg.onBackPressed()) {
            return super.onBackPressed();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Lyu] */
    public AIPlaygroundBaseScene() {
        LLLLJ(AFwS239S0000000_8.get$arr$(21));
        C0FGC.LIZ(2);
        this.LLJJJJ = new ArrayList();
        this.LLJJJJJIL = new InterfaceC484050IyZ() { // from class: X.0Lyu
            @Override // X.InterfaceC484050IyZ
            public final boolean onActivityResult(int i, int i2, Intent intent) {
                C1851620yHg c1851620yHg;
                if (i2 == 10010) {
                    if (intent != null) {
                        try {
                            Bundle extras = intent.getExtras();
                            if (extras != null && (c1851620yHg = this.LL.LLJJIJIL) != null) {
                                c1851620yHg.LLLLILI(extras);
                                return true;
                            }
                            return true;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return true;
                        }
                    }
                    return true;
                }
                return false;
            }
        };
    }

    @Override // X.C0MWS
    public final void LJLL(boolean z) {
        C786410Ut5.LJLLLLLL(8, this.mView);
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        if (!((ArrayList) this.LLJJJJ).contains(interfaceC484050IyZ)) {
            ((ArrayList) this.LLJJJJ).add(interfaceC484050IyZ);
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        if (((ArrayList) this.LLJJJJ).contains(interfaceC484050IyZ)) {
            ((ArrayList) this.LLJJJJ).remove(interfaceC484050IyZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x024a A[PHI: r10
      0x024a: PHI (r10v2 java.lang.String) = 
      (r10v0 java.lang.String)
      (r10v0 java.lang.String)
      (r10v4 java.lang.String)
      (r10v4 java.lang.String)
      (r10v4 java.lang.String)
      (r10v4 java.lang.String)
      (r10v4 java.lang.String)
      (r10v4 java.lang.String)
      (r10v4 java.lang.String)
     binds: [B:56:0x01a8, B:57:0x01aa, B:59:0x01ae, B:61:0x01b4, B:62:0x01b6, B:64:0x01ba, B:66:0x01be, B:68:0x01c6, B:70:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r79) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.aiplayground.navigate.AIPlaygroundBaseScene.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.AbstractC214814194y
    public final boolean processNewArguments(Bundle bundle) {
        Integer numValueOf;
        C1851620yHg c1851620yHg;
        if (bundle != null) {
            numValueOf = Integer.valueOf(bundle.getInt("ai_playground_photo_finish_to_aigc_result_code", -1));
        } else {
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() != 30006 || (c1851620yHg = this.LLJJIJIL) == null || !c1851620yHg.LLLLILI(bundle)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view.getPaddingBottom() == 0 && Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0Lyw
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), c20246014Ju.LIZ(7).LIZLLL);
                    return c20246014Ju;
                }
            });
        }
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0EHM.LIZ = C786410Ut5.N3(viewGroup.getContext());
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.mq, viewGroup, false);
    }

    @Override // X.AbstractC214814194y
    public final boolean onInterceptActivityResult(int i, int i2, Intent intent) {
        Iterator it2 = ((ArrayList) this.LLJJJJ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onResult(int i, int i2, Intent intent) {
        return super.onResult(i, i2, intent);
    }
}
