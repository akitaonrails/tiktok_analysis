package com.ss.android.ugc.aweme.tako.botpage.components.image;

import X.C019F;
import X.C06X1;
import X.C0HZQ;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C13LE;
import X.C1637806bA;
import X.C1767406w4;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoAIImageConvertStyleItemAssem extends ReusedUISlotAssem<TakoAIImageConvertStyleItemAssem> implements InterfaceC712990Rxx<C06X1> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public TuxTextView LLJLIL;
    public C0HZQ LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAIImageConvertStyleItemAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tako/botpage/components/image/TakoAIImageConvertStyleVM;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoAIImageConvertStyleItemAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoAIImageConvertStyleVM.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 851), AFwS229S0000000_2.get$arr$(522), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fjq;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        this.LLJL = (SmartImageView) view.findViewById(R.id.wd4);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.wdf);
        this.LLJLILLLLZIIL = (C0HZQ) view.findViewById(R.id.wd1);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            C0HZQ c0hzq = this.LLJLILLLLZIIL;
            if (c0hzq != null) {
                c0hzq.setCheckBoxMaskColor(iIntValue);
            }
        }
        C0HZQ c0hzq2 = this.LLJLILLLLZIIL;
        if (c0hzq2 != null) {
            c0hzq2.setInnerMaskVisibility(true);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C06X1 c06x1) {
        String str;
        ColorDrawable colorDrawable;
        Integer numLIZJ;
        C06X1 c06x12 = c06x1;
        ConvertStyleItem convertStyleItem = c06x12.LLILLL;
        String str2 = null;
        if (convertStyleItem != null && (str = convertStyleItem.picUrl) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(this.LLJL);
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context)) != null) {
                colorDrawable = new ColorDrawable(numLIZJ.intValue());
            } else {
                colorDrawable = null;
            }
            c1331670kl3LJIIIZ.LJJIIZI(colorDrawable);
            c1331670kl3LJIIIZ.LJJJIL = new C1338340kvo(this.LLJL, "image_convert_style_2", str, C2097608Jq.LJ());
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            ConvertStyleItem convertStyleItem2 = c06x12.LLILLL;
            if (convertStyleItem2 != null) {
                str2 = convertStyleItem2.imageStyle;
            }
            tuxTextView.setText(str2);
        }
        C0HZQ c0hzq = this.LLJLILLLLZIIL;
        if (c0hzq != null) {
            c0hzq.setChecked(c06x12.LLILLJJLI);
        }
        C0HZQ c0hzq2 = this.LLJLILLLLZIIL;
        if (c0hzq2 != null) {
            C786410Ut5.D7(c0hzq2, new C1767406w4(this, c06x12, 0));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C06X1 c06x1) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C06X1 c06x1) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
