package com.ss.android.ugc.aweme.poi.mapdetail.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1179830go9;
import X.C1179840goA;
import X.C1179850goB;
import X.C1189060h32;
import X.C1308910kAL;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailAreaFilterVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PoiMapDetailAreaFilterAreaCell extends PowerCell<C1179850goB> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public LinearLayout LLILLJJLI;
    public TuxTextView LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailAreaFilterAreaCell.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailAreaFilterVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiMapDetailAreaFilterAreaCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailAreaFilterVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2889);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(208);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2900), awS577S0100000_33, AFwS224S0000000_33.get$arr$(401), new AwS577S0100000_33((C03K6) this, 2875), new AwS577S0100000_33((C03K6) this, 2877), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2879), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2881), null, new AwS577S0100000_33((C03K6) this, 2882));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2876);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2878);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2880);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 113));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2883);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2884);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2885);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2886);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2887);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2888), awS577S0100000_33, AFwS224S0000000_33.get$arr$(402), new AwS577S0100000_33((C03K6) this, 2890), new AwS577S0100000_33((C03K6) this, 2891), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2892), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2893), null, new AwS577S0100000_33((C03K6) this, 2894));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2895), awS577S0100000_33, AFwS224S0000000_33.get$arr$(403), new AwS577S0100000_33((C03K6) this, 2896), new AwS577S0100000_33((C03K6) this, 2897), new AwS577S0100000_33((C03K6) this, 2898), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2899));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (LinearLayout) this.itemView.findViewById(R.id.hxy);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.y3j);
        C1189060h32.LJJIIJ(this.itemView, new AwS597S0100000_18(this, 399));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        List<C1179830go9> list;
        C1179850goB c1179850goB = (C1179850goB) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(c1179850goB.LL);
        }
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        Map<String, List<C1179830go9>> map = ((C1179840goA) assemVMLazy.getValue().getState()).LLILLL;
        if (map != null && (list = map.get(c1179850goB.LL)) != null) {
            Iterator<C1179830go9> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1179830go9 next = it2.next();
                if (next.LLILZ) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            Context context = getContext();
            if (context != null) {
                if (c1179850goB.LLILLL) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context);
                    if (numLIZJ != null) {
                        int iIntValue = numLIZJ.intValue();
                        LinearLayout linearLayout = this.LLILLJJLI;
                        if (linearLayout != null) {
                            linearLayout.setBackgroundColor(iIntValue);
                        }
                    }
                } else {
                    LinearLayout linearLayout2 = this.LLILLJJLI;
                    if (linearLayout2 != null) {
                        linearLayout2.setBackgroundColor(0);
                    }
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1r, context);
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    TuxTextView tuxTextView2 = this.LLILLL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setTextColor(iIntValue2);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (c1179850goB.LLILLL) {
            Context context2 = getContext();
            if (context2 == null) {
                return;
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zq, context2);
            if (numLIZJ3 != null) {
                int iIntValue3 = numLIZJ3.intValue();
                LinearLayout linearLayout3 = this.LLILLJJLI;
                if (linearLayout3 != null) {
                    linearLayout3.setBackgroundColor(iIntValue3);
                }
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, context2);
            if (numLIZJ4 == null) {
                return;
            }
            int iIntValue4 = numLIZJ4.intValue();
            TuxTextView tuxTextView3 = this.LLILLL;
            if (tuxTextView3 == null) {
                return;
            }
            tuxTextView3.setTextColor(iIntValue4);
            return;
        }
        Context context3 = getContext();
        if (context3 == null) {
            return;
        }
        LinearLayout linearLayout4 = this.LLILLJJLI;
        if (linearLayout4 != null) {
            linearLayout4.setBackgroundColor(0);
        }
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a1h, context3);
        if (numLIZJ5 == null) {
            return;
        }
        int iIntValue5 = numLIZJ5.intValue();
        TuxTextView tuxTextView4 = this.LLILLL;
        if (tuxTextView4 == null) {
            return;
        }
        tuxTextView4.setTextColor(iIntValue5);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e4h, viewGroup, false);
    }
}
