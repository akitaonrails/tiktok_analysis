package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03IJ;
import X.C03IT;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C0H1U;
import X.C12ES;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217401BqU;
import X.C452080Ho6;
import X.C452501pT;
import X.C5182020e;
import X.C737910Sx3;
import X.C7813033j;
import X.C786410Ut5;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USUnreachableHeadCell extends ECPowerCell<C7813033j> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public boolean LLJ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(USUnreachableHeadCell.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        AssemVMLazy assemVMLazy;
        C03IT thumbFirstImageUrlModel;
        C7813033j c7813033j = (C7813033j) interfaceC1891350zJl;
        if (c7813033j.LL) {
            Resources resources = this.itemView.getContext().getResources();
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.title);
            C0H1U.LJIIJJI(tuxTextView, c7813033j.LLIZ, resources.getString(2131832777));
            C12ES.LJIILL(0, tuxTextView);
            Integer num = c7813033j.LLJIJIL;
            if (num != null) {
                tuxTextView.setTuxFont(num.intValue());
            }
            Integer num2 = c7813033j.LLJI;
            if (num2 != null) {
                tuxTextView.setTextColorRes(num2.intValue());
            }
        } else {
            C03DZ.LIZ(this.itemView.findViewById(R.id.title));
        }
        if (c7813033j.LLILZ) {
            Image image = c7813033j.LLILZIL;
            if (image != null && (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) != null) {
                C12ES.LJIILL(0, this.itemView.findViewById(R.id.v73));
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
                c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.v6r));
                C786410Ut5.h3(c1331670kl3LIZLLL);
                ((ImageView) this.itemView.findViewById(R.id.v6r)).setColorFilter(134217728);
                C0H1U.LJIIL((TextView) this.itemView.findViewById(R.id.v78), c7813033j.LLILZLL, true);
            }
        } else {
            C03DZ.LIZ(this.itemView.findViewById(R.id.v73));
        }
        if (c7813033j.LLJ) {
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.fyx));
        } else {
            C03DZ.LIZ(this.itemView.findViewById(R.id.fyx));
        }
        if (!c7813033j.LLIZLLLIL) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.desc), 8);
        } else {
            C0H1U.LJIIL((TextView) this.itemView.findViewById(R.id.desc), c7813033j.LLILLJJLI, true);
        }
        if (!this.LLJ) {
            this.LLJ = true;
            Object obj = C01D1.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
            C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 419);
            AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(369);
            if (Intrinsics.LJFF(obj, obj)) {
                assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 4026), c5182020e, AFwS224S0000000_33.get$arr$(589), new AwS563S0100000_19((C03K6) this, 3109), new AwS550S0100000_6((C03K6) this, 1280), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 4029), aFwS279S0000000_33, new AwS550S0100000_6((C03K6) this, 1281), null, new AwS550S0100000_6((C03K6) this, 1282));
            } else if (obj instanceof InterfaceC451590HnJ) {
                AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7((C03K6) this, 747);
                AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 4027);
                AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(c19719912DlLIZ, 4028);
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS551S0100000_7, 102));
                AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 3114);
                AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 3116);
                AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 3117);
                AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 3118);
                AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 3120);
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
                assemVMLazy = new AssemVMLazy(awS577S0100000_332, c5182020e, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS577S0100000_33, aFwS279S0000000_33, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
            } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
                assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 4030), c5182020e, AFwS224S0000000_33.get$arr$(590), new AwS563S0100000_19((C03K6) this, 3122), new AwS550S0100000_6((C03K6) this, 1286), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 4031), aFwS279S0000000_33, new AwS550S0100000_6((C03K6) this, 1287), null, new AwS550S0100000_6((C03K6) this, 1289));
            } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 4025), c5182020e, AFwS224S0000000_33.get$arr$(588), new AwS551S0100000_7((C03K6) this, 745), new AwS550S0100000_6((C03K6) this, 1274), new AwS550S0100000_6((C03K6) this, 1276), aFwS279S0000000_33, null, null, new AwS550S0100000_6((C03K6) this, 1277));
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            C03O0 c03o0 = C03O0.LIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJI;
            HashMap<String, Object> mapHi1 = ((OrderSubmitAssemViewModel) assemVMLazy.getValue()).hi1(false);
            mapHi1.put("item_num", Integer.valueOf(c7813033j.LLILLL));
            C03O0.LJJJZ(c03o0, "expired_items", mapHi1, null, null, null, null, null, null, null, null, null, null, null, 1048572);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b3i, viewGroup, false);
    }
}
