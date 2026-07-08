package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment;

import X.C019F;
import X.C01D1;
import X.C1143604de;
import X.C1161920gLG;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C503760JpG;
import X.C504510JqT;
import X.C505760JsU;
import X.C505800JsY;
import X.C505810JsZ;
import X.C505820Jsa;
import X.C505840Jsc;
import X.C505860Jse;
import X.C505880Jsg;
import X.C512300K7g;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2262081DgM;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.secure.SubSpaceSecureManager;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceFeedDialogFragment extends LiveDialogFragment {
    public static final C505880Jsg LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2HELIOSs8LD04O2s/PC0gOCQvLGE1LSAoZzk6LTJiLz0yLygpJzt9GzAuGj8yKyAKLCo3DCwtJSA0DjctLiI2JjE=";
    public FragmentManager LL;
    public final AssemVMLazy LLILLJJLI;
    public boolean LLILLL;
    public C504510JqT LLILZ;
    public String LLILZIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Jsg] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceFeedDialogFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new Object() { // from class: X.0Jsg
        };
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public SubSpaceFeedDialogFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        C505760JsU c505760JsU = new C505760JsU(c19719912DlLIZ);
        C505840Jsc c505840Jsc = new C505840Jsc();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c505760JsU, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C505800JsY(this), c505840Jsc, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c505760JsU, new C505810JsZ(this), c505840Jsc, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c505760JsU, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C505820Jsa(this), c505840Jsc, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLJJLI = assemVMLazy;
        this.LLILZIL = "";
    }

    public final C504510JqT MR() {
        if (this.LLILZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C504510JqT.class, null);
            this.LLILZ = interfaceC1555100qZQLIZIZ != null ? (C504510JqT) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILZ;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.glo);
        c500980Jkm.LIZJ = R.style.ahk;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        c500980Jkm.LJI = (C500260Jjc.LJJLI() == null || this.LLILLL) ? 0.6f : 0.0f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 73;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Boolean boolLIZ;
        Bundle arguments = getArguments();
        boolean z = false;
        if ((arguments != null && (boolLIZ = C512300K7g.LIZ(arguments, "is_super_fans", null)) != null && boolLIZ.booleanValue()) || ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.dataChannel)) {
            z = true;
        }
        this.LLILLL = z;
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C504510JqT(), C504510JqT.class, "source_default_key");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
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
        User user2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (string = arguments.getString("sec_anchor_id")) == null) {
            string = "";
        }
        C504510JqT c504510JqTMR = MR();
        if (c504510JqTMR != null) {
            InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
            if (currentUser instanceof User) {
                user2 = (User) currentUser;
            } else {
                user2 = null;
            }
            c504510JqTMR.LLILLJJLI = user2;
        }
        C504510JqT c504510JqTMR2 = MR();
        if (c504510JqTMR2 != null) {
            c504510JqTMR2.LLILZ = string;
        }
        C504510JqT c504510JqTMR3 = MR();
        if (c504510JqTMR3 != null) {
            C504510JqT c504510JqTMR4 = MR();
            if (c504510JqTMR4 != null) {
                str = c504510JqTMR4.LLILZ;
            } else {
                str = null;
            }
            C504510JqT c504510JqTMR5 = MR();
            if (c504510JqTMR5 != null && (user = c504510JqTMR5.LLILLJJLI) != null) {
                secUid = user.getSecUid();
            } else {
                secUid = null;
            }
            c504510JqTMR3.LLJ = Intrinsics.LJFF(str, secUid);
        }
        boolean z = true;
        if (this.LLILZIL.length() == 0) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string5 = arguments2.getString("enter_from")) == null) {
                string5 = "";
            }
            this.LLILZIL = string5;
        }
        C504510JqT c504510JqTMR6 = MR();
        if (c504510JqTMR6 != null) {
            c504510JqTMR6.LLJIJIL = this.LLILZIL;
        }
        C504510JqT c504510JqTMR7 = MR();
        if (c504510JqTMR7 != null) {
            c504510JqTMR7.LLJJIII = true;
        }
        C504510JqT c504510JqTMR8 = MR();
        if (c504510JqTMR8 != null) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            if (C500260Jjc.LJJLI() == null) {
                z = false;
            }
            c504510JqTMR8.LLILZIL = z;
        }
        C504510JqT c504510JqTMR9 = MR();
        if (c504510JqTMR9 != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null && (boolLIZ3 = C512300K7g.LIZ(arguments3, "use_mock_data", null)) != null) {
                zBooleanValue3 = boolLIZ3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            c504510JqTMR9.LLJJ = zBooleanValue3;
        }
        C504510JqT c504510JqTMR10 = MR();
        if (c504510JqTMR10 != null) {
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string4 = arguments4.getString("package_id")) == null) {
                string4 = "";
            }
            c504510JqTMR10.LLJJJJJIL = string4;
        }
        C504510JqT c504510JqTMR11 = MR();
        if (c504510JqTMR11 != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null && (boolLIZ2 = C512300K7g.LIZ(arguments5, "ban_package_show", null)) != null) {
                zBooleanValue2 = boolLIZ2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            c504510JqTMR11.LLJJJJLIIL = zBooleanValue2;
        }
        C504510JqT c504510JqTMR12 = MR();
        if (c504510JqTMR12 != null) {
            Bundle arguments6 = getArguments();
            if (arguments6 != null && (boolLIZ = C512300K7g.LIZ(arguments6, "preview_mode", null)) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c504510JqTMR12.LLJILLL = zBooleanValue;
        }
        C504510JqT c504510JqTMR13 = MR();
        if (c504510JqTMR13 != null) {
            Bundle arguments7 = getArguments();
            if (arguments7 == null || (string3 = arguments7.getString("preview_title")) == null) {
                string3 = "";
            }
            c504510JqTMR13.LLJJL = string3;
        }
        C504510JqT c504510JqTMR14 = MR();
        if (c504510JqTMR14 != null) {
            Bundle arguments8 = getArguments();
            if (arguments8 != null && (string2 = arguments8.getString("back_url")) != null) {
                str2 = string2;
            }
            c504510JqTMR14.LLJLIL = str2;
        }
        C504510JqT c504510JqTMR15 = MR();
        if (c504510JqTMR15 != null) {
            c504510JqTMR15.LLJL = new C505860Jse(this);
        }
        C504510JqT c504510JqTMR16 = MR();
        if (c504510JqTMR16 != null) {
            c504510JqTMR16.LLJLILLLLZIIL = this.LLILLL;
        }
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        SubSpaceFeedVM subSpaceFeedVM = (SubSpaceFeedVM) assemVMLazy.getValue();
        FragmentManager supportFragmentManager = this.LL;
        if (supportFragmentManager == null) {
            C19EG activity = getActivity();
            if (activity != null) {
                supportFragmentManager = activity.getSupportFragmentManager();
            } else {
                supportFragmentManager = null;
            }
        }
        subSpaceFeedVM.LLILZ = supportFragmentManager;
        SubSpaceFeedVM subSpaceFeedVM2 = (SubSpaceFeedVM) this.LLILLJJLI.getValue();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        Context context = getContext();
        subSpaceFeedVM2.LL = interfaceC665370Q7zLJFF;
        subSpaceFeedVM2.LLILLJJLI = context;
        subSpaceFeedVM2.LLILZIL = new C503760JpG(subSpaceFeedVM2, subSpaceFeedVM2.vQ2());
        if (!((SubSpaceFeedVM) this.LLILLJJLI.getValue()).zQ2()) {
            SubSpaceSecureManager.LIZ(this);
        }
        C723850SaN.LIZ(this, false, null, new C1143604de(this), 3);
        View viewFindViewById = view.findViewById(R.id.bn2);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JsS
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3;
                    String str4;
                    C504510JqT c504510JqTMR17 = this.LL.MR();
                    if (c504510JqTMR17 != null && (str3 = c504510JqTMR17.LLJLIL) != null && C500260Jjc.LJJIIZ(str3)) {
                        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                        Context context2 = view.getContext();
                        C504510JqT c504510JqTMR18 = this.LL.MR();
                        if (c504510JqTMR18 == null || (str4 = c504510JqTMR18.LLJLIL) == null) {
                            str4 = "";
                        }
                        iActionHandlerService.handle(context2, str4);
                    }
                    this.LL.dismissAllowingStateLoss();
                }
            }, viewFindViewById);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (this.LLILLL && textView != null) {
            textView.setText(C497740JfY.LJIJI(2131856665));
        }
    }
}
