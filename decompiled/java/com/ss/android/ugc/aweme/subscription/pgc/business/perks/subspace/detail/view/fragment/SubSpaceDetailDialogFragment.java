package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment;

import X.C019F;
import X.C01D1;
import X.C0K3G;
import X.C0K3S;
import X.C0K4B;
import X.C0K4Q;
import X.C0K51;
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
import X.C512310K7h;
import X.C723850SaN;
import X.C724750Sbp;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.bridge.SubscriptionBridgeViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.secure.SubSpaceSecureManager;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceDetailDialogFragment extends SubscriptionBaseSheet {
    public static final C0K4Q LLJLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiOSohIzZiOjHELIOSoxOzUtKip9LCA4KCY/ZjMlLDh9LjctLiI2JjFiGjoxGzUtKioXLTEtICMXISQgJigVOiQrJCo9PA==";
    public final int LLJJJJLIIL = R.layout.ffi;
    public final float LLJJL = 0.7f;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public C0K3S LLJL;
    public User LLJLIL;
    public SpacePost LLJLILLLLZIIL;
    public String LLJLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0K4Q] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceDetailDialogFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLLIL = new Object() { // from class: X.0K4Q
        };
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final float aS() {
        return 0.0f;
    }

    public SubSpaceDetailDialogFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 477);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(217);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 478), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 479), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 480), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJLIIIJLLLLLLLZ = assemVMLazy;
        this.LLJLL = "";
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final Float WR() {
        return Float.valueOf(this.LLJJL);
    }

    public final C0K3S gS() {
        if (this.LLJL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0K3S.class, null);
            this.LLJL = interfaceC1555100qZQLIZIZ != null ? (C0K3S) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final int VR() {
        return this.LLJJJJLIIL;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0K3S(), C0K3S.class, "source_default_key");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        long j;
        String string2;
        String string3;
        int i;
        boolean zBooleanValue;
        Boolean boolLIZ;
        String string4;
        com.ss.android.ugc.aweme.profile.model.User currentUser;
        String string5;
        View viewFindViewById;
        String str;
        boolean z;
        String str2;
        String str3;
        String secUid;
        User user;
        String secUid2;
        com.ss.android.ugc.aweme.profile.model.User currentUser2;
        super.onViewCreated(view, bundle);
        String str4 = "";
        long j2 = 0;
        if (this.LLJLILLLLZIIL != null && this.LLJLIL != null) {
            C0K3S c0k3sGS = gS();
            if (c0k3sGS != null) {
                IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
                if (iUserService != null) {
                    currentUser2 = iUserService.getCurrentUser();
                } else {
                    currentUser2 = null;
                }
                c0k3sGS.LLJ = C15WP.LJ(currentUser2);
            }
            C0K3S c0k3sGS2 = gS();
            if (c0k3sGS2 != null) {
                c0k3sGS2.LLJI = this.LLJLIL;
            }
            C0K3S c0k3sGS3 = gS();
            if (c0k3sGS3 != null) {
                User user2 = this.LLJLIL;
                if (user2 != null) {
                    secUid2 = user2.getSecUid();
                } else {
                    secUid2 = null;
                }
                c0k3sGS3.LLJIJIL = secUid2;
            }
            C0K3S c0k3sGS4 = gS();
            if (c0k3sGS4 != null) {
                SpacePost spacePost = this.LLJLILLLLZIIL;
                if (spacePost != null) {
                    j2 = spacePost.postId;
                }
                c0k3sGS4.LLILZ = j2;
            }
            C0K3S c0k3sGS5 = gS();
            if (c0k3sGS5 != null) {
                c0k3sGS5.LLILLL = this.LLJLILLLLZIIL;
            }
        } else {
            C0K3S c0k3sGS6 = gS();
            if (c0k3sGS6 != null) {
                Bundle arguments = getArguments();
                if (arguments == null || (string5 = arguments.getString("sec_anchor_id")) == null) {
                    string5 = "";
                }
                c0k3sGS6.LLJIJIL = string5;
            }
            C0K3S c0k3sGS7 = gS();
            if (c0k3sGS7 != null) {
                IUserService iUserService2 = (IUserService) ServiceManager.get().getService(IUserService.class);
                if (iUserService2 != null) {
                    currentUser = iUserService2.getCurrentUser();
                } else {
                    currentUser = null;
                }
                c0k3sGS7.LLJ = C15WP.LJ(currentUser);
            }
            if (this.LLJLL.length() == 0) {
                Bundle arguments2 = getArguments();
                if (arguments2 == null || (string4 = arguments2.getString("enter_from")) == null) {
                    string4 = "";
                }
                this.LLJLL = string4;
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                string = arguments3.getString("post_id");
            } else {
                string = null;
            }
            if (C0K51.LJ(string)) {
                try {
                    C0K3S c0k3sGS8 = gS();
                    if (c0k3sGS8 != null) {
                        if (string == null) {
                            j = 0;
                        } else {
                            j = CastLongProtector.parseLong(string);
                        }
                        c0k3sGS8.LLILZ = j;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                string2 = arguments4.getString("comment_id");
            } else {
                string2 = null;
            }
            if (C0K51.LJ(string)) {
                try {
                    C0K3S c0k3sGS9 = gS();
                    if (c0k3sGS9 != null) {
                        if (string2 != null) {
                            j2 = CastLongProtector.parseLong(string2);
                        }
                        c0k3sGS9.LLILZIL = j2;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                string3 = arguments5.getString("comment_type");
            } else {
                string3 = null;
            }
            if (C0K51.LJ(string)) {
                try {
                    C0K3S c0k3sGS10 = gS();
                    if (c0k3sGS10 != null) {
                        if (string3 == null) {
                            i = 0;
                        } else {
                            i = CastIntegerProtector.parseInt(string3);
                        }
                        c0k3sGS10.LLILZLL = i;
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
            C0K3S c0k3sGS11 = gS();
            if (c0k3sGS11 != null) {
                Bundle arguments6 = getArguments();
                if (arguments6 != null && (boolLIZ = C512310K7h.LIZ(arguments6, "hide_banner", Boolean.FALSE)) != null) {
                    zBooleanValue = boolLIZ.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                c0k3sGS11.LLJJIJIL = zBooleanValue;
            }
        }
        C0K3S c0k3sGS12 = gS();
        if (c0k3sGS12 != null) {
            C0K3S c0k3sGS13 = gS();
            if (c0k3sGS13 != null) {
                str3 = c0k3sGS13.LLJIJIL;
            } else {
                str3 = null;
            }
            C0K3S c0k3sGS14 = gS();
            if (c0k3sGS14 != null && (user = c0k3sGS14.LLJ) != null) {
                secUid = user.getSecUid();
            } else {
                secUid = null;
            }
            c0k3sGS12.LLJJIII = Intrinsics.LJFF(str3, secUid);
        }
        C0K3S c0k3sGS15 = gS();
        if (c0k3sGS15 != null) {
            c0k3sGS15.LLILLJJLI = this.LLJLL;
        }
        C0K3S c0k3sGS16 = gS();
        if (c0k3sGS16 != null) {
            c0k3sGS16.LLJILJIL = true;
        }
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        SubSpaceDetailVM subSpaceDetailVM = (SubSpaceDetailVM) assemVMLazy.getValue();
        subSpaceDetailVM.LL = C1558360qeg.LJFF(this, null);
        subSpaceDetailVM.LLILLL = new C0K3G(subSpaceDetailVM, subSpaceDetailVM.xQ2());
        C0K3S c0k3sGS17 = gS();
        if (c0k3sGS17 != null) {
            c0k3sGS17.LL = getContext();
        }
        C19EG activity = getActivity();
        if (activity != null && ((SubscriptionBridgeViewModel) new ViewModelProvider(activity).get(SubscriptionBridgeViewModel.class)).LLILLJJLI.getValue() == null) {
            C0K3S c0k3sGS18 = gS();
            if (c0k3sGS18 == null || (str = c0k3sGS18.LLJIJIL) == null) {
                str = "";
            }
            if (c0k3sGS18 != null && (str2 = c0k3sGS18.LLILLJJLI) != null) {
                str4 = str2;
            }
            if (c0k3sGS18 != null && c0k3sGS18.LLJILJIL) {
                z = true;
            } else {
                z = false;
            }
            C0K4B.LIZIZ(new SubscriptionSceneContext(0L, 0L, str, null, null, str4, null, null, z, false, null, false, null, 0L, 0L, null, null, false, null, null, 1048283));
        }
        if (!((SubSpaceDetailVM) this.LLJJLIIIJLLLLLLLZ.getValue()).BQ2()) {
            SubSpaceSecureManager.LIZ(this);
        }
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 351), 3);
        View view2 = getView();
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.wg0)) != null) {
            C723850SaN.LIZ(this, false, null, new AwS373S0200000_7(this, viewFindViewById, 43), 3);
        }
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 350), 3);
    }
}
