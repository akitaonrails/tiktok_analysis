package kotlin.jvm.internal;

import X.C09AY;
import X.C0H79;
import X.C500260Jjc;
import X.C916180Zwu;
import X.C916240Zx0;
import X.C916490ZxP;
import X.C940470aa5;
import X.C940770aaZ;
import X.C942610adX;
import X.C948100amO;
import X.C948360amo;
import X.C959660b52;
import X.EnumC930180aJU;
import X.InterfaceC937820aVo;
import X.InterfaceC937840aVq;
import X.InterfaceC940230aZh;
import X.InterfaceC940380aZw;
import android.graphics.Rect;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS139S0201000_15 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS139S0201000_15 awS139S0201000_15) {
        int i;
        int iIntValue;
        String str;
        String str2;
        Integer num;
        C942610adX c942610adX = (C942610adX) awS139S0201000_15.l0;
        C948360amo c948360amo = ((LayoutMarketFragment) awS139S0201000_15.l1).LLJZIJLIL;
        if (c948360amo != null) {
            int i2 = awS139S0201000_15.i2;
            i = c948360amo.LLILZLL;
            if (c948360amo.LLIZ == -1) {
                c948360amo.LLLJ(i2);
                c948360amo.LLIZ = i2;
                c948360amo.notifyItemChanged(i);
                c948360amo.notifyItemChanged(i2);
            }
        } else {
            i = 0;
        }
        c942610adX.LIZ = i;
        if (C500260Jjc.LJJIL() && LinkMicMgPreviewLivePageSetting.INSTANCE.enable()) {
            C942610adX c942610adX2 = (C942610adX) awS139S0201000_15.l0;
            C948100amO c948100amOLIZ = C0H79.LIZ();
            if (c948100amOLIZ != null && (num = c948100amOLIZ.LIZIZ) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            c942610adX2.LIZIZ = iIntValue;
            C942610adX c942610adX3 = (C942610adX) awS139S0201000_15.l0;
            C948100amO c948100amOLIZ2 = C0H79.LIZ();
            String str3 = "";
            if (c948100amOLIZ2 == null || (str = c948100amOLIZ2.LIZLLL) == null) {
                str = "";
            }
            c942610adX3.LIZJ = str;
            C942610adX c942610adX4 = (C942610adX) awS139S0201000_15.l0;
            C948100amO c948100amOLIZ3 = C0H79.LIZ();
            if (c948100amOLIZ3 != null && (str2 = c948100amOLIZ3.LJ) != null) {
                str3 = str2;
            }
            c942610adX4.LIZLLL = str3;
        } else {
            ((C942610adX) awS139S0201000_15.l0).LIZIZ = C940770aaZ.LIZ().getDataSource().getPanelLayoutType();
            ((C942610adX) awS139S0201000_15.l0).LIZJ = C940770aaZ.LIZ().getDataSource().LJIL();
            ((C942610adX) awS139S0201000_15.l0).LIZLLL = C940770aaZ.LIZ().getDataSource().LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS139S0201000_15 awS139S0201000_15) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke2;
        Function0<MultiLiveAnchorPanelSettings> function0 = ((LayoutSettingContract) awS139S0201000_15.l0).anchorPanelSettingsTemp;
        if (function0 != null && (multiLiveAnchorPanelSettingsInvoke2 = function0.invoke()) != null) {
            multiLiveAnchorPanelSettingsInvoke2.layoutType = 1;
        }
        Function0<MultiLiveAnchorPanelSettings> function02 = ((LayoutSettingContract) awS139S0201000_15.l0).anchorPanelSettingsTemp;
        if (function02 != null && (multiLiveAnchorPanelSettingsInvoke = function02.invoke()) != null) {
            multiLiveAnchorPanelSettingsInvoke.fixMicNumAction = awS139S0201000_15.i2;
        }
        LayoutSettingContract.LJJJJIZL((LayoutSettingContract) awS139S0201000_15.l0, (EnumC930180aJU) awS139S0201000_15.l1, null, null, true, 13);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS139S0201000_15 awS139S0201000_15) {
        ((C959660b52) awS139S0201000_15.l0).LJJIJIIJIL(((Integer) awS139S0201000_15.l1).intValue(), awS139S0201000_15.i2, "single_confirm", "private_account", "got_it");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS139S0201000_15 awS139S0201000_15) {
        ((C959660b52) awS139S0201000_15.l0).LJJIJIIJIL(((Integer) awS139S0201000_15.l1).intValue(), awS139S0201000_15.i2, "single_confirm", "live_visibility_restricted", "got_it");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS139S0201000_15 awS139S0201000_15) {
        ((C959660b52) awS139S0201000_15.l0).LJJIJIIJIL(((Integer) awS139S0201000_15.l1).intValue(), awS139S0201000_15.i2, "allow_and_send", "non_friend_disabled", "cancel");
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS139S0201000_15 awS139S0201000_15) {
        ((MultiGuestV3GuestBeInvitedDialog) awS139S0201000_15.l0).SR(awS139S0201000_15.i2);
        Function0 function0 = (Function0) awS139S0201000_15.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS139S0201000_15 awS139S0201000_15) {
        ((C940470aa5) awS139S0201000_15.l0).LLJILJILJ = ((InterfaceC937820aVo) awS139S0201000_15.l1).getContainerActualRange();
        C940470aa5 c940470aa5 = (C940470aa5) awS139S0201000_15.l0;
        Function1<? super Rect, Unit> function1 = c940470aa5.LLJILLL;
        if (function1 != null) {
            function1.invoke(c940470aa5.LLJILJILJ);
        }
        InterfaceC940380aZw interfaceC940380aZw = ((C940470aa5) awS139S0201000_15.l0).LL;
        if (interfaceC940380aZw != null) {
            interfaceC940380aZw.LLIILII((InterfaceC937820aVo) awS139S0201000_15.l1, awS139S0201000_15.i2);
        }
        InterfaceC940230aZh interfaceC940230aZh = ((C940470aa5) awS139S0201000_15.l0).LLJJJIL;
        if (interfaceC940230aZh != null) {
            interfaceC940230aZh.LJ(((InterfaceC937820aVo) awS139S0201000_15.l1).getLayoutName());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS139S0201000_15 awS139S0201000_15) {
        List list = (List) awS139S0201000_15.l0;
        C940470aa5 c940470aa5 = (C940470aa5) awS139S0201000_15.l1;
        int i = awS139S0201000_15.i2;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
            InterfaceC940380aZw interfaceC940380aZwLJIIJJI = c940470aa5.LJIIJJI(i, c940470aa5.LLILZ);
            if (interfaceC940380aZwLJIIJJI != null) {
                interfaceC940380aZwLJIIJJI.LIZJ(i, list);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS139S0201000_15 awS139S0201000_15) {
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        Map<Integer, String> map;
        String strLIZ = C916240Zx0.LIZ(awS139S0201000_15.i2);
        ((C916180Zwu) awS139S0201000_15.l0).LIZLLL(strLIZ);
        if (strLIZ != null && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null && (map = multiGuestDataHolderLIZJ.LJIJJLI) != null) {
            ((ConcurrentHashMap) map).put(2, strLIZ);
        }
        ((Function0) awS139S0201000_15.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS139S0201000_15 awS139S0201000_15) {
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        Map<Integer, String> map;
        String strLIZ = C916240Zx0.LIZ(awS139S0201000_15.i2);
        ((C916180Zwu) awS139S0201000_15.l0).LIZLLL(strLIZ);
        if (strLIZ != null && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null && (map = multiGuestDataHolderLIZJ.LJIJJLI) != null) {
            ((ConcurrentHashMap) map).put(2, strLIZ);
        }
        C916180Zwu c916180Zwu = (C916180Zwu) awS139S0201000_15.l0;
        AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2((Function0) awS139S0201000_15.l1, (Function0<Unit>) 658);
        if (strLIZ == null) {
            c916180Zwu.getClass();
        } else {
            c916180Zwu.LIZJ(strLIZ, 0, awS581S0100000_2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS139S0201000_15(int i, int i2, C916180Zwu c916180Zwu, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = c916180Zwu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0201000_15(int i, C942610adX c942610adX, LayoutMarketFragment layoutMarketFragment, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c942610adX;
        this.l1 = layoutMarketFragment;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0201000_15(C940470aa5 c940470aa5, InterfaceC937820aVo interfaceC937820aVo, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c940470aa5;
        this.l1 = interfaceC937820aVo;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0201000_15(C959660b52 c959660b52, Integer num, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c959660b52;
        this.l1 = num;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0201000_15(LayoutSettingContract layoutSettingContract, int i, EnumC930180aJU enumC930180aJU, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = layoutSettingContract;
        this.i2 = i;
        this.l1 = enumC930180aJU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS139S0201000_15(MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog, MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog2, int i, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = multiGuestV3GuestBeInvitedDialog;
        this.i2 = multiGuestV3GuestBeInvitedDialog2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS139S0201000_15(List list, List<? extends InterfaceC937840aVq> list2, C940470aa5 c940470aa5, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.i2 = c940470aa5;
    }
}
