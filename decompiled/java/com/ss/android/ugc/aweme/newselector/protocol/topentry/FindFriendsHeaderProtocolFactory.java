package com.ss.android.ugc.aweme.newselector.protocol.topentry;

import X.AbstractC1225770i0F;
import X.C1226700i1k;
import X.C1226750i1p;
import X.C1226940i28;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.service.RouteAddFriendsPageService;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class FindFriendsHeaderProtocolFactory implements IContactSelectorHeaderFactory {
    public final String LL = "id_header_find_friend";

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final String lW() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final C1226700i1k Fu0(final AbstractC1225770i0F abstractC1225770i0F, C1226750i1p c1226750i1p, String str) {
        final C1226940i28 c1226940i28;
        if (!(c1226750i1p instanceof C1226940i28) || (c1226940i28 = (C1226940i28) c1226750i1p) == null) {
            return null;
        }
        C1226700i1k c1226700i1k = new C1226700i1k(abstractC1225770i0F, c1226940i28) { // from class: X.0i3m
            @Override // X.C1226700i1k, X.InterfaceC1224260hxo
            public final void LIZIZ() {
                super.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILLJJLI.LJJJJLL().LJIIIZ().LIZJ());
                sbLIZ.append("_contact_selector");
                Integer num = null;
                FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, C2188811AlT.LIZIZ(sbLIZ), "", EnumC666200QBe.DEFAULT, null, 0, false, -1, null);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LLILLJJLI.LJJJJLL().LJIIIZ().LIZJ());
                sbLIZ2.append("_contact_selector");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LLILLJJLI.LJJJJLL().LJIIIZ().LIZJ());
                sbLIZ3.append("_contact_selector");
                C1264430j0b c1264430j0b = new C1264430j0b(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ3), null);
                RouteAddFriendsPageService routeAddFriendsPageService = (RouteAddFriendsPageService) PluggableExtentionKt.pluggableSpiForReal(RouteAddFriendsPageService.class);
                if (routeAddFriendsPageService != null) {
                    num = null;
                    routeAddFriendsPageService.LIZJ(LJJJJJL().LIZIZ(), findFriendsPageArg, c1264430j0b, null, false);
                }
                InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                if (interfaceC1226510i1R != null) {
                    interfaceC1226510i1R.LJIILL(C343970De7.LIZ, num);
                }
            }

            @Override // X.C1226700i1k, X.InterfaceC1224250hxn
            public final void LJJJ(C1224790hyf c1224790hyf) {
                C1224780hye c1224780hyeLJIILLIIL;
                Map<String, List<C1224840hyk>> map;
                List<C1224840hyk> list;
                InterfaceC1226510i1R interfaceC1226510i1R;
                super.LJJJ(c1224790hyf);
                String value = EnumC1226540i1U.TAB_KEY_FRIENDS.getValue();
                InterfaceC1226510i1R interfaceC1226510i1R2 = this.LLILLJJLI.LLILLL;
                if (interfaceC1226510i1R2 != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R2.LJIILLIIL()) != null && (map = c1224780hyeLJIILLIIL.LIZ) != null && (list = map.get(value)) != null && list.isEmpty() && (interfaceC1226510i1R = this.LLILLJJLI.LLILLL) != null) {
                    interfaceC1226510i1R.LJIJ(value, "id_header_find_friend", false);
                }
            }

            @Override // X.C1226700i1k
            public final C1224220hxk LJJJJIZL(Context context) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_person_plus;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_chevron_right_offset_ltr;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(context);
                return new C1224220hxk("id_header_find_friend", layerDrawableLJIILIIL, context.getString(R.string.cox), null, tuxIconDrawableLIZ2, this.LLILLL.LIZIZ(), this.LLILLL.LIZ());
            }
        };
        c1226700i1k.LLJ = str;
        return c1226700i1k;
    }
}
