package com.ss.android.ugc.aweme.notification.view;

import X.C01GW;
import X.C1388190mED;
import X.C1583640rJS;
import X.C1583950rJx;
import X.C1584000rK2;
import X.C1584190rKL;
import X.C1585030rLh;
import X.C1592290rXP;
import X.C1593140rYm;
import X.C452501pT;
import X.EnumC1583960rJy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public final class NotificationTabProtocol extends BottomTabProtocol {
    public Context LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1583950rJx(this));
    public final C1592290rXP LLILZIL;
    public final String LLILZLL;
    public final C01GW LLIZ;
    public final EnumC1583960rJy LLIZLLLIL;
    public final String LLJ;

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return (Class) this.LLIZ.getValue();
    }

    public NotificationTabProtocol() {
        C1592290rXP c1592290rXP;
        boolean zLJIIL = C1585030rLh.LJIIL();
        Integer numValueOf = Integer.valueOf(R.id.nw8);
        if (zLJIIL) {
            c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_tab_bottom_inbox_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_inbox_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_inbox, R.attr.a1k, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_inbox, R.attr.a1k, false, 12), numValueOf, 32);
        } else {
            int i = C1584000rK2.LIZ[C1584190rKL.LIZ().ordinal()];
            if (i == 1) {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_inbox_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_inbox_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_inbox_light, R.attr.a1k, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_inbox_dark, R.attr.a1k, true, 4), numValueOf, 32);
            } else if (i != 2) {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.drawable.cq1, R.attr.a1h, false, 12), new C1593140rYm(R.drawable.cq0, R.attr.ee, false, 12), new C1593140rYm(R.drawable.cq2, R.attr.a1k, false, 12), new C1593140rYm(R.drawable.cpz, R.attr.eg, false, 12), numValueOf, 32);
            } else {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_inbox_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_inbox_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_inbox_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_inbox_dark, R.attr.a1h, true, 4), numValueOf, 32);
            }
        }
        this.LLILZIL = c1592290rXP;
        this.LLILZLL = "NOTIFICATION";
        this.LLIZ = C452501pT.LIZIZ(new C1583640rJS(this));
        this.LLIZLLLIL = EnumC1583960rJy.TAB_4;
        this.LLJ = "notification_page";
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1592290rXP LIZJ() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC1583960rJy LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getMob() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LLILZLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(android.content.Context r14) {
        /*
            r13 = this;
            r0 = 71935(0x118ff, float:1.00802E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            r2 = 1
            if (r0 == 0) goto L9d
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L9d
            r0 = 1
        L17:
            r12 = 0
            if (r0 == 0) goto La0
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r7 = com.ss.android.ugc.aweme.services.IExternalService.class
            r8 = 0
            r11 = 14
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
            if (r0 == 0) goto L9a
            com.ss.android.ugc.aweme.services.external.IEnterFromService r4 = r0.enterFromService()
            if (r4 == 0) goto L9a
            java.lang.String r3 = r4.getEnterFrom()
            if (r3 == 0) goto L92
            int r1 = r3.hashCode()
            r0 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r1 == r0) goto L87
            r0 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r1 == r0) goto L7c
            r0 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r1 != r0) goto L92
            java.lang.String r0 = "USER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L92
            java.lang.String r5 = "personal_homepage"
        L52:
            X.19EG r4 = X.C1388190mED.LIZIZ(r14)
            X.0Oin r3 = new X.0Oin
            r3.<init>()
            android.os.Bundle r1 = r3.LIZ
            java.lang.String r0 = "show_login_page_first"
            r1.putBoolean(r0, r2)
            android.os.Bundle r1 = r3.LIZ
            java.lang.String r0 = "prevent_multiple_panels"
            r1.putBoolean(r0, r2)
            android.os.Bundle r2 = r3.LIZ
            X.0sHc r1 = new X.0sHc
            r0 = 1
            r1.<init>(r13, r0)
            java.lang.String r0 = "click_inbox_tab"
            X.C0XPD.LIZIZ(r4, r5, r0, r2, r1)
            if (r6 == 0) goto L7b
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L7b:
            return
        L7c:
            java.lang.String r0 = "HOME"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L92
            java.lang.String r5 = "homepage_hot"
            goto L52
        L87:
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L92
            java.lang.String r5 = "message"
            goto L52
        L92:
            if (r4 == 0) goto L9a
            java.lang.String r5 = r4.getEnterFrom()
            if (r5 != 0) goto L52
        L9a:
            java.lang.String r5 = ""
            goto L52
        L9d:
            r0 = 0
            goto L17
        La0:
            X.01GW r0 = r13.LLILZ
            java.lang.Object r0 = r0.getValue()
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r12)
            if (r6 == 0) goto Lb0
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.view.NotificationTabProtocol.LJII(android.content.Context):void");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Bundle V9(Context context) {
        Intent intent;
        Bundle extras;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && (intent = activityLIZ.getIntent()) != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            if (extras != null) {
                return extras;
            }
        }
        return new Bundle();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        this.LLILLL = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String mc(Context context) {
        return context.getResources().getString(2131838282);
    }
}
