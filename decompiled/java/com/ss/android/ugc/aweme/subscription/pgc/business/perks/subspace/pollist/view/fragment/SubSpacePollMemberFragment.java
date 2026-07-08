package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.pollist.view.fragment;

import X.C019F;
import X.C01D1;
import X.C0K34;
import X.C0K3U;
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
import X.C511280K3i;
import X.C511410K3v;
import X.C511520K4g;
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
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.pollist.vm.SubSpacePollMemberVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.secure.SubSpaceSecureManager;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpacePollMemberFragment extends SubscriptionBaseSheet {
    public static final C511280K3i LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiOSohIzZiHELIOSOjoxOzUtKip9OCogJSYgPGs6ICokZiM+KCg+LSs4ZxwmKhY8KCw2GCogJQI2JScpOwkhKSIhLCEn";
    public final int LLJJJJLIIL = R.layout.ffn;
    public final float LLJJL = 0.5f;
    public final float LLJJLIIIJLLLLLLLZ = 0.6f;
    public boolean LLJL;
    public final AssemVMLazy LLJLIL;
    public C0K3U LLJLILLLLZIIL;
    public C0K34 LLJLL;
    public TextView LLJLLIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0K3i] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpacePollMemberFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/pollist/vm/SubSpacePollMemberVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLLL = new Object() { // from class: X.0K3i
        };
    }

    public SubSpacePollMemberFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpacePollMemberVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 513);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(231);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 514), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 515), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 516), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLIL = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final Float WR() {
        return Float.valueOf(this.LLJJLIIIJLLLLLLLZ);
    }

    public final C0K3U gS() {
        if (this.LLJLILLLLZIIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0K3U.class, null);
            this.LLJLILLLLZIIL = interfaceC1555100qZQLIZIZ != null ? (C0K3U) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final int VR() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final float aS() {
        return this.LLJJL;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0K3U(), C0K3U.class, "source_default_key");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object objLIZIZ;
        SpacePollOption spacePollOption;
        SpacePollOption spacePollOption2;
        SpacePost spacePost;
        super.onViewCreated(view, bundle);
        AssemVMLazy assemVMLazy = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        ((SubSpacePollMemberVM) assemVMLazy.getValue()).LL = C1558360qeg.LJFF(this, null);
        C0K3U c0k3uGS = gS();
        if (c0k3uGS != null) {
            C0K34 c0k34 = this.LLJLL;
            if (c0k34 != null) {
                spacePost = c0k34.LIZ;
            } else {
                spacePost = null;
            }
            c0k3uGS.LL = spacePost;
        }
        C0K3U c0k3uGS2 = gS();
        if (c0k3uGS2 != null) {
            C0K34 c0k342 = this.LLJLL;
            if (c0k342 != null) {
                spacePollOption2 = c0k342.LIZIZ;
            } else {
                spacePollOption2 = null;
            }
            c0k3uGS2.LLILLJJLI = spacePollOption2;
        }
        if (!this.LLJL) {
            SubSpaceSecureManager.LIZ(this);
        }
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 1), 3);
        this.LLJLLIL = (TextView) view.findViewById(R.id.title);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C511520K4g.LJII(2131839564));
        sbLIZ.append(" (");
        C0K34 c0k343 = this.LLJLL;
        if (c0k343 == null || (spacePollOption = c0k343.LIZIZ) == null || (objLIZIZ = C511410K3v.LIZIZ(spacePollOption.votes)) == null) {
            objLIZIZ = 0L;
        }
        sbLIZ.append(objLIZIZ);
        sbLIZ.append(')');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        TextView textView = this.LLJLLIL;
        if (textView != null) {
            textView.setText(strLIZIZ);
        }
    }
}
