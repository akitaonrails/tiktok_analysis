package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment;

import X.C019F;
import X.C01D1;
import X.C0HE8;
import X.C0K0R;
import X.C0K57;
import X.C0K61;
import X.C0K79;
import X.C0K7H;
import X.C0K7K;
import X.C13LE;
import X.C13LP;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C420750Gef;
import X.C426930God;
import X.C437700HEi;
import X.C437710HEj;
import X.C437720HEk;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C511520K4g;
import X.C511970K5z;
import X.C512310K7h;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailItemAssemViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SheetOptions;
import com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SubscriptionSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbsPrivilegeItemDetailFragment extends SubscriptionSheetFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public boolean LLJJIJIIJIL;
    public PGCGetSubPrivilegeDetailResponse.Data LLJJIJIL;
    public boolean LLJJJ;
    public TextView LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public C0K79 LLJJJJJIL;
    public final AwS586S0100000_7 LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbsPrivilegeItemDetailFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/foundation/privilegepage/viewmodel/PrivilegeDetailItemAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract String aS(C0K7H c0k7h);

    public abstract String bS();

    public abstract void dS();

    public abstract String getTitle();

    public AbsPrivilegeItemDetailFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PrivilegeDetailItemAssemViewModel.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 452);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(208);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 453), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 454), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 455), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJJ = assemVMLazy;
        this.LLJJJJLIIL = new AwS586S0100000_7(this, 296);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SubscriptionSheetFragment
    public final C437700HEi WR() {
        C437700HEi c437700HEi = new C437700HEi();
        c437700HEi.LIZ = getTitle();
        C420750Gef c420750Gef = new C420750Gef(new AwS586S0100000_7(this, 295));
        c420750Gef.LIZJ = Integer.valueOf(C426930God.LIZ(R.attr.fa8, getContext()));
        c437700HEi.LIZIZ = Collections.singletonList(c420750Gef);
        c437700HEi.LIZJ = false;
        return c437700HEi;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SubscriptionSheetFragment
    public final SheetOptions ZR() {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.sheetStyle = 6;
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    public final C0K79 cS() {
        if (this.LLJJJJJIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0K79.class, null);
            this.LLJJJJJIL = interfaceC1555100qZQLIZIZ != null ? (C0K79) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SubscriptionSheetFragment
    public final C437720HEk UR() {
        C0K79 c0k79CS = cS();
        if (c0k79CS != null && c0k79CS.LLIZ) {
            return null;
        }
        C0K79 c0k79CS2 = cS();
        if (c0k79CS2 != null && c0k79CS2.LLJI) {
            return null;
        }
        C437720HEk c437720HEk = new C437720HEk();
        ArrayList arrayList = new ArrayList();
        String strLJII = C511520K4g.LJII(2131839650);
        if (strLJII == null) {
            strLJII = "";
        }
        arrayList.add(new C437710HEj(strLJII, new AwS551S0100000_7(this, 451)));
        ((ArrayList) c437720HEk.LIZ).clear();
        ((ArrayList) c437720HEk.LIZ).addAll(arrayList);
        return c437720HEk;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        ((PrivilegeDetailItemAssemViewModel) assemVMLazy.getValue()).LL = null;
    }

    public static final void gS(AbsPrivilegeItemDetailFragment absPrivilegeItemDetailFragment) {
        List<C437710HEj> list;
        C437710HEj c437710HEj;
        absPrivilegeItemDetailFragment.LLJJJ = true;
        C437720HEk c437720HEk = absPrivilegeItemDetailFragment.LLJJIII;
        if (c437720HEk != null && (list = c437720HEk.LIZ) != null && (c437710HEj = (C437710HEj) C13LP.LJJJLZIJ(0, list)) != null) {
            c437710HEj.LIZJ = 0.4f;
            TextView textView = c437710HEj.LIZLLL;
            if (textView != null) {
                C786410Ut5.S4(0.4f, textView);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SubscriptionSheetFragment
    public final int QM(Context context) {
        return C426930God.LIZ(R.attr.fa5, context);
    }

    public final void hS(CharSequence charSequence) {
        TextView textView;
        View view = getView();
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.cdm);
        } else {
            textView = null;
        }
        if (charSequence.length() == 0) {
            if (textView != null) {
                C0K0R.LIZ(textView);
            }
        } else if (textView != null) {
            C0K0R.LIZJ(textView);
            textView.setTextAlignment(4);
            textView.setText(charSequence);
        }
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0K79(), C0K79.class, "source_default_key");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C0HE8.LIZ(layoutInflaterOnGetLayoutInflater.getContext()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean zBooleanValue;
        Boolean boolLIZ;
        String string;
        boolean zBooleanValue2;
        Boolean boolLIZ2;
        boolean zBooleanValue3;
        Boolean boolLIZ3;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        C0K79 c0k79CS = cS();
        String str5 = "";
        if (c0k79CS != null) {
            Bundle arguments = getArguments();
            if (arguments == null || (string7 = arguments.getString("room_id")) == null) {
                string7 = "";
            }
            c0k79CS.LLILLJJLI = string7;
        }
        C0K79 c0k79CS2 = cS();
        if (c0k79CS2 != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string6 = arguments2.getString("sec_user_id")) == null) {
                string6 = "";
            }
            c0k79CS2.LL = string6;
        }
        C0K79 c0k79CS3 = cS();
        if (c0k79CS3 != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (string5 = arguments3.getString("package_id")) == null) {
                string5 = "";
            }
            c0k79CS3.LLILZ = string5;
        }
        C0K79 c0k79CS4 = cS();
        if (c0k79CS4 != null) {
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string4 = arguments4.getString("show_entrance")) == null) {
                string4 = "";
            }
            c0k79CS4.LLILLL = string4;
        }
        C0K79 c0k79CS5 = cS();
        if (c0k79CS5 != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 == null || (string3 = arguments5.getString("back_url")) == null) {
                string3 = "";
            }
            c0k79CS5.LLILZIL = string3;
        }
        C0K79 c0k79CS6 = cS();
        if (c0k79CS6 != null) {
            Bundle arguments6 = getArguments();
            if (arguments6 == null || (string2 = arguments6.getString("creator_id")) == null) {
                string2 = "";
            }
            c0k79CS6.LLILZLL = string2;
        }
        C0K79 c0k79CS7 = cS();
        if (c0k79CS7 != null) {
            Bundle arguments7 = getArguments();
            if (arguments7 != null && (boolLIZ3 = C512310K7h.LIZ(arguments7, "is_subscribing", null)) != null) {
                zBooleanValue3 = boolLIZ3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            c0k79CS7.LLIZ = zBooleanValue3;
        }
        C0K79 c0k79CS8 = cS();
        if (c0k79CS8 != null) {
            Bundle arguments8 = getArguments();
            if (arguments8 != null && (boolLIZ2 = C512310K7h.LIZ(arguments8, "preview_mode", null)) != null) {
                zBooleanValue2 = boolLIZ2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            c0k79CS8.LLIZLLLIL = zBooleanValue2;
        }
        C0K79 c0k79CS9 = cS();
        if (c0k79CS9 != null) {
            Bundle arguments9 = getArguments();
            if (arguments9 == null || (string = arguments9.getString("package_price")) == null) {
                string = "";
            }
            c0k79CS9.LLJ = string;
        }
        C0K79 c0k79CS10 = cS();
        if (c0k79CS10 != null) {
            Bundle arguments10 = getArguments();
            if (arguments10 != null && (boolLIZ = C512310K7h.LIZ(arguments10, "hide_bottom_button", null)) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c0k79CS10.LLJI = zBooleanValue;
        }
        super.onViewCreated(view, bundle);
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        ((PrivilegeDetailItemAssemViewModel) assemVMLazy.getValue()).LL = this.LLJJJJLIIL;
        PrivilegeDetailItemAssemViewModel privilegeDetailItemAssemViewModel = (PrivilegeDetailItemAssemViewModel) this.LLJJJJ.getValue();
        C0K79 c0k79CS11 = cS();
        if (c0k79CS11 == null || (str = c0k79CS11.LL) == null) {
            str = "";
        }
        C0K79 c0k79CS12 = cS();
        if (c0k79CS12 == null || (str2 = c0k79CS12.LLILLJJLI) == null) {
            str2 = "";
        }
        C0K79 c0k79CS13 = cS();
        if (c0k79CS13 == null || (str3 = c0k79CS13.LLILLL) == null) {
            str3 = "";
        }
        C0K7K.LIZ(str, this).LIZ(str2, str3, false, privilegeDetailItemAssemViewModel.LLILLJJLI, C2097608Jq.LJ(), 0L);
        dS();
        C0K57 c0k57 = C0K57.LIZ;
        String strBS = bS();
        C0K79 c0k79CS14 = cS();
        if (c0k79CS14 != null && (str4 = c0k79CS14.LLILLL) != null) {
            str5 = str4;
        }
        c0k57.getClass();
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_privilege_sub_page_show");
        c511970K5z.LIZIZ(strBS, "page_type");
        c511970K5z.LIZIZ(str5, "show_entrance");
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SubscriptionSheetFragment
    public final View VR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.fg5, viewGroup, false);
    }
}
