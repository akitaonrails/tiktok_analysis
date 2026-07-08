package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C01GW;
import X.C1173300gdc;
import X.C1173980gei;
import X.C1174830gg5;
import X.C1174850gg7;
import X.C1180090goZ;
import X.C1180100goa;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1185600gxS;
import X.C1185610gxT;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2188811AlT;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1181010gq3;
import X.InterfaceC1185170gwl;
import X.InterfaceC665370Q7z;
import Y.AObserverS222S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiDetailRecommendDishesAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent;
import com.ss.android.ugc.aweme.slash.skeleton.ISlashSkeletonSignalNotify;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PoiDetailBaseAssem<T extends BaseComponentData> extends BaseSlashGlueSlotAssemComponent<T> {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public View LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public boolean LLJJJ = true;
    public boolean LLJJJIL = true ^ (this instanceof PoiDetailRecommendDishesAssem);
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS562S0100000_18((PoiDetailBaseAssem) this, 1111));
    public View LLJJJJJIL;

    public void tp(PoiListApi.PoiDetailResponse poiDetailResponse) {
    }

    public void up() {
    }

    public abstract boolean yp();

    public Integer zp() {
        return null;
    }

    public final InterfaceC1185170gwl mp() {
        return (C1185610gxT) this.LLJJJJ.getValue();
    }

    public final boolean sp() {
        ViewGroup viewGroup = this.LLJJIJIL;
        return viewGroup != null ? viewGroup.getVisibility() == 0 : getContentView().getVisibility() == 0;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public final InterfaceC1181010gq3 BK2() {
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null) {
            return interfaceC1181010gq3LIZ;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            return C1174830gg5.LIZ(fragmentLJI);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public void fm1() {
        C1174850gg7.LJII(this);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = C1173980gei.LIZ(this);
        }
        C1185430gxB.LJJIJIL(c1185430gxB, interfaceC665370Q7zLJIIL, strLJFF, C1173980gei.LIZ(this), new C1185050gwZ(PageFinder.via(getContentView())), 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PoiListApi.PoiDetailResponse lp() {
        C1185600gxS c1185600gxS;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        if (c1173300gdcLJ != null && (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) != null && (poiDetailResponse = c1185600gxS.LJIIIZ) != null) {
            return poiDetailResponse;
        }
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        if (interfaceC1181010gq3BK2 != null) {
            return (PoiListApi.PoiDetailResponse) interfaceC1181010gq3BK2.ta2(new C1180090goZ("poi_head_info"));
        }
        return null;
    }

    public final void Ap(boolean z) {
        ISlashSkeletonSignalNotify iSlashSkeletonSignalNotify;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (iSlashSkeletonSignalNotify = (ISlashSkeletonSignalNotify) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISlashSkeletonSignalNotify.class, null)) != null) {
            iSlashSkeletonSignalNotify.eH(C1173980gei.LIZ(this), z);
        }
    }

    public final void Bp(boolean z) {
        this.LLJJJ = z;
        if (!so()) {
            return;
        }
        if (z) {
            up();
        }
        int i = 0;
        if (this.LLJJIJIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("contentContainerWithDivider");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            ViewGroup viewGroup = this.LLJJIJIL;
            if (viewGroup != null) {
                if (!z) {
                    i = 8;
                }
                C786410Ut5.LJLZ(i, viewGroup);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("contentView");
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
        View contentView = getContentView();
        if (!z) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, contentView);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        int iIntValue;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i;
        super.onViewCreated(view);
        if (yp() && so()) {
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.e3k, viewGroup, false);
                if (viewTd instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) viewTd;
                } else {
                    viewGroup2 = null;
                }
                this.LLJJIJIL = viewGroup2;
                if (viewGroup2 != null) {
                    C786410Ut5.LJJJJI(viewGroup);
                    viewGroup2.addView(getContentView(), 0);
                    viewGroup.addView(viewGroup2);
                    this.LLJJIJIIJIL = viewGroup2.findViewById(R.id.r1_);
                    int i2 = 8;
                    if (this.LLJJJ) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, viewGroup2);
                    View view2 = this.LLJJIJIIJIL;
                    if (view2 != null) {
                        if (this.LLJJJIL) {
                            i2 = 0;
                        }
                        C786410Ut5.LJLLLLLL(i2, view2);
                    }
                }
            }
        }
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        if (interfaceC1181010gq3BK2 != null) {
            interfaceC1181010gq3BK2.sB1(C1180100goa.LIZ("poi_head_info"), this, new AObserverS222S0100000_18(this, 12));
        }
        Integer numZp = zp();
        if (numZp != null && (iIntValue = numZp.intValue()) != 0 && getContext() != null) {
            ViewGroup viewGroup3 = this.LLJJIJIL;
            if ((viewGroup3 instanceof LinearLayout) && viewGroup3 != null) {
                View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(getContext()), iIntValue, viewGroup3, false);
                this.LLJJJJJIL = viewTd2;
                viewGroup3.addView(viewTd2, 0);
            }
        }
    }

    public boolean op(PoiListApi.PoiDetailResponse poiDetailResponse) {
        return !Intrinsics.LJFF(poiDetailResponse.getDataFromAnchor(), Boolean.TRUE);
    }
}
