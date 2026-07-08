package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend;

import X.C01GW;
import X.C03C8;
import X.C1421670n6D;
import X.C1753000vic;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C954703oH;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.List;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductRecommendViewMoreCell extends PowerCell<C1753000vic> {
    public final PdpViewModel I5() {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            return (PdpViewModel) ViewModelProviders.of(currentFragment).get(PdpViewModel.class.getName(), PdpViewModel.class);
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C01GW c01gw = C954703oH.LIZ;
        return C954703oH.LIZ(viewGroup.getContext(), R.layout.aus, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1753000vic c1753000vic = (C1753000vic) interfaceC1891350zJl;
        TextView textView = (TextView) this.itemView.findViewById(R.id.k5w);
        if (textView != null) {
            ECRichText eCRichText = c1753000vic.LLILLJJLI.displayText;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("slide_entrance");
            sbLIZ.append(c1753000vic.LL);
            C03C8.LIZJ(textView, eCRichText, C2188811AlT.LIZIZ(sbLIZ), null);
        }
        C1421670n6D.LIZIZ(this.itemView, new AwS570S0100000_26(c1753000vic, 1587), new AwS392S0200000_26(c1753000vic, this, 247));
        C786410Ut5.I7(new AjS44S0200000_26(c1753000vic, this, 52), this.itemView);
    }
}
