package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C16F5;
import X.C16FS;
import X.C1836920xty;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM;
import com.zhiliaoapp.musically.R;
import irm.AkS75S0100000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes3.dex */
public final class CourseDetailFailureAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public C197039127h LLJJI;
    public C16FS LLJJIII;
    public C16F5 LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public C1836920xty LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CourseDetailFailureAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/coursedetailpage/viewmodel/PcsCourseDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CourseDetailFailureAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseDetailVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 717), AFwS229S0000000_2.get$arr$(441), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dfn;
    }

    public final C197039127h hp() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.pxm) : null;
            this.LLJJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C197039127h c197039127hHp = hp();
        if (c197039127hHp != null) {
            C786410Ut5.I7(new AkS75S0100000_2(this, 2), c197039127hHp);
        }
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xu2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1837060xuC) obj).LL;
            }
        }, null, new AwS621S0100000_7(this, 3), 6);
    }
}
