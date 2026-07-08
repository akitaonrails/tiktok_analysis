package com.ss.android.ugc.aweme.friendstab.ui.input;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0C64;
import X.C0I7D;
import X.C0QSJ;
import X.C0S1B;
import X.C0WZX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1210004oM;
import X.C1386160mAw;
import X.C1388190mED;
import X.C1395350mPl;
import X.C1395370mPn;
import X.C1395430mPt;
import X.C13LE;
import X.C1401780ma8;
import X.C1402120mag;
import X.C1447800nmM;
import X.C1599640rjG;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C1906580ziK;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C199Y;
import X.C19EG;
import X.C19GS;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C438600HHu;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1395470mPx;
import X.InterfaceC1395500mQ0;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1737690vJv;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewTreeObserverOnGlobalLayoutListenerC1395440mPu;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS121S0100000_21;
import Y.ATListenerS454S0100000_21;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragment;
import com.ss.android.ugc.aweme.friendstab.ui.input.model.TextPublishModel;
import com.ss.android.ugc.aweme.friendstab.ui.input.viewmodel.FriendsTextPublishViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS34S0001000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS71S1000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsTextPublishKeyboardFragment extends AbsFragment implements InterfaceC1395500mQ0, InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final C1395370mPn LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public static final int LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiM+ICo9LDY4KC19PSxiICHELIOSEjPTFiDz06LSsoOhs2MDEcPC0/ITYkAioqKiotOysVOiQrJCo9PA==";
    public final C1395350mPl LL;
    public View LLILLJJLI;
    public TuxTextView LLILLL;
    public C0I7D LLILZ;
    public TuxTextView LLILZIL;
    public C197039127h LLILZLL;
    public AvatarComponentView LLIZ;
    public View LLIZLLLIL;
    public TuxIconView LLJ;
    public View LLJI;
    public View LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public FrameLayout LLJILLL;
    public final AssemVMLazy LLJJ;
    public ViewTreeObserverOnGlobalLayoutListenerC1395440mPu LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public WeakReference<DefaultLifecycleObserver> LLJJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0mPn] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsTextPublishKeyboardFragment.class, "friendsTextPublishVM", "getFriendsTextPublishVM()Lcom/ss/android/ugc/aweme/friendstab/ui/input/viewmodel/FriendsTextPublishViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJ = new Object() { // from class: X.0mPn
        };
        LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(15.305d)));
        LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(131));
        LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(115));
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{FriendsTextPublishKeyboardFragmentVScope.class, FriendsTextPublishKeyboardFragmentVScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FriendsTextPublishKeyboardFragmentVScope.class);
        arrayList.add(FriendsTextPublishKeyboardFragmentVScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FriendsTextPublishKeyboardFragmentVScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final FriendsTextPublishViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (FriendsTextPublishViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DefaultLifecycleObserver defaultLifecycleObserver;
        super.onDestroy();
        ViewTreeObserverOnGlobalLayoutListenerC1395440mPu viewTreeObserverOnGlobalLayoutListenerC1395440mPu = this.LLJJI;
        if (viewTreeObserverOnGlobalLayoutListenerC1395440mPu != null) {
            viewTreeObserverOnGlobalLayoutListenerC1395440mPu.LLILZLL = 0;
            viewTreeObserverOnGlobalLayoutListenerC1395440mPu.LLILZIL = false;
            viewTreeObserverOnGlobalLayoutListenerC1395440mPu.LLIZLLLIL.removeMessages(1);
            C786410Ut5.C3(viewTreeObserverOnGlobalLayoutListenerC1395440mPu.getContentView().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1395440mPu);
            Activity activityLIZ = C1388190mED.LIZ(viewTreeObserverOnGlobalLayoutListenerC1395440mPu.LL);
            if (activityLIZ != null && !activityLIZ.isFinishing()) {
                viewTreeObserverOnGlobalLayoutListenerC1395440mPu.dismiss();
            }
        }
        WeakReference<DefaultLifecycleObserver> weakReference = this.LLJJIJIL;
        if (weakReference == null || (defaultLifecycleObserver = weakReference.get()) == null) {
            return;
        }
        getLifecycle().removeObserver(defaultLifecycleObserver);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJJIJI = true;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLJJIJI = false;
        if (this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = false;
            if (C1599640rjG.LIZIZ.cv()) {
                dismiss();
                return;
            }
        }
        C0I7D c0i7d = this.LLILZ;
        if (c0i7d != null) {
            c0i7d.requestFocus();
        }
        KeyboardUtils.LIZLLL(this.LLILZ);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        FriendsTextPublishViewModel friendsTextPublishViewModelMR = MR();
        C0I7D c0i7d = this.LLILZ;
        String strValueOf = String.valueOf(c0i7d != null ? C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy6aprA2CGe14KWDb0BqTVnZXyu6g3OWZfhWL0EwxLNlchrPApv4zUXWY4Ksa2kCtvuueoroQ==", null)) : null);
        C1395430mPt c1395430mPtVQ2 = friendsTextPublishViewModelMR.vQ2();
        AwS71S1000000_21 awS71S1000000_21 = new AwS71S1000000_21(strValueOf, 6);
        c1395430mPtVQ2.getClass();
        String strLIZ = C1395430mPt.LIZ();
        Map<String, TextPublishModel> map = C1395430mPt.LIZJ;
        Object obj = ((LinkedHashMap) map).get(strLIZ);
        awS71S1000000_21.invoke(obj);
        map.put(strLIZ, (TextPublishModel) obj);
        friendsTextPublishViewModelMR.vQ2().getClass();
        String strLIZ2 = C1395430mPt.LIZ();
        Object obj2 = ((LinkedHashMap) map).get(strLIZ2);
        if (obj2 != null) {
            try {
                ((Keva) C1395430mPt.LIZIZ.getValue()).storeString(strLIZ2, new Gson().LJIILL(obj2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void dismiss() {
        C438600HHu.LIZ(this);
    }

    public FriendsTextPublishKeyboardFragment(C1395350mPl c1395350mPl) {
        this.LL = c1395350mPl;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsTextPublishViewModel.class);
        this.LLJJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS565S0100000_21(c19719912DlLIZ, 594), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 595), AFwS259S0000000_21.get$arr$(164));
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DefaultLifecycleObserver defaultLifecycleObserverJu = C1599640rjG.LIZIZ.Ju();
        if (defaultLifecycleObserverJu != null) {
            getLifecycle().addObserver(defaultLifecycleObserverJu);
            this.LLJJIJIL = new WeakReference<>(defaultLifecycleObserverJu);
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        NavigationScene navigationScene;
        Scene sceneLJII;
        NavigationScene navigationSceneLIZ;
        View viewFindViewById;
        AccountUserService accountUserServiceLJIIJ;
        Window window;
        C0I7D c0i7d;
        Object c098200Yq;
        int i;
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = view;
        this.LLILLL = (TuxTextView) view.findViewById(R.id.tv_username);
        this.LLILZ = (C0I7D) view.findViewById(R.id.hct);
        C0I7D c0i7d2 = this.LLILZ;
        if (c0i7d2 != null) {
            HandlerHook.viewPost(c0i7d2, new ARunnableS121S0100000_21(this, 73));
        }
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.zqu);
        this.LLILZLL = (C197039127h) view.findViewById(R.id.ctf);
        this.LLIZ = (AvatarComponentView) view.findViewById(R.id.l9h);
        this.LLIZLLLIL = view.findViewById(R.id.ex3);
        this.LLJ = (TuxIconView) view.findViewById(R.id.lc0);
        this.LLJI = view.findViewById(R.id.bnt);
        this.LLJIJIL = view.findViewById(R.id.v_keyboard_placeholder);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.tv_text_count);
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.watch_history);
        this.LLJILLL = (FrameLayout) view.findViewById(R.id.ian);
        TuxIconView tuxIconView = this.LLJILJILJ;
        ViewTreeObserverOnGlobalLayoutListenerC1395440mPu viewTreeObserverOnGlobalLayoutListenerC1395440mPu = null;
        decorView = null;
        View decorView = null;
        if (tuxIconView != null) {
            new Object() { // from class: X.0mPz
            }.getClass();
            try {
                c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "friends_v3_text_post_archive_enable", true, true));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Boolean bool = (Boolean) c098200Yq;
            if (bool != null && !bool.booleanValue()) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            User curUser = accountUserServiceLJIIJ.getCurUser();
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(curUser.getNickname());
            }
            AvatarComponentView avatarComponentView = this.LLIZ;
            if (avatarComponentView != null) {
                C0S1B.LIZ(avatarComponentView, curUser.getUid(), curUser, this, false, null, 56);
            }
            TuxTextView tuxTextView2 = this.LLILZIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(2131850109);
            }
            C197039127h c197039127h = this.LLILZLL;
            if (c197039127h != null) {
                c197039127h.setText(2131850120);
            }
            FriendsTextPublishViewModel friendsTextPublishViewModelMR = MR();
            friendsTextPublishViewModelMR.setState(new AwS387S0200000_21(friendsTextPublishViewModelMR, this.LL, 87));
            C01GW c01gw = C1210004oM.LIZ;
            if (((String) c01gw.getValue()).length() > 0 && (c0i7d = this.LLILZ) != null) {
                c0i7d.setHint((String) c01gw.getValue());
            }
            C0I7D c0i7d3 = this.LLILZ;
            if (c0i7d3 != null) {
                c0i7d3.setOnTouchListener(new ATListenerS454S0100000_21(this, 19));
            }
            C19EG activity = getActivity();
            if (activity != null) {
                C19EG activity2 = getActivity();
                if (activity2 != null && (window = activity2.getWindow()) != null) {
                    decorView = window.getDecorView();
                }
                viewTreeObserverOnGlobalLayoutListenerC1395440mPu = new ViewTreeObserverOnGlobalLayoutListenerC1395440mPu(activity, decorView);
            }
            this.LLJJI = viewTreeObserverOnGlobalLayoutListenerC1395440mPu;
            if (viewTreeObserverOnGlobalLayoutListenerC1395440mPu != null) {
                viewTreeObserverOnGlobalLayoutListenerC1395440mPu.LLJ = new InterfaceC1395470mPx() { // from class: X.0mPv
                    @Override // X.InterfaceC1395470mPx
                    public final void LLILII() {
                        FriendsTextPublishKeyboardFragment friendsTextPublishKeyboardFragment = this.LIZ;
                        if (friendsTextPublishKeyboardFragment.LLJJIJI) {
                            return;
                        }
                        friendsTextPublishKeyboardFragment.MR().setState(new AwS34S0001000_21(0, 11));
                    }

                    @Override // X.InterfaceC1395470mPx
                    public final void LLLLZI(int i2) {
                        this.LIZ.MR().setState(new AwS34S0001000_21(i2, 11));
                    }

                    @Override // X.InterfaceC1395470mPx
                    public final void j(int i2) {
                        this.LIZ.MR().setState(new AwS34S0001000_21(i2, 11));
                    }
                };
            }
            ViewTreeObserverOnGlobalLayoutListenerC1395440mPu viewTreeObserverOnGlobalLayoutListenerC1395440mPu2 = this.LLJJI;
            if (viewTreeObserverOnGlobalLayoutListenerC1395440mPu2 != null) {
                C786410Ut5.x3(viewTreeObserverOnGlobalLayoutListenerC1395440mPu2.getContentView().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1395440mPu2);
                View view2 = viewTreeObserverOnGlobalLayoutListenerC1395440mPu2.LLILLJJLI;
                if (view2 != null) {
                    HandlerHook.viewPost(view2, new ARunnableS106S0100000_6(viewTreeObserverOnGlobalLayoutListenerC1395440mPu2, 249));
                }
            }
            View view3 = this.LLJIJIL;
            if (view3 != null) {
                int i2 = ViewTreeObserverOnGlobalLayoutListenerC1395440mPu.LLJIJIL;
                if (i2 == 0) {
                    i2 = ViewTreeObserverOnGlobalLayoutListenerC1395440mPu.LLJI.getInt("key_board_height", 0);
                }
                C1386160mAw.LJFF(i2, view3);
            }
        }
        View view4 = getView();
        if (view4 != null && (viewFindViewById = view4.findViewById(R.id.lc0)) != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 202), viewFindViewById);
        }
        TuxIconView tuxIconView2 = this.LLJILJILJ;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS155S0100000_21(this, 203));
        }
        C197039127h c197039127h2 = this.LLILZLL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS155S0100000_21(this, 204));
        }
        TuxIconView tuxIconView3 = this.LLJ;
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new ACListenerS155S0100000_21(this, 205));
        }
        C0I7D c0i7d4 = this.LLILZ;
        if (c0i7d4 != null) {
            c0i7d4.addTextChangedListener(new C1402120mag(this, 6));
        }
        View view5 = this.LLILLJJLI;
        if (view5 != null) {
            view5.setOnKeyListener(new View.OnKeyListener() { // from class: X.0mPw
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view6, int i3, KeyEvent keyEvent) {
                    if (i3 == 4 && keyEvent.getAction() == 1) {
                        this.LL.dismiss();
                        return true;
                    }
                    return false;
                }
            });
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (sceneLJII = abstractC1387200mCcLJ.LJII()) != null && (navigationSceneLIZ = C1447800nmM.LIZ(sceneLJII)) != null) {
            final int i3 = 0;
            navigationSceneLIZ.LLLIILIL(this, new InterfaceC1737690vJv(this, i3) { // from class: X.0mb3
                public final int $t;
                public Object l0;

                @Override // X.InterfaceC1737690vJv
                public final boolean onBackPressed() {
                    switch (this.$t) {
                        case 0:
                            return onBackPressed$0(this);
                        case 1:
                            return onBackPressed$1(this);
                        default:
                            return false;
                    }
                }

                public static final boolean onBackPressed$0(C1402350mb3 c1402350mb3) {
                    ((FriendsTextPublishKeyboardFragment) c1402350mb3.l0).dismiss();
                    return true;
                }

                public static final boolean onBackPressed$1(C1402350mb3 c1402350mb3) {
                    ((FriendsTextPublishKeyboardFragment) c1402350mb3.l0).dismiss();
                    return true;
                }

                {
                    this.$t = i3;
                    this.l0 = this;
                }
            });
        } else {
            C19EG activity3 = getActivity();
            if ((activity3 instanceof C199Y) && (navigationScene = ((C199Y) activity3).getNavigationScene()) != null) {
                final int i4 = 1;
                navigationScene.LLLIILIL(this, new InterfaceC1737690vJv(this, i4) { // from class: X.0mb3
                    public final int $t;
                    public Object l0;

                    @Override // X.InterfaceC1737690vJv
                    public final boolean onBackPressed() {
                        switch (this.$t) {
                            case 0:
                                return onBackPressed$0(this);
                            case 1:
                                return onBackPressed$1(this);
                            default:
                                return false;
                        }
                    }

                    public static final boolean onBackPressed$0(C1402350mb3 c1402350mb3) {
                        ((FriendsTextPublishKeyboardFragment) c1402350mb3.l0).dismiss();
                        return true;
                    }

                    public static final boolean onBackPressed$1(C1402350mb3 c1402350mb3) {
                        ((FriendsTextPublishKeyboardFragment) c1402350mb3.l0).dismiss();
                        return true;
                    }

                    {
                        this.$t = i4;
                        this.l0 = this;
                    }
                });
            } else {
                C19EG activity4 = getActivity();
                if (activity4 != null && (onBackPressedDispatcher = activity4.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.LIZ(this, new C1401780ma8(this, 2));
                }
            }
        }
        C0I7D c0i7d5 = this.LLILZ;
        if (c0i7d5 != null) {
            c0i7d5.sendAccessibilityEvent(8);
        }
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0mPq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1395390mPp) obj).LLILLJJLI);
            }
        }, null, new AwS635S0100000_21(this, 64), 6);
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0mPs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1395390mPp) obj).LLILZLL;
            }
        }, null, new AwS635S0100000_21(this, 65), 6);
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0mPr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1395390mPp) obj).LLILLL);
            }
        }, null, new AwS635S0100000_21(this, 66), 6);
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0mPo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1395390mPp) obj).LLIZ;
            }
        }, null, new AwS635S0100000_21(this, 67), 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.caw, viewGroup, false);
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
