package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C13LP;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SaveData {

    @C09CT("da_info")
    public final String dataInfo;

    @C09CT("errors")
    public final List<Error> errors;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("address_id")
    public final String pudoAddressId;

    public final String LIZ() {
        List<Error> list = this.errors;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Error> it2 = list.iterator();
        while (it2.hasNext()) {
            Integer num = it2.next().code;
            if (num != null) {
                arrayList.add(num);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    public final boolean LIZIZ() {
        Integer numValueOf;
        List<Error> list = this.errors;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Error error : list) {
                Integer num = error.type;
                if (num != null && num.intValue() == 1) {
                    arrayList.add(error);
                }
            }
            numValueOf = Integer.valueOf(arrayList.size());
        } else {
            numValueOf = null;
        }
        List<Error> list2 = this.errors;
        return Intrinsics.LJFF(numValueOf, list2 != null ? Integer.valueOf(list2.size()) : null);
    }

    public SaveData(String str, String str2, List<Error> list, ExceptionUX exceptionUX, String str3) {
        this.id = str;
        this.pudoAddressId = str2;
        this.errors = list;
        this.exceptionUX = exceptionUX;
        this.dataInfo = str3;
    }
}
