package com.ss.android.ugc.aweme.internalshare.impl.ui.iminput;

import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C457810HxL;
import X.C814420VxA;
import X.EnumC457820HxM;
import android.view.View;
import com.ss.android.ugc.aweme.im.assem.IMInputAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class InternalShareDirectInputAssem extends IMInputAssem {
    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void hp() {
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_INPUT_RIGHT_AREA, AFwS236S0000000_6.get$arr$(207));
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_RIGHT_AREA, AFwS236S0000000_6.get$arr$(208));
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_INPUT_FIELD, AFwS236S0000000_6.get$arr$(209));
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void kp() {
        View view = (View) this.LLJJJJJIL.getValue();
        if (view != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
            view.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        C426750GoL.LJIIIZ(ip(), 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), false, 16);
        C426750GoL.LJIIIZ((View) this.LLJJIII.getValue(), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), false, 16);
    }
}
