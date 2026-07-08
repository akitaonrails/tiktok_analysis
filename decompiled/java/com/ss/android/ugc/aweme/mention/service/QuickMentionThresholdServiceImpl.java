package com.ss.android.ugc.aweme.mention.service;

import X.AbstractC848400XPy;
import X.C04TD;
import X.C0XQ7;
import X.C1619660sFY;
import X.C2279851ELn;
import com.ss.android.ugc.aweme.mention.quickmention.IQuickMentionThresholdService;

/* JADX INFO: loaded from: classes25.dex */
public final class QuickMentionThresholdServiceImpl implements IQuickMentionThresholdService {
    public static IQuickMentionThresholdService LJFF() {
        Object objLIZ = C04TD.LIZ(IQuickMentionThresholdService.class, false);
        if (objLIZ != null) {
            return (IQuickMentionThresholdService) objLIZ;
        }
        if (C04TD.j2 == null) {
            synchronized (IQuickMentionThresholdService.class) {
                if (C04TD.j2 == null) {
                    C04TD.j2 = new QuickMentionThresholdServiceImpl();
                }
            }
        }
        return C04TD.j2;
    }

    @Override // com.ss.android.ugc.aweme.mention.quickmention.IQuickMentionThresholdService
    public final void LIZ() {
        C1619660sFY.LIZ.getClass();
        String strLIZ = C1619660sFY.LIZ("key_manual_close_");
        int i = C1619660sFY.LIZIZ().getInt(strLIZ, 0) + 1;
        C1619660sFY.LIZIZ().storeInt(strLIZ, i);
        String strLIZ2 = C1619660sFY.LIZ("key_do_not_click_");
        int i2 = C1619660sFY.LIZIZ().getInt(strLIZ2, 0) + 1;
        C1619660sFY.LIZIZ().storeInt(strLIZ2, i2);
        if (i2 >= ((Number) C2279851ELn.LJ.getValue()).intValue() || i >= ((Number) C2279851ELn.LJFF.getValue()).intValue()) {
            C1619660sFY.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.mention.quickmention.IQuickMentionThresholdService
    public final void LIZIZ() {
        C1619660sFY.LIZ.getClass();
        String strLIZ = C1619660sFY.LIZ("key_do_not_click_");
        int i = C1619660sFY.LIZIZ().getInt(strLIZ, 0) + 1;
        C1619660sFY.LIZIZ().storeInt(strLIZ, i);
        C1619660sFY.LIZIZ().storeInt(C1619660sFY.LIZ("key_manual_close_"), 0);
        if (i >= ((Number) C2279851ELn.LJ.getValue()).intValue()) {
            C1619660sFY.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.mention.quickmention.IQuickMentionThresholdService
    public final boolean LIZJ() {
        C1619660sFY.LIZ.getClass();
        long registerTime = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getRegisterTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((registerTime > jCurrentTimeMillis || jCurrentTimeMillis > registerTime + ((long) 259200000)) && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return !C1619660sFY.LIZIZ().getBoolean(C1619660sFY.LIZ("key_has_quit_"), false);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mention.quickmention.IQuickMentionThresholdService
    public final void LIZLLL() {
        C1619660sFY.LIZ.getClass();
        C1619660sFY.LIZIZ().storeInt(C1619660sFY.LIZ("key_do_not_click_"), 0);
        C1619660sFY.LIZIZ().storeInt(C1619660sFY.LIZ("key_quit_times_"), 0);
    }

    @Override // com.ss.android.ugc.aweme.mention.quickmention.IQuickMentionThresholdService
    public final void LJ() {
        C1619660sFY.LIZ.getClass();
        boolean z = C1619660sFY.LIZIZ().getBoolean(C1619660sFY.LIZ("key_has_quit_"), false);
        int i = C1619660sFY.LIZIZ().getInt(C1619660sFY.LIZ("key_quit_times_"), 0);
        if (!z || i >= ((Number) C2279851ELn.LJI.getValue()).intValue()) {
            return;
        }
        C1619660sFY.LIZIZ().storeBoolean(C1619660sFY.LIZ("key_has_quit_"), false);
        C1619660sFY.LIZIZ().storeInt(C1619660sFY.LIZ("key_do_not_click_"), 0);
        C1619660sFY.LIZIZ().storeInt(C1619660sFY.LIZ("key_manual_close_"), 0);
    }
}
