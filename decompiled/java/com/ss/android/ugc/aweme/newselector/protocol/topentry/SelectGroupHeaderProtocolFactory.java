package com.ss.android.ugc.aweme.newselector.protocol.topentry;

import X.AbstractC1225770i0F;
import X.C1226700i1k;
import X.C1226740i1o;
import X.C1226750i1p;
import android.content.Context;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectGroupHeaderProtocolFactory implements IContactSelectorHeaderFactory {
    public final String LL = "id_select_group";

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final String lW() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final C1226700i1k Fu0(final AbstractC1225770i0F abstractC1225770i0F, C1226750i1p c1226750i1p, String str) {
        final C1226740i1o c1226740i1o;
        if (!(c1226750i1p instanceof C1226740i1o) || (c1226740i1o = (C1226740i1o) c1226750i1p) == null) {
            return null;
        }
        C1226700i1k c1226700i1k = new C1226700i1k(abstractC1225770i0F, c1226740i1o) { // from class: X.0i1m
            @Override // X.C1226700i1k, X.InterfaceC1224260hxo
            public final void LIZIZ() {
                super.LIZIZ();
                InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                if (interfaceC1226510i1R != null) {
                    interfaceC1226510i1R.LJIILL(C343970De7.LIZ, null);
                }
                C0I0B.LJFF.LIZJ();
                C1225480hzm c1225480hzm = new C1225480hzm(C894660Z7w.LIZ(), LJJJJJL().LJIIIZ().LIZJ());
                C1227130i2R c1227130i2R = C1227130i2R.LIZ;
                Context contextLIZIZ = this.LLILLJJLI.LJJJJLL().LIZIZ();
                c1227130i2R.getClass();
                C1227130i2R.LJ(contextLIZIZ, c1225480hzm);
            }

            @Override // X.C1226700i1k
            public final C1224220hxk LJJJJIZL(Context context) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_ltr;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                return new C1224220hxk("id_select_group", null, context.getString(2131835394), null, tuxIconDrawableLIZ, this.LLILLL.LIZIZ(), this.LLILLL.LIZ());
            }
        };
        c1226700i1k.LLJ = str;
        return c1226700i1k;
    }
}
