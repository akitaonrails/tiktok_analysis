package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C2198708jR;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2258508t5;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.dynamic.card.api.event.IIMDynamicCardOpenService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.legoImpl.task.TtopShareMessageReceiverTask;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TtopShareMessageReceiverTask implements C0CCZ, InterfaceC799590VYf {
    public static final Keva LL = Keva.getRepo("minis_im_card");

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TtopShareMessageReceiverTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.08t4] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IIMDynamicCardOpenService.LIZ.getClass();
        C2198708jR.LIZIZ.getValue().LIZ(new InterfaceC2258508t5() { // from class: X.08t4
            @Override // X.InterfaceC2258508t5
            public void onEvent(C1258204w8 c1258204w8) {
                Object obj;
                String str;
                Object obj2;
                String str2;
                Object obj3;
                String str3;
                Object obj4;
                int i = C2187451AjH.LIZ;
                Objects.toString(c1258204w8);
                if (!Intrinsics.LJFF(c1258204w8.LIZLLL, "click")) {
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("is_regression_test", CardStruct.IStatusCode.DEFAULT);
                    Map<String, Object> map = c1258204w8.LJ;
                    String str4 = null;
                    if (map != null) {
                        obj = map.get("minis_type");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    c0lab.LJ("minis_type", str);
                    Map<String, Object> map2 = c1258204w8.LJ;
                    if (map2 != null) {
                        obj2 = map2.get("minis_id");
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    } else {
                        str2 = null;
                    }
                    c0lab.LJ("minis_id", str2);
                    Map<String, Object> map3 = c1258204w8.LJ;
                    if (map3 != null) {
                        obj3 = map3.get("enter_method");
                    } else {
                        obj3 = null;
                    }
                    if (obj3 instanceof String) {
                        str3 = (String) obj3;
                    } else {
                        str3 = null;
                    }
                    c0lab.LJ("enter_method", str3);
                    Map<String, Object> map4 = c1258204w8.LJ;
                    if (map4 != null && (obj4 = map4.get("collection_id")) != null) {
                        if (obj4 instanceof String) {
                            str4 = (String) obj4;
                        }
                        c0lab.LJ("collection_id", str4);
                    }
                    C20684815ws.LJIILLIIL("minis_entrance_show", c0lab.LIZ);
                    return;
                }
                Keva keva = TtopShareMessageReceiverTask.LL;
                C1227904rF.LIZ.getClass();
                keva.storeString("minis_entrance_click", C1227904rF.LJI(c1258204w8));
            }
        });
    }
}
