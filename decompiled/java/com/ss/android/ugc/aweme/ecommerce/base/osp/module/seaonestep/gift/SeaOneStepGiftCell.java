package com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.gift;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03IT;
import X.C03K6;
import X.C0H1U;
import X.C10515049h;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13BV;
import X.C13LE;
import X.C1697810uHb;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C719102rN;
import X.C719202rO;
import X.C723002s0;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C798803Ac;
import X.C814420VxA;
import X.C928203k0;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.gift.SeaOneStepGiftFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS132S0101000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaOneStepGiftCell extends ECPowerCell<C719202rO> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaOneStepGiftCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.avj;
    }

    public SeaOneStepGiftCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 317);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(198);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 328), awS570S0100000_26, AFwS215S0000000_26.get$arr$(102), new AwS570S0100000_26((C03K6) this, 303), new AwS570S0100000_26((C03K6) this, 305), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 307), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 309), null, new AwS570S0100000_26((C03K6) this, 310));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 304);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 306);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 308);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 20));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 311);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 312);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 313);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 314);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 315);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 316), awS570S0100000_26, AFwS215S0000000_26.get$arr$(100), new AwS570S0100000_26((C03K6) this, 318), new AwS570S0100000_26((C03K6) this, 319), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 320), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 321), null, new AwS570S0100000_26((C03K6) this, 322));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 323), awS570S0100000_26, AFwS215S0000000_26.get$arr$(101), new AwS570S0100000_26((C03K6) this, 324), new AwS570S0100000_26((C03K6) this, 325), new AwS570S0100000_26((C03K6) this, 326), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 327));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        final int i;
        C723002s0 next;
        List list;
        int iLIZIZ;
        int iLIZIZ2;
        C03IT thumbFirstImageUrlModel;
        C719102rN c719102rN;
        List<C798803Ac> list2;
        List<C723002s0> list3;
        List<C798803Ac> list4;
        int iIntValue;
        final C719202rO c719202rO = (C719202rO) interfaceC1891350zJl;
        super.onBindItemView(c719202rO);
        if (c719202rO != null && (list3 = c719202rO.LLJIJIL) != null) {
            Iterator<C723002s0> it2 = list3.iterator();
            i = 0;
            while (it2.hasNext()) {
                C719102rN c719102rN2 = it2.next().LLJLIL;
                if (c719102rN2 != null && (list4 = c719102rN2.LLLLLJLJLL) != null) {
                    Iterator<C798803Ac> it3 = list4.iterator();
                    while (it3.hasNext()) {
                        Integer num = it3.next().LJFF;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        i += iIntValue;
                    }
                }
            }
        } else {
            i = 0;
        }
        final String string = this.itemView.getContext().getString(2131832981, Integer.valueOf(i));
        C0H1U.LJIIL((TextView) this.itemView.findViewById(R.id.u4a), string, true);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.u4_);
        C786410Ut5.LJJJJJL(linearLayout);
        Iterator<C723002s0> it4 = c719202rO.LLJIJIL.iterator();
        while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                C719102rN c719102rN3 = next.LLJLIL;
                if (c719102rN3 != null && (list2 = c719102rN3.LLLLLJLJLL) != null && (!list2.isEmpty())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C723002s0 c723002s0 = next;
        if (c723002s0 == null || (c719102rN = c723002s0.LLJLIL) == null || (list = c719102rN.LLLLLJLJLL) == null) {
            list = C13BV.INSTANCE;
        }
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C798803Ac c798803Ac = (C798803Ac) obj;
                SmartImageView smartImageView = new SmartImageView(linearLayout.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
                if (i2 == 0) {
                    iLIZIZ = 0;
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                }
                layoutParams.setMarginStart(iLIZIZ);
                if (i2 == list.size() - 1) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else {
                    iLIZIZ2 = 0;
                }
                layoutParams.setMarginEnd(iLIZIZ2);
                C786410Ut5.G6(smartImageView, layoutParams);
                linearLayout.addView(smartImageView);
                Image image = c798803Ac.LIZ;
                if (image != null && (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
                    c1331670kl3LIZLLL.LJJ(smartImageView);
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0vc0
            @Override // X.AbstractViewOnClickListenerC420730Ged
            public final void LIZ(View view) {
                C128Y c128yLJI;
                String string2;
                FragmentManager supportFragmentManager;
                Object obj2;
                if (view != null) {
                    C1748720vbi.LIZLLL(this.LLILZ.itemView, new C10516049i(), new AwS132S0101000_26(i, this.LLILZ, 12));
                    LifecycleOwner parent = this.LLILZ.getParent();
                    if (parent != null && (c128yLJI = C724240Sb0.LJI(parent)) != null) {
                        C719202rO c719202rO2 = c719202rO;
                        if (!c719202rO2.LLJJLIIIJLLLLLLLZ) {
                            C1748890vbz c1748890vbz = SeaOneStepGiftFragment.LLILZLL;
                            String str = string;
                            HashMap<String, Object> map = this.LLILZ.L5().LLLIL;
                            if (map == null || (obj2 = map.get("previous_page")) == null || (string2 = obj2.toString()) == null) {
                                string2 = "";
                            }
                            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("previous_page", string2));
                            c1748890vbz.getClass();
                            SeaOneStepGiftFragment seaOneStepGiftFragment = new SeaOneStepGiftFragment();
                            Bundle bundle = new Bundle();
                            if (c128yLJI instanceof InterfaceC1748810vbr) {
                                C960603pE.LJI(bundle, (InterfaceC1748810vbr) c128yLJI, new AwS109S1200000_26(c719202rO2, (C719202rO) str, (String) mapLIZJ, (Map<String, String>) 5));
                            }
                            seaOneStepGiftFragment.setArguments(bundle);
                            C19EG c19egLIZ = C724240Sb0.LIZ(c128yLJI);
                            if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                                c1390920mIc.LJIIIIZZ(1);
                                int iLJIIJJI = C928203k0.LJIIJJI(C928203k0.LIZ);
                                TuxSheet tuxSheet = c1390920mIc.LIZ;
                                tuxSheet.LLJJL = iLJIIJJI;
                                tuxSheet.LLJJIJI = seaOneStepGiftFragment;
                                tuxSheet.LLJJIJIIJIL = true;
                                tuxSheet.LLJLL = true;
                                tuxSheet.LLILLL = true;
                                tuxSheet.LLJLILLLLZIIL = false;
                                tuxSheet.LLJLLL = false;
                                tuxSheet.show(supportFragmentManager, "order_submit_gift_fragment");
                            }
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, this.itemView);
        C928203k0 c928203k0 = C928203k0.LIZ;
        String str = L5().n;
        c928203k0.getClass();
        if (C928203k0.LJIILL(str)) {
            C0H1U.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), this.itemView);
            C0H1U.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), this.itemView);
        }
        if (!this.LLILLJJLI) {
            this.LLILLJJLI = true;
            C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS215S0000000_26.get$arr$(478), new AwS132S0101000_26(i, this, 13));
        }
    }
}
