package com.ss.android.ugc.aweme.newselector.protocol.topentry;

import X.AbstractC1225770i0F;
import X.C1226700i1k;
import X.C1226750i1p;
import X.C1227910i3h;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.exp.EntranceHeaderConfig;
import com.ss.android.ugc.aweme.exp.ImGroupChatCreationConfigModel;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class CreateFanGroupHeaderProtocolFactory implements IContactSelectorHeaderFactory {
    public final String LL = "id_header_create_fan_group";

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final String lW() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final C1226700i1k Fu0(AbstractC1225770i0F abstractC1225770i0F, C1226750i1p c1226750i1p, String str) {
        C1227910i3h c1227910i3h;
        if (!(c1226750i1p instanceof C1227910i3h) || (c1227910i3h = (C1227910i3h) c1226750i1p) == null) {
            return null;
        }
        C1226700i1k c1226700i1k = new C1226700i1k(abstractC1225770i0F, c1227910i3h) { // from class: X.0i3k
            public final boolean LLJI;
            public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3054));
            public boolean LLJILJIL;

            public final String LJJJJL() {
                return (String) this.LLJIJIL.getValue();
            }

            @Override // X.C1226700i1k, X.InterfaceC1224260hxo
            public final void onShow() {
                if (this.LLJILJIL) {
                    return;
                }
                C1228760i54.LIZ("show_creator_chat_room_entrance", new Pair[]{new Pair("enter_from", LJJJJL()), new Pair("enter_method", "new_group")}, C0I0B.LJFF.LIZIZ());
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1529005yi(LJJJJL(), "new_group", "creator_group", null), 3);
                this.LLJILJIL = true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C1226700i1k, X.InterfaceC1224260hxo
            public final void LIZIZ() {
                super.LIZIZ();
                C1228760i54.LIZ("click_creator_chat_room_entrance", new Pair[]{new Pair("enter_from", LJJJJL()), new Pair("enter_method", "new_group")}, C0I0B.LJFF.LIZIZ());
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1528905yh(LJJJJL(), "new_group", "creator_group", null), 3);
                C1229380i64 c1229380i64LJJIJLIJ = C913630Zsn.LJJIJLIJ(C913630Zsn.LJIIJJI, "im", "select_user_panel");
                Context contextLIZIZ = LJJJJJL().LIZIZ();
                C1228470i4b c1228470i4b = new C1228470i4b(new C1228650i4t(LJJJJL(), "new_group", EnumC1228990i5R.PUBLIC_GROUP.getValue(), EnumC913760Zt0.FAN_GROUP.getValue(), 0, new C1228700i4y(EnumC1228720i50.CHAT_ROOM.getValue(), 0, LJJJJL(), null, 0 == true ? 1 : 0, 26), false, null, null, true, null, false, null, null, null, null, 0, 0, false, null, null, null, -1072, 1), new C1228810i59(LJJJJL(), "new_group", C461720I8s.LIZIZ(), false, false, null, 0L, null, null, null, 0, null, null, null, null, null, false, null, null, 4194296));
                InterfaceC1228540i4i.LIZ.getClass();
                c1229380i64LJJIJLIJ.LIZLLL(contextLIZIZ, c1228470i4b, C1228590i4n.LIZ().LIZ(contextLIZIZ, c1228470i4b.LIZ));
            }

            @Override // X.C1226700i1k, X.InterfaceC1224300hxs
            public final void LJFF() {
                EventBus.LIZLLL().LJIJJ(this);
            }

            @Override // X.C1226700i1k, X.InterfaceC1224300hxs
            public final void LJJI() {
                EventBus.LIZLLL().LJJI(this);
            }

            @Override // X.C1226700i1k, X.InterfaceC1224250hxn
            public final void LJJJ(C1224790hyf c1224790hyf) {
                InterfaceC1226510i1R interfaceC1226510i1R;
                AbsContactSelectorFragment fragment;
                LifecycleCoroutineScope lifecycleScope;
                super.LJJJ(c1224790hyf);
                if (c1224790hyf.LIZ != null && (interfaceC1226510i1R = this.LL.LIZ) != null && (fragment = interfaceC1226510i1R.getFragment()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) != null) {
                    C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1226690i1j(this, null), 2);
                }
            }

            @Override // X.C1226700i1k
            public final C1224220hxk LJJJJIZL(Context context) {
                LayerDrawable layerDrawableLJIILIIL;
                String string;
                ImGroupChatCreationConfigModel imGroupChatCreationConfigModel = C1227970i3n.LIZ;
                EntranceHeaderConfig entranceHeaderConfigLIZIZ = C1227970i3n.LIZIZ(EnumC913760Zt0.FAN_GROUP.getValue());
                String string2 = null;
                if (!this.LLJI) {
                    layerDrawableLJIILIIL = null;
                } else {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_bubbles_star_fill;
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                    layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
                }
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_chevron_right_offset_ltr;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(context);
                if (entranceHeaderConfigLIZIZ == null || (string = entranceHeaderConfigLIZIZ.title) == null) {
                    string = context.getString(2131830178);
                }
                if (this.LLJI && (entranceHeaderConfigLIZIZ == null || (string2 = entranceHeaderConfigLIZIZ.subtitle) == null)) {
                    string2 = context.getString(2131834303);
                }
                return new C1224220hxk("id_header_create_fan_group", layerDrawableLJIILIIL, string, string2, tuxIconDrawableLIZ2, this.LLILLL.LIZIZ(), this.LLILLL.LIZ());
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onCloseSelectorEvent(C1228570i4l c1228570i4l) {
                InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                if (interfaceC1226510i1R != null) {
                    interfaceC1226510i1R.LJIILL(C343970De7.LIZ, null);
                }
            }

            {
                this.LLJI = c1227910i3h.LJFF;
            }
        };
        c1226700i1k.LLJ = str;
        return c1226700i1k;
    }
}
