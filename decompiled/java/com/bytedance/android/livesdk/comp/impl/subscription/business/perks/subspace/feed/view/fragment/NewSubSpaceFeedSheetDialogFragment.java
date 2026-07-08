package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment;

import X.C019F;
import X.C01D1;
import X.C1143404dc;
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
import X.C503760JpG;
import X.C504510JqT;
import X.C505750JsT;
import X.C505770JsV;
import X.C505780JsW;
import X.C505790JsX;
import X.C505830Jsb;
import X.C505850Jsd;
import X.C505870Jsf;
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.secure.SubSpaceSecureManager;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class NewSubSpaceFeedSheetDialogFragment extends LiveSheetFragment {
    public static final C505870Jsf LLLFF;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2s8LD04HELIOSO2s/PC0gOCQvLGE1LSAoZzk6LTJiLz0yLygpJzt9BiA7GjoxGzUtKioVLSAoGic2LTEIIC4/JyIKOy40JSAiPQ==";
    public FragmentManager LLJLLL;
    public final AssemVMLazy LLJZ;
    public boolean LLJZIJLIL;
    public C504510JqT LLL;
    public String LLLF;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Jsf] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NewSubSpaceFeedSheetDialogFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFF = new Object() { // from class: X.0Jsf
        };
    }

    public NewSubSpaceFeedSheetDialogFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        C505750JsT c505750JsT = new C505750JsT(c19719912DlLIZ);
        C505830Jsb c505830Jsb = new C505830Jsb();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c505750JsT, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C505770JsV(this), c505830Jsb, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c505750JsT, new C505780JsW(this), c505830Jsb, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c505750JsT, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C505790JsX(this), c505830Jsb, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJZ = assemVMLazy;
        this.LLLF = "";
    }

    public final C504510JqT uS() {
        if (this.LLL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C504510JqT.class, null);
            this.LLL = interfaceC1555100qZQLIZIZ != null ? (C504510JqT) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLL;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = false;
        sheetOptions.dimBehindType = 2;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.LLJZIJLIL = true;
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C504510JqT(), C504510JqT.class, "source_default_key");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
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
        C504510JqT c504510JqTUS = uS();
        if (c504510JqTUS != null) {
            InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
            if (currentUser instanceof User) {
                user2 = (User) currentUser;
            } else {
                user2 = null;
            }
            c504510JqTUS.LLILLJJLI = user2;
        }
        C504510JqT c504510JqTUS2 = uS();
        if (c504510JqTUS2 != null) {
            c504510JqTUS2.LLILZ = string;
        }
        C504510JqT c504510JqTUS3 = uS();
        if (c504510JqTUS3 != null) {
            C504510JqT c504510JqTUS4 = uS();
            if (c504510JqTUS4 != null) {
                str = c504510JqTUS4.LLILZ;
            } else {
                str = null;
            }
            C504510JqT c504510JqTUS5 = uS();
            if (c504510JqTUS5 != null && (user = c504510JqTUS5.LLILLJJLI) != null) {
                secUid = user.getSecUid();
            } else {
                secUid = null;
            }
            c504510JqTUS3.LLJ = Intrinsics.LJFF(str, secUid);
        }
        boolean z = true;
        if (this.LLLF.length() == 0) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string5 = arguments2.getString("enter_from")) == null) {
                string5 = "";
            }
            this.LLLF = string5;
        }
        C504510JqT c504510JqTUS6 = uS();
        if (c504510JqTUS6 != null) {
            c504510JqTUS6.LLJIJIL = this.LLLF;
        }
        C504510JqT c504510JqTUS7 = uS();
        if (c504510JqTUS7 != null) {
            c504510JqTUS7.LLJJIII = true;
        }
        C504510JqT c504510JqTUS8 = uS();
        if (c504510JqTUS8 != null) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            if (C500260Jjc.LJJLI() == null) {
                z = false;
            }
            c504510JqTUS8.LLILZIL = z;
        }
        C504510JqT c504510JqTUS9 = uS();
        if (c504510JqTUS9 != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null && (boolLIZ3 = C512300K7g.LIZ(arguments3, "use_mock_data", null)) != null) {
                zBooleanValue3 = boolLIZ3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            c504510JqTUS9.LLJJ = zBooleanValue3;
        }
        C504510JqT c504510JqTUS10 = uS();
        if (c504510JqTUS10 != null) {
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string4 = arguments4.getString("package_id")) == null) {
                string4 = "";
            }
            c504510JqTUS10.LLJJJJJIL = string4;
        }
        C504510JqT c504510JqTUS11 = uS();
        if (c504510JqTUS11 != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null && (boolLIZ2 = C512300K7g.LIZ(arguments5, "ban_package_show", null)) != null) {
                zBooleanValue2 = boolLIZ2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            c504510JqTUS11.LLJJJJLIIL = zBooleanValue2;
        }
        C504510JqT c504510JqTUS12 = uS();
        if (c504510JqTUS12 != null) {
            Bundle arguments6 = getArguments();
            if (arguments6 != null && (boolLIZ = C512300K7g.LIZ(arguments6, "preview_mode", null)) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c504510JqTUS12.LLJILLL = zBooleanValue;
        }
        C504510JqT c504510JqTUS13 = uS();
        if (c504510JqTUS13 != null) {
            Bundle arguments7 = getArguments();
            if (arguments7 == null || (string3 = arguments7.getString("preview_title")) == null) {
                string3 = "";
            }
            c504510JqTUS13.LLJJL = string3;
        }
        C504510JqT c504510JqTUS14 = uS();
        if (c504510JqTUS14 != null) {
            Bundle arguments8 = getArguments();
            if (arguments8 != null && (string2 = arguments8.getString("back_url")) != null) {
                str2 = string2;
            }
            c504510JqTUS14.LLJLIL = str2;
        }
        C504510JqT c504510JqTUS15 = uS();
        if (c504510JqTUS15 != null) {
            c504510JqTUS15.LLJL = new C505850Jsd(this);
        }
        C504510JqT c504510JqTUS16 = uS();
        if (c504510JqTUS16 != null) {
            c504510JqTUS16.LLJLILLLLZIIL = this.LLJZIJLIL;
        }
        AssemVMLazy assemVMLazy = this.LLJZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        SubSpaceFeedVM subSpaceFeedVM = (SubSpaceFeedVM) assemVMLazy.getValue();
        FragmentManager supportFragmentManager = this.LLJLLL;
        if (supportFragmentManager == null) {
            C19EG activity = getActivity();
            if (activity != null) {
                supportFragmentManager = activity.getSupportFragmentManager();
            } else {
                supportFragmentManager = null;
            }
        }
        subSpaceFeedVM.LLILZ = supportFragmentManager;
        SubSpaceFeedVM subSpaceFeedVM2 = (SubSpaceFeedVM) this.LLJZ.getValue();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        Context context = getContext();
        subSpaceFeedVM2.LL = interfaceC665370Q7zLJFF;
        subSpaceFeedVM2.LLILLJJLI = context;
        subSpaceFeedVM2.LLILZIL = new C503760JpG(subSpaceFeedVM2, subSpaceFeedVM2.vQ2());
        if (!((SubSpaceFeedVM) this.LLJZ.getValue()).zQ2()) {
            SubSpaceSecureManager.LIZ(this);
        }
        C723850SaN.LIZ(this, false, null, new C1143404dc(this), 3);
        View viewFindViewById = view.findViewById(R.id.bn2);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JsR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3;
                    String str4;
                    C504510JqT c504510JqTUS17 = this.LL.uS();
                    if (c504510JqTUS17 != null && (str3 = c504510JqTUS17.LLJLIL) != null && C500260Jjc.LJJIIZ(str3)) {
                        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                        Context context2 = view.getContext();
                        C504510JqT c504510JqTUS18 = this.LL.uS();
                        if (c504510JqTUS18 == null || (str4 = c504510JqTUS18.LLJLIL) == null) {
                            str4 = "";
                        }
                        iActionHandlerService.handle(context2, str4);
                    }
                    this.LL.close(1);
                }
            }, viewFindViewById);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (this.LLJZIJLIL && textView != null) {
            textView.setText(C497740JfY.LJIJI(2131856665));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.glo, viewGroup, false);
    }
}
