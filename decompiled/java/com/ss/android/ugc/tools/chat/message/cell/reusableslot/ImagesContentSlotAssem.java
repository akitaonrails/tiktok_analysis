package com.ss.android.ugc.tools.chat.message.cell.reusableslot;

import X.C01GW;
import X.C1322090kVb;
import X.C13LE;
import X.C18V3;
import X.C18WD;
import X.C418440Gaw;
import X.C452501pT;
import X.C814420VxA;
import android.view.View;
import com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class ImagesContentSlotAssem extends BaseSkeletonUISlotAssem<ImagesContentSlotAssem, C18V3> {
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f9h;
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem
    public final void up(View view) {
    }

    public ImagesContentSlotAssem() {
        super(C13LE.LIZ(C18V3.class));
        this.LLJLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1018));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 417));
        this.LLJLLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1019));
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        for (C1322090kVb c1322090kVb : (List) this.LLJLL.getValue()) {
            if (c1322090kVb != null) {
                c1322090kVb.setTag(null);
                c1322090kVb.setController(null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v9, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(X.C0H94 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.chat.message.cell.reusableslot.ImagesContentSlotAssem.sp(X.0H94):void");
    }

    public static Pair zp(int i, int i2, C18WD c18wd, int i3) {
        if (i3 > 1) {
            return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))));
        }
        if (i > 0 && i2 > 0) {
            float f = i / i2;
            if (f < 0.5f) {
                return new Pair(Integer.valueOf(c18wd.LIZIZ), Integer.valueOf(c18wd.LIZJ));
            }
            float f2 = c18wd.LJ;
            if (f < f2) {
                return new Pair(Integer.valueOf((int) (c18wd.LIZJ * f)), Integer.valueOf(c18wd.LIZJ));
            }
            if (f == f2) {
                return new Pair(Integer.valueOf(c18wd.LIZ), Integer.valueOf(c18wd.LIZJ));
            }
            if (f >= 2.0f) {
                return new Pair(Integer.valueOf(c18wd.LIZ), Integer.valueOf(c18wd.LIZLLL));
            }
            return new Pair(Integer.valueOf(c18wd.LIZ), Integer.valueOf((int) (c18wd.LIZ / f)));
        }
        return new Pair(Integer.valueOf(c18wd.LIZ), Integer.valueOf(c18wd.LIZJ));
    }
}
