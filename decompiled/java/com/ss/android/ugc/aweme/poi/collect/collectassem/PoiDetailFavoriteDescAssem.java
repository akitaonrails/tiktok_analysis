package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1189060h32;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1843500y4a;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2217381BqS;
import X.C339190DRl;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailContainerViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailFavoriteDescAssem extends PoiDetailBaseUiSlotComponent<Object> implements IPoiCollectStatusAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public long LLJJIJIL;
    public boolean LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailFavoriteDescAssem.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiDetailFavoriteDescAssem.class, "poiDetailContainerVm", "getPoiDetailContainerVm()Lcom/ss/android/ugc/aweme/poi/detail/container/newarchi/data/PoiDetailContainerViewModel;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiDetailFavoriteDescAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 732), AFwS256S0000000_18.get$arr$(292), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiDetailContainerViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 733), AFwS256S0000000_18.get$arr$(293), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 731));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dzs;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 744514706) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        long jLongValue;
        super.onViewCreated(view);
        PoiListApi.PoiDetailResponse poiDetailResponseIp = ip();
        if (poiDetailResponseIp != null) {
            Long realFavoriteCnt = poiDetailResponseIp.getRealFavoriteCnt();
            long jLongValue2 = 0;
            if (realFavoriteCnt != null) {
                jLongValue = realFavoriteCnt.longValue();
            } else {
                jLongValue = 0;
            }
            this.LLJJIJIL = jLongValue;
            this.LLJJJ = C1189060h32.LJIIZILJ(poiDetailResponseIp.isCollected());
            Long realFavoriteCnt2 = poiDetailResponseIp.getRealFavoriteCnt();
            if (realFavoriteCnt2 != null) {
                jLongValue2 = realFavoriteCnt2.longValue();
            }
            sp(jLongValue2);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final void op(PoiListApi.PoiDetailResponse poiDetailResponse) {
        Long realFavoriteCnt = poiDetailResponse.getRealFavoriteCnt();
        if (realFavoriteCnt != null) {
            sp(realFavoriteCnt.longValue());
        }
    }

    public final void sp(long j) {
        if (j <= 0) {
            C339190DRl.LIZIZ((View) this.LLJJIJIIJIL.getValue());
        } else if (((View) this.LLJJIJIIJIL.getValue()).getVisibility() != 0) {
            C339190DRl.LIZLLL((View) this.LLJJIJIIJIL.getValue());
        }
        ((TextView) this.LLJJIJIIJIL.getValue()).setText(C786410Ut5.j4(u.LJJIFFI(C20642515q3.LJI(2131844692), "%d", "%s", false), Arrays.copyOf(new Object[]{C1843500y4a.LIZIZ(j)}, 1)));
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.IPoiCollectStatusAbility
    public final void Pe2(String str, boolean z) {
        if (str != null) {
            AssemVMLazy assemVMLazy = this.LLJJIJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
            if (Intrinsics.LJFF(str, ((PoiDetailInfoViewModel) assemVMLazy.getValue()).LL)) {
                if (z) {
                    if (!this.LLJJJ) {
                        sp(this.LLJJIJIL + 1);
                        return;
                    } else {
                        sp(this.LLJJIJIL);
                        return;
                    }
                }
                if (this.LLJJJ) {
                    sp(this.LLJJIJIL - 1);
                } else {
                    sp(this.LLJJIJIL);
                }
            }
        }
    }
}
