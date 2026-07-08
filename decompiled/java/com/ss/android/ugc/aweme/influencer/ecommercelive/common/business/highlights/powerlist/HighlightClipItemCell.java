package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C07MW;
import X.C1215990hkT;
import X.C12ES;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C290160BYw;
import X.C341940Daq;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C608160NtG;
import X.C608170NtH;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightCellItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightTag;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightVideoInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS47S0200000_33;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class HighlightClipItemCell extends PowerCell<C608160NtG> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightClipItemCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/highlights/viewmodel/HighlightsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HighlightClipItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightsListViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2802);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(201);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2813), awS577S0100000_33, AFwS224S0000000_33.get$arr$(389), new AwS577S0100000_33((C03K6) this, 2788), new AwS577S0100000_33((C03K6) this, 2790), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2792), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2794), null, new AwS577S0100000_33((C03K6) this, 2795));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2789);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2791);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2793);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 107));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2796);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2797);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2798);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2799);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2800);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2801), awS577S0100000_33, AFwS224S0000000_33.get$arr$(387), new AwS577S0100000_33((C03K6) this, 2803), new AwS577S0100000_33((C03K6) this, 2804), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2805), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2806), null, new AwS577S0100000_33((C03K6) this, 2807));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2808), awS577S0100000_33, AFwS224S0000000_33.get$arr$(388), new AwS577S0100000_33((C03K6) this, 2809), new AwS577S0100000_33((C03K6) this, 2810), new AwS577S0100000_33((C03K6) this, 2811), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2812));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        view.getLayoutParams().width = (C12ES.LJIIJ(view.getContext()) - C341940Daq.LIZ(64.0d)) / 3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        long jLongValue;
        long jLongValue2;
        String str;
        String str2;
        Long l;
        String strJ4;
        String str3;
        C608160NtG c608160NtG = (C608160NtG) interfaceC1891350zJl;
        super.onBindItemView(c608160NtG);
        C1215990hkT c1215990hkT = (C1215990hkT) this.itemView;
        if (c608160NtG == null) {
            C12ES.LJIILL(4, c1215990hkT);
            return;
        }
        C12ES.LJIILL(0, c1215990hkT);
        HighlightVideoInfo highlightVideoInfo = c608160NtG.LL.videoInfo;
        if (highlightVideoInfo != null && (str3 = highlightVideoInfo.coverUrl) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str3);
            c1331670kl3LJIIIZ.LJJI(c1215990hkT.getIvCoverFromXml());
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e4, c1215990hkT.getIvCoverFromXml().getContext());
            if (numLIZJ != null) {
                c1331670kl3LJIIIZ.LJJIIZI(new ColorDrawable(numLIZJ.intValue()));
            }
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        HighlightVideoInfo highlightVideoInfo2 = c608160NtG.LL.videoInfo;
        if (highlightVideoInfo2 != null && (l = highlightVideoInfo2.length) != null) {
            long jLongValue3 = l.longValue();
            long j = 60;
            long j2 = jLongValue3 / j;
            if (j2 > 99) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(j2);
                sbLIZ.append(C786410Ut5.j4(":%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(jLongValue3 % j)}, 2)));
                strJ4 = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strJ4 = C786410Ut5.j4("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(jLongValue3 % j)}, 2));
            }
            c1215990hkT.setVideoDuration(strJ4);
        }
        HighlightVideoInfo highlightVideoInfo3 = c608160NtG.LL.videoInfo;
        if (highlightVideoInfo3 != null && (str2 = highlightVideoInfo3.text) != null) {
            c1215990hkT.setVideoClicks(str2);
        }
        HighlightTag highlightTag = c608160NtG.LL.tag;
        if (highlightTag != null && (str = highlightTag.text) != null) {
            c1215990hkT.setTagView(str);
        }
        String str4 = c608160NtG.LL.productCover;
        if (str4 != null) {
            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str4);
            c1331670kl3LJIIIZ2.LJJI(c1215990hkT.getIvProductFromXml());
            c1331670kl3LJIIIZ2.LJJ = EnumC1338240kve.CENTER_CROP;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bv, c1215990hkT.getIvProductFromXml().getContext());
            if (numLIZJ2 != null) {
                c1331670kl3LJIIIZ2.LJJIIZI(new ColorDrawable(numLIZJ2.intValue()));
            }
            C1331750klB c1331750klB2 = new C1331750klB();
            c1331750klB2.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            c1331670kl3LJIIIZ2.LJJI = new C1331730kl9(c1331750klB2);
            C786410Ut5.h3(c1331670kl3LJIIIZ2);
        }
        String str5 = c608160NtG.LL.productTitle;
        if (str5 != null) {
            c1215990hkT.setProductSummary(str5);
        }
        C786410Ut5.I7(new AjS47S0200000_33(this, c608160NtG, 2), c1215990hkT);
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        HighlightsListViewModel highlightsListViewModel = (HighlightsListViewModel) assemVMLazy.getValue();
        boolean z = c608160NtG.LLILLJJLI;
        HighlightCellItem highlightCellItem = c608160NtG.LL;
        HighlightVideoInfo highlightVideoInfo4 = highlightCellItem.videoInfo;
        if (highlightVideoInfo4 == null || highlightVideoInfo4.fragmentId == null) {
            return;
        }
        if (z) {
            if (highlightsListViewModel.LLIZLLLIL.contains(highlightVideoInfo4.fragmentId)) {
                return;
            }
            String str6 = highlightsListViewModel.LLILLJJLI;
            String str7 = highlightsListViewModel.LLILLL;
            Long l2 = highlightCellItem.videoInfo.length;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            C608170NtH.LIZJ(str6, str7, highlightCellItem.videoInfo.fragmentId, jLongValue2, highlightCellItem.daInfo, z);
            highlightsListViewModel.LLIZLLLIL.add(highlightCellItem.videoInfo.fragmentId);
            return;
        }
        if (highlightsListViewModel.LLIZ.contains(highlightCellItem.videoInfo.fragmentId)) {
            return;
        }
        String str8 = highlightsListViewModel.LLILLJJLI;
        String str9 = highlightsListViewModel.LLILLL;
        Long l3 = highlightCellItem.videoInfo.length;
        if (l3 != null) {
            jLongValue = l3.longValue();
        } else {
            jLongValue = 0;
        }
        C608170NtH.LIZJ(str8, str9, highlightCellItem.videoInfo.fragmentId, jLongValue, highlightCellItem.daInfo, false);
        highlightsListViewModel.LLIZ.add(highlightCellItem.videoInfo.fragmentId);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
            return PowerCell.inflateItemView$default(this, viewGroup, R.layout.btp, false, 4, null);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.btp, viewGroup, false);
    }
}
