package com.ss.android.ugc.aweme.services;

import X.C1372400lok;
import X.C1590400rUM;
import X.C1590590rUf;
import X.C1591410rVz;
import X.InterfaceC1209250hZb;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes25.dex */
public class BusinessComponentServiceImpl implements IBusinessComponentService {
    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public InterfaceC1209250hZb newScrollSwitchHelper(Context context, C1591410rVz c1591410rVz, C1590400rUM c1590400rUM) {
        return new C1590590rUf(context, c1591410rVz, c1590400rUM);
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public InterfaceC1209250hZb newScrollSwitchHelper(Fragment fragment, C1591410rVz c1591410rVz, C1590400rUM c1590400rUM) {
        return new C1590590rUf(fragment, c1591410rVz, c1590400rUM);
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public Dialog newOptionsDialog(Fragment fragment, Context context, Aweme aweme, String str) {
        return C1372400lok.LIZ(fragment, context, aweme, str);
    }
}
