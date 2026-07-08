package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1929107h3;
import X.C2014907ut;
import X.InterfaceC0148002o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityCenterVM extends BaseCellSettingsVM<C2014907ut> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2014907ut(2131847152, new C1929107h3(this), new AwS617S0100000_3(this, 56));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            X.09Gk r1 = new X.09Gk
            r1.<init>()
            java.lang.String r0 = "enter_from"
            r1.LJIIIIZZ(r0, r8)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
            java.lang.String r0 = "enter_activity_history"
            X.C20684815ws.LJIILLIIL(r0, r1)
            android.app.Activity r0 = X.C06MM.LIZ(r7)
            r5 = 0
            if (r0 == 0) goto L34
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L34
            java.lang.String r0 = "activity_center_record_type"
            java.lang.String r0 = r1.getStringExtra(r0)     // Catch: java.lang.Exception -> L27
            if (r0 == 0) goto L34
            goto L2c
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L34
        L2c:
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L34:
            X.082s r0 = X.EnumC20536082s.ONLY_RECORD
            int r1 = r0.getType()
            if (r5 == 0) goto L42
            int r0 = r5.intValue()
            if (r0 == r1) goto L50
        L42:
            X.082s r0 = X.EnumC20536082s.RECORD_REQUEST_SELF
            int r1 = r0.getType()
            if (r5 == 0) goto L6b
            int r0 = r5.intValue()
            if (r0 != r1) goto L6b
        L50:
            X.08dz r4 = X.C2164908dz.LIZ     // Catch: java.lang.Exception -> L67
            X.082t r0 = X.EnumC20537082t.ACTION_TYPE_SEMI_POP     // Catch: java.lang.Exception -> L67
            int r3 = r0.getType()     // Catch: java.lang.Exception -> L67
            java.lang.String r2 = "settings_semi_pop_up_activity_center"
            kotlin.jvm.internal.AwS652S0100000_3 r1 = new kotlin.jvm.internal.AwS652S0100000_3     // Catch: java.lang.Exception -> L67
            r0 = 3
            r1.<init>(r5, r0)     // Catch: java.lang.Exception -> L67
            r4.getClass()     // Catch: java.lang.Exception -> L67
            X.C2164908dz.LIZ(r3, r2, r1)     // Catch: java.lang.Exception -> L67
            goto L6b
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            X.01GW r0 = com.ss.android.ugc.aweme.ActivityCenterEntranceExperiment.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ActivityCenterEntranceExperiment$ActivityCenterSettingModel r0 = (com.ss.android.ugc.aweme.ActivityCenterEntranceExperiment.ActivityCenterSettingModel) r0
            java.lang.String r0 = r0.url
            r1.append(r0)
            java.lang.String r0 = "%26grey_bg%3D1"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r7, r0)
            r0.open()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ActivityCenterVM.vQ2(android.content.Context, java.lang.String):void");
    }
}
