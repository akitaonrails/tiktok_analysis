package com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.agegraduation;

import X.C01GW;
import X.C1231704rr;
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
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxFragmentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGraduationBannerAssem extends InboxBannerCustomAssem {
    public C15558067g LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 224));
    public final AwS572S0100000_28 LLILZLL = new AwS572S0100000_28(this, 223);

    public final AgeGraduationViewModel oo() {
        return (AgeGraduationViewModel) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        oo().refresh();
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if (inboxAbilityCenter$IInboxFragmentAbility != null) {
            C1734106qh.LIZ.LIZIZ();
            inboxAbilityCenter$IInboxFragmentAbility.pE(this.LLILZLL, AFwS217S0000000_28.get$arr$(709));
        }
        oo().LLJI.observe(this, new AObserverS230S0100000_28(this, 22));
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1231704rr c1231704rr = C1734106qh.LIZ;
        c1231704rr.getClass();
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if (inboxAbilityCenter$IInboxFragmentAbility != null) {
            c1231704rr.LIZIZ();
            inboxAbilityCenter$IInboxFragmentAbility.ZE1(this.LLILZLL, AFwS217S0000000_28.get$arr$(710));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    public final void bo(EnumC1599580rjA enumC1599580rjA) {
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationBannerAssem onRefresh from = ");
        sbLIZ.append(enumC1599580rjA);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.getClass();
        oo().refresh();
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationBannerAssem onCreateViewHolder modelClass = ");
        sbLIZ.append(c13iq);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C15558067g.class))) {
            int i = C1903830zdt.LL;
            return new C1903830zdt(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cee, viewGroup, false));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final void ho(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationBannerAssem onBindViewHolder position = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        if (viewHolder instanceof C1903830zdt) {
            ((C1903830zdt) viewHolder).I5(oo());
        }
    }
}
