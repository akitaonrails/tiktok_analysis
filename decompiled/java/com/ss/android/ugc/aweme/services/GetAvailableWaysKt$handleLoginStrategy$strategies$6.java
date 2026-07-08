package com.ss.android.ugc.aweme.services;

import X.C09AY;
import X.InterfaceC1631630sYr;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysUserData;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class GetAvailableWaysKt$handleLoginStrategy$strategies$6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AvailableWaysUserData $data;
    public final /* synthetic */ String $email;
    public final /* synthetic */ InterfaceC1631630sYr<String, String, LoginMethodName, AvailableWaysUserData, Unit> $emailLoginAction;
    public final /* synthetic */ String $passportTicket;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetAvailableWaysKt$handleLoginStrategy$strategies$6(InterfaceC1631630sYr<? super String, ? super String, ? super LoginMethodName, ? super AvailableWaysUserData, Unit> interfaceC1631630sYr, String str, String str2, AvailableWaysUserData availableWaysUserData) {
        super(0);
        this.$emailLoginAction = interfaceC1631630sYr;
        this.$passportTicket = str;
        this.$email = str2;
        this.$data = availableWaysUserData;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        this.$emailLoginAction.invoke(this.$passportTicket, this.$email, LoginMethodName.EMAIL_PASS, this.$data);
        return Unit.LIZ;
    }
}
