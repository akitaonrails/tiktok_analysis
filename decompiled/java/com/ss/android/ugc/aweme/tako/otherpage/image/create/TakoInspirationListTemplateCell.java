package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.C1200930hMB;
import X.C1308910kAL;
import X.C1322090kVb;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1781260wSC;
import X.C418440Gaw;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInspirationListTemplateCell extends PowerCell<C1781260wSC> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fn3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1322090kVb c1322090kVb = (C1322090kVb) this.itemView.findViewById(R.id.x_q);
        float f = this.itemView.getResources().getDisplayMetrics().density * 0.5f;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a01, this.itemView.getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        C1331070kk5 c1331070kk5 = (C1331070kk5) c1322090kVb.getHierarchy();
        if (c1331070kk5 != null) {
            C1331100kk8 c1331100kk8LIZLLL = C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(6));
            c1331100kk8LIZLLL.LJ(f, iIntValue);
            c1331070kk5.LJJIII(c1331100kk8LIZLLL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        float f;
        ACListenerS161S0100000_27 aCListenerS161S0100000_27;
        C1781260wSC c1781260wSC = (C1781260wSC) interfaceC1891350zJl;
        super.onBindItemView(c1781260wSC);
        CreativeTemplate creativeTemplate = c1781260wSC.LL;
        View viewFindViewById = this.itemView.findViewById(R.id.x_s);
        TextView textView = (TextView) this.itemView.findViewById(R.id.x_t);
        ((TextView) this.itemView.findViewById(R.id.x_r)).setText(creativeTemplate.nameText);
        ((TextView) this.itemView.findViewById(R.id.x_p)).setText(creativeTemplate.subTitle);
        Context context = this.itemView.getContext();
        String strLIZ = creativeTemplate.buttonText;
        if (strLIZ == null || strLIZ.length() <= 0) {
            strLIZ = C1200930hMB.LIZ(context, 2131849910, "Tako_createHub_secondTab_btn");
        }
        textView.setText(strLIZ);
        viewFindViewById.setEnabled(c1781260wSC.LLILLL);
        View view = this.itemView;
        if (c1781260wSC.LLILLL) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        C786410Ut5.T4(view, f);
        this.itemView.setClickable(false);
        C786410Ut5.I7(null, this.itemView);
        if (c1781260wSC.LLILLL) {
            aCListenerS161S0100000_27 = new ACListenerS161S0100000_27(c1781260wSC, 199);
        } else {
            aCListenerS161S0100000_27 = null;
        }
        C786410Ut5.I7(aCListenerS161S0100000_27, viewFindViewById);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.x_q);
        String str = creativeTemplate.pictureUrl;
        if (str.length() > 0) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            return;
        }
        smartImageView.setImageDrawable(null);
    }
}
