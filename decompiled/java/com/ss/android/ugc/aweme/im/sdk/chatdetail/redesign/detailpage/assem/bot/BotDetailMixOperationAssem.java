package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.bot;

import X.AnonymousClass0629;
import X.C019F;
import X.C01GW;
import X.C06WA;
import X.C11G4;
import X.C127A;
import X.C127K;
import X.C12923053x;
import X.C1383370m6R;
import X.C13LE;
import X.C1584506Ih;
import X.C1637806bA;
import X.C1694106kF;
import X.C1694206kG;
import X.C1694306kH;
import X.C1694406kI;
import X.C1694506kJ;
import X.C1695306kR;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C419910GdJ;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1216650hlX;
import X.EnumC1216700hlc;
import X.EnumC1695106kP;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS137S0100000_2;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailMixOperationAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BotDetailMixOperationAssem extends ChatDetailMixOperationAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final AssemVMLazy LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BotDetailMixOperationAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/redesign/detailpage/viewmodel/BotDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BotDetailMixOperationAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BotDetailViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 563), AFwS229S0000000_2.get$arr$(319), null, true);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 560));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 562));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 564));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 561));
    }

    public final BotDetailViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (BotDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailMixOperationAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06kS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1694606kK) obj).LLIZLLLIL;
            }
        }, null, AFwS285S0000000_2.get$arr$(20), 6);
    }

    public final void ip(C127K c127k, EnumC1695106kP enumC1695106kP) {
        boolean zLJJIIZI;
        Integer numValueOf;
        if (enumC1695106kP != null) {
            hp();
            C06WA type = enumC1695106kP.getType();
            if (!Intrinsics.LJFF(type, C1694206kG.LIZ) && !Intrinsics.LJFF(type, C1694106kF.LIZ) && !Intrinsics.LJFF(type, C1694506kJ.LIZ) && !Intrinsics.LJFF(type, C1694406kI.LIZ)) {
                if (Intrinsics.LJFF(type, C1694306kH.LIZ)) {
                    IMAIServiceAPI.LIZ.getClass();
                    zLJJIIZI = AnonymousClass0629.LIZ().LIZ().LJJIIZI();
                } else {
                    zLJJIIZI = false;
                }
            } else {
                zLJJIIZI = true;
            }
            C1695306kR c1695306kR = new C1695306kR(zLJJIIZI, enumC1695106kP, new AwS368S0200000_2(this, enumC1695106kP, 174));
            this.LLJJI.put(enumC1695106kP.getType(), c127k);
            if (!zLJJIIZI) {
                C337180DJs.LIZ(c127k);
                return;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = enumC1695106kP.getIconRes();
            if (enumC1695106kP.getIconTintColor() != 0) {
                numValueOf = Integer.valueOf(enumC1695106kP.getIconTintColor());
            } else if (enumC1695106kP.getNegative()) {
                numValueOf = Integer.valueOf(R.attr.zs);
            } else {
                numValueOf = Integer.valueOf(R.attr.a1h);
            }
            c419910GdJ.LJ = numValueOf;
            c127k.setIcon(c419910GdJ);
            String strLJIIJJI = C1383370m6R.LJIIJJI(enumC1695106kP.getTitle());
            if (strLJIIJJI.length() > 0) {
                c127k.setTitle(strLJIIJJI);
            }
            String strLJIIJJI2 = C1383370m6R.LJIIJJI(enumC1695106kP.getSubTitle());
            if (strLJIIJJI2.length() > 0) {
                c127k.setSubtitle(strLJIIJJI2);
            }
            c127k.setInset(EnumC1216650hlX.PADDING_16);
            if (enumC1695106kP.getUseSwitchStyle()) {
                C127A c127a = new C127A(c127k.getContext());
                c127a.LJIILL(new AwS403S0200000_2(c1695306kR, c127a, 1));
                c127k.setAccessory(c127a);
            } else {
                C11G4 c11g4 = new C11G4(c127k.getContext(), null);
                c11g4.LJIILLIIL(enumC1695106kP.getShowArrow());
                c11g4.LJIILL(new ACListenerS137S0100000_2(c1695306kR, 6));
                c11g4.LJIILJJIL(C1383370m6R.LJIIJJI(enumC1695106kP.getEndLabel()));
                c127k.setAccessory(c11g4);
                if (enumC1695106kP.getShowArrow()) {
                    ((TuxIconView) c127k.findViewById(R.id.z1d).findViewById(R.id.k1_)).setTintColorRes(R.attr.a1p);
                }
                ((TuxTextView) c127k.findViewById(R.id.m4r)).setTuxFont(101);
            }
            C337180DJs.LIZJ(c127k);
            if (enumC1695106kP.getNegative()) {
                c127k.setVariant(EnumC1216700hlc.DESTRUCTIVE);
            }
            int i = C12923053x.LIZ[enumC1695106kP.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06kN
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C1694606kK) obj).LLILZIL);
                    }
                }, null, new AwS616S0100000_2(c127k, 160), 6);
                C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06kO
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C1694606kK) obj).LLILZLL);
                    }
                }, null, new AwS616S0100000_2(c127k, 161), 6);
                return;
            }
            C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06kL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1694606kK) obj).LLILLL);
                }
            }, null, new AwS616S0100000_2(c127k, 158), 6);
            C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06kM
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1694606kK) obj).LLILZ);
                }
            }, null, new AwS616S0100000_2(c127k, 159), 6);
            return;
        }
        C1584506Ih.LIZ(c127k);
    }
}
