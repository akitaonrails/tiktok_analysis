package com.ss.android.ugc.aweme.tako.botpage.components.video.commonvideo;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0DSB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1843500y4a;
import X.C1860990yWn;
import X.C1861010yWp;
import X.C1863850ybP;
import X.C189200o6;
import X.C2097608Jq;
import X.C2211631BhB;
import X.C298820BnU;
import X.C329510Cvt;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C422830Gi1;
import X.C426750GoL;
import X.C427870Gq9;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import Y.ACListenerS114S0200000_10;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class TakoVideoCommonItemAssem<RECEIVE extends C03H5> extends ReusedUISlotAssem<RECEIVE> implements InterfaceC712990Rxx<C329510Cvt> {
    public SmartImageView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public C427870Gq9 LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public ImageView LLJLLIL;
    public TuxTextView LLJLLL;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10((TakoVideoCommonItemAssem) this, 863));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS554S0100000_10((TakoVideoCommonItemAssem) this, 864));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS554S0100000_10((TakoVideoCommonItemAssem) this, 865));
    public C329510Cvt LLLF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fme;
    }

    public abstract String sp();

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    public abstract void up();

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public abstract void yp(String str);

    public abstract InterfaceC665370Q7z zp();

    public final Map<String, String> getCommonParams() {
        Map<String, String> commonParams;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJZIJLIL.getValue();
        return (iTakoContextAbility == null || (commonParams = iTakoContextAbility.getCommonParams()) == null) ? C2097608Jq.LJ() : commonParams;
    }

    public final TakoCardAbility op() {
        return (TakoCardAbility) this.LLJZ.getValue();
    }

    public final C1863850ybP tp() {
        return (C1863850ybP) this.LLL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (SmartImageView) view.findViewById(R.id.cover);
        this.LLJL = (TuxTextView) view.findViewById(R.id.video_create_time);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.desc);
        this.LLJLILLLLZIIL = (C427870Gq9) view.findViewById(R.id.bbz);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.bc6);
        this.LLJLLIL = (ImageView) view.findViewById(R.id.video_holder_author_verified_badge);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.mn1);
        C2211631BhB.LJ(getContentView(), new AwS589S0100000_10(this, (TakoVideoCommonItemAssem<C03H5>) 507));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(C329510Cvt c329510Cvt) {
        String curUserId;
        int i;
        Integer numValueOf;
        Object c098200Yq;
        C329510Cvt c329510Cvt2 = c329510Cvt;
        this.LLLF = c329510Cvt2;
        TakoVideoItem takoVideoItem = c329510Cvt2.LLILLJJLI;
        if (takoVideoItem != null) {
            SmartImageView smartImageView = this.LLJJLIIIJLLLLLLLZ;
            int i2 = 8;
            if (smartImageView != null) {
                C1860990yWn.LIZ(smartImageView, takoVideoItem, "18", getCommonParams(), new C1861010yWp(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), C298820BnU.LIZIZ);
            }
            TuxTextView tuxTextView = this.LLJL;
            if (tuxTextView != null) {
                try {
                    c098200Yq = new SimpleDateFormat("MMM dd, yyyy", Locale.US).format(new Date(takoVideoItem.createTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = "";
                }
                tuxTextView.setText((String) c098200Yq);
            }
            String str = takoVideoItem.desc;
            if (str != null && str.length() != 0) {
                TuxTextView tuxTextView2 = this.LLJLIL;
                if (tuxTextView2 != null) {
                    C0DSB.LIZJ(tuxTextView2);
                    tuxTextView2.setText(str);
                }
            } else {
                TuxTextView tuxTextView3 = this.LLJLIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText("");
                }
                TuxTextView tuxTextView4 = this.LLJLIL;
                if (tuxTextView4 != null) {
                    C0DSB.LIZIZ(tuxTextView4);
                }
            }
            BaseImage baseImage = takoVideoItem.user.avatar;
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(new ImageUrlModel(baseImage.imageId, baseImage.urlList));
            c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
            c1331670kl3LJIIIIZZ.LJIL(c419910GdJ.LIZ(getContentView().getContext()));
            c1331670kl3LJIIIIZZ.LJJ(this.LLJLILLLLZIIL);
            c1331670kl3LJIIIIZZ.LJIIJJI();
            TuxTextView tuxTextView5 = this.LLJLL;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(takoVideoItem.user.nickname);
            }
            ImageView imageView = this.LLJLLIL;
            if (imageView != null) {
                if (takoVideoItem.user.certInfo.isVerify) {
                    i2 = 0;
                }
                C786410Ut5.LJZI(i2, imageView);
            }
            IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
            if (iAccountUserService != null && (curUserId = iAccountUserService.getCurUserId()) != null) {
                boolean zLJFF = Intrinsics.LJFF(takoVideoItem.isLiked.get(curUserId), Boolean.TRUE);
                long j = takoVideoItem.diggCount;
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                if (zLJFF) {
                    i = R.raw.icon_like_fill;
                } else {
                    i = R.raw.icon_like;
                }
                c419910GdJ2.LIZ = i;
                if (zLJFF) {
                    numValueOf = Integer.valueOf(R.attr.a04);
                } else {
                    numValueOf = Integer.valueOf(R.attr.a1k);
                }
                c419910GdJ2.LJ = numValueOf;
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                C419890GdH c419890GdHLIZIZ = c419910GdJ2.LIZIZ(2, getContentView().getContext());
                c419890GdHLIZIZ.LIZIZ(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C426750GoL.LIZLLL(getContentView().getContext()));
                TuxTextView tuxTextView6 = this.LLJLLL;
                if (tuxTextView6 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "x");
                    C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, 1, 17);
                    spannableStringBuilder.append((CharSequence) C1843500y4a.LIZIZ(j));
                    tuxTextView6.setText(spannableStringBuilder);
                }
            }
            C786410Ut5.I7(new ACListenerS114S0200000_10(c329510Cvt2, this, 23), getContentView());
            yp(c329510Cvt2.LLILLJJLI.awemeId);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C329510Cvt c329510Cvt) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C329510Cvt c329510Cvt) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
