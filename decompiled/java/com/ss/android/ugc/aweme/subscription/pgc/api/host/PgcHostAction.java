package com.ss.android.ugc.aweme.subscription.pgc.api.host;

import X.C19EG;
import X.C511720K5a;
import X.C512250K7b;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public interface PgcHostAction {
    void LIZ(C19EG c19eg, Uri.Builder builder, Bundle bundle);

    boolean LIZIZ(Context context, Bundle bundle);

    void LIZJ(int i, String str, String str2, String str3, String str4, int i2, View view, C512250K7b c512250K7b, C511720K5a c511720K5a);

    Activity getTopActivity();

    Context getTopContext();
}
