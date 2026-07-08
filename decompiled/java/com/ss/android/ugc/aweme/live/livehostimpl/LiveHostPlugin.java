package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AnonymousClass1403;
import X.C01GW;
import X.C08CX;
import X.C08OC;
import X.C08PT;
import X.C08QA;
import X.C0UVR;
import X.C0UVS;
import X.C0VSJ;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1BLC;
import X.C1BLL;
import X.C1BLT;
import X.C2188811AlT;
import X.C2203381BLk;
import X.C786410Ut5;
import X.C793770VBv;
import X.C844020X9c;
import X.C844470XAv;
import X.InterfaceC842850X4p;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.keva.KevaImpl;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jv6.a;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class LiveHostPlugin implements IHostPlugin {
    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean needDownloadByteLinkAAB() {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final List<String> getFusedPlugins() {
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService == null || iPluginService.LIZLLL() == null) {
            return null;
        }
        return new ArrayList((Collection) C08PT.LIZLLL.getValue());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean checkPluginInstalled(String str) {
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null) {
            return iPluginService.checkPluginInstalled(str);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean checkPluginInstalledV2(String str) {
        Collection collectionLLIIJI;
        List listLJJLL;
        File[] fileArrListFiles;
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService == null || iPluginService.LIZLLL() == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        C01GW c01gw = C08PT.LIZ;
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            long jLJ = C844470XAv.LJ();
            File fileLIZ = C08PT.LIZ(contextLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("splitcompat/");
            sbLIZ.append(jLJ);
            sbLIZ.append("/verified-splits");
            C0VSJ c0vsj = new C0VSJ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ));
            if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null || (listLJJLL = C13LQ.LJJLL(fileArrListFiles)) == null) {
                listLJJLL = C13BV.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLL, 10));
            Iterator it2 = listLJJLL.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C08QA.LJIJI((File) it2.next()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                String str2 = (String) obj;
                if (!u.LJJIIJZLJL(str2, "config.", false) && !a0.LJJIIZI(str2, ".config.", false)) {
                    arrayList3.add(obj);
                }
            }
            collectionLLIIJI = C13LP.LLIIJI(arrayList3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            collectionLLIIJI = C08CX.INSTANCE;
        }
        arrayList.addAll(collectionLLIIJI);
        arrayList.addAll(C08PT.LIZJ());
        arrayList.addAll((Collection) C08PT.LIZLLL.getValue());
        arrayList.addAll(C08PT.LIZJ);
        return arrayList.contains(C1BLT.LIZ(str));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final void forceDeleteDemandPlugin(String str) throws Throwable {
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null && iPluginService.LIZLLL() != null) {
            String strLIZ = C1BLT.LIZ(str);
            C01GW c01gw = C08PT.LIZ;
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            long jLJ = C844470XAv.LJ();
            File fileLIZ = C08PT.LIZ(contextLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("splitcompat/");
            sbLIZ.append(jLJ);
            sbLIZ.append('/');
            C0VSJ c0vsj = new C0VSJ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ));
            Iterator it2 = ((ArrayList) C13LP.LJLIL(C08PT.LIZIZ(c0vsj, strLIZ, "dex"), C13LP.LJLIL(C08PT.LIZIZ(c0vsj, strLIZ, "native-libraries"), C08PT.LIZIZ(c0vsj, strLIZ, "verified-splits")))).iterator();
            while (it2.hasNext()) {
                try {
                    ((File) it2.next()).delete();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            a.install(contextLIZ);
            C2203381BLk.LIZ.getClass();
            KevaImpl.getRepo("dynamic_task_triggered", 0).erase(strLIZ);
            C1BLL c1bllLJ = C1BLL.LJ();
            for (C1BLC c1blc : c1bllLJ.LLILLL) {
                if (c1blc.LIZ.equals(strLIZ)) {
                    c1bllLJ.LIZ(c1blc);
                }
            }
            for (C1BLC c1blc2 : c1bllLJ.LLILLL) {
                if (c1blc2.LIZ.equals(strLIZ)) {
                    c1bllLJ.LIZ(c1blc2);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final File getPluginNativeLibrariesFolder(String str) {
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null && iPluginService.LIZLLL() != null) {
            Map<String, File> map = C08OC.LIZ;
            String strLIZ = C1BLT.LIZ(str);
            if (C08OC.LIZIZ) {
                return (File) C08OC.LIZJ.getValue();
            }
            return (File) ((LinkedHashMap) C08OC.LIZ).get(strLIZ);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final void install(C0UVR c0uvr) {
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null) {
            C844020X9c c844020X9c = new C844020X9c();
            c844020X9c.LIZ = c0uvr.LIZ;
            c844020X9c.LIZIZ = c0uvr.LIZIZ;
            AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
            anonymousClass1403.LIZ = false;
            anonymousClass1403.LIZIZ = true;
            anonymousClass1403.LIZJ = true;
            anonymousClass1403.LIZLLL = true;
            anonymousClass1403.LJIIJJI = c0uvr.LJ;
            anonymousClass1403.LJIIL = c0uvr.LJFF;
            anonymousClass1403.LJIIIIZZ = c0uvr.LIZLLL;
            c844020X9c.LJ = anonymousClass1403.LIZ();
            final C0UVS c0uvs = c0uvr.LIZJ;
            if (c0uvs != null) {
                c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.0UWW
                    @Override // X.InterfaceC842850X4p
                    public final void LIZJ(String str, boolean z) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onSuccess: ");
                        sbLIZ.append(str);
                        C20441214yg.LJIIIZ("FindCrashLog#LiveAppBundleUtils#install", C2188811AlT.LIZIZ(sbLIZ));
                        c0uvs.onSuccess();
                    }

                    @Override // X.InterfaceC842850X4p
                    public final void LIZ(int i, String str, boolean z) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onFailed: ");
                        sbLIZ.append(str);
                        sbLIZ.append(" reason: ");
                        sbLIZ.append(i);
                        C20441214yg.LJIIIZ("FindCrashLog#LiveAppBundleUtils#install", C2188811AlT.LIZIZ(sbLIZ));
                        c0uvs.LIZ(i, str, z);
                        c0uvs.onFailed();
                    }
                };
            }
            iPluginService.LJJI(c844020X9c.LIZ());
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final Pair<Boolean, String> splitCompatInstall(Context context) {
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null && iPluginService.LIZLLL() != null) {
            return new Pair<>(Boolean.valueOf(a.install(C786410Ut5.N3(context))), "");
        }
        return new Pair<>(Boolean.FALSE, "aabService is null");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader) {
        try {
            Librarian.LJFF(str2);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("package_name", str);
                jSONObject.put("library_name", str2);
                jSONObject.put("reason", th.getMessage());
                jSONObject.put("event_belong", "live");
                jSONObject.put("event_type", "plugin_load_library_failed");
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            C793770VBv.LJIIJJI("plugin_bug_track", 1, jSONObject);
            return false;
        }
    }
}
