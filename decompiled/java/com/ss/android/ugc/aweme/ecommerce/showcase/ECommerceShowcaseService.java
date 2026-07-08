package com.ss.android.ugc.aweme.ecommerce.showcase;

import X.AnonymousClass0317;
import X.C034S;
import X.C046U;
import X.C0H1U;
import X.C1120604Zw;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1AQS;
import X.C2010707uD;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC951803no;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.RestrictDialog;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class ECommerceShowcaseService implements IECommerceShowcaseService {
    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final /* bridge */ /* synthetic */ void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final List<StoreInterceptor> LJI() {
        return Collections.singletonList(StoreInterceptor.LL);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final void LJ(FragmentManager fragmentManager) {
        Bundle bundle = new Bundle();
        bundle.putInt("height", -1);
        RestrictDialog restrictDialog = new RestrictDialog();
        restrictDialog.setArguments(bundle);
        restrictDialog.show(fragmentManager, "");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final void LIZJ(SmartImageView smartImageView, StoreOfficialLabel storeOfficialLabel, EnumC951803no enumC951803no) {
        Image imageLIZ;
        int iLIZIZ;
        float f;
        C786410Ut5.LJLLLLLL(8, smartImageView);
        if (storeOfficialLabel != null && (imageLIZ = storeOfficialLabel.LIZ(smartImageView.getContext())) != null) {
            Integer num = storeOfficialLabel.labelType;
            C046U c046u = C046U.BLUE_V;
            int value = c046u.getValue();
            if (num != null && num.intValue() == value) {
                iLIZIZ = storeOfficialLabel.LIZIZ(EnumC951803no.BELOW, EnumC951803no.RIGHT);
            } else {
                iLIZIZ = storeOfficialLabel.LIZIZ(EnumC951803no.RIGHT, EnumC951803no.BELOW);
            }
            if (enumC951803no != EnumC951803no.UNKNOWN && iLIZIZ != enumC951803no.getValue()) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, smartImageView);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageLIZ);
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            Integer width = imageLIZ.getWidth();
            if (width == null || width.intValue() <= 0 || 1 == 0) {
                return;
            }
            int iIntValue = width.intValue();
            Integer height = imageLIZ.getHeight();
            if (height == null || height.intValue() <= 0) {
                return;
            }
            int iIntValue2 = height.intValue();
            Integer num2 = storeOfficialLabel.labelType;
            int value2 = c046u.getValue();
            if (num2 != null && num2.intValue() == value2) {
                f = 12.0f;
            } else {
                f = 15.0f;
            }
            float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(f));
            int iLIZIZ2 = C814420VxA.LIZIZ(fLIZIZ);
            int iLIZIZ3 = C814420VxA.LIZIZ((fLIZIZ * iIntValue) / iIntValue2);
            if (smartImageView.getLayoutParams().height == iLIZIZ2 && smartImageView.getLayoutParams().width == iLIZIZ3) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iLIZIZ2;
                layoutParams.width = iLIZIZ3;
                C786410Ut5.W5(smartImageView, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[Catch: Exception -> 0x012b, CancellationException -> 0x012d, all -> 0x0148, TryCatch #2 {all -> 0x0148, blocks: (B:25:0x0098, B:26:0x009b, B:28:0x009f, B:30:0x00b1, B:35:0x00d6, B:37:0x00de, B:38:0x00e6, B:39:0x00eb, B:43:0x0100, B:46:0x010b, B:49:0x0112, B:50:0x0116, B:53:0x0127, B:34:0x00c6, B:61:0x0132, B:64:0x013c, B:68:0x0144, B:69:0x0147, B:71:0x0149), top: B:74:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013b  */
    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r22, java.util.Map r23, X.InterfaceC1364105Vn r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService.LJFF(java.lang.String, java.util.Map, X.05Vn, boolean):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final View LJIIIZ(View view, Integer num, String str, Integer num2, Boolean bool) {
        boolean z;
        if (num == null || num.intValue() != 2) {
            return null;
        }
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
                return null;
            }
            View viewLIZJ = C0H1U.LIZJ(R.layout.azz, view, false);
            viewLIZJ.setBackgroundResource(R.drawable.b9g);
            ((TuxIconView) viewLIZJ.findViewById(R.id.srx)).setTintColorRes(R.attr.a1p);
            ((TextView) viewLIZJ.findViewById(R.id.srz)).setText("N/A");
            return viewLIZJ;
        }
        View viewLIZJ2 = C0H1U.LIZJ(R.layout.azz, view, false);
        if (num2 != null && num2.intValue() >= 50) {
            viewLIZJ2.setBackgroundResource(R.drawable.b9f);
            ((TuxIconView) viewLIZJ2.findViewById(R.id.srx)).setTintColorRes(R.attr.o9);
        } else {
            viewLIZJ2.setBackgroundResource(R.drawable.b9e);
            ((TuxIconView) viewLIZJ2.findViewById(R.id.srx)).setTintColorRes(R.attr.zs);
        }
        ((TextView) viewLIZJ2.findViewById(R.id.srz)).setText(str);
        return viewLIZJ2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final void LJII(String str, String str2, String str3, String str4, Map map, Map map2, boolean z) throws JSONException {
        String str5;
        AnonymousClass0317 anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin;
        boolean z2;
        String name;
        map.put("page_name", str2);
        map.put("source_previous_page", str2);
        if (str == null) {
            str = "";
        }
        map.put("shop_id", str);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_self", str5);
        boolean z3 = true;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IApmDependencyService.class.getName();
            if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        map.put("traceparent", ((IApmDependencyService) anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin).newTrackingTraceparent());
        if (str3 != null && !a0.LJJJIL(str3)) {
            map.put("entrance_info", str3);
        }
        if (str4 != null && !a0.LJJJIL(str4)) {
            z3 = false;
        }
        if (!z3) {
            map.put("source_page_type", str4);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get("origin_source_page");
        if (obj != null || (obj = linkedHashMap.get("source_page_type")) != null) {
            map.put("origin_source_page", obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(map);
        if (map2 != null) {
            linkedHashMap2.putAll(map2);
        }
        C2010707uD.LIZLLL("tiktokec_shop_entrance_show", linkedHashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0103 A[PHI: r0
      0x0103: PHI (r0v20 java.lang.Object) = (r0v19 java.lang.Object), (r0v45 java.lang.Object) binds: [B:41:0x00fd, B:43:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.content.Context r16, java.lang.String r17, java.lang.String r18, boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.util.Map<java.lang.String, java.lang.Object> r23, java.util.Map<java.lang.String, ? extends java.lang.Object> r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService.LIZIZ(android.content.Context, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final void LJIIIIZZ(String str, String str2, String str3, String str4, boolean z, Integer num, String str5, String str6, String str7, String str8, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) throws JSONException {
        String str9;
        AnonymousClass0317 anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin;
        String name;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        linkedHashMap.put("page_name", str2);
        linkedHashMap.put("source_previous_page", str2);
        linkedHashMap.put("enter_from", str);
        boolean z2 = true;
        if (!a0.LJJJIL(str3)) {
            linkedHashMap.put("entrance_type", str3);
        }
        if (str4 != null && !a0.LJJJIL(str4)) {
            linkedHashMap.put("author_id", str4);
        }
        if (str7 != null && !a0.LJJJIL(str7)) {
            linkedHashMap.put("search_result_id", str7);
        }
        if (str8 != null && !a0.LJJJIL(str8)) {
            linkedHashMap.put("list_source_content_id", str8);
        }
        if (str5 != null && !a0.LJJJIL(str5)) {
            linkedHashMap.put("previous_page", str5);
        }
        if (str6 != null && !a0.LJJJIL(str6)) {
            linkedHashMap.put("search_id", str6);
        }
        if (z) {
            str9 = "1";
        } else {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_self", str9);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin == null) {
                z2 = false;
            }
            String name2 = IApmDependencyService.class.getName();
            if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        linkedHashMap.put("traceparent", ((IApmDependencyService) anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin).newTrackingTraceparent());
        if (num != null) {
            linkedHashMap.put("follow_status", Integer.valueOf(num.intValue()));
        }
        C2010707uD.LIZLLL("tiktokec_showcase_entrance_show", linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final void LJIIJ(Context context, String str, String str2, String str3, String str4, String str5, boolean z, Integer num, String str6, String str7, String str8, String str9, Map<String, Object> map, Map<String, ? extends Object> map2) throws JSONException {
        String str10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.putAll(map2);
        if (str2 != null && !a0.LJJJIL(str2)) {
            linkedHashMap.put("author_id", str2);
        }
        if (str6 != null && !a0.LJJJIL(str6)) {
            linkedHashMap.put("previous_page", str6);
        }
        if (!a0.LJJJIL(str5)) {
            linkedHashMap.put("entrance_type", str5);
            map.put("entrance_type", str5);
        }
        if (z) {
            str10 = "1";
        } else {
            str10 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_self", str10);
        if (num != null) {
            linkedHashMap.put("follow_status", Integer.valueOf(num.intValue()));
        }
        linkedHashMap.put("enter_from", str3);
        map.put("enter_from", str3);
        linkedHashMap.put("page_name", str4);
        linkedHashMap.put("source_previous_page", str4);
        map.put("source_previous_page", str4);
        if (str7 != null && !a0.LJJJIL(str7)) {
            linkedHashMap.put("search_id", str7);
            map.put("search_id", str7);
        }
        if (str8 != null && !a0.LJJJIL(str8)) {
            linkedHashMap.put("search_result_id", str8);
            map.put("search_result_id", str8);
        }
        if (str9 != null && !a0.LJJJIL(str9)) {
            linkedHashMap.put("list_source_content_id", str9);
            map.put("list_source_content_id", str9);
        }
        C2010707uD.LIZLLL("tiktokec_showcase_entrance_click", linkedHashMap);
        SmartRouter.buildRoute(context, C2010707uD.LIZ(Long.valueOf(System.currentTimeMillis()), C2010707uD.LIZIZ(C2010707uD.LIZ(Boolean.valueOf(z), str, "is_self"), map), "_ec_start_time")).open();
    }
}
