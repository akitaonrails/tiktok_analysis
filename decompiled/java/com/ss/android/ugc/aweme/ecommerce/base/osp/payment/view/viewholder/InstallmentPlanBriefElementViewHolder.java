package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C03YO;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallmentPlanBriefElementViewHolder extends ECJediViewHolder<C03YO> {
    public final LifecycleOwner LLJILJIL;
    public final C01GW LLJILJILJ;
    public InstallmentPlan LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        withState((JediViewModel) this.LLJILJILJ.getValue(), new AwS367S0200000_1((C03YO) obj, this, 314));
    }

    public InstallmentPlanBriefElementViewHolder(ViewGroup viewGroup, LifecycleOwner lifecycleOwner) {
        super(new ConstraintLayout(viewGroup.getContext()));
        this.LLJILJIL = lifecycleOwner;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 43));
    }
}
