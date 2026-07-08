package com.ss.android.ugc.aweme.services;

import X.C09AY;
import X.C1749280vcc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public final class NetworkStandardUIServiceImpl$innerSetStatusView$diagnosisFunc$1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean $dateExpire;
    public final /* synthetic */ int $networkStatus;
    public final /* synthetic */ String $sceneName;
    public final /* synthetic */ C1749280vcc $tuxStatusView;
    public final /* synthetic */ NetworkStandardUIServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStandardUIServiceImpl$innerSetStatusView$diagnosisFunc$1(NetworkStandardUIServiceImpl networkStandardUIServiceImpl, C1749280vcc c1749280vcc, int i, boolean z, String str) {
        super(0);
        this.this$0 = networkStandardUIServiceImpl;
        this.$tuxStatusView = c1749280vcc;
        this.$networkStatus = i;
        this.$dateExpire = z;
        this.$sceneName = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        this.this$0.showDiagnoseDialog(this.$tuxStatusView.getContext(), this.$networkStatus, this.$dateExpire, this.$sceneName);
        return Unit.LIZ;
    }
}
