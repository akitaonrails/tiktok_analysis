package com.ss.android.ugc.aweme.texttoimage.choose;

import X.AbstractC558210Lut;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331750klB;
import X.C1332060klg;
import X.C2211631BhB;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C558190Lur;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageAIChooseCell extends Text2ImageBaseChooseCell<C558190Lur> {
    public TuxTextView LLILZ;
    public ViewGroup LLILZIL;
    public TuxIconView LLILZLL;
    public String LLIZ = "";

    @Override // com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageBaseChooseCell
    public final void I5() {
        C2211631BhB.LJ(this.itemView, new AwS587S0100000_8(this, 293));
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageBaseChooseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View viewFindViewById = this.itemView.findViewById(R.id.s92);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = 1711276032;
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        viewFindViewById.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        this.LLILZ = (TuxTextView) viewFindViewById.findViewById(R.id.s9g);
        this.LLILZLL = (TuxIconView) viewFindViewById.findViewById(R.id.kc0);
        C426750GoL.LJIIIZ(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), false, 16);
        this.LLILZIL = (ViewGroup) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageBaseChooseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C558190Lur c558190Lur) {
        String str;
        int iIntValue;
        String str2;
        Integer numLIZJ;
        String str3 = "";
        this.LLIZ = "";
        C558190Lur c558190Lur2 = (C558190Lur) getItem();
        if (c558190Lur2 != null && (str = c558190Lur2.LLJIJIL) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI);
            c1331670kl3LJIIIZ.LJIIIIZZ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            c1331670kl3LJIIIZ.LJIIIZ = 400;
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(8);
            c1331750klB.LIZIZ = C418440Gaw.LIZIZ(1);
            Context context = this.itemView.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c1331750klB.LIZJ = iIntValue;
            c1331670kl3LJIIIZ.LJJI = c1331750klB.LIZ();
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            C558190Lur c558190Lur3 = (C558190Lur) getItem();
            if (c558190Lur3 != null && (str2 = c558190Lur3.LLJILJIL) != null) {
                str3 = str2;
            }
            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str3);
            c1331670kl3LJIIIZ2.LJIIIIZZ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            c1331670kl3LJIIIZ2.LJIIIZ = 400;
            c1331670kl3LJIIIZ2.LJJIFFI = new C1332060klg(25, 3);
            c1331670kl3LJIIIZ2.LJJIII();
            this.LLIZ = str;
        }
        S5(c558190Lur);
        P5(c558190Lur);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5(X.C558190Lur r6) {
        /*
            r5 = this;
            X.0LpL r1 = r6.LLJJI
            X.0LpL r0 = X.EnumC554770LpL.PENDING
            r4 = 8
            r3 = 0
            if (r1 != r0) goto L3f
            com.bytedance.tux.input.TuxTextView r2 = r5.LLILZ
            if (r2 == 0) goto L2d
            X.C786410Ut5.LJLLLLLL(r3, r2)
            java.lang.Integer r0 = r6.LLJJ
            if (r0 == 0) goto L3c
            int r0 = r0.intValue()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            r0 = 37
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 == 0) goto L3c
        L2a:
            r2.setText(r0)
        L2d:
            android.view.ViewGroup r0 = r5.LLILZIL
            if (r0 == 0) goto L34
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L34:
            com.bytedance.tux.icon.TuxIconView r0 = r5.LLILZLL
            if (r0 == 0) goto L3b
            X.C786410Ut5.LJLLLLLL(r4, r0)
        L3b:
            return
        L3c:
            java.lang.String r0 = "0%"
            goto L2a
        L3f:
            X.0LpL r0 = X.EnumC554770LpL.ERROR
            if (r1 != r0) goto L59
            android.view.ViewGroup r0 = r5.LLILZIL
            if (r0 == 0) goto L4a
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L4a:
            com.bytedance.tux.input.TuxTextView r0 = r5.LLILZ
            if (r0 == 0) goto L51
            X.C786410Ut5.LJLLLLLL(r4, r0)
        L51:
            com.bytedance.tux.icon.TuxIconView r0 = r5.LLILZLL
            if (r0 == 0) goto L3b
            X.C786410Ut5.LJLLLLLL(r3, r0)
            return
        L59:
            android.view.ViewGroup r0 = r5.LLILZIL
            if (r0 == 0) goto L60
            X.C786410Ut5.LJLLLLLL(r4, r0)
        L60:
            X.0zJl r0 = r5.getItem()
            X.0Lur r0 = (X.C558190Lur) r0
            if (r0 == 0) goto L3b
            java.lang.String r2 = r0.LLIZ
            if (r2 == 0) goto L3b
            java.lang.String r0 = r5.LLIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L3b
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r2)
            X.0kl3 r1 = X.C1331660kl2.LJII(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r5.LLILLJJLI
            r1.LJJ(r0)
            X.C786410Ut5.h3(r1)
            r5.LLIZ = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageAIChooseCell.S5(X.0Lur):void");
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageBaseChooseCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.ae4, false, 4, null);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageBaseChooseCell
    /* JADX INFO: renamed from: N5 */
    public final void onBindItemView(AbstractC558210Lut abstractC558210Lut, List list) {
        C558190Lur c558190Lur = (C558190Lur) abstractC558210Lut;
        if (!list.isEmpty()) {
            S5(c558190Lur);
        }
        P5(c558190Lur);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageBaseChooseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C558190Lur c558190Lur = (C558190Lur) interfaceC1891350zJl;
        if (!list.isEmpty()) {
            S5(c558190Lur);
        }
        P5(c558190Lur);
    }
}
