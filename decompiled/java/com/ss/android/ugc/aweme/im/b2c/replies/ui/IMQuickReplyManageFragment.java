package com.ss.android.ugc.aweme.im.b2c.replies.ui;

import X.AbstractC1387200mCc;
import X.AbstractC1786050wZv;
import X.AnonymousClass0652;
import X.AnonymousClass0956;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0HJJ;
import X.C0OM1;
import X.C0PEM;
import X.C0S4W;
import X.C0S4Y;
import X.C0S4Z;
import X.C1233390iCX;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1390410mHn;
import X.C1391190mJ3;
import X.C13LE;
import X.C15438062q;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1784000wWc;
import X.C1784040wWg;
import X.C1790890whj;
import X.C1790990wht;
import X.C1793710wmH;
import X.C189200o6;
import X.C1906580ziK;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C19IN;
import X.C1DFH;
import X.C2107308Nj;
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
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.C987103tV;
import X.EnumC1778690wO3;
import X.EnumC1784010wWd;
import X.EnumC638250P1r;
import X.InterfaceC1058150ddt;
import X.InterfaceC1784070wWj;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyManagePageConfig;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment;
import com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class IMQuickReplyManageFragment extends BaseFragment implements InterfaceC1058150ddt {
    public static final C1233390iCX LLJJLIIIJLLLLLLLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZy1hK2s+LDHELIOS8/ISA/Zzo6ZgwBGDo6Ky4eLD8/MQgtJy40LQM+KCg+LSs4";
    public InterfaceC1784070wWj LLIZ;
    public ViewGroup LLIZLLLIL;
    public C197039127h LLJ;
    public TuxNavBar LLJI;
    public ViewGroup LLJIJIL;
    public ViewGroup LLJILJIL;
    public C1749280vcc LLJILJILJ;
    public C1390410mHn LLJILLL;
    public C1793710wmH LLJJ;
    public AnonymousClass0956 LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public IMQuickReplyManagePageConfig LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0iCX] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMQuickReplyManageFragment.class, "quickReplyPanelVM", "getQuickReplyPanelVM()Lcom/ss/android/ugc/aweme/im/b2c/replies/vm/BusinessQuickReplyPanelVM;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJLIIIJLLLLLLLZ = new Object() { // from class: X.0iCX
        };
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    public IMQuickReplyManageFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BusinessQuickReplyPanelVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1489);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(65);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 279), aFwS269S0000000_27, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS571S0100000_27((Fragment) this, 280), aFwS269S0000000_27, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 281), aFwS269S0000000_27, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIII = assemVMLazy;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 277));
        this.LLJJIJIIJIL = true;
        this.LLJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 274));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 275));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 278));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 276));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1490));
        this.LLJJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 282));
    }

    public final void UR() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1390410mHn c1390410mHn = this.LLJILLL;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 8);
        }
        C1390410mHn c1390410mHn2 = this.LLJILLL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZLLL();
        }
    }

    public final BusinessQuickReplyPanelVM VR() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (BusinessQuickReplyPanelVM) assemVMLazy.getValue();
    }

    public final void bS() {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131835079);
        c1389890mGx.LJII(R.attr.a1h);
        c1389890mGx.LJIIJJI();
    }

    public final String getEnterFrom() {
        return (String) this.LLJJJ.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LLJJJIL.getValue();
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        String str;
        boolean z = !this.LLJJIJIIJIL;
        if (!z) {
            IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig = this.LLJJIJIL;
            if (iMQuickReplyManagePageConfig == null || (str = iMQuickReplyManagePageConfig.toUserId) == null) {
                str = "";
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0S4Y(str, getEnterFrom(), getEnterMethod(), null), 3);
        }
        return z;
    }

    public final void LJ() {
        if (getContext() != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            this.LLJJI = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0HJJ(this, null), 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        super.onStart();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || !parentFragment.isAdded() || !(parentFragment instanceof TuxSheet) || (dialogFragment = (DialogFragment) parentFragment) == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(R.style.al0);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    public final List<C1784040wWg> SR(List<IMQuickReply> list) {
        EnumC1784010wWd enumC1784010wWd;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (IMQuickReply iMQuickReply : list) {
            if (this.LLJJIJIIJIL) {
                enumC1784010wWd = EnumC1784010wWd.EDIT;
            } else {
                enumC1784010wWd = EnumC1784010wWd.MANAGE;
            }
            arrayList.add(new C1784040wWg(enumC1784010wWd, iMQuickReply));
        }
        return arrayList;
    }

    public final void aS(boolean z) {
        if (z) {
            Context context = getContext();
            if (context != null) {
                if (this.LLJILJILJ == null) {
                    C1749280vcc c1749280vccLIZ = C451930Hnr.LIZ(context, false, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(139)), null);
                    this.LLJILJILJ = c1749280vccLIZ;
                    ViewGroup viewGroup = this.LLJILJIL;
                    if (viewGroup != null) {
                        viewGroup.addView(c1749280vccLIZ);
                    }
                }
                ViewGroup viewGroup2 = this.LLJILJIL;
                if (viewGroup2 != null) {
                    C786410Ut5.LJLZ(0, viewGroup2);
                    return;
                }
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = this.LLJILJIL;
        if (viewGroup3 == null) {
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            iMQuickReplyManagePageConfig = (IMQuickReplyManagePageConfig) arguments.getParcelable("key_quick_reply_manage_config");
        } else {
            iMQuickReplyManagePageConfig = null;
        }
        this.LLJJIJIL = iMQuickReplyManagePageConfig;
        if (iMQuickReplyManagePageConfig == null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        }
    }

    public final void WR(boolean z, boolean z2) {
        String string;
        TuxNavBar tuxNavBar = this.LLJI;
        if (tuxNavBar != null) {
            tuxNavBar.LJJ(new C1790890whj(z2, z, this), "nav_end");
            Context context = getContext();
            if (context == null || (string = context.getString(2131830801)) == null) {
                string = "";
            }
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string;
            tuxNavBar.LJIJJ(c1250250idj);
            tuxNavBar.LJJ(new AwS39S0010000_27(z, 8), "nav_start");
        }
    }

    public final void ZR(EnumC1778690wO3 enumC1778690wO3, IMQuickReply iMQuickReply) {
        String str;
        ViewGroup viewGroup;
        C19EG activity = getActivity();
        if (activity != null) {
            C1793710wmH c1793710wmH = this.LLJJ;
            if (c1793710wmH != null && (viewGroup = this.LLJIJIL) != null) {
                C786410Ut5.LJJJLZIJ(c1793710wmH, viewGroup);
            }
            C1793710wmH c1793710wmH2 = new C1793710wmH(activity);
            ViewGroup viewGroup2 = this.LLJIJIL;
            if (viewGroup2 != null) {
                viewGroup2.addView(c1793710wmH2);
            }
            this.LLJJ = c1793710wmH2;
            ViewGroup viewGroup3 = this.LLIZLLLIL;
            if (viewGroup3 != null) {
                c1793710wmH2.LIZ(activity, getLifecycle(), viewGroup3, new C1790990wht(iMQuickReply, new AwS641S0100000_27(this, 19), new AwS606S0100000_27(this, 107)));
                IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig = this.LLJJIJIL;
                if (iMQuickReplyManagePageConfig == null || (str = iMQuickReplyManagePageConfig.toUserId) == null) {
                    str = "";
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0S4Z(str, getEnterFrom(), getEnterMethod(), enumC1778690wO3.getValue(), null), 3);
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        super.onViewCreated(view, bundle);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1784000wWc(this, null), 3);
        IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig = this.LLJJIJIL;
        if (iMQuickReplyManagePageConfig != null) {
            if (iMQuickReplyManagePageConfig.fetchLatestData) {
                z = true;
            } else {
                z = false;
                if (iMQuickReplyManagePageConfig != null) {
                }
            }
            String str2 = iMQuickReplyManagePageConfig.uid;
            if (AnonymousClass0652.LIZ(str2)) {
                VR().wQ2(str2, z);
            }
        }
        IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig2 = this.LLJJIJIL;
        if (iMQuickReplyManagePageConfig2 != null && iMQuickReplyManagePageConfig2.openAddPanel) {
            ZR(EnumC1778690wO3.NEW, null);
        }
        IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig3 = this.LLJJIJIL;
        if (iMQuickReplyManagePageConfig3 == null || (str = iMQuickReplyManagePageConfig3.toUserId) == null) {
            str = "";
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0S4W(str, getEnterFrom(), getEnterMethod(), null), 3);
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
        Activity activityLIZIZ;
        int iIntValue;
        boolean z = false;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cf8, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewTd;
        this.LLIZLLLIL = viewGroup2;
        ViewGroup viewGroup3 = this.LLIZLLLIL;
        C19GS c19gs = null;
        if (viewGroup3 != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = ((Number) this.LLJJJJJIL.getValue()).intValue() + ((Number) this.LLJJJJLIIL.getValue()).intValue();
            } else {
                layoutParams = null;
            }
            C786410Ut5.X5(layoutParams, viewGroup3);
        }
        this.LLIZ = (InterfaceC1784070wWj) viewGroup2.findViewById(R.id.sof);
        this.LLJIJIL = (ViewGroup) viewGroup2.findViewById(R.id.snu);
        this.LLJILJIL = (ViewGroup) viewGroup2.findViewById(R.id.soa);
        this.LLJ = (C197039127h) viewGroup2.findViewById(R.id.snp);
        this.LLJI = (TuxNavBar) viewGroup2.findViewById(R.id.so8);
        this.LLJILLL = (C1390410mHn) viewGroup2.findViewById(R.id.f800so6);
        C197039127h c197039127h = this.LLJ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new C19IN() { // from class: X.0whk
                {
                    super(LSPassThroughRecordSizeConfig.DEFAULT, 2);
                }

                @Override // X.C19IN
                public final void LIZ(View view) {
                    this.LLILZLL.ZR(EnumC1778690wO3.NEW, null);
                }
            });
        }
        C197039127h c197039127h2 = this.LLJ;
        if (c197039127h2 != null) {
            c197039127h2.setButtonStartIcon(Integer.valueOf(R.raw.icon_plus_small));
            c197039127h2.setIconTintColorRes(R.attr.a0p);
            c197039127h2.setText(2131830385);
        }
        TuxNavBar tuxNavBar = this.LLJI;
        if (tuxNavBar != null) {
            Context context = viewGroup2.getContext();
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c1251150ifB.LIZLLL();
            c1251150ifB.LJ = c419910GdJ;
            c1251150ifB.LIZIZ = "nav_start";
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZ = new AbstractC1786050wZv() { // from class: X.0wWr
                @Override // X.AbstractC1786050wZv
                public final void LIZIZ() {
                    String str;
                    IMQuickReplyManageFragment iMQuickReplyManageFragment = this.LIZJ;
                    if (iMQuickReplyManageFragment.LLJJIJIIJIL) {
                        String str2 = TuxSheet._pnsPageId;
                        C1391190mJ3.LJFF(iMQuickReplyManageFragment, C343970De7.LIZ);
                        IMQuickReplyManageFragment iMQuickReplyManageFragment2 = this.LIZJ;
                        IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig = iMQuickReplyManageFragment2.LLJJIJIL;
                        if (iMQuickReplyManagePageConfig == null || (str = iMQuickReplyManagePageConfig.toUserId) == null) {
                            str = "";
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0S4Y(str, iMQuickReplyManageFragment2.getEnterFrom(), this.LIZJ.getEnterMethod(), null), 3);
                    }
                }

                {
                    super(500L);
                }
            };
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = context.getString(2131830804);
            c1250250idj.LIZIZ = "nav_middle";
            c0om1.LIZJ = c1250250idj;
            C1250300ido c1250300ido = new C1250300ido();
            c1250300ido.LIZJ = context.getString(2131830803);
            c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
            c1250300ido.LIZIZ = "nav_end";
            c1250300ido.LJ = true;
            c1250300ido.LIZ = new AbstractC1786050wZv() { // from class: X.0wWl
                @Override // X.AbstractC1786050wZv
                public final void LIZIZ() {
                    String str;
                    String str2;
                    IMQuickReplyManageFragment iMQuickReplyManageFragment = this.LIZJ;
                    boolean z2 = !iMQuickReplyManageFragment.LLJJIJIIJIL;
                    iMQuickReplyManageFragment.LLJJIJIIJIL = z2;
                    String str3 = "";
                    if (!z2) {
                        InterfaceC1784070wWj interfaceC1784070wWj = iMQuickReplyManageFragment.LLIZ;
                        if (interfaceC1784070wWj != null) {
                            interfaceC1784070wWj.LIZ(EnumC1784010wWd.MANAGE);
                        }
                        iMQuickReplyManageFragment.WR(false, true);
                        C197039127h c197039127h3 = iMQuickReplyManageFragment.LLJ;
                        if (c197039127h3 != null) {
                            C786410Ut5.LLLLLLJ(c197039127h3, 8);
                        }
                        IMQuickReplyManageFragment iMQuickReplyManageFragment2 = this.LIZJ;
                        IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig = iMQuickReplyManageFragment2.LLJJIJIL;
                        if (iMQuickReplyManagePageConfig != null && (str = iMQuickReplyManagePageConfig.toUserId) != null) {
                            str3 = str;
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0S4V(str3, iMQuickReplyManageFragment2.getEnterFrom(), this.LIZJ.getEnterMethod(), null), 3);
                        return;
                    }
                    iMQuickReplyManageFragment.LLJJIJIIJIL = true;
                    InterfaceC1784070wWj interfaceC1784070wWj2 = iMQuickReplyManageFragment.LLIZ;
                    if (interfaceC1784070wWj2 != null) {
                        interfaceC1784070wWj2.LIZ(EnumC1784010wWd.EDIT);
                    }
                    iMQuickReplyManageFragment.WR(true, true);
                    C197039127h c197039127h4 = iMQuickReplyManageFragment.LLJ;
                    if (c197039127h4 != null) {
                        C786410Ut5.LLLLLLJ(c197039127h4, 0);
                    }
                    IMQuickReplyManageFragment iMQuickReplyManageFragment3 = this.LIZJ;
                    iMQuickReplyManageFragment3.getClass();
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(iMQuickReplyManageFragment3), null, null, new C1784050wWh(iMQuickReplyManageFragment3, null), 3);
                    IMQuickReplyManageFragment iMQuickReplyManageFragment4 = this.LIZJ;
                    IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig2 = iMQuickReplyManageFragment4.LLJJIJIL;
                    if (iMQuickReplyManagePageConfig2 != null && (str2 = iMQuickReplyManagePageConfig2.toUserId) != null) {
                        str3 = str2;
                    }
                    C715380S4i.LIZIZ(str3, iMQuickReplyManageFragment4.getEnterFrom(), this.LIZJ.getEnterMethod(), "click_done");
                }

                {
                    super(500L);
                }
            };
            c0om1.LIZIZ(c1250300ido);
            c0om1.LIZLLL = false;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c0om1.LIZJ(iIntValue);
            tuxNavBar.setNavActions(c0om1);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxNavBar.getLayoutParams();
            marginLayoutParams.topMargin = ((Number) this.LLJJJJLIIL.getValue()).intValue();
            C786410Ut5.S6(tuxNavBar, marginLayoutParams);
        }
        InterfaceC1784070wWj interfaceC1784070wWj = this.LLIZ;
        if (interfaceC1784070wWj != null) {
            interfaceC1784070wWj.setActionListener((Function2) this.LLJJJJ.getValue());
        }
        ViewGroup viewGroup4 = this.LLIZLLLIL;
        if (viewGroup4 != null) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && C960203pA.LIZIZ(activityLIZIZ)) {
                z = true;
            }
            if (!z) {
                viewGroup4.setSystemUiVisibility(viewGroup4.getSystemUiVisibility() | 8192);
            }
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
