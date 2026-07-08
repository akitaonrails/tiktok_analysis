package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation;

import X.C03HZ;
import X.C1390920mIc;
import X.C15438062q;
import X.C2097608Jq;
import X.C719102rN;
import X.C719202rO;
import X.C723002s0;
import X.C734002tm;
import X.C7928037u;
import X.C821603Iw;
import X.C821703Ix;
import X.C958103op;
import X.C960603pE;
import X.InterfaceC0148002o;
import X.InterfaceC1748810vbr;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHorizonBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionPanel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.logisticpanel.AggregateLogisticPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS24S0200100_1;
import kotlin.jvm.internal.AwS39S0100100_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OspAggregationOrderModuleViewModel extends AssemViewModel<C734002tm> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C734002tm(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void vQ2(OspAggregationOrderModuleViewModel ospAggregationOrderModuleViewModel, List list, String str, Fragment fragment, OrderSubmitAssemViewModel orderSubmitAssemViewModel, LogisticsExpressionPanel logisticsExpressionPanel, Integer num, boolean z, int i) {
        boolean z2;
        int iLIZIZ;
        String str2 = str;
        boolean z3 = z;
        LogisticsExpressionPanel logisticsExpressionPanel2 = logisticsExpressionPanel;
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Integer num2 = null;
        if ((i & 32) != 0) {
            logisticsExpressionPanel2 = null;
        }
        if ((i & 64) == 0) {
            num2 = num;
        }
        if ((i & 128) != 0) {
            z3 = false;
        }
        List<String> list2 = orderSubmitAssemViewModel.LLLIIL;
        if (list2 != null) {
            ((ArrayList) list2).add("click_logistic_panel");
        }
        if (fragment != 0) {
            C7928037u.LIZ.getClass();
            ArrayList arrayList = new ArrayList();
            if (logisticsExpressionPanel2 != null) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    for (C723002s0 c723002s0 : ((C719202rO) it2.next()).LLJIJIL) {
                        List<C719102rN> list3 = c723002s0.LLJ;
                        ArrayList arrayList5 = new ArrayList();
                        for (C719102rN c719102rN : list3) {
                            if (Intrinsics.LJFF(c719102rN.LLJJIJIL, c723002s0.LL)) {
                                arrayList5.add(c719102rN);
                            }
                        }
                        arrayList3.addAll(arrayList5);
                        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
                        Iterator it3 = arrayList5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(((C719102rN) it3.next()).LLIZLLLIL);
                        }
                        arrayList2.addAll(arrayList6);
                        List<LogisticDTO> list4 = c723002s0.LLILZ;
                        if (list4 != null) {
                            for (LogisticDTO logisticDTO : list4) {
                                String str3 = logisticDTO.logisticsServiceId;
                                if (str3 != null && !linkedHashSet.contains(str3)) {
                                    arrayList4.add(logisticDTO);
                                    linkedHashSet.add(str3);
                                }
                            }
                        }
                    }
                }
                arrayList.add(new C821603Iw(arrayList2, arrayList4, logisticsExpressionPanel2.selectedLogisticsServiceId, logisticsExpressionPanel2.logisticsPanelModule, arrayList3));
            } else {
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    for (C723002s0 c723002s02 : ((C719202rO) it4.next()).LLJIJIL) {
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        List<C719102rN> list5 = c723002s02.LLJ;
                        ArrayList arrayList9 = new ArrayList();
                        for (C719102rN c719102rN2 : list5) {
                            if (Intrinsics.LJFF(c719102rN2.LLJJIJIL, c723002s02.LL)) {
                                arrayList9.add(c719102rN2);
                            }
                        }
                        arrayList8.addAll(arrayList9);
                        ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(arrayList9, 10));
                        Iterator it5 = arrayList9.iterator();
                        while (it5.hasNext()) {
                            arrayList10.add(((C719102rN) it5.next()).LLIZLLLIL);
                        }
                        arrayList7.addAll(arrayList10);
                        arrayList.add(new C821603Iw(arrayList7, c723002s02.LLILZ, c723002s02.LLJJJ, c723002s02.LLJJIJIL, arrayList8));
                    }
                }
            }
            AggregateLogisticPanelFragment aggregateLogisticPanelFragment = C03HZ.LIZ;
            String strKR2 = orderSubmitAssemViewModel.kR2(C2097608Jq.LJ());
            if (str2 == null) {
                str2 = "";
            }
            final C821703Ix c821703Ix = new C821703Ix(strKR2, str2, arrayList, z2);
            final AwS210S0300000_1 awS210S0300000_1 = new AwS210S0300000_1(ospAggregationOrderModuleViewModel, (OspAggregationOrderModuleViewModel) arrayList, (List<C821603Iw>) orderSubmitAssemViewModel, (OrderSubmitAssemViewModel) 7);
            C03HZ.LIZIZ = SystemClock.elapsedRealtime();
            AggregateLogisticPanelFragment aggregateLogisticPanelFragment2 = new AggregateLogisticPanelFragment();
            Bundle bundle = new Bundle();
            if (fragment instanceof InterfaceC1748810vbr) {
                C960603pE.LJI(bundle, (InterfaceC1748810vbr) fragment, new AwS89S0110000_1(c821703Ix, z3, 20));
            }
            aggregateLogisticPanelFragment2.setArguments(bundle);
            C03HZ.LIZ = aggregateLogisticPanelFragment2;
            if (z3) {
                CommerceHorizonBottomSheetDialogFragment commerceHorizonBottomSheetDialogFragment = new CommerceHorizonBottomSheetDialogFragment();
                final int i2 = 0;
                DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener(awS210S0300000_1, c821703Ix, i2) { // from class: X.04JR
                    public final int $t;
                    public Object l0;
                    public Object l1;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (this.$t) {
                            case 0:
                                onDismiss$0(this, dialogInterface);
                                break;
                            case 1:
                                onDismiss$1(this, dialogInterface);
                                break;
                        }
                    }

                    public static final void onDismiss$0(C04JR c04jr, DialogInterface dialogInterface) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str4 = TuxSheet._pnsPageId;
                        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                        if (abstractC343940De4LJIIJJI instanceof C03J9) {
                            ((Function1) c04jr.l0).invoke(((C03J9) abstractC343940De4LJIIJJI).LIZ);
                            AggregateLogisticPanelFragment aggregateLogisticPanelFragment3 = C03HZ.LIZ;
                            if (aggregateLogisticPanelFragment3 != null) {
                                C1748720vbi.LIZIZ(aggregateLogisticPanelFragment3, new C10508049a(), new AwS24S0200100_1(abstractC343940De4LJIIJJI, jElapsedRealtime, (C821703Ix) c04jr.l1, 1));
                            }
                        } else {
                            AggregateLogisticPanelFragment aggregateLogisticPanelFragment4 = C03HZ.LIZ;
                            if (aggregateLogisticPanelFragment4 != null) {
                                C1748720vbi.LIZIZ(aggregateLogisticPanelFragment4, new C10508049a(), new AwS39S0100100_1(jElapsedRealtime, (C821703Ix) c04jr.l1, 6));
                            }
                        }
                        C03HZ.LIZ = null;
                    }

                    public static final void onDismiss$1(C04JR c04jr, DialogInterface dialogInterface) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str4 = TuxSheet._pnsPageId;
                        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                        if (abstractC343940De4LJIIJJI instanceof C03J9) {
                            ((Function1) c04jr.l0).invoke(((C03J9) abstractC343940De4LJIIJJI).LIZ);
                            AggregateLogisticPanelFragment aggregateLogisticPanelFragment3 = C03HZ.LIZ;
                            if (aggregateLogisticPanelFragment3 != null) {
                                C1748720vbi.LIZIZ(aggregateLogisticPanelFragment3, new C10508049a(), new AwS24S0200100_1(abstractC343940De4LJIIJJI, jElapsedRealtime, (C821703Ix) c04jr.l1, 2));
                            }
                        } else {
                            AggregateLogisticPanelFragment aggregateLogisticPanelFragment4 = C03HZ.LIZ;
                            if (aggregateLogisticPanelFragment4 != null) {
                                C1748720vbi.LIZIZ(aggregateLogisticPanelFragment4, new C10508049a(), new AwS39S0100100_1(jElapsedRealtime, (C821703Ix) c04jr.l1, 7));
                            }
                        }
                        C03HZ.LIZ = null;
                    }

                    {
                        this.$t = i2;
                        this.l0 = awS210S0300000_1;
                        this.l1 = c821703Ix;
                    }
                };
                commerceHorizonBottomSheetDialogFragment.LLJILJIL = aggregateLogisticPanelFragment2;
                aggregateLogisticPanelFragment2.LLILLJJLI = new AwS545S0100000_1(commerceHorizonBottomSheetDialogFragment, 1614);
                commerceHorizonBottomSheetDialogFragment.LLJIJIL = onDismissListener;
                if (num2 != null) {
                    commerceHorizonBottomSheetDialogFragment.cS(Integer.valueOf(num2.intValue()));
                }
                commerceHorizonBottomSheetDialogFragment.LLJILLL = false;
                FragmentManager fragmentManager = fragment.getFragmentManager();
                if (fragmentManager != null) {
                    commerceHorizonBottomSheetDialogFragment.show(fragmentManager, "CommerceHorizonBottomSheetDialogFragment");
                    return;
                }
                return;
            }
            FragmentManager fragmentManager2 = fragment.getFragmentManager();
            if (fragmentManager2 == null) {
                return;
            }
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(1);
            if (num2 != null) {
                iLIZIZ = num2.intValue();
            } else {
                iLIZIZ = (int) C958103op.LIZIZ();
            }
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJL = iLIZIZ;
            tuxSheet.LLJJIJI = aggregateLogisticPanelFragment2;
            final int i3 = 1;
            tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener(awS210S0300000_1, c821703Ix, i3) { // from class: X.04JR
                public final int $t;
                public Object l0;
                public Object l1;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (this.$t) {
                        case 0:
                            onDismiss$0(this, dialogInterface);
                            break;
                        case 1:
                            onDismiss$1(this, dialogInterface);
                            break;
                    }
                }

                public static final void onDismiss$0(C04JR c04jr, DialogInterface dialogInterface) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    String str4 = TuxSheet._pnsPageId;
                    AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                    if (abstractC343940De4LJIIJJI instanceof C03J9) {
                        ((Function1) c04jr.l0).invoke(((C03J9) abstractC343940De4LJIIJJI).LIZ);
                        AggregateLogisticPanelFragment aggregateLogisticPanelFragment3 = C03HZ.LIZ;
                        if (aggregateLogisticPanelFragment3 != null) {
                            C1748720vbi.LIZIZ(aggregateLogisticPanelFragment3, new C10508049a(), new AwS24S0200100_1(abstractC343940De4LJIIJJI, jElapsedRealtime, (C821703Ix) c04jr.l1, 1));
                        }
                    } else {
                        AggregateLogisticPanelFragment aggregateLogisticPanelFragment4 = C03HZ.LIZ;
                        if (aggregateLogisticPanelFragment4 != null) {
                            C1748720vbi.LIZIZ(aggregateLogisticPanelFragment4, new C10508049a(), new AwS39S0100100_1(jElapsedRealtime, (C821703Ix) c04jr.l1, 6));
                        }
                    }
                    C03HZ.LIZ = null;
                }

                public static final void onDismiss$1(C04JR c04jr, DialogInterface dialogInterface) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    String str4 = TuxSheet._pnsPageId;
                    AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                    if (abstractC343940De4LJIIJJI instanceof C03J9) {
                        ((Function1) c04jr.l0).invoke(((C03J9) abstractC343940De4LJIIJJI).LIZ);
                        AggregateLogisticPanelFragment aggregateLogisticPanelFragment3 = C03HZ.LIZ;
                        if (aggregateLogisticPanelFragment3 != null) {
                            C1748720vbi.LIZIZ(aggregateLogisticPanelFragment3, new C10508049a(), new AwS24S0200100_1(abstractC343940De4LJIIJJI, jElapsedRealtime, (C821703Ix) c04jr.l1, 2));
                        }
                    } else {
                        AggregateLogisticPanelFragment aggregateLogisticPanelFragment4 = C03HZ.LIZ;
                        if (aggregateLogisticPanelFragment4 != null) {
                            C1748720vbi.LIZIZ(aggregateLogisticPanelFragment4, new C10508049a(), new AwS39S0100100_1(jElapsedRealtime, (C821703Ix) c04jr.l1, 7));
                        }
                    }
                    C03HZ.LIZ = null;
                }

                {
                    this.$t = i3;
                    this.l0 = awS210S0300000_1;
                    this.l1 = c821703Ix;
                }
            };
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLLL = false;
            tuxSheet.show(fragmentManager2, "aggregate_logistic_panel_fragment");
        }
    }
}
