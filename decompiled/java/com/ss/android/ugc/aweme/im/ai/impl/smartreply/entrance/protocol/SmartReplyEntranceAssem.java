package com.ss.android.ugc.aweme.im.ai.impl.smartreply.entrance.protocol;

import X.AnonymousClass0629;
import X.C002M;
import X.C01GW;
import X.C0I73;
import X.C0ZQ1;
import X.C0ZXS;
import X.C0ZXY;
import X.C0ZXZ;
import X.C0ZY6;
import X.C1308910kAL;
import X.C1559260qg8;
import X.C197039127h;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C422360GhG;
import X.C426750GoL;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS581S0100000_2;
import wh6.AbS686S0100000_2;

/* JADX INFO: loaded from: classes15.dex */
public final class SmartReplyEntranceAssem extends ReusedUISlotAssem<SmartReplyEntranceAssem> implements InterfaceC712990Rxx<C002M>, InterfaceC1146704e9 {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 216));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 214));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 211));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 212));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 210));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 217));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 215));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 213));
    public volatile boolean LLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cs4;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C457780HxI op() {
        return (C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, view.getContext());
        if (numLIZJ != null) {
            ((CardView) this.LLJL.getValue()).setCardBackgroundColor(numLIZJ.intValue());
        }
        ((CardView) this.LLJL.getValue()).setRadius(C0I73.LIZ);
        View view2 = (View) this.LLJLLIL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AbS686S0100000_2(this, 1), view2);
        }
        View view3 = (View) this.LLJLLL.getValue();
        if (view3 != null) {
            C786410Ut5.I7(new AbS686S0100000_2(this, 2), view3);
        }
        Context context = getContext();
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZ = R.raw.icon_x_mark_fill_small;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
            TuxIconView tuxIconView = (TuxIconView) this.LLJLLIL.getValue();
            if (tuxIconView != null) {
                tuxIconView.setImageDrawable(layerDrawableLJIILIIL);
            }
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LLJLL.getValue();
        if (tuxIconView2 != null) {
            C337180DJs.LIZJ(tuxIconView2);
            IMAIServiceAPI.LIZ.getClass();
            Drawable drawable = AnonymousClass0629.LIZ().LIZ().LJII(C0ZQ1.CHATROOM_INTRO_AVATAR_LABEL, null).LIZIZ;
            if (drawable != null) {
                tuxIconView2.setImageDrawable(drawable);
            }
        }
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (objPluggableSpiForReal != null) {
            C0ZXS c0zxsLJI = ((IIMMessageBubbleService) objPluggableSpiForReal).LJI(null);
            C0ZXS c0zxsLIZ = C0ZXS.LIZ(c0zxsLJI, new C0ZXY(c0zxsLJI.LIZJ.LIZ(LJJIJL().getContext()), new C422360GhG(C418440Gaw.LIZIZ(12))));
            View view4 = (View) this.LLJZIJLIL.getValue();
            if (view4 != null) {
                Object objPluggableSpiForReal2 = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                if (objPluggableSpiForReal2 != null) {
                    ((IIMMessageBubbleService) objPluggableSpiForReal2).LIZ(view4, c0zxsLIZ, false, LifecycleOwnerKt.getLifecycleScope(this), AFwS201S0000000_14.get$arr$(448), AFwS248S0000000_14.get$arr$(452), new C0ZY6() { // from class: X.0ZXg
                        @Override // X.C0ZY6
                        public final View LIZ(View view5, boolean z) {
                            return view5;
                        }
                    });
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            Object objPluggableSpiForReal3 = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
            if (objPluggableSpiForReal3 != null) {
                C0ZXS c0zxsLIZ2 = C0ZXS.LIZ(((IIMMessageBubbleService) objPluggableSpiForReal3).LIZLLL(null), new C0ZXZ(R.attr.a03, new C422360GhG(C418440Gaw.LIZIZ(12))));
                View view5 = (View) this.LLJZ.getValue();
                if (view5 != null) {
                    Object objPluggableSpiForReal4 = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                    if (objPluggableSpiForReal4 != null) {
                        ((IIMMessageBubbleService) objPluggableSpiForReal4).LJII(view5, c0zxsLIZ2, false, LifecycleOwnerKt.getLifecycleScope(this), AFwS201S0000000_14.get$arr$(449), AFwS248S0000000_14.get$arr$(453), new C0ZY6() { // from class: X.0ZXg
                            @Override // X.C0ZY6
                            public final View LIZ(View view52, boolean z) {
                                return view52;
                            }
                        });
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                C197039127h c197039127h = (C197039127h) this.LLJLLL.getValue();
                if (c197039127h != null) {
                    c197039127h.LJJJJL(new AwS581S0100000_2(view, 205));
                }
                Context context2 = getContext();
                if (context2 != null) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    c419910GdJ2.LIZ = R.raw.icon_x_mark_fill_small;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                    TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(context2);
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zm);
                    c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
                    LayerDrawable layerDrawableLJIILIIL2 = C426750GoL.LJIILIIL(tuxIconDrawableLIZ2, c384050F3z2.LIZ(context2));
                    TuxIconView tuxIconView3 = (TuxIconView) this.LLJLLIL.getValue();
                    if (tuxIconView3 != null) {
                        tuxIconView3.setImageDrawable(layerDrawableLJIILIIL2);
                        return;
                    }
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(X.C002M r19) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ai.impl.smartreply.entrance.protocol.SmartReplyEntranceAssem.tp(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C002M c002m) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C002M c002m) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
