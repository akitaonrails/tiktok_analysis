package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.moderator.assem;

import X.C019F;
import X.C01GW;
import X.C056B;
import X.C056C;
import X.C09R3;
import X.C0JL3;
import X.C0JLC;
import X.C0JLR;
import X.C0JLS;
import X.C0JLT;
import X.C0JLU;
import X.C0JLW;
import X.C1149204eY;
import X.C13LE;
import X.C1548820qPI;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C16F5;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C262100zr;
import X.C452501pT;
import X.C496700Jds;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C930940aKi;
import X.InterfaceC1141530foN;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.infoheader.PcsServiceInfoHeaderVM;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.moderator.viewmodel.PcsServiceBioModeratorVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsServiceModeratorAssem extends UISlotAssem implements InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public View LLJJI;
    public LiveIconView LLJJIII;
    public C16F5 LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C01GW LLJJJIL;
    public C0JL3 LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceModeratorAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/moderator/viewmodel/PcsServiceBioModeratorVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PcsServiceModeratorAssem.class, "headerVM", "getHeaderVM()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/common/assem/infoheader/PcsServiceInfoHeaderVM;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PcsServiceModeratorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioModeratorVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C056B(c19719912DlLIZ), new C0JLT(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PcsServiceInfoHeaderVM.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C056C(c19719912DlLIZ2), new C0JLU(), null, true);
        this.LLJJJIL = C452501pT.LIZIZ(new C0JLS(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hg8;
    }

    public final C0JL3 hp() {
        if (this.LLJJJJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0JL3.class, null);
            this.LLJJJJ = interfaceC1555100qZQLIZIZ != null ? (C0JL3) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJJJ;
    }

    public final FrameLayout ip() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.spark_container) : null;
            this.LLJJIJIIJIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1548820qPI.LJIIIIZZ("pcs_pin_card_success", this);
        FrameLayout frameLayoutIp = ip();
        if (frameLayoutIp != null) {
            C786410Ut5.LJJJJIZL(frameLayoutIp);
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        LiveSheetFragment liveSheetFragment;
        if (Intrinsics.LJFF(c262100zr.LIZ, "pcs_pin_card_success")) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if ((fragmentLJI instanceof LiveSheetFragment) && (liveSheetFragment = (LiveSheetFragment) fragmentLJI) != null) {
                liveSheetFragment.close();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        C0JLC c0jlc;
        C0JLC c0jlc2;
        C0JLC c0jlc3;
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new C1149204eY(this));
        C1548820qPI.LIZLLL("pcs_pin_card_success", this);
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        String str3 = null;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0JLK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JLJ) obj).LL;
            }
        }, null, new C0JLR(this), 6);
        PcsServiceInfoHeaderVM pcsServiceInfoHeaderVM = (PcsServiceInfoHeaderVM) this.LLJJJ.getValue();
        C0JL3 c0jl3Hp = hp();
        if (c0jl3Hp != null && (c0jlc3 = c0jl3Hp.LL) != null) {
            str3 = c0jlc3.LIZ;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        C0JL3 c0jl3Hp2 = hp();
        if (c0jl3Hp2 == null || (c0jlc2 = c0jl3Hp2.LL) == null || (str = c0jlc2.LIZJ) == null) {
            str = "";
        }
        C0JL3 c0jl3Hp3 = hp();
        if (c0jl3Hp3 == null || (c0jlc = c0jl3Hp3.LL) == null || (str2 = c0jlc.LIZLLL) == null) {
            str2 = "";
        }
        String strLIZJ = C0JLW.LIZJ((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class));
        if (strLIZJ != null) {
            str4 = strLIZJ;
        }
        pcsServiceInfoHeaderVM.vQ2(new C496700Jds((SMBPreviewResponse.ResponseData) null, str3, "moderator", str, str2, "moderator_panel", 0, (Long) null, str4, "moderator_pin_card", 1217));
    }
}
