package com.ss.android.ugc.aweme.poi.osp;

import X.C09YA;
import X.C1159320gH4;
import X.C1196530hF5;
import X.C2276411E8h;
import X.C610220Nwa;
import X.InterfaceC0148002o;
import X.InterfaceC1192660h8q;
import android.content.Context;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.compliance.repo.model.PassportToastContent;
import com.ss.android.ugc.aweme.poi.compliance.repo.model.PoiPassportLoginData;
import com.ss.android.ugc.aweme.poi.compliance.repo.model.ToastData;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import com.ss.android.ugc.aweme.poi.osp.repo.model.OrderAttribute;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS0S5400000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitViewModel extends AssemViewModel<C1159320gH4> {
    public PoiPassportLoginData LLILLL;
    public String LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C09YA LL = new C09YA(this, AFwS206S0000000_18.get$arr$(429));
    public final C09YA LLILLJJLI = new C09YA(this, AFwS206S0000000_18.get$arr$(428));
    public final Map<String, Integer> LLILZ = new LinkedHashMap();
    public long LLILZIL = System.currentTimeMillis();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159320gH4(0);
    }

    public final void vQ2(Fragment fragment, String str, SkuListData skuListData) {
        boolean zLJFF;
        ToastData toastData;
        PassportToastContent passportToastContent;
        String mobMerchantIds;
        String mobProductIds;
        PoiPassportLoginData poiPassportLoginData = this.LLILLL;
        if (poiPassportLoginData != null) {
            zLJFF = Intrinsics.LJFF(poiPassportLoginData.isNewUser(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            C2276411E8h.LIZIZ.log("poi", "osp show compliance toast");
            PoiPassportLoginData poiPassportLoginData2 = this.LLILLL;
            Context context = null;
            if (poiPassportLoginData2 != null && (toastData = poiPassportLoginData2.toastData) != null && (passportToastContent = toastData.toastContent) != null) {
                C1196530hF5 c1196530hF5 = new C1196530hF5(passportToastContent.convertToLsToastContent());
                c1196530hF5.setOutsideTouchable(true);
                c1196530hF5.setTouchable(true);
                if (fragment != null) {
                    context = fragment.getContext();
                }
                c1196530hF5.LJJIIJZLJL(context);
                c1196530hF5.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0h8w
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        PoiOrderSubmitViewModel poiOrderSubmitViewModel = this.LL;
                        poiOrderSubmitViewModel.getClass();
                        poiOrderSubmitViewModel.setState(new AwS32S0010000_18(true, 31));
                        this.LL.LLIZ = false;
                    }
                });
                c1196530hF5.LLIZLLLIL = new AwS562S0100000_18(this, 1646);
                c1196530hF5.show();
                setState(new AwS32S0010000_18(false, 31));
                this.LLIZ = true;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put("poi_id", str);
                if (skuListData == null || (mobMerchantIds = skuListData.getMobMerchantIds()) == null) {
                    mobMerchantIds = "";
                }
                linkedHashMap.put("merchant_ids", mobMerchantIds);
                if (skuListData != null && (mobProductIds = skuListData.getMobProductIds()) != null) {
                    str2 = mobProductIds;
                }
                linkedHashMap.put("product_ids", str2);
                C610220Nwa.LIZJ(PageFinder.via(fragment), "order_submit_page", linkedHashMap);
                return;
            }
            return;
        }
        this.LLIZ = false;
        setState(new AwS32S0010000_18(true, 31));
    }

    public final void wQ2(String str, InterfaceC1192660h8q interfaceC1192660h8q, OrderAttribute orderAttribute, String str2, List<SkuData> list, String str3, String str4, String str5) {
        withState(new AwS0S5400000_18(this, interfaceC1192660h8q, str, list, str3, orderAttribute, str2, str4, str5, 0));
    }
}
