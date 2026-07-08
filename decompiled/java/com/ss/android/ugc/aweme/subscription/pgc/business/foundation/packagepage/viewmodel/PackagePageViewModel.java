package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel;

import X.C0K7G;
import X.C0KCI;
import X.C0KDP;
import X.C0KDT;
import X.C0KDZ;
import X.C0KFK;
import X.C0KLA;
import X.C0KLW;
import X.C0KLX;
import X.C2097608Jq;
import X.C513820KDc;
import X.C513910KDl;
import X.EnumC513400KBm;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCTipsInfo;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.api.model.PgcSubscribeUserInfoResponse;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class PackagePageViewModel extends ViewModel {
    public final C0KFK LL = new C0KFK();
    public final MutableLiveData<C0KLA> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final LiveData<C0KCI> LLILZIL;
    public final MutableLiveData<C513820KDc> LLILZLL;
    public final LiveData<PGCSubscriptionProductDetailWithTemplateInfo> LLIZ;
    public final MutableLiveData<String> LLIZLLLIL;
    public final LiveData<PgcSubscribeUserInfoResponse> LLJ;
    public final MutableLiveData<C0KDP> LLJI;
    public final MutableLiveData<C0KDZ> LLJIJIL;
    public final MutableLiveData<C0KDT> LLJILJIL;

    public PackagePageViewModel() {
        MutableLiveData<C0KLA> mutableLiveData = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData;
        this.LLILZIL = Transformations.switchMap(mutableLiveData, new AwS586S0100000_7(this, 282));
        MutableLiveData<C513820KDc> mutableLiveData2 = new MutableLiveData<>();
        this.LLILZLL = mutableLiveData2;
        this.LLIZ = Transformations.switchMap(mutableLiveData2, new AwS586S0100000_7(this, 283));
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.LLIZLLLIL = mutableLiveData3;
        this.LLJ = Transformations.switchMap(mutableLiveData3, new AwS586S0100000_7(this, 284));
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
        this.LLILZLL.setValue(new C513820KDc(str, str2));
    }

    public final void xQ2(Context context, final PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo, String str, String str2, Map map, String str3, EnumC513400KBm enumC513400KBm, boolean z, List list) {
        PGCTemplateInfo pGCTemplateInfoLIZ;
        C0KLW c0klw = new C0KLW() { // from class: X.0KDN
            @Override // X.C0KLW
            public final void onFail(int i, String str4) {
                String str5;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PackagePageViewModel.subscribePay.onFail, selectedPackageId=");
                TemplateInfo templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo != null) {
                    str5 = templateInfo.packageId;
                } else {
                    str5 = null;
                }
                sbLIZ.append(str5);
                sbLIZ.append(", payStatus=");
                sbLIZ.append(i);
                sbLIZ.append(", payMessage=");
                sbLIZ.append(str4);
                C2188811AlT.LIZIZ(sbLIZ);
                PackagePageViewModel packagePageViewModel = this;
                packagePageViewModel.LLJI.setValue(new C0KDP("", "", i, str4));
            }

            @Override // X.C0KLW
            public final void LIZ(C0KFM c0kfm, String str4, String str5, C515650KKd c515650KKd) {
                String str6;
                String str7;
                String str8;
                boolean z2;
                String str9;
                String str10;
                String str11;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PackagePageViewModel.subscribePay.onSuccess, selectedPackageId=");
                TemplateInfo templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                SubscribeBadge subscribeBadge = null;
                if (templateInfo != null) {
                    str6 = templateInfo.packageId;
                } else {
                    str6 = null;
                }
                sbLIZ.append(str6);
                sbLIZ.append(", subscribePayloadOrderId=");
                if (c0kfm != null) {
                    str7 = c0kfm.LJJIIZ;
                } else {
                    str7 = null;
                }
                sbLIZ.append(str7);
                sbLIZ.append(", secAnchorId=");
                if (c0kfm != null) {
                    str8 = c0kfm.LJIIIZ;
                } else {
                    str8 = null;
                }
                sbLIZ.append(str8);
                sbLIZ.append(", msg=");
                sbLIZ.append(str4);
                sbLIZ.append(", payStatus=");
                sbLIZ.append(1);
                sbLIZ.append(", payMessage=");
                sbLIZ.append(str5);
                sbLIZ.append(", hasBadge=");
                if (c515650KKd != null && c515650KKd.LIZ != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sbLIZ.append(z2);
                sbLIZ.append(", toast=");
                if (c515650KKd != null) {
                    str9 = c515650KKd.LIZIZ;
                } else {
                    str9 = null;
                }
                sbLIZ.append(str9);
                C2188811AlT.LIZIZ(sbLIZ);
                if (c515650KKd != null) {
                    str10 = c515650KKd.LIZIZ;
                } else {
                    str10 = null;
                }
                C512200K6w.LIZIZ(str10);
                PackagePageViewModel packagePageViewModel = this;
                if (c0kfm == null || (str11 = c0kfm.LJI) == null) {
                    str11 = "";
                }
                packagePageViewModel.LLJI.setValue(new C0KDP(str11, str4, 1, str5));
                if (c515650KKd != null) {
                    subscribeBadge = c515650KKd.LIZ;
                }
                C512200K6w.LIZ(c0kfm, subscribeBadge);
            }
        };
        if (map != null) {
            TemplateInfo templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
            if (templateInfo != null) {
                pGCTemplateInfoLIZ = C0KLX.LIZ(templateInfo);
            } else {
                pGCTemplateInfoLIZ = null;
            }
            C513910KDl.LIZ(map, pGCTemplateInfoLIZ);
        }
        this.LL.LIZIZ(context, pGCSubscriptionProductDetailWithTemplateInfo, str, str2, c0klw, map, str3, false, enumC513400KBm, z, list, null, C2097608Jq.LJ());
    }

    public static void wQ2(PackagePageViewModel packagePageViewModel, SubInfo subInfo, Boolean bool, Boolean bool2, String str, Boolean bool3, RefundInfo refundInfo, Integer num, Boolean bool4, String str2, PGCTipsInfo pGCTipsInfo, PGCSubsTransitionPeriodInfo pGCSubsTransitionPeriodInfo, int i) {
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
            pGCTipsInfo = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            pGCSubsTransitionPeriodInfo = null;
        }
        C0KDT value = packagePageViewModel.LLJILJIL.getValue();
        int i2 = 0;
        if (value == null) {
            value = new C0KDT(i2);
        }
        if (subInfo != null) {
            value.LIZ = subInfo;
        }
        if (bool != null) {
            value.LIZIZ = bool.booleanValue();
            value.LJIIJ = C0K7G.LJIIIZ();
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
        if (pGCTipsInfo != null) {
            value.LJIIJJI = pGCTipsInfo;
        }
        if (pGCSubsTransitionPeriodInfo != null) {
            value.LJIIL = pGCSubsTransitionPeriodInfo;
        }
        packagePageViewModel.LLJILJIL.setValue(value);
    }
}
