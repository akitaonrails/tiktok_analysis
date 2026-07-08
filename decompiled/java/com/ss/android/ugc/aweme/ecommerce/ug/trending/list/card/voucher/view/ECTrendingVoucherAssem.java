package com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.voucher.view;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C1743050vSZ;
import X.C1748730vbj;
import X.C1776220wK4;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1748860vbw;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes27.dex */
public final class ECTrendingVoucherAssem extends ReusedUISlotAssem<ECTrendingVoucherAssem> implements InterfaceC712990Rxx<C1743050vSZ> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public C1743050vSZ LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public C197039127h LLJLL;
    public TuxTextView LLJLLIL;
    public ConstraintLayout LLJLLL;
    public View LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECTrendingVoucherAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/ug/trending/list/vm/TrendingListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ECTrendingVoucherAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrendingListViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 355), AFwS264S0000000_24.get$arr$(102), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bt6;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TrendingListViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        return (TrendingListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById;
        ConstraintLayout constraintLayout;
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.fww);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.fwx);
        this.LLJLL = (C197039127h) view.findViewById(R.id.yjv);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.ykh);
        this.LLJLLL = (ConstraintLayout) view.findViewById(R.id.ykt);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            viewFindViewById = c19egLIZ.findViewById(R.id.ykr);
        } else {
            viewFindViewById = null;
        }
        this.LLJZ = viewFindViewById;
        Context context = getContext();
        if (context != null && (constraintLayout = this.LLJLLL) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.aks);
            c384050F3z.LJIIIIZZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            c384050F3z.LJIIJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            c384050F3z.LJIIIZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            c384050F3z.LJIIJJI = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            constraintLayout.setBackground(c384050F3z.LIZ(context));
        }
        C2211751BhN.LIZ(view, new C1776220wK4(this, 2));
        C1748730vbj.LJ(LJJIJL(), new InterfaceC1748860vbw() { // from class: X.0vSd
            @Override // X.InterfaceC1748860vbw
            public final void Q3(C1748770vbn c1748770vbn) {
                Map<String, Object> map;
                C1743050vSZ c1743050vSZ = this.LL.LLJL;
                if (c1743050vSZ != null && (map = c1743050vSZ.LLILZIL) != null) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS140S1100000_26(entry.getKey(), entry.getValue(), 17));
                    }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1743050vSZ r11) {
        /*
            r10 = this;
            X.0vSZ r11 = (X.C1743050vSZ) r11
            r4 = r10
            r4.LLJL = r11
            java.lang.String r0 = r11.LLILZ
            int r0 = r0.length()
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L66
            if (r2 == 0) goto L66
            com.bytedance.tux.input.TuxTextView r1 = r4.LLJLLIL
            if (r1 == 0) goto L1a
            java.lang.String r0 = r11.LLILZ
            r1.setText(r0)
        L1a:
            com.bytedance.tux.input.TuxTextView r0 = r4.LLJLLIL
            if (r0 == 0) goto L66
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L21:
            com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel r5 = r4.op()
            X.0vSe r6 = new X.C2217381BqS() { // from class: X.0vSe
                static {
                    /*
                        X.0vSe r0 = new X.0vSe
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0vSe) X.0vSe.LL X.0vSe
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1743100vSe.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0vSA> r3 = X.C1742800vSA.class
                        java.lang.String r2 = "getHasClaimVoucher()Z"
                        r1 = 0
                        java.lang.String r0 = "hasClaimVoucher"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1743100vSe.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0vSA r2 = (X.C1742800vSA) r2
                        boolean r0 = r2.LLIZLLLIL
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1743100vSe.get(java.lang.Object):java.lang.Object");
                }
            }
            r7 = 0
            r0 = 54
            kotlin.jvm.internal.AFwS313S0000000_26 r8 = kotlin.jvm.internal.AFwS313S0000000_26.get$arr$(r0)
            r9 = 6
            X.C736680Sv4.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.WesternChannelVoucherListData r0 = r11.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ChannelVoucherModule r0 = r0.voucher
            if (r0 == 0) goto L63
            java.util.List<? extends java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.voucherList
            if (r0 == 0) goto L63
            java.lang.Object r3 = X.C13LP.LJJJLL(r0)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L63
            X.127h r1 = r4.LLJLL
            if (r1 == 0) goto L55
            android.view.View r0 = r4.LLJZ
            if (r0 == 0) goto L64
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L64
        L52:
            r1.LJJLI(r2)
        L55:
            X.127h r2 = r4.LLJLL
            if (r2 == 0) goto L63
            Y.ACListenerS90S0300000_26 r1 = new Y.ACListenerS90S0300000_26
            r0 = 12
            r1.<init>(r4, r3, r11, r0)
            X.C786410Ut5.U8(r2, r1)
        L63:
            return
        L64:
            r2 = 0
            goto L52
        L66:
            com.bytedance.tux.input.TuxTextView r1 = r4.LLJLLIL
            if (r1 == 0) goto L21
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.voucher.view.ECTrendingVoucherAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1743050vSZ c1743050vSZ) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1743050vSZ c1743050vSZ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
