package com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.agegraduation;

import X.C01GW;
import X.C1231704rr;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C15558067g;
import X.C1558520qew;
import X.C1734106qh;
import X.C1903830zdt;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1599580rjA;
import X.InterfaceC1891350zJl;
import Y.AObserverS230S0100000_28;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxFragmentAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGraduationWidgetV2 extends InboxWidget {
    public C15558067g LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 226));
    public final AwS572S0100000_28 LLJI = new AwS572S0100000_28(this, 225);

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationWidgetV2 provideDataList item = ");
        sbLIZ.append(this.LLIZLLLIL);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        C15558067g c15558067g = this.LLIZLLLIL;
        return c15558067g != null ? c15558067g.LL ? Collections.singletonList(c15558067g) : C13BV.INSTANCE : C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return Collections.singletonList(C13LE.LIZ(C15558067g.class));
    }

    public final AgeGraduationViewModel Ho() {
        return (AgeGraduationViewModel) this.LLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        Ho().refresh();
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if (inboxAbilityCenter$IInboxFragmentAbility != null) {
            C1734106qh.LIZ.LIZIZ();
            inboxAbilityCenter$IInboxFragmentAbility.pE(this.LLJI, AFwS217S0000000_28.get$arr$(709));
        }
        Ho().LLJI.observe(this, new AObserverS230S0100000_28(this, 23));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1231704rr c1231704rr = C1734106qh.LIZ;
        c1231704rr.getClass();
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if (inboxAbilityCenter$IInboxFragmentAbility != null) {
            c1231704rr.LIZIZ();
            inboxAbilityCenter$IInboxFragmentAbility.ZE1(this.LLJI, AFwS217S0000000_28.get$arr$(710));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationWidgetV2 onRefresh from = ");
        sbLIZ.append(enumC1599580rjA);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.getClass();
        Ho().refresh();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationWidgetV2 onCreateViewHolder modelClass = ");
        sbLIZ.append(c13iq);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C15558067g.class))) {
            int i = C1903830zdt.LL;
            return new C1903830zdt(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cee, viewGroup, false));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void so(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationWidgetV2 onBindViewHolder position = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        if (viewHolder instanceof C1903830zdt) {
            ((C1903830zdt) viewHolder).I5(Ho());
        }
    }
}
