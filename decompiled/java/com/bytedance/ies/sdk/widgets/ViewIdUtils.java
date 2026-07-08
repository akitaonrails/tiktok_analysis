package com.bytedance.ies.sdk.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewIdUtils {
    public static final ViewIdUtils INSTANCE = new ViewIdUtils();

    public static final String getIdName(View view) {
        if (view == null) {
            return "null";
        }
        int id = view.getId();
        if (id == -1) {
            return "no-id";
        }
        try {
            String resourceName = view.getContext().getResources().getResourceName(id);
            int iLJJJ = a0.LJJJ(resourceName, "id/", 0, false, 6);
            if (iLJJJ < 0) {
                return resourceName;
            }
            return resourceName.substring(iLJJJ + 3);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return "id-not-found";
        }
    }

    public static final String getIdName(Context context, int i) {
        if (i == -1) {
            return "no-id";
        }
        try {
            String resourceName = context.getResources().getResourceName(i);
            int iLJJJ = a0.LJJJ(resourceName, "id/", 0, false, 6);
            if (iLJJJ < 0) {
                return resourceName;
            }
            return resourceName.substring(iLJJJ + 3);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return "id-not-found";
        }
    }
}
