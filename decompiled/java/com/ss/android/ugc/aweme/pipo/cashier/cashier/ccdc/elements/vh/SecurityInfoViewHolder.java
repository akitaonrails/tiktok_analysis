package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C03H8;
import X.C1157170gDb;
import X.C123100dR;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1710770ucV;
import X.C1711340udQ;
import X.C1722120uuo;
import X.C21569319b9;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RawTextAndIcon;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SecurityInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SecurityInfoItem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class SecurityInfoViewHolder extends PowerCell<C1157170gDb> implements C03H8 {
    public RelativeLayout LL;
    public TuxTextView LLILLJJLI;
    public SmartImageView LLILLL;

    public final SmartImageView I5() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.q6d) : null;
            this.LLILLL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        return this.itemView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        SecurityInfo securityInfo;
        SecurityInfoItem securityInfoItem;
        String str;
        String strLIZ;
        C1157170gDb c1157170gDb = (C1157170gDb) interfaceC1891350zJl;
        super.onBindItemView(c1157170gDb);
        C1710770ucV.LIZ(this.itemView, new C21569319b9(C1722120uuo.LIZJ(0), C1722120uuo.LIZJ(16), C1722120uuo.LIZJ(16), 48, true, 232));
        RawTextAndIcon rawTextAndIconLJJIIZI = c1157170gDb.LL.invoke().LJJIIZI();
        if (rawTextAndIconLJJIIZI != null && (securityInfo = rawTextAndIconLJJIIZI.securityInfo) != null && (securityInfoItem = securityInfo.pciSecurityInfo) != null && (str = securityInfoItem.text) != null && str.length() != 0) {
            View viewFindViewById = this.LL;
            Drawable drawableLJ = null;
            if (viewFindViewById == null) {
                View view = this.itemView;
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.q6c);
                } else {
                    viewFindViewById = null;
                }
                this.LL = (RelativeLayout) viewFindViewById;
            }
            C786410Ut5.LLIIL((RelativeLayout) viewFindViewById, 0);
            View viewFindViewById2 = this.LLILLJJLI;
            if (viewFindViewById2 == null) {
                View view2 = this.itemView;
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.q6e);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLJJLI = (TuxTextView) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(securityInfoItem.text);
            Context context = getContext();
            if (context != null) {
                C1711340udQ c1711340udQ = C1711340udQ.LIZ;
                String str2 = securityInfoItem.iconUrl;
                String str3 = securityInfoItem.darkModeIconUrl;
                c1711340udQ.getClass();
                strLIZ = C1711340udQ.LIZ(context, str2, str3);
            } else {
                strLIZ = null;
            }
            if (C123100dR.LIZ(strLIZ)) {
                C786410Ut5.LLFF(0, I5());
                if (strLIZ == null) {
                    strLIZ = " ";
                }
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLIZ);
                Context context2 = getContext();
                if (context2 != null) {
                    drawableLJ = C1308910kAL.LJ(R.attr.c7, context2);
                }
                c1331670kl3LJIIIZ.LJJIIZI(drawableLJ);
                c1331670kl3LJIIIZ.LJJI(I5());
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                return;
            }
            C786410Ut5.LLFF(8, I5());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dve, viewGroup, false);
    }
}
