package com.ss.android.ugc.aweme.social.creation.mediapicker;

import X.AbstractC214814194y;
import X.C01GW;
import X.C0C64;
import X.C0L2P;
import X.C0MGE;
import X.C1308910kAL;
import X.C1388005by;
import X.C1390380mHk;
import X.C1447800nmM;
import X.C14EU;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1669670tYD;
import X.C1720106oR;
import X.C19719212De;
import X.C19EG;
import X.C1DRG;
import X.C201955140j;
import X.C21390618nQ;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C301590Brx;
import X.C452501pT;
import X.C536350L1t;
import X.C537340L5o;
import X.C560320LyI;
import X.C560350LyL;
import X.C560370LyN;
import X.C560380LyO;
import X.C560470LyX;
import X.C581250Mqx;
import X.C786410Ut5;
import X.EnumC1427810nG7;
import X.EnumC560450LyV;
import X.InterfaceC20630815oA;
import X.InterfaceC523020KfE;
import X.InterfaceC536360L1u;
import X.InterfaceC560340LyK;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.adaptation.ab.SocialVideoEditPushLaunchParams;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS444S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes9.dex */
public final class SocialMediaPickerPageScene extends AbstractC214814194y implements InterfaceC536360L1u, InterfaceC523020KfE, C0MGE, InterfaceC560340LyK, InterfaceC20630815oA {
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 360));
    public EnterStoryParam LLJJJ;
    public Pair<Integer, Integer> LLJJJIL;
    public long LLJJJJ;

    public final boolean LLLLJI() {
        if (this.mView == null) {
            return false;
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null && navigationSceneLIZ.LLLF) {
            return false;
        }
        if (this.LLJJJJ != 0) {
            int i = C2187451AjH.LIZ;
            return false;
        }
        this.LLJJJJ = SystemClock.elapsedRealtime();
        return true;
    }

    public final void LLLLL() {
        C19EG c19eg;
        Integer second;
        Integer first;
        Activity activity = this.mActivity;
        if (!(activity instanceof C19EG) || (c19eg = (C19EG) activity) == null) {
            return;
        }
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
        Pair<Integer, Integer> pair = this.LLJJJIL;
        int iIntValue = -1;
        tuxImmersionBar.LJIIIZ((pair == null || (first = pair.getFirst()) == null) ? -1 : first.intValue());
        Pair<Integer, Integer> pair2 = this.LLJJJIL;
        if (pair2 != null && (second = pair2.getSecond()) != null) {
            iIntValue = second.intValue();
        }
        tuxImmersionBar.LJFF(iIntValue);
        immersionBarLJIILJJIL.LJIIJ(true);
        tuxImmersionBar.LIZLLL();
    }

    public final boolean LLLLLIL() {
        EnterStoryParam enterStoryParam = this.LLJJJ;
        if (enterStoryParam == null) {
            return false;
        }
        String shootWay = enterStoryParam.getShootWay();
        String shootEnterMethod = enterStoryParam.getShootEnterMethod();
        if (shootEnterMethod == null) {
            shootEnterMethod = enterStoryParam.getEnterMethod();
        }
        String shootEnterFrom = enterStoryParam.getShootEnterFrom();
        if (shootEnterFrom == null) {
            shootEnterFrom = enterStoryParam.getEnterFrom();
        }
        return C0L2P.LIZIZ(new SocialVideoEditPushLaunchParams(shootWay, shootEnterMethod, shootEnterFrom));
    }

    @Override // X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        if (LLLLLIL()) {
            LLLLL();
        }
        try {
            C201955140j.LJFF("CreativeToolStayTimeMonitor", "SocialMediaPickerPage onDestroyView");
            C560380LyO.LIZ.getClass();
            if (!C560380LyO.LIZLLL) {
                C560350LyL c560350LyL = C560380LyO.LJIILIIL;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C560380LyO.LJIILLIIL(new C560470LyX(EnumC560450LyV.NONE, jCurrentTimeMillis));
                C560380LyO.LJIIJJI(c560350LyL.LJIIJ, jCurrentTimeMillis, c560350LyL.LJIIIIZZ, "close_upload_page");
                C560380LyO.LIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialMediaPickerPage onDestroyView error: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJFF("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        }
        super.onDestroyView();
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
    }

    @Override // X.InterfaceC536360L1u
    public final Context LJJIZ() {
        return requireContext();
    }

    @Override // X.InterfaceC20630815oA
    public final boolean LJJJ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "soc_media_picker_disable_scene_recycle", true) == 1;
    }

    @Override // X.InterfaceC536360L1u
    public final C19EG LLJJIJIIJIL() {
        return requireFragmentActivity();
    }

    @Override // X.AbstractC214814194y
    public final boolean LLLLIILL() {
        return C301590Brx.LIZ();
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final void finish() {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLJL();
            if (Intrinsics.LJFF(navigationSceneLIZ.LLLLIIIILLL(), this)) {
                onBackPressed();
            } else if (LLLLJI()) {
                navigationSceneLIZ.remove(this);
            }
        }
    }

    @Override // X.InterfaceC536360L1u
    public final C1DRG getDiContainer() {
        return C1664600tQ2.LJIIIZ(this);
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        if (!LLLLJI()) {
            return true;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" onBackPressed pop op real entered");
        C1720106oR.LIZ("SocialMediaPickerPageScene", C2188811AlT.LIZIZ(sbLIZ));
        NavigationScene navigationSceneLIZIZ = C1447800nmM.LIZIZ(this);
        C560320LyI c560320LyI = new C560320LyI();
        c560320LyI.LIZIZ = true;
        c560320LyI.LIZJ = true;
        c560320LyI.LIZLLL = true;
        c560320LyI.LIZ = new C21390618nQ();
        navigationSceneLIZIZ.LLLLLLIL(c560320LyI.LIZ());
        return true;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        C19EG c19eg;
        super.onResume();
        Activity activity = this.mActivity;
        if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
            immersionBarLJIILJJIL.LJIIJ(false);
            tuxImmersionBar.LJIIIIZZ(R.attr.z_);
            tuxImmersionBar.LJ(R.attr.z_);
            tuxImmersionBar.LIZLLL();
        }
        SocialMediaPickerViewModel socialMediaPickerViewModel = (SocialMediaPickerViewModel) this.LLJJIJIL.getValue();
        if (socialMediaPickerViewModel != null) {
            socialMediaPickerViewModel.onEvent$social_creation_mediapicker_release(new C560370LyN(this));
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        if (LLLLLIL()) {
            return;
        }
        LLLLL();
    }

    @Override // X.InterfaceC536360L1u
    public final void LLIIJI(CreativeToastBuilder creativeToastBuilder) {
        C1390380mHk.LIZ(requireActivity(), 3047, creativeToastBuilder);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLIILIL(this, new C581250Mqx(this, 4));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C537340L5o c537340L5o) {
        SocialMediaPickerViewModel socialMediaPickerViewModel = (SocialMediaPickerViewModel) this.LLJJIJIL.getValue();
        if (socialMediaPickerViewModel != null) {
            socialMediaPickerViewModel.onEvent$social_creation_mediapicker_release(new C1388005by(c537340L5o.LIZ));
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(final View view, Bundle bundle) {
        String creationId;
        String shootWay;
        super.onViewCreated(view, bundle);
        final AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(125);
        final AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 359);
        view.setOnTouchListener(new View.OnTouchListener(view, awS552S0100000_8, aFwS239S0000000_8) { // from class: X.0Ehp
            public float LL = -1.0f;
            public float LLILLJJLI = -1.0f;
            public boolean LLILLL;
            public boolean LLILZ;
            public final int LLILZIL;
            public final float LLILZLL;
            public final /* synthetic */ View LLIZ;
            public final /* synthetic */ Function1<Boolean, Unit> LLIZLLLIL;
            public final /* synthetic */ Function0<Unit> LLJ;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean z;
                if (motionEvent == null) {
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    float f = 0.0f;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            return false;
                        }
                        float rawY = motionEvent.getRawY() - this.LL;
                        if (rawY >= 0.0f) {
                            f = rawY;
                        }
                        if (!this.LLILLL) {
                            if (f <= this.LLILZIL || f <= Math.abs(motionEvent.getRawX() - this.LLILLJJLI)) {
                                return false;
                            }
                            this.LLILLL = true;
                        }
                        C786410Ut5.ed(this.LLIZ, f);
                        if (f > this.LLILZLL) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.LLILZ && !z) {
                            this.LLIZLLLIL.invoke(Boolean.FALSE);
                            this.LLILZ = false;
                        }
                        if (!this.LLILZ && z) {
                            this.LLIZLLLIL.invoke(Boolean.TRUE);
                            this.LLILZ = true;
                        }
                        return true;
                    }
                    if (this.LLILZ) {
                        this.LLJ.invoke();
                        return true;
                    }
                    if (!this.LLILLL) {
                        return false;
                    }
                    this.LLIZ.animate().translationY(0.0f).setDuration(200L).start();
                    return true;
                }
                this.LL = motionEvent.getRawY();
                this.LLILLJJLI = motionEvent.getRawX();
                return true;
            }

            {
                this.LLIZ = view;
                this.LLIZLLLIL = aFwS239S0000000_8;
                this.LLJ = awS552S0100000_8;
                this.LLILZIL = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                this.LLILZLL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL * view.getResources().getDisplayMetrics().density;
            }
        });
        C201955140j.LJFF("CreativeToolStayTimeMonitor", "SocialMediaPickerPage init");
        C560380LyO c560380LyO = C560380LyO.LIZ;
        Lifecycle lifecycle = getLifecycle();
        c560380LyO.getClass();
        C560380LyO.LIZIZ(lifecycle, false);
        EnterStoryParam enterStoryParam = this.LLJJJ;
        String str = "";
        if (enterStoryParam == null || (creationId = enterStoryParam.getCreationId()) == null) {
            creationId = "";
        }
        EnterStoryParam enterStoryParam2 = this.LLJJJ;
        if (enterStoryParam2 != null && (shootWay = enterStoryParam2.getShootWay()) != null) {
            str = shootWay;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterStoryMediaPicker: creationId = ");
        sbLIZ.append(creationId);
        sbLIZ.append(", shootWay = ");
        sbLIZ.append(str);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C560350LyL c560350LyL = C560380LyO.LJIILIIL;
        c560350LyL.LJIIIIZZ = "shoot";
        c560350LyL.LJIIJ = jCurrentTimeMillis;
        c560350LyL.LIZ = creationId;
        c560350LyL.LIZIZ = str;
        c560350LyL.LJ = false;
        C560380LyO.LJII = true;
        C560380LyO.LIZJ = true;
        C560380LyO.LJIILLIIL(new C560470LyX(EnumC560450LyV.ALBUM, jCurrentTimeMillis));
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer numValueOf;
        Integer numValueOf2;
        EnumC1427810nG7 enumC1427810nG7;
        int iIntValue;
        EnterStoryParam enterStoryParam;
        C536350L1t c536350L1tEQ2;
        Window window;
        Window window2;
        Activity activity = this.mActivity;
        if (activity != null && (window2 = activity.getWindow()) != null) {
            numValueOf = Integer.valueOf(window2.getStatusBarColor());
        } else {
            numValueOf = null;
        }
        Activity activity2 = this.mActivity;
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            numValueOf2 = Integer.valueOf(window.getNavigationBarColor());
        } else {
            numValueOf2 = null;
        }
        this.LLJJJIL = new Pair<>(numValueOf, numValueOf2);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (enterStoryParam = (EnterStoryParam) bundle2.getParcelable("story_param")) != null) {
            this.LLJJJ = enterStoryParam;
            SocialMediaPickerViewModel socialMediaPickerViewModel = (SocialMediaPickerViewModel) this.LLJJIJIL.getValue();
            if (socialMediaPickerViewModel != null && (c536350L1tEQ2 = socialMediaPickerViewModel.EQ2(bundle2, enterStoryParam, this)) != null) {
                C1654320t9S.LIZIZ(this, AFwS239S0000000_8.get$arr$(253));
                C1664590tQ1.LIZLLL(this, "SocialCreationMediaPickerScene", false, new AwS374S0200000_8(this, c536350L1tEQ2, 146), 2);
                C1664600tQ2.LIZ(this, "SocialCreationMediaPickerScene", new AwS217S0300000_8(c536350L1tEQ2, this, enterStoryParam, 31));
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.f9r, viewGroup, false);
        SocialMediaPickerViewModel socialMediaPickerViewModel2 = (SocialMediaPickerViewModel) this.LLJJIJIL.getValue();
        if (socialMediaPickerViewModel2 != null) {
            ComposeView composeView = new ComposeView(requireContext(), null, 6);
            if (socialMediaPickerViewModel2.LL.getPageUIConfig().getSupportDaylightMode()) {
                enumC1427810nG7 = EnumC1427810nG7.Auto;
            } else {
                enumC1427810nG7 = EnumC1427810nG7.Dark;
            }
            C1669670tYD.LJ(composeView, enumC1427810nG7, new C19719212De(555414727, new AwS444S0200000_8(socialMediaPickerViewModel2, this, 8), true));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.z_, viewGroup2.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            viewGroup2.setBackground(new ColorDrawable(iIntValue));
            viewGroup2.addView(composeView, 0);
        }
        return viewGroup2;
    }
}
