package com.ss.android.ugc.aweme.account.pii;

import X.C01GW;
import X.C0HTI;
import X.C0WZX;
import X.C1237010iIN;
import X.C1237910iJp;
import X.C1238010iJz;
import X.C1238020iK0;
import X.C1238030iK1;
import X.C1238240iKM;
import X.C1266010j39;
import X.C1389890mGx;
import X.C1602160rnK;
import X.C197039127h;
import X.C19EG;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C431260Gvc;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1237070iIT;
import X.InterfaceC1242460iRA;
import X.InterfaceC853790XeT;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class PIIBindPromptFragment extends BaseI18nLoginFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmHELIOSJjFiOSY6ZhUFAA06JiEcOyA+ODEKOy40JSAiPQ==";
    public ConstraintLayout LLLIILIL;
    public ImageView LLLIL;
    public TuxTextView LLLILZ;
    public C197039127h LLLILZJ;
    public C1238240iKM LLLILZLLLI;
    public TuxTextView LLLIZZ;
    public TuxTextView LLLJ;
    public TuxTextView LLLJIL;
    public TuxTextView LLLJL;
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 354));
    public boolean LLLLII;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.yc;
    }

    public final TuxTextView NS() {
        View viewFindViewById = this.LLLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.coc) : null;
            this.LLLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C197039127h PS() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ctl) : null;
            this.LLLILZJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView QS() {
        View viewFindViewById = this.LLLIZZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cuq) : null;
            this.LLLIZZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView RS() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fof) : null;
            this.LLLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ImageView US() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jlu) : null;
            this.LLLIL = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final TuxTextView VS() {
        View viewFindViewById = this.LLLJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qfu) : null;
            this.LLLJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1238240iKM XS() {
        View viewFindViewById = this.LLLILZLLLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qfv) : null;
            this.LLLILZLLLI = (C1238240iKM) viewFindViewById;
        }
        return (C1238240iKM) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        C197039127h c197039127hPS = PS();
        if (c197039127hPS != null) {
            c197039127hPS.setLoading(true);
        }
        C1238240iKM c1238240iKMXS = XS();
        if (c1238240iKMXS != null) {
            c1238240iKMXS.setValidationStatus(1);
        }
        TuxTextView tuxTextViewQS = QS();
        if (tuxTextViewQS != null) {
            tuxTextViewQS.setEnabled(false);
        }
        TuxTextView tuxTextViewNS = NS();
        if (tuxTextViewNS != null) {
            tuxTextViewNS.setEnabled(false);
        }
        TuxTextView tuxTextViewVS = VS();
        if (tuxTextViewVS != null) {
            tuxTextViewVS.setEnabled(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        C197039127h c197039127hPS = PS();
        if (c197039127hPS != null) {
            c197039127hPS.setLoading(false);
        }
        C1238240iKM c1238240iKMXS = XS();
        if (c1238240iKMXS != null) {
            c1238240iKMXS.setValidationStatus(0);
        }
        TuxTextView tuxTextViewQS = QS();
        if (tuxTextViewQS != null) {
            tuxTextViewQS.setEnabled(true);
        }
        TuxTextView tuxTextViewNS = NS();
        if (tuxTextViewNS != null) {
            tuxTextViewNS.setEnabled(true);
        }
        TuxTextView tuxTextViewVS = VS();
        if (tuxTextViewVS != null) {
            tuxTextViewVS.setEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void bS() {
        InterfaceC1237070iIT interfaceC1237070iIT;
        C1237010iIN c1237010iINLJFF;
        C786410Ut5.LL(8, cS());
        T value = ((AccountFlowFragmentViewModel) this.LLILLJJLI.getValue()).LLILLJJLI.getValue();
        if (!(value instanceof InterfaceC1237070iIT) || (interfaceC1237070iIT = (InterfaceC1237070iIT) value) == null || (c1237010iINLJFF = interfaceC1237070iIT.LJFF()) == null) {
            return;
        }
        Integer num = c1237010iINLJFF.LJIILLIIL;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EG activity = getActivity();
            if (activity != null) {
                ImageView imageViewUS = US();
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = iIntValue;
                imageViewUS.setImageDrawable(c0hti.LIZ(activity));
            }
        }
        String str = c1237010iINLJFF.LJIIIIZZ;
        if (str != null) {
            View view = this.LLLJL;
            if (view == null) {
                View view2 = getView();
                View viewFindViewById = view2 != null ? view2.findViewById(R.id.title) : null;
                this.LLLJL = (TuxTextView) viewFindViewById;
                view = viewFindViewById;
            }
            ((TextView) view).setText(str);
        }
        CharSequence charSequence = c1237010iINLJFF.LJIIIZ;
        if (charSequence != null) {
            RS().setText(charSequence);
            RS().setMovementMethod(C431260Gvc.LIZ);
        }
        String str2 = c1237010iINLJFF.LJIIZILJ;
        if (str2 != null) {
            QS().setText(str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
        this.LLLIZZ = null;
        this.LLLJ = null;
        this.LLLJIL = null;
        this.LLLJL = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("prevent_back");
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        KeyboardUtils.LIZ(getViewLifecycleOwner(), getView(), new InterfaceC1242460iRA() { // from class: X.0iJo
            @Override // X.InterfaceC1242460iRA
            public final void onHide() {
                C786410Ut5.LJZI(0, this.LL.US());
                C786410Ut5.LLLLZLL(this.LL.RS(), 0);
            }

            @Override // X.InterfaceC1242460iRA
            public final void onShow() {
                C786410Ut5.LJZI(8, this.LL.US());
                C786410Ut5.LLLLZLL(this.LL.RS(), 8);
            }
        });
    }

    public static abstract class PIIBindPromptActions implements InterfaceC853790XeT<Object> {
        public static final int $stable = 0;

        public abstract BaseI18nLoginFragment getFragment();

        public abstract /* synthetic */ Object getParams();

        public static final class ChangeButtonClickAction extends PIIBindPromptActions {
            public static final int $stable = 8;
            public final BaseI18nLoginFragment fragment;
            public final C1238010iJz params;

            public final ChangeButtonClickAction copy(C1238010iJz c1238010iJz, BaseI18nLoginFragment baseI18nLoginFragment) {
                return new ChangeButtonClickAction(c1238010iJz, baseI18nLoginFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChangeButtonClickAction)) {
                    return false;
                }
                ChangeButtonClickAction changeButtonClickAction = (ChangeButtonClickAction) obj;
                return Intrinsics.LJFF(this.params, changeButtonClickAction.params) && Intrinsics.LJFF(this.fragment, changeButtonClickAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ChangeButtonClickAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment.PIIBindPromptActions
            public BaseI18nLoginFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment.PIIBindPromptActions
            public C1238010iJz getParams() {
                return this.params;
            }

            public ChangeButtonClickAction(C1238010iJz c1238010iJz, BaseI18nLoginFragment baseI18nLoginFragment) {
                this.params = c1238010iJz;
                this.fragment = baseI18nLoginFragment;
            }
        }

        public static final class ClickSendCodeAction extends PIIBindPromptActions {
            public static final int $stable = 8;
            public final BaseI18nLoginFragment fragment;
            public final C1237910iJp params;

            public final ClickSendCodeAction copy(C1237910iJp c1237910iJp, BaseI18nLoginFragment baseI18nLoginFragment) {
                return new ClickSendCodeAction(c1237910iJp, baseI18nLoginFragment);
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

            @Override // com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment.PIIBindPromptActions
            public BaseI18nLoginFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment.PIIBindPromptActions
            public C1237910iJp getParams() {
                return this.params;
            }

            public ClickSendCodeAction(C1237910iJp c1237910iJp, BaseI18nLoginFragment baseI18nLoginFragment) {
                this.params = c1237910iJp;
                this.fragment = baseI18nLoginFragment;
            }
        }

        public static final class PrimaryButtonClickAction extends PIIBindPromptActions {
            public static final int $stable = 8;
            public final BaseI18nLoginFragment fragment;
            public final C1238020iK0 params;

            public final PrimaryButtonClickAction copy(C1238020iK0 c1238020iK0, BaseI18nLoginFragment baseI18nLoginFragment) {
                return new PrimaryButtonClickAction(c1238020iK0, baseI18nLoginFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PrimaryButtonClickAction)) {
                    return false;
                }
                PrimaryButtonClickAction primaryButtonClickAction = (PrimaryButtonClickAction) obj;
                return Intrinsics.LJFF(this.params, primaryButtonClickAction.params) && Intrinsics.LJFF(this.fragment, primaryButtonClickAction.fragment);
            }

            public int hashCode() {
                return (hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PrimaryButtonClickAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment.PIIBindPromptActions
            public BaseI18nLoginFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment.PIIBindPromptActions
            public C1238020iK0 getParams() {
                return this.params;
            }

            public PrimaryButtonClickAction(C1238020iK0 c1238020iK0, BaseI18nLoginFragment baseI18nLoginFragment) {
                this.params = c1238020iK0;
                this.fragment = baseI18nLoginFragment;
            }
        }

        public static final class SecondaryButtonClickAction extends PIIBindPromptActions {
            public static final int $stable = 8;
            public final BaseI18nLoginFragment fragment;
            public final C1238030iK1 params;

            public final SecondaryButtonClickAction copy(C1238030iK1 c1238030iK1, BaseI18nLoginFragment baseI18nLoginFragment) {
                return new SecondaryButtonClickAction(c1238030iK1, baseI18nLoginFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SecondaryButtonClickAction)) {
                    return false;
                }
                SecondaryButtonClickAction secondaryButtonClickAction = (SecondaryButtonClickAction) obj;
                return Intrinsics.LJFF(this.params, secondaryButtonClickAction.params) && Intrinsics.LJFF(this.fragment, secondaryButtonClickAction.fragment);
            }

            public int hashCode() {
                return (hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SecondaryButtonClickAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment.PIIBindPromptActions
            public BaseI18nLoginFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment.PIIBindPromptActions
            public C1238030iK1 getParams() {
                return this.params;
            }

            public SecondaryButtonClickAction(C1238030iK1 c1238030iK1, BaseI18nLoginFragment baseI18nLoginFragment) {
                this.params = c1238030iK1;
                this.fragment = baseI18nLoginFragment;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Context context;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.qfw);
            } else {
                viewFindViewById = null;
            }
            this.LLLIILIL = (ConstraintLayout) viewFindViewById;
        }
        ((ViewGroup) viewFindViewById).getLayoutTransition().setDuration(100L);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && (string = arguments.getString("pii_value")) != null) {
            C786410Ut5.LLLLZLL(VS(), 0);
            VS().setText(string);
            C1238240iKM c1238240iKMXS = XS();
            int visibility = c1238240iKMXS.getVisibility();
            c1238240iKMXS.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1238240iKMXS);
            C786410Ut5.LLLLZLL(NS(), 8);
            if (((Boolean) this.LLLL.getValue()).booleanValue() && (context = getContext()) != null) {
                TuxTextView tuxTextViewVS = VS();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_pen;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                tuxTextViewVS.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, c419910GdJ.LIZ(context), (Drawable) null);
                C786410Ut5.h9(VS(), new ACListenerS154S0100000_19(this, 79));
            }
        } else {
            C786410Ut5.LLLLZLL(VS(), 8);
            C1238240iKM c1238240iKMXS2 = XS();
            int visibility2 = c1238240iKMXS2.getVisibility();
            c1238240iKMXS2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, c1238240iKMXS2);
            c1238240iKMXS2.LIZIZ();
            c1238240iKMXS2.setOnCountryCodeChanged(new AwS563S0100000_19(c1238240iKMXS2, 4));
            c1238240iKMXS2.getEditText().addTextChangedListener(new C1266010j39(this, c1238240iKMXS2, 0));
            Context context2 = getContext();
            if (context2 != null) {
                TuxTextView tuxTextViewNS = NS();
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_chevron_right_slim_thin_ltr;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                tuxTextViewNS.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, c419910GdJ2.LIZ(context2), (Drawable) null);
            }
            ThirdPartyDeprecationExperiment5.LIZ.getClass();
            if (ThirdPartyDeprecationExperiment5.LIZ(ThirdPartyDeprecationExperiment5.GuidanceActions.LOGOUT_PII_BINDING_SKIPPABLE, null)) {
                C786410Ut5.LLLLZLL(NS(), 0);
                C786410Ut5.h9(NS(), new ACListenerS154S0100000_19(this, 78));
            } else {
                C786410Ut5.LLLLZLL(NS(), 8);
            }
            C197039127h c197039127hPS = PS();
            if (C2204961BRm.LLJILLL(XS().getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEFfd75DVD64FuiJsGA6i/lfYhKJhadLrM+g==", null)).toString().length() > 0) {
                z = true;
            }
            c197039127hPS.setEnabled(z);
        }
        C786410Ut5.U8(PS(), new ACListenerS154S0100000_19(this, 76));
        C786410Ut5.h9(QS(), new ACListenerS154S0100000_19(this, 77));
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        if (XS().getVisibility() == 0) {
            XS().LIZJ(str);
            return;
        }
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }
}
