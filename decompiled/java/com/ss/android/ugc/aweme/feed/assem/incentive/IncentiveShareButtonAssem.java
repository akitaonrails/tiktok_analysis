package com.ss.android.ugc.aweme.feed.assem.incentive;

import X.C01GW;
import X.C0SVC;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1894700zPA;
import X.C2178808gE;
import X.C418440Gaw;
import X.C786410Ut5;
import Y.ACListenerS78S0300000_11;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.model.FeedBottomButton;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class IncentiveShareButtonAssem extends BaseCellSlotComponent<IncentiveShareButtonAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b76;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        FeedBottomButton feedBottomButton = (FeedBottomButton) C2178808gE.LIZ().LJ(39);
        if (feedBottomButton != null) {
            LinearLayout linearLayout = (LinearLayout) LJJIJL().findViewById(R.id.ne5);
            TextView textView = (TextView) LJJIJL().findViewById(R.id.kkn);
            SmartImageView smartImageView = (SmartImageView) LJJIJL().findViewById(R.id.kkl);
            textView.setText(feedBottomButton.button.content.text);
            C0SVC c0svc = C0SVC.LIZ;
            textView.setTextColor(C0SVC.LIZIZ(c0svc, feedBottomButton.button.content.color));
            String str = feedBottomButton.button.icon;
            if (str != null && str.length() != 0) {
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(feedBottomButton.button.icon));
                c1331670kl3LJI.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJI);
            }
            String str2 = feedBottomButton.button.bgColor;
            if (str2 != null && str2.length() != 0) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(C0SVC.LIZIZ(c0svc, feedBottomButton.button.bgColor));
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
                LJJIJL().setBackground(gradientDrawable);
            }
            C786410Ut5.R7(linearLayout, new ACListenerS78S0300000_11(this, feedBottomButton, videoItemParams2, 8));
        }
    }
}
