package com.ss.android.ugc.aweme.comment.photocomment;

import X.AbstractC468201s0;
import X.C0H9H;
import X.C0HJ0;
import X.C0HJ4;
import X.C1206770hVb;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1340010kyV;
import X.C1344550l5p;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1875607Wg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C294290BgB;
import X.C294410BgN;
import X.C376380EpI;
import X.C418440Gaw;
import X.C438710HIf;
import X.C444960Hcc;
import X.C473380IhM;
import X.C724240Sb0;
import X.C726120Se2;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewTreeObserverOnPreDrawListenerC462850IDb;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS54S0300000_21;
import Y.AUListenerS265S0100000_16;
import Y.AUListenerS270S0100000_21;
import Y.AfS190S0100000_21;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerCommentTextAssem;
import com.ss.android.ugc.aweme.comment.photocomment.MaskHeightChangeAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentInnerCommentTextAssem extends ReusedUIContentAssem<CommentInnerCommentTextAssem> implements InterfaceC712990Rxx<C1875607Wg> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public C0HJ0 LLJJJJ;
    public ScrollView LLJJJJJIL;
    public ConstraintLayout LLJJJJLIIL;
    public ScrollView LLJJL;
    public C0HJ0 LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public ScrollView LLJLIL;
    public C0HJ0 LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public C376380EpI LLJLLIL;
    public final C726120Se2 LLJLLL = new C726120Se2();
    public boolean LLJZ;
    public Comment LLJZIJLIL;
    public View LLL;
    public View LLLF;
    public View LLLFF;
    public View LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentInnerCommentTextAssem.class, "source", "getSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public static void hp(Comment comment) {
        C1350920lG6.LIZ.getClass();
        if (comment != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(1, "is_internal_image_comment");
            c2344009Gk.LIZJ(C1351950lHl.LJIILL(comment), "comment_level");
            C1350920lG6.LJJJ(c2344009Gk, "click_more_comment");
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C376380EpI c376380EpI;
        this.LLJJJJ = (C0HJ0) view.findViewById(R.id.edy);
        this.LLJJJJJIL = (ScrollView) view.findViewById(R.id.edz);
        this.LLJJJJLIIL = (ConstraintLayout) view.findViewById(R.id.ee0);
        this.LLJJL = (ScrollView) view.findViewById(R.id.ee1);
        this.LLJLIL = (ScrollView) view.findViewById(R.id.ee2);
        this.LLJJLIIIJLLLLLLLZ = (C0HJ0) view.findViewById(R.id.ee3);
        this.LLJLILLLLZIIL = (C0HJ0) view.findViewById(R.id.ee5);
        this.LLJL = (TuxTextView) view.findViewById(R.id.hfs);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.hft);
        this.LLJLLIL = (C376380EpI) view.findViewById(R.id.we6);
        if (C444960Hcc.LIZIZ() && (c376380EpI = this.LLJLLIL) != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c376380EpI);
            c376380EpI.setScaleX(-1.0f);
        }
        if (C294410BgN.LIZIZ()) {
            ScrollView scrollView = this.LLJJJJJIL;
            if (scrollView != null) {
                C786410Ut5.LLIILII(scrollView, 8);
            }
            ConstraintLayout constraintLayout = this.LLJJJJLIIL;
            if (constraintLayout != null) {
                C786410Ut5.LL(0, constraintLayout);
            }
            LJJIJL().setBackgroundResource(R.drawable.ae8);
            C1206770hVb.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)), LJJIJL());
        } else {
            ScrollView scrollView2 = this.LLJJJJJIL;
            if (scrollView2 != null) {
                C786410Ut5.LLIILII(scrollView2, 0);
            }
            ConstraintLayout constraintLayout2 = this.LLJJJJLIIL;
            if (constraintLayout2 != null) {
                C786410Ut5.LL(8, constraintLayout2);
            }
            C1206770hVb.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)), LJJIJL());
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1344550l5p.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZ(new AfS190S0100000_21(this, 8));
        }
        if (C294410BgN.LIZIZ()) {
            this.LLL = view.findViewById(R.id.gbe);
            this.LLLF = view.findViewById(R.id.gbd);
            this.LLLFF = view.findViewById(R.id.gbi);
            this.LLLFFI = view.findViewById(R.id.gbh);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1875607Wg c1875607Wg) throws Throwable {
        ScrollView scrollView;
        C1875607Wg c1875607Wg2 = c1875607Wg;
        ScrollView scrollView2 = this.LLJJJJJIL;
        if (scrollView2 != null) {
            C1351950lHl.LJIJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)), scrollView2);
        }
        if (!C294290BgB.LIZJ() && ((Number) C473380IhM.LIZ(C724240Sb0.LIZ(this)).getFirst()).intValue() <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360)) && (scrollView = this.LLJJJJJIL) != null) {
            C1351950lHl.LJIL(scrollView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280)));
        }
        if (C294410BgN.LIZIZ()) {
            View view = this.LLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LLLF;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            View view3 = this.LLLFF;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            View view4 = this.LLLFFI;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            ep(c1875607Wg2.LL, this.LLJJLIIIJLLLLLLLZ, this.LLJJL, true);
            ScrollView scrollView3 = this.LLJLIL;
            if (scrollView3 != null) {
                C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), scrollView3);
            }
            Comment commentLIZ = C1340010kyV.LIZ(c1875607Wg2.LL.getReplyComments());
            if (c1875607Wg2.LL.getCommentType() == 1 && commentLIZ != null) {
                ScrollView scrollView4 = this.LLJLIL;
                if (scrollView4 != null) {
                    C786410Ut5.LLIILII(scrollView4, 0);
                }
                ScrollView scrollView5 = this.LLJLIL;
                if (scrollView5 != null) {
                    C1351950lHl.LJIJI(-2, scrollView5);
                }
                C0HJ0 c0hj0 = this.LLJLILLLLZIIL;
                if (c0hj0 != null) {
                    int visibility = c0hj0.getVisibility();
                    c0hj0.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c0hj0);
                }
                this.LLJZIJLIL = commentLIZ;
                ep(commentLIZ, this.LLJLILLLLZIIL, this.LLJLIL, true);
                C376380EpI c376380EpI = this.LLJLLIL;
                if (c376380EpI != null) {
                    int visibility2 = c376380EpI.getVisibility();
                    c376380EpI.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, c376380EpI);
                }
                ScrollView scrollView6 = this.LLJJL;
                if (scrollView6 != null) {
                    C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), scrollView6);
                }
                TuxTextView tuxTextView = this.LLJL;
                if (tuxTextView != null) {
                    C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), tuxTextView);
                    return;
                }
                return;
            }
            C376380EpI c376380EpI2 = this.LLJLLIL;
            if (c376380EpI2 != null) {
                int visibility3 = c376380EpI2.getVisibility();
                c376380EpI2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility3, 8, c376380EpI2);
            }
            ScrollView scrollView7 = this.LLJLIL;
            if (scrollView7 != null) {
                C786410Ut5.LLIILII(scrollView7, 4);
            }
            C0HJ0 c0hj02 = this.LLJLILLLLZIIL;
            if (c0hj02 != null) {
                int visibility4 = c0hj02.getVisibility();
                c0hj02.setVisibility(8);
                C1602160rnK.LIZIZ(visibility4, 8, c0hj02);
            }
            ScrollView scrollView8 = this.LLJLIL;
            if (scrollView8 != null) {
                C1351950lHl.LJIJI(0, scrollView8);
            }
            ScrollView scrollView9 = this.LLJJL;
            if (scrollView9 != null) {
                C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), scrollView9);
            }
            TuxTextView tuxTextView2 = this.LLJL;
            if (tuxTextView2 == null) {
                return;
            }
            C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), tuxTextView2);
            return;
        }
        ep(c1875607Wg2.LL, this.LLJJJJ, this.LLJJJJJIL, false);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1875607Wg c1875607Wg) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1875607Wg c1875607Wg) {
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip(java.lang.String r7, java.lang.String r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.photocomment.CommentInnerCommentTextAssem.ip(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(java.lang.String r7, java.lang.String r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.photocomment.CommentInnerCommentTextAssem.kp(java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) throws Throwable {
        up(interfaceC1587906Jp);
    }

    public static void cp(int i, int i2, View view) {
        if (view == null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(view, 16));
        valueAnimatorOfInt.start();
    }

    public static void dp(int i, int i2, View view) {
        if (view == null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(view, 6));
        valueAnimatorOfInt.start();
    }

    public static void lp(Integer num, View view, C0HJ0 c0hj0, boolean z) {
        int iLIZIZ;
        ViewGroup.LayoutParams layoutParams;
        if (C294290BgB.LIZJ()) {
            if (num != null) {
                if (new IntRange(1, 3).LJLJL(num.intValue())) {
                    if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.height != -2) {
                        layoutParams.height = -2;
                        C786410Ut5.W5(view, layoutParams);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } else if (num == null) {
            return;
        }
        if (num.intValue() != 0) {
            int height = 0;
            if (num.intValue() == 1) {
                int i = 29;
                if (z) {
                    if (view != null) {
                        height = view.getHeight();
                    }
                    cp(height, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(29)), view);
                    return;
                } else {
                    if (C294410BgN.LIZIZ()) {
                        i = 19;
                    }
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                    if (view == null) {
                        return;
                    }
                    C1351950lHl.LJIJI(iLIZIZ2, view);
                    return;
                }
            }
            if (num.intValue() == 2) {
                if (z) {
                    if (view != null) {
                        height = view.getHeight();
                    }
                    cp(height, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), view);
                    return;
                } else {
                    if (view == null) {
                        return;
                    }
                    C1351950lHl.LJIJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), view);
                    return;
                }
            }
            if (num.intValue() == 3) {
                if (z) {
                    if (view != null) {
                        height = view.getHeight();
                    }
                    cp(height, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), view);
                    return;
                } else {
                    if (view == null) {
                        return;
                    }
                    C1351950lHl.LJIJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), view);
                    return;
                }
            }
            if (z) {
                Layout layout = c0hj0.getLayout();
                if (layout != null) {
                    iLIZIZ = layout.getHeight();
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(87));
                }
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(126));
                if (iLIZIZ > iLIZIZ3) {
                    iLIZIZ = iLIZIZ3;
                }
                if (view != null) {
                    height = view.getHeight();
                }
                cp(height, iLIZIZ, view);
                return;
            }
            if (view == null) {
                return;
            }
            C1351950lHl.LJIJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(87)), view);
        }
    }

    public final void ep(final Comment comment, final C0HJ0 c0hj0, final View view, final boolean z) throws Throwable {
        Resources resources;
        UrlModel avatarThumb = comment.getUser().getAvatarThumb();
        Context context = getContext();
        if (context != null) {
            resources = context.getResources();
        } else {
            resources = null;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, R.drawable.c5w);
        if (bitmapDecodeResource != null) {
            mp(comment, bitmapDecodeResource, c0hj0, view, z);
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJIIIIZZ.LJJII(new AbstractC468201s0() { // from class: X.0lHJ
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) throws Throwable {
                if (bitmap == null) {
                    return;
                }
                this.LL.mp(comment, bitmap, c0hj0, view, z);
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                if (th != null) {
                    th.getStackTrace();
                }
            }
        });
    }

    public final void mp(Comment comment, Bitmap bitmap, final C0HJ0 c0hj0, final View view, final boolean z) throws Throwable {
        String authorUid;
        Resources resources;
        ImageSpan imageSpan;
        Resources resources2;
        String string;
        int iLIZIZ;
        int iLIZIZ2;
        String text = comment.getText();
        User user = comment.getUser();
        String uid = comment.getUser().getUid();
        C726120Se2 c726120Se2 = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        Aweme aweme = CommentContextSourceKt.aweme(c726120Se2.LIZ(this));
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        boolean zLJFF = Intrinsics.LJFF(uid, authorUid);
        if (C294410BgN.LIZIZ()) {
            int iIntValue = ((Number) C473380IhM.LIZ(C724240Sb0.LIZ(this)).getFirst()).intValue();
            View viewFindViewById = LJJIJL().findViewById(R.id.mo1);
            if (viewFindViewById != null) {
                iLIZIZ = viewFindViewById.getWidth();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
            }
            View viewFindViewById2 = LJJIJL().findViewById(R.id.mo3);
            if (viewFindViewById2 != null) {
                iLIZIZ2 = viewFindViewById2.getWidth();
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
            }
            if (iLIZIZ < iLIZIZ2) {
                iLIZIZ = iLIZIZ2;
            }
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
            if (iLIZIZ < iLIZIZ3) {
                iLIZIZ = iLIZIZ3;
            }
            ScrollView scrollView = this.LLJJJJJIL;
            if (scrollView != null) {
                C1351950lHl.LJIL(scrollView, (iIntValue - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45)));
            }
            ScrollView scrollView2 = this.LLJJL;
            if (scrollView2 != null) {
                C1351950lHl.LJIL(scrollView2, (iIntValue - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45)));
            }
            ScrollView scrollView3 = this.LLJLIL;
            if (scrollView3 != null) {
                C1351950lHl.LJIL(scrollView3, (iIntValue - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(75)));
            }
        }
        LJJIJL().getContext();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        canvas.drawOval(rectF, paint);
        Context context = getContext();
        if (context != null) {
            resources = context.getResources();
        } else {
            resources = null;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap);
        bitmapDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        if (Build.VERSION.SDK_INT >= 29) {
            imageSpan = new ImageSpan(bitmapDrawable, 2);
        } else {
            imageSpan = new ImageSpan(bitmapDrawable);
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1k, LJJIJL().getContext()));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C960203pA.LIZ(R.attr.a0d, LJJIJL().getContext()));
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(C960203pA.LIZ(R.attr.u_, LJJIJL().getContext()));
        String nickname = user.getNickname();
        String str = "";
        if (nickname == null) {
            nickname = "";
        }
        Context context2 = getContext();
        if (context2 != null && (resources2 = context2.getResources()) != null && (string = resources2.getString(2131826820)) != null) {
            str = string;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("  ");
        sbLIZ.append(nickname);
        spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.q2(spannableStringBuilder, imageSpan, 0, 1, 33);
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, 1, nickname.length() + 2, 33);
        if (C294410BgN.LIZIZ() && zLJFF) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((char) 183);
            sbLIZ2.append(str);
            spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan2, nickname.length() + 3, spannableStringBuilder.length(), 34);
        }
        if (C123100dR.LIZ(text)) {
            int length = spannableStringBuilder.length();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(": ");
            sbLIZ3.append(text);
            spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ3));
            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan3, length, spannableStringBuilder.length(), 34);
        }
        if (c0hj0 != null) {
            C0HJ4 c0hj4 = new C0HJ4() { // from class: X.0lGl
                @Override // X.C0HJ4
                public final void LIZ() {
                    C1350920lG6.LJJLIIIJILLIZJL(((C1875607Wg) C631370Opb.LIZ(this.LIZ)).LL, -1, -1, null, null, null, true, 0, 128);
                    CommentInnerCommentTextAssem commentInnerCommentTextAssem = this.LIZ;
                    C0HJ0 c0hj02 = c0hj0;
                    Integer numValueOf = c0hj02 != null ? Integer.valueOf(c0hj02.getLineCount()) : null;
                    View view2 = view;
                    C0HJ0 c0hj03 = c0hj0;
                    boolean z2 = z;
                    commentInnerCommentTextAssem.getClass();
                    CommentInnerCommentTextAssem.lp(numValueOf, view2, c0hj03, z2);
                    MaskHeightChangeAbility maskHeightChangeAbility = (MaskHeightChangeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), MaskHeightChangeAbility.class, null);
                    if (maskHeightChangeAbility != null) {
                        maskHeightChangeAbility.da1(true);
                    }
                }

                @Override // X.C0HJ4
                public final void LIZIZ() {
                    CommentInnerCommentTextAssem commentInnerCommentTextAssem = this.LIZ;
                    C0HJ0 c0hj02 = c0hj0;
                    Integer numValueOf = c0hj02 != null ? Integer.valueOf(c0hj02.getLineCount()) : null;
                    View view2 = view;
                    C0HJ0 c0hj03 = c0hj0;
                    boolean z2 = z;
                    commentInnerCommentTextAssem.getClass();
                    CommentInnerCommentTextAssem.lp(numValueOf, view2, c0hj03, z2);
                    MaskHeightChangeAbility maskHeightChangeAbility = (MaskHeightChangeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), MaskHeightChangeAbility.class, null);
                    if (maskHeightChangeAbility != null) {
                        maskHeightChangeAbility.da1(false);
                    }
                }
            };
            if (spannableStringBuilder.length() != 0) {
                c0hj0.LLJLL = false;
                c0hj0.setMovementMethod(LinkMovementMethod.getInstance());
                c0hj0.setMaxLines(2);
                c0hj0.LLJJJJLIIL = spannableStringBuilder;
                c0hj0.LLJJL = c0hj4;
                C786410Ut5.y3(c0hj0.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC462850IDb(c0hj0, 4));
                c0hj0.LJJJJLL();
            }
            HandlerHook.viewPost(c0hj0, new ARunnableS54S0300000_21(this, c0hj0, view, 4));
        }
        if (z && view != null) {
            HandlerHook.viewPost(view, new ARunnableS121S0100000_21(this, 47));
        }
    }
}
