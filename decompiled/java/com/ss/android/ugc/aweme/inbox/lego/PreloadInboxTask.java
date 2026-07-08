package com.ss.android.ugc.aweme.inbox.lego;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1903370zd9;
import X.C1904430zer;
import X.C1BCF;
import X.C2097608Jq;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
@C1BCF(distinctId = 116, taskType = "preload")
public final class PreloadInboxTask implements C0CCZ, InterfaceC799590VYf {
    public static volatile boolean LL;
    public static volatile boolean LLILLJJLI;
    public static final Map<Integer, String> LLILLL = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(R.layout.a95), "awemenotice_fragment_inbox_layout"), new Pair(Integer.valueOf(R.layout.aaj), "awemenotice_mus_item_notification_template"), new Pair(Integer.valueOf(R.layout.a_2), "awemenotice_inbox_item_activity_entrance"));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "preload_inbox_task";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return ((Boolean) C1904430zer.LJ.getValue()).booleanValue() ? 2 : 1;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1903370zd9.LIZIZ(true);
    }
}
