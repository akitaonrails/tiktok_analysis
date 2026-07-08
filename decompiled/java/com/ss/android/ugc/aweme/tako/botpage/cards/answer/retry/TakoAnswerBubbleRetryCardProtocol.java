package com.ss.android.ugc.aweme.tako.botpage.cards.answer.retry;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C1857060yQS;
import X.C326880Cre;
import X.C643310PLd;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import defpackage.d8;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerBubbleRetryCardProtocol implements ITakoCardProtocol<C326880Cre> {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C326880Cre> getDataType() {
        return C13LE.LIZ(C326880Cre.class);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326880Cre> getConfig() {
        return new C643310PLd();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return TakoAnswerBubbleRetryCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        int i;
        Function0<Unit> function0;
        C326880Cre c326880Cre = (C326880Cre) interfaceC1858000yRy;
        Message message = c326880Cre.LLILLL;
        d8 d8Var = c326880Cre.LLILZIL;
        int i2 = 0;
        if (d8Var != null) {
            i = 2131849656;
            i2 = 2131849655;
            function0 = d8Var.LIZ;
        } else {
            i = 0;
            function0 = null;
        }
        return new C1857060yQS(message, i, i2, function0);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        if (((C326880Cre) interfaceC1858000yRy).LLILLL.msgType == -7000) {
            return true;
        }
        return false;
    }
}
