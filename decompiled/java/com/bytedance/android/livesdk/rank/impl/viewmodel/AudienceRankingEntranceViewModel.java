package com.bytedance.android.livesdk.rank.impl.viewmodel;

import X.C01O8;
import X.C01P5;
import X.C01P6;
import X.C01P8;
import X.C01PF;
import X.C09IR;
import X.C147600hO;
import X.C192000oY;
import X.C1BNE;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.EnumC187400no;
import X.EnumC2252401DDy;
import X.InterfaceC192300ob;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes.dex */
public final class AudienceRankingEntranceViewModel extends ViewModel {
    public final InterfaceC192300ob LL;
    public final C01PF LLILLJJLI;
    public final C192000oY LLILLL;
    public final C01O8 LLILZ;
    public final C01P8 LLILZIL;
    public final C2252321DDq LLILZLL;
    public final C2252321DDq LLIZ;
    public final C2252331DDr LLIZLLLIL;
    public final C2252331DDr LLJ;

    public final EnumC187400no vQ2() {
        try {
            EnumC187400no enumC187400noLJFF = this.LL.LJFF();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Current ranking type: ");
            sbLIZ.append(enumC187400noLJFF);
            C20441214yg.LIZIZ("AudienceRankingEntranceViewModel", C2188811AlT.LIZIZ(sbLIZ));
            return enumC187400noLJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Error getting current ranking type: ");
            sbLIZ2.append(e.getMessage());
            C20441214yg.LJFF("AudienceRankingEntranceViewModel", C2188811AlT.LIZIZ(sbLIZ2), e);
            return EnumC187400no.TOP_VIEWER;
        }
    }

    public AudienceRankingEntranceViewModel(DataChannel dataChannel, C147600hO c147600hO, C01PF c01pf, C192000oY c192000oY, C01O8 c01o8) {
        this.LL = c147600hO;
        this.LLILLJJLI = c01pf;
        this.LLILLL = c192000oY;
        this.LLILZ = c01o8;
        this.LLILZIL = new C01P8(dataChannel, ViewModelKt.getViewModelScope(this));
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LLILZLL = c2252321DDqLIZ;
        this.LLIZ = c2252321DDqLIZ;
        C2252331DDr c2252331DDrLIZ = C09IR.LIZ(0, 1, EnumC2252401DDy.DROP_OLDEST);
        this.LLIZLLLIL = c2252331DDrLIZ;
        this.LLJ = c2252331DDrLIZ;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C01P5(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C01P6(this, null), 3);
    }
}
