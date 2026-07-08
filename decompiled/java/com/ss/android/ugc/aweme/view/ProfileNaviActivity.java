package com.ss.android.ugc.aweme.view;

import X.AbstractC1252750ihl;
import X.AnonymousClass1102;
import X.C004I;
import X.C01GW;
import X.C09JN;
import X.C0CNO;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11S5;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1634100scq;
import X.C1644460stY;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1765020w20;
import X.C19225010Jc;
import X.C19423210ys;
import X.C19425610zG;
import X.C19427110zV;
import X.C19429110zp;
import X.C19EH;
import X.C20684815ws;
import X.C2187701Ajg;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C786410Ut5;
import X.C838410Wul;
import X.C985403tE;
import X.EnumC335920DEw;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.ViewTreeObserverOnGlobalLayoutListenerC1620810sHP;
import Y.AfS175S0100000_6;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviInfoRequest;
import com.ss.android.ugc.aweme.view.hub.ProfileNaviHubFragment;
import com.ss.android.ugc.aweme.view.onboarding.ProfileNaviOnboardingFragment;
import com.ss.android.ugc.aweme.view.profileImageEditor.ProfileNaviProfileImageEditorContainerFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS135S0101000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS60S0210000_6;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.AwS91S1200000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviActivity extends BaseActivity implements InterfaceC1171660gay {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSMlLDh9GDcjLyY/LQstPyYSKzElPyYnMQ==";
    public FrameLayout LL;
    public CardView LLILLJJLI;
    public C1390410mHn LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 570));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 567));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 568));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 566));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 572));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 571));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 565));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 573));

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final ProfileNaviEditorViewModel LLLLLZL() {
        return (ProfileNaviEditorViewModel) this.LLILZIL.getValue();
    }

    public final ProfileNaviOnboardingViewModel LLLLZI() {
        return (ProfileNaviOnboardingViewModel) this.LLILZ.getValue();
    }

    public final FrameLayout LLLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.s3x);
            this.LL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final void LLLLZLL() {
        LLLLLZL().init(this);
        ProfileNaviOnboardingViewModel profileNaviOnboardingViewModelLLLLZI = LLLLZI();
        boolean zBooleanValue = ((Boolean) this.LLJIJIL.getValue()).booleanValue();
        profileNaviOnboardingViewModelLLLLZI.getClass();
        profileNaviOnboardingViewModelLLLLZI.setState(new AwS41S0010000_29(zBooleanValue, 44));
        this.LLIZ.getValue().getClass();
        C0CNO.LIZLLL(0L, AFwS218S0000000_29.get$arr$(442));
    }

    public final void LLLLZLLLI() {
        if (getSupportFragmentManager().LJJLIIIIJ() > 1) {
            getSupportFragmentManager().LJLLILLLL();
        } else {
            finish();
            C19225010Jc.LIZ.clear();
        }
    }

    public final void LLLZIL() {
        ProfileNaviOnboardingViewModel profileNaviOnboardingViewModelLLLLZI = LLLLZI();
        profileNaviOnboardingViewModelLLLLZI.getClass();
        profileNaviOnboardingViewModelLLLLZI.setState(AFwS273S0000000_29.get$arr$(319));
        ProfileNaviEditorViewModel profileNaviEditorViewModelLLLLLZL = LLLLLZL();
        profileNaviEditorViewModelLLLLLZL.getClass();
        profileNaviEditorViewModelLLLLLZL.setStateImmediate(AFwS273S0000000_29.get$arr$(318));
        C19425610zG.LIZ.clear();
        C19425610zG.LIZIZ = null;
        C19429110zp c19429110zp = C19429110zp.LIZ;
        synchronized (c19429110zp) {
            c19429110zp.LIZ();
            C19429110zp.LJ = null;
        }
        ProfileNaviCreatorState profileNaviCreatorState = (ProfileNaviCreatorState) ((JediViewModel) this.LLIZ.getValue()).FQ2();
        profileNaviCreatorState.setProfileImageBackgroundColor(null);
        profileNaviCreatorState.setContinueEditing(false);
        profileNaviCreatorState.setShouldShowSetProfileView(false);
        ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) ((JediViewModel) this.LLIZLLLIL.getValue()).FQ2();
        profileNaviSwitcherState.setNaviList(null);
        profileNaviSwitcherState.setHasMore(true);
        ProfileNaviHubState profileNaviHubState = (ProfileNaviHubState) ((JediViewModel) this.LLILZLL.getValue()).FQ2();
        profileNaviHubState.setContinueEditing(false);
        profileNaviHubState.setDoneNaviExperience(false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        LLLZIL();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        LLLLZLLLI();
    }

    public final void LLLZZIL(boolean z) {
        if (z) {
            KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
            if (callbackFindViewById == null) {
                callbackFindViewById = findViewById(R.id.s4s);
                this.LLILLJJLI = (CardView) callbackFindViewById;
            }
            C786410Ut5.LLILLL((CardView) callbackFindViewById, 0);
            KeyEvent.Callback callbackFindViewById2 = this.LLILLL;
            if (callbackFindViewById2 == null) {
                callbackFindViewById2 = findViewById(R.id.s4r);
                this.LLILLL = (C1390410mHn) callbackFindViewById2;
            }
            ((C1390410mHn) callbackFindViewById2).LIZJ();
            return;
        }
        KeyEvent.Callback callbackFindViewById3 = this.LLILLL;
        if (callbackFindViewById3 == null) {
            callbackFindViewById3 = findViewById(R.id.s4r);
            this.LLILLL = (C1390410mHn) callbackFindViewById3;
        }
        ((C1390410mHn) callbackFindViewById3).LIZLLL();
        KeyEvent.Callback callbackFindViewById4 = this.LLILLJJLI;
        if (callbackFindViewById4 == null) {
            callbackFindViewById4 = findViewById(R.id.s4s);
            this.LLILLJJLI = (CardView) callbackFindViewById4;
        }
        C786410Ut5.LLILLL((CardView) callbackFindViewById4, 4);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("is_fullbody", false);
        if (stringExtra != null) {
            C19423210ys.LIZ.getClass();
            C19423210ys.LIZJ = booleanExtra;
            C19423210ys.LIZIZ = stringExtra;
        }
        setContentView(R.layout.egr);
        LLLLZLL();
        if (bundle == null) {
            C786410Ut5.LJZ(4, LLLLZIL());
            ViewTreeObserver viewTreeObserver = LLLLZIL().getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                ViewTreeObserverOnGlobalLayoutListenerC1620810sHP viewTreeObserverOnGlobalLayoutListenerC1620810sHP = new ViewTreeObserverOnGlobalLayoutListenerC1620810sHP(this, 3);
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1620810sHP);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1620810sHP, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        } else {
            C786410Ut5.LJZ(0, LLLLZIL());
        }
        int intExtra = getIntent().getIntExtra("entry_point", 1);
        try {
            stringExtra3 = getIntent().getStringExtra("edit_navi_id_key");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (stringExtra3 != null && stringExtra3.length() != 0) {
            AwS135S0101000_29 awS135S0101000_29 = new AwS135S0101000_29(this, intExtra, 13);
            ProfileNaviInfoRequest.Api api = ProfileNaviInfoRequest.LIZ;
            AnonymousClass1102.LIZ(stringExtra3).LJJIJIIJI(C11S5.LIZ).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS175S0100000_6(awS135S0101000_29, 19), new C09JN() { // from class: X.00PV
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("ProfileNaviActivity@dab9.fetchNavi$2");
                    C1C7U.LIZIZ("ProfileNaviActivity@dab9.fetchNavi$2");
                }
            });
        } else {
            try {
                stringExtra2 = getIntent().getStringExtra("edit_navi_starter_id_key");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                LLLLZLLIL(intExtra, null);
            } else {
                ProfileNaviOnboardingViewModel profileNaviOnboardingViewModelLLLLZI = LLLLZI();
                int i = CastIntegerProtector.parseInt(stringExtra2);
                profileNaviOnboardingViewModelLLLLZI.getClass();
                profileNaviOnboardingViewModelLLLLZI.setState(new AwS41S0001000_29(i, 33));
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("EDIT_TEMPLATE_FROM_CREATION", true);
                LLLLZLLIL(intExtra, bundle2);
            }
        }
        C11EA.LJII(this, LLLLZI(), new C2217371BqR() { // from class: X.10z6
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviOnboardingState) obj).getStarterAvatarSelected();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setStarterAvatarSelected((ProfileNaviDataModel) obj2);
            }
        }, new AwS643S0100000_29(this, 164));
        C11EA.LJII(this, (JediViewModel) this.LLJI.getValue(), new C2217371BqR() { // from class: X.110E
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviAutoCreationState) obj).getAutoCreationComplete());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviAutoCreationState) obj).setAutoCreationComplete(((Boolean) obj2).booleanValue());
            }
        }, new AwS643S0100000_29(this, 165));
        C11EA.LJII(this, LLLLZI(), new C2217371BqR() { // from class: X.10z5
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviOnboardingState) obj).getShouldStartAutoCreation());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setShouldStartAutoCreation(((Boolean) obj2).booleanValue());
            }
        }, new AwS643S0100000_29(this, 166));
        C11EA.LJII(this, LLLLLZL(), new C2217381BqS() { // from class: X.10zT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviEditorState) obj).isQuitEditing());
            }
        }, new AwS642S0100000_28(this, 97));
        C11EA.LJII(this, (JediViewModel) this.LLIZ.getValue(), new C2217371BqR() { // from class: X.1108
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviCreatorState) obj).isDoneCreatingProfileImage());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviCreatorState) obj).setDoneCreatingProfileImage(((Boolean) obj2).booleanValue());
            }
        }, new AwS642S0100000_28(this, 96));
        C11EA.LJII(this, (JediViewModel) this.LLIZ.getValue(), new C2217371BqR() { // from class: X.1106
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviCreatorState) obj).isBackPressed());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviCreatorState) obj).setBackPressed(((Boolean) obj2).booleanValue());
            }
        }, new AwS643S0100000_29(this, 160));
        C11EA.LJII(this, (JediViewModel) this.LLJI.getValue(), new C2217371BqR() { // from class: X.1107
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviAutoCreationState) obj).isBackPressed());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviAutoCreationState) obj).setBackPressed(((Boolean) obj2).booleanValue());
            }
        }, new AwS643S0100000_29(this, 161));
        C11EA.LJII(this, (JediViewModel) this.LLILZLL.getValue(), new C2217371BqR() { // from class: X.1103
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviHubState) obj).isContinueEditing());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviHubState) obj).setContinueEditing(((Boolean) obj2).booleanValue());
            }
        }, new AwS642S0100000_28(this, 98));
        C11EA.LJII(this, (JediViewModel) this.LLILZLL.getValue(), new C2217371BqR() { // from class: X.1104
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviHubState) obj).isDoneNaviExperience());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviHubState) obj).setDoneNaviExperience(((Boolean) obj2).booleanValue());
            }
        }, new AwS642S0100000_28(this, 99));
        C11EA.LJII(this, (JediViewModel) this.LLIZ.getValue(), new C2217371BqR() { // from class: X.1105
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviCreatorState) obj).getShouldShowSetProfileView());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviCreatorState) obj).setShouldShowSetProfileView(((Boolean) obj2).booleanValue());
            }
        }, new AwS642S0100000_28(this, 100));
        C11EA.LJII(this, (JediViewModel) this.LLIZLLLIL.getValue(), new C2217371BqR() { // from class: X.110A
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviSwitcherState) obj).getShouldCreateNewNavi());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviSwitcherState) obj).setShouldCreateNewNavi(((Boolean) obj2).booleanValue());
            }
        }, new AwS642S0100000_28(this, 101));
        C11EA.LJII(this, (JediViewModel) this.LLILZLL.getValue(), new C2217371BqR() { // from class: X.110B
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviHubState) obj).isNaviDeleted());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviHubState) obj).setNaviDeleted(((Boolean) obj2).booleanValue());
            }
        }, new AwS642S0100000_28(this, 102));
        C11EA.LJII(this, (JediViewModel) this.LLJ.getValue(), new C2217371BqR() { // from class: X.10Jt
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviSpinnerState) obj).getShouldShowSpinner());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviSpinnerState) obj).setShouldShowSpinner(((Boolean) obj2).booleanValue());
            }
        }, new AwS643S0100000_29(this, 162));
        C11EA.LJII(this, (JediViewModel) this.LLJI.getValue(), new C2217371BqR() { // from class: X.110D
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviAutoCreationState) obj).getShouldShowSkintoneSelectFragment());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviAutoCreationState) obj).setShouldShowSkintoneSelectFragment(((Boolean) obj2).booleanValue());
            }
        }, new AwS643S0100000_29(this, 163));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public static void LLLZ(ProfileNaviActivity profileNaviActivity, Fragment fragment) {
        profileNaviActivity.getClass();
        String name = fragment.getClass().getName();
        for (int iLJJLIIIIJ = profileNaviActivity.getSupportFragmentManager().LJJLIIIIJ() - 1; -1 < iLJJLIIIIJ; iLJJLIIIIJ--) {
            String name2 = profileNaviActivity.getSupportFragmentManager().LJJLI(iLJJLIIIIJ).getName();
            if (name2 != null && Intrinsics.LJFF(name2, name)) {
                profileNaviActivity.getSupportFragmentManager().LJLLJ(0, name);
                return;
            }
        }
        C19EH c19ehLJIIJ = profileNaviActivity.getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.s3x, fragment, "navi_fragment");
        c19ehLJIIJ.LJII(name);
        c19ehLJIIJ.LJIIIZ();
    }

    public final void LLLLZLLIL(int i, Bundle bundle) {
        LLLZZIL(false);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            LLLZ(this, new ProfileNaviHubFragment());
                            return;
                        } else {
                            LLLZLZ("auto_avatar", true, 2131827119, AFwS218S0000000_29.get$arr$(251));
                            return;
                        }
                    }
                    ProfileNaviProfileImageEditorContainerFragment profileNaviProfileImageEditorContainerFragment = new ProfileNaviProfileImageEditorContainerFragment();
                    profileNaviProfileImageEditorContainerFragment.LLIZ = "avatar_hub";
                    LLLZ(this, profileNaviProfileImageEditorContainerFragment);
                    return;
                }
                LLLZ(this, new ProfileNaviHubFragment());
                return;
            }
            LLLZLZ("avatar_hub", false, 2131827143, new AwS573S0100000_29(bundle, 569));
            return;
        }
        LLLZ(this, new ProfileNaviOnboardingFragment());
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public final void LLLZLZ(String str, boolean z, int i, Function0 function0) {
        LLLLLZL().getClass();
        if (C19427110zV.LIZ && ((Boolean) this.LLJIJIL.getValue()).booleanValue()) {
            AwS60S0210000_6 awS60S0210000_6 = new AwS60S0210000_6(z, (boolean) this, (ProfileNaviActivity) function0, (Function0<? extends Fragment>) 2);
            if (C838410Wul.LIZ(this, "android.permission.CAMERA") != 0) {
                C19423210ys.LIZ.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                C20684815ws.LJIILLIIL("show_avatar_camera_access", c2344009Gk.LIZ);
                C1397580mTM c1397580mTM = new C1397580mTM(this);
                c1397580mTM.LJFF(2131827144);
                c1397580mTM.LIZ(i);
                c1397580mTM.LJII = true;
                C985403tE.LIZ(c1397580mTM, new AwS91S1200000_6(str, this, awS60S0210000_6, 5));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            awS60S0210000_6.invoke(Boolean.TRUE);
            return;
        }
        LLLZ(this, (Fragment) function0.invoke());
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
