package com.ss.android.ugc.aweme.newselector.protocol.topentry;

import X.AbstractC1225770i0F;
import X.C1226700i1k;
import X.C1226750i1p;
import X.C1227920i3i;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IInternalShareMethodBridge;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class CreateGroupToShareHeaderProtocolFactory implements IContactSelectorHeaderFactory {
    public final String LL = "id_header_create_group_to_share";

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final String lW() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final C1226700i1k Fu0(AbstractC1225770i0F abstractC1225770i0F, C1226750i1p c1226750i1p, String str) {
        C1227920i3i c1227920i3i;
        if (!(c1226750i1p instanceof C1227920i3i) || (c1227920i3i = (C1227920i3i) c1226750i1p) == null) {
            return null;
        }
        C1226700i1k c1226700i1k = new C1226700i1k(abstractC1225770i0F, c1227920i3i) { // from class: X.0i3v
            public boolean LLJI;
            public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3055));
            public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3056));
            public final BaseSharePackage LLJILJILJ;

            @Override // X.C1226700i1k, X.InterfaceC1224260hxo
            public final void onShow() {
                if (this.LLJI) {
                    return;
                }
                Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", this.LLJIJIL.getValue()), new Pair("enter_method", "create_group_to_share_post"), new Pair("position", "list"));
                IInternalShareMethodBridge.LIZ.getClass();
                IInternalShareMethodBridge iInternalShareMethodBridgeLIZ = C0ZHK.LIZ();
                if (iInternalShareMethodBridgeLIZ != null) {
                    iInternalShareMethodBridgeLIZ.LIZIZ("show_create_new_group_chat", mapLJIIIIZZ);
                }
                this.LLJI = true;
            }

            @Override // X.C1226700i1k, X.InterfaceC1224260hxo
            public final void LIZIZ() {
                List list;
                C1224780hye c1224780hyeLJIILLIIL;
                List<C1224840hyk> list2;
                super.LIZIZ();
                InterfaceC1226510i1R interfaceC1226510i1R = (InterfaceC1226510i1R) this.LLJILJIL.getValue();
                if (interfaceC1226510i1R == null) {
                    return;
                }
                InterfaceC1226510i1R interfaceC1226510i1R2 = (InterfaceC1226510i1R) this.LLJILJIL.getValue();
                if (interfaceC1226510i1R2 == null || (c1224780hyeLJIILLIIL = interfaceC1226510i1R2.LJIILLIIL()) == null || (list2 = c1224780hyeLJIILLIIL.LIZIZ) == null || !(!list2.isEmpty())) {
                    C1228040i3u c1228040i3uLIZJ = C1226680i1i.LIZJ(this.LLILLJJLI);
                    BaseSharePackage baseSharePackage = this.LLJILJILJ;
                    if (baseSharePackage != null) {
                        C786410Ut5.LJJJI("open_platform_biz_line", c1228040i3uLIZJ.LIZ, baseSharePackage.extras);
                        C786410Ut5.LJJJI("open_platform_biz_scene", c1228040i3uLIZJ.LIZIZ, baseSharePackage.extras);
                        C786410Ut5.LJJJI("open_platform_source", c1228040i3uLIZJ.LIZJ, baseSharePackage.extras);
                        InterfaceC1226510i1R interfaceC1226510i1R3 = this.LL.LIZ;
                        if (interfaceC1226510i1R3 != null) {
                            interfaceC1226510i1R3.LJIILL(C343970De7.LIZ, null);
                        }
                        IMShareService.LIZ.getClass();
                        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
                        if (iMShareServiceLIZ != null) {
                            iMShareServiceLIZ.LIZ(this.LLILLJJLI.LJJJJLL().LIZIZ(), baseSharePackage);
                        }
                        C1224780hye c1224780hyeLJIILLIIL2 = interfaceC1226510i1R.LJIILLIIL();
                        if (c1224780hyeLJIILLIIL2 == null || (list = c1224780hyeLJIILLIIL2.LIZIZ) == null) {
                            list = C13BV.INSTANCE;
                        }
                        if (!list.isEmpty()) {
                            return;
                        }
                        Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", this.LLJIJIL.getValue()), new Pair("enter_method", "create_group_to_share_post"), new Pair("position", "list"));
                        IInternalShareMethodBridge.LIZ.getClass();
                        IInternalShareMethodBridge iInternalShareMethodBridgeLIZ = C0ZHK.LIZ();
                        if (iInternalShareMethodBridgeLIZ != null) {
                            iInternalShareMethodBridgeLIZ.LIZIZ("click_create_new_group_chat", mapLJIIIIZZ);
                        }
                    }
                }
            }

            @Override // X.C1226700i1k
            public final C1224220hxk LJJJJIZL(Context context) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_plus_person_fill;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_chevron_right_offset_ltr;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(context);
                return new C1224220hxk("id_header_create_group_to_share", layerDrawableLJIILIIL, context.getString(2131835358), context.getString(2131835357), tuxIconDrawableLIZ2, this.LLILLL.LIZIZ(), this.LLILLL.LIZ());
            }

            {
                this.LLJILJILJ = c1227920i3i.LJFF;
            }
        };
        c1226700i1k.LLJ = str;
        return c1226700i1k;
    }
}
