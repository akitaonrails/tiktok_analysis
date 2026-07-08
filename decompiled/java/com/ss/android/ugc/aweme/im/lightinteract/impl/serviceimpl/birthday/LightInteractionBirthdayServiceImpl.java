package com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.birthday;

import X.AbstractC23140094w;
import X.C01GW;
import X.C054P;
import X.C08CX;
import X.C0Z9F;
import X.C0ZMM;
import X.C0ZMR;
import X.C1340005Mg;
import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import X.C271460AkS;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1411705fn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1513605wE;
import X.InterfaceC19330810jy;
import X.InterfaceC908170Zjz;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.lightinteract.impl.model.BirthdayMultiCheckResponse;
import com.ss.android.ugc.aweme.im.lightinteract.impl.model.UserHasBirthdayInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionBirthdayServiceImpl implements InterfaceC1513605wE, InterfaceC908170Zjz {
    public static final LightInteractionBirthdayServiceImpl LL = new LightInteractionBirthdayServiceImpl();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1340005Mg());
    public static final C01GW LLILLL = C452501pT.LIZIZ(new C0Z9F());
    public static final C01GW LLILZ = C452501pT.LIZIZ(new C054P());
    public static final C01GW LLILZIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(132));

    public interface BirthdayApi {
        public static final C0ZMR LIZ = C0ZMR.LIZ;

        @InterfaceC1501160pAQ("im/light_interaction/get_celebration_status")
        Object birthdayMultiCheck(@InterfaceC1501070pAH("uids") String str, InterfaceC1364105Vn<? super BirthdayMultiCheckResponse> interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1513605wE
    public final InterfaceC19330810jy LJJJJZ() {
        return (InterfaceC19330810jy) LLILLL.getValue();
    }

    public final Keva LJII(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("light_interaction_birthday_");
        sbLIZ.append(str);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1513605wE
    public final boolean LJIILL(String str) {
        long jCurrentTimeMillis;
        if (C271460AkS.LIZ() && !C0ZMM.LL.LJJJ()) {
            InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) LLILZ.getValue();
            IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi != null) {
                jCurrentTimeMillis = iMHostApi.LIZIZ();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (interfaceC1411705fn.LIZIZ(jCurrentTimeMillis, str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1513605wE
    public final void LJJIII(List<String> list) {
        if (!C271460AkS.LIZ()) {
            return;
        }
        ((AtomicReference) LLILLJJLI.getValue()).set(C13LP.LLIIII(list));
    }

    public static Set LIZLLL(BirthdayMultiCheckResponse birthdayMultiCheckResponse, Keva keva) {
        String string;
        Boolean bool;
        List<UserHasBirthdayInfo> list = birthdayMultiCheckResponse.userHasBirthdayInfo;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (UserHasBirthdayInfo userHasBirthdayInfo : list) {
                Long l = userHasBirthdayInfo.uid;
                if (l != null && (string = l.toString()) != null && (bool = userHasBirthdayInfo.hasBirthday) != null) {
                    if (bool.booleanValue()) {
                        keva.storeBoolean(string, true);
                        arrayList.add(string);
                    } else {
                        keva.erase(string);
                    }
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            if (setLLIIJI != null) {
                return setLLIIJI;
            }
        }
        return C08CX.INSTANCE;
    }

    public static boolean LJIIIZ(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return true;
        }
        return false;
    }

    public final boolean LJFF(long j, String str, String str2) {
        if (!C271460AkS.LIZ()) {
            return false;
        }
        long j2 = LJII(str2).getLong("fetch_timing_ms", -1L);
        if (j2 == -1 || !LJIIIZ(j2, j)) {
            return false;
        }
        return LJII(str2).contains(str);
    }

    @Override // X.InterfaceC1513605wE
    public final Object LJJJLIIL(long j, String str, AbstractC23140094w abstractC23140094w) {
        List list = (List) ((AtomicReference) LLILLJJLI.getValue()).get();
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        return LIZJ(j, str, list, abstractC23140094w);
    }

    @Override // X.InterfaceC1513605wE
    public final void LJJL(long j, String str, String str2) {
        if (!C271460AkS.LIZ()) {
            return;
        }
        Keva kevaLJII = LJII(str2);
        long j2 = kevaLJII.getLong("fetch_timing_ms", -1L);
        if (j2 != -1) {
            if (LJIIIZ(j2, j)) {
                kevaLJII.storeBoolean(str, true);
                return;
            } else {
                if (j2 >= j) {
                    return;
                }
                kevaLJII.clear();
                kevaLJII.storeLong("fetch_timing_ms", j);
                kevaLJII.storeBoolean(str, true);
                return;
            }
        }
        kevaLJII.storeLong("fetch_timing_ms", j);
        kevaLJII.storeBoolean(str, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(long r27, java.lang.String r29, java.util.List r30, X.InterfaceC1364105Vn r31) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.birthday.LightInteractionBirthdayServiceImpl.LIZJ(long, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (!C271460AkS.LIZ()) {
            return;
        }
        ((AtomicReference) LLILLJJLI.getValue()).set(C13BV.INSTANCE);
    }
}
