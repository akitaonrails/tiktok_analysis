package com.ss.android.ugc.aweme.ecommerce.base.sku.assem;

import X.AnonymousClass0378;
import X.AnonymousClass0433;
import X.AnonymousClass0434;
import X.AnonymousClass0445;
import X.C03W0;
import X.C041C;
import X.C041D;
import X.C043P;
import X.C04E4;
import X.C1018703yb;
import X.C1025203ze;
import X.C10296040w;
import X.C1741890vQh;
import X.C1744700vVE;
import X.C1752360vha;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23271099x;
import X.C418440Gaw;
import X.C800330VaR;
import X.C814420VxA;
import X.C948503nH;
import X.C954003oA;
import X.C954903oJ;
import X.EnumC1752350vhZ;
import X.InterfaceC954103oB;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButtonAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuBottomAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS128S0201000_1;
import kotlin.jvm.internal.AwS141S0101000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuBottomAssem extends SkuPanelBaseAssem implements InterfaceC954103oB {
    public View LLJJIJI;
    public AnonymousClass0434 LLJJIJIIJIL;
    public View LLJJIJIL;
    public final AnonymousClass0433 LLJJJ = new AnonymousClass0445() { // from class: X.0433
        @Override // X.AnonymousClass0445
        public final void LIZJ() {
        }

        /* JADX WARN: Removed duplicated region for block: B:76:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0231  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x024b  */
        @Override // X.AnonymousClass0445
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZ(X.C04E4 r25, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton r26) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 983
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0433.LIZ(X.04E4, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton):void");
        }

        @Override // X.AnonymousClass0445
        public final void LIZIZ(C04E4 c04e4, PdpButton pdpButton) {
            Integer num = pdpButton.buttonAction;
            if (num != null) {
                SkuBottomAssem skuBottomAssem = this.LIZ;
                final AwS141S0101000_1 awS141S0101000_1 = new AwS141S0101000_1(skuBottomAssem, num.intValue(), 2);
                skuBottomAssem.getViewModel().MQ2().LIZLLL(new AbstractC1700220uLU() { // from class: X.044G
                    @Override // X.AbstractC1700220uLU
                    public final void LIZ() {
                        awS141S0101000_1.invoke();
                    }
                });
            }
        }
    };
    public boolean LLJJJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.b3c;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem
    public final void lp() {
        getViewModel().s60(new C2217381BqS() { // from class: X.042E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuDataState();
            }
        }, new AwS580S0100000_1((InterfaceC954103oB) this, 1123));
        getViewModel().s60(new C2217381BqS() { // from class: X.0418
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getBottomAreaElem();
            }
        }, new AwS580S0100000_1((InterfaceC954103oB) this, 1124));
        getViewModel().s60(new C2217381BqS() { // from class: X.0419
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getProtectionProgramText();
            }
        }, new AwS580S0100000_1((InterfaceC954103oB) this, 1125));
        getViewModel().s60(new C2217381BqS() { // from class: X.03d9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getTotalPrice();
            }
        }, new AwS580S0100000_1((InterfaceC954103oB) this, 1126));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem
    public final void mp() {
        View viewFindViewById = getContentView().findViewById(R.id.ch0);
        this.LLJJIJIL = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(null);
        }
        AnonymousClass0434 anonymousClass0434 = (AnonymousClass0434) getContentView().findViewById(R.id.d78);
        this.LLJJIJIIJIL = anonymousClass0434;
        if (anonymousClass0434 != null) {
            anonymousClass0434.setPdpBottomButtonListener(this.LLJJJ);
        }
        View view = this.LLJJIJI;
        if (view == null) {
            View viewLJJIJL = LJJIJL();
            View viewFindViewById2 = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.y_s) : null;
            this.LLJJIJI = viewFindViewById2;
            view = viewFindViewById2;
        }
        C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), view);
        view.setBackground(C800330VaR.LIZIZ(view.getContext(), R.drawable.b3u));
        AnonymousClass0434 anonymousClass04342 = this.LLJJIJIIJIL;
        if (anonymousClass04342 != null) {
            C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)), anonymousClass04342);
        }
    }

    public final void sp(PdpButton pdpButton) {
        SkuItem skuItemLIZLLL;
        Integer numValueOf;
        Map<String, Object> map;
        String str;
        Integer numValueOf2;
        Map<String, Object> map2;
        String str2;
        C03W0 c03w0LIZ;
        Map<String, Object> map3;
        SkuSupply skuSupply;
        List<SkuItem> list;
        AnonymousClass0378.LIZ().LIZ("ec_sku_user_transform", C1741890vQh.LJIIIIZZ(C2097608Jq.LJIIJ(new Pair("trans_from_type", "2"))));
        SkuPanelAssemVM skuPanelAssemVMKp = getViewModel();
        SkuPanelState skuPanelState = skuPanelAssemVMKp.LLIZ;
        if (skuPanelState != null) {
            SkuInfo skuInfo = skuPanelAssemVMKp.LLJ;
            if (skuInfo != null) {
                list = skuInfo.skuList;
            } else {
                list = null;
            }
            skuItemLIZLLL = skuPanelState.LIZLLL(list);
        } else {
            skuItemLIZLLL = null;
        }
        C10296040w c10296040w = C10296040w.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = skuPanelAssemVMKp.LLJI;
        if (skuEnterParams != null) {
            numValueOf = Integer.valueOf(skuEnterParams.clickFrom);
        } else {
            numValueOf = null;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = skuPanelAssemVMKp.LLJI;
        if (skuEnterParams2 != null) {
            map = skuEnterParams2.trackParams;
        } else {
            map = null;
        }
        String strLIZ = C041D.LIZ(numValueOf, map);
        SkuPanelState skuPanelState2 = skuPanelAssemVMKp.LLIZ;
        if (skuPanelState2 != null) {
            str = skuPanelState2.skuId;
        } else {
            str = null;
        }
        Integer numValueOf3 = Integer.valueOf(Intrinsics.LJFF(skuPanelAssemVMKp.LLJJI, Boolean.TRUE) ? 1 : 0);
        C1025203ze c1025203ze = C1025203ze.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = skuPanelAssemVMKp.LLJI;
        if (skuEnterParams3 != null) {
            numValueOf2 = Integer.valueOf(skuEnterParams3.clickFrom);
        } else {
            numValueOf2 = null;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams4 = skuPanelAssemVMKp.LLJI;
        if (skuEnterParams4 != null) {
            map2 = skuEnterParams4.trackParams;
        } else {
            map2 = null;
        }
        c1025203ze.getClass();
        String strLIZ2 = C1025203ze.LIZ(numValueOf2, map2);
        C1752360vha c1752360vha = EnumC1752350vhZ.Companion;
        Integer numValueOf4 = Integer.valueOf(skuPanelAssemVMKp.Zf2().LJIIJ());
        c1752360vha.getClass();
        String strLIZ3 = C1752360vha.LIZ(numValueOf4);
        SkuPanelStarter.SkuEnterParams skuEnterParams5 = skuPanelAssemVMKp.LLJI;
        if (skuEnterParams5 != null) {
            str2 = skuEnterParams5.enterFrom;
        } else {
            str2 = null;
        }
        if (skuItemLIZLLL != null) {
            c03w0LIZ = C954903oJ.LIZ(skuItemLIZLLL);
        } else {
            c03w0LIZ = null;
        }
        String strLN = skuPanelAssemVMKp.LN();
        SkuPanelStarter.SkuEnterParams skuEnterParams6 = skuPanelAssemVMKp.LLJI;
        if (skuEnterParams6 != null) {
            map3 = skuEnterParams6.trackParams;
        } else {
            map3 = null;
        }
        if (skuItemLIZLLL != null) {
            skuSupply = skuItemLIZLLL.skuSupply;
        } else {
            skuSupply = null;
        }
        C10296040w.LIZJ(c10296040w, "change_sku_item", null, strLIZ, str, numValueOf3, strLIZ2, strLIZ3, str2, c03w0LIZ, strLN, null, map3, skuSupply, null, 103682);
        Integer num = pdpButton.buttonStatus;
        int value = C043P.DISABLE.getValue();
        if (num != null && num.intValue() == value) {
            getViewModel().OQ2(null, pdpButton.clickHint);
            return;
        }
        String strYQ2 = getViewModel().yQ2();
        getContentView();
        if (strYQ2 != null) {
            getViewModel().OQ2(null, hp().getResources().getString(2131832582, strYQ2));
            getViewModel().VQ2(strYQ2);
            up(strYQ2);
            return;
        }
        C954003oA.LIZ(this, new AwS545S0100000_1(this, 1812));
    }

    public final void tp(int i) {
        String strYQ2 = getViewModel().yQ2();
        View contentView = getContentView();
        if (strYQ2 != null) {
            if (contentView != null) {
                getViewModel().OQ2(null, hp().getResources().getString(2131832582, strYQ2));
                getViewModel().VQ2(strYQ2);
                getViewModel().UQ2("buy_now");
                up(strYQ2);
                return;
            }
            return;
        }
        C954003oA.LIZ(this, new AwS128S0201000_1(this, contentView, i, 2));
    }

    public final void up(String str) {
        SkuPanelAssemVM skuPanelAssemVMKp = getViewModel();
        C948503nH.LJI(skuPanelAssemVMKp, C23271099x.INSTANCE, new C041C(skuPanelAssemVMKp, str, null));
        skuPanelAssemVMKp.setStateImmediate(new AwS115S1100000_1(skuPanelAssemVMKp, str, 19));
    }

    public final void op(PdpButton pdpButton, C04E4 c04e4) {
        PdpBottomArea pdpBottomArea;
        PdpButtonAreaExtraInfo pdpButtonAreaExtraInfo;
        if (c04e4.isClickable()) {
            AnonymousClass0378.LIZ().LIZ("ec_sku_user_transform", C1741890vQh.LJIIIIZZ(C2097608Jq.LJIIJ(new Pair("trans_from_type", "1"))));
            ProductPackStruct productPackStruct = getViewModel().LLJIJIL;
            if (productPackStruct != null && (pdpBottomArea = productPackStruct.bottomArea) != null && (pdpButtonAreaExtraInfo = pdpBottomArea.pdpButtonAreaExtraInfo) != null && pdpButtonAreaExtraInfo.LIZ()) {
                C10296040w.LIZ.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C10296040w.LIZIZ);
                linkedHashMap.put("entrance_type", "add_to_cart_button");
                linkedHashMap.put("source_previous_page", "sku");
                C1018703yb.LIZIZ("tiktokec_shop_entrance_click", linkedHashMap);
            }
            Integer num = pdpButton.buttonStatus;
            int value = C043P.DISABLE.getValue();
            if (num != null && num.intValue() == value) {
                getViewModel().OQ2(null, pdpButton.clickHint);
                return;
            }
            String strYQ2 = getViewModel().yQ2();
            View contentView = getContentView();
            if (strYQ2 != null) {
                getViewModel().OQ2(null, hp().getResources().getString(2131832582, strYQ2));
                getViewModel().VQ2(strYQ2);
                getViewModel().UQ2("add_to_cart");
                up(strYQ2);
                return;
            }
            C954003oA.LIZ(this, new AwS402S0200000_1(contentView, this, 114));
        }
    }
}
