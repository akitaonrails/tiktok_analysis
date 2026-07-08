package com.ss.android.ugc.aweme.commercialize.feed.assem.product;

import X.AbstractC1335900krs;
import X.C0IDB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C165S;
import X.C786410Ut5;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import Y.ACListenerS133S0200000_31;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class AdProductTileCell extends PowerCell<C165S> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        final C165S c165s = (C165S) interfaceC1891350zJl;
        String imageUrl = c165s.LL.getImageUrl();
        if (!TextUtils.isEmpty(imageUrl)) {
            C786410Ut5.I7(new ACListenerS133S0200000_31(this, c165s, 50), this.itemView);
            this.itemView.setOutlineProvider(new C0IDB(this, 11));
            this.itemView.setClipToOutline(true);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(imageUrl);
            c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.aam));
            c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.165T
                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "AdPlp");
                    c2344009Gk.LJIIIIZZ("pid", c165s.LL.getProductId());
                    C20684815ws.LJIILLIIL("product_tile_product_load_fail", c2344009Gk.LIZ);
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                    c165s.LLILZIL.LIZ();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "AdPlp");
                    c2344009Gk.LJIIIIZZ("pid", c165s.LL.getProductId());
                    c2344009Gk.LIZLLL(System.currentTimeMillis() - jCurrentTimeMillis, "loadtime");
                    c2344009Gk.LJIIIIZZ("source", "memory");
                    C20684815ws.LJIILLIIL("product_tile_product_load_success", c2344009Gk.LIZ);
                }
            });
            if (c165s.LLILLL) {
                C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.aal), 0);
            } else {
                C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.aal), 8);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b4f, viewGroup, false);
    }
}
