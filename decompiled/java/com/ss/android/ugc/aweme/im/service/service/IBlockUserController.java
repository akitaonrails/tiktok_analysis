package com.ss.android.ugc.aweme.im.service.service;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public interface IBlockUserController {

    public interface Factory {
        BlockUserController LIZ(Activity activity, IMUser iMUser, String str, String str2, Function0 function0, Function1 function1, Function1 function12, String str3, String str4);
    }

    void LIZ(Function0<Unit> function0, Function0<Unit> function02);

    void LIZIZ();
}
