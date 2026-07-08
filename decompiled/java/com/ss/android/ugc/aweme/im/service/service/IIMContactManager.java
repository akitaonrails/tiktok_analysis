package com.ss.android.ugc.aweme.im.service.service;

import android.content.Context;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public interface IIMContactManager {
    void LIZ(Context context, IMContact iMContact, Function0<Unit> function0);

    List<String> LIZIZ(List<? extends IMContact> list);
}
