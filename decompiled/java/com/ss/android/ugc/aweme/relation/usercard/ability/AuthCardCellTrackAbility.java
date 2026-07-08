package com.ss.android.ugc.aweme.relation.usercard.ability;

import X.AbstractC1262510ixV;
import X.C01GW;
import X.C1072550e17;
import X.C1261270ivV;
import X.C1261380ivg;
import X.C1261740iwG;
import X.C1261760iwI;
import X.C1261770iwJ;
import X.C1263080iyQ;
import X.C2188811AlT;
import X.EnumC1070410dxf;
import X.InterfaceC1261750iwH;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.relation.usercard.config.AuthCardFreqParams;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class AuthCardCellTrackAbility implements ICellTrackAbility<C1261760iwI> {
    public final Function0<C1261270ivV> LL;
    public final Function1<Function1<? super InterfaceC1261750iwH, Unit>, Unit> LLILLJJLI;
    public final C01GW LLILLL;

    public final void LIZ(int i, C1261760iwI c1261760iwI) {
        C1261770iwJ c1261770iwJ = c1261760iwI.LLILZ;
        if (!((CopyOnWriteArraySet) ((C1263080iyQ) this.LLILLL.getValue()).LLJI).add(c1261770iwJ.getElementId())) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_permission_card_freq_");
        sbLIZ.append(C1261740iwG.LIZ());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        AuthCardFreqParams authCardFreqParams = new AuthCardFreqParams(10, 14, 14, 3);
        AbstractC1262510ixV abstractC1262510ixV = c1261770iwJ.LLILLJJLI;
        if (!abstractC1262510ixV.LIZJ && !abstractC1262510ixV.LIZLLL) {
            int i2 = 0;
            int i3 = repo.getInt(C1261740iwG.LIZIZ(c1261770iwJ, "key_exp_count_"), 0) + 1;
            if (i3 >= authCardFreqParams.maxExposureCount) {
                repo.storeLong(C1261740iwG.LIZIZ(c1261770iwJ, "key_auto_hide_ts_"), System.currentTimeMillis());
            } else {
                i2 = i3;
            }
            repo.storeInt(C1261740iwG.LIZIZ(c1261770iwJ, "key_exp_count_"), i2);
        }
        C1261270ivV c1261270ivVInvoke = this.LL.invoke();
        String str = c1261270ivVInvoke.LIZ;
        String str2 = c1261270ivVInvoke.LIZIZ;
        String str3 = c1261270ivVInvoke.LJ;
        String str4 = c1261270ivVInvoke.LIZLLL;
        EnumC1070410dxf enumC1070410dxf = c1261770iwJ.LL;
        String str5 = c1261270ivVInvoke.LJJI;
        if (str5 == null) {
            str5 = c1261270ivVInvoke.LJII;
        }
        new C1072550e17(str, str2, str3, str4, enumC1070410dxf, str5, c1261270ivVInvoke.LJJ).LIZLLL(null);
        Function1<Function1<? super InterfaceC1261750iwH, Unit>, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(new AwS127S0101000_19(c1261770iwJ, i, 3));
        }
    }

    public AuthCardCellTrackAbility(AwS563S0100000_19 awS563S0100000_19, C01GW c01gw, C1261380ivg c1261380ivg) {
        this.LL = awS563S0100000_19;
        this.LLILLJJLI = c1261380ivg;
        this.LLILLL = c01gw;
    }
}
