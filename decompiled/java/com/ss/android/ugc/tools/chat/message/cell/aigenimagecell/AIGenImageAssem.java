package com.ss.android.ugc.tools.chat.message.cell.aigenimagecell;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09AE;
import X.C1308910kAL;
import X.C14IS;
import X.C1697810uHb;
import X.C1856690yPr;
import X.C18WK;
import X.C197039127h;
import X.C452501pT;
import X.C910270ZnN;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class AIGenImageAssem extends SkeletonLayoutContainerAssem<C910270ZnN> {
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 397));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 395));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 396));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 394));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 398));
    public C09AE LLLFFI;
    public boolean LLLFZ;

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.aei;
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem
    public final C18WK op() {
        Integer numValueOf = Integer.valueOf(R.id.kca);
        Integer numValueOf2 = Integer.valueOf(R.id.sg4);
        return new C18WK(C1697810uHb.LJIIJJI(numValueOf, numValueOf2, Integer.valueOf(R.id.tzm)), Collections.singletonList(numValueOf), Collections.singletonList(numValueOf2));
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        C09AE c09ae = this.LLLFFI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLLFFI = null;
        this.LLLFZ = false;
    }

    public final C197039127h up() {
        return (C197039127h) this.LLJZIJLIL.getValue();
    }

    public final C197039127h yp() {
        return (C197039127h) this.LLL.getValue();
    }

    public final void Ap(boolean z) {
        Context context;
        if (z) {
            if (this.LLLFZ) {
                return;
            }
            C197039127h c197039127hYp = yp();
            if (c197039127hYp != null && (context = c197039127hYp.getContext()) != null) {
                C1856690yPr c1856690yPr = new C1856690yPr(context, R.raw.icon_spinner_thin);
                C197039127h c197039127hYp2 = yp();
                if (c197039127hYp2 != null) {
                    c197039127hYp2.setButtonStartIconDrawable(c1856690yPr);
                }
                c1856690yPr.LJIIIZ();
            }
        } else {
            C197039127h c197039127hYp3 = yp();
            if (c197039127hYp3 != null) {
                c197039127hYp3.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_down_to_line));
            }
        }
        this.LLLFZ = z;
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        int iIntValue2;
        AFwS278S0000000_32 aFwS278S0000000_32 = AFwS278S0000000_32.get$arr$(124);
        C14IS c14is = new C14IS();
        aFwS278S0000000_32.invoke(c14is);
        this.LLJLILLLLZIIL.add(c14is);
        AFwS278S0000000_32 aFwS278S0000000_322 = AFwS278S0000000_32.get$arr$(125);
        C14IS c14is2 = new C14IS();
        aFwS278S0000000_322.invoke(c14is2);
        this.LLJLILLLLZIIL.add(c14is2);
        super.onViewCreated(view);
        C197039127h c197039127hUp = up();
        if (c197039127hUp != null) {
            c197039127hUp.setIconTintColorRes(R.attr.z_);
            c197039127hUp.setTextColorRes(R.attr.z_);
            int[] iArr = new int[3];
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cq, c197039127hUp.getContext());
            int iIntValue3 = 0;
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            iArr[0] = iIntValue;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cc, c197039127hUp.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            iArr[1] = iIntValue2;
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, c197039127hUp.getContext());
            if (numLIZJ3 != null) {
                iIntValue3 = numLIZJ3.intValue();
            }
            iArr[2] = iIntValue3;
            c197039127hUp.LJJJJL(new AwS372S0200000_6(c197039127hUp, iArr, 112));
            c197039127hUp.LJJLI(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0189 A[PHI: r5
      0x0189: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:98:0x0186, B:68:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C910270ZnN r8) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.chat.message.cell.aigenimagecell.AIGenImageAssem.up(X.0ZnN):void");
    }
}
