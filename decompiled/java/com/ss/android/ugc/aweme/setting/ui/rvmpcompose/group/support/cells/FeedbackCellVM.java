package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells;

import X.C2018707vV;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.services.IFeedbackCellService;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public class FeedbackCellVM extends BaseCellSettingsVM<C2018707vV> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o defaultState() {
        /*
            r15 = this;
            X.07vV r5 = new X.07vV
            java.lang.Class<com.ss.android.ugc.aweme.setting.services.IFeedbackCellService> r6 = com.ss.android.ugc.aweme.setting.services.IFeedbackCellService.class
            r7 = 0
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.setting.services.IFeedbackCellService r0 = (com.ss.android.ugc.aweme.setting.services.IFeedbackCellService) r0
            if (r0 == 0) goto L15
            r0.LIZIZ()
        L15:
            r14 = 0
            X.07gq r12 = new X.07gq
            r12.<init>(r15)
            boolean r4 = X.C2018907vX.LIZ
            if (r4 != 0) goto L75
            X.0tWw r6 = X.C1669660tYC.LLJJ
        L21:
            int r3 = X.C2018807vW.LIZ
            r2 = 2131847819(0x7f116a8b, float:1.9329126E38)
            r1 = 2131837676(0x7f1142ec, float:1.9308554E38)
            if (r3 == 0) goto L6f
            r0 = 1
            if (r3 != r0) goto L51
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L32:
            if (r0 == 0) goto L6f
            int r2 = r0.intValue()
        L38:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            if (r4 != 0) goto L4e
            X.0tWw r7 = X.C1669660tYC.LLJILLL
        L40:
            kotlin.jvm.internal.AwS617S0100000_3 r13 = new kotlin.jvm.internal.AwS617S0100000_3
            r0 = 12
            r13.<init>(r15, r0)
            r9 = 0
            r10 = r9
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        L4e:
            X.0tWw r7 = X.C1669660tYC.LLJJL
            goto L40
        L51:
            r0 = 2
            if (r3 != r0) goto L59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L32
        L59:
            r0 = 3
            if (r3 != r0) goto L64
            r0 = 2131822091(0x7f11060b, float:1.9276944E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L32
        L64:
            r0 = 4
            if (r3 != r0) goto L6f
            r0 = 2131834566(0x7f1136c6, float:1.9302246E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L32
        L6f:
            if (r4 != 0) goto L38
            r2 = 2131837676(0x7f1142ec, float:1.9308554E38)
            goto L38
        L75:
            X.0tWw r6 = X.C1669660tYC.LLJJLIIIJLLLLLLLZ
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.FeedbackCellVM.defaultState():X.002o");
    }

    public final void vQ2(Context context, String str) {
        IFeedbackCellService iFeedbackCellService = (IFeedbackCellService) PluggableExtentionKt.pluggableSpi$default(IFeedbackCellService.class, false, false, false, 14, null);
        if (iFeedbackCellService != null) {
            if (str == null) {
                str = "settings_page";
            }
            new AwS547S0100000_3(this, 52);
            iFeedbackCellService.LIZ(context, str);
        }
    }
}
