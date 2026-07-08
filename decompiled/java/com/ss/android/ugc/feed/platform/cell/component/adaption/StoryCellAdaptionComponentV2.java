package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.AbstractC1879030yzt;
import X.C0RF0;
import X.C1604450rr1;
import X.C1618440sDa;
import X.C19EG;
import X.C20321014fI;
import X.C20559115cb;
import X.C20559315cd;
import X.C20561315cx;
import X.C724240Sb0;
import X.EnumC584530MwF;
import X.InterfaceC20561915d3;
import X.InterfaceC494301wD;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes32.dex */
public final class StoryCellAdaptionComponentV2 extends CellAdaptionComponentV2 {
    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void CX1(Context context, Aweme aweme, View view, View view2, OcrLocation ocrLocation, ViewGroup viewGroup) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public final String ip() {
        return "feed_story_cell";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1917770024) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public final InterfaceC20561915d3 hp() {
        return new C20559115cb();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        BaseFeedPageParams baseFeedPageParams;
        int i;
        super.onParentSet();
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null && (i = (baseFeedPageParams = c0rf0.LJ).videoHeight) > 0 && baseFeedPageParams.videoWidth > 0) {
            String str = baseFeedPageParams.eventType;
            if (str == null) {
                str = "";
            }
            Ct2(str, Integer.valueOf(i), Integer.valueOf(c0rf0.LJ.videoWidth), c0rf0.LIZ.findViewById(R.id.cover), c0rf0.LIZ.findViewById(R.id.video_adapted_wrapper_container));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Ep(wB2(), "5. holder select (for bad case)");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void Ct2(String str, Integer num, Integer num2, View... viewArr) {
        ScreenAdaptionResult screenAdaptionResult;
        C19EG activity;
        C1604450rr1 c1604450rr1 = C1604450rr1.LLJ;
        if (c1604450rr1 != null && (screenAdaptionResult = (ScreenAdaptionResult) c1604450rr1.LLILZ) != null) {
            int containerHeight = screenAdaptionResult.getContainerHeight();
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (activity = fragmentLJI.getActivity()) != null) {
                C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
                int iLJIIL = (containerHeight - c1618440sDa.LJJIIJ().LJIIL(activity)) - c1618440sDa.LJJIIJ().LJIILJJIL(activity);
                if (iLJIIL > 0 && screenAdaptionResult.getScreenWidth() > 0) {
                    Integer numValueOf = Integer.valueOf(iLJIIL);
                    Integer numValueOf2 = Integer.valueOf(screenAdaptionResult.getScreenWidth());
                    View[] viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length);
                    if (str != null && num != null && num2 != null && numValueOf != null && numValueOf2 != null) {
                        C20561315cx c20561315cx = new C20561315cx("feed_story_cell", new VideoAdaptionManagerContext(str, new C20559115cb()));
                        VideoAdaptionParams videoAdaptionParams = new VideoAdaptionParams(numValueOf2.intValue(), numValueOf.intValue(), num2.intValue(), num.intValue(), null, false, 0.0f, null, EnumC584530MwF.NONE, false, null, false);
                        if (C20559315cd.LIZ(videoAdaptionParams)) {
                            c20561315cx.LJI(videoAdaptionParams);
                        }
                        VideoAdaptionResult videoAdaptionResult = (VideoAdaptionResult) c20561315cx.LLILZ;
                        if (videoAdaptionResult != null) {
                            for (View view : viewArr2) {
                                videoAdaptionResult.saveResultInner(view);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        AbstractC1879030yzt.LIZ(new C20321014fI());
    }
}
