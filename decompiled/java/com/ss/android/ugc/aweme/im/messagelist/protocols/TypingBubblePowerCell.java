package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C0PEM;
import X.C1519005x6;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C416140GTk;
import X.C418440Gaw;
import X.C426750GoL;
import X.C431950Gwj;
import X.C432250GxD;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class TypingBubblePowerCell extends PowerCell<C1519005x6> {
    public C431950Gwj LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cn7;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        C431950Gwj c431950Gwj = this.LL;
        if (c431950Gwj != null) {
            c431950Gwj.LIZIZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        C426750GoL.LJIIIZ(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(15.25d)))), null, null, null, false, 30);
        C416140GTk c416140GTk = new C416140GTk(view.getContext());
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (objPluggableSpiForReal == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        c416140GTk.LIZIZ(((IIMMessageBubbleService) objPluggableSpiForReal).LJIIIIZZ(), false, false);
        view.setBackground(c416140GTk);
        this.LL = new C431950Gwj(this.itemView, LifecycleOwnerKt.getLifecycleScope(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C431950Gwj c431950Gwj = this.LL;
        if (c431950Gwj != null && c431950Gwj.LJFF == null) {
            LifecycleCoroutineScope lifecycleCoroutineScope = c431950Gwj.LIZIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            c431950Gwj.LJFF = C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ, null, new C432250GxD(c431950Gwj, null), 2);
        }
    }
}
