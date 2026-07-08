package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C1271804yK;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1903110zcj;
import X.C2252321DDq;
import X.C724240Sb0;
import X.EnumC637310OzB;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxBannerWidgetAbility;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class TryAiGroupInboxBannerAssem extends InboxBannerCustomAssem implements InboxAbilityCenter$IInboxBannerWidgetAbility.IAIGroupShotAbility, InterfaceC1554640qYg {
    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJI(this, InboxFragmentScope.class, this, InboxAbilityCenter$IInboxBannerWidgetAbility.IAIGroupShotAbility.class, null, null);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1992584216) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxBannerWidgetAbility.IAIGroupShotAbility
    public final void tr(boolean z) {
        Pair pair;
        C2252321DDq c2252321DDq = this.LL;
        if (z) {
            pair = new Pair(EnumC637310OzB.BOTTOM_SHOW, new C1271804yK(new AwS572S0100000_28(this, 313)));
        } else {
            pair = new Pair(EnumC637310OzB.DISMISS, null);
        }
        c2252321DDq.setValue(pair);
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (!Intrinsics.LJFF(c13iq, C13LE.LIZ(C1271804yK.class))) {
            return null;
        }
        return new C1903110zcj(new ComposeView(viewGroup.getContext(), null, 6), C724240Sb0.LJI(this));
    }
}
