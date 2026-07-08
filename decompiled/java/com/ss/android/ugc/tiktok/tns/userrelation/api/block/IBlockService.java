package com.ss.android.ugc.tiktok.tns.userrelation.api.block;

import X.C19EG;
import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS168S1100000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS70S1000000_19;

/* JADX INFO: loaded from: classes20.dex */
public interface IBlockService {
    void LIZ(Context context, String str, Function0 function0, Function1 function1);

    void LIZIZ(Context context, User user, String str, String str2, AwS168S1100000_19 awS168S1100000_19, AwS70S1000000_19 awS70S1000000_19);

    void LIZJ(C19EG c19eg);

    void LIZLLL(Context context, String str, String str2, Function1 function1);

    CharSequence LJ(User user, String str);

    void LJFF(Context context, String str, String str2, AwS563S0100000_19 awS563S0100000_19, AFwS257S0000000_19 aFwS257S0000000_19);

    void LJI(Context context, User user, String str, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}
