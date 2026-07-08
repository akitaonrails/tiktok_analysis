package com.ss.android.ugc.aweme.router;

import X.C1976907ol;
import X.C2188811AlT;
import X.InterfaceC1400470mY1;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.pumbaa.hybrid.rasp.api.IRaspService;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: loaded from: classes29.dex */
public class RouterOpen implements InterfaceC1400470mY1, IInterceptor {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // X.InterfaceC1400470mY1
    public final String LIZ(String str) {
        if (!TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://webview/?url=");
            sbLIZ.append(Uri.encode(str));
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        IRaspService iRaspService = (IRaspService) ServiceManager.get().getService(IRaspService.class);
        if ((iRaspService != null && iRaspService.LIZIZ(str, "router").booleanValue()) || ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O5().LIZLLL(null, str).booleanValue()) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:83|(10:85|152|86|91|(1:93)(1:(1:95)(1:96))|154|97|(2:102|(1:104))(2:105|(2:107|(1:109)))|112|(2:139|140)(3:115|(1:117)|(4:123|(1:125)|126|127)(1:(2:129|(2:131|132)(2:133|134))(2:135|(2:137|138)))))(1:87)|90|91|(0)(0)|154|97|(7:100|102|(0)|112|(0)|139|140)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0225, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0226, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e7 A[Catch: Exception -> 0x0225, TryCatch #1 {Exception -> 0x0225, blocks: (B:97:0x01c9, B:100:0x01d9, B:105:0x01fb, B:107:0x0211, B:109:0x0222, B:102:0x01e7, B:104:0x01f8), top: B:154:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f8 A[Catch: Exception -> 0x0225, TryCatch #1 {Exception -> 0x0225, blocks: (B:97:0x01c9, B:100:0x01d9, B:105:0x01fb, B:107:0x0211, B:109:0x0222, B:102:0x01e7, B:104:0x01f8), top: B:154:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c2  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r18) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.router.RouterOpen.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r8, com.bytedance.router.RouteIntent r9) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.router.RouterOpen.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
