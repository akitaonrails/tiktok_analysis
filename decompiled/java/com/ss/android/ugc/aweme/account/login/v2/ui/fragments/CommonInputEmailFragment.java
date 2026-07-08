package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C0I7D;
import X.C1232150iAX;
import X.C1237400iJ0;
import X.C1237730iJX;
import X.C1748330vb5;
import X.C1748440vbG;
import X.C197039127h;
import X.C21405318pn;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C816470W1d;
import X.C853160XdS;
import X.C853170XdT;
import X.C853180XdU;
import X.InterfaceC853190XdV;
import X.InterfaceC853790XeT;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class CommonInputEmailFragment extends BaseAccountBindingsFlowFragment {
    public C21405318pn LLLIL;
    public View LLLILZ;
    public C1237400iJ0 LLLILZJ;
    public RecyclerView LLLILZLLLI;
    public RecyclerView LLLIZZ;
    public TuxTextView LLLJ;
    public C0I7D LLLJIL;
    public boolean LLLL;
    public C1748440vbG LLLLII;
    public C1748330vb5 LLLLIIIILLL;
    public C197039127h LLLLIIL;
    public RecyclerView LLLLIILL;
    public boolean LLLJL = true;
    public final boolean LLLLIILLL = true;

    public void eT() {
    }

    public abstract void iT(String str);

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public int sS() {
        return R.layout.a09;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        C197039127h c197039127h = this.LLLLIIL;
        if (c197039127h != null) {
            c197039127h.setLoading(true);
        }
        C1748440vbG c1748440vbG = this.LLLLII;
        if (c1748440vbG != null) {
            c1748440vbG.setValidationStatus(0);
        }
        C0I7D c0i7d = this.LLLJIL;
        if (c0i7d != null) {
            c0i7d.setFilters(new C1237730iJX[]{C1237730iJX.LL});
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public void LLIIIZ() {
        RecyclerView recyclerView = this.LLLLIILL;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        C197039127h c197039127h = this.LLLLIIL;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
        C1748440vbG c1748440vbG = this.LLLLII;
        if (c1748440vbG != null) {
            c1748440vbG.setValidationStatus(0);
        }
        C0I7D c0i7d = this.LLLJIL;
        if (c0i7d != null) {
            c0i7d.setFilters(new InputFilter[0]);
        }
    }

    public final TuxTextView fT() {
        View viewFindViewById = this.LLLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fvg) : null;
            this.LLLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1237400iJ0 gT() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kq2) : null;
            this.LLLILZJ = (C1237400iJ0) viewFindViewById;
        }
        return (C1237400iJ0) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public void ln() {
        RecyclerView recyclerView = this.LLLLIILL;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
        this.LLLIZZ = null;
        this.LLLJ = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        C0I7D c0i7d = this.LLLJIL;
        if (c0i7d != null) {
            C1232150iAX.LIZIZ(c0i7d);
        }
    }

    public boolean hT() {
        return this.LLLLIILLL;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class InputEmailActions implements InterfaceC853790XeT<InterfaceC853190XdV> {
        public static final int $stable = 8;
        public final InterfaceC853190XdV params;

        public abstract BaseAccountFlowFragment getFragment();

        public static final class ClickChangeEmailAction extends InputEmailActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C853160XdS params;

            public final ClickChangeEmailAction copy(C853160XdS c853160XdS, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new ClickChangeEmailAction(c853160XdS, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickChangeEmailAction)) {
                    return false;
                }
                ClickChangeEmailAction clickChangeEmailAction = (ClickChangeEmailAction) obj;
                return Intrinsics.LJFF(this.params, clickChangeEmailAction.params) && Intrinsics.LJFF(this.fragment, clickChangeEmailAction.fragment);
            }

            public int hashCode() {
                return (hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickChangeEmailAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment.InputEmailActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment.InputEmailActions
            /* JADX INFO: renamed from: getParams, reason: merged with bridge method [inline-methods] */
            public C853160XdS mo151getParams() {
                return this.params;
            }

            public ClickChangeEmailAction(C853160XdS c853160XdS, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c853160XdS);
                this.params = c853160XdS;
                this.fragment = baseAccountFlowFragment;
            }
        }

        public static final class ClickChangeToPhoneAction extends InputEmailActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C853180XdU params;

            public final ClickChangeToPhoneAction copy(C853180XdU c853180XdU, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new ClickChangeToPhoneAction(c853180XdU, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickChangeToPhoneAction)) {
                    return false;
                }
                ClickChangeToPhoneAction clickChangeToPhoneAction = (ClickChangeToPhoneAction) obj;
                return Intrinsics.LJFF(this.params, clickChangeToPhoneAction.params) && Intrinsics.LJFF(this.fragment, clickChangeToPhoneAction.fragment);
            }

            public int hashCode() {
                return (hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickChangeToPhoneAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment.InputEmailActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment.InputEmailActions
            /* JADX INFO: renamed from: getParams */
            public C853180XdU mo151getParams() {
                return this.params;
            }

            public ClickChangeToPhoneAction(C853180XdU c853180XdU, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c853180XdU);
                this.params = c853180XdU;
                this.fragment = baseAccountFlowFragment;
            }
        }

        public static final class ClickSendCodeAction extends InputEmailActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C853170XdT params;

            public final ClickSendCodeAction copy(C853170XdT c853170XdT, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new ClickSendCodeAction(c853170XdT, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickSendCodeAction)) {
                    return false;
                }
                ClickSendCodeAction clickSendCodeAction = (ClickSendCodeAction) obj;
                return Intrinsics.LJFF(this.params, clickSendCodeAction.params) && Intrinsics.LJFF(this.fragment, clickSendCodeAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickSendCodeAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment.InputEmailActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment.InputEmailActions
            /* JADX INFO: renamed from: getParams */
            public C853170XdT mo151getParams() {
                return this.params;
            }

            public ClickSendCodeAction(C853170XdT c853170XdT, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c853170XdT);
                this.params = c853170XdT;
                this.fragment = baseAccountFlowFragment;
            }
        }

        public static final class VerifySameEmailAction extends InputEmailActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C853170XdT params;

            public final VerifySameEmailAction copy(C853170XdT c853170XdT, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new VerifySameEmailAction(c853170XdT, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifySameEmailAction)) {
                    return false;
                }
                VerifySameEmailAction verifySameEmailAction = (VerifySameEmailAction) obj;
                return Intrinsics.LJFF(this.params, verifySameEmailAction.params) && Intrinsics.LJFF(this.fragment, verifySameEmailAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VerifySameEmailAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment.InputEmailActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment.InputEmailActions
            /* JADX INFO: renamed from: getParams */
            public C853170XdT mo151getParams() {
                return this.params;
            }

            public VerifySameEmailAction(C853170XdT c853170XdT, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c853170XdT);
                this.params = c853170XdT;
                this.fragment = baseAccountFlowFragment;
            }
        }

        @Override // 
        /* JADX INFO: renamed from: getParams */
        public InterfaceC853190XdV mo151getParams() {
            return this.params;
        }

        public InputEmailActions(InterfaceC853190XdV interfaceC853190XdV) {
            this.params = interfaceC853190XdV;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[PHI: r1
      0x0049: PHI (r1v3 android.view.View) = (r1v2 android.view.View), (r1v29 android.view.View) binds: [B:15:0x0036, B:20:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        C1748440vbG c1748440vbG = this.LLLLII;
        if (c1748440vbG != null) {
            c1748440vbG.setValidationStatus(3);
        }
        gT().setFooter(this.LLLLIIIILLL);
        C1748330vb5 c1748330vb5 = this.LLLLIIIILLL;
        if (c1748330vb5 != null) {
            c1748330vb5.setMessage(str);
        }
    }

    public void ZS(RecyclerView recyclerView, EditText editText, String str) {
        C816470W1d.LIZ(recyclerView, editText, LJJLIIIJJI(), LLIIJI());
    }
}
