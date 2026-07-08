package com.bytedance.touchpoint.api.touchpoint;

import X.C07UF;
import X.C1878830yzZ;
import X.InterfaceC1893920zNu;
import android.content.Context;
import android.net.Uri;
import com.bytedance.touchpoint.api.model.BottomTabBubble;
import com.bytedance.touchpoint.api.model.FeedIncentiveToast;
import com.bytedance.touchpoint.api.model.InAppPush;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.api.model.TouchPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes29.dex */
public interface ITouchPointModuleService {
    void LIZJ();

    void LIZLLL(String str, int i, String str2, InterfaceC1893920zNu interfaceC1893920zNu);

    boolean LJ();

    void LJFF();

    void LJI();

    void LJII(FeedIncentiveToast feedIncentiveToast);

    void LJIIIIZZ();

    void LJIIIZ();

    void LJIIJ();

    void LJIIJJI(TouchPoint touchPoint);

    void LJIIL(TouchPoint touchPoint);

    void LJIILIIL(ArrayList<String> arrayList, ArrayList<String> arrayList2);

    void LJIILJJIL();

    void LJIILL(String str);

    void LJIILLIIL();

    void LJIIZILJ(Context context, Uri uri, boolean z);

    void LJIJ(String str);

    void LJIJI();

    void LJIJJ(String str, String str2, String str3, boolean z, Map map, AwS595S0100000_16 awS595S0100000_16);

    void LJIJJLI(int i, int i2, String str, boolean z, boolean z2, boolean z3);

    void LJIL(ReferralFeedBanner referralFeedBanner);

    void LJJ(Integer num);

    void LJJI(InAppPush inAppPush);

    boolean LJJIFFI();

    void LJJII();

    void LJJIII(String str, C1878830yzZ c1878830yzZ);

    void LJJIIJ(Integer num, C07UF c07uf);

    void LJJIIJZLJL(boolean z);

    void LJJIIZ(BottomTabBubble bottomTabBubble);

    void LJJIIZI(int i, int i2, int i3, int i4, long j, String str);

    boolean LJJIJ(Uri uri);

    void LJJIJIIJI(Context context, Uri uri, boolean z);

    void reportDiversion(HashMap<String, Object> map);
}
