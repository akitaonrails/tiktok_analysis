package com.ss.android.ugc.aweme.setting.ui.rvmpcompose;

import X.C673150Qan;
import X.InterfaceC687730QyJ;
import java.util.ArrayList;
import java.util.List;
import tiktok.communication.ComposeScope;

/* JADX INFO: loaded from: classes31.dex */
public final class LoginScope extends ComposeScope {
    @Override // tiktok.communication.ComposeScope, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // tiktok.communication.ComposeScope, X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // tiktok.communication.ComposeScope, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LoginScope.class);
        return arrayList;
    }

    @Override // tiktok.communication.ComposeScope, X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // tiktok.communication.ComposeScope, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // tiktok.communication.ComposeScope, X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }
}
