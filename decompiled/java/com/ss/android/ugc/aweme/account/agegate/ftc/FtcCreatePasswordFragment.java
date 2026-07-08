package com.ss.android.ugc.aweme.account.agegate.ftc;

import X.AbstractC850450XXv;
import X.C01GW;
import X.C0C64;
import X.C0XGR;
import X.C0XQZ;
import X.C0XT2;
import X.C0XT3;
import X.C0XT5;
import X.C0XZ4;
import X.C1232150iAX;
import X.C1237010iIN;
import X.C1239720iMk;
import X.C1389890mGx;
import X.C19241810Po;
import X.C19EG;
import X.C20684815ws;
import X.C21405318pn;
import X.C2187451AjH;
import X.C424320GkQ;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C849160XSw;
import X.C851690Xb5;
import X.C854830Xg9;
import X.EnumC851670Xb3;
import X.EnumC852910Xd3;
import X.InterfaceC21405418po;
import X.InterfaceC849170XSx;
import Y.ACListenerS148S0100000_13;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.applog.AppLog;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.experiment.FlushETBeforeLoginExperimentConfig;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes14.dex */
public final class FtcCreatePasswordFragment extends BaseI18nLoginFragment implements InterfaceC849170XSx, InterfaceC21405418po {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiKCg2HELIOSLyQ4LGE1PCZiDzswCzcpKDs2GCQ/Ojg8OiEKOy40JSAiPQ==";
    public C424320GkQ LLLIILIL;
    public C21405318pn LLLIL;
    public C851690Xb5 LLLILZ;
    public C851690Xb5 LLLILZJ;
    public C851690Xb5 LLLILZLLLI;
    public C1239720iMk LLLIZZ;
    public TuxTextView LLLJ;
    public C0XT2 LLLJIL;
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 29));
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 30));
    public final C01GW LLLLII = C452501pT.LIZIZ(new AwS557S0100000_13(this, 28));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 27));

    @Override // X.InterfaceC849170XSx
    public final void c0() {
        C0XQZ.LIZJ(false);
        if (((Number) this.LLLLII.getValue()).intValue() == 0) {
            SmartRouter.buildRoute(this, "aweme://hyd_action/video_export_complete?is_kids_mode=1").open();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC852910Xd3.DELETE_VIDEO_ALERT.getValue());
        C786410Ut5.LJJJI("enter_from", "from_kids_account_page", arguments);
        arguments.putInt("is_kids", 1);
        arguments.putBoolean("finish_before_jump", true);
        fo(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.y6;
    }

    public final C851690Xb5 NS() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ina) : null;
            this.LLLILZ = (C851690Xb5) viewFindViewById;
        }
        return (C851690Xb5) viewFindViewById;
    }

    public final C851690Xb5 PS() {
        View viewFindViewById = this.LLLILZLLLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.inb) : null;
            this.LLLILZLLLI = (C851690Xb5) viewFindViewById;
        }
        return (C851690Xb5) viewFindViewById;
    }

    public final C851690Xb5 QS() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.inc) : null;
            this.LLLILZJ = (C851690Xb5) viewFindViewById;
        }
        return (C851690Xb5) viewFindViewById;
    }

    public final C1239720iMk RS() {
        View viewFindViewById = this.LLLIZZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.inh) : null;
            this.LLLIZZ = (C1239720iMk) viewFindViewById;
        }
        return (C1239720iMk) viewFindViewById;
    }

    public final C21405318pn US() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ini) : null;
            this.LLLIL = (C21405318pn) viewFindViewById;
        }
        return (C21405318pn) viewFindViewById;
    }

    public final boolean VS() {
        return ((Boolean) this.LLLJL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return new C1237010iIN(((Boolean) this.LLLLIIIILLL.getValue()).booleanValue() ? getString(2131829374) : " ", null, !VS(), getString(2131828645), null, false, null, false, false, null, false, null, null, null, null, 67100382);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        C20684815ws.LJIILLIIL("exit_create_password_page", c0xgr.LIZ);
        return VS();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        C1239720iMk c1239720iMkRS = RS();
        if (c1239720iMkRS != null) {
            c1239720iMkRS.LIZIZ(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0XSz] */
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
    public final void XS() {
        String text;
        C21405318pn c21405318pnUS = US();
        if (c21405318pnUS == null || (text = c21405318pnUS.getText()) == null) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131848735);
            c1389890mGx.LJIIJJI();
            return;
        }
        HS();
        C0XT2 c0xt2 = this.LLLJIL;
        C0XT2 c0xt22 = c0xt2 != null ? c0xt2 : null;
        String str = (String) this.LLLL.getValue();
        if (c0xt22.LIZIZ) {
            C0XT3 c0xt3 = c0xt22.LJ;
            final AwS557S0100000_13 awS557S0100000_13 = new AwS557S0100000_13(c0xt22, 136);
            final AwS592S0100000_13 awS592S0100000_13 = new AwS592S0100000_13(c0xt22, 51);
            c0xt3.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            C0XZ4.LIZ.getClass();
            linkedHashMap.putAll(C0XZ4.LJIIL());
            c0xt3.LIZ.LJIIIZ(text, linkedHashMap, new AbstractC850450XXv() { // from class: X.0XXy
                @Override // X.AbstractC846040XGw
                public final void LIZ(C0XGA c0xga) {
                    String str2;
                    if (c0xga != null && c0xga.LIZIZ) {
                        awS557S0100000_13.invoke();
                        return;
                    }
                    Function1<String, Unit> function1 = awS592S0100000_13;
                    if (c0xga != null) {
                        str2 = c0xga.LJFF;
                    } else {
                        str2 = null;
                    }
                    function1.invoke(str2);
                }
            });
            return;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FlushETBeforeLoginExperimentConfig flushETBeforeLoginExperimentConfig = C849160XSw.LIZ;
        FlushETBeforeLoginExperimentConfig flushETBeforeLoginExperimentConfig2 = (FlushETBeforeLoginExperimentConfig) c0c64LJIILLIIL.LJJII(FlushETBeforeLoginExperimentConfig.class, flushETBeforeLoginExperimentConfig, "flush_kids_et_before_login", true);
        if (flushETBeforeLoginExperimentConfig2 == null) {
            flushETBeforeLoginExperimentConfig2 = flushETBeforeLoginExperimentConfig;
        }
        if (flushETBeforeLoginExperimentConfig2.isEnable) {
            FlushETBeforeLoginExperimentConfig flushETBeforeLoginExperimentConfig3 = (FlushETBeforeLoginExperimentConfig) C0C64.LJIILLIIL().LJJII(FlushETBeforeLoginExperimentConfig.class, flushETBeforeLoginExperimentConfig, "flush_kids_et_before_login", true);
            if (flushETBeforeLoginExperimentConfig3 != null) {
                flushETBeforeLoginExperimentConfig = flushETBeforeLoginExperimentConfig3;
            }
            AppLog.forceTimeoutReportSync(flushETBeforeLoginExperimentConfig.timeOut);
        }
        C0XT3 c0xt32 = c0xt22.LJ;
        if (str == null) {
            str = "";
        }
        final AwS592S0100000_13 awS592S0100000_132 = new AwS592S0100000_13(c0xt22, 52);
        final AwS592S0100000_13 awS592S0100000_133 = new AwS592S0100000_13(c0xt22, 53);
        c0xt32.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("rules_version", "v2");
        C0XZ4.LIZ.getClass();
        linkedHashMap2.putAll(C0XZ4.LJIIL());
        c0xt32.LIZIZ.LJIIIZ(str, text, linkedHashMap2, new C0XT5() { // from class: X.0XSz
            @Override // X.C0XH7
            /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
            public final void LJI(C0XT7<C849250XTf> c0xt7) {
                if (c0xt7 != null) {
                    Function1<C0XT7<C849250XTf>, Unit> function1 = awS592S0100000_132;
                    T t = c0xt7.LJIIIZ;
                    if (t != 0 && ((C849250XTf) t).LJIIIIZZ != null) {
                        function1.invoke(c0xt7);
                        return;
                    }
                }
                awS592S0100000_133.invoke(c0xt7);
            }

            @Override // X.C0XH7
            /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
            public final void LJ(C0XT7<C849250XTf> c0xt7, int i) {
                awS592S0100000_133.invoke(c0xt7);
            }
        });
        C20684815ws.LJIILLIIL("click_create_password_next", new C0XGR().LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        C1239720iMk c1239720iMkRS = RS();
        if (c1239720iMkRS != null) {
            c1239720iMkRS.LIZ(true);
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
    }

    @Override // X.InterfaceC849170XSx
    public final void dq() {
        C19EG activity = getActivity();
        if (activity != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C786410Ut5.LJJJI("platform", "account", arguments);
            ((ActionResultModel) ViewModelProviders.of(activity).get(ActionResultModel.class)).LLILLJJLI.postValue(arguments);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(FtcCreatePasswordFragment.class.getName());
        }
        super.onResume();
        C1232150iAX.LIZ(US().getEditText());
    }

    public static EnumC851670Xb3 YS(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return EnumC851670Xb3.Success;
        }
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            return EnumC851670Xb3.Error;
        }
        return EnumC851670Xb3.None;
    }

    @Override // X.InterfaceC21405418po
    public final void Ey(int i) {
        if (i != 4) {
            if (i == 5) {
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZ(0, "is_show");
                c0xgr.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
                C20684815ws.LJIILLIIL("tap_show_password", c0xgr.LIZ);
                return;
            }
            return;
        }
        C0XGR c0xgr2 = new C0XGR();
        c0xgr2.LIZ(1, "is_show");
        c0xgr2.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        C20684815ws.LJIILLIIL("tap_show_password", c0xgr2.LIZ);
    }

    @Override // X.InterfaceC849170XSx
    public final void LJIIJ(String str) {
        aS();
        if (str != null) {
            pn(0, str);
        }
    }

    @Override // X.InterfaceC849170XSx
    public final void Zq(Boolean bool) {
        C851690Xb5 c851690Xb5NS = NS();
        if (c851690Xb5NS != null) {
            c851690Xb5NS.setVariant(YS(bool));
        }
    }

    @Override // X.InterfaceC849170XSx
    public final void mF(Boolean bool) {
        C851690Xb5 c851690Xb5PS = PS();
        if (c851690Xb5PS != null) {
            c851690Xb5PS.setVariant(YS(bool));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLLJIL = new C0XT2(this, VS(), m8(), Fb(), getEnterMethod(), getEnterFrom());
    }

    @Override // X.InterfaceC849170XSx
    public final void ss(boolean z) {
        C1239720iMk c1239720iMkRS = RS();
        if (c1239720iMkRS != null) {
            c1239720iMkRS.setEnabled(z);
        }
    }

    @Override // X.InterfaceC849170XSx
    public final void sw(Boolean bool) {
        C851690Xb5 c851690Xb5QS = QS();
        if (c851690Xb5QS != null) {
            c851690Xb5QS.setVariant(YS(bool));
        }
    }

    @Override // X.InterfaceC849170XSx
    public final void C1(Integer num, Integer num2) {
        aS();
        if (num2 != null) {
            pn(0, getString(num2.intValue()));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EditText editText;
        EditText editText2;
        super.onViewCreated(view, bundle);
        if (VS()) {
            C0XQZ.LIZJ(true);
        }
        C21405318pn c21405318pnUS = US();
        if (c21405318pnUS != null) {
            c21405318pnUS.LIZJ(4, 1);
        }
        C851690Xb5 c851690Xb5NS = NS();
        if (c851690Xb5NS != null) {
            c851690Xb5NS.setDesc(getString(2131828641));
        }
        C851690Xb5 c851690Xb5QS = QS();
        if (c851690Xb5QS != null) {
            c851690Xb5QS.setDesc(getString(2131828642));
        }
        C851690Xb5 c851690Xb5PS = PS();
        if (c851690Xb5PS != null) {
            c851690Xb5PS.setDesc(getString(2131828643));
        }
        C21405318pn c21405318pnUS2 = US();
        if (c21405318pnUS2 != null) {
            c21405318pnUS2.setListener(this);
        }
        C21405318pn c21405318pnUS3 = US();
        if (c21405318pnUS3 != null && (editText2 = c21405318pnUS3.getEditText()) != null) {
            editText2.addTextChangedListener(new TextWatcher() { // from class: X.0XT1
                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    C0XT2 c0xt2 = this.LL.LLLJIL;
                    if (c0xt2 == null) {
                        c0xt2 = null;
                    }
                    String strValueOf = String.valueOf(editable);
                    c0xt2.getClass();
                    boolean z = true;
                    if (strValueOf.length() == 0) {
                        c0xt2.LIZ.Zq(null);
                        c0xt2.LIZ.sw(null);
                        c0xt2.LIZ.mF(null);
                        c0xt2.LIZ.ss(false);
                        return;
                    }
                    c0xt2.LJ.getClass();
                    boolean zMatches = PatternProtector.compile("^.{8,20}$").matcher(strValueOf).matches();
                    c0xt2.LJ.getClass();
                    boolean zMatches2 = PatternProtector.compile("^(?=.*?\\d)(?=.*?[a-zA-Z]).+$").matcher(strValueOf).matches();
                    c0xt2.LJ.getClass();
                    boolean zMatches3 = PatternProtector.compile("^.*[_~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\].*$").matcher(strValueOf).matches();
                    c0xt2.LIZ.Zq(Boolean.valueOf(zMatches));
                    c0xt2.LIZ.sw(Boolean.valueOf(zMatches2));
                    c0xt2.LIZ.mF(Boolean.valueOf(zMatches3));
                    InterfaceC849170XSx interfaceC849170XSx = c0xt2.LIZ;
                    if (!zMatches || !zMatches2 || !zMatches3) {
                        z = false;
                    }
                    interfaceC849170XSx.ss(z);
                }
            });
        }
        C21405318pn c21405318pnUS4 = US();
        if (c21405318pnUS4 != null && (editText = c21405318pnUS4.getEditText()) != null) {
            q0.LJIJ(editText, new C854830Xg9(this, 0));
        }
        GS(new ACListenerS148S0100000_13(this, 6), RS());
        String enterFrom = getEnterFrom();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", enterFrom);
        c0xgr.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        C20684815ws.LJIILLIIL("show_create_password_page", c0xgr.LIZ);
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.inj);
            } else {
                viewFindViewById = null;
            }
            this.LLLIILIL = (C424320GkQ) viewFindViewById;
        }
        C424320GkQ c424320GkQ = (C424320GkQ) viewFindViewById;
        if (c424320GkQ != null) {
            c424320GkQ.LIZIZ(str);
        }
    }
}
