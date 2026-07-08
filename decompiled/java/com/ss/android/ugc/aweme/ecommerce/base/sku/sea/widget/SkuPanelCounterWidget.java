package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget;

import X.AnonymousClass0465;
import X.AnonymousClass0468;
import X.C01GW;
import X.C045V;
import X.C046F;
import X.C049X;
import X.C04JY;
import X.C10386044i;
import X.C10387044j;
import X.C10388044k;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS105S0200000_1;
import Y.ATListenerS333S0200000_1;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPanelCounterWidget extends SkuPanelBaseWidget {
    public static final float LLJJIJIIJIL = C418440Gaw.LIZIZ(5);
    public TuxIconView LLJIJIL;
    public TuxIconView LLJILJIL;
    public EditText LLJILJILJ;
    public TuxTextView LLJILLL;
    public final int LLJI = R.layout.axq;
    public long LLJJ = -1;
    public int LLJJI = -1;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1437));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1436));

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AnonymousClass0465 LJIIJ() {
        return (AnonymousClass0465) this.LLJJIJI.getValue();
    }

    public final void LJIIJJI() {
        String str;
        SkuPanelStarter.SkuEnterParams skuEnterParams = LJII().LLJILJIL;
        if (skuEnterParams == null || (str = skuEnterParams.productId) == null) {
            str = "";
        }
        SkuPanelStarter.SkuOperationParams skuOperationParams = new SkuPanelStarter.SkuOperationParams(str, 1);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZ("ec_sku_panel_operated", C1741890vQh.LJIIIIZZ(skuOperationParams));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIIZZ() {
        SeaSkuPanelViewModel seaSkuPanelViewModelLJII = LJII();
        C046F c046f = new C2217381BqS() { // from class: X.046F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getPurchaseNotice();
            }
        };
        AnonymousClass0468 anonymousClass0468 = new C2217381BqS() { // from class: X.0468
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCounterDescription();
            }
        };
        AwS615S0100000_1 awS615S0100000_1 = new AwS615S0100000_1(this, 68);
        seaSkuPanelViewModelLJII.getClass();
        JediViewModel.aR2(seaSkuPanelViewModelLJII, c046f, anonymousClass0468, null, awS615S0100000_1, 4, null);
        SeaSkuPanelViewModel seaSkuPanelViewModelLJII2 = LJII();
        C045V c045v = new C2217381BqS() { // from class: X.045V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuStockInfo();
            }
        };
        C10386044i c10386044i = new C2217381BqS() { // from class: X.044i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SkuState) obj).isQuantityEditable());
            }
        };
        AwS615S0100000_1 awS615S0100000_12 = new AwS615S0100000_1(this, 69);
        seaSkuPanelViewModelLJII2.getClass();
        JediViewModel.aR2(seaSkuPanelViewModelLJII2, c045v, c10386044i, null, awS615S0100000_12, 4, null);
        SeaSkuPanelViewModel seaSkuPanelViewModelLJII3 = LJII();
        C10387044j c10387044j = new C2217381BqS() { // from class: X.044j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentQuantity();
            }
        };
        C10388044k c10388044k = new C2217381BqS() { // from class: X.044k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentQuantityLimit();
            }
        };
        AwS615S0100000_1 awS615S0100000_13 = new AwS615S0100000_1(this, 70);
        seaSkuPanelViewModelLJII3.getClass();
        JediViewModel.aR2(seaSkuPanelViewModelLJII3, c10387044j, c10388044k, null, awS615S0100000_13, 4, null);
        LJII().s60(new C2217381BqS() { // from class: X.0467
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getKeyBoardVisibility();
            }
        }, new AwS580S0100000_1(this, 294));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIZ() {
        View viewLJI = LJI(R.id.vgd);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        float f = LLJJIJIIJIL;
        c384050F3z.LJIIIIZZ = Float.valueOf(f);
        c384050F3z.LJIIIZ = Float.valueOf(f);
        c384050F3z.LJIIJ = Float.valueOf(f);
        c384050F3z.LJIIJJI = Float.valueOf(f);
        viewLJI.setBackground(c384050F3z.LIZ(viewLJI.getContext()));
        TuxIconView tuxIconView = (TuxIconView) LJI(R.id.vhb);
        C786410Ut5.a9(tuxIconView, new ACListenerS105S0200000_1(this, tuxIconView, 7));
        C1748720vbi.LIZLLL(tuxIconView, new C049X(), new AwS580S0100000_1(this, 295));
        this.LLJILJIL = tuxIconView;
        TuxIconView tuxIconView2 = (TuxIconView) LJI(R.id.vha);
        C786410Ut5.a9(tuxIconView2, new ACListenerS105S0200000_1(this, tuxIconView2, 8));
        C1748720vbi.LIZLLL(tuxIconView2, new C049X(), new AwS580S0100000_1(this, 296));
        this.LLJIJIL = tuxIconView2;
        EditText editText = (EditText) LJI(R.id.vh_);
        editText.setOnTouchListener(new ATListenerS333S0200000_1(editText, this, 1));
        editText.addTextChangedListener(new C04JY(editText, this, 1));
        editText.setKeyListener(new NumberKeyListener() { // from class: X.046P
            @Override // android.text.method.KeyListener
            public final int getInputType() {
                return 3;
            }

            @Override // android.text.method.NumberKeyListener
            public final char[] getAcceptedChars() {
                return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
            }
        });
        this.LLJILJILJ = editText;
        this.LLJILLL = (TuxTextView) LJI(R.id.pd5);
    }

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return this.LLJI;
    }
}
