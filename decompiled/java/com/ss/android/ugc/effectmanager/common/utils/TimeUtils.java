package com.ss.android.ugc.effectmanager.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeUtils {
    public static final TimeUtils INSTANCE = new TimeUtils();

    public final String currentTime() {
        return new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS").format(new Date());
    }
}
