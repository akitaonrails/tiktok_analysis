package kotlin.jvm.internal;

import X.C09AY;
import X.C1109770ez9;
import X.C1132380fZc;
import X.C1ATK;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C5182020e;
import X.C915980Zwa;
import X.C920960a4c;
import X.C924660aAa;
import X.C924810aAp;
import X.C940620aaK;
import X.C943870afZ;
import X.C944860ahA;
import X.C947590alZ;
import X.C949560aok;
import X.C954460awe;
import X.C955440ayE;
import X.C956080azG;
import X.C957750b1x;
import X.C961300b7g;
import X.C979770bbT;
import X.EnumC919170a1j;
import X.EnumC930180aJU;
import X.EnumC942260acy;
import X.EnumC947440alK;
import X.EnumC977660bY4;
import X.InterfaceC1631620sYq;
import X.InterfaceC946970akZ;
import X.InterfaceC964460bCm;
import X.InterfaceC975870bVB;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.SharedBackgroundEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.common.SwitchLayoutPanelController;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest.GuestBusinessUserManager;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.livesdk.livesetting.clientai.CohostNoticeStrategySettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class AwS131S1200000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS131S1200000_15 awS131S1200000_15) {
        ((MultiLiveSettingDialog) awS131S1200000_15.l1).rS(awS131S1200000_15.s0);
        Function0 function0 = (Function0) awS131S1200000_15.l2;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public static final Object invoke$1(AwS131S1200000_15 awS131S1200000_15) throws JSONException {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        CoHostFriendNoticeService coHostFriendNoticeService = (CoHostFriendNoticeService) awS131S1200000_15.l1;
        String str = awS131S1200000_15.s0;
        jSONObject.putOpt("is_notice_clicked", Integer.valueOf(coHostFriendNoticeService.LLJ));
        jSONObject.putOpt("is_invite_clicked", Integer.valueOf(coHostFriendNoticeService.LLJI));
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jSONObject.putOpt("trigger_by_client", Integer.valueOf(coHostFriendNoticeService.LLILLJJLI.contains(str) ? 1 : 0));
        } else {
            jSONObject.putOpt("trigger_by_client", 0);
        }
        ((InterfaceC964460bCm) ((CoHostFriendNoticeService) awS131S1200000_15.l1).LLILZ.getValue()).LIZJ(new C1ATK(((CoHostFriendNoticeService) awS131S1200000_15.l1).LL, new C1132380fZc(false, new JSONObject().putOpt("room_id", Long.valueOf(C500260Jjc.LJJLIIIJ((DataChannel) awS131S1200000_15.l2))).putOpt("type", "iteration").putOpt("notice_strategy_group", Integer.valueOf(CohostNoticeStrategySettings.INSTANCE.getGetStickValue())).putOpt("co_host_friend_notice_20s_result", jSONObject).putOpt("collect_time", "friend_notice_dismiss_20s")), ((CoHostFriendNoticeService) awS131S1200000_15.l1).LLIZ, null, 24));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS131S1200000_15 awS131S1200000_15) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        ISharedBgAbility iSharedBgAbilityLJJLIIIJ = ((SharedBackgroundEntity) awS131S1200000_15.l1).LJJLIIIJ();
        if (iSharedBgAbilityLJJLIIIJ != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbilityLJJLIIIJ.GL0()) != null) {
            multiGuestSharedBgAnchorViewModelGL0.zQ2(awS131S1200000_15.s0, "playbook_undo", new C5182020e((Function2) awS131S1200000_15.l2, (Function2<? super Boolean, ? super String, Unit>) 209), new C5182020e((Function2) awS131S1200000_15.l2, (Function2<? super Boolean, ? super String, Unit>) 210));
        } else {
            ((Function2) awS131S1200000_15.l2).invoke(Boolean.FALSE, "sharedBgAbility is null");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS131S1200000_15 awS131S1200000_15) {
        SharedBackgroundEntity sharedBackgroundEntity = (SharedBackgroundEntity) awS131S1200000_15.l1;
        DataChannel dataChannel = sharedBackgroundEntity.LLJ;
        if (dataChannel != null) {
            dataChannel.LC0(SwitchLayoutPanelController.ShowSwitchTipsDialogEvent.class, new C920960a4c(EnumC930180aJU.CHANGE_TO_GRID, new AwS131S1200000_15(sharedBackgroundEntity, (SharedBackgroundEntity) awS131S1200000_15.s0, (String) awS131S1200000_15.l2, (Function2<? super Boolean, ? super String, Unit>) 2)));
        } else {
            ((Function2) awS131S1200000_15.l2).invoke(Boolean.FALSE, "dataChannel is null");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS131S1200000_15 awS131S1200000_15) {
        if (((Lifecycle) awS131S1200000_15.l1).getCurrentState() == Lifecycle.State.RESUMED) {
            DataChannel dataChannel = ((GuestBusinessUserManager) awS131S1200000_15.l2).LLJ;
            int i = C924810aAp.LJ().LJJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(awS131S1200000_15.s0);
            sbLIZ.append("-GuestBusinessUserManager#logGuestConnStatus");
            C924660aAa.LJIIJ(i, dataChannel, "connection_start", null, C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS131S1200000_15 awS131S1200000_15) {
        C949560aok.LJIIJ((C1109770ez9) awS131S1200000_15.l1, (User) awS131S1200000_15.l2, awS131S1200000_15.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS131S1200000_15 awS131S1200000_15) {
        Map<String, C955440ayE> map = C956080azG.LIZ;
        C956080azG.LIZJ(awS131S1200000_15.s0, "", true);
        ((C944860ahA) awS131S1200000_15.l1).LL.l0((C943870afZ) awS131S1200000_15.l2, null, "from_cohost_icon", null);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS131S1200000_15 awS131S1200000_15) {
        Map<String, C955440ayE> map = C956080azG.LIZ;
        C956080azG.LIZJ(awS131S1200000_15.s0, "", true);
        ((C944860ahA) awS131S1200000_15.l1).LL.l0((C943870afZ) awS131S1200000_15.l2, null, "from_cohost_icon", null);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS131S1200000_15 awS131S1200000_15) {
        C961300b7g.LIZ.getClass();
        C961300b7g.LIZ("match_combined_inviter_dialog");
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF != null) {
            interfaceC975870bVBLJFF.LIZIZ(true);
        }
        LinkDialog linkDialog = new LinkDialog((MultiMatchAnchorWidget) awS131S1200000_15.l1);
        EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.TYPE_TWO_MATCH_INVITER;
        C979770bbT c979770bbT = new C979770bbT((MultiMatchAnchorWidget) awS131S1200000_15.l1, false, awS131S1200000_15.s0, (InterfaceC1631620sYq) awS131S1200000_15.l2);
        linkDialog.LLILZIL = enumC977660bY4;
        linkDialog.LLILZLL = c979770bbT;
        C957750b1x.LIZ(((MultiMatchAnchorWidget) awS131S1200000_15.l1).dataChannel, linkDialog, "TwoMatchInviteDialog");
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS131S1200000_15 awS131S1200000_15) {
        EnumC942260acy enumC942260acy;
        C947590alZ c947590alZLJIILLIIL;
        C940620aaK c940620aaK = (C940620aaK) awS131S1200000_15.l1;
        EnumC947440alK enumC947440alK = (EnumC947440alK) awS131S1200000_15.l2;
        InterfaceC946970akZ letsDanceService = c940620aaK.getLetsDanceService();
        if (letsDanceService != null && (c947590alZLJIILLIIL = letsDanceService.LJIILLIIL(awS131S1200000_15.s0)) != null) {
            enumC942260acy = c947590alZLJIILLIIL.LIZJ;
        } else {
            enumC942260acy = null;
        }
        c940620aaK.LJIIIZ(enumC947440alK, enumC942260acy);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS131S1200000_15(com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.SharedBackgroundEntity r3, com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.SharedBackgroundEntity r4, java.lang.String r5, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 2 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r3
            r1.l2 = r5
            r1.s0 = r4
            r0 = 0
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r1.l2 = r5
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS131S1200000_15.<init>(com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.SharedBackgroundEntity, java.lang.String, kotlin.jvm.functions.Function2, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1200000_15(C940620aaK c940620aaK, EnumC947440alK enumC947440alK, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c940620aaK;
        this.l2 = enumC947440alK;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1200000_15(C1109770ez9 c1109770ez9, User user, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1109770ez9;
        this.l2 = user;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1200000_15(Lifecycle lifecycle, GuestBusinessUserManager guestBusinessUserManager, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = lifecycle;
        this.l2 = guestBusinessUserManager;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS131S1200000_15(MultiLiveSettingDialog multiLiveSettingDialog, MultiLiveSettingDialog multiLiveSettingDialog2, String str, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l1 = multiLiveSettingDialog;
        this.s0 = multiLiveSettingDialog2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1200000_15(CoHostFriendNoticeService coHostFriendNoticeService, DataChannel dataChannel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = coHostFriendNoticeService;
        this.l2 = dataChannel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS131S1200000_15(MultiMatchAnchorWidget multiMatchAnchorWidget, MultiMatchAnchorWidget multiMatchAnchorWidget2, String str, InterfaceC1631620sYq<? super EnumC919170a1j, ? super List<C954460awe>, ? super List<C954460awe>, Unit> interfaceC1631620sYq) {
        super(0);
        this.$t = interfaceC1631620sYq;
        this.l1 = multiMatchAnchorWidget;
        this.s0 = multiMatchAnchorWidget2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1200000_15(String str, C944860ahA c944860ahA, C943870afZ c943870afZ, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c944860ahA;
        this.l2 = c943870afZ;
    }
}
