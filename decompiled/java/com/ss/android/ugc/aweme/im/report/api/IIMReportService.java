package com.ss.android.ugc.aweme.im.report.api;

import X.C454970Hsl;
import X.C912520Zr0;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: loaded from: classes7.dex */
public interface IIMReportService {
    public static final C454970Hsl LIZ = C454970Hsl.LIZ;

    void LIZ(Context context, String str, IMUser iMUser, C912520Zr0 c912520Zr0);

    void report(Activity activity, Uri.Builder builder, Bundle bundle);
}
