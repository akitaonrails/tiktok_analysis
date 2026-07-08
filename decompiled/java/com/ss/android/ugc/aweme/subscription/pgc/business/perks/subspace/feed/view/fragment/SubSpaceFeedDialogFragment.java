package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.fragment;

import X.C019F;
import X.C01D1;
import X.C0K4B;
import X.C0K4S;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C15WP;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C511110K2r;
import X.C511370K3r;
import X.C512310K7h;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import Y.ACListenerS111S0200000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.secure.SubSpaceSecureManager;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceFeedDialogFragment extends SubscriptionBaseSheet {
    public static final C0K4S LLJLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiOSohIzHELIOSZiOjoxOzUtKip9LiApLWElISA7ZykhKSIhLCEnZhY5KxwjKSYpDyo2LAElKCM8LwM+KCg+LSs4";
    public final int LLJJJJLIIL = R.layout.ffk;
    public final float LLJJL = 0.7f;
    public final int LLJJLIIIJLLLLLLLZ = 375;
    public FragmentManager LLJL;
    public final AssemVMLazy LLJLIL;
    public C511370K3r LLJLILLLLZIIL;
    public String LLJLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0K4S] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceFeedDialogFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLLIL = new Object() { // from class: X.0K4S
        };
    }

    public SubSpaceFeedDialogFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 494);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(224);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 495), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 496), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 497), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLIL = assemVMLazy;
        this.LLJLL = "";
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final Float WR() {
        return Float.valueOf(this.LLJJL);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final Integer ZR() {
        return Integer.valueOf(this.LLJJLIIIJLLLLLLLZ);
    }

    public final C511370K3r gS() {
        if (this.LLJLILLLLZIIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C511370K3r.class, null);
            this.LLJLILLLLZIIL = interfaceC1555100qZQLIZIZ != null ? (C511370K3r) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final float aS() {
        SubscriptionSceneContext subscriptionSceneContextLIZ = C0K4B.LIZ();
        return (subscriptionSceneContextLIZ == null || !subscriptionSceneContextLIZ.isInLiveRoom) ? 0.6f : 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final int VR() {
        return this.LLJJJJLIIL;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C511370K3r(), C511370K3r.class, "source_default_key");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        boolean zBooleanValue;
        Boolean boolLIZ;
        boolean zBooleanValue2;
        Boolean boolLIZ2;
        String string4;
        boolean zBooleanValue3;
        Boolean boolLIZ3;
        String string5;
        String str;
        String secUid;
        User user;
        com.ss.android.ugc.aweme.profile.model.User currentUser;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (string = arguments.getString("sec_anchor_id")) == null) {
            string = "";
        }
        C511370K3r c511370K3rGS = gS();
        if (c511370K3rGS != null) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null) {
                currentUser = iUserService.getCurrentUser();
            } else {
                currentUser = null;
            }
            c511370K3rGS.LLILLJJLI = C15WP.LJ(currentUser);
        }
        C511370K3r c511370K3rGS2 = gS();
        if (c511370K3rGS2 != null) {
            c511370K3rGS2.LLILZ = string;
        }
        C511370K3r c511370K3rGS3 = gS();
        if (c511370K3rGS3 != null) {
            C511370K3r c511370K3rGS4 = gS();
            if (c511370K3rGS4 != null) {
                str = c511370K3rGS4.LLILZ;
            } else {
                str = null;
            }
            C511370K3r c511370K3rGS5 = gS();
            if (c511370K3rGS5 != null && (user = c511370K3rGS5.LLILLJJLI) != null) {
                secUid = user.getSecUid();
            } else {
                secUid = null;
            }
            c511370K3rGS3.LLJ = Intrinsics.LJFF(str, secUid);
        }
        boolean z = true;
        if (this.LLJLL.length() == 0) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string5 = arguments2.getString("enter_from")) == null) {
                string5 = "";
            }
            this.LLJLL = string5;
        }
        C511370K3r c511370K3rGS6 = gS();
        if (c511370K3rGS6 != null) {
            c511370K3rGS6.LLJIJIL = this.LLJLL;
        }
        C511370K3r c511370K3rGS7 = gS();
        if (c511370K3rGS7 != null) {
            c511370K3rGS7.LLJJIII = true;
        }
        C511370K3r c511370K3rGS8 = gS();
        if (c511370K3rGS8 != null) {
            SubscriptionSceneContext subscriptionSceneContextLIZ = C0K4B.LIZ();
            if (subscriptionSceneContextLIZ == null || !subscriptionSceneContextLIZ.isInLiveRoom) {
                z = false;
            }
            c511370K3rGS8.LLILZIL = z;
        }
        C511370K3r c511370K3rGS9 = gS();
        if (c511370K3rGS9 != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null && (boolLIZ3 = C512310K7h.LIZ(arguments3, "use_mock_data", null)) != null) {
                zBooleanValue3 = boolLIZ3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            c511370K3rGS9.LLJJ = zBooleanValue3;
        }
        C511370K3r c511370K3rGS10 = gS();
        if (c511370K3rGS10 != null) {
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string4 = arguments4.getString("package_id")) == null) {
                string4 = "";
            }
            c511370K3rGS10.LLJJJJ = string4;
        }
        C511370K3r c511370K3rGS11 = gS();
        if (c511370K3rGS11 != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null && (boolLIZ2 = C512310K7h.LIZ(arguments5, "ban_package_show", null)) != null) {
                zBooleanValue2 = boolLIZ2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            c511370K3rGS11.LLJJJJJIL = zBooleanValue2;
        }
        C511370K3r c511370K3rGS12 = gS();
        if (c511370K3rGS12 != null) {
            Bundle arguments6 = getArguments();
            if (arguments6 != null && (boolLIZ = C512310K7h.LIZ(arguments6, "preview_mode", null)) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c511370K3rGS12.LLJILLL = zBooleanValue;
        }
        C511370K3r c511370K3rGS13 = gS();
        if (c511370K3rGS13 != null) {
            Bundle arguments7 = getArguments();
            if (arguments7 == null || (string3 = arguments7.getString("preview_title")) == null) {
                string3 = "";
            }
            c511370K3rGS13.LLJJJJLIIL = string3;
        }
        C511370K3r c511370K3rGS14 = gS();
        if (c511370K3rGS14 != null) {
            Bundle arguments8 = getArguments();
            if (arguments8 != null && (string2 = arguments8.getString("back_url")) != null) {
                str2 = string2;
            }
            c511370K3rGS14.LLJL = str2;
        }
        C511370K3r c511370K3rGS15 = gS();
        if (c511370K3rGS15 != null) {
            c511370K3rGS15.LLJJLIIIJLLLLLLLZ = new AwS551S0100000_7(this, 733);
        }
        AssemVMLazy assemVMLazy = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        SubSpaceFeedVM subSpaceFeedVM = (SubSpaceFeedVM) assemVMLazy.getValue();
        FragmentManager supportFragmentManager = this.LLJL;
        if (supportFragmentManager == null) {
            C19EG activity = getActivity();
            if (activity != null) {
                supportFragmentManager = activity.getSupportFragmentManager();
            } else {
                supportFragmentManager = null;
            }
        }
        subSpaceFeedVM.LLILZ = supportFragmentManager;
        SubSpaceFeedVM subSpaceFeedVM2 = (SubSpaceFeedVM) this.LLJLIL.getValue();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        Context context = getContext();
        subSpaceFeedVM2.LL = interfaceC665370Q7zLJFF;
        subSpaceFeedVM2.LLILLJJLI = context;
        subSpaceFeedVM2.LLILZIL = new C511110K2r(subSpaceFeedVM2, subSpaceFeedVM2.wQ2());
        if (!((SubSpaceFeedVM) this.LLJLIL.getValue()).AQ2()) {
            SubSpaceSecureManager.LIZ(this);
        }
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 523), 3);
        View viewFindViewById = view.findViewById(R.id.bn2);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS111S0200000_7(this, view, 21), viewFindViewById);
        }
    }
}
