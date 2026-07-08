package com.ss.android.ugc.aweme.im.sdk.chat.ui.portrait;

import X.C01GW;
import X.C1322100kVc;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332130kln;
import X.C1697810uHb;
import X.C452501pT;
import X.C454440Hru;
import X.C460270I3d;
import X.C461530I7z;
import X.C462780ICu;
import X.C462790ICv;
import X.C462800ICw;
import X.C687700QyG;
import X.C723590SZx;
import X.C786410Ut5;
import X.C898900ZOe;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC460300I3g;
import X.InterfaceC462770ICt;
import X.InterfaceC712990Rxx;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutCL;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PortraitCardReusedUISlot extends ReusedUISlotAssem<PortraitCardReusedUISlot> implements InterfaceC712990Rxx<InterfaceC462770ICt>, InterfaceC1146704e9 {
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.clg;
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

    public PortraitCardReusedUISlot() {
        checkSupervisorPrepared();
        new C723590SZx(this, C898900ZOe.class, null);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 325));
        this.LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 327));
        this.LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 323));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 324));
        this.LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 329));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 328));
        this.LLJLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 326));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        float dimensionPixelSize = LJJIJL().getContext().getResources().getDimensionPixelSize(R.dimen.a0o);
        C462800ICw.LIZ((C1322100kVc) this.LLJL.getValue(), new float[]{dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f});
        C786410Ut5.Na((RoundingCornerLayoutCL) this.LLJJLIIIJLLLLLLLZ.getValue(), new ACListenerS141S0100000_6(this, 40));
    }

    public final void op(C462790ICv c462790ICv) {
        int i;
        for (Pair pair : C1697810uHb.LJIIJJI(new Pair(this.LLJLILLLLZIIL.getValue(), c462790ICv.LIZ), new Pair(this.LLJLL.getValue(), c462790ICv.LIZIZ), new Pair(this.LLJLLIL.getValue(), c462790ICv.LIZJ), new Pair(this.LLJLLL.getValue(), c462790ICv.LIZLLL))) {
            TuxTextView tuxTextView = (TuxTextView) pair.getFirst();
            InterfaceC460300I3g interfaceC460300I3g = (InterfaceC460300I3g) pair.getSecond();
            C460270I3d c460270I3d = InterfaceC460300I3g.LIZ;
            Context context = LJJIJL().getContext();
            c460270I3d.getClass();
            CharSequence charSequenceLIZ = C460270I3d.LIZ(interfaceC460300I3g, context);
            tuxTextView.setText(charSequenceLIZ);
            if (charSequenceLIZ.length() == 0) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(c462790ICv.LJFF);
        c1331670kl3LJIIIIZZ.LJJJJLI = C454440Hru.LIZ();
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJL.getValue());
        int width = ((View) this.LLJL.getValue()).getWidth();
        int height = ((View) this.LLJL.getValue()).getHeight();
        c1331670kl3LJIIIIZZ.LJIIIIZZ = width;
        c1331670kl3LJIIIIZZ.LJIIIZ = height;
        C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "IMPortraitCard", null, false, null, null, null, 62);
        C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(c462790ICv.LJ);
        c1331670kl3LJIIIIZZ2.LJJJJLI = C454440Hru.LIZ();
        c1331670kl3LJIIIIZZ2.LJJ((SmartImageView) this.LLJLIL.getValue());
        int width2 = ((View) this.LLJLIL.getValue()).getWidth();
        int height2 = ((View) this.LLJLIL.getValue()).getHeight();
        c1331670kl3LJIIIIZZ2.LJIIIIZZ = width2;
        c1331670kl3LJIIIIZZ2.LJIIIZ = height2;
        C1332130kln.LJFF(c1331670kl3LJIIIIZZ2, "IMPortraitCardAvatar", null, false, null, null, null, 62);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC462770ICt interfaceC462770ICt) {
        InterfaceC462770ICt interfaceC462770ICt2 = interfaceC462770ICt;
        op(interfaceC462770ICt2.getContent());
        ((RoundingCornerLayoutCL) this.LLJJLIIIJLLLLLLLZ.getValue()).setRoundingParams(interfaceC462770ICt2.LIZJ().LIZ);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC462770ICt interfaceC462770ICt) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC462770ICt interfaceC462770ICt) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C462780ICu c462780ICu;
        InterfaceC462770ICt interfaceC462770ICt = (InterfaceC462770ICt) interfaceC1587906Jp;
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
                if ((obj2 instanceof C462780ICu) && (c462780ICu = (C462780ICu) obj2) != null) {
                    if (c462780ICu.LIZ) {
                        op(interfaceC462770ICt.getContent());
                    }
                    if (c462780ICu.LIZIZ) {
                        ((RoundingCornerLayoutCL) this.LLJJLIIIJLLLLLLLZ.getValue()).setRoundingParams(interfaceC462770ICt.LIZJ().LIZ);
                    }
                }
            }
            return;
        }
        op(interfaceC462770ICt.getContent());
        ((RoundingCornerLayoutCL) this.LLJJLIIIJLLLLLLLZ.getValue()).setRoundingParams(interfaceC462770ICt.LIZJ().LIZ);
    }
}
