package com.ss.android.ugc.aweme.openplatform;

import X.AbstractC1387200mCc;
import X.C1228470i4b;
import X.C1228590i4n;
import X.C1229180i5k;
import X.C1229190i5l;
import X.C1229390i65;
import X.C1229400i66;
import X.C1229420i68;
import X.C1230880i8U;
import X.C123100dR;
import X.C1231470i9R;
import X.C13BV;
import X.C1618506Vj;
import X.C1906580ziK;
import X.C7740030o;
import X.EnumC913760Zt0;
import X.InterfaceC1228540i4i;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupChatOpenPlatformRouteAction implements IRouteAction {
    public static final C1229190i5l Companion = new Object() { // from class: X.0i5l
    };

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (X.C894660Z7w.LJ() == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C1229180i5k extraAndCheckRequiredParams(android.os.Bundle r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L63
            java.lang.String r0 = "biz_line"
            java.lang.String r4 = r7.getString(r0)
            java.lang.String r0 = "biz_scene"
            java.lang.String r3 = r7.getString(r0)
            java.lang.String r0 = "enter_from"
            java.lang.String r2 = r7.getString(r0)
            java.lang.String r0 = "enter_method"
            java.lang.String r5 = r7.getString(r0)
        L1b:
            if (r4 == 0) goto L3b
            int r0 = r4.length()
            if (r0 == 0) goto L3b
            if (r3 == 0) goto L3b
            int r0 = r3.length()
            if (r0 == 0) goto L3b
            if (r2 == 0) goto L3b
            int r0 = r2.length()
            if (r0 == 0) goto L3b
            if (r5 == 0) goto L3b
            int r0 = r5.length()
            if (r0 != 0) goto L4f
        L3b:
            X.0I0B r1 = X.C0I0B.LJFF
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            if (r0 != 0) goto L67
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 != 0) goto L67
        L4f:
            X.0i5k r1 = new X.0i5k
            java.lang.String r0 = ""
            if (r4 != 0) goto L56
            r4 = r0
        L56:
            if (r3 != 0) goto L59
            r3 = r0
        L59:
            if (r2 != 0) goto L5c
            r2 = r0
        L5c:
            if (r5 != 0) goto L5f
            r5 = r0
        L5f:
            r1.<init>(r4, r3, r2, r5)
            return r1
        L63:
            r4 = r5
            r3 = r5
            r2 = r5
            goto L1b
        L67:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "params invalid, bizLine & bizScene & enterFrom & enterMethod shouldn't be empty"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openplatform.GroupChatOpenPlatformRouteAction.extraAndCheckRequiredParams(android.os.Bundle):X.0i5k");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[PHI: r33
      0x0047: PHI (r33v5 boolean) = (r33v1 boolean), (r33v6 boolean) binds: [B:28:0x005e, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[PHI: r17 r33
      0x006c: PHI (r17v3 boolean) = (r17v1 boolean), (r17v4 boolean) binds: [B:31:0x006a, B:22:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r33v4 boolean) = (r33v2 boolean), (r33v5 boolean) binds: [B:31:0x006a, B:22:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[Catch: all -> 0x0186, TryCatch #0 {all -> 0x0186, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000e, B:9:0x0020, B:14:0x002d, B:33:0x006d, B:34:0x007f, B:36:0x0085, B:38:0x0092, B:42:0x009c, B:44:0x00a4, B:45:0x00a8, B:47:0x00b1, B:50:0x00ba, B:51:0x00cb, B:53:0x00d1, B:55:0x00de, B:57:0x00e4, B:61:0x00f0, B:64:0x00f9, B:66:0x00ff, B:69:0x0108, B:71:0x0154, B:73:0x017b, B:30:0x0064, B:27:0x0058, B:29:0x0060, B:24:0x004c, B:26:0x0054), top: B:79:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1 A[Catch: all -> 0x0186, TryCatch #0 {all -> 0x0186, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000e, B:9:0x0020, B:14:0x002d, B:33:0x006d, B:34:0x007f, B:36:0x0085, B:38:0x0092, B:42:0x009c, B:44:0x00a4, B:45:0x00a8, B:47:0x00b1, B:50:0x00ba, B:51:0x00cb, B:53:0x00d1, B:55:0x00de, B:57:0x00e4, B:61:0x00f0, B:64:0x00f9, B:66:0x00ff, B:69:0x0108, B:71:0x0154, B:73:0x017b, B:30:0x0064, B:27:0x0058, B:29:0x0060, B:24:0x004c, B:26:0x0054), top: B:79:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154 A[Catch: all -> 0x0186, TryCatch #0 {all -> 0x0186, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000e, B:9:0x0020, B:14:0x002d, B:33:0x006d, B:34:0x007f, B:36:0x0085, B:38:0x0092, B:42:0x009c, B:44:0x00a4, B:45:0x00a8, B:47:0x00b1, B:50:0x00ba, B:51:0x00cb, B:53:0x00d1, B:55:0x00de, B:57:0x00e4, B:61:0x00f0, B:64:0x00f9, B:66:0x00ff, B:69:0x0108, B:71:0x0154, B:73:0x017b, B:30:0x0064, B:27:0x0058, B:29:0x0060, B:24:0x004c, B:26:0x0054), top: B:79:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017b A[Catch: all -> 0x0186, TryCatch #0 {all -> 0x0186, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000e, B:9:0x0020, B:14:0x002d, B:33:0x006d, B:34:0x007f, B:36:0x0085, B:38:0x0092, B:42:0x009c, B:44:0x00a4, B:45:0x00a8, B:47:0x00b1, B:50:0x00ba, B:51:0x00cb, B:53:0x00d1, B:55:0x00de, B:57:0x00e4, B:61:0x00f0, B:64:0x00f9, B:66:0x00ff, B:69:0x0108, B:71:0x0154, B:73:0x017b, B:30:0x0064, B:27:0x0058, B:29:0x0060, B:24:0x004c, B:26:0x0054), top: B:79:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleCreateGroupPanelSchema(android.os.Bundle r37) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openplatform.GroupChatOpenPlatformRouteAction.handleCreateGroupPanelSchema(android.os.Bundle):void");
    }

    private final void handleCreateGroupSchema(Bundle bundle) {
        List listLJJLIIIJILLIZJL;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        try {
            C1229180i5k c1229180i5kExtraAndCheckRequiredParams = extraAndCheckRequiredParams(bundle);
            if (bundle == null || (string6 = bundle.getString("uid_list")) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string6, new String[]{","}, 0, 6)) == null) {
                listLJJLIIIJILLIZJL = C13BV.INSTANCE;
            }
            if (bundle != null) {
                string = bundle.getString("group_type");
            } else {
                string = null;
            }
            String str = "";
            if (string == null) {
                string = "";
            }
            EnumC913760Zt0 enumC913760Zt0LIZJ = C1229420i68.LIZJ(string);
            if (bundle != null) {
                string2 = bundle.getString("unique_id");
            } else {
                string2 = null;
            }
            enumC913760Zt0LIZJ.getValue();
            if (!C123100dR.LIZ(string2)) {
                string2 = null;
            }
            if (bundle == null) {
                string3 = null;
            } else {
                string3 = bundle.getString("name");
            }
            Gson gson = C7740030o.LIZ().getGson();
            if (bundle == null || (string4 = bundle.getString("biz_ext_map")) == null) {
                string4 = "";
            }
            Map map = (Map) gson.LJIIIIZZ(string4, new TypeToken<Map<String, ? extends String>>() { // from class: X.0i5i
            }.getType());
            Gson gson2 = C7740030o.LIZ().getGson();
            if (bundle != null && (string5 = bundle.getString("extra_et_params")) != null) {
                str = string5;
            }
            Map map2 = (Map) gson2.LJIIIIZZ(str, new TypeToken<Map<String, ? extends String>>() { // from class: X.0i5j
            }.getType());
            C1618506Vj c1618506Vj = IMGroupChatApi.LIZIZ;
            String str2 = c1229180i5kExtraAndCheckRequiredParams.LIZ;
            String str3 = c1229180i5kExtraAndCheckRequiredParams.LIZIZ;
            c1618506Vj.getClass();
            new C1231470i9R(str2, str3, "schema").LIZ(new C1229390i65(listLJJLIIIJILLIZJL, null, enumC913760Zt0LIZJ, null, null, map, string2, string3, null, 282), new C1229400i66(c1229180i5kExtraAndCheckRequiredParams.LIZJ, c1229180i5kExtraAndCheckRequiredParams.LIZLLL, map2, 8), null, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private final void handleOpenCreatePublicGroupSchema(Bundle bundle) {
        Activity activityLIZIZ;
        try {
            C1228470i4b c1228470i4bLIZIZ = C1230880i8U.LIZIZ(bundle);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                C1229180i5k c1229180i5kExtraAndCheckRequiredParams = extraAndCheckRequiredParams(bundle);
                C1618506Vj c1618506Vj = IMGroupChatApi.LIZIZ;
                String str = c1229180i5kExtraAndCheckRequiredParams.LIZ;
                String str2 = c1229180i5kExtraAndCheckRequiredParams.LIZIZ;
                c1618506Vj.getClass();
                C1231470i9R c1231470i9R = new C1231470i9R(str, str2, "schema");
                InterfaceC1228540i4i.LIZ.getClass();
                c1231470i9R.LIZLLL(activityLIZIZ, c1228470i4bLIZIZ, C1228590i4n.LIZ().LIZ(activityLIZIZ, c1228470i4bLIZIZ.LIZ));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private final void handleOpenGroupListSchema(Bundle bundle) {
        Activity activityLIZIZ;
        try {
            C1228470i4b c1228470i4bLIZJ = C1230880i8U.LIZJ(bundle);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                C1229180i5k c1229180i5kExtraAndCheckRequiredParams = extraAndCheckRequiredParams(bundle);
                C1618506Vj c1618506Vj = IMGroupChatApi.LIZIZ;
                String str = c1229180i5kExtraAndCheckRequiredParams.LIZ;
                String str2 = c1229180i5kExtraAndCheckRequiredParams.LIZIZ;
                c1618506Vj.getClass();
                new C1231470i9R(str, str2, "schema").LJFF(activityLIZIZ, c1228470i4bLIZJ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String string;
        if (context == null) {
            return Boolean.FALSE;
        }
        if (bundle == null || (string = bundle.getString("action")) == null) {
            string = "";
        }
        switch (string.hashCode()) {
            case -1990677119:
                if (string.equals("create_group_panel")) {
                    handleCreateGroupPanelSchema(bundle);
                }
                break;
            case -1420143392:
                if (string.equals("show_group_list")) {
                    handleOpenGroupListSchema(bundle);
                }
                break;
            case -414442612:
                if (string.equals("create_public_group")) {
                    handleOpenCreatePublicGroupSchema(bundle);
                }
                break;
            case 1867337084:
                if (string.equals("create_group")) {
                    handleCreateGroupSchema(bundle);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
