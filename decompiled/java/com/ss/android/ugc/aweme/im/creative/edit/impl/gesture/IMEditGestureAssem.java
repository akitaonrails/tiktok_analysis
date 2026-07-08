package com.ss.android.ugc.aweme.im.creative.edit.impl.gesture;

import X.C01GW;
import X.C0QSJ;
import X.C13LE;
import X.C1A71;
import X.C2174131A6x;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.creative.edit.impl.ui.IMEditPageScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class IMEditGestureAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 600));
    public volatile C2174131A6x LLJ;
    public InterfaceC665370Q7z LLJI;
    public C0QSJ LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMEditGestureAssem.class, "featureGraph", "getFeatureGraph()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/di/IMEditFeatureGraph;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{IMEditPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IMEditPageScope.class);
        return arrayList;
    }

    public final C2174131A6x Go() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJIJIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJI;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJI = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{IMEditPageScope.class});
            this.LLJIJIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C2174131A6x c2174131A6x = (C2174131A6x) c0qsjLIZLLL.getAbility(C2174131A6x.class);
        C687700QyG.LJ(c2174131A6x, C2174131A6x.class);
        return c2174131A6x;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if ((view instanceof ViewGroup) && view != null) {
            ((C1A71) this.LLIZLLLIL.getValue()).LIZ.getValue().init((ViewGroup) view);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("wrong view type: ");
        sbLIZ.append(view);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
