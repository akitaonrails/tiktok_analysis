package com.ss.android.ugc.aweme.api.component.anole.left;

import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C693430RHx;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;

/* JADX INFO: loaded from: classes12.dex */
public final class AnoleBottomLabelTriggerOldComponent extends CommerceBaseInteractionComponent {
    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String Bp() {
        return "AnoleBottomLabelTriggerOldComponent";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(AnoleBottomLabelAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String zp() {
        return "bottom_tag_container_anole_label_slot";
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final InteractAreaAttachAbility Ap() {
        return (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoAreaAttachAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String yp() {
        return C693430RHx.LIZ;
    }
}
