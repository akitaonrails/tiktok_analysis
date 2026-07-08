package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view;

import X.C0HTI;
import X.C13LE;
import X.C166V;
import X.C2217381BqS;
import X.C491390JOv;
import X.C491400JOw;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCalendlyBookingStatusAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C166V LLJJI = new C166V(new C491390JOv(this));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsCalendlyBookingStatusAssem.class, "binding", "getBinding()Lcom/bytedance/android/livesdk/comp/impl/pcs/databinding/TtliveCalendlyMeetingStatusAssemBinding;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.g2_;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Drawable drawableLIZ;
        super.onCreate();
        Context context = getContext();
        if (context != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.mr;
            drawableLIZ = c0hti.LIZ(context);
        } else {
            drawableLIZ = null;
        }
        C166V c166v = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        ((C491400JOw) c166v.LIZ(this)).LLILLJJLI.setIcon(drawableLIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }
}
