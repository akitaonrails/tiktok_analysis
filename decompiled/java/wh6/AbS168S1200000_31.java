package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C098200Yq;
import X.C189200o6;
import X.C20610815kw;
import X.C20611915l7;
import X.C316580Cb2;
import X.C737520SwQ;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell;
import com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS2S2101000_31;

/* JADX INFO: loaded from: classes32.dex */
public class AbS168S1200000_31 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS168S1200000_31 abS168S1200000_31, View view) {
        boolean z;
        Object c098200Yq;
        if (view != null) {
            if (((C316580Cb2) abS168S1200000_31.l1).LL.LJIIL.LIZJ) {
                C20610815kw c20610815kw = C20610815kw.LIZ;
                String strV5 = ((MentionBaseVerticalCell) abS168S1200000_31.l2).V5();
                String str = abS168S1200000_31.s0;
                int bindingAdapterPosition = ((MentionBaseVerticalCell) abS168S1200000_31.l2).getBindingAdapterPosition();
                C20611915l7 c20611915l7 = ((C316580Cb2) abS168S1200000_31.l1).LL;
                c20610815kw.getClass();
                try {
                    C737520SwQ.LIZ("trending_words_click", new AwS2S2101000_31(bindingAdapterPosition, c20611915l7, strV5, str, 1));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }
            C20610815kw c20610815kw2 = C20610815kw.LIZ;
            String str2 = abS168S1200000_31.s0;
            String strU5 = ((MentionBaseVerticalCell) abS168S1200000_31.l2).U5();
            MentionBaseVerticalCell mentionBaseVerticalCell = (MentionBaseVerticalCell) abS168S1200000_31.l2;
            boolean z2 = ((C316580Cb2) abS168S1200000_31.l1).LLILLJJLI;
            boolean z3 = true;
            if (!mentionBaseVerticalCell.S5()) {
                z = true;
            } else {
                z = !z2;
            }
            C20611915l7 c20611915l72 = ((C316580Cb2) abS168S1200000_31.l1).LL;
            c20610815kw2.getClass();
            C20610815kw.LJ(c20611915l72, str2, str2, strU5, "", null, null, null, null, z);
            MentionContainerViewModel mentionContainerViewModelN5 = ((MentionBaseVerticalCell) abS168S1200000_31.l2).N5();
            C20611915l7 c20611915l73 = ((C316580Cb2) abS168S1200000_31.l1).LL;
            int bindingAdapterPosition2 = ((MentionBaseVerticalCell) abS168S1200000_31.l2).getBindingAdapterPosition();
            MentionBaseVerticalCell mentionBaseVerticalCell2 = (MentionBaseVerticalCell) abS168S1200000_31.l2;
            boolean z4 = ((C316580Cb2) abS168S1200000_31.l1).LLILLJJLI;
            if (mentionBaseVerticalCell2.S5()) {
                z3 = true ^ z4;
            }
            mentionContainerViewModelN5.xQ2(c20611915l73, bindingAdapterPosition2, z3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$1(wh6.AbS168S1200000_31 r15, android.view.View r16) {
        /*
            if (r16 == 0) goto L72
            r6 = r15
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
            com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r0 = r0.N5()
            X.15lG r0 = r0.LL
            r5 = 1
            if (r0 == 0) goto L73
            java.lang.String r10 = r0.LJIIL
            int r0 = r10.length()
            if (r0 <= 0) goto L73
        L18:
            X.15kw r2 = X.C20610815kw.LIZ
            java.lang.String r8 = r6.s0
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r1 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r1
            java.lang.Object r0 = r6.l2
            X.0Cb2 r0 = (X.C316580Cb2) r0
            boolean r0 = r0.LLILLJJLI
            r1.getClass()
            r16 = r0 ^ 1
            java.lang.Object r0 = r6.l2
            X.0Cb2 r0 = (X.C316580Cb2) r0
            X.15l7 r7 = r0.LL
            r12 = 0
            java.lang.String r11 = ""
            r2.getClass()
            r9 = r8
            r13 = r12
            r14 = r12
            r15 = r12
            X.C20610815kw.LJ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r1 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r1
            java.lang.Object r0 = r6.l2
            X.0Cb2 r0 = (X.C316580Cb2) r0
            X.15l7 r0 = r0.LL
            r1.R5(r0, r10)
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
            com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r4 = r0.N5()
            java.lang.Object r0 = r6.l2
            X.0Cb2 r0 = (X.C316580Cb2) r0
            X.15l7 r3 = r0.LL
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
            int r2 = r0.getBindingAdapterPosition()
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r1 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r1
            java.lang.Object r0 = r6.l2
            X.0Cb2 r0 = (X.C316580Cb2) r0
            boolean r0 = r0.LLILLJJLI
            r1.getClass()
            r5 = r5 ^ r0
            r4.xQ2(r3, r2, r5)
        L72:
            return
        L73:
            java.lang.String r10 = "repost_mention"
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS168S1200000_31.LIZ$1(wh6.AbS168S1200000_31, android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS168S1200000_31(Object obj, String str, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
