package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C019F;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C631230OpN;
import X.C631940OqW;
import X.C632090Oql;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.music.vm.MusicHighlightBackgroundViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellBackgroundAssem extends DefaultBackgroundAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public View LLJL;
    public final InterfaceC1731706qJ LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellBackgroundAssem.class, "highlightBackgroundViewModel", "getHighlightBackgroundViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicHighlightBackgroundViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicCellBackgroundAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicHighlightBackgroundViewModel.class);
        this.LLJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1117), null, AFwS240S0000000_9.get$arr$(454));
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultBackgroundAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eg9;
    }

    public final MusicHighlightBackgroundViewModel tp() {
        return (MusicHighlightBackgroundViewModel) this.LLJLIL.getValue(this, LLJLILLLLZIIL[0]);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultBackgroundAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        super.Eo(view);
        this.LLJL = view.findViewById(R.id.ote);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0OqV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2438609h2) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 105), 6);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultBackgroundAssem
    public final void op(C631940OqW c631940OqW) {
        Integer numLIZJ;
        Object obj;
        if (c631940OqW.isHighlighted()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            MusicModel musicModel = ((C632090Oql) obj).getMusicModel();
            if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                tp().vQ2(musicModel.getPicPremium());
                Pair<Integer, Integer> pair = tp().getState().LL;
                if (pair != null) {
                    sp(pair.getFirst().intValue(), pair.getSecond().intValue());
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(musicModel.getPicBig())) {
                return;
            }
            tp().vQ2(musicModel.getPicBig());
            Pair<Integer, Integer> pair2 = tp().getState().LL;
            if (pair2 == null) {
                return;
            }
            sp(pair2.getFirst().intValue(), pair2.getSecond().intValue());
            return;
        }
        if (c631940OqW.isHighlightedSimilarMusic()) {
            Pair<Integer, Integer> pair3 = tp().getState().LL;
            if (pair3 == null) {
                return;
            }
            sp(pair3.getFirst().intValue(), pair3.getSecond().intValue());
            return;
        }
        if (c631940OqW.isSimilarMusic()) {
            C631230OpN.LIZJ(getContentView());
            int iIntValue = 0;
            C426750GoL.LJIIIZ(getContentView(), 0, 0, 0, 0, false, 16);
            View view = this.LLJL;
            if (view != null) {
                C631230OpN.LIZ(view);
            }
            View view2 = this.LLJJLIIIJLLLLLLLZ;
            if (view2 == null) {
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bw, context)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            gradientDrawable.setColor(iIntValue);
            view2.setBackground(gradientDrawable);
            return;
        }
        C631230OpN.LIZ(getContentView());
        View view3 = this.LLJL;
        if (view3 == null) {
            return;
        }
        C631230OpN.LIZ(view3);
    }

    public final void sp(int i, int i2) {
        boolean zLIZIZ;
        Object obj;
        Object obj2;
        int iIntValue;
        Integer numLIZJ;
        Object obj3;
        int iIntValue2;
        Integer numLIZJ2;
        Object obj4;
        int[] iArr;
        int iIntValue3;
        Integer numLIZJ3;
        Object obj5;
        int iIntValue4;
        Integer numLIZJ4;
        Object obj6;
        Context context = getContext();
        if (context != null) {
            zLIZIZ = C960203pA.LIZIZ(context);
        } else {
            zLIZIZ = false;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (((C632090Oql) obj).getMusicItemModel().isHighlighted()) {
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{i, i2});
                gradientDrawable.setShape(0);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable.setGradientType(0);
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj6 = c724270Sb32.LL;
                } else {
                    obj6 = null;
                }
                if (((C632090Oql) obj6).getMusicItemModel().unFoldStatus) {
                    gradientDrawable.setCornerRadii(new float[]{C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), 0.0f, 0.0f, 0.0f, 0.0f});
                } else {
                    gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                }
                view.setBackground(gradientDrawable);
            }
            View view2 = this.LLJL;
            if (view2 != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                if (zLIZIZ) {
                    float[] fArr = new float[3];
                    Context context2 = getContext();
                    if (context2 != null && (numLIZJ4 = C1308910kAL.LIZJ(R.attr.bx, context2)) != null) {
                        iIntValue4 = numLIZJ4.intValue();
                    } else {
                        iIntValue4 = 0;
                    }
                    Color.colorToHSV(iIntValue4, fArr);
                    iArr = new int[]{0, ColorProtector.HSVToColor(128, new float[]{fArr[0], fArr[1], fArr[2]})};
                } else {
                    iArr = new int[2];
                    iArr[0] = 0;
                    Context context3 = getContext();
                    if (context3 != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.eh, context3)) != null) {
                        iIntValue3 = numLIZJ3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    iArr[1] = iIntValue3;
                }
                gradientDrawable2.setColors(iArr);
                gradientDrawable2.setShape(0);
                gradientDrawable2.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                gradientDrawable2.setGradientType(0);
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj5 = c724270Sb33.LL;
                } else {
                    obj5 = null;
                }
                if (((C632090Oql) obj5).getMusicItemModel().unFoldStatus) {
                    gradientDrawable2.setCornerRadii(new float[]{C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), 0.0f, 0.0f, 0.0f, 0.0f});
                } else {
                    gradientDrawable2.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                }
                view2.setBackground(gradientDrawable2);
            }
            C631230OpN.LIZJ(getContentView());
            C426750GoL.LJIIIZ(getContentView(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, false, 16);
            View view3 = this.LLJL;
            if (view3 != null) {
                C631230OpN.LIZJ(view3);
                return;
            }
            return;
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj2 = c724270Sb34.LL;
        } else {
            obj2 = null;
        }
        if (!((C632090Oql) obj2).getMusicItemModel().isHighlightedSimilarMusic()) {
            return;
        }
        View view4 = this.LLJJLIIIJLLLLLLLZ;
        if (view4 != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColors(new int[]{i, i2});
            gradientDrawable3.setShape(0);
            gradientDrawable3.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            gradientDrawable3.setGradientType(0);
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj4 = c724270Sb35.LL;
            } else {
                obj4 = null;
            }
            if (((C632090Oql) obj4).getMusicItemModel().isLastSimilarMusic()) {
                gradientDrawable3.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8)});
            } else {
                gradientDrawable3.setCornerRadius(0.0f);
            }
            view4.setBackground(gradientDrawable3);
        }
        View view5 = this.LLJL;
        if (view5 != null) {
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            if (zLIZIZ) {
                float[] fArr2 = new float[3];
                Context context4 = getContext();
                if (context4 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, context4)) != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Color.colorToHSV(iIntValue2, fArr2);
                gradientDrawable4.setColor(ColorProtector.HSVToColor(128, new float[]{fArr2[0], fArr2[1], fArr2[2]}));
            } else {
                Context context5 = getContext();
                if (context5 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context5)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                gradientDrawable4.setColor(iIntValue);
            }
            gradientDrawable4.setShape(0);
            gradientDrawable4.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable4.setGradientType(0);
            C724270Sb3 c724270Sb36 = this.LLJI;
            if (c724270Sb36 != null) {
                obj3 = c724270Sb36.LL;
            } else {
                obj3 = null;
            }
            if (((C632090Oql) obj3).getMusicItemModel().isLastSimilarMusic()) {
                gradientDrawable4.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8)});
            } else {
                gradientDrawable4.setCornerRadius(0.0f);
            }
            view5.setBackground(gradientDrawable4);
        }
        C426750GoL.LJIIIZ(getContentView(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, false, 16);
        C631230OpN.LIZJ(getContentView());
        View view6 = this.LLJL;
        if (view6 == null) {
            return;
        }
        C631230OpN.LIZJ(view6);
    }
}
