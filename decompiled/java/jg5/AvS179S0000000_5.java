package jg5;

import X.AbstractC20611515l3;
import X.AbstractC371450EhL;
import X.C0EI6;
import X.C0ELF;
import X.C1DRG;
import X.C351770Dqh;
import X.C358100E2e;
import X.C361890EGt;
import X.C362910EKr;
import X.C362980EKy;
import X.InterfaceC2189708hz;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: loaded from: classes6.dex */
public class AvS179S0000000_5 extends AbstractC20611515l3 {
    public final int $t;

    /* JADX WARN: Type inference failed for: r0v12, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.08hz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.08hz, java.lang.Object] */
    @Override // X.AbstractC20611515l3
    public final InterfaceC2189708hz LIZIZ(C1DRG c1drg) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c1drg);
            case 1:
                return LIZIZ$1(this, c1drg);
            case 2:
                return LIZIZ$2(this, c1drg);
            case 3:
                return LIZIZ$3(this, c1drg);
            case 4:
                return LIZIZ$4(this, c1drg);
            case 5:
                return LIZIZ$5(this, c1drg);
            case 6:
                return LIZIZ$6(this, c1drg);
            case 7:
                return LIZIZ$7(this, c1drg);
            case 8:
                return LIZIZ$8(this, c1drg);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LIZIZ$9(this, c1drg);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LIZIZ$10(this, c1drg);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return LIZIZ$11(this, c1drg);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LIZIZ$12(this, c1drg);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return LIZIZ$13(this, c1drg);
            case 14:
                return LIZIZ$14(this, c1drg);
            default:
                return super.LIZIZ(c1drg);
        }
    }

    public AvS179S0000000_5(int i) {
        this.$t = i;
    }

    public static final Object LIZIZ$0(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new InterfaceC2189708hz() { // from class: X.09m8
            public final Object LIZ = new Object();

            public static Keva LIZLLL() {
                AccountUserService accountUserServiceLJIIJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("keva_repo_ep_fav_mat_");
                IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
                sbLIZ.append((iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? null : accountUserServiceLJIIJ.getCurUserId());
                return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC2189708hz
            public final List<String> LIZJ(String str) {
                List<String> listLJJLL;
                synchronized (this.LIZ) {
                    try {
                        listLJJLL = C13LQ.LJJLL(LIZLLL().getStringArray(str, new String[0]));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return listLJJLL;
            }

            @Override // X.InterfaceC2189708hz
            public final void LIZ(String str, List<String> list) {
                LJ(str, new AwS582S0100000_3((List) list, (List<C0O27>) 86));
            }

            @Override // X.InterfaceC2189708hz
            public final void LIZIZ(String str, List<String> list) {
                LJ(str, new AwS582S0100000_3((List) list, (List<C0O27>) 85));
            }

            public final void LJ(String str, Function1<? super List<String>, Unit> function1) {
                ArrayList arrayList = new ArrayList(LIZJ(str));
                synchronized (this.LIZ) {
                    try {
                        function1.invoke(arrayList);
                        LIZLLL().storeStringArray(str, (String[]) arrayList.toArray(new String[0]));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        };
    }

    public static final Object LIZIZ$1(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        final C0EI6 c0ei6 = new C0EI6(c1drg);
        return new AbstractC371450EhL<C361890EGt>(c0ei6) { // from class: X.0EHv
            public final C0EI6 LIZLLL;
            public final C365910EWf LJ;
            public final C19EG LJFF;
            public final C0ELI LJI;
            public final C0E48 LJII;

            {
                this.LIZLLL = c0ei6;
                this.LJ = (C365910EWf) c0ei6.LIZ(C365910EWf.class);
                this.LJFF = (C19EG) c0ei6.LIZ(C19EG.class);
                this.LJI = (C0ELI) c0ei6.LIZ(C0ELI.class);
                this.LJII = (C0E48) c0ei6.LIZ(C0E48.class);
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
            @Override // X.AbstractC371450EhL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C361890EGt> r12) {
                /*
                    Method dump skipped, instruction units count: 359
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C362170EHv.LIZJ(X.05Vn):java.lang.Object");
            }
        };
    }

    public static final Object LIZIZ$10(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new C351770Dqh(new C0EI6(c1drg));
    }

    public static final Object LIZIZ$11(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new MutableLiveData(Boolean.FALSE);
    }

    public static final Object LIZIZ$12(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new MutableLiveData(Boolean.FALSE);
    }

    public static final Object LIZIZ$13(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new MutableLiveData(Boolean.FALSE);
    }

    public static final Object LIZIZ$14(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new MutableLiveData(Boolean.FALSE);
    }

    public static final Object LIZIZ$2(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new C362910EKr(new C0EI6(c1drg));
    }

    public static final Object LIZIZ$3(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new C0ELF(new C0EI6(c1drg));
    }

    public static final Object LIZIZ$4(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new C362980EKy(new C0EI6(c1drg));
    }

    public static final Object LIZIZ$5(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new C358100E2e(new C0EI6(c1drg));
    }

    public static final Object LIZIZ$6(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new C351770Dqh(new C0EI6(c1drg));
    }

    public static final Object LIZIZ$7(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new C362910EKr(new C0EI6(c1drg));
    }

    public static final Object LIZIZ$8(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new C362980EKy(new C0EI6(c1drg));
    }

    public static final Object LIZIZ$9(AvS179S0000000_5 avS179S0000000_5, C1DRG c1drg) {
        return new C358100E2e(new C0EI6(c1drg));
    }
}
