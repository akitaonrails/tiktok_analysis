package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist;

import X.C07MW;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C290160BYw;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightNewUserGuide;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightNewUserGuideText;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class NewUserGuideCell extends PowerCell<HighlightNewUserGuide> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String imageUrl;
        HighlightNewUserGuide highlightNewUserGuide = (HighlightNewUserGuide) interfaceC1891350zJl;
        HighlightNewUserGuideText guideText = highlightNewUserGuide.getGuideText();
        if (guideText != null && guideText.commonText != null && highlightNewUserGuide.getGuideText().markText != null) {
            SpannableString spannableString = new SpannableString(u.LJJIFFI(highlightNewUserGuide.getGuideText().commonText, "{%s}", highlightNewUserGuide.getGuideText().markText, false));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, this.itemView.getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), a0.LJJJ(highlightNewUserGuide.getGuideText().commonText, "{%s}", 0, false, 6), highlightNewUserGuide.getGuideText().markText.length(), 17);
            }
            ((TextView) this.itemView.findViewById(R.id.z48)).setText(spannableString);
            Context context = this.itemView.getContext();
            if (context != null && C960203pA.LIZIZ(context)) {
                imageUrl = highlightNewUserGuide.getImageDarkUrl();
            } else {
                imageUrl = highlightNewUserGuide.getImageUrl();
            }
            if (imageUrl != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(imageUrl);
                c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.l6g));
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
            return PowerCell.inflateItemView$default(this, viewGroup, R.layout.bts, false, 4, null);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bts, viewGroup, false);
    }
}
