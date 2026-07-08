package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C0RF0;
import X.C1559260qg8;
import X.C1AF0;
import X.C299590Boj;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C723580SZw;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedReconsumptionTagAssem extends SimpleTagTemplateComponent<FeedReconsumptionTagAssem> {
    public View LLLFF;
    public TuxTextView LLLFFI;

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent
    public final int Gp() {
        return R.layout.b_w;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent, com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r6) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedReconsumptionTagAssem.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fp(com.ss.android.ugc.aweme.feed.model.VideoItemParams r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.getAweme()
            android.view.View r1 = r5.LLJZIJLIL
            if (r1 == 0) goto Lc
            r0 = 0
            X.C786410Ut5.LJLLLLLL(r0, r1)
        Lc:
            com.bytedance.tux.input.TuxTextView r2 = r5.LLLF
            if (r2 == 0) goto L45
            com.ss.android.ugc.aweme.feed.model.RecReasonEntry r1 = r4.getRecReasonTag()
            if (r1 == 0) goto L78
            int r0 = r1.type
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C08A4.LIZ(r0)
            if (r0 == 0) goto L78
            int r0 = r1.type
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r3 == 0) goto L78
            int r1 = r3.intValue()
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L46
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r1 = X.C844470XAv.LIZ()
            r0 = 2131845898(0x7f11630a, float:1.932523E38)
            java.lang.String r0 = r1.getString(r0)
        L42:
            r2.setText(r0)
        L45:
            return
        L46:
            int r1 = r3.intValue()
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto L5f
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r1 = X.C844470XAv.LIZ()
            r0 = 2131845900(0x7f11630c, float:1.9325234E38)
            java.lang.String r0 = r1.getString(r0)
            goto L42
        L5f:
            int r1 = r3.intValue()
            r0 = 103(0x67, float:1.44E-43)
            if (r1 != r0) goto L78
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r1 = X.C844470XAv.LIZ()
            r0 = 2131845899(0x7f11630b, float:1.9325232E38)
            java.lang.String r0 = r1.getString(r0)
            goto L42
        L78:
            X.1EDh r0 = X.C2277711EDh.LIZIZ
            java.lang.String r0 = r0.LJJJJLI(r4)
            if (r0 != 0) goto L42
            java.lang.String r0 = ""
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedReconsumptionTagAssem.Fp(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        super.onViewCreated(view);
        String str = null;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        }
        if (!C704010RjT.LJ(str)) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(4));
            view.setBackground(c384050F3z.LIZ(view.getContext()));
            this.LLLFF = view.findViewById(R.id.nh0);
            this.LLLFFI = (TuxTextView) view.findViewById(R.id.tv_reconsumption_hint);
            return;
        }
        View view2 = this.LLJZIJLIL;
        if (view2 != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.ee);
            c384050F3z2.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z2.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z2.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(4));
            view2.setBackground(c384050F3z2.LIZ(view.getContext()));
        }
        TuxTextView tuxTextView = this.LLLF;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.ej);
        }
        TuxIconView tuxIconView = this.LLL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        View view3 = this.LLJZIJLIL;
        if (view3 == null) {
            return;
        }
        C426750GoL.LJIIIZ(view3, Integer.valueOf((int) C339190DRl.LIZ(4)), null, null, null, false, 30);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent, com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
