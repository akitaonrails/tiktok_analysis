package com.ss.android.ugc.aweme.component.verify.pin.change;

import X.C14EU;
import X.C1715520ukA;
import X.C1716310ulR;
import X.C1716350ulV;
import X.C1716550ulp;
import X.C1717080umg;
import X.C1718510uoz;
import X.C1718680upG;
import X.C1718900upc;
import X.C1948507kB;
import X.C19EG;
import X.C20277814Wa;
import X.C723850SaN;
import X.C990770btD;
import X.EnumC1716530uln;
import X.EnumC1717460unI;
import X.InterfaceC1724030uxt;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.component.base.ui.PipoTransparentActivity;
import com.ss.android.ugc.aweme.component.verify.pin.ThemedPinBaseFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6(attachActivity = PipoTransparentActivity.class)
public final class PinChangeFragment extends ThemedPinBaseFragment implements InterfaceC21503819Do, InterfaceC1724030uxt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiPWElHELIOSLTclLzZ9OCwiZyw7KSsrLGEDISsPIS49LyAKOy40JSAiPQ==";
    public long LLIZLLLIL;
    public C1718510uoz LLJ;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.component.verify.pin.ThemedPinBaseFragment
    public final int SR() {
        return R.layout.ac8;
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

    @Override // X.InterfaceC1724030uxt
    public final void Hz() {
        String str;
        String string;
        String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1718510uoz c1718510uoz = this.LLJ;
        String str2 = "";
        if (c1718510uoz == null || (str = c1718510uoz.LIZIZ) == null) {
            str = "";
        }
        linkedHashMap.put("busi_type", str);
        Bundle arguments = getArguments();
        if (arguments != null && (string2 = arguments.getString("KEY_EVENT_PARAM")) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(string2));
        }
        this.LLIZLLLIL = System.currentTimeMillis();
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("previous_page_id")) != null) {
            str2 = string;
        }
        C1716310ulR.LJFF(c1716310ulR, "bnpl_pin_change", str2, linkedHashMap);
    }

    @Override // X.InterfaceC1724030uxt
    public final void bF() {
        String str;
        String string;
        String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1718510uoz c1718510uoz = this.LLJ;
        String str2 = "";
        if (c1718510uoz == null || (str = c1718510uoz.LIZIZ) == null) {
            str = "";
        }
        linkedHashMap.put("busi_type", str);
        Bundle arguments = getArguments();
        if (arguments != null && (string2 = arguments.getString("KEY_EVENT_PARAM")) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(string2));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("previous_page_id")) != null) {
            str2 = string;
        }
        EnumC1716530uln enumC1716530uln = EnumC1716530uln.CLOSE;
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLIZLLLIL);
        c1716310ulR.getClass();
        C1716310ulR.LJI("bnpl_pin_change", str2, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // X.InterfaceC1724030uxt
    public final void cv() {
        String str;
        String string;
        String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1718510uoz c1718510uoz = this.LLJ;
        String str2 = "";
        if (c1718510uoz == null || (str = c1718510uoz.LIZIZ) == null) {
            str = "";
        }
        linkedHashMap.put("busi_type", str);
        Bundle arguments = getArguments();
        if (arguments != null && (string2 = arguments.getString("KEY_EVENT_PARAM")) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(string2));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("previous_page_id")) != null) {
            str2 = string;
        }
        EnumC1716530uln enumC1716530uln = EnumC1716530uln.RETURN;
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLIZLLLIL);
        c1716310ulR.getClass();
        C1716310ulR.LJI("bnpl_pin_change", str2, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
        String str;
        String string;
        String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1718510uoz c1718510uoz = this.LLJ;
        String str2 = "";
        if (c1718510uoz == null || (str = c1718510uoz.LIZIZ) == null) {
            str = "";
        }
        linkedHashMap.put("busi_type", str);
        Bundle arguments = getArguments();
        if (arguments != null && (string2 = arguments.getString("KEY_EVENT_PARAM")) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(string2));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("previous_page_id")) != null) {
            str2 = string;
        }
        EnumC1716530uln enumC1716530uln = EnumC1716530uln.NEXT;
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLIZLLLIL);
        c1716310ulR.getClass();
        C1716310ulR.LJI("bnpl_pin_change", str2, enumC1716530uln, strValueOf, linkedHashMap);
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
        Serializable serializable;
        EnumC1717460unI enumC1717460unI;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        Serializable serializable2;
        EnumC1717460unI enumC1717460unI2;
        String string14;
        String string15;
        String string16;
        super.onCreate(bundle);
        NR(AFwS268S0000000_26.get$arr$(121));
        C1718900upc.LIZ.getClass();
        C1718900upc.LJ();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString(Scene.SCENE_SERVICE)) == null) {
            string = "";
        }
        String str2 = "TTS_BNPL";
        if (TextUtils.equals("BNPL", string)) {
            C1716550ulp.LIZ.getClass();
            C1717080umg c1717080umgLJFF = C1716550ulp.LJFF("TTS_BNPL");
            if (c1717080umgLJFF != null) {
                String str3 = c1717080umgLJFF.LIZ;
                String strLJ = C1716550ulp.LJ("TTS_BNPL");
                if (strLJ == null) {
                    strLJ = "";
                }
                C1716350ulV c1716350ulV = c1717080umgLJFF.LIZLLL;
                C1718680upG c1718680upG = new C1718680upG(str3, strLJ, c1716350ulV.LIZ, c1716350ulV.LIZIZ);
                Bundle arguments2 = getArguments();
                if (arguments2 == null || (string12 = arguments2.getString("previous_page_id")) == null) {
                    string12 = "";
                }
                Bundle arguments3 = getArguments();
                if (arguments3 == null || (string13 = arguments3.getString("KEY_EVENT_PARAM")) == null) {
                    string13 = "";
                }
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    serializable2 = arguments4.getSerializable("KEY_SET_MODE");
                } else {
                    serializable2 = null;
                }
                if (!(serializable2 instanceof EnumC1717460unI) || (enumC1717460unI2 = (EnumC1717460unI) serializable2) == null) {
                    enumC1717460unI2 = EnumC1717460unI.CHANGE;
                }
                Bundle arguments5 = getArguments();
                if (arguments5 == null || (string14 = arguments5.getString("enter_from")) == null) {
                    string14 = "";
                }
                Bundle arguments6 = getArguments();
                if (arguments6 != null) {
                    arguments6.getBoolean("disable_hint_msg");
                }
                Bundle arguments7 = getArguments();
                if (arguments7 != null) {
                    string15 = arguments7.getString("theme");
                } else {
                    string15 = null;
                }
                if (!C1948507kB.LIZ(string15)) {
                    str = "default";
                } else {
                    Bundle arguments8 = getArguments();
                    if (arguments8 != null && (string16 = arguments8.getString("theme")) != null) {
                        str = string16;
                    }
                }
                this.LLJ = new C1718510uoz(c1718680upG, "TTS_BNPL", enumC1717460unI2, string12, string13, string14, str);
            }
        } else {
            Bundle arguments9 = getArguments();
            if (arguments9 != null && (string11 = arguments9.getString("pipo_product_code")) != null) {
                str2 = string11;
            }
            Bundle arguments10 = getArguments();
            if (arguments10 == null || (string2 = arguments10.getString("host")) == null) {
                string2 = "";
            }
            Bundle arguments11 = getArguments();
            if (arguments11 == null || (string3 = arguments11.getString("session_id")) == null) {
                string3 = "";
            }
            Bundle arguments12 = getArguments();
            if (arguments12 == null || (string4 = arguments12.getString("merchant_id")) == null) {
                string4 = "";
            }
            Bundle arguments13 = getArguments();
            if (arguments13 == null || (string5 = arguments13.getString("merchant_user_id")) == null) {
                string5 = "";
            }
            C1718680upG c1718680upG2 = new C1718680upG(string2, string3, string4, string5);
            Bundle arguments14 = getArguments();
            if (arguments14 == null || (string6 = arguments14.getString("previous_page_id")) == null) {
                string6 = "";
            }
            Bundle arguments15 = getArguments();
            if (arguments15 == null || (string7 = arguments15.getString("KEY_EVENT_PARAM")) == null) {
                string7 = "";
            }
            Bundle arguments16 = getArguments();
            if (arguments16 != null) {
                serializable = arguments16.getSerializable("KEY_SET_MODE");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof EnumC1717460unI) || (enumC1717460unI = (EnumC1717460unI) serializable) == null) {
                enumC1717460unI = EnumC1717460unI.CHANGE;
            }
            Bundle arguments17 = getArguments();
            if (arguments17 == null || (string8 = arguments17.getString("enter_from")) == null) {
                string8 = "";
            }
            Bundle arguments18 = getArguments();
            if (arguments18 != null) {
                arguments18.getBoolean("disable_hint_msg");
            }
            Bundle arguments19 = getArguments();
            if (arguments19 != null) {
                string9 = arguments19.getString("theme");
            } else {
                string9 = null;
            }
            if (!C1948507kB.LIZ(string9)) {
                str = "default";
            } else {
                Bundle arguments20 = getArguments();
                if (arguments20 != null && (string10 = arguments20.getString("theme")) != null) {
                    str = string10;
                }
            }
            this.LLJ = new C1718510uoz(c1718680upG2, str2, enumC1717460unI, string6, string7, string8, str);
        }
        EventBus.LIZLLL().LJIJJ(this);
        C1715520ukA.LIZIZ(bundle, "PinChangeFragment");
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
        C723850SaN.LIZ(this, false, null, new AwS605S0100000_26(this, 118), 3);
    }
}
