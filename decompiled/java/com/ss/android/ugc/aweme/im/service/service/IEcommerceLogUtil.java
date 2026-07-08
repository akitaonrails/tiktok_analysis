package com.ss.android.ugc.aweme.im.service.service;

import X.C0YC9;
import X.C0ZCT;
import X.C869590Y9l;
import android.view.View;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.ShareProductContent;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface IEcommerceLogUtil {
    public static final C0ZCT LIZ = C0ZCT.LIZ;

    void LIZ(C869590Y9l c869590Y9l, ShareProductContent shareProductContent);

    void LIZIZ(SharePackage sharePackage, IMContact iMContact, boolean z, String str);

    void LIZJ(SharePackage sharePackage);

    void LIZLLL(SharePackage sharePackage, String str, List list);

    void LJ(int i, IMContact iMContact, SharePackage sharePackage);

    void LJFF(C869590Y9l c869590Y9l, ShareProductContent shareProductContent, C0YC9 c0yc9);

    void LJI(View view, C869590Y9l c869590Y9l, ShareProductContent shareProductContent);
}
