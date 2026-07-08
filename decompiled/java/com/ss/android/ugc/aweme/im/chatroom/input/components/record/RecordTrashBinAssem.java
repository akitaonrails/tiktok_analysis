package com.ss.android.ugc.aweme.im.chatroom.input.components.record;

import X.C01GW;
import X.C0HVA;
import X.C1295960jpS;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C426750GoL;
import X.C432400GxS;
import X.C432530Gxf;
import X.C432640Gxq;
import X.C432650Gxr;
import X.C432660Gxs;
import X.C432670Gxt;
import X.C432700Gxw;
import X.C452501pT;
import X.C459000HzG;
import X.C786410Ut5;
import X.EnumC452301pR;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class RecordTrashBinAssem extends UISlotAssem implements C0HVA {
    public C1295960jpS LLJJI;
    public final C2252321DDq LLJJIII = C1BNE.LIZ(Boolean.FALSE);
    public final C01GW LLJJIJI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS550S0100000_6(this, 141));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ck4;
    }

    @Override // X.C0HVA
    public final String Bc() {
        return C432670Gxt.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1295960jpS c1295960jpS;
        super.onViewCreated(view);
        Function2 function2LIZJ = C459000HzG.LIZJ(this);
        if (function2LIZJ != null) {
            function2LIZJ.invoke(this, view);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-37794, -46022});
        gradientDrawable.setShape(1);
        view.setBackground(gradientDrawable);
        C786410Ut5.I7(new ACListenerS141S0100000_6((Function1) ((C432660Gxs) C459000HzG.LIZ(this)).LIZJ, 30), view);
        Context context = getContext();
        if (context != null && C426750GoL.LIZLLL(context)) {
            C786410Ut5.Ob(view, -1.0f);
        }
        View viewFindViewById = view.findViewById(R.id.b4e);
        if (viewFindViewById instanceof C1295960jpS) {
            c1295960jpS = (C1295960jpS) viewFindViewById;
        } else {
            c1295960jpS = null;
        }
        this.LLJJI = c1295960jpS;
        if (c1295960jpS == null) {
            return;
        }
        c1295960jpS.setMaxFrame(16);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432400GxS(this, view, c1295960jpS, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432700Gxw(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432640Gxq(this, c1295960jpS, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432650Gxr(this, c1295960jpS, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432530Gxf(this, view, null), 3);
    }
}
