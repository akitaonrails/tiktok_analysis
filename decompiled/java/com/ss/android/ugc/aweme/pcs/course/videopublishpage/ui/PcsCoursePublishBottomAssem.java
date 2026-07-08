package com.ss.android.ugc.aweme.pcs.course.videopublishpage.ui;

import X.AbstractC738140SxQ;
import X.C06MM;
import X.C0JHW;
import X.C0WZX;
import X.C1220000hqw;
import X.C13LE;
import X.C1554960qZC;
import X.C1701330uNH;
import X.C197039127h;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C489400JHe;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC489360JHa;
import X.InterfaceC1555100qZQ;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.provider.impl.GScope;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm.PcsVideoEditVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoPublishVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoReEditVm;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.AwS656S0100000_7;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCoursePublishBottomAssem extends UISlotAssem {
    public final C736950SvV LLJJI;
    public final C736950SvV LLJJIII;
    public final C736950SvV LLJJIJI;
    public C489400JHe LLJJIJIIJIL;
    public final C736950SvV LLJJIJIL;
    public C197039127h LLJJJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dhc;
    }

    public final void hp() {
        Intent intent = new Intent(getContext(), (Class<?>) PcsCourseActivity.class);
        intent.addFlags(603979776);
        Activity activityLIZ = C06MM.LIZ(getContext());
        if (activityLIZ != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activityLIZ);
            C2204961BRm.LJIILLIIL(activityLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqrcNHN0ye78R3qOURvevv8aVVjboogexbm8jKL2lEz9RoxCdP1RoZUaCbsmWrmOlqkdUcN6iPJTeY=", null));
        }
    }

    public final PcsVideoReEditVm ip() {
        return (PcsVideoReEditVm) this.LLJJI.getValue();
    }

    public final C489400JHe kp() {
        if (this.LLJJIJIIJIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C489400JHe.class, null);
            this.LLJJIJIIJIL = interfaceC1555100qZQLIZIZ != null ? (C489400JHe) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJIIJIL;
    }

    public PcsCoursePublishBottomAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsVideoReEditVm.class);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(174);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7((AbstractC738140SxQ) this, 405);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJI = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS237S0000000_7, awS551S0100000_7, c451610HnL, c723700Sa8);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(PcsVideoPublishVM.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(175), new AwS551S0100000_7((AbstractC738140SxQ) this, 406), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(PcsVideoEditVM.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(176), new AwS551S0100000_7((AbstractC738140SxQ) this, 407), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJIL = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(177), new AwS551S0100000_7((AbstractC738140SxQ) this, 408), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC489360JHa enumC489360JHa;
        super.onViewCreated(view);
        view.findViewById(R.id.fof);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.eoo);
        c197039127h.setBackgroundRadius(16);
        C786410Ut5.I7(new AbS689S0100000_7(this, 29), c197039127h);
        this.LLJJJ = c197039127h;
        C489400JHe c489400JHeKp = kp();
        if (c489400JHeKp != null && (enumC489360JHa = c489400JHeKp.LL) != null) {
            int i = C0JHW.LIZ[enumC489360JHa.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C736680Sv4.LJIIIZ(this, ip(), new C2217381BqS() { // from class: X.0JHU
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C0JHL) obj).LLILZLL;
                        }
                    }, new C2217381BqS() { // from class: X.0JHQ
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((C0JHL) obj).LLILZ);
                        }
                    }, null, new AwS656S0100000_7(this, 5), 12);
                    return;
                }
                return;
            }
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0JHT
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0JHK) obj).LLILLL;
                }
            }, null, new AwS621S0100000_7(this, 103), 6);
        }
    }
}
