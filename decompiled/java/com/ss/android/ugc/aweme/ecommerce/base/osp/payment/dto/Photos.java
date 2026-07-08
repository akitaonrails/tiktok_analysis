package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Photos {

    @C09CT("dark_photos")
    public List<String> darkPhotos;

    @C09CT("photos")
    public List<String> lightPhotos;

    public Photos() {
    }

    public Photos(List<String> list, List<String> list2) {
        this.lightPhotos = list;
        this.darkPhotos = list2;
    }
}
