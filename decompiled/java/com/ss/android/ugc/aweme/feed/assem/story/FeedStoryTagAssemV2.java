package com.ss.android.ugc.aweme.feed.assem.story;

import X.C0RF0;
import X.C0RKP;
import X.C14EU;
import X.C1559260qg8;
import X.C1608660rxo;
import X.C1618440sDa;
import X.C1744700vVE;
import X.C1AF0;
import X.C299590Boj;
import X.C300390Bq1;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C622680Oba;
import X.C690430R6j;
import X.C690870R8b;
import X.C694210RKx;
import X.C697110RWb;
import X.C704010RjT;
import X.C723580SZw;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC700430Rdh;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.setting.ui.color.ColorConfig;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedStoryTagAssemV2 extends DynamicComponent<FeedStoryTagAssemV2> implements C0RKP {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bbn;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    public final boolean tp() {
        return true;
    }

    public final TuxIconView Fp() {
        if (bp()) {
            return (TuxIconView) getContentView().findViewById(R.id.w__);
        }
        return null;
    }

    public final TuxTextView Gp() {
        if (bp()) {
            return (TuxTextView) getContentView().findViewById(R.id.w9a);
        }
        return null;
    }

    public final View Ip() {
        if (bp()) {
            return getContentView().findViewById(R.id.w_a);
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
        TuxTextView tuxTextViewGp = Gp();
        if (tuxTextViewGp != null && (paint = tuxTextViewGp.getPaint()) != null) {
            TuxTextView tuxTextViewGp2 = Gp();
            if (tuxTextViewGp2 == null || (text = tuxTextViewGp2.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            fMeasureText = paint.measureText(string);
        }
        return fMeasureText + C418440Gaw.LIZIZ(12) + C418440Gaw.LIZIZ(12);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        C786410Ut5.LJLLLLLL(0, getContentView());
    }

    @Override // X.C0RKP
    public final int ka(boolean z) {
        int iLIZIZ;
        int width;
        if (!C300390Bq1.LIZ() || Fp() == null || Gp() == null || Ip() == null) {
            return 0;
        }
        if (z) {
            TuxTextView tuxTextViewGp = Gp();
            if (tuxTextViewGp != null && tuxTextViewGp.getVisibility() == 0) {
                View viewIp = Ip();
                if (viewIp != null) {
                    width = viewIp.getWidth();
                } else {
                    width = 0;
                }
                iLIZIZ = width - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            } else {
                iLIZIZ = 0;
            }
            TuxIconView tuxIconViewFp = Fp();
            if (tuxIconViewFp != null) {
                C426750GoL.LJIIIZ(tuxIconViewFp, null, null, 0, null, false, 27);
            }
            C339190DRl.LIZIZ(Gp());
            return iLIZIZ;
        }
        TuxIconView tuxIconViewFp2 = Fp();
        if (tuxIconViewFp2 != null) {
            C426750GoL.LJIIIZ(tuxIconViewFp2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, false, 27);
        }
        C339190DRl.LIZLLL(Gp());
        return 0;
    }

    @C14EU
    public final void onPrivateModelEvent(C697110RWb c697110RWb) {
        Object obj;
        Aweme aweme;
        Aweme aweme2 = c697110RWb.LIZIZ;
        if (aweme2 != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            String aid = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            VideoItemParams videoItemParams = (VideoItemParams) obj;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                aid = aweme.getAid();
            }
            if (Intrinsics.LJFF(aid, aweme2.getAid())) {
                if (!aweme2.getIsTikTokStory()) {
                    C786410Ut5.LJLLLLLL(8, getContentView());
                } else {
                    C786410Ut5.LJLLLLLL(0, LJJIJL());
                    C786410Ut5.LJLLLLLL(0, getContentView());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
        setComponentClickStatusExperimental(getContentView(), EnumC700430Rdh.POSITIVE);
        if (C1608660rxo.LIZIZ) {
            View viewFindViewById = view.findViewById(R.id.w_a);
            ColorConfig colorConfig = C1618440sDa.LIZIZ.LJJIJLIJ().LIZ().LIZLLL;
            Integer num = colorConfig.singleColor;
            if (num != null) {
                int iLIZIZ = C694210RKx.LIZIZ(view.getContext(), num);
                Context context = getContext();
                if (context != null && !colorConfig.isShader) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LJIIJJI = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    c384050F3z.LJIIJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    c384050F3z.LJIIIIZZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    c384050F3z.LJIIIZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    c384050F3z.LIZ = Integer.valueOf(iLIZIZ);
                    viewFindViewById.setBackground(c384050F3z.LIZ(context));
                }
            }
        }
        if (C300390Bq1.LIZ()) {
            C426750GoL.LJIIIZ(getContentView(), 0, null, 0, null, false, 26);
            C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), getContentView());
            C426750GoL.LJIIL(getContentView(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, 26);
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
            C704010RjT.LIZIZ(Ip());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        C786410Ut5.LJLLLLLL(0, getContentView());
    }
}
