package kotlin.jvm.internal;

import X.AbstractC21673619ry;
import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C13LP;
import X.C1666070tSP;
import X.C1672250tcN;
import X.C20441214yg;
import X.C21411818qq;
import X.C2188811AlT;
import X.C935540aS8;
import X.C948360amo;
import X.C948400ams;
import X.C973660bRc;
import X.C978520bZS;
import X.C978750bZp;
import X.EnumC979710bbN;
import X.EnumC980440bcY;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.MatchOptionViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.livesetting.MultiGuestLiveSettingFragment;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS102S0110000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS102S0110000_15 awS102S0110000_15, Object obj) {
        ((Boolean) obj).booleanValue();
        C21411818qq c21411818qq = ((MultiGuestLiveSettingFragment) awS102S0110000_15.l0).earFeedbackSwitch;
        if (c21411818qq != null) {
            c21411818qq.setChecked(awS102S0110000_15.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS102S0110000_15 awS102S0110000_15, Object obj) {
        String resourceId;
        String strLLJLLIL;
        C935540aS8 c935540aS8 = (C935540aS8) obj;
        boolean z = awS102S0110000_15.z1;
        LiveEffect liveEffect = (LiveEffect) awS102S0110000_15.l0;
        String strLJJ = null;
        if (liveEffect != null) {
            resourceId = liveEffect.getResourceId();
        } else {
            resourceId = null;
        }
        LiveEffect liveEffect2 = (LiveEffect) awS102S0110000_15.l0;
        if (liveEffect2 != null) {
            strLLJLLIL = liveEffect2.LLJLLIL();
        } else {
            strLLJLLIL = null;
        }
        LiveEffect liveEffect3 = (LiveEffect) awS102S0110000_15.l0;
        if (liveEffect3 != null) {
            strLJJ = liveEffect3.LJJ();
        }
        return C935540aS8.LIZ(c935540aS8, false, z, resourceId, strLLJLLIL, strLJJ, false, 67);
    }

    public static final Object invoke$2(AwS102S0110000_15 awS102S0110000_15, Object obj) {
        C978750bZp c978750bZp = (C978750bZp) awS102S0110000_15.l0;
        boolean z = awS102S0110000_15.z1;
        Text textLJI = C978520bZS.LJI();
        if (textLJI == null) {
            textLJI = new Text();
            textLJI.defaultPattern = "";
        }
        c978750bZp.LJFF(z, textLJI, false);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS102S0110000_15 awS102S0110000_15, Object obj) {
        Function0<Unit> function0 = ((C978750bZp) awS102S0110000_15.l0).LJIIL;
        if (function0 != null) {
            function0.invoke();
        }
        C973660bRc.LIZ.LJJLIIIJLLLLLLLZ(null, awS102S0110000_15.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS102S0110000_15 awS102S0110000_15, Object obj) {
        C1672250tcN c1672250tcN = (C1672250tcN) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRedDotState, id: ");
        sbLIZ.append((EnumC979710bbN) awS102S0110000_15.l0);
        sbLIZ.append(", isRedDotIndicatorOn: ");
        sbLIZ.append(c1672250tcN.LJIIIIZZ);
        sbLIZ.append(", show: ");
        sbLIZ.append(awS102S0110000_15.z1);
        C20441214yg.LIZIZ("UpRightIconViewModel", C2188811AlT.LIZIZ(sbLIZ));
        return C1672250tcN.LIZ(c1672250tcN, null, false, null, null, awS102S0110000_15.z1, 767);
    }

    public static final Object invoke$5(AwS102S0110000_15 awS102S0110000_15, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAIHistoryDataShareSwitch: enable ");
        sbLIZ.append(awS102S0110000_15.z1);
        sbLIZ.append(", it = ");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LJIIIZ("MatchOptionViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (zBooleanValue != awS102S0110000_15.z1) {
            ((MatchOptionViewModel) awS102S0110000_15.l0).vQ2(zBooleanValue, EnumC980440bcY.AI_HISTORY_SHARE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS102S0110000_15 awS102S0110000_15, Object obj) {
        C948360amo c948360amo;
        int i;
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = (RecyclerView) obj;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter instanceof C948360amo) {
            c948360amo = (C948360amo) adapter;
            if (c948360amo != null) {
                c948360amo.LLLI(C1666070tSP.LIZIZ((C05P1) awS102S0110000_15.l0).LIZ);
            }
        } else {
            c948360amo = null;
        }
        C948400ams c948400ams = (C948400ams) C13LP.LJJJLZIJ(C1666070tSP.LIZIZ((C05P1) awS102S0110000_15.l0).LIZIZ, C1666070tSP.LIZIZ((C05P1) awS102S0110000_15.l0).LIZ);
        if (c948400ams != null) {
            i = c948400ams.LIZIZ;
        } else {
            i = 1;
        }
        if (c948360amo != null) {
            c948360amo.LLLJL(i);
        }
        if (awS102S0110000_15.z1 && C1666070tSP.LIZIZ((C05P1) awS102S0110000_15.l0).LIZIZ >= 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                C05P1 c05p1 = (C05P1) awS102S0110000_15.l0;
                int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                int i2 = C1666070tSP.LIZIZ(c05p1).LIZIZ;
                if (i2 < iFindFirstCompletelyVisibleItemPosition || i2 > iFindLastCompletelyVisibleItemPosition) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0110000_15(C05P0 c05p0, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0110000_15(C978750bZp c978750bZp, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c978750bZp;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0110000_15(EnumC979710bbN enumC979710bbN, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC979710bbN;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0110000_15(MatchOptionViewModel matchOptionViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = matchOptionViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0110000_15(MultiGuestLiveSettingFragment multiGuestLiveSettingFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiGuestLiveSettingFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0110000_15(LiveEffect liveEffect, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = liveEffect;
    }
}
