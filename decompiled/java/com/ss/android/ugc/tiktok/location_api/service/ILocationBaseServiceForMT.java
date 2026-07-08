package com.ss.android.ugc.tiktok.location_api.service;

import X.AbstractC1201400hMw;
import X.C0HWO;
import X.C1198940hIy;
import X.C1207520hWo;
import X.C540070LGb;
import X.InterfaceC1207030hW1;
import X.InterfaceC1207170hWF;
import X.InterfaceC1294060jmO;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public interface ILocationBaseServiceForMT {
    Map<String, String> LIZ();

    void LIZIZ(boolean z);

    @InterfaceC1294060jmO
    void LIZJ(String str, String str2, Activity activity, AbstractC1201400hMw abstractC1201400hMw, Cert cert, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str3);

    void LIZLLL(Activity activity, Fragment fragment, C1207520hWo c1207520hWo, InterfaceC1207170hWF interfaceC1207170hWF, String str);

    boolean LJ(Context context);

    boolean LJFF(Context context);

    boolean LJI(Context context);

    boolean LJII(Context context);

    C540070LGb LJIIIIZZ(String str);

    Class<? extends PowerCell<?>> LJIIIZ();

    boolean LJIIJ();

    C1198940hIy LJIIJJI(Context context, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, AwS384S0200000_18 awS384S0200000_18, AwS562S0100000_18 awS562S0100000_18, AwS562S0100000_18 awS562S0100000_182);

    boolean LJIIL();

    View LJIILIIL(Context context, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, AwS562S0100000_18 awS562S0100000_18);

    boolean LJIILJJIL();

    void LJIILL();

    C540070LGb LJIILLIIL(String str);

    List<String> LJIIZILJ();

    void LJIJ(List<C0HWO> list);

    InterfaceC1891350zJl LJIJI();

    CharSequence LJIJJ(Context context);

    @InterfaceC1294060jmO
    void LJIJJLI(String str, String str2, Cert cert, Activity activity, C1207520hWo c1207520hWo, InterfaceC1207030hW1 interfaceC1207030hW1, boolean z, boolean z2);

    void LJIL(Activity activity, Fragment fragment, TokenCert tokenCert, C1207520hWo c1207520hWo, InterfaceC1207170hWF interfaceC1207170hWF);

    boolean LJJ();

    CharSequence LJJI(Context context);

    void LJJIFFI(AFwS256S0000000_18 aFwS256S0000000_18, boolean z);

    PoiSearchRequestBody LJJII(PoiSearchRequestBody poiSearchRequestBody);

    void LJJIII(Context context, Map<String, String> map);

    boolean LJJIIJ();

    boolean LJJIIJZLJL(Context context);

    String LJJIIZ(Context context);

    void LJJIIZI(View view);

    boolean LJJIJ();

    void LJJIJIIJI();

    void LJJIJIIJIL(Context context);
}
