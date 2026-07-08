package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem;

import X.C019F;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1836920xty;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class CourseDetailTopBarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public View LLIZLLLIL;
    public LiveIconView LLJ;
    public LiveIconView LLJI;
    public final AssemVMLazy LLJIJIL;
    public C1836920xty LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CourseDetailTopBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/coursedetailpage/viewmodel/PcsCourseDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CourseDetailTopBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseDetailVM.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 720), AFwS229S0000000_2.get$arr$(443), null, true);
    }

    public final C1836920xty Go() {
        if (this.LLJILJIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1836920xty.class, null);
            this.LLJILJIL = interfaceC1555100qZQLIZIZ != null ? (C1836920xty) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJILJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[PHI: r4
      0x0019: PHI (r4v1 android.view.View) = (r4v0 android.view.View), (r4v3 android.view.View) binds: [B:3:0x0006, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6) {
        /*
            r5 = this;
            super.onViewCreated(r6)
            android.view.View r4 = r5.LLIZLLLIL
            r3 = 0
            if (r4 != 0) goto L19
            android.view.View r1 = r5.LJJIJL()
            if (r1 == 0) goto L99
            r0 = 2131375007(0x7f0a339f, float:1.837015E38)
            android.view.View r4 = r1.findViewById(r0)
        L15:
            r5.LLIZLLLIL = r4
            if (r4 == 0) goto L28
        L19:
            X.0xty r0 = r5.Go()
            r2 = 0
            if (r0 == 0) goto L96
            boolean r1 = r0.LLIZLLLIL
            r0 = 1
            if (r1 != r0) goto L96
        L25:
            X.C786410Ut5.LJLLLLLL(r2, r4)
        L28:
            com.bytedance.android.live.design.view.icon.LiveIconView r2 = r5.LLJ
            if (r2 != 0) goto L3e
            android.view.View r1 = r5.LJJIJL()
            if (r1 == 0) goto L94
            r0 = 2131365592(0x7f0a0ed8, float:1.8351054E38)
            android.view.View r2 = r1.findViewById(r0)
        L39:
            r0 = r2
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = (com.bytedance.android.live.design.view.icon.LiveIconView) r0
            r5.LLJ = r0
        L3e:
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L4b
            irm.AkS75S0100000_2 r1 = new irm.AkS75S0100000_2
            r0 = 3
            r1.<init>(r5, r0)
            X.C786410Ut5.I7(r1, r2)
        L4b:
            com.bytedance.android.livesdk.livesetting.pcs.PcsCourseReportVisibilitySetting r0 = com.bytedance.android.livesdk.livesetting.pcs.PcsCourseReportVisibilitySetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L91
            com.bytedance.android.live.design.view.icon.LiveIconView r2 = r5.LLJI
            r1 = 2131365846(0x7f0a0fd6, float:1.8351569E38)
            if (r2 != 0) goto L69
            android.view.View r0 = r5.LJJIJL()
            if (r0 == 0) goto L92
            android.view.View r2 = r0.findViewById(r1)
        L64:
            r0 = r2
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = (com.bytedance.android.live.design.view.icon.LiveIconView) r0
            r5.LLJI = r0
        L69:
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L70
            X.C500260Jjc.LLFFF(r2)
        L70:
            com.bytedance.android.live.design.view.icon.LiveIconView r2 = r5.LLJI
            if (r2 != 0) goto L84
            android.view.View r0 = r5.LJJIJL()
            if (r0 == 0) goto L7e
            android.view.View r3 = r0.findViewById(r1)
        L7e:
            r0 = r3
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = (com.bytedance.android.live.design.view.icon.LiveIconView) r0
            r5.LLJI = r0
            r2 = r3
        L84:
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L91
            irm.AkS75S0100000_2 r1 = new irm.AkS75S0100000_2
            r0 = 4
            r1.<init>(r5, r0)
            X.C786410Ut5.I7(r1, r2)
        L91:
            return
        L92:
            r2 = r3
            goto L64
        L94:
            r2 = r3
            goto L39
        L96:
            r2 = 8
            goto L25
        L99:
            r4 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailTopBarAssem.onViewCreated(android.view.View):void");
    }
}
