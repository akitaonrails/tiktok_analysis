package com.ss.android.ugc.aweme.feed.assem.story;

import X.C0RKP;
import X.C14EU;
import X.C1608660rxo;
import X.C1618440sDa;
import X.C300390Bq1;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C622680Oba;
import X.C694200RKw;
import X.C694210RKx;
import X.C697110RWb;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.StoryTag;
import com.ss.android.ugc.aweme.story.setting.ui.color.ColorConfig;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedStoryTagAssem extends DynamicComponent<FeedStoryTagAssem> implements C0RKP {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bbm;
    }

    public final View Fp() {
        if (bp()) {
            return getContentView().findViewById(R.id.w__);
        }
        return null;
    }

    public final TuxTextView Gp() {
        if (bp()) {
            return (TuxTextView) getContentView().findViewById(R.id.w9a);
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
        View viewFindViewById;
        if (!C300390Bq1.LIZ() || Fp() == null || Gp() == null || !bp() || getContentView().findViewById(R.id.w_a) == null) {
            return 0;
        }
        if (z) {
            TuxTextView tuxTextViewGp = Gp();
            if (tuxTextViewGp != null && tuxTextViewGp.getVisibility() == 0) {
                if (bp() && (viewFindViewById = getContentView().findViewById(R.id.w_a)) != null) {
                    width = viewFindViewById.getWidth();
                } else {
                    width = 0;
                }
                iLIZIZ = width - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            } else {
                iLIZIZ = 0;
            }
            View viewFp = Fp();
            if (viewFp != null) {
                C426750GoL.LJIIIZ(viewFp, null, null, 0, null, false, 27);
            }
            C339190DRl.LIZIZ(Gp());
            return iLIZIZ;
        }
        View viewFp2 = Fp();
        if (viewFp2 != null) {
            C426750GoL.LJIIIZ(viewFp2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, false, 27);
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
                    C786410Ut5.LJLLLLLL(8, LJJIJL());
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
        int[] iArr;
        super.onViewCreated(view);
        view.findViewById(R.id.w9a);
        C622680Oba.LIZJ(this);
        boolean z = C1608660rxo.LIZIZ;
        if (z) {
            StoryTag storyTag = (StoryTag) view.findViewById(R.id.w_a);
            ColorConfig colorConfig = C1618440sDa.LIZIZ.LJJIJLIJ().LIZ().LIZLLL;
            float[] fArr = null;
            Integer numValueOf = null;
            if (!colorConfig.isShader) {
                storyTag.setUseColor(true);
                Integer num = colorConfig.singleColor;
                if (num != null) {
                    numValueOf = Integer.valueOf(C694210RKx.LIZIZ(view.getContext(), num));
                }
                storyTag.setColor(numValueOf);
            } else {
                storyTag.setUseColor(false);
                C694200RKw c694200RKwLIZ = C694210RKx.LIZ(colorConfig, view.getContext());
                if (c694200RKwLIZ != null) {
                    iArr = c694200RKwLIZ.LIZ;
                } else {
                    iArr = null;
                }
                storyTag.setShaderColorList(iArr);
                if (c694200RKwLIZ != null) {
                    fArr = c694200RKwLIZ.LIZIZ;
                }
                storyTag.setPositionColorList(fArr);
            }
        }
        if (C300390Bq1.LIZ()) {
            C426750GoL.LJIIIZ(getContentView(), 0, null, 0, null, false, 26);
            if (!z) {
                getContentView().setBackgroundResource(R.drawable.bbz);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        C786410Ut5.LJLLLLLL(0, getContentView());
    }
}
