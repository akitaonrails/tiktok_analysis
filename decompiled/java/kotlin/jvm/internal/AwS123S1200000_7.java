package kotlin.jvm.internal;

import X.AbstractC518430KUv;
import X.C09AY;
import X.C0JFO;
import X.C0UQX;
import X.C1161920gLG;
import X.C19EG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C499910Jj3;
import X.C769040UEs;
import X.InterfaceC1541990qEH;
import X.InterfaceC1814530xJr;
import X.InterfaceC390601fU;
import X.InterfaceC518440KUw;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.RoomStatus;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewNoPermissionOptFixCrashABSetting;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.touchpoint.core.crossplatform.IncentiveTaskPageFragment;
import com.bytedance.tux.sheet.intro.TuxPanel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import webcast.api.room.EntranceConditionsPopup;

/* JADX INFO: loaded from: classes8.dex */
public class AwS123S1200000_7 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS123S1200000_7 awS123S1200000_7) {
        C0UQX.LJJII((DataChannel) awS123S1200000_7.l1, (EntranceConditionsPopup) awS123S1200000_7.l2, "click", "got_it", awS123S1200000_7.s0);
        if (AnchorPreviewNoPermissionOptFixCrashABSetting.INSTANCE.enable()) {
            TuxPanel tuxPanel = C499910Jj3.LIZ;
            if (tuxPanel != null) {
                tuxPanel.dismissAllowingStateLoss();
            }
        } else {
            TuxPanel tuxPanel2 = C499910Jj3.LIZ;
            if (tuxPanel2 != null) {
                tuxPanel2.dismiss();
            }
        }
        C499910Jj3.LIZ = null;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS123S1200000_7 awS123S1200000_7) {
        C19EG activity;
        Intent intent;
        Fragment fragment = (Fragment) awS123S1200000_7.l1;
        if (fragment != null && (activity = fragment.getActivity()) != null && (intent = activity.getIntent()) != null) {
            return intent.putExtra(awS123S1200000_7.s0, (Parcelable) awS123S1200000_7.l2);
        }
        return null;
    }

    public static final Object invoke$2(AwS123S1200000_7 awS123S1200000_7) {
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((SparkFragment) ((IncentiveTaskPageFragment) awS123S1200000_7.l1).LL.getValue()).LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        } else {
            kitView = null;
        }
        JSONObject jSONObject = (JSONObject) awS123S1200000_7.l2;
        if (jSONObject == null) {
            if (kitView != null) {
                kitView.X0(awS123S1200000_7.s0, null);
            }
        } else if (kitView != null) {
            kitView.LIZ(awS123S1200000_7.s0, jSONObject);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS123S1200000_7 awS123S1200000_7) {
        if (((AbstractC518430KUv) awS123S1200000_7.l1).LIZJ.containsKey(awS123S1200000_7.s0)) {
            InterfaceC518440KUw interfaceC518440KUw = (InterfaceC518440KUw) ((LinkedHashMap) ((AbstractC518430KUv) awS123S1200000_7.l1).LIZJ).get(awS123S1200000_7.s0);
            if (interfaceC518440KUw != null) {
                interfaceC518440KUw.LIZ(awS123S1200000_7.l2);
            }
        } else {
            String strLJFF = ((AbstractC518430KUv) awS123S1200000_7.l1).LJFF();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No listener for the message, key: ");
            sbLIZ.append(awS123S1200000_7.s0);
            C20441214yg.LIZIZ(strLJFF, C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS123S1200000_7 awS123S1200000_7) {
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        C769040UEs.LIZ();
        InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
        if (effectBoardService != null) {
            effectBoardService.LJII(false);
        }
        InterfaceC1814530xJr boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
        if (boardsDisplayStateManager != null) {
            boardsDisplayStateManager.LJIIJJI();
        }
        ((Function1) awS123S1200000_7.l1).invoke(Boolean.TRUE);
        C0JFO.LJIIJ((DataChannel) awS123S1200000_7.l2, awS123S1200000_7.s0, true);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS123S1200000_7 awS123S1200000_7) {
        ((Function1) awS123S1200000_7.l1).invoke(Boolean.FALSE);
        C0JFO.LJIIJ((DataChannel) awS123S1200000_7.l2, awS123S1200000_7.s0, false);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1200000_7(Fragment fragment, RoomStatus roomStatus, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = "host_room_status_event";
        this.l2 = roomStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS123S1200000_7(AbstractC518430KUv abstractC518430KUv, AbstractC518430KUv<IM_MESSAGE> abstractC518430KUv2, String str, IM_MESSAGE im_message) {
        super(0);
        this.$t = im_message;
        this.l1 = abstractC518430KUv;
        this.s0 = abstractC518430KUv2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1200000_7(DataChannel dataChannel, String str, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l1 = function1;
        this.l2 = dataChannel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1200000_7(DataChannel dataChannel, EntranceConditionsPopup entranceConditionsPopup, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = dataChannel;
        this.l2 = entranceConditionsPopup;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S1200000_7(IncentiveTaskPageFragment incentiveTaskPageFragment, JSONObject jSONObject, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = incentiveTaskPageFragment;
        this.l2 = jSONObject;
        this.s0 = str;
    }
}
