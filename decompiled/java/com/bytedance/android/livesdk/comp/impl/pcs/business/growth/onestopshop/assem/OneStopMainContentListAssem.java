package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.assem;

import X.AbstractC1585810rMx;
import X.C019F;
import X.C0KJF;
import X.C1217770hnL;
import X.C13LE;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1820840xU2;
import X.C1820860xU4;
import X.C1820910xU9;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C520010KaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.item.SparkFlashPowerCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.assem.OneStopMainContentListAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.CtaButtonCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.CtaButtonListCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.MainPageHeaderCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.PlaybookListCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.SpacerCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.promotioncard.PromotionCardCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes28.dex */
public final class OneStopMainContentListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLJJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OneStopMainContentListAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/onestopshop/vm/OneStopPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public OneStopMainContentListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OneStopPageVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217770hnL(c19719912DlLIZ), new C1820910xU9(), null, true);
        this.LLJJIJIIJIL = 99;
        this.LLJJJ = 99;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyv;
    }

    public final OneStopPageVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (OneStopPageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        SparkFlashPowerCell sparkFlashPowerCell;
        super.onDestroy();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            int i = 0;
            for (Object obj : (ArrayList) viewOnAttachStateChangeListenerC20604515jv.getState().LJII()) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if (obj instanceof C0KJF) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = viewOnAttachStateChangeListenerC20604515jv.findViewHolderForAdapterPosition(i);
                    if ((viewHolderFindViewHolderForAdapterPosition instanceof SparkFlashPowerCell) && (sparkFlashPowerCell = (SparkFlashPowerCell) viewHolderFindViewHolderForAdapterPosition) != null) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFlashPowerCell.LLILLJJLI;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIFFI(true);
                        }
                        sparkFlashPowerCell.LLILLJJLI = null;
                    }
                }
                i = i2;
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        RecyclerView.LayoutManager layoutManager;
        IHostCreativeTool iHostCreativeTool;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLJJIII = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(MainPageHeaderCell.class, PromotionCardCell.class, CtaButtonCell.class, SpacerCell.class, PlaybookListCell.class, CtaButtonListCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(SparkFlashPowerCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null && (iHostCreativeTool = C520010KaN.LIZ) != null && iHostCreativeTool.UC0()) {
            viewOnAttachStateChangeListenerC20604515jv3.setLifecycleOwner(this);
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0xTu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1820790xTx) obj).LL;
            }
        }, null, new C1820840xU2(this), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0xTy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1820790xTx) obj).LLIZLLLIL;
            }
        }, null, new C1820860xU4(this), 6);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJIII;
        final LinearLayoutManager linearLayoutManager = null;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            layoutManager = viewOnAttachStateChangeListenerC20604515jv4.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
            viewOnAttachStateChangeListenerC20604515jv5.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0xU5
                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                    RecyclerView.LayoutManager layoutManager2;
                    LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                    if (linearLayoutManager2 != null) {
                        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager2.findFirstCompletelyVisibleItemPosition();
                        OneStopMainContentListAssem oneStopMainContentListAssem = this;
                        if (iFindFirstCompletelyVisibleItemPosition == -1) {
                            oneStopMainContentListAssem.getClass();
                            return;
                        }
                        if (iFindFirstCompletelyVisibleItemPosition != oneStopMainContentListAssem.LLJJIJI) {
                            if (iFindFirstCompletelyVisibleItemPosition > 0) {
                                oneStopMainContentListAssem.hp().setState(new C1820890xU7(false));
                            } else {
                                oneStopMainContentListAssem.hp().setState(new C1820890xU7(true));
                            }
                        }
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = oneStopMainContentListAssem.LLJJIII;
                        if (viewOnAttachStateChangeListenerC20604515jv6 != null && (layoutManager2 = viewOnAttachStateChangeListenerC20604515jv6.getLayoutManager()) != null) {
                            int i3 = oneStopMainContentListAssem.LLJJIJIIJIL;
                            int i4 = i3 + 1;
                            if (iFindFirstCompletelyVisibleItemPosition > i4) {
                                if (iFindFirstCompletelyVisibleItemPosition != oneStopMainContentListAssem.LLJJIJI) {
                                    oneStopMainContentListAssem.hp().setState(new C1820880xU6(true));
                                }
                            } else if (iFindFirstCompletelyVisibleItemPosition == i4) {
                                View viewFindViewByPosition = layoutManager2.findViewByPosition(i3);
                                if (viewFindViewByPosition != null) {
                                    if (viewFindViewByPosition.getTop() < (-oneStopMainContentListAssem.LLJJIJIL)) {
                                        oneStopMainContentListAssem.hp().setState(new C1820880xU6(true));
                                    } else {
                                        oneStopMainContentListAssem.hp().setState(new C1820880xU6(false));
                                    }
                                }
                            } else if (iFindFirstCompletelyVisibleItemPosition < i4 && iFindFirstCompletelyVisibleItemPosition != oneStopMainContentListAssem.LLJJIJI) {
                                oneStopMainContentListAssem.hp().setState(new C1820880xU6(false));
                            }
                        }
                        oneStopMainContentListAssem.LLJJIJI = iFindFirstCompletelyVisibleItemPosition;
                    }
                }
            });
        }
    }
}
