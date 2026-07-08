package com.ss.android.ugc.aweme.spark;

import X.C1039050d95;
import X.C1041990dDp;
import X.C786410Ut5;
import X.C905703gN;
import X.InterfaceC1056670dbV;
import X.InterfaceC1892990zMP;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;

/* JADX INFO: loaded from: classes17.dex */
public final class AdSparkFragment extends SparkFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZjY8KD04ZgQoGj8yOi4KOy40JSAiPQ==";
    public final boolean LLJZ;
    public SparkContext LLJZIJLIL;
    public InterfaceC1056670dbV LLL;

    public AdSparkFragment() {
        this(false);
    }

    public final SparkContext LLIILZL() {
        SparkContext sparkContextLIZ = this.LLJZIJLIL;
        if (sparkContextLIZ == null) {
            C905703gN.LIZ.getClass();
            C1041990dDp c1041990dDp = C1041990dDp.LIZ;
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("SparkContextContainerId") : null;
            c1041990dDp.getClass();
            sparkContextLIZ = C1041990dDp.LIZ(string);
        }
        this.LLJZIJLIL = sparkContextLIZ;
        return sparkContextLIZ;
    }

    public final InterfaceC1056670dbV ZR() {
        C1039050d95 c1039050d95;
        InterfaceC1056670dbV interfaceC1056670dbV = this.LLL;
        if (interfaceC1056670dbV == null) {
            SparkContext sparkContextLLIILZL = LLIILZL();
            interfaceC1056670dbV = sparkContextLLIILZL != null ? (InterfaceC1056670dbV) sparkContextLLIILZL.LJFF(InterfaceC1056670dbV.class) : null;
            if ((interfaceC1056670dbV instanceof C1039050d95) && (c1039050d95 = (C1039050d95) interfaceC1056670dbV) != null) {
                c1039050d95.LLLILZJ();
            }
        }
        this.LLL = interfaceC1056670dbV;
        return interfaceC1056670dbV;
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1039050d95 c1039050d95;
        super.onDestroy();
        InterfaceC1056670dbV interfaceC1056670dbVZR = ZR();
        if (!(interfaceC1056670dbVZR instanceof C1039050d95) || (c1039050d95 = (C1039050d95) interfaceC1056670dbVZR) == null) {
            return;
        }
        c1039050d95.LLLILZ();
    }

    public AdSparkFragment(boolean z) {
        this.LLJZ = z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC1892990zMP interfaceC1892990zMP;
        Context context;
        View viewLJFF;
        SparkContext sparkContextLLIILZL = LLIILZL();
        if (sparkContextLLIILZL == null || (interfaceC1892990zMP = (InterfaceC1892990zMP) sparkContextLLIILZL.LJFF(InterfaceC1892990zMP.class)) == null) {
            InterfaceC1056670dbV interfaceC1056670dbVZR = ZR();
            if (interfaceC1056670dbVZR instanceof C1039050d95) {
                interfaceC1892990zMP = (C1039050d95) interfaceC1056670dbVZR;
            } else {
                interfaceC1892990zMP = null;
            }
        }
        InterfaceC1056670dbV interfaceC1056670dbVZR2 = ZR();
        if (interfaceC1056670dbVZR2 != null && (context = getContext()) != null) {
            interfaceC1056670dbVZR2.LJIILJJIL(context);
            interfaceC1056670dbVZR2.LJJIJ();
            ViewGroup viewGroupLJIJJ = interfaceC1056670dbVZR2.LJIJJ();
            if (interfaceC1892990zMP != null && (viewLJFF = interfaceC1892990zMP.LJFF(context)) != null) {
                C786410Ut5.LJJJJI(viewGroupLJIJJ);
                ViewParent parent = viewLJFF.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    C786410Ut5.LJJJLZIJ(viewLJFF, (ViewGroup) parent);
                }
                viewGroupLJIJJ.addView(viewLJFF);
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (this.LLJZ) {
            return;
        }
        super.onViewCreated(view, bundle);
    }
}
