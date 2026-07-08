package com.ss.android.ugc.aweme.share;

import X.C0T11;
import X.C1371590lnR;
import X.C19292410dm;
import X.C2344009Gk;
import X.DialogC1365000lco;
import X.InterfaceC1369790lkX;
import X.InterfaceC1377740lxM;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.channel.SubscribeInviteChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveEventSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSubscribeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public interface ShareDependService {
    public static final C0T11 LIZ = C0T11.LIZ;

    void LIZIZ(Activity activity, LiveEventSharePackage liveEventSharePackage, String str, long j, Pair pair);

    boolean LIZJ(Aweme aweme);

    void LIZLLL();

    void LJ(String str, BaseSharePackage baseSharePackage);

    void LJFF(String str, Aweme aweme, Activity activity, String str2, String str3, String str4, Map<String, String> map, boolean z, boolean z2);

    void LJI(boolean z);

    TuxSheet LJII(Activity activity, C1371590lnR c1371590lnR, Bundle bundle);

    void LJIIIIZZ(String str, String str2, String str3);

    int LJIIIZ(Aweme aweme);

    void LJIIJ(String str, BaseSharePackage baseSharePackage);

    void LJIIJJI(Aweme aweme, String str);

    void LJIIL(String str, BaseSharePackage baseSharePackage);

    InterfaceC1377740lxM LJIILIIL();

    void LJIILJJIL(InterfaceC1369790lkX interfaceC1369790lkX);

    void LJIILL(Context context, String str);

    void LJIILLIIL(String str, BaseSharePackage baseSharePackage);

    void LJIIZILJ(Aweme aweme, String str, String str2, String str3, boolean z);

    void LJIJ(Aweme aweme, String str, String str2, String str3, boolean z);

    void LJIJI(Context context, String str);

    void LJIJJ(Context context, Aweme aweme, String str, String str2, String str3, String str4, boolean z, boolean z2);

    boolean LJIJJLI(Aweme aweme);

    void LJIL(Aweme aweme, Activity activity, String str, String str2);

    void LJJ(Aweme aweme, Activity activity);

    void LJJI(String str, String str2, String str3);

    void LJJIFFI(Aweme aweme, String str);

    DialogC1365000lco LJJII(Activity activity, C1371590lnR c1371590lnR, int i);

    SubscribeInviteChannel LJJIII(LiveSubscribeSharePackage liveSubscribeSharePackage);

    String LJJIIJ(int i, Aweme aweme, String str);

    void LJJIIJZLJL(String str, BaseSharePackage baseSharePackage);

    void LJJIIZ(Context context, String str, int i, int i2);

    void LJJIIZI(String str);

    C2344009Gk LJJIJ(C2344009Gk c2344009Gk, Aweme aweme);

    boolean LJJIJIIJI();

    void LJJIJIIJIL(String str, String str2, String str3);

    void LJJIJIL(Context context, boolean z);

    void LJJIJL(Aweme aweme, String str);

    void LJJIJLIJ(String str, BaseSharePackage baseSharePackage);

    void LJJIL(C2344009Gk c2344009Gk);

    void LJJIZ(Aweme aweme, String str, Context context, String str2, String str3, String str4, String str5, int i, Function2<? super Uri.Builder, ? super n, Unit> function2, String str6);

    C19292410dm LJJJ(User user);

    void LJJJI(Activity activity, Function1 function1);

    ImChannel LJJJIL(SharePackage sharePackage, String str);

    void LJJJJ(Context context, Aweme aweme, boolean z, ArrayList arrayList, int i, boolean z2, String str);
}
