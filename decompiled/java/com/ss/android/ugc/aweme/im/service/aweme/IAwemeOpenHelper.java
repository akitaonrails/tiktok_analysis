package com.ss.android.ugc.aweme.im.service.aweme;

import X.C0Z92;
import X.C0ZU4;
import X.C1720706oX;
import X.C869590Y9l;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface IAwemeOpenHelper {
    public static final C1720706oX LIZ = C1720706oX.LIZ;

    void LIZ(String str, Aweme aweme, String str2, String str3, String str4, SessionInfo sessionInfo, C0ZU4 c0zu4);

    void LIZIZ(Fragment fragment, String str, String str2, String str3, User user, String str4, SessionInfo sessionInfo, C869590Y9l c869590Y9l);

    void LIZJ(Context context, Long l, String str, String str2, SessionInfo sessionInfo);

    void LIZLLL(Context context, String str, SessionInfo sessionInfo, String str2, String str3, boolean z);

    void LJ(Context context, C0Z92 c0z92, Aweme aweme, int i, List<? extends C869590Y9l> list, String str, C869590Y9l c869590Y9l, SessionInfo sessionInfo, String str2, boolean z, String str3, String str4, String str5, View view, String str6, C0ZU4 c0zu4);

    void LJFF(Context context, SessionInfo sessionInfo);

    void LJI(Context context, C0Z92 c0z92, int i, String str, C869590Y9l c869590Y9l, SessionInfo sessionInfo, String str2, String str3);
}
