package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C01C5;
import X.C09AY;
import X.C0KX8;
import X.C0UFE;
import X.C0UFF;
import X.C1324720kZq;
import X.C1390410mHn;
import X.C1558520qew;
import X.C1578630rBN;
import X.C16F5;
import X.C19322110iZ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C724240Sb0;
import X.C748880TZe;
import X.C752980TgG;
import X.C752990TgH;
import X.C758220Toi;
import X.C766270U4b;
import X.C782920UnS;
import X.C783790Uor;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC743970TGh;
import X.InterfaceC1090170eTX;
import X.InterfaceC1565950qqv;
import X.InterfaceC752920TgA;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeContactSelectorSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeSettingFragment;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragment;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragmentV2;
import com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.verify.pin.PinVerifyViewAssem;
import com.ss.android.ugc.feed.platform.panel.pip.IPipAbility;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS130S0110000_12 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS130S0110000_12 awS130S0110000_12) {
        C758220Toi c758220Toi;
        ((LiveVisibleScopeSettingFragment) awS130S0110000_12.l0).OR(0, "click", awS130S0110000_12.z1);
        DataChannel dataChannel = ((LiveVisibleScopeSettingFragment) awS130S0110000_12.l0).LL;
        if (dataChannel != null) {
            C758220Toi c758220Toi2 = (C758220Toi) dataChannel.gg0(VisibleScopeSelectedChannel.class);
            if (c758220Toi2 != null) {
                c758220Toi = C758220Toi.LIZ(c758220Toi2, 0);
            } else {
                c758220Toi = new C758220Toi(0, (List) null, (List) null, (List) null, 30);
            }
            dataChannel.zW(VisibleScopeSelectedChannel.class, c758220Toi);
        }
        C766270U4b.LIZLLL(2131856081);
        LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = (LiveVisibleScopeSettingFragment) awS130S0110000_12.l0;
        if (liveVisibleScopeSettingFragment.LLILLL) {
            long j = liveVisibleScopeSettingFragment.LLJJI;
            if (j != 0) {
                C19322110iZ.LIZ(j);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS130S0110000_12 awS130S0110000_12) {
        C758220Toi c758220Toi;
        ((LiveVisibleScopeSettingFragment) awS130S0110000_12.l0).OR(1, "click", awS130S0110000_12.z1);
        DataChannel dataChannel = ((LiveVisibleScopeSettingFragment) awS130S0110000_12.l0).LL;
        if (dataChannel != null) {
            C758220Toi c758220Toi2 = (C758220Toi) dataChannel.gg0(VisibleScopeSelectedChannel.class);
            if (c758220Toi2 != null) {
                c758220Toi = C758220Toi.LIZ(c758220Toi2, 1);
            } else {
                c758220Toi = new C758220Toi(1, (List) null, (List) null, (List) null, 30);
            }
            dataChannel.zW(VisibleScopeSelectedChannel.class, c758220Toi);
        }
        C766270U4b.LIZLLL(2131856057);
        LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = (LiveVisibleScopeSettingFragment) awS130S0110000_12.l0;
        if (liveVisibleScopeSettingFragment.LLILLL) {
            long j = liveVisibleScopeSettingFragment.LLJJI;
            if (j != 0) {
                C19322110iZ.LIZ(j);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IPanelUIAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IPanelUIAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IPanelUIAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static final Object invoke$2(AwS130S0110000_12 awS130S0110000_12) {
        C758220Toi c758220Toi;
        ((LiveVisibleScopeSettingFragment) awS130S0110000_12.l0).OR(2, "click", awS130S0110000_12.z1);
        LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = (LiveVisibleScopeSettingFragment) awS130S0110000_12.l0;
        if (liveVisibleScopeSettingFragment.LLILLL) {
            long j = liveVisibleScopeSettingFragment.LLJJI;
            if (j != 0) {
                C19322110iZ.LIZ(j);
            }
        }
        DataChannel dataChannel = ((LiveVisibleScopeSettingFragment) awS130S0110000_12.l0).LL;
        if (dataChannel != null && (c758220Toi = (C758220Toi) dataChannel.gg0(VisibleScopeSelectedChannel.class)) != null) {
            DataChannel dataChannel2 = ((LiveVisibleScopeSettingFragment) awS130S0110000_12.l0).LL;
            if (dataChannel2 != null) {
                dataChannel2.zW(VisibleScopeSelectedChannel.class, C758220Toi.LIZ(c758220Toi, 2));
            }
            C766270U4b.LIZLLL(2131856058);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IPanelUIAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AwS130S0110000_12 awS130S0110000_12) {
        View view;
        C1390410mHn c1390410mHn;
        Fragment fragmentLJI = C724240Sb0.LJI((PinVerifyViewAssem) awS130S0110000_12.l0);
        if (fragmentLJI != null && (view = fragmentLJI.getView()) != null && (c1390410mHn = (C1390410mHn) view.findViewById(R.id.qiz)) != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 8);
        }
        if (awS130S0110000_12.z1 && ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJFF(EnumC743970TGh.FOUNDATION)) {
            ((PinVerifyViewAssem) awS130S0110000_12.l0).hp();
        } else {
            PinVerifyViewAssem pinVerifyViewAssem = (PinVerifyViewAssem) awS130S0110000_12.l0;
            Context context = pinVerifyViewAssem.LLIZLLLIL;
            if (context != null) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS81S0200000_12(pinVerifyViewAssem, context, 136));
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$25(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$26(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IPipAbility.class, null);
    }

    public static final Object invoke$27(AwS130S0110000_12 awS130S0110000_12) {
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        C0KX8 c0kx8;
        InterfaceC752920TgA interfaceC752920TgA;
        C752990TgH c752990TgH = ((C752980TgG) awS130S0110000_12.l0).LLILZIL;
        if (awS130S0110000_12.z1) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131852223));
        } else {
            DataChannel dataChannel = c752990TgH.LJIIIZ;
            if (dataChannel != null && (c0kx8 = (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class)) != null && c0kx8.LJ) {
                if (C500260Jjc.LJIIZILJ(c752990TgH.LJIIIZ)) {
                    C766270U4b.LIZLLL(2131844183);
                }
                if (C01C5.LIZ(c752990TgH.LJIIIZ)) {
                    C766270U4b.LIZLLL(2131844186);
                }
            } else {
                Function0<Unit> function0 = c752990TgH.LJIIJJI;
                if (function0 != null) {
                    function0.invoke();
                }
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
                    C0UFF c0uff = C0UFE.Companion;
                    int i = anchorLevelPermission.pin;
                    c0uff.getClass();
                    C0UFF.LIZ(i);
                }
            }
        }
        if (!awS130S0110000_12.z1 && (interfaceC752920TgA = ((C752980TgG) awS130S0110000_12.l0).LLILLL) != null) {
            interfaceC752920TgA.dismiss();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS130S0110000_12 awS130S0110000_12) {
        ((GameCastWidget) awS130S0110000_12.l0).y1(awS130S0110000_12.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS130S0110000_12 awS130S0110000_12) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C782920UnS c782920UnS = (C782920UnS) awS130S0110000_12.l0;
        boolean z = awS130S0110000_12.z1;
        if (!c782920UnS.mViewDestroyed && c782920UnS.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            if (c782920UnS.LLJJIJI == null) {
                c782920UnS.LLJJIJI = new C783790Uor(c782920UnS.requireSceneContext());
            }
            C783790Uor c783790Uor = c782920UnS.LLJJIJI;
            if (c783790Uor != null) {
                if (z) {
                    TuxTextView tuxTextView = c783790Uor.LL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(2131856812);
                    }
                } else {
                    TuxTextView tuxTextView2 = c783790Uor.LL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(2131855724);
                    }
                }
                c783790Uor.setClickListener(new ACListenerS147S0100000_12(c782920UnS, 404));
                View view = c782920UnS.mView;
                if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null && viewGroup2.indexOfChild(c783790Uor) != -1) {
                    c783790Uor.bringToFront();
                } else {
                    View view2 = c782920UnS.mView;
                    if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                        viewGroup.addView(c783790Uor);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS130S0110000_12 awS130S0110000_12) {
        FragmentManager fragmentManager;
        Long lValueOf;
        DataChannel dataChannel = ((LiveVisibleScopeSettingFragment) awS130S0110000_12.l0).LL;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = (LiveVisibleScopeSettingFragment) awS130S0110000_12.l0;
            boolean z = awS130S0110000_12.z1;
            String str = LiveVisibleScopeContactSelectorSheet._pnsPageId;
            if (liveVisibleScopeSettingFragment.LLILLL) {
                lValueOf = Long.valueOf(liveVisibleScopeSettingFragment.LLJJI);
            } else {
                lValueOf = null;
            }
            AwS130S0110000_12 awS130S0110000_122 = new AwS130S0110000_12(liveVisibleScopeSettingFragment, z, 5);
            LiveVisibleScopeContactSelectorSheet liveVisibleScopeContactSelectorSheet = new LiveVisibleScopeContactSelectorSheet();
            liveVisibleScopeContactSelectorSheet.LLJLLL = dataChannel;
            liveVisibleScopeContactSelectorSheet.LLJZ = lValueOf;
            liveVisibleScopeContactSelectorSheet.LLJZIJLIL = awS130S0110000_122;
            C19322110iZ.LJFF(fragmentManager, liveVisibleScopeContactSelectorSheet, "live_visible_scope_contact_selector_sheet", new InterfaceC1090170eTX() { // from class: X.0Tol
                @Override // X.InterfaceC1090170eTX
                public final void LIZ(long j) {
                }
            }, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS130S0110000_12 awS130S0110000_12) {
        LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = (LiveVisibleScopeSettingFragment) awS130S0110000_12.l0;
        if (!liveVisibleScopeSettingFragment.LLILLL) {
            liveVisibleScopeSettingFragment.OR(2, "click", awS130S0110000_12.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS130S0110000_12 awS130S0110000_12) {
        LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = (LiveVisibleScopeSettingFragment) awS130S0110000_12.l0;
        if (!liveVisibleScopeSettingFragment.LLILLL) {
            liveVisibleScopeSettingFragment.OR(2, "click", awS130S0110000_12.z1);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1) {
            C1324720kZq c1324720kZq = ((GameCastWiredFragmentV2) awS130S0110000_12.l0).LLILZLL;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 0);
            }
            View view = ((GameCastWiredFragmentV2) awS130S0110000_12.l0).LLIZLLLIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            C16F5 c16f5 = ((GameCastWiredFragmentV2) awS130S0110000_12.l0).LLJ;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 0);
            }
            C16F5 c16f52 = ((GameCastWiredFragmentV2) awS130S0110000_12.l0).LLJI;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 0);
            }
        } else {
            C1324720kZq c1324720kZq2 = ((GameCastWiredFragmentV2) awS130S0110000_12.l0).LLILZLL;
            if (c1324720kZq2 != null) {
                C786410Ut5.LLJJIII(c1324720kZq2, 8);
            }
            View view2 = ((GameCastWiredFragmentV2) awS130S0110000_12.l0).LLIZLLLIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(4, view2);
            }
            C16F5 c16f53 = ((GameCastWiredFragmentV2) awS130S0110000_12.l0).LLJ;
            if (c16f53 != null) {
                C786410Ut5.LLJJJJ(c16f53, 4);
            }
            C16F5 c16f54 = ((GameCastWiredFragmentV2) awS130S0110000_12.l0).LLJI;
            if (c16f54 != null) {
                C786410Ut5.LLJJJJ(c16f54, 4);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1) {
            C1324720kZq c1324720kZq = ((GameCastWiredFragment) awS130S0110000_12.l0).LLILZLL;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 0);
            }
            View view = ((GameCastWiredFragment) awS130S0110000_12.l0).LLIZLLLIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            C16F5 c16f5 = ((GameCastWiredFragment) awS130S0110000_12.l0).LLJ;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 0);
            }
            C16F5 c16f52 = ((GameCastWiredFragment) awS130S0110000_12.l0).LLJI;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 0);
            }
        } else {
            C1324720kZq c1324720kZq2 = ((GameCastWiredFragment) awS130S0110000_12.l0).LLILZLL;
            if (c1324720kZq2 != null) {
                C786410Ut5.LLJJIII(c1324720kZq2, 8);
            }
            View view2 = ((GameCastWiredFragment) awS130S0110000_12.l0).LLIZLLLIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(4, view2);
            }
            C16F5 c16f53 = ((GameCastWiredFragment) awS130S0110000_12.l0).LLJ;
            if (c16f53 != null) {
                C786410Ut5.LLJJJJ(c16f53, 4);
            }
            C16F5 c16f54 = ((GameCastWiredFragment) awS130S0110000_12.l0).LLJI;
            if (c16f54 != null) {
                C786410Ut5.LLJJJJ(c16f54, 4);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS130S0110000_12 awS130S0110000_12) {
        if (awS130S0110000_12.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS130S0110000_12.l0)), IFeedPanelPlatformAbility.class, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0110000_12(C752980TgG c752980TgG, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c752980TgG;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0110000_12(C782920UnS c782920UnS, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c782920UnS;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0110000_12(LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveVisibleScopeSettingFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0110000_12(GameCastWidget gameCastWidget, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = gameCastWidget;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0110000_12(PinVerifyViewAssem pinVerifyViewAssem, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = pinVerifyViewAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0110000_12(boolean z, InterfaceC1565950qqv interfaceC1565950qqv, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = interfaceC1565950qqv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0110000_12(boolean z, GameCastWiredFragment gameCastWiredFragment, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = gameCastWiredFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0110000_12(boolean z, GameCastWiredFragmentV2 gameCastWiredFragmentV2, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = gameCastWiredFragmentV2;
    }
}
