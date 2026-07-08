package com.ss.android.ugc.aweme.compliance.sandbox.network;

import X.C0CCZ;
import X.C0VZ0;
import X.C2097908Jt;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.google.gson.n;
import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKResponseKt;
import com.orbu.core.adapter.TTKSettingsRequest;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKOrbuSettingsTask implements C0CCZ {
    public final n LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TTKOrbuSettingsTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    public TTKOrbuSettingsTask(n nVar) {
        this.LL = nVar;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        TTKResponseKt.isBlock(TTKOrbu.INSTANCE.shouldInterceptTTKRequest(new TTKSettingsRequest(this.LL.toString(), C2097908Jt.LIZJ(new Pair("x-tt-dataflow-id", "738197761")))));
    }
}
