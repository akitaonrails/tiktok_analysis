package defpackage;

import X.C098200Yq;
import X.C1717770unn;
import X.C189200o6;
import X.C1909107dp;
import X.C1954807lC;
import X.C2382909Vj;
import X.EnumC1063300dmC;
import X.EnumC743970TGh;
import X.InterfaceC634840OvC;
import android.content.Context;
import android.nfc.NfcAdapter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.veritas.IPIPOVeritasService;
import defpackage.o;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class g5 extends o {
    public static boolean LLILLL;

    public static final class a {

        /* JADX INFO: renamed from: g5$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes13.dex */
        public /* synthetic */ class C0037a {
            public static final /* synthetic */ int[] LIZ;

            static {
                int[] iArr = new int[EnumC743970TGh.values().length];
                try {
                    iArr[EnumC743970TGh.FOUNDATION.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    iArr[EnumC743970TGh.BNPL.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                LIZ = iArr;
            }
        }

        public static boolean LIZ(EnumC743970TGh enumC743970TGh) {
            int i = C0037a.LIZ[enumC743970TGh.ordinal()];
            if (i != 1 && i != 2) {
                throw new C1954807lC();
            }
            C1717770unn.LIZJ().isDebug();
            if (C1717770unn.LJFF().LJ() && C1717770unn.LJFF().checkPluginInstalled("com.ss.android.ugc.aweme.df_pipo_bnpl")) {
                if (!g5.LLILLL) {
                    C1717770unn.LJFF().LIZLLL().splitCompatInstall(C1717770unn.LIZJ().getApplicationContext());
                    g5.LLILLL = true;
                }
                if (g5.LLILLL) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        Object c098200Yq;
        String str;
        IPIPOVeritasService iPIPOVeritasService;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "Null context", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        o.c cVar = (o.c) C1909107dp.LIZJ(o.c.class, containerID);
        EnumC743970TGh enumC743970TGh = EnumC743970TGh.BNPL;
        if (!a.LIZ(enumC743970TGh)) {
            cVar.setResult("UNAVAILABLE");
            completionBlock.onSuccess(cVar, "");
            return;
        }
        try {
            if (a.LIZ(enumC743970TGh) && (iPIPOVeritasService = (IPIPOVeritasService) PluggableExtentionKt.pluggableSpi$default(IPIPOVeritasService.class, false, false, false, 14, null)) != null) {
                iPIPOVeritasService.init();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (NfcAdapter.getDefaultAdapter(context) != null) {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
            if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                str = "ENABLED";
            } else {
                str = "DISABLED";
            }
            cVar.setResult(str);
            completionBlock.onSuccess(cVar, "");
            return;
        }
        cVar.setResult("UNAVAILABLE");
        completionBlock.onSuccess(cVar, "");
    }
}
