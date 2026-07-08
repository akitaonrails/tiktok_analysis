package com.ss.android.ugc.aweme.tako.botpage.components.botcenter;

import X.C01GW;
import X.C0DSB;
import X.C1308910kAL;
import X.C1322090kVb;
import X.C1322110kVd;
import X.C1331070kk5;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C13LP;
import X.C20237314Gl;
import X.C20309314dP;
import X.C2097608Jq;
import X.C2211751BhN;
import X.C427690Gpr;
import X.C452501pT;
import X.C5183020f;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BotTagInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS574S0100000_30;
import wh6.AbS515S0200000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class BotCenterCell extends PowerCell<C20237314Gl> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 231));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 233));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 234));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 232));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 235));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new C20309314dP(this, 0));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ColorDrawable colorDrawable;
        Integer numLIZJ;
        C1331070kk5 c1331070kk5;
        C20237314Gl c20237314Gl = (C20237314Gl) interfaceC1891350zJl;
        super.onBindItemView(c20237314Gl);
        C1322090kVb c1322090kVb = (C1322090kVb) this.LL.getValue();
        if (c1322090kVb != null && (c1331070kk5 = (C1331070kk5) c1322090kVb.getHierarchy()) != null) {
            c1331070kk5.LJIILIIL(2).LJIJ(new PointF(0.5f, 0.0f));
        }
        String str = (String) C13LP.LJJJLL(c20237314Gl.LLILLJJLI.coverImgUrls);
        if (str != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ((SmartImageView) this.LL.getValue());
            c1331670kl3LJIIIZ.LJJJIL = new C1338340kvo((View) this.LL.getValue(), "tako_bot_center_tab_page", str, C2097608Jq.LJ());
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context)) != null) {
                colorDrawable = new ColorDrawable(numLIZJ.intValue());
            } else {
                colorDrawable = null;
            }
            c1331670kl3LJIIIZ.LJJIIZI(colorDrawable);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        } else {
            C1322110kVd c1322110kVd = (C1322110kVd) this.LL.getValue();
            if (c1322110kVd != null) {
                c1322110kVd.setActualImageResource(R.attr.zn);
            }
        }
        TextView textView = (TextView) this.LLILLJJLI.getValue();
        if (textView != null) {
            textView.setText(c20237314Gl.LLILLJJLI.interactionInfo.msgCntShow);
        }
        TextView textView2 = (TextView) this.LLILZ.getValue();
        if (textView2 != null) {
            textView2.setText(c20237314Gl.LLILLJJLI.creator);
        }
        TextView textView3 = (TextView) this.LLILLL.getValue();
        if (textView3 != null) {
            textView3.setText(c20237314Gl.LLILLJJLI.botName);
        }
        List<BotTagInfo> list = c20237314Gl.LLILLJJLI.tagList;
        ArrayList arrayList = new ArrayList();
        Iterator<BotTagInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = it2.next().tag;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, " ", null, null, 0, null, new C5183020f(this, 335), 30);
        if (c20237314Gl.LLILLJJLI.tagList.isEmpty()) {
            TuxTextView tuxTextView = (TuxTextView) this.LLILZIL.getValue();
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        } else {
            TextView textView4 = (TextView) this.LLILZIL.getValue();
            if (textView4 != null) {
                textView4.setText(strLJJLIIIJ);
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.LLILZIL.getValue();
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
        }
        C427690Gpr.LJ(this.itemView, C0DSB.LIZ(8));
        C786410Ut5.I7(new AbS515S0200000_30(this, c20237314Gl, 2), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.fk2, false, 4, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated(Object obj) {
        super.onItemViewCreated(obj);
    }
}
