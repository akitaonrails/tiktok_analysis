package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.powerlist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C07MW;
import X.C09R3;
import X.C13LE;
import X.C1731700vAG;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C290160BYw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.viewmodel.ProductListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductListCell extends PowerCell<C1731700vAG> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProductListCell.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ProductListCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/productlist/viewmodel/ProductListViewModel;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ProductListCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BillboardGlobalViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 950);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(383);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 937), awS570S0100000_26, AFwS215S0000000_26.get$arr$(218), new AwS570S0100000_26((C03K6) this, 927), new AwS570S0100000_26((C03K6) this, 938), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 941), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 944), null, new AwS570S0100000_26((C03K6) this, 947));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 923);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 925);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 928);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 48));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 933);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 936);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 939);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 942);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 945);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 948), awS570S0100000_26, AFwS215S0000000_26.get$arr$(217), new AwS570S0100000_26((C03K6) this, 952), new AwS570S0100000_26((C03K6) this, 954), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 956), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 958), null, new AwS570S0100000_26((C03K6) this, 960));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 961), awS570S0100000_26, AFwS215S0000000_26.get$arr$(219), new AwS570S0100000_26((C03K6) this, 963), new AwS570S0100000_26((C03K6) this, 965), new AwS570S0100000_26((C03K6) this, 911), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 914));
        }
        this.LL = assemVMLazy;
        Object obj2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ProductListViewModel.class);
        AwS570S0100000_26 awS570S0100000_2610 = new AwS570S0100000_26(c19719912DlLIZ2, 917);
        AFwS268S0000000_26 aFwS268S0000000_262 = AFwS268S0000000_26.get$arr$(382);
        if (Intrinsics.LJFF(obj2, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ2, 922), awS570S0100000_2610, AFwS215S0000000_26.get$arr$(216), new AwS570S0100000_26((C03K6) this, 926), new AwS570S0100000_26((C03K6) this, 929), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 931), aFwS268S0000000_262, new AwS570S0100000_26((C03K6) this, 934), null, new AwS570S0100000_26((C03K6) this, 940));
        } else if (obj2 instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_2611 = new AwS570S0100000_26((C03K6) this, 943);
            AwS570S0100000_26 awS570S0100000_2612 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 946);
            AwS570S0100000_26 awS570S0100000_2613 = new AwS570S0100000_26(c19719912DlLIZ2, 949);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj2, awS570S0100000_2611, 49));
            AwS570S0100000_26 awS570S0100000_2614 = new AwS570S0100000_26(c01gwLIZIZ2, 951);
            AwS570S0100000_26 awS570S0100000_2615 = new AwS570S0100000_26(c01gwLIZIZ2, 953);
            AwS570S0100000_26 awS570S0100000_2616 = new AwS570S0100000_26(c01gwLIZIZ2, 955);
            AwS570S0100000_26 awS570S0100000_2617 = new AwS570S0100000_26(c01gwLIZIZ2, 957);
            AwS570S0100000_26 awS570S0100000_2618 = new AwS570S0100000_26(c01gwLIZIZ2, 959);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS570S0100000_2613, awS570S0100000_2610, new C452080Ho6(), awS570S0100000_2614, awS570S0100000_2615, awS570S0100000_2612, aFwS268S0000000_262, awS570S0100000_2616, awS570S0100000_2617, awS570S0100000_2618);
        } else if (Intrinsics.LJFF(obj2, obj2)) {
            assemVMLazy2 = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ2, 962), awS570S0100000_2610, AFwS215S0000000_26.get$arr$(220), new AwS570S0100000_26((C03K6) this, 964), new AwS570S0100000_26((C03K6) this, 966), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 912), aFwS268S0000000_262, new AwS570S0100000_26((C03K6) this, 915), null, new AwS570S0100000_26((C03K6) this, 918));
        } else {
            if (!Intrinsics.LJFF(obj2, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj2);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ2, 920), awS570S0100000_2610, AFwS215S0000000_26.get$arr$(215), new AwS570S0100000_26((C03K6) this, 924), new AwS570S0100000_26((C03K6) this, 930), new AwS570S0100000_26((C03K6) this, 932), aFwS268S0000000_262, null, null, new AwS570S0100000_26((C03K6) this, 935));
        }
        this.LLILLJJLI = assemVMLazy2;
        this.LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 921));
        this.LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 916));
        this.LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 919));
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 913));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a A[SYNTHETIC] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r18) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.powerlist.ProductListCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
            return PowerCell.inflateItemView$default(this, viewGroup, R.layout.buw, false, 4, null);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.buw, viewGroup, false);
    }
}
