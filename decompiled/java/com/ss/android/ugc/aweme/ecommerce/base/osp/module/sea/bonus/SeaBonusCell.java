package com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.bonus;

import X.AnonymousClass0318;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C03U4;
import X.C03XA;
import X.C049Y;
import X.C10516049i;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaBonusCell extends ECPowerCell<AnonymousClass0318> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaBonusCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SeaBonusCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 355);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(84);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 346), awS545S0100000_1, AFwS207S0000000_19.get$arr$(132), new AwS545S0100000_1((C03K6) this, 347), new AwS545S0100000_1((C03K6) this, 349), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 351), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1138), null, new AwS545S0100000_1((C03K6) this, 353));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 348);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 350);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 352);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 53));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1139);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1140);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1141);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1142);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1143);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 354), awS545S0100000_1, AFwS207S0000000_19.get$arr$(133), new AwS545S0100000_1((C03K6) this, 356), new AwS545S0100000_1((C03K6) this, 357), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 358), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1144), null, new AwS545S0100000_1((C03K6) this, 359));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 360), awS545S0100000_1, AFwS207S0000000_19.get$arr$(134), new AwS545S0100000_1((C03K6) this, 361), new AwS545S0100000_1((C03K6) this, 362), new AwS545S0100000_1((C03K6) this, 344), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 345));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x01c8  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r25) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.bonus.SeaBonusCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.avi, viewGroup, false);
    }

    public final void N5(View view, BonusInfo bonusInfo, Map<String, ? extends Object> map) {
        C03U4 c03u4 = C03U4.LIZ;
        ExceptionUX exceptionUX = bonusInfo.redeemInfo;
        AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(38);
        AFwS185S0000000_1 aFwS185S0000000_12 = AFwS185S0000000_1.get$arr$(39);
        c03u4.getClass();
        C03U4.LIZ(view, exceptionUX, aFwS185S0000000_1, aFwS185S0000000_12, null, null);
        C1748720vbi.LIZLLL(view, new C10516049i(), new AwS210S0300000_1(this, (SeaBonusCell) map, (Map<String, ? extends Object>) bonusInfo, (BonusInfo) 14));
        C1748720vbi.LIZLLL(view, new C049Y(), new AwS367S0200000_1(bonusInfo, this, 64));
    }
}
