package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem;

import X.C019F;
import X.C01GW;
import X.C0K3S;
import X.C0K4P;
import X.C1322110kVd;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C511420K3w;
import X.C511520K4g;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import org.json.JSONException;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class FakeSubSpaceEditorAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final AssemVMLazy LLJJI;
    public C0K3S LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FakeSubSpaceEditorAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FakeSubSpaceEditorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 472), AFwS237S0000000_7.get$arr$(215), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 466));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 467));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 465));
        this.LLJJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 471));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 469));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 470));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 468));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fh_;
    }

    public final C0K3S hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0K3S.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0K3S) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubSpaceDetailVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (SubSpaceDetailVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        User user;
        List urls;
        ImageModel avatarThumb;
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, (View) this.LLJJJJJIL.getValue());
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jtp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506360JtS) obj).LLILZIL;
            }
        }, null, new AwS621S0100000_7(this, 54), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jtq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506360JtS) obj).LLJILJIL;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 55), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JuV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506360JtS) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 50), 4);
        C786410Ut5.I7(new AbS689S0100000_7(this, 12), (View) this.LLJJIJIIJIL.getValue());
        C786410Ut5.I7(new AbS689S0100000_7(this, 13), (View) this.LLJJJIL.getValue());
        C786410Ut5.I7(new AbS689S0100000_7(this, 14), (View) this.LLJJJJ.getValue());
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JuU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506360JtS) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 53), 4);
        C0K3S c0k3sHp = hp();
        if (c0k3sHp != null && (user = c0k3sHp.LLJ) != null) {
            int iLIZ = (int) C511520K4g.LIZ(40.0f);
            ImageModel avatarMedium = user.getAvatarMedium();
            List urls2 = null;
            if (avatarMedium != null) {
                urls2 = avatarMedium.getUrls();
            }
            if (urls2 != null && !urls2.isEmpty()) {
                avatarThumb = user.getAvatarMedium();
            } else {
                ImageModel avatarThumb2 = user.getAvatarThumb();
                if (avatarThumb2 != null && (urls = avatarThumb2.getUrls()) != null && !urls.isEmpty()) {
                    avatarThumb = user.getAvatarThumb();
                }
                ((C1322110kVd) this.LLJJIJIL.getValue()).setActualImageResource(R.drawable.db_);
            }
            if (avatarThumb != null) {
                C511420K3w.LJIIJ.getClass();
                C511420K3w c511420K3w = new C511420K3w();
                c511420K3w.LIZIZ = avatarThumb.getUrls();
                c511420K3w.LIZJ = Integer.valueOf(iLIZ);
                c511420K3w.LIZLLL = Integer.valueOf(iLIZ);
                c511420K3w.LJIIIZ = new C0K4P() { // from class: X.0K48
                    @Override // X.C0K4P
                    public final void LIZ() {
                    }

                    @Override // X.C0K4P
                    public final void LIZJ() {
                    }

                    @Override // X.C0K4P
                    public final void LJIJJLI() {
                    }

                    @Override // X.C0K4P
                    public final void LIZIZ(Exception exc) throws JSONException {
                        C0K6D.LIZJ(exc, "SubSpaceAvatarLoad", C2097608Jq.LJ());
                        ((C1322110kVd) this.LIZ.LLJJIJIL.getValue()).setActualImageResource(R.drawable.db_);
                    }
                };
                c511420K3w.LIZ(this.LLJJIJIL.getValue());
            } else {
                ((C1322110kVd) this.LLJJIJIL.getValue()).setActualImageResource(R.drawable.db_);
            }
        }
        C786410Ut5.I7(new AbS689S0100000_7(this, 15), (View) this.LLJJJ.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void kp(com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem r32, com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem.kp(com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem, com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem, int, int):void");
    }
}
