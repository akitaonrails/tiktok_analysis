package com.google.firebase.installations;

import X.C0W4J;
import X.C0WBG;
import X.C0WBI;
import X.C0WBM;
import X.C0WBO;
import X.C0WBP;
import X.C0WBQ;
import X.C0WBR;
import X.C20126213oy;
import X.C818880WAk;
import X.C819110WBh;
import X.InterfaceC812420Vtw;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0WBP<?>> getComponents() {
        C0WBQ c0wbqLIZ = C0WBP.LIZ(InterfaceC812420Vtw.class);
        c0wbqLIZ.LIZ(C0WBG.LIZ(C818880WAk.class));
        c0wbqLIZ.LIZ(new C0WBG(0, 1, C0W4J.class));
        c0wbqLIZ.LJ = new C0WBM() { // from class: X.0WBe
            @Override // X.C0WBM
            public final Object LIZ(C0WBH c0wbh) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c0wbh);
            }
        };
        C0WBO c0wbo = new C0WBO() { // from class: X.0WBi
        };
        C0WBQ c0wbqLIZ2 = C0WBP.LIZ(C0WBO.class);
        c0wbqLIZ2.LIZLLL = 1;
        c0wbqLIZ2.LJ = new C819110WBh(c0wbo);
        return Arrays.asList(c0wbqLIZ.LIZIZ(), c0wbqLIZ2.LIZIZ(), C0WBR.LIZ("fire-installations", "17.0.1"));
    }

    public static /* synthetic */ InterfaceC812420Vtw lambda$getComponents$0(C0WBI c0wbi) {
        return new C20126213oy((C818880WAk) c0wbi.LIZIZ(C818880WAk.class), c0wbi.LIZJ(C0W4J.class));
    }
}
