package com.ss.android.ugc.tiktok.ban;

import X.AnonymousClass1006;
import X.C100C;
import X.C1519390pdp;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.ARunnableS128S0100000_28;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UserBanAdapterServiceImpl implements IUserBanAdapterService {
    @Override // com.ss.android.ugc.tiktok.ban.IUserBanAdapterService
    public final UserBanInitTask initialize() {
        return new UserBanInitTask();
    }

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanAdapterService
    public final void LIZ(Integer num, final String str, Map map) {
        AnonymousClass1006.LIZ();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from_ban_url", str);
            String path = UriProtector.parse(str).getPath();
            if (path != null) {
                linkedHashMap2.put("url_path", path);
            }
        }
        if (num != null) {
            linkedHashMap.put("error_code", Integer.valueOf(num.intValue()));
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (num != null) {
            if (num.intValue() != 1091 && num.intValue() != 1092 && num.intValue() != 1093) {
                if (num.intValue() == 9) {
                    if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                        IUserBanDepService.LIZ.getClass();
                        linkedHashMap.put("user_id_str", C1519390pdp.LIZ().getUserId());
                        AnonymousClass1006.LIZ().LIZ("ban_type_session_ban", linkedHashMap);
                        return;
                    }
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS128S0100000_28(linkedHashMap, 95));
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                AnonymousClass1006.LIZ().LIZ("ban_type_sessionless_ban", linkedHashMap);
                C100C.LIZ.LIZJ().LIZ("pns_ban_sessionless_ban_trigger", linkedHashMap2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UserBan Triggered. BanType: ban_type_sessionless_ban, enterFromUrl: ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0zzz
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("UserBanAdapterServiceImpl@f71e.tryTriggerBanWith$$inlined$runOnMain$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("UserBanAdapterServiceImpl@f71e.tryTriggerBanWith$$inlined$runOnMain$1");
                }

                public final void LIZ() {
                    AnonymousClass1006.LIZ().LIZ("ban_type_sessionless_ban", linkedHashMap);
                    C100C.LIZ.LIZJ().LIZ("pns_ban_sessionless_ban_trigger", linkedHashMap2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("UserBan Triggered. BanType: ban_type_sessionless_ban, enterFromUrl: ");
                    sbLIZ2.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            });
        }
    }
}
