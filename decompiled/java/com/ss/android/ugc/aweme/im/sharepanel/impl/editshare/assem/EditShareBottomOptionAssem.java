package com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.assem;

import X.C1179980goO;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C19507611Tu;
import X.C19508011Ty;
import X.C384050F3z;
import X.C418440Gaw;
import X.C723590SZx;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.util.EditShareProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class EditShareBottomOptionAssem extends IMUISlotViewAssem implements EditShareProtocol {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C19507611Tu.class, null), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(1);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        linearLayout.setBackground(c384050F3z.LIZ(linearLayout.getContext()));
        linearLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        return linearLayout;
    }

    public EditShareBottomOptionAssem() {
        checkSupervisorPrepared();
        new C723590SZx(this, C19508011Ty.class, null);
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.util.EditShareProtocol
    public final void Uc1() {
        C786410Ut5.LJLLLLLL(8, getContentView());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LinearLayout linearLayout;
        super.onViewCreated(view);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, EditShareProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.assem.EditShareBottomOptionAssem$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, EditShareProtocol.class, this);
                    }
                }
            });
        }
        if ((view instanceof LinearLayout) && (linearLayout = (LinearLayout) view) != null) {
            linearLayout.addView(C1179980goO.LIZIZ(linearLayout, 2131832043, R.raw.icon_person_arrow_left_right, AFwS273S0000000_29.get$arr$(64)));
            linearLayout.addView(C1179980goO.LIZIZ(linearLayout, 2131832044, R.raw.icon_lock_small, AFwS273S0000000_29.get$arr$(65)));
        }
    }
}
