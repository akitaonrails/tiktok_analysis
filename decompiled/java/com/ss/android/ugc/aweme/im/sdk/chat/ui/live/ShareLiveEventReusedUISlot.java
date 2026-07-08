package com.ss.android.ugc.aweme.im.sdk.chat.ui.live;

import X.C01GW;
import X.C0ZUZ;
import X.C0ZVS;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1383370m6R;
import X.C438710HIf;
import X.C452501pT;
import X.C454440Hru;
import X.C460270I3d;
import X.C461530I7z;
import X.C462590ICb;
import X.C687700QyG;
import X.C723590SZx;
import X.C786410Ut5;
import X.C898900ZOe;
import X.C900510ZUj;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC460300I3g;
import X.InterfaceC712990Rxx;
import X.InterfaceC900500ZUi;
import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareLiveEventReusedUISlot extends ReusedUISlotAssem<ShareLiveEventReusedUISlot> implements InterfaceC712990Rxx<InterfaceC900500ZUi>, InterfaceC1146704e9 {
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cm0;
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

    public ShareLiveEventReusedUISlot() {
        checkSupervisorPrepared();
        new C723590SZx(this, C898900ZOe.class, null);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 833));
        this.LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 835));
        this.LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 831));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 836));
        this.LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 834));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 832));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).findViewById(R.id.dg4);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(C1383370m6R.LJFF(R.attr.a03));
        }
        View view2 = (View) this.LLJLIL.getValue();
        Context context = C1383370m6R.LIZ;
        view2.setForeground(new StateListDrawable());
        C786410Ut5.I7(new ACListenerS149S0100000_14(this, 29), (View) this.LLJJLIIIJLLLLLLLZ.getValue());
    }

    public final void op(C0ZUZ c0zuz) {
        TextView textView = (TextView) this.LLJL.getValue();
        C460270I3d c460270I3d = InterfaceC460300I3g.LIZ;
        InterfaceC460300I3g interfaceC460300I3g = c0zuz.LIZJ;
        Context context = LJJIJL().getContext();
        c460270I3d.getClass();
        textView.setText(C460270I3d.LIZ(interfaceC460300I3g, context));
        ((TextView) this.LLJLILLLLZIIL.getValue()).setText(C460270I3d.LIZ(c0zuz.LIZLLL, LJJIJL().getContext()));
        ((TextView) this.LLJLL.getValue()).setText(C460270I3d.LIZ(c0zuz.LJFF, LJJIJL().getContext()));
        IMLiveService.LIZ.getClass();
        IMLiveService iMLiveServiceLIZ = C0ZVS.LIZ();
        if (iMLiveServiceLIZ != null) {
            iMLiveServiceLIZ.LJI(LJJIJL().getContext(), (TuxTextView) this.LLJLL.getValue(), c0zuz.LJ);
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c0zuz.LIZIZ));
        c1331670kl3LJIIIIZZ.LJJJJLI = C454440Hru.LIZ();
        c1331670kl3LJIIIIZZ.LJJIIZ(2130971789);
        c1331670kl3LJIIIIZZ.LJIJJLI(2130971789);
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJLIL.getValue());
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC900500ZUi interfaceC900500ZUi) {
        InterfaceC900500ZUi interfaceC900500ZUi2 = interfaceC900500ZUi;
        ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC900500ZUi2.LIZJ(), (View) this.LLJJLIIIJLLLLLLLZ.getValue()));
        op(interfaceC900500ZUi2.getContent());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC900500ZUi interfaceC900500ZUi) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC900500ZUi interfaceC900500ZUi) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C900510ZUj c900510ZUj;
        InterfaceC900500ZUi interfaceC900500ZUi = (InterfaceC900500ZUi) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C900510ZUj) && (c900510ZUj = (C900510ZUj) obj2) != null) {
                    if (c900510ZUj.LIZIZ) {
                        ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC900500ZUi.LIZJ(), (View) this.LLJJLIIIJLLLLLLLZ.getValue()));
                    }
                    if (c900510ZUj.LIZ) {
                        op(interfaceC900500ZUi.getContent());
                    }
                }
            }
            return;
        }
        ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC900500ZUi.LIZJ(), (View) this.LLJJLIIIJLLLLLLLZ.getValue()));
        op(interfaceC900500ZUi.getContent());
    }
}
