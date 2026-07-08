package kotlin.jvm.internal;

import X.C09AY;
import X.C2074808Aw;
import X.C920060a3A;
import X.C920070a3B;
import X.C920080a3C;
import X.C920160a3K;
import X.C920170a3L;
import X.C920960a4c;
import X.C954460awe;
import X.C955400ayA;
import X.C961300b7g;
import X.C977630bY1;
import X.C978090bYl;
import X.C978100bYm;
import X.C978150bYr;
import X.EnumC919170a1j;
import X.EnumC930180aJU;
import X.EnumC974980bTk;
import X.EnumC975850bV9;
import X.InterfaceC1631620sYq;
import X.InterfaceC920110a3F;
import X.InterfaceC953350aur;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.SharedBackgroundEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.common.SwitchLayoutPanelController;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.model.SharedEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS80S1300000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS80S1300000_15 awS80S1300000_15) {
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LL((Room) awS80S1300000_15.l1, awS80S1300000_15.s0, null, null, (RivalExtraInfo) awS80S1300000_15.l2, null, null, null, null, (Map) awS80S1300000_15.l3, false, 1516);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS80S1300000_15 awS80S1300000_15) {
        SharedBackgroundEntity sharedBackgroundEntity = (SharedBackgroundEntity) awS80S1300000_15.l1;
        DataChannel dataChannel = sharedBackgroundEntity.LLJ;
        if (dataChannel != null) {
            dataChannel.LC0(SwitchLayoutPanelController.ShowSwitchTipsDialogEvent.class, new C920960a4c(EnumC930180aJU.CHANGE_TO_GRID, new AwS80S1300000_15(sharedBackgroundEntity, (SharedEffect) awS80S1300000_15.l2, awS80S1300000_15.s0, (InterfaceC953350aur) awS80S1300000_15.l3, 2)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS80S1300000_15 awS80S1300000_15) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        ISharedBgAbility iSharedBgAbilityLJJLIIIJ = ((SharedBackgroundEntity) awS80S1300000_15.l1).LJJLIIIJ();
        if (iSharedBgAbilityLJJLIIIJ != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbilityLJJLIIIJ.GL0()) != null) {
            multiGuestSharedBgAnchorViewModelGL0.zQ2(((SharedEffect) awS80S1300000_15.l2).id, awS80S1300000_15.s0, new AwS559S0100000_15((InterfaceC953350aur) awS80S1300000_15.l3, 338), new AwS559S0100000_15((InterfaceC953350aur) awS80S1300000_15.l3, 339));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS80S1300000_15 awS80S1300000_15) {
        EnlargeScreenManageParams enlargeScreenManageParams = (EnlargeScreenManageParams) awS80S1300000_15.l1;
        enlargeScreenManageParams.scene = 8;
        ((C920170a3L) awS80S1300000_15.l2).LJIILJJIL(awS80S1300000_15.s0, enlargeScreenManageParams, (InterfaceC920110a3F) awS80S1300000_15.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS80S1300000_15 awS80S1300000_15) {
        EnlargeScreenManageParams enlargeScreenManageParams = (EnlargeScreenManageParams) awS80S1300000_15.l1;
        enlargeScreenManageParams.scene = 8;
        ((C920160a3K) awS80S1300000_15.l2).LJIILJJIL(awS80S1300000_15.s0, enlargeScreenManageParams, (InterfaceC920110a3F) awS80S1300000_15.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS80S1300000_15 awS80S1300000_15) {
        ((C920060a3A) awS80S1300000_15.l1).LJJIJ(awS80S1300000_15.s0, (EnlargeScreenManageParams) awS80S1300000_15.l2, (InterfaceC920110a3F) awS80S1300000_15.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS80S1300000_15 awS80S1300000_15) {
        ((C977630bY1) awS80S1300000_15.l1).LIZLLL(C2074808Aw.LIZIZ());
        ((C977630bY1) awS80S1300000_15.l1).LJIIIZ(new ArrayList(C2074808Aw.LIZLLL()), new ArrayList(C2074808Aw.LIZJ()));
        ((C977630bY1) awS80S1300000_15.l1).LJ(C2074808Aw.LIZ());
        MultiMatchAnchorWidget multiMatchAnchorWidget = (MultiMatchAnchorWidget) awS80S1300000_15.l2;
        C978090bYl c978090bYl = new C978090bYl(AFwS285S0000000_2.get$arr$(58));
        AFwS203S0000000_15 aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(380);
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS80S1300000_15.l3;
        C978100bYm c978100bYmLIZ = C978150bYr.LIZ(multiMatchAnchorWidget, c978090bYl, aFwS203S0000000_15, interfaceC1631620sYq, AFwS203S0000000_15.get$arr$(381), AFwS203S0000000_15.get$arr$(382), AFwS203S0000000_15.get$arr$(379), new AwS131S1200000_15((MultiMatchAnchorWidget) awS80S1300000_15.l2, (MultiMatchAnchorWidget) awS80S1300000_15.s0, (String) interfaceC1631620sYq, (InterfaceC1631620sYq<? super EnumC919170a1j, ? super List<C954460awe>, ? super List<C954460awe>, Unit>) 8), false, null, EnumC974980bTk.INVITE, EnumC975850bV9.INVITER_FROM_FRIEND_RANK, false, false, awS80S1300000_15.s0, 12288);
        C961300b7g c961300b7g = C961300b7g.LIZ;
        DataChannel dataChannel = ((MultiMatchAnchorWidget) awS80S1300000_15.l2).dataChannel;
        c961300b7g.getClass();
        C961300b7g.LJIIIZ(dataChannel, c978100bYmLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS80S1300000_15 awS80S1300000_15) {
        ((C920070a3B) awS80S1300000_15.l1).LJJIIJ(awS80S1300000_15.s0, (EnlargeScreenManageParams) awS80S1300000_15.l2, (InterfaceC920110a3F) awS80S1300000_15.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S1300000_15(Room room, RivalExtraInfo rivalExtraInfo, Map map, int i) {
        super(0);
        this.$t = i;
        this.l1 = room;
        this.s0 = "invite";
        this.l2 = rivalExtraInfo;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S1300000_15(C920060a3A c920060a3A, InterfaceC920110a3F interfaceC920110a3F, EnlargeScreenManageParams enlargeScreenManageParams, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c920060a3A;
        this.s0 = str;
        this.l2 = enlargeScreenManageParams;
        this.l3 = interfaceC920110a3F;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S1300000_15(InterfaceC920110a3F interfaceC920110a3F, C920070a3B c920070a3B, EnlargeScreenManageParams enlargeScreenManageParams, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c920070a3B;
        this.s0 = str;
        this.l2 = enlargeScreenManageParams;
        this.l3 = interfaceC920110a3F;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S1300000_15(C977630bY1 c977630bY1, MultiMatchAnchorWidget multiMatchAnchorWidget, AwS664S0100000_15 awS664S0100000_15, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c977630bY1;
        this.l2 = multiMatchAnchorWidget;
        this.l3 = awS664S0100000_15;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S1300000_15(SharedBackgroundEntity sharedBackgroundEntity, SharedEffect sharedEffect, String str, InterfaceC953350aur interfaceC953350aur, int i) {
        super(0);
        this.$t = i;
        this.l1 = sharedBackgroundEntity;
        this.l2 = sharedEffect;
        this.s0 = str;
        this.l3 = interfaceC953350aur;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S1300000_15(EnlargeScreenManageParams enlargeScreenManageParams, C920160a3K c920160a3K, String str, C920080a3C c920080a3C, int i) {
        super(0);
        this.$t = i;
        this.l1 = enlargeScreenManageParams;
        this.l2 = c920160a3K;
        this.s0 = str;
        this.l3 = c920080a3C;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S1300000_15(EnlargeScreenManageParams enlargeScreenManageParams, C920170a3L c920170a3L, String str, C920080a3C c920080a3C, int i) {
        super(0);
        this.$t = i;
        this.l1 = enlargeScreenManageParams;
        this.l2 = c920170a3L;
        this.s0 = str;
        this.l3 = c920080a3C;
    }
}
