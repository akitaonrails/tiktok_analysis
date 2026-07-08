package com.ss.android.ugc.aweme.ecommerce.ug.popup.service;

import X.AnonymousClass0956;
import X.C1740990vPF;
import X.C443120HZe;
import X.InterfaceC1364105Vn;
import X.InterfaceC2211711BhJ;
import X.InterfaceC824510WWb;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes3.dex */
public interface IEcUgPopupService {
    boolean A8();

    C443120HZe B8(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, boolean z3);

    void C8(int i);

    boolean D8(String str);

    void E8();

    void F8(Context context, String str, String str2);

    AnonymousClass0956 G8(String str, C1740990vPF c1740990vPF, AwS570S0100000_26 awS570S0100000_26, AwS570S0100000_26 awS570S0100000_262, String str2);

    Object H8(Fragment fragment, String str, boolean z, boolean z2, Function2<? super Boolean, ? super String, Unit> function2, InterfaceC824510WWb interfaceC824510WWb, boolean z3, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    boolean I8(String str);

    void checkPageSourceInfo(String str);

    boolean isFromEcUg(Map<String, ? extends Object> map);

    boolean isFromEcUgVSA(Map<String, ? extends Object> map);

    void onPdpFragmentOnCreate(Activity activity, InterfaceC2211711BhJ interfaceC2211711BhJ, boolean z, Map<String, ? extends Object> map, String str);

    void onPdpFragmentOnDestroy(Activity activity, InterfaceC2211711BhJ interfaceC2211711BhJ, boolean z, Map<String, ? extends Object> map);

    void onPdpFragmentRenderCompleted(Activity activity, boolean z, Map<String, ? extends Object> map);

    void onPopupFragmentExpandFull(Activity activity, String str, Map<String, ? extends Object> map, String str2);

    void onPopupFragmentOnCreate(Activity activity, String str, Map<String, ? extends Object> map, String str2, String str3);

    void onPopupFragmentOnDestroy(Activity activity, Map<String, ? extends Object> map);

    void onPopupFragmentRenderCompleted(Activity activity, Map<String, ? extends Object> map);
}
