package com.ss.android.ugc.aweme;

import X.C0C64;
import X.C0XZ9;
import X.C1173920gec;
import X.EnumC1153540g7k;
import X.InterfaceC427710Gpt;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INUJAgeRangeService;
import com.ss.android.ugc.aweme.journey.INewUserJourneyAppDiffService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes29.dex */
public class NUJAgeRangeService implements INUJAgeRangeService {
    public final Keva LIZ = Keva.getRepo("nuj_age_range");
    public boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.journey.INUJAgeRangeService
    public final C0XZ9 LIZ() {
        LIZLLL();
        int i = this.LIZ.getInt("age_gate_range_lower", -1);
        int i2 = this.LIZ.getInt("age_gate_range_upper", -1);
        long j = this.LIZ.getLong("age_gate_range_entry_time", 0L);
        if (i <= 0 || j <= 0) {
            return null;
        }
        boolean z = i >= 18;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i3 = calendar.get(1);
        int i4 = (i3 - (i2 > 0 ? i2 : i)) - 1;
        int i5 = i3 - i;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);
        if (this.LIZ.getString("age_gate_assumed_birthday", "").length() <= 0) {
            C1173920gec.LIZ(i, j);
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(i4, 0, 1);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(i5, 11, 31);
        return new C0XZ9(Integer.valueOf(i), i2 > 0 ? Integer.valueOf(i2) : null, simpleDateFormat.format(calendar2.getTime()), simpleDateFormat.format(calendar3.getTime()), z);
    }

    public final void LIZLLL() {
        AccountUserService accountUserServiceLJIIJ;
        INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
        if (iNewUserJourneyAppDiffService != null) {
            iNewUserJourneyAppDiffService.LIZIZ();
        }
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return;
        }
        accountUserServiceLJIIJ.LJJIFFI(new InterfaceC427710Gpt() { // from class: X.10Wa
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                this.LL.LIZ.clear();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJAgeRangeService
    public final boolean LIZIZ(EnumC1153540g7k enumC1153540g7k) {
        if (enumC1153540g7k == EnumC1153540g7k.OTHER) {
            return false;
        }
        LIZLLL();
        return C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "simplify_age_input_v2", false, false);
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJAgeRangeService
    public final void LIZJ(Integer num, Integer num2) {
        LIZLLL();
        if (num != null) {
            num.intValue();
            this.LIZ.storeInt("age_gate_range_lower", num.intValue());
            if (num2 != null) {
                this.LIZ.storeInt("age_gate_range_upper", num2.intValue());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.LIZ.contains("age_gate_range_entry_time")) {
                this.LIZ.storeLong("age_gate_range_entry_time", System.currentTimeMillis());
            }
            this.LIZ.storeString("age_gate_assumed_birthday", C1173920gec.LIZ(num.intValue(), this.LIZ.getLong("age_gate_range_entry_time", jCurrentTimeMillis)));
        }
    }
}
