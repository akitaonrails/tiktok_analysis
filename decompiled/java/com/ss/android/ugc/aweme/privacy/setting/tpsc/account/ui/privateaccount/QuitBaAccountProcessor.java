package com.ss.android.ugc.aweme.privacy.setting.tpsc.account.ui.privateaccount;

import X.C11NZ;
import X.C747310TTd;
import X.InterfaceC1501160pAQ;
import android.content.Context;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class QuitBaAccountProcessor {
    public final Context LIZ;
    public final Function1<Integer, Unit> LIZIZ;

    public interface CanQuitBusinessAccountApi {
        public static final C747310TTd LIZ = C747310TTd.LIZ;

        @InterfaceC1501160pAQ("/aweme/v1/ad/ba/quitcheck/")
        C11NZ<BaseResponse> check();
    }

    public QuitBaAccountProcessor(Context context, AwS591S0100000_12 awS591S0100000_12) {
        this.LIZ = context;
        this.LIZIZ = awS591S0100000_12;
    }
}
