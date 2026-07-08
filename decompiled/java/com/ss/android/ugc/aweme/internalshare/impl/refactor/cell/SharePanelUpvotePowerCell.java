package com.ss.android.ugc.aweme.internalshare.impl.refactor.cell;

import X.C01GW;
import X.C0CBR;
import X.C1303280k1G;
import X.C1360460lVU;
import X.C1361600lXK;
import X.C1362180lYG;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C19719612Di;
import X.C20642515q3;
import X.C419910GdJ;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1361560lXG;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS155S0100000_21;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelUpvotePowerCell extends AbsSharePanelPowerCell<C1361600lXK> {
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 646));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 645));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 648));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 647));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(284));
    public int LLJ = -1;

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell
    public final boolean I5() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell
    public final int N5() {
        return 5;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cn8;
    }

    public final C1303280k1G R5() {
        return (C1303280k1G) this.LLILZIL.getValue();
    }

    public final InterfaceC1361560lXG S5() {
        return (InterfaceC1361560lXG) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemViewCreated() {
        /*
            r5 = this;
            super.onItemViewCreated()
            X.0lYA r0 = r5.L5()
            r4 = 0
            if (r0 == 0) goto L7d
            X.0lY9 r0 = r0.LLILLL
            if (r0 == 0) goto L7d
            X.0lYL r3 = r0.LJIIIZ
            if (r3 == 0) goto L7e
            android.view.View r0 = r5.itemView
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r0 = r3.LJIIJJI
            r1.width = r0
            X.0k1G r0 = r5.R5()
            if (r0 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L2e
            int r0 = r3.LJIIL
            r1.width = r0
            r1.height = r0
        L2e:
            X.01GW r0 = r5.LLILZ
            java.lang.Object r2 = r0.getValue()
            com.bytedance.tux.widget.RadiusLayout r2 = (com.bytedance.tux.widget.RadiusLayout) r2
            int r0 = r3.LJIIL
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r2.setRadius(r1)
        L3f:
            X.01GW r0 = r5.LLIZ
            java.lang.Object r2 = r0.getValue()
            com.bytedance.tux.input.TuxTextView r2 = (com.bytedance.tux.input.TuxTextView) r2
            if (r2 == 0) goto L7c
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L66
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r1 == 0) goto L66
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r1.topMargin = r0
            r4 = r1
        L66:
            X.C786410Ut5.R6(r2, r4)
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
            r2.setTextColorRes(r0)
            if (r3 == 0) goto L7c
            java.lang.Integer r0 = r3.LJIIZILJ
            if (r0 == 0) goto L7c
            int r0 = r0.intValue()
            r2.setTuxFont(r0)
        L7c:
            return
        L7d:
            r3 = r4
        L7e:
            android.view.View r0 = r5.itemView
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = 62
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r1.width = r0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelUpvotePowerCell.onItemViewCreated():void");
    }

    public final void P5(C1361600lXK c1361600lXK) {
        C1362180lYG c1362180lYG = c1361600lXK.LLILLL;
        if (!c1362180lYG.LIZIZ.LIZ && c1362180lYG.LIZJ) {
            C1303280k1G c1303280k1GR5 = R5();
            if (c1303280k1GR5 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1303280k1GR5);
                c1303280k1GR5.setAlpha(1.0f);
            }
            TuxIconView tuxIconView = (TuxIconView) this.LLILZLL.getValue();
            if (tuxIconView != null) {
                C786410Ut5.x5(tuxIconView, 1.0f);
            }
            C786410Ut5.B5((TuxTextView) this.LLIZ.getValue(), 1.0f);
            return;
        }
        C1303280k1G c1303280k1GR52 = R5();
        if (c1303280k1GR52 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1303280k1GR52);
            c1303280k1GR52.setAlpha(0.34f);
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LLILZLL.getValue();
        if (tuxIconView2 != null) {
            C786410Ut5.x5(tuxIconView2, 0.34f);
        }
        C786410Ut5.B5((TuxTextView) this.LLIZ.getValue(), 0.34f);
    }

    public final void T5(int i) {
        if (i == this.LLJ) {
            return;
        }
        this.LLJ = i;
        if (C13LQ.LJJIJIIJI(Integer.valueOf(i), new Integer[]{0, 1}) >= 0) {
            String strLJIIJJI = S5().LJIIJJI();
            C1303280k1G c1303280k1GR5 = R5();
            if (c1303280k1GR5 != null) {
                c1303280k1GR5.setAnimation(strLJIIJJI);
            }
            ((TextView) this.LLIZ.getValue()).setText(C20642515q3.LJI(S5().LJII()));
            return;
        }
        int iLJFF = S5().LJFF();
        C1303280k1G c1303280k1GR52 = R5();
        if (c1303280k1GR52 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = iLJFF;
            c1303280k1GR52.setImageDrawable(c419910GdJ.LIZ(c1303280k1GR52.getContext()));
        }
        ((TextView) this.LLIZ.getValue()).setText(C20642515q3.LJI(S5().LJIIJ()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1303280k1G c1303280k1GR5;
        C1361600lXK c1361600lXK = (C1361600lXK) interfaceC1891350zJl;
        this.LL.LIZ(c1361600lXK.LL, "SHARE_PANEL", new AwS565S0100000_21(this, 1255));
        T5(c1361600lXK.LLILZ);
        P5(c1361600lXK);
        if (!C1360460lVU.LIZIZ.LJJII().LJIILL() && c1361600lXK.LLILZ == 0) {
            S5().LIZJ();
            C1303280k1G c1303280k1GR52 = R5();
            if (c1303280k1GR52 != null) {
                c1303280k1GR52.setRepeatCount(S5().LJIIIIZZ());
            }
            if (!C0CBR.LIZIZ && (c1303280k1GR5 = R5()) != null) {
                c1303280k1GR5.playAnimation();
            }
        }
        ACListenerS155S0100000_21 aCListenerS155S0100000_21 = new ACListenerS155S0100000_21(this, 146);
        C1303280k1G c1303280k1GR53 = R5();
        if (c1303280k1GR53 != null) {
            C786410Ut5.A9(c1303280k1GR53, aCListenerS155S0100000_21);
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLILZLL.getValue();
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, aCListenerS155S0100000_21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        ?? arrayList;
        C1361600lXK c1361600lXK = (C1361600lXK) interfaceC1891350zJl;
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList = Collections.singletonList(obj);
                } else if (obj instanceof List) {
                    arrayList = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        if (obj2 instanceof String) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(arrayList, arrayList2);
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
            if (setLLIIJI.contains("payload_key_upvote_status")) {
                T5(c1361600lXK.LLILZ);
            }
            if (setLLIIJI.contains("payload_ui_state")) {
                P5(c1361600lXK);
            }
        }
    }
}
