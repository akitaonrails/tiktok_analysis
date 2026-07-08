package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel;

import X.C01GW;
import X.C06TE;
import X.C0YAE;
import X.C13BV;
import X.C1509305vX;
import X.C1559260qg8;
import X.C723600SZy;
import X.C893980Z5g;
import X.C898670ZNh;
import X.C907030Zi9;
import X.C907050ZiB;
import X.EnumC904370Zdr;
import X.InterfaceC1755906uD;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupMediaGridViewModel extends MediaGridViewModel {
    public final C1559260qg8 LLJ = new C1559260qg8(new C723600SZy(this, C893980Z5g.class, null), true);
    public final C01GW LLJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 1029));
    public final boolean LLJIJIL = true;

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel
    public final InterfaceC1755906uD AQ2() {
        C907030Zi9.LJFF.getClass();
        C907030Zi9 c907030Zi9LIZ = C907050ZiB.LIZ();
        String strXQ2 = xQ2();
        if (strXQ2 == null) {
            strXQ2 = "";
        }
        return c907030Zi9LIZ.LIZJ.get(strXQ2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel
    public final void IQ2() {
        ArrayList arrayList = new ArrayList(C13BV.INSTANCE);
        arrayList.add(new C06TE(EnumC904370Zdr.MEMBERS, R.raw.icon_two_same_person));
        arrayList.add(new C06TE(EnumC904370Zdr.SHARED_VIDEOS, R.raw.icon_arrow_turn_up_right));
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ != null) {
            iMCrossAppFeatureDiffApiLIZIZ.LJIIIZ();
            arrayList.add(new C06TE(EnumC904370Zdr.PRIVATE_MEDIA, R.raw.icon_image_stack));
        }
        setState(new AwS593S0100000_14(arrayList, (List<C0YAE>) 128));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel
    public final String xQ2() {
        return (String) this.LLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel
    public final boolean FQ2() {
        return this.LLJIJIL;
    }
}
