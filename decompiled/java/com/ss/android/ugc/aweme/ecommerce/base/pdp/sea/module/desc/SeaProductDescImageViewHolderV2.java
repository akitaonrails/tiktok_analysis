package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc;

import X.C01GW;
import X.C03DZ;
import X.C10515049h;
import X.C1054104Ah;
import X.C1066100dqi;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1406710mi5;
import X.C1748510vbN;
import X.C1748720vbi;
import X.C1750070vdt;
import X.C1750080vdu;
import X.C1750100vdw;
import X.C1755600vmo;
import X.C1776120wJu;
import X.C19719912Dl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C788230Uw1;
import X.C814420VxA;
import X.C948503nH;
import X.C958103op;
import X.EnumC1338240kve;
import X.InterfaceC1750090vdv;
import Y.ACListenerS90S0300000_26;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaProductDescImageViewHolderV2 extends AbsBrickFullSpanVH<C1406710mi5> implements InterfaceC1750090vdv {
    public final Function1<Integer, Object> LLJJIJIL;
    public final C01GW LLJJJ;
    public C788230Uw1 LLJJJIL;
    public C1750080vdu LLJJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel d6() {
        return (SeaPdpViewModel) this.LLJJJ.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        super.I5();
        d6().LR2().LIZ(getAbsoluteAdapterPosition(), this.LLJJIJIL, d6().LLLLZLL, d6().RR2(d6().Tg2()));
    }

    @Override // X.InterfaceC1750090vdv
    public final void LJJLIIIJILLIZJL() {
        SeaPdpViewModel seaPdpViewModelD6 = d6();
        seaPdpViewModelD6.LLLZI = true;
        seaPdpViewModelD6.setState(new AwS605S0100000_26(seaPdpViewModelD6, 651));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        super.P5();
        d6().LR2().LIZIZ(getAbsoluteAdapterPosition());
    }

    @Override // X.InterfaceC1750090vdv
    public final void LJJJJJL(boolean z) {
        d6().LLLLIILL = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: f6, reason: merged with bridge method [inline-methods] */
    public final void rr(C1406710mi5 c1406710mi5) {
        String str;
        int iIntValue;
        int iLIZLLL;
        Float f;
        super.rr(c1406710mi5);
        this.LLJJJIL = (C788230Uw1) C1748510vbN.LIZ(this, R.id.fng);
        d6().LR2().LIZLLL(getAbsoluteAdapterPosition());
        if (this.LLJJJJ == null) {
            this.LLJJJJ = new C1750080vdu();
        }
        C1750080vdu c1750080vdu = this.LLJJJJ;
        if (c1750080vdu == null) {
            return;
        }
        C788230Uw1 c788230Uw1 = this.LLJJJIL;
        if (c788230Uw1 != null) {
            int absoluteAdapterPosition = getAbsoluteAdapterPosition();
            SmartImageView smartImageView = (SmartImageView) c788230Uw1.LL.findViewById(R.id.egf);
            C1066100dqi c1066100dqi = new C1066100dqi();
            c1066100dqi.LIZJ = "pdp_detail";
            c1066100dqi.LIZ(absoluteAdapterPosition);
            c1066100dqi.LIZIZ(c1406710mi5.LL);
            C426750GoL.LJIIIZ(c788230Uw1.LL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, false, 18);
            c1406710mi5.LL.getUri();
            e6(c1406710mi5, smartImageView, c1066100dqi);
            ((TextView) c788230Uw1.LL.findViewById(R.id.view_more_text)).setText(c788230Uw1.LL.getContext().getString(c1750080vdu.LIZLLL));
            ((TuxTextView) c788230Uw1.LL.findViewById(R.id.view_more_text)).setTextColorRes(c1750080vdu.LIZJ);
            ((TuxIconView) c788230Uw1.LL.findViewById(R.id.view_more_icon)).setTintColorRes(c1750080vdu.LIZIZ);
            if (c1406710mi5.LLILLJJLI && (f = c1406710mi5.LLILLL) != null) {
                if (((int) f.floatValue()) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))) {
                    iLIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                } else {
                    iLIZLLL = (int) c1406710mi5.LLILLL.floatValue();
                }
                C03DZ.LIZJ(c788230Uw1.LL.findViewById(R.id.view_more));
                C03DZ.LIZJ(c788230Uw1.LL.findViewById(R.id.view_more_background));
                if (!c788230Uw1.LLILLJJLI) {
                    c788230Uw1.LLILLJJLI = true;
                    C1748720vbi.LJFF(c788230Uw1.LL.findViewById(R.id.view_more), new C10515049h(), AFwS215S0000000_26.get$arr$(485), AFwS268S0000000_26.get$arr$(690));
                }
                C948503nH.LJIILIIL(c788230Uw1.LL.findViewById(R.id.view_more), null, new C1750070vdt(this, c788230Uw1, null), 3);
            } else {
                C03DZ.LIZ(c788230Uw1.LL.findViewById(R.id.view_more));
                C03DZ.LIZ(c788230Uw1.LL.findViewById(R.id.view_more_background));
                Image image = c1406710mi5.LL;
                Integer width = image.getWidth();
                int iIntValue2 = 100;
                if ((width == null || width.intValue() != 0) && image.getWidth() != null) {
                    Integer width2 = image.getWidth();
                    if (width2 != null) {
                        iIntValue = width2.intValue();
                    }
                } else {
                    iIntValue = 100;
                }
                Integer height = image.getHeight();
                if ((height == null || height.intValue() != 0) && image.getHeight() != null) {
                    Integer height2 = image.getHeight();
                    if (height2 != null) {
                        iIntValue2 = height2.intValue();
                    }
                }
                iLIZLLL = ((C958103op.LIZLLL() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) * iIntValue2) / iIntValue;
            }
            if (smartImageView.getLayoutParams() == null) {
                new ViewGroup.LayoutParams(-1, iLIZLLL);
            } else {
                ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = iLIZLLL;
                C786410Ut5.G6(smartImageView, layoutParams);
            }
            C786410Ut5.I7(new ACListenerS90S0300000_26(c788230Uw1, c1406710mi5, this, 11), c788230Uw1.LL);
        }
        if (c1406710mi5.LLILZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C1054104Ah c1054104Ah = d6().LLJLIL;
        if (c1054104Ah != null) {
            C1054104Ah.LJJIJIL(c1054104Ah, c1406710mi5.LL.getUri(), str, false);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaProductDescImageViewHolderV2(ViewGroup viewGroup, AwS605S0100000_26 awS605S0100000_26) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.ax_, context, viewGroup, false, true));
        this.LLJJIJIL = awS605S0100000_26;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 133));
    }

    public final void e6(C1406710mi5 c1406710mi5, SmartImageView smartImageView, C1066100dqi c1066100dqi) {
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Image image = c1406710mi5.LL;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.a03, smartImageView.getContext()));
        c1331670kl3LIZLLL.LIZLLL("CommerceHeadVH");
        c1331670kl3LIZLLL.LJJ(smartImageView);
        C1750100vdw.LIZ(c1331670kl3LIZLLL, c1406710mi5.LL, LifecycleOwnerKt.getLifecycleScope(this));
        c1331670kl3LIZLLL.LJIIL(new C1776120wJu(c1066100dqi, 0));
    }
}
