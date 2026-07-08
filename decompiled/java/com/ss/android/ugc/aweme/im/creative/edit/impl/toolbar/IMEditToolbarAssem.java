package com.ss.android.ugc.aweme.im.creative.edit.impl.toolbar;

import X.C01GW;
import X.C03D0;
import X.C0QSJ;
import X.C13BV;
import X.C13LE;
import X.C19719912Dl;
import X.C1A4X;
import X.C1A4Z;
import X.C2174131A6x;
import X.C2217381BqS;
import X.C417320GXy;
import X.C452501pT;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1404400meM;
import X.EnumC19359510ob;
import X.EnumC429170GsF;
import X.InterfaceC1146704e9;
import X.InterfaceC19370810qQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.creative.edit.impl.filter.IMEditFilterAssem;
import com.ss.android.ugc.aweme.im.creative.edit.impl.ui.IMEditPageScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class IMEditToolbarAssem extends UISlotAssem implements InterfaceC19370810qQ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2400));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2401));
    public final HashSet<EnumC429170GsF> LLJJIJI = new HashSet<>();
    public final EnumC19359510ob LLJJIJIIJIL = EnumC19359510ob.TOOL_BAR;
    public volatile C2174131A6x LLJJIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public C0QSJ LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMEditToolbarAssem.class, "featureGraph", "getFeatureGraph()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/di/IMEditFeatureGraph;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cgy;
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
        C0QSJ c0qsjLIZLLL = this.LLJJJIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJJ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{IMEditPageScope.class});
            this.LLJJJIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C2174131A6x c2174131A6x = (C2174131A6x) c0qsjLIZLLL.getAbility(C2174131A6x.class);
        C687700QyG.LJ(c2174131A6x, C2174131A6x.class);
        return c2174131A6x;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((C03D0) this.LLJJIII.getValue()).setData(C13BV.INSTANCE);
    }

    @Override // X.InterfaceC19370810qQ
    public final EnumC19359510ob W() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC1404400meM enumC1404400meM;
        super.onViewCreated(view);
        List<C1A4X> listCreate = ((C1A4Z) this.LLJJI.getValue()).LIZ.getValue().create();
        ArrayList arrayList = new ArrayList();
        for (C1A4X c1a4x : listCreate) {
            TuxIconView icon = c1a4x.getIcon();
            arrayList.add(icon);
            synchronized (this) {
                if (!this.LLJJIJI.contains(c1a4x.getTag())) {
                    EnumC429170GsF tag = c1a4x.getTag();
                    int[] iArr = C417320GXy.LIZ;
                    int i = iArr[tag.ordinal()];
                    if (i == 1) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMEditFilterAssem.class);
                        if (iArr[c1a4x.getTag().ordinal()] != 1) {
                            enumC1404400meM = null;
                        } else {
                            enumC1404400meM = EnumC1404400meM.FILTER;
                        }
                        C723850SaN.LIZLLL(this, new AwS211S0300000_2(this, c19719912DlLIZ, icon, 19));
                        this.LLJJIJI.add(c1a4x.getTag());
                        if (enumC1404400meM != null) {
                            ((C1A4Z) this.LLJJI.getValue()).LIZIZ.getValue().LIZIZ(enumC1404400meM);
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalArgumentException("Unexpected type");
                        }
                        throw new IllegalArgumentException("Not implemented yet");
                    }
                }
            }
        }
        ((C03D0) this.LLJJIII.getValue()).setData(arrayList);
        ((C1A4Z) this.LLJJI.getValue()).LIZJ.getValue().LIZ(this);
    }

    @Override // X.InterfaceC19370810qQ
    public final void pi(int i) {
        C786410Ut5.LJLLLLLL(i, LJJIJL());
    }
}
