package com.ss.android.ugc.aweme.relation.recuser.inbox;

import X.AbstractC21673719rz;
import X.C05YD;
import X.C1904040zeE;
import X.InterfaceC1554640qYg;
import X.InterfaceC332260D0u;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IRecommendUserAbility;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowerFragmentRecAbility implements FollowerPageAbilityCenter$IRecommendUserAbility, InterfaceC1554640qYg {
    public final UserCardWidgetV2 LL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 992903426) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxCommonAbilityCenter$IBaseRecommendUserAbility
    public final C05YD<InboxWidgetStatus> EX0() {
        return this.LL.ap();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxCommonAbilityCenter$IBaseRecommendUserAbility
    public final InterfaceC332260D0u Mm2() {
        return (InterfaceC332260D0u) this.LL.LLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxCommonAbilityCenter$IBaseRecommendUserAbility
    public final AbstractC21673719rz Rp() {
        return ((C1904040zeE) this.LL.Zo()).getItemAnimator();
    }

    public FollowerFragmentRecAbility(UserCardWidgetV2 userCardWidgetV2) {
        this.LL = userCardWidgetV2;
    }
}
