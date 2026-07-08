package com.ss.android.ugc.aweme.launcershortcut;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C098200Yq;
import X.C0WGR;
import X.C0WHF;
import X.C0WHI;
import X.C0WHP;
import X.C0WHS;
import X.C0WHT;
import X.C0WHU;
import X.C0WHW;
import X.C1387310mCn;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C15O7;
import X.C189200o6;
import X.C2162808de;
import X.C2188811AlT;
import X.C452501pT;
import X.C815220VyS;
import X.C815230VyT;
import X.C816040Vzm;
import X.C816050Vzn;
import X.C844470XAv;
import X.C985403tE;
import X.InterfaceC1587510rPh;
import X.InterfaceC815880VzW;
import Y.ACallableS420S0100000_13;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.IncentiveLauncherShortcutAddItem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS101S0400000_2;
import kotlin.jvm.internal.AwS127S1100000_13;
import kotlin.jvm.internal.AwS192S1100000_13;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public class LauncherShortcutService implements ILauncherShortcutService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(143));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(142));
    public Boolean LIZJ;

    @Override // com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService
    public final void LJI() {
    }

    public static C0WHT LJIIJJI() {
        C2162808de.LIZ.getClass();
        return Intrinsics.LJFF(C2162808de.LIZIZ().LIZ, "emui") ? new C0WHT() { // from class: X.0WHM
            @Override // X.C0WHT
            public final Intent LIZ(Context context) {
                return C0WHF.LIZ.LIZ(context);
            }

            @Override // X.C0WHT
            public final C0WGR LIZIZ(Context context) {
                Object c098200Yq;
                try {
                    if (Intrinsics.LJFF(Class.forName("com.huawei.hsm.permission.PermissionManager").getMethod("canSendBroadcast", Context.class, Intent.class).invoke(null, context, new Intent("com.android.launcher.action.INSTALL_SHORTCUT")), Boolean.TRUE)) {
                        c098200Yq = C0WGR.GRANTED;
                    } else {
                        c098200Yq = C0WGR.DENIED;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C01GW<AbstractC1604130rqV> c01gw = C165G.LJ;
                    AbstractC1604130rqV abstractC1604130rqVLIZ = C0WHH.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EmUIPerChecker checkPermission error, ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    C1AF0.LJFF(thM5exceptionOrNullimpl, "IPermissionChecker error");
                    c098200Yq = C0WGR.UNKNOWN;
                }
                return (C0WGR) c098200Yq;
            }
        } : Intrinsics.LJFF(C2162808de.LIZIZ().LIZ, "harmony_os") ? new C0WHT() { // from class: X.0WHN
            @Override // X.C0WHT
            public final Intent LIZ(Context context) {
                return C0WHF.LIZ.LIZ(context);
            }

            @Override // X.C0WHT
            public final C0WGR LIZIZ(Context context) {
                Object c098200Yq;
                try {
                    if (Intrinsics.LJFF(Class.forName("com.huawei.hsm.permission.PermissionManager").getMethod("canSendBroadcast", Context.class, Intent.class).invoke(null, context, new Intent("com.android.launcher.action.INSTALL_SHORTCUT")), Boolean.TRUE)) {
                        c098200Yq = C0WGR.GRANTED;
                    } else {
                        c098200Yq = C0WGR.DENIED;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C01GW<AbstractC1604130rqV> c01gw = C165G.LJ;
                    AbstractC1604130rqV abstractC1604130rqVLIZ = C0WHH.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("HarmonyOsPerChecker checkPermission error, ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    C1AF0.LJFF(thM5exceptionOrNullimpl, "IPermissionChecker error");
                    c098200Yq = C0WGR.UNKNOWN;
                }
                return (C0WGR) c098200Yq;
            }
        } : Intrinsics.LJFF(C2162808de.LIZIZ().LIZ, "magic_ui") ? new C0WHT() { // from class: X.0WHO
            @Override // X.C0WHT
            public final Intent LIZ(Context context) {
                return C0WHF.LIZ.LIZ(context);
            }

            @Override // X.C0WHT
            public final C0WGR LIZIZ(Context context) {
                Object c098200Yq;
                try {
                    if (Intrinsics.LJFF(Class.forName("com.huawei.hsm.permission.PermissionManager").getMethod("canSendBroadcast", Context.class, Intent.class).invoke(null, context, new Intent("com.android.launcher.action.INSTALL_SHORTCUT")), Boolean.TRUE)) {
                        c098200Yq = C0WGR.GRANTED;
                    } else {
                        c098200Yq = C0WGR.DENIED;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C01GW<AbstractC1604130rqV> c01gw = C165G.LJ;
                    AbstractC1604130rqV abstractC1604130rqVLIZ = C0WHH.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MagicUIPerChecker checkPermission error, ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    C1AF0.LJFF(thM5exceptionOrNullimpl, "IPermissionChecker error");
                    c098200Yq = C0WGR.UNKNOWN;
                }
                return (C0WGR) c098200Yq;
            }
        } : Intrinsics.LJFF(C2162808de.LIZIZ().LIZ, "magic_od") ? new C0WHT() { // from class: X.0WHL
            @Override // X.C0WHT
            public final Intent LIZ(Context context) {
                return C0WHF.LIZ.LIZ(context);
            }

            @Override // X.C0WHT
            public final C0WGR LIZIZ(Context context) {
                Object c098200Yq;
                try {
                    Class<?> cls = Class.forName("com.hihonor.hsm.permission.PinShortcutPermission");
                    if (Intrinsics.LJFF(cls.getMethod("allowOp", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]), Boolean.TRUE)) {
                        c098200Yq = C0WGR.GRANTED;
                    } else {
                        c098200Yq = C0WGR.DENIED;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C01GW<AbstractC1604130rqV> c01gw = C165G.LJ;
                    AbstractC1604130rqV abstractC1604130rqVLIZ = C0WHH.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MagicOSPerChecker checkPermission error, ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    C1AF0.LJFF(thM5exceptionOrNullimpl, "IPermissionChecker error");
                    c098200Yq = C0WGR.UNKNOWN;
                }
                return (C0WGR) c098200Yq;
            }
        } : Intrinsics.LJFF(C2162808de.LIZIZ().LIZ, "funtouch_os") ? C0WHI.LIZ : Intrinsics.LJFF(C2162808de.LIZIZ().LIZ, "origin_os") ? new C0WHT() { // from class: X.0WHJ
            @Override // X.C0WHT
            public final Intent LIZ(Context context) {
                return C0WHI.LIZ.LIZ(context);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0WHT
            public final C0WGR LIZIZ(Context context) {
                Object c098200Yq;
                C259800zU c259800zU = new C259800zU();
                try {
                    T t = 0;
                    Cursor cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), UriProtector.parse("content://com.bbk.launcher2.settings/favorites"), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapdpHN2SCuatS6ZH8trdI32AqEX51eSFWRIpBp1WMFywK7/RCkS5kgZQ==", null));
                    if (cursorLJJJ != null) {
                        while (cursorLJJJ.moveToNext()) {
                            int columnIndex = cursorLJJJ.getColumnIndex("intent");
                            int columnIndex2 = cursorLJJJ.getColumnIndex("shortcutPermission");
                            String string = cursorLJJJ.getString(columnIndex);
                            if (!TextUtils.isEmpty(string) && a0.LJJIIZI(string, C786410Ut5.N3(context).getPackageName(), false) && Intrinsics.LJFF(a0.LJJLIIIJILLIZJL(string, new String[]{"/"}, 0, 6).get(0), C786410Ut5.N3(context).getPackageName())) {
                                int i = cursorLJJJ.getInt(columnIndex2);
                                if (i != 16) {
                                    if (i != 17) {
                                        return C0WGR.DENIED;
                                    }
                                    return C0WGR.ASK;
                                }
                                return C0WGR.GRANTED;
                            }
                        }
                        t = cursorLJJJ;
                    }
                    c259800zU.element = t;
                    c098200Yq = C0WGR.UNKNOWN;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C01GW<AbstractC1604130rqV> c01gw = C165G.LJ;
                    C0WHH.LIZ().LJ("OriginOsPerChecker checkPermission error, " + thM5exceptionOrNullimpl.getMessage());
                    C1AF0.LJFF(thM5exceptionOrNullimpl, "IPermissionChecker error");
                    c098200Yq = C0WGR.UNKNOWN;
                }
                C0WGR c0wgr = (C0WGR) c098200Yq;
                Cursor cursor = (Cursor) c259800zU.element;
                if (cursor != null) {
                    cursor.close();
                }
                return c0wgr;
            }
        } : Intrinsics.LJFF(C2162808de.LIZIZ().LIZ, "color_os") ? new C0WHT() { // from class: X.0WHK
            @Override // X.C0WHT
            public final Intent LIZ(Context context) {
                Intent intent = new Intent();
                intent.putExtra("packagename", context.getPackageName());
                intent.setClassName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity");
                if (C0WHG.LIZ(context, intent)) {
                    return intent;
                }
                intent.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
                if (!C0WHG.LIZ(context, intent)) {
                    return new Intent("android.settings.SETTINGS");
                }
                return intent;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
            
                if (r1.intValue() < 0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
            
                r4 = new X.C259800zU();
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
            
                r5 = X.C2204961BRm.LJJJ(r13.getContentResolver(), com.bytedance.mt.protector.impl.UriProtector.parse("content://settings/secure/launcher_shortcut_permission_settings"), null, null, null, null, new X.C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapdpHN2SCuatS6ZH8trdI32AqEX51eSFmMJ5hy9F8m/hWK1h2iQ0dL", null));
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
            
                if (r5 == null) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
            
                if (r5.moveToNext() == false) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
            
                r3 = r5.getString(r5.getColumnIndex("value"));
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
            
                if (android.text.TextUtils.isEmpty(r3) != false) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
            
                if (kotlin.text.a0.LJJIIZI(r3, X.C786410Ut5.N3(r13).getPackageName() + ',', false) == false) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
            
                if (kotlin.text.a0.LJJIIZI(r3, X.C786410Ut5.N3(r13).getPackageName() + ", 1", false) == false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:
            
                return X.C0WGR.GRANTED;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00f6, code lost:
            
                return X.C0WGR.DENIED;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
            
                r3 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00f8, code lost:
            
                r4.element = r3;
                r1 = X.C0WGR.UNKNOWN;
                X.C189200o6.m2constructorimpl(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0100, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0101, code lost:
            
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
                r1 = new X.C098200Yq(r0);
                X.C189200o6.m2constructorimpl(r1);
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0WHT
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0WGR LIZIZ(android.content.Context r13) {
                /*
                    Method dump skipped, instruction units count: 320
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0WHK.LIZIZ(android.content.Context):X.0WGR");
            }
        } : Intrinsics.LJFF(C2162808de.LIZIZ().LIZ, "miui") ? new C0WHT() { // from class: X.0WHE
            @Override // X.C0WHT
            public final Intent LIZ(Context context) {
                Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
                intent.putExtra("extra_pkgname", context.getPackageName());
                if (!C0WHG.LIZ(context, intent)) {
                    return C0WHF.LIZ.LIZ(context);
                }
                return intent;
            }

            @Override // X.C0WHT
            public final C0WGR LIZIZ(Context context) {
                Object c098200Yq;
                String string;
                try {
                    AppOpsManager appOpsManager = (AppOpsManager) C786410Ut5.H2(context, "appops");
                    String packageName = C786410Ut5.N3(context).getPackageName();
                    int i = context.getApplicationInfo().uid;
                    Class<?> cls = appOpsManager.getClass();
                    Class<?> cls2 = Integer.TYPE;
                    Object objInvoke = cls.getDeclaredMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, 10017, Integer.valueOf(i), packageName);
                    if (objInvoke != null) {
                        string = objInvoke.toString();
                    } else {
                        string = null;
                    }
                    if (Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT)) {
                        c098200Yq = C0WGR.GRANTED;
                    } else if (Intrinsics.LJFF(string, "1")) {
                        c098200Yq = C0WGR.DENIED;
                    } else {
                        c098200Yq = C0WGR.UNKNOWN;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C01GW<AbstractC1604130rqV> c01gw = C165G.LJ;
                    AbstractC1604130rqV abstractC1604130rqVLIZ = C0WHH.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MiUIPerChecker checkPermission error, ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    C1AF0.LJFF(thM5exceptionOrNullimpl, "IPermissionChecker error");
                    c098200Yq = C0WGR.UNKNOWN;
                }
                return (C0WGR) c098200Yq;
            }
        } : C0WHF.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService
    public final void LIZJ() {
        if (C0WHW.LIZ.enable) {
            C15O7.LIZJ(new ACallableS420S0100000_13(this, 1));
        }
    }

    public final boolean LJIIJ() {
        if (!C0WHW.LIZ.enable) {
            ((AbstractC1604130rqV) this.LIZ.getValue()).LJIIIZ("FeedLauncherShortcutAddExp not enable");
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return true;
        }
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Build.VERSION ：");
        sbLIZ.append(i);
        sbLIZ.append(", shortcut only support Android 8.0 +");
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService
    public final boolean LIZ() {
        Object c098200Yq;
        if (!LJIIJ()) {
            return false;
        }
        if (this.LIZJ == null) {
            try {
                C844470XAv.LIZ.getClass();
                c098200Yq = Boolean.valueOf(C815220VyS.LJ(C844470XAv.LIZ()));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = Boolean.FALSE;
            }
            this.LIZJ = (Boolean) c098200Yq;
        }
        Boolean bool = this.LIZJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService
    public final boolean LIZIZ(String str) {
        Object c098200Yq;
        boolean z = false;
        if (!LJIIJ()) {
            return false;
        }
        try {
            C844470XAv.LIZ.getClass();
            Iterator it2 = C815220VyS.LIZLLL(4, C844470XAv.LIZ()).iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(str, ((C815230VyT) it2.next()).LIZIZ)) {
                    z = true;
                }
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService
    public final C816050Vzn LIZLLL(String str) {
        InterfaceC815880VzW interfaceC815880VzW;
        if (!LJIIJ() || (interfaceC815880VzW = (InterfaceC815880VzW) ((Map) this.LIZIZ.getValue()).get(str)) == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return new C816050Vzn(interfaceC815880VzW);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService
    public final C0WHU LJIIIIZZ(String str) {
        InterfaceC815880VzW interfaceC815880VzW = (InterfaceC815880VzW) ((Map) this.LIZIZ.getValue()).get(str);
        if (interfaceC815880VzW == null) {
            return null;
        }
        return interfaceC815880VzW.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService
    public final C0WGR LJIIIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return LJIIJJI().LIZIZ(context);
        }
        return C0WGR.UNKNOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0WHR] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0WHR] */
    @Override // com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService
    public final boolean LJFF(String str, boolean z) {
        C0WHS.LIZ.getClass();
        if (z) {
            C0WHU c0whuLJIIIIZZ = ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LJIIIIZZ(str);
            if (c0whuLJIIIIZZ != 0) {
                c0whuLJIIIIZZ.LIZ(new InterfaceC1587510rPh(str) { // from class: X.0WHR
                    @Override // X.InterfaceC1587510rPh
                    public final void LIZ() {
                        C0WHS.LIZ.getClass();
                        C0WHS.LIZJ.LJ();
                        ((Keva) C0WHS.LIZIZ.getValue()).storeLong("key_guide_show_timestamp", System.currentTimeMillis());
                    }
                });
                return true;
            }
            return true;
        }
        if (!C1387310mCn.LJFF(((Keva) C0WHS.LIZIZ.getValue()).getLong("key_guide_show_timestamp", 0L)) && !C0WHS.LIZJ.LJI()) {
            C0WHU c0whuLJIIIIZZ2 = ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LJIIIIZZ(str);
            if (c0whuLJIIIIZZ2 == 0) {
                return true;
            }
            c0whuLJIIIIZZ2.LIZ(new InterfaceC1587510rPh(str) { // from class: X.0WHR
                @Override // X.InterfaceC1587510rPh
                public final void LIZ() {
                    C0WHS.LIZ.getClass();
                    C0WHS.LIZJ.LJ();
                    ((Keva) C0WHS.LIZIZ.getValue()).storeLong("key_guide_show_timestamp", System.currentTimeMillis());
                }
            });
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService
    public final void LJ(String str, String str2, String str3, String str4) {
        C0WHP.LIZ = str;
        IncentiveLauncherShortcutAddItem incentiveLauncherShortcutAddItemLIZ = C0WHP.LIZ();
        if (incentiveLauncherShortcutAddItemLIZ == null) {
            C0WHP.LIZIZ.config.add(new IncentiveLauncherShortcutAddItem(str, str2, str3, str4));
        } else {
            incentiveLauncherShortcutAddItemLIZ.LIZ = str2;
            incentiveLauncherShortcutAddItemLIZ.LIZIZ = str3;
            incentiveLauncherShortcutAddItemLIZ.LIZJ = str4;
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService
    public final boolean LJII(Context context, C816040Vzm c816040Vzm, AwS192S1100000_13 awS192S1100000_13, AwS127S1100000_13 awS127S1100000_13) {
        boolean z;
        String str;
        if (LJIIIZ(context) != C0WGR.DENIED && LJIIIZ(context) != C0WGR.ASK) {
            z = false;
        } else {
            z = true;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJII = false;
        if (z) {
            c1397580mTM.LJFF(2131835535);
            c1397580mTM.LIZ(2131835534);
            C985403tE.LIZ(c1397580mTM, new AwS101S0400000_2(awS192S1100000_13, this, context, c816040Vzm, 15));
            str = "setting";
        } else {
            C2162808de.LIZ.getClass();
            if (Intrinsics.LJFF(C2162808de.LIZIZ().LIZ, "miui")) {
                return false;
            }
            c1397580mTM.LJFF(2131835531);
            c1397580mTM.LIZ(2131835530);
            C985403tE.LIZ(c1397580mTM, new AwS368S0200000_2(c816040Vzm, awS192S1100000_13, 160));
            str = "notice";
        }
        awS127S1100000_13.invoke(str);
        new C1397510mTF(c1397580mTM).LIZLLL();
        return true;
    }
}
