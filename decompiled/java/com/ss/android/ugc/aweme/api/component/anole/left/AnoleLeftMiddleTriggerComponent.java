package com.ss.android.ugc.aweme.api.component.anole.left;

import X.C03H5;
import X.C0RQ7;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C700450Rdj;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import kotlin.jvm.internal.AFwS294S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AnoleLeftMiddleTriggerComponent extends CommerceBaseInteractionComponent {
    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String Bp() {
        return "AnoleLeftMiddleTriggerComponent";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(AnoleLeftMidAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String zp() {
        return "left_container_left_middle_container_anole_slot";
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent, com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return new C700450Rdj(null, AFwS294S0000000_11.get$arr$(24), null, 5);
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String yp() {
        return C0RQ7.ANOLE_INTERACTIVE_LEFT_MID_SLOT.getSlotName();
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final InteractAreaAttachAbility Ap() {
        return (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoAreaAttachAbility.class, null);
    }
}
