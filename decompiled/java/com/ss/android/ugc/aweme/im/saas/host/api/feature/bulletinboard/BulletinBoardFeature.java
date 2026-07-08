package com.ss.android.ugc.aweme.im.saas.host.api.feature.bulletinboard;

import X.C06QQ;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation.Feature;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
@Feature(id = "bulletin_board", name = "Bulletin Board")
public interface BulletinBoardFeature {
    public static final C06QQ LIZ = C06QQ.LIZ;

    boolean LLIL();

    void LLILII(String str, boolean z);

    boolean LLILIL();

    void LLILL(Activity activity, View view, String str, Function0<Unit> function0);
}
