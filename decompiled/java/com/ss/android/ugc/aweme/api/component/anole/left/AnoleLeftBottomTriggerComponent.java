package com.ss.android.ugc.aweme.api.component.anole.left;

import X.C03H5;
import X.C0RQ7;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;

/* JADX INFO: loaded from: classes12.dex */
public final class AnoleLeftBottomTriggerComponent extends CommerceBaseInteractionComponent {
    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String Bp() {
        return "AnoleLeftBottomTriggerComponent";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(AnoleLeftBottomAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String zp() {
        return "left_container_left_bottom_container_anole_slot";
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String yp() {
        return C0RQ7.ANOLE_INTERACTIVE_LEFT_BOTTOM_SLOT.getSlotName();
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final InteractAreaAttachAbility Ap() {
        return (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoAreaAttachAbility.class, null);
    }
}
