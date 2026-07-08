package com.ss.android.ugc.aweme.compliance.api.services.report;

import X.InterfaceC1294060jmO;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC1294060jmO
public interface IReportService {
    void LIZ(String str, String str2, String str3, String str4, String str5, String str6);

    @InterfaceC1294060jmO
    void LIZIZ(Activity activity, Uri.Builder builder);

    @InterfaceC1294060jmO
    void LIZJ(Activity activity, Uri.Builder builder);

    String LIZLLL(Aweme aweme);

    @InterfaceC1294060jmO
    void LJ(Activity activity, Aweme aweme, String str);

    void LJFF(Map<String, String> map);

    String LJI(String str);

    void LJII(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, String str8, String str9, Context context, String str10, int i, String str11);

    @InterfaceC1294060jmO
    void report(Activity activity, Uri.Builder builder, Bundle bundle);
}
