package com.ss.android.ugc.aweme.services;

import X.C1590400rUM;
import X.C1591410rVz;
import X.InterfaceC1209250hZb;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes25.dex */
public interface IBusinessComponentService {
    Dialog newOptionsDialog(Fragment fragment, Context context, Aweme aweme, String str);

    InterfaceC1209250hZb newScrollSwitchHelper(Context context, C1591410rVz c1591410rVz, C1590400rUM c1590400rUM);

    InterfaceC1209250hZb newScrollSwitchHelper(Fragment fragment, C1591410rVz c1591410rVz, C1590400rUM c1590400rUM);
}
