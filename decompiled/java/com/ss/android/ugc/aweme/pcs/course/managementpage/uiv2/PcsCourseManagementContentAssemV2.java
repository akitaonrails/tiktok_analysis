package com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2;

import X.AbstractC21673619ry;
import X.AbstractC738140SxQ;
import X.C0JCY;
import X.C1220000hqw;
import X.C13LE;
import X.C15438062q;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C18QP;
import X.C20600815jK;
import X.C2217381BqS;
import X.C262100zr;
import X.C451610HnL;
import X.C452070Ho5;
import X.C488490JDr;
import X.C488500JDs;
import X.C488510JDt;
import X.C488520JDu;
import X.C488530JDv;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1891350zJl;
import X.InterfaceC489200JGk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS107S0100000_7;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseDescCell;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CoursePriceCell;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseTitleCell;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseTopIconCell;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListTitleCell;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS22S0010000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS58S1000000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseManagementContentAssemV2 extends UISlotAssem implements InterfaceC1141530foN {
    public static final /* synthetic */ int LLJJJIL = 0;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(145), new AwS551S0100000_7((AbstractC738140SxQ) this, 385), new C451610HnL(this, true, true), new C723700Sa8(this));
    public List<InterfaceC489200JGk> LLJJJ = new ArrayList();

    static {
        new C0JCY();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hlb;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JDw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C488550JDx) obj).LLILLL;
            }
        }, null, new AwS621S0100000_7(this, 80), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JDd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C488550JDx) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 81), 6);
        ip(hp().getVideoList());
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS107S0100000_7(this, 145));
        }
    }

    public final PcsCourseManageVM hp() {
        return (PcsCourseManageVM) this.LLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("ttsmb_universal_popup_submit", this);
    }

    public final void ip(List<InterfaceC489200JGk> list) {
        C20600815jK<InterfaceC1891350zJl> state;
        boolean z;
        boolean z2;
        this.LLJJJ = list;
        if (!list.isEmpty()) {
            this.LLJJIJIIJIL = true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C488520JDu());
        arrayList.add(new C488510JDt());
        arrayList.add(new C488500JDs());
        arrayList.add(new C488490JDr());
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (InterfaceC489200JGk interfaceC489200JGk : list) {
            int i2 = i + 1;
            if (i >= 0) {
                InterfaceC489200JGk interfaceC489200JGk2 = interfaceC489200JGk;
                if (i == list.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (i == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList2.add(new C488530JDv(interfaceC489200JGk2, z, z2));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        arrayList.addAll(arrayList2);
        if (this.LLJJIJIIJIL || this.LLJJIJIL) {
            arrayList.add(new InterfaceC1891350zJl() { // from class: X.0JDq
                @Override // X.InterfaceC1891350zJl
                public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return true;
                }

                @Override // X.InterfaceC1891350zJl
                public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return null;
                }

                @Override // X.InterfaceC1891350zJl
                public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return Intrinsics.LJFF(interfaceC1891350zJl, this);
                }
            });
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(arrayList, new ARunnableS107S0100000_7(this, 146));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Integer numValueOf;
        String string;
        if (Intrinsics.LJFF(c262100zr.LIZ, "ttsmb_universal_popup_submit")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String string2 = null;
            if (interfaceC1107590evd != null && (numValueOf = Integer.valueOf(interfaceC1107590evd.getInt("action"))) != null && numValueOf.intValue() == 1) {
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 != null) {
                    string = interfaceC1107590evd2.getString("text");
                } else {
                    string = null;
                }
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 != null) {
                    string2 = interfaceC1107590evd3.getString("page_type");
                }
                if (Intrinsics.LJFF(string2, "sku_title")) {
                    PcsCourseManageVM pcsCourseManageVMHp = hp();
                    if (string == null) {
                        string = "";
                    }
                    pcsCourseManageVMHp.getClass();
                    pcsCourseManageVMHp.setState(new AwS22S0010000_7(a0.LJJJIL(string), 1));
                    pcsCourseManageVMHp.setState(new AwS58S1000000_7(string, 7));
                    pcsCourseManageVMHp.FQ2(true);
                    return;
                }
                if (!Intrinsics.LJFF(string2, "sku_desc")) {
                    return;
                }
                PcsCourseManageVM pcsCourseManageVMHp2 = hp();
                if (string == null) {
                    string = "";
                }
                pcsCourseManageVMHp2.getClass();
                pcsCourseManageVMHp2.setState(new AwS58S1000000_7(string, 6));
                pcsCourseManageVMHp2.FQ2(true);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C20600815jK<InterfaceC1891350zJl> state;
        RecyclerView.LayoutManager layoutManager;
        AbstractC21673619ry adapter;
        super.onViewCreated(view);
        this.LLJJIJI = false;
        C1548820qPI.LIZLLL("ttsmb_universal_popup_submit", this);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.f45);
        this.LLJJIII = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setSaveEnabled(false);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (adapter = viewOnAttachStateChangeListenerC20604515jv2.getAdapter()) != null) {
            adapter.setStateRestorationPolicy(C18QP.PREVENT);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null && (layoutManager = viewOnAttachStateChangeListenerC20604515jv3.getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.LJIILJJIL(CourseTopIconCell.class, CourseTitleCell.class, CoursePriceCell.class, CourseVideoListTitleCell.class, CourseVideoListCell.class, CourseDescCell.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C488520JDu());
        arrayList.add(new C488510JDt());
        arrayList.add(new C488500JDs());
        arrayList.add(new C488490JDr());
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv5 != null && (state = viewOnAttachStateChangeListenerC20604515jv5.getState()) != null) {
            state.LIZLLL(arrayList, null);
        }
    }
}
