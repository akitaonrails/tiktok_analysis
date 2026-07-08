package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc;

import X.AnonymousClass0470;
import X.AnonymousClass0473;
import X.C042U;
import X.C0H4N;
import X.C10515049h;
import X.C11EA;
import X.C13LE;
import X.C1748720vbi;
import X.C1763620vzk;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C300330Bpv;
import X.C426350Gnh;
import X.C430120Gtm;
import X.InterfaceC434930H3r;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SeaSkuPanelHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaPdpSkcPanelHeaderState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaPdpSkcPanelHeaderViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS649S0100000_35;
import kotlin.jvm.internal.AwS684S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class SeaSkuPanelSkcHeaderWidget extends SkuPanelBaseWidget {
    public C0H4N LLJIJIL;
    public C1763620vzk LLJILJIL;
    public TuxTextView LLJILJILJ;
    public C430120Gtm LLJILLL;
    public C426350Gnh LLJJ;
    public final WidgetLifecycleAwareLazy LLJJIII;
    public final int LLJI = R.layout.axt;
    public final List<String> LLJJI = new ArrayList();

    public SeaSkuPanelSkcHeaderWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpSkcPanelHeaderViewModel.class);
        AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(this, c19719912DlLIZ, 34);
        this.LLJJIII = new WidgetLifecycleAwareLazy(this, awS427S0200000_26, new AwS154S0400000_26(this, awS427S0200000_26, c19719912DlLIZ, AFwS283S0000000_35.get$arr$(32), 8));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpSkcPanelHeaderViewModel LJIIJ() {
        return (SeaPdpSkcPanelHeaderViewModel) this.LLJJIII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIIZZ() {
        SeaPdpSkcPanelHeaderViewModel seaPdpSkcPanelHeaderViewModelLJIIJ = LJIIJ();
        SeaSkuPanelViewModel seaSkuPanelViewModelLJII = LJII();
        seaPdpSkcPanelHeaderViewModelLJIIJ.LLILZIL = seaSkuPanelViewModelLJII;
        AnonymousClass0470 anonymousClass0470 = new C2217381BqS() { // from class: X.0470
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getOriginalProductPackStruct();
            }
        };
        C042U c042u = new C2217381BqS() { // from class: X.042U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCheckedSkuArray();
            }
        };
        AwS640S0100000_26 awS640S0100000_26 = new AwS640S0100000_26(seaPdpSkcPanelHeaderViewModelLJIIJ, 190);
        seaSkuPanelViewModelLJII.getClass();
        JediViewModel.aR2(seaSkuPanelViewModelLJII, anonymousClass0470, c042u, null, awS640S0100000_26, 4, null);
        seaSkuPanelViewModelLJII.s60(new C2217381BqS() { // from class: X.0471
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentPriceData();
            }
        }, new AwS614S0100000_35(seaPdpSkcPanelHeaderViewModelLJIIJ, 232));
        if (C300330Bpv.LIZ()) {
            seaSkuPanelViewModelLJII.s60(new C2217381BqS() { // from class: X.047H
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SkuState) obj).getHidePriceTip();
                }
            }, new AwS614S0100000_35(seaPdpSkcPanelHeaderViewModelLJIIJ, 233));
        }
        seaSkuPanelViewModelLJII.s60(new C2217381BqS() { // from class: X.0472
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getPromotionDealVO();
            }
        }, new AwS614S0100000_35(seaPdpSkcPanelHeaderViewModelLJIIJ, 234));
        seaSkuPanelViewModelLJII.s60(new C2217381BqS() { // from class: X.046z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getKeyBoardVisibility();
            }
        }, new AwS614S0100000_35(seaPdpSkcPanelHeaderViewModelLJIIJ, 231));
        C11EA.LJII(this, LJIIJ(), new C2217381BqS() { // from class: X.1Dex
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpSkcPanelHeaderState) obj).getHeaderImgList();
            }
        }, new AwS649S0100000_35(this, 12));
        C11EA.LJIIIIZZ(this, LJIIJ(), new C2217381BqS() { // from class: X.1Deu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpSkcPanelHeaderState) obj).getSeaPdpProductPriceData();
            }
        }, new C2217381BqS() { // from class: X.1Dev
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpSkcPanelHeaderState) obj).getHidePriceTip();
            }
        }, new AwS684S0100000_35(this, 1));
        C11EA.LJII(this, LJIIJ(), new C2217381BqS() { // from class: X.1Dew
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpSkcPanelHeaderState) obj).getPromotionDealVO();
            }
        }, new AwS649S0100000_35(this, 13));
        C11EA.LJII(this, LJIIJ(), new C2217381BqS() { // from class: X.1Det
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SeaPdpSkcPanelHeaderState) obj).getKeyBoardVisibility());
            }
        }, new AwS649S0100000_35(this, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0veW] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIZ() {
        C0H4N c0h4n = (C0H4N) LJI(R.id.kgz);
        c0h4n.LIZJ(new InterfaceC434930H3r() { // from class: X.0veW
            @Override // X.InterfaceC434930H3r
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC434930H3r
            public final void LIZJ(View view, int i) {
                SeaSkuPanelViewModel seaSkuPanelViewModel;
                SeaPdpSkcPanelHeaderViewModel seaPdpSkcPanelHeaderViewModelLJIIJ = this.LIZ.LJIIJ();
                List<Image> list = seaPdpSkcPanelHeaderViewModelLJIIJ.LLILZLL;
                if (list != null && (seaSkuPanelViewModel = seaPdpSkcPanelHeaderViewModelLJIIJ.LLILZIL) != null) {
                    seaSkuPanelViewModel.oR2(i, view.getContext(), "head_pic", list);
                }
                C1748720vbi.LIZLLL(view, new C10516049i(), AFwS268S0000000_26.get$arr$(763));
            }
        });
        C1748720vbi.LJFF(c0h4n, new C10515049h(), AFwS226S0000000_35.get$arr$(817), AFwS268S0000000_26.get$arr$(764));
        this.LLJIJIL = c0h4n;
        this.LLJILJIL = (C1763620vzk) LJI(R.id.u4z);
        this.LLJILJILJ = (TuxTextView) LJI(R.id.u4x);
        this.LLJILLL = (C430120Gtm) LJI(R.id.mdq);
        this.LLJJ = (C426350Gnh) LJI(R.id.mdr);
        int i = SeaSkuPanelHeaderWidget.LLJJJJ;
        AnonymousClass0473.LIZ(this, this.LLJILLL, this.LLJJ, this.LLJJI);
    }

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return this.LLJI;
    }
}
