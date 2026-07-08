package kotlin.jvm.internal;

import X.C09AY;
import X.C0UTJ;
import X.C1161920gLG;
import X.C410901il;
import X.C766270U4b;
import X.C915980Zwa;
import X.C918350a0P;
import X.C918610a0p;
import X.C918650a0t;
import X.C919310a1x;
import X.C927260aEm;
import X.C946500ajo;
import X.C954460awe;
import X.C961300b7g;
import X.C962520b9e;
import X.C969790bLN;
import X.C974060bSG;
import X.C974990bTl;
import X.C976780bWe;
import X.C978360bZC;
import X.C979030baH;
import X.C979690bbL;
import X.EnumC20429414wm;
import X.EnumC918770a15;
import X.EnumC918840a1C;
import X.EnumC919170a1j;
import X.InterfaceC937900aVw;
import X.InterfaceC954180awC;
import X.InterfaceC954900axM;
import X.InterfaceC954910axN;
import X.InterfaceC975870bVB;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.TopLiveSkylightTransYChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizeAudienceCohost;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizeLayoutManagerStreamPlayer;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes16.dex */
public class AwS112S0400000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS112S0400000_15 awS112S0400000_15, Object obj) {
        List<Playbook> list = ((MultiMatchPrepareResponse) obj).matchPlaybooks;
        if (list.isEmpty()) {
            C766270U4b.LJIIJJI("No playbooks available");
            ((Function0) awS112S0400000_15.l0).invoke();
        } else {
            ((C979030baH) awS112S0400000_15.l1).LIZJ = list;
            InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
            if (interfaceC975870bVBLJFF != null) {
                interfaceC975870bVBLJFF.LJIIIIZZ(list);
            }
            ((C410901il) awS112S0400000_15.l2).remove(((C979030baH) awS112S0400000_15.l1).LIZIZ);
            ((C979030baH) awS112S0400000_15.l1).LIZIZ((C410901il) awS112S0400000_15.l2);
            ((Function0) awS112S0400000_15.l3).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS112S0400000_15 awS112S0400000_15, Object obj) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        float fFloatValue;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL3;
        Pair<Integer, Integer> pair = (Pair) obj;
        if (LinkmicRtcRatioOptimizeLayoutManagerStreamPlayer.isEnable() && ((MultiHostCrossAdapterImpl) awS112S0400000_15.l0).LLL == null) {
            C946500ajo c946500ajo = new C946500ajo((LifecycleOwner) awS112S0400000_15.l1, null, ((MultiHostCrossAdapterImpl) awS112S0400000_15.l0).LLJILJIL, null);
            InterfaceC954900axM interfaceC954900axM = ((MultiHostCrossAdapterImpl) awS112S0400000_15.l0).LLILLL;
            if (interfaceC954900axM != null && (interfaceC937900aVwLLIIJLIL3 = interfaceC954900axM.LLIIJLIL()) != null) {
                MultiHostCrossAdapterImpl multiHostCrossAdapterImpl = (MultiHostCrossAdapterImpl) awS112S0400000_15.l0;
                interfaceC937900aVwLLIIJLIL3.LLILZIL(c946500ajo, null);
                multiHostCrossAdapterImpl.LLL = c946500ajo;
            }
        }
        if (LinkmicRtcRatioOptimizeAudienceCohost.isEnable()) {
            InterfaceC954900axM interfaceC954900axM2 = ((MultiHostCrossAdapterImpl) awS112S0400000_15.l0).LLILLL;
            if (interfaceC954900axM2 != null && (interfaceC937900aVwLLIIJLIL2 = interfaceC954900axM2.LLIIJLIL()) != null) {
                interfaceC937900aVwLLIIJLIL2.LLILZLL(pair);
            }
        } else {
            InterfaceC954900axM interfaceC954900axM3 = ((MultiHostCrossAdapterImpl) awS112S0400000_15.l0).LLILLL;
            if (interfaceC954900axM3 != null && (interfaceC937900aVwLLIIJLIL = interfaceC954900axM3.LLIIJLIL()) != null) {
                ViewGroup viewGroup = (ViewGroup) awS112S0400000_15.l2;
                FrameLayout frameLayout = (FrameLayout) awS112S0400000_15.l3;
                Float f = (Float) DataChannelGlobal.LLILZ.gg0(TopLiveSkylightTransYChannel.class);
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                interfaceC937900aVwLLIIJLIL.LJJJJLI(viewGroup, frameLayout, pair, "multi_cohost_cross_video_size_change", null, fFloatValue);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS112S0400000_15 awS112S0400000_15, Object obj) {
        C974990bTl c974990bTl = (C974990bTl) awS112S0400000_15.l1;
        C974990bTl.LJIILIIL((C974060bSG) awS112S0400000_15.l2, c974990bTl, (EnumC919170a1j) awS112S0400000_15.l0, null, (List) awS112S0400000_15.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS112S0400000_15 awS112S0400000_15, Object obj) {
        String targetFilePath;
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "show quick apply dialog, download image success");
        LiveEffect liveEffect = (LiveEffect) awS112S0400000_15.l0;
        if (downloadInfo != null) {
            targetFilePath = downloadInfo.getTargetFilePath();
        } else {
            targetFilePath = null;
        }
        liveEffect.LJJJJL(targetFilePath);
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).removeSoloBgEffect((DataChannel) awS112S0400000_15.l1);
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) awS112S0400000_15.l2;
        multiGuestSharedBgAnchorViewModel.DQ2((LiveEffect) awS112S0400000_15.l0, new AwS259S0300000_15(multiGuestSharedBgAnchorViewModel, (Context) awS112S0400000_15.l3, (DataChannel) awS112S0400000_15.l1, 32), new AwS259S0300000_15((MultiGuestSharedBgAnchorViewModel) awS112S0400000_15.l2, (Context) awS112S0400000_15.l3, (DataChannel) awS112S0400000_15.l1, 33), false);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS112S0400000_15 awS112S0400000_15, Object obj) {
        C969790bLN c969790bLN = (C969790bLN) awS112S0400000_15.l0;
        C0UTJ c0utj = (C0UTJ) awS112S0400000_15.l1;
        DataChannel dataChannel = (DataChannel) awS112S0400000_15.l2;
        Playbook playbook = (Playbook) awS112S0400000_15.l3;
        c969790bLN.getClass();
        C979690bbL c979690bbL = null;
        c0utj.LJIL(EnumC20429414wm.DETAIL, "playbook_guide_capsule", null);
        C961300b7g.LIZ.getClass();
        if (!C961300b7g.LJII("match_management_panel_dialog")) {
            AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(725);
            if (dataChannel != null) {
                c979690bbL = (C979690bbL) dataChannel.gg0(C962520b9e.class);
            }
            AFwS203S0000000_15 aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(308);
            C976780bWe c976780bWe = new C976780bWe();
            c976780bWe.LIZIZ = aFwS229S0000000_2;
            c976780bWe.LIZJ = c979690bbL;
            c976780bWe.LIZLLL = aFwS203S0000000_15;
            c976780bWe.LJ = false;
            c976780bWe.LJFF = "playbook_guide_capsule";
            C961300b7g.LJIIL(dataChannel, c976780bWe);
        }
        C978360bZC.LJIILIIL(dataChannel, "view_more_playbook", playbook, false, null, 0, 0L, 112);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS112S0400000_15 awS112S0400000_15, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((Fragment) awS112S0400000_15.l0, new AwS594S0100000_15((DataChannel) awS112S0400000_15.l1, 972));
        assembler.RQ2((Fragment) awS112S0400000_15.l0, new AwS381S0200000_15((C927260aEm) awS112S0400000_15.l2, (ViewGroup) awS112S0400000_15.l3, 142));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS112S0400000_15 awS112S0400000_15, Object obj) {
        C918610a0p c918610a0p = (C918610a0p) obj;
        C918650a0t c918650a0t = (C918650a0t) awS112S0400000_15.l0;
        Function1 function1 = (Function1) awS112S0400000_15.l1;
        long id = ((LinkPlayerInfo) awS112S0400000_15.l2).mUser.getId();
        c918650a0t.getClass();
        if (c918610a0p.LIZ == EnumC918840a1C.FAILED) {
            if (c918610a0p.LIZIZ == EnumC918770a15.FREQ_LIMITED) {
                C766270U4b.LIZLLL(2131842761);
                function1.invoke(Long.valueOf(id));
            }
            if (c918610a0p.LIZIZ == EnumC918770a15.COHOST_INTERCEPTED) {
                function1.invoke(Long.valueOf(id));
            }
        }
        Function1<C918610a0p, Unit> function12 = ((C918350a0P) awS112S0400000_15.l3).LIZJ.LIZIZ;
        if (function12 != null) {
            function12.invoke(c918610a0p);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS112S0400000_15 awS112S0400000_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJFF((InterfaceC954180awC) awS112S0400000_15.l0);
        interfaceC954910axN.LJIILIIL(Integer.valueOf(((List) awS112S0400000_15.l1).size()), "applicants.size");
        interfaceC954910axN.LJIILIIL(Integer.valueOf(((List) awS112S0400000_15.l2).size()), "invitees.size");
        interfaceC954910axN.LJIILIIL(Integer.valueOf(((List) awS112S0400000_15.l3).size()), "willJoinGroupUsers.size");
        interfaceC954910axN.LJIILL((InterfaceC954180awC) awS112S0400000_15.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS112S0400000_15 awS112S0400000_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJFF((InterfaceC954180awC) awS112S0400000_15.l0);
        interfaceC954910axN.LJIILIIL(Integer.valueOf(((List) awS112S0400000_15.l1).size()), "applicants.size");
        interfaceC954910axN.LJIILIIL(Integer.valueOf(((List) awS112S0400000_15.l2).size()), "invitees.size");
        interfaceC954910axN.LJIILIIL(Integer.valueOf(((List) awS112S0400000_15.l3).size()), "willJoinGroupUsers.size");
        interfaceC954910axN.LJIILL((InterfaceC954180awC) awS112S0400000_15.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS112S0400000_15(C918650a0t c918650a0t, C918650a0t c918650a0t2, Function1<? super Long, Unit> function1, LinkPlayerInfo linkPlayerInfo, C918350a0P c918350a0P) {
        super(1);
        this.$t = c918350a0P;
        this.l0 = c918650a0t;
        this.l1 = c918650a0t2;
        this.l2 = function1;
        this.l3 = linkPlayerInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS112S0400000_15(EnumC919170a1j enumC919170a1j, EnumC919170a1j enumC919170a1j2, C974990bTl c974990bTl, C974060bSG c974060bSG, List<C954460awe> list) {
        super(1);
        this.$t = list;
        this.l0 = enumC919170a1j;
        this.l1 = enumC919170a1j2;
        this.l2 = c974990bTl;
        this.l3 = c974060bSG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS112S0400000_15(InterfaceC954180awC interfaceC954180awC, InterfaceC954180awC interfaceC954180awC2, List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3) {
        super(1);
        this.$t = list3;
        this.l0 = interfaceC954180awC;
        this.l1 = interfaceC954180awC2;
        this.l2 = list;
        this.l3 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0400000_15(C969790bLN c969790bLN, C0UTJ c0utj, DataChannel dataChannel, Playbook playbook, int i) {
        super(1);
        this.$t = i;
        this.l0 = c969790bLN;
        this.l1 = c0utj;
        this.l2 = dataChannel;
        this.l3 = playbook;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0400000_15(Fragment fragment, DataChannel dataChannel, C927260aEm c927260aEm, ViewGroup viewGroup, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = dataChannel;
        this.l2 = c927260aEm;
        this.l3 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0400000_15(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, LifecycleOwner lifecycleOwner, ViewGroup viewGroup, FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiHostCrossAdapterImpl;
        this.l1 = lifecycleOwner;
        this.l2 = viewGroup;
        this.l3 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0400000_15(LiveEffect liveEffect, DataChannel dataChannel, MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveEffect;
        this.l1 = dataChannel;
        this.l2 = multiGuestSharedBgAnchorViewModel;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0400000_15(AFwS203S0000000_15 aFwS203S0000000_15, C979030baH c979030baH, C410901il c410901il, AwS559S0100000_15 awS559S0100000_15, int i) {
        super(1);
        this.$t = i;
        this.l0 = aFwS203S0000000_15;
        this.l1 = c979030baH;
        this.l2 = c410901il;
        this.l3 = awS559S0100000_15;
    }
}
