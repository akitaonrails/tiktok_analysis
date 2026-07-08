package com.ss.android.ugc.aweme.tag;

import X.C0RF0;
import X.C0RKH;
import X.C0RKP;
import X.C1559260qg8;
import X.C1AF0;
import X.C299590Boj;
import X.C300390Bq1;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C704020RjU;
import X.C715390S4j;
import X.C715400S4k;
import X.C723580SZw;
import X.C786410Ut5;
import X.C814420VxA;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedTextModeVideoTagAssem extends DynamicComponent<FeedTextModeVideoTagAssem> implements C0RKP {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fsi;
    }

    public final TuxIconView Fp() {
        if (bp()) {
            return (TuxIconView) getContentView().findViewById(R.id.lm3);
        }
        return null;
    }

    public final View Gp() {
        if (bp()) {
            return getContentView().findViewById(R.id.xp3);
        }
        return null;
    }

    public final TuxTextView Ip() {
        if (bp()) {
            return (TuxTextView) getContentView().findViewById(R.id.zt1);
        }
        return null;
    }

    @Override // X.C0RKP
    public final float Lf() {
        TextPaint paint;
        String string;
        CharSequence text;
        float fMeasureText = 0.0f;
        if (!C300390Bq1.LIZ()) {
            return 0.0f;
        }
        TuxTextView tuxTextViewIp = Ip();
        if (tuxTextViewIp != null && (paint = tuxTextViewIp.getPaint()) != null) {
            TuxTextView tuxTextViewIp2 = Ip();
            if (tuxTextViewIp2 == null || (text = tuxTextViewIp2.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            fMeasureText = paint.measureText(string);
        }
        return fMeasureText + C418440Gaw.LIZIZ(16) + C418440Gaw.LIZIZ(12);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        C786410Ut5.LJLLLLLL(0, LJJIJL());
    }

    @Override // X.C0RKP
    public final int ka(boolean z) {
        boolean z2;
        String str;
        int iLIZIZ = 0;
        if (C300390Bq1.LIZ() && Ip() != null && Fp() != null && Gp() != null) {
            if (z) {
                TuxTextView tuxTextViewIp = Ip();
                if (tuxTextViewIp != null && tuxTextViewIp.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int iLIZIZ2 = 22;
                if (z2) {
                    View viewGp = Gp();
                    if (viewGp != null) {
                        iLIZIZ = viewGp.getWidth();
                    }
                    iLIZIZ -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                }
                TuxIconView tuxIconViewFp = Fp();
                if (tuxIconViewFp != null) {
                    C426750GoL.LJIIIZ(tuxIconViewFp, null, null, 0, null, false, 27);
                }
                C0RF0 c0rf0 = jm().LIZLLL;
                if (c0rf0 != null) {
                    str = c0rf0.LJIIIZ;
                } else {
                    str = null;
                }
                if (C704010RjT.LJ(str)) {
                    iLIZIZ2 = C704020RjU.LIZIZ();
                }
                View viewGp2 = Gp();
                if (viewGp2 != null) {
                    C0RKH.LIZIZ(viewGp2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ2))));
                }
                View viewGp3 = Gp();
                if (viewGp3 != null) {
                    C0RKH.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ2))), viewGp3);
                }
                View viewGp4 = Gp();
                if (viewGp4 != null) {
                    C426750GoL.LJIIL(viewGp4, 0, null, 0, null, 26);
                }
                C339190DRl.LIZIZ(Ip());
                return iLIZIZ;
            }
            View viewGp5 = Gp();
            if (viewGp5 != null) {
                C0RKH.LIZIZ(viewGp5, -2);
            }
            View viewGp6 = Gp();
            if (viewGp6 != null) {
                C0RKH.LIZ(-2, viewGp6);
            }
            View viewGp7 = Gp();
            if (viewGp7 != null) {
                C426750GoL.LJIIL(viewGp7, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, 26);
            }
            TuxIconView tuxIconViewFp2 = Fp();
            if (tuxIconViewFp2 != null) {
                C426750GoL.LJIIIZ(tuxIconViewFp2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, false, 27);
            }
            C339190DRl.LIZLLL(Ip());
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        super.onViewCreated(view);
        float f = C715390S4j.LIZ;
        C715390S4j.LIZJ(4, view.findViewById(R.id.xp3));
        if (C300390Bq1.LIZ()) {
            C426750GoL.LJIIIZ(getContentView(), 0, null, 0, null, false, 26);
            View viewFindViewById = getContentView().findViewById(R.id.zt1);
            if (viewFindViewById != null) {
                C426750GoL.LJIIIZ(viewFindViewById, null, 0, null, null, false, 29);
            }
        }
        if (!C715400S4k.LIZIZ()) {
            C715390S4j.LIZ(view);
        }
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
        if (C704010RjT.LJ(str)) {
            C704010RjT.LIZLLL(Ip());
            C704010RjT.LIZJ(Fp());
            C704010RjT.LIZIZ(Ip());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
