package com.ss.android.ugc.aweme;

import X.C0CCZ;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.search.SearchWidgetTask;
import com.ss.android.ugc.aweme.story.SocialWidgetLegoTask;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public interface IAppWidgetService {
    List<C0CCZ> LIZ();

    boolean LIZIZ(Context context);

    void LIZJ(String str, String str2);

    SocialWidgetLegoTask LIZLLL();

    PendingIntent LJ(Context context, int i, Intent intent);

    SearchWidgetTask LJFF();

    void LJI(String str, String str2);

    boolean LJII();

    void LJIIIIZZ();

    Intent LJIIIZ(Context context, String str);

    void LJIIJ(int i, int i2, String str, String str2, String str3);

    void LJIIJJI(Context context, List list);
}
