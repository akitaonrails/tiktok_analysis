package com.ss.android.ugc.aweme.tako.otherpage.settings.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C07EO;
import X.C08A4;
import X.C098200Yq;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C123100dR;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1581450rFv;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1862330yYx;
import X.C1863400yag;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20040613bA;
import X.C20277814Wa;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C426750GoL;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497820Jfg;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C844470XAv;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.tako.model.TakoSettingsEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC836760Ws6
public final class TakoSettingsFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jHELIOSKSIpZzw2PDElJyggZjAlZxsyIyofLDsnISsrOgkhKSIhLCEn";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(171), "tako_settings_enter_param", TakoSettingsEnterParams.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(162), "enter_from", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(163), "enter_method", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(166), "process_id", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(167), "search_id", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(170), "tako_session_id", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(169), "tako_chat_id", String.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(160), "bot_id", Long.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(161), "chat_bot_source", Integer.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(164), "intent_type", String.class);
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSettingsFragment.class, "takoSettingsVM", "getTakoSettingsVM()Lcom/ss/android/ugc/aweme/tako/otherpage/settings/vm/TakoSettingsVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public TakoSettingsFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoSettingsVM.class);
        AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(c19719912DlLIZ, 256);
        AFwS274S0000000_30 aFwS274S0000000_30 = AFwS274S0000000_30.get$arr$(168);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS574S0100000_30, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 257), aFwS274S0000000_30, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS574S0100000_30, new AwS574S0100000_30((Fragment) this, 258), aFwS274S0000000_30, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS574S0100000_30, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 259), aFwS274S0000000_30, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIII = assemVMLazy;
    }

    public final TakoSettingsEnterParams SR() {
        return (TakoSettingsEnterParams) this.LLIZ.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(AFwS274S0000000_30.get$arr$(165));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        TakoSettingsEnterParams takoSettingsEnterParamsSR;
        TakoSettingsEnterParams takoSettingsEnterParamsSR2;
        TakoSettingsEnterParams takoSettingsEnterParamsSR3;
        TakoSettingsEnterParams takoSettingsEnterParamsSR4;
        TakoSettingsEnterParams takoSettingsEnterParamsSR5;
        TakoSettingsEnterParams takoSettingsEnterParamsSR6;
        TakoSettingsEnterParams takoSettingsEnterParamsSR7;
        super.onCreate(bundle);
        NR(AFwS273S0000000_29.get$arr$(165));
        String str = (String) this.LLIZLLLIL.getValue();
        if (str != null && C123100dR.LIZ(str) && (takoSettingsEnterParamsSR7 = SR()) != null) {
            takoSettingsEnterParamsSR7.setEnterFrom(str);
        }
        String str2 = (String) this.LLJ.getValue();
        if (str2 != null && C123100dR.LIZ(str2) && (takoSettingsEnterParamsSR6 = SR()) != null) {
            takoSettingsEnterParamsSR6.setEnterMethod(str2);
        }
        String str3 = (String) this.LLJI.getValue();
        if (str3 != null && C123100dR.LIZ(str3) && (takoSettingsEnterParamsSR5 = SR()) != null) {
            takoSettingsEnterParamsSR5.setProcessId(str3);
        }
        String str4 = (String) this.LLJILJILJ.getValue();
        if (str4 != null && C123100dR.LIZ(str4) && (takoSettingsEnterParamsSR4 = SR()) != null) {
            takoSettingsEnterParamsSR4.setTakoChatId(str4);
        }
        String str5 = (String) this.LLJIJIL.getValue();
        if (str5 != null && C123100dR.LIZ(str5) && (takoSettingsEnterParamsSR3 = SR()) != null) {
            takoSettingsEnterParamsSR3.setSearchId(str5);
        }
        Long l = (Long) this.LLJILLL.getValue();
        if (l != null && C08A4.LIZIZ(Long.valueOf(l.longValue()))) {
            long jLongValue = l.longValue();
            TakoSettingsEnterParams takoSettingsEnterParamsSR8 = SR();
            if (takoSettingsEnterParamsSR8 != null) {
                takoSettingsEnterParamsSR8.setBotId(jLongValue);
            }
        }
        Integer num = (Integer) this.LLJJ.getValue();
        if (num != null && C08A4.LIZ(Integer.valueOf(num.intValue()))) {
            int iIntValue = num.intValue();
            TakoSettingsEnterParams takoSettingsEnterParamsSR9 = SR();
            if (takoSettingsEnterParamsSR9 != null) {
                takoSettingsEnterParamsSR9.setBotSource(iIntValue);
            }
        }
        String str6 = (String) this.LLJJI.getValue();
        if (str6 != null && C123100dR.LIZ(str6) && (takoSettingsEnterParamsSR2 = SR()) != null) {
            takoSettingsEnterParamsSR2.setIntentType(str6);
        }
        String str7 = (String) this.LLJILJIL.getValue();
        if (str7 != null && C123100dR.LIZ(str7) && (takoSettingsEnterParamsSR = SR()) != null) {
            takoSettingsEnterParamsSR.setTakoSessionId(str7);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        boolean z;
        String enterFrom;
        String enterMethod;
        String processId;
        String takoSessionId;
        String takoChatId;
        int marginStart;
        int marginEnd;
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        C1581450rFv.LIZ.getClass();
        int botSource = 1;
        if (C1581450rFv.LIZ()) {
            TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.xc9);
            Context context = tuxNavBar.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
                tuxNavBar.setNavBackground(numLIZJ.intValue());
            }
            tuxNavBar.LJIIZILJ(false);
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS574S0100000_30(this, 365));
            tuxNavBar.LIZIZ(c1251150ifB);
            ViewGroup.LayoutParams layoutParams = tuxNavBar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = tuxNavBar.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            ViewGroup.LayoutParams layoutParams3 = tuxNavBar.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i = marginLayoutParams2.topMargin;
            } else {
                i = 0;
            }
            int iLIZJ = i + C497820Jfg.LIZJ(tuxNavBar.getContext());
            ViewGroup.LayoutParams layoutParams4 = tuxNavBar.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                i2 = marginLayoutParams.bottomMargin;
            } else {
                i2 = 0;
            }
            C426750GoL.LJIIIZ(tuxNavBar, Integer.valueOf(marginStart), Integer.valueOf(iLIZJ), Integer.valueOf(marginEnd), Integer.valueOf(i2), false, 16);
            C786410Ut5.T4(view.findViewById(R.id.p1k), 0.0f);
        }
        if (((Boolean) C07EO.LIZ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        long botId = 1;
        if (z) {
            AssemVMLazy assemVMLazy = this.LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
            TakoSettingsVM takoSettingsVM = (TakoSettingsVM) assemVMLazy.getValue();
            C1863400yag c1863400yag = C1863400yag.LIZ;
            TakoSettingsEnterParams takoSettingsEnterParamsSR = SR();
            if (takoSettingsEnterParamsSR != null) {
                botId = takoSettingsEnterParamsSR.getBotId();
            }
            Long lValueOf = Long.valueOf(botId);
            TakoSettingsEnterParams takoSettingsEnterParamsSR2 = SR();
            if (takoSettingsEnterParamsSR2 != null) {
                botSource = takoSettingsEnterParamsSR2.getBotSource();
            }
            Integer numValueOf = Integer.valueOf(botSource);
            c1863400yag.getClass();
            takoSettingsVM.LL = C1863400yag.LIZJ(numValueOf, lValueOf);
        } else {
            AssemVMLazy assemVMLazy2 = this.LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJIJI;
            TakoSettingsVM takoSettingsVM2 = (TakoSettingsVM) assemVMLazy2.getValue();
            C1863400yag c1863400yag2 = C1863400yag.LIZ;
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            AFwS190S0000000_4 aFwS190S0000000_4 = AFwS190S0000000_4.get$arr$(4187);
            TakoSettingsEnterParams takoSettingsEnterParamsSR3 = SR();
            if (takoSettingsEnterParamsSR3 != null) {
                botId = takoSettingsEnterParamsSR3.getBotId();
            }
            TakoSettingsEnterParams takoSettingsEnterParamsSR4 = SR();
            if (takoSettingsEnterParamsSR4 != null) {
                botSource = takoSettingsEnterParamsSR4.getBotSource();
            }
            takoSettingsVM2.LL = C1863400yag.LIZIZ(c1863400yag2, contextLIZ, aFwS190S0000000_4, null, null, null, null, null, botId, botSource, 0, 0, false, false, null, null, AFwS274S0000000_30.get$arr$(294), true, null, 326908);
        }
        AssemVMLazy assemVMLazy3 = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LLJJIJI;
        TakoSettingsVM takoSettingsVM3 = (TakoSettingsVM) assemVMLazy3.getValue();
        C23250099c.LIZLLL(takoSettingsVM3.getAssemVMScope(), null, null, new C20040613bA(takoSettingsVM3, null), 3);
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 569), 3);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoSettingsEnterParams takoSettingsEnterParamsSR5 = SR();
        String str = "";
        if (takoSettingsEnterParamsSR5 == null || (enterFrom = takoSettingsEnterParamsSR5.getEnterFrom()) == null) {
            enterFrom = "";
        }
        TakoSettingsEnterParams takoSettingsEnterParamsSR6 = SR();
        if (takoSettingsEnterParamsSR6 == null || (enterMethod = takoSettingsEnterParamsSR6.getEnterMethod()) == null) {
            enterMethod = "";
        }
        TakoSettingsEnterParams takoSettingsEnterParamsSR7 = SR();
        if (takoSettingsEnterParamsSR7 == null || (processId = takoSettingsEnterParamsSR7.getProcessId()) == null) {
            processId = "";
        }
        TakoSettingsEnterParams takoSettingsEnterParamsSR8 = SR();
        if (takoSettingsEnterParamsSR8 == null || (takoSessionId = takoSettingsEnterParamsSR8.getTakoSessionId()) == null) {
            takoSessionId = "";
        }
        TakoSettingsEnterParams takoSettingsEnterParamsSR9 = SR();
        if (takoSettingsEnterParamsSR9 != null && (takoChatId = takoSettingsEnterParamsSR9.getTakoChatId()) != null) {
            str = takoChatId;
        }
        C1862330yYx.LJJI(c1862330yYx, enterFrom, enterMethod, processId, takoSessionId, str, "settings", null, null, null, null, 1920);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C1581450rFv.LIZ.getClass();
        if (C1581450rFv.LIZ()) {
            i = R.layout.fjk;
        } else {
            i = R.layout.fjj;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
