package com.bytedance.hybrid.spark.raven.transparent;

import X.C0DQY;
import X.C1546210qL5;
import X.C814420VxA;
import Y.ATListenerS451S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.raven.component.BaseRavenReusedComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class TransparentAssem extends BaseRavenReusedComponent<TransparentModule> {
    public final int LLJL = 0;
    public C0DQY LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ekg;
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0DQY c0dqy = (C0DQY) view.findViewById(R.id.yje);
        this.LLJLIL = c0dqy;
        if (c0dqy != null) {
            c0dqy.setOnTouchListener(new ATListenerS451S0100000_18(this, 0));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C0DQY c0dqy;
        ViewGroup.LayoutParams layoutParams;
        TransparentModule transparentModule = (TransparentModule) obj;
        op(transparentModule);
        if (this.LLJL == 0 && (c0dqy = this.LLJLIL) != null && (layoutParams = c0dqy.getLayoutParams()) != null) {
            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
            Integer numValueOf = Integer.valueOf(transparentModule.getHeight());
            c1546210qL5.getClass();
            layoutParams.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf));
        }
    }
}
