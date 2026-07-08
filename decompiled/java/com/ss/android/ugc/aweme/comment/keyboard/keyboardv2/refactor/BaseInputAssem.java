package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0HD5;
import X.C0WZX;
import X.C0XQ7;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1344030l4z;
import X.C1345700l7g;
import X.C1346480l8w;
import X.C1346580l96;
import X.C1346810l9T;
import X.C1347610lAl;
import X.C1347720lAw;
import X.C1347850lB9;
import X.C1348690lCV;
import X.C1350650lFf;
import X.C1350920lG6;
import X.C1353500lKG;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C19EG;
import X.C19ME;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C276180As4;
import X.C286040BJa;
import X.C384050F3z;
import X.C427870Gq9;
import X.C438710HIf;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C459990I2b;
import X.C724240Sb0;
import X.C726120Se2;
import X.C786410Ut5;
import X.C844470XAv;
import X.C866950Xzh;
import X.EnumC1346360l8k;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.CommentDetailBottomEmojiExp;
import com.ss.android.ugc.aweme.comment.experiment.CommentQuickInputIconGroupConfig;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentPublishViewModelAbility;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class BaseInputAssem extends UISlotAssem implements ICommentPageReusedProtocol, IKeyboardEditAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public C427870Gq9 LLJJIII;
    public C1353500lKG LLJJIJI;
    public LinearLayout LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public TuxIconView LLJJJ;
    public TuxIconView LLJJJIL;
    public TuxIconView LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public ImageView LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public C459990I2b LLJLLIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 125));
    public final C726120Se2 LLJJJJLIIL = new C726120Se2();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseInputAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BaseInputAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        C452230HoL c452230HoL = new C452230HoL(c19719912DlLIZ);
        C452250HoN c452250HoN = new C452250HoN();
        this.LLJLIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, c1637906bB, c452230HoL, c452250HoN, (Function0) null, 18));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommentPublishViewModel.class);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ2, c1637906bB, new C452230HoL(c19719912DlLIZ2), c452250HoN, (Function0) null, 20));
        this.LLJLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 126));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.a1m;
    }

    public final void Gp() {
        TuxIconView tuxIconView = this.LLJJIJIL;
        if (tuxIconView != null) {
            C786410Ut5.LJLLLLLL(C1345700l7g.LJI(kp()) ? 0 : 8, tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLJJIJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.x5(tuxIconView2, 1.0f);
        }
        TuxIconView tuxIconView3 = this.LLJJIJIL;
        if (tuxIconView3 != null) {
            tuxIconView3.setEnabled(true);
        }
        TuxIconView tuxIconView4 = this.LLJJIJIL;
        if (tuxIconView4 == null || tuxIconView4.getVisibility() != 0) {
            return;
        }
        String strEnterFrom = CommentContextSourceKt.enterFrom(kp());
        Aweme aweme = CommentContextSourceKt.aweme(kp());
        Aweme aweme2 = CommentContextSourceKt.aweme(kp());
        C1350920lG6.LLFZ(strEnterFrom, aweme, false, aweme2 != null ? C1347720lAw.LIZ(aweme2) : null);
    }

    public final boolean hp() {
        C1350650lFf.LIZ.getClass();
        return !isLandscapeMode();
    }

    public final CommentContextSource kp() {
        C726120Se2 c726120Se2 = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return c726120Se2.LIZ(this);
    }

    public final C1346810l9T lp() {
        return (C1346810l9T) this.LLJJI.getValue();
    }

    public final IKeyboardV2Ability op() {
        return (IKeyboardV2Ability) this.LLJLL.getValue();
    }

    public final KeyboardVMV2 sp() {
        return (KeyboardVMV2) this.LLJLIL.getValue();
    }

    public final CommentPublishViewModel tp() {
        return (CommentPublishViewModel) this.LLJLILLLLZIIL.getValue();
    }

    public final void yp() {
        C427870Gq9 c427870Gq9 = this.LLJJIII;
        if (c427870Gq9 != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(C0XQ7.LJFF().getCurUser().getAvatarThumb()));
            c1331670kl3LJIIIIZZ.LJJ(c427870Gq9);
            c1331670kl3LJIIIIZZ.LJIIJJI();
        }
    }

    public boolean zp() {
        Aweme aweme;
        if (!(this instanceof DetailBottomFakeInput)) {
            return false;
        }
        CommentDetailBottomEmojiExp commentDetailBottomEmojiExp = CommentDetailBottomEmojiExp.LIZ;
        CommentContextSource commentContextSourceKp = kp();
        String aid = (commentContextSourceKp == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceKp)) == null) ? null : aweme.getAid();
        commentDetailBottomEmojiExp.getClass();
        return CommentDetailBottomEmojiExp.LIZJ(aid) && ip() && !Ap();
    }

    public final boolean Ap() {
        boolean zLIZIZ;
        Aweme aweme;
        Aweme aweme2;
        CommentContextSource commentContextSourceKp = kp();
        String aid = null;
        String aid2 = (commentContextSourceKp == null || (aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp)) == null) ? null : aweme2.getAid();
        if (aid2 == null || aid2.length() == 0) {
            return false;
        }
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(aid2);
        if (C1345700l7g.LJIIIZ(awemeLLILZ != null ? awemeLLILZ.getAuthor() : null)) {
            return false;
        }
        if (awemeLLILZ != null) {
            CommentDetailBottomEmojiExp.LIZ.getClass();
            zLIZIZ = CommentDetailBottomEmojiExp.LIZIZ(awemeLLILZ);
        } else {
            zLIZIZ = false;
        }
        if (((CommentQuickInputIconGroupConfig) C1347850lB9.LIZIZ.getValue()).enableInNotFriendOtherFeedPage != 1) {
            return false;
        }
        if (zLIZIZ) {
            if (((Number) C286040BJa.LIZ.getValue()).intValue() != 2) {
                return false;
            }
            CommentDetailBottomEmojiExp commentDetailBottomEmojiExp = CommentDetailBottomEmojiExp.LIZ;
            CommentContextSource commentContextSourceKp2 = kp();
            if (commentContextSourceKp2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceKp2)) != null) {
                aid = aweme.getAid();
            }
            commentDetailBottomEmojiExp.getClass();
            if (CommentDetailBottomEmojiExp.LIZJ(aid)) {
                return false;
            }
        }
        return (this instanceof DetailBottomFakeInput) && ip();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Fp() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.setting.services.IVideoGiftService r2 = com.ss.android.ugc.aweme.setting.services.VideoGiftService.LJI()
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.kp()
            r1 = 0
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)
        Lf:
            boolean r0 = r2.LIZ(r0)
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L9e
            X.0lG9 r0 = X.C1350950lG9.LIZIZ
            boolean r0 = r0.LIZLLL()
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.kp()
            if (r0 == 0) goto L9c
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r0.getKeyboardModel()
            if (r0 == 0) goto L9c
            boolean r0 = r0.getEnableGiftScene()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L33:
            boolean r0 = X.C1346420l8q.LIZ(r0)
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2 r0 = r4.sp()
            X.002o r0 = r0.getState()
            X.0l9h r0 = (X.C1346950l9h) r0
            X.0l8w r0 = r0.LLILZIL
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.LIZ
            if (r0 != 0) goto L9e
        L4b:
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.kp()
            if (r0 == 0) goto L9a
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r0.getKeyboardModel()
            if (r0 == 0) goto L9a
            boolean r0 = r0.isLandscapeMode()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L5f:
            boolean r0 = X.C1346420l8q.LIZ(r0)
            if (r0 != 0) goto L9e
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.kp()
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r0.getKeyboardModel()
            if (r0 == 0) goto L75
            java.lang.String r1 = r0.getClickFrom()
        L75:
            java.lang.String r0 = "click_add_recommendation"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L9e
            r1 = 1
        L7e:
            com.bytedance.tux.icon.TuxIconView r0 = r4.LLJJJ
            if (r0 == 0) goto L89
            if (r1 != 0) goto L86
            r3 = 8
        L86:
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L89:
            com.bytedance.tux.icon.TuxIconView r1 = r4.LLJJJ
            if (r1 == 0) goto L92
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.x5(r1, r0)
        L92:
            com.bytedance.tux.icon.TuxIconView r0 = r4.LLJJJ
            if (r0 == 0) goto L99
            r0.setEnabled(r2)
        L99:
            return
        L9a:
            r0 = r1
            goto L5f
        L9c:
            r0 = r1
            goto L33
        L9e:
            r1 = 0
            goto L7e
        La0:
            r0 = r1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem.Fp():void");
    }

    public final void Jp() {
        lp().LJI(false, false, false, false, zp(), Ap(), false, C866950Xzh.LIZIZ(sp().CQ2()) || sp().GQ2() != null || C866950Xzh.LIZIZ(sp().xQ2()));
    }

    public EnumC1346360l8k getInputServiceType() {
        CommentKeyboardModel keyboardModel;
        EnumC1346360l8k inputServiceType;
        CommentContextSource commentContextSourceKp = kp();
        return (commentContextSourceKp == null || (keyboardModel = commentContextSourceKp.getKeyboardModel()) == null || (inputServiceType = keyboardModel.getInputServiceType()) == null) ? EnumC1346360l8k.COMMENT_PANEL : inputServiceType;
    }

    public final boolean ip() {
        AwemeControl awemeControl;
        Aweme aweme = CommentContextSourceKt.aweme(kp());
        return (aweme == null || (awemeControl = aweme.getAwemeControl()) == null || !awemeControl.canComment() || !C1348690lCV.LIZ(CommentContextSourceKt.aweme(kp())) || C1348690lCV.LIZJ(CommentContextSourceKt.aweme(kp()))) ? false : true;
    }

    public final boolean isLandscapeMode() {
        CommentKeyboardModel keyboardModel;
        CommentContextSource commentContextSourceKp = kp();
        return (commentContextSourceKp == null || (keyboardModel = commentContextSourceKp.getKeyboardModel()) == null || !keyboardModel.isLandscapeMode()) ? false : true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, IKeyboardEditAbility.class, null, null);
        InterfaceC665370Q7z interfaceC665370Q7zLJIL = C1345700l7g.LJIL(this);
        if (interfaceC665370Q7zLJIL != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIL, sp(), IKeyboardVMAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJIL, tp(), ICommentPublishViewModelAbility.class, null, null);
            KeyboardVMV2 keyboardVMV2Sp = sp();
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            keyboardVMV2Sp.LLJJIJIIJIL = Intrinsics.LJFF(interfaceC665370Q7zLJIL, c19egLIZ != null ? C1558360qeg.LJI(c19egLIZ, null) : null);
            CommentPublishViewModel commentPublishViewModelTp = tp();
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            commentPublishViewModelTp.LLJJIJI = Intrinsics.LJFF(interfaceC665370Q7zLJIL, c19egLIZ2 != null ? C1558360qeg.LJI(c19egLIZ2, null) : null);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardEditAbility
    public C1353500lKG Zy1() {
        return this.LLJJIJI;
    }

    public void bT(Aweme aweme) {
        C1344030l4z.LIZJ("FakeKeyboardPlaceholder", "reused keyboard");
        Fp();
        Gp();
        Jp();
    }

    public String mp(boolean z) {
        boolean z2;
        boolean z3;
        List<CommentImageModel> listCQ2 = sp().CQ2();
        boolean z4 = false;
        if (listCQ2 != null && !listCQ2.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = !z2;
        if (sp().GQ2() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = !z3;
        List<AudioCommentModel> listXQ2 = sp().xQ2();
        if (listXQ2 == null || listXQ2.isEmpty()) {
            z4 = true;
        }
        boolean z7 = !z4;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Comment comment = null;
        if (c19egLIZ == null) {
            return null;
        }
        C1346580l96 c1346580l96 = C1346580l96.LIZ;
        CommentContextSource commentContextSourceKp = kp();
        C1346480l8w c1346480l8w = sp().getState().LLILZIL;
        if (c1346480l8w != null) {
            comment = c1346480l8w.LIZ;
        }
        c1346580l96.getClass();
        return C1346580l96.LIZ(c19egLIZ, commentContextSourceKp, comment, z5, z, z6, z7, false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        C459990I2b c459990I2b;
        super.onViewCreated(view);
        this.LLJJIII = (C427870Gq9) view.findViewById(R.id.e_l);
        C1353500lKG c1353500lKG = (C1353500lKG) view.findViewById(R.id.eal);
        this.LLJJIJI = c1353500lKG;
        int i = 0;
        if (c1353500lKG != null) {
            c1353500lKG.setVerticalScrollBarEnabled(false);
        }
        this.LLJJJIL = (TuxIconView) view.findViewById(R.id.lfo);
        if (CommentWithStickerExp.LIZIZ()) {
            this.LLJLLIL = new C459990I2b(this.LLJJJIL, this.LLJJIJI);
            if (!isLandscapeMode() && (c459990I2b = this.LLJLLIL) != null) {
                c459990I2b.LIZLLL(false, false);
            }
        }
        this.LLJJIJIIJIL = (LinearLayout) view.findViewById(R.id.k0y);
        this.LLJJL = view.findViewById(R.id.ea2);
        if (!isLandscapeMode()) {
            this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.ed9);
        } else {
            this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.ed_);
        }
        boolean z2 = true;
        if (((Number) C276180As4.LIZ.getValue()).intValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        AttributeSet attributeSet = null;
        if (z) {
            View view2 = this.LLJJLIIIJLLLLLLLZ;
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams3 != null) {
                    marginLayoutParams3.height = C0HD5.LIZ(view, 32);
                    marginLayoutParams3.width = C0HD5.LIZ(view, 52);
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.bottomMargin = C0HD5.LIZ(view, Double.valueOf(5.5d));
                        marginLayoutParams3.setMarginEnd(C0HD5.LIZ(view, Double.valueOf(5.5d)));
                    }
                }
            } else {
                marginLayoutParams3 = null;
            }
            View view3 = this.LLJJLIIIJLLLLLLLZ;
            if (view3 != null) {
                C786410Ut5.W5(view3, marginLayoutParams3);
            }
        }
        this.LLJL = (ImageView) view.findViewById(R.id.t83);
        this.LLJJIJIL = (TuxIconView) view.findViewById(R.id.ll7);
        this.LLJJJJ = (TuxIconView) view.findViewById(R.id.l99);
        this.LLJJJ = (TuxIconView) view.findViewById(R.id.lie);
        view.findViewById(R.id.lzc);
        this.LLJJJJJIL = view.findViewById(R.id.ma7);
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            TuxTextView tuxTextView = new TuxTextView(view.getContext(), attributeSet, 6, i);
            C384050F3z c384050F3z = new C384050F3z();
            int iLIZJ = C1308910kAL.LIZJ(R.attr.ny, view.getContext());
            if (iLIZJ == null) {
                iLIZJ = -16777216;
            }
            c384050F3z.LIZ = iLIZJ;
            tuxTextView.setBackground(c384050F3z.LIZ(view.getContext()));
            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            tuxTextView.setText("New");
            View view4 = this.LLJJL;
            if ((view4 instanceof ViewGroup) && (viewGroup = (ViewGroup) view4) != null) {
                viewGroup.addView(tuxTextView, layoutParams2);
            }
        }
        Jp();
        Gp();
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        isLandscapeMode();
        if (!C1347610lAl.LJ() || !(this instanceof PortraitInputKeyboard)) {
            z2 = false;
        }
        if (zIsLogin && !z2) {
            C427870Gq9 c427870Gq9 = this.LLJJIII;
            if (c427870Gq9 != null) {
                C786410Ut5.LLLLJI(c427870Gq9, 0);
            }
            yp();
            View view5 = this.LLJJJJJIL;
            if (view5 != null) {
                ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                if ((layoutParams3 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    marginLayoutParams2.setMarginStart(C0HD5.LIZ(view5, 58));
                    C786410Ut5.W5(view5, marginLayoutParams2);
                }
            }
        } else {
            C427870Gq9 c427870Gq92 = this.LLJJIII;
            if (c427870Gq92 != null) {
                C786410Ut5.LLLLJI(c427870Gq92, 8);
            }
            View view6 = this.LLJJJJJIL;
            if (view6 != null) {
                ViewGroup.LayoutParams layoutParams4 = view6.getLayoutParams();
                if ((layoutParams4 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    marginLayoutParams.setMarginStart(C0HD5.LIZ(view6, 12));
                    C786410Ut5.W5(view6, marginLayoutParams);
                }
            }
        }
        Fp();
    }

    public static void up(C1353500lKG c1353500lKG, C19ME c19me) {
        c19me.endToStart = -1;
        c19me.endToEnd = R.id.ed_;
        c19me.setMarginEnd(C0HD5.LIZ(c1353500lKG, 14));
    }

    public void Bp(String str, boolean z) {
        Editable editableLLLZZIL;
        C1353500lKG c1353500lKG = this.LLJJIJI;
        CharSequence hint = null;
        if (c1353500lKG != null && (editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN8IKwYL0E98r5Ug==", null))) != null && editableLLLZZIL.length() != 0) {
            C1353500lKG c1353500lKG2 = this.LLJJIJI;
            if (c1353500lKG2 != null) {
                c1353500lKG2.setHint("");
            }
        } else {
            C1353500lKG c1353500lKG3 = this.LLJJIJI;
            if (c1353500lKG3 != null) {
                if (str == null) {
                    str = mp(z);
                }
                c1353500lKG3.setHint(str);
            }
        }
        C1353500lKG c1353500lKG4 = this.LLJJIJI;
        if (c1353500lKG4 != null) {
            hint = c1353500lKG4.getHint();
        }
        Objects.toString(hint);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ip(boolean r19, boolean r20, boolean r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem.Ip(boolean, boolean, boolean):void");
    }
}
