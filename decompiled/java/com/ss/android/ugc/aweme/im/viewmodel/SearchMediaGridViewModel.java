package com.ss.android.ugc.aweme.im.viewmodel;

import X.C01GW;
import X.C06JG;
import X.C06LI;
import X.C1509305vX;
import X.C1559260qg8;
import X.C452501pT;
import X.C723600SZy;
import X.EnumC904370Zdr;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS110S0101000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchMediaGridViewModel extends MediaGridViewModel {
    public final C1559260qg8 LLJ = new C1559260qg8(new C723600SZy(this, C06JG.class, null), true);
    public final C01GW LLJI = C1509305vX.LIZ(new AwS546S0100000_2(this, 596));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 597));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 598));
    public final boolean LLJILJILJ = true;

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel
    public final IMUser CQ2() {
        return (IMUser) this.LLJILJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel
    public final boolean FQ2() {
        return ((Boolean) this.LLJIJIL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel
    public final void IQ2() {
        EnumC904370Zdr enumC904370Zdr;
        C06JG c06jg = (C06JG) this.LLJ.getValue();
        if (c06jg == null || (enumC904370Zdr = c06jg.LLILLL) == null) {
            enumC904370Zdr = EnumC904370Zdr.SHARED_VIDEOS;
        }
        int i = C06LI.LIZ[enumC904370Zdr.ordinal()];
        setState(new AwS110S0101000_2(enumC904370Zdr, (i == 1 || i != 2) ? R.raw.icon_arrow_turn_up_right : R.raw.icon_image_stack, 2));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel
    public final String xQ2() {
        return (String) this.LLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel
    public final boolean EQ2() {
        return this.LLJILJILJ;
    }
}
