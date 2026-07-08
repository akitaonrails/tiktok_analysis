package com.ss.android.ugc.aweme.pcs.course.managementpage.ui;

import X.AbstractC738140SxQ;
import X.C0JH3;
import X.C0JHC;
import X.C1143680frq;
import X.C1220000hqw;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C16F5;
import X.C16FV;
import X.C1834150xpV;
import X.C197039127h;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C339190DRl;
import X.C451610HnL;
import X.C452070Ho5;
import X.C489110JGb;
import X.C497740JfY;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC489200JGk;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import wh6.AbS360S0000000_7;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseVideoListAssem extends UISlotAssem {
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(140), new AwS551S0100000_7((AbstractC738140SxQ) this, 381), new C451610HnL(this, true, true), new C723700Sa8(this));
    public C0JHC LLJJIII;
    public C197039127h LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public RecyclerView LLJJIJIL;
    public C0JH3 LLJJJ;
    public C16F5 LLJJJIL;
    public C16FV LLJJJJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hlj;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JE0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C488550JDx) obj).LLILLL;
            }
        }, null, new AwS621S0100000_7(this, 66), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JE2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C488550JDx) obj).LLJILJIL);
            }
        }, C736820SvI.LIZJ(), new AwS621S0100000_7(this, 68), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217371BqR() { // from class: X.0JE3
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C488550JDx) obj).LLILZLL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C488550JDx) obj).LLILZLL = (List) obj2;
            }
        }, null, new AwS621S0100000_7(this, 71), 6);
    }

    public final PcsCourseManageVM hp() {
        return (PcsCourseManageVM) this.LLJJI.getValue();
    }

    public final C0JHC ip() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0JHC) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final void kp(List<InterfaceC489200JGk> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC489200JGk interfaceC489200JGk : list) {
            if (interfaceC489200JGk.LJIIIIZZ().isUploaded()) {
                arrayList.add(interfaceC489200JGk);
            }
        }
        if (list.isEmpty()) {
            C339190DRl.LIZLLL(this.LLJJJJ);
            C339190DRl.LIZLLL(this.LLJJJIL);
        } else {
            C339190DRl.LIZIZ(this.LLJJJJ);
            C339190DRl.LIZIZ(this.LLJJJIL);
        }
        if (arrayList.isEmpty()) {
            C16F5 c16f5 = this.LLJJIJIIJIL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131855813));
                return;
            }
            return;
        }
        C16F5 c16f52 = this.LLJJIJIIJIL;
        if (c16f52 == null) {
            return;
        }
        c16f52.setText(C497740JfY.LJIJJ(2131855814, Integer.valueOf(arrayList.size())));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        super.onViewCreated(view);
        C786410Ut5.I7(new AbS689S0100000_7(this, 19), view.findViewById(R.id.upload_btn));
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.t6d);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (c197039127h != null) {
            c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_up_arrow_down_fill));
            c197039127h.setIconTintColorRes(R.attr.ezq);
            C786410Ut5.I7(new AbS360S0000000_7(2), c197039127h);
            C489110JGb.LJIIL(ip(), "drag", "click");
        } else {
            c197039127h = null;
        }
        this.LLJJIJI = c197039127h;
        this.LLJJJIL = (C16F5) view.findViewById(R.id.video_guide_tv);
        C16FV c16fv = (C16FV) view.findViewById(R.id.ql3);
        if (C1834150xpV.LJI(getContext())) {
            str = "pcs_course_empty_video_list_placeholder_dark.png";
        } else {
            str = "pcs_course_empty_video_list_placeholder.png";
        }
        C1143680frq.LJFF(c16fv, "tiktok_live_subscription_demand_1", str, ImageView.ScaleType.CENTER_CROP, null);
        this.LLJJJJ = c16fv;
        this.LLJJIJIIJIL = (C16F5) view.findViewById(R.id.f48);
        this.LLJJIJIL = (RecyclerView) view.findViewById(R.id.video_list_rv);
        Context context = getContext();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
        }
        this.LLJJJ = new C0JH3(context, interfaceC665370Q7zLJFF);
        RecyclerView recyclerView = this.LLJJIJIL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.LLJJJ);
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setOverScrollMode(2);
        }
        C489110JGb.LJIIL(ip(), "", "show");
    }
}
