package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget;

import X.C03ZF;
import X.C1076804Ja;
import X.C1076904Jb;
import X.C11EA;
import X.C2217381BqS;
import X.C426160GnO;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS615S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPanelPaymentModuleWidget extends SkuPanelBaseWidget {
    public final int LLJI;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public C426160GnO LLJJ;
    public LinearLayout LLJJI;
    public final int LLJIJIL = R.layout.az3;
    public final LinkedList<C03ZF> LLJJIII = new LinkedList<>();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIIJ() {
        C426160GnO c426160GnO = this.LLJJ;
        if (c426160GnO != null) {
            C1076804Ja c1076804Ja = new C1076804Ja(c426160GnO, 12);
            ArrayList<C03ZF> arrayList = new ArrayList();
            Iterator it2 = c1076804Ja.iterator();
            while (true) {
                C1076904Jb c1076904Jb = (C1076904Jb) it2;
                if (!c1076904Jb.hasNext()) {
                    break;
                }
                View view = (View) c1076904Jb.next();
                if ((view instanceof C03ZF) && view != null) {
                    arrayList.add(view);
                }
            }
            for (C03ZF c03zf : arrayList) {
                if (c03zf.LIZJ()) {
                    c03zf.setChecked$ecommerce_transaction_release(false);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIIZZ() {
        C11EA.LJII(this, LJII(), new C2217381BqS() { // from class: X.041u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getPaymentModule();
            }
        }, new AwS615S0100000_1(this, 71));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIZ() {
        this.LLJILJIL = (TuxTextView) LJI(R.id.tv_payment_module_promotion_tag_right);
        this.LLJILJILJ = (TuxTextView) LJI(R.id.tv_payment_module_promotion_tag_below);
        this.LLJJI = (LinearLayout) LJI(R.id.nhy);
        this.LLJILLL = (TuxTextView) LJI(R.id.tv_payment_module_title);
        this.LLJJ = (C426160GnO) LJI(R.id.i6m);
    }

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return this.LLJIJIL;
    }

    public SkuPanelPaymentModuleWidget(int i) {
        this.LLJI = i;
    }
}
