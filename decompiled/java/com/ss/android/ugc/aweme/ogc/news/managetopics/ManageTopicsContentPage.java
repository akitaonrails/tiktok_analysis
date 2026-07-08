package com.ss.android.ugc.aweme.ogc.news.managetopics;

import X.AbstractC1623806Xk;
import X.AbstractC426530Gnz;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C1159570gHT;
import X.C1166680gSw;
import X.C1166690gSx;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1250300ido;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1440005kM;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1685300txQ;
import X.C16GX;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C21543519Sv;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C431260Gvc;
import X.C444910HcX;
import X.C452070Ho5;
import X.C452501pT;
import X.C491101vh;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C985403tE;
import X.C995130c0F;
import X.EnumC638250P1r;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ogc.news.managetopics.ManageTopicsConfig;
import com.ss.android.ugc.aweme.ogc.news.managetopics.cell.SeekBarCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class ManageTopicsContentPage extends BaseFragment implements InterfaceC21503819Do, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiorKmE9LTI/ZyIyHELIOSJiQrLDs8OCwvOmEeKSstLioHJzUlKjwQJys4LCEnGCQrLA==";
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManageTopicsContentPage.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ogc/news/managetopics/ManageTopicsContentVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final C1166690gSx UR() {
        return (C1166690gSx) this.LLIZLLLIL.getValue();
    }

    public final ManageTopicsContentVM VR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (ManageTopicsContentVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (((Boolean) this.LLJI.getValue()).booleanValue()) {
            C1440005kM.LIZ(new C1166680gSw());
        }
        super.onDestroy();
    }

    public ManageTopicsContentPage() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageTopicsContentVM.class);
        this.LLIZ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS562S0100000_18(c19719912DlLIZ, 716), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 717), AFwS256S0000000_18.get$arr$(229));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(220));
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 718));
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 715));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1166690gSx c1166690gSxUR = UR();
        C16GX c16gx = c1166690gSxUR.LLIZ;
        if (c16gx != null) {
            c16gx.LIZLLL(c1166690gSxUR);
        }
        super.onDestroyView();
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        Context context = getContext();
        if (context != null) {
            SR(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void SR(Context context) {
        ManageTopicsContentVM manageTopicsContentVMVR = VR();
        if (!manageTopicsContentVMVR.LLILZ) {
            AbstractC1623806Xk<Boolean> abstractC1623806Xk = manageTopicsContentVMVR.getState().LLILLJJLI;
            if (!(abstractC1623806Xk instanceof C491101vh) && !(abstractC1623806Xk instanceof C1623706Xj) && (!(abstractC1623806Xk instanceof C1623606Xi) || ((Boolean) ((C1623606Xi) abstractC1623806Xk).LIZ).booleanValue())) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LIZIZ(context.getString(2131834526));
                C985403tE.LIZ(c1397580mTM, new AwS384S0200000_18(context, this, 68));
                c1397580mTM.LJ(new AwS597S0100000_18(this, 198));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        VR().yQ2(new C1159570gHT(getArguments()));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        activityConfiguration(AFwS256S0000000_18.get$arr$(227));
        NR(AFwS256S0000000_18.get$arr$(228));
        ManageTopicsContentVM manageTopicsContentVMVR = VR();
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("enter_from");
        } else {
            string = null;
        }
        manageTopicsContentVMVR.LLIZLLLIL = string;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1166690gSx c1166690gSxUR = UR();
        c1166690gSxUR.LL = new AwS419S0200000_18(this, view, 51);
        c1166690gSxUR.LLILLJJLI = new AwS562S0100000_18(this, 746);
        UR().LLILLL = new AwS562S0100000_18(this, 747);
        AssemViewModel.asyncSubscribe$default(VR(), new C2217381BqS() { // from class: X.0gLt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159410gHD) obj).LL;
            }
        }, this, null, new AwS597S0100000_18(this, 1059), new AwS562S0100000_18(this, 2739), new AwS597S0100000_18(this, 1062), 4, null);
        AssemViewModel.asyncSubscribe$default(VR(), new C2217381BqS() { // from class: X.0gLw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159410gHD) obj).LLILLJJLI;
            }
        }, this, null, new AwS597S0100000_18(this, 1063), new AwS562S0100000_18(this, 2740), new AwS597S0100000_18(this, 1064), 4, null);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0gLu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159410gHD) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 307), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0gLr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159410gHD) obj).LLILZIL;
            }
        }, null, new AwS632S0100000_18(this, 308), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0gLv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159410gHD) obj).LLILZLL;
            }
        }, null, new AwS632S0100000_18(this, 310), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0gLs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159410gHD) obj).LLILZ;
            }
        }, null, new AwS616S0100000_2(this, 152), 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        C19GS c19gs;
        final C1166690gSx c1166690gSxUR = UR();
        c1166690gSxUR.getClass();
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dsu, viewGroup, false);
        if (viewTd.isLaidOut() && !viewTd.isLayoutRequested()) {
            C995130c0F.LIZ(viewTd);
        } else {
            viewTd.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0c9I
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    C995130c0F.LIZ(view);
                }
            });
        }
        c1166690gSxUR.LLILZIL = (C1749280vcc) viewTd.findViewById(R.id.w28);
        c1166690gSxUR.LLJI = (ViewStub) viewTd.findViewById(R.id.vs_guide_tooltip);
        c1166690gSxUR.LLJIJIL = (TuxIconView) viewTd.findViewById(R.id.lno);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, viewTd.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            viewTd.setBackgroundColor(iIntValue);
            TuxNavBar tuxNavBar = (TuxNavBar) viewTd.findViewById(R.id.djm);
            C0OM1 c0om1 = new C0OM1();
            C1250300ido c1250300ido = new C1250300ido();
            c1250300ido.LIZJ = tuxNavBar.getContext().getString(R.string.e8n);
            c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
            c1250300ido.LIZ(new AwS562S0100000_18(c1166690gSxUR, 2741));
            c0om1.LJ(c1250300ido);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZIZ = "title";
            c1250250idj.LIZJ = tuxNavBar.getContext().getString(2131834532);
            c0om1.LIZJ = c1250250idj;
            C1250300ido c1250300ido2 = new C1250300ido();
            c1250300ido2.LIZJ = tuxNavBar.getContext().getString(R.string.sg8);
            c1250300ido2.LIZIZ = "save";
            c1250300ido2.LJ = false;
            c1250300ido2.LIZ(new AwS562S0100000_18(c1166690gSxUR, 2742));
            c0om1.LIZIZ(c1250300ido2);
            c0om1.LIZLLL = false;
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.setNavBackground(iIntValue);
            View viewLJII = tuxNavBar.LJII("title");
            if (viewLJII != null) {
                C786410Ut5.T4(viewLJII, 0.0f);
            }
            c1166690gSxUR.LLILZLL = tuxNavBar;
        }
        c1166690gSxUR.LLIZ = (C16GX) viewTd.findViewById(R.id.b6m);
        c1166690gSxUR.LLIZLLLIL = (C21543519Sv) viewTd.findViewById(R.id.e65);
        C16GX c16gx = c1166690gSxUR.LLIZ;
        if (c16gx != null) {
            c16gx.LIZ(c1166690gSxUR);
        }
        C21543519Sv c21543519Sv = c1166690gSxUR.LLIZLLLIL;
        if (c21543519Sv != null) {
            c21543519Sv.setMinimumHeight(C1166690gSx.LLJILLL);
        }
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.tv_title);
        TextView textView = (TextView) viewTd.findViewById(R.id.zhs);
        final Context context = textView.getContext();
        Context context2 = tuxTextView.getContext();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ManageTopicsConfig.ManageTopicsTitleModel manageTopicsTitleModel = ManageTopicsConfig.LIZ;
        ManageTopicsConfig.ManageTopicsTitleModel manageTopicsTitleModel2 = (ManageTopicsConfig.ManageTopicsTitleModel) settingsManagerLIZLLL.LJIIIIZZ("manage_topics_config", ManageTopicsConfig.ManageTopicsTitleModel.class, manageTopicsTitleModel);
        if (manageTopicsTitleModel2 == null) {
            manageTopicsTitleModel2 = manageTopicsTitleModel;
        }
        if (manageTopicsTitleModel2 == null || (string = manageTopicsTitleModel2.title) == null) {
            string = context2.getString(2131834523);
        }
        tuxTextView.setText(string);
        tuxTextView.LJJJJI(28.0f);
        ManageTopicsConfig.ManageTopicsTitleModel manageTopicsTitleModel3 = (ManageTopicsConfig.ManageTopicsTitleModel) SettingsManager.LIZLLL().LJIIIIZZ("manage_topics_config", ManageTopicsConfig.ManageTopicsTitleModel.class, manageTopicsTitleModel);
        if (manageTopicsTitleModel3 != null) {
            manageTopicsTitleModel = manageTopicsTitleModel3;
        }
        if (manageTopicsTitleModel == null || (string2 = manageTopicsTitleModel.desc) == null) {
            string2 = context.getString(2131834531);
        }
        String string3 = context.getString(2131836451);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string2);
        sbLIZ.append(' ');
        sbLIZ.append(string3);
        sbLIZ.append(' ');
        C444910HcX c444910HcX = new C444910HcX(C2188811AlT.LIZIZ(sbLIZ));
        c444910HcX.LIZ(51);
        C786410Ut5.s2(c444910HcX, new AbstractC426530Gnz() { // from class: X.0gwX
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                AwS562S0100000_18 awS562S0100000_18 = c1166690gSxUR.LLILLL;
                if (awS562S0100000_18 != null) {
                    awS562S0100000_18.invoke();
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                Integer numLIZ = C1308910kAL.LIZ(R.attr.a1j, context);
                if (numLIZ != null) {
                    textPaint.setColor(numLIZ.intValue());
                }
                C444890HcV c444890HcV = new C444890HcV();
                c444890HcV.LIZ(52);
                textPaint.setTypeface(c444890HcV.getTypeface());
                textPaint.setUnderlineText(false);
            }
        }, string2.length(), r1.length() - 1, 18);
        textView.setText(c444910HcX);
        textView.setMovementMethod(C431260Gvc.LIZ);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewTd.findViewById(R.id.ujk);
        c1166690gSxUR.LLILZ = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext()));
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SeekBarCell.class);
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
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
