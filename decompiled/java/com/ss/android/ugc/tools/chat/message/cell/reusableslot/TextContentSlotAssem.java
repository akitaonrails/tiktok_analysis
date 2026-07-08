package com.ss.android.ugc.tools.chat.message.cell.reusableslot;

import X.C01GW;
import X.C0H93;
import X.C0H94;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C21415018rM;
import X.C418440Gaw;
import X.C444830HcP;
import X.C452501pT;
import X.C497820Jfg;
import X.C814420VxA;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TextContentSlotAssem extends BaseSkeletonUISlotAssem<TextContentSlotAssem, C0H93> {
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f9j;
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem
    public final void up(View view) {
    }

    public TextContentSlotAssem() {
        super(C13LE.LIZ(C0H93.class));
        this.LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 980));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 414));
        this.LLJLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 981));
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem
    public final void sp(C0H94 c0h94) {
        int iIntValue;
        int iIntValue2;
        int iLIZIZ;
        Drawable drawable;
        Integer numLIZJ;
        Integer numLIZJ2;
        C0H93 c0h93 = (C0H93) c0h94;
        Context context = getContext();
        int iLIZIZ2 = 0;
        if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.cn, context)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        Context context2 = getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context2)) != null) {
            iIntValue2 = numLIZJ.intValue();
        } else {
            iIntValue2 = 0;
        }
        Context context3 = getContext();
        if (context3 != null) {
            iLIZIZ = ((C497820Jfg.LIZIZ(context3) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        } else {
            iLIZIZ = 0;
        }
        Context context4 = getContext();
        if (context4 != null) {
            iLIZIZ2 = ((C497820Jfg.LIZIZ(context4) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        C21415018rM c21415018rM = (C21415018rM) this.LLJLL.getValue();
        if (c21415018rM != null) {
            if (c0h93.LLILLJJLI) {
                drawable = (Drawable) this.LLJLLIL.getValue();
            } else {
                drawable = (Drawable) this.LLJLLL.getValue();
            }
            c21415018rM.setBackground(drawable);
            C444830HcP c444830HcP = new C444830HcP();
            c444830HcP.LJIILIIL(c0h93.LLILLL);
            c444830HcP.LJII(101);
            if (!c0h93.LLILLJJLI) {
                iIntValue = iIntValue2;
            }
            c444830HcP.LJIILJJIL(iIntValue);
            if (!c0h93.LLILLJJLI) {
                iLIZIZ = iLIZIZ2;
            }
            c444830HcP.LIZIZ.LJ = iLIZIZ;
            c21415018rM.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.0f, true, C13BV.INSTANCE, 24));
        }
    }
}
