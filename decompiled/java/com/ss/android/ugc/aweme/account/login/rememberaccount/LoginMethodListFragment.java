package com.ss.android.ugc.aweme.account.login.rememberaccount;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C036E;
import X.C098200Yq;
import X.C0D5L;
import X.C0FNV;
import X.C0XK4;
import X.C0XQ5;
import X.C0XUE;
import X.C0XWA;
import X.C0XWB;
import X.C0XWJ;
import X.C1233040iBy;
import X.C1236880iIA;
import X.C1237380iIy;
import X.C1239960iN8;
import X.C1240060iNI;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1533950q1J;
import X.C1685300txQ;
import X.C189200o6;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C1BV9;
import X.C293990Bfh;
import X.C294000Bfi;
import X.C336720DHy;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427870Gq9;
import X.C444890HcV;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C846430XIj;
import X.C848210XPf;
import X.C849680XUw;
import X.C960203pA;
import X.C985403tE;
import X.DialogC1240080iNK;
import X.DialogC1389620mGW;
import X.InterfaceC1240000iNC;
import X.InterfaceC1240070iNJ;
import Y.ACListenerS122S0200000_19;
import Y.ACListenerS154S0100000_19;
import Y.AObserverS182S0200000_19;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.IAutoLoginService;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.LongExpireAvatarURLViewModel;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.UiRefreshEventType;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS137S0110000_19;
import kotlin.jvm.internal.AwS2S0311000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS71S0210000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import p5a.a;

