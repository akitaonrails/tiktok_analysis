package debugtool;

import X.C1098510egz;
import X.C1133970fcB;
import X.C187900nt;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473970IiJ;
import X.C473990IiL;
import X.C786410Ut5;
import X.EnumC1100810ekh;
import X.InterfaceC1095340ebs;
import X.InterfaceC1125460fOS;
import X.InterfaceC2203131BKl;
import X.InterfaceC473980IiK;
import Y.AObjectS360S0100000_17;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.livesdk.dataChannel.LiveFragmentVisibility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes18.dex */
public class DebugToolsHelper implements GenericLifecycleObserver {
    public final DataChannel LL;
    public final Context LLILLJJLI;
    public InterfaceC1125460fOS LLILLL;
    public final EnumC1100810ekh LLILZ;
    public C473990IiL LLILZIL;
    public final AtomicBoolean LLILZLL = new AtomicBoolean(false);

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    public final void LIZIZ() {
        if (this.LLILZLL.compareAndSet(false, true)) {
            LifecycleOwner lifecycleOwner = this.LL.LLILZ;
            if (lifecycleOwner != null) {
                try {
                    lifecycleOwner.getLifecycle().removeObserver(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            InterfaceC1125460fOS interfaceC1125460fOS = this.LLILLL;
            if (interfaceC1125460fOS != null) {
                interfaceC1125460fOS.LIZLLL();
                this.LLILLL = null;
            }
            this.LLILZIL = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0IiL] */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        InterfaceC1125460fOS interfaceC1125460fOS;
        boolean z;
        InterfaceC1125460fOS interfaceC1125460fOS2 = this.LLILLL;
        if (interfaceC1125460fOS2 != null) {
            interfaceC1125460fOS2.LIZLLL();
        }
        try {
            interfaceC1125460fOS = (InterfaceC1125460fOS) Class.forName("com.bytedance.android.livesdk.gift.debugservice.DebugToolInitServiceManager").getConstructor(Context.class, EnumC1100810ekh.class).newInstance(this.LLILLJJLI, this.LLILZ);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createDebugService. exception=");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("DebugToolsHelper", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1125460fOS = null;
        }
        this.LLILLL = interfaceC1125460fOS;
        if (interfaceC1125460fOS != null) {
            z = true;
            if (interfaceC1125460fOS.LJIJI()) {
                InterfaceC1125460fOS interfaceC1125460fOS3 = this.LLILLL;
                LIZ(interfaceC1125460fOS3, this.LLILLJJLI, this.LL);
                interfaceC1125460fOS3.LJIJ();
                final InterfaceC473980IiK interfaceC473980IiKLIZJ = interfaceC1125460fOS3.LIZJ();
                if (interfaceC473980IiKLIZJ != null) {
                    this.LLILZIL = new InterfaceC2203131BKl(interfaceC473980IiKLIZJ) { // from class: X.0IiL
                        public final InterfaceC473980IiK LIZ;

                        {
                            this.LIZ = interfaceC473980IiKLIZJ;
                        }

                        @Override // X.InterfaceC2203131BKl
                        public final void LIZ(String str, String str2, String str3, String str4) {
                            InterfaceC473980IiK interfaceC473980IiK = this.LIZ;
                            if (interfaceC473980IiK != null) {
                                ((C473970IiJ) interfaceC473980IiK).LIZ(str, str2, str4, "", true);
                            }
                        }

                        @Override // X.InterfaceC2203131BKl
                        public final void LIZIZ(String str, String str2, String str3, String str4, String str5) {
                            InterfaceC473980IiK interfaceC473980IiK = this.LIZ;
                            if (interfaceC473980IiK != null) {
                                ((C473970IiJ) interfaceC473980IiK).LIZ(str, str2, str4, str5, false);
                            }
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            z = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onCreate. init failed. serviceNotNull=");
        sbLIZ2.append(z);
        sbLIZ2.append("; enable=false");
        C20441214yg.LJ("DebugToolsHelper", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        InterfaceC1125460fOS interfaceC1125460fOS = this.LLILLL;
        if (interfaceC1125460fOS != null) {
            interfaceC1125460fOS.onPause();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        InterfaceC1125460fOS interfaceC1125460fOS = this.LLILLL;
        if (interfaceC1125460fOS != null) {
            interfaceC1125460fOS.onResume();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LIZIZ();
    }

    public DebugToolsHelper(Context context, DataChannel dataChannel, EnumC1100810ekh enumC1100810ekh) {
        this.LLILLJJLI = context;
        this.LL = dataChannel;
        this.LLILZ = enumC1100810ekh;
        LifecycleOwner lifecycleOwner = dataChannel.LLILZ;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        dataChannel.EQ2(dataChannel.LLILZ, LiveFragmentVisibility.class, new AObjectS360S0100000_17(this, 154));
    }

    public static void LIZ(InterfaceC1125460fOS interfaceC1125460fOS, final Context context, final DataChannel dataChannel) {
        C786410Ut5.N3(context);
        interfaceC1125460fOS.LJIILJJIL();
        new Object() { // from class: X.0ImA
            public final C01GW LIZ = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(340));
        };
        interfaceC1125460fOS.LIZ();
        new C1133970fcB(context, dataChannel);
        interfaceC1125460fOS.LJIIIZ();
        interfaceC1125460fOS.LJIIL();
        interfaceC1125460fOS.LJIIIIZZ();
        new InterfaceC1095340ebs(context, dataChannel) { // from class: X.0fOR
            public InterfaceC1125480fOU LIZ;
            public InterfaceC781630UlN LIZIZ;

            {
                ISlotService iSlotService;
                IGiftService iGiftService;
                if (this.LIZ == null && (iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class)) != null) {
                    this.LIZ = iGiftService.createGiftDebugService(context, dataChannel);
                }
                if (this.LIZIZ == null && (iSlotService = (ISlotService) C1161920gLG.LIZJ(ISlotService.class)) != null) {
                    this.LIZIZ = iSlotService.createGiftDebugService(context, dataChannel);
                }
            }
        };
        interfaceC1125460fOS.LJIIJ();
        new C187900nt(context, dataChannel);
        interfaceC1125460fOS.LJIILIIL();
        new InterfaceC1095340ebs(context, dataChannel) { // from class: X.0fOR
            public InterfaceC1125480fOU LIZ;
            public InterfaceC781630UlN LIZIZ;

            {
                ISlotService iSlotService;
                IGiftService iGiftService;
                if (this.LIZ == null && (iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class)) != null) {
                    this.LIZ = iGiftService.createGiftDebugService(context, dataChannel);
                }
                if (this.LIZIZ == null && (iSlotService = (ISlotService) C1161920gLG.LIZJ(ISlotService.class)) != null) {
                    this.LIZIZ = iSlotService.createGiftDebugService(context, dataChannel);
                }
            }
        };
        interfaceC1125460fOS.LJIILL();
        new C473970IiJ(context);
        interfaceC1125460fOS.LJIILLIIL();
        interfaceC1125460fOS.LJFF();
        interfaceC1125460fOS.LJIIJJI();
        interfaceC1125460fOS.LIZIZ();
        new C1098510egz();
        interfaceC1125460fOS.LJI();
    }
}
