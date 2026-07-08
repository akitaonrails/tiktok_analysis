package com.ss.android.ugc.aweme.poi.map.assem;

import X.C019F;
import X.C1153900g8K;
import X.C1178280gle;
import X.C1179470gnZ;
import X.C1179540gng;
import X.C1180740gpc;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1203050hPb;
import X.C1388190mED;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.EnumC1203090hPf;
import X.InterfaceC1176690gj5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDynamicMapAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public C1179540gng LLJI;
    public FrameLayout LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDynamicMapAssem.class, "mapViewModel", "getMapViewModel()Lcom/ss/android/ugc/aweme/poi/map/PoiMapViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDynamicMapAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1358), AFwS256S0000000_18.get$arr$(447), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1153900g8K.class, "PoiDynamicMapHierarchyData"), checkSupervisorPrepared());
    }

    public final PoiMapViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (PoiMapViewModel) assemVMLazy.getValue();
    }

    public final void Ho() {
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str = ((C1153900g8K) this.LLJ.getValue()).LL;
        PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(this));
        c1185430gxB.getClass();
        C1185430gxB.LJJIJIIJIL(pageFinderVia, "poi_map", str);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        super.onViewCreated(view);
        this.LLJIJIL = (FrameLayout) view.findViewById(R.id.i7l);
        C1180740gpc.LIZ.getClass();
        IPoiMapService iPoiMapServiceLIZ = C1180740gpc.LIZ();
        C1179470gnZ c1179470gnZ = new C1179470gnZ();
        c1179470gnZ.LJFF = EnumC1203090hPf.MAP_TYPE_NORMAL;
        c1179470gnZ.LJII = true;
        c1179470gnZ.LJI = C1178280gle.LIZIZ(view.getContext());
        InterfaceC1176690gj5 iMapManager = iPoiMapServiceLIZ.getIMapManager(new C1203050hPb(c1179470gnZ));
        Fragment fragmentLIZIZ = iMapManager.LIZIZ();
        if (fragmentLIZIZ != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LIZIZ(R.id.i7l, fragmentLIZIZ);
            c19ehLJIIJ.LJIIIZ();
        }
        iMapManager.X(new AwS597S0100000_18(this, 387));
    }
}
