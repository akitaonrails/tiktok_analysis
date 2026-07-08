package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic;

import X.C03CL;
import X.C03CM;
import X.C0H1U;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticPromotionHolder extends ECJediViewHolder<C03CL> {
    public final Function1<Integer, Object> LLJILJIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027f  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticPromotionHolder.rr(java.lang.Object):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LogisticPromotionHolder(ViewGroup viewGroup, AwS580S0100000_1 awS580S0100000_1) {
        View viewLIZJ;
        if (C03CM.LIZ()) {
            viewLIZJ = C0H1U.LIZJ(R.layout.alz, viewGroup, false);
        } else {
            viewLIZJ = C0H1U.LIZJ(R.layout.am0, viewGroup, false);
        }
        super(viewLIZJ);
        this.LLJILJIL = awS580S0100000_1;
    }
}
