package com.ss.android.ugc.aweme.tako.botpage.components.botcenter;

import X.C01GW;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C20237214Gk;
import X.C20309314dP;
import X.C2097608Jq;
import X.C2211751BhN;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS574S0100000_30;
import wh6.AbS515S0200000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class RecentlyAddCell extends PowerCell<C20237214Gk> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 239));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 237));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new C20309314dP(this, 1));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numLIZJ;
        C20237214Gk c20237214Gk = (C20237214Gk) interfaceC1891350zJl;
        super.onBindItemView(c20237214Gk);
        String str = c20237214Gk.LL.botAvatar;
        if (str.length() > 0) {
            ColorDrawable colorDrawable = null;
            if (1 != 0) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJ((SmartImageView) this.LL.getValue());
                c1331670kl3LJIIIZ.LJJJIL = new C1338340kvo((View) this.LL.getValue(), "tako_bot_center_top_cell", str, C2097608Jq.LJ());
                Context context = getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context)) != null) {
                    colorDrawable = new ColorDrawable(numLIZJ.intValue());
                }
                c1331670kl3LJIIIZ.LJJIIZI(colorDrawable);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
        }
        TextView textView = (TextView) this.LLILLJJLI.getValue();
        if (textView != null) {
            textView.setText(c20237214Gk.LL.botName);
        }
        C786410Ut5.I7(new AbS515S0200000_30(this, c20237214Gk, 3), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.flj, false, 4, null);
    }
}
