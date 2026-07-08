package com.ss.android.ugc.aweme.story.service;

import X.C1601110rld;
import X.C1840380xzY;
import X.C1840430xzd;
import X.C1840450xzf;
import X.C20684815ws;
import X.C2214201BlK;
import X.C288820BTs;
import X.InterfaceC1891350zJl;
import X.InterfaceC427710Gpt;
import Y.AfS196S0100000_27;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Build;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.widget.IStoryWidgetService;
import com.ss.android.ugc.aweme.story.widget.guide.StoryWidgetGuideInboxCell;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes28.dex */
public final class StoryWidgetServiceImpl implements IStoryWidgetService {
    @Override // com.ss.android.ugc.aweme.story.widget.IStoryWidgetService
    public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>>[] LJFF() {
        return new Class[]{StoryWidgetGuideInboxCell.class};
    }

    @Override // com.ss.android.ugc.aweme.story.widget.IStoryWidgetService
    public final void LIZ() {
        C1840450xzf.LIZ.getClass();
        C1840450xzf.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.widget.IStoryWidgetService
    public final Map<String, String> LIZJ() {
        HashMap map = new HashMap();
        C1840430xzd c1840430xzd = C1840430xzd.LIZ;
        c1840430xzd.getClass();
        if (C1840430xzd.LIZLLL != 1) {
            return map;
        }
        c1840430xzd.getClass();
        map.put("enter_to", C1840430xzd.LIZJ);
        c1840430xzd.getClass();
        map.put("from_awe_widget", String.valueOf(C1840430xzd.LIZLLL));
        c1840430xzd.getClass();
        map.put("refer", C1840430xzd.LJ);
        c1840430xzd.getClass();
        map.put("gd_label", C1840430xzd.LJFF);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    @Override // com.ss.android.ugc.aweme.story.widget.IStoryWidgetService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<X.InterfaceC1891350zJl, java.lang.Boolean> LIZLLL() {
        /*
            r9 = this;
            X.0xzf r0 = X.C1840450xzf.LIZ
            r0.getClass()
            boolean r0 = X.C1840450xzf.LIZ()
            r1 = 0
            if (r0 != 0) goto L14
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.<init>(r1, r0)
            return r2
        L14:
            com.bytedance.keva.Keva r1 = X.C1840470xzh.LIZ()
            java.lang.String r0 = "keva_key_widget_guide_dialog_appeared"
            r7 = 0
            boolean r8 = r1.getBoolean(r0, r7)
            com.bytedance.keva.Keva r3 = X.C1840470xzh.LIZ()
            java.lang.String r2 = "keva_key_widget_guide_appear_time"
            r0 = -1
            long r3 = r3.getLong(r2, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r6 = 1
            if (r0 < 0) goto L7d
            long r0 = X.C1840450xzf.LIZIZ
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[dz isStoryGuideFirstTimeShowMoreThan72Hours] show72HourTimeInMs:"
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = ", curTime: "
            r5.append(r0)
            r5.append(r1)
            X.C2188811AlT.LIZIZ(r5)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7d
            r2 = 1
        L55:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "widget guide dialog appeared: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", more than 72hours: "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            if (r8 != 0) goto L7f
            if (r2 != 0) goto L7f
            kotlin.Pair r2 = new kotlin.Pair
            X.0rgt r1 = new X.0rgt
            r1.<init>(r6)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.<init>(r1, r0)
            return r2
        L7d:
            r2 = 0
            goto L55
        L7f:
            kotlin.Pair r2 = new kotlin.Pair
            X.0rgt r1 = new X.0rgt
            r1.<init>(r7)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.service.StoryWidgetServiceImpl.LIZLLL():kotlin.Pair");
    }

    @Override // com.ss.android.ugc.aweme.story.widget.IStoryWidgetService
    public final void LIZIZ(final Context context) {
        int i;
        C1840430xzd.LIZ.getClass();
        if (C1601110rld.LIZ() && C288820BTs.LIZ() && context.getPackageManager().hasSystemFeature("android.software.app_widgets") && !C1840430xzd.LIZIZ) {
            C1840430xzd.LIZIZ = true;
            C1840380xzY.LIZ.getClass();
            if (C1840380xzY.LIZ(context).length == 0) {
                i = 1;
            } else {
                i = 0;
            }
            C20684815ws.LJIJI("launch_widget_info", new Pair(Integer.valueOf(i ^ 1), "has_widget"));
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0xze
                @Override // X.InterfaceC427710Gpt
                public final void LLLLLLZZ(int i2, User user, User user2) {
                    if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                        return;
                    }
                    C1840430xzd c1840430xzd = C1840430xzd.LIZ;
                    Context context2 = context;
                    c1840430xzd.getClass();
                    C1840430xzd.LIZ(context2, "on user change");
                }
            });
            C2214201BlK.LIZLLL().LJJLJLI(new AfS196S0100000_27(context, 33));
            C1840430xzd.LIZ(context, "init");
        }
    }

    @Override // com.ss.android.ugc.aweme.story.widget.IStoryWidgetService
    public final boolean LJ(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AppWidgetManager.getInstance(context).isRequestPinAppWidgetSupported();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.widget.IStoryWidgetService
    public final void LJI(boolean z, boolean z2) {
        String str;
        C1840430xzd.LIZ.getClass();
        C1840430xzd.LIZLLL = 1;
        if (z) {
            str = "story_collection";
        } else {
            str = "video_shoot_page";
        }
        C1840430xzd.LIZJ = str;
        if (z2) {
            C1840430xzd.LJ = "story_widget_extension_large";
            C1840430xzd.LJFF = "click_story_widget_extension_large";
        } else {
            C1840430xzd.LJ = "story_widget_extension_small";
            C1840430xzd.LJFF = "click_story_widget_extension_small";
        }
    }
}
