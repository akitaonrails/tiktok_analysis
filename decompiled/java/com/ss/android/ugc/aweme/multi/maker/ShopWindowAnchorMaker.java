package com.ss.android.ugc.aweme.multi.maker;

import X.AbstractC1066890drz;
import X.C049Q;
import X.C1394880mP0;
import X.C1554610qYd;
import X.C1697810uHb;
import X.C2097908Jt;
import X.C2344009Gk;
import X.C2487409ou;
import X.C712520RxC;
import X.EnumC1050190dR3;
import X.EnumC1430380nKG;
import X.InterfaceC1164530gPT;
import X.InterfaceC1392590mLJ;
import X.InterfaceC1392640mLO;
import X.InterfaceC1393560mMs;
import X.InterfaceC1393740mNA;
import X.InterfaceC1394860mOy;
import X.InterfaceC665370Q7z;
import X.InterfaceC718610SGt;
import X.RunnableC1067870dtZ;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ShopWindowAnchorMaker extends AbstractC1066890drz implements InterfaceC1164530gPT, InterfaceC1393740mNA, FcpStandardPreloadProtocol {
    public final InterfaceC1394860mOy LLJ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIIZI();
    public boolean LLJI = true;
    public final RunnableC1067870dtZ LLJIJIL = new Runnable() { // from class: X.0dtZ
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("ShopWindowAnchorMaker@fcfe.enableAgainRunnable$1");
            try {
                this.LL.LLJI = true;
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("ShopWindowAnchorMaker@fcfe.enableAgainRunnable$1");
        }
    };
    public long LLJILJIL = -1;

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "webview";
    }

    @Override // X.AbstractC1066910ds1
    public final boolean LJIIL() {
        return true;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final String LIZLLL() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strLJI = this.LLJ.LJI(interfaceC1392640mLO.LJJLIIIJJIZ());
        return strLJI == null ? super.LIZLLL() : strLJI;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final CharSequence LJJIZ() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        return this.LLJ.LJII(interfaceC1392640mLO.LJJLIIIJJIZ());
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final InterfaceC1392590mLJ LJJJJJL() {
        return new C1394880mP0(this);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJJZ() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
        if (interfaceC665370Q7zK0 != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zK0, FcpStandardPreloadProtocol.class, this);
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final int LJJLI() {
        return this.LLJ.LJFF();
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> Yr2() {
        return C2097908Jt.LIZJ(new Pair(ShopWindowAnchorCustomPreloadTask.class, new AwS565S0100000_21(this, 701)));
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new ShopWindowAnchorMaker();
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void onBind() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
        if (interfaceC665370Q7zK0 != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7zK0, FcpStandardPreloadProtocol.class, C1697810uHb.LJIILJJIL(this));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> so1() {
        return C2097908Jt.LIZJ(new Pair(ShopWindowAnchorCustomPreloadTask.class, new InterfaceC718610SGt() { // from class: X.0mNJ
            @Override // X.InterfaceC718610SGt
            public final Bundle LIZ() {
                InterfaceC1392640mLO interfaceC1392640mLO = this.LIZ.LL;
                Boolean boolValueOf = interfaceC1392640mLO != null ? Boolean.valueOf(interfaceC1392640mLO.LJII()) : null;
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_single_anchor", boolValueOf != null ? boolValueOf.booleanValue() : false);
                return bundle;
            }
        }));
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        LJJIIJ(c2344009Gk);
        InterfaceC1394860mOy interfaceC1394860mOy = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        boolean zLJII = interfaceC1392640mLO.LJII();
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
        if (interfaceC1392640mLO3 != null) {
            interfaceC1392640mLO2 = interfaceC1392640mLO3;
        }
        interfaceC1394860mOy.LJIILIIL(false, c2344009Gk, zLJII, interfaceC1392640mLO2, new AwS600S0100000_21(this, 254));
    }

    @Override // X.InterfaceC1393740mNA
    public final void LJIIIZ(long j) {
        this.LLJILJIL = j;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393690mN5
    public final void LJIIJJI(C2344009Gk c2344009Gk) {
        InterfaceC1394860mOy interfaceC1394860mOy = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        boolean zLJII = interfaceC1392640mLO.LJII();
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
        if (interfaceC1392640mLO3 != null) {
            interfaceC1392640mLO2 = interfaceC1392640mLO3;
        }
        interfaceC1394860mOy.LJIILIIL(true, c2344009Gk, zLJII, interfaceC1392640mLO2, new AwS600S0100000_21(this, 254));
    }

    @Override // X.AbstractC1066890drz
    public final void LJJIFFI(AnchorCommonStruct anchorCommonStruct) {
        InterfaceC1394860mOy interfaceC1394860mOy = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        interfaceC1394860mOy.LJJII(anchorCommonStruct, interfaceC1392640mLO.LJJLIIIJJIZ());
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_page_show", this);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJJJI(SmartImageView smartImageView) {
        LJJIIZI(smartImageView, new AwS422S0200000_21(this, smartImageView, 45));
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        if (AwemeExtKt.isPhotoMode(LJIIZILJ()) && !((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIII(LJIIZILJ())) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                list.remove(it2.next());
            }
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct2);
        LJJIFFI(anchorCommonStruct2);
        LJIILIIL(anchorCommonStruct2);
        this.LLIZ = anchorCommonStruct2;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LLLIZZ(Aweme aweme) {
        this.LLJ.LJIJJ(aweme, new AwS565S0100000_21(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        super.p1(c2344009Gk);
        InterfaceC1394860mOy interfaceC1394860mOy = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        boolean zLJII = interfaceC1392640mLO.LJII();
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
        if (interfaceC1392640mLO3 != null) {
            interfaceC1392640mLO2 = interfaceC1392640mLO3;
        }
        interfaceC1394860mOy.LJIIIZ(c2344009Gk, zLJII, interfaceC1392640mLO2, new C1394880mP0(this).LJ());
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        if (this.LLJI) {
            this.LLJI = false;
            C2487409ou.LIZLLL(300L, this.LLJIJIL);
            InterfaceC1394860mOy interfaceC1394860mOy = this.LLJ;
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            interfaceC1394860mOy.LJIIIIZZ(view, true, interfaceC1392640mLO, c2344009Gk, new AwS600S0100000_21(this, 260));
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLZIJ(C2344009Gk c2344009Gk, boolean z) {
        InterfaceC1394860mOy interfaceC1394860mOy = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        interfaceC1394860mOy.LJIIL(c2344009Gk, z, interfaceC1392640mLO);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        int iIntValue;
        if (Intrinsics.LJFF(str, "ec_cart_refresh")) {
            InterfaceC1394860mOy interfaceC1394860mOy = this.LLJ;
            Integer num = C049Q.LIZ(str2).count;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            interfaceC1394860mOy.LJIJI(iIntValue);
            return;
        }
        if (!Intrinsics.LJFF(str, "ec_page_destroy")) {
            return;
        }
        InterfaceC1394860mOy interfaceC1394860mOy2 = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        interfaceC1392640mLO.LJJLIIIJJIZ();
        interfaceC1394860mOy2.LJIILLIIL(str2);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void yg(Activity activity, Dialog dialog) {
        if (Intrinsics.LJFF(LJIILJJIL().getLocalClassName(), activity.getLocalClassName())) {
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            if (!interfaceC1392640mLO.LJII()) {
                this.LLJ.LJIILJJIL(this.LLJILJIL, dialog);
            }
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void It(View view, Aweme aweme, boolean z) {
        this.LLJ.LJJIFFI(aweme, view, z, new AwS565S0100000_21(this, 1258));
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJLIIIJ(C712520RxC c712520RxC, String str, boolean z) {
        InterfaceC1394860mOy interfaceC1394860mOy = this.LLJ;
        String strLJIJJLI = LJIJJLI();
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        interfaceC1394860mOy.LJJI(z, strLJIJJLI, interfaceC1392640mLO);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393690mN5
    public final View LJI(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        InterfaceC1394860mOy interfaceC1394860mOy = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        interfaceC1394860mOy.LJJIIZ(viewGroup, c2344009Gk, false, interfaceC1392640mLO);
        return null;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        InterfaceC1394860mOy interfaceC1394860mOy = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        interfaceC1394860mOy.LJJIIZ(viewGroup, c2344009Gk, true, interfaceC1392640mLO);
        return null;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLIIL(C712520RxC c712520RxC, Dialog dialog, boolean z, boolean z2, boolean z3) {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        if (!interfaceC1392640mLO.LJII()) {
            this.LLJ.LJIL(z, dialog, z2);
        }
    }
}