/* JADX INFO: loaded from: classes20.dex */
public final class LoginMethodListFragment extends BaseAccountFlowFragment implements InterfaceC1240070iNJ {
    public static final int LLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(85));
    public static int LLLILZ = 0;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSOyo+LSguLD0yKyYjPCEnZgkjLiY9BSA4ISA3BCw/PQkhKSIhLCEn";
    public RecyclerView LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public C197039127h LLJJJJLIIL;
    public C197039127h LLJJL;
    public C427870Gq9 LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public View LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public C197039127h LLJLLIL;
    public ConstraintLayout LLJLLL;
    public TuxIconView LLJZ;
    public C197039127h LLJZIJLIL;
    public TuxTextView LLL;
    public View LLLF;
    public DialogC1240080iNK LLLFF;
    public DialogC1389620mGW LLLFFI;
    public List<BaseLoginMethod> LLLI;
    public C1239960iN8 LLLIILIL;
    public final ViewModelLazy LLLFZ = C336720DHy.LIZ(this, C13LE.LIZ(LongExpireAvatarURLViewModel.class), new AwS563S0100000_19((Fragment) this, 86), new AwS420S0200000_19((Function0) null, this, 16), new AwS563S0100000_19((Fragment) this, 87));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 82));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 85));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 83));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 81));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 80));

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String ZR() {
        return "LoginMethodListFragment";
    }

    @Override // X.C0XYD
    public final void dk(int i) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return false;
    }

    public final TuxTextView aS() {
        View viewFindViewById = this.LLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nf5) : null;
            this.LLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final List<BaseLoginMethod> bS() {
        List<BaseLoginMethod> list = this.LLLI;
        if (list != null) {
            return list;
        }
        List<BaseLoginMethod> listLIZ = C1240060iNI.LIZ();
        this.LLLI = listLIZ;
        return listLIZ;
    }

    public final RecyclerView cS() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.o_s) : null;
            this.LLJJJJ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final ConstraintLayout dS() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.xs4) : null;
            this.LLJLLL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C197039127h gS() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.xs5) : null;
            this.LLJLLIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h hS() {
        View viewFindViewById = this.LLJZIJLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.xs6) : null;
            this.LLJZIJLIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView iS() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.title) : null;
            this.LLJLILLLLZIIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final void oS() {
        C0XWJ c0xwj = C0XWJ.LIZ;
        String enterFrom = getEnterFrom();
        String enterMethod = getEnterMethod();
        String strPR = PR();
        c0xwj.getClass();
        C0XWJ.LJIIIZ(null, enterFrom, enterMethod, strPR, "add_account");
        int i = LLLILZ;
        c0xwj.getClass();
        C0XWJ.LJIIJJI(i, null, null, "click_add_another_account", null, null);
        C0D5L.LIZ(requireActivity()).RQ2("login");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DialogC1240080iNK dialogC1240080iNK = this.LLLFF;
        if (dialogC1240080iNK != null) {
            C0FNV.LIZ(dialogC1240080iNK);
        }
        DialogC1389620mGW dialogC1389620mGW = this.LLLFFI;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        super.onDestroyView();
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJLLIL = null;
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = null;
    }

    @Override // X.InterfaceC1240070iNJ
    public final void P4() {
        MR();
    }

    public final void mS(UiRefreshEventType uiRefreshEventType) {
        C19EG activity;
        int i = C1237380iIy.LIZ[uiRefreshEventType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this);
                    c1389890mGx.LJIIIZ(2131838760);
                    c1389890mGx.LIZ(true);
                    c1389890mGx.LJIIJJI();
                    this.LLLI = C1240060iNI.LIZ();
                    C1239960iN8 c1239960iN8 = this.LLLIILIL;
                    if (c1239960iN8 != null) {
                        c1239960iN8.LL = bS();
                        c1239960iN8.notifyDataSetChanged();
                    }
                    if (bS().isEmpty() && (activity = getActivity()) != null) {
                        C0D5L.LIZIZ(activity);
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            DialogC1240080iNK dialogC1240080iNK = this.LLLFF;
            if (dialogC1240080iNK != null) {
                C0FNV.LIZ(dialogC1240080iNK);
            }
            this.LLLFF = null;
            return;
        }
        if (this.LLLFF == null) {
            DialogC1240080iNK dialogC1240080iNK2 = new DialogC1240080iNK(getContext());
            this.LLLFF = dialogC1240080iNK2;
            dialogC1240080iNK2.LL = this;
        }
        DialogC1240080iNK dialogC1240080iNK3 = this.LLLFF;
        if (dialogC1240080iNK3 == null) {
            return;
        }
        C0FNV.LIZJ(dialogC1240080iNK3);
    }

    public final void nS(BaseLoginMethod baseLoginMethod) {
        String string;
        C19EG activity = getActivity();
        if (activity != null) {
            Bundle bundle = new Bundle((Bundle) this.LLLIIII.getValue());
            bundle.putBoolean("disable_auto_gms", true);
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("auth_from_app")) != null) {
                C786410Ut5.LJJJI("channel", string, bundle);
            }
            C0XQ5.LJ().loginByMethodForHistoryLogin(activity, bundle, baseLoginMethod, new AwS593S0100000_14(this, 9));
        }
    }

    public final void sS(BaseLoginMethod baseLoginMethod) {
        CommonUserInfo commonUserInfo = baseLoginMethod.getCommonUserInfo();
        if (commonUserInfo != null) {
            View viewFindViewById = this.LLJL;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.xsb);
                } else {
                    viewFindViewById = null;
                }
                this.LLJL = (TuxTextView) viewFindViewById;
            }
            ((TextView) viewFindViewById).setText(commonUserInfo.userName);
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(commonUserInfo.avatarUrl);
            View view2 = this.LLJJLIIIJLLLLLLLZ;
            if (view2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.xs7);
                }
                this.LLJJLIIIJLLLLLLLZ = (C427870Gq9) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            c1331670kl3LJIIIZ.LJJ((SmartImageView) view2);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [X.0iNH] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        Integer num;
        int i;
        C19ME c19me;
        Integer num2;
        super.onViewCreated(view, bundle);
        aS().setOnTouchListener(new a(0.5f, 150L));
        String string = getString(2131822059);
        String string2 = getString(2131822058, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int iLJJJ = a0.LJJJ(string2, string, 0, false, 6);
        final int iLIZ = C960203pA.LIZ(R.attr.a04, aS().getContext());
        if (iLJJJ >= 0) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iLIZ) { // from class: com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment$setUpBottomBar$1
                @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(82);
                    textPaint.setTypeface(c444890HcV.getTypeface());
                }
            }, iLJJJ, string.length() + iLJJJ, 34);
        }
        aS().setText(spannableStringBuilder);
        C786410Ut5.h9(aS(), new ACListenerS154S0100000_19(this, 31));
        IAutoLoginService iAutoLoginService = (IAutoLoginService) ServiceManager.get().getService(IAutoLoginService.class);
        iAutoLoginService.getAutoLoginState().observe(getViewLifecycleOwner(), new AObserverS182S0200000_19(this, iAutoLoginService, 4));
        View viewFindViewById = null;
        if (((Boolean) this.LLLII.getValue()).booleanValue()) {
            View viewFindViewById2 = this.LLJJJJJIL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.xs_);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJJJJJIL = (LinearLayout) viewFindViewById2;
            }
            C786410Ut5.LJZL(0, (LinearLayout) viewFindViewById2);
            C786410Ut5.LLIZLLLIL(cS(), 8);
            sS((BaseLoginMethod) ListProtector.get(bS(), 0));
            LongExpireAvatarURLViewModel longExpireAvatarURLViewModel = (LongExpireAvatarURLViewModel) this.LLLFZ.getValue();
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) ListProtector.get(bS(), 0);
            longExpireAvatarURLViewModel.getClass();
            C848210XPf.LIZ(baseLoginMethod, new AwS557S0100000_13(longExpireAvatarURLViewModel, 5));
            ((LongExpireAvatarURLViewModel) this.LLLFZ.getValue()).LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS223S0100000_19(this, 11));
            View viewFindViewById3 = this.LLJJJJLIIL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.xs9);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJJJJLIIL = (C197039127h) viewFindViewById3;
            }
            C197039127h c197039127h = (C197039127h) viewFindViewById3;
            if (c197039127h != null) {
                C786410Ut5.U8(c197039127h, new ACListenerS122S0200000_19(this, view, 76));
                if (C294000Bfi.LIZ()) {
                    C1236880iIA.LIZJ(c197039127h, c197039127h.getContext(), R.attr.a00, R.attr.a0o);
                }
            }
            View viewFindViewById4 = this.LLJJL;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.xsa);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJJL = (C197039127h) viewFindViewById4;
            }
            C197039127h c197039127h2 = (C197039127h) viewFindViewById4;
            c197039127h2.LJJJJL(new AwS385S0200000_19(c197039127h2, this, 132));
            C786410Ut5.U8(c197039127h2, new ACListenerS154S0100000_19(this, 265));
            if (((Boolean) this.LLLIIL.getValue()).booleanValue()) {
                View view5 = this.LLJJLIIIJLLLLLLLZ;
                if (view5 == null) {
                    View view6 = getView();
                    if (view6 != null) {
                        viewFindViewById = view6.findViewById(R.id.xs7);
                    }
                    this.LLJJLIIIJLLLLLLLZ = (C427870Gq9) viewFindViewById;
                    view5 = viewFindViewById;
                }
                C427870Gq9 c427870Gq9 = (C427870Gq9) view5;
                ViewGroup.LayoutParams layoutParams = c427870Gq9.getLayoutParams();
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                C786410Ut5.F6(c427870Gq9, layoutParams);
                C426750GoL.LJIIIZ(c427870Gq9, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), false, 23);
                return;
            }
            return;
        }
        View viewFindViewById5 = this.LLJLIL;
        if (viewFindViewById5 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById5 = view7.findViewById(R.id.ji7);
            } else {
                viewFindViewById5 = null;
            }
            this.LLJLIL = viewFindViewById5;
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById5);
        TuxTextView tuxTextViewIS = iS();
        tuxTextViewIS.setText(tuxTextViewIS.getContext().getText(2131838753));
        tuxTextViewIS.setMaxLines(1);
        tuxTextViewIS.setMinTextSize(15.0f);
        tuxTextViewIS.setTuxFont(123);
        if (((Boolean) this.LLLIIL.getValue()).booleanValue()) {
            num = null;
            i = 21;
            C426750GoL.LJIIIZ(tuxTextViewIS, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), false, 21);
        } else {
            num = null;
            i = 21;
            C426750GoL.LJIIIZ(tuxTextViewIS, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), false, 21);
        }
        View viewFindViewById6 = this.LLJLL;
        if (viewFindViewById6 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById6 = view8.findViewById(R.id.uhp);
            } else {
                viewFindViewById6 = null;
            }
            this.LLJLL = (TuxTextView) viewFindViewById6;
        }
        C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById6, 8);
        RecyclerView recyclerViewCS = cS();
        ViewGroup.LayoutParams layoutParams2 = recyclerViewCS.getLayoutParams();
        if (layoutParams2 instanceof C19ME) {
            c19me = (C19ME) layoutParams2;
            if (c19me != null) {
                ((ViewGroup.MarginLayoutParams) c19me).height = 0;
                c19me.topToBottom = R.id.ji7;
                c19me.bottomToTop = R.id.xs5;
            }
        } else {
            c19me = null;
        }
        C786410Ut5.p6(recyclerViewCS, c19me);
        C426750GoL.LJIIIZ(recyclerViewCS, num, 0, num, 0, false, i);
        C197039127h c197039127hGS = gS();
        C786410Ut5.LLLLLLJ(c197039127hGS, 0);
        c197039127hGS.LJJJJL(new AwS385S0200000_19(c197039127hGS, this, 133));
        C786410Ut5.U8(c197039127hGS, new ACListenerS154S0100000_19(this, 266));
        C786410Ut5.Y7(dS(), new ACListenerS154S0100000_19(this, 267));
        Context context = getContext();
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_plus;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
            View view9 = this.LLJZ;
            if (view9 == null) {
                View view10 = getView();
                if (view10 != null) {
                    viewFindViewById = view10.findViewById(R.id.xs3);
                }
                this.LLJZ = (TuxIconView) viewFindViewById;
                view9 = viewFindViewById;
            }
            ((TuxIconView) view9).setImageDrawable(layerDrawableLJIILIIL);
        }
        C197039127h c197039127hHS = hS();
        C786410Ut5.U8(c197039127hHS, new ACListenerS154S0100000_19(this, 268));
        if (!((Boolean) this.LLLIIIL.getValue()).booleanValue()) {
            c197039127hHS.LJJJJL(new AwS580S0100000_1(c197039127hHS, 846));
        } else if (C294000Bfi.LIZ()) {
            C1236880iIA.LIZJ(c197039127hHS, c197039127hHS.getContext(), R.attr.a00, R.attr.a0o);
        }
        RecyclerView recyclerViewCS2 = cS();
        if (recyclerViewCS2 != null) {
            HandlerHook.viewPost(recyclerViewCS2, new ARunnableS119S0100000_19(this, 18));
        }
        cS().setLayoutManager(new LinearLayoutManager(getContext()));
        this.LLLIILIL = new C1239960iN8(bS(), new InterfaceC1240000iNC() { // from class: X.0iNH
            @Override // X.InterfaceC1240000iNC
            public final void LIZIZ() {
                this.LIZ.oS();
            }

            @Override // X.InterfaceC1240000iNC
            public final void LIZ(BaseLoginMethod baseLoginMethod2, int i2) {
                this.LIZ.qS(view, baseLoginMethod2, i2);
            }
        }, getEnterFrom(), getEnterMethod(), new AwS563S0100000_19(this, 84));
        cS().setAdapter(this.LLLIILIL);
        for (BaseLoginMethod baseLoginMethod2 : bS()) {
            CommonUserInfo commonUserInfo = baseLoginMethod2.getCommonUserInfo();
            if (commonUserInfo != null && (commonUserInfo.avatarExpires == null || commonUserInfo.avatarUrl.length() == 0 || (num2 = commonUserInfo.avatarExpires) == null || commonUserInfo.avatarUrl.length() == 0 || C0XK4.LIZ() >= num2.intValue())) {
                LongExpireAvatarURLViewModel longExpireAvatarURLViewModel2 = (LongExpireAvatarURLViewModel) this.LLLFZ.getValue();
                longExpireAvatarURLViewModel2.getClass();
                C848210XPf.LIZ(baseLoginMethod2, new AwS557S0100000_13(longExpireAvatarURLViewModel2, 5));
                ((LongExpireAvatarURLViewModel) this.LLLFZ.getValue()).LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS223S0100000_19(this, 10));
                return;
            }
        }
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        Context context = getContext();
        if (context != null) {
            if (i < 0) {
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZJ(getString(2131837962));
                c1233040iBy.LIZLLL();
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                C1233040iBy c1233040iBy2 = new C1233040iBy(context);
                c1233040iBy2.LIZJ(str);
                c1233040iBy2.LIZLLL();
            }
        }
    }

    public final void uS(BaseLoginMethod baseLoginMethod, boolean z) {
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131838759);
            c1397580mTM.LJII = false;
            c1397580mTM.LIZ(2131838757);
            C985403tE.LIZ(c1397580mTM, new AwS71S0210000_19(z, baseLoginMethod, this, 6));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.y8, viewGroup, false);
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

    public final void qS(View view, BaseLoginMethod baseLoginMethod, int i) {
        String str;
        int i2;
        boolean z;
        boolean zLJ = C849680XUw.LJ(baseLoginMethod);
        C0XWJ c0xwj = C0XWJ.LIZ;
        String enterFrom = getEnterFrom();
        String enterMethod = getEnterMethod();
        String strPR = PR();
        c0xwj.getClass();
        C0XWJ.LJIIIZ(baseLoginMethod, enterFrom, enterMethod, strPR, "");
        int i3 = LLLILZ;
        String strLIZJ = C0XWJ.LIZJ(baseLoginMethod);
        if (zLJ) {
            str = "ocl";
        } else {
            str = "hl";
        }
        if (i == -1) {
            i2 = 0;
        } else {
            i2 = i;
        }
        Integer numValueOf = Integer.valueOf(i2);
        boolean z2 = true;
        if (!C1533950q1J.LJ(baseLoginMethod.getMaskedPhone()) && !C1533950q1J.LJ(baseLoginMethod.getMaskedEmail())) {
            z = false;
        } else {
            z = true;
        }
        C0XWJ.LJIIJJI(i3, Boolean.valueOf(z), numValueOf, "click_login", strLIZJ, str);
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
                if (iAccountLoginMethodsService == null || !iAccountLoginMethodsService.LIZJ() || iAccountLoginMethodsService.LIZLLL()) {
                    z2 = false;
                }
                if (zLJ && !z2) {
                    rS(baseLoginMethod, i, view, false);
                    return;
                } else {
                    nS(baseLoginMethod);
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
    }

    public final void rS(BaseLoginMethod baseLoginMethod, int i, View view, boolean z) {
        LinkedHashMap linkedHashMap;
        boolean zLJI = MethodIDManager.LJI(202484);
        if (this.LLLFF == null) {
            DialogC1240080iNK dialogC1240080iNK = new DialogC1240080iNK(getContext());
            this.LLLFF = dialogC1240080iNK;
            dialogC1240080iNK.LL = this;
        }
        DialogC1240080iNK dialogC1240080iNK2 = this.LLLFF;
        if (dialogC1240080iNK2 != null) {
            C0FNV.LIZJ(dialogC1240080iNK2);
        }
        Map map = (Map) this.LLLIIIIL.getValue();
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("account_type", C849680XUw.LIZ(baseLoginMethod));
            linkedHashMap.put("platform", "oneclick");
            linkedHashMap.put("MOB_PARAMS_PROVIDER", new C1BV9(getEnterFrom(), getEnterMethod(), "ocl", PR(), (String) this.LLJILJILJ.getValue(), getArguments()));
        } else {
            linkedHashMap = null;
        }
        if (C846430XIj.LIZIZ()) {
            ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJIILJJIL(getActivity(), baseLoginMethod, C0XWB.ONE_CLICK_LOGIN, linkedHashMap, new AwS137S0110000_19(this, z, 11), new AwS2S0311000_19(this, baseLoginMethod, i, view, z, 4));
        } else {
            ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJFF(getActivity(), baseLoginMethod, C0XWB.ONE_CLICK_LOGIN, linkedHashMap, new AwS137S0110000_19(this, z, 12), new AwS2S0311000_19(this, baseLoginMethod, i, view, z, 5));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void kS(int i, BaseLoginMethod baseLoginMethod, int i2, View view, Function0<Unit> function0) {
        C1239960iN8 c1239960iN8;
        DialogC1240080iNK dialogC1240080iNK = this.LLLFF;
        if (dialogC1240080iNK != null) {
            C0FNV.LIZ(dialogC1240080iNK);
        }
        this.LLLFF = null;
        if (!isAdded()) {
            return;
        }
        if (C846430XIj.LIZIZ() && ((baseLoginMethod.isHistoryLogin() && Intrinsics.LJFF(baseLoginMethod.getHasOIDC(), Boolean.TRUE)) || C293990Bfh.LIZ())) {
            if (i != 2046 && i != 2135) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(2131838760);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJJI();
                nS(baseLoginMethod);
                return;
            }
            return;
        }
        if (i != 8 && i != 10) {
            if (i != 1011) {
                if (i != 2029) {
                    if (i != 2035) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(view);
                        c1389890mGx2.LJIIIZ(2131839108);
                        c1389890mGx2.LJIIJJI();
                        return;
                    } else {
                        if (function0 != null) {
                            function0.invoke();
                            return;
                        }
                        C1389890mGx c1389890mGx3 = new C1389890mGx(view);
                        c1389890mGx3.LJIIIZ(2131839108);
                        c1389890mGx3.LJIIJJI();
                        return;
                    }
                }
                Context context = getContext();
                if (context != null) {
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LJFF(2131839107);
                    c1397580mTM.LJII = true;
                    c1397580mTM.LJIIIIZZ = true;
                    c1397580mTM.LIZ(2131839106);
                    C985403tE.LIZ(c1397580mTM, AFwS257S0000000_19.get$arr$(45));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            if (i2 != -1) {
                AbstractC21673619ry adapter = cS().getAdapter();
                if (!(adapter instanceof C1239960iN8) || (c1239960iN8 = (C1239960iN8) adapter) == null) {
                    return;
                }
                c1239960iN8.LLLI(i2, view.getContext(), baseLoginMethod, true);
                return;
            }
            uS(baseLoginMethod, true);
            return;
        }
        if (C846430XIj.LIZIZ() && Intrinsics.LJFF(baseLoginMethod.getHasOIDC(), Boolean.TRUE)) {
            C0XUE.LIZ.LJIIJ(baseLoginMethod.getUid());
        } else {
            C0XWA c0xwa = C0XWA.LIZ;
            String uid = baseLoginMethod.getUid();
            synchronized (c0xwa) {
                Set<String> set = C0XWA.LIZJ;
                set.add(uid);
                ((Keva) C0XWA.LIZIZ.getValue()).storeStringSet("refresh_key", set);
            }
        }
        if (!baseLoginMethod.isHistoryLogin() && i2 != -1) {
            ((C1239960iN8) cS().getAdapter()).LLLI(i2, view.getContext(), baseLoginMethod, false);
            return;
        }
        if (baseLoginMethod.isHistoryLogin()) {
            C1389890mGx c1389890mGx4 = new C1389890mGx(view);
            c1389890mGx4.LJIIIZ(2131838760);
            c1389890mGx4.LIZ(true);
            c1389890mGx4.LJIIJJI();
            nS(baseLoginMethod);
            return;
        }
        uS(baseLoginMethod, false);
    }
}
