package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC19483511Kn;
import X.C01GW;
import X.C098200Yq;
import X.C0HZQ;
import X.C0OM1;
import X.C0P0T;
import X.C0WW9;
import X.C0WWB;
import X.C0XGR;
import X.C0XQ5;
import X.C0XZ4;
import X.C0XZ7;
import X.C1236880iIA;
import X.C1236890iIB;
import X.C1236960iII;
import X.C1236990iIL;
import X.C1237120iIY;
import X.C1237190iIf;
import X.C1237200iIg;
import X.C1237220iIi;
import X.C1237240iIk;
import X.C1237260iIm;
import X.C1237270iIn;
import X.C1237680iJS;
import X.C1239250iLz;
import X.C1251150ifB;
import X.C1265910j2z;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1685300txQ;
import X.C1754640vlG;
import X.C189200o6;
import X.C19252910Tv;
import X.C19276210bA;
import X.C197039127h;
import X.C19713212Aw;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851360XaY;
import X.C851370XaZ;
import X.C851590Xav;
import X.C851660Xb2;
import X.C852170Xbr;
import X.C852510XcP;
import X.C852810Xct;
import X.C852940Xd6;
import X.C853660XeG;
import X.C854410XfT;
import X.C854460XfY;
import X.C985403tE;
import X.EnumC1237100iIW;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.EnumC854430XfV;
import X.InterfaceC1237210iIh;
import X.InterfaceC1237610iJL;
import X.InterfaceC1254030ijp;
import X.InterfaceC344240DeY;
import X.InterfaceC851550Xar;
import X.InterfaceC853790XeT;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS119S0100000_19;
import Y.AfS182S0100000_13;
import Y.AfS188S0100000_19;
import Y.AfS65S0201000_13;
import Y.AfS81S0101000_13;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.eventtracking.AutoKeystrokesCodeDetectedEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.ui.experiment.AlternativeChannel;
import com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class InputCodeFragment extends BaseAccountBindingsFlowFragment implements InterfaceC1237610iJL, View.OnClickListener, InterfaceC344240DeY, InterfaceC851550Xar {
    public static final C01GW<HashMap<String, Boolean>> LLLLZLLLI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(42));
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0HELIOSIStiP319PSxiLz0yLygpJzsgZgwiOTonCyooLAkhKSIhLCEn";
    public C1237680iJS LLLIL;
    public TuxTextView LLLILZ;
    public C1237240iIk LLLILZJ;
    public TuxTextView LLLILZLLLI;
    public TuxTextView LLLIZZ;
    public ConstraintLayout LLLJ;
    public C19713212Aw LLLJIL;
    public C197039127h LLLJL;
    public int LLLLIIIILLL;
    public C1237220iIi LLLLIIL;
    public boolean LLLLIILLL;
    public C0WWB LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public C852510XcP LLLLLIL;
    public boolean LLLLLILLIL;
    public boolean LLLLLJIL;
    public boolean LLLLLJLJLL;
    public C0HZQ LLLLLL;
    public LinearLayout LLLLLLIL;
    public Integer LLLLLLJ;
    public C0P0T LLLLLZ;
    public boolean LLLLLZIL;
    public long LLLLZIL;
    public String LLLL = "";
    public String LLLLII = "";
    public final long LLLLIILL = System.currentTimeMillis();
    public String LLLLJI = "";
    public String LLLLL = "";
    public final C01GW LLLLLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(43));
    public final C01GW LLLLLLLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(45));
    public final C01GW LLLLLLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 283));
    public final C01GW LLLLLLLZIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 73));
    public final C01GW LLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 281));
    public final C01GW LLLLLLZZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 274));
    public final C01GW LLLLLZL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(44));
    public final C01GW LLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 276));
    public final C01GW LLLLZI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 278));
    public final String LLLLZLL = "phone";
    public final C1237120iIY LLLLZLLIL = new C1236960iII() { // from class: X.0iIY
        @Override // X.InterfaceC1237230iIj
        public final void LIZLLL() {
            if (this.LL.isViewValid()) {
                this.LL.vT();
            }
        }

        @Override // X.InterfaceC1237230iIj
        public final void onStart() {
            this.LL.xT();
        }

        @Override // X.C1236960iII, X.InterfaceC1237230iIj
        public final void LJJI(long j) {
            if (this.LL.isViewValid()) {
                this.LL.DT(j);
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0e;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void LLIIIZ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer num = this.LLLLLLJ;
        if (num != null) {
            int iIntValue = num.intValue();
            TuxTextView tuxTextViewMS = mS();
            if (tuxTextViewMS != null) {
                ViewGroup.LayoutParams layoutParams = tuxTextViewMS.getLayoutParams();
                if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                    return;
                }
                marginLayoutParams.topMargin = iIntValue;
                C786410Ut5.R6(tuxTextViewMS, marginLayoutParams);
            }
        }
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 275));
        c0om1.LJ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark;
        c1251150ifB2.LIZJ(new AwS560S0100000_16(this, 49));
        c0om1.LIZIZ(c1251150ifB2);
        return c0om1;
    }

    public final void ZS() {
        TuxTextView tuxTextViewMS;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.LLLLLLJ == null && (tuxTextViewMS = mS()) != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextViewMS.getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            this.LLLLLLJ = Integer.valueOf(marginLayoutParams.topMargin);
        }
    }

    public final void eT() {
        View view;
        LinearLayout linearLayout;
        TuxTextView tuxTextViewMS;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LinearLayout linearLayout2 = this.LLLLLLIL;
        if (linearLayout2 == null || linearLayout2.getVisibility() != 0 || (view = getView()) == null || (linearLayout = this.LLLLLLIL) == null || (tuxTextViewMS = mS()) == null) {
            return;
        }
        ZS();
        int[] iArr = {R.id.tbo, R.id.kpo, R.id.dnx, R.id.kpl};
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            View viewFindViewById = view.findViewById(iArr[i]);
            if (viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
                int[] iArr2 = new int[2];
                viewFindViewById.getLocationInWindow(iArr2);
                iMax = Math.max(iMax, iArr2[1] + viewFindViewById.getHeight());
            }
        }
        if (iMax == Integer.MIN_VALUE) {
            return;
        }
        int[] iArr3 = new int[2];
        linearLayout.getLocationInWindow(iArr3);
        if (iArr3[1] - iMax < ((Number) this.LLLLLLLLL.getValue()).intValue()) {
            ViewGroup.LayoutParams layoutParams = tuxTextViewMS.getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.topMargin = ((Number) this.LLLLLLL.getValue()).intValue();
            C786410Ut5.R6(tuxTextViewMS, marginLayoutParams);
        }
    }

    public final C19713212Aw fT() {
        View viewFindViewById = this.LLLJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpc) : null;
            this.LLLJIL = (C19713212Aw) viewFindViewById;
        }
        return (C19713212Aw) viewFindViewById;
    }

    public final TuxTextView gT() {
        View viewFindViewById = this.LLLILZLLLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpd) : null;
            this.LLLILZLLLI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ConstraintLayout hT() {
        View viewFindViewById = this.LLLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpe) : null;
            this.LLLJ = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0159  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1237010iIN iS() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment.iS():X.0iIN");
    }

    public final TuxTextView iT() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpl) : null;
            this.LLLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1237240iIk jT() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpm) : null;
            this.LLLILZJ = (C1237240iIk) viewFindViewById;
        }
        return (C1237240iIk) viewFindViewById;
    }

    public final TuxTextView kT() {
        View viewFindViewById = this.LLLIZZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpo) : null;
            this.LLLIZZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final EnumC1237100iIW lT() {
        return this.LLLLLJIL ? EnumC1237100iIW.PHONE : EnumC1237100iIW.EMAIL;
    }

    public final C1237680iJS mT() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qgj) : null;
            this.LLLIL = (C1237680iJS) viewFindViewById;
        }
        return (C1237680iJS) viewFindViewById;
    }

    public final String nT() {
        return TextUtils.isEmpty(this.LLLLII) ? this.LLLL : this.LLLLII;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C0WW9 c0ww9;
        C0WWB c0wwb = this.LLLLIL;
        if (c0wwb != null && c0wwb.LIZ() && (c0ww9 = c0wwb.LIZIZ) != null) {
            try {
                C786410Ut5.LJJIFFI(c0ww9.LIZ, c0ww9);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    public final boolean pT() {
        return ((Boolean) this.LLLLZ.getValue()).booleanValue() || ((Boolean) this.LLLLZI.getValue()).booleanValue();
    }

    public final boolean rT() {
        return SMSPermissionCheckboxExp.INSTANCE.showCheckbox() && ((Boolean) this.LLLLLLZ.getValue()).booleanValue();
    }

    public final void CT() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZIZ(context.getString(2131829362));
        C985403tE.LIZ(c1397580mTM, AFwS257S0000000_19.get$arr$(60));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        C786410Ut5.w1(fT(), 0);
        fT().LIZIZ();
    }

    @Override // X.InterfaceC1237610iJL
    public final void LJJJLIIL() {
        if (isViewValid()) {
            C1237680iJS c1237680iJSMT = mT();
            c1237680iJSMT.getFormViewFromXml().setFooter(null);
            c1237680iJSMT.LLILLJJLI.LIZJ();
        }
    }

    @Override // X.InterfaceC1237610iJL
    public final void LJJLL() {
        String string;
        this.LLLLZIL = SystemClock.elapsedRealtime();
        if (this.LLLLIILLL) {
            ((C854410XfT) this.LLLLLZL.getValue()).LIZJ();
        }
        boolean z = true;
        if (TextUtils.isEmpty(this.LLLL) && (SR() != EnumC852660Xce.RECOVER_ACCOUNT || this.LLLLII.length() != 0)) {
            z = false;
        }
        this.LLLLLJIL = z;
        if (z) {
            C853660XeG c853660XeG = C853660XeG.LIZ;
            String enterFrom = getEnterFrom();
            String enterMethod = getEnterMethod();
            String strPR = PR();
            Bundle arguments = getArguments();
            String string2 = arguments != null ? arguments.getString("gsma_fail_reason") : null;
            c853660XeG.getClass();
            if (C853660XeG.LIZIZ > 0) {
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("enter_from", enterFrom);
                c0xgr.LIZLLL("enter_method", enterMethod);
                c0xgr.LIZLLL("login_panel_type", strPR);
                c0xgr.LIZIZ(System.currentTimeMillis() - C853660XeG.LIZIZ, "duration");
                if (string2 != null) {
                    c0xgr.LIZJ("gsma_fail_reason", string2);
                }
                C20684815ws.LJIILLIIL("sms_send_to_enter_code_timer", c0xgr.LIZ);
                C853660XeG.LIZIZ = -1L;
            }
            C0XGR c0xgr2 = new C0XGR();
            c0xgr2.LIZLLL("login_panel_type", PR());
            c0xgr2.LIZLLL("enter_from", getEnterFrom());
            c0xgr2.LIZLLL("enter_method", getEnterMethod());
            Bundle arguments2 = getArguments();
            c0xgr2.LIZLLL("page", arguments2 != null ? arguments2.getString("page") : null);
            C852810Xct.LIZ.getClass();
            c0xgr2.LIZLLL("3p_platform", C852810Xct.LIZ(this));
            c0xgr2.LIZLLL("config_key", C852810Xct.LIZJ(this));
            if (requireArguments().containsKey("is_register")) {
                c0xgr2.LIZ(requireArguments().getBoolean("is_register") ? 1 : 0, "is_register");
            }
            C852170Xbr c852170Xbr = C852170Xbr.LIZ;
            Bundle arguments3 = getArguments();
            c852170Xbr.getClass();
            C852170Xbr.LIZIZ(c0xgr2, C852170Xbr.LJFF(arguments3));
            C20684815ws.LJIILLIIL("start_sms_typing", c0xgr2.LIZ);
        } else {
            C0XGR c0xgr3 = new C0XGR();
            c0xgr3.LIZLLL("enter_from", getEnterFrom());
            c0xgr3.LIZLLL("enter_method", getEnterMethod());
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string = arguments4.getString("page")) == null) {
                string = "";
            }
            c0xgr3.LIZLLL("page", string);
            c0xgr3.LIZLLL("send_type", "code_and_link");
            C852810Xct.LIZ.getClass();
            c0xgr3.LIZLLL("3p_platform", C852810Xct.LIZ(this));
            c0xgr3.LIZLLL("config_key", C852810Xct.LIZJ(this));
            C20684815ws.LJIILLIIL("start_email_code_typing", c0xgr3.LIZ);
        }
        if (VR() == EnumC852910Xd3.PHONE_SMS_VERIFY) {
            XS(this.LLLLLJIL ? EnumC854430XfV.SMS : EnumC854430XfV.EMAIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        mT().getPinField().setEnabled(true);
        if (!C19276210bA.LIZJ()) {
            C786410Ut5.w1(fT(), 8);
            fT().LIZJ();
        } else {
            C1237680iJS c1237680iJSMT = mT();
            if (c1237680iJSMT != null) {
                HandlerHook.viewPostDelay(c1237680iJSMT, new ARunnableS119S0100000_19(this, 143), 16L);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
        this.LLLIZZ = null;
        this.LLLJ = null;
        this.LLLJIL = null;
        this.LLLJL = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void ln() {
        View view;
        if (rT() && (view = getView()) != null) {
            HandlerHook.viewPost(view, new ARunnableS119S0100000_19(this, 24));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C0HZQ c0hzq;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(InputCodeFragment.class.getName());
        }
        super.onResume();
        if (!rS() || (c0hzq = this.LLLF) == null) {
            return;
        }
        HandlerHook.viewPostDelay(c0hzq, new ARunnableS119S0100000_19(this, 23), 100L);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1754640vlG pinField = mT().getPinField();
        pinField.requestFocus();
        HandlerHook.viewPostDelay(pinField, new ARunnableS104S0100000_4(pinField, 11), 500L);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final List<View> qS() {
        return Collections.singletonList(hT());
    }

    public final void vT() {
        if (jT().getVisibility() != 8) {
            C786410Ut5.c(jT(), 8);
        }
        gT().setEnabled(true);
    }

    public final void xT() {
        if (jT().getVisibility() != 0) {
            C786410Ut5.c(jT(), 0);
        }
        gT().setEnabled(false);
    }

    public static abstract class InputCodeActions implements InterfaceC853790XeT<InterfaceC1237210iIh> {
        public static final int $stable = 8;
        public final InterfaceC1237210iIh params;

        public abstract InputCodeFragment getFragment();

        public static final class ClickResendPhoneCodeActionV1 extends InputCodeActions {
            public static final int $stable = 8;
            public final InputCodeFragment fragment;
            public final C1237200iIg params;

            public final ClickResendPhoneCodeActionV1 copy(C1237200iIg c1237200iIg, InputCodeFragment inputCodeFragment) {
                return new ClickResendPhoneCodeActionV1(c1237200iIg, inputCodeFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickResendPhoneCodeActionV1)) {
                    return false;
                }
                ClickResendPhoneCodeActionV1 clickResendPhoneCodeActionV1 = (ClickResendPhoneCodeActionV1) obj;
                return Intrinsics.LJFF(this.params, clickResendPhoneCodeActionV1.params) && Intrinsics.LJFF(this.fragment, clickResendPhoneCodeActionV1.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickResendPhoneCodeActionV1(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment.InputCodeActions
            public InputCodeFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment.InputCodeActions
            /* JADX INFO: renamed from: getParams, reason: merged with bridge method [inline-methods] */
            public C1237200iIg mo152getParams() {
                return this.params;
            }

            public ClickResendPhoneCodeActionV1(C1237200iIg c1237200iIg, InputCodeFragment inputCodeFragment) {
                super(c1237200iIg);
                this.params = c1237200iIg;
                this.fragment = inputCodeFragment;
            }
        }

        public static final class VerifyPhoneCodeActionV1 extends InputCodeActions {
            public static final int $stable = 8;
            public final InputCodeFragment fragment;
            public final C1237190iIf params;

            public final VerifyPhoneCodeActionV1 copy(C1237190iIf c1237190iIf, InputCodeFragment inputCodeFragment) {
                return new VerifyPhoneCodeActionV1(c1237190iIf, inputCodeFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifyPhoneCodeActionV1)) {
                    return false;
                }
                VerifyPhoneCodeActionV1 verifyPhoneCodeActionV1 = (VerifyPhoneCodeActionV1) obj;
                return Intrinsics.LJFF(this.params, verifyPhoneCodeActionV1.params) && Intrinsics.LJFF(this.fragment, verifyPhoneCodeActionV1.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VerifyPhoneCodeActionV1(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment.InputCodeActions
            public InputCodeFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment.InputCodeActions
            /* JADX INFO: renamed from: getParams */
            public C1237190iIf mo152getParams() {
                return this.params;
            }

            public VerifyPhoneCodeActionV1(C1237190iIf c1237190iIf, InputCodeFragment inputCodeFragment) {
                super(c1237190iIf);
                this.params = c1237190iIf;
                this.fragment = inputCodeFragment;
            }
        }

        @Override // 
        /* JADX INFO: renamed from: getParams */
        public InterfaceC1237210iIh mo152getParams() {
            return this.params;
        }

        public InputCodeActions(InterfaceC1237210iIh interfaceC1237210iIh) {
            this.params = interfaceC1237210iIh;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLZLL;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    public final void AT(String str) {
        View view;
        C0HZQ c0hzq;
        String string;
        TuxTextView tuxTextView;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupSmsCheckbox(");
        sbLIZ.append(str);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, str)) {
            LinearLayout linearLayout = this.LLLLLLIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            LinearLayout linearLayout2 = this.LLLLLLIL;
            if (linearLayout2 != null) {
                c0hzq = (C0HZQ) linearLayout2.findViewById(R.id.vmv);
            } else {
                c0hzq = null;
            }
            this.LLLLLL = c0hzq;
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_from", "input_code_page");
            c0xgr.LIZLLL("page_name", "input_code_page");
            int i2 = C852940Xd6.LIZ[VR().ordinal()];
            if (i2 != 1) {
                if (i2 != 5) {
                    string = VR().toString();
                } else {
                    string = "log_in";
                }
            } else {
                string = "sign_up";
            }
            c0xgr.LIZLLL("trigger", string);
            c0xgr.LIZLLL("show_type", "checkbox");
            c0xgr.LIZ(1, "mobile");
            C20684815ws.LJIILLIIL("tiktok_sms_popup_show", c0xgr.LIZ);
            C0HZQ c0hzq2 = this.LLLLLL;
            if (c0hzq2 != null) {
                C1236880iIA.LIZ(c0hzq2, getContext());
            }
            C0HZQ c0hzq3 = this.LLLLLL;
            if (c0hzq3 != null) {
                C786410Ut5.D7(c0hzq3, new C1265910j2z(this, 0));
            }
            LinearLayout linearLayout3 = this.LLLLLLIL;
            if (linearLayout3 != null && (tuxTextView = (TuxTextView) linearLayout3.findViewById(R.id.vn5)) != null) {
                C786410Ut5.h9(tuxTextView, new ACListenerS154S0100000_19(this, 65));
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                ET(arguments);
            }
        } else {
            LinearLayout linearLayout4 = this.LLLLLLIL;
            if (linearLayout4 != null) {
                C786410Ut5.LJZL(8, linearLayout4);
            }
        }
        C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LIZLLL(hT());
        if (Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, str) && (view = getView()) != null) {
            HandlerHook.viewPost(view, new ARunnableS119S0100000_19(this, 25));
        }
    }

    public final void DT(long j) {
        if (this.LLLLILI && j <= 50000 && kT().getVisibility() != 0 && VR() == EnumC852910Xd3.PHONE_SMS_SIGN_UP && !((AlternativeChannel) C1237260iIm.LIZJ.getValue()).enableSecondaryEntrance && !((AlternativeChannel) C1237270iIn.LIZJ.getValue()).enableSecondaryEntrance) {
            C786410Ut5.LLLLZLL(kT(), 0);
        }
    }

    public final void ET(Bundle bundle) {
        Boolean boolValueOf;
        LinearLayout linearLayout;
        boolean z = false;
        if (rT() && (linearLayout = this.LLLLLLIL) != null && linearLayout.getVisibility() == 0 && this.LLLLLL != null) {
            z = true;
        }
        bundle.putBoolean("need_upload_sms_consent_status", z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSmsConsentStatus(needUpload: ");
        sbLIZ.append(bundle.getBoolean("need_upload_sms_consent_status"));
        sbLIZ.append(", checked: ");
        C0HZQ c0hzq = this.LLLLLL;
        if (c0hzq != null) {
            boolValueOf = Boolean.valueOf(c0hzq.isChecked());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C0HZQ c0hzq2 = this.LLLLLL;
        if (c0hzq2 != null) {
            bundle.putBoolean("sms_checkbox_checked", c0hzq2.isChecked());
        }
    }

    public final boolean oT(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ('0' > cCharAt || cCharAt >= ':') {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        C1237220iIi c1237220iIi;
        String string = null;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.kpd) {
            this.LLLLLJLJLL = true;
            switch (C852940Xd6.LIZ[VR().ordinal()]) {
                case 1:
                case 5:
                    if (pT()) {
                        zT("resend");
                        return;
                    }
                    EnumC852660Xce enumC852660XceSR = SR();
                    EnumC852660Xce enumC852660Xce = EnumC852660Xce.RECOVER_ACCOUNT;
                    if (enumC852660XceSR == enumC852660Xce) {
                        C0XZ4 c0xz4 = C0XZ4.LIZ;
                        C852510XcP c852510XcP = this.LLLLLIL;
                        if (c852510XcP != null) {
                            string = c852510XcP.ticket;
                        }
                        C0XZ4.LJJIJ(c0xz4, this, this, string, enumC852660Xce, EnumC852910Xd3.PHONE_SMS_LOGIN, "resend").LJIIIIZZ(new AfS188S0100000_19(this, 62)).LJIILL();
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (SMSPermissionCheckboxExp.INSTANCE.showCheckbox()) {
                        linkedHashMap.put("query_sms_permission", "1");
                    }
                    if (((Boolean) this.LLLLLLLZIL.getValue()).booleanValue()) {
                        linkedHashMap.putAll(NR());
                    }
                    C0XZ4 c0xz42 = C0XZ4.LIZ;
                    String str = this.LLLL;
                    EnumC852660Xce enumC852660Xce2 = EnumC852660Xce.SIGN_UP;
                    EnumC852910Xd3 enumC852910Xd3VR = VR();
                    c0xz42.getClass();
                    C0XZ4.LJJIIZ(this, this, str, enumC852660Xce2, enumC852910Xd3VR, "", "resend", linkedHashMap).LJIIIIZZ(new AfS188S0100000_19(this, 60)).LJIILL();
                    return;
                case 2:
                    C0XZ4 c0xz43 = C0XZ4.LIZ;
                    String str2 = this.LLLLII;
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        string = arguments.getString("password");
                    }
                    C0XZ4.LJJIII(c0xz43, this, this, str2, 1, "resend", null, string, null, null, null, 896).LJIIIIZZ(new AfS188S0100000_19(this, 56)).LJIILL();
                    return;
                case 3:
                    C0XZ4 c0xz44 = C0XZ4.LIZ;
                    String str3 = this.LLLL;
                    EnumC852910Xd3 enumC852910Xd3VR2 = VR();
                    c0xz44.getClass();
                    C0XZ4.LJJIIJ(this, this, str3, enumC852910Xd3VR2, "resend", null, null).LJIIIIZZ(new AfS188S0100000_19(this, 57)).LJIILL();
                    return;
                case 4:
                    C0XZ4.LJJIII(C0XZ4.LIZ, this, this, this.LLLLII, 4, "resend", null, null, null, null, null, 960).LJIIIIZZ(new AfS188S0100000_19(this, 58)).LJIILL();
                    return;
                case 6:
                case 7:
                case 8:
                    if (OR().yQ2()) {
                        OR().wQ2(new InputCodeActions.ClickResendPhoneCodeActionV1(new C1237200iIg(this.LLLL), this));
                        return;
                    }
                    C0XZ4 c0xz45 = C0XZ4.LIZ;
                    String str4 = this.LLLL;
                    EnumC852660Xce enumC852660XceSR2 = SR();
                    EnumC852910Xd3 enumC852910Xd3VR3 = VR();
                    String str5 = this.LLLLJI;
                    String str6 = this.LLLLL;
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        string = arguments2.getString("page");
                    }
                    C854460XfY.LIZ.getClass();
                    C0XZ4.LJJ(c0xz45, this, this, str4, enumC852660XceSR2, enumC852910Xd3VR3, str5, str6, "resend", null, string, null, C854460XfY.LJIIJJI(this), 2816).LJIIIIZZ(new AfS188S0100000_19(this, 59)).LJIILL();
                    return;
                default:
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown step [");
                    sbLIZ.append(VR());
                    sbLIZ.append("] when trying to send codes");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == R.id.kpo) {
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("enter_from", getEnterFrom());
                c0xgr.LIZLLL("enter_method", getEnterMethod());
                C20684815ws.LJIILLIIL("request_phone_call", c0xgr.LIZ);
                if (this.LLLLILI && !TextUtils.isEmpty(this.LLLL)) {
                    C19EG activity = getActivity();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(nT());
                    sbLIZ2.append("_voice");
                    C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(activity, C2188811AlT.LIZIZ(sbLIZ2), SR());
                    if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
                        CT();
                        return;
                    }
                    this.LLLLJ = true;
                    C0XZ4 c0xz46 = C0XZ4.LIZ;
                    String str7 = this.LLLL;
                    EnumC852660Xce enumC852660XceSR3 = SR();
                    EnumC852910Xd3 enumC852910Xd3VR4 = VR();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    c0xz46.getClass();
                    C0XZ4.LJJIJIIJI(this, this, str7, false, enumC852660XceSR3, enumC852910Xd3VR4, "user_click", linkedHashMap2).LJIIIIZZ(new AfS188S0100000_19(this, 61)).LJIILL();
                    return;
                }
                return;
            }
            if (numValueOf.intValue() != R.id.kpl) {
                return;
            }
            C0XGR c0xgr2 = new C0XGR();
            c0xgr2.LIZLLL("enter_method", getEnterMethod());
            c0xgr2.LIZLLL("enter_from", getEnterFrom());
            c0xgr2.LIZLLL("login_panel_type", PR());
            c0xgr2.LIZLLL("page", RR());
            c0xgr2.LIZLLL("click", "log_in_with_password");
            c0xgr2.LIZLLL("platform", "phone");
            C20684815ws.LJIILLIIL("switch_to_password", c0xgr2.LIZ);
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                arguments3 = new Bundle();
            }
            Bundle bundle = new Bundle(arguments3);
            if (((Boolean) this.LLLLZ.getValue()).booleanValue()) {
                bundle.putInt("next_page", EnumC852910Xd3.EMAIL_OTP_LOGIN_SWITCH_TO_PASSWORD.getValue());
                C786410Ut5.LJJJI("passport_ticket", null, bundle);
            } else if (((Boolean) this.LLLLZI.getValue()).booleanValue()) {
                bundle.putInt("next_page", EnumC852910Xd3.PHONE_HL_LOGIN_SWITCH_TO_PASSWORD.getValue());
                C854460XfY.LIZ.getClass();
                C786410Ut5.LJJJI("passport_ticket", C854460XfY.LJIIJ(this), bundle);
            } else {
                bundle.putInt("next_page", EnumC852910Xd3.PHONE_PASSWORD_LOGIN.getValue());
            }
            bundle.putInt("current_scene", SR().getValue());
            bundle.putBoolean("recover_mobile_code", this.LLLLLILLIL);
            C786410Ut5.LJJIZ(bundle, "recover_account_data", this.LLLLLIL);
            fo(bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        boolean z;
        boolean z2;
        String string;
        String string2;
        Window window;
        Serializable serializable2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (serializable2 = arguments.getSerializable("args_phone_number")) != null) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIJ(this, (PhoneNumberUtil.PhoneNumber) serializable2);
        }
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        String string3 = null;
        switch (C852940Xd6.LIZ[VR().ordinal()]) {
            case 1:
            case 3:
            case 5:
            case 6:
            case 8:
                C852810Xct.LIZ.getClass();
                String strLIZ = PhoneNumberUtil.LIZ(C852810Xct.LJII(getArguments()));
                this.LLLL = strLIZ;
                if (TextUtils.isEmpty(strLIZ) && SR() == EnumC852660Xce.RECOVER_ACCOUNT) {
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        serializable = arguments2.getSerializable("recover_account_data");
                    } else {
                        serializable = null;
                    }
                    C852510XcP c852510XcP = (C852510XcP) serializable;
                    this.LLLLLIL = c852510XcP;
                    if (c852510XcP == null || (str = c852510XcP.mobile) == null) {
                        str = "";
                    }
                    this.LLLL = str;
                } else if (TextUtils.isEmpty(this.LLLL) && pT()) {
                    this.LLLL = C852810Xct.LJIIIIZZ(this);
                }
                break;
            case 2:
            case 4:
                C852810Xct.LIZ.getClass();
                this.LLLLII = C852810Xct.LJ(getArguments());
                break;
            case 7:
                String bindPhone = C0XQ5.LIZJ().getBindPhone();
                if (bindPhone == null) {
                    bindPhone = "";
                }
                this.LLLL = bindPhone;
                break;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown step ");
                sbLIZ.append(VR());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (SR() == EnumC852660Xce.MODIFY_PHONE) {
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (string = arguments3.getString("ticket")) == null) {
                string = "";
            }
            this.LLLLJI = string;
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string2 = arguments4.getString("mUnusableMobileTicket")) == null) {
                string2 = "";
            }
            this.LLLLL = string2;
        }
        boolean z3 = false;
        if (!TextUtils.isEmpty(this.LLLL) || (SR() == EnumC852660Xce.RECOVER_ACCOUNT && this.LLLLII.length() == 0)) {
            z = true;
        } else {
            z = false;
        }
        this.LLLLLJIL = z;
        if (!z && this.LLLLII.length() <= 0) {
            throw new IllegalStateException("InputCodeFragment needs either a phone or an email");
        }
        this.LLLLIIIILLL = 6;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            z2 = arguments5.getBoolean("bind_secure", false);
        } else {
            z2 = false;
        }
        this.LLLLIILLL = z2;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            z3 = arguments6.getBoolean("recover_mobile_code", false);
        }
        this.LLLLLILLIL = z3;
        if (this.LLLLIL == null) {
            this.LLLLIL = new C0WWB(getContext());
        }
        this.LLLLIL.LIZIZ();
        this.LLLLIL.LIZJ();
        if (this.LLLLLJIL || VR() == EnumC852910Xd3.PHONE_SMS_LOGIN || VR() == EnumC852910Xd3.PHONE_SMS_SIGN_UP || VR() == EnumC852910Xd3.PHONE_SMS_VERIFY || VR() == EnumC852910Xd3.PHONE_SMS_MODIFY) {
            Bundle arguments7 = getArguments();
            if (arguments7 != null) {
                C852810Xct.LIZ.getClass();
                C852810Xct.LJIILL(arguments7, "sms_verification");
            }
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_type", this.LLJIJIL);
            c0xgr.LIZLLL("enter_method", getEnterMethod());
            c0xgr.LIZLLL("enter_from", getEnterFrom());
            c0xgr.LIZLLL("login_panel_type", PR());
            Bundle arguments8 = getArguments();
            if (arguments8 != null) {
                string3 = arguments8.getString("page", "");
            }
            c0xgr.LIZLLL("page", string3);
            c0xgr.LIZIZ(System.currentTimeMillis() - this.LLLLIILL, "page_show_cost");
            C20684815ws.LJIILLIIL("phone_enter_sms", c0xgr.LIZ);
        }
        C853660XeG c853660XeG = C853660XeG.LIZ;
        EnumC1237100iIW enumC1237100iIWLT = lT();
        c853660XeG.getClass();
        C0XGR c0xgr2 = new C0XGR();
        c0xgr2.LIZ(enumC1237100iIWLT.ordinal(), "input_type");
        C20684815ws.LJIILLIIL("code_input_page_show", c0xgr2.LIZ);
    }

    public final void sT(String str) {
        gT().setEnabled(false);
        jT().setCallback(this.LLLLZLLIL);
        C1237220iIi c1237220iIiLJJJJJ = jT().LJJJJJ();
        if (((Boolean) this.LLLLLLZZ.getValue()).booleanValue()) {
            C1236990iIL.LIZIZ(nT(), new C851370XaZ(c1237220iIiLJJJJJ), SR());
        } else {
            C851360XaY.LIZIZ(getActivity(), nT(), new C851370XaZ(c1237220iIiLJJJJJ), SR());
        }
        if (rT()) {
            AT(str);
        }
    }

    public final void zT(String str) {
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
        EnumC852910Xd3 enumC852910Xd3VR = VR();
        C854460XfY.LIZ.getClass();
        Map mapLJIIJJI = C854460XfY.LJIIJJI(this);
        c0xz4.getClass();
        C0XZ4.LJJIIZ(this, this, "", enumC852660Xce, enumC852910Xd3VR, "", str, mapLJIIJJI).LJIIIIZZ(new AfS188S0100000_19(this, 13)).LJIILL();
    }

    @Override // X.InterfaceC1237610iJL
    public final void Tk(final String str, String str2) {
        String str3;
        LinkedHashMap linkedHashMap;
        String str4;
        if (SystemClock.elapsedRealtime() - this.LLLLZIL < 500) {
            new AutoKeystrokesCodeDetectedEvent().LJIIIIZZ();
        }
        boolean z = false;
        C786410Ut5.w1(fT(), 0);
        fT().LIZIZ();
        String string = null;
        switch (C852940Xd6.LIZ[VR().ordinal()]) {
            case 1:
            case 5:
                if (SR() == EnumC852660Xce.RECOVER_ACCOUNT) {
                    C0XZ4 c0xz4 = C0XZ4.LIZ;
                    C852510XcP c852510XcP = this.LLLLLIL;
                    if (c852510XcP != null) {
                        string = c852510XcP.ticket;
                    }
                    final EnumC852660Xce enumC852660XceSR = SR();
                    final EnumC852910Xd3 enumC852910Xd3VR = VR();
                    c0xz4.getClass();
                    int scene = C0XZ7.ACTIVATION_QUICK_LOGIN.getScene();
                    ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent = new ClientSubmitSmsCodeEvent();
                    clientSubmitSmsCodeEvent.LJI(getEnterFrom(), "enter_from");
                    clientSubmitSmsCodeEvent.LJI(getEnterMethod(), "enter_method");
                    clientSubmitSmsCodeEvent.LJIIJJI(scene);
                    clientSubmitSmsCodeEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
                    clientSubmitSmsCodeEvent.LJIIIIZZ();
                    final String str5 = string;
                    C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XZn
                        /* JADX WARN: Type inference failed for: r3v0, types: [X.0XGw, X.0XZo] */
                        @Override // X.InterfaceC1254030ijp
                        public final void LIZ(final C11KY c11ky) {
                            final EnumC852660Xce enumC852660Xce = enumC852660XceSR;
                            final EnumC852910Xd3 enumC852910Xd3 = enumC852910Xd3VR;
                            final ?? r3 = new AbstractC850930XZr() { // from class: X.0XZo
                                @Override // X.C0XH7
                                public final void LJFF(C0XGA c0xga) {
                                    if (c0xga != null) {
                                        C0XWW<C850920XZq> c0xww = c11ky;
                                        int i = c0xga.LIZLLL;
                                        String str6 = c0xga.LJFF;
                                        ((C11KY) c0xww).onError(new C0XZJ(i, str6, enumC852660Xce, enumC852910Xd3, null, str6));
                                    }
                                }

                                @Override // X.C0XH7
                                /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                                public final void LJI(C0XT7<C850920XZq> c0xt7) {
                                    if (c0xt7 != null && c0xt7.LJIIIZ != 0) {
                                        T t = c0xt7.LJIIIZ;
                                        if (((C850920XZq) t).LJIIIZ != null) {
                                            ((C11KY) c11ky).onSuccess(t);
                                            return;
                                        }
                                    }
                                    ((C11KY) c11ky).onError(new C0XZJ(-1, "no data", enumC852660Xce, enumC852910Xd3, null, "no data"));
                                }

                                @Override // X.C0XH7
                                /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                                public final void LJ(C0XT7<C850920XZq> c0xt7, int i) {
                                    String str6;
                                    String str7;
                                    C0XWW<C850920XZq> c0xww = c11ky;
                                    String str8 = null;
                                    if (c0xt7 != null) {
                                        str6 = c0xt7.LJFF;
                                    } else {
                                        str6 = null;
                                    }
                                    EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                                    EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                                    C0XZ4.LIZ.getClass();
                                    JSONObject jSONObjectLJIIJJI = C0XZ4.LJIIJJI(c0xt7);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    if (c0xt7 != null) {
                                        str7 = c0xt7.LJFF;
                                    } else {
                                        str7 = null;
                                    }
                                    sbLIZ.append(str7);
                                    sbLIZ.append('|');
                                    if (c0xt7 != null) {
                                        str8 = c0xt7.LJI;
                                    }
                                    sbLIZ.append(str8);
                                    ((C11KY) c0xww).onError(new C0XZJ(i, str6, enumC852660Xce2, enumC852910Xd32, jSONObjectLJIIJJI, C2188811AlT.LIZIZ(sbLIZ)));
                                }
                            };
                            this.gk(r3);
                            final Context contextRequireContext = this.requireContext();
                            String str6 = str5;
                            final C850920XZq c850920XZq = new C850920XZq(str);
                            HashMap map = new HashMap();
                            if (!TextUtils.isEmpty(c850920XZq.LJI)) {
                                map.put("mobile", C2093608Ic.LIZIZ(c850920XZq.LJI));
                            }
                            if (!TextUtils.isEmpty(c850920XZq.LJIIIIZZ)) {
                                map.put("captcha", c850920XZq.LJIIIIZZ);
                            }
                            String str7 = c850920XZq.LJII;
                            str7.toString();
                            map.put("code", C2093608Ic.LIZIZ(str7));
                            map.put("mix_mode", "1");
                            if (str6 != null) {
                                map.put("not_login_ticket", str6);
                            }
                            C0XZ4.LIZ.getClass();
                            Map mapLJIIL = C0XZ4.LJIIL();
                            if (!((HashMap) mapLJIIL).isEmpty()) {
                                C2097608Jq.LJIIL(map, mapLJIIL);
                            }
                            C846070XGz c846070XGz = new C846070XGz();
                            c846070XGz.LIZ = C0XH1.LIZ("/passport/mobile/sms_login/");
                            c846070XGz.LIZLLL(map);
                            c846070XGz.LIZ();
                            final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
                            new AbstractC845940XGm<C0XT7<C850920XZq>>(contextRequireContext, c845960XGoLJFF, c850920XZq, r3) { // from class: X.0XZp
                                public static final /* synthetic */ int LJIIIZ = 0;
                                public final C850920XZq LJIIIIZZ;

                                @Override // X.AbstractC845940XGm
                                public final void LJ(C0XGA c0xga) {
                                    C0XG9.LIZIZ("passport_mobile_login", "mobile", "login", c0xga, null);
                                }

                                @Override // X.AbstractC845940XGm
                                public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                                    C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                                    this.LJIIIIZZ.LJ = jSONObject2;
                                }

                                @Override // X.AbstractC845940XGm
                                public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                                    this.LJIIIIZZ.LJIIIZ = C0XZS.LIZJ(jSONObject, jSONObject2);
                                    this.LJIIIIZZ.LJ = jSONObject;
                                }

                                @Override // X.AbstractC845940XGm
                                public final C0XGA LJIIJ(boolean z2, C845980XGq c845980XGq) {
                                    return new C0XT7(z2, 1006, this.LJIIIIZZ);
                                }

                                {
                                    this.LJIIIIZZ = c850920XZq;
                                }
                            }.LJIIIZ();
                        }
                    }).LJIIIIZZ(new AfS65S0201000_13(this, this, scene, 1)).LJII(new AfS81S0101000_13(scene, this, 0))).LJIIIIZZ(new AfS182S0100000_13(this, 40)).LJIILL();
                    return;
                }
                if (pT()) {
                    C854460XfY.LIZ.getClass();
                    linkedHashMap = new LinkedHashMap(C854460XfY.LJIIJJI(this));
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.putAll(NR());
                linkedHashMap.put(Scene.SCENE_SERVICE, String.valueOf(SR().getValue()));
                C0XZ4 c0xz42 = C0XZ4.LIZ;
                if (pT()) {
                    str4 = "";
                } else {
                    str4 = this.LLLL;
                }
                boolean z2 = requireArguments().getBoolean("is_register");
                EnumC852660Xce enumC852660XceSR2 = SR();
                EnumC852910Xd3 enumC852910Xd3VR2 = VR();
                AwS557S0100000_13 awS557S0100000_13 = new AwS557S0100000_13(this, 74);
                c0xz42.getClass();
                C0XZ4.LJIJJ(this, this, str4, str, z2, enumC852660XceSR2, enumC852910Xd3VR2, linkedHashMap, awS557S0100000_13).LJIIIIZZ(new AfS182S0100000_13(this, 41)).LJIILL();
                return;
            case 2:
                C0XZ4 c0xz43 = C0XZ4.LIZ;
                String str6 = this.LLLLII;
                EnumC852660Xce enumC852660XceSR3 = SR();
                EnumC852910Xd3 enumC852910Xd3VR3 = VR();
                String strUR = UR();
                c0xz43.getClass();
                C0XZ4.LJJJIL(this, this, str6, str, enumC852660XceSR3, enumC852910Xd3VR3, str2, strUR, 1, null).LJIIIIZZ(new AfS182S0100000_13(this, 42)).LJIILL();
                return;
            case 3:
                C0XZ4 c0xz44 = C0XZ4.LIZ;
                String str7 = this.LLLL;
                AwS592S0100000_13 awS592S0100000_13 = new AwS592S0100000_13(this, 26);
                c0xz44.getClass();
                C0XZ4.LJI(this, this, str7, str, 4, null, awS592S0100000_13).LJIIIIZZ(new AfS182S0100000_13(this, 43)).LJIILL();
                return;
            case 4:
                C0XZ4 c0xz45 = C0XZ4.LIZ;
                String str8 = this.LLLLII;
                if (this.LLLLLJLJLL) {
                    str3 = "resend";
                } else {
                    str3 = "user_click";
                }
                AwS592S0100000_13 awS592S0100000_132 = new AwS592S0100000_13(this, 27);
                c0xz45.getClass();
                C0XZ4.LJII("forget_password", this, this, str8, str, 4, null, str2, str3, awS592S0100000_132).LJIIIIZZ(new AfS182S0100000_13(this, 44)).LJIILL();
                return;
            case 6:
                C854460XfY.LIZ.getClass();
                if (C854460XfY.LJIIJ(this) != null) {
                    C0XZ4 c0xz46 = C0XZ4.LIZ;
                    String str9 = this.LLLL;
                    EnumC852660Xce enumC852660XceSR4 = SR();
                    EnumC852910Xd3 enumC852910Xd3VR4 = VR();
                    String str10 = this.LLLLJI;
                    String str11 = this.LLLLL;
                    Map mapLJIIJJI = C854460XfY.LJIIJJI(this);
                    c0xz46.getClass();
                    C0XZ4.LJFF(this, this, str9, enumC852660XceSR4, enumC852910Xd3VR4, str, str10, str11, mapLJIIJJI).LJIIIIZZ(new AfS182S0100000_13(this, 33)).LJII(new AfS182S0100000_13(this, 34)).LJIILL();
                    return;
                }
                C0XZ4 c0xz47 = C0XZ4.LIZ;
                String str12 = this.LLLL;
                EnumC852660Xce enumC852660XceSR5 = SR();
                EnumC852910Xd3 enumC852910Xd3VR5 = VR();
                Bundle arguments = getArguments();
                if (arguments != null) {
                    z = arguments.getBoolean("from_changePwd");
                }
                if (SR() != EnumC852660Xce.BIND_PHONE_OR_EMAIL_3P_LOGIN && SR() != EnumC852660Xce.BIND_PHONE_OR_EMAIL_3P_SIGN_UP) {
                    string = "email";
                } else {
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        string = arguments2.getString("platform");
                    }
                }
                String strRR = RR();
                c0xz47.getClass();
                C0XZ4.LIZJ(this, this, str12, enumC852660XceSR5, enumC852910Xd3VR5, str, z, string, strRR, null).LJIIIIZZ(new AfS182S0100000_13(this, 35)).LJIILL();
                return;
            case 7:
                if (OR().yQ2()) {
                    OR().wQ2(new InputCodeActions.VerifyPhoneCodeActionV1(new C1237190iIf(str, this.LLLLLZIL, lT()), this));
                    return;
                }
                C0XZ4 c0xz48 = C0XZ4.LIZ;
                EnumC852660Xce enumC852660XceSR6 = SR();
                EnumC852910Xd3 enumC852910Xd3VR6 = VR();
                C854460XfY.LIZ.getClass();
                Map mapLJIIJJI2 = C854460XfY.LJIIJJI(this);
                c0xz48.getClass();
                C0XZ4.LJIL(this, enumC852660XceSR6, enumC852910Xd3VR6, this, str, mapLJIIJJI2).LJIIIIZZ(new AfS182S0100000_13(this, 36)).LJII(new AfS182S0100000_13(this, 37)).LJIILL();
                return;
            case 8:
                C0XZ4 c0xz49 = C0XZ4.LIZ;
                String str13 = this.LLLL;
                EnumC852660Xce enumC852660XceSR7 = SR();
                EnumC852910Xd3 enumC852910Xd3VR7 = VR();
                String str14 = this.LLLLJI;
                String str15 = this.LLLLL;
                C854460XfY.LIZ.getClass();
                Map mapLJIIJJI3 = C854460XfY.LJIIJJI(this);
                c0xz49.getClass();
                C0XZ4.LJFF(this, this, str13, enumC852660XceSR7, enumC852910Xd3VR7, str, str14, str15, mapLJIIJJI3).LJIIIIZZ(new AfS182S0100000_13(this, 38)).LJII(new AfS182S0100000_13(this, 39)).LJIILL();
                return;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown step [");
                sbLIZ.append(VR());
                sbLIZ.append("] when trying to validate codes");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029d  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0XYD, android.view.View$OnClickListener, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment] */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.0XYD, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instruction units count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        View viewFindViewById;
        TuxTextView tuxTextView;
        if (this.LLLLJ && i == 1206) {
            this.LLLLJ = false;
            CT();
            return;
        }
        C1237680iJS c1237680iJSMT = mT();
        if (str != null) {
            c1237680iJSMT.LLILLL.setMessage(str);
            c1237680iJSMT.getFormViewFromXml().setFooter(c1237680iJSMT.LLILLL);
        }
        c1237680iJSMT.LLILLJJLI.setEnabled(true);
        c1237680iJSMT.LLILLJJLI.LJI(str);
        if (VR() == EnumC852910Xd3.PHONE_SMS_LOGIN && i == 1206) {
            View view = getView();
            if (view != null && (tuxTextView = (TuxTextView) view.findViewById(R.id.dnx)) != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            View view2 = getView();
            if (view2 != null && (viewFindViewById = view2.findViewById(R.id.tbo)) != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View viewFindViewById2 = this.LLLJL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.dn9);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLLJL = (C197039127h) viewFindViewById2;
            }
            TuxTextView tuxTextView2 = (TuxTextView) viewFindViewById2;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(getString(2131823012));
                C1236890iIB c1236890iIB = C1236890iIB.LIZ;
                String str2 = this.LLLL;
                String str3 = this.LLLLII;
                AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 284);
                C854460XfY.LIZ.getClass();
                String strLJIIJ = C854460XfY.LJIIJ(this);
                c1236890iIB.getClass();
                C1236890iIB.LJFF(this, tuxTextView2, str2, str3, awS563S0100000_19, strLJIIJ);
            }
        }
    }

    @Override // X.InterfaceC851550Xar
    public final void QK(EnumC852910Xd3 enumC852910Xd3, Bundle bundle, C851660Xb2 c851660Xb2) {
        C851590Xav.LIZ(enumC852910Xd3, bundle, c851660Xb2);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (VR() == EnumC852910Xd3.PHONE_SMS_VERIFY) {
            VS();
        }
        if (this.LLLLIILLL) {
            ((C854410XfT) this.LLLLLZL.getValue()).LIZIZ();
        }
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }

    public final void qT(int i, String str, boolean z) {
        String str2;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "forgot_password");
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        c0xgr.LIZLLL("platform", str);
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        c0xgr.LIZLLL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c0xgr.LIZ(i, "error_code");
        C20684815ws.LJIILLIIL("forgot_pw_code_submit", c0xgr.LIZ);
    }
}
