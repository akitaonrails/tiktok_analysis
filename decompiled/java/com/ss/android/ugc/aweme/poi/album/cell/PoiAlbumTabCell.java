package com.ss.android.ugc.aweme.poi.album.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C1186600gz4;
import X.C1186830gzR;
import X.C1308910kAL;
import X.C13LE;
import X.C1582480rHa;
import X.C1582570rHj;
import X.C1582580rHk;
import X.C166W;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1166860gTE;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS153S0100000_18;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumPageApi;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumTabCell extends PowerCell<C1186600gz4> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C166W LL = new C166W(new AwS597S0100000_18((PowerCell) this, 227));
    public final AssemVMLazy LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiAlbumTabCell.class, "binding", "getBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiAlbumTabCellLayoutBinding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiAlbumTabCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/album/PoiAlbumViewModel;", 0);
        c09r3.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dyj;
    }

    public PoiAlbumTabCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiAlbumViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 836);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(256);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 847), awS562S0100000_18, AFwS206S0000000_18.get$arr$(254), new AwS562S0100000_18((C03K6) this, 822), new AwS562S0100000_18((C03K6) this, 824), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 826), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 828), null, new AwS562S0100000_18((C03K6) this, 829));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 823);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 825);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 827);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 56));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 830);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 831);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 832);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 833);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 834);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 835), awS562S0100000_18, AFwS206S0000000_18.get$arr$(255), new AwS562S0100000_18((C03K6) this, 837), new AwS562S0100000_18((C03K6) this, 838), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 839), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 840), null, new AwS562S0100000_18((C03K6) this, 841));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 842), awS562S0100000_18, AFwS206S0000000_18.get$arr$(256), new AwS562S0100000_18((C03K6) this, 843), new AwS562S0100000_18((C03K6) this, 844), new AwS562S0100000_18((C03K6) this, 845), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 846));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    public final C1186830gzR I5() {
        C166W c166w = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (C1186830gzR) c166w.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1582570rHj c1582570rHj = I5().LLILLJJLI;
        c1582570rHj.setVariant(EnumC1166860gTE.CAPSULE);
        c1582570rHj.setWidthRule(new C1582580rHk(0, 0, 7));
        c1582570rHj.setSelectionStyle(new C1582480rHa(C1308910kAL.LIZJ(R.attr.a00, c1582570rHj.getContext()), C1308910kAL.LIZJ(R.attr.a0o, c1582570rHj.getContext()), C1308910kAL.LIZJ(R.attr.a03, c1582570rHj.getContext()), C1308910kAL.LIZJ(R.attr.a1k, c1582570rHj.getContext())));
        c1582570rHj.setFont(52);
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 226));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C1186600gz4 c1186600gz4 = (C1186600gz4) interfaceC1891350zJl;
        super.onBindItemView(c1186600gz4);
        C1582570rHj c1582570rHj = I5().LLILLJJLI;
        PoiAlbumPageApi.CategoryTabInfo categoryTabInfo = c1186600gz4.LL;
        if (categoryTabInfo == null || (str = categoryTabInfo.name) == null) {
            str = "";
        }
        c1582570rHj.LJ(str, null, null);
        c1582570rHj.setSelected(c1186600gz4.LLILLJJLI);
        C786410Ut5.V8(I5().LLILLJJLI, new ACListenerS153S0100000_18(this, 163));
    }
}
