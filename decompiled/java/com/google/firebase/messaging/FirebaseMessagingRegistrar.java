package com.google.firebase.messaging;

import X.C0WBG;
import X.C0WBI;
import X.C0WBM;
import X.C0WBP;
import X.C0WBQ;
import X.C0WBR;
import X.C818880WAk;
import X.InterfaceC811000Vre;
import X.InterfaceC811540VsW;
import X.InterfaceC812410Vtv;
import X.InterfaceC812420Vtw;
import X.InterfaceC812430Vtx;
import X.InterfaceC814220Vwq;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0WBP<?>> getComponents() {
        C0WBP[] c0wbpArr = new C0WBP[2];
        C0WBQ c0wbqLIZ = C0WBP.LIZ(FirebaseMessaging.class);
        c0wbqLIZ.getClass();
        c0wbqLIZ.LIZ(C0WBG.LIZ(C818880WAk.class));
        c0wbqLIZ.LIZ(new C0WBG(0, 0, InterfaceC811000Vre.class));
        c0wbqLIZ.LIZ(new C0WBG(0, 1, InterfaceC812430Vtx.class));
        c0wbqLIZ.LIZ(new C0WBG(0, 1, InterfaceC812410Vtv.class));
        c0wbqLIZ.LIZ(new C0WBG(0, 0, InterfaceC814220Vwq.class));
        c0wbqLIZ.LIZ(C0WBG.LIZ(InterfaceC812420Vtw.class));
        c0wbqLIZ.LIZ(C0WBG.LIZ(InterfaceC811540VsW.class));
        c0wbqLIZ.LJ = new C0WBM() { // from class: X.0WBc
            @Override // X.C0WBM
            public final Object LIZ(C0WBH c0wbh) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(c0wbh);
            }
        };
        if (c0wbqLIZ.LIZJ != 0) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        c0wbqLIZ.LIZJ = 1;
        c0wbpArr[0] = c0wbqLIZ.LIZIZ();
        c0wbpArr[1] = C0WBR.LIZ("fire-fcm", "23.1.1");
        return Arrays.asList(c0wbpArr);
    }

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C0WBI c0wbi) {
        return new FirebaseMessaging((C818880WAk) c0wbi.LIZIZ(C818880WAk.class), (InterfaceC811000Vre) c0wbi.LIZIZ(InterfaceC811000Vre.class), c0wbi.LIZJ(InterfaceC812430Vtx.class), c0wbi.LIZJ(InterfaceC812410Vtv.class), (InterfaceC812420Vtw) c0wbi.LIZIZ(InterfaceC812420Vtw.class), (InterfaceC814220Vwq) c0wbi.LIZIZ(InterfaceC814220Vwq.class), (InterfaceC811540VsW) c0wbi.LIZIZ(InterfaceC811540VsW.class));
    }
}
