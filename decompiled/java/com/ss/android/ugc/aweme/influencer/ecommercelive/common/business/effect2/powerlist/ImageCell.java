package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist;

import X.AbstractC1335900krs;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C07MW;
import X.C09R3;
import X.C0H1U;
import X.C1295960jpS;
import X.C12ES;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1421105hJ;
import X.C1729250v6J;
import X.C1729570v6p;
import X.C197039127h;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C290160BYw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ImageCell extends PowerCell<ImageItem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public boolean LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ImageCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/ImageListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ImageCell.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ImageCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ImageListViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 866);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(368);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 853), awS570S0100000_26, AFwS215S0000000_26.get$arr$(211), new AwS570S0100000_26((C03K6) this, 843), new AwS570S0100000_26((C03K6) this, 854), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 857), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 860), null, new AwS570S0100000_26((C03K6) this, 863));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 839);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 841);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 844);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 45));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 849);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 852);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 855);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 858);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 861);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 864), awS570S0100000_26, AFwS215S0000000_26.get$arr$(210), new AwS570S0100000_26((C03K6) this, 868), new AwS570S0100000_26((C03K6) this, 870), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 872), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 874), null, new AwS570S0100000_26((C03K6) this, 876));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 877), awS570S0100000_26, AFwS215S0000000_26.get$arr$(212), new AwS570S0100000_26((C03K6) this, 879), new AwS570S0100000_26((C03K6) this, 881), new AwS570S0100000_26((C03K6) this, 884), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 886));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BillboardGlobalViewModel.class);
        AwS570S0100000_26 awS570S0100000_2610 = new AwS570S0100000_26(c19719912DlLIZ2, 888);
        AFwS268S0000000_26 aFwS268S0000000_262 = AFwS268S0000000_26.get$arr$(369);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ2, 838), awS570S0100000_2610, AFwS215S0000000_26.get$arr$(209), new AwS570S0100000_26((C03K6) this, 842), new AwS570S0100000_26((C03K6) this, 845), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 847), aFwS268S0000000_262, new AwS570S0100000_26((C03K6) this, 850), null, new AwS570S0100000_26((C03K6) this, 856));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_2611 = new AwS570S0100000_26((C03K6) this, 859);
            AwS570S0100000_26 awS570S0100000_2612 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 862);
            AwS570S0100000_26 awS570S0100000_2613 = new AwS570S0100000_26(c19719912DlLIZ2, 865);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_2611, 46));
            AwS570S0100000_26 awS570S0100000_2614 = new AwS570S0100000_26(c01gwLIZIZ2, 867);
            AwS570S0100000_26 awS570S0100000_2615 = new AwS570S0100000_26(c01gwLIZIZ2, 869);
            AwS570S0100000_26 awS570S0100000_2616 = new AwS570S0100000_26(c01gwLIZIZ2, 871);
            AwS570S0100000_26 awS570S0100000_2617 = new AwS570S0100000_26(c01gwLIZIZ2, 873);
            AwS570S0100000_26 awS570S0100000_2618 = new AwS570S0100000_26(c01gwLIZIZ2, 875);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS570S0100000_2613, awS570S0100000_2610, new C452080Ho6(), awS570S0100000_2614, awS570S0100000_2615, awS570S0100000_2612, aFwS268S0000000_262, awS570S0100000_2616, awS570S0100000_2617, awS570S0100000_2618);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ2, 878), awS570S0100000_2610, AFwS215S0000000_26.get$arr$(213), new AwS570S0100000_26((C03K6) this, 880), new AwS570S0100000_26((C03K6) this, 882), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 883), aFwS268S0000000_262, new AwS570S0100000_26((C03K6) this, 885), null, new AwS570S0100000_26((C03K6) this, 887));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ2, 889), awS570S0100000_2610, AFwS215S0000000_26.get$arr$(208), new AwS570S0100000_26((C03K6) this, 840), new AwS570S0100000_26((C03K6) this, 846), new AwS570S0100000_26((C03K6) this, 848), aFwS268S0000000_262, null, null, new AwS570S0100000_26((C03K6) this, 851));
        }
        this.LLILLJJLI = assemVMLazy2;
    }

    public final BillboardGlobalViewModel I5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (BillboardGlobalViewModel) assemVMLazy.getValue();
    }

    public final ImageListViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (ImageListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ImageItem imageItem = (ImageItem) interfaceC1891350zJl;
        if (imageItem.isUsing) {
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.l7q));
            this.itemView.findViewById(R.id.l7q).setBackgroundResource(R.drawable.blr);
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.i1y));
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.nr7));
            ((C1295960jpS) this.itemView.findViewById(R.id.nr7)).playAnimation();
            ((TextView) this.itemView.findViewById(R.id.cm2)).setText(C20642515q3.LJI(2131821364));
            ((C197039127h) this.itemView.findViewById(R.id.cm2)).setButtonVariant(1);
            C786410Ut5.I7(new AjS44S0200000_26(this, imageItem, 25), this.itemView.findViewById(R.id.cm2));
        } else {
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.l7q));
            this.itemView.findViewById(R.id.l7q).setBackgroundResource(0);
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.i1y));
            ((C1295960jpS) this.itemView.findViewById(R.id.nr7)).cancelAnimation();
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.nr7));
            ((TextView) this.itemView.findViewById(R.id.cm2)).setText(C20642515q3.LJI(2131830715));
            ((C197039127h) this.itemView.findViewById(R.id.cm2)).setButtonVariant(0);
            C786410Ut5.I7(new AjS44S0200000_26(this, imageItem, 26), this.itemView.findViewById(R.id.cm2));
        }
        C786410Ut5.I7(new AjS44S0200000_26(this, imageItem, 24), this.itemView.findViewById(R.id.l77));
        String str = imageItem.imageUrl;
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.l6j);
        C1729570v6p.LIZ("start", "display_image", null, null, null, 28);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        c1331670kl3LIZLLL.LJJ(smartImageView);
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_CENTER;
        c1331670kl3LIZLLL.LJIIJ(new AbstractC1335900krs() { // from class: X.0v4T
            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                String message;
                if (!this.LL.LLILLL) {
                    Boolean bool = Boolean.FALSE;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    C1729570v6p.LIZ("finish", "display_image", bool, message, null, 16);
                    this.LL.LLILLL = true;
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                if (!this.LL.LLILLL) {
                    C1729570v6p.LIZ("finish", "display_image", Boolean.TRUE, null, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), 8);
                    this.LL.LLILLL = true;
                }
            }
        });
        RootData rootData = I5().getState().LL;
        ImageListViewModel imageListViewModelL5 = L5();
        String str2 = imageItem.imageId;
        if (!imageListViewModelL5.LLILZLL.contains(str2)) {
            imageListViewModelL5.LLILZLL.add(str2);
            Map mapLIZ = C1729250v6J.LIZ(rootData.roomId, rootData.authorId, rootData.LIZ(), rootData.isNewUser, "notice_board_template", Integer.valueOf(rootData.templateEntryType));
            mapLIZ.put("module_name", "photo_display");
            mapLIZ.put("photo_id", str2);
            C1421105hJ.LIZJ("livesdk_tiktokec_module_show", mapLIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
            return PowerCell.inflateItemView$default(this, viewGroup, R.layout.bud, false, 4, null);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bud, viewGroup, false);
    }
}
