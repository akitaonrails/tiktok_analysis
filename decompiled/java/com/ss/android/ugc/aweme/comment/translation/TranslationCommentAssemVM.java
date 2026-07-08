package com.ss.android.ugc.aweme.comment.translation;

import X.C0BJA;
import X.C1558520qew;
import X.C161N;
import X.C230100uh;
import X.C294300BgC;
import X.C746760TRa;
import X.InterfaceC0148002o;
import X.InterfaceC1339720ky2;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TranslationCommentAssemVM extends AssemViewModel<C230100uh> implements InterfaceC1339720ky2 {
    public InterfaceC665370Q7z LL;
    public final ConcurrentHashSet<Comment> LLILLJJLI = new ConcurrentHashSet<>();
    public Aweme LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.00uh
            public final C291001Au<Unit> LL = null;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C230100uh) && Intrinsics.LJFF(this.LL, ((C230100uh) obj).LL);
            }

            public final int hashCode() {
                C291001Au<Unit> c291001Au = this.LL;
                if (c291001Au == null) {
                    return 0;
                }
                return c291001Au.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TranslationCommentVMState(triggerIntroUI=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }

    public final void wQ2() {
        IPageActionBarAbility iPageActionBarAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        if (interfaceC665370Q7z == null || (iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPageActionBarAbility.class, null)) == null) {
            return;
        }
        iPageActionBarAbility.Wh0();
    }

    @Override // X.InterfaceC1339720ky2
    public final void Fm0(Comment comment) {
        this.LLILLJJLI.add(comment);
        if (this.LLILLL != null && C161N.LIZIZ.LJJIZ(this.LLILLJJLI.size(), this.LLILLL)) {
            wQ2();
        }
    }

    public final void vQ2(Aweme aweme) {
        Aweme aweme2;
        if (C0BJA.LIZIZ() && (aweme2 = this.LLILLL) != null) {
            C161N.LIZIZ.LJJLIIIJ().LIZIZ(aweme2.getAid());
            if (((Number) C294300BgC.LIZ.getValue()).intValue() == 1) {
                C746760TRa.LIZ().LJLI(aweme2.getAid(), false);
            }
            C746760TRa.LIZ().LJJLIIIJLJLI(aweme2.getAid());
        }
        this.LLILLL = aweme;
    }

    @Override // X.InterfaceC1339720ky2
    public final void yV1(Comment comment) {
        this.LLILLJJLI.remove(comment);
    }
}
