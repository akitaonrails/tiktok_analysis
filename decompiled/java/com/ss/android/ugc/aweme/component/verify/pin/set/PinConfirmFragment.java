package com.ss.android.ugc.aweme.component.verify.pin.set;

import X.C01GW;
import X.C0WZX;
import X.C1238130iKB;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C14EU;
import X.C1715520ukA;
import X.C1716310ulR;
import X.C1719160uq2;
import X.C19EG;
import X.C20277814Wa;
import X.C2204961BRm;
import X.C723850SaN;
import X.C990770btD;
import X.EnumC1716530uln;
import X.EnumC1718480uow;
import X.InterfaceC1724030uxt;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.component.verify.pin.ThemedPinBaseFragment;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinConfirmRouteArg;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class PinConfirmFragment extends ThemedPinBaseFragment implements InterfaceC21503819Do, InterfaceC1724030uxt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiPWHELIOSElLTclLzZ9OCwiZzw2PGscICEQJysqID0+DjctLiI2JjE=";
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.navArg(this);

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC1724030uxt
    public final void Hz() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.component.verify.pin.ThemedPinBaseFragment
    public final int SR() {
        return R.layout.ac9;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC1724030uxt
    public final void cv() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
    }

    public final PinConfirmRouteArg VR() {
        return (PinConfirmRouteArg) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1724030uxt
    public final void bF() {
        String string;
        String eventParam;
        String merchantUserId;
        String merchantId;
        String scene;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PinConfirmRouteArg pinConfirmRouteArgVR = VR();
        if (pinConfirmRouteArgVR != null && (scene = pinConfirmRouteArgVR.getScene()) != null) {
            linkedHashMap.put("busi_type", scene);
        }
        PinConfirmRouteArg pinConfirmRouteArgVR2 = VR();
        if (pinConfirmRouteArgVR2 != null && (merchantId = pinConfirmRouteArgVR2.getMerchantId()) != null) {
            linkedHashMap.put("merchant_id", merchantId);
        }
        PinConfirmRouteArg pinConfirmRouteArgVR3 = VR();
        if (pinConfirmRouteArgVR3 != null && (merchantUserId = pinConfirmRouteArgVR3.getMerchantUserId()) != null) {
            linkedHashMap.put("merchant_user_id", merchantUserId);
        }
        PinConfirmRouteArg pinConfirmRouteArgVR4 = VR();
        if (pinConfirmRouteArgVR4 != null && (eventParam = pinConfirmRouteArgVR4.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("previous_page_id")) == null) {
            string = "";
        }
        EnumC1716530uln enumC1716530uln = EnumC1716530uln.CLOSE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        PinConfirmRouteArg pinConfirmRouteArgVR5 = VR();
        String strValueOf = String.valueOf(jCurrentTimeMillis - (pinConfirmRouteArgVR5 != null ? pinConfirmRouteArgVR5.getEnterTime() : 0L));
        c1716310ulR.getClass();
        C1716310ulR.LJI("bnpl_pin_set", string, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() throws Throwable {
        Intent intent = new Intent();
        intent.putExtra("KEY_PIN_CONFIRM_RESULT", new C1719160uq2(EnumC1718480uow.CANCEL, null, null));
        C19EG activity = getActivity();
        if (activity != null) {
            C2204961BRm.LLJJIJIL(102, intent, activity, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/B0jdsW6Xyl5+4GyywsM4ylUXCw/6SHxhI2j4Kaia2dbnFb4IYid0=", null));
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.component.verify.pin.ThemedPinBaseFragment
    public final String UR() {
        PinConfirmRouteArg pinConfirmRouteArgVR = VR();
        if (pinConfirmRouteArgVR != null) {
            return pinConfirmRouteArgVR.getTheme();
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS268S0000000_26.get$arr$(135));
        EventBus.LIZLLL().LJIJJ(this);
        C1715520ukA.LIZIZ(bundle, "PinConfirmFragment");
    }

    @C14EU
    public final void onEvent(C990770btD c990770btD) {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String host;
        String scene;
        String previousPageId;
        String enterFrom;
        super.onViewCreated(view, bundle);
        PinConfirmRouteArg pinConfirmRouteArgVR = VR();
        if (pinConfirmRouteArgVR != null) {
            host = pinConfirmRouteArgVR.getHost();
        } else {
            host = null;
        }
        if (host == null || host.length() == 0) {
            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
            PinConfirmRouteArg pinConfirmRouteArgVR2 = VR();
            if (pinConfirmRouteArgVR2 != null) {
                scene = pinConfirmRouteArgVR2.getScene();
            } else {
                scene = null;
            }
            PinConfirmRouteArg pinConfirmRouteArgVR3 = VR();
            if (pinConfirmRouteArgVR3 != null) {
                previousPageId = pinConfirmRouteArgVR3.getPreviousPageId();
            } else {
                previousPageId = null;
            }
            PinConfirmRouteArg pinConfirmRouteArgVR4 = VR();
            if (pinConfirmRouteArgVR4 != null) {
                enterFrom = pinConfirmRouteArgVR4.getEnterFrom();
            } else {
                enterFrom = null;
            }
            c1716310ulR.getClass();
            C1716310ulR.LJII(scene, "bnpl_pin_confirm", previousPageId, enterFrom);
            C1397580mTM c1397580mTM = new C1397580mTM(view.getContext());
            c1397580mTM.LIZ(2131835079);
            C1238130iKB.LIZ(c1397580mTM, new AwS605S0100000_26(this, 135));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        PinConfirmRouteArg pinConfirmRouteArgVR5 = VR();
        if (pinConfirmRouteArgVR5 != null) {
            C723850SaN.LIZ(this, false, null, new AwS392S0200000_26(this, pinConfirmRouteArgVR5, 21), 3);
        }
    }
}
