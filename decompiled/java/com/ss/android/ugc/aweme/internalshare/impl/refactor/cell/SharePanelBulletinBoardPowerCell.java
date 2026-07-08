package com.ss.android.ugc.aweme.internalshare.impl.refactor.cell;

import X.C01GW;
import X.C0HZQ;
import X.C1196320hEk;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1362180lYG;
import X.C1362450lYh;
import X.C1362470lYj;
import X.C1362500lYm;
import X.C1363190lZt;
import X.C1402420mbA;
import X.C1558520qew;
import X.C1954807lC;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IContactActionAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS565S0100000_21;
import u4.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelBulletinBoardPowerCell extends AbsSharePanelPowerCell<C1362450lYh> {
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 627));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 625));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 630));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 626));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 629));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 628));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.f8_;
    }

    public final SmartAvatarImageView R5() {
        return (SmartAvatarImageView) this.LLILZIL.getValue();
    }

    public final TuxTextView S5() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    public final C0HZQ T5() {
        return (C0HZQ) this.LLILZLL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemViewCreated() {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelBulletinBoardPowerCell.onItemViewCreated():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        IContactActionAbility iContactActionAbility;
        super.onViewAttachedToWindow();
        C1362450lYh c1362450lYh = (C1362450lYh) getItem();
        if (c1362450lYh == null || (interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this)) == null || (iContactActionAbility = (IContactActionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IContactActionAbility.class, null)) == null) {
            return;
        }
        iContactActionAbility.Oy1(c1362450lYh);
    }

    public final void P5(C1362180lYG c1362180lYG) {
        int i = C1362470lYj.LIZ[c1362180lYG.LIZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                C786410Ut5.LJLLLLLL(0, T5());
                T5().setSelected(true);
                T5().setChecked(true);
                C786410Ut5.LJLLLLLL(8, (View) this.LLIZ.getValue());
            } else {
                throw new C1954807lC();
            }
        } else {
            C786410Ut5.LJLLLLLL(8, T5());
            C786410Ut5.LJLLLLLL(0, (View) this.LLIZ.getValue());
        }
        if (c1362180lYG.LIZIZ.LIZ) {
            C786410Ut5.J5(R5(), 0.34f);
        } else {
            C786410Ut5.J5(R5(), 1.0f);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C1362450lYh c1362450lYh = (C1362450lYh) interfaceC1891350zJl;
        C1362500lYm bbDetailInfo = c1362450lYh.LL.getBbDetailInfo();
        if (bbDetailInfo != null) {
            C1363190lZt c1363190lZt = c1362450lYh.LL;
            S5().setText(bbDetailInfo.LIZIZ);
            String str = bbDetailInfo.LIZJ;
            if (str != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str));
                c1331670kl3LJIIIIZZ.LJJ(R5());
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
            View view = (View) this.LLJ.getValue();
            if (c1363190lZt.isFirstShow()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
            q0.LJIJ(this.itemView, new C1402420mbA(this, 4));
            P5(c1362450lYh.LLILLL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1362450lYh c1362450lYh = (C1362450lYh) interfaceC1891350zJl;
        super.onBindItemView(c1362450lYh, list);
        if (!list.isEmpty()) {
            P5(c1362450lYh.LLILLL);
        }
    }
}
