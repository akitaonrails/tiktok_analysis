package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C2252321DDq;
import X.C2507109s5;
import X.C624370OeJ;
import X.C637030Oyj;
import X.C637060Oym;
import X.EnumC637310OzB;
import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import kotlin.Pair;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FollowerMergeGuideBannerAssem extends InboxBannerAssem {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String string;
        String string2;
        super.onCreate();
        C624370OeJ.LIZ("FollowerMergeGuideBannerAssem", "onCreate()");
        C2252321DDq c2252321DDq = this.LL;
        EnumC637310OzB enumC637310OzB = EnumC637310OzB.TOP_SHOW;
        String str = "follower_merge_guide";
        String str2 = "follower_merge_guide";
        Context context = getContext();
        String str3 = "";
        if (context == null || (string = context.getString(2131830305)) == null) {
            string = "";
        }
        UrlModel urlModel = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Context context2 = getContext();
        if (context2 != null && (string2 = context2.getString(2131830304)) != null) {
            str3 = string2;
        }
        c2252321DDq.setValue(new Pair(enumC637310OzB, new C637060Oym(str, str2, string, urlModel, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, new C637030Oyj(str3, (String) C2507109s5.LIZ.getValue()), true, new AwS588S0100000_9(this, 353), objArr == true ? 1 : 0, 8816)));
    }
}
