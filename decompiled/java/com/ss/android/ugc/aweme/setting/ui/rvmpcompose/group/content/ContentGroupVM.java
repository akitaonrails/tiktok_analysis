package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content;

import X.C09R3;
import X.C13IQ;
import X.C13LE;
import X.C1555900qai;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2174491A8h;
import X.C2217401BqU;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.EnumC2174471A8f;
import X.InterfaceC0148002o;
import X.InterfaceC19211810Ea;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AccessibilitySettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ActivityCenterVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AdsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AudienceControlVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.BackgroundAudioVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.CommercialContentVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ContactsAndLocationVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ContentPreferenceVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.DisplayVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.FamilyPairingVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.FavoriteCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.JoinAmplifyVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LanguageVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LiveVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.MusicVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.NotificationVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.PlaybackVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ScreenTimeVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ShortcutManagerVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.SwitchInboxModeVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ContentGroupVM extends BaseGroupSettingsVM<EnumC2174471A8f, C1555900qai> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(ContentGroupVM.class, "accessibilitySettingsVM", "<v#0>", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(ContentGroupVM.class, "activityCenterVM", "<v#1>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU3 = new C2217401BqU(ContentGroupVM.class, "adsSettingsVM", "<v#2>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU4 = new C2217401BqU(ContentGroupVM.class, "audienceControlVM", "<v#3>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU5 = new C2217401BqU(ContentGroupVM.class, "backgroundAudioVM", "<v#4>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU6 = new C2217401BqU(ContentGroupVM.class, "commercialContentVM", "<v#5>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU7 = new C2217401BqU(ContentGroupVM.class, "contentPreferenceVM", "<v#6>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU8 = new C2217401BqU(ContentGroupVM.class, "displayVM", "<v#7>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU9 = new C2217401BqU(ContentGroupVM.class, "familyPairingVM", "<v#8>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU10 = new C2217401BqU(ContentGroupVM.class, "joinAmplifyVM", "<v#9>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU11 = new C2217401BqU(ContentGroupVM.class, "languageVM", "<v#10>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU12 = new C2217401BqU(ContentGroupVM.class, "liveSettingsVM", "<v#11>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU13 = new C2217401BqU(ContentGroupVM.class, "musicSettingsVM", "<v#12>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU14 = new C2217401BqU(ContentGroupVM.class, "notificationSettingsVM", "<v#13>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU15 = new C2217401BqU(ContentGroupVM.class, "playbackSettingsVM", "<v#14>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU16 = new C2217401BqU(ContentGroupVM.class, "screenTimeVM", "<v#15>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU17 = new C2217401BqU(ContentGroupVM.class, "shortcutVM", "<v#16>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU18 = new C2217401BqU(ContentGroupVM.class, "favoriteCellVM", "<v#17>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU19 = new C2217401BqU(ContentGroupVM.class, "switchInboxModeVM", "<v#18>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU20 = new C2217401BqU(ContentGroupVM.class, "contactsAndLocationVM", "<v#19>", 0);
        c09r3.getClass();
        LL = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2, c2217401BqU3, c2217401BqU4, c2217401BqU5, c2217401BqU6, c2217401BqU7, c2217401BqU8, c2217401BqU9, c2217401BqU10, c2217401BqU11, c2217401BqU12, c2217401BqU13, c2217401BqU14, c2217401BqU15, c2217401BqU16, c2217401BqU17, c2217401BqU18, c2217401BqU19, c2217401BqU20};
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1555900qai xQ2() {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.ContentGroupVM.xQ2():X.0qai");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return xQ2();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C2174491A8h.LIZIZ[event.ordinal()] == 1) {
            setState(new AwS612S0100000_33(this, 248));
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM
    public final BaseCellSettingsVM vQ2(Fragment fragment, InterfaceC19211810Ea interfaceC19211810Ea) {
        switch (C2174491A8h.LIZ[((EnumC2174471A8f) interfaceC19211810Ea).ordinal()]) {
            case 1:
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(AccessibilitySettingsVM.class);
                AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 583), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4127), AFwS279S0000000_33.get$arr$(423));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LL;
                return (BaseCellSettingsVM) assemVMLazy.getValue();
            case 2:
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ActivityCenterVM.class);
                AssemVMLazy assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), new C5182020e((C13IQ) c19719912DlLIZ2, 588), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4124), AFwS279S0000000_33.get$arr$(410));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LL;
                return (BaseCellSettingsVM) assemVMLazy2.getValue();
            case 3:
                C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(AdsVM.class);
                AssemVMLazy assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ3), new C5182020e((C13IQ) c19719912DlLIZ3, 578), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4128), AFwS279S0000000_33.get$arr$(413));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LL;
                return (BaseCellSettingsVM) assemVMLazy3.getValue();
            case 4:
                C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(AudienceControlVM.class);
                AssemVMLazy assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ4), new C5182020e((C13IQ) c19719912DlLIZ4, 575), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4122), AFwS279S0000000_33.get$arr$(409));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = LL;
                return (BaseCellSettingsVM) assemVMLazy4.getValue();
            case 5:
                C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(BackgroundAudioVM.class);
                AssemVMLazy assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ5), new C5182020e((C13IQ) c19719912DlLIZ5, 577), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4126), AFwS279S0000000_33.get$arr$(412));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr5 = LL;
                return (BaseCellSettingsVM) assemVMLazy5.getValue();
            case 6:
                C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(CommercialContentVM.class);
                AssemVMLazy assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ6), new C5182020e((C13IQ) c19719912DlLIZ6, 579), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4129), AFwS279S0000000_33.get$arr$(414));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr6 = LL;
                return (BaseCellSettingsVM) assemVMLazy6.getValue();
            case 7:
                C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(ContentPreferenceVM.class);
                AssemVMLazy assemVMLazy7 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ7), new C5182020e((C13IQ) c19719912DlLIZ7, 581), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4132), AFwS279S0000000_33.get$arr$(417));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr7 = LL;
                return (BaseCellSettingsVM) assemVMLazy7.getValue();
            case 8:
                C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(DisplayVM.class);
                AssemVMLazy assemVMLazy8 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ8), new C5182020e((C13IQ) c19719912DlLIZ8, 585), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4134), AFwS279S0000000_33.get$arr$(419));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr8 = LL;
                return (BaseCellSettingsVM) assemVMLazy8.getValue();
            case BdTuring.TYPE_ECAF /* 9 */:
                C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(FamilyPairingVM.class);
                AssemVMLazy assemVMLazy9 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ9), new C5182020e((C13IQ) c19719912DlLIZ9, 587), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4135), AFwS279S0000000_33.get$arr$(420));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr9 = LL;
                return (BaseCellSettingsVM) assemVMLazy9.getValue();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C19719912Dl c19719912DlLIZ10 = C13LE.LIZ(JoinAmplifyVM.class);
                AssemVMLazy assemVMLazy10 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ10), new C5182020e((C13IQ) c19719912DlLIZ10, 589), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4138), AFwS279S0000000_33.get$arr$(422));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr10 = LL;
                return (BaseCellSettingsVM) assemVMLazy10.getValue();
            case BdTuring.TYPE_EMAIL /* 11 */:
                AFwS190S0000000_4 aFwS190S0000000_4 = AFwS190S0000000_4.get$arr$(5421);
                C19719912Dl c19719912DlLIZ11 = C13LE.LIZ(LanguageVM.class);
                AssemVMLazy assemVMLazy11 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ11), new C5182020e((C13IQ) c19719912DlLIZ11, 592), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), aFwS190S0000000_4, AFwS266S0000000_25.get$arr$(551));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr11 = LL;
                return (BaseCellSettingsVM) assemVMLazy11.getValue();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                C19719912Dl c19719912DlLIZ12 = C13LE.LIZ(LiveVM.class);
                AssemVMLazy assemVMLazy12 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ12), new C5182020e((C13IQ) c19719912DlLIZ12, 573), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4121), AFwS279S0000000_33.get$arr$(407));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr12 = LL;
                return (BaseCellSettingsVM) assemVMLazy12.getValue();
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C19719912Dl c19719912DlLIZ13 = C13LE.LIZ(MusicVM.class);
                AssemVMLazy assemVMLazy13 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ13), new C5182020e((C13IQ) c19719912DlLIZ13, 576), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4125), AFwS279S0000000_33.get$arr$(411));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr13 = LL;
                return (BaseCellSettingsVM) assemVMLazy13.getValue();
            case 14:
                C19719912Dl c19719912DlLIZ14 = C13LE.LIZ(NotificationVM.class);
                AssemVMLazy assemVMLazy14 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ14), new C5182020e((C13IQ) c19719912DlLIZ14, 580), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4130), AFwS279S0000000_33.get$arr$(415));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr14 = LL;
                return (BaseCellSettingsVM) assemVMLazy14.getValue();
            case 15:
                C19719912Dl c19719912DlLIZ15 = C13LE.LIZ(PlaybackVM.class);
                AssemVMLazy assemVMLazy15 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ15), new C5182020e((C13IQ) c19719912DlLIZ15, 582), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4131), AFwS279S0000000_33.get$arr$(416));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr15 = LL;
                return (BaseCellSettingsVM) assemVMLazy15.getValue();
            case 16:
                C19719912Dl c19719912DlLIZ16 = C13LE.LIZ(ScreenTimeVM.class);
                AssemVMLazy assemVMLazy16 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ16), new C5182020e((C13IQ) c19719912DlLIZ16, 584), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4133), AFwS279S0000000_33.get$arr$(418));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr16 = LL;
                return (BaseCellSettingsVM) assemVMLazy16.getValue();
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                C19719912Dl c19719912DlLIZ17 = C13LE.LIZ(ShortcutManagerVM.class);
                AssemVMLazy assemVMLazy17 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ17), new C5182020e((C13IQ) c19719912DlLIZ17, 586), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4136), AFwS279S0000000_33.get$arr$(421));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr17 = LL;
                return (BaseCellSettingsVM) assemVMLazy17.getValue();
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                C19719912Dl c19719912DlLIZ18 = C13LE.LIZ(FavoriteCellVM.class);
                AssemVMLazy assemVMLazy18 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ18), new C5182020e((C13IQ) c19719912DlLIZ18, 590), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4137), AFwS274S0000000_30.get$arr$(332));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr18 = LL;
                return (BaseCellSettingsVM) assemVMLazy18.getValue();
            case 19:
                C19719912Dl c19719912DlLIZ19 = C13LE.LIZ(SwitchInboxModeVM.class);
                AssemVMLazy assemVMLazy19 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ19), new C5182020e((C13IQ) c19719912DlLIZ19, 591), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4120), AFwS279S0000000_33.get$arr$(424));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr19 = LL;
                return (BaseCellSettingsVM) assemVMLazy19.getValue();
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                C19719912Dl c19719912DlLIZ20 = C13LE.LIZ(ContactsAndLocationVM.class);
                AssemVMLazy assemVMLazy20 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ20), new C5182020e((C13IQ) c19719912DlLIZ20, 574), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4123), AFwS279S0000000_33.get$arr$(408));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr20 = LL;
                return (BaseCellSettingsVM) assemVMLazy20.getValue();
            case 21:
                return null;
            default:
                throw new C1954807lC();
        }
    }
}
