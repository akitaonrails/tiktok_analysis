package com.ss.android.ugc.aweme.series.innerfeed.recommend;

import X.AbstractViewOnClickListenerC1165700gRM;
import X.C1389890mGx;
import X.C14EU;
import X.C1597406Ng;
import X.C20642515q3;
import X.C2188811AlT;
import X.C339190DRl;
import X.C695070ROf;
import X.C718540SGm;
import X.C737030Svd;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public final class MainInnerFeedRecommendAssem extends InnerFeedRecommendAssem {
    public Aweme LLJJIJIL;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onVideoEvent(C737030Svd c737030Svd) {
        C1597406Ng c1597406Ng;
        Map<String, Object> map;
        if (Intrinsics.LJFF(c737030Svd.LJ, "paid_series_detail_page") && 76 == c737030Svd.LIZ && C695070ROf.LIZ(this.LLJJIJIL)) {
            Object obj = c737030Svd.LIZIZ;
            Object obj2 = null;
            if ((obj instanceof C1597406Ng) && (c1597406Ng = (C1597406Ng) obj) != null && (map = c1597406Ng.LIZIZ) != null) {
                Object obj3 = map.get("start");
                if (obj3 instanceof Boolean) {
                    obj2 = obj3;
                }
                if (Intrinsics.LJFF(obj2, Boolean.TRUE)) {
                    C339190DRl.LIZIZ(getContentView());
                } else {
                    C718540SGm.LIZIZ(getContentView());
                }
            }
        }
    }

    @Override // X.InterfaceC1613530s5f
    public final void b5(final String str, final Aweme aweme, final PaidContentMiniDramaInfo paidContentMiniDramaInfo) {
        String episodeNumber;
        int iIntValue;
        Integer videoTotalNums;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onPageSelected] aweme=");
        sbLIZ.append(aweme.getDesc());
        sbLIZ.append(" aid=");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(' ');
        sbLIZ.append(aweme.hashCode());
        sbLIZ.append(" episodeNumber=");
        PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
        if (paidContentInfo != null) {
            episodeNumber = paidContentInfo.getEpisodeNumber();
        } else {
            episodeNumber = null;
        }
        sbLIZ.append(episodeNumber);
        sbLIZ.append(" isInnerFeedRecData=");
        sbLIZ.append(Boolean.valueOf(C695070ROf.LIZ(aweme)));
        sbLIZ.append(" hasShownToast=");
        sbLIZ.append(this.LLJJIII);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C695070ROf.LIZ(aweme)) {
            C718540SGm.LIZIZ(getContentView());
            InnerFeedRecommendAssem.hp(aweme, str, true);
            String string = LJJIJL().getResources().getString(2131839407);
            if (!this.LLJJIII) {
                this.LLJJIII = true;
                C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
            if (paidContentMiniDramaInfo != null && (videoTotalNums = paidContentMiniDramaInfo.getVideoTotalNums()) != null) {
                iIntValue = videoTotalNums.intValue();
            } else {
                iIntValue = 0;
            }
            TuxTextView tuxTextView = this.LLJJIJI;
            if (tuxTextView != null) {
                tuxTextView.setText(C20642515q3.LJ(2131755462, iIntValue, Integer.valueOf(iIntValue)));
            }
            View view = this.LLJJIJIIJIL;
            if (view != null) {
                C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0SGf
                    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
                    @Override // X.AbstractViewOnClickListenerC1165700gRM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(android.view.View r21) {
                        /*
                            Method dump skipped, instruction units count: 448
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C718470SGf.LIZ(android.view.View):void");
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(300L);
                    }
                }, view);
            }
        } else {
            this.LLJJIII = false;
            C718540SGm.LIZ(getContentView());
        }
        this.LLJJIJIL = aweme;
    }
}
