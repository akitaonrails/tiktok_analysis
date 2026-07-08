package com.ss.android.ugc.profile.business.effect;

import X.AnonymousClass0950;
import X.C004I;
import X.C01GW;
import X.C09IC;
import X.C09IR;
import X.C0PEM;
import X.C11NZ;
import X.C1761680vwc;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C318050CdP;
import X.C452501pT;
import X.C889780YvQ;
import X.EnumC861260XqW;
import X.InterfaceC1397970mTz;
import X.InterfaceC318100CdU;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectProfileListViewModel extends CommonListViewModel<Object, EffectProfileState> implements InterfaceC1397970mTz {
    public final C2252321DDq LLIZLLLIL;
    public final AnonymousClass0950 LLJ;
    public final C2252331DDr LLJI;
    public final AnonymousClass0950 LLJIJIL;
    public final C318050CdP LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public Context LLJJ;
    public final C01GW LLJJI;
    public final AwS583S0100000_4 LLJJIII;
    public final AwS583S0100000_4 LLJJIJI;
    public final AFwS285S0000000_2 LLJJIJIIJIL;
    public final AFwS285S0000000_2 LLJJIJIL;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new EffectProfileState(null, new ListState(new C1761680vwc(3), null, null, null, null, 30, null));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0CdX] */
    public EffectProfileListViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(EnumC861260XqW.GONE);
        this.LLIZLLLIL = c2252321DDqLIZ;
        this.LLJ = C09IC.LIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJI = c2252331DDrLIZIZ;
        this.LLJIJIL = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLJILJIL = new C318050CdP(new InterfaceC318100CdU() { // from class: X.0CdX
            @Override // X.InterfaceC318100CdU
            public final String LIZ() {
                EffectProfileListViewModel effectProfileListViewModel = this.LIZ;
                if (effectProfileListViewModel.LLJILJILJ) {
                    return C0XQ7.LJFF().getCurUserId();
                }
                String str = effectProfileListViewModel.LLJILLL;
                return str == null ? "" : str;
            }

            @Override // X.InterfaceC318100CdU
            public final void LIZIZ() {
                this.LIZ.getClass();
            }

            @Override // X.InterfaceC318100CdU
            public final boolean LIZJ() {
                return this.LIZ.LLJILJILJ;
            }

            @Override // X.InterfaceC318100CdU
            public final Context context() {
                return this.LIZ.LLJJ;
            }

            @Override // X.InterfaceC318100CdU
            public final InterfaceC497601wk scope() {
                return ViewModelKt.getViewModelScope(this.LIZ);
            }
        });
        this.LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 737));
        this.LLJJIII = new AwS583S0100000_4(this, 160);
        this.LLJJIJI = new AwS583S0100000_4(this, 159);
        this.LLJJIJIIJIL = AFwS285S0000000_2.get$arr$(29);
        this.LLJJIJIL = AFwS285S0000000_2.get$arr$(28);
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final Function2<List<? extends Object>, List<? extends Object>, List<Object>> kR2() {
        return this.LLJJIJIL;
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final Function2<List<? extends Object>, List<? extends Object>, List<Object>> lR2() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final Function1<EffectProfileState, C11NZ<Pair<List<Object>, C1761680vwc>>> oR2() {
        return this.LLJJIJI;
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final Function1<EffectProfileState, C11NZ<Pair<List<Object>, C1761680vwc>>> pR2() {
        return this.LLJJIII;
    }

    public final void qR2(int i) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C889780YvQ(this, i, null), 2);
    }

    @Override // X.InterfaceC1397970mTz
    public final void K51(Aweme aweme, AwS600S0100000_21 awS600S0100000_21) {
        withState(new AwS395S0200000_29(aweme, awS600S0100000_21, 72));
    }
}
