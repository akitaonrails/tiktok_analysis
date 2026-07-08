package com.ss.android.ugc.profile.business.profile.tab.card;

import X.C0LAB;
import X.C1251870igL;
import X.C197039127h;
import X.C20684815ws;
import X.C384050F3z;
import X.C418440Gaw;
import X.C428150Gqb;
import X.C786410Ut5;
import X.EnumC428940Grs;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class GuideCardCell extends PowerCell<C1251870igL> {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C197039127h LLILZ;
    public boolean LLILZIL = true;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        UserProfileGuideDataV2 userProfileGuideDataV2;
        super.onViewAttachedToWindow();
        if (this.LLILZIL) {
            this.LLILZIL = false;
            C0LAB c0lab = new C0LAB();
            C1251870igL item = getItem();
            c0lab.LJ("scene_type", (item == null || (userProfileGuideDataV2 = item.LL) == null) ? null : userProfileGuideDataV2.getName());
            C20684815ws.LJIILLIIL("profile_empty_guide_show", c0lab.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013d  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r9) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.tab.card.GuideCardCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ee7, viewGroup, false);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.jd5);
        this.LL = tuxIconView;
        if (tuxIconView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0o);
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            tuxIconView.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        }
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.jdx);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.jdj);
        this.LLILZ = (C197039127h) viewTd.findViewById(R.id.jbp);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zn);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        viewTd.setBackground(c384050F3z2.LIZ(viewGroup.getContext()));
        C428150Gqb.LIZ(viewTd, EnumC428940Grs.SCALE, 0.0f);
        return viewTd;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I5(com.ss.android.ugc.profile.business.profile.tab.card.GuideCardCell r5, com.bytedance.tux.input.TuxTextView r6, com.ss.android.ugc.aweme.profile.model.Describe r7, java.lang.Integer r8, java.lang.Integer r9) {
        /*
            r5.getClass()
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L59
            r3 = 0
            if (r7 == 0) goto L60
            java.lang.String r1 = r7.getTextColor()
            java.lang.String r4 = r7.getTextFont()
        L14:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = X.C1721460utk.LIZ
            java.lang.String r2 = "profile_guide_user_card_v2"
            java.lang.Integer r1 = X.C1721460utk.LIZIZ(r5, r1, r2)
            if (r1 == 0) goto L5d
            int r0 = r1.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C0H5S.LIZ(r0)
            if (r0 == 0) goto L5d
            r8 = r1
        L2d:
            int r0 = r8.intValue()
            r6.setTextColor(r0)
        L34:
            java.lang.Integer r1 = X.C1721460utk.LIZ(r4, r2)
            if (r1 == 0) goto L5a
            int r0 = r1.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C0H5S.LIZ(r0)
            if (r0 == 0) goto L5a
            r9 = r1
        L49:
            int r0 = r9.intValue()
            r6.setTuxFont(r0)
        L50:
            if (r7 == 0) goto L56
            java.lang.String r3 = r7.getRemoteText()
        L56:
            r6.setText(r3)
        L59:
            return
        L5a:
            if (r9 == 0) goto L50
            goto L49
        L5d:
            if (r8 == 0) goto L34
            goto L2d
        L60:
            r1 = r3
            r4 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.tab.card.GuideCardCell.I5(com.ss.android.ugc.profile.business.profile.tab.card.GuideCardCell, com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.profile.model.Describe, java.lang.Integer, java.lang.Integer):void");
    }
}
