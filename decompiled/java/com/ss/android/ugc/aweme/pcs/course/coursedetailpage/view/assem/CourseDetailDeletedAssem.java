package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem;

import X.C019F;
import X.C0HTI;
import X.C13LE;
import X.C1637806bA;
import X.C16FS;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM;
import com.zhiliaoapp.musically.R;
import irm.AkS75S0100000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class CourseDetailDeletedAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public C16FS LLJJI;
    public LiveIconView LLJJIII;
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CourseDetailDeletedAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/coursedetailpage/viewmodel/PcsCourseDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CourseDetailDeletedAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseDetailVM.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 716), AFwS229S0000000_2.get$arr$(440), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dfm;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = this.LLJJI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.cql);
            } else {
                viewFindViewById = null;
            }
            this.LLJJI = (C16FS) viewFindViewById;
        }
        View view2 = viewFindViewById;
        if (view2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(getContentView().getContext().getResources().getDimension(R.dimen.b4));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ey_);
            view2.setBackground(c384050F3z.LIZ(getContentView().getContext()));
        }
        View viewFindViewById3 = this.LLJJIII;
        if (viewFindViewById3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.kgv);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJIII = (LiveIconView) viewFindViewById3;
        }
        LiveIconView liveIconView = (LiveIconView) viewFindViewById3;
        if (liveIconView != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n_;
            liveIconView.setImageDrawable(c0hti.LIZ(getContentView().getContext()));
        }
        View view3 = this.LLJJI;
        if (view3 == null) {
            View viewLJJIJL3 = LJJIJL();
            if (viewLJJIJL3 != null) {
                viewFindViewById2 = viewLJJIJL3.findViewById(R.id.cql);
            }
            this.LLJJI = (C16FS) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        View view4 = view3;
        if (view4 != null) {
            C786410Ut5.I7(new AkS75S0100000_2(this, 1), view4);
        }
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xu1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1837060xuC) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 3), 6);
    }
}
