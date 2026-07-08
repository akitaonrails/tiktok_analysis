package com.ss.android.ugc.aweme.component.verify.pin.set;

import X.C01GW;
import X.C0HTI;
import X.C1238130iKB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C14EU;
import X.C1533950q1J;
import X.C1715520ukA;
import X.C1716310ulR;
import X.C1718120uoM;
import X.C1719120upy;
import X.C1719460uqW;
import X.C19EG;
import X.C20277814Wa;
import X.C259800zU;
import X.C340160DVe;
import X.C418440Gaw;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.C990770btD;
import X.EnumC1338240kve;
import X.EnumC1716530uln;
import X.EnumC1717460unI;
import X.InterfaceC1718890upb;
import X.InterfaceC1724030uxt;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.component.verify.pin.ThemedPinBaseFragment;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinSetRouteArg;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS605S0100000_26;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class PinSetFragment extends ThemedPinBaseFragment implements InterfaceC21503819Do, InterfaceC1724030uxt {
    public static InterfaceC1718890upb LLJIJIL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiHELIOSPWElLTclLzZ9OCwiZzw2PGscICEALTEKOy40JSAiPQ==";
    public C1719460uqW LLIZLLLIL;
    public final C01GW LLJ = RouteArgExtension.INSTANCE.navArg(this);
    public long LLJI;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.component.verify.pin.ThemedPinBaseFragment
    public final int SR() {
        return R.layout.acc;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
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

    public final PinSetRouteArg VR() {
        return (PinSetRouteArg) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1724030uxt
    public final void bF() {
        WR(EnumC1716530uln.CLOSE);
    }

    @Override // X.InterfaceC1724030uxt
    public final void cv() {
        WR(EnumC1716530uln.RETURN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21503819Do
    public final void tv() {
        PinSetRouteArg pinSetRouteArgVR = VR();
        if (pinSetRouteArgVR != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_id", "bnpl_pin_set");
            linkedHashMap.put("previous_page_id", pinSetRouteArgVR.getPreviousPageId());
            linkedHashMap.put("biz_merchant_id", pinSetRouteArgVR.getMerchantId());
            linkedHashMap.put("merchant_user_id", pinSetRouteArgVR.getMerchantUserId());
            linkedHashMap.put("popup_id", "landing_pin_retention_promo");
            linkedHashMap.put("enter_from", pinSetRouteArgVR.getEnterFrom());
            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
            String eventParam = pinSetRouteArgVR.getEventParam();
            c1716310ulR.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
            if (pinSetRouteArgVR.getHitMarketing()) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(linkedHashMap);
                linkedHashMap2.put("event_type", "show");
                C1716310ulR.LIZLLL("pipo_popup_show", linkedHashMap2);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.putAll(linkedHashMap);
                linkedHashMap3.put("event_type", "show");
                linkedHashMap3.put("button_id", "continue");
                C1716310ulR.LIZLLL("pipo_button_show", linkedHashMap3);
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.putAll(linkedHashMap);
                linkedHashMap4.put("event_type", "show");
                linkedHashMap4.put("button_id", "leave");
                C1716310ulR.LIZLLL("pipo_button_show", linkedHashMap4);
            } else {
                C1718120uoM c1718120uoM = C1718120uoM.LIZ;
                String scene = pinSetRouteArgVR.getScene();
                String previousPageId = pinSetRouteArgVR.getPreviousPageId();
                String eventParam2 = pinSetRouteArgVR.getEventParam();
                String merchantId = pinSetRouteArgVR.getMerchantId();
                String merchantUserId = pinSetRouteArgVR.getMerchantUserId();
                String enterFrom = pinSetRouteArgVR.getEnterFrom();
                c1718120uoM.getClass();
                C1718120uoM.LJFF(scene, "bnpl_pin_set", previousPageId, "{1,continue; 2,discard_changes}", "quit_pin_set", eventParam2, merchantId, merchantUserId, enterFrom);
            }
            C19EG activity = getActivity();
            String exitPopoutImageUrl = (activity == null || !C960203pA.LIZIZ(activity)) ? pinSetRouteArgVR.getExitPopoutImageUrl() : pinSetRouteArgVR.getExitPopoutImageDarkUrl();
            String exitPopoutTitle = pinSetRouteArgVR.getExitPopoutTitle();
            if (exitPopoutTitle.length() == 0) {
                exitPopoutTitle = getString((pinSetRouteArgVR.getPinSetMode() == EnumC1717460unI.REGISTER || pinSetRouteArgVR.getPinSetMode() == EnumC1717460unI.CREATE_PIN) ? 2131840473 : 2131840477);
            }
            String exitPopoutDesc = pinSetRouteArgVR.getExitPopoutDesc();
            if (exitPopoutDesc.length() == 0) {
                exitPopoutDesc = getString((pinSetRouteArgVR.getPinSetMode() == EnumC1717460unI.REGISTER || pinSetRouteArgVR.getPinSetMode() == EnumC1717460unI.CREATE_PIN) ? 2131840474 : 2131840478);
            }
            String exitPopoutBtnMain = pinSetRouteArgVR.getExitPopoutBtnMain();
            if (exitPopoutBtnMain.length() == 0) {
                exitPopoutBtnMain = getString((pinSetRouteArgVR.getPinSetMode() == EnumC1717460unI.REGISTER || pinSetRouteArgVR.getPinSetMode() == EnumC1717460unI.CREATE_PIN) ? 2131840476 : 2131840480);
            }
            String exitPopoutBtnSub = pinSetRouteArgVR.getExitPopoutBtnSub();
            if (exitPopoutBtnSub.length() == 0) {
                exitPopoutBtnSub = getString((pinSetRouteArgVR.getPinSetMode() == EnumC1717460unI.REGISTER || pinSetRouteArgVR.getPinSetMode() == EnumC1717460unI.CREATE_PIN) ? 2131840475 : 2131840479);
            }
            Context context = getContext();
            if (context != null) {
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = "quit_pin_set";
                PinSetRouteArg pinSetRouteArgVR2 = VR();
                if (pinSetRouteArgVR2 != null) {
                    T t = "quit_pin_set";
                    if (pinSetRouteArgVR2.getPinSetMode() != EnumC1717460unI.REGISTER) {
                        t = "quit_pin_set";
                        if (pinSetRouteArgVR.getPinSetMode() != EnumC1717460unI.CREATE_PIN) {
                            t = "quit_pin_change";
                        }
                    }
                    c259800zU.element = t;
                }
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                if (pinSetRouteArgVR.getHitMarketing() || C1533950q1J.LJ(exitPopoutImageUrl)) {
                    ImageView imageView = new ImageView(context);
                    C786410Ut5.c6(imageView, new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(278)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(119))));
                    if (exitPopoutImageUrl.length() == 0) {
                        C0HTI c0hti = new C0HTI();
                        c0hti.LIZ = R.drawable.u1;
                        imageView.setImageDrawable(c0hti.LIZ(context));
                    } else {
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(exitPopoutImageUrl);
                        c1331670kl3LJIIIZ.LJJIJL(context);
                        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
                        c1331670kl3LJIIIZ.LJJI(imageView);
                        C786410Ut5.h3(c1331670kl3LJIIIZ);
                    }
                    c1397580mTM.LJIIIZ = new C340160DVe(context, imageView);
                }
                c1397580mTM.LJI(exitPopoutTitle);
                c1397580mTM.LIZIZ(exitPopoutDesc);
                c1397580mTM.LJII = false;
                C1238130iKB.LIZ(c1397580mTM, new C1719120upy(exitPopoutBtnMain, exitPopoutBtnSub, pinSetRouteArgVR, this, c259800zU, linkedHashMap));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
        WR(EnumC1716530uln.NEXT);
    }

    @Override // X.InterfaceC1724030uxt
    public final void Hz() {
        String previousPageId;
        String eventParam;
        String merchantUserId;
        String merchantId;
        String scene;
        this.LLJI = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PinSetRouteArg pinSetRouteArgVR = VR();
        if (pinSetRouteArgVR != null && (scene = pinSetRouteArgVR.getScene()) != null) {
            linkedHashMap.put("busi_type", scene);
        }
        PinSetRouteArg pinSetRouteArgVR2 = VR();
        if (pinSetRouteArgVR2 != null && (merchantId = pinSetRouteArgVR2.getMerchantId()) != null) {
            linkedHashMap.put("merchant_id", merchantId);
        }
        PinSetRouteArg pinSetRouteArgVR3 = VR();
        if (pinSetRouteArgVR3 != null && (merchantUserId = pinSetRouteArgVR3.getMerchantUserId()) != null) {
            linkedHashMap.put("merchant_user_id", merchantUserId);
        }
        PinSetRouteArg pinSetRouteArgVR4 = VR();
        if (pinSetRouteArgVR4 != null && (eventParam = pinSetRouteArgVR4.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        PinSetRouteArg pinSetRouteArgVR5 = VR();
        if (pinSetRouteArgVR5 == null || (previousPageId = pinSetRouteArgVR5.getPreviousPageId()) == null) {
            previousPageId = "";
        }
        C1716310ulR.LJFF(c1716310ulR, "bnpl_pin_set", previousPageId, linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.component.verify.pin.ThemedPinBaseFragment
    public final String UR() {
        PinSetRouteArg pinSetRouteArgVR = VR();
        if (pinSetRouteArgVR != null) {
            return pinSetRouteArgVR.getTheme();
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        LLJIJIL = null;
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZLLLIL = null;
    }

    public final void WR(EnumC1716530uln enumC1716530uln) {
        String previousPageId;
        String eventParam;
        String merchantUserId;
        String merchantId;
        String scene;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PinSetRouteArg pinSetRouteArgVR = VR();
        if (pinSetRouteArgVR != null && (scene = pinSetRouteArgVR.getScene()) != null) {
            linkedHashMap.put("busi_type", scene);
        }
        PinSetRouteArg pinSetRouteArgVR2 = VR();
        if (pinSetRouteArgVR2 != null && (merchantId = pinSetRouteArgVR2.getMerchantId()) != null) {
            linkedHashMap.put("merchant_id", merchantId);
        }
        PinSetRouteArg pinSetRouteArgVR3 = VR();
        if (pinSetRouteArgVR3 != null && (merchantUserId = pinSetRouteArgVR3.getMerchantUserId()) != null) {
            linkedHashMap.put("merchant_user_id", merchantUserId);
        }
        PinSetRouteArg pinSetRouteArgVR4 = VR();
        if (pinSetRouteArgVR4 != null && (eventParam = pinSetRouteArgVR4.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        PinSetRouteArg pinSetRouteArgVR5 = VR();
        if (pinSetRouteArgVR5 == null || (previousPageId = pinSetRouteArgVR5.getPreviousPageId()) == null) {
            previousPageId = "";
        }
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLJI);
        c1716310ulR.getClass();
        C1716310ulR.LJI("bnpl_pin_set", previousPageId, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String sourceBtmToken;
        activityConfiguration(new AwS605S0100000_26(this, 136));
        super.onCreate(bundle);
        NR(AFwS268S0000000_26.get$arr$(137));
        EventBus.LIZLLL().LJIJJ(this);
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        PinSetRouteArg pinSetRouteArgVR = VR();
        if (pinSetRouteArgVR != null) {
            sourceBtmToken = pinSetRouteArgVR.getSourceBtmToken();
        } else {
            sourceBtmToken = null;
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b87466", sourceBtmToken);
        C1715520ukA.LIZIZ(bundle, "PinSetFragment");
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
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 132), 3);
    }
}
