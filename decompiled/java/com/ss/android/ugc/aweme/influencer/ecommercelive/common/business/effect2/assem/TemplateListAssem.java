package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0NOH;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20603715jn;
import X.C20607315kN;
import X.C2217381BqS;
import X.C452501pT;
import X.C622680Oba;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C7835034f;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardActivityInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.BigSaleTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.DiscountTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.FlashDealTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.LiveGiveawayTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.MultiTextTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.ProductTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.ShopBagTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.SingleTextTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.SizeChartTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS320S0300000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateListAssem extends UIListContentAssem<TemplateListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 703));
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TemplateListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/TemplateListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TemplateListAssem.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TemplateListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TemplateListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 704), AFwS268S0000000_26.get$arr$(364), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BillboardGlobalViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 705), AFwS268S0000000_26.get$arr$(365), null, true);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 784));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 0;
        c20603715jn.LIZJ = true;
        c20603715jn.LJIIJ = false;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final TemplateListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (TemplateListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        TemplateListViewModel templateListViewModelIp = ip();
        C0NOH c0noh = templateListViewModelIp.LLIZ;
        if (c0noh != null) {
            c0noh.LIZJ();
        }
        templateListViewModelIp.LLIZ = null;
        C0NOH c0noh2 = templateListViewModelIp.LLIZLLLIL;
        if (c0noh2 != null) {
            c0noh2.LIZJ();
        }
        templateListViewModelIp.LLIZLLLIL = null;
        C622680Oba.LIZLLL(this);
    }

    @C14EU(sticky = true)
    public final void onBillboardChangeEvent(C7835034f c7835034f) {
        ip().manualListRefresh();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
        TemplateListViewModel templateListViewModelIp = ip();
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        templateListViewModelIp.LLILZIL = (BillboardGlobalViewModel) assemVMLazy.getValue();
        Go().LJIILJJIL(MultiTextTemplateCell.class, SingleTextTemplateCell.class, ProductTemplateCell.class, DiscountTemplateCell.class, SizeChartTemplateCell.class, ShopBagTemplateCell.class, BigSaleTemplateCell.class, FlashDealTemplateCell.class, LiveGiveawayTemplateCell.class);
        Go().setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        Go().LJII(new C20607315kN() { // from class: X.0v7V
            @Override // X.C20607315kN
            public final void LJIIIZ(boolean z) {
                InterfaceC1891350zJl interfaceC1891350zJl;
                TemplateItem templateItem;
                InterfaceC1891350zJl interfaceC1891350zJl2;
                TemplateItem templateItem2;
                Integer numValueOf;
                Long lLJIILIIL;
                C0NOI c0noiLIZ;
                int i;
                String str;
                String str2;
                Object next;
                Integer numValueOf2;
                long jLongValue;
                int i2;
                Long l;
                Long l2;
                Object next2;
                this.LL.Go().scrollToPosition(0);
                TemplateListViewModel templateListViewModelIp2 = this.LL.ip();
                Context context = view.getContext();
                C0NOH c0noh = templateListViewModelIp2.LLIZ;
                if (c0noh != null) {
                    c0noh.LIZJ();
                }
                Long lLJIILIIL2 = null;
                templateListViewModelIp2.LLIZ = null;
                C0NOH c0noh2 = templateListViewModelIp2.LLIZLLLIL;
                if (c0noh2 != null) {
                    c0noh2.LIZJ();
                }
                templateListViewModelIp2.LLIZLLLIL = null;
                List<ITEM> listListGetAll = templateListViewModelIp2.listGetAll();
                if (listListGetAll != 0) {
                    Iterator it2 = listListGetAll.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (((TemplateItem) ((InterfaceC1891350zJl) next2)).getType() == 8) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    interfaceC1891350zJl = (InterfaceC1891350zJl) next2;
                } else {
                    interfaceC1891350zJl = null;
                }
                if (interfaceC1891350zJl instanceof TemplateItem) {
                    templateItem = (TemplateItem) interfaceC1891350zJl;
                } else {
                    templateItem = null;
                }
                if (templateItem != null && templateItem.getActivityInfo() != null) {
                    C1730290v7z c1730290v7z = C1730290v7z.LIZ;
                    BillboardActivityInfo activityInfo = templateItem.getActivityInfo();
                    if (activityInfo != null) {
                        numValueOf2 = Integer.valueOf(activityInfo.activityStatus);
                    } else {
                        numValueOf2 = null;
                    }
                    c1730290v7z.getClass();
                    if (!C1730290v7z.LJIIL(numValueOf2)) {
                        BillboardActivityInfo activityInfo2 = templateItem.getActivityInfo();
                        long jLongValue2 = 0;
                        if (activityInfo2 != null && (l2 = activityInfo2.beginTime) != null) {
                            jLongValue = l2.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        BillboardActivityInfo activityInfo3 = templateItem.getActivityInfo();
                        if (activityInfo3 != null && (l = activityInfo3.endTime) != null) {
                            jLongValue2 = l.longValue();
                        }
                        C0NOI c0noiLIZ2 = C0NOL.LIZ(jLongValue, jLongValue2, templateListViewModelIp2.LLJI, templateListViewModelIp2.LLJ);
                        if (c0noiLIZ2 != null) {
                            C0NOH c0noh3 = new C0NOH();
                            templateListViewModelIp2.LLIZ = c0noh3;
                            c0noh3.LIZ(new AwS320S0300000_26(templateListViewModelIp2, context, templateItem, 1));
                            C0NOH c0noh4 = templateListViewModelIp2.LLIZ;
                            if (c0noh4 != null) {
                                c0noh4.LIZLLL(c0noiLIZ2);
                            }
                            C0NOH c0noh5 = templateListViewModelIp2.LLIZ;
                            if (c0noh5 != null) {
                                int i3 = c0noh5.LIZJ;
                                if (i3 != 2) {
                                    if (i3 != 3) {
                                        i2 = 1;
                                    } else {
                                        i2 = 3;
                                    }
                                } else {
                                    i2 = 2;
                                }
                                templateListViewModelIp2.AQ2(context, templateItem, i2);
                            }
                            C0NOH c0noh6 = templateListViewModelIp2.LLIZ;
                            if (c0noh6 != null) {
                                C0NOH.LJ(c0noh6);
                            }
                        }
                    }
                }
                List<ITEM> listListGetAll2 = templateListViewModelIp2.listGetAll();
                if (listListGetAll2 != 0) {
                    Iterator it3 = listListGetAll2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (((TemplateItem) ((InterfaceC1891350zJl) next)).getType() == 9) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    interfaceC1891350zJl2 = (InterfaceC1891350zJl) next;
                } else {
                    interfaceC1891350zJl2 = null;
                }
                if ((interfaceC1891350zJl2 instanceof TemplateItem) && (templateItem2 = (TemplateItem) interfaceC1891350zJl2) != null && templateItem2.vI() != null) {
                    C1730290v7z c1730290v7z2 = C1730290v7z.LIZ;
                    BillboardGiveawayInfo billboardGiveawayInfoVI = templateItem2.vI();
                    if (billboardGiveawayInfoVI != null) {
                        numValueOf = Integer.valueOf(billboardGiveawayInfoVI.activityStatus);
                    } else {
                        numValueOf = null;
                    }
                    c1730290v7z2.getClass();
                    if (numValueOf != null && numValueOf.intValue() != 0 && numValueOf.intValue() != 3) {
                        BillboardGiveawayInfo billboardGiveawayInfoVI2 = templateItem2.vI();
                        if (billboardGiveawayInfoVI2 != null && (str2 = billboardGiveawayInfoVI2.startTime) != null) {
                            lLJIILIIL = C2095008Iq.LJIILIIL(str2);
                        } else {
                            lLJIILIIL = null;
                        }
                        BillboardGiveawayInfo billboardGiveawayInfoVI3 = templateItem2.vI();
                        if (billboardGiveawayInfoVI3 != null && (str = billboardGiveawayInfoVI3.openTime) != null) {
                            lLJIILIIL2 = C2095008Iq.LJIILIIL(str);
                        }
                        if (lLJIILIIL != null && lLJIILIIL2 != null && (c0noiLIZ = C0NOL.LIZ(lLJIILIIL.longValue(), lLJIILIIL2.longValue(), templateListViewModelIp2.LLJI, templateListViewModelIp2.LLJ)) != null) {
                            C0NOH c0noh7 = new C0NOH();
                            templateListViewModelIp2.LLIZLLLIL = c0noh7;
                            c0noh7.LIZ(new AwS320S0300000_26(templateListViewModelIp2, context, templateItem2, 2));
                            C0NOH c0noh8 = templateListViewModelIp2.LLIZLLLIL;
                            if (c0noh8 != null) {
                                c0noh8.LIZLLL(c0noiLIZ);
                            }
                            C0NOH c0noh9 = templateListViewModelIp2.LLIZLLLIL;
                            if (c0noh9 != null) {
                                int i4 = c0noh9.LIZJ;
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        i = 1;
                                    } else {
                                        i = 3;
                                    }
                                } else {
                                    i = 2;
                                }
                                templateListViewModelIp2.AQ2(context, templateItem2, i);
                            }
                            C0NOH c0noh10 = templateListViewModelIp2.LLIZLLLIL;
                            if (c0noh10 != null) {
                                C0NOH.LJ(c0noh10);
                            }
                        }
                    }
                }
            }
        });
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0v7Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729870v7J) obj).LLILZLL;
            }
        }, null, new AwS640S0100000_26(this, 45), 6);
    }
}
