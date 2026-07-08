package com.ss.android.ugc.aweme.tako.nimblecard;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C07IK;
import X.C0R2S;
import X.C0R2X;
import X.C13IQ;
import X.C13LP;
import X.C1849107Mb;
import X.C1857770yRb;
import X.C1857820yRg;
import X.C1858830yTJ;
import X.C20039913b3;
import X.C2188811AlT;
import X.C326880Cre;
import X.C643300PLc;
import X.C685310QuP;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.nimblecard.model.NimbleJson;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCardProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoAnswerNimbleCardProtocol implements ITakoAnswerCardProtocol {
    public final C0R2S LL = C643300PLc.LIZ;

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C326880Cre> getDataType() {
        return C1857770yRb.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return TakoAnswerNimbleCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326880Cre> getConfig() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCardProtocol
    public final boolean Hq(C326880Cre c326880Cre) {
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        if (((Number) C07IK.LIZ.getValue()).intValue() == 1) {
            C20039913b3 c20039913b3 = C20039913b3.LIZ;
            TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
            if (takoMixFeedLJIIIZ != null) {
                numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
            } else {
                numValueOf = null;
            }
            c20039913b3.getClass();
            if (numValueOf != null) {
                numValueOf.intValue();
                if (!C20039913b3.LJFF.contains(numValueOf)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("settingJson:");
                    sbLIZ.append(C685310QuP.LIZ(C20039913b3.LIZLLL));
                    sbLIZ.append(",fullJson:");
                    sbLIZ.append(C685310QuP.LIZ(C20039913b3.LIZJ));
                    sbLIZ.append(",assetJson:");
                    sbLIZ.append(C685310QuP.LIZ(C20039913b3.LJ));
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (!C13LP.LJJJJ(numValueOf, C0R2X.LIZ)) {
                        C20039913b3.LJ(c326880Cre, numValueOf.intValue(), "", "", CardStruct.IStatusCode.DEFAULT, strLIZIZ);
                    }
                } else {
                    if (C685310QuP.LIZIZ(C20039913b3.LIZLLL, numValueOf.intValue()) != null) {
                        int iIntValue = numValueOf.intValue();
                        NimbleJson nimbleJson = C20039913b3.LIZLLL;
                        if (nimbleJson != null) {
                            str3 = nimbleJson.version;
                        } else {
                            str3 = null;
                        }
                        C20039913b3.LJ(c326880Cre, iIntValue, str3, C1849107Mb.LIZ(), "1", null);
                        return true;
                    }
                    if (C685310QuP.LIZIZ(C20039913b3.LIZJ, numValueOf.intValue()) != null) {
                        int iIntValue2 = numValueOf.intValue();
                        NimbleJson nimbleJson2 = C20039913b3.LIZJ;
                        if (nimbleJson2 != null) {
                            str2 = nimbleJson2.version;
                        } else {
                            str2 = null;
                        }
                        C20039913b3.LJ(c326880Cre, iIntValue2, str2, "tako_nimble_conf", "1", null);
                        return true;
                    }
                    NimbleJson nimbleJson3 = C20039913b3.LJ;
                    if (C685310QuP.LIZIZ(nimbleJson3, numValueOf.intValue()) != null) {
                        int iIntValue3 = numValueOf.intValue();
                        if (nimbleJson3 != null) {
                            str = nimbleJson3.version;
                        } else {
                            str = null;
                        }
                        C20039913b3.LJ(c326880Cre, iIntValue3, str, "asset", "1", null);
                        return true;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("settingJson:");
                    sbLIZ2.append(C685310QuP.LIZ(C20039913b3.LIZLLL));
                    sbLIZ2.append(",fullJson:");
                    sbLIZ2.append(C685310QuP.LIZ(C20039913b3.LIZJ));
                    sbLIZ2.append(",assetJson:");
                    sbLIZ2.append(C685310QuP.LIZ(nimbleJson3));
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    if (!C13LP.LJJJJ(numValueOf, C0R2X.LIZ)) {
                        C20039913b3.LJ(c326880Cre, numValueOf.intValue(), "", "", CardStruct.IStatusCode.DEFAULT, strLIZIZ2);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        return new C1858830yTJ((C326880Cre) interfaceC1858000yRy);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        return C1857820yRg.LIZ(this, (C326880Cre) interfaceC1858000yRy);
    }
}
