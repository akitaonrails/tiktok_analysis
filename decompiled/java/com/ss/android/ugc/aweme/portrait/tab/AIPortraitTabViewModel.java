package com.ss.android.ugc.aweme.portrait.tab;

import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C09IC;
import X.C09IR;
import X.C0C64;
import X.C13LP;
import X.C1687000u0A;
import X.C1687150u0P;
import X.C1687170u0R;
import X.C1BNE;
import X.C1E3A;
import X.C1E3B;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C2275191E3p;
import X.C23250099c;
import X.C316290CaZ;
import X.C316340Cae;
import X.C548880Lfq;
import X.C549290LgV;
import X.C557300LtQ;
import X.C558690Lvf;
import X.C569820MWm;
import X.C569830MWn;
import X.EnumC1419230n2H;
import X.EnumC550430LiL;
import X.EnumC550780Liu;
import X.InterfaceC1665500tRU;
import X.InterfaceC549230LgP;
import X.InterfaceC550750Lir;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS0S2501000_8;
import kotlin.jvm.internal.AwS122S1100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitTabViewModel extends ViewModel {
    public final C1687000u0A LL = new C1687000u0A(0);
    public final Set<Integer> LLILLJJLI = new LinkedHashSet();
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public Integer LLILZLL;
    public AIGCEntranceInfo LLIZ;
    public String LLIZLLLIL;
    public EnumC550780Liu LLJ;
    public final C2252321DDq LLJI;
    public final AnonymousClass0951 LLJIJIL;
    public final C2252331DDr LLJILJIL;
    public final AnonymousClass0950 LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public AnonymousClass0956 LLJJ;
    public boolean LLJJI;

    public final void wQ2() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        BQ2(null, true);
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        AIGCEntranceInfo aIGCEntranceInfoYQ2 = yQ2();
        String str = this.LLIZLLLIL;
        EnumC550780Liu enumC550780Liu = this.LLJ;
        c1687150u0P.getClass();
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C2275191E3p c2275191E3p = C2275191E3p.LJII;
        AwS122S1100000_8 awS122S1100000_8 = new AwS122S1100000_8(str, enumC550780Liu, 9);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c2275191E3p, aIGCEntranceInfoYQ2, awS122S1100000_8);
    }

    public final void xQ2() {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        AIGCEntranceInfo aIGCEntranceInfoYQ2 = yQ2();
        String str = this.LLIZLLLIL;
        EnumC550780Liu enumC550780Liu = this.LLJ;
        c1687150u0P.getClass();
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C2275191E3p c2275191E3p = C2275191E3p.LJII;
        AwS122S1100000_8 awS122S1100000_8 = new AwS122S1100000_8(str, enumC550780Liu, 11);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c2275191E3p, aIGCEntranceInfoYQ2, awS122S1100000_8);
    }

    public final AIGCEntranceInfo yQ2() {
        InterfaceC550750Lir interfaceC550750LirG9;
        C549290LgV c549290LgV;
        AIGCEntranceInfo aIGCEntranceInfo = this.LLIZ;
        if (aIGCEntranceInfo == null) {
            return null;
        }
        InterfaceC549230LgP interfaceC549230LgP = ((C569820MWm) this.LLJIJIL.getValue()).LIZ;
        if (interfaceC549230LgP == null || (interfaceC549230LgP instanceof C558690Lvf)) {
            return aIGCEntranceInfo;
        }
        if ((interfaceC549230LgP instanceof C549290LgV) && (c549290LgV = (C549290LgV) interfaceC549230LgP) != null) {
            return AIGCEntranceInfo.LIZ(aIGCEntranceInfo, null, null, 1, null, c549290LgV.LIZLLL, false, false, false, null, null, null, null, null, null, false, false, 1048555);
        }
        AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
        return AIGCEntranceInfo.LIZ(aIGCEntranceInfo, null, null, (aITheaterProfileService == null || (interfaceC550750LirG9 = aITheaterProfileService.g9()) == null) ? 0 : interfaceC550750LirG9.LJFF(), null, null, false, false, false, null, null, null, null, null, null, false, false, 1048555);
    }

    public final void zQ2() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        AIGCEntranceInfo aIGCEntranceInfoYQ2 = yQ2();
        String str = this.LLIZLLLIL;
        EnumC550780Liu enumC550780Liu = this.LLJ;
        c1687150u0P.getClass();
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C2275191E3p c2275191E3p = C2275191E3p.LJII;
        AwS122S1100000_8 awS122S1100000_8 = new AwS122S1100000_8(str, enumC550780Liu, 13);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c2275191E3p, aIGCEntranceInfoYQ2, awS122S1100000_8);
    }

    public AIPortraitTabViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C569820MWm(C558690Lvf.LIZ, null, null, true, false, false, null, false));
        this.LLJI = c2252321DDqLIZ;
        this.LLJIJIL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJILJIL = c2252331DDrLIZIZ;
        this.LLJILJILJ = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLJILLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C316290CaZ(this, null), 3);
    }

    public final InterfaceC549230LgP AQ2() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ai_portrait_debug_mock_cameo_state", true) == 1) {
            return new C316340Cae(null);
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ai_portrait_debug_mock_cameo_state", true) == 2) {
            return C557300LtQ.LIZ;
        }
        return null;
    }

    public final void vQ2(int i) {
        PortraitStyleItem portraitStyleItem;
        Integer numValueOf;
        this.LLILZLL = Integer.valueOf(i);
        InterfaceC1665500tRU<PortraitStyleItem> interfaceC1665500tRU = ((C569820MWm) this.LLJIJIL.getValue()).LIZJ;
        if (interfaceC1665500tRU != null && (portraitStyleItem = (PortraitStyleItem) C13LP.LJJJLZIJ(i, interfaceC1665500tRU)) != null && this.LLILLJJLI.add(Integer.valueOf(i))) {
            C1687150u0P c1687150u0P = C1687150u0P.LIZ;
            AIGCEntranceInfo aIGCEntranceInfoYQ2 = yQ2();
            String str = this.LLIZLLLIL;
            String str2 = portraitStyleItem.styleId;
            EnumC1419230n2H enumC1419230n2H = portraitStyleItem.styleType;
            int i2 = i + 1;
            RefImageType refImageType = RefImageType.PRESET;
            EnumC550430LiL enumC550430LiL = EnumC550430LiL.PRESET;
            String str3 = portraitStyleItem.prompt;
            if (str3 != null) {
                numValueOf = Integer.valueOf(str3.length());
            } else {
                numValueOf = null;
            }
            EnumC550780Liu enumC550780Liu = this.LLJ;
            c1687150u0P.getClass();
            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
            C2275191E3p c2275191E3p = C2275191E3p.LJII;
            AwS0S2501000_8 awS0S2501000_8 = new AwS0S2501000_8(str, str2, enumC1419230n2H, i2, refImageType, enumC550430LiL, numValueOf, enumC550780Liu, 1);
            c548880Lfq.getClass();
            C548880Lfq.LIZLLL(c2275191E3p, aIGCEntranceInfoYQ2, awS0S2501000_8);
        }
    }

    public final void BQ2(String str, boolean z) {
        AIGCEntranceInfo aIGCEntranceInfoYQ2 = yQ2();
        C1687170u0R c1687170u0R = new C1687170u0R(aIGCEntranceInfoYQ2, this.LLIZLLLIL, "proactive_create_cameo", C569830MWn.LIZIZ(((C569820MWm) this.LLJIJIL.getValue()).LIZ), "aicreation_subpage", str);
        if (z) {
            C1687150u0P.LIZ.getClass();
            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
            C1E3B c1e3b = C1E3B.LJIIIIZZ;
            AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(c1687170u0R, 574);
            c548880Lfq.getClass();
            C548880Lfq.LIZLLL(c1e3b, aIGCEntranceInfoYQ2, awS587S0100000_8);
            return;
        }
        C1687150u0P.LIZ.getClass();
        C548880Lfq c548880Lfq2 = C548880Lfq.LIZ;
        C1E3A c1e3a = C1E3A.LJIIIIZZ;
        AwS587S0100000_8 awS587S0100000_82 = new AwS587S0100000_8(c1687170u0R, 573);
        c548880Lfq2.getClass();
        C548880Lfq.LIZLLL(c1e3a, aIGCEntranceInfoYQ2, awS587S0100000_82);
    }
}
