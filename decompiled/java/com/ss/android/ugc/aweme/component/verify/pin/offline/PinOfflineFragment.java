package com.ss.android.ugc.aweme.component.verify.pin.offline;

import X.C14EU;
import X.C1716540ulo;
import X.C1718680upG;
import X.C1718690upH;
import X.C19EG;
import X.C1AF0;
import X.C20277814Wa;
import X.C723850SaN;
import X.C990770btD;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.verify.pin.ThemedPinBaseFragment;
import com.ss.android.ugc.aweme.component.verify.pin.model.HintPageMsg;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS598S0100000_19;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class PinOfflineFragment extends ThemedPinBaseFragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiPWElHELIOSLTclLzZ9OCwiZyA1LiklJyp9GCwiBik1JCwiLAkhKSIhLCEn";
    public C1718690upH LLIZLLLIL;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.component.verify.pin.ThemedPinBaseFragment
    public final int SR() {
        return R.layout.acb;
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
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    @Override // com.ss.android.ugc.aweme.component.verify.pin.ThemedPinBaseFragment
    public final String UR() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("theme");
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        HintPageMsg hintPageMsg;
        String string11;
        String string12;
        super.onCreate(bundle);
        NR(AFwS268S0000000_26.get$arr$(132));
        activityConfiguration(AFwS268S0000000_26.get$arr$(133));
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("host")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("session_id")) == null) {
            string2 = "";
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string3 = arguments3.getString("merchant_id")) == null) {
            string3 = "";
        }
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string4 = arguments4.getString("merchant_user_id")) == null) {
            string4 = "";
        }
        C1718680upG c1718680upG = new C1718680upG(string, string2, string3, string4);
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string5 = arguments5.getString("pipo_product_code")) == null) {
            string5 = "";
        }
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (string6 = arguments6.getString("previous_page_id")) == null) {
            string6 = "";
        }
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (string7 = arguments7.getString("KEY_EVENT_PARAM")) == null) {
            string7 = "";
        }
        Bundle arguments8 = getArguments();
        if (arguments8 == null || (string8 = arguments8.getString("KEY_OFFLINE_PIN_MODE")) == null) {
            string8 = "forgot";
        }
        Bundle arguments9 = getArguments();
        if (arguments9 == null || (string9 = arguments9.getString("KEY_OFFLINE_PIN_URL")) == null) {
            string9 = "";
        }
        Bundle arguments10 = getArguments();
        if (arguments10 == null || (string10 = arguments10.getString("enter_from")) == null) {
            string10 = "";
        }
        try {
            Bundle arguments11 = getArguments();
            if (arguments11 != null && (string12 = arguments11.getString("hint_page_msg")) != null) {
                str = string12;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (str.length() > 0) {
            hintPageMsg = (HintPageMsg) JsonParseUtils.LIZLLL(HintPageMsg.class, str);
        } else {
            hintPageMsg = null;
        }
        Bundle arguments12 = getArguments();
        if (arguments12 == null || (string11 = arguments12.getString("theme")) == null) {
            string11 = "default";
        }
        this.LLIZLLLIL = new C1718690upH(c1718680upG, string5, string6, string7, string8, string9, string10, hintPageMsg, string11);
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU
    public final void onEvent(C990770btD c990770btD) {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @C14EU
    public final void onEvent(C1716540ulo c1716540ulo) {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Bundle arguments;
        super.onViewCreated(view, bundle);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string = arguments2.getString("KEY_SCENE");
        } else {
            string = null;
        }
        if ((string == null || string.length() == 0) && (arguments = getArguments()) != null) {
            arguments.getString(Scene.SCENE_SERVICE);
        }
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 129), 3);
    }
}
