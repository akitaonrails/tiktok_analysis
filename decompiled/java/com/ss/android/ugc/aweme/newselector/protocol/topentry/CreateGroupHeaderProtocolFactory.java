package com.ss.android.ugc.aweme.newselector.protocol.topentry;

import X.AbstractC1225770i0F;
import X.C1226700i1k;
import X.C1226750i1p;
import X.C1226920i26;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMCreateChatAnalytics;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public final class CreateGroupHeaderProtocolFactory implements IContactSelectorHeaderFactory {
    public final String LL = "id_new_group";

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final String lW() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final C1226700i1k Fu0(final AbstractC1225770i0F abstractC1225770i0F, C1226750i1p c1226750i1p, String str) {
        final C1226920i26 c1226920i26;
        if (!(c1226750i1p instanceof C1226920i26) || (c1226920i26 = (C1226920i26) c1226750i1p) == null) {
            return null;
        }
        C1226700i1k c1226700i1k = new C1226700i1k(abstractC1225770i0F, c1226920i26) { // from class: X.0i3d
            @Override // X.C1226700i1k, X.InterfaceC1224260hxo
            public final void LIZIZ() {
                AbsContactSelectorFragment fragment;
                C19EG activity;
                super.LIZIZ();
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("click_create_new_group_chat", C2097608Jq.LJ());
                InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                if (interfaceC1226510i1R == null || (fragment = interfaceC1226510i1R.getFragment()) == null || (activity = fragment.getActivity()) == null) {
                    return;
                }
                InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
                if (interfaceC1226510i1R2 != null) {
                    interfaceC1226510i1R2.LJIILL(C343970De7.LIZ, null);
                }
                ArrayList arrayList = new ArrayList();
                if (C1608406Rm.LIZ()) {
                    arrayList.add(new C1227880i3e(null, null, EnumC1226770i1r.VISIBILITY, C0N0C.SELECTED_LIST_NOT_EMPTY, 63));
                }
                C1227130i2R.LIZLLL(activity, new C1226980i2C(activity, null, new C1226240i10() { // from class: X.0i2t
                    @Override // X.C1226240i10, X.InterfaceC1225830i0L
                    public final void LJ() {
                        IIMCreateChatAnalytics iIMCreateChatAnalytics = (IIMCreateChatAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMCreateChatAnalytics.class);
                        if (iIMCreateChatAnalytics != null) {
                            iIMCreateChatAnalytics.LIZJ(C0I0B.LJFF.LIZIZ());
                        }
                    }

                    @Override // X.C1226240i10, X.InterfaceC1225830i0L
                    public final void LJI() {
                        IIMCreateChatAnalytics iIMCreateChatAnalytics = (IIMCreateChatAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMCreateChatAnalytics.class);
                        if (iIMCreateChatAnalytics != null) {
                            iIMCreateChatAnalytics.LIZLLL(C0I0B.LJFF.LIZIZ());
                        }
                    }
                }, LJJJJJL().LJIIIZ().LIZJ(), "new_group", false, null, null, null, true, null, null, null, false, null, null, arrayList, null, null, false, false, false, null, 2145385442), "im", "select_user_panel", "native");
            }

            @Override // X.C1226700i1k, X.InterfaceC1224260hxo
            public final void onShow() {
                C0I0B.LJFF.LIZIZ();
            }

            @Override // X.C1226700i1k
            public final C1224220hxk LJJJJIZL(Context context) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_two_person_large_fill;
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
                return new C1224220hxk("id_new_group", layerDrawableLJIILIIL, context.getString(2131831538), null, tuxIconDrawableLIZ2, this.LLILLL.LIZIZ(), this.LLILLL.LIZ());
            }
        };
        c1226700i1k.LLJ = str;
        return c1226700i1k;
    }
}
