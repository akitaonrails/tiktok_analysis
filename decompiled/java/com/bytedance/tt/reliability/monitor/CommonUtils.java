package com.bytedance.tt.reliability.monitor;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes14.dex */
public class CommonUtils {
    public static boolean resourceHasPackage(int i) {
        return (i >>> 24) != 0;
    }

    public static String getLayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("width-->");
        int i = layoutParams.width;
        if (i == -1) {
            sb.append(" MATCH_PARENT");
        } else if (i == -2) {
            sb.append(" WRAP_CONTENT");
        } else {
            sb.append(i);
        }
        sb.append(" height--->");
        int i2 = layoutParams.height;
        if (i2 == -1) {
            sb.append(" MATCH_PARENT");
        } else if (i2 == -2) {
            sb.append(" WRAP_CONTENT");
        } else {
            sb.append(i2);
        }
        return sb.toString();
    }

    public static String getViewResourceId(View view) {
        String resourcePackageName;
        if (view == null) {
            return "-1";
        }
        int id = view.getId();
        Resources resources = view.getResources();
        if (id != -1 && resources != null) {
            StringBuilder sb = new StringBuilder(" #");
            sb.append(Integer.toHexString(id));
            if (id > 0) {
                try {
                    if (resourceHasPackage(id)) {
                        int i = (-16777216) & id;
                        if (i != 16777216) {
                            if (i == 2130706432) {
                                resourcePackageName = "app";
                            } else {
                                resourcePackageName = resources.getResourcePackageName(id);
                            }
                        } else {
                            resourcePackageName = "android";
                        }
                        String resourceTypeName = resources.getResourceTypeName(id);
                        String resourceEntryName = resources.getResourceEntryName(id);
                        sb.append(" ");
                        sb.append(resourcePackageName);
                        sb.append(":");
                        sb.append(resourceTypeName);
                        sb.append("/");
                        sb.append(resourceEntryName);
                        return sb.toString();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return "-1";
    }

    public static String transformTime(long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat.format(new Date(j));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "unknown";
        }
    }
}
