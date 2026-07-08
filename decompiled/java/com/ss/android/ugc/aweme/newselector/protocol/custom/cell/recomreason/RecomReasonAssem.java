package com.ss.android.ugc.aweme.newselector.protocol.custom.cell.recomreason;

import X.C019F;
import X.C01GW;
import X.C0I0B;
import X.C0QSJ;
import X.C1076370e7H;
import X.C1076380e7I;
import X.C127G;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS391S0100000_16;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomCellAssem;
import com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomVM;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.text.a0;
import wh6.AbS697S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class RecomReasonAssem extends ContactSelectorCustomCellAssem<C1076370e7H> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public C127G LLJLLL;
    public InterfaceC665370Q7z LLJZ;
    public C0QSJ LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecomReasonAssem.class, "vm", "getVm()Lcom/ss/android/ugc/tiktok/im/contact/selector/api/protocol/custom/ContactSelectorCustomVM;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RecomReasonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ContactSelectorCustomVM.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 386), null, AFwS252S0000000_16.get$arr$(278));
        this.LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 382));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 384));
        this.LLJLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 383));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 385));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.chx;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(ContactSelectorFragmentScope.class);
        return arrayList2;
    }

    public final SmartImageView sp() {
        return (SmartImageView) this.LLJLL.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ContactSelectorCustomVM.class, new AObjectS391S0100000_16(this, 5)}, defaultViewModelProviderFactory);
                    this.LLJLLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        if (!this.LLJL) {
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", this.LLJLIL.getValue()), new Pair("enter_method", this.LLJLILLLLZIIL.getValue()));
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("show_recom_group_reason", mapLJIIIIZZ);
            this.LLJL = true;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new AbS697S0100000_16(this, 4), getContentView());
    }

    public final void op(String str) {
        if (a0.LJJJIL(str)) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_play_rectangle_fill;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1p, sp().getContext());
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(sp().getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a03, sp().getContext());
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(sp().getContext()));
            SmartImageView smartImageViewSp = sp();
            if ((smartImageViewSp instanceof ImageView) && smartImageViewSp != null) {
                smartImageViewSp.setImageDrawable(layerDrawableLJIILIIL);
                return;
            }
            return;
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(sp());
        C786410Ut5.h3(c1331670kl3LJIIIZ);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        sr((C1076370e7H) obj, C13BV.INSTANCE);
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomCellAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public final void sr(C1076370e7H c1076370e7H, List<? extends Object> list) {
        boolean z;
        boolean z2 = true;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C1076380e7I) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((C1076380e7I) it2.next()).LIZ) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((C1076380e7I) it3.next()).LIZIZ) {
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
            C1076380e7I c1076380e7I = new C1076380e7I(z, z2);
            if (c1076380e7I.LIZ) {
                op(c1076370e7H.LL);
            }
            if (c1076380e7I.LIZIZ) {
                ((TextView) this.LLJLLIL.getValue()).setText(c1076370e7H.LLILLJJLI);
                return;
            }
            return;
        }
        op(c1076370e7H.LL);
        ((TextView) this.LLJLLIL.getValue()).setText(c1076370e7H.LLILLJJLI);
    }
}
