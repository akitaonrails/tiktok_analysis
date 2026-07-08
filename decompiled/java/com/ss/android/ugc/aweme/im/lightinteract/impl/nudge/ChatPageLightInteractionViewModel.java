package com.ss.android.ugc.aweme.im.lightinteract.impl.nudge;

import X.C01GW;
import X.C0Z2Z;
import X.C0Z4Q;
import X.C0ZF8;
import X.C0ZFO;
import X.C0ZFQ;
import X.C1559260qg8;
import X.C286570BLb;
import X.C356901a3;
import X.C452501pT;
import X.C457780HxI;
import X.C869590Y9l;
import X.C914160Zte;
import X.InterfaceC0148002o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.lightinteract.api.vm.AbsChatPageLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatPageLightInteractionViewModel extends AbsChatPageLightInteractionViewModel {
    public IMUser LLILZLL;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C457780HxI.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 507));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 508));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 509));
    public long LLILZIL = -1;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 506));

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.vm.AbsChatPageLightInteractionViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.vm.AbsChatPageLightInteractionViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(6);
    }

    public final long wQ2() {
        return ((Number) this.LLILZ.getValue()).longValue();
    }

    public final ILightInteractionPlatformService xQ2() {
        return (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.vm.AbsChatPageLightInteractionViewModel, androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        this.LLILZLL = ((C457780HxI) this.LL.getValue()).LL.getSingleChatFromUser();
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.vm.AbsChatPageLightInteractionViewModel, androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.vm.AbsChatPageLightInteractionViewModel
    public final void vQ2(C869590Y9l c869590Y9l) {
        long index;
        IIMNudgeAndStreakService iIMNudgeAndStreakServiceLIZ;
        IIMNudgeAndStreakService iIMNudgeAndStreakServiceLIZ2;
        long index2;
        long index3;
        BaseTemplate baseTemplateLIZ;
        IIMNudgeAndStreakService iIMNudgeAndStreakServiceLIZ3;
        boolean z;
        long index4;
        if (!xQ2().LJJJJJL(c869590Y9l)) {
            if (C286570BLb.LIZ() && (baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class)) != null && (baseTemplateLIZ instanceof StickerTemplate)) {
                boolean zLJFF = Intrinsics.LJFF(((StickerTemplate) baseTemplateLIZ).baseRequestComponent.queryData.extras.get("a:sticker_id"), String.valueOf(C0Z4Q.LIZ().stickerId));
                IIMNudgeAndStreakService.LIZ.getClass();
                IIMNudgeAndStreakService iIMNudgeAndStreakServiceLIZ4 = C0ZF8.LIZ();
                if ((iIMNudgeAndStreakServiceLIZ4 != null && iIMNudgeAndStreakServiceLIZ4.LJIIZILJ(c869590Y9l)) || ((iIMNudgeAndStreakServiceLIZ3 = C0ZF8.LIZ()) != null && iIMNudgeAndStreakServiceLIZ3.LJIIIZ(c869590Y9l))) {
                    z = true;
                } else {
                    z = false;
                }
                if (zLJFF || z) {
                    C0ZFQ c0zfqLJIL = xQ2().LJJJIL().LJIL(c869590Y9l);
                    if (yQ2(c869590Y9l, c0zfqLJIL)) {
                        c0zfqLJIL.LJI();
                        return;
                    }
                    c0zfqLJIL.LJFF();
                    if (this.LLILZIL < c869590Y9l.getIndex()) {
                        index4 = c869590Y9l.getIndex();
                    } else {
                        index4 = this.LLILZIL;
                    }
                    this.LLILZIL = index4;
                    return;
                }
            }
            IIMNudgeAndStreakService.LIZ.getClass();
            IIMNudgeAndStreakService iIMNudgeAndStreakServiceLIZ5 = C0ZF8.LIZ();
            if ((iIMNudgeAndStreakServiceLIZ5 != null && iIMNudgeAndStreakServiceLIZ5.LJIIZILJ(c869590Y9l)) || (((iIMNudgeAndStreakServiceLIZ = C0ZF8.LIZ()) != null && iIMNudgeAndStreakServiceLIZ.LJIIIZ(c869590Y9l)) || xQ2().LJJJJJL(c869590Y9l))) {
                xQ2().LJJJIL().LJJIJ(wQ2(), this.LLILZIL, c869590Y9l);
                C0ZFQ c0zfqLJIL2 = xQ2().LJJJIL().LJIL(c869590Y9l);
                if (yQ2(c869590Y9l, c0zfqLJIL2)) {
                    c0zfqLJIL2.LJI();
                    return;
                }
                c0zfqLJIL2.LJFF();
                if (this.LLILZIL < c869590Y9l.getIndex()) {
                    index3 = c869590Y9l.getIndex();
                } else {
                    index3 = this.LLILZIL;
                }
                this.LLILZIL = index3;
                return;
            }
            IIMNudgeAndStreakService iIMNudgeAndStreakServiceLIZ6 = C0ZF8.LIZ();
            if ((iIMNudgeAndStreakServiceLIZ6 == null || !iIMNudgeAndStreakServiceLIZ6.LJIJI(c869590Y9l)) && ((iIMNudgeAndStreakServiceLIZ2 = C0ZF8.LIZ()) == null || !iIMNudgeAndStreakServiceLIZ2.LJIJ(c869590Y9l))) {
                return;
            }
            xQ2().LJJJIL().LJJIJ(wQ2(), this.LLILZIL, c869590Y9l);
            C0ZFQ c0zfqLJIL3 = xQ2().LJJJIL().LJIL(c869590Y9l);
            if (yQ2(c869590Y9l, c0zfqLJIL3)) {
                c0zfqLJIL3.LJI();
                return;
            }
            c0zfqLJIL3.LJFF();
            if (this.LLILZIL < c869590Y9l.getIndex()) {
                index2 = c869590Y9l.getIndex();
            } else {
                index2 = this.LLILZIL;
            }
            this.LLILZIL = index2;
            return;
        }
        xQ2().LJJJIL().LJJIJ(wQ2(), this.LLILZIL, c869590Y9l);
        C0ZFQ c0zfqLJIL4 = xQ2().LJJJIL().LJIL(c869590Y9l);
        if (yQ2(c869590Y9l, c0zfqLJIL4)) {
            c0zfqLJIL4.LJI();
            return;
        }
        c0zfqLJIL4.LJFF();
        if (this.LLILZIL < c869590Y9l.getIndex()) {
            index = c869590Y9l.getIndex();
        } else {
            index = this.LLILZIL;
        }
        this.LLILZIL = index;
    }

    public final boolean yQ2(C869590Y9l c869590Y9l, C0ZFO c0zfo) {
        if (c869590Y9l.getIndex() <= wQ2()) {
            return true;
        }
        if (c869590Y9l.getIndex() <= this.LLILZIL || !c0zfo.LIZ()) {
            return true;
        }
        return false;
    }
}
