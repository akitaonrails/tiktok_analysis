package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card;

import X.AbstractC1882890z67;
import X.C1155600gB4;
import X.C13IQ;
import X.C1887160zD0;
import X.C723850SaN;
import X.InterfaceC1881340z3c;
import X.InterfaceC1884840z9G;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;

/* JADX INFO: loaded from: classes29.dex */
public abstract class AbsBaseAssemMixCard<M> extends AbstractC1882890z67<M> implements InterfaceC1884840z9G {
    public MixCardAssemHolder LLJJIJI;

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        return null;
    }

    @Override // X.InterfaceC1884840z9G
    public final AbsBaseAssemMixCard LJIILLIIL() {
        return this;
    }

    public abstract C13IQ<? extends UISlotAssem> LJJJJLI();

    @Override // X.AbstractC1882890z67
    public final void LJJIJ() {
        super.LJJIJ();
        MixCardAssemHolder mixCardAssemHolder = this.LLJJIJI;
        if (mixCardAssemHolder != null) {
            C723850SaN.LJIIIIZZ(mixCardAssemHolder.LL, mixCardAssemHolder.LLILLL);
        }
        this.LLJJIJI = null;
    }

    @Override // X.AbstractC1882890z67, X.InterfaceC1883030z6L
    public final InterfaceC1881340z3c LIZJ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1882890z67, X.InterfaceC1883040z6M
    public final void LJII(ViewGroup viewGroup) {
        Fragment fragment;
        if (viewGroup != null && (fragment = this.LLILLL.getHost().getFragment()) != null) {
            MixCardAssemHolder mixCardAssemHolder = new MixCardAssemHolder(fragment, viewGroup, this, LJJJJLI());
            this.LLJJIJI = mixCardAssemHolder;
            C723850SaN.LJ(mixCardAssemHolder, new C1887160zD0(mixCardAssemHolder));
        }
    }

    @Override // X.InterfaceC1884840z9G
    public final void LJIIL(View view) {
        this.LLILZLL = view;
    }

    public AbsBaseAssemMixCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
    }
}
