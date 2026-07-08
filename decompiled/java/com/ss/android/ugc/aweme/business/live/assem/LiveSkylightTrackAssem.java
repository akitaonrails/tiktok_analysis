package com.ss.android.ugc.aweme.business.live.assem;

import X.AbstractC738140SxQ;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS50S0100000_24;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveSkylightTrackAssem extends AbstractC738140SxQ {
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLILLJJLI = C628500Oky.LIZ(new AwS568S0100000_24(this, 141));
    public final C630740Ooa LLILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 140));
    public boolean LLILZ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        ISkylightListAbility iSkylightListAbility;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl;
        super.onResume();
        if (((Number) this.LLILLJJLI.getValue()).intValue() != 0 || this.LLILZ || (iSkylightListAbility = (ISkylightListAbility) this.LLILLL.getValue()) == null || (viewOnAttachStateChangeListenerC20604515jvWl = iSkylightListAbility.Wl()) == null) {
            return;
        }
        viewOnAttachStateChangeListenerC20604515jvWl.addOnScrollListener(new AsS50S0100000_24(this, 8));
        this.LLILZ = true;
    }
}
