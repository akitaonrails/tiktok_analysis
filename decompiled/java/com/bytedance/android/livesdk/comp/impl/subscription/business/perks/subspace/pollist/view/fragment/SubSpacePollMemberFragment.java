package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.pollist.view.fragment;

import X.C019F;
import X.C01D1;
import X.C1158404g2;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C474270Iin;
import X.C497740JfY;
import X.C500980Jkm;
import X.C502920Jnu;
import X.C503020Jo4;
import X.C503030Jo5;
import X.C503040Jo6;
import X.C503050Jo7;
import X.C503060Jo8;
import X.C503070Jo9;
import X.C503080JoA;
import X.C723850SaN;
import X.C724750Sbp;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.pollist.vm.SubSpacePollMemberVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.secure.SubSpaceSecureManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpacePollMemberFragment extends LiveDialogFragment {
    public static final C503070Jo9 LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2s8HELIOSLD04O2s/PC0gOCQvLGEjJykgIDwnZjMlLDh9LjctLiI2JjFiGjoxGzUtKioDJykgBCo+KiA+Dz0yLygpJzs=";
    public boolean LL;
    public final AssemVMLazy LLILLJJLI;
    public C502920Jnu LLILLL;
    public C503080JoA LLILZ;
    public TextView LLILZIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Jo9] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpacePollMemberFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/pollist/vm/SubSpacePollMemberVM;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new Object() { // from class: X.0Jo9
        };
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public SubSpacePollMemberFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpacePollMemberVM.class);
        C503020Jo4 c503020Jo4 = new C503020Jo4(c19719912DlLIZ);
        C503060Jo8 c503060Jo8 = new C503060Jo8();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c503020Jo4, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C503030Jo5(this), c503060Jo8, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c503020Jo4, new C503040Jo6(this), c503060Jo8, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c503020Jo4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C503050Jo7(this), c503060Jo8, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    public final C502920Jnu MR() {
        if (this.LLILLL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C502920Jnu.class, null);
            this.LLILLL = interfaceC1555100qZQLIZIZ != null ? (C502920Jnu) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLL;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.glq);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJI = 0.5f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 60;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C502920Jnu(), C502920Jnu.class, "source_default_key");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object objLIZIZ;
        SpacePollOption spacePollOption;
        SpacePollOption spacePollOption2;
        SpacePost spacePost;
        super.onViewCreated(view, bundle);
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        ((SubSpacePollMemberVM) assemVMLazy.getValue()).LL = C1558360qeg.LJFF(this, null);
        C502920Jnu c502920JnuMR = MR();
        if (c502920JnuMR != null) {
            C503080JoA c503080JoA = this.LLILZ;
            if (c503080JoA != null) {
                spacePost = c503080JoA.LIZ;
            } else {
                spacePost = null;
            }
            c502920JnuMR.LL = spacePost;
        }
        C502920Jnu c502920JnuMR2 = MR();
        if (c502920JnuMR2 != null) {
            C503080JoA c503080JoA2 = this.LLILZ;
            if (c503080JoA2 != null) {
                spacePollOption2 = c503080JoA2.LIZIZ;
            } else {
                spacePollOption2 = null;
            }
            c502920JnuMR2.LLILLJJLI = spacePollOption2;
        }
        if (!this.LL) {
            SubSpaceSecureManager.LIZ(this);
        }
        C723850SaN.LIZ(this, false, null, new C1158404g2(this), 3);
        this.LLILZIL = (TextView) view.findViewById(R.id.title);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJIJI(2131844284));
        sbLIZ.append(" (");
        C503080JoA c503080JoA3 = this.LLILZ;
        if (c503080JoA3 == null || (spacePollOption = c503080JoA3.LIZIZ) == null || (objLIZIZ = C474270Iin.LIZIZ(spacePollOption.votes)) == null) {
            objLIZIZ = 0L;
        }
        sbLIZ.append(objLIZIZ);
        sbLIZ.append(')');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        TextView textView = this.LLILZIL;
        if (textView != null) {
            textView.setText(strLIZIZ);
        }
    }
}
