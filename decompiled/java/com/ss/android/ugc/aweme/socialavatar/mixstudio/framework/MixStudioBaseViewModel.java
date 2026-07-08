package com.ss.android.ugc.aweme.socialavatar.mixstudio.framework;

import X.AbstractC440540HPg;
import X.C01GW;
import X.C05YD;
import X.C0H6Q;
import X.C0HO6;
import X.C1559260qg8;
import X.C23250099c;
import X.C440500HPc;
import X.C440510HPd;
import X.C440530HPf;
import X.C452501pT;
import X.EnumC440360HOo;
import X.EnumC440380HOq;
import X.EnumC440890HQp;
import X.EnumC441640HTm;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioBaseViewModel extends AssemViewModel<C440510HPd> {
    public boolean LLILZ;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C440500HPc.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(151));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(150));
    public final AtomicBoolean LLILZIL = new AtomicBoolean(false);

    public final boolean isNewUser() {
        C05YD<AbstractC440540HPg> taskStatus;
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) this.LLILLJJLI.getValue();
        return Intrinsics.LJFF((mixStudioStatusRepository == null || (taskStatus = mixStudioStatusRepository.getTaskStatus()) == null) ? null : taskStatus.getValue(), C440530HPf.LIZ);
    }

    public final C440500HPc wQ2() {
        return (C440500HPc) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        EnumC440890HQp enumC440890HQp = wQ2().LL;
        if (enumC440890HQp == EnumC440890HQp.LOADING) {
            this.LLILZ = true;
        }
        return new C440510HPd(Collections.singletonList(enumC440890HQp), EnumC440360HOo.DIRECT, EnumC440380HOq.DIRECT, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        if (C0H6Q.LIZ()) {
            return;
        }
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C0HO6(this, null), 3);
    }

    public final EnumC441640HTm vQ2() {
        return wQ2().LLIZLLLIL;
    }

    public final void xQ2(EnumC440890HQp enumC440890HQp) {
        withState(new AwS372S0200000_6(enumC440890HQp, this, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2 A[EDGE_INSN: B:85:0x00d2->B:56:0x00d2 BREAK  A[LOOP:0: B:67:0x0108->B:87:?]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.AbstractC440540HPg r10, int r11, boolean r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel.yQ2(X.0HPg, int, boolean, X.05Vn):java.lang.Object");
    }
}
