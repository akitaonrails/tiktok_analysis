package com.google.firebase.datatransport;

import X.C0WBG;
import X.C0WBI;
import X.C0WBM;
import X.C0WBP;
import X.C0WBQ;
import X.C0WBR;
import X.C819190WBp;
import X.C819200WBq;
import X.InterfaceC814220Vwq;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class TransportRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0WBP<?>> getComponents() {
        C0WBQ c0wbqLIZ = C0WBP.LIZ(InterfaceC814220Vwq.class);
        c0wbqLIZ.getClass();
        c0wbqLIZ.LIZ(C0WBG.LIZ(Context.class));
        c0wbqLIZ.LJ = new C0WBM() { // from class: X.0WBd
            @Override // X.C0WBM
            public final Object LIZ(C0WBH c0wbh) {
                return TransportRegistrar.lambda$getComponents$0(c0wbh);
            }
        };
        return Arrays.asList(c0wbqLIZ.LIZIZ(), C0WBR.LIZ("fire-transport", "18.1.7"));
    }

    public static /* synthetic */ InterfaceC814220Vwq lambda$getComponents$0(C0WBI c0wbi) {
        C819200WBq.LIZIZ((Context) c0wbi.LIZIZ(Context.class));
        return C819200WBq.LIZ().LIZJ(C819190WBp.LJFF);
    }
}
