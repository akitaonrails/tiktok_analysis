package com.ss.android.ugc.aweme.hometab.base;

import X.AbstractC1583720rJa;
import X.AbstractC1583860rJo;
import X.C01GW;
import X.C1581650rGF;
import X.C1584230rKP;
import X.C1584460rKm;
import X.C1593020rYa;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1583080rIY;
import X.InterfaceC1584260rKS;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.TabFragmentGroup;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class BottomTabNodeGroup extends TabFragmentGroup implements InterfaceC1584260rKS {
    public final Context LLJILJILJ;
    public final BottomTabProtocol LLJILLL;
    public final ExecutorService LLJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1584230rKP(this));

    @Override // com.ss.android.ugc.aweme.TabFragmentGroup, X.InterfaceC1583870rJp
    public final void LJIIIIZZ(String str, String str2) {
    }

    @Override // X.InterfaceC1583870rJp
    public final String LIZLLL() {
        return this.LLJILLL.mc(this.LLJILJILJ);
    }

    @Override // X.AbstractC1583720rJa, X.InterfaceC1583870rJp
    public final String LJFF() {
        return this.LLJILLL.getMob();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentGroup, X.InterfaceC1583870rJp
    public final void LJIIJ() {
        this.LLJILLL.LJIIIIZZ(this.LLJILJILJ);
    }

    @Override // X.InterfaceC1584260rKS
    public final C1593020rYa LJIILL() {
        return (C1593020rYa) this.LLJJI.getValue();
    }

    @Override // X.AbstractC1583720rJa
    public final Bundle LJIIZILJ() {
        return this.LLJILLL.V9(this.LLJILJILJ);
    }

    @Override // X.AbstractC1583720rJa
    public final Class<? extends Fragment> LJIJ() {
        return this.LLJILLL.LLJIJIL();
    }

    @Override // X.AbstractC1583710rJZ
    public final boolean LJJII() {
        AbstractC1583860rJo abstractC1583860rJoLJFF = this.LLJILLL.LJFF();
        if (abstractC1583860rJoLJFF != null) {
            return abstractC1583860rJoLJFF.LIZIZ();
        }
        "tagGroup in protocol is null".toString();
        throw new IllegalArgumentException("tagGroup in protocol is null");
    }

    @Override // X.AbstractC1583720rJa
    public final String tag() {
        return this.LLJILLL.getTag();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentGroup, X.InterfaceC1583870rJp
    public final void LIZIZ() {
        boolean zLJI = MethodIDManager.LJI(71854);
        this.LLJILLL.LJII(this.LLJILJILJ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final int hashCode() {
        return tag().hashCode();
    }

    @Override // X.InterfaceC1583870rJp
    public final View LJI(InterfaceC1583080rIY interfaceC1583080rIY) {
        C1593020rYa c1593020rYaLJIILL = LJIILL();
        C1584460rKm c1584460rKm = (C1584460rKm) this.LLJILLL.LL.getValue();
        View viewLIZ = c1584460rKm.LIZ(interfaceC1583080rIY, c1593020rYaLJIILL);
        c1584460rKm.LL = viewLIZ;
        return viewLIZ;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(BottomTabNodeGroup.class, cls) && TextUtils.equals(tag(), ((AbstractC1583720rJa) obj).tag())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1583710rJZ
    public final void LJJIIZ(Bundle bundle, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("main bottom node switch tag, ");
        sbLIZ.append(str);
        C1581650rGF.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1583860rJo abstractC1583860rJoLJFF = this.LLJILLL.LJFF();
        if (abstractC1583860rJoLJFF != null) {
            abstractC1583860rJoLJFF.LIZLLL(this.LLJILJILJ, str, bundle);
        } else {
            "tagGroup in protocol is null".toString();
            throw new IllegalArgumentException("tagGroup in protocol is null");
        }
    }

    public BottomTabNodeGroup(Context context, BottomTabProtocol bottomTabProtocol, ExecutorService executorService) {
        this.LLJILJILJ = context;
        this.LLJILLL = bottomTabProtocol;
        this.LLJJ = executorService;
        bottomTabProtocol.init(context);
        AbstractC1583860rJo abstractC1583860rJoLJFF = bottomTabProtocol.LJFF();
        if (abstractC1583860rJoLJFF != null) {
            abstractC1583860rJoLJFF.LIZJ(executorService);
            Iterator<AbstractC1583720rJa> it2 = abstractC1583860rJoLJFF.LIZ(context).iterator();
            while (it2.hasNext()) {
                LJJ(it2.next());
            }
            return;
        }
        "tagGroup in protocol is null".toString();
        throw new IllegalArgumentException("tagGroup in protocol is null");
    }
}
