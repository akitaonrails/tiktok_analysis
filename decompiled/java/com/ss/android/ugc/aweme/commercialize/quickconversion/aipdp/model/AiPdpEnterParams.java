package com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model;

import X.AbstractC343940De4;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public final class AiPdpEnterParams implements Serializable {
    public static final int $stable = 8;
    public final Aweme aweme;
    public final AiPdpLynxData lynxData;
    public final AiPdpNativeData nativeData;
    public final Function1<String, Unit> onCheckoutUrlGenerate;
    public final Function1<AbstractC343940De4, Unit> onDialogCloseAction;
    public final Function1<String, Unit> onExpandAction;
    public final Function0<Unit> onFallBackAction;
    public final String refer;
    public final String sessionId;

    public AiPdpEnterParams() {
        this(null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AiPdpEnterParams(AiPdpNativeData aiPdpNativeData, AiPdpLynxData aiPdpLynxData, Aweme aweme, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super AbstractC343940De4, Unit> function13, Function0<Unit> function0, String str, String str2) {
        this.nativeData = aiPdpNativeData;
        this.lynxData = aiPdpLynxData;
        this.aweme = aweme;
        this.onExpandAction = function1;
        this.onCheckoutUrlGenerate = function12;
        this.onDialogCloseAction = function13;
        this.onFallBackAction = function0;
        this.refer = str;
        this.sessionId = str2;
    }
}
