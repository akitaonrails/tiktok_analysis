package com.ss.android.ugc.aweme.poi.detail.videolist.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1180600gpO;
import X.C1188060h1Q;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C123100dR;
import X.C13LE;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS54S0400000_18;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMergedListItemBannerCell extends PowerCell<C1188060h1Q> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public SmartImageView LL;
    public LinearLayout LLILLJJLI;
    public RadiusLayout LLILLL;
    public TuxTextView LLILZ;
    public final AssemVMLazy LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMergedListItemBannerCell.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiMergedListItemBannerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1241);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(434);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1252), awS562S0100000_18, AFwS206S0000000_18.get$arr$(347), new AwS562S0100000_18((C03K6) this, 1227), new AwS562S0100000_18((C03K6) this, 1229), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1231), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1233), null, new AwS562S0100000_18((C03K6) this, 1234));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1228);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1230);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1232);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 69));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1235);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1236);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1237);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1238);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1239);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1240), awS562S0100000_18, AFwS206S0000000_18.get$arr$(345), new AwS562S0100000_18((C03K6) this, 1242), new AwS562S0100000_18((C03K6) this, 1243), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1244), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1245), null, new AwS562S0100000_18((C03K6) this, 1246));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1247), awS562S0100000_18, AFwS206S0000000_18.get$arr$(346), new AwS562S0100000_18((C03K6) this, 1248), new AwS562S0100000_18((C03K6) this, 1249), new AwS562S0100000_18((C03K6) this, 1250), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1251));
        }
        this.LLILZIL = assemVMLazy;
    }

    public final IPoiVideoListAbility I5() {
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            return (IPoiVideoListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiVideoListAbility.class, null);
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.itemView.findViewById(R.id.trj);
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.cover);
        this.LLILLJJLI = (LinearLayout) this.itemView.findViewById(R.id.da1);
        this.itemView.findViewById(R.id.da0);
        this.LLILLL = (RadiusLayout) this.itemView.findViewById(R.id.fn0);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.desc);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Context context;
        RadiusLayout radiusLayout;
        ViewGroup.LayoutParams layoutParams;
        RadiusLayout radiusLayout2;
        SmartImageView smartImageView;
        C1188060h1Q c1188060h1Q = (C1188060h1Q) interfaceC1891350zJl;
        PoiActivityApi.PoiBannerInfo poiBannerInfo = (PoiActivityApi.PoiBannerInfo) C13LP.LJJJLL(c1188060h1Q.LL);
        if (poiBannerInfo != null && (context = getContext()) != null) {
            if (C123100dR.LIZ(poiBannerInfo.picUrl) && (smartImageView = this.LL) != null) {
                C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "banner_two_col", null);
                c1180600gpO.LIZLLL = new C1202680hP0(c1188060h1Q.LLILLJJLI, null, null, null, null, 30);
                C1189360h3W c1189360h3WLIZIZ = c1180600gpO.LIZIZ(poiBannerInfo.picUrl);
                c1189360h3WLIZIZ.LIZLLL(smartImageView);
                c1189360h3WLIZIZ.LIZIZ();
            }
            LinearLayout linearLayout = this.LLILLJJLI;
            if (linearLayout != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zc);
                linearLayout.setBackground(c384050F3z.LIZ(context));
            }
            IPoiVideoListAbility iPoiVideoListAbilityI5 = I5();
            if (iPoiVideoListAbilityI5 != null && iPoiVideoListAbilityI5.vS1() && (radiusLayout = this.LLILLL) != null && (layoutParams = radiusLayout.getLayoutParams()) != null && (radiusLayout2 = this.LLILLL) != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
                C786410Ut5.b7(radiusLayout2, layoutParams);
            }
            if (C123100dR.LIZ(poiBannerInfo.title)) {
                RadiusLayout radiusLayout3 = this.LLILLL;
                if (radiusLayout3 != null) {
                    C786410Ut5.LLZZ(radiusLayout3, 0);
                }
                TuxTextView tuxTextView = this.LLILZ;
                if (tuxTextView != null) {
                    tuxTextView.setText(poiBannerInfo.title);
                }
                TuxTextView tuxTextView2 = this.LLILZ;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                }
            } else {
                RadiusLayout radiusLayout4 = this.LLILLL;
                if (radiusLayout4 != null) {
                    C786410Ut5.LLZZ(radiusLayout4, 8);
                }
                TuxTextView tuxTextView3 = this.LLILZ;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 8);
                }
            }
            C786410Ut5.I7(new ACListenerS54S0400000_18(poiBannerInfo, context, this, c1188060h1Q, 2), this.itemView);
            C2211631BhB.LJ(this.itemView, new AwS227S0300000_18(this, poiBannerInfo, c1188060h1Q, 74));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e0p, viewGroup, false);
    }
}
