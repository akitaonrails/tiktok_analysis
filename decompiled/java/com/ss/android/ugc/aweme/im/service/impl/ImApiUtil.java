package com.ss.android.ugc.aweme.im.service.impl;

import X.C01GW;
import X.C06ZT;
import X.C06ZX;
import X.C452501pT;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import com.ss.android.ugc.aweme.im.common.model.BlockResponse;
import com.ss.android.ugc.aweme.im.common.model.FeedbackRequest;
import com.ss.android.ugc.aweme.im.common.util.IImApiUtil;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1294060jmO
public final class ImApiUtil implements IImApiUtil {
    public static final C01GW<C06ZX> LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(517));

    @Override // com.ss.android.ugc.aweme.im.common.util.IImApiUtil
    public final Object LIZ(String str, String str2, int i, InterfaceC1364105Vn<? super BlockResponse> interfaceC1364105Vn) {
        return LIZ.getValue().LIZ(str, str2, i, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.im.common.util.IImApiUtil
    public final void LIZIZ(Activity activity, IMUser iMUser, String str, String str2) {
        if (!(iMUser instanceof IMUser)) {
            return;
        }
        BlockUserController blockUserController = new BlockUserController(activity, iMUser, str, "inline_message", null, null, null, null, str2, null, 752);
        if (true != blockUserController.LLILLJJLI.isBlock()) {
            blockUserController.LIZ(AFwS187S0000000_2.get$arr$(538), AFwS187S0000000_2.get$arr$(539));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.common.util.IImApiUtil
    public final Object LIZJ(String str, String str2, Long l, String str3, String str4, Long l2, String str5, String str6, String str7, String str8, List list, Integer num, String str9, C06ZT c06zt) {
        return LIZ.getValue().LIZIZ(new FeedbackRequest(str, str2, l, str3, str4, l2, str5, str6, str7, str8, list, num, str9), c06zt);
    }
}
