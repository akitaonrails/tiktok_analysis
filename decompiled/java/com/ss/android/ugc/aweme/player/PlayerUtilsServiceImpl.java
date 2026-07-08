package com.ss.android.ugc.aweme.player;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerUtilsServiceImpl implements IPlayerUtilsService {
    @Override // com.ss.android.ugc.aweme.player.IPlayerUtilsService
    public final boolean LIZ(long j) {
        Date date = new Date(j);
        Date date2 = new Date();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        calendar2.setTime(date2);
        if (calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1)) {
            return true;
        }
        return false;
    }
}
