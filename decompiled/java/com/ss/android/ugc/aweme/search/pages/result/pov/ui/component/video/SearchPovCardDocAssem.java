package com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video;

import X.C01GW;
import X.C07E5;
import X.C09U0;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1361400lX0;
import X.C1385040m98;
import X.C13LE;
import X.C1807670x8n;
import X.C1839007Ie;
import X.C21415018rM;
import X.C2217381BqS;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C438710HIf;
import X.C452501pT;
import X.C607880Nso;
import X.C666750QDh;
import X.C685200QuE;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPovCardDocAssem extends ReusedUISlotAssem<SearchPovCardDocAssem> implements InterfaceC712990Rxx<C607880Nso> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public C21415018rM LLJLIL;
    public C21415018rM LLJLLL;
    public C607880Nso LLL;
    public volatile C09U0 LLLF;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 645));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 646));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 644));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 643));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 647));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchPovCardDocAssem.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ez8;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.g20);
        this.LLJL = (SmartImageView) view.findViewById(R.id.g1x);
        this.LLJLIL = (C21415018rM) view.findViewById(R.id.g24);
        C21415018rM c21415018rM = (C21415018rM) view.findViewById(R.id.g22);
        C786410Ut5.LLLLZIL(c21415018rM, C666750QDh.LIZ);
        this.LLJLLL = c21415018rM;
        C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(view.getContext(), true);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.g23);
        if (tuxIconView != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a00, c1361400lX0LIZ)) != null) {
            tuxIconView.setTintColor(numLIZJ.intValue());
        }
        View viewFindViewById = view.findViewById(R.id.rmg);
        int i = 8;
        if (viewFindViewById != null) {
            float fLIZIZ = C418440Gaw.LIZIZ(6);
            float fLIZIZ2 = C418440Gaw.LIZIZ(8);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ2);
            c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ2);
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
            c384050F3z.LJFF = Integer.valueOf(R.attr.a1e);
            viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        }
        float fLIZIZ3 = C418440Gaw.LIZIZ(6);
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZ = C1308910kAL.LIZJ(R.attr.zg, view.getContext());
            c384050F3z2.LJIIIIZZ = Float.valueOf(fLIZIZ3);
            c384050F3z2.LJIIJJI = Float.valueOf(fLIZIZ3);
            tuxTextView.setBackground(c384050F3z2.LIZ(view.getContext()));
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0LIZ);
        if (numLIZJ2 != null) {
            int iIntValue = numLIZJ2.intValue();
            TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(iIntValue);
            }
        }
        TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView3 != null) {
            if (!C1839007Ie.LIZ()) {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView3);
        }
        C427690Gpr.LJ(getContentView(), fLIZIZ3);
        C786410Ut5.I7(new AbS692S0100000_10(this, 15), getContentView());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C607880Nso c607880Nso) {
        int i;
        Video video;
        UrlModel cover;
        C607880Nso c607880Nso2 = c607880Nso;
        this.LLL = c607880Nso2;
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(String.valueOf(c607880Nso2.LLILLJJLI));
        }
        SmartImageView smartImageView = this.LLJL;
        if (smartImageView != null && (video = c607880Nso2.LL.getVideo()) != null && (cover = video.getCover()) != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
            c1331670kl3LJIIIIZZ.LJJIIZI((Drawable) this.LLJZ.getValue());
            c1331670kl3LJIIIIZZ.LJIL((Drawable) this.LLJZ.getValue());
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            c1331670kl3LJIIIIZZ.LJIIJJI();
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C09U0 c09u0 = this.LLLF;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LLLF;
                if (c09u0 == null) {
                    c09u0 = (C09U0) C1807670x8n.p();
                    this.LLLF = c09u0;
                }
            }
        }
        C23250099c.LIZLLL(lifecycleScope, c09u0.LIZ, null, new C685200QuE(c607880Nso2, this, null), 2);
        if (C1839007Ie.LIZ()) {
            View view = (View) this.LLJLILLLLZIIL.getValue();
            if (AwemeExtKt.isPhotoMode(c607880Nso2.LL)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C607880Nso c607880Nso) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C607880Nso c607880Nso) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
