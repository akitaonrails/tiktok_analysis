package com.ss.android.ugc.aweme.commentv2.title;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09R3;
import X.C0HTT;
import X.C0SYU;
import X.C0WZX;
import X.C1210880hcE;
import X.C1220000hqw;
import X.C1346480l8w;
import X.C1346580l96;
import X.C1346910l9d;
import X.C1346920l9e;
import X.C1346950l9h;
import X.C1348710lCX;
import X.C1353500lKG;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19211310Dv;
import X.C19719912Dl;
import X.C19EG;
import X.C21566519ah;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C523420Kfs;
import X.C618720OOo;
import X.C721330SRf;
import X.C723150SYf;
import X.C723170SYh;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737030Svd;
import X.C738700SyK;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1341680l1C;
import X.EnumC1346360l8k;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737440SwI;
import Y.ACListenerS146S0100000_11;
import Y.ATListenerS454S0100000_21;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.commentv2.title.vm.TitlePanelBottomBarDiggViewModel;
import com.ss.android.ugc.aweme.commentv2.title.vm.TitlePanelBottomBarFavoriteVM;
import com.ss.android.ugc.aweme.commentv2.title.vm.TitlePanelBottomBarShareVM;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public final class TitlePanelInteractionInputBottomBarAssem extends UISlotAssem implements C0HTT<C737030Svd>, ICommentPageVisibilityProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public C1353500lKG LLJJI;
    public LinearLayout LLJJIII;
    public C723170SYh LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public TuxTextView LLJJJ;
    public LinearLayout LLJJJIL;
    public TuxTextView LLJJJJ;
    public C723170SYh LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public TuxTextView LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 85));
    public final C01GW LLJL;
    public final AssemVMLazy LLJLIL;
    public final C736950SvV LLJLILLLLZIIL;
    public final AssemVMLazy LLJLL;
    public final AssemVMLazy LLJLLIL;
    public final AtomicBoolean LLJLLL;
    public C21566519ah LLJZ;
    public C723150SYf LLJZIJLIL;
    public Comment LLL;
    public String LLLF;
    public final int LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitlePanelInteractionInputBottomBarAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/commentv2/title/vm/TitlePanelBottomBarDiggViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TitlePanelInteractionInputBottomBarAssem.class, "favoriteVM", "getFavoriteVM()Lcom/ss/android/ugc/aweme/commentv2/title/vm/TitlePanelBottomBarFavoriteVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TitlePanelInteractionInputBottomBarAssem.class, "shareVM", "getShareVM()Lcom/ss/android/ugc/aweme/commentv2/title/vm/TitlePanelBottomBarShareVM;", 0);
        c09r3.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a51;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LLFF() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void P61() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void onPagePause() {
    }

    public TitlePanelInteractionInputBottomBarAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 63));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TitlePanelBottomBarDiggViewModel.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c19719912DlLIZ2, 86);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(21);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ2);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS555S0100000_11, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((AbstractC738140SxQ) this, 87), aFwS243S0000000_11, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJLIL = assemVMLazy;
        this.LLJLILLLLZIIL = new C736950SvV(C13LE.LIZ(CommentSyncSharedVM.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(24), new AwS555S0100000_11((AbstractC738140SxQ) this, 92), new C451610HnL(this, true, true), new C723700Sa8(this));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TitlePanelBottomBarFavoriteVM.class);
        AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11(c19719912DlLIZ3, 88);
        AFwS243S0000000_11 aFwS243S0000000_112 = AFwS243S0000000_11.get$arr$(22);
        Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(this, c19719912DlLIZ3);
        AssemVMLazy assemVMLazy2 = new AssemVMLazy(function0LJIIJ2, awS555S0100000_112, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((AbstractC738140SxQ) this, 89), aFwS243S0000000_112, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ2, assemVMLazy2);
        this.LLJLL = assemVMLazy2;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(TitlePanelBottomBarShareVM.class);
        AwS555S0100000_11 awS555S0100000_113 = new AwS555S0100000_11(c19719912DlLIZ4, 90);
        AFwS243S0000000_11 aFwS243S0000000_113 = AFwS243S0000000_11.get$arr$(23);
        Function0 function0LJIIJ3 = C724750Sbp.LJIIJ(this, c19719912DlLIZ4);
        AssemVMLazy assemVMLazy3 = new AssemVMLazy(function0LJIIJ3, awS555S0100000_113, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((AbstractC738140SxQ) this, 91), aFwS243S0000000_113, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ3, assemVMLazy3);
        this.LLJLLIL = assemVMLazy3;
        this.LLJLLL = new AtomicBoolean(false);
        this.LLLFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
    }

    public final CommentContextSource hp() {
        return (CommentContextSource) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final TitlePanelBottomBarDiggViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        return (TitlePanelBottomBarDiggViewModel) assemVMLazy.getValue();
    }

    public final TitlePanelBottomBarFavoriteVM kp() {
        AssemVMLazy assemVMLazy = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        return (TitlePanelBottomBarFavoriteVM) assemVMLazy.getValue();
    }

    public final TitlePanelBottomBarShareVM lp() {
        AssemVMLazy assemVMLazy = this.LLJLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        return (TitlePanelBottomBarShareVM) assemVMLazy.getValue();
    }

    public final void mp() {
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        CommentCommonModel commonModel4;
        C19EG activity;
        Aweme aweme;
        Aweme aweme2;
        if (op()) {
            return;
        }
        C1348710lCX.LIZ.getClass();
        String str = null;
        if (C1348710lCX.LIZ()) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI == null || (activity = fragmentLJI.getActivity()) == null) {
                return;
            }
            CommentContextSource commentContextSourceHp = hp();
            String strValueOf = String.valueOf((commentContextSourceHp == null || (aweme2 = CommentContextSourceKt.aweme(commentContextSourceHp)) == null) ? null : Integer.valueOf(aweme2.getAwemeType()));
            CommentContextSource commentContextSourceHp2 = hp();
            C1348710lCX.LIZLLL(activity, "photo_cmt_popup", strValueOf, (commentContextSourceHp2 == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceHp2)) == null) ? null : aweme.getAid(), null);
            return;
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        C19EG activity2 = fragmentLJI2 != null ? fragmentLJI2.getActivity() : null;
        CommentContextSource commentContextSourceHp3 = hp();
        Aweme aweme3 = (commentContextSourceHp3 == null || (commonModel4 = commentContextSourceHp3.getCommonModel()) == null) ? null : commonModel4.aweme;
        CommentContextSource commentContextSourceHp4 = hp();
        if (C0SYU.LIZIZ(activity2, aweme3, (commentContextSourceHp4 == null || (commonModel3 = commentContextSourceHp4.getCommonModel()) == null) ? null : commonModel3.enterFrom, "click_type_comment", hp())) {
            return;
        }
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        C19EG activity3 = fragmentLJI3 != null ? fragmentLJI3.getActivity() : null;
        Fragment fragmentLJI4 = C724240Sb0.LJI(this);
        CommentContextSource commentContextSourceHp5 = hp();
        Aweme aweme4 = commentContextSourceHp5 != null ? CommentContextSourceKt.aweme(commentContextSourceHp5) : null;
        Comment comment = this.LLL;
        CommentContextSource commentContextSourceHp6 = hp();
        String str2 = (commentContextSourceHp6 == null || (commonModel2 = commentContextSourceHp6.getCommonModel()) == null) ? null : commonModel2.enterFrom;
        CommentContextSource commentContextSourceHp7 = hp();
        if (commentContextSourceHp7 != null && (commonModel = commentContextSourceHp7.getCommonModel()) != null) {
            str = commonModel.enterMethod;
        }
        InterfaceC737440SwI interfaceC737440SwILJLJJL = commentServiceLIZ.LJLJJL(activity3, fragmentLJI4, aweme4, comment, str2, str, null, new C1346920l9e(false, false, false, false, false, false, EnumC1346360l8k.POST_MODE_FULL_PAGE, 0, EnumC1341680l1C.TEXT, false, new C1346910l9d("", null, null, 0, EnumC1341680l1C.TEXT, "", null, "", null, ""), false), hp());
        if (interfaceC737440SwILJLJJL != null) {
            interfaceC737440SwILJLJJL.rn(new AwS590S0100000_11(this, 450));
            interfaceC737440SwILJLJJL.hr(AFwS243S0000000_11.get$arr$(658));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean op() {
        /*
            r6 = this;
            X.0Kfs r0 = com.ss.android.ugc.aweme.comment.services.CommentService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.comment.services.CommentService r2 = X.C523420Kfs.LIZ()
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r6.hp()
            r1 = 0
            if (r0 == 0) goto Lb7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)
        L14:
            boolean r0 = r2.LJIILLIIL(r0)
            r3 = 1
            r5 = 0
            if (r0 != 0) goto L2e
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r6.hp()
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)
            if (r0 == 0) goto L7b
            boolean r0 = r0.isCmtSwt()
            if (r0 != r3) goto L7b
        L2e:
            X.0lEI r2 = new X.0lEI
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r6.hp()
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.getAid()
        L40:
            r2.<init>(r1)
            r2.setCommentClose(r3)
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r6.hp()
            if (r0 == 0) goto Lb4
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)
            if (r1 == 0) goto Lb4
            android.view.View r0 = r6.getContentView()
            android.content.Context r0 = r0.getContext()
            java.lang.CharSequence r4 = X.C1349280lDS.LJFF(r0, r1, r2)
        L5e:
            androidx.fragment.app.Fragment r1 = X.C724240Sb0.LJI(r6)
            if (r1 == 0) goto Lba
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto Lba
            X.0mGx r2 = new X.0mGx
            r2.<init>(r1)
            r2.LJIIJ(r4)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.LIZLLL(r0)
            r2.LJIIJJI()
            return r3
        L7b:
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r6.hp()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)
            if (r0 == 0) goto Lb4
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto Lb4
            int r0 = r0.getCommentSetting()
            if (r0 != r3) goto Lb4
            X.0Sso r1 = X.C735280Sso.LIZ
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r6.hp()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)
            r1.getClass()
            boolean r0 = X.C735280Sso.LIZLLL(r0)
            if (r0 != 0) goto Lb4
            android.view.View r0 = r6.getContentView()
            android.content.Context r1 = r0.getContext()
            r0 = 2131829189(0x7f1121c5, float:1.929134E38)
            java.lang.String r4 = r1.getString(r0)
            goto L5e
        Lb4:
            java.lang.String r4 = ""
            goto L5e
        Lb7:
            r0 = r1
            goto L14
        Lba:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelInteractionInputBottomBarAssem.op():boolean");
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
        C1353500lKG c1353500lKG;
        Editable editableLLLZZIL;
        Aweme aweme;
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        String str = this.LLLF;
        CommentContextSource commentContextSourceHp = hp();
        if (!Intrinsics.LJFF(str, (commentContextSourceHp == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceHp)) == null) ? null : aweme.getAid()) && (c1353500lKG = this.LLJJI) != null && (editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iYCcP3QYyUw0qWOl3iJlGTasUDZoUid3F/5rTXoERxjiwO73zZN76VMc8JgxY1aUvWx", null))) != null) {
            editableLLLZZIL.clear();
        }
        TitlePanelBottomBarDiggViewModel titlePanelBottomBarDiggViewModelIp = ip();
        CommentContextSource commentContextSourceHp2 = hp();
        titlePanelBottomBarDiggViewModelIp.LLILLL(commentContextSourceHp2 != null ? CommentContextSourceKt.aweme(commentContextSourceHp2) : null);
        sp();
        tp();
        TitlePanelBottomBarShareVM titlePanelBottomBarShareVMLp = lp();
        CommentContextSource commentContextSourceHp3 = hp();
        Aweme aweme2 = commentContextSourceHp3 != null ? CommentContextSourceKt.aweme(commentContextSourceHp3) : null;
        titlePanelBottomBarShareVMLp.LL = aweme2;
        titlePanelBottomBarShareVMLp.setState(new AwS377S0200000_11(titlePanelBottomBarShareVMLp, aweme2, 126));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        Lifecycle lifecycle;
        super.onParentSet();
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        LifecycleOwner viewLifecycleOwner = fragmentLJI != null ? fragmentLJI.getViewLifecycleOwner() : null;
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
        if (viewLifecycleOwner == null || (lifecycle = viewLifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.commentv2.title.TitlePanelInteractionInputBottomBarAssem$onParentSet$$inlined$registerProtocol$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, ICommentPageVisibilityProtocol.class, this);
                }
            }
        });
    }

    public final void sp() {
        Aweme aweme;
        AwemeStatistics statistics;
        TuxTextView tuxTextView;
        CommentContextSource commentContextSourceHp = hp();
        if (commentContextSourceHp == null || CommentContextSourceKt.aweme(commentContextSourceHp) == null) {
            TuxTextView tuxTextView2 = this.LLJJJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(CardStruct.IStatusCode.DEFAULT);
                return;
            }
            return;
        }
        CommentContextSource commentContextSourceHp2 = hp();
        if (commentContextSourceHp2 == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceHp2)) == null || (statistics = aweme.getStatistics()) == null || (tuxTextView = this.LLJJJ) == null) {
            return;
        }
        tuxTextView.setText(C618720OOo.LIZ(statistics.getCommentCount()));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp() {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelInteractionInputBottomBarAssem.tp():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    @Override // X.C0HTT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIL(X.C737030Svd r13) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelInteractionInputBottomBarAssem.LLIIL(java.lang.Object):void");
    }

    @C14EU
    public final void onAwemeDeleteEvent(C1210880hcE c1210880hcE) {
        ICommentPageContainer iCommentPageContainer;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        if (interfaceC665370Q7zLJIIL != null && (iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, ICommentPageContainer.class, null)) != null) {
            iCommentPageContainer.Kb1("not_interested");
        }
    }

    @C14EU
    public final void onFeedDislikeEventEvent(C721330SRf c721330SRf) {
        ICommentPageContainer iCommentPageContainer;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        if (interfaceC665370Q7zLJIIL != null && (iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, ICommentPageContainer.class, null)) != null) {
            iCommentPageContainer.Kb1("not_interested");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onJsBroadCastEvent(X.C484220Iyq r15) {
        /*
            r14 = this;
            java.lang.String r2 = "videoReportSuccess"
            org.json.JSONObject r1 = r15.LIZ     // Catch: org.json.JSONException -> La7
            java.lang.String r0 = "eventName"
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: org.json.JSONException -> La7
            boolean r0 = android.text.TextUtils.equals(r2, r0)     // Catch: org.json.JSONException -> La7
            if (r0 == 0) goto Lab
            org.json.JSONObject r1 = r15.LIZ     // Catch: org.json.JSONException -> La7
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r1, r0)     // Catch: org.json.JSONException -> La7
            java.lang.String r0 = "object_id"
            java.lang.String r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: org.json.JSONException -> La7
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r14.hp()     // Catch: org.json.JSONException -> La7
            r8 = 0
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)     // Catch: org.json.JSONException -> La7
            if (r2 == 0) goto L37
            java.lang.String r0 = r2.getAid()     // Catch: org.json.JSONException -> La7
        L2f:
            boolean r0 = android.text.TextUtils.equals(r0, r1)     // Catch: org.json.JSONException -> La7
            if (r0 == 0) goto L91
            goto L39
        L36:
            r2 = r8
        L37:
            r0 = r8
            goto L2f
        L39:
            if (r2 == 0) goto L82
            com.ss.android.ugc.aweme.feed.model.VideoMaskInfo r4 = new com.ss.android.ugc.aweme.feed.model.VideoMaskInfo     // Catch: org.json.JSONException -> La7
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: org.json.JSONException -> La7
            r0 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch: org.json.JSONException -> La7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch: org.json.JSONException -> La7
            android.content.Context r1 = r14.getContext()     // Catch: org.json.JSONException -> La7
            java.lang.String r3 = ""
            if (r1 == 0) goto L59
            r0 = 2131846337(0x7f1164c1, float:1.932612E38)
            java.lang.String r10 = r1.getString(r0)     // Catch: org.json.JSONException -> La7
            if (r10 != 0) goto L5a
        L59:
            r10 = r3
        L5a:
            android.content.Context r1 = r14.getContext()     // Catch: org.json.JSONException -> La7
            if (r1 == 0) goto L69
            r0 = 2131846335(0x7f1164bf, float:1.9326116E38)
            java.lang.String r11 = r1.getString(r0)     // Catch: org.json.JSONException -> La7
            if (r11 != 0) goto L6a
        L69:
            r11 = r3
        L6a:
            android.content.Context r1 = r14.getContext()     // Catch: org.json.JSONException -> La7
            if (r1 == 0) goto L79
            r0 = 2131846336(0x7f1164c0, float:1.9326118E38)
            java.lang.String r12 = r1.getString(r0)     // Catch: org.json.JSONException -> La7
            if (r12 != 0) goto L7a
        L79:
            r12 = r3
        L7a:
            r9 = r8
            r13 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: org.json.JSONException -> La7
            r2.setReportMaskInfo(r4)     // Catch: org.json.JSONException -> La7
        L82:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: org.json.JSONException -> La7
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r1.getService(r0)     // Catch: org.json.JSONException -> La7
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0     // Catch: org.json.JSONException -> La7
            r0.LLILLL(r2)     // Catch: org.json.JSONException -> La7
        L91:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r14)     // Catch: org.json.JSONException -> La7
            if (r1 == 0) goto Lab
            java.lang.Class<com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer> r0 = com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer.class
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r8)     // Catch: org.json.JSONException -> La7
            com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer r1 = (com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer) r1     // Catch: org.json.JSONException -> La7
            if (r1 == 0) goto Lab
            java.lang.String r0 = "report"
            r1.Kb1(r0)     // Catch: org.json.JSONException -> La7
            return
        La7:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelInteractionInputBottomBarAssem.onJsBroadCastEvent(X.0Iyq):void");
    }

    @C14EU(priority = 1, threadMode = ThreadMode.POSTING)
    public final void onVideoEvent(C737030Svd c737030Svd) {
        if (c737030Svd != null && c737030Svd.LIZ == 78) {
            EventBus.LIZLLL().LIZIZ(c737030Svd);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String aid;
        Aweme aweme;
        C19EG activity;
        LinearLayout linearLayout;
        Comment comment;
        boolean z;
        boolean z2;
        Aweme aweme2;
        super.onViewCreated(view);
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        CommentContextSource commentContextSourceHp = hp();
        Aweme aweme3 = null;
        if (commentContextSourceHp != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceHp)) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        this.LLLF = aid;
        C1353500lKG c1353500lKG = (C1353500lKG) view.findViewById(R.id.krh);
        this.LLJJI = c1353500lKG;
        if (c1353500lKG != null) {
            CommentContextSource commentContextSourceHp2 = hp();
            if (commentContextSourceHp2 != null && CommentContextSourceKt.aweme(commentContextSourceHp2) != null) {
                C1346580l96 c1346580l96 = C1346580l96.LIZ;
                Context context = c1353500lKG.getContext();
                CommentContextSource commentContextSourceHp3 = hp();
                C1346480l8w c1346480l8w = ((C1346950l9h) ((AssemViewModel) this.LLJL.getValue()).getState()).LLILZIL;
                if (c1346480l8w != null) {
                    comment = c1346480l8w.LIZ;
                } else {
                    comment = null;
                }
                List<CommentImageModel> listCQ2 = ((KeyboardVMV2) this.LLJL.getValue()).CQ2();
                boolean z3 = false;
                if (listCQ2 != null && !listCQ2.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z4 = !z;
                if (((KeyboardVMV2) this.LLJL.getValue()).GQ2() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z5 = !z2;
                List<AudioCommentModel> listXQ2 = ((KeyboardVMV2) this.LLJL.getValue()).xQ2();
                if (listXQ2 == null || listXQ2.isEmpty()) {
                    z3 = true;
                }
                c1346580l96.getClass();
                c1353500lKG.setHint(C1346580l96.LIZ(context, commentContextSourceHp3, comment, z4, false, z5, !z3, false));
            }
            c1353500lKG.clearFocus();
            c1353500lKG.setOnTouchListener(new ATListenerS454S0100000_21(c1353500lKG, 18));
        }
        C1353500lKG c1353500lKG2 = this.LLJJI;
        if (c1353500lKG2 != null) {
            C786410Ut5.I7(new C738700SyK(this, 5), c1353500lKG2);
        }
        this.LLJJIII = (LinearLayout) view.findViewById(R.id.ftz);
        this.LLJJIJI = (C723170SYh) view.findViewById(R.id.ftw);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.fua);
        C723170SYh c723170SYh = this.LLJJIJI;
        if (c723170SYh != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_3pt_heart_filled;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
            int i = this.LLLFF;
            c419910GdJ.LIZIZ = i;
            c419910GdJ.LIZJ = i;
            c723170SYh.setActiveIcon(c419910GdJ);
        }
        C723170SYh c723170SYh2 = this.LLJJIJI;
        if (c723170SYh2 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_3pt_heart;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
            int i2 = this.LLLFF;
            c419910GdJ2.LIZIZ = i2;
            c419910GdJ2.LIZJ = i2;
            c723170SYh2.setInActiveIcon(c419910GdJ2);
        }
        LinearLayout linearLayout2 = this.LLJJIII;
        if (linearLayout2 != null) {
            C786410Ut5.R7(linearLayout2, new ACListenerS146S0100000_11(this, 63));
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0SYZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0SYL) obj).LLILLJJLI);
            }
        }, null, new AwS625S0100000_11(this, 118), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0SYO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SYL) obj).LL;
            }
        }, null, new AwS625S0100000_11(this, 119), 6);
        TitlePanelBottomBarDiggViewModel titlePanelBottomBarDiggViewModelIp = ip();
        CommentContextSource commentContextSourceHp4 = hp();
        if (commentContextSourceHp4 != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceHp4);
        } else {
            aweme = null;
        }
        titlePanelBottomBarDiggViewModelIp.LLILLL(aweme);
        this.LLJJIJIL = (LinearLayout) view.findViewById(R.id.ea2);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.edy);
        view.findViewById(R.id.eb6);
        LinearLayout linearLayout3 = this.LLJJIJIL;
        if (linearLayout3 != null) {
            C786410Ut5.R7(linearLayout3, new ACListenerS146S0100000_11(this, 62));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            activity = fragmentLJI.getActivity();
        } else {
            activity = null;
        }
        C723150SYf c723150SYf = new C723150SYf(activity);
        this.LLJZIJLIL = c723150SYf;
        c723150SYf.LJIIJ(new C19211310Dv());
        sp();
        C736680Sv4.LJIIIIZZ(this, this.LLJLILLLLZIIL.getValue(), new C2217381BqS() { // from class: X.0HWu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C442480HWs) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 116), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJL.getValue(), new C2217381BqS() { // from class: X.0SYY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLILZIL;
            }
        }, null, new AwS625S0100000_11(this, 117), 6);
        this.LLJJJIL = (LinearLayout) view.findViewById(R.id.hpv);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.hqs);
        C723170SYh c723170SYh3 = (C723170SYh) view.findViewById(R.id.hq_);
        this.LLJJJJJIL = c723170SYh3;
        if (c723170SYh3 != null) {
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_3pt_bookmark_fill;
            c419910GdJ3.LJ = Integer.valueOf(R.attr.ny);
            int i3 = this.LLLFF;
            c419910GdJ3.LIZIZ = i3;
            c419910GdJ3.LIZJ = i3;
            c723170SYh3.setActiveIcon(c419910GdJ3);
        }
        C723170SYh c723170SYh4 = this.LLJJJJJIL;
        if (c723170SYh4 != null) {
            C419910GdJ c419910GdJ4 = new C419910GdJ();
            c419910GdJ4.LIZ = R.raw.icon_3pt_bookmark;
            c419910GdJ4.LJ = Integer.valueOf(R.attr.a1h);
            int i4 = this.LLLFF;
            c419910GdJ4.LIZIZ = i4;
            c419910GdJ4.LIZJ = i4;
            c723170SYh4.setInActiveIcon(c419910GdJ4);
        }
        LinearLayout linearLayout4 = this.LLJJJIL;
        if (linearLayout4 != null) {
            C786410Ut5.R7(linearLayout4, new ACListenerS146S0100000_11(this, 64));
        }
        if (!((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIZILJ() && (linearLayout = this.LLJJJIL) != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0OFV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C614740O9g) obj).LLILLJJLI);
            }
        }, null, new AwS625S0100000_11(this, 120), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0O9h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C614740O9g) obj).LL;
            }
        }, null, new AwS625S0100000_11(this, 113), 6);
        tp();
        this.LLJJJJLIIL = (LinearLayout) view.findViewById(R.id.uz4);
        this.LLJJL = (TuxTextView) view.findViewById(R.id.v1q);
        view.findViewById(R.id.uzn);
        LinearLayout linearLayout5 = this.LLJJJJLIIL;
        if (linearLayout5 != null) {
            C786410Ut5.I7(new C738700SyK(this, 2), linearLayout5);
        }
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0SYb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SYV) obj).LL;
            }
        }, null, new AwS625S0100000_11(this, 115), 6);
        TitlePanelBottomBarShareVM titlePanelBottomBarShareVMLp = lp();
        CommentContextSource commentContextSourceHp5 = hp();
        if (commentContextSourceHp5 != null) {
            aweme3 = CommentContextSourceKt.aweme(commentContextSourceHp5);
        }
        titlePanelBottomBarShareVMLp.LL = aweme3;
        titlePanelBottomBarShareVMLp.setState(new AwS377S0200000_11(titlePanelBottomBarShareVMLp, aweme3, 126));
    }
}
