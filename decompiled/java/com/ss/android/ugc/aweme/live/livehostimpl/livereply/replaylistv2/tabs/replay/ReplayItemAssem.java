package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.replay;

import X.AbstractC1335900krs;
import X.AbstractViewOnClickListenerC1231770i9v;
import X.C019F;
import X.C0H9F;
import X.C0IDA;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1835460xrc;
import X.C1838100xvs;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C497740JfY;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.replay.ReplayItemAssem;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.replay.ReplayListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ReplayItemAssem extends ReusedUISlotAssem<ReplayItemAssem> implements InterfaceC712990Rxx<C1835460xrc> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public View LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public C1835460xrc LLJZIJLIL;
    public final AssemVMLazy LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReplayItemAssem.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/replay/ReplayListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ReplayItemAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReplayListViewModel.class);
        this.LLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 716), AFwS269S0000000_27.get$arr$(124), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dgw;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJZIJLIL = null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Float fLIZ;
        ConstraintLayout constraintLayout;
        this.LLJJLIIIJLLLLLLLZ = (ConstraintLayout) view.findViewById(R.id.f4y);
        this.LLJL = (SmartImageView) view.findViewById(R.id.f59);
        SmartImageView smartImageView = this.LLJL;
        if (smartImageView != null && (fLIZ = C0H9F.LIZ(smartImageView)) != null && (constraintLayout = this.LLJJLIIIJLLLLLLLZ) != null) {
            float fFloatValue = fLIZ.floatValue();
            constraintLayout.setBackgroundColor(-16777216);
            constraintLayout.setClipToOutline(true);
            constraintLayout.setOutlineProvider(new C0IDA(fFloatValue, 7));
        }
        this.LLJLIL = view.findViewById(R.id.j4c);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.gbz);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.fg1);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.desc);
        this.LLJLLL = view.findViewById(R.id.kik);
        this.LLJZ = view.findViewById(R.id.unavailable_mask);
        ConstraintLayout constraintLayout2 = this.LLJJLIIIJLLLLLLLZ;
        if (constraintLayout2 != null) {
            float fLJIIZILJ = (C497740JfY.LJIIZILJ() - (3 * C497740JfY.LIZIZ(6))) / 2;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) constraintLayout2.getLayoutParams();
            layoutParams.width = (int) fLJIIZILJ;
            layoutParams.height = (int) (((double) fLJIIZILJ) / 0.61d);
            C786410Ut5.m6(constraintLayout2, layoutParams);
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1231770i9v() { // from class: X.0xrb
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1231770i9v
            public final void LIZ(View view2) {
                C1835460xrc c1835460xrc;
                int iIntValue;
                int iIntValue2;
                int iIntValue3;
                if (view2 != null && (c1835460xrc = this.LLILZ.LLJZIJLIL) != null) {
                    C1835440xra c1835440xra = C1835440xra.LIZ;
                    String str = c1835460xrc.LL;
                    int i = c1835460xrc.LLJILJIL;
                    c1835440xra.getClass();
                    C1835440xra.LJ(i, "click", str);
                    if (c1835460xrc.LLJILJIL == 1) {
                        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZ.LJJIJL());
                        c1389890mGx.LJIIIZ(2131853385);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    if (c1835460xrc.LIZ()) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLILZ.LJJIJL());
                        c1389890mGx2.LJIIIZ(2131853360);
                        c1389890mGx2.LJIIJJI();
                        return;
                    }
                    C1834140xpU c1834140xpU = C1834140xpU.LIZ;
                    Context context = this.LLILZ.getContext();
                    AssemVMLazy assemVMLazy = this.LLILZ.LLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ReplayItemAssem.LLLF;
                    String strValueOf = String.valueOf(((ReplayListViewModel) assemVMLazy.getValue()).LLILZ);
                    c1834140xpU.getClass();
                    if (context == null) {
                        return;
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webcast_replay_video");
                    smartRouteBuildRoute.withParam("roomId", c1835460xrc.LL);
                    String str2 = c1835460xrc.LLIZLLLIL;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    smartRouteBuildRoute.withParam("videoUrl", str2);
                    String str4 = c1835460xrc.LLJ;
                    if (str4 == null) {
                        str4 = "";
                    }
                    smartRouteBuildRoute.withParam("downloadUrl", str4);
                    String str5 = c1835460xrc.LLILZLL;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    smartRouteBuildRoute.withParam("fileId", str3);
                    Integer num = c1835460xrc.LLJI;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    smartRouteBuildRoute.withParam("videoWidth", iIntValue);
                    Integer num2 = c1835460xrc.LLJIJIL;
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    smartRouteBuildRoute.withParam("videoHeight", iIntValue2);
                    Integer num3 = c1835460xrc.LLIZ;
                    if (num3 != null) {
                        iIntValue3 = num3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    smartRouteBuildRoute.withParam("downloadStatus", iIntValue3);
                    C1833570xoZ.LIZ.getClass();
                    smartRouteBuildRoute.withParam("enterFromPage", C1833570xoZ.LIZIZ);
                    smartRouteBuildRoute.withParam("enterFrom", "live_replay");
                    smartRouteBuildRoute.withParam("last_page", "live_replay");
                    smartRouteBuildRoute.withParam("videoLength", 0);
                    smartRouteBuildRoute.withParam("isAutoPlay", false);
                    smartRouteBuildRoute.withParam("position", 0);
                    smartRouteBuildRoute.withParam("isMute", false);
                    smartRouteBuildRoute.withParam("isPause", false);
                    smartRouteBuildRoute.withParam("user_type", strValueOf);
                    smartRouteBuildRoute.open();
                }
            }
        }, view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1835460xrc c1835460xrc) {
        final boolean z;
        int i;
        String strLIZ;
        String strLIZIZ;
        List urls;
        String str;
        C1835460xrc c1835460xrc2 = c1835460xrc;
        this.LLJZIJLIL = c1835460xrc2;
        int i2 = 0;
        if (c1835460xrc2.LLJILJIL != 1 && !c1835460xrc2.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        ImageModel imageModel = c1835460xrc2.LLILLJJLI;
        final SmartImageView smartImageView = this.LLJL;
        if (smartImageView != null) {
            View view = this.LLJLIL;
            if (view != null) {
                C337180DJs.LIZ(view);
            }
            C786410Ut5.u5(smartImageView, 0.0f);
            if (imageModel != null && (urls = imageModel.getUrls()) != null && (str = (String) C13LP.LJJJLL(urls)) != null && str.length() != 0) {
                final C1835460xrc c1835460xrc3 = this.LLJZIJLIL;
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJ(smartImageView);
                c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0xs7
                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view2, Throwable th) {
                        if (!Intrinsics.LJFF(this.LL.LLJZIJLIL, c1835460xrc3)) {
                            return;
                        }
                        C786410Ut5.u5(smartImageView, 1.0f);
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
                        InterfaceC1320380kSq interfaceC1320380kSq;
                        View view3;
                        if (!Intrinsics.LJFF(this.LL.LLJZIJLIL, c1835460xrc3)) {
                            return;
                        }
                        ReplayItemAssem replayItemAssem = this.LL;
                        SmartImageView smartImageView2 = smartImageView;
                        replayItemAssem.getClass();
                        if (c428600GrK != null) {
                            int i3 = c428600GrK.LIZ;
                            int i4 = c428600GrK.LIZIZ;
                            if (i3 <= 0 || i4 <= 0 || i4 / i3 > 1.6393442f) {
                                interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
                            } else {
                                interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
                            }
                        } else {
                            interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
                        }
                        if (!Intrinsics.LJFF(smartImageView2.getHierarchy().LJIIJJI(), interfaceC1320380kSq)) {
                            smartImageView2.getHierarchy().LJIIZILJ(interfaceC1320380kSq);
                        }
                        C786410Ut5.u5(smartImageView, 1.0f);
                        if (z && (view3 = this.LL.LLJLIL) != null) {
                            C337180DJs.LIZJ(view3);
                        }
                    }
                });
            } else {
                smartImageView.setController(null);
            }
        }
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        String str2 = "";
        if (tuxTextView != null) {
            Float f = c1835460xrc2.LLILLL;
            if (f == null || (strLIZIZ = C1838100xvs.LIZIZ(f.floatValue())) == null) {
                strLIZIZ = "";
            }
            tuxTextView.setText(strLIZIZ);
        }
        TuxTextView tuxTextView2 = this.LLJLL;
        if (tuxTextView2 != null) {
            Long l = c1835460xrc2.LLILZ;
            if (l != null && (strLIZ = C1838100xvs.LIZ(l.longValue())) != null) {
                str2 = strLIZ;
            }
            tuxTextView2.setText(str2);
        }
        TuxTextView tuxTextView3 = this.LLJLLIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(c1835460xrc2.LLILZIL);
        }
        View view2 = this.LLJLLL;
        if (view2 != null) {
            if (c1835460xrc2.LLJILJIL == 1) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        View view3 = this.LLJZ;
        if (view3 != null) {
            if (!c1835460xrc2.LIZ()) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view3);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1835460xrc c1835460xrc) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1835460xrc c1835460xrc) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
