package com.ss.android.ugc.aweme.im.creative.edit.impl.quicklivereact;

import X.C01GW;
import X.C0QSJ;
import X.C1308910kAL;
import X.C1333705Jv;
import X.C1361400lX0;
import X.C13LE;
import X.C1A4Z;
import X.C2174131A6x;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC19359510ob;
import X.InterfaceC1146704e9;
import X.InterfaceC19370810qQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.creative.edit.impl.ui.IMEditPageScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class IMQuickLiveReactTnSNoticeAssem extends UISlotAssem implements InterfaceC19370810qQ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2399));
    public final EnumC19359510ob LLJJIII = EnumC19359510ob.TOOL_BAR;
    public volatile C2174131A6x LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMQuickLiveReactTnSNoticeAssem.class, "featureGraph", "getFeatureGraph()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/di/IMEditFeatureGraph;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cr7;
    }

    @Override // X.InterfaceC19370810qQ
    public final void Fd() {
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

    public final C2174131A6x hp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJIJIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJIIJIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJIJIIJIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{IMEditPageScope.class});
            this.LLJJIJIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C2174131A6x c2174131A6x = (C2174131A6x) c0qsjLIZLLL.getAbility(C2174131A6x.class);
        C687700QyG.LJ(c2174131A6x, C2174131A6x.class);
        return c2174131A6x;
    }

    @Override // X.InterfaceC19370810qQ
    public final EnumC19359510ob W() {
        return this.LLJJIII;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TextView textView = (TextView) view.findViewById(R.id.sn7);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, new C1361400lX0(getContext(), R.style.y0));
        if (numLIZJ != null) {
            textView.setTextColor(numLIZJ.intValue());
        }
        ((Keva) C1333705Jv.LIZ.getValue()).storeBoolean(C1333705Jv.LIZ(), true);
        ((C1A4Z) this.LLJJI.getValue()).LIZJ.getValue().LIZ(this);
    }

    @Override // X.InterfaceC19370810qQ
    public final void pi(int i) {
        C786410Ut5.LJLLLLLL(i, LJJIJL());
    }
}
