package com.ss.android.ugc.aweme.im.sdk.chat.ui.gif;

import X.C0I90;
import X.C0ICK;
import X.C0ZL0;
import X.C0ZQI;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C451050HmR;
import X.C454650HsF;
import X.C869590Y9l;
import X.C898020ZKu;
import android.graphics.Rect;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class GifSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C0ICK> implements C0I90 {
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell
    public final boolean V5() {
        return true;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(GifCardReusedUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.GifSendPowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                C0ZQI c0zqiUp = Up();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(((C898020ZKu) c0zqiUp).LIZIZ(c869590Y9l, true));
                arrayList.add(C454650HsF.LIZJ(new AwS372S0200000_6(c869590Y9l, c0zqiUp, 90)));
                return arrayList;
            }
        };
    }

    @Override // X.C0I90
    public final Rect Yi() {
        return C451050HmR.LIZ(this.itemView.findViewById(R.id.eu1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0I90
    public final String F5() {
        C869590Y9l c869590Y9l;
        C0ICK c0ick = (C0ICK) getItem();
        if (c0ick == null || (c869590Y9l = c0ick.LLILII().LIZ.LIZ) == null) {
            return null;
        }
        return c869590Y9l.getUuid();
    }
}
