package com.ss.android.ugc.aweme.component.verify.pin.forgot;

import X.C098200Yq;
import X.C1158360gFW;
import X.C14EU;
import X.C1685300txQ;
import X.C1715520ukA;
import X.C1716310ulR;
import X.C1716350ulV;
import X.C1716550ulp;
import X.C1717080umg;
import X.C1718450uot;
import X.C1718680upG;
import X.C1718900upc;
import X.C189200o6;
import X.C1948507kB;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C723850SaN;
import X.C786410Ut5;
import X.C990770btD;
import X.EnumC1716530uln;
import X.InterfaceC1724030uxt;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.base.ui.PipoTransparentActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS586S0100000_7;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6(attachActivity = PipoTransparentActivity.class)
public final class PinForgotFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC1724030uxt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiPWElHELIOSLTclLzZ9OCwiZyk8OiIjPWEDISsKJj00JzEKOy40JSAiPQ==";
    public long LLIZ;
    public C1718450uot LLIZLLLIL;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
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
        C1718450uot c1718450uot = this.LLIZLLLIL;
        String str2 = "";
        if (c1718450uot == null || (str = c1718450uot.LIZIZ) == null) {
            str = "";
        }
        linkedHashMap.put("busi_type", str);
        Bundle arguments = getArguments();
        if (arguments != null && (string2 = arguments.getString("KEY_EVENT_PARAM")) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(string2));
        }
        this.LLIZ = System.currentTimeMillis();
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("previous_page_id")) != null) {
            str2 = string;
        }
        C1716310ulR.LJFF(c1716310ulR, "bnpl_pin_forgot", str2, linkedHashMap);
    }

    @Override // X.InterfaceC1724030uxt
    public final void bF() {
        String str;
        String string;
        String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1718450uot c1718450uot = this.LLIZLLLIL;
        String str2 = "";
        if (c1718450uot == null || (str = c1718450uot.LIZIZ) == null) {
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
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLIZ);
        c1716310ulR.getClass();
        C1716310ulR.LJI("bnpl_pin_forgot", str2, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // X.InterfaceC1724030uxt
    public final void cv() {
        String str;
        String string;
        String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1718450uot c1718450uot = this.LLIZLLLIL;
        String str2 = "";
        if (c1718450uot == null || (str = c1718450uot.LIZIZ) == null) {
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
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLIZ);
        c1716310ulR.getClass();
        C1716310ulR.LJI("bnpl_pin_forgot", str2, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
        String str;
        String string;
        String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1718450uot c1718450uot = this.LLIZLLLIL;
        String str2 = "";
        if (c1718450uot == null || (str = c1718450uot.LIZIZ) == null) {
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
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLIZ);
        c1716310ulR.getClass();
        C1716310ulR.LJI("bnpl_pin_forgot", str2, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
    }

    @Override // X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LIZJ();
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
        Boolean boolValueOf;
        String string11;
        int i;
        Bundle arguments;
        Bundle arguments2;
        String string12;
        String string13;
        String string14;
        String string15;
        Boolean boolValueOf2;
        String string16;
        String string17;
        super.onCreate(bundle);
        NR(AFwS268S0000000_26.get$arr$(127));
        C1718900upc.LIZ.getClass();
        C1718900upc.LJ();
        Bundle arguments3 = getArguments();
        String str = "";
        if (arguments3 == null || (string = arguments3.getString(Scene.SCENE_SERVICE)) == null) {
            string = "";
        }
        String string18 = "default";
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
                Bundle arguments4 = getArguments();
                if (arguments4 == null || (string13 = arguments4.getString("previous_page_id")) == null) {
                    string13 = "";
                }
                Bundle arguments5 = getArguments();
                if (arguments5 == null || (string14 = arguments5.getString("KEY_EVENT_PARAM")) == null) {
                    string14 = "";
                }
                Bundle arguments6 = getArguments();
                if (arguments6 == null || (string15 = arguments6.getString("enter_from")) == null) {
                    string15 = "";
                }
                Bundle arguments7 = getArguments();
                if (arguments7 != null) {
                    boolValueOf2 = Boolean.valueOf(arguments7.getBoolean("disable_hint_msg"));
                } else {
                    boolValueOf2 = null;
                }
                Bundle arguments8 = getArguments();
                if (arguments8 != null) {
                    string16 = arguments8.getString("theme");
                } else {
                    string16 = null;
                }
                if (!C1948507kB.LIZ(string16)) {
                    str = "default";
                } else {
                    Bundle arguments9 = getArguments();
                    if (arguments9 != null && (string17 = arguments9.getString("theme")) != null) {
                        str = string17;
                    }
                }
                this.LLIZLLLIL = new C1718450uot(c1718680upG, "TTS_BNPL", string13, string14, "", "", string15, boolValueOf2, str, 0);
            }
        } else {
            Bundle arguments10 = getArguments();
            if (arguments10 != null && (string12 = arguments10.getString("pipo_product_code")) != null) {
                str2 = string12;
            }
            Bundle arguments11 = getArguments();
            if (arguments11 == null || (string2 = arguments11.getString("host")) == null) {
                string2 = "";
            }
            Bundle arguments12 = getArguments();
            if (arguments12 == null || (string3 = arguments12.getString("session_id")) == null) {
                string3 = "";
            }
            Bundle arguments13 = getArguments();
            if (arguments13 == null || (string4 = arguments13.getString("merchant_id")) == null) {
                string4 = "";
            }
            Bundle arguments14 = getArguments();
            if (arguments14 == null || (string5 = arguments14.getString("merchant_user_id")) == null) {
                string5 = "";
            }
            C1718680upG c1718680upG2 = new C1718680upG(string2, string3, string4, string5);
            Bundle arguments15 = getArguments();
            if (arguments15 == null || (string6 = arguments15.getString("previous_page_id")) == null) {
                string6 = "";
            }
            Bundle arguments16 = getArguments();
            if (arguments16 == null || (string7 = arguments16.getString("KEY_EVENT_PARAM")) == null) {
                string7 = "";
            }
            Bundle arguments17 = getArguments();
            if (arguments17 == null || (string8 = arguments17.getString("verify_id")) == null) {
                string8 = "";
            }
            Bundle arguments18 = getArguments();
            if (arguments18 == null || (string9 = arguments18.getString("verify_type")) == null) {
                string9 = "";
            }
            Bundle arguments19 = getArguments();
            if (arguments19 == null || (string10 = arguments19.getString("enter_from")) == null) {
                string10 = "";
            }
            Bundle arguments20 = getArguments();
            if (arguments20 != null) {
                boolValueOf = Boolean.valueOf(arguments20.getBoolean("disable_hint_msg"));
            } else {
                boolValueOf = null;
            }
            Bundle arguments21 = getArguments();
            if (arguments21 != null) {
                string11 = arguments21.getString("theme");
            } else {
                string11 = null;
            }
            if (!C1948507kB.LIZ(string11) || ((arguments2 = getArguments()) != null && (string18 = arguments2.getString("theme")) != null)) {
                str = string18;
            }
            if (C1158360gFW.LIZ() && (arguments = getArguments()) != null) {
                i = arguments.getInt("enter_seq", 0);
            } else {
                i = 0;
            }
            this.LLIZLLLIL = new C1718450uot(c1718680upG2, str2, string6, string7, string8, string9, string10, boolValueOf, str, i);
        }
        EventBus.LIZLLL().LJIJJ(this);
        C1715520ukA.LIZIZ(bundle, "PinForgotFragment");
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
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 203), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a.LIZLLL(layoutInflater.getContext());
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ac_, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
