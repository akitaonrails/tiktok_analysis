package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.AbstractViewOnTouchListenerC446430Hez;
import X.C01GW;
import X.C452501pT;
import X.C683220Qr2;
import X.InterfaceC1587906Jp;
import X.InterfaceC446420Hey;
import X.InterfaceC655050Pmh;
import X.InterfaceC685830QvF;
import X.InterfaceC712990Rxx;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS79S0200000_10;
import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchCardFeedbackAssem<T extends InterfaceC655050Pmh> extends ReusedUIContentAssem<SearchCardFeedbackAssem<T>> implements InterfaceC712990Rxx<T>, InterfaceC685830QvF {
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS554S0100000_10((SearchCardFeedbackAssem) this, 207));
    public View LLJJJJJIL;

    public boolean hp() {
        return true;
    }

    public void lp(C683220Qr2 c683220Qr2, FeedbackMultipleChoice feedbackMultipleChoice) {
    }

    public void mp() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public Function0<List<View>> dp() {
        return AFwS187S0000000_2.get$arr$(826);
    }

    public Function0<Boolean> ip() {
        return AFwS196S0000000_10.get$arr$(374);
    }

    public View ep() {
        return this.LLJJJJJIL;
    }

    public final void cp(final View view) {
        if (view != null) {
            final Context context = view.getContext();
            AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(this, context) { // from class: X.0Qv5
                public final /* synthetic */ SearchCardFeedbackAssem<T> LLJIJIL;

                @Override // X.AbstractViewOnTouchListenerC446430Hez
                public final void LIZ(boolean z) {
                    View viewEp;
                    int iIntValue;
                    SearchCardFeedbackAssem<T> searchCardFeedbackAssem = this.LLJIJIL;
                    View view2 = view;
                    if (searchCardFeedbackAssem.hp()) {
                        viewEp = searchCardFeedbackAssem.ep();
                    } else {
                        viewEp = view2;
                    }
                    if (viewEp != null) {
                        if (z) {
                            if (searchCardFeedbackAssem.ya().contains(Integer.valueOf(view2.getId()))) {
                                viewEp.setForeground(null);
                                return;
                            }
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, viewEp.getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            viewEp.setForeground(new ColorDrawable(iIntValue));
                            return;
                        }
                        viewEp.setForeground(null);
                    }
                }

                {
                    this.LLJIJIL = this;
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZ = new InterfaceC446420Hey(this) { // from class: X.0Qv1
                public final /* synthetic */ SearchCardFeedbackAssem<T> LIZ;

                /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
                @Override // X.InterfaceC446420Hey
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        r23 = this;
                        r1 = r23
                        com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem<T> r0 = r1.LIZ
                        kotlin.jvm.functions.Function0 r0 = r0.ip()
                        java.lang.Object r0 = r0.invoke()
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        if (r0 != 0) goto L15
                        return
                    L15:
                        com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem<T> r0 = r1.LIZ
                        boolean r0 = r0.hp()
                        if (r0 == 0) goto La3
                        com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem<T> r0 = r1.LIZ
                        android.view.View r3 = r0.ep()
                    L23:
                        if (r3 == 0) goto L70
                        com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem<T> r4 = r1.LIZ
                        java.lang.String r7 = r4.getFeedbackType()
                        r8 = 0
                        if (r7 != 0) goto L7f
                        r6 = r8
                    L2f:
                        boolean r0 = X.C0Q9J.LIZ
                        r7 = 0
                        if (r6 == 0) goto L7d
                        java.lang.String r1 = r6.LIZ
                    L36:
                        X.0Qq1 r5 = X.EnumC682590Qq1.LEMON8_PHOTO
                        java.lang.String r0 = r5.getValue()
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 != 0) goto L75
                        if (r6 == 0) goto L73
                        java.lang.String r1 = r6.LIZ
                    L46:
                        X.0Qq1 r0 = X.EnumC682590Qq1.ADS
                        java.lang.String r0 = r0.getValue()
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 != 0) goto L75
                        r2 = r8
                    L53:
                        if (r6 == 0) goto L71
                        java.lang.String r1 = r6.LIZ
                    L57:
                        java.lang.String r0 = r5.getValue()
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 == 0) goto L68
                        kotlin.jvm.internal.AwS554S0100000_10 r8 = new kotlin.jvm.internal.AwS554S0100000_10
                        r0 = 234(0xea, float:3.28E-43)
                        r8.<init>(r4, r0)
                    L68:
                        r10 = 4
                        r6 = r6
                        r9 = r8
                        r5 = r3
                        r8 = r2
                        X.C684120QsU.LIZIZ(r5, r6, r7, r8, r9, r10)
                    L70:
                        return
                    L71:
                        r1 = r8
                        goto L57
                    L73:
                        r1 = r8
                        goto L46
                    L75:
                        kotlin.jvm.internal.AwS624S0100000_10 r2 = new kotlin.jvm.internal.AwS624S0100000_10
                        r0 = 14
                        r2.<init>(r4, r0)
                        goto L53
                    L7d:
                        r1 = r8
                        goto L36
                    L7f:
                        X.0Qr2 r6 = new X.0Qr2
                        boolean r0 = X.C0Q9J.LIZ
                        java.util.List r10 = X.C684120QsU.LIZLLL(r7)
                        r15 = 0
                        r22 = 524278(0x7fff6, float:7.3467E-40)
                        r9 = r8
                        r11 = r8
                        r12 = r8
                        r13 = r8
                        r14 = r8
                        r16 = r15
                        r17 = r15
                        r18 = r15
                        r19 = r8
                        r20 = r8
                        r21 = r8
                        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                        r4.Mj(r6)
                        goto L2f
                    La3:
                        android.view.View r3 = r2
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C685690Qv1.LIZ():void");
                }

                {
                    this.LIZ = this;
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new ATListenerS444S0100000_10(view, 2);
            view.setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: kp, reason: merged with bridge method [inline-methods] */
    public void up(T t) {
        HandlerHook.viewPost(LJJIJL(), new ARunnableS110S0100000_10(this, 36));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        HandlerHook.viewPost(view, new ARunnableS79S0200000_10(this, view, 21));
    }

    public void op(View view) {
        this.LLJJJJJIL = view;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
