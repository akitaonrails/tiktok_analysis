package com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner;

import X.C0JSS;
import X.C0KBN;
import X.C1143680frq;
import X.C13LP;
import X.C1834150xpV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class RechargeBannerCell extends PowerCell<C0KBN> {
    public final void I5(C0KBN c0kbn) {
        ((TextView) this.itemView.findViewById(R.id.j0t)).setText(c0kbn.LL);
        ((TextView) this.itemView.findViewById(R.id.j0o)).setText(c0kbn.LLILLJJLI);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.iy1);
        ImageModel imageModel = c0kbn.LLILZ;
        if (imageModel != null) {
            C0JSS.LIZLLL(imageView, imageModel);
            return;
        }
        String str = c0kbn.LLILLL;
        if (str == null) {
            return;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        C1143680frq.LJFF(imageView, (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL), (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL), ImageView.ScaleType.FIT_CENTER, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0KBN c0kbn = (C0KBN) interfaceC1891350zJl;
        super.onBindItemView(c0kbn);
        I5(c0kbn);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C1834150xpV.LJ(C786410Ut5.ne(viewGroup.getContext())), R.layout.g2q, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C0KBN c0kbn;
        super.onBindItemView(interfaceC1891350zJl, list);
        Object objLJJJLL = C13LP.LJJJLL(list);
        if ((objLJJJLL instanceof C0KBN) && (c0kbn = (C0KBN) objLJJJLL) != null) {
            I5(c0kbn);
        }
    }
}
