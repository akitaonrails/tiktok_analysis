package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment;

import X.AbstractC510000JzK;
import X.C0KVU;
import X.C1161920gLG;
import X.C497740JfY;
import X.C509170Jxz;
import X.C509400JyM;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivilegeCreatorRoomItemDetailFragment extends AbsPrivilegeItemDetailFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2sqJjo9LCHELIOSQ4ICA9ZjU+IDk6JCArLD8yLyBiLz0yLygpJzt9GDclPyY/LSIpCj02KTEjOx08JygFPSo+DCA4KCY/DjctLiI2JjE=";

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeItemDetailFragment
    public final String wS() {
        return "chatroom";
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeItemDetailFragment
    public final void zS() {
        String str;
        IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
        C509400JyM c509400JyMYS = yS();
        if (c509400JyMYS == null || (str = c509400JyMYS.LLILZLL) == null) {
            str = "";
        }
        iHostSubscription.ch(this, str);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeItemDetailFragment
    public final String getTitle() {
        return C497740JfY.LJIJI(2131849252);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeItemDetailFragment
    public final String uS(AbstractC510000JzK abstractC510000JzK) {
        if (!(abstractC510000JzK instanceof C509170Jxz)) {
            return "";
        }
        C509170Jxz c509170Jxz = (C509170Jxz) abstractC510000JzK;
        SubInfo subInfo = c509170Jxz.LIZ.subInfo;
        if (subInfo != null && Intrinsics.LJFF(subInfo.isSubscribing, Boolean.TRUE)) {
            return C497740JfY.LJIJI(2131849251);
        }
        return C497740JfY.LJIJJ(2131849250, C0KVU.LIZ(c509170Jxz.LIZ.anchorDetail));
    }
}
