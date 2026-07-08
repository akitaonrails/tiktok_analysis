package com.ss.android.ugc.aweme.internalshare.impl.refactor.cell;

import X.C01GW;
import X.C1362030lY1;
import X.C1362110lY9;
import X.C1362120lYA;
import X.C1362230lYL;
import X.C1363140lZo;
import X.C13LP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C430200Gtu;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.zhiliaoapp.musically.R;
import irm.AkS89S0100000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelAggregationPowerCell extends AbsSharePanelPowerCell<C1362030lY1> {
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 623));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 624));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ck6;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C1362110lY9 c1362110lY9;
        Integer num;
        super.onItemViewCreated();
        View view = (View) this.LLILZ.getValue();
        if (view != null) {
            view.setImportantForAccessibility(2);
        }
        C1362120lYA c1362120lYAL5 = L5();
        if (c1362120lYAL5 == null || (c1362110lY9 = c1362120lYAL5.LLILLL) == null) {
            c1362110lY9 = new C1362110lY9(null, 1023);
        }
        C1362230lYL c1362230lYL = c1362110lY9.LJIIIZ;
        if (c1362230lYL != null) {
            this.itemView.getLayoutParams().width = c1362230lYL.LJIIJJI;
            View view2 = (View) this.LLILZ.getValue();
            if (view2 != null) {
                view2.getLayoutParams().width = c1362230lYL.LJIIL;
                view2.getLayoutParams().height = c1362230lYL.LJIIL;
            }
            C430200Gtu c430200Gtu = (C430200Gtu) this.LLILZ.getValue();
            if (c430200Gtu != null) {
                c430200Gtu.setSize(C418440Gaw.LJFF(c1362230lYL.LJIIL, this.itemView.getContext()));
            }
            Integer num2 = c1362230lYL.LJIIZILJ;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                TuxTextView tuxTextView = (TuxTextView) this.LLILZIL.getValue();
                if (tuxTextView != null) {
                    tuxTextView.setTuxFont(iIntValue);
                }
            }
        }
        View view3 = (View) this.LLILZIL.getValue();
        if (view3 != null) {
            C426750GoL.LJIIIZ(view3, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, false, 29);
        }
        TextView textView = (TextView) this.LLILZIL.getValue();
        if (textView != null) {
            textView.setMaxLines(c1362110lY9.LIZLLL);
        }
        C1362230lYL c1362230lYL2 = c1362110lY9.LJIIIZ;
        if (c1362230lYL2 != null && (num = c1362230lYL2.LJIILLIIL) != null) {
            int iIntValue2 = num.intValue();
            TextView textView2 = (TextView) this.LLILZIL.getValue();
            if (textView2 != null) {
                textView2.setTextColor(iIntValue2);
            }
        }
        C786410Ut5.I7(new AkS89S0100000_21(this, 4), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        UrlModel displayAvatar;
        UrlModel displayAvatar2;
        C1362030lY1 c1362030lY1 = (C1362030lY1) interfaceC1891350zJl;
        super.onBindItemView(c1362030lY1);
        C1363140lZo c1363140lZo = c1362030lY1.LL;
        int size = c1363140lZo.getContacts().size();
        if (size >= 2) {
            BaseContact baseContact = (BaseContact) C13LP.LJJJLZIJ(0, c1363140lZo.getContacts());
            String string = null;
            if (baseContact != null) {
                displayAvatar = baseContact.getDisplayAvatar();
            } else {
                displayAvatar = null;
            }
            ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(displayAvatar);
            BaseContact baseContact2 = (BaseContact) C13LP.LJJJLZIJ(1, c1363140lZo.getContacts());
            if (baseContact2 != null) {
                displayAvatar2 = baseContact2.getDisplayAvatar();
            } else {
                displayAvatar2 = null;
            }
            ImageUrlModel imageUrlModelLIZ2 = C438710HIf.LIZ(displayAvatar2);
            C430200Gtu c430200Gtu = (C430200Gtu) this.LLILZ.getValue();
            if (c430200Gtu != null) {
                C430200Gtu.LIZ(c430200Gtu, imageUrlModelLIZ);
            }
            C430200Gtu c430200Gtu2 = (C430200Gtu) this.LLILZ.getValue();
            if (c430200Gtu2 != null) {
                C430200Gtu.LIZIZ(c430200Gtu2, imageUrlModelLIZ2);
            }
            TextView textView = (TextView) this.LLILZIL.getValue();
            if (textView != null) {
                Context context = this.itemView.getContext();
                if (context != null) {
                    string = context.getString(2131840051, String.valueOf(size));
                }
                textView.setText(string);
            }
            this.LL.LIZ(c1362030lY1.LL, "SHARE_PANEL", new AwS422S0200000_21(this, c1362030lY1, 79));
        }
    }
}
