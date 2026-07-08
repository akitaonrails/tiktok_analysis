package com.ss.android.ugc.aweme.tako.botpage.cards.disclaimer;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C642550PIf;
import X.C643310PLd;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class AIBotPinnedDisclaimerCardProtocol implements ITakoCardProtocol<C642550PIf> {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C642550PIf> getDataType() {
        return C13LE.LIZ(C642550PIf.class);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C642550PIf> getConfig() {
        return new C643310PLd();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return AIBotPinnedDisclaimerCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        final String str = ((C642550PIf) interfaceC1858000yRy).LL;
        return new InterfaceC1891350zJl(str) { // from class: X.003K
            public final String LL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C003K) && Intrinsics.LJFF(this.LL, ((C003K) obj).LL);
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return null;
            }

            public final int hashCode() {
                return this.LL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AIBotPinnedDisclaimerItem(uuid=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LL = str;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                if (interfaceC1891350zJl instanceof C003K) {
                    return Intrinsics.LJFF(this.LL, ((C003K) interfaceC1891350zJl).LL);
                }
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final /* bridge */ /* synthetic */ boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        return true;
    }
}
