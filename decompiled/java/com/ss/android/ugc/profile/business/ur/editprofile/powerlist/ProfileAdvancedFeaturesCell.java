package com.ss.android.ugc.profile.business.ur.editprofile.powerlist;

import X.C01GW;
import X.C11G4;
import X.C1214280hhi;
import X.C1215970hkR;
import X.C1253930ijf;
import X.C1266090j3H;
import X.C127K;
import X.C13LE;
import X.C1EDI;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1242710iRZ;
import X.InterfaceC1214300hhk;
import X.InterfaceC2217461Bqa;
import Y.ATListenerS452S0100000_19;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAdvancedFeaturesCell extends PowerCell<C1214280hhi> implements InterfaceC1214300hhk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public C127K LL;
    public Context LLILLJJLI;
    public boolean LLILZ;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2246));
    public final C1266090j3H LLILZIL = new C1266090j3H(this, 6);
    public final AwS633S0100000_19 LLILZLL = new AwS633S0100000_19(this, 130);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileAdvancedFeaturesCell.class, "control", "getControl()Lcom/ss/android/ugc/profile/business/ur/editprofile/powerlist/IProfileCreatorCellControl;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1214300hhk
    public final void LJIIJ() {
        this.LLILZ = false;
        this.itemView.setBackgroundColor(0);
        C1214280hhi item = getItem();
        int i = item != null ? item.LL : 0;
        int adapterPosition = getAdapterPosition();
        String str = i == EnumC1242710iRZ.SHOP.getId() ? "shop" : i == EnumC1242710iRZ.SHOWCASE.getId() ? "showcase" : i == EnumC1242710iRZ.LiveEvent.getId() ? "live" : i == EnumC1242710iRZ.SUBSCRIBE.getId() ? "subscription" : i == EnumC1242710iRZ.Supporting.getId() ? "supporting" : i == EnumC1242710iRZ.Shoutouts.getId() ? "shoutouts" : i == EnumC1242710iRZ.Tipping.getId() ? "tipping" : i == EnumC1242710iRZ.COLLECTIONS.getId() ? "collections" : "";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1253930ijf.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("target", str);
        c2344009Gk.LIZJ(adapterPosition, "change_to");
        C20684815ws.LJIILLIIL("change_creator_tools_order", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
    }

    @Override // X.InterfaceC1214300hhk
    public final void LJIIZILJ() {
        Integer num = (Integer) this.LLILLL.getValue();
        if (num != null) {
            this.itemView.setBackgroundColor(num.intValue());
        }
    }

    @Override // X.InterfaceC1214300hhk
    public final boolean n2() {
        return this.LLILZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r6) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.editprofile.powerlist.ProfileAdvancedFeaturesCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LLILLJJLI = viewGroup.getContext();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ec4, viewGroup, false);
        C127K c127k = (C127K) viewTd.findViewById(R.id.f666aj7);
        this.LL = c127k;
        C127K c127k2 = null;
        if (c127k == null) {
            c127k = null;
        }
        Context context = this.LLILLJJLI;
        if (context == null) {
            context = null;
        }
        C11G4 c11g4 = new C11G4(context, null);
        Context context2 = this.LLILLJJLI;
        if (context2 == null) {
            context2 = null;
        }
        TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_3_lines_horizontal);
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        tuxIconView.setTintColorRes(R.attr.a1p);
        tuxIconView.setOnTouchListener(new ATListenerS452S0100000_19(this.LLILZLL, 3));
        c11g4.LJIILIIL(tuxIconView);
        c11g4.LJIILLIIL(false);
        c127k.setAccessory(c11g4);
        if (C1EDI.LJ()) {
            C127K c127k3 = this.LL;
            if (c127k3 != null) {
                c127k2 = c127k3;
            }
            C1215970hkR.LJFF(c127k2, 42, R.attr.a1h);
            return viewTd;
        }
        C127K c127k4 = this.LL;
        if (c127k4 != null) {
            c127k2 = c127k4;
        }
        C1215970hkR.LJFF(c127k2, 102, R.attr.a1h);
        return viewTd;
    }
}
