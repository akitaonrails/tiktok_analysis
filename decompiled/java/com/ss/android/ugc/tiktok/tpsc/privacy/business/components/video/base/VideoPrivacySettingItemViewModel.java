package com.ss.android.ugc.tiktok.tpsc.privacy.business.components.video.base;

import X.C10A1;
import X.C11NZ;
import X.C1888930zFr;
import X.C191871104n;
import X.C2097908Jt;
import X.InterfaceC192013109z;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.BaseSettingDataViewModel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoPrivacySettingItemViewModel extends BaseSettingDataViewModel {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final String LLILZLL;
    public final String LLIZ;

    @Override // com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.BaseSettingDataViewModel
    public final C11NZ<? extends BaseResponse> vQ2(int i) {
        C10A1 c10a1LJFF = C191871104n.LJFF();
        String str = this.LLILZLL;
        String str2 = this.LLIZ;
        Integer numValueOf = Integer.valueOf(i);
        c10a1LJFF.getClass();
        return C1888930zFr.LIZIZ(((InterfaceC192013109z) C10A1.LIZIZ.getValue()).LIZ(str, str2, numValueOf), "/tiktok/privacy/item/settings/update/v1", C2097908Jt.LIZJ(new Pair("report_to_tea", "true")));
    }

    public VideoPrivacySettingItemViewModel(String str, String str2, Integer num) {
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLILLL.setValue(num == null ? -1 : num);
    }
}
