package com.ss.android.ugc.aweme.ad.feed.shakeEgg;

import X.AbstractC1024610cln;
import X.C01GW;
import X.C098200Yq;
import X.C0J5E;
import X.C0T8H;
import X.C0WZX;
import X.C1000150c8L;
import X.C1002500cC8;
import X.C1002510cC9;
import X.C1008590cLx;
import X.C1008610cLz;
import X.C1008620cM0;
import X.C1008630cM1;
import X.C1008640cM2;
import X.C1008680cM6;
import X.C1016730cZ5;
import X.C1018060cbE;
import X.C1023960ckk;
import X.C1029690ctz;
import X.C1030680cva;
import X.C1034390d1Z;
import X.C1035740d3k;
import X.C1041070dCL;
import X.C1074310e3x;
import X.C10EU;
import X.C128Y;
import X.C1300690jx5;
import X.C14EU;
import X.C1552050qUV;
import X.C189200o6;
import X.C199Y;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20629915o1;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C356901a3;
import X.C452501pT;
import X.C622680Oba;
import X.C7815033l;
import X.C786410Ut5;
import X.C838130WuJ;
import X.C988570bpf;
import X.C988590bph;
import X.C989100bqW;
import X.C989110bqX;
import X.EnumC1008600cLy;
import X.EnumC1027220cq0;
import X.InterfaceC1000280c8Y;
import X.InterfaceC1008660cM4;
import X.InterfaceC1008670cM5;
import X.InterfaceC1034470d1h;
import X.InterfaceC20622815ms;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS17S0210000_16;
import android.app.Dialog;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public final class ShakeEgg implements InterfaceC1008660cM4, SensorEventListener, DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJL = 0;
    public final C19EG LL;
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public ShakeEggVM LLILLL;
    public Hox LLILZ;
    public C989110bqX LLILZIL;
    public final List<String> LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJI;
    public Fragment LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final Fragment LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public float LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final C1008590cLx LLJJLIIIJLLLLLLLZ;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final C0T8H LIZ() {
        return (C0T8H) this.LLJJ.getValue();
    }

    public final void LIZLLL() {
        String aid;
        String aid2;
        InterfaceC1034470d1h interfaceC1034470d1h;
        if (((View) this.LLJILLL.getValue()).getVisibility() != 8) {
            C786410Ut5.LJZ(8, (FrameLayout) this.LLJILLL.getValue());
            C1008680cM6 c1008680cM6 = C1008680cM6.LIZ;
            C128Y c128y = this.LLJJIII;
            c1008680cM6.getClass();
            if (c128y != null && (c128y instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h = (InterfaceC1034470d1h) c128y) != null) {
                interfaceC1034470d1h.LLLIL(null);
            }
            ShakeEggVM shakeEggVM = this.LLILLL;
            (shakeEggVM == null ? null : shakeEggVM).LLILLL = false;
            if (shakeEggVM == null) {
                shakeEggVM = null;
            }
            Aweme value = shakeEggVM.LL.getValue();
            if (value != null && (aid2 = value.getAid()) != null) {
                shakeEggVM.LLJJIII.setValue(aid2);
            }
            InterfaceC1008670cM5 interfaceC1008670cM5 = (InterfaceC1008670cM5) this.LLJJJIL.getValue();
            if (interfaceC1008670cM5 != null) {
                interfaceC1008670cM5.enable(false);
            }
            ShakeEggVM shakeEggVM2 = this.LLILLL;
            ShakeEggVM shakeEggVM3 = shakeEggVM2 != null ? shakeEggVM2 : null;
            Aweme value2 = shakeEggVM3.LL.getValue();
            if (value2 == null || (aid = value2.getAid()) == null) {
                return;
            }
            shakeEggVM3.LLJJ.setValue(aid);
        }
    }

    public final void LJ() {
        if (this.LLILLJJLI.compareAndSet(false, true)) {
            if (!C622680Oba.LIZ(this)) {
                C622680Oba.LIZJ(this);
            }
            this.LLILLL = C1074310e3x.LIZ(this.LL);
            this.LLILZ = Hox.LLJILJIL.LIZ(this.LL);
            ShakeEggVM shakeEggVM = this.LLILLL;
            if (shakeEggVM == null) {
                shakeEggVM = null;
            }
            shakeEggVM.LL.observe(this.LL, new Observer() { // from class: X.0c7S
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) throws JSONException {
                    String nativeSiteCustomData;
                    NativeSiteConfig nativeSiteConfig;
                    String str;
                    Aweme aweme = (Aweme) obj;
                    ShakeEgg shakeEgg = this.LL;
                    shakeEgg.getClass();
                    Bundle bundle = new Bundle();
                    InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
                    if (interfaceC1000280c8YLIZ != null) {
                        interfaceC1000280c8YLIZ.LJIJJ(shakeEgg.LL, bundle, aweme);
                    }
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    ShakeEggVM shakeEggVM2 = null;
                    if (awemeRawAd != null) {
                        nativeSiteCustomData = awemeRawAd.getNativeSiteCustomData();
                    } else {
                        nativeSiteCustomData = null;
                    }
                    C786410Ut5.LJJJI("bundle_native_site_custom_data", nativeSiteCustomData, bundle);
                    ShakeEggVM shakeEggVM3 = shakeEgg.LLILLL;
                    if (shakeEggVM3 == null) {
                        shakeEggVM3 = null;
                    }
                    shakeEggVM3.LLILZ = bundle;
                    n nVarLIZ = C999590c7R.LIZ(shakeEgg.LL, aweme);
                    C1016730cZ5 c1016730cZ5 = C1016730cZ5.LIZIZ;
                    nVarLIZ.LJJIIJ("shake_data", c1016730cZ5.LIZLLL(c1016730cZ5.LIZIZ(aweme), shakeEgg.LL));
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null && (nativeSiteConfig = awemeRawAd2.getNativeSiteConfig()) != null && (str = nativeSiteConfig.lynxScheme) != null) {
                        nVarLIZ.LJJIIJ("lynxSchema", str);
                    }
                    ShakeEggVM shakeEggVM4 = shakeEgg.LLILLL;
                    if (shakeEggVM4 != null) {
                        shakeEggVM2 = shakeEggVM4;
                    }
                    shakeEggVM2.LLILZIL = nVarLIZ.toString();
                    this.LL.LIZ().setAweme(aweme);
                    this.LL.LJII(aweme, true);
                }
            });
            ShakeEggVM shakeEggVM2 = this.LLILLL;
            (shakeEggVM2 != null ? shakeEggVM2 : null).LLJI.observe(this.LL, new Observer() { // from class: X.0bqY
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) throws JSONException {
                    ShakeEggVM shakeEggVM3;
                    Aweme aweme = (Aweme) obj;
                    ShakeModel shakeModelLIZIZ = C1016730cZ5.LIZIZ.LIZIZ(aweme);
                    if (shakeModelLIZIZ != null) {
                        ShakeEgg shakeEgg = this.LL;
                        shakeEgg.LLJILJIL = 0;
                        ShakeEggVM shakeEggVM4 = shakeEgg.LLILLL;
                        ShakeEggVM shakeEggVM5 = null;
                        if (shakeEggVM4 == null) {
                            shakeEggVM3 = null;
                        } else {
                            shakeEggVM3 = shakeEggVM4;
                        }
                        shakeEggVM3.LLILLJJLI = true;
                        shakeEgg.LLJI = true;
                        shakeEgg.LLJIJIL = true;
                        if (shakeEggVM4 == null) {
                            shakeEggVM4 = null;
                        }
                        Aweme value = shakeEggVM4.LL.getValue();
                        if (value != null) {
                            ShakeEgg shakeEgg2 = this.LL;
                            if (!Intrinsics.LJFF(value.getAid(), aweme.getAid())) {
                                ShakeEggVM shakeEggVM6 = shakeEgg2.LLILLL;
                                if (shakeEggVM6 != null) {
                                    shakeEggVM5 = shakeEggVM6;
                                }
                                shakeEggVM5.LL.setValue(aweme);
                            } else if (shakeEgg2.LLIZ && shakeEgg2.LLIZLLLIL) {
                                if (!shakeModelLIZIZ.shaken && shakeEgg2.LLJ) {
                                    ShakeEggVM shakeEggVM7 = shakeEgg2.LLILLL;
                                    if (shakeEggVM7 != null) {
                                        shakeEggVM5 = shakeEggVM7;
                                    }
                                    shakeEggVM5.LL.setValue(aweme);
                                }
                            } else {
                                shakeEgg2.LJII(value, false);
                            }
                        } else {
                            ShakeEggVM shakeEggVM8 = this.LL.LLILLL;
                            if (shakeEggVM8 != null) {
                                shakeEggVM5 = shakeEggVM8;
                            }
                            shakeEggVM5.LL.setValue(aweme);
                        }
                        this.LL.LJIIJ(EnumC1008600cLy.SELECT);
                    }
                }
            });
        }
    }

    public final boolean LJFF() {
        Dialog dialog;
        ShakeEggVM shakeEggVM = this.LLILLL;
        if (shakeEggVM == null) {
            shakeEggVM = null;
        }
        if (shakeEggVM.LLILLL || (!this.LLILZLL.isEmpty())) {
            return true;
        }
        List<Fragment> listLJJLIIIJL = this.LL.getSupportFragmentManager().LJJLIIIJL();
        if (!listLJJLIIIJL.isEmpty()) {
            for (Fragment fragment : listLJJLIIIJL) {
                if ((fragment instanceof DialogFragment) && (dialog = ((DialogFragment) fragment).getDialog()) != null && dialog.isShowing()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJIIL() {
        String str;
        ShakeEggVM shakeEggVM = this.LLILLL;
        if (shakeEggVM == null) {
            shakeEggVM = null;
        }
        Aweme value = shakeEggVM.LL.getValue();
        if (value == null) {
            return;
        }
        if (this.LLJIJIL) {
            LJIIJ(EnumC1008600cLy.SHOW);
            this.LLJIJIL = false;
        }
        if (!this.LLIZ) {
            str = "data_load_fail";
        } else if (!this.LLIZLLLIL) {
            str = "load_timeout";
        } else {
            if (this.LLJJIJIIJIL.getValue() != null) {
                C1016730cZ5 c1016730cZ5 = C1016730cZ5.LIZIZ;
                ShakeEggVM shakeEggVM2 = this.LLILLL;
                if (shakeEggVM2 == null) {
                    shakeEggVM2 = null;
                }
                if (!c1016730cZ5.LIZ(shakeEggVM2.LL.getValue()) || !LJI(false) || LJFF() || LIZ().getVisibility() == 0) {
                    return;
                }
                C786410Ut5.d(LIZ(), 0);
                if (this.LLJI) {
                    ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
                    C1018060cbE.LIZ.getClass();
                    C1023960ckk c1023960ckk = C1018060cbE.LJIJI;
                    ShakeEggVM shakeEggVM3 = this.LLILLL;
                    if (shakeEggVM3 == null) {
                        shakeEggVM3 = null;
                    }
                    Aweme value2 = shakeEggVM3.LL.getValue();
                    iTopViewAdEventLoggerLJJIIZ.logAd(c1023960ckk, value2 != null ? value2.getAwemeRawAd() : null);
                    this.LLJI = false;
                }
                LJIIJJI(false);
                if (this.LLJJJJLIIL) {
                    return;
                }
                try {
                    SensorManager sensorManager = (SensorManager) this.LLJJIJIIJIL.getValue();
                    if (sensorManager != null) {
                        SensorManager sensorManager2 = (SensorManager) this.LLJJIJIIJIL.getValue();
                        C1300690jx5.LIZJ(sensorManager, this, sensorManager2 != null ? C2204961BRm.LJJL(sensorManager2, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusLZnL2TZRf0EUS6eAa4negw3vbxOb/fc=", null)) : null, 2, CertProviderManagerKt.findCert("bpea-commerce_shake_egg_register_sensor", 1476415492));
                    }
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.LLJJJJLIIL = true;
                return;
            }
            str = "shake_fail";
        }
        ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ2 = TopViewAdEventLogger.LJJIIZ();
        C1018060cbE.LIZ.getClass();
        iTopViewAdEventLoggerLJJIIZ2.logAd(C1018060cbE.LJIJ, value.getAwemeRawAd(), new AwS67S1000000_16(str, 8));
    }

    public final void LJIILIIL() {
        try {
            SensorManager sensorManager = (SensorManager) this.LLJJIJIIJIL.getValue();
            if (sensorManager != null) {
                C1300690jx5.LJ(sensorManager, this, CertProviderManagerKt.findCert("bpea-commerce_shake_egg_unregister_sensor", 1476415492));
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJJJJLIIL = false;
    }

    public final void LIZIZ() {
        C786410Ut5.d(LIZ(), 8);
        InterfaceC1008670cM5 interfaceC1008670cM5 = (InterfaceC1008670cM5) this.LLJJJ.getValue();
        if (interfaceC1008670cM5 != null) {
            interfaceC1008670cM5.enable(false);
        }
        LJIIJJI(false);
    }

    public final void LIZJ() {
        if (LIZ().getVisibility() != 8) {
            C786410Ut5.d(LIZ(), 8);
            ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
            C1018060cbE.LIZ.getClass();
            C1023960ckk c1023960ckk = C1018060cbE.LJIJJ;
            ShakeEggVM shakeEggVM = this.LLILLL;
            if (shakeEggVM == null) {
                shakeEggVM = null;
            }
            Aweme value = shakeEggVM.LL.getValue();
            iTopViewAdEventLoggerLJJIIZ.logAd(c1023960ckk, value != null ? value.getAwemeRawAd() : null);
        }
    }

    public final void LJIILJJIL() {
        LIZLLL();
        LIZJ();
        LIZIZ();
        LJIILIIL();
        ((ArrayList) this.LLILZLL).clear();
        C1016730cZ5 c1016730cZ5 = C1016730cZ5.LIZIZ;
        ShakeEggVM shakeEggVM = this.LLILLL;
        if (shakeEggVM == null) {
            shakeEggVM = null;
        }
        if (!c1016730cZ5.LIZ(shakeEggVM.LL.getValue())) {
            LJIIIZ(true);
        }
        ShakeEggVM shakeEggVM2 = this.LLILLL;
        (shakeEggVM2 != null ? shakeEggVM2 : null).LLILLJJLI = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0cLx] */
    public ShakeEgg(C19GS c19gs) {
        Object objLIZ;
        this.LL = c19gs;
        Fragment fragment = null;
        IMainSAFLifecycleKt.requireMainSAFLifecycle(c19gs, null, false).getLifecycle().addObserver(this);
        this.LLILZLL = new ArrayList();
        this.LLJILJILJ = C452501pT.LIZIZ(new C989100bqW(this));
        this.LLJILLL = C452501pT.LIZIZ(new C1008630cM1(this));
        this.LLJJ = C452501pT.LIZIZ(new C1008640cM2(this));
        this.LLJJIJI = C452501pT.LIZIZ(new C1008620cM0(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1008610cLz(this));
        if ((c19gs instanceof C199Y) && (objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) c19gs)) != null && (objLIZ instanceof C0J5E)) {
            fragment = (Fragment) objLIZ;
        }
        this.LLJJIJIL = fragment;
        this.LLJJJ = C452501pT.LIZIZ(new C1002510cC9(this));
        this.LLJJJIL = C452501pT.LIZIZ(new C1002500cC8(this));
        this.LLJJLIIIJLLLLLLLZ = new AbstractC1024610cln() { // from class: X.0cLx
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                ShakeEgg shakeEgg = this.LL;
                if (shakeEgg.LLJJL) {
                    shakeEgg.LLIZ = true;
                    shakeEgg.LJIIJ(EnumC1008600cLy.LOAD_SUCCESS);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                this.LL.LJIIIZ(false);
                ShakeEgg shakeEgg = this.LL;
                shakeEgg.LLJJL = true;
                shakeEgg.LJIIJ(EnumC1008600cLy.LOAD_START);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
                this.LL.LJIIIZ(false);
                ShakeEgg shakeEgg = this.LL;
                shakeEgg.LLJJL = false;
                shakeEgg.LJIIJ(EnumC1008600cLy.LOAD_FAIL);
            }
        };
    }

    public final boolean LJI(boolean z) {
        ShakeEggVM shakeEggVM = this.LLILLL;
        Hox hox = null;
        if (shakeEggVM == null) {
            shakeEggVM = null;
        }
        if (!shakeEggVM.LLILLJJLI) {
            return false;
        }
        Hox hox2 = this.LLILZ;
        if (hox2 != null) {
            hox = hox2;
        }
        if (!hox.KQ2("For You")) {
            return false;
        }
        if (!z && this.LL.getLifecycle().getCurrentState() != Lifecycle.State.RESUMED) {
            return false;
        }
        return true;
    }

    public final void LJIIIZ(boolean z) {
        ViewGroup viewGroup;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        if (z) {
            ShakeEggVM shakeEggVM = this.LLILLL;
            if (shakeEggVM == null) {
                shakeEggVM = null;
            }
            shakeEggVM.LLILZLL = false;
            Fragment fragment = this.LLJJIII;
            if (fragment != null) {
                C19EH c19ehLJIIJ = this.LL.getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIIZILJ(fragment);
                c19ehLJIIJ.LJIIJ();
            }
            this.LLJJIII = null;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
                }
            }
            this.LLJJI = null;
        }
    }

    public final void LJIIJ(EnumC1008600cLy enumC1008600cLy) {
        ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
        C1018060cbE.LIZ.getClass();
        C1023960ckk c1023960ckk = C1018060cbE.LJIL;
        ShakeEggVM shakeEggVM = this.LLILLL;
        AwemeRawAd awemeRawAd = null;
        if (shakeEggVM == null) {
            shakeEggVM = null;
        }
        Aweme value = shakeEggVM.LL.getValue();
        if (value != null) {
            awemeRawAd = value.getAwemeRawAd();
        }
        iTopViewAdEventLoggerLJJIIZ.logAd(c1023960ckk, awemeRawAd, new AwS595S0100000_16(enumC1008600cLy, 62));
    }

    public final void LJIIJJI(boolean z) {
        C0T8H c0t8hLIZ = LIZ();
        if (z) {
            c0t8hLIZ.setTouchToGone(false);
            c0t8hLIZ.setClickable(true);
            c0t8hLIZ.setEnabled(true);
        } else {
            c0t8hLIZ.setTouchToGone(true);
            c0t8hLIZ.setClickable(false);
            c0t8hLIZ.setEnabled(false);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        LJ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C989110bqX c989110bqX;
        C356901a3.LIZIZ(this, lifecycleOwner);
        if (((Boolean) C1034390d1Z.LIZLLL.getValue()).booleanValue()) {
            Hox hox = this.LLILZ;
            if (hox != null && (c989110bqX = this.LLILZIL) != null) {
                hox.PQ2("For You", c989110bqX);
                this.LLILZIL = null;
            }
            LJIILIIL();
        }
        if (C622680Oba.LIZ(this)) {
            C622680Oba.LIZLLL(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010e A[PHI: r4
      0x010e: PHI (r4v1 float) = (r4v0 float), (r4v3 float) binds: [B:70:0x010a, B:26:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r15) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
        LJ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void shakeJsb(C7815033l c7815033l) {
        Object c098200Yq;
        InterfaceC1034470d1h interfaceC1034470d1h;
        Object objOpt = c7815033l.LIZ.opt("key");
        if (objOpt == null) {
            return;
        }
        if (Intrinsics.LJFF(objOpt, "shake_eggs_lynx_ready")) {
            LJIIJ(EnumC1008600cLy.LYNX_READY);
            this.LLIZLLLIL = true;
            return;
        }
        ShakeEggVM shakeEggVM = null;
        if (Intrinsics.LJFF(objOpt, "shake_eggs_startPlay")) {
            long jOptLong = c7815033l.LIZ.optLong("stayTime");
            LJIIJ(EnumC1008600cLy.START_PLAY);
            C1016730cZ5 c1016730cZ5 = C1016730cZ5.LIZIZ;
            ShakeEggVM shakeEggVM2 = this.LLILLL;
            if (shakeEggVM2 == null) {
                shakeEggVM2 = null;
            }
            if (!c1016730cZ5.LIZ(shakeEggVM2.LL.getValue())) {
                return;
            }
            LJIILIIL();
            ShakeEggVM shakeEggVM3 = this.LLILLL;
            if (shakeEggVM3 != null) {
                shakeEggVM = shakeEggVM3;
            }
            ShakeModel shakeModelLIZIZ = c1016730cZ5.LIZIZ(shakeEggVM.LL.getValue());
            if (shakeModelLIZIZ != null) {
                shakeModelLIZIZ.setShaken(true);
            }
            this.LLJ = true;
            if (!LJI(true) || jOptLong == 0) {
                return;
            }
            C0T8H c0t8hLIZ = LIZ();
            LJIIJJI(true);
            C786410Ut5.d(c0t8hLIZ, 0);
            InterfaceC1008670cM5 interfaceC1008670cM5 = (InterfaceC1008670cM5) this.LLJJJ.getValue();
            if (interfaceC1008670cM5 != null) {
                interfaceC1008670cM5.enable(true);
            }
            C786410Ut5.LJLIIL(jOptLong, new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(this, 135));
            return;
        }
        if (Intrinsics.LJFF(objOpt, "shake_eggs_lynx_finish")) {
            LJIIJ(EnumC1008600cLy.LYNX_FINISH);
            LIZIZ();
            return;
        }
        if (!Intrinsics.LJFF(objOpt, "shake_eggs_openlandingpage") || !LJI(true)) {
            return;
        }
        LJIIJ(EnumC1008600cLy.OPEN_LANDINGPAGE);
        try {
            c098200Yq = c7815033l.LIZ.optString("web_url");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str == null) {
            return;
        }
        C1008680cM6 c1008680cM6 = C1008680cM6.LIZ;
        C128Y c128y = this.LLJJIII;
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 62);
        c1008680cM6.getClass();
        if (c128y == null) {
            return;
        }
        awS560S0100000_16.invoke();
        if (!(c128y instanceof InterfaceC1034470d1h) || (interfaceC1034470d1h = (InterfaceC1034470d1h) c128y) == null) {
            return;
        }
        interfaceC1034470d1h.LJJ(str);
    }

    public final void LJII(Aweme aweme, boolean z) throws JSONException {
        List<String> list;
        String strK0;
        LIZJ();
        LJIIIZ(false);
        LJIIJ(EnumC1008600cLy.CHECK_GECKO_START);
        ShakeModel shakeModelLIZIZ = C1016730cZ5.LIZIZ.LIZIZ(aweme);
        if (shakeModelLIZIZ != null && (list = shakeModelLIZIZ.geckoChannel) != null) {
            for (String str : list) {
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZIZ() != null) {
                    IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                    if (iAdLandPagePreloadService != null) {
                        strK0 = iAdLandPagePreloadService.K0("lynx_feed");
                    } else {
                        strK0 = null;
                    }
                    if (!C1552050qUV.LIZIZ(strK0, str)) {
                        return;
                    }
                }
            }
            LJIIJ(EnumC1008600cLy.CHECK_GECKO_SUCCESS);
            if (ShakeEggSetting.LIZ().loadDelay == 0) {
                LJIIIIZZ(aweme, z, this);
            } else if (C1030680cva.LJIILIIL(aweme)) {
                C786410Ut5.LJLIIL(ShakeEggSetting.LIZ().loadDelay, new BPEAHandler(Looper.getMainLooper()), new ARunnableS17S0210000_16(aweme, z, this, 1));
            } else {
                LJIIIIZZ(aweme, z, this);
            }
        }
    }

    public static final void LJIIIIZZ(Aweme aweme, boolean z, ShakeEgg shakeEgg) throws JSONException {
        String webUrl;
        ShakeModel shakeModel;
        String str;
        String strK0;
        Fragment fragmentFv;
        String webUrl2;
        String webTitle;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        ShakeEggVM shakeEggVM = null;
        if (awemeRawAd != null) {
            webUrl = awemeRawAd.getWebUrl();
        } else {
            webUrl = null;
        }
        if (webUrl != null && (z || shakeEgg.LLJJIII == null)) {
            shakeEgg.getClass();
            C1008680cM6 c1008680cM6 = C1008680cM6.LIZ;
            C19EG c19eg = shakeEgg.LL;
            ShakeEggVM shakeEggVM2 = shakeEgg.LLILLL;
            if (shakeEggVM2 == null) {
                shakeEggVM2 = null;
            }
            Aweme value = shakeEggVM2.LL.getValue();
            ShakeEggVM shakeEggVM3 = shakeEgg.LLILLL;
            AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(shakeEgg, 715);
            c1008680cM6.getClass();
            if (value != null && AwemeExtKt.isAdTraffic(value)) {
                AwemeRawAd awemeRawAd2 = value.getAwemeRawAd();
                String str2 = "";
                if (awemeRawAd2 == null || (webUrl2 = awemeRawAd2.getWebUrl()) == null) {
                    webUrl2 = "";
                }
                AwemeRawAd awemeRawAd3 = value.getAwemeRawAd();
                if (awemeRawAd3 != null && (webTitle = awemeRawAd3.getWebTitle()) != null) {
                    str2 = webTitle;
                }
                String aid = value.getAid();
                String authorUid = AwemeExtKt.getAuthorUid(value);
                String requestId = value.getRequestId();
                UrlModel urlModelLIZLLL = C10EU.LIZLLL(value.getAuthor());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append('-');
                sbLIZ.append(UUID.randomUUID());
                fragmentFv = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).fv(c19eg, value, new C1035740d3k(webUrl2, 1, str2, "feedad", "draw_ad_egg", true, "click", false, 0, C2188811AlT.LIZIZ(sbLIZ), false, false, aid, authorUid, requestId, urlModelLIZLLL, false, null, null, null), EnumC1027220cq0.SHAKE_EGG, new ARunnableS109S0100000_9(awS560S0100000_16, 148));
            } else {
                fragmentFv = null;
            }
            shakeEgg.LLJJIII = fragmentFv;
            if (fragmentFv != null) {
                C19EH c19ehLJIIJ = shakeEgg.LL.getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(((View) shakeEgg.LLJILLL.getValue()).getId(), fragmentFv, null);
                c19ehLJIIJ.LJIIJ();
            }
            ShakeEggVM shakeEggVM4 = shakeEgg.LLILLL;
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null && (shakeModel = awemeRawAd4.getShakeModel()) != null && (str = shakeModel.lynxUrl) != null) {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            ShakeEggVM shakeEggVM5 = shakeEgg.LLILLL;
            if (shakeEggVM5 == null) {
                shakeEggVM5 = null;
            }
            builderBuildUpon.appendQueryParameter("initialData", shakeEggVM5.LLILZIL);
            InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
            if (interfaceC1000280c8YLIZ != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = shakeEgg.LLJJI;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) C786410Ut5.Td(shakeEgg.LL.getLayoutInflater(), R.layout.d4t, shakeEgg.LIZ(), true).findViewById(R.id.hun);
                }
                shakeEgg.LLJJI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                ShakeEggVM shakeEggVM6 = shakeEgg.LLILLL;
                if (shakeEggVM6 == null) {
                    shakeEggVM6 = null;
                }
                shakeEggVM6.LLILZLL = true;
                IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                if (iAdLandPagePreloadService != null) {
                    strK0 = iAdLandPagePreloadService.K0("lynx_feed");
                } else {
                    strK0 = null;
                }
                C1029690ctz c1029690ctzLJJIIJZLJL = interfaceC1000280c8YLIZ.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, strK0, shakeEgg.LLJJLIIIJLLLLLLLZ);
                if (c1029690ctzLJJIIJZLJL != null) {
                    String string = builderBuildUpon.toString();
                    ShakeEggVM shakeEggVM7 = shakeEgg.LLILLL;
                    if (shakeEggVM7 != null) {
                        shakeEggVM = shakeEggVM7;
                    }
                    c1029690ctzLJJIIJZLJL.LIZ(shakeEggVM.LLILZ, string, C1000150c8L.LIZ().enableShakeEgg);
                }
            }
        }
    }
}
