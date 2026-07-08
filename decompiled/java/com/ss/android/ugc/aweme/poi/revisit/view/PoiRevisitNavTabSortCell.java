package com.ss.android.ugc.aweme.poi.revisit.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C1076070e6n;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitNavTabViewModel;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PoiRevisitNavTabSortCell extends PowerCell<C1076070e6n> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRevisitNavTabSortCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiRevisitNavTabSortCell.class, "tabVM", "getTabVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitNavTabViewModel;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiRevisitNavTabSortCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRevisitViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3112);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(217);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3099), awS577S0100000_33, AFwS224S0000000_33.get$arr$(428), new AwS577S0100000_33((C03K6) this, 3089), new AwS577S0100000_33((C03K6) this, 3100), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3103), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3106), null, new AwS577S0100000_33((C03K6) this, 3109));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3085);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3087);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3090);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 121));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3095);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3098);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3101);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3104);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3107);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3110), awS577S0100000_33, AFwS224S0000000_33.get$arr$(427), new AwS577S0100000_33((C03K6) this, 3114), new AwS577S0100000_33((C03K6) this, 3116), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3118), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3120), null, new AwS577S0100000_33((C03K6) this, 3122));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3123), awS577S0100000_33, AFwS224S0000000_33.get$arr$(429), new AwS577S0100000_33((C03K6) this, 3125), new AwS577S0100000_33((C03K6) this, 3127), new AwS577S0100000_33((C03K6) this, 3130), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3132));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiRevisitNavTabViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 3134);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(216);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3084), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(426), new AwS577S0100000_33((C03K6) this, 3088), new AwS577S0100000_33((C03K6) this, 3091), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3093), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 3096), null, new AwS577S0100000_33((C03K6) this, 3102));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 3105);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3108);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 3111);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3311, 122));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 3113);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 3115);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 3117);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 3119);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 3121);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3124), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(430), new AwS577S0100000_33((C03K6) this, 3126), new AwS577S0100000_33((C03K6) this, 3128), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3129), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 3131), null, new AwS577S0100000_33((C03K6) this, 3133));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3083), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(425), new AwS577S0100000_33((C03K6) this, 3086), new AwS577S0100000_33((C03K6) this, 3092), new AwS577S0100000_33((C03K6) this, 3094), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 3097));
        }
        this.LLILLJJLI = assemVMLazy2;
    }

    public final PoiRevisitViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (PoiRevisitViewModel) assemVMLazy.getValue();
    }

    public final void L5() {
        Integer numLIZJ;
        Integer numLIZJ2;
        View view = this.LLILLL;
        if (view != null) {
            view.setBackgroundResource(R.drawable.cvh);
        }
        Context context = getContext();
        if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a00, context)) != null) {
            int iIntValue = numLIZJ2.intValue();
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue);
            }
        }
        Context context2 = getContext();
        if (context2 == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a00, context2)) == null) {
            return;
        }
        int iIntValue2 = numLIZJ.intValue();
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            tuxIconView.setTintColor(iIntValue2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = this.itemView.findViewById(R.id.p2k);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.ulp);
        this.LLILZIL = (TuxIconView) this.itemView.findViewById(R.id.uln);
        View view = this.LLILLL;
        if (view != null) {
            C1189060h32.LJJIIJ(view, new AwS595S0100000_16(this, 123));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        String string2;
        C1076070e6n c1076070e6n = (C1076070e6n) interfaceC1891350zJl;
        super.onBindItemView(c1076070e6n);
        try {
            Context context = getContext();
            if (context == null || (string = context.getString(2131844724)) == null) {
                string = "";
            }
            Context context2 = getContext();
            if (context2 == null || (string2 = context2.getString(2131844713)) == null) {
                string2 = "";
            }
            L5();
            if (c1076070e6n.LL) {
                TuxTextView tuxTextView = this.LLILZ;
                if (tuxTextView != null) {
                    if (!c1076070e6n.LLILLL) {
                        string = string2;
                    }
                    tuxTextView.setText(string);
                    return;
                }
                return;
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText("");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("something was wrong with onBindItemView, e.message=");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e8j, viewGroup, false);
    }
}
