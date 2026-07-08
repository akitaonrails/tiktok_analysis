package com.ss.android.ugc.aweme.selector.creatorgroup;

import X.AbstractC1225770i0F;
import X.C1226700i1k;
import X.C1226730i1n;
import X.C1226750i1p;
import android.content.Context;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class CreatorGroupHeaderProtocolFactory implements IContactSelectorHeaderFactory {
    public final String LL = "id_header_creator_group";

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final String lW() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final C1226700i1k Fu0(final AbstractC1225770i0F abstractC1225770i0F, C1226750i1p c1226750i1p, String str) {
        final C1226730i1n c1226730i1n;
        if (!(c1226750i1p instanceof C1226730i1n) || (c1226730i1n = (C1226730i1n) c1226750i1p) == null) {
            return null;
        }
        C1226700i1k c1226700i1k = new C1226700i1k(abstractC1225770i0F, c1226730i1n) { // from class: X.0i1l
            @Override // X.C1226700i1k, X.InterfaceC1224260hxo
            public final void LIZIZ() {
                AbsContactSelectorFragment fragment;
                C19EG activity;
                C1226730i1n c1226730i1n2;
                Function0<Boolean> function0;
                InterfaceC1226510i1R interfaceC1226510i1R;
                super.LIZIZ();
                C1226750i1p c1226750i1p2 = this.LLILLL;
                if ((c1226750i1p2 instanceof C1226730i1n) && (c1226730i1n2 = (C1226730i1n) c1226750i1p2) != null && (function0 = c1226730i1n2.LJIIIZ) != null) {
                    if (!function0.invoke().booleanValue() || (interfaceC1226510i1R = this.LL.LIZ) == null) {
                        return;
                    }
                    interfaceC1226510i1R.LJIILL(C343970De7.LIZ, null);
                    return;
                }
                InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
                if (interfaceC1226510i1R2 == null || (fragment = interfaceC1226510i1R2.getFragment()) == null || (activity = fragment.getActivity()) == null) {
                    return;
                }
                C1227950i3l.LIZ(activity, this.LLILLJJLI.LJJJJLL().LJIIIZ().LIZJ(), "create_more");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
            @Override // X.C1226700i1k, X.InterfaceC1224250hxn
            public final void LJJJ(C1224790hyf c1224790hyf) {
                InterfaceC1226510i1R interfaceC1226510i1R;
                C1224780hye c1224780hyeLJIILLIIL;
                Map<String, List<C1224840hyk>> map;
                Set<String> setKeySet;
                ?? LJ;
                int size;
                InterfaceC1226510i1R interfaceC1226510i1R2;
                List<C1224840hyk> list;
                List<C1224760hyc> listLJFF;
                super.LJJJ(c1224790hyf);
                if (c1224790hyf.LIZ != null && (interfaceC1226510i1R = this.LLILLJJLI.LLILLL) != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (map = c1224780hyeLJIILLIIL.LIZ) != null && (setKeySet = map.keySet()) != null) {
                    for (String str2 : setKeySet) {
                        InterfaceC1226510i1R interfaceC1226510i1R3 = this.LLILLJJLI.LLILLL;
                        if (interfaceC1226510i1R3 != null && (listLJFF = interfaceC1226510i1R3.LJFF(str2)) != null) {
                            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJFF, 10));
                            if (iLIZIZ < 16) {
                                iLIZIZ = 16;
                            }
                            LJ = new LinkedHashMap(iLIZIZ);
                            for (C1224760hyc c1224760hyc : listLJFF) {
                                LJ.put(c1224760hyc.LL, c1224760hyc);
                            }
                        } else {
                            LJ = C2097608Jq.LJ();
                        }
                        Map<String, List<C1224840hyk>> map2 = c1224790hyf.LIZ;
                        if (map2 != null && (list = map2.get(str2)) != null) {
                            size = list.size();
                        } else {
                            size = 0;
                        }
                        if (LJ.keySet().contains("id_header_creator_group") && size > 0 && (interfaceC1226510i1R2 = this.LLILLJJLI.LLILLL) != null) {
                            interfaceC1226510i1R2.LJIJ(str2, "id_header_creator_group", true);
                        }
                    }
                }
            }

            @Override // X.C1226700i1k
            public final C1224220hxk LJJJJIZL(Context context) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_plus_small;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                return new C1224220hxk("id_header_creator_group", C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)), context.getString(2131850362), null, null, this.LLILLL.LIZIZ(), this.LLILLL.LIZ());
            }
        };
        c1226700i1k.LLJ = str;
        return c1226700i1k;
    }
}
