package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C0C64;
import X.C0RF0;
import X.C0RKP;
import X.C0SKM;
import X.C1351950lHl;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1AF0;
import X.C299590Boj;
import X.C300390Bq1;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C690430R6j;
import X.C690870R8b;
import X.C700100RdA;
import X.C704010RjT;
import X.C704020RjU;
import X.C715390S4j;
import X.C715400S4k;
import X.C723580SZw;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC700430Rdh;
import X.InterfaceC694230RKz;
import X.InterfaceC710220RtU;
import Y.ACListenerS146S0100000_11;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedPhotoModeVideoTagAssem extends DynamicComponent<FeedPhotoModeVideoTagAssem> implements C0RKP, InterfaceC694230RKz {
    public boolean LLJZIJLIL;
    public int LLL = -1;
    public int LLLF = -1;
    public Integer LLLFF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eah;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    public final boolean tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        return aweme != null && AwemeExtKt.isPhotoMode(aweme) && C0SKM.LJIIIIZZ().blockCheckColor;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        IPhotoSlidesAbility iPhotoSlidesAbility;
        InterfaceC710220RtU interfaceC710220RtUYn;
        if (!this.LLJZIJLIL || (iPhotoSlidesAbility = (IPhotoSlidesAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPhotoSlidesAbility.class, null)) == null || (interfaceC710220RtUYn = iPhotoSlidesAbility.yn()) == null) {
            return;
        }
        interfaceC710220RtUYn.LJI(this);
    }

    public final TuxIconView Fp() {
        if (bp()) {
            return (TuxIconView) getContentView().findViewById(R.id.lm3);
        }
        return null;
    }

    public final TuxTextView Gp() {
        if (bp()) {
            return (TuxTextView) getContentView().findViewById(R.id.zt1);
        }
        return null;
    }

    @Override // X.C0RKP
    public final float Lf() {
        TextPaint paint;
        String string;
        TuxTextView tuxTextViewGp = Gp();
        float fMeasureText = 0.0f;
        if (!C300390Bq1.LIZ()) {
            return 0.0f;
        }
        if (tuxTextViewGp != null && (paint = tuxTextViewGp.getPaint()) != null) {
            CharSequence text = tuxTextViewGp.getText();
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            fMeasureText = paint.measureText(string);
        }
        return fMeasureText + C418440Gaw.LIZIZ(16) + C418440Gaw.LIZIZ(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r7) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoModeVideoTagAssem.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public final void Ip(View view) {
        if (this.LLJZIJLIL && this.LLLFF != null) {
            view.setBackground(null);
            View viewFindViewById = view.findViewById(R.id.qd1);
            if (viewFindViewById != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = this.LLLFF;
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
                return;
            }
            return;
        }
        float f = C715390S4j.LIZ;
        C715390S4j.LIZJ(4, view.findViewById(R.id.qd1));
    }

    @Override // X.C0RKP
    public final int ka(boolean z) {
        View viewFindViewById;
        boolean z2;
        C690870R8b c690870R8b;
        int iValueOf;
        TuxTextView tuxTextViewGp = Gp();
        TuxIconView tuxIconViewFp = Fp();
        String str = null;
        if (bp()) {
            viewFindViewById = getContentView().findViewById(R.id.qd1);
        } else {
            viewFindViewById = null;
        }
        int width = 0;
        if (C300390Bq1.LIZ() && tuxTextViewGp != null && tuxIconViewFp != null && viewFindViewById != null) {
            if (z) {
                if (tuxTextViewGp.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    width = viewFindViewById.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                }
                C426750GoL.LJIIIZ(tuxIconViewFp, null, null, 0, null, false, 27);
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
                    iValueOf = Integer.valueOf(C704020RjU.LIZIZ());
                } else {
                    iValueOf = 22;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(iValueOf));
                C1351950lHl.LJIL(viewFindViewById, iLIZIZ);
                C1351950lHl.LJIJI(iLIZIZ, viewFindViewById);
                C426750GoL.LJIIL(viewFindViewById, 0, null, 0, null, 26);
                C339190DRl.LIZIZ(tuxTextViewGp);
            } else {
                C1351950lHl.LJIL(viewFindViewById, -2);
                C1351950lHl.LJIJI(-2, viewFindViewById);
                C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, 26);
                C426750GoL.LJIIIZ(tuxIconViewFp, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, false, 27);
                C339190DRl.LIZLLL(tuxTextViewGp);
                return 0;
            }
        }
        return width;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        super.onViewCreated(view);
        float f = C715390S4j.LIZ;
        C715390S4j.LIZJ(4, view.findViewById(R.id.qd1));
        setComponentClickStatusExperimental(getContentView(), EnumC700430Rdh.POSITIVE);
        getContentView().setTag(R.id.em7, 0);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "merge_feed_component_click_event", true, false)) {
            View contentView = getContentView();
            this.LLJJLIIIJLLLLLLLZ.getClass();
            contentView.setTag(C700100RdA.LJIIJ, 0);
        }
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 37), getContentView());
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
            C704010RjT.LIZLLL(Gp());
            C704010RjT.LIZJ(Fp());
            C704010RjT.LIZIZ(Gp());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // X.InterfaceC694230RKz
    public final void i4(int i, int i2, Integer num) {
        if (this.LLL == i && this.LLLF == i2 && Intrinsics.LJFF(this.LLLFF, num)) {
            return;
        }
        this.LLL = i;
        this.LLLF = i2;
        this.LLLFF = num;
        TuxTextView tuxTextViewGp = Gp();
        if (tuxTextViewGp != null) {
            tuxTextViewGp.setTextColor(i);
        }
        TuxIconView tuxIconViewFp = Fp();
        if (tuxIconViewFp != null) {
            tuxIconViewFp.setTintColor(i2);
        }
        if (Bo()) {
            Ip(LJJIJL());
        }
    }
}
