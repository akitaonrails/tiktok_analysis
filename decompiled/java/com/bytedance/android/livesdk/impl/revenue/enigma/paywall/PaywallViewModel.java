package com.bytedance.android.livesdk.impl.revenue.enigma.paywall;

import X.AnonymousClass0950;
import X.C0IJT;
import X.C1094360eaI;
import X.C1094450eaR;
import X.C1161920gLG;
import X.C1556170qb9;
import X.C20513115On;
import X.C2188811AlT;
import X.C2252331DDr;
import X.C23250099c;
import X.C2327809Ae;
import X.C319090Cf5;
import X.C338960DQo;
import X.C474500IjA;
import X.C814420VxA;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaPurchaseService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes32.dex */
public final class PaywallViewModel extends ViewModel {
    public final Bundle LL;
    public final boolean LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public WeakReference<Context> LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final long LLJ;
    public final MutableLiveData<C20513115On> LLJI;
    public final C2252331DDr LLJIJIL;
    public final AnonymousClass0950 LLJILJIL;
    public final MutableLiveData LLJILJILJ;
    public C338960DQo LLJILLL;

    public static boolean CQ2() {
        return Intrinsics.LJFF(((IEnigmaPurchaseService) C1161920gLG.LIZJ(IEnigmaPurchaseService.class)).LM(), "BG");
    }

