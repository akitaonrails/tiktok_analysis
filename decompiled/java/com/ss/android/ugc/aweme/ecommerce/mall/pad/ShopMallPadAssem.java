package com.ss.android.ugc.aweme.ecommerce.mall.pad;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C12ES;
import X.C13LE;
import X.C1637806bA;
import X.C1771910wD7;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C844470XAv;
import X.EnumC599720Nfe;
import X.InterfaceC2217461Bqa;
import X.InterfaceC599750Nfh;
import X.InterfaceC827860Wdk;
import Y.AObserverS228S0100000_26;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopMallPadAssem extends AbstractC738140SxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShopMallPadAssem.class, "shopMixVM", "getShopMixVM()Lcom/ss/android/ugc/aweme/ecommerce/mall/mixhome/ShopMallMixViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ShopMallPadAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShopMallMixViewModel.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1396), AFwS268S0000000_26.get$arr$(280), null, true);
    }

    public final ShopMallMixViewModel bo() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return (ShopMallMixViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        int iLIZJ = C1771910wD7.LIZJ();
        int iLIZ = ((InterfaceC827860Wdk) C1771910wD7.LIZ.getValue()).LIZ();
        bo().globalContext.LJ("is_pad", String.valueOf(iLIZJ), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        m185do(iLIZ == 1);
        bo().LLILZIL.observe(this, new AObserverS228S0100000_26(this, 1));
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m185do(boolean z) {
        String str;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        bo().globalContext.LJ("pad_screen_width", Integer.valueOf(C12ES.LJIILJJIL(C12ES.LJIIJ(contextLIZ), contextLIZ)), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        bo().globalContext.LJ("pad_screen_height", Integer.valueOf(C12ES.LJIILJJIL(C12ES.LJIIIIZZ(contextLIZ), contextLIZ)), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        InterfaceC599750Nfh interfaceC599750Nfh = bo().globalContext;
        if (z) {
            str = "Landscape";
        } else {
            str = "Portrait";
        }
        interfaceC599750Nfh.LJ("screenOrientation", str, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
    }
}
