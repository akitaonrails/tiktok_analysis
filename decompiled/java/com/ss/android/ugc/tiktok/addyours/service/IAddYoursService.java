package com.ss.android.ugc.tiktok.addyours.service;

import X.C0OFL;
import X.C0TGX;
import X.C19EG;
import X.C344460Deu;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewStub;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursNoticeVideosResp;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes30.dex */
public interface IAddYoursService {
    void LIZ(C0TGX c0tgx, ViewStub viewStub, C19EG c19eg);

    Pair<String, String>[] LIZIZ(Aweme aweme);

    Object LIZJ(long j, String str, List list, C344460Deu c344460Deu);

    void LIZLLL(C19EG c19eg, Aweme aweme, AddYourRecordParam addYourRecordParam);

    void LJ(Context context, Aweme aweme, TextExtraStruct textExtraStruct, String str);

    void LJFF(C19EG c19eg, String str, String str2);

    C0OFL LJI(Context context);

    boolean LJII();

    IInterceptor LJIIIIZZ();

    Object LJIIIZ(Aweme aweme, Object obj);

    Object LJIIJ(String str, InterfaceC1364105Vn<? super AddYoursStickerStruct> interfaceC1364105Vn);

    void LJIIJJI(Context context, Bundle bundle, String str, String str2, String str3);

    Object LJIIL(long j, InterfaceC1364105Vn<? super AddYoursStickerStruct> interfaceC1364105Vn);

    AddYoursNoticeVideosResp LJIILIIL(int i, long j, long j2, String str);

    void LJIILJJIL(Context context, AddYoursTopic addYoursTopic, Aweme aweme, Integer num, List<AddYoursAvatar> list, boolean z, String str, String str2, int i, String str3);
}
