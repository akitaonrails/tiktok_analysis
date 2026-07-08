package com.ss.android.ugc.aweme.api.component.anole.full;

import X.C03H5;
import X.C1017070cZd;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C693790RJh;
import X.EnumC696280RSw;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class AnoleBetweenLRInteractTriggerComponent extends CommerceBaseInteractionComponent {
    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String Bp() {
        return "AnoleBetweenLRInteractTriggerComponent";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(AnoleBetweenLRInteractAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String zp() {
        return "between_interactions_full_container_anole_slot";
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String yp() {
        return EnumC696280RSw.TT_FEED_BETWEEN_LEFT_RIGHT_INTERACTIVE.getSlotName();
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final InteractAreaAttachAbility Ap() {
        return (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoAreaAttachAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final boolean Ep(Aweme aweme) {
        boolean z;
        boolean z2;
        List<String> listLIZIZ;
        if (a0.LJJJIL(yp())) {
            return false;
        }
        List<String> listLIZ = C693790RJh.LIZ(aweme);
        if (!listLIZ.isEmpty()) {
            for (String str : listLIZ) {
                if (Intrinsics.LJFF(str, yp()) || Intrinsics.LJFF(str, EnumC696280RSw.TT_FEED_BETWEEN_LEFT_RIGHT_INTERACTIVE_3D_FOREGROUND.getSlotName())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (aweme != null && (listLIZIZ = C693790RJh.LIZIZ(aweme)) != null && !listLIZIZ.isEmpty()) {
            Iterator<String> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), yp())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (!z) {
            if (!z2) {
                return false;
            }
            if (!C1017070cZd.LJLLLLLL(aweme) && !C1017070cZd.LJZI(aweme)) {
                return false;
            }
        }
        return true;
    }
}
