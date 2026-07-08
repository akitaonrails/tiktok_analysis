package com.ss.android.ugc.aweme.ecommerce.showcase.service;

import X.EnumC951803no;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public interface IECommerceShowcaseService {
    void LIZ();

    void LIZIZ(Context context, String str, String str2, boolean z, String str3, String str4, String str5, Map<String, Object> map, Map<String, ? extends Object> map2);

    void LIZJ(SmartImageView smartImageView, StoreOfficialLabel storeOfficialLabel, EnumC951803no enumC951803no);

    void LIZLLL();

    void LJ(FragmentManager fragmentManager);

    Object LJFF(String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn, boolean z);

    List<IInterceptor> LJI();

    void LJII(String str, String str2, String str3, String str4, Map map, Map map2, boolean z);

    void LJIIIIZZ(String str, String str2, String str3, String str4, boolean z, Integer num, String str5, String str6, String str7, String str8, Map<String, ? extends Object> map, Map<String, ? extends Object> map2);

    View LJIIIZ(View view, Integer num, String str, Integer num2, Boolean bool);

    void LJIIJ(Context context, String str, String str2, String str3, String str4, String str5, boolean z, Integer num, String str6, String str7, String str8, String str9, Map<String, Object> map, Map<String, ? extends Object> map2);
}
