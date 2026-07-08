package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AnonymousClass0956;
import X.C01GW;
import X.C118300cf;
import X.C1350920lG6;
import X.C1353500lKG;
import X.C13LE;
import X.C13LP;
import X.C1602160rnK;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452140HoC;
import X.C452200HoI;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C462900IDg;
import X.C726120Se2;
import X.C729510SjV;
import X.C735840Sti;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS75S0200000_6;
import Y.AsS28S0200000_6;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TypingStickerRecommendAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public boolean LLJJI;
    public C452140HoC LLJJIII;
    public C1353500lKG LLJJIJI;
    public AnonymousClass0956 LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C462900IDg LLJJJ = new C462900IDg(this, 0);
    public final C01GW LLJJJIL;
    public final C726120Se2 LLJJJJ;
    public final C01GW LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TypingStickerRecommendAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TypingStickerRecommendAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 48));
        this.LLJJJJ = new C726120Se2();
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 56));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a5_;
    }

    public final void hp() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJIIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIJIIJIL = null;
    }

    public final CommentContextSource kp() {
        C726120Se2 c726120Se2 = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return c726120Se2.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            c1353500lKG.removeTextChangedListener(this.LLJJJ);
        }
        hp();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[PHI: r0
      0x002d: PHI (r0v6 java.lang.String) = (r0v5 java.lang.String), (r0v8 java.lang.String) binds: [B:8:0x0021, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C452200HoI ip(java.util.List r6) {
        /*
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Iterator r3 = r6.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.im.common.model.StickerItem r0 = (com.ss.android.ugc.aweme.im.common.model.StickerItem) r0
            com.ss.android.ugc.aweme.im.common.model.StickerBase r2 = r0.stickerBase
            r1 = 0
            if (r2 == 0) goto L34
            java.lang.String r0 = r2.thirdPartyStickerId
            if (r0 != 0) goto L2d
            java.lang.Long r0 = r2.id
            if (r0 == 0) goto L32
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L30
        L2d:
            r5.add(r0)
        L30:
            if (r2 == 0) goto L34
        L32:
            java.lang.Integer r1 = r2.stickerType
        L34:
            java.lang.String r1 = X.C454000HrC.LJIIIIZZ(r1)
            int r0 = r1.length()
            if (r0 <= 0) goto Le
            r4.add(r1)
            goto Le
        L42:
            X.0HoI r0 = new X.0HoI
            r0.<init>(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.TypingStickerRecommendAssem.ip(java.util.List):X.0HoI");
    }

    public final void lp(String str) {
        List<StickerItem> data;
        Aweme aweme;
        String strEnterFrom;
        String strEnterMethod;
        String aid;
        String authorUid;
        String str2;
        String str3;
        AwemeStatistics statistics;
        C452140HoC c452140HoC = this.LLJJIII;
        if (c452140HoC != null && (data = c452140HoC.getData()) != null && (!data.isEmpty())) {
            C452200HoI c452200HoIIp = ip(data);
            Set<String> set = c452200HoIIp.LIZ;
            Set<String> set2 = c452200HoIIp.LIZIZ;
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp = kp();
            if (commentContextSourceKp != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceKp2 = kp();
            if (commentContextSourceKp2 != null) {
                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceKp2);
            } else {
                strEnterFrom = null;
            }
            CommentContextSource commentContextSourceKp3 = kp();
            if (commentContextSourceKp3 != null) {
                strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceKp3);
            } else {
                strEnterMethod = null;
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(set2, ",", null, null, 0, null, null, 62);
            User author = null;
            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62);
            c1350920lG6.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("event_module", "sticker");
            c2344009Gk.LJFF("event_page", strEnterFrom);
            c2344009Gk.LJFF("enter_from", strEnterFrom);
            c2344009Gk.LJFF("enter_method", strEnterMethod);
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJFF("group_id", aid);
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            c2344009Gk.LJFF("author_id", authorUid);
            C735840Sti c735840Sti = C735840Sti.LIZ;
            if (aweme != null) {
                author = aweme.getAuthor();
            }
            c735840Sti.getClass();
            c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
            if (C729510SjV.LJJIJIL(aweme)) {
                str2 = "story";
            } else {
                str2 = "post";
            }
            c2344009Gk.LJFF("story_type", str2);
            if (aweme != null && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() > 0) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str3 = "1";
            }
            c2344009Gk.LJFF("is_zero_comment", str3);
            c2344009Gk.LJFF("sticker_type", strLJJLIIIJ);
            c2344009Gk.LJFF("sticker_id", strLJJLIIIJ2);
            c2344009Gk.LJFF("direction", str);
            C1350920lG6.LJJJ(c2344009Gk, "ttinter_comment_input_rec_panel_slide");
        }
    }

    public final void mp(boolean z) {
        if (z && !this.LLJJI) {
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof View) && viewLJJIJL != null) {
                C786410Ut5.LJLLLLLL(0, viewLJJIJL);
            }
            C452140HoC c452140HoC = this.LLJJIII;
            if (c452140HoC != null) {
                ARunnableS106S0100000_6 aRunnableS106S0100000_6 = new ARunnableS106S0100000_6(this, 36);
                if (!c452140HoC.LLILZ) {
                    c452140HoC.LLILZ = true;
                    c452140HoC.animate().cancel();
                    int visibility = c452140HoC.getVisibility();
                    c452140HoC.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c452140HoC);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c452140HoC);
                    c452140HoC.setAlpha(0.0f);
                    c452140HoC.animate().alpha(1.0f).setDuration(200L).withStartAction(new ARunnableS103S0100000_3((Object) aRunnableS106S0100000_6, 136)).start();
                    return;
                }
                return;
            }
            return;
        }
        C452140HoC c452140HoC2 = this.LLJJIII;
        if (c452140HoC2 == null) {
            return;
        }
        ARunnableS106S0100000_6 aRunnableS106S0100000_62 = new ARunnableS106S0100000_6(this, 37);
        if (!c452140HoC2.LLILZ) {
            c452140HoC2.LL.getState().LJFF(null);
            return;
        }
        c452140HoC2.LLILZ = false;
        c452140HoC2.animate().cancel();
        c452140HoC2.animate().alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS75S0200000_6(c452140HoC2, aRunnableS106S0100000_62, 125)).start();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C452140HoC c452140HoC = (C452140HoC) view.findViewById(R.id.typing_sticker_recommend_view);
        this.LLJJIII = c452140HoC;
        if (c452140HoC != null) {
            int visibility = c452140HoC.getVisibility();
            c452140HoC.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c452140HoC);
            c452140HoC.setOnStickerClickListener(new AwS620S0100000_6(this, 11));
            c452140HoC.LL.addOnScrollListener(new AsS28S0200000_6(this, new C118300cf(), 0));
        }
        HandlerHook.viewPost(view, new ARunnableS75S0200000_6(view, this, 23));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJIL.getValue(), new C2217381BqS() { // from class: X.0Ht6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 12), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJIL.getValue(), new C2217381BqS() { // from class: X.0Ht3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJLL);
            }
        }, null, new AwS620S0100000_6(this, 13), 6);
    }
}
