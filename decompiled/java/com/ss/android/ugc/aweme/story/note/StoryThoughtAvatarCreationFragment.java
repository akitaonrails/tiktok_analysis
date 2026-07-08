package com.ss.android.ugc.aweme.story.note;

import X.AnonymousClass1278;
import X.C01GW;
import X.C098200Yq;
import X.C0C64;
import X.C0FRP;
import X.C0HQZ;
import X.C0HWQ;
import X.C0LAB;
import X.C0P0T;
import X.C0WZX;
import X.C11GO;
import X.C11GW;
import X.C11GZ;
import X.C123100dR;
import X.C127K;
import X.C127M;
import X.C12BX;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C1391600mJi;
import X.C1449410nox;
import X.C1449420noy;
import X.C1609930rzr;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16H0;
import X.C16H9;
import X.C16HQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C19U1;
import X.C20097413kK;
import X.C20580115fz;
import X.C20580415g2;
import X.C20580815g6;
import X.C20581815gG;
import X.C20583215gU;
import X.C20584615gi;
import X.C20584715gj;
import X.C20587115h7;
import X.C20632315oP;
import X.C20684815ws;
import X.C20748116Gx;
import X.C2204961BRm;
import X.C23250099c;
import X.C287180BNk;
import X.C298260Bma;
import X.C298600Bn8;
import X.C298620BnA;
import X.C418440Gaw;
import X.C426750GoL;
import X.C438620HHw;
import X.C443090HZb;
import X.C444910HcX;
import X.C450720Hlu;
import X.C452501pT;
import X.C497820Jfg;
import X.C751880TeU;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817600W5m;
import X.C856230XiP;
import X.EnumC1216650hlX;
import X.EnumC1235690iGF;
import X.EnumC1257160ios;
import X.EnumC19387610t8;
import X.EnumC20581215gA;
import X.EnumC339980DUm;
import X.EnumC438630HHx;
import X.InterfaceC1173910geb;
import X.InterfaceC440740HQa;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS116S0200000_12;
import Y.ACListenerS133S0200000_31;
import Y.ACListenerS165S0100000_31;
import Y.AObserverS131S0300000_31;
import Y.AObserverS177S0200000_12;
import Y.AObserverS190S0200000_31;
import Y.AObserverS208S0100000_4;
import Y.AObserverS210S0100000_6;
import Y.AObserverS216S0100000_12;
import Y.AObserverS231S0100000_29;
import Y.AObserverS233S0100000_31;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS35S1100000_31;
import Y.ATListenerS463S0100000_31;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS180S1100000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS43S1400000_31;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS92S1300000_31;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS334S0300000_31;
import wh6.AbS710S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class StoryThoughtAvatarCreationFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZisjPSp9HELIOSGzEjOzYHICo5LicnCTMtPS4hCzcpKDs6JysKOy40JSAiPQ==";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1056));
    public C20748116Gx LLIZLLLIL;
    public GestureDetector LLJ;
    public C20580115fz LLJI;
    public C0P0T LLJIJIL;
    public TuxSheet LLJILJIL;
    public TuxPanel LLJILJILJ;
    public C1389910mGz LLJILLL;
    public boolean LLJJ;
    public C0HQZ LLJJI;
    public TuxSheet LLJJIII;
    public C127K LLJJIJI;
    public C127K LLJJIJIIJIL;
    public C127K LLJJIJIL;

    public final StoryThoughtAvatarCreationVM WR() {
        return (StoryThoughtAvatarCreationVM) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C20748116Gx c20748116Gx = this.LLIZLLLIL;
        if (c20748116Gx != null) {
            c20748116Gx.LJ();
        }
        super.onDestroyView();
    }

    public final C1389910mGz UR() {
        int iLIZIZ;
        int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(getContext());
        if (C298600Bn8.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(WR().LLILZ.getBaseBackgroundViewMarginBottomDp()))) + iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
            if (iLIZIZ > iLIZIZ2) {
                iLIZIZ = iLIZIZ2;
            }
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        }
        C1389910mGz c1389910mGz = new C1389910mGz(this);
        c1389910mGz.LJIIJ(C298600Bn8.LIZ() ? getString(2131850180) : getString(2131850179));
        c1389910mGz.LIZ.LIZLLL = 3;
        c1389910mGz.LIZ.LJ = new AwS583S0100000_4(this, 131);
        c1389910mGz.LJ(Mp4ScreenVideoLoadTimeout.CONTROL);
        c1389910mGz.LIZIZ(iLIZIZ);
        c1389910mGz.LJI(R.style.z4);
        return c1389910mGz;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        WR().LLLZL = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        WR().LLLZL = false;
    }

    public final String SR(boolean z) {
        String string;
        String str;
        C20580115fz c20580115fz = this.LLJI;
        if (c20580115fz == null) {
            return null;
        }
        Editable editableS = C2204961BRm.s(c20580115fz.LLJJJIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8bI3XkjynXmSYc+Nz333g7LZNR6OMRMeyqPFtn0SbguNn/XMU2Ev9prP5Vw==", null));
        if (editableS != null) {
            string = editableS.toString();
        } else {
            string = null;
        }
        if (!z) {
            if (C123100dR.LIZ(string)) {
                return null;
            }
        } else if (!Intrinsics.LJFF(string, " ")) {
            return null;
        }
        C20580415g2 prompt = c20580115fz.LLJJJIL.getPrompt();
        if (prompt.LIZIZ != EnumC19387610t8.HOLIDAY || (str = prompt.LIZ) == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public final void ZR(String str) {
        Context context;
        String str2;
        C0P0T c0p0t;
        int i;
        C20580115fz c20580115fz = this.LLJI;
        if (c20580115fz == null || (context = getContext()) == null) {
            return;
        }
        StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVMWR = WR();
        if (storyThoughtAvatarCreationVMWR.GQ2()) {
            C20581815gG c20581815gG = C20581815gG.LIZ;
            C20583215gU c20583215gUAQ2 = storyThoughtAvatarCreationVMWR.AQ2();
            int iEQ2 = storyThoughtAvatarCreationVMWR.EQ2();
            c20581815gG.getClass();
            C0LAB c0labLIZ = C20581815gG.LIZ(c20583215gUAQ2);
            c0labLIZ.LIZ(iEQ2, "draft_item_status_final");
            C20684815ws.LJIILLIIL("click_thought_draft_back", c0labLIZ.LIZ);
        }
        StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVMWR2 = WR();
        String value = storyThoughtAvatarCreationVMWR2.LLLLL.getValue();
        if (value != null && value.length() != 0 && (storyThoughtAvatarCreationVMWR2.LLLILZ.getValue() == EnumC339980DUm.IN_PROGRESS || storyThoughtAvatarCreationVMWR2.LLLILZ.getValue() == EnumC339980DUm.FINISHED)) {
            C817600W5m value2 = storyThoughtAvatarCreationVMWR2.LLJIJIL.getValue();
            if (value2 != null) {
                str2 = value2.taskId;
            } else {
                str2 = null;
            }
            if (!Intrinsics.LJFF(str2, storyThoughtAvatarCreationVMWR2.LLLLL.getValue())) {
                C0P0T c0p0t2 = this.LLJIJIL;
                if (c0p0t2 == null) {
                    TuxIconView tuxIconView = c20580115fz.LLIZ;
                    if (Intrinsics.LJFF(WR().LLJZ.getValue(), Boolean.TRUE)) {
                        i = 2131830685;
                    } else {
                        i = 2131832437;
                    }
                    C0HWQ c0hwq = new C0HWQ(context);
                    c0hwq.LJIIL(Collections.singletonList(C1697810uHb.LJIIJJI(new C443090HZb(context.getString(i), new AwS180S1100000_31(this, str, 9), R.raw.icon_trash_bin, null, 0, null, 1, false, false, null, 952), new C443090HZb(context.getString(2131841695), new AwS556S0100000_12(this, 989), R.raw.icon_draft, null, 0, null, 0, false, false, null, 1016))));
                    c0hwq.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
                    c0hwq.LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(106));
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
                    c1391600mJi.LJIIIIZZ = iLIZIZ;
                    c1391600mJi.LIZIZ = tuxIconView;
                    c1391600mJi.LJIIL = false;
                    this.LLJIJIL = c0hwq.LIZIZ();
                } else if (c0p0t2.isShowing() && (c0p0t = this.LLJIJIL) != null) {
                    c0p0t.dismiss();
                }
                StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVMWR3 = WR();
                if (storyThoughtAvatarCreationVMWR3.GQ2()) {
                    C20581815gG c20581815gG2 = C20581815gG.LIZ;
                    C20583215gU c20583215gUAQ22 = storyThoughtAvatarCreationVMWR3.AQ2();
                    int iEQ22 = storyThoughtAvatarCreationVMWR3.EQ2();
                    c20581815gG2.getClass();
                    C0LAB c0labLIZ2 = C20581815gG.LIZ(c20583215gUAQ22);
                    c0labLIZ2.LIZ(iEQ22, "draft_item_status_final");
                    C20684815ws.LJIILLIIL("thought_draft_exit_popup", c0labLIZ2.LIZ);
                } else {
                    C20581815gG c20581815gG3 = C20581815gG.LIZ;
                    C20583215gU c20583215gUAQ23 = storyThoughtAvatarCreationVMWR3.AQ2();
                    boolean zGQ2 = storyThoughtAvatarCreationVMWR3.GQ2();
                    int iZQ2 = storyThoughtAvatarCreationVMWR3.zQ2();
                    c20581815gG3.getClass();
                    C0LAB c0labLIZ3 = C20581815gG.LIZ(c20583215gUAQ23);
                    c0labLIZ3.LIZ(zGQ2 ? 1 : 0, "is_draft");
                    c0labLIZ3.LIZ(iZQ2, "avatar_thought_creation_status");
                    c0labLIZ3.LJ("enter_from", c20583215gUAQ23.LJ);
                    c0labLIZ3.LJ("shoot_way", "story");
                    c0labLIZ3.LJ("options", "discard, save_draft");
                    C20684815ws.LJIILLIIL("show_exit_shoot_popup", c0labLIZ3.LIZ);
                }
                C0P0T c0p0t3 = this.LLJIJIL;
                if (c0p0t3 != null) {
                    c0p0t3.show();
                    return;
                }
                return;
            }
        }
        aS(str);
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void aS(String str) {
        int i;
        List list;
        String strLJJ;
        String str2;
        C20580115fz c20580115fz = this.LLJI;
        if (c20580115fz == null) {
            return;
        }
        int i2 = 1;
        if (c20580115fz.LLJJJIL.getPrompt().LIZIZ != EnumC19387610t8.HOLIDAY && c20580115fz.LLJJJIL.getPrompt().LIZIZ != EnumC19387610t8.DYNAMIC) {
            i = 0;
        } else {
            i = 1;
        }
        String str3 = c20580115fz.LLJJJIL.getPrompt().LIZ;
        StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVMWR = WR();
        storyThoughtAvatarCreationVMWR.getClass();
        C20581815gG c20581815gG = C20581815gG.LIZ;
        C20583215gU c20583215gUAQ2 = storyThoughtAvatarCreationVMWR.AQ2();
        int iZQ2 = storyThoughtAvatarCreationVMWR.zQ2();
        if (storyThoughtAvatarCreationVMWR.IQ2() == 0) {
            i2 = 0;
        }
        String strLJIJJLI = C1609930rzr.LJIJJLI(Integer.valueOf(storyThoughtAvatarCreationVMWR.IQ2()));
        String value = storyThoughtAvatarCreationVMWR.LLIZ.getValue();
        Pair pair = (Pair) storyThoughtAvatarCreationVMWR.LLJ.getValue();
        if (pair != null) {
            list = (List) pair.getSecond();
        } else {
            list = null;
        }
        String strLJJI = C1609930rzr.LJJI(value, list);
        BackgroundModel backgroundModel = (BackgroundModel) storyThoughtAvatarCreationVMWR.LLLLLLLLLL.getValue();
        String str4 = "";
        if (backgroundModel == null) {
            strLJJ = "";
        } else {
            strLJJ = C1609930rzr.LJJ(Integer.valueOf(backgroundModel.backgroundType));
        }
        BackgroundModel backgroundModel2 = (BackgroundModel) storyThoughtAvatarCreationVMWR.LLLLLLLLLL.getValue();
        if (backgroundModel2 != null && (str2 = backgroundModel2.backgroundGeckoId) != null) {
            str4 = str2;
        }
        c20581815gG.getClass();
        C0LAB c0labLIZ = C20581815gG.LIZ(c20583215gUAQ2);
        c0labLIZ.LIZ(iZQ2, "avatar_thought_creation_status");
        c0labLIZ.LJ("shoot_way", "story");
        c0labLIZ.LJ("exit_method", str);
        c0labLIZ.LJ("shoot_exit_duration", "-1");
        c0labLIZ.LIZ(0, "has_gif");
        c0labLIZ.LIZ(i2, "has_festivals_custom");
        if (strLJIJJLI != null) {
            c0labLIZ.LJ("holiday_type", strLJIJJLI);
        }
        c0labLIZ.LJ("thought_text_type", strLJJI);
        c0labLIZ.LJ("thought_background_type", strLJJ);
        c0labLIZ.LJ("thought_bg_gecko_id", str4);
        c0labLIZ.LIZ(i, "has_note_prompt");
        c0labLIZ.LJ("note_prompt_text", str3);
        C20684815ws.LJIILLIIL("shoot_exit", c0labLIZ.LIZ);
    }

    public final void cS(int i) {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(i);
        c1389890mGx.LJIIJJI();
    }

    public final void dS(EnumC20581215gA enumC20581215gA) {
        C127M accessory;
        C11GO c11go;
        C127M accessory2;
        C11GO c11go2;
        C11GO c11go3;
        boolean z;
        boolean z2;
        C127K c127k = this.LLJJIJI;
        C127M accessory3 = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof AnonymousClass1278) {
            c11go = (C11GO) accessory;
        } else {
            c11go = null;
        }
        boolean z3 = true;
        if (c11go != null) {
            if (enumC20581215gA == EnumC20581215gA.EVERYONE) {
                z2 = true;
            } else {
                z2 = false;
            }
            c11go.LJIILJJIL(z2);
        }
        C127K c127k2 = this.LLJJIJIIJIL;
        if (c127k2 != null) {
            accessory2 = c127k2.getAccessory();
        } else {
            accessory2 = null;
        }
        if ((accessory2 instanceof AnonymousClass1278) && (c11go3 = (C11GO) accessory2) != null) {
            if (enumC20581215gA == EnumC20581215gA.FRIENDS) {
                z = true;
            } else {
                z = false;
            }
            c11go3.LJIILJJIL(z);
        }
        C127K c127k3 = this.LLJJIJIL;
        if (c127k3 != null) {
            accessory3 = c127k3.getAccessory();
        }
        if ((accessory3 instanceof AnonymousClass1278) && (c11go2 = (C11GO) accessory3) != null) {
            if (enumC20581215gA != EnumC20581215gA.ONLY_YOU) {
                z3 = false;
            }
            c11go2.LJIILJJIL(z3);
        }
    }

    public static C0P0T VR(Context context, View view) {
        C450720Hlu c450720Hlu = new C450720Hlu(context);
        c450720Hlu.LLILLJJLI.LIZIZ = view;
        c450720Hlu.LJIIJ(2131850176);
        c450720Hlu.LLILLJJLI.LIZLLL = EnumC1235690iGF.START;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LJ = iLIZIZ;
        c1391600mJi.LJII = 1500L;
        return c450720Hlu.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String creationId;
        IUserService iUserService;
        User currentUser;
        int iLIZJ;
        C20580115fz c20580115fz;
        int i;
        int i2;
        String creationId2;
        String creationId3;
        Window window;
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onViewCreated(view, bundle);
        C11GZ.LIZ.getClass();
        C11GZ.LIZJ.clear();
        C23250099c.LIZLLL((InterfaceC497601wk) C11GZ.LIZIZ.getValue(), null, null, new C11GW(null), 3);
        C20748116Gx c20748116Gx = new C20748116Gx(this, 0);
        this.LLIZLLLIL = c20748116Gx;
        C19EG activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(getViewLifecycleOwner(), c20748116Gx);
        }
        C20580115fz c20580115fz2 = this.LLJI;
        String str = "";
        if (c20580115fz2 != null) {
            C19EG activity2 = getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                window.setNavigationBarColor(-16777216);
            }
            c20580115fz2.LLJJJIL.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(WR().LLILZ.getBubbleViewMaxWidthDp()))));
            c20580115fz2.LLJJJIL.setEnableDarkMode(false);
            c20580115fz2.LLJJJIL.setBubbleStyle(EnumC1257160ios.NORMAL);
            c20580115fz2.LLJJJIL.setMaxLength(60);
            C197039127h c197039127h = c20580115fz2.LLJJJJJIL;
            ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(WR().LLILZ.getBottomButtonHeightDp())));
                C786410Ut5.W5(c197039127h, layoutParams2);
                C197039127h c197039127h2 = c20580115fz2.LLJILLL;
                ViewGroup.LayoutParams layoutParams3 = c197039127h2.getLayoutParams();
                if (layoutParams3 != null) {
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(WR().LLILZ.getBottomButtonHeightDp())));
                    C786410Ut5.W5(c197039127h2, layoutParams4);
                    c20580115fz2.LLJJI.setShadowLayer(C418440Gaw.LIZIZ(Float.valueOf(1.0f)), C418440Gaw.LIZIZ(Float.valueOf(0.0f)), C418440Gaw.LIZIZ(Float.valueOf(1.0f)), 520093696);
                    FrameLayout frameLayout = c20580115fz2.LLJJIJIIJIL;
                    C19EG activity3 = getActivity();
                    if (activity3 != null) {
                        iLIZJ = C497820Jfg.LIZJ(activity3);
                    } else {
                        iLIZJ = 0;
                    }
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), iLIZJ, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                    FrameLayout frameLayout2 = c20580115fz2.LLJJIJIIJIL;
                    if (frameLayout2.isLaidOut() && !frameLayout2.isLayoutRequested()) {
                        C12BX c12bx = c20580115fz2.LLJJJ;
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams5.bottomMargin = WR().LLILZ.backgroundViewMarginBottom();
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12bx);
                        c12bx.setLayoutParams(layoutParams5);
                    } else {
                        frameLayout2.addOnLayoutChangeListener(new C16H9(this, c20580115fz2, 1));
                    }
                    c20580115fz2.LLJJJIL.LJIIJ();
                    C20584715gj c20584715gj = c20580115fz2.LLJJJIL;
                    String value = WR().LLIZ.getValue();
                    if (value != null && C123100dR.LIZ(value)) {
                        c20584715gj.setText(value);
                    }
                    HandlerHook.viewPost(c20584715gj, new ARunnableS113S0100000_13(c20584715gj, 277));
                    c20584715gj.addTextChangedListener(new C16HQ(this, 8));
                    C20580115fz c20580115fz3 = this.LLJI;
                    if (c20580115fz3 != null) {
                        C19EG activity4 = getActivity();
                        if (activity4 != null) {
                            C20097413kK.LIZJ(activity4.getWindow(), c20580115fz3.LLIZLLLIL, AFwS231S0000000_3.get$arr$(275), new AwS626S0100000_12(this, 33));
                        }
                        WR().LLJI.observe(getViewLifecycleOwner(), new AObserverS177S0200000_12(this, c20580115fz3, 44));
                    }
                    C20580115fz c20580115fz4 = this.LLJI;
                    if (c20580115fz4 != null) {
                        int iLIZIZ = (getResources().getDisplayMetrics().widthPixels - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160))) / 2;
                        C20632315oP c20632315oP = c20580115fz4.LLILZ;
                        c20632315oP.setPadding(iLIZIZ, c20632315oP.getPaddingTop(), iLIZIZ, c20632315oP.getPaddingBottom());
                        Context context = getContext();
                        if (context != null && C426750GoL.LIZLLL(context)) {
                            c20580115fz4.LLILZ.setLayoutDirection(1);
                        }
                        c20580115fz4.LLILZ.setAdapter(new C20580815g6(this));
                        c20580115fz4.LLILZ.setOffscreenPageLimit(2);
                        c20580115fz4.LLILZ.getChildAt(0).setOverScrollMode(2);
                        C0HQZ c0hqz = new C0HQZ();
                        ((ArrayList) c0hqz.LIZ).add(new C20584615gi(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))));
                        ((ArrayList) c0hqz.LIZ).add(new InterfaceC440740HQa() { // from class: X.0Gd1
                            @Override // X.InterfaceC440740HQa
                            public final void LIZ(View view2, float f) {
                                float f2;
                                float fAbs = Math.abs(f);
                                if (fAbs >= 1.0f) {
                                    f2 = 0.5f;
                                } else {
                                    f2 = 1.0f - (fAbs * 0.5f);
                                }
                                C786410Ut5.Ob(view2, f2);
                                C786410Ut5.pc(view2, f2);
                                C786410Ut5.T4(view2, 1.0f - (fAbs * 0.5f));
                                C786410Ut5.Jc(view2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-24)) * f);
                            }
                        });
                        this.LLJJI = c0hqz;
                        c20580115fz4.LLILZ.setPageTransformer(c0hqz);
                        new C20587115h7(c20580115fz4.LLILLL, c20580115fz4.LLILZ, new InterfaceC1173910geb() { // from class: X.15ga
                            @Override // X.InterfaceC1173910geb
                            public final void LIZ(C19U0 c19u0, int i3) {
                            }
                        }, 0).LIZ();
                        c20580115fz4.LLILZ.LIZIZ(new C16H0(this, 7));
                    }
                    c20580115fz2.LLILZLL.setOnTouchListener(new ATListenerS463S0100000_31(this, 7));
                    C786410Ut5.a9(c20580115fz2.LLIZ, new ACListenerS165S0100000_31(this, 241));
                    C786410Ut5.za(c20580115fz2.LLILZIL, new ACListenerS165S0100000_31(this, 243));
                    C786410Ut5.Q8(c20580115fz2.LLJJ, new ACListenerS165S0100000_31(this, 244));
                    c20580115fz2.LLJJJ.setOnFetchSwitchColorListener(new AwS610S0100000_31(this, 559));
                    C786410Ut5.U8(c20580115fz2.LLJJJJJIL, new ACListenerS116S0200000_12(this, c20580115fz2, 99));
                    C786410Ut5.U8(c20580115fz2.LLJILLL, new ACListenerS133S0200000_31(this, c20580115fz2, 46));
                    C786410Ut5.a9(c20580115fz2.LLJJIJI, new AbS334S0300000_31(this, c20584715gj, c20580115fz2, 0));
                    C786410Ut5.O7(c20580115fz2.LLJIJIL, new AbS710S0100000_31(this, 18));
                    C438620HHw c438620HHw = C438620HHw.LIZ;
                    EnumC438630HHx enumC438630HHx = EnumC438630HHx.SOCIAL_AVATAR_CREATE_ICON;
                    SmartImageView smartImageView = c20580115fz2.LLILLJJLI;
                    c438620HHw.getClass();
                    C438620HHw.LIZIZ(enumC438630HHx, smartImageView);
                    c20580115fz2.LLJJJIL.setOnExceedMaxLength(new AwS575S0100000_31(this, 1590));
                    if (C298600Bn8.LIZ()) {
                        C197039127h c197039127h3 = c20580115fz2.LLJILLL;
                        c197039127h3.setButtonStartIcon(Integer.valueOf(R.raw.icon_color_ame_effect));
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zj, c20580115fz2.LLJILLL.getContext());
                        if (numLIZJ != null) {
                            c197039127h3.setBackgroundTintList(ColorStateList.valueOf(numLIZJ.intValue()));
                        }
                    }
                    final C20580115fz c20580115fz5 = this.LLJI;
                    if (c20580115fz5 != null) {
                        if (C287180BNk.LIZ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "holiday_thoughts_quick_input_single_tap", true) == 1) {
                            C786410Ut5.Aa(c20580115fz5.LLJJJIL, new ACListenerS133S0200000_31(this, c20580115fz5, 48));
                        }
                        c20580115fz5.LLJJJIL.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.15X2
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                                String strSR;
                                if (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0 || this.LL.WR().LLLJL.getValue() == EnumC1405120mfW.DEFAULT || (strSR = this.LL.SR(false)) == null) {
                                    return false;
                                }
                                this.LL.WR().LLIZ.setValue(strSR);
                                C20580115fz c20580115fz6 = c20580115fz5;
                                HandlerHook.viewPost(c20580115fz6.LLJJJIL, new ARunnableS35S1100000_31(c20580115fz6, strSR, 12));
                                return true;
                            }
                        });
                        c20580115fz5.LLJJJIL.setEnterPressedListener(new AwS432S0200000_31(this, c20580115fz5, 130));
                    }
                    if (!WR().LLJJJJ && (c20580115fz = this.LLJI) != null) {
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("enter_method", WR().LLJJJ);
                        if (c20580115fz.LLJJJIL.getPrompt().LIZIZ != EnumC19387610t8.HOLIDAY && c20580115fz.LLJJJIL.getPrompt().LIZIZ != EnumC19387610t8.DYNAMIC) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        c0lab.LIZ(i, "has_note_prompt");
                        c0lab.LJ("note_prompt_text", c20580115fz.LLJJJIL.getPrompt().LIZ);
                        c0lab.LIZ(Intrinsics.LJFF(WR().LLJLILLLLZIIL, Boolean.TRUE) ? 1 : 0, "has_avatar_prompt");
                        if (WR().LLJJJJJIL != null) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        c0lab.LIZ(i2, "is_avatar_thought_try_it_out");
                        c0lab.LJ("story_archive_tab_name", WR().LLJJJIL);
                        if (WR().LLJJJJJIL != null) {
                            c0lab.LJ("try_it_out_position", WR().LLJJJJJIL);
                        }
                        if (C298260Bma.LIZ()) {
                            IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
                            if (iRecordMobService != null) {
                                CreativeInfo creativeInfo = WR().LLJJIJIIJIL;
                                if (creativeInfo == null || (creationId3 = creativeInfo.getCreationId()) == null) {
                                    creationId3 = "";
                                }
                                String str2 = WR().LLJJIJIL;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                iRecordMobService.LIZIZ(new C1449410nox(creationId3, "story", str2, null, null, null, null, null, 248), c0lab, null);
                            }
                        } else {
                            CreativeInfo creativeInfo2 = WR().LLJJIJIIJIL;
                            if (creativeInfo2 != null) {
                                creationId2 = creativeInfo2.getCreationId();
                            } else {
                                creationId2 = null;
                            }
                            c0lab.LJ("creation_id", creationId2);
                            c0lab.LJ("enter_from", WR().LLJJIJIL);
                            c0lab.LJ("shoot_way", "story");
                            C20684815ws.LJIILLIIL("shoot", c0lab.LIZ);
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        C20580115fz c20580115fz6 = this.LLJI;
        if (c20580115fz6 != null && (iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null)) != null && (currentUser = iUserService.getCurrentUser()) != null) {
            ((LiveData) WR().LLJJIJI.getValue()).observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(this, c20580115fz6, 52));
            C20584715gj c20584715gj2 = c20580115fz6.LLJJJIL;
            WR().LLJ.observe(getViewLifecycleOwner(), new AObserverS190S0200000_31(c20584715gj2, c20580115fz6, 2));
            WR().LLLLLLZZ.observe(getViewLifecycleOwner(), new AObserverS190S0200000_31(this, c20580115fz6, 3));
            WR().LLLLLLZ.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(c20580115fz6, 55));
            WR().LLLLLLLLLL.observe(getViewLifecycleOwner(), new AObserverS131S0300000_31(this, c20580115fz6, currentUser, 3));
            WR().LLJJIII.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(c20580115fz6, 56));
            WR().LLJLLL.observe(getViewLifecycleOwner(), new AObserverS190S0200000_31(this, c20580115fz6, 5));
            WR().LLILLL.observe(getViewLifecycleOwner(), new AObserverS208S0100000_4(this, 14));
            WR().LLLIZZ.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(c20580115fz6, 62));
            WR().LLLL.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(c20580115fz6, 60));
            WR().LLLJL.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(this, 61));
            WR().LLLLLLL.observe(getViewLifecycleOwner(), new AObserverS216S0100000_12(this, 120));
            WR().LLLILZ.observe(getViewLifecycleOwner(), new AObserverS190S0200000_31(this, c20580115fz6, 8));
            WR().LLLILZLLLI.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(this, 20));
            WR().LLL.observe(getViewLifecycleOwner(), new AObserverS190S0200000_31(this, c20580115fz6, 9));
            WR().LLLZ.observe(getViewLifecycleOwner(), new AObserverS177S0200000_12(this, c20580115fz6, 45));
            WR().LLLLLZIL.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 53));
            WR().LLLLZ.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 54));
            WR().LLLLZIL.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(this, 51));
            WR().LLLLZLLIL.observe(getViewLifecycleOwner(), new AObserverS177S0200000_12(this, c20580115fz6, 43));
            WR().LLLZI.observe(getViewLifecycleOwner(), new AObserverS231S0100000_29(c20580115fz6, 255));
            WR().LLLZIL.observe(getViewLifecycleOwner(), new AObserverS190S0200000_31(c20584715gj2, this, 1));
            WR().LLLFF.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(this, 53));
            if (!((Boolean) WR().LLJZ.getValue()).booleanValue()) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C751880TeU(this, c20580115fz6, null), 3);
            }
            WR().LLLIILIL.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(this, 63));
        }
        IRecordMobService iRecordMobService2 = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
        if (iRecordMobService2 != null) {
            CreativeInfo creativeInfo3 = WR().LLJJIJIIJIL;
            if (creativeInfo3 != null && (creationId = creativeInfo3.getCreationId()) != null) {
                str = creationId;
            }
            C1449420noy c1449420noy = new C1449420noy(str, "story");
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LJ("shoot_enter_method", WR().LLJJJ);
            c0lab2.LJ("shoot_enter_from", WR().LLJJIJIL);
            c0lab2.LIZ(1, "is_note");
            c0lab2.LJ("content_type", "text");
            c0lab2.LJ("content_source", "shoot_and_upload");
            c0lab2.LJ("story_archive_tab_name", WR().LLJJJIL);
            iRecordMobService2.LIZJ(c1449420noy, c0lab2);
        }
        C20580115fz c20580115fz7 = this.LLJI;
        if (C298620BnA.LIZ() && c20580115fz7 != null) {
            new StoryThoughtMentionManagerImpl(c20580115fz7.LLJJJIL, c20580115fz7.LLJJIII, c20580115fz7.LLJJJJ, null, WR(), 8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fe6, viewGroup, false);
        int i = R.id.bii;
        SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.bii, viewTd);
        if (smartImageView != null) {
            i = R.id.bks;
            C19U1 c19u1 = (C19U1) C1616006Uk.LIZ(R.id.bks, viewTd);
            if (c19u1 != null) {
                i = R.id.bl3;
                C20632315oP c20632315oP = (C20632315oP) C1616006Uk.LIZ(R.id.bl3, viewTd);
                if (c20632315oP != null) {
                    i = R.id.bo2;
                    C0FRP c0frp = (C0FRP) C1616006Uk.LIZ(R.id.bo2, viewTd);
                    if (c0frp != null) {
                        i = R.id.dmd;
                        LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.dmd, viewTd);
                        if (linearLayout != null) {
                            i = R.id.e1g;
                            TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.e1g, viewTd);
                            if (tuxIconView != null) {
                                i = R.id.evd;
                                FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.evd, viewTd);
                                if (frameLayout != null) {
                                    i = R.id.g5b;
                                    SmartImageView smartImageView2 = (SmartImageView) C1616006Uk.LIZ(R.id.g5b, viewTd);
                                    if (smartImageView2 != null) {
                                        i = R.id.g5p;
                                        TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.g5p, viewTd);
                                        if (tuxIconView2 != null) {
                                            i = R.id.g5q;
                                            FrameLayout frameLayout2 = (FrameLayout) C1616006Uk.LIZ(R.id.g5q, viewTd);
                                            if (frameLayout2 != null) {
                                                i = R.id.g6_;
                                                SmartImageView smartImageView3 = (SmartImageView) C1616006Uk.LIZ(R.id.g6_, viewTd);
                                                if (smartImageView3 != null) {
                                                    i = R.id.g7p;
                                                    TuxIconView tuxIconView3 = (TuxIconView) C1616006Uk.LIZ(R.id.g7p, viewTd);
                                                    if (tuxIconView3 != null) {
                                                        i = R.id.it3;
                                                        C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.it3, viewTd);
                                                        if (c197039127h != null) {
                                                            i = R.id.jcl;
                                                            SmartImageView smartImageView4 = (SmartImageView) C1616006Uk.LIZ(R.id.jcl, viewTd);
                                                            if (smartImageView4 != null) {
                                                                i = R.id.jjp;
                                                                TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.jjp, viewTd);
                                                                if (tuxTextView != null) {
                                                                    i = R.id.nb3;
                                                                    LinearLayout linearLayout2 = (LinearLayout) C1616006Uk.LIZ(R.id.nb3, viewTd);
                                                                    if (linearLayout2 != null) {
                                                                        i = R.id.o7h;
                                                                        if (C1616006Uk.LIZ(R.id.o7h, viewTd) != null) {
                                                                            i = R.id.ru8;
                                                                            TuxIconView tuxIconView4 = (TuxIconView) C1616006Uk.LIZ(R.id.ru8, viewTd);
                                                                            if (tuxIconView4 != null) {
                                                                                FrameLayout frameLayout3 = (FrameLayout) viewTd;
                                                                                i = R.id.u3e;
                                                                                ScrollView scrollView = (ScrollView) C1616006Uk.LIZ(R.id.u3e, viewTd);
                                                                                if (scrollView != null) {
                                                                                    i = R.id.w9l;
                                                                                    C12BX c12bx = (C12BX) C1616006Uk.LIZ(R.id.w9l, viewTd);
                                                                                    if (c12bx != null) {
                                                                                        i = R.id.w9m;
                                                                                        C20584715gj c20584715gj = (C20584715gj) C1616006Uk.LIZ(R.id.w9m, viewTd);
                                                                                        if (c20584715gj != null) {
                                                                                            i = R.id.w9p;
                                                                                            FrameLayout frameLayout4 = (FrameLayout) C1616006Uk.LIZ(R.id.w9p, viewTd);
                                                                                            if (frameLayout4 != null) {
                                                                                                i = R.id.ya8;
                                                                                                if (C1616006Uk.LIZ(R.id.ya8, viewTd) != null) {
                                                                                                    i = R.id.your_story_button;
                                                                                                    C197039127h c197039127h2 = (C197039127h) C1616006Uk.LIZ(R.id.your_story_button, viewTd);
                                                                                                    if (c197039127h2 != null) {
                                                                                                        this.LLJI = new C20580115fz(frameLayout3, smartImageView, c19u1, c20632315oP, c0frp, linearLayout, tuxIconView, frameLayout, smartImageView2, tuxIconView2, frameLayout2, smartImageView3, tuxIconView3, c197039127h, smartImageView4, tuxTextView, linearLayout2, tuxIconView4, frameLayout3, scrollView, c12bx, c20584715gj, frameLayout4, c197039127h2);
                                                                                                        C19GS c19gs = null;
                                                                                                        if (!(frameLayout3 instanceof View)) {
                                                                                                            frameLayout3 = null;
                                                                                                        }
                                                                                                        if (frameLayout3 != null) {
                                                                                                            try {
                                                                                                                ViewTreeLifecycleOwner.set(frameLayout3, getViewLifecycleOwner());
                                                                                                                ViewTreeViewModelStoreOwner.set(frameLayout3, this);
                                                                                                                frameLayout3.setTag(R.id.view_tree_saved_state_registry_owner, this);
                                                                                                                C19EG activity = getActivity();
                                                                                                                if (activity instanceof C19GS) {
                                                                                                                    c19gs = (C19GS) activity;
                                                                                                                }
                                                                                                                C1685300txQ.LIZ(c19gs);
                                                                                                            } catch (Throwable th) {
                                                                                                                TryCatchGuardChecker.doCheck(th);
                                                                                                                C189200o6.m2constructorimpl(new C098200Yq(th));
                                                                                                                return frameLayout3;
                                                                                                            }
                                                                                                        }
                                                                                                        C189200o6.m2constructorimpl(Unit.LIZ);
                                                                                                        return frameLayout3;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public final void bS(C127K c127k, int i, int i2, EnumC20581215gA enumC20581215gA, String str) {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOptionLIZ;
        boolean z;
        C11GO c11go;
        C11GO c11go2;
        C444910HcX c444910HcX = new C444910HcX(getString(i));
        c444910HcX.LIZ(101);
        c127k.setTitle(c444910HcX);
        if (i2 != 0) {
            c127k.setSubtitle(getString(i2));
        }
        c127k.LIZJ(EnumC1216650hlX.PADDING_28, EnumC1216650hlX.PADDING_16);
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(2, "visibility");
        Boolean boolValueOf = null;
        if (privacySettingsRestrictionItemLJIIIZ != null) {
            privacySettingsRestrictionOptionLIZ = C856230XiP.LIZ(privacySettingsRestrictionItemLJIIIZ, Integer.valueOf(enumC20581215gA.getValue()));
        } else {
            privacySettingsRestrictionOptionLIZ = null;
        }
        if (privacySettingsRestrictionOptionLIZ != null && privacySettingsRestrictionOptionLIZ.showType == 1) {
            z = true;
        } else {
            z = false;
        }
        c127k.setCellEnabled(true ^ z);
        C127M accessory = c127k.getAccessory();
        if ((accessory instanceof AnonymousClass1278) && (c11go2 = (C11GO) accessory) != null) {
            c11go2.LJIILL(new AwS92S1300000_31(str, c127k, enumC20581215gA, this, 0));
        }
        C127M accessory2 = c127k.getAccessory();
        if ((accessory2 instanceof AnonymousClass1278) && accessory2 != null) {
            accessory2.LJI(new AwS43S1400000_31(str, c127k, enumC20581215gA, this, privacySettingsRestrictionOptionLIZ, 0));
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("setting_value", String.valueOf(WR().LLJLLL.getValue().getValue()));
        c0lab.LJ("page_tag", "story_thought_quick_publish");
        c0lab.LJ("item_name", str);
        c0lab.LJFF("is_enabled", c127k.getCellEnabled());
        c0lab.LJ("item_type", "Radio");
        c0lab.LJ("option_value", String.valueOf(enumC20581215gA.getValue()));
        C127M accessory3 = c127k.getAccessory();
        if ((accessory3 instanceof AnonymousClass1278) && (c11go = (C11GO) accessory3) != null) {
            boolValueOf = Boolean.valueOf(c11go.LJIILIIL());
        }
        c0lab.LJ("is_checked", String.valueOf(boolValueOf));
        C20684815ws.LJIILLIIL("pns_tpsc_item_show", c0lab.LIZ);
    }
}
