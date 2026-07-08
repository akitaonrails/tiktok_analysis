package com.ss.android.ugc.aweme.commercialize.service;

import X.AbstractC1000340c8e;
import X.AbstractC2255531DPz;
import X.C1000350c8f;
import X.C2255521DPy;
import Y.ARunnableS43S0400000_35;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS225S0300000_16;

/* JADX INFO: loaded from: classes36.dex */
public final class ComponentShowStatusExamineProxy implements IComponentShowStatusExamine {
    public final C2255521DPy LIZ;

    @Override // com.ss.android.ugc.aweme.commercialize.service.IComponentShowStatusExamine
    public final void clear() {
        C2255521DPy c2255521DPy = this.LIZ;
        if (c2255521DPy != null) {
            c2255521DPy.clear();
        }
    }

    public ComponentShowStatusExamineProxy() {
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C2255521DPy c2255521DPy = !SettingsManager.LIZ("disable_commerce_feed_show_slardar_exception", true) ? new C2255521DPy() : null;
        this.LIZ = c2255521DPy;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IComponentShowStatusExamine
    public final void Ys(View view) {
        C2255521DPy c2255521DPy = this.LIZ;
        if (c2255521DPy != null) {
            c2255521DPy.Ys(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IComponentShowStatusExamine
    public final void Zs(C1000350c8f c1000350c8f) {
        C2255521DPy c2255521DPy = this.LIZ;
        if (c2255521DPy != null) {
            c2255521DPy.Zs(c1000350c8f);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IComponentShowStatusExamine
    public final void at(AbstractC1000340c8e abstractC1000340c8e, View view, Function1<? super AbstractC2255531DPz, Unit> function1) {
        HandlerHook.viewPost(view, new ARunnableS43S0400000_35(this, abstractC1000340c8e, view, (AwS225S0300000_16) function1, 10));
    }
}
