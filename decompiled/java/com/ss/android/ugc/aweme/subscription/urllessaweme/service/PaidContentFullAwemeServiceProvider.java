package com.ss.android.ugc.aweme.subscription.urllessaweme.service;

import X.C01GW;
import X.C0SC3;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC717320SBu;
import X.InterfaceC726100Se0;
import X.InterfaceC734540Src;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PaidContentFullAwemeServiceProvider implements IPaidContentFullAwemeService {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(210));
    public volatile C0SC3 LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PaidContentFullAwemeServiceProvider.class, "paidContentFullAwemeService", "getPaidContentFullAwemeService()Lcom/ss/android/ugc/aweme/subscription/service/IPaidContentFullAwemeService;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0SC3, com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService] */
    public final IPaidContentFullAwemeService LJ() {
        C0SC3 c0sc3 = this.LIZIZ;
        if (c0sc3 == null) {
            synchronized (this) {
                c0sc3 = this.LIZIZ;
                if (c0sc3 == null) {
                    final InterfaceC734540Src interfaceC734540SrcLIZIZ = ((InterfaceC726100Se0) this.LIZ.getValue()).LIZIZ();
                    final InterfaceC717320SBu interfaceC717320SBuLIZ = ((InterfaceC726100Se0) this.LIZ.getValue()).LIZ();
                    ((InterfaceC726100Se0) this.LIZ.getValue()).LIZLLL();
                    ?? r0 = new IPaidContentFullAwemeService(interfaceC734540SrcLIZIZ, interfaceC717320SBuLIZ) { // from class: X.0SC3
                        public final InterfaceC734540Src LIZ;
                        public final InterfaceC717320SBu LIZIZ;
                        public final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(520));

                        {
                            this.LIZ = interfaceC734540SrcLIZIZ;
                            this.LIZIZ = interfaceC717320SBuLIZ;
                        }

                        @Override // com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService
                        public final boolean LIZ(String str, List list) {
                            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "sov_on_profile_filter_removed_is_enabled", true, true) && C0SC4.LIZ()) {
                                Aweme aweme = null;
                                Object obj = null;
                                if (list != null) {
                                    Iterator it2 = list.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        Object next = it2.next();
                                        if (Intrinsics.LJFF(((Aweme) next).getAid(), str)) {
                                            obj = next;
                                            break;
                                        }
                                    }
                                    aweme = (Aweme) obj;
                                }
                                if (((C0K77) C0SC5.LIZ.getValue()).LJIILL(aweme)) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }

                        @Override // com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService
                        public final List<Aweme> LIZIZ(List<? extends Aweme> list, boolean z) {
                            ArrayList arrayList = new ArrayList();
                            for (Aweme aweme : list) {
                                Aweme aweme2 = aweme;
                                C01GW c01gw = C0SC5.LIZ;
                                if (!((C0K77) c01gw.getValue()).LJIJJ(aweme2) || !z || (((Boolean) C281350B0z.LIZ.getValue()).booleanValue() && ((C0K77) c01gw.getValue()).LJJI(aweme2.getAuthor()))) {
                                    arrayList.add(aweme);
                                }
                            }
                            return arrayList;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService
                        public final List<Aweme> LIZJ(String str, List<? extends Aweme> list) {
                            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "sov_on_profile_filter_removed_is_enabled", true, true)) {
                                Object obj = null;
                                if (((Boolean) C281350B0z.LIZ.getValue()).booleanValue()) {
                                    Iterator it2 = list.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        Object next = it2.next();
                                        if (Intrinsics.LJFF(((Aweme) next).getAid(), str)) {
                                            if (next != null) {
                                                return LIZIZ(list, false);
                                            }
                                        }
                                    }
                                    return LIZIZ(list, false);
                                }
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next2 = it3.next();
                                    if (Intrinsics.LJFF(((Aweme) next2).getAid(), str)) {
                                        obj = next2;
                                        break;
                                    }
                                }
                                Aweme aweme = (Aweme) obj;
                                if (aweme == null || ((C0K77) this.LIZJ.getValue()).LJJI(aweme.getAuthor())) {
                                    return list;
                                }
                                return LIZIZ(list, false);
                            }
                            return list;
                        }

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Removed duplicated region for block: B:103:0x012a A[RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:112:0x013f  */
                        /* JADX WARN: Removed duplicated region for block: B:113:0x0141  */
                        /* JADX WARN: Removed duplicated region for block: B:149:0x018e A[RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
                        /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
                        @Override // com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.String LIZLLL(java.lang.String r17, java.lang.String r18, java.lang.String r19, com.ss.android.ugc.aweme.feed.model.Aweme r20) {
                            /*
                                Method dump skipped, instruction units count: 462
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0SC3.LIZLLL(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
                        }
                    };
                    this.LIZIZ = r0;
                    return r0;
                }
            }
        }
        return c0sc3;
    }

    @Override // com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService
    public final boolean LIZ(String str, List list) {
        return LJ().LIZ(str, list);
    }

    @Override // com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService
    public final List<Aweme> LIZIZ(List<? extends Aweme> list, boolean z) {
        return LJ().LIZIZ(list, z);
    }

    @Override // com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService
    public final List<Aweme> LIZJ(String str, List<? extends Aweme> list) {
        return LJ().LIZJ(str, list);
    }

    @Override // com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService
    public final String LIZLLL(String str, String str2, String str3, Aweme aweme) {
        return LJ().LIZLLL(str, str2, str3, aweme);
    }
}
