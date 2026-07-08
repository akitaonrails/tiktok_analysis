package com.ss.android.ugc.aweme.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C12823050b;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1841350y17;
import X.C1843500y4a;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C422830Gi1;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C661110PwT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.viewmodel.MentionVideoShareModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class BaseVideoCell<T> extends PowerCell<C12823050b> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public SmartImageView LL;
    public Drawable LLILLJJLI;
    public TuxTextView LLILLL;
    public ViewGroup LLILZ;
    public C1841350y17 LLILZIL;
    public View LLILZLL;
    public Aweme LLIZ;
    public final IAVPublishService LLIZLLLIL;
    public final C01GW LLJ;
    public final String LLJI;
    public final AssemVMLazy LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseVideoCell.class, "shareVM", "getShareVM()Lcom/ss/android/ugc/aweme/viewmodel/MentionVideoShareModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BaseVideoCell() {
        AssemVMLazy assemVMLazy;
        IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        this.LLIZLLLIL = iAVPublishServicePublishService;
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19((BaseVideoCell) this, 385));
        this.LLJI = iAVPublishServicePublishService.getCurrentUserId();
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MentionVideoShareModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 400);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(75);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 411), awS563S0100000_19, AFwS207S0000000_19.get$arr$(59), new AwS563S0100000_19((C03K6) this, 386), new AwS563S0100000_19((C03K6) this, 388), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 390), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 392), null, new AwS563S0100000_19((C03K6) this, 393));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 387);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 389);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 391);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 25));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 394);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 395);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 396);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 397);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 398);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 399), awS563S0100000_19, AFwS207S0000000_19.get$arr$(60), new AwS563S0100000_19((C03K6) this, 401), new AwS563S0100000_19((C03K6) this, 402), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 403), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 404), null, new AwS563S0100000_19((C03K6) this, 405));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 406), awS563S0100000_19, AFwS207S0000000_19.get$arr$(61), new AwS563S0100000_19((C03K6) this, 407), new AwS563S0100000_19((C03K6) this, 408), new AwS563S0100000_19((C03K6) this, 409), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 410));
        }
        this.LLJIJIL = assemVMLazy;
    }

    public final C1841350y17 I5() {
        C1841350y17 c1841350y17 = this.LLILZIL;
        if (c1841350y17 != null) {
            return c1841350y17;
        }
        return null;
    }

    public final Context L5() {
        return (Context) this.LLJ.getValue();
    }

    public final SmartImageView N5() {
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            return smartImageView;
        }
        return null;
    }

    public final MentionVideoShareModel P5() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (MentionVideoShareModel) assemVMLazy.getValue();
    }

    public final TuxTextView R5() {
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final void S5(C12823050b c12823050b) {
        long playCount;
        AwemeStatistics statistics = c12823050b.LL.getStatistics();
        C786410Ut5.LLLLZLL(R5(), 0);
        if (statistics != null) {
            playCount = statistics.getPlayCount();
        } else {
            playCount = 0;
        }
        String strLIZIZ = C1843500y4a.LIZIZ(playCount);
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = C800330VaR.LIZIZ(L5(), 2130973151);
        }
        TuxTextView tuxTextViewR5 = R5();
        Drawable drawable = this.LLILLJJLI;
        if (tuxTextViewR5 != null) {
            tuxTextViewR5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        R5().setText(strLIZIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, L5());
        if (numLIZJ != null) {
            R5().setTextColor(numLIZJ.intValue());
        }
        R5().setTuxFont(72);
    }

    public final void T5(UrlModel urlModel, String str, Aweme aweme) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        int[] iArrLIZ = C422830Gi1.LIZ(200);
        if (iArrLIZ != null) {
            c1331670kl3LJIIIIZZ.LJJIJ(iArrLIZ);
        }
        c1331670kl3LJIIIIZZ.LJJ(N5());
        c1331670kl3LJIIIIZZ.LIZLLL(str);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        if (aweme != null && aweme.getVideo() != null && !C661110PwT.LIZ()) {
            aweme.getVideo().setCachedOuterCoverUrl(urlModel);
            aweme.getVideo().setCachedOuterCoverSize(iArrLIZ);
        }
    }
}
