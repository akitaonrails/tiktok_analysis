package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel;

import X.C1728720v5S;
import X.C1730010v7X;
import X.C1730130v7j;
import X.C1730180v7o;
import X.C23250099c;
import X.InterfaceC0148002o;
import X.InterfaceC1729810v7D;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateEditBottomAreaViewModel extends AssemViewModel<C1730180v7o> {
    public final C1730010v7X LL;
    public InterfaceC1729810v7D LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1730180v7o(0);
    }

    public TemplateEditBottomAreaViewModel() {
        new C1728720v5S();
        this.LL = new C1730010v7X();
    }

    public final void vQ2(TemplateItem templateItem, TemplateItem templateItem2, ViewGroup viewGroup, boolean z) {
        setState(AFwS268S0000000_26.get$arr$(373));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1730130v7j(this, templateItem, templateItem2, viewGroup, z, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r8, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r9, android.view.ViewGroup r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C1730150v7l
            if (r0 == 0) goto L9a
            r6 = r11
            X.0v7l r6 = (X.C1730150v7l) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r2 = r6.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZLL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L59
            if (r0 == r3) goto L6d
            if (r0 != r4) goto La1
            java.lang.Object r10 = r6.LLILLL
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r9 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r8 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L2d:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 != 0) goto L37
            r7.vQ2(r8, r9, r10, r3)
        L34:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L37:
            android.content.Context r0 = r10.getContext()
            if (r0 == 0) goto L34
            X.19EG r0 = X.C1388190mED.LIZIZ(r0)
            if (r0 == 0) goto L34
            androidx.fragment.app.FragmentManager r1 = r0.getSupportFragmentManager()
            if (r1 == 0) goto L34
            X.0v5z r0 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.TemplateMultiDisplayFragment.LLJI
            kotlin.jvm.internal.AwS154S0400000_26 r6 = new kotlin.jvm.internal.AwS154S0400000_26
            r11 = 11
            r6.<init>(r7, r8, r9, r10, r11)
            r0.getClass()
            X.C1729050v5z.LIZ(r1, r2, r6)
            goto L34
        L59:
            X.C155000ia.LIZIZ(r2)
            X.0v9i r0 = X.C1731360v9i.LIZ
            r6.LL = r8
            r6.LLILLJJLI = r9
            r6.LLILLL = r10
            r6.LLILZLL = r3
            java.lang.Object r0 = r0.LJIIIIZZ(r10, r9, r6)
            if (r0 != r5) goto L78
            return r5
        L6d:
            java.lang.Object r10 = r6.LLILLL
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r9 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r8 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L78:
            X.0v7X r2 = r7.LL
            android.content.Context r1 = r10.getContext()
            X.0v7D r0 = r7.LLILLJJLI
            if (r0 == 0) goto L98
            X.0v5t r0 = r0.Um1()
        L86:
            r6.LL = r8
            r6.LLILLJJLI = r9
            r6.LLILLL = r10
            r6.LLILZLL = r4
            r2.getClass()
            java.lang.Object r2 = X.C1730010v7X.LJII(r1, r0, r9, r6)
            if (r2 != r5) goto L2d
            return r5
        L98:
            r0 = 0
            goto L86
        L9a:
            X.0v7l r6 = new X.0v7l
            r6.<init>(r7, r11)
            goto L12
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel.wQ2(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, android.view.ViewGroup, X.05Vn):java.lang.Object");
    }
}
