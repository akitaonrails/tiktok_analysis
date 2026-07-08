package com.ss.android.ugc.aweme.live.smoothhost;

import X.AbstractC214814194y;
import X.C01GW;
import X.C09RD;
import X.C09RE;
import X.C0IJT;
import X.C0PEM;
import X.C0TVI;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C1360720lVu;
import X.C1388190mED;
import X.C14K9;
import X.C150X;
import X.C150Y;
import X.C150Z;
import X.C15438062q;
import X.C19EG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C339190DRl;
import X.C446401oU;
import X.C452501pT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C770000UIk;
import X.C786410Ut5;
import X.InterfaceC772190UQv;
import X.InterfaceC782970UnX;
import X.ViewOnTouchListenerC1087080eOY;
import Y.AObserverS233S0100000_31;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.performance.LiveSmoothActivityArchOpt;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveMultiTabRootScene extends AbstractC214814194y {
    public ViewGroup LLJJIJIL;
    public FrameLayout LLJJJ;
    public ViewOnTouchListenerC1087080eOY LLJJJIL;
    public C150Z LLJJJJ;
    public Integer LLJJJJJIL;
    public final int LLJJJJLIIL = (int) C497740JfY.LIZIZ(49);
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 780));

    public LiveMultiTabRootScene() {
        disableSupportRestore();
    }

    @Override // X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        String str;
        super.onDestroyView();
        C150Z c150z = this.LLJJJJ;
        if (c150z != null && (str = c150z.LIZJ) != null) {
            InterfaceC772190UQv.W2.LJFF(str);
        }
        this.LLJJIJIL = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
    }

    public final void LLLLL(boolean z) {
        if (z) {
            ViewOnTouchListenerC1087080eOY viewOnTouchListenerC1087080eOY = this.LLJJJIL;
            if (viewOnTouchListenerC1087080eOY != null && viewOnTouchListenerC1087080eOY.LLILLJJLI.getChildCount() != 0) {
                Iterator<View> it2 = new C09RD(viewOnTouchListenerC1087080eOY.LLILLJJLI).iterator();
                while (true) {
                    C09RE c09re = (C09RE) it2;
                    if (!c09re.hasNext()) {
                        break;
                    } else {
                        C500260Jjc.LLFFF((View) c09re.next());
                    }
                }
            }
            C339190DRl.LIZLLL(this.LLJJJIL);
            return;
        }
        ViewOnTouchListenerC1087080eOY viewOnTouchListenerC1087080eOY2 = this.LLJJJIL;
        if (viewOnTouchListenerC1087080eOY2 != null && viewOnTouchListenerC1087080eOY2.LLILLJJLI.getChildCount() != 0) {
            Iterator<View> it3 = new C09RD(viewOnTouchListenerC1087080eOY2.LLILLJJLI).iterator();
            while (true) {
                C09RE c09re2 = (C09RE) it3;
                if (c09re2.hasNext()) {
                    C500260Jjc.LJIILLIIL((View) c09re2.next());
                } else {
                    return;
                }
            }
        }
    }

    public final void LLLLLIL(Integer num) {
        if (num != null) {
            num.intValue();
            BottomTabManager bottomTabManager = BottomTabManager.LIZ;
            int iIntValue = num.intValue();
            bottomTabManager.getClass();
            String str = null;
            try {
                C150Z c150z = (C150Z) ((ArrayList) BottomTabManager.LIZIZ).get(iIntValue);
                if (c150z != null) {
                    C150Z c150z2 = this.LLJJJJ;
                    if (c150z2 != null) {
                        str = c150z2.LIZJ;
                    }
                    if (Intrinsics.LJFF(str, c150z.LIZJ)) {
                        return;
                    }
                    AwS275S0300000_31 awS275S0300000_31 = new AwS275S0300000_31(this, num, c150z, 24);
                    AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 212);
                    Function2<Function0<Unit>, Function1<? super Boolean, Unit>, Unit> function2 = c150z.LJI;
                    if (function2 == null) {
                        awS275S0300000_31.invoke();
                    } else {
                        if (c150z.LJFF) {
                            return;
                        }
                        c150z.LJFF = true;
                        function2.invoke(new AwS432S0200000_31(c150z, awS275S0300000_31, 53), new AwS397S0200000_31(c150z, awS610S0100000_31, 54));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("require wrong scene, index: ");
                sbLIZ.append(iIntValue);
                sbLIZ.append(", size: ");
                sbLIZ.append(((ArrayList) BottomTabManager.LIZIZ).size());
                C20441214yg.LJ("BottomTabManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        ViewOnTouchListenerC1087080eOY viewOnTouchListenerC1087080eOY;
        super.onActivityCreated(bundle);
        ViewGroup viewGroup = this.LLJJIJIL;
        if (viewGroup != null) {
            viewOnTouchListenerC1087080eOY = (ViewOnTouchListenerC1087080eOY) viewGroup.findViewById(R.id.muc);
        } else {
            viewOnTouchListenerC1087080eOY = null;
        }
        this.LLJJJIL = viewOnTouchListenerC1087080eOY;
        if (viewOnTouchListenerC1087080eOY != null) {
            viewOnTouchListenerC1087080eOY.setPageSwitch((PageSwitch) this.LLJJL.getValue());
        }
        BottomTabManager.LIZ.getClass();
        LLLLLIL(Integer.valueOf(BottomTabManager.LIZJ));
    }

    @Override // X.AbstractC214814194y, X.AnonymousClass1995
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        Window window;
        Map<String, Object> map = C1338270kvh.LIZ;
        Activity activity = this.mActivity;
        if (activity != null && (window = activity.getWindow()) != null && Build.VERSION.SDK_INT >= 26) {
            window.setNavigationBarColor(-16777216);
            C1360720lVu.LIZJ(window, false);
        }
        super.onCreate(bundle);
        OpenLivePreparationTask.LIZ.LIZIZ(this);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C446401oU(null), 2);
        ((PageSwitch) this.LLJJL.getValue()).LL.observe(this, new AObserverS233S0100000_31(this, 16));
    }

    @Override // X.AbstractC214814194y
    public final void onNewIntent(Intent intent) {
        Bundle extras;
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        processNewArguments(extras);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC214814194y
    public final boolean processNewArguments(Bundle bundle) {
        boolean z;
        InterfaceC782970UnX interfaceC782970UnX;
        if (bundle != null) {
            z = bundle.getBoolean("from_intercept_schema");
        } else {
            z = false;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(requireActivity());
        if (z && c19egLIZIZ != 0) {
            List<Scene> sceneList = getSceneList();
            BottomTabManager.LIZ.getClass();
            List<C150Z> list = BottomTabManager.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(((C150Z) it2.next()).LIZIZ);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (sceneList.contains(obj)) {
                    arrayList2.add(obj);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                remove((Scene) it3.next());
            }
            String string = null;
            if ((c19egLIZIZ instanceof InterfaceC782970UnX) && (interfaceC782970UnX = (InterfaceC782970UnX) c19egLIZIZ) != null) {
                interfaceC782970UnX.LLLJIL();
            }
            if (LiveSmoothActivityArchOpt.enable()) {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveCoreInitUtil().LIZJ();
            } else {
                C770000UIk.LIZ();
            }
            BottomTabManager bottomTabManager = BottomTabManager.LIZ;
            C150Y c150y = new C150Y(c19egLIZIZ, null, bundle);
            bottomTabManager.getClass();
            BottomTabManager.LIZIZ(c150y);
            this.LLJJJJ = null;
            this.LLJJJJJIL = null;
            LLLLLIL(Integer.valueOf(BottomTabManager.LIZJ));
            if (bundle != null) {
                try {
                    string = bundle.getString("sourceParams");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return true;
                }
            }
            JSONObject jSONObject = new JSONObject(string);
            if (!TextUtils.isEmpty(jSONObject.optString("request_from"))) {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).notifyCloseAllLynxDialog();
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).againHandlerBundle(jSONObject);
                return true;
            }
            return true;
        }
        return true;
    }

    public final void LLLLJI(C150Z c150z, boolean z) {
        String str;
        if (c150z != null) {
            str = c150z.LIZJ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, C150X.LIVE.getTag())) {
            ((PageSwitch) this.LLJJL.getValue()).LLILLJJLI.setValue(Boolean.valueOf(z));
            if (z) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_entrance_click");
                BottomTabManager.LIZ.getClass();
                c474500IjALIZ.LJJII(BottomTabManager.LJII, "live_entrance_name");
                c474500IjALIZ.LIZ();
                return;
            }
            return;
        }
        Intrinsics.LJFF(str, C150X.STORY.getTag());
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        FrameLayout frameLayout;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dbe, viewGroup, false);
        FrameLayout frameLayout2 = null;
        if (viewTd instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) viewTd;
        } else {
            viewGroup2 = null;
        }
        this.LLJJIJIL = viewGroup2;
        if (viewGroup2 != null) {
            frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.eqx);
        } else {
            frameLayout = null;
        }
        if (frameLayout instanceof FrameLayout) {
            frameLayout2 = frameLayout;
        }
        this.LLJJJ = frameLayout2;
        ViewGroup viewGroup3 = this.LLJJIJIL;
        if (viewGroup3 != null && Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(viewGroup3, new C0TVI() { // from class: X.150a
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    view.setPadding(0, 0, 0, c20246014Ju.LIZ(7).LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        ViewGroup viewGroup4 = this.LLJJIJIL;
        if (viewGroup4 != null) {
            return viewGroup4;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
