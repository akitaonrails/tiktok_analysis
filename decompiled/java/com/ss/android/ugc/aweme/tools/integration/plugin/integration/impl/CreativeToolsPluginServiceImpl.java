package com.ss.android.ugc.aweme.tools.integration.plugin.integration.impl;

import X.C07X4;
import X.C0BE6;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1AF0;
import X.C20191313zT;
import X.C20191413zU;
import X.C20191613zW;
import X.C201955140j;
import X.C2188811AlT;
import X.C2213981Bky;
import X.C282980B7g;
import X.C299080Bnu;
import X.C299090Bnv;
import X.C554740LpI;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC19508611Ue;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS106S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.Npth;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.VEPluginNotLoadedCameraPageException;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.VEPluginNotLoadedException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class CreativeToolsPluginServiceImpl implements CreativeToolsPluginService {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService
    public final void LIZ() {
        C844470XAv.LIZ.getClass();
        if (LJI(C844470XAv.LIZ())) {
            return;
        }
        C201955140j.LIZJ(C554740LpI.LIZIZ, "VE Plugin No Ready. no soName");
        VEPluginNotLoadedException vEPluginNotLoadedException = new VEPluginNotLoadedException("VE Plugin No Ready. no soName");
        if (C299090Bnv.LIZ()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS106S0100000_6(vEPluginNotLoadedException, 118));
            throw vEPluginNotLoadedException;
        }
        if (((Boolean) C282980B7g.LIZ.getValue()).booleanValue() && this.LIZ.compareAndSet(false, true)) {
            Npth.reportBizException("VEPluginNot", vEPluginNotLoadedException, "no soName", new LinkedHashMap(), new LinkedHashMap());
            C1AF0.LJ(vEPluginNotLoadedException);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService
    public final boolean LJIIIZ() {
        return C299080Bnu.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService
    public final void LJ(Activity activity) {
        if (activity == null && (activity = C2213981Bky.LIZIZ.getCurrentActivity()) == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(2131838624);
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService
    public final void LJFF(Context context) {
        C20191613zW.LIZ.getClass();
        C201955140j.LIZJ(C554740LpI.LIZIZ, "VEPluginManager preDownloadPlugin start");
        C20191613zW.LIZ(context, true, C20191613zW.LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService
    public final boolean LJI(Context context) {
        C20191613zW.LIZ.getClass();
        if (C299080Bnu.LIZ()) {
            if (!((Boolean) C0BE6.LIZ.getValue()).booleanValue()) {
                if (C20191613zW.LIZJ != EnumC19508611Ue.INSTALLED) {
                    if (C20191613zW.LIZJ()) {
                        C20191613zW.LIZJ = EnumC19508611Ue.DOWNLOADED;
                        C20191613zW.LIZIZ(context);
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService
    public final void loadLibrary(String str) {
        C20191613zW.LIZ.getClass();
        if (C299080Bnu.LIZ()) {
            if (C20191613zW.LIZJ == EnumC19508611Ue.INSTALLED) {
                C201955140j.LIZJ(C554740LpI.LIZIZ, "VE Plugin is already installed");
            } else if (C20191613zW.LIZJ()) {
                C201955140j.LIZJ(C554740LpI.LIZIZ, "VE Plugin is already downloaded, install it");
                C20191613zW.LIZIZ(null);
            } else {
                C554740LpI c554740LpI = C554740LpI.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VE Plugin No Ready. soName: ");
                sbLIZ.append(str);
                C201955140j.LIZJ(c554740LpI, C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("VE Plugin No Ready. soName: ");
                sbLIZ2.append(str);
                VEPluginNotLoadedException vEPluginNotLoadedException = new VEPluginNotLoadedException(C2188811AlT.LIZIZ(sbLIZ2));
                if (!C299090Bnv.LIZ()) {
                    if (((Boolean) C282980B7g.LIZ.getValue()).booleanValue()) {
                        C1AF0.LJ(vEPluginNotLoadedException);
                    }
                } else {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS106S0100000_6(vEPluginNotLoadedException, 204));
                    throw vEPluginNotLoadedException;
                }
            }
        }
        Librarian.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService
    public final void LJIIIIZZ(Function0<Unit> function0, Function0<Unit> function02) {
        if (!C299080Bnu.LIZ()) {
            function0.invoke();
            return;
        }
        C844470XAv.LIZ.getClass();
        if (LJI(C844470XAv.LIZ())) {
            function0.invoke();
            return;
        }
        C20191413zU.LIZ.getClass();
        List<C07X4> list = C20191413zU.LIZJ;
        synchronized (list) {
            try {
                ((ArrayList) list).add(new C07X4(function0, function02));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService
    public final void LIZIZ(Context context, boolean z, Function0<Unit> function0) {
        Activity activityLIZ;
        if (!C299080Bnu.LIZ()) {
            function0.invoke();
            return;
        }
        if (LJI(context)) {
            function0.invoke();
            return;
        }
        if (z) {
            if (context != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
            LJ(activityLIZ);
        }
        C20191613zW c20191613zW = C20191613zW.LIZ;
        AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(function0, (Function0<Unit>) 287);
        c20191613zW.getClass();
        C20191613zW.LIZ(context, false, awS574S0100000_30);
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService
    public final boolean LIZJ(Context context, String str, boolean z) {
        Activity activityLIZ;
        boolean z2 = true;
        if (!C299080Bnu.LIZ()) {
            return true;
        }
        if (!LJI(context)) {
            if (z) {
                if (context != null) {
                    activityLIZ = C1388190mED.LIZ(context);
                } else {
                    activityLIZ = null;
                }
                LJ(activityLIZ);
            }
            C20191613zW c20191613zW = C20191613zW.LIZ;
            AFwS219S0000000_30 aFwS219S0000000_30 = AFwS219S0000000_30.get$arr$(237);
            c20191613zW.getClass();
            z2 = false;
            C20191613zW.LIZ(context, false, aFwS219S0000000_30);
        }
        C20191313zT.LIZ.getClass();
        C20191313zT.LIZ(str, z2);
        return z2;
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService
    public final void LIZLLL(Context context, String str, Function0 function0) {
        Activity activityLIZ;
        if (!C299080Bnu.LIZ()) {
            function0.invoke();
            return;
        }
        if (LJI(context)) {
            function0.invoke();
            C20191313zT.LIZ.getClass();
            C20191313zT.LIZ(str, true);
            return;
        }
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        LJ(activityLIZ);
        C20191613zW c20191613zW = C20191613zW.LIZ;
        AFwS219S0000000_30 aFwS219S0000000_30 = AFwS219S0000000_30.get$arr$(238);
        c20191613zW.getClass();
        C20191613zW.LIZ(context, false, aFwS219S0000000_30);
        C20191313zT.LIZ.getClass();
        C20191313zT.LIZ(str, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService
    public final void LJII(Boolean bool, boolean z, String str, String str2) {
        C844470XAv.LIZ.getClass();
        if (!LJI(C844470XAv.LIZ())) {
            C554740LpI c554740LpI = C554740LpI.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VE Plugin No Ready. enterFrom: ");
            sbLIZ.append(str);
            sbLIZ.append("  shootWay: ");
            sbLIZ.append(str2);
            sbLIZ.append(" isFromDraft: ");
            sbLIZ.append(bool);
            sbLIZ.append(" isSavedInstanceStateNull: ");
            sbLIZ.append(z);
            C201955140j.LIZJ(c554740LpI, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("VE Plugin No Ready. enterFrom: ");
            sbLIZ2.append(str);
            sbLIZ2.append("  shootWay: ");
            sbLIZ2.append(str2);
            sbLIZ2.append(" isFromDraft: ");
            sbLIZ2.append(bool);
            sbLIZ2.append(" isSavedInstanceStateNull: ");
            sbLIZ2.append(z);
            VEPluginNotLoadedCameraPageException vEPluginNotLoadedCameraPageException = new VEPluginNotLoadedCameraPageException(C2188811AlT.LIZIZ(sbLIZ2));
            if (!C299090Bnv.LIZ()) {
                if (this.LIZ.compareAndSet(false, true)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("enterFrom: ");
                    sbLIZ3.append(str);
                    sbLIZ3.append("  shootWay: ");
                    sbLIZ3.append(str2);
                    sbLIZ3.append(" isFromDraft: ");
                    sbLIZ3.append(bool);
                    sbLIZ3.append(" isSavedInstanceStateNull: ");
                    sbLIZ3.append(z);
                    Npth.reportBizException("VEPluginNot", vEPluginNotLoadedCameraPageException, C2188811AlT.LIZIZ(sbLIZ3), new LinkedHashMap(), new LinkedHashMap());
                    C1AF0.LJ(vEPluginNotLoadedCameraPageException);
                    return;
                }
                return;
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS104S0100000_4(vEPluginNotLoadedCameraPageException, 84));
            throw vEPluginNotLoadedCameraPageException;
        }
    }
}
