package com.ss.android.ugc.profile.business.ad.platform.business;

import X.C08JS;
import X.C1216270hkv;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ad.platform.BioContactData;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class BioBusinessContactComponent extends BioBusinessBaseUIComponent<BioContactData> {
    public final boolean LLJLL;

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String Ap() {
        return "HAS_BA_PHONE_NUMBER".toLowerCase(Locale.ROOT);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String Ep() {
        return C1216270hkv.LIZJ(this.LLJLL ? 2131829475 : 2131821368);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ad.platform.business.BioBusinessContactComponent.Oo():void");
    }

    public BioBusinessContactComponent() {
        BioContactData bioContactData = (BioContactData) this.LLJJLIIIJLLLLLLLZ;
        this.LLJLL = TextUtils.equals(bioContactData != null ? bioContactData.getType() : null, "v2");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final Integer Bp() {
        return Integer.valueOf(R.raw.icon_phone);
    }

    public final User getUser() {
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            return profilePlatformViewModelZo.vQ2();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C08JS.LIZ(nVar.toString(), BioContactData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public final void up(View view) {
        BioContactData bioContactData;
        BioContactData bioContactData2;
        if (!this.LLJLL && (bioContactData = (BioContactData) this.LLJJLIIIJLLLLLLLZ) != null && Intrinsics.LJFF(bioContactData.getBizPhoneEnableCall(), Boolean.FALSE) && (bioContactData2 = (BioContactData) this.LLJJLIIIJLLLLLLLZ) != null && Intrinsics.LJFF(bioContactData2.getBizPhoneEnableText(), Boolean.FALSE)) {
            return;
        }
        super.up(view);
    }
}
