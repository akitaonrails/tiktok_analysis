package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1379000lzO;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C339190DRl;
import X.C384050F3z;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.InterfaceC2217461Bqa;
import X.InterfaceC658750Psf;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS59S0200000_21;
import irm.AkS89S0100000_21;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS53S0000100_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public abstract class OpenAlbumAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public Fragment LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OpenAlbumAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public OpenAlbumAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 724), AFwS259S0000000_21.get$arr$(205), null, true);
    }

    public abstract void Ap();

    public InterfaceC658750Psf Bp(Function0<Long> function0) {
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dr5;
    }

    public void lp(MusicDetail musicDetail) {
    }

    public abstract String mp();

    public abstract int op();

    public abstract String sp();

    public abstract String up();

    public abstract String yp();

    public abstract void zp();

    public final MusicDetailViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (MusicDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        this.LLJJIII = C724240Sb0.LJI(this);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.lg3);
        if (tuxIconView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
            c384050F3z.LIZJ = Float.valueOf(C339190DRl.LIZ(22));
            Context context = view.getContext();
            if (context != null) {
                tuxIconView.setBackground(c384050F3z.LIZ(context));
                tuxIconView.setIconRes(op());
                C786410Ut5.I7(new AkS89S0100000_21(this, tuxIconView, 25), tuxIconView);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.xr8);
        TextView textView2 = (TextView) view.findViewById(R.id.xqv);
        textView.setText(yp());
        textView2.setText(up());
        TextView textView3 = (TextView) view.findViewById(R.id.diw);
        String strMp = mp();
        if (strMp != null) {
            textView3.setText(strMp);
        } else {
            C339190DRl.LIZIZ(textView3);
        }
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.f5_);
        if (smartImageView != null) {
            smartImageView.setActualImageScaleType(EnumC1338240kve.CENTER_CROP);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strSp = sp();
            if (strSp != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strSp);
                c1331670kl3LJIIIZ.LJJ(smartImageView);
                c1331670kl3LJIIIZ.LIZLLL = true;
                InterfaceC658750Psf interfaceC658750PsfBp = Bp(new AwS53S0000100_21(jCurrentTimeMillis, 1));
                if (interfaceC658750PsfBp != null) {
                    c1331670kl3LJIIIZ.LJJJIL = interfaceC658750PsfBp;
                }
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
        }
        View viewFindViewById = view.findViewById(R.id.h7l);
        viewFindViewById.setClipToOutline(true);
        viewFindViewById.setOutlineProvider(new C1379000lzO(Float.valueOf(C339190DRl.LIZ(12))));
        C786410Ut5.I7(new AkS59S0200000_21(this, viewFindViewById, 0), viewFindViewById);
        AssemViewModel.asyncSubscribe$default(tp(), new C2217381BqS() { // from class: X.0mVu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS600S0100000_21(this, 159), 14, null);
    }
}