    public final String AQ2() {
        Bundle bundle = this.LL;
        String strLIZIZ = "";
        if (bundle != null) {
            long j = bundle.getLong("subscription_end");
            if (j < 1000000000000L) {
                j *= 1000;
            }
            try {
                Locale locale = Locale.getDefault();
                String str = (Intrinsics.LJFF(locale, Locale.CHINA) || Intrinsics.LJFF(locale, Locale.CHINESE) || Intrinsics.LJFF(locale, Locale.SIMPLIFIED_CHINESE) || Intrinsics.LJFF(locale, Locale.TRADITIONAL_CHINESE)) ? "日" : "";
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(new SimpleDateFormat("MMM d", locale).format(new Date(j)));
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                return strLIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strLIZIZ;
    }

    public final boolean DQ2() {
        Bundle bundle;
        Bundle bundle2 = this.LL;
        return bundle2 != null && bundle2.getInt("sub_type", -1) == 2 && (bundle = this.LL) != null && bundle.getInt("sub_status", -1) == 2;
    }

    public final void EQ2() {
        String string;
        String str = this.LLILZ == 2 ? "purchase_month" : "purchase_week";
        Bundle bundle = this.LL;
        if (bundle == null || (string = bundle.getString("from")) == null) {
            string = "";
        }
        int iBQ2 = BQ2();
        String strGQ2 = GQ2();
        String str2 = this.LLILZ == 2 ? "buy_month" : "buy_week";
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_second_page_click");
        c474500IjALIZ.LJJII(strGQ2, "detail_page_version");
        c474500IjALIZ.LJJII(str, "page_type");
        c474500IjALIZ.LJJII(string, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(iBQ2), "user_level");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LIZ();
    }

    public final void FQ2() {
        String string;
        String str = this.LLILZ == 2 ? "purchase_month" : "purchase_week";
        Bundle bundle = this.LL;
        if (bundle == null || (string = bundle.getString("from")) == null) {
            string = "";
        }
        int iBQ2 = BQ2();
        String strGQ2 = GQ2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_second_page_show");
        c474500IjALIZ.LJJII(strGQ2, "detail_page_version");
        c474500IjALIZ.LJJII(str, "page_type");
        c474500IjALIZ.LJJII(string, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(iBQ2), "user_level");
        c474500IjALIZ.LIZ();
    }

    public final String GQ2() {
        C1094360eaI c1094360eaIHP;
        Bundle bundle = this.LL;
        int i = bundle != null ? bundle.getInt("sub_type", -1) : -1;
        boolean z = this.LLILLJJLI;
        Bundle bundle2 = this.LL;
        int i2 = bundle2 != null ? bundle2.getInt("sub_status", -1) : -1;
        if (i2 == 1 && i == 1) {
            return "1week_users";
        }
        if (i2 == 1) {
            if (i == 2) {
                return "subs_users";
            }
        } else {
            if (i2 == 4) {
                return "expired_users";
            }
            if (i2 == 3) {
                return "renewal_failed";
            }
        }
        if (z) {
            return "before_first_purchase";
        }
        int iBQ2 = BQ2();
        IUserLevelService iUserLevelService = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
        return iBQ2 < 26 ? "does_not_meet_the_level_requirement" : (iUserLevelService == null || (c1094360eaIHP = iUserLevelService.HP()) == null || c1094360eaIHP.LJFF != 2) ? false : true ? "gifter_level_opt_out" : "before_first_purchase";
    }

    public final String HQ2() {
        return this.LLIZLLLIL ? this.LLILZ == 2 ? "subs_users" : "1week_users" : GQ2();
    }

    public static int BQ2() {
        try {
            int iTD2 = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).TD2(UserService.getInstance().user().LJIJJLI().getBadgeList());
            if (iTD2 >= 0) {
                return iTD2;
            }
            C1094360eaI c1094360eaI = C1094450eaR.LIZ;
            if (c1094360eaI != null) {
                return c1094360eaI.LIZ;
            }
            return -1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1094360eaI c1094360eaI2 = C1094450eaR.LIZ;
            if (c1094360eaI2 != null) {
                return c1094360eaI2.LIZ;
            }
            return -1;
        }
    }

    public static String vQ2(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt) || cCharAt == '.') {
                sb.append(cCharAt);
            }
        }
        if (C2327809Ae.LJII(sb.toString()) != null) {
            return yQ2(C814420VxA.LIZJ(C814420VxA.LIZJ(r0.doubleValue() * ((double) 1000000)) * 1.95583d), "BGN");
        }
        return null;
    }

    public final void kK0(int i) {
        if (this.LLILZ == i) {
            return;
        }
        this.LLILZ = i;
        FQ2();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C319090Cf5(this, i, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PaywallViewModel(android.content.Context r42, android.os.Bundle r43) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.enigma.paywall.PaywallViewModel.<init>(android.content.Context, android.os.Bundle):void");
    }

    public static String yQ2(long j, String str) {
        try {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
            currencyInstance.setCurrency(Currency.getInstance(str));
            return currencyInstance.format(j / 1000000.0d);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static C1556170qb9 zQ2(long j, String str) {
        String strYQ2 = yQ2(j, str);
        if (!CQ2()) {
            return new C1556170qb9(strYQ2, null);
        }
        return new C1556170qb9(strYQ2, u.LJJIFFI(yQ2(C814420VxA.LIZJ(j * 1.95583d), "BGN"), "BGN", "лв", false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0CfB] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IQ2(tikcast.api.privilege.enigma.EnigmaProductsResponse.Data.EnigmaIAPProductDetails r16, java.lang.String r17) {
        /*
            r15 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r15.LLILZIL
            if (r0 == 0) goto L51
            java.lang.Object r6 = r0.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r6 == 0) goto L51
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaPurchaseService> r0 = com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaPurchaseService.class
            X.006A r5 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaPurchaseService r5 = (com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaPurchaseService) r5
            long r7 = r15.LLILLL
            android.os.Bundle r1 = r15.LL
            if (r1 == 0) goto L79
            java.lang.String r0 = "contractId"
            java.lang.String r10 = r1.getString(r0)
        L20:
            android.os.Bundle r1 = r15.LL
            r4 = -1
            if (r1 == 0) goto L77
            java.lang.String r0 = "sub_type"
            int r3 = r1.getInt(r0, r4)
        L2b:
            android.os.Bundle r1 = r15.LL
            if (r1 == 0) goto L35
            java.lang.String r0 = "sub_status"
            int r4 = r1.getInt(r0, r4)
        L35:
            int r0 = r15.LLILZ
            r2 = 2
            r1 = 1
            if (r0 == r2) goto L75
            r0 = 1
        L3c:
            if (r3 != 0) goto L59
            if (r4 != r1) goto L52
            if (r0 == 0) goto L56
            X.15Oo r13 = X.EnumC20513215Oo.PURCHASE_WEEKLY_FROM_COIN
        L44:
            X.0CfB r14 = new X.0CfB
            r14.<init>()
            r9 = 0
            r12 = r17
            r11 = r16
            r5.Xj0(r6, r7, r9, r10, r11, r12, r13, r14)
        L51:
            return
        L52:
            if (r4 != r1) goto L66
            if (r0 != 0) goto L72
        L56:
            X.15Oo r13 = X.EnumC20513215Oo.PURCHASE_MONTHLY_FROM_COIN
            goto L44
        L59:
            if (r3 != r2) goto L62
            if (r4 != r2) goto L6d
            if (r0 != 0) goto L72
            X.15Oo r13 = X.EnumC20513215Oo.RESUBSCRIBE_AFTER_CANCELLATION
            goto L44
        L62:
            if (r3 == r1) goto L66
            if (r3 != 0) goto L6d
        L66:
            if (r4 != r1) goto L6d
            if (r0 != 0) goto L72
            X.15Oo r13 = X.EnumC20513215Oo.PURCHASE_MONTHLY_WITH_CURRENT_WEEKLY_ONETIME
            goto L44
        L6d:
            if (r0 != 0) goto L72
            X.15Oo r13 = X.EnumC20513215Oo.PURCHASE_MONTHLY
            goto L44
        L72:
            X.15Oo r13 = X.EnumC20513215Oo.PURCHASE_WEEKLY
            goto L44
        L75:
            r0 = 0
            goto L3c
        L77:
            r3 = -1
            goto L2b
        L79:
            r10 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.enigma.paywall.PaywallViewModel.IQ2(tikcast.api.privilege.enigma.EnigmaProductsResponse$Data$EnigmaIAPProductDetails, java.lang.String):void");
    }

    public final String wQ2(String str, String str2) {
        Context context = this.LLILZIL.get();
        if (context == null) {
            return "";
        }
        if (str2 != null) {
            if (DQ2()) {
                return context.getString(2131852113, str2, str);
            }
            return context.getString(2131852116, str2, str);
        }
        if (DQ2()) {
            return context.getString(2131852112, str);
        }
        return context.getString(2131852115, str);
    }

    public final String xQ2(String str, String str2) {
        Context context = this.LLILZIL.get();
        if (context == null) {
            return "";
        }
        if (str2 != null) {
            return context.getString(2131852101, str2, str);
        }
        return context.getString(2131852100, str);
    }
}
