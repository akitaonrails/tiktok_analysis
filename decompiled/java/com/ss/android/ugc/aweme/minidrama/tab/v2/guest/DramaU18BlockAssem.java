package com.ss.android.ugc.aweme.minidrama.tab.v2.guest;

import X.AbstractViewOnClickListenerC1165700gRM;
import X.C1559260qg8;
import X.C1578700rBU;
import X.C723580SZw;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public final class DramaU18BlockAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1578700rBU.class, "DramaU18BlockHierarchyData"), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.g_b);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.1A5z
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1165700gRM
                public final void LIZ(View view2) {
                    C1578700rBU c1578700rBU;
                    Function0<Unit> function0;
                    if (view2 != null && (c1578700rBU = (C1578700rBU) this.LLILZ.LLIZLLLIL.getValue()) != null && (function0 = c1578700rBU.LL) != null) {
                        function0.invoke();
                    }
                }
            }, viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.g_a);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.1A60
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1165700gRM
                public final void LIZ(View view2) {
                    C1578700rBU c1578700rBU;
                    Function0<Unit> function0;
                    if (view2 != null && (c1578700rBU = (C1578700rBU) this.LLILZ.LLIZLLLIL.getValue()) != null && (function0 = c1578700rBU.LLILLJJLI) != null) {
                        function0.invoke();
                    }
                }
            }, viewFindViewById2);
        }
    }
}
