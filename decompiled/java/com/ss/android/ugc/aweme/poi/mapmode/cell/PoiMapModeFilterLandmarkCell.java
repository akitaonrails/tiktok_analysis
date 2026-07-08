package com.ss.android.ugc.aweme.poi.mapmode.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C1174910ggD;
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
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeFilterVM;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PoiMapModeFilterLandmarkCell extends PowerCell<C1174910ggD> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public LinearLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeFilterLandmarkCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapModeFilterLandmarkCell.class, "filteVM", "getFilteVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModeFilterVM;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiMapModeFilterLandmarkCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3008);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(213);
        if (Intrinsics.LJFF(obj, obj)) {
            new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2995), awS577S0100000_33, AFwS224S0000000_33.get$arr$(416), new AwS577S0100000_33((C03K6) this, 2985), new AwS577S0100000_33((C03K6) this, 2996), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2999), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3002), null, new AwS577S0100000_33((C03K6) this, 3005));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2981);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2983);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2986);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 117));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2991);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2994);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2997);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, LivePreCreateNextRoomPlayer.ENABLE);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3003);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3006), awS577S0100000_33, AFwS224S0000000_33.get$arr$(415), new AwS577S0100000_33((C03K6) this, 3010), new AwS577S0100000_33((C03K6) this, 3012), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3014), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3016), null, new AwS577S0100000_33((C03K6) this, 3018));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3019), awS577S0100000_33, AFwS224S0000000_33.get$arr$(417), new AwS577S0100000_33((C03K6) this, 3021), new AwS577S0100000_33((C03K6) this, 3023), new AwS577S0100000_33((C03K6) this, 3026), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3028));
        }
        Object obj2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapModeFilterVM.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 3030);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(212);
        if (Intrinsics.LJFF(obj2, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 2980), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(414), new AwS577S0100000_33((C03K6) this, 2984), new AwS577S0100000_33((C03K6) this, 2987), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2989), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 2992), null, new AwS577S0100000_33((C03K6) this, 2998));
        } else if (obj2 instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 3001);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3004);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 3007);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj2, awS577S0100000_3311, 118));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 3009);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 3011);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 3013);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 3015);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 3017);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj2, obj2)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3020), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(418), new AwS577S0100000_33((C03K6) this, 3022), new AwS577S0100000_33((C03K6) this, 3024), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3025), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 3027), null, new AwS577S0100000_33((C03K6) this, 3029));
        } else {
            if (!Intrinsics.LJFF(obj2, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj2);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 2979), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(413), new AwS577S0100000_33((C03K6) this, 2982), new AwS577S0100000_33((C03K6) this, 2988), new AwS577S0100000_33((C03K6) this, 2990), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 2993));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (LinearLayout) this.itemView.findViewById(R.id.hxy);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.hy1);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.hxz);
        C1189060h32.LJJIIJ(this.itemView, new AwS597S0100000_18(this, 408));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1174910ggD c1174910ggD = (C1174910ggD) interfaceC1891350zJl;
        PoiLandmark poiLandmark = c1174910ggD.LL;
        TuxTextView tuxTextView = this.LLILLL;
        String str = "";
        if (tuxTextView != null) {
            String name = poiLandmark.getName();
            if (name == null) {
                name = "";
            }
            tuxTextView.setText(name);
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            String displayText = poiLandmark.getDisplayText();
            if (displayText != null) {
                str = displayText;
            }
            tuxTextView2.setText(str);
        }
        boolean z = c1174910ggD.LLILLJJLI;
        if (z && c1174910ggD.LLILLL) {
            Context context = getContext();
            if (context != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context);
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    LinearLayout linearLayout = this.LLILLJJLI;
                    if (linearLayout != null) {
                        linearLayout.setBackgroundColor(iIntValue);
                    }
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    TuxTextView tuxTextView3 = this.LLILLL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setTextColor(iIntValue2);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            Context context2 = getContext();
            if (context2 == null) {
                return;
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zp, context2);
            if (numLIZJ3 != null) {
                int iIntValue3 = numLIZJ3.intValue();
                LinearLayout linearLayout2 = this.LLILLJJLI;
                if (linearLayout2 != null) {
                    linearLayout2.setBackgroundColor(iIntValue3);
                }
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1r, context2);
            if (numLIZJ4 == null) {
                return;
            }
            int iIntValue4 = numLIZJ4.intValue();
            TuxTextView tuxTextView4 = this.LLILLL;
            if (tuxTextView4 == null) {
                return;
            }
            tuxTextView4.setTextColor(iIntValue4);
            return;
        }
        if (c1174910ggD.LLILLL) {
            Context context3 = getContext();
            if (context3 == null) {
                return;
            }
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.zq, context3);
            if (numLIZJ5 != null) {
                int iIntValue5 = numLIZJ5.intValue();
                LinearLayout linearLayout3 = this.LLILLJJLI;
                if (linearLayout3 != null) {
                    linearLayout3.setBackgroundColor(iIntValue5);
                }
            }
            Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.a1h, context3);
            if (numLIZJ6 == null) {
                return;
            }
            int iIntValue6 = numLIZJ6.intValue();
            TuxTextView tuxTextView5 = this.LLILLL;
            if (tuxTextView5 == null) {
                return;
            }
            tuxTextView5.setTextColor(iIntValue6);
            return;
        }
        Context context4 = getContext();
        if (context4 == null) {
            return;
        }
        Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.zp, context4);
        if (numLIZJ7 != null) {
            int iIntValue7 = numLIZJ7.intValue();
            LinearLayout linearLayout4 = this.LLILLJJLI;
            if (linearLayout4 != null) {
                linearLayout4.setBackgroundColor(iIntValue7);
            }
        }
        Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.a1h, context4);
        if (numLIZJ8 == null) {
            return;
        }
        int iIntValue8 = numLIZJ8.intValue();
        TuxTextView tuxTextView6 = this.LLILLL;
        if (tuxTextView6 == null) {
            return;
        }
        tuxTextView6.setTextColor(iIntValue8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e4w, viewGroup, false);
    }
}
