package com.ss.android.ugc.aweme.im.sdk.chat.ui.repost;

import X.C01GW;
import X.C0I6E;
import X.C0ZQZ;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332130kln;
import X.C1383370m6R;
import X.C1602160rnK;
import X.C1954807lC;
import X.C21415018rM;
import X.C418440Gaw;
import X.C426750GoL;
import X.C438710HIf;
import X.C444830HcP;
import X.C452501pT;
import X.C454440Hru;
import X.C461530I7z;
import X.C462320IBa;
import X.C462340IBc;
import X.C462360IBe;
import X.C462410IBj;
import X.C462590ICb;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC714850S2h;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC462330IBb;
import X.InterfaceC462380IBg;
import X.InterfaceC712990Rxx;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareRepostReusedUISlot extends ReusedUISlotAssem<ShareRepostReusedUISlot> implements InterfaceC712990Rxx<InterfaceC462380IBg>, InterfaceC1146704e9 {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 334));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 333));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 331));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 332));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 335));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cm5;
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

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2 = (View) this.LLJL.getValue();
        Context context = C1383370m6R.LIZ;
        view2.setForeground(new StateListDrawable());
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 41), (View) this.LLJJLIIIJLLLLLLLZ.getValue());
    }

    public final void op(C462360IBe c462360IBe) {
        int iIntValue;
        String str = c462360IBe.LIZIZ;
        String string = LJJIJL().getContext().getString(2131847846, str);
        Integer numLIZJ = C1308910kAL.LIZJ(c462360IBe.LIZJ, LJJIJL().getContext());
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIILIIL(string);
        c444830HcP.LIZIZ.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        c444830HcP.LJIILJJIL(iIntValue);
        c444830HcP.LJII(c462360IBe.LIZLLL);
        ((C21415018rM) this.LLJLILLLLZIIL.getValue()).setTextLayout(c444830HcP.LIZIZ());
        C426750GoL.LJIIIZ((View) this.LLJLIL.getValue(), null, null, null, Integer.valueOf(c462360IBe.LJ), false, 23);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c462360IBe.LIZ));
        c1331670kl3LJIIIIZZ.LJJJJLI = C454440Hru.LIZ();
        c1331670kl3LJIIIIZZ.LJIJJLI(R.drawable.c5w);
        c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJL.getValue());
        C1332130kln.LJ(c1331670kl3LJIIIIZZ, "ShareRepostAvatarView", str, 0, false, new C0I6E(str), null, 220);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC462380IBg interfaceC462380IBg) {
        InterfaceC462380IBg interfaceC462380IBg2 = interfaceC462380IBg;
        op(interfaceC462380IBg2.getContent().LIZ);
        sp(interfaceC462380IBg2.getContent().LIZIZ);
        ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC462380IBg2.LIZJ(), LJJIJL()));
    }

    public final void sp(InterfaceC462330IBb interfaceC462330IBb) {
        if (interfaceC462330IBb instanceof C462320IBa) {
            TextView textView = (TextView) ((C0ZQZ) this.LLJLL.getValue()).LIZ();
            if (textView != null) {
                int visibility = textView.getVisibility();
                textView.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, textView);
                textView.setText(((C462320IBa) interfaceC462330IBb).LIZ);
                return;
            }
            return;
        }
        if (interfaceC462330IBb instanceof C462340IBc) {
            ((C0ZQZ) this.LLJLL.getValue()).LIZIZ();
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC462380IBg interfaceC462380IBg) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC462380IBg interfaceC462380IBg) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C462410IBj c462410IBj;
        InterfaceC462380IBg interfaceC462380IBg = (InterfaceC462380IBg) interfaceC1587906Jp;
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
                if ((obj2 instanceof C462410IBj) && (c462410IBj = (C462410IBj) obj2) != null) {
                    if (c462410IBj.LIZ) {
                        op(interfaceC462380IBg.getContent().LIZ);
                    }
                    if (c462410IBj.LIZIZ) {
                        sp(interfaceC462380IBg.getContent().LIZIZ);
                    }
                    if (c462410IBj.LIZJ) {
                        ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC462380IBg.LIZJ(), LJJIJL()));
                    }
                }
            }
            return;
        }
        op(interfaceC462380IBg.getContent().LIZ);
        sp(interfaceC462380IBg.getContent().LIZIZ);
        ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC462380IBg.LIZJ(), LJJIJL()));
    }
}
