package kotlin.jvm.internal;

import X.C09AY;
import X.C09JN;
import X.C0UO0;
import X.C11NJ;
import X.C930230aJZ;
import X.C940770aaZ;
import X.C948360amo;
import X.C948400ams;
import X.C950840aqo;
import X.C959660b52;
import X.C960020b5c;
import X.EnumC930180aJU;
import Y.AfS151S0200000_15;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS73S0301000_15 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS73S0301000_15 awS73S0301000_15) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke2;
        Function0<MultiLiveAnchorPanelSettings> function0 = ((LayoutSettingContract) awS73S0301000_15.l0).anchorPanelSettingsTemp;
        if (function0 != null && (multiLiveAnchorPanelSettingsInvoke2 = function0.invoke()) != null) {
            multiLiveAnchorPanelSettingsInvoke2.layoutType = 1;
        }
        Function0<MultiLiveAnchorPanelSettings> function02 = ((LayoutSettingContract) awS73S0301000_15.l0).anchorPanelSettingsTemp;
        if (function02 != null && (multiLiveAnchorPanelSettingsInvoke = function02.invoke()) != null) {
            multiLiveAnchorPanelSettingsInvoke.fixMicNumAction = awS73S0301000_15.i3;
        }
        LayoutSettingContract.LJJJJIZL((LayoutSettingContract) awS73S0301000_15.l0, (EnumC930180aJU) awS73S0301000_15.l1, null, (Context) awS73S0301000_15.l2, true, 5);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS73S0301000_15 awS73S0301000_15) {
        int i;
        C930230aJZ c930230aJZ = (C930230aJZ) awS73S0301000_15.l0;
        C948360amo c948360amoLJIIIZ = ((LayoutSettingContract) awS73S0301000_15.l1).LJIIIZ();
        if (c948360amoLJIIIZ != null) {
            int i2 = awS73S0301000_15.i3;
            i = c948360amoLJIIIZ.LLILZLL;
            if (c948360amoLJIIIZ.LLIZ == -1) {
                c948360amoLJIIIZ.LLLJ(i2);
                c948360amoLJIIIZ.LLIZ = i2;
                c948360amoLJIIIZ.notifyItemChanged(i);
                c948360amoLJIIIZ.notifyItemChanged(i2);
            }
        } else {
            i = 0;
        }
        c930230aJZ.LIZ = i;
        ((C930230aJZ) awS73S0301000_15.l0).LIZIZ = C940770aaZ.LIZ().getDataSource().getPanelLayoutType();
        ((C930230aJZ) awS73S0301000_15.l0).LIZJ = C940770aaZ.LIZ().getDataSource().LJIL();
        ((C930230aJZ) awS73S0301000_15.l0).LIZLLL = C940770aaZ.LIZ().getDataSource().LIZ();
        LayoutSettingContract layoutSettingContract = (LayoutSettingContract) awS73S0301000_15.l1;
        layoutSettingContract.isLayoutOperationEnable = false;
        layoutSettingContract.LJJJLZIJ(layoutSettingContract.simpleLayoutDataSourceForV3.LJII(((C948400ams) awS73S0301000_15.l2).LIZIZ) - 1);
        ((LayoutSettingContract) awS73S0301000_15.l1).LJJJLL(((C948400ams) awS73S0301000_15.l2).LIZIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS73S0301000_15 awS73S0301000_15) {
        ((C959660b52) awS73S0301000_15.l0).LJJIJIIJIL(((Integer) awS73S0301000_15.l1).intValue(), awS73S0301000_15.i3, "allow_and_send", "non_friend_disabled", "allow_and_send");
        C959660b52 c959660b52 = (C959660b52) awS73S0301000_15.l0;
        C950840aqo c950840aqo = (C950840aqo) awS73S0301000_15.l2;
        c959660b52.getClass();
        ((C11NJ) c959660b52.LIZLLL.getValue()).LIZ(C960020b5c.LIZIZ(15, true).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(c959660b52, c950840aqo, 50), new C09JN() { // from class: X.0JOL
            @Override // X.C09JN
            public final void accept(Object obj) {
                int errorCode;
                C501520Jle c501520Jle;
                C1C7U.LIZ("QuickCoHostStateNone@7571.retryQuickCoHostAfterAllowSuggested$2");
                Throwable th = (Throwable) obj;
                if ((th instanceof C501470JlZ) && (c501520Jle = (C501520Jle) th) != null) {
                    errorCode = c501520Jle.getErrorCode();
                } else {
                    errorCode = -1;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pre-filter retry: updateAllowSuggestedConnection failed code=");
                sbLIZ.append(errorCode);
                C20441214yg.LJFF("QuickCoHostStateNone", C2188811AlT.LIZIZ(sbLIZ), th);
                C501540Jlg.LJ(C497740JfY.LJII(), th);
                C1C7U.LIZIZ("QuickCoHostStateNone@7571.retryQuickCoHostAfterAllowSuggested$2");
            }
        }));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0301000_15(C930230aJZ c930230aJZ, LayoutSettingContract layoutSettingContract, int i, C948400ams c948400ams, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c930230aJZ;
        this.l1 = layoutSettingContract;
        this.i3 = i;
        this.l2 = c948400ams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0301000_15(C959660b52 c959660b52, Integer num, int i, C950840aqo c950840aqo, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c959660b52;
        this.l1 = num;
        this.i3 = i;
        this.l2 = c950840aqo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0301000_15(LayoutSettingContract layoutSettingContract, int i, EnumC930180aJU enumC930180aJU, Context context, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = layoutSettingContract;
        this.i3 = i;
        this.l1 = enumC930180aJU;
        this.l2 = context;
    }
}
