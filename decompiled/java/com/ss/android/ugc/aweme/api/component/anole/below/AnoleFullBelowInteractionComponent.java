package com.ss.android.ugc.aweme.api.component.anole.below;

import X.C01GW;
import X.C452501pT;
import X.C693210RHb;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.EnumC696280RSw;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.ss.android.ugc.aweme.api.component.CommerceInteractionAbility;
import com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseContentComponent;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.jvm.internal.AFwS294S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AnoleFullBelowInteractionComponent extends CommerceBaseContentComponent implements ComponentPriorityProtocol {
    public final C01GW LLJL = C452501pT.LIZIZ(new C693210RHb(this));

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "full_container_below_anole_slot";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseContentComponent
    public final String hp() {
        return EnumC696280RSw.ANOLE_BELOW_INTERACTIVE_SLOT.getSlotName();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return new C700450Rdj(null, AFwS294S0000000_11.get$arr$(21), null, 5);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseContentComponent
    public final void sQ(String str, String str2, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
        CommerceInteractionAbility commerceInteractionAbility = (CommerceInteractionAbility) this.LLJL.getValue();
        if (commerceInteractionAbility != null) {
            commerceInteractionAbility.sQ(str, str2, view, anoleComponentLayoutModel);
        }
    }
}
