package com.ss.android.ugc.aweme.core;

import X.AbstractC848400XPy;
import X.C00I8;
import X.C01GW;
import X.C0PEM;
import X.C0RQB;
import X.C0SXF;
import X.C0XQ7;
import X.C1361150lWb;
import X.C1361170lWd;
import X.C1383760m74;
import X.C1383850m7D;
import X.C1383870m7F;
import X.C1383890m7H;
import X.C1383900m7I;
import X.C1383920m7K;
import X.C1383960m7O;
import X.C1384240m7q;
import X.C1384680m8Y;
import X.C1396730mRz;
import X.C2188811AlT;
import X.C23250099c;
import X.C692470REf;
import X.C786410Ut5;
import X.C817503Hh;
import X.C844470XAv;
import X.EnumC1361130lWZ;
import X.EnumC1384040m7W;
import X.EnumC255700yp;
import X.InterfaceC0148002o;
import X.InterfaceC1383970m7P;
import X.InterfaceC1602960roc;
import Y.ARunnableS120S0100000_20;
import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import com.bytedance.common.meteor.render.newcache.BitmapCacheManager;
import com.ss.android.ugc.aweme.ab.DanmakuUIPerfConf;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.DeleteDanmakuEvent;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import com.ss.android.ugc.aweme.repo.DanmakuApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuViewModel extends FeedBaseViewModel<C1361170lWd> {
    public C1383870m7F LLILLJJLI;
    public C1383920m7K LLILLL;
    public C1383850m7D LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public C1383900m7I LLIZLLLIL;
    public long LL = -1;
    public long LLILZ = -1;
    public final int LLJ = C0RQB.AUTO_PLAY_NEXT.getValue() | C0RQB.SHOW_INTRO.getValue();
    public final AwS600S0100000_21 LLJI = new AwS600S0100000_21(this, 107);

    public final void HQ2() {
        this.LLIZ = true;
        this.LLILZLL = false;
        C1383850m7D c1383850m7D = this.LLILZIL;
        if (c1383850m7D != null) {
            c1383850m7D.LIZ = 0;
            c1383850m7D.LIZIZ = 0;
            c1383850m7D.LIZLLL.clear();
            c1383850m7D.LIZJ = 0;
            c1383850m7D.LJ.clear();
        }
        C1383900m7I c1383900m7I = this.LLIZLLLIL;
        if (c1383900m7I != null) {
            c1383900m7I.LIZIZ();
        }
    }

    public final void yQ2(float f) {
    }

    public final EnumC255700yp AQ2() {
        Configuration configuration;
        Aweme aweme;
        C844470XAv.LIZ.getClass();
        Resources resources = C844470XAv.LIZ().getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) {
            return EnumC255700yp.IS_NOT_LANDSCAPE;
        }
        VideoItemParams item = getItem();
        return (item == null || (aweme = item.getAweme()) == null || !C0SXF.LJIJ(aweme)) ? EnumC255700yp.IS_LANDSCAPE : EnumC255700yp.IS_FAKE_LANDSCAPE;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1361170lWd(0);
    }

    public final void reset() {
        C1383870m7F c1383870m7F = this.LLILLJJLI;
        if (c1383870m7F != null) {
            c1383870m7F.LJIILIIL = new C1383920m7K(new ArrayList(), EnumC1384040m7W.RESET);
            ((ArrayList) c1383870m7F.LJII).clear();
            ((ArrayList) c1383870m7F.LJIIIZ).clear();
        }
    }

    public final void unBind() {
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DanmakuViewModel: unBind,");
        VideoItemParams item = getItem();
        sbLIZ.append((item == null || (aweme = item.getAweme()) == null) ? null : aweme.getAid());
        sbLIZ.append('\"');
        C2188811AlT.LIZIZ(sbLIZ);
        if (!C692470REf.LIZ()) {
            EQ2(EnumC255700yp.IS_NOT_LANDSCAPE);
            CQ2(true, false, null, null);
        }
        C1383900m7I c1383900m7I = this.LLIZLLLIL;
        if (c1383900m7I != null) {
            c1383900m7I.LIZIZ();
        }
        C1383870m7F c1383870m7F = this.LLILLJJLI;
        if (c1383870m7F != null) {
            c1383870m7F.LJIILL.dispose();
        }
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = -1L;
        this.LLILZIL = null;
        this.LLILZLL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EQ2(X.EnumC255700yp r15) {
        /*
            r14 = this;
            X.00yp r2 = X.EnumC255700yp.IS_NOT_LANDSCAPE
            r4 = 1
            r8 = 0
            r10 = 0
            if (r15 != r2) goto L1b
            X.0m74 r1 = X.C1383760m74.LIZIZ
            java.lang.Object r0 = r14.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
        L15:
            boolean r0 = r1.LJJIFFI(r0)
            if (r0 != 0) goto L31
        L1b:
            if (r15 == r2) goto L82
            X.0m74 r1 = X.C1383760m74.LIZIZ
            java.lang.Object r0 = r14.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L87
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
        L2b:
            boolean r0 = r1.LJIIIZ(r0)
            if (r0 == 0) goto L82
        L31:
            boolean r0 = r14.LLIZ
            if (r0 == 0) goto L82
            boolean r0 = r14.LLILZLL
            if (r0 != 0) goto L82
            X.0lWb r1 = X.C1361150lWb.LIZ
            java.lang.Object r0 = r14.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L85
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.getAweme()
        L47:
            java.lang.Object r0 = r14.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L53
            java.lang.String r5 = r0.mEventType
            if (r5 != 0) goto L55
        L53:
            java.lang.String r5 = ""
        L55:
            X.0m7D r0 = r14.LLILZIL
            if (r0 == 0) goto L83
            int r7 = r0.LIZ
            int r8 = r0.LIZIZ
        L5d:
            int r9 = X.C1481060oe0.LIZLLL
            r1.getClass()
            com.ss.android.ugc.aweme.eventtrack.eventfiles.LandscapeVideoPlayEndEvent r2 = new com.ss.android.ugc.aweme.eventtrack.eventfiles.LandscapeVideoPlayEndEvent
            r2.<init>()
            X.00I9 r6 = new X.00I9
            int r12 = r15.getValue()
            r13 = 18
            r11 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.util.List r1 = java.util.Collections.singletonList(r6)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r0 = X.C0SXF.LJJIFFI(r10, r0, r5)
            X.C1361150lWb.LJI(r2, r1, r3, r0)
            r14.LLILZLL = r4
        L82:
            return
        L83:
            r7 = 0
            goto L5d
        L85:
            r3 = r10
            goto L47
        L87:
            r0 = r10
            goto L2b
        L89:
            r0 = r10
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.core.DanmakuViewModel.EQ2(X.00yp):void");
    }

    public final void FQ2(IDanmakuData iDanmakuData) {
        String strX1;
        if (!this.LLIZ) {
            return;
        }
        if (this.LLILLJJLI != null && (strX1 = iDanmakuData.x1()) != null && a0.LJJIIZI(strX1, "fake_", false)) {
            return;
        }
        C1383900m7I c1383900m7I = this.LLIZLLLIL;
        if (c1383900m7I != null) {
            C01GW c01gw = DanmakuUIPerfConf.LIZIZ;
            if (((DanmakuUIPerfConf.Config) c01gw.getValue()).enable && c1383900m7I.LJI == 0 && c1383900m7I.LJIILJJIL == null) {
                ((Handler) c1383900m7I.LJIILL.getValue()).removeCallbacksAndMessages(null);
                C786410Ut5.LJLIIL(((DanmakuUIPerfConf.Config) c01gw.getValue()).frameStart, (Handler) c1383900m7I.LJIILL.getValue(), new ARunnableS120S0100000_20(c1383900m7I, 80));
            }
            c1383900m7I.LJI++;
        }
        C1383850m7D c1383850m7D = this.LLILZIL;
        if (c1383850m7D != null) {
            c1383850m7D.LIZ(iDanmakuData);
        }
        CQ2(false, false, null, null);
    }

    public final void IQ2(C1384680m8Y c1384680m8Y) {
        setState(new AwS600S0100000_21(c1384680m8Y, 108));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LQ2(long r14) {
        /*
            r13 = this;
            X.0m7F r1 = r13.LLILLJJLI
            r4 = 0
            if (r1 == 0) goto Lac
            long r2 = r1.LJIIJ
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lac
            long r0 = r1.LJ
            double r6 = (double) r0
            r0 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            double r6 = r6 * r0
            long r0 = (long) r6
            long r2 = r2 - r0
            long r1 = java.lang.Math.max(r4, r2)
        L1b:
            long r6 = r13.LLILZ
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L3d
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 < 0) goto L3d
            r13.LLILZ = r1
            X.0m7F r8 = r13.LLILLJJLI
            if (r8 == 0) goto L3d
            X.0m7K r2 = r8.LJIILIIL
            long r6 = r8.LJIIJ
            long r0 = r2.LIZ
            long r2 = r2.LIZIZ
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r10 = 1
            r9 = 0
            if (r11 >= 0) goto L3e
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L3e
        L3d:
            return
        L3e:
            java.util.List<X.0m7N> r0 = r8.LJIIIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r12 = r0.iterator()
        L46:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r12.next()
            X.0m7N r0 = (X.C1383950m7N) r0
            long r2 = r0.LIZ
            long r0 = r0.LIZIZ
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 >= 0) goto L46
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L46
            return
        L5f:
            java.util.List<X.0m7O> r0 = r8.LJII
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r12 = r0.iterator()
        L67:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r12.next()
            X.0m7O r0 = (X.C1383960m7O) r0
            long r6 = r8.LJIIJ
            long r2 = r0.LIZ
            long r0 = r0.LIZIZ
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 >= 0) goto L67
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L67
            return
        L82:
            long r0 = r8.LJIIJ
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L9c
            long r0 = r8.LJ
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L9c
            java.util.List<X.0m7N> r0 = r8.LJIIIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9c
            r8.LIZJ(r4, r10, r9)
            return
        L9c:
            long r2 = r8.LJIIL
            long r0 = r8.LJIIJ
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 > 0) goto L3d
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L3d
            r8.LIZJ(r0, r10, r9)
            return
        Lac:
            r1 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.core.DanmakuViewModel.LQ2(long):void");
    }

    public final void vQ2(VideoItemParams videoItemParams) {
        C1383900m7I c1383900m7I;
        this.LLILLJJLI = new C1383870m7F(videoItemParams.getAweme(), DanmakuApi.LIZ, videoItemParams.mEventType);
        videoItemParams.getAweme().getAid();
        this.LLILZIL = new C1383850m7D(0);
        C1383900m7I c1383900m7I2 = this.LLIZLLLIL;
        if (c1383900m7I2 != null) {
            c1383900m7I2.LIZIZ();
        }
        C1383870m7F c1383870m7F = this.LLILLJJLI;
        if (c1383870m7F != null) {
            c1383900m7I = new C1383900m7I(this.eventType, c1383870m7F);
        } else {
            c1383900m7I = null;
        }
        this.LLIZLLLIL = c1383900m7I;
    }

    public final IDanmakuData zQ2(String str) {
        IDanmakuData next;
        C1383870m7F c1383870m7F = this.LLILLJJLI;
        if (c1383870m7F != null) {
            Iterator it2 = ((ArrayList) c1383870m7F.LJII).iterator();
            while (it2.hasNext()) {
                Iterator<IDanmakuData> it3 = ((C1383960m7O) it2.next()).LIZJ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(next.x1(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                IDanmakuData iDanmakuData = next;
                if (iDanmakuData != null) {
                    return iDanmakuData;
                }
            }
        }
        return null;
    }

    public static void JQ2(IDanmakuData iDanmakuData, C1384240m7q c1384240m7q) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(iDanmakuData, "currentAlpha", 0.6f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.addListener(c1384240m7q);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static void KQ2(IDanmakuData iDanmakuData, C1384240m7q c1384240m7q) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(iDanmakuData, "currentAlpha", 1.0f, 0.6f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.addListener(c1384240m7q);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BQ2(long r14, boolean r16) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.core.DanmakuViewModel.BQ2(long, boolean):void");
    }

    public final void wQ2(float f, int i) {
        String aid;
        String string;
        C1383900m7I c1383900m7I = this.LLIZLLLIL;
        if (c1383900m7I != null) {
            c1383900m7I.LJIIIZ += (double) f;
            c1383900m7I.LJIIJ++;
            c1383900m7I.LIZLLL = i;
            c1383900m7I.LIZJ = f;
            Aweme aweme = c1383900m7I.LJIIL;
            if (aweme != null && (aid = aweme.getAid()) != null) {
                C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
                c1383760m74.LJJIJ(aid, c1383900m7I.toString());
                C1396730mRz c1396730mRz = BitmapCacheManager.LJ.get(BitmapCacheManager.LIZLLL);
                if (c1396730mRz == null || (string = c1396730mRz.toString()) == null) {
                    string = "null";
                }
                c1383760m74.LJJ(string);
            }
        }
    }

    public final void xQ2(IDanmakuData iDanmakuData, EnumC255700yp enumC255700yp) {
        Aweme aweme;
        String str;
        C1361150lWb c1361150lWb = C1361150lWb.LIZ;
        VideoItemParams item = getItem();
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        VideoItemParams item2 = getItem();
        String str2 = "";
        if (item2 == null || (str = item2.mEventType) == null) {
            str = "";
        }
        String strX1 = iDanmakuData.x1();
        if (strX1 != null) {
            str2 = strX1;
        }
        boolean zLJFF = Intrinsics.LJFF(iDanmakuData.v1(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String value = EnumC1361130lWZ.VIDEO_PLAYBACK.getValue();
        c1361150lWb.getClass();
        C1361150lWb.LJI(new DeleteDanmakuEvent(), Collections.singletonList(new C00I8(str2, zLJFF ? 1 : 0, value, enumC255700yp.getValue())), aweme, C0SXF.LJJIFFI(null, Boolean.FALSE, str));
        C1383870m7F c1383870m7F = this.LLILLJJLI;
        if (c1383870m7F != null) {
            c1383870m7F.LIZIZ(iDanmakuData, new InterfaceC1383970m7P() { // from class: X.0m7M
                @Override // X.InterfaceC1383970m7P
                public final void onFail() {
                }

                @Override // X.InterfaceC1383970m7P
                public final void onSuccess() {
                }
            });
        }
    }

    public final void GQ2(float f, float f2, int i) {
        Integer num;
        C1383900m7I c1383900m7I = this.LLIZLLLIL;
        if (c1383900m7I != null) {
            c1383900m7I.LJII += (double) f;
            c1383900m7I.LJIIIIZZ++;
            if (i > c1383900m7I.LJIIJJI) {
                c1383900m7I.LJIIJJI = i;
            }
            c1383900m7I.LIZIZ = i;
            c1383900m7I.LJFF = f;
            c1383900m7I.LJ = f2;
            if (!c1383900m7I.LJIJ && i > 0 && (num = c1383900m7I.LJIIZILJ) != null && num.intValue() == c1383900m7I.LJIIIIZZ) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1383890m7H(c1383900m7I, null), 2);
                InterfaceC1602960roc interfaceC1602960roc = (InterfaceC1602960roc) c1383900m7I.LJIJI.getValue();
                interfaceC1602960roc.LIZ("danmaku_count_on_screen", String.valueOf(c1383900m7I.LIZIZ));
                interfaceC1602960roc.LJI();
                c1383900m7I.LJIJ = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CQ2(boolean r19, boolean r20, java.lang.String r21, X.EnumC255700yp r22) {
        /*
            r18 = this;
            r16 = r22
            r0 = r18
            boolean r1 = r0.LLIZ
            if (r1 != 0) goto Lb
            if (r20 != 0) goto Lb
            return
        Lb:
            X.0m7D r1 = r0.LLILZIL
            r7 = 0
            if (r1 == 0) goto L88
            java.util.List<java.lang.String> r1 = r1.LJ
            int r2 = r1.size()
            if (r2 <= 0) goto L88
            if (r19 != 0) goto L1f
            r1 = 100
            if (r2 >= r1) goto L1f
            return
        L1f:
            X.0lWb r2 = X.C1361150lWb.LIZ
            java.lang.Object r1 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r1
            if (r1 == 0) goto L86
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r1.getAweme()
        L2d:
            if (r21 != 0) goto L83
            java.lang.Object r1 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r1
            if (r1 == 0) goto L3b
            java.lang.String r12 = r1.mEventType
            if (r12 != 0) goto L3d
        L3b:
            java.lang.String r12 = ""
        L3d:
            X.0m7D r1 = r0.LLILZIL
            if (r1 == 0) goto L81
            int r13 = r1.LIZJ
            java.util.List<java.lang.String> r3 = r1.LJ
            if (r3 != 0) goto L49
        L47:
            X.13BV r3 = X.C13BV.INSTANCE
        L49:
            java.lang.String r4 = ","
            java.lang.String r5 = "["
            java.lang.String r6 = "]"
            r8 = 0
            r1 = 143(0x8f, float:2.0E-43)
            kotlin.jvm.internal.AFwS259S0000000_21 r9 = kotlin.jvm.internal.AFwS259S0000000_21.get$arr$(r1)
            r10 = 24
            java.lang.String r14 = X.C13LP.LJJLIIIJ(r3, r4, r5, r6, r7, r8, r9, r10)
            X.0lWZ r1 = X.EnumC1361130lWZ.VIDEO_PLAYBACK
            java.lang.String r15 = r1.getValue()
            if (r16 != 0) goto L68
            X.00yp r16 = r0.AQ2()
        L68:
            if (r21 == 0) goto L7e
            r17 = 1
        L6c:
            r2.getClass()
            X.C1361150lWb.LJ(r11, r12, r13, r14, r15, r16, r17)
            X.0m7D r0 = r0.LLILZIL
            if (r0 == 0) goto L7d
            r0.LIZJ = r7
            java.util.List<java.lang.String> r0 = r0.LJ
            r0.clear()
        L7d:
            return
        L7e:
            r17 = 0
            goto L6c
        L81:
            r13 = 0
            goto L47
        L83:
            r12 = r21
            goto L3d
        L86:
            r11 = 0
            goto L2d
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.core.DanmakuViewModel.CQ2(boolean, boolean, java.lang.String, X.00yp):void");
    }
}
