package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C055D;
import X.C06MM;
import X.C0WZX;
import X.C1390410mHn;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C464660IKa;
import X.C504210Jpz;
import X.C517380KQu;
import X.C517390KQv;
import X.C520040KaQ;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel.PcsServiceBioVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsServiceBioLoadingAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public ConstraintLayout LLJJIII;
    public C1390410mHn LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceBioLoadingAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/viewmodel/PcsServiceBioVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServiceBioLoadingAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055D(c19719912DlLIZ), new C517390KQv(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz1;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Context contextLJIIIIZZ;
        if (!C504210Jpz.LIZ && !C464660IKa.LIZ()) {
            super.Eo(context);
            return context;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) != null && (contextLJIIIIZZ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) != null) {
            return contextLJIIIIZZ;
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (ConstraintLayout) view.findViewById(R.id.uti);
        ConstraintLayout constraintLayout = this.LLJJIII;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                Activity activityLIZ = C06MM.LIZ(getContext());
                C2204961BRm.LLILZIL(activityLIZ.getWindowManager(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xUG0I/xwf+EP1TY=", null)).getRealMetrics(new DisplayMetrics());
                layoutParams.height = (int) (r4.heightPixels * 0.36f);
                C786410Ut5.W5(constraintLayout, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.LLJJIJI = (C1390410mHn) view.findViewById(R.id.utg);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0KUD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KUP) obj).LL;
            }
        }, null, new C517380KQu(this), 6);
    }
}
