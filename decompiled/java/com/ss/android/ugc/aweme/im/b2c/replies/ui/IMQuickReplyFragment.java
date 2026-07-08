package com.ss.android.ugc.aweme.im.b2c.replies.ui;

import X.AbstractC1786050wZv;
import X.AnonymousClass0652;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0PEM;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C1391190mJ3;
import X.C13LE;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1783980wWa;
import X.C1783990wWb;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C338490DOt;
import X.C343970De7;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C451930Hnr;
import X.C452070Ho5;
import X.C452501pT;
import X.C715300S4a;
import X.C715330S4d;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C913520Zsc;
import X.C987103tV;
import X.EnumC638250P1r;
import X.InterfaceC1058150ddt;
import X.InterfaceC1784070wWj;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyPanelConfig;
import com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM;
import com.ss.android.ugc.aweme.im.b2c.replies.vm.IIMBusinessQuickReplyAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput.IAutoFilledInputContentAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class IMQuickReplyFragment extends BaseFragment implements InterfaceC1058150ddt, IIMBusinessQuickReplyAbility {
    public static final C913520Zsc LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZy1hK2HELIOSs+LD8/ISA/Zzo6ZgwBGDo6Ky4eLD8/MQM+KCg+LSs4";
    public final AssemVMLazy LLIZ;
    public IAutoFilledInputContentAbility LLIZLLLIL;
    public IMQuickReplyPanelConfig LLJ;
    public InterfaceC1784070wWj LLJI;
    public TuxNavBar LLJIJIL;
    public ViewGroup LLJILJIL;
    public ViewGroup LLJILJILJ;
    public C1749280vcc LLJILLL;
    public final C01GW LLJJ;
    public String LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Zsc] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMQuickReplyFragment.class, "quickReplyPanelVM", "getQuickReplyPanelVM()Lcom/ss/android/ugc/aweme/im/b2c/replies/vm/BusinessQuickReplyPanelVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new Object() { // from class: X.0Zsc
        };
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    public IMQuickReplyFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BusinessQuickReplyPanelVM.class);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c19719912DlLIZ, 270);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(64);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 271), aFwS269S0000000_27, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new AwS571S0100000_27((Fragment) this, 272), aFwS269S0000000_27, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 273), aFwS269S0000000_27, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 268));
        this.LLJJI = "click_layer";
        this.LLJJIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 264));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 265));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 267));
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.replies.vm.IIMBusinessQuickReplyAbility
    public final void FD2() {
        IMQuickReplyPanelConfig iMQuickReplyPanelConfig = this.LLJ;
        if (iMQuickReplyPanelConfig != null) {
            String str = iMQuickReplyPanelConfig.uid;
            if (AnonymousClass0652.LIZ(str)) {
                SR().wQ2(str, false);
            }
        }
    }

    public final BusinessQuickReplyPanelVM SR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (BusinessQuickReplyPanelVM) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        this.LLJJI = "back_press";
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = C1383370m6R.LJIIIIZZ(getActivity());
        if (interfaceC665370Q7zLJIIIIZZ != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJIIIIZZ, IIMBusinessQuickReplyAbility.class, null);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        super.onDestroyView();
        IMQuickReplyPanelConfig iMQuickReplyPanelConfig = this.LLJ;
        if (iMQuickReplyPanelConfig == null || (str = iMQuickReplyPanelConfig.toUserId) == null) {
            str = "";
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C715330S4d(str, (String) this.LLJJIII.getValue(), (String) this.LLJJIJI.getValue(), this.LLJJI, null), 3);
    }

    public final void UR(boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        if (getContext() != null) {
            IMQuickReplyPanelConfig iMQuickReplyPanelConfig = this.LLJ;
            if (iMQuickReplyPanelConfig != null) {
                str = iMQuickReplyPanelConfig.uid;
            } else {
                str = null;
            }
            if (AnonymousClass0652.LIZ(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("//im_quick_reply/manage_page?biz_uid=");
                sbLIZ.append(str);
                sbLIZ.append("&enter_from=");
                IMQuickReplyPanelConfig iMQuickReplyPanelConfig2 = this.LLJ;
                String str5 = "";
                if (iMQuickReplyPanelConfig2 == null || (str2 = iMQuickReplyPanelConfig2.enterFrom) == null) {
                    str2 = "";
                }
                sbLIZ.append(str2);
                sbLIZ.append("&enter_method=");
                IMQuickReplyPanelConfig iMQuickReplyPanelConfig3 = this.LLJ;
                if (iMQuickReplyPanelConfig3 == null || (str3 = iMQuickReplyPanelConfig3.enterMethod) == null) {
                    str3 = "";
                }
                sbLIZ.append(str3);
                sbLIZ.append("&open_add_panel=");
                sbLIZ.append(z ? 1 : 0);
                sbLIZ.append("&to_user_id=");
                IMQuickReplyPanelConfig iMQuickReplyPanelConfig4 = this.LLJ;
                if (iMQuickReplyPanelConfig4 != null && (str4 = iMQuickReplyPanelConfig4.toUserId) != null) {
                    str5 = str4;
                }
                sbLIZ.append(str5);
                SmartRouter.buildRoute(this, C2188811AlT.LIZIZ(sbLIZ)).open();
            }
        }
    }

    public final void VR(boolean z) {
        boolean z2 = !z;
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar != null) {
            tuxNavBar.LJJ(new AwS39S0010000_27(z2, 21), "nav_end");
            tuxNavBar.LJIIZILJ(!z2);
        }
        if (z) {
            Context context = getContext();
            if (context != null) {
                if (this.LLJILLL == null) {
                    C1749280vcc c1749280vccLIZ = C451930Hnr.LIZ(context, true, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(47)), new AwS571S0100000_27(this, 269));
                    this.LLJILLL = c1749280vccLIZ;
                    ViewGroup viewGroup = this.LLJILJILJ;
                    if (viewGroup != null) {
                        viewGroup.addView(c1749280vccLIZ);
                    }
                }
                C1749280vcc c1749280vcc = this.LLJILLL;
                if (c1749280vcc != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc, 0);
                    return;
                }
                return;
            }
            return;
        }
        C1749280vcc c1749280vcc2 = this.LLJILLL;
        if (c1749280vcc2 == null) {
            return;
        }
        C786410Ut5.LLLZLZ(c1749280vcc2, 8);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IMQuickReplyPanelConfig iMQuickReplyPanelConfig;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            iMQuickReplyPanelConfig = (IMQuickReplyPanelConfig) arguments.getParcelable("im_quick_reply_panel_config");
        } else {
            iMQuickReplyPanelConfig = null;
        }
        this.LLJ = iMQuickReplyPanelConfig;
        if (iMQuickReplyPanelConfig == null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        String str;
        if (i != 3) {
            if (i == 5) {
                this.LLJJI = "slide_down";
                return;
            }
            return;
        }
        IMQuickReplyPanelConfig iMQuickReplyPanelConfig = this.LLJ;
        if (iMQuickReplyPanelConfig == null || (str = iMQuickReplyPanelConfig.toUserId) == null) {
            str = "";
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C715300S4a(((List) SR().LLILLJJLI.getValue()).size(), str, (String) this.LLJJIII.getValue(), (String) this.LLJJIJI.getValue(), null), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = C1383370m6R.LJIIIIZZ(getActivity());
        if (interfaceC665370Q7zLJIIIIZZ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIIIIZZ, this, IIMBusinessQuickReplyAbility.class, null, null);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ2 = C1383370m6R.LJIIIIZZ(getActivity());
        if (interfaceC665370Q7zLJIIIIZZ2 != null) {
            this.LLIZLLLIL = (IAutoFilledInputContentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIIIZZ2, IAutoFilledInputContentAbility.class, null);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1783990wWb(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1783980wWa(this, null), 3);
        IMQuickReplyPanelConfig iMQuickReplyPanelConfig = this.LLJ;
        if (iMQuickReplyPanelConfig != null) {
            String str = iMQuickReplyPanelConfig.uid;
            if (AnonymousClass0652.LIZ(str)) {
                SR().wQ2(str, true);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0OM1 c0om1;
        TuxNavBar tuxNavBar;
        int iIntValue = 0;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cf6, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewTd;
        this.LLJILJIL = viewGroup2;
        this.LLJIJIL = (TuxNavBar) viewGroup2.findViewById(R.id.so8);
        this.LLJI = (InterfaceC1784070wWj) viewGroup2.findViewById(R.id.sof);
        this.LLJILJILJ = (ViewGroup) viewGroup2.findViewById(R.id.sob);
        InterfaceC1784070wWj interfaceC1784070wWj = this.LLJI;
        if (interfaceC1784070wWj != null) {
            interfaceC1784070wWj.setActionListener((Function2) this.LLJJ.getValue());
        }
        Context context = getContext();
        C19GS c19gs = null;
        if (context != null) {
            c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_x_mark;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c1251150ifB.LIZLLL();
            c1251150ifB.LJ = c419910GdJ;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS571S0100000_27(this, 1118));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = context.getString(2131830811);
            c0om1.LIZJ = c1250250idj;
            C1250300ido c1250300ido = new C1250300ido();
            c1250300ido.LIZJ = context.getString(2131830810);
            c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
            c1250300ido.LJ = true;
            c1250300ido.LIZIZ = "nav_end";
            c1250300ido.LIZ = new AbstractC1786050wZv() { // from class: X.0waW
                @Override // X.AbstractC1786050wZv
                public final void LIZIZ() {
                    this.LIZJ.UR(false);
                }

                {
                    super(1000L);
                }
            };
            c0om1.LIZIZ(c1250300ido);
            c0om1.LIZLLL = false;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            c0om1.LIZJ(iIntValue);
        } else {
            c0om1 = null;
        }
        if (c0om1 != null && (tuxNavBar = this.LLJIJIL) != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        InterfaceC1784070wWj interfaceC1784070wWj2 = this.LLJI;
        if (interfaceC1784070wWj2 != null) {
            interfaceC1784070wWj2.setOnViewAttachLister(new AwS571S0100000_27(this, 266));
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
