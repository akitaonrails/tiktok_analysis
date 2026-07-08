package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel;

import X.C0KGZ;
import X.C0KIP;
import X.C0KIY;
import X.C0KJ4;
import X.C0KJJ;
import X.C0KJX;
import X.C0KMQ;
import X.C513920KDm;
import X.C514770KGt;
import X.C514860KHc;
import X.C514900KHg;
import X.EnumC513390KBl;
import X.EnumC513810KDb;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class PackagePageViewModel extends ViewModel {
    public final C0KJJ LL = new C0KJJ();
    public final MutableLiveData<C0KJX> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final LiveData<C514900KHg> LLILZIL;
    public final MutableLiveData<C0KJ4> LLILZLL;
    public final LiveData<SubscriptionProductDetailWithTemplateInfo> LLIZ;
    public final MutableLiveData<String> LLIZLLLIL;
    public final LiveData<SubscribeUserInfoResponse> LLJ;
    public final MutableLiveData<C0KIP> LLJI;
    public final MutableLiveData<EnumC513810KDb> LLJIJIL;
    public final MutableLiveData<C514770KGt> LLJILJIL;

    public PackagePageViewModel() {
        MutableLiveData<C0KJX> mutableLiveData = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData;
        this.LLILZIL = Transformations.switchMap(mutableLiveData, new C0KIY(this));
        MutableLiveData<C0KJ4> mutableLiveData2 = new MutableLiveData<>();
        this.LLILZLL = mutableLiveData2;
        this.LLIZ = Transformations.switchMap(mutableLiveData2, new C0KGZ(this));
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.LLIZLLLIL = mutableLiveData3;
        this.LLJ = Transformations.switchMap(mutableLiveData3, new C514860KHc(this));
        this.LLJI = new MutableLiveData<>();
        this.LLJIJIL = new MutableLiveData<>();
        this.LLJILJIL = new MutableLiveData<>();
    }

    public final void vQ2(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        this.LLILZLL.setValue(new C0KJ4(str, str2));
    }

    public final void xQ2(Context context, SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo, String str, String str2, Map map, String str3, EnumC513390KBl enumC513390KBl, boolean z) {
        C0KMQ c0kmq = new C0KMQ() { // from class: X.0KIR
            @Override // X.C0KMQ
            public final void onFail(int i, String str4) {
                PackagePageViewModel packagePageViewModel = this.LIZ;
                packagePageViewModel.LLJI.setValue(new C0KIP("", "", i, str4));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Subscribe Pay Error Code: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.C0KMQ
            public final void LIZ(C0KJK c0kjk, String str4, String str5, C515420KJg c515420KJg) {
                String str6;
                String str7;
                SubscribeBadge subscribeBadge = null;
                if (c515420KJg != null) {
                    str6 = c515420KJg.LIZIZ;
                } else {
                    str6 = null;
                }
                C0KIT.LIZIZ(str6);
                PackagePageViewModel packagePageViewModel = this.LIZ;
                if (c0kjk == null || (str7 = c0kjk.LJI) == null) {
                    str7 = "";
                }
                packagePageViewModel.LLJI.setValue(new C0KIP(str7, str4, 1, str5));
                if (c515420KJg != null) {
                    subscribeBadge = c515420KJg.LIZ;
                }
                C0KIT.LIZ(c0kjk, subscribeBadge);
            }
        };
        if (map != null) {
            C513920KDm.LIZ(map, subscriptionProductDetailWithTemplateInfo.getTemplateInfo());
        }
        C0KJJ.LIZIZ(this.LL, context, subscriptionProductDetailWithTemplateInfo, str, str2, c0kmq, map, str3, false, enumC513390KBl, z, 2304);
    }

    public static void wQ2(PackagePageViewModel packagePageViewModel, SubInfo subInfo, Boolean bool, Boolean bool2, String str, Boolean bool3, RefundInfo refundInfo, Integer num, Boolean bool4, String str2, List list, int i) {
        String str3;
        if ((i & 32) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        if ((i & 64) != 0) {
            refundInfo = null;
        }
        if ((i & 128) != 0) {
            num = null;
        }
        if ((i & 256) != 0) {
            bool4 = null;
        }
        if ((i & 512) != 0) {
            str2 = null;
        }
        if ((i & 1024) != 0) {
            list = null;
        }
        C514770KGt value = packagePageViewModel.LLJILJIL.getValue();
        int i2 = 0;
        if (value == null) {
            value = new C514770KGt(i2);
        }
        if (subInfo != null) {
            value.LIZ = subInfo;
        }
        if (bool != null) {
            value.LIZIZ = bool.booleanValue();
        }
        if (bool2 != null) {
            value.LIZJ = bool2.booleanValue();
        }
        if (str != null && str.length() > 0) {
            value.LIZLLL = str;
        }
        if (bool3 != null) {
            value.LJ = bool3.booleanValue();
        }
        if (str3.length() > 0) {
            value.LJFF = str3;
        }
        if (refundInfo != null) {
            value.LJII = refundInfo;
        }
        if (num != null) {
            value.LJI = num.intValue();
        }
        if (bool4 != null) {
            value.LJIIIIZZ = bool4.booleanValue();
        }
        if (str2 != null) {
            value.LJIIIZ = str2;
        }
        if (list != null && !list.isEmpty()) {
            value.LJIIJJI = (UpdateTips) ListProtector.get(list, 0);
        }
        packagePageViewModel.LLJILJIL.setValue(value);
    }
}
