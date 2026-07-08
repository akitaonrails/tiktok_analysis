package com.ss.android.ugc.aweme.relation.recuser.inbox;

import X.AbstractC21673719rz;
import X.C1904040zeE;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationFragmentRecAbility implements NotificationAbilityCenter.IRecommendUserAbility, InterfaceC1554640qYg {
    public final UserCardWidgetV2 LL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 475835172) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxCommonAbilityCenter$IBaseRecommendUserAbility
    public final AbstractC21673719rz Rp() {
        return ((C1904040zeE) this.LL.Zo()).getItemAnimator();
    }

    public NotificationFragmentRecAbility(UserCardWidgetV2 userCardWidgetV2) {
        this.LL = userCardWidgetV2;
    }
}
