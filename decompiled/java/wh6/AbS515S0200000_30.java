package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C14NJ;
import X.C14NX;
import X.C1863370yad;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.nimblecard.tako.model.Event;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.multiconversation.TakoSubConversationItemAssem;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public class AbS515S0200000_30 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS515S0200000_30 abS515S0200000_30, View view) {
        C1863370yad c1863370yad;
        Function2<Context, ConversationInfo, Unit> function2;
        if (view != null && (c1863370yad = ((TakoSubConversationItemAssem) abS515S0200000_30.l0).LLJJLIIIJLLLLLLLZ) != null && (function2 = c1863370yad.LLILZLL) != null) {
            function2.invoke(((View) abS515S0200000_30.l1).getContext(), c1863370yad.LL);
        }
    }

    public static final void LIZ$1(AbS515S0200000_30 abS515S0200000_30, View view) {
        Object obj;
        C14NJ next;
        if (view != null) {
            for (Event event : (List) abS515S0200000_30.l0) {
                Iterator<C14NJ> it2 = ((C14NX) abS515S0200000_30.l1).LIZIZ().LLILLL.LIZJ.iterator();
                while (true) {
                    obj = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getName(), event.eventName)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C14NJ c14nj = next;
                if (c14nj != null) {
                    String str = event.condition;
                    if (str != null) {
                        if (str.length() > 0) {
                            Object objLJIIZILJ = ((C14NX) abS515S0200000_30.l1).LJIIZILJ(event.condition);
                            if (objLJIIZILJ instanceof Boolean) {
                                obj = objLJIIZILJ;
                            }
                            if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                            }
                        }
                    }
                    Map<String, ? extends Object> map = event.params;
                    C14NX c14nx = (C14NX) abS515S0200000_30.l1;
                    c14nj.LIZ(map, c14nx, c14nx.LIZJ(), ((C14NX) abS515S0200000_30.l1).LJIIIIZZ());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[PHI: r2
      0x0023: PHI (r2v3 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:8:0x001d, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[PHI: r5
      0x0041: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:19:0x003f, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[PHI: r5
      0x0045: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:19:0x003f, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r2
      0x001f: PHI (r2v4 java.lang.String) = (r2v0 java.lang.String), (r2v5 java.lang.String) binds: [B:8:0x001d, B:6:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$2(wh6.AbS515S0200000_30 r12, android.view.View r13) {
        /*
            if (r13 == 0) goto L66
            java.lang.String r0 = com.ss.android.ugc.aweme.tako.ui.TakoBotCenterFragment._pnsPageId
            java.lang.Object r0 = r12.l0
            com.ss.android.ugc.aweme.tako.botpage.components.botcenter.BotCenterCell r0 = (com.ss.android.ugc.aweme.tako.botpage.components.botcenter.BotCenterCell) r0
            android.view.View r0 = r0.itemView
            android.content.Context r4 = r0.getContext()
            java.lang.Object r3 = r12.l1
            X.14Gl r3 = (X.C20237314Gl) r3
            X.14Gm r0 = r3.LLILLL
            java.lang.String r11 = ""
            if (r0 == 0) goto L1c
            java.lang.String r2 = r0.LL
            if (r2 != 0) goto L1f
        L1c:
            r2 = r11
            if (r0 == 0) goto L23
        L1f:
            java.lang.String r1 = r0.LLILLJJLI
            if (r1 != 0) goto L24
        L23:
            r1 = r11
        L24:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r3.LLILLJJLI
            X.C20232314En.LIZ(r4, r2, r1, r0)
            X.0yYx r2 = X.C1862330yYx.LIZ
            java.lang.Object r1 = r12.l1
            X.14Gl r1 = (X.C20237314Gl) r1
            X.14Gm r0 = r1.LLILLL
            r4 = 0
            if (r0 == 0) goto L67
            java.lang.String r3 = r0.LL
            java.lang.String r4 = r0.LLILLJJLI
        L38:
            if (r0 == 0) goto L3e
            java.lang.String r5 = r0.LLILLL
            if (r5 != 0) goto L41
        L3e:
            r5 = r11
            if (r0 == 0) goto L45
        L41:
            java.lang.String r10 = r0.LLILZ
            if (r10 != 0) goto L46
        L45:
            r10 = r11
        L46:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r1.LLILLJJLI
            long r0 = r0.botId
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r12.l1
            X.14Gl r1 = (X.C20237314Gl) r1
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r1.LLILLJJLI
            java.lang.String r6 = r0.botName
            java.lang.String r9 = r1.LL
            X.14Gm r0 = r1.LLILLL
            if (r0 == 0) goto L61
            java.lang.String r0 = r0.LLILZIL
            if (r0 == 0) goto L61
            r11 = r0
        L61:
            java.lang.String r8 = "tab_page"
            X.C1862330yYx.LJLZ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L66:
            return
        L67:
            r3 = r4
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS515S0200000_30.LIZ$2(wh6.AbS515S0200000_30, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[PHI: r2
      0x0023: PHI (r2v3 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:8:0x001d, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[PHI: r3 r4 r5
      0x003f: PHI (r3v3 java.lang.String) = (r3v5 java.lang.String), (r3v6 java.lang.String) binds: [B:17:0x003d, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r4v2 java.lang.String) = (r4v4 java.lang.String), (r4v5 java.lang.String) binds: [B:17:0x003d, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r5v0 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String) binds: [B:17:0x003d, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r2
      0x001f: PHI (r2v4 java.lang.String) = (r2v0 java.lang.String), (r2v5 java.lang.String) binds: [B:8:0x001d, B:6:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$3(wh6.AbS515S0200000_30 r12, android.view.View r13) {
        /*
            if (r13 == 0) goto L61
            java.lang.String r0 = com.ss.android.ugc.aweme.tako.ui.TakoBotCenterFragment._pnsPageId
            java.lang.Object r0 = r12.l0
            com.ss.android.ugc.aweme.tako.botpage.components.botcenter.RecentlyAddCell r0 = (com.ss.android.ugc.aweme.tako.botpage.components.botcenter.RecentlyAddCell) r0
            android.view.View r0 = r0.itemView
            android.content.Context r4 = r0.getContext()
            java.lang.Object r3 = r12.l1
            X.14Gk r3 = (X.C20237214Gk) r3
            X.14Gm r0 = r3.LLILLJJLI
            java.lang.String r10 = ""
            if (r0 == 0) goto L1c
            java.lang.String r2 = r0.LL
            if (r2 != 0) goto L1f
        L1c:
            r2 = r10
            if (r0 == 0) goto L23
        L1f:
            java.lang.String r1 = r0.LLILLJJLI
            if (r1 != 0) goto L24
        L23:
            r1 = r10
        L24:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r3.LL
            X.C20232314En.LIZ(r4, r2, r1, r0)
            X.0yYx r2 = X.C1862330yYx.LIZ
            java.lang.Object r1 = r12.l1
            X.14Gk r1 = (X.C20237214Gk) r1
            X.14Gm r0 = r1.LLILLJJLI
            r11 = 0
            if (r0 == 0) goto L62
            java.lang.String r3 = r0.LL
            java.lang.String r4 = r0.LLILLJJLI
            java.lang.String r5 = r0.LLILLL
            if (r5 != 0) goto L3f
        L3c:
            r5 = r10
            if (r0 == 0) goto L44
        L3f:
            java.lang.String r0 = r0.LLILZ
            if (r0 == 0) goto L44
            r10 = r0
        L44:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r1.LL
            long r0 = r0.botId
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r12.l1
            X.14Gk r1 = (X.C20237214Gk) r1
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r1.LL
            java.lang.String r6 = r0.botName
            X.14Gm r0 = r1.LLILLJJLI
            if (r0 == 0) goto L5a
            java.lang.String r11 = r0.LLILZIL
        L5a:
            java.lang.String r8 = "top_cell"
            java.lang.String r9 = ""
            X.C1862330yYx.LJLZ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L61:
            return
        L62:
            r3 = r11
            r4 = r11
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS515S0200000_30.LIZ$3(wh6.AbS515S0200000_30, android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS515S0200000_30(TakoSubConversationItemAssem takoSubConversationItemAssem, View view, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = takoSubConversationItemAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS515S0200000_30(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
