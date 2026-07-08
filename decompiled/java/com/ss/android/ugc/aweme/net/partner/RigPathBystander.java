package com.ss.android.ugc.aweme.net.partner;

import X.C080U;
import X.C0X52;
import X.C2097608Jq;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.experiment.RigPathBystanderSettings;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class RigPathBystander implements NetworkPartner.Bystander, AttachUserData {
    public static final RigPathBystander LIZ;
    public static final RigPathBystanderSettings.RigPathConfig LIZIZ;
    public static volatile int LIZJ;
    public static final CopyOnWriteArrayList<String> LIZLLL;
    public static volatile int LJ;
    public static final CopyOnWriteArrayList<String> LJFF;
    public static volatile int LJI;
    public static final CopyOnWriteArrayList<String> LJII;

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    static {
        RigPathBystander rigPathBystander = new RigPathBystander();
        LIZ = rigPathBystander;
        Npth.addAttachUserData(rigPathBystander, CrashType.ALL);
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        RigPathBystanderSettings.RigPathConfig rigPathConfig = RigPathBystanderSettings.LIZ;
        RigPathBystanderSettings.RigPathConfig rigPathConfig2 = (RigPathBystanderSettings.RigPathConfig) settingsManagerLIZLLL.LJIIIIZZ("rig_path_config", RigPathBystanderSettings.RigPathConfig.class, rigPathConfig);
        if (rigPathConfig2 != null) {
            rigPathConfig = rigPathConfig2;
        }
        LIZIZ = rigPathConfig;
        LIZLLL = new CopyOnWriteArrayList<>(Collections.nCopies(rigPathConfig.cacheSizeCustom, ""));
        LJFF = new CopyOnWriteArrayList<>(Collections.nCopies(3, ""));
        LJII = new CopyOnWriteArrayList<>(Collections.nCopies(3, ""));
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        return C2097608Jq.LJIIJ(new Pair("paths_in_crash_ext", LIZLLL.toString()), new Pair("paths_in_crash_feed", LJFF.toString()), new Pair("paths_in_crash_detail", LJII.toString()));
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        List<C080U> list;
        String path = request.getPath();
        List<String> list2 = LIZIZ.pathFilter;
        if (!TextUtils.isEmpty(path)) {
            if (list2 != null) {
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (a0.LJJIIZI(path, it2.next(), false)) {
                        return;
                    }
                }
            }
            String str = "";
            if (c0x52 != null && (list = c0x52.LIZ.LIZLLL) != null) {
                for (C080U c080u : list) {
                    if (Intrinsics.LJFF(c080u.LIZ, "x-tt-logid")) {
                        str = c080u.LIZIZ;
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(request.getHost());
            sbLIZ.append('+');
            sbLIZ.append(request.getPath());
            sbLIZ.append('+');
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            LIZJ %= LIZIZ.cacheSizeCustom;
            LIZLLL.set(LIZJ, strLIZIZ);
            LIZJ++;
            if (!TextUtils.isEmpty(path) && a0.LJJIIZI(path, "/aweme/v2/feed", false)) {
                LJ %= 3;
                LJFF.set(LJ, strLIZIZ);
                LJ++;
            }
            if (!TextUtils.isEmpty(path) && a0.LJJIIZI(path, "/aweme/v1/aweme/detail", false)) {
                LJI %= 3;
                LJII.set(LJI, strLIZIZ);
                LJI++;
            }
        }
    }
}
