package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.C1559260qg8;
import X.C1738910vLt;
import X.C1750720vew;
import X.C1751080vfW;
import X.C1751140vfc;
import X.C1954807lC;
import X.C291001Au;
import X.C723600SZy;
import X.EnumC1751090vfX;
import X.EnumC1751110vfZ;
import X.EnumC1751120vfa;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class MessageCenterViewModel extends AssemViewModel<C1750720vew> {
    public volatile EnumC1751110vfZ LLILZ;
    public volatile EnumC1751110vfZ LLILZIL;
    public boolean LLILZLL;
    public volatile EnumC1751110vfZ LLIZ;
    public C1738910vLt LLIZLLLIL;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public String LLJILJILJ;
    public AwS427S0200000_26 LLJILLL;
    public volatile int LL = 3;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1751140vfc.class, null), true);
    public volatile AtomicInteger LLILLL = new AtomicInteger(0);
    public String LLJ = "close";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1750720vew(new C291001Au(EnumC1751090vfX.LOADING), false, null);
    }

    public final void wQ2(EnumC1751090vfX enumC1751090vfX) {
        C1751140vfc c1751140vfc;
        EnumC1751110vfZ enumC1751110vfZ;
        setStateImmediate(new AwS605S0100000_26(enumC1751090vfX, 191));
        if (enumC1751090vfX == EnumC1751090vfX.REFRESHING) {
            EnumC1751110vfZ enumC1751110vfZ2 = EnumC1751110vfZ.REFRESHING;
            this.LLILZ = enumC1751110vfZ2;
            C1751140vfc c1751140vfc2 = (C1751140vfc) this.LLILLJJLI.getValue();
            if ((c1751140vfc2 != null && c1751140vfc2.LLILZ) || ((c1751140vfc = (C1751140vfc) this.LLILLJJLI.getValue()) != null && c1751140vfc.LLILZLL)) {
                enumC1751110vfZ = enumC1751110vfZ2;
            } else {
                enumC1751110vfZ = EnumC1751110vfZ.EMPTY;
            }
            this.LLILZIL = enumC1751110vfZ;
            if (this.LLILZLL) {
                this.LLILZIL = EnumC1751110vfZ.EMPTY;
            }
            this.LLIZ = enumC1751110vfZ2;
            this.LLILLL.set(0);
        }
    }

    public final void vQ2(EnumC1751120vfa enumC1751120vfa, EnumC1751110vfZ enumC1751110vfZ) {
        EnumC1751090vfX enumC1751090vfX;
        int i = C1751080vfW.LIZ[enumC1751120vfa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LLIZ = enumC1751110vfZ;
                } else {
                    throw new C1954807lC();
                }
            } else {
                this.LLILZIL = enumC1751110vfZ;
            }
        } else {
            this.LLILZ = enumC1751110vfZ;
        }
        EnumC1751110vfZ enumC1751110vfZ2 = this.LLILZ;
        EnumC1751110vfZ enumC1751110vfZ3 = EnumC1751110vfZ.FAILED;
        if (enumC1751110vfZ2 != enumC1751110vfZ3 && this.LLILZIL != enumC1751110vfZ3 && this.LLIZ != enumC1751110vfZ3) {
            EnumC1751110vfZ enumC1751110vfZ4 = this.LLILZIL;
            EnumC1751110vfZ enumC1751110vfZ5 = EnumC1751110vfZ.SUCCESS;
            if (enumC1751110vfZ4 == enumC1751110vfZ5 && this.LLIZ == enumC1751110vfZ5) {
                enumC1751090vfX = EnumC1751090vfX.BOTH;
            } else if (this.LLILZIL == enumC1751110vfZ5 && this.LLIZ != enumC1751110vfZ5 && this.LLIZ != EnumC1751110vfZ.REFRESHING) {
                enumC1751090vfX = EnumC1751090vfX.NOTICE_ONLY;
            } else if (this.LLILZIL != enumC1751110vfZ5 && this.LLIZ == enumC1751110vfZ5) {
                enumC1751090vfX = EnumC1751090vfX.MESSAGE_ONLY;
            } else {
                EnumC1751110vfZ enumC1751110vfZ6 = this.LLILZIL;
                EnumC1751110vfZ enumC1751110vfZ7 = EnumC1751110vfZ.EMPTY;
                if (enumC1751110vfZ6 == enumC1751110vfZ7 && this.LLIZ == enumC1751110vfZ7) {
                    enumC1751090vfX = EnumC1751090vfX.EMPTY;
                } else {
                    EnumC1751110vfZ enumC1751110vfZ8 = this.LLILZIL;
                    EnumC1751110vfZ enumC1751110vfZ9 = EnumC1751110vfZ.REFRESHING;
                    if (enumC1751110vfZ8 != enumC1751110vfZ9 && this.LLIZ != enumC1751110vfZ9) {
                        enumC1751090vfX = EnumC1751090vfX.BOTH;
                    } else {
                        enumC1751090vfX = EnumC1751090vfX.REFRESHING;
                    }
                }
            }
        } else {
            enumC1751090vfX = EnumC1751090vfX.ERROR;
        }
        int iIncrementAndGet = this.LLILLL.incrementAndGet();
        if (iIncrementAndGet < this.LL) {
            setState(new AwS605S0100000_26(enumC1751090vfX, 189));
        } else {
            if (iIncrementAndGet != this.LL && enumC1751090vfX != EnumC1751090vfX.EMPTY) {
                return;
            }
            setState(new AwS605S0100000_26(enumC1751090vfX, 190));
        }
    }
}
