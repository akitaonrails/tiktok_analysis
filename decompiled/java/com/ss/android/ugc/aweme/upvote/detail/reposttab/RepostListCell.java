package com.ss.android.ugc.aweme.upvote.detail.reposttab;

import X.AnonymousClass1021;
import X.C01GW;
import X.C050A;
import X.C07XH;
import X.C0C64;
import X.C0CNO;
import X.C0M3E;
import X.C1176850gjL;
import X.C1220000hqw;
import X.C1258210iqZ;
import X.C1260810iul;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1358950lT3;
import X.C13LE;
import X.C14MI;
import X.C1620160sGM;
import X.C1697810uHb;
import X.C19659111vp;
import X.C21415018rM;
import X.C2211631BhB;
import X.C2441009hQ;
import X.C415750GRx;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C422830Gi1;
import X.C426750GoL;
import X.C428150Gqb;
import X.C438710HIf;
import X.C444830HcP;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C722420SVk;
import X.C724750Sbp;
import X.C729980SkG;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC428940Grs;
import X.EnumC429870GtN;
import X.InterfaceC1359100lTI;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC722440SVm;
import X.InterfaceC722500SVs;
import X.ViewOnLongClickListenerC1265840j2s;
import Y.ACListenerS122S0200000_19;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CollabInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.tiktok.tuc.service.ITUCBizService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RepostListCell extends PowerCell<C050A> implements InterfaceC1359100lTI {
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1934));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1946));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1947));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1936));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1938));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1933));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1945));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1935));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1944));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1937));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1939));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1940));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1943));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1942));
    public final List<Pair<Integer, Integer>> LLJJ = C1697810uHb.LJIIJJI(new Pair(14, 14), new Pair(13, 13));
    public EnumC429870GtN LLJJI = EnumC429870GtN.NONE;
    public boolean LLJJIII;
    public final int LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C736950SvV LLJJJ;
    public String LLJJJIL;
    public final ACListenerS154S0100000_19 LLJJJJ;
    public final ACListenerS154S0100000_19 LLJJJJJIL;

    public final SmartImageView L5() {
        return (SmartImageView) this.LLILZ.getValue();
    }

    public final TuxIconView N5() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    public final RepostListViewModel P5() {
        return (RepostListViewModel) this.LLJJJ.getValue();
    }

    public RepostListCell() {
        int iLIZIZ = (((((C497820Jfg.LIZIZ(this.itemView.getContext()) / 3) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLJJIJI = iLIZIZ >= 0 ? iLIZIZ : 0;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(333));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1941));
        this.LLJJJ = new C736950SvV(C13LE.LIZ(RepostListViewModel.class), new AwS563S0100000_19(this, 1948), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS257S0000000_19.get$arr$(331), null, null, null);
        this.LLJJJJ = new ACListenerS154S0100000_19(this, 137);
        this.LLJJJJJIL = new ACListenerS154S0100000_19(this, 138);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "repost_list_cell_unsubscribe_fix", true, true)) {
            String str = this.LLJJJIL;
            if (str != null) {
                C1358950lT3.LIZ.getClass();
                C1358950lT3.LJIIJJI(str, this);
            }
            this.LLJJJIL = null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS598S0100000_19(this, 265));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        L5().setAttached(true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        L5().setAttached(false);
        String str = this.LLJJJIL;
        if (str != null) {
            C1358950lT3.LIZ.getClass();
            C1358950lT3.LJIIJJI(str, this);
        }
        this.LLJJJIL = null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "repost_list_cell_unsubscribe_fix", true, true)) {
            String str = this.LLJJJIL;
            if (str != null) {
                C1358950lT3.LIZ.getClass();
                C1358950lT3.LJIIJJI(str, this);
            }
            this.LLJJJIL = null;
        }
    }

    public final void I5(C1260810iul c1260810iul) {
        int i;
        int iIntValue;
        Drawable drawableMutate;
        int iIntValue2;
        Context context = this.itemView.getContext();
        if (C426750GoL.LIZLLL(context)) {
            i = R.drawable.fic;
        } else {
            i = R.drawable.fib;
        }
        float f = 255;
        int iLIZIZ = C814420VxA.LIZIZ(c1260810iul.LJ * f);
        Integer numLIZJ = C1308910kAL.LIZJ(c1260810iul.LIZLLL, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        Drawable drawableLIZ = C14MI.LIZ(context, i);
        LayerDrawable layerDrawableLJIILIIL = null;
        if (drawableLIZ != null && (drawableMutate = drawableLIZ.mutate()) != null) {
            drawableMutate.setAlpha(iLIZIZ);
            drawableMutate.setTint(iIntValue);
        } else {
            drawableMutate = null;
        }
        View view = (View) this.LLJIJIL.getValue();
        if (c1260810iul.LJFF) {
            if (drawableMutate != null) {
                C19659111vp c19659111vp = new C19659111vp();
                c19659111vp.LIZ = C418440Gaw.LIZIZ(8);
                c19659111vp.LIZIZ = C418440Gaw.LIZIZ(2);
                c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
                c19659111vp.LIZLLL = C418440Gaw.LIZIZ(14);
                c19659111vp.LJFF = Integer.valueOf(Color.argb(38, 0, 0, 0));
                layerDrawableLJIILIIL = C426750GoL.LJIILIIL(drawableMutate, c19659111vp.LIZ(context));
            }
            drawableMutate = layerDrawableLJIILIIL;
        }
        view.setBackground(drawableMutate);
        C415750GRx c415750GRx = (C415750GRx) this.LLJJIJIL.getValue();
        ((Paint) c415750GRx.LIZIZ.getValue()).setColor(C2441009hQ.LJIIL(iIntValue, C814420VxA.LIZIZ(Color.alpha(iIntValue) * c1260810iul.LJ)));
        c415750GRx.invalidateSelf();
        ((View) this.LLJILJIL.getValue()).setBackground((Drawable) this.LLJJIJIL.getValue());
        Integer numLIZJ2 = C1308910kAL.LIZJ(c1260810iul.LIZIZ, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -16777216;
        }
        int iLJIIL = C2441009hQ.LJIIL(iIntValue2, C814420VxA.LIZIZ(f * c1260810iul.LIZJ));
        C444830HcP c444830HcP = (C444830HcP) this.LLJJIJIIJIL.getValue();
        c444830HcP.LJIILIIL(c1260810iul.LIZ);
        c444830HcP.LIZIZ.LJ = this.LLJJIJI;
        c444830HcP.LJIILJJIL(iLJIIL);
        ((C21415018rM) this.LLJIJIL.getValue()).setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.3f, true, this.LLJJ, 24));
        C786410Ut5.I7(c1260810iul.LJI, (View) this.LLJI.getValue());
        C786410Ut5.LJLLLLLL(0, (View) this.LLJI.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021b A[PHI: r5
      0x021b: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v6 java.lang.String) binds: [B:46:0x00a6, B:44:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143 A[PHI: r13
      0x0143: PHI (r13v1 boolean) = 
      (r13v0 boolean)
      (r13v3 boolean)
      (r13v3 boolean)
      (r13v3 boolean)
      (r13v3 boolean)
      (r13v3 boolean)
      (r13v3 boolean)
      (r13v3 boolean)
      (r13v3 boolean)
      (r13v3 boolean)
      (r13v3 boolean)
     binds: [B:104:0x0214, B:55:0x00c4, B:56:0x00c6, B:58:0x00cc, B:60:0x00d6, B:62:0x00de, B:64:0x00e2, B:66:0x00e8, B:68:0x00f6, B:73:0x011d, B:74:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R5(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r15) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListCell.R5(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList):void");
    }

    public final void S5(Aweme aweme) {
        long playCount;
        C786410Ut5.LJLLLLLL(0, (View) this.LLILZIL.getValue());
        ((TuxIconView) this.LLILZLL.getValue()).setIconRes(R.raw.icon_play);
        TextView textView = (TextView) this.LLIZ.getValue();
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            playCount = statistics.getPlayCount();
        } else {
            playCount = 0;
        }
        textView.setText(C1176850gjL.LIZ(1, Long.valueOf(playCount), ""));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC722500SVs interfaceC722500SVs;
        String str;
        C1258210iqZ c1258210iqZ;
        AwemeStatus statusSafety;
        C1258210iqZ c1258210iqZ2;
        AnonymousClass1021 anonymousClass1021LJFF;
        UrlModel cover;
        int iIntValue;
        C050A c050a = (C050A) interfaceC1891350zJl;
        Aweme aweme = c050a.LL;
        L5().setActualImageResource(0);
        Video video = aweme.getVideo();
        if (video != null) {
            if (AwemeExtKt.isCommentPostInvisible(aweme)) {
                SmartImageView smartImageViewL5 = L5();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_video_slash;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(smartImageViewL5.getContext());
                smartImageViewL5.setScaleType(ImageView.ScaleType.CENTER);
                smartImageViewL5.setImageDrawable(tuxIconDrawableLIZ);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, smartImageViewL5.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                smartImageViewL5.setBackgroundColor(iIntValue);
            } else if (!C1620160sGM.LIZLLL(L5(), video, "RepostListCell", false, true, 120) && (cover = video.getCover()) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                int[] iArrLIZ = C422830Gi1.LIZ(200);
                if (iArrLIZ != null) {
                    c1331670kl3LJIIIIZZ.LJJIJ(iArrLIZ);
                }
                c1331670kl3LJIIIIZZ.LJJ(L5());
                c1331670kl3LJIIIIZZ.LIZLLL("RepostListCell");
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        }
        ((C0M3E) this.LL.getValue()).LJ(c050a.LL);
        S5(c050a.LL);
        C786410Ut5.I7(new ACListenerS122S0200000_19(this, c050a, 53), this.itemView);
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1265840j2s(this, c050a, 0));
        Aweme aweme2 = c050a.LL;
        ITUCBizService iTUCBizService = (ITUCBizService) PluggableExtentionKt.pluggableSpi$default(ITUCBizService.class, false, false, false, 14, null);
        String str2 = null;
        if (iTUCBizService != null && (anonymousClass1021LJFF = iTUCBizService.LJFF()) != null) {
            interfaceC722500SVs = (InterfaceC722500SVs) anonymousClass1021LJFF.LIZLLL(0, aweme2);
        } else {
            interfaceC722500SVs = null;
        }
        int i = 8;
        if (interfaceC722500SVs == null) {
            C786410Ut5.LJZ(8, (FrameLayout) this.LLJ.getValue());
        } else {
            C786410Ut5.LJZ(0, (FrameLayout) this.LLJ.getValue());
            InterfaceC1555100qZQ interfaceC1555100qZQ = (InterfaceC1555100qZQ) this.LLILLJJLI.getValue();
            if (interfaceC1555100qZQ != null && (c1258210iqZ = (C1258210iqZ) interfaceC1555100qZQ.getSource()) != null) {
                str = c1258210iqZ.LL;
            } else {
                str = null;
            }
            InterfaceC722440SVm<? extends C07XH> interfaceC722440SVmLIZ = interfaceC722500SVs.LIZ(this.itemView.getContext(), aweme2, str, AFwS207S0000000_19.get$arr$(OppoPermissionPopupMaskDelayExp.DEFAULT));
            C722420SVk c722420SVk = C722420SVk.LIZ;
            View view = (View) this.LLJ.getValue();
            c722420SVk.getClass();
            C722420SVk.LIZIZ(interfaceC722440SVmLIZ, view, null);
        }
        Aweme aweme3 = c050a.LL;
        InterfaceC1555100qZQ interfaceC1555100qZQ2 = (InterfaceC1555100qZQ) this.LLILLJJLI.getValue();
        if (interfaceC1555100qZQ2 != null && (c1258210iqZ2 = (C1258210iqZ) interfaceC1555100qZQ2.getSource()) != null) {
            str2 = c1258210iqZ2.LL;
        }
        Intrinsics.LJFF(str2, "personal_homepage");
        if (aweme3 == null) {
            C786410Ut5.LLLLLLZZ(N5(), 8);
        } else if (aweme3.isSubOnlyVideo()) {
            C786410Ut5.LLLLLLZZ(N5(), 0);
            N5().setIconRes(R.raw.icon_star_ring);
        } else if (AwemeExtKt.getStatusSafety(aweme3) == null || !C729980SkG.LJIIIIZZ(aweme3) || ((statusSafety = AwemeExtKt.getStatusSafety(aweme3)) != null && statusSafety.getPrivateStatus() == 0)) {
            C786410Ut5.LLLLLLZZ(N5(), 8);
        } else {
            C786410Ut5.LLLLLLZZ(N5(), 0);
            AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme3);
            if (statusSafety2 != null && statusSafety2.getPrivateStatus() == 1) {
                N5().setIconRes(R.raw.icon_lock_small);
            } else {
                AwemeStatus statusSafety3 = AwemeExtKt.getStatusSafety(aweme3);
                if (statusSafety3 != null && statusSafety3.getPrivateStatus() == 2) {
                    N5().setIconRes(R.raw.icon_two_person);
                }
            }
        }
        Aweme aweme4 = c050a.LL;
        TuxIconView tuxIconView = (TuxIconView) this.LLIZLLLIL.getValue();
        CollabInfo collabInfo = aweme4.getCollabInfo();
        if (collabInfo != null && collabInfo.shouldDisplayTag) {
            i = 0;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
        C428150Gqb.LIZ(this.itemView, EnumC428940Grs.STRONG_MASK, 0.0f);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "repost_note_expose_exp", true, false)) {
            String str3 = this.LLJJJIL;
            if (str3 != null) {
                C1358950lT3.LIZ.getClass();
                C1358950lT3.LJIIJJI(str3, this);
            }
            this.LLJJJIL = c050a.LL.getAid();
            C1358950lT3 c1358950lT3 = C1358950lT3.LIZ;
            Aweme aweme5 = c050a.LL;
            c1358950lT3.getClass();
            R5(C1358950lT3.LJIIJ(aweme5, this));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i6n, viewGroup, false);
    }

    @Override // X.InterfaceC1359100lTI
    public final void P12(String str, UpvoteList upvoteList, String str2, boolean z) {
        if (Intrinsics.LJFF(str, this.LLJJJIL)) {
            C0CNO.LIZLLL(0L, new AwS420S0200000_19(this, upvoteList, 106));
        }
    }
}
