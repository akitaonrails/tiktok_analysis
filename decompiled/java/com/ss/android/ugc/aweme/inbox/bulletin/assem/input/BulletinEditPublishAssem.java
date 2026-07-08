package com.ss.android.ugc.aweme.inbox.bulletin.assem.input;

import X.C0OWL;
import X.C1559260qg8;
import X.C457810HxL;
import X.C723580SZw;
import X.EnumC457820HxM;
import com.ss.android.ugc.aweme.im.assem.IMInputAssem;
import kotlin.jvm.internal.AFwS279S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class BulletinEditPublishAssem extends IMInputAssem {
    public final C1559260qg8 LLJLL = new C1559260qg8(new C723580SZw(this, C0OWL.class, "bulletin_board_edit_param"), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void kp() {
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void hp() {
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_LEFT_AREA, AFwS279S0000000_33.get$arr$(180));
        C0OWL c0owl = (C0OWL) this.LLJLL.getValue();
        if (c0owl == null || !c0owl.LLILLL) {
            C457810HxL.LIZ(this, EnumC457820HxM.SLOT_RIGHT_AREA, AFwS279S0000000_33.get$arr$(182));
        } else {
            C457810HxL.LIZ(this, EnumC457820HxM.SLOT_RIGHT_AREA, AFwS279S0000000_33.get$arr$(181));
        }
    }
}
