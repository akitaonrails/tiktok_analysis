package com.ss.android.ugc.aweme.unifiedauth.banner;

import X.C1308910kAL;
import X.C19208710Cv;
import X.C19209010Cy;
import X.C20684815ws;
import X.C2252321DDq;
import X.C2344009Gk;
import X.C637030Oyj;
import X.C637040Oyk;
import X.C637060Oym;
import X.C637540OzY;
import X.EnumC637310OzB;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupElementsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class UgTopInboxBannerAssem extends InboxBannerAssem {
    public boolean LLILZ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    public final void fo() {
        String str;
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        Context context = getContext();
        if (context != null) {
            PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
            UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZ = C19208710Cv.LIZ();
            pushUserGuidePopupManager.getClass();
            PushUserGuidePopupManager.LJIIJ(unifiedAuthPopupConfigLIZ, context);
        }
        if (C19208710Cv.LIZJ()) {
            C19209010Cy c19209010Cy = C19209010Cy.LIZ;
            str = C19208710Cv.LIZLLL() ? "subscription" : "consent";
            c19209010Cy.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("page_name", "homepage_message");
            c2344009Gk.LJFF("trigger", "new_message");
            c2344009Gk.LJFF("pop_up_type", str);
            C20684815ws.LJIILLIIL("tiktok_sms_permission_banner_show", c2344009Gk.LIZ);
            return;
        }
        C19209010Cy c19209010Cy2 = C19209010Cy.LIZ;
        str = C19208710Cv.LIZLLL() ? "subscription" : "consent";
        c19209010Cy2.getClass();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJFF("enter_from", "homepage_message");
        c2344009Gk2.LJFF("trigger", "new_message");
        c2344009Gk2.LJFF("pop_up_type", str);
        c2344009Gk2.LJFF("channel_type", "edm");
        C20684815ws.LJIILLIIL("show_channel_permission_banner", c2344009Gk2.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C637540OzY c637540OzY;
        PopupInstanceConfig popupInstanceConfig;
        PopupElementsConfig popupElementsConfig;
        String str;
        PopupInstanceConfig popupInstanceConfig2;
        PopupElementsConfig popupElementsConfig2;
        String str2;
        super.onResume();
        if (this.LLILZ) {
            return;
        }
        Context context = getContext();
        if (context == null) {
            c637540OzY = new C637540OzY("", "", AFwS217S0000000_28.get$arr$(716), AFwS217S0000000_28.get$arr$(717));
        } else {
            String string = C19208710Cv.LIZJ() ? context.getString(2131848567) : C19208710Cv.LIZLLL() ? context.getString(2131833485) : context.getString(2131833484);
            List<PopupInstanceConfig> list = C19208710Cv.LIZ().popupInstances;
            if (list != null && (popupInstanceConfig2 = (PopupInstanceConfig) ListProtector.get(list, C19208710Cv.LIZ().currentIndex)) != null && (popupElementsConfig2 = popupInstanceConfig2.popupElementsConfig) != null && (str2 = popupElementsConfig2.bannerTitle) != null) {
                string = str2;
            }
            String string2 = context.getString(2131833479);
            List<PopupInstanceConfig> list2 = C19208710Cv.LIZ().popupInstances;
            if (list2 != null && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list2, C19208710Cv.LIZ().currentIndex)) != null && (popupElementsConfig = popupInstanceConfig.popupElementsConfig) != null && (str = popupElementsConfig.bannerButtonTitle) != null) {
                string2 = str;
            }
            c637540OzY = new C637540OzY(string, string2, new AwS572S0100000_28(context, 1056), AFwS217S0000000_28.get$arr$(714));
        }
        C2252321DDq c2252321DDq = this.LL;
        EnumC637310OzB enumC637310OzB = EnumC637310OzB.TOP_SHOW;
        String str3 = "ug_channel_auth_guide";
        String str4 = "ug_channel_auth_guide";
        String str5 = c637540OzY.LIZ;
        UrlModel urlModel = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i = C19208710Cv.LIZJ() ? R.raw.icon_sms : R.raw.icon_envelope;
        Context context2 = getContext();
        c2252321DDq.setValue(new Pair(enumC637310OzB, new C637060Oym(str3, str4, str5, urlModel, new C637040Oyk(i, context2 != null ? C1308910kAL.LIZJ(R.attr.a04, context2) : null), objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, new C637030Oyj(c637540OzY.LIZIZ, null), true, new AwS375S0200000_9(c637540OzY, this, 171), objArr == true ? 1 : 0, 9176)));
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
    }
}
