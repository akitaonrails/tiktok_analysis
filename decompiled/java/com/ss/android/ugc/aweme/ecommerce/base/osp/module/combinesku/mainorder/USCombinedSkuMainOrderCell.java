package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.mainorder;

import X.AnonymousClass0485;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03IT;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C0H1U;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C719102rN;
import X.C720402ra;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C7931037x;
import X.C799403Ai;
import X.C939703lr;
import X.EnumC1334360kpO;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USCombinedSkuMainOrderCell extends ECPowerCell<C720402ra> implements InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final LinkedList<C7931037x> LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USCombinedSkuMainOrderCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void U5() {
        C736680Sv4.LJIIIIZZ(this, T5(), new C2217381BqS() { // from class: X.03Xv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLZLZ;
            }
        }, null, new AwS615S0100000_1(this, 21), 6);
        C736680Sv4.LJIIIIZZ(this, T5(), new C2217381BqS() { // from class: X.03Xt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS615S0100000_1(this, 22), 6);
    }

    public USCombinedSkuMainOrderCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 204);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(73);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 186), awS545S0100000_1, AFwS207S0000000_19.get$arr$(111), new AwS545S0100000_1((C03K6) this, 190), new AwS545S0100000_1((C03K6) this, 192), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 194), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1089), null, new AwS545S0100000_1((C03K6) this, 195));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 189);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 191);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 193);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 46));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1090);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1091);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1092);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1093);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1094);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 202), awS545S0100000_1, AFwS207S0000000_19.get$arr$(112), new AwS545S0100000_1((C03K6) this, 207), new AwS545S0100000_1((C03K6) this, 209), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 211), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1095), null, new AwS545S0100000_1((C03K6) this, 214));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 216), awS545S0100000_1, AFwS207S0000000_19.get$arr$(113), new AwS545S0100000_1((C03K6) this, 219), new AwS545S0100000_1((C03K6) this, 221), new AwS545S0100000_1((C03K6) this, 223), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 224));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 199));
        this.LLJIJIL = new LinkedList<>();
        this.LLJILJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 201));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 206));
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 203));
        this.LLJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 208));
        this.LLJJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 210));
        this.LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 212));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 205));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 217));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 215));
        this.LLJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 200));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 213));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 218));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 220));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 197));
        this.LLJJL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 185));
        this.LLJL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 222));
        this.LLJLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 198));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 196));
        this.LLJLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 187));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 188));
    }

    public final TuxTextView L5() {
        return (TuxTextView) this.LLJJ.getValue();
    }

    public final SmartImageView N5() {
        return (SmartImageView) this.LLJJIJIIJIL.getValue();
    }

    public final TuxTextView P5() {
        return (TuxTextView) this.LLJJJJJIL.getValue();
    }

    public final C939703lr R5() {
        return (C939703lr) this.LLJL.getValue();
    }

    public final TuxTextView S5() {
        return (TuxTextView) this.LLJLL.getValue();
    }

    public final OrderSubmitAssemViewModel T5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell
    public final void I5() {
        ModuleManager moduleManager = T5().LLZIL;
        if (moduleManager != null) {
            moduleManager.LIZ("shop_orders_new", this.itemView);
        }
        ModuleManager moduleManager2 = T5().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJIIJJI(this.LLIZ - this.LLILZLL, "shop_orders_new");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        U5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_osp_promotion_event", this);
        }
    }

    public final void V5(Image image) {
        C03IT thumbFirstImageUrlModel;
        HashMap<String, Object> map;
        SmartImageView smartImageView = (SmartImageView) this.LLJJIJI.getValue();
        if (image != null && (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) != null) {
            C03O0.LIZ.getClass();
            C03O0.LJJIFFI = SystemClock.elapsedRealtime();
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
            c1331670kl3LIZLLL.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LIZLLL.LIZLLL("combined_sku_product_image_tag");
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            smartImageView.setColorFilter(134217728);
            if ((T5().LL == 0 || T5().LL == 2) && (map = T5().LLLIL) != null) {
                C03O0.LJIIJ(!thumbFirstImageUrlModel.LIZ() ? 1 : 0, map);
            }
        }
        C1748720vbi.LIZLLL(smartImageView, new AnonymousClass0485(), AFwS228S0000000_1.get$arr$(74));
        C786410Ut5.I7(new AjS40S0200000_1(this, smartImageView, 13), smartImageView);
    }

    public final void W5(long j) {
        if (j <= 0) {
            C0H1U.LIZIZ(P5());
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j2 = 60;
        C0H1U.LJIIL(P5(), C786410Ut5.j4("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % j2), Long.valueOf(timeUnit.toSeconds(j) % j2)}, 3)), true);
        P5().setTextColorRes(R.attr.a1q);
    }

    /* JADX WARN: Removed duplicated region for block: B:271:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ad  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r25) {
        /*
            Method dump skipped, instruction units count: 1867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.mainorder.USCombinedSkuMainOrderCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b0o, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        C720402ra c720402ra;
        C719102rN c719102rN;
        String str3;
        if (Intrinsics.LJFF(str, "ec_osp_promotion_event")) {
            ITEM item = getItem();
            if ((item instanceof C720402ra) && item != 0 && (c720402ra = (C720402ra) getItem()) != null && (c719102rN = c720402ra.LLJI) != null && (str3 = c719102rN.LLILZLL) != null) {
                C799403Ai.LIZ.getClass();
                Long lLIZJ = C799403Ai.LIZJ(str3);
                if (lLIZJ != null) {
                    W5(lLIZJ.longValue());
                }
            }
        }
    }
}
