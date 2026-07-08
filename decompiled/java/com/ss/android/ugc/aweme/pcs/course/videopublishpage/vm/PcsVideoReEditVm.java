package com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm;

import X.AbstractC489130JGd;
import X.C0JHL;
import X.C0PEM;
import X.C1388190mED;
import X.C1443310nf7;
import X.C1443370nfD;
import X.C1445760nj4;
import X.C2296808zG;
import X.C23250099c;
import X.C489190JGj;
import X.InterfaceC0148002o;
import X.InterfaceC489200JGk;
import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsVideoReEditVm extends AssemViewModel<C0JHL> implements IPcsCourseReEditAbility {
    @Override // com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.IPcsCourseReEditAbility
    public final PcsVideoReEditVm tJ1() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0JHL(0);
    }

    public final void vQ2(Context context) {
        Aweme awemeLJIJJLI;
        Activity activityLIZ;
        VideoPublishEditModel videoPublishEditModelLJ;
        InterfaceC489200JGk interfaceC489200JGk = getState().LLILLL;
        if (interfaceC489200JGk != null) {
            awemeLJIJJLI = interfaceC489200JGk.LJIJJLI();
        } else {
            awemeLJIJJLI = null;
        }
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (videoPublishEditModelLJ = C1443310nf7.LIZIZ.LJ(awemeLJIJJLI, activityLIZ)) != null) {
            setState(new AwS586S0100000_7((AbstractC489130JGd) new C489190JGj(0.0f), 499));
            AwS373S0200000_7 awS373S0200000_7 = new AwS373S0200000_7(this, videoPublishEditModelLJ, 28);
            AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 266);
            AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 412);
            C1445760nj4.LIZ.getClass();
            C1445760nj4.LIZIZ = null;
            C1445760nj4.LIZJ = null;
            C1445760nj4.LIZLLL = null;
            C1445760nj4.LJ = null;
            C1445760nj4.LJFF = false;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1443370nfD(videoPublishEditModelLJ, awS551S0100000_7, this, awS373S0200000_7, awS586S0100000_7, null), 3);
        }
    }
}
