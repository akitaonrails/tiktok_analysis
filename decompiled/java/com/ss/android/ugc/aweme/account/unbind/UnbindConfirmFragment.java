package com.ss.android.ugc.aweme.account.unbind;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C03BF;
import X.C03BG;
import X.C098200Yq;
import X.C0OM1;
import X.C0XQ5;
import X.C1235310iFd;
import X.C1235320iFe;
import X.C1251150ifB;
import X.C1389890mGx;
import X.C13LP;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C444920HcY;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C814420VxA;
import X.C852810Xct;
import X.C853770XeR;
import X.C854460XfY;
import X.DialogC1389620mGW;
import X.EnumC1235130iFL;
import X.EnumC1235140iFM;
import X.EnumC1235160iFO;
import X.EnumC1235170iFP;
import X.EnumC1235190iFR;
import X.EnumC1235200iFS;
import X.EnumC1235210iFT;
import X.EnumC1235220iFU;
import X.EnumC1235240iFW;
import X.EnumC1235260iFY;
import X.EnumC1235270iFZ;
import X.EnumC852910Xd3;
import X.InterfaceC1235380iFk;
import X.InterfaceC853790XeT;
import Y.ACListenerS154S0100000_19;
import Y.AObserverS223S0100000_19;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ExitUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ShowUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class UnbindConfirmFragment extends BaseAccountFlowFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiPCExISsoZxo9KiwiLQw8JiMlOyIVOiQrJCo9PA==";
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public RecyclerView LLJJLIIIJLLLLLLLZ;
    public TuxNavBar LLJL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 105));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 363));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 362));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 358));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 360));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 359));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 361));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 365));
    public DialogC1389620mGW LLLF;
    public C03BF LLLFF;

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String ZR() {
        return "UnbindConfirmFragment";
    }

    @Override // X.C0XYD
    public final void dk(int i) {
    }

    public final String aS() {
        return (String) this.LLL.getValue();
    }

    public final TuxTextView bS() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.unbind_confirm_conclusion) : null;
            this.LLJJJJLIIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView cS() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.unbind_confirm_continue) : null;
            this.LLJJL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView dS() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.unbind_confirm_subtitle) : null;
            this.LLJJJJJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView gS() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.unbind_confirm_title) : null;
            this.LLJJJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final boolean hS() {
        return ((Boolean) this.LLJLL.getValue()).booleanValue();
    }

    public final boolean iS() {
        return ((Boolean) this.LLJLIL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        kS(EnumC1235240iFW.GO_BACK);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DialogC1389620mGW dialogC1389620mGW = this.LLLF;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.hide();
        }
        super.onDestroyView();
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
    }

    public final void qS() {
        C853770XeR c853770XeR = C853770XeR.LIZ;
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 366);
        C854460XfY.LIZ.getClass();
        C853770XeR.LJ(c853770XeR, this, "auto_system", awS563S0100000_19, C854460XfY.LJIIJJI(this), null, new AwS563S0100000_19(this, 367), 16);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(UnbindConfirmFragment.class.getName());
        }
        super.onResume();
        C19EG activity = getActivity();
        KeyboardUtils.LIZIZ(activity != null ? activity.getCurrentFocus() : null);
    }

    public static abstract class UnbindConfirmActions implements InterfaceC853790XeT<InterfaceC1235380iFk> {
        public static final int $stable = 8;
        public final InterfaceC1235380iFk params;

        public abstract BaseAccountFlowFragment getFragment();

        public static final class ClickContinueAction extends UnbindConfirmActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C1235310iFd params;

            public final ClickContinueAction copy(C1235310iFd c1235310iFd, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new ClickContinueAction(c1235310iFd, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickContinueAction)) {
                    return false;
                }
                ClickContinueAction clickContinueAction = (ClickContinueAction) obj;
                return Intrinsics.LJFF(this.params, clickContinueAction.params) && Intrinsics.LJFF(this.fragment, clickContinueAction.fragment);
            }

            public int hashCode() {
                return (hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickContinueAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.unbind.UnbindConfirmFragment.UnbindConfirmActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.unbind.UnbindConfirmFragment.UnbindConfirmActions
            /* JADX INFO: renamed from: getParams, reason: merged with bridge method [inline-methods] */
            public C1235310iFd mo159getParams() {
                return this.params;
            }

            public ClickContinueAction(C1235310iFd c1235310iFd, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c1235310iFd);
                this.params = c1235310iFd;
                this.fragment = baseAccountFlowFragment;
            }
        }

        @Override // 
        /* JADX INFO: renamed from: getParams */
        public InterfaceC1235380iFk mo159getParams() {
            return this.params;
        }

        public UnbindConfirmActions(InterfaceC1235380iFk interfaceC1235380iFk) {
            this.params = interfaceC1235380iFk;
        }
    }

    public static void nS(TuxTextView tuxTextView) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.W5(tuxTextView, marginLayoutParams);
    }

    public final void kS(EnumC1235240iFW enumC1235240iFW) {
        EnumC1235260iFY enumC1235260iFY;
        EnumC1235170iFP enumC1235170iFP;
        EnumC1235160iFO enumC1235160iFO;
        EnumC1235140iFM enumC1235140iFM;
        ExitUnlinkPhoneEmailConfirmPageEvent exitUnlinkPhoneEmailConfirmPageEvent = new ExitUnlinkPhoneEmailConfirmPageEvent();
        if (iS()) {
            enumC1235260iFY = EnumC1235260iFY.NULL;
        } else {
            C853770XeR.LIZ.getClass();
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getBoolean("is_email_verified")) {
                enumC1235260iFY = EnumC1235260iFY.DIGITAL_1;
            } else {
                enumC1235260iFY = EnumC1235260iFY.DIGITAL_0;
            }
        }
        exitUnlinkPhoneEmailConfirmPageEvent.LJI(enumC1235260iFY.getValue(), "is_email_verified");
        exitUnlinkPhoneEmailConfirmPageEvent.LJI(enumC1235240iFW.getValue(), "exit_method");
        if (((Boolean) this.LLJLILLLLZIIL.getValue()).booleanValue()) {
            enumC1235170iFP = EnumC1235170iFP.YES;
        } else {
            enumC1235170iFP = EnumC1235170iFP.NO;
        }
        exitUnlinkPhoneEmailConfirmPageEvent.LJIIJJI(enumC1235170iFP);
        if (hS()) {
            enumC1235160iFO = EnumC1235160iFO.DIGITAL_1;
        } else {
            enumC1235160iFO = EnumC1235160iFO.DIGITAL_0;
        }
        exitUnlinkPhoneEmailConfirmPageEvent.LJIIJ(enumC1235160iFO);
        exitUnlinkPhoneEmailConfirmPageEvent.LJI(EnumC1235130iFL.UNLINK.getValue(), "action_type");
        if (iS()) {
            enumC1235140iFM = EnumC1235140iFM.PHONE;
        } else {
            enumC1235140iFM = EnumC1235140iFM.EMAIL;
        }
        exitUnlinkPhoneEmailConfirmPageEvent.LJI(enumC1235140iFM.getValue(), "unlink_type");
        exitUnlinkPhoneEmailConfirmPageEvent.LJIIIIZZ();
    }

    public final void oS(List<? extends VerificationMethodType> list) {
        VerificationMethodType verificationMethodType = (VerificationMethodType) C13LP.LJJJLL(list);
        if (verificationMethodType != null) {
            int i = C1235320iFe.LIZ[verificationMethodType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        User userLIZJ = C0XQ5.LIZJ();
                        Bundle arguments = getArguments();
                        if (arguments != null) {
                            if (iS()) {
                                arguments.putInt("next_page", EnumC852910Xd3.UNBIND_PHONE_VERIFY_USING_PASSWORD.getValue());
                                C852810Xct c852810Xct = C852810Xct.LIZ;
                                String bindPhone = userLIZJ.getBindPhone();
                                c852810Xct.getClass();
                                C852810Xct.LJIJI(arguments, bindPhone);
                            } else {
                                arguments.putInt("next_page", EnumC852910Xd3.UNBIND_EMAIL_VERIFY_USING_PASSWORD.getValue());
                                C852810Xct c852810Xct2 = C852810Xct.LIZ;
                                String email = userLIZJ.getEmail();
                                c852810Xct2.getClass();
                                C852810Xct.LJIILLIIL(arguments, email);
                            }
                        } else {
                            arguments = new Bundle();
                        }
                        fo(arguments);
                        return;
                    }
                } else {
                    C853770XeR c853770XeR = C853770XeR.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 3178);
                    C854460XfY.LIZ.getClass();
                    Map mapLJIIJJI = C854460XfY.LJIIJJI(this);
                    AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(this, 3179);
                    c853770XeR.getClass();
                    C853770XeR.LIZJ(this, "user_click", awS563S0100000_19, mapLJIIJJI, awS563S0100000_192);
                    return;
                }
            } else {
                qS();
                return;
            }
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131835079);
        c1389890mGx.LJIIJJI();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.03BF] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        final String[] strArr;
        EnumC1235190iFR enumC1235190iFR;
        EnumC1235270iFZ enumC1235270iFZ;
        EnumC1235210iFT enumC1235210iFT;
        EnumC1235220iFU enumC1235220iFU;
        super.onCreate(bundle);
        if (iS()) {
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(getString(2131857874), getString(2131857875), getString(2131857876), getString(2131857877), getString(2131857878));
            if (hS()) {
                listLJIILJJIL.add(getString(2131827408));
            }
            strArr = (String[]) listLJIILJJIL.toArray(new String[0]);
        } else {
            List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(getString(2131857860), getString(2131857861), getString(2131857862), getString(2131857863));
            if (hS()) {
                listLJIILJJIL2.add(getString(2131827406));
            }
            strArr = (String[]) listLJIILJJIL2.toArray(new String[0]);
        }
        this.LLLFF = new AbstractC21673619ry<C03BG>(strArr) { // from class: X.03BF
            public final String[] LL;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return this.LL.length;
            }

            {
                this.LL = strArr;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C03BG c03bg = (C03BG) viewHolder;
                c03bg.LL.setText(this.LL[i]);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                Context context = c03bg.itemView.getContext();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_x_mark_small;
                c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.zs, context);
                c419910GdJ.LIZIZ = iLIZIZ;
                c419910GdJ.LIZJ = iLIZIZ;
                c03bg.LLILLJJLI.setCompoundDrawablesWithIntrinsicBounds(c419910GdJ.LIZ(context), (Drawable) null, (Drawable) null, (Drawable) null);
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C03BG c03bg = new C03BG(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.z1, viewGroup, false));
                try {
                    View view = c03bg.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c03bg.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c03bg.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C03BG.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c03bg.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c03bg.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C03BG.class.getName();
                return c03bg;
            }
        };
        Context context = getContext();
        if (context != null) {
            this.LLLF = new DialogC1389620mGW(context);
        }
        ShowUnlinkPhoneEmailConfirmPageEvent showUnlinkPhoneEmailConfirmPageEvent = new ShowUnlinkPhoneEmailConfirmPageEvent();
        if (iS()) {
            enumC1235190iFR = EnumC1235190iFR.PHONE;
        } else {
            enumC1235190iFR = EnumC1235190iFR.EMAIL;
        }
        showUnlinkPhoneEmailConfirmPageEvent.LJI(enumC1235190iFR.getValue(), "unlink_type");
        if (iS()) {
            enumC1235270iFZ = EnumC1235270iFZ.NULL;
        } else {
            C853770XeR.LIZ.getClass();
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getBoolean("is_email_verified")) {
                enumC1235270iFZ = EnumC1235270iFZ.DIGITAL_1;
            } else {
                enumC1235270iFZ = EnumC1235270iFZ.DIGITAL_0;
            }
        }
        showUnlinkPhoneEmailConfirmPageEvent.LJI(enumC1235270iFZ.getValue(), "is_email_verified");
        if (((Boolean) this.LLJLILLLLZIIL.getValue()).booleanValue()) {
            enumC1235210iFT = EnumC1235210iFT.YES;
        } else {
            enumC1235210iFT = EnumC1235210iFT.NO;
        }
        showUnlinkPhoneEmailConfirmPageEvent.LJI(Integer.valueOf(enumC1235210iFT.getValue()), "is_env_safe");
        if (hS()) {
            enumC1235220iFU = EnumC1235220iFU.DIGITAL_1;
        } else {
            enumC1235220iFU = EnumC1235220iFU.DIGITAL_0;
        }
        showUnlinkPhoneEmailConfirmPageEvent.LJI(Integer.valueOf(enumC1235220iFU.getValue()), "is_2sv_on");
        showUnlinkPhoneEmailConfirmPageEvent.LJI(EnumC1235200iFS.UNLINK.getValue(), "action_type");
        showUnlinkPhoneEmailConfirmPageEvent.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        super.onViewCreated(view, bundle);
        OR().LLILZIL.observe(getViewLifecycleOwner(), new AObserverS223S0100000_19(this, 71));
        User userLIZJ = C0XQ5.LIZJ();
        if (iS()) {
            gS().setText(getString(2131823022));
            dS().setText(getString(2131823014, userLIZJ.getBindPhone()));
            gS().setTuxFont(123);
            TuxTextView tuxTextViewBS = bS();
            String string3 = getString(2131827833);
            if (((Boolean) this.LLJZ.getValue()).booleanValue()) {
                if (((Boolean) this.LLJZIJLIL.getValue()).booleanValue()) {
                    string2 = getString(2131823016, string3, aS());
                } else {
                    string2 = getString(2131823020, string3);
                }
            } else {
                string2 = getString(2131823021, aS());
            }
            SpannableString spannableString = new SpannableString(string2);
            mS(spannableString, string2, string3);
            mS(spannableString, string2, aS());
            tuxTextViewBS.setText(spannableString);
        } else {
            gS().setText(getString(2131857376));
            dS().setText(getString(2131823015, userLIZJ.getEmail()));
            gS().setTuxFont(123);
            TuxTextView tuxTextViewBS2 = bS();
            String string4 = getString(2131827834);
            if (((Boolean) this.LLJLLL.getValue()).booleanValue()) {
                if (((Boolean) this.LLJZIJLIL.getValue()).booleanValue()) {
                    string = getString(2131823018, string4, aS());
                } else {
                    string = getString(2131823017, string4);
                }
            } else {
                string = getString(2131823019, aS());
            }
            SpannableString spannableString2 = new SpannableString(string);
            mS(spannableString2, string, string4);
            mS(spannableString2, string, aS());
            tuxTextViewBS2.setText(spannableString2);
        }
        cS().setBackgroundResource(R.drawable.acp);
        cS().setText(R.string.s27);
        nS(bS());
        nS(dS());
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.unbind_confirm_reason_container);
            } else {
                viewFindViewById = null;
            }
            this.LLJJLIIIJLLLLLLLZ = (RecyclerView) viewFindViewById;
        }
        ((RecyclerView) viewFindViewById).setLayoutManager(new LinearLayoutManager(getContext()));
        View viewFindViewById3 = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.unbind_confirm_reason_container);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJLIIIJLLLLLLLZ = (RecyclerView) viewFindViewById3;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        C03BF c03bf = this.LLLFF;
        if (c03bf == null) {
            c03bf = null;
        }
        recyclerView.setAdapter(c03bf);
        C786410Ut5.h9(cS(), new ACListenerS154S0100000_19(this, 80));
        View view4 = this.LLJL;
        if (view4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById2 = view5.findViewById(R.id.btp);
            }
            this.LLJL = (TuxNavBar) viewFindViewById2;
            view4 = viewFindViewById2;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 364));
        c0om1.LJ(c1251150ifB);
        ((TuxNavBar) view4).setNavActions(c0om1);
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }

    public static void mS(SpannableString spannableString, String str, String str2) {
        int iLJJJ;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (iLJJJ = a0.LJJJ(str, str2, 0, false, 6)) != -1) {
            C786410Ut5.p2(spannableString, new C444920HcY(52, true), iLJJJ, str2.length() + iLJJJ, 33);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.yk, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
