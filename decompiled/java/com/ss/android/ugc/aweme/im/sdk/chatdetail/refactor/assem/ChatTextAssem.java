package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem;

import X.C01GW;
import X.C03IJ;
import X.C11G3;
import X.C11G4;
import X.C127K;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C1697580uHE;
import X.C1848530yCh;
import X.C19719912Dl;
import X.C19MB;
import X.C1A23;
import X.C2172771A1r;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C891240Yxm;
import X.EnumC1216700hlc;
import X.InterfaceC2217461Bqa;
import X.InterfaceC893080Z1u;
import Y.ACListenerS167S0100000_33;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.TextActionViewModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ChatTextAssem extends ChatActionAssem<C1A23> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C11G4 LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatTextAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/refactor/viewmodel/TextActionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ChatTextAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TextActionViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 1028), AFwS279S0000000_33.get$arr$(177), null, true);
        this.LLJJIJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1026));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1027));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cfv;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    public final void op() {
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1A1t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C2172781A1s) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS647S0100000_33(this, 19), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1A1u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2172781A1s) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS647S0100000_33(this, 20), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1A1v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2172781A1s) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS647S0100000_33(this, 21), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1A1w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2172781A1s) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS647S0100000_33(this, 22), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1A1x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2172781A1s) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS647S0100000_33(this, 18), 4);
        hp().LLJI.invoke(kp(), (InterfaceC893080Z1u) this.LLJJIII.getValue());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    public final void mp() {
        ConstraintLayout constraintLayout;
        ViewGroup viewGroup;
        View viewInvoke;
        C11G4 c11g4;
        C11G3 c11g3;
        C127K c127kIp = ip();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = Integer.valueOf(tp().LIZJ).intValue();
        c419910GdJ.LJ = tp().LIZLLL != 0 ? Integer.valueOf(tp().LIZLLL) : tp().LJIIIIZZ ? Integer.valueOf(R.attr.zs) : Integer.valueOf(R.attr.a1h);
        c127kIp.setIcon(c419910GdJ);
        String strLJIIJJI = C1383370m6R.LJIIJJI(tp().LIZIZ().intValue());
        boolean z = true;
        if (strLJIIJJI.length() > 0) {
            ip().setTitle(strLJIIJJI);
        }
        if (this.LLJJJ == null) {
            C11G4 c11g42 = new C11G4(ip().getContext(), null);
            c11g42.LJIILLIIL(tp().LJI);
            c11g42.LJIILL(new ACListenerS167S0100000_33(this, 58));
            Function0<View> function0 = tp().LJFF;
            if (function0 == null || (viewInvoke = function0.invoke()) == null) {
                viewInvoke = (View) this.LLJJJIL.getValue();
            }
            c11g42.LJIILIIL(viewInvoke);
            this.LLJJJ = c11g42;
            C891240Yxm c891240Yxm = hp().LLIZ.LJIIJ;
            if (c891240Yxm != null && (c11g4 = this.LLJJJ) != null && (c11g3 = c11g4.LIZIZ) != null) {
                C1848530yCh.LIZ(c11g3, c891240Yxm.LIZ, new AwS593S0100000_14(c891240Yxm, 125));
            }
            ip().setAccessory(this.LLJJJ);
        }
        C11G4 c11g43 = this.LLJJJ;
        if (c11g43 != null) {
            c11g43.LJIILLIIL(tp().LJI);
            if (tp().LJII != null) {
                c11g43.LJIILJJIL(tp().LJII);
            }
            if (tp().LJI) {
                ((TuxIconView) ip().findViewById(R.id.z1d).findViewById(R.id.k1_)).setTintColorRes(R.attr.a1p);
            }
            ((TuxTextView) ip().findViewById(R.id.m4r)).setTuxFont(101);
        }
        if (tp().LJIIIIZZ) {
            ip().setVariant(EnumC1216700hlc.DESTRUCTIVE);
        }
        String str = tp().LJ;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            View viewFindViewById = ip().findViewById(R.id.z1g);
            if (viewFindViewById != null) {
                ViewParent parent = viewFindViewById.getParent();
                if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                    return;
                }
                C786410Ut5.LJJJLZIJ(viewFindViewById, viewGroup);
                return;
            }
            return;
        }
        Context context = getContext();
        if (context == null || (constraintLayout = (ConstraintLayout) ip().findViewById(R.id.dlh)) == null) {
            return;
        }
        TuxTag tuxTag = new TuxTag(context, null, 6);
        tuxTag.setId(R.id.z1g);
        tuxTag.setText(str);
        tuxTag.setTagBackgroundColor(C1383370m6R.LJFF(R.attr.a00));
        tuxTag.setTagTextColor(C1383370m6R.LJFF(R.attr.a0o));
        tuxTag.setTextSize(11.0f);
        tuxTag.setTypeface(C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 11.0f, 0.0f, null, 0.0f, 0, null, 249));
        C426750GoL.LJIIL(tuxTag, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 16);
        constraintLayout.addView(tuxTag);
        try {
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJFF(tuxTag.getId());
            c19mb.LJIILL(tuxTag.getId(), -2);
            c19mb.LJIIJJI(tuxTag.getId(), -2);
            c19mb.LJIIIZ(tuxTag.getId(), 6, R.id.y3j, 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            c19mb.LJIIIIZZ(tuxTag.getId(), 3, constraintLayout.getId(), 3);
            c19mb.LJIIIIZZ(tuxTag.getId(), 4, constraintLayout.getId(), 4);
            c19mb.LIZIZ(constraintLayout);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public final C127K ip() {
        return (C127K) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    /* JADX INFO: renamed from: up, reason: merged with bridge method [inline-methods] */
    public final TextActionViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (TextActionViewModel) assemVMLazy.getValue();
    }

    public final C2172771A1r tp() {
        return hp().LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        kp().setState(new AwS612S0100000_33(tp(), 149));
        super.onViewCreated(view);
    }
}
