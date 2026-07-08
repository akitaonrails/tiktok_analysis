package com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.protocol;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C0R2S;
import X.C123100dR;
import X.C13IQ;
import X.C14NH;
import X.C1857770yRb;
import X.C1858670yT3;
import X.C1858840yTK;
import X.C2188811AlT;
import X.C326880Cre;
import X.C643300PLc;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoServerCardProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNimbleConfig;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoFlexNimbleCardProtocol implements ITakoServerCardProtocol {
    public final C0R2S LL = C643300PLc.LIZ;

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C326880Cre> getDataType() {
        return C1857770yRb.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return TakoFlexAnswerNimbleCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326880Cre> getConfig() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        return new C1858840yTK((C326880Cre) interfaceC1858000yRy);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        Integer numValueOf;
        TakoNimbleConfig takoNimbleConfig;
        String str;
        String str2;
        C326880Cre c326880Cre = (C326880Cre) interfaceC1858000yRy;
        if (!C1858670yT3.LJIIIZ(c326880Cre.LLILLL)) {
            TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
            String str3 = null;
            if (takoMixFeedLJIIIZ != null) {
                numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
            } else {
                numValueOf = null;
            }
            TakoMixFeed takoMixFeedLJIIIZ2 = c326880Cre.LLILLL.LJIIIZ();
            if (takoMixFeedLJIIIZ2 != null) {
                takoNimbleConfig = takoMixFeedLJIIIZ2.nimbleConfig;
            } else {
                takoNimbleConfig = null;
            }
            C14NH c14nh = C14NH.LIZ;
            if (takoNimbleConfig != null) {
                str = takoNimbleConfig.nimbleKey;
            } else {
                str = null;
            }
            c14nh.getClass();
            C14NH.LJIILJJIL(numValueOf, str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cardMatch: ");
            sbLIZ.append(numValueOf);
            sbLIZ.append(" RenderInterface.getCardTemplate(cardType)  ");
            sbLIZ.append(C14NH.LJI(numValueOf));
            sbLIZ.append("  nimbleConfig?.nimbleKey:");
            if (takoNimbleConfig != null) {
                str2 = takoNimbleConfig.nimbleKey;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (C14NH.LJI(numValueOf) != null) {
                if (takoNimbleConfig != null) {
                    str3 = takoNimbleConfig.nimbleKey;
                }
                if (C123100dR.LIZ(str3) && !C1858670yT3.LJII(c326880Cre.LLILLL) && !c326880Cre.LLILLL.sender.isSelf) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
