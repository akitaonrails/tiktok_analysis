package com.ss.android.ugc.aweme.ecommerce.base.selector.viewholder;

import X.C1322110kVd;
import X.C1324750kZt;
import X.C1331100kk8;
import X.C13LP;
import X.C2402509bD;
import X.C2471909mP;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.graphics.Bitmap;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS61S0100000_3;

/* JADX INFO: loaded from: classes9.dex */
public final class ECAlbumVH extends ECPowerCell<C2402509bD> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.anf;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C2402509bD c2402509bD = (C2402509bD) interfaceC1891350zJl;
        super.onBindItemView(c2402509bD);
        C1322110kVd c1322110kVd = (C1322110kVd) this.itemView.findViewById(R.id.lkw);
        TextView textView = (TextView) this.itemView.findViewById(R.id.kdl);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.kc8);
        c1322110kVd.getHierarchy().LJJIII(C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(10)));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c1322110kVd.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        textView.setText(c2402509bD.LL);
        textView2.setText(String.valueOf(c2402509bD.LLILLJJLI.size()));
        MediaModel mediaModel = (MediaModel) C13LP.LJJJLIIL(c2402509bD.LLILLJJLI);
        if (mediaModel != null) {
            if (c1322110kVd.getLayoutParams().width > 0) {
                i = c1322110kVd.getLayoutParams().width;
            } else {
                i = -1;
            }
            C1324750kZt.LJIIJ(c1322110kVd, C2471909mP.LJIILIIL(mediaModel.LJFF()).toString(), i, i, Bitmap.Config.ARGB_4444);
        }
        C786410Ut5.I7(new AjS61S0100000_3(c2402509bD, 0), this.itemView);
    }
}
