package com.ss.android.ugc.aweme.services;

import X.C09AY;
import X.C0XWD;
import X.InterfaceC1237760iJa;
import X.InterfaceC1631620sYq;
import android.content.DialogInterface;
import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class ForceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1 extends C09AY implements InterfaceC1631620sYq<Integer, Integer, Object, Unit> {
    public final /* synthetic */ InterfaceC1237760iJa $callback;
    public final /* synthetic */ DialogInterface $dialog;
    public final /* synthetic */ String $enterFrom;
    public final /* synthetic */ String $enterMethod;
    public final /* synthetic */ ForceBindingAccountService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceBindingAccountService$buttonOnClickBasedOnActionType$resultHandler$1(ForceBindingAccountService forceBindingAccountService, String str, String str2, InterfaceC1237760iJa interfaceC1237760iJa, DialogInterface dialogInterface) {
        super(3);
        this.this$0 = forceBindingAccountService;
        this.$enterFrom = str;
        this.$enterMethod = str2;
        this.$callback = interfaceC1237760iJa;
        this.$dialog = dialogInterface;
    }

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Object obj) {
        BaseBundle baseBundle;
        num.intValue();
        if (num2.intValue() == 1) {
            this.this$0.clearCurrentCacheConfig();
            if ((obj instanceof Bundle) && (baseBundle = (BaseBundle) obj) != null && baseBundle.getBoolean("ocl_checkbox_checked")) {
                ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJIIL(C0XWD.FYP_POP_UP, this.$enterFrom, this.$enterMethod, null, null);
            }
            InterfaceC1237760iJa interfaceC1237760iJa = this.$callback;
            if (interfaceC1237760iJa != null) {
                interfaceC1237760iJa.onPhoneBindResult(true);
            }
            DialogInterface dialogInterface = this.$dialog;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        } else {
            InterfaceC1237760iJa interfaceC1237760iJa2 = this.$callback;
            if (interfaceC1237760iJa2 != null) {
                interfaceC1237760iJa2.onPhoneBindResult(false);
            }
        }
        return Unit.LIZ;
    }
}
