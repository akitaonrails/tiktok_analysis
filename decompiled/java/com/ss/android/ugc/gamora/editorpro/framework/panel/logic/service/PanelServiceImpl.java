package com.ss.android.ugc.gamora.editorpro.framework.panel.logic.service;

import X.C01GW;
import X.C04TD;
import X.C0E48;
import X.C0EB6;
import X.C0ERB;
import X.C0ESK;
import X.C0ESL;
import X.C0EST;
import X.C0ESU;
import X.C0ESV;
import X.C0ET8;
import X.C0ETW;
import X.C0EUC;
import X.C0EUF;
import X.C1664600tQ2;
import X.C19A3;
import X.C1DRG;
import X.C362630EJp;
import X.C364510EQv;
import X.C364870ESf;
import X.C364890ESh;
import X.C364930ESl;
import X.C364990ESr;
import X.C365300ETw;
import X.C373040Eju;
import X.C375900EoW;
import X.C375920EoY;
import X.C376260Ep6;
import X.C452501pT;
import X.InterfaceC375870EoT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.adjust.ui.SoundAdjustRootScene;
import com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.CutoutRootScene;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.VideoAdjustRootScene;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.VideoCropCanvasRootScene;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.trim.SmartTrimRootScene;
import com.ss.android.ugc.gamora.editorpro.framework.panel.api.IPanelService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class PanelServiceImpl implements IPanelService {
    public static final int $stable = 8;
    public Map<Object, Function0<InterfaceC375870EoT>> factoryMap = new LinkedHashMap();
    public final C01GW hasRegisteredPanel$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(732));

    private final AtomicBoolean getHasRegisteredPanel() {
        return (AtomicBoolean) this.hasRegisteredPanel$delegate.getValue();
    }

    private final void registerPanel() {
        if (getHasRegisteredPanel().get()) {
            return;
        }
        synchronized (this.factoryMap) {
            try {
                if (getHasRegisteredPanel().get()) {
                    return;
                }
                this.factoryMap.put(SoundAdjustRootScene.class, AFwS191S0000000_5.get$arr$(249));
                this.factoryMap.put(SmartTrimRootScene.class, AFwS191S0000000_5.get$arr$(257));
                this.factoryMap.put(VideoAdjustRootScene.class, AFwS191S0000000_5.get$arr$(258));
                this.factoryMap.put(VideoCropCanvasRootScene.class, AFwS191S0000000_5.get$arr$(259));
                this.factoryMap.put(C373040Eju.class, AFwS191S0000000_5.get$arr$(260));
                this.factoryMap.put(C364890ESh.class, AFwS191S0000000_5.get$arr$(261));
                this.factoryMap.put(C364510EQv.class, AFwS191S0000000_5.get$arr$(262));
                this.factoryMap.put(CutoutRootScene.class, AFwS191S0000000_5.get$arr$(237));
                this.factoryMap.put(C362630EJp.class, AFwS191S0000000_5.get$arr$(238));
                this.factoryMap.put(C0ERB.class, AFwS191S0000000_5.get$arr$(239));
                this.factoryMap.put(C364870ESf.class, AFwS191S0000000_5.get$arr$(240));
                this.factoryMap.put(C0ESV.class, AFwS191S0000000_5.get$arr$(241));
                this.factoryMap.put(C364930ESl.class, AFwS191S0000000_5.get$arr$(242));
                this.factoryMap.put(C0EUC.class, AFwS191S0000000_5.get$arr$(243));
                this.factoryMap.put(C364990ESr.class, AFwS191S0000000_5.get$arr$(244));
                this.factoryMap.put(C0ESK.class, AFwS191S0000000_5.get$arr$(245));
                this.factoryMap.put(C0ESL.class, AFwS191S0000000_5.get$arr$(246));
                this.factoryMap.put(C0EUF.class, AFwS191S0000000_5.get$arr$(247));
                this.factoryMap.put(C365300ETw.class, AFwS191S0000000_5.get$arr$(248));
                this.factoryMap.put(C0ESU.class, AFwS191S0000000_5.get$arr$(250));
                this.factoryMap.put(C0EST.class, AFwS191S0000000_5.get$arr$(251));
                this.factoryMap.put(C375900EoW.class, AFwS191S0000000_5.get$arr$(252));
                this.factoryMap.put(C375920EoY.class, AFwS191S0000000_5.get$arr$(253));
                this.factoryMap.put(C376260Ep6.class, AFwS191S0000000_5.get$arr$(254));
                this.factoryMap.put(C0ET8.class, AFwS191S0000000_5.get$arr$(255));
                this.factoryMap.put(C0ETW.class, AFwS191S0000000_5.get$arr$(256));
                getHasRegisteredPanel().set(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.api.IPanelService
    public void init() {
        registerPanel();
    }

    public static IPanelService createIPanelServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IPanelService.class, z);
        if (objLIZ != null) {
            return (IPanelService) objLIZ;
        }
        if (C04TD.v6 == null) {
            synchronized (IPanelService.class) {
                if (C04TD.v6 == null) {
                    C04TD.v6 = new PanelServiceImpl();
                }
            }
        }
        return C04TD.v6;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.api.IPanelService
    public <I, O> void open(C19A3 c19a3, C0E48 c0e48, Class<Object> cls, I i, Function1<? super O, Unit> function1) {
        registerPanel();
        Function0<InterfaceC375870EoT> function0 = this.factoryMap.get(cls);
        if (function0 == null) {
            return;
        }
        InterfaceC375870EoT interfaceC375870EoTInvoke = function0.invoke();
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c19a3);
        C0EB6 c0eb6 = null;
        if (c1drgLJIIIZ != null) {
            c0eb6 = (C0EB6) c1drgLJIIIZ.LJIIL(null, C0EB6.class);
        }
        if (interfaceC375870EoTInvoke.LIZJ(c19a3)) {
            return;
        }
        interfaceC375870EoTInvoke.LIZLLL(i);
        String strLJ = interfaceC375870EoTInvoke.LJ(c19a3, c0e48, new AwS406S0200000_5(interfaceC375870EoTInvoke, (InterfaceC375870EoT) function1, 82));
        if (c0eb6 != null) {
            c0eb6.LJIILIIL(strLJ);
        }
    }
}
