package com.ss.android.ugc.aweme.service;

import X.C0P0T;
import X.C1163430gNh;
import X.C1348740lCa;
import X.C1356630lPJ;
import X.C19628911qx;
import X.C19EG;
import X.C2246331Cw3;
import X.InterfaceC1348870lCn;
import X.InterfaceC1356670lPN;
import X.InterfaceC20613315lL;
import X.InterfaceC316600Cb4;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.model.MentionRecommendQueryRequest;
import com.ss.android.ugc.aweme.model.MentionRecommendResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public interface IMentionService {
    InterfaceC1356670lPN LIZ(C19628911qx c19628911qx, C19EG c19eg, ViewGroup viewGroup, String str, String str2, String str3, boolean z);

    InterfaceC1348870lCn LIZIZ(String str, Map map, C1348740lCa c1348740lCa, Fragment fragment, C1163430gNh c1163430gNh);

    InterfaceC1356670lPN LIZJ(C2246331Cw3 c2246331Cw3, UIAssem uIAssem);

    InterfaceC1356670lPN LIZLLL(String str, C1356630lPJ c1356630lPJ, UIAssem uIAssem, int i, int i2, String str2);

    C0P0T LJ(Context context, PointF pointF, String str, String str2, View.OnClickListener onClickListener);

    MentionRecommendResponse LJFF(MentionRecommendQueryRequest mentionRecommendQueryRequest);

    int LJI();

    InterfaceC1348870lCn LJII(String str, Map map, InterfaceC20613315lL interfaceC20613315lL, UIAssem uIAssem, C1163430gNh c1163430gNh);

    InterfaceC316600Cb4 LJIIIIZZ();

    InterfaceC1356670lPN LJIIIZ(InterfaceC20613315lL interfaceC20613315lL, C19EG c19eg, int i, String str, String str2, String str3, String str4, String str5, boolean z, Boolean bool, MentionListCellStyle mentionListCellStyle);
}
