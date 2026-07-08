package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0BKP;
import X.C0HD5;
import X.C0HEZ;
import X.C0I05;
import X.C0P0T;
import X.C0SVN;
import X.C0SVO;
import X.C0SYU;
import X.C0VSJ;
import X.C0VSP;
import X.C0WZX;
import X.C0XQ7;
import X.C0ZP4;
import X.C1220000hqw;
import X.C1292030jj7;
import X.C1294250jmh;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C12ES;
import X.C1340160kyk;
import X.C1340340kz2;
import X.C1340510kzJ;
import X.C1342280l2A;
import X.C1344030l4z;
import X.C1344550l5p;
import X.C1345700l7g;
import X.C1346420l8q;
import X.C1346580l96;
import X.C1346760l9O;
import X.C1346790l9R;
import X.C1346810l9T;
import X.C1346820l9U;
import X.C1346910l9d;
import X.C1346920l9e;
import X.C1347720lAw;
import X.C1348010lBP;
import X.C1348690lCV;
import X.C1348710lCX;
import X.C1350070lEj;
import X.C1350920lG6;
import X.C1353500lKG;
import X.C1354660lM8;
import X.C1356320lOo;
import X.C1357700lR2;
import X.C1391600mJi;
import X.C13LE;
import X.C1402080mac;
import X.C14EU;
import X.C1552050qUV;
import X.C1554610qYd;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1868390yij;
import X.C19719912Dl;
import X.C19EG;
import X.C19ME;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C255830A0v;
import X.C258670ABt;
import X.C294170Bfz;
import X.C294290BgB;
import X.C294410BgN;
import X.C295780Bia;
import X.C295880Bik;
import X.C296140BjA;
import X.C427870Gq9;
import X.C443950Haz;
import X.C450720Hlu;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C459990I2b;
import X.C523420Kfs;
import X.C622680Oba;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1235690iGF;
import X.EnumC1341660l1A;
import X.EnumC1341680l1C;
import X.EnumC1346360l8k;
import X.EnumC1347870lBB;
import X.EnumC1349980lEa;
import X.EnumC454020HrE;
import X.EnumC993530bxf;
import X.InterfaceC1292040jj8;
import X.InterfaceC1346750l9N;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS11S1100000_6;
import Y.ARunnableS121S0100000_21;
import Y.AfS190S0100000_21;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.model.PhotoCacheModel;
import com.ss.android.ugc.aweme.comment.plus.PlusPanelConfig;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public class CommentPanelFakeInput extends BaseFakeInput implements ICommentFakeInputAbility, ICommentPageVisibilityProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLL;
    public View LLLIIII;
    public TuxTextView LLLIIIIL;
    public final C736950SvV LLLIIIL;
    public final C1340340kz2 LLLIIL;
    public final C01GW LLLIILIL;
    public C1295960jpS LLLIL;
    public C0P0T LLLILZ;
    public final BPEAHandler LLLILZJ;
    public ARunnableS121S0100000_21 LLLILZLLLI;
    public volatile boolean LLLIZZ;
    public final ARunnableS121S0100000_21 LLLJ;
    public C0ZP4 LLLJIL;
    public boolean LLLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentPanelFakeInput.class, "source", "getSource()Lcom/ss/android/ugc/aweme/comment/photocomment/PhotoDetailContextSource;", 0);
        C13LE.LIZ.getClass();
        LLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput, com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a3f;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility
    public final void HY() {
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp != null && (commonModel = commentContextSourceKp.getCommonModel()) != null) {
            commonModel.setCreateAIPhotoFromCommentAnchor(true);
        }
        BaseFakeInput.Xp(this, EnumC1341680l1C.CREATE_IMAGE, null, null, null, 14);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LLFF() {
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility
    public final void OD0() {
        String str;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL(this);
        CommentContextSource commentContextSourceKp = kp();
        Aweme aweme = (commentContextSourceKp == null || (commonModel2 = commentContextSourceKp.getCommonModel()) == null) ? null : commonModel2.aweme;
        CommentContextSource commentContextSourceKp2 = kp();
        if (commentContextSourceKp2 == null || (commonModel = commentContextSourceKp2.getCommonModel()) == null || (str = commonModel.enterFrom) == null) {
            str = "";
        }
        if (C0SYU.LIZIZ(c19egLJIILLIIL, aweme, str, "click_comment_photo", kp())) {
            return;
        }
        BaseFakeInput.Xp(this, EnumC1341680l1C.PHOTO, null, null, null, 14);
        C1350920lG6.LJJLIIIJJI(CommentContextSourceKt.enterFrom(kp()), CommentContextSourceKt.aweme(kp()), true, sp().HQ2(), false, C1347720lAw.LJIILL(this.LLLFF));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("shoot_way", "photo_comment");
        C20684815ws.LJIILLIIL("click_upload_entrance", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void P61() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void onPagePause() {
    }

    public CommentPanelFakeInput() {
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 135);
        this.LLLIIIL = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), awS565S0100000_21, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(70), new AwS563S0100000_19((AbstractC738140SxQ) this, 581), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLLIIL = new C1340340kz2();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentManagementAssemVM.class);
        this.LLLIILIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 32));
        this.LLLILZJ = new BPEAHandler(Looper.getMainLooper());
        this.LLLJ = new ARunnableS121S0100000_21(this, 31);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        if (((CommentManagementAssemVM) this.LLLIILIL.getValue()).xQ2()) {
            return;
        }
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp != null && (commonModel2 = commentContextSourceKp.getCommonModel()) != null) {
            commonModel2.setCommentStickerUniqueId(String.valueOf(hashCode()));
        }
        CommentContextSource commentContextSourceKp2 = kp();
        if (commentContextSourceKp2 == null || (commonModel = commentContextSourceKp2.getCommonModel()) == null || !commonModel.isPreCreate()) {
            if (this.LLILZ) {
                sp().QQ2(C1345700l7g.LJIILLIIL(this), kp());
            } else {
                sp().QQ2(C1345700l7g.LJIILLIIL(this), null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility
    public final void Le1() {
        this.LLLILZJ.removeCallbacks(this.LLLJ);
        C1295960jpS c1295960jpS = this.LLLIL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LLLIL;
        if (c1295960jpS2 != null) {
            C786410Ut5.LLD(8, c1295960jpS2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility
    public final void V92() {
        if (this.LLLILZLLLI != null) {
            return;
        }
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = new ARunnableS121S0100000_21(this, 32);
        this.LLLILZLLLI = aRunnableS121S0100000_21;
        C786410Ut5.LJLIIL(500L, this.LLLILZJ, aRunnableS121S0100000_21);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility
    public final void Ym0() {
        C0ZP4 c0zp4 = this.LLLJIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
            this.LLLJIL = null;
        }
    }

    public boolean tq() {
        CommentService.LIZ.getClass();
        return C523420Kfs.LIZ().LLFFF(getContext());
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility
    public final void xF() {
        View view = this.LLLIIII;
        int visibility = view != null ? view.getVisibility() : 8;
        View view2 = this.LLLIIII;
        int height = view2 != null ? view2.getHeight() : -1;
        int visibility2 = LJJIJL().getVisibility();
        int height2 = LJJIJL().getHeight();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("root visibility = ");
        sbLIZ.append(visibility);
        sbLIZ.append(", height = ");
        sbLIZ.append(height);
        sbLIZ.append(", containerVisibility = ");
        sbLIZ.append(visibility2);
        sbLIZ.append(", height = ");
        sbLIZ.append(height2);
        C1344030l4z.LIZJ("CommentInputCheck", C2188811AlT.LIZIZ(sbLIZ));
    }

    private final void Aq() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        boolean zIsLogin = C0XQ7.LJFF().isLogin();
        boolean z = lq() && C294290BgB.LIZJ();
        if (!zIsLogin || z) {
            C427870Gq9 c427870Gq9 = this.LLJJIII;
            if (c427870Gq9 != null) {
                C786410Ut5.LLLLJI(c427870Gq9, 8);
            }
            View view = this.LLJJJJJIL;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                    return;
                }
                marginLayoutParams.setMarginStart(C0HD5.LIZ(view, 12));
                C786410Ut5.W5(view, marginLayoutParams);
                return;
            }
            return;
        }
        C427870Gq9 c427870Gq92 = this.LLJJIII;
        if (c427870Gq92 != null) {
            C786410Ut5.LLLLJI(c427870Gq92, 0);
        }
        yp();
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (!(layoutParams2 instanceof C19ME) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                return;
            }
            marginLayoutParams2.setMarginStart(C0HD5.LIZ(view2, 58));
            C786410Ut5.W5(view2, marginLayoutParams2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem
    public final void Fp() {
        boolean z;
        TuxIconView tuxIconView;
        super.Fp();
        if (lq()) {
            TuxIconView tuxIconView2 = this.LLJJJ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                return;
            }
            return;
        }
        PlusPanelConfig plusPanelConfigLIZ = C1348010lBP.LIZ();
        if (!plusPanelConfigLIZ.enable || isLandscapeMode()) {
            return;
        }
        List<String> list = plusPanelConfigLIZ.plusPanelButtons;
        boolean z2 = true;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            for (String str : list) {
                EnumC1347870lBB.Companion.getClass();
                if (EnumC1347870lBB.byRaw.get(str) == EnumC1347870lBB.GIFT) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        List<String> list2 = plusPanelConfigLIZ.foldButtons;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z2 = false;
        } else {
            for (String str2 : list2) {
                EnumC1347870lBB.Companion.getClass();
                if (EnumC1347870lBB.byRaw.get(str2) == EnumC1347870lBB.GIFT) {
                    break;
                }
            }
            z2 = false;
        }
        if ((z || !z2) && (tuxIconView = this.LLJJJ) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
        Object next;
        KeyboardVMV2 keyboardVMV2Sp = sp();
        keyboardVMV2Sp.getClass();
        keyboardVMV2Sp.withState(new AwS600S0100000_21(keyboardVMV2Sp, 416));
        if (C294170Bfz.LIZ()) {
            String str = C1346760l9O.LIZIZ;
            if (str != null) {
                Iterator it2 = ((ArrayList) C1346760l9O.LIZ).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (Intrinsics.LJFF(((InterfaceC1346750l9N) next).getId(), str)) {
                            break;
                        }
                    }
                }
                InterfaceC1346750l9N interfaceC1346750l9N = (InterfaceC1346750l9N) next;
                if (interfaceC1346750l9N != null) {
                    interfaceC1346750l9N.dismiss();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dismissCurrent: ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C1346760l9O.LIZIZ = null;
            }
        } else {
            C459990I2b c459990I2b = this.LLJLLIL;
            if (c459990I2b != null) {
                C0P0T c0p0t = c459990I2b.LIZJ;
                if (c0p0t != null) {
                    c0p0t.dismiss();
                }
                c459990I2b.LIZJ = null;
            }
            C0P0T c0p0t2 = this.LLLILZ;
            if (c0p0t2 != null) {
                c0p0t2.dismiss();
            }
            this.LLLILZ = null;
        }
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = this.LLLILZLLLI;
        if (aRunnableS121S0100000_21 != null) {
            this.LLLILZJ.removeCallbacks(aRunnableS121S0100000_21);
        }
        this.LLLILZLLLI = null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput
    public final void Up() {
        Aweme aweme;
        super.Up();
        C1342280l2A.LJFF(0, true);
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceKp)) == null || !C1354660lM8.LIZIZ(aweme)) {
            return;
        }
        C1342280l2A.LJ(0, true);
    }

    public final void iq() {
        Context context;
        if (lq() && C294290BgB.LIZJ() && (context = getContext()) != null) {
            int iLIZ = C0HEZ.LIZ(R.attr.a1k, context);
            C1353500lKG c1353500lKG = this.LLJJIJI;
            if (c1353500lKG != null) {
                c1353500lKG.setHintTextColor(iLIZ);
            }
            LinearLayout linearLayout = this.LLJJIJIIJIL;
            if (linearLayout != null) {
                wq(linearLayout);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility
    public final int kC1() {
        return hashCode();
    }

    public void kq() {
        InterfaceC665370Q7z interfaceC665370Q7zLJIL = C1345700l7g.LJIL(this);
        if (interfaceC665370Q7zLJIL != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIL, this, ICommentFakeInputAbility.class, null, null);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            this.LLLJL = Intrinsics.LJFF(interfaceC665370Q7zLJIL, c19egLIZ != null ? C1558360qeg.LJI(c19egLIZ, null) : null);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility
    public final boolean lb0() {
        if (!C294170Bfz.LIZ()) {
            return xq(false) || zq(false);
        }
        EnumC993530bxf enumC993530bxf = EnumC993530bxf.LIST_READY;
        List<InterfaceC1346750l9N> list = C1346760l9O.LIZ;
        if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
            return false;
        }
        for (InterfaceC1346750l9N interfaceC1346750l9N : (ArrayList) list) {
            if (interfaceC1346750l9N.LIZ().getCompareGroup() == enumC993530bxf.getCompareGroup() && interfaceC1346750l9N.LIZ().getScenePriority() < enumC993530bxf.getScenePriority() && interfaceC1346750l9N.LJJLIL()) {
                return true;
            }
        }
        return false;
    }

    public final boolean lq() {
        String str = getConfig().LLILLJJLI;
        return str != null && Intrinsics.LJFF(str, "photo detail");
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput, com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        kq();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC665370Q7z interfaceC665370Q7zLJIL = C1345700l7g.LJIL(this);
        if (interfaceC665370Q7zLJIL != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJIL, ICommentFakeInputAbility.class, null);
        }
        C622680Oba.LIZLLL(this);
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, this);
        this.LLLILZJ.removeCallbacks(this.LLLJ);
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = this.LLLILZLLLI;
        if (aRunnableS121S0100000_21 != null) {
            this.LLLILZJ.removeCallbacks(aRunnableS121S0100000_21);
        }
        this.LLLILZLLLI = null;
        C0P0T c0p0t = this.LLLILZ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        this.LLLILZ = null;
        this.LLJLLIL = null;
        if (C294170Bfz.LIZ()) {
            C1346760l9O.LIZLLL("photo_guide");
            C1346760l9O.LIZLLL("sticker_tip");
        }
    }

    public final void pq() {
        CommentKeyboardModel keyboardModel;
        C1353500lKG c1353500lKG;
        Editable editableLLLZZIL;
        LinearLayout linearLayout;
        CommentKeyboardModel keyboardModel2;
        CharSequence initEditTextContent;
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp == null || (keyboardModel = commentContextSourceKp.getKeyboardModel()) == null || !keyboardModel.getHideIconGroupOnAgentOpenComment()) {
            return;
        }
        CommentContextSource commentContextSourceKp2 = kp();
        if (((commentContextSourceKp2 == null || (keyboardModel2 = commentContextSourceKp2.getKeyboardModel()) == null || (initEditTextContent = keyboardModel2.getInitEditTextContent()) == null || initEditTextContent.length() == 0) && ((c1353500lKG = this.LLJJIJI) == null || (editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B/iQQ75hZheKFWxTo+nd3EM2rThec=", null))) == null || editableLLLZZIL.length() == 0)) || (linearLayout = this.LLJJIJIIJIL) == null) {
            return;
        }
        HandlerHook.viewPost(linearLayout, new ARunnableS121S0100000_21(this, 28));
    }

    public final void qq() {
        if (C294410BgN.LIZIZ() && C1345700l7g.LJI(kp())) {
            C1346790l9R.LIZ.getClass();
            String strLIZLLL = C1552050qUV.LIZLLL("comment_lottie");
            if (strLIZLLL != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZLLL);
                sbLIZ.append(File.separator);
                sbLIZ.append("comment_photo_guide.json");
                try {
                    final C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(new C0VSP(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ))), "comment_photo_guide.json");
                    if (c1292030jj7LJ != null) {
                        c1292030jj7LJ.LIZIZ(new InterfaceC1292040jj8<C1294720jnS>() { // from class: X.0lFq
                            @Override // X.InterfaceC1292040jj8
                            public final void onResult(C1294720jnS c1294720jnS) {
                                C1294720jnS c1294720jnS2 = c1294720jnS;
                                c1292030jj7LJ.LJII(this);
                                if (c1294720jnS2 != null) {
                                    C1295960jpS c1295960jpS = this.LLLIL;
                                    if (c1295960jpS != null) {
                                        c1295960jpS.setComposition(c1294720jnS2);
                                    }
                                    C1295960jpS c1295960jpS2 = this.LLLIL;
                                    if (c1295960jpS2 != null) {
                                        C786410Ut5.Wb(c1295960jpS2, 1.2f);
                                    }
                                    C1295960jpS c1295960jpS3 = this.LLLIL;
                                    if (c1295960jpS3 != null) {
                                        C786410Ut5.vc(c1295960jpS3, 1.2f);
                                    }
                                }
                            }
                        });
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility
    public final void sg0() throws Throwable {
        CommentKeyboardModel keyboardModel;
        CharSequence initEditTextContent;
        CommentContextSource commentContextSourceKp;
        CommentKeyboardModel keyboardModel2;
        CommentKeyboardModel keyboardModel3;
        Editable editableLLLZZIL;
        CommentContextSource commentContextSourceKp2 = kp();
        if (commentContextSourceKp2 == null || (keyboardModel = commentContextSourceKp2.getKeyboardModel()) == null || (initEditTextContent = keyboardModel.getInitEditTextContent()) == null || (commentContextSourceKp = kp()) == null || (keyboardModel2 = commentContextSourceKp.getKeyboardModel()) == null || !keyboardModel2.getHideIconGroupOnAgentOpenComment()) {
            return;
        }
        Editable editableNewEditable = Editable.Factory.getInstance().newEditable(initEditTextContent);
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            c1353500lKG.setText(editableNewEditable);
        }
        C1353500lKG c1353500lKG2 = this.LLJJIJI;
        if (c1353500lKG2 != null) {
            Editable editableLLLZZIL2 = C2204961BRm.LLLZZIL(c1353500lKG2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B/iQQ75hZheKFWxTo+nd3EM2rThec=", null));
            c1353500lKG2.setSelection(editableLLLZZIL2 != null ? editableLLLZZIL2.length() : editableNewEditable.length());
        }
        KeyboardVMV2 keyboardVMV2Sp = sp();
        CommentContextSource commentContextSourceKp3 = kp();
        keyboardVMV2Sp.WQ2(commentContextSourceKp3 != null ? CommentContextSourceKt.aweme(commentContextSourceKp3) : null, editableNewEditable, EnumC1346360l8k.COMMENT_PANEL);
        C1353500lKG c1353500lKG3 = this.LLJJIJI;
        if (c1353500lKG3 != null && (editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B/iQQ75hZheKFWxTo+nd3EM2rThec=", null))) != null) {
            editableNewEditable = editableLLLZZIL;
        }
        Vp(new CommentInputContent("", editableNewEditable, null, null, null));
        pq();
        CommentContextSource commentContextSourceKp4 = kp();
        if (commentContextSourceKp4 == null || (keyboardModel3 = commentContextSourceKp4.getKeyboardModel()) == null) {
            return;
        }
        keyboardModel3.setInitEditTextContent(null);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLLJL;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem
    public final EnumC1346360l8k getInputServiceType() {
        return EnumC1346360l8k.COMMENT_PANEL;
    }

    public static void wq(View view) {
        if (view instanceof TuxIconView) {
            ((TuxIconView) view).setTintColorRes(R.attr.a1k);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                wq(viewGroup.getChildAt(i));
            }
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        if (!C295880Bik.LIZLLL || !C295780Bia.LIZIZ) {
            C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
            if (!C1356320lOo.LIZ(Co())) {
                super.Eo(context);
                return context;
            }
        }
        return LJJIJL().getContext();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility
    public final void Ua2(C1350070lEj c1350070lEj) {
        KeyboardVMV2 keyboardVMV2Sp = sp();
        keyboardVMV2Sp.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeCommentPageHeightStatus ");
        sbLIZ.append(c1350070lEj.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && c1350070lEj.LIZ == EnumC1349980lEa.SHOW_END && keyboardVMV2Sp.getState().LLJJJIL) {
            keyboardVMV2Sp.setState(AFwS259S0000000_21.get$arr$(455));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bc  */
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vp(com.ss.android.ugc.aweme.comment.model.CommentInputContent r7) {
        /*
            r6 = this;
            super.Vp(r7)
            boolean r0 = r6.isLandscapeMode()
            r3 = 0
            r2 = 0
            if (r0 != 0) goto L2d
            r6.aq()
        Le:
            X.0lKG r1 = r6.LLJJIJI
            if (r1 == 0) goto L17
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
        L17:
            X.0lKG r0 = r6.LLJJIJI
            if (r0 == 0) goto L1e
            r0.setInputType(r3)
        L1e:
            X.0lKG r0 = r6.LLJJIJI
            if (r0 == 0) goto L25
            r0.setKeyListener(r2)
        L25:
            X.0lKG r0 = r6.LLJJIJI
            if (r0 == 0) goto L2c
            r0.setMovementMethod(r2)
        L2c:
            return
        L2d:
            if (r7 == 0) goto Lb8
            java.util.List<com.ss.android.ugc.aweme.comment.model.CommentImageModel> r0 = r7.imageList
            if (r0 == 0) goto L71
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L71
            r0 = 0
        L3a:
            r5 = r0 ^ 1
            if (r7 == 0) goto L6f
            com.ss.android.ugc.aweme.comment.model.CommentStickerStruct r0 = r7.stickerStruct
            if (r0 == 0) goto L6f
            r0 = 0
        L43:
            r4 = r0 ^ 1
            if (r7 == 0) goto L6d
            java.util.List<com.ss.android.ugc.aweme.comment.model.AudioCommentModel> r0 = r7.audioList
            if (r0 == 0) goto L6d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6d
            r0 = 0
        L52:
            r1 = r0 ^ 1
            if (r5 == 0) goto L73
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r6.kp()
            if (r0 == 0) goto L6b
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r0.getCommonModel()
            if (r0 == 0) goto L6b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.aweme
        L64:
            boolean r0 = X.C1347740lAy.LIZ(r0, r3)
            if (r0 != 0) goto L73
            goto Le
        L6b:
            r0 = r2
            goto L64
        L6d:
            r0 = 1
            goto L52
        L6f:
            r0 = 1
            goto L43
        L71:
            r0 = 1
            goto L3a
        L73:
            if (r4 == 0) goto L7c
            boolean r0 = com.ss.android.ugc.aweme.experiment.CommentWithStickerExp.LIZIZ()
            if (r0 != 0) goto L7c
            goto Le
        L7c:
            if (r1 == 0) goto L89
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r6.kp()
            boolean r0 = X.C1345700l7g.LJFF(r0)
            if (r0 != 0) goto L89
            goto Le
        L89:
            if (r5 != 0) goto Lad
            if (r4 != 0) goto La2
            if (r1 == 0) goto Lb8
            com.bytedance.tux.input.TuxTextView r1 = r6.LLLIIIIL
            if (r1 == 0) goto L99
            r0 = 2131826733(0x7f11182d, float:1.9286359E38)
            r1.setText(r0)
        L99:
            com.bytedance.tux.input.TuxTextView r0 = r6.LLLIIIIL
            if (r0 == 0) goto Le
            X.C786410Ut5.LLLLZLL(r0, r3)
            goto Le
        La2:
            com.bytedance.tux.input.TuxTextView r1 = r6.LLLIIIIL
            if (r1 == 0) goto L99
            r0 = 2131826735(0x7f11182f, float:1.9286363E38)
            r1.setText(r0)
            goto L99
        Lad:
            com.bytedance.tux.input.TuxTextView r1 = r6.LLLIIIIL
            if (r1 == 0) goto L99
            r0 = 2131826734(0x7f11182e, float:1.928636E38)
            r1.setText(r0)
            goto L99
        Lb8:
            com.bytedance.tux.input.TuxTextView r1 = r6.LLLIIIIL
            if (r1 == 0) goto Le
            r0 = 8
            X.C786410Ut5.LLLLZLL(r1, r0)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentPanelFakeInput.Vp(com.ss.android.ugc.aweme.comment.model.CommentInputContent):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput, com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
        super.bT(aweme);
        if (!this.LLILZ) {
            return;
        }
        Aq();
        iq();
        C723850SaN.LIZLLL(this, new AwS600S0100000_21(this, 52));
        View view = this.LLLIIII;
        if (view != null) {
            C12ES.LJIILL(0, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput
    public final void fq(EnumC1341660l1A enumC1341660l1A) {
        super.fq(enumC1341660l1A);
        if (enumC1341660l1A == EnumC1341660l1A.AVAILABLE) {
            pq();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateInputViewStatus  ");
        sbLIZ.append(enumC1341660l1A);
        C1344030l4z.LIZJ("CommentPanelFakeInput", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateInputViewStatus  ");
        sbLIZ2.append(enumC1341660l1A);
        C1344030l4z.LIZJ("CommentInputCheck", C2188811AlT.LIZIZ(sbLIZ2));
        int i = C1340160kyk.LIZ[enumC1341660l1A.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        } else {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
        }
    }

    public final void jq(Assembler assembler) {
        Aweme aweme;
        int followStatus;
        Boolean boolValueOf;
        User author;
        AwemeStatistics statistics;
        CommentKeyboardModel keyboardModel;
        Aweme aweme2;
        CommentKeyboardModel keyboardModel2;
        Long lValueOf;
        AwemeStatistics statistics2;
        AwemeStatistics statistics3;
        View viewFindViewById = LJJIJL().findViewById(R.id.odz);
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        CommentContextSource commentContextSourceKp = kp();
        Long lValueOf2 = null;
        if (commentContextSourceKp != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
        } else {
            aweme = null;
        }
        if (aweme != null) {
            if (((Number) C258670ABt.LIZ.getValue()).intValue() == 0 || (statistics3 = aweme.getStatistics()) == null || statistics3.getCommentCount() == 0 || AwemeExtKt.getFollowStatus(aweme) == 2) {
                if (aweme != null) {
                    followStatus = AwemeExtKt.getFollowStatus(aweme);
                } else {
                    followStatus = 0;
                }
                if (C296140BjA.LIZ(followStatus)) {
                    if (aweme != null && (statistics2 = aweme.getStatistics()) != null) {
                        lValueOf = Long.valueOf(statistics2.getCommentCount());
                    } else {
                        lValueOf = null;
                    }
                    if (C1346420l8q.LJFF(lValueOf) > 0) {
                        return;
                    }
                }
                C1348710lCX.LIZ.getClass();
                if (C1348710lCX.LIZ()) {
                    return;
                }
                CommentContextSource commentContextSourceKp2 = kp();
                if (commentContextSourceKp2 != null && (keyboardModel2 = commentContextSourceKp2.getKeyboardModel()) != null) {
                    boolValueOf = Boolean.valueOf(keyboardModel2.getForceDisableExposedEmoji());
                } else {
                    boolValueOf = null;
                }
                if (!C1346420l8q.LIZ(boolValueOf) && !PersonalizedEmojiExperiment.LIZ()) {
                    CommentContextSource commentContextSourceKp3 = kp();
                    if (commentContextSourceKp3 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp3)) != null) {
                        author = aweme2.getAuthor();
                    } else {
                        author = null;
                    }
                    if (!C1868390yij.LIZ(author)) {
                        CommentContextSource commentContextSourceKp4 = kp();
                        if ((commentContextSourceKp4 != null && (keyboardModel = commentContextSourceKp4.getKeyboardModel()) != null && keyboardModel.getHideExposedEmojiInNonePanel()) || !C1348690lCV.LIZ(CommentContextSourceKt.aweme(kp()))) {
                            return;
                        }
                        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
                            lValueOf2 = Long.valueOf(statistics.getCommentCount());
                        }
                        if (C1346420l8q.LJFF(lValueOf2) == 0) {
                            C1340510kzJ c1340510kzJ = C1340510kzJ.LIZ;
                            CommentContextSource commentContextSourceKp5 = kp();
                            c1340510kzJ.getClass();
                            if (C1340510kzJ.LIZIZ(commentContextSourceKp5)) {
                                return;
                            }
                        }
                        C786410Ut5.LJLLLLLL(0, viewFindViewById);
                        assembler.RQ2(this, AFwS257S0000000_19.get$arr$(88));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem
    public final String mp(boolean z) {
        boolean z2;
        boolean z3;
        if (lq()) {
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
            C1346580l96 c1346580l96 = C1346580l96.LIZ;
            C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL(this);
            CommentContextSource commentContextSourceKp = kp();
            Comment comment = this.LLLFF;
            c1346580l96.getClass();
            return C1346580l96.LIZ(c19egLJIILLIIL, commentContextSourceKp, comment, z5, z, z6, z7, true);
        }
        return super.mp(z);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onInnerAddAICreatePhoto(C0SVO c0svo) {
        Integer num;
        String str;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        CommentCommonModel commonModel4;
        CommentCommonModel commonModel5;
        if (c0svo == null || lq() || Intrinsics.LJFF(c0svo.LJ, "graphic_detail")) {
            return;
        }
        Integer numValueOf = Integer.valueOf(c0svo.LJFF);
        CommentContextSource commentContextSourceKp = kp();
        Aweme aweme = null;
        if (commentContextSourceKp != null && (commonModel5 = commentContextSourceKp.getCommonModel()) != null) {
            num = commonModel5.panelSessionCode;
        } else {
            num = null;
        }
        if (!Intrinsics.LJFF(numValueOf, num)) {
            return;
        }
        C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL(this);
        CommentContextSource commentContextSourceKp2 = kp();
        if (commentContextSourceKp2 != null && (commonModel4 = commentContextSourceKp2.getCommonModel()) != null) {
            aweme = commonModel4.aweme;
        }
        CommentContextSource commentContextSourceKp3 = kp();
        if (commentContextSourceKp3 == null || (commonModel3 = commentContextSourceKp3.getCommonModel()) == null || (str = commonModel3.enterFrom) == null) {
            str = "";
        }
        if (C0SYU.LIZIZ(c19egLJIILLIIL, aweme, str, "click_comment_photo", kp())) {
            return;
        }
        CommentContextSource commentContextSourceKp4 = kp();
        if (commentContextSourceKp4 != null && (commonModel2 = commentContextSourceKp4.getCommonModel()) != null) {
            commonModel2.setCreateAIPhotoFromInnerPage(true);
        }
        CommentContextSource commentContextSourceKp5 = kp();
        if (commentContextSourceKp5 != null && (commonModel = commentContextSourceKp5.getCommonModel()) != null) {
            Intent intent = c0svo.LIZ;
            int i = c0svo.LIZJ;
            commonModel.setInnerCreateAIPhotoCache(new PhotoCacheModel(intent, i, i, c0svo.LIZLLL, c0svo.LJ, c0svo.LJFF));
        }
        BaseFakeInput.Xp(this, EnumC1341680l1C.CREATE_IMAGE, null, null, null, 14);
    }

    @C14EU
    public final void onInnerAddPhoto(C0SVN c0svn) throws Throwable {
        Integer num;
        Aweme aweme;
        String str;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        CommentCommonModel commonModel4;
        CommentCommonModel commonModel5;
        if (c0svn == null || lq() || Intrinsics.LJFF(c0svn.LJ, "graphic_detail")) {
            return;
        }
        Integer numValueOf = Integer.valueOf(c0svn.LJFF);
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp != null && (commonModel5 = commentContextSourceKp.getCommonModel()) != null) {
            num = commonModel5.panelSessionCode;
        } else {
            num = null;
        }
        if (!Intrinsics.LJFF(numValueOf, num)) {
            return;
        }
        C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL(this);
        CommentContextSource commentContextSourceKp2 = kp();
        if (commentContextSourceKp2 != null && (commonModel4 = commentContextSourceKp2.getCommonModel()) != null) {
            aweme = commonModel4.aweme;
        } else {
            aweme = null;
        }
        CommentContextSource commentContextSourceKp3 = kp();
        if (commentContextSourceKp3 == null || (commonModel3 = commentContextSourceKp3.getCommonModel()) == null || (str = commonModel3.enterFrom) == null) {
            str = "";
        }
        if (C0SYU.LIZIZ(c19egLJIILLIIL, aweme, str, "click_comment_photo", kp())) {
            return;
        }
        CommentContextSource commentContextSourceKp4 = kp();
        if (commentContextSourceKp4 != null && (commonModel2 = commentContextSourceKp4.getCommonModel()) != null) {
            commonModel2.setChoosePhotoFromInnerPage(true);
        }
        CommentContextSource commentContextSourceKp5 = kp();
        if (commentContextSourceKp5 != null && (commonModel = commentContextSourceKp5.getCommonModel()) != null) {
            Intent intent = c0svn.LIZ;
            int i = c0svn.LIZJ;
            commonModel.setInnerChoosePhotoCache(new PhotoCacheModel(intent, i, i, c0svn.LIZLLL, c0svn.LJ, c0svn.LJFF));
        }
        BaseFakeInput.Xp(this, EnumC1341680l1C.PHOTO, null, null, null, 14);
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B/iQQ75hZheKFWxTo+nd3EM2rThec=", null));
        }
        C1350920lG6.LJJLIIIJJI(CommentContextSourceKt.enterFrom(kp()), CommentContextSourceKt.aweme(kp()), true, sp().HQ2(), false, C1347720lAw.LJIILL(this.LLLFF));
    }

    @C14EU
    public final void onUseStickerSet(C443950Haz c443950Haz) {
        StickerSetInfo stickerSetInfo;
        StickerSetInfo stickerSetInfo2;
        if (c443950Haz != null && (stickerSetInfo = c443950Haz.LIZ) != null && stickerSetInfo.fakeInputHash != null) {
            if (c443950Haz != null && (stickerSetInfo2 = c443950Haz.LIZ) != null) {
                Integer num = stickerSetInfo2.fakeInputHash;
                int iHashCode = hashCode();
                if (num == null || num.intValue() != iHashCode) {
                    return;
                }
            } else {
                return;
            }
        }
        if (lq()) {
            vq(c443950Haz);
        } else if (tq()) {
            vq(c443950Haz);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput, com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) throws Throwable {
        Boolean boolValueOf;
        CommentContextSource commentContextSourceKp;
        CommentCommonModel commonModel;
        View view2;
        CommentCommonModel commonModel2;
        TuxIconView tuxIconView;
        CommentKeyboardModel keyboardModel;
        Comment enterComment;
        String cid;
        Comment enterComment2;
        super.onViewCreated(view);
        this.LLLIL = (C1295960jpS) view.findViewById(R.id.kcm);
        if (isLandscapeMode()) {
            this.LLLIIIIL = (TuxTextView) view.findViewById(R.id.eco);
        }
        sg0();
        if (lq()) {
            KeyboardVMV2 keyboardVMV2Sp = sp();
            C1340340kz2 c1340340kz2 = this.LLLIIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLL;
            C1344550l5p c1344550l5pLIZ = c1340340kz2.LIZ(this);
            if (c1344550l5pLIZ != null) {
                enterComment = c1344550l5pLIZ.getEnterComment();
            } else {
                enterComment = null;
            }
            keyboardVMV2Sp.getClass();
            if (enterComment != null) {
                keyboardVMV2Sp.setState(new AwS600S0100000_21(enterComment, 415));
                keyboardVMV2Sp.LLILZ.LJIIIZ(-1);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set reply comment +");
            C1344550l5p c1344550l5pLIZ2 = this.LLLIIL.LIZ(this);
            if (c1344550l5pLIZ2 != null && (enterComment2 = c1344550l5pLIZ2.getEnterComment()) != null) {
                cid = enterComment2.getCid();
            } else {
                cid = null;
            }
            sbLIZ.append(cid);
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1344550l5p.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                interfaceC1555100qZQLIZIZ.LIZ(new AfS190S0100000_21(this, 5));
            }
        } else {
            C723850SaN.LIZLLL(this, new AwS600S0100000_21(this, 51));
        }
        CommentContextSource commentContextSourceKp2 = kp();
        if (commentContextSourceKp2 != null && (keyboardModel = commentContextSourceKp2.getKeyboardModel()) != null) {
            boolValueOf = Boolean.valueOf(keyboardModel.getForceDisableMention());
        } else {
            boolValueOf = null;
        }
        if (C1346420l8q.LIZJ(boolValueOf) && !lq() && (tuxIconView = this.LLJJJJ) != null) {
            C786410Ut5.LJLLLLLL(8, tuxIconView);
        }
        Aq();
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0l9M
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLILZIL;
            }
        }, null, new AwS635S0100000_21(this, 24), 6);
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0l9L
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJJJIL);
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 25), 4);
        if (CommentWithStickerExp.LIZIZ() && CommentWithStickerExp.LIZ()) {
            CommentContextSource commentContextSourceKp3 = kp();
            if (commentContextSourceKp3 != null && (commonModel2 = commentContextSourceKp3.getCommonModel()) != null) {
                commonModel2.setCommentStickerUniqueId(String.valueOf(hashCode()));
            }
            AssemViewModel value = this.LLLIIIL.getValue();
            this.LLLJIL = subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new AwS635S0100000_21(this, 208));
        }
        sp().QQ2(C1345700l7g.LJIILLIIL(this), kp());
        if ((C0BKP.LIZ() == 2 || C0BKP.LIZ() == 3) && (((commentContextSourceKp = kp()) == null || (commonModel = commentContextSourceKp.getCommonModel()) == null || !commonModel.isPreCreate()) && !this.LLLIZZ)) {
            this.LLLIZZ = true;
            C1344030l4z.LIZJ("CommentPanelFakeInput", "scheduleKeyboardPreWarm: registered idle handler");
            C786410Ut5.f3(new C1402080mac(this, 3), Looper.myQueue());
        }
        C1346810l9T c1346810l9TLp = lp();
        boolean z = c1346810l9TLp.LJFF;
        if (z) {
            C1346820l9U.LIZ(z, c1346810l9TLp.LJIIL, c1346810l9TLp.LJIILL, c1346810l9TLp.LJIILLIIL, c1346810l9TLp.LJIJ, c1346810l9TLp.LJIIZILJ);
        }
        this.LLLIIII = view.findViewById(R.id.ksa);
        if (lq()) {
            Context context = getContext();
            if (context != null && (view2 = this.LLLIIII) != null) {
                view2.setBackgroundColor(C0HEZ.LIZ(R.attr.zm, context));
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1344550l5p.class, null);
            if (interfaceC1555100qZQLIZIZ2 != null) {
                interfaceC1555100qZQLIZIZ2.LIZ(new AfS190S0100000_21(this, 32));
            }
        } else {
            qq();
        }
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL != null) {
            HandlerHook.viewPost(viewLJJIJL, new ARunnableS121S0100000_21(this, 29));
        }
        if (C294170Bfz.LIZ() && !lq()) {
            final AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 1623);
            final AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 3388);
            final AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(this, 1626);
            final AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21(this, 1628);
            final AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(this, 1630);
            final AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(this, 1632);
            C1346760l9O.LIZIZ(new InterfaceC1346750l9N(awS565S0100000_21, awS563S0100000_19, awS565S0100000_212, awS565S0100000_213, awS565S0100000_214, awS565S0100000_215) { // from class: X.0l6e
                public final Function0<Aweme> LIZ;
                public final Function0<Boolean> LIZIZ;
                public final Function0<Boolean> LIZJ;
                public final Function0<Boolean> LIZLLL;
                public final Function0<Boolean> LJ;
                public final Function0<Unit> LJFF;
                public final EnumC993530bxf LJI = EnumC993530bxf.PANEL_EXPAND;

                @Override // X.InterfaceC1346750l9N
                public final String getId() {
                    return "photo_guide";
                }

                @Override // X.InterfaceC1346750l9N
                public final int getPriority() {
                    return 1;
                }

                @Override // X.InterfaceC1346750l9N
                public final boolean LJJLIL() {
                    AwemeStatistics statistics;
                    if (this.LIZIZ.invoke().booleanValue()) {
                        return false;
                    }
                    Aweme awemeInvoke = this.LIZ.invoke();
                    CommentService.LIZ.getClass();
                    if (C523420Kfs.LIZ().LJJIJIIJIL(awemeInvoke)) {
                        C1348710lCX.LIZ.getClass();
                        if (C1348710lCX.LIZ() || C523420Kfs.LIZ().LJIILLIIL(awemeInvoke) || !((awemeInvoke == null || (statistics = awemeInvoke.getStatistics()) == null || statistics.getCommentCount() != 0) && this.LIZJ.invoke().booleanValue())) {
                            return false;
                        }
                        C01GW c01gw = C286060BJc.LIZ;
                        if (((Number) c01gw.getValue()).intValue() > 2) {
                            return (awemeInvoke == null || !C1354660lM8.LIZIZ(awemeInvoke)) ? C1342280l2A.LIZLLL() : C1342280l2A.LIZJ(awemeInvoke);
                        }
                        if (!C294410BgN.LIZIZ() || !this.LIZLLL.invoke().booleanValue()) {
                            return false;
                        }
                        if (awemeInvoke != null && C1354660lM8.LIZIZ(awemeInvoke)) {
                            return C1342280l2A.LIZJ(awemeInvoke);
                        }
                        if (((Number) c01gw.getValue()).intValue() > 1) {
                            return C1342280l2A.LIZLLL();
                        }
                        if (((Number) c01gw.getValue()).intValue() != 1) {
                            return C294410BgN.LIZ(true);
                        }
                        if (!C1342280l2A.LIZJ) {
                            return false;
                        }
                        long j = C1342280l2A.LIZLLL.getLong("COMMENT_PHOTO_GUIDE_SHOW_OLD_STRATEGY", 0L);
                        if (j != 0) {
                            return j != -1 && ((double) (System.currentTimeMillis() - j)) / 8.64E7d >= 7.0d;
                        }
                        return true;
                    }
                    return false;
                }

                @Override // X.InterfaceC1346750l9N
                public final void dismiss() {
                    this.LJFF.invoke();
                }

                @Override // X.InterfaceC1346750l9N
                public final boolean show() {
                    return this.LJ.invoke().booleanValue();
                }

                @Override // X.InterfaceC1346750l9N
                public final EnumC993530bxf LIZ() {
                    return this.LJI;
                }

                {
                    this.LIZ = awS565S0100000_21;
                    this.LIZIZ = awS563S0100000_19;
                    this.LIZJ = awS565S0100000_212;
                    this.LIZLLL = awS565S0100000_213;
                    this.LJ = awS565S0100000_214;
                    this.LJFF = awS565S0100000_215;
                }
            });
            final AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(this, 1634);
            final AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(this, 3389);
            final AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(this, 1636);
            final AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(this, 1620);
            final AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(this, 1621);
            final AwS565S0100000_21 awS565S0100000_2110 = new AwS565S0100000_21(this, 1622);
            C1346760l9O.LIZIZ(new InterfaceC1346750l9N(awS565S0100000_216, awS563S0100000_192, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219, awS565S0100000_2110) { // from class: X.0l9K
                public final Function0<Aweme> LIZ;
                public final Function0<Boolean> LIZIZ;
                public final Function0<Boolean> LIZJ;
                public final Function0<Boolean> LIZLLL;
                public final Function0<Boolean> LJ;
                public final Function0<Unit> LJFF;
                public final EnumC993530bxf LJI = EnumC993530bxf.PANEL_EXPAND;

                @Override // X.InterfaceC1346750l9N
                public final String getId() {
                    return "sticker_tip";
                }

                @Override // X.InterfaceC1346750l9N
                public final int getPriority() {
                    return 2;
                }

                @Override // X.InterfaceC1346750l9N
                public final boolean LJJLIL() {
                    Aweme awemeInvoke;
                    AwemeStatistics statistics;
                    if (this.LIZIZ.invoke().booleanValue() || !this.LIZJ.invoke().booleanValue() || this.LIZLLL.invoke().booleanValue() || (awemeInvoke = this.LIZ.invoke()) == null || (statistics = awemeInvoke.getStatistics()) == null || statistics.getCommentCount() <= 0 || !CommentWithStickerExp.LIZIZ()) {
                        return false;
                    }
                    C0I05.LIZ.getClass();
                    if (C0I05.LJII()) {
                        return false;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C0I05.LIZLLL == -1) {
                        C0I05.LIZLLL = C0I05.LIZIZ().getLong("sticker_tip_show_time", 0L);
                    }
                    return jCurrentTimeMillis - C0I05.LIZLLL > 86400000 && C0I05.LJI() < 3;
                }

                @Override // X.InterfaceC1346750l9N
                public final void dismiss() {
                    this.LJFF.invoke();
                }

                @Override // X.InterfaceC1346750l9N
                public final boolean show() {
                    return this.LJ.invoke().booleanValue();
                }

                @Override // X.InterfaceC1346750l9N
                public final EnumC993530bxf LIZ() {
                    return this.LJI;
                }

                {
                    this.LIZ = awS565S0100000_216;
                    this.LIZIZ = awS563S0100000_192;
                    this.LIZJ = awS565S0100000_217;
                    this.LIZLLL = awS565S0100000_218;
                    this.LJ = awS565S0100000_219;
                    this.LJFF = awS565S0100000_2110;
                }
            });
        }
        iq();
    }

    public final void vq(C443950Haz c443950Haz) {
        StickerSetInfo stickerSetInfo;
        Integer num;
        int iIntValue;
        if (c443950Haz != null && (stickerSetInfo = c443950Haz.LIZ) != null && (num = stickerSetInfo.stickerType) != null && (iIntValue = num.intValue()) != 5) {
            if (this.LLJLLIL != null) {
                int iLIZJ = CommentWithStickerExp.LIZJ();
                if (iLIZJ == EnumC454020HrE.ONLY_COMMENT.getType()) {
                    C0I05.LJIIIIZZ(C0I05.LIZ, iIntValue);
                } else if (iLIZJ == EnumC454020HrE.MEMORY_COMMENT_AND_DM.getType()) {
                    IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LJIIIZ().Dg(iIntValue);
                }
            }
            C786410Ut5.LJLIIL(150L, this.LLLILZJ, new ARunnableS121S0100000_21(this, 30));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        if (r13 == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean xq(boolean r13) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentPanelFakeInput.xq(boolean):boolean");
    }

    public final boolean yq(boolean z) {
        boolean z2;
        Aweme aweme;
        boolean zLIZ;
        int i;
        Aweme aweme2;
        String aid;
        TuxIconView tuxIconView;
        Aweme aweme3;
        Aweme aweme4;
        C0P0T c0p0t = this.LLLILZ;
        if (c0p0t != null && c0p0t.isShowing()) {
            return true;
        }
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp != null && (aweme4 = CommentContextSourceKt.aweme(commentContextSourceKp)) != null && C1354660lM8.LIZIZ(aweme4)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            zLIZ = C1342280l2A.LIZIZ(z);
        } else {
            float f = C1342280l2A.LIZ;
            CommentContextSource commentContextSourceKp2 = kp();
            if (commentContextSourceKp2 != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceKp2);
            } else {
                aweme = null;
            }
            zLIZ = C1342280l2A.LIZ(aweme, z);
        }
        if (!zLIZ) {
            return false;
        }
        if (!z) {
            return true;
        }
        C0P0T c0p0t2 = this.LLLILZ;
        if (c0p0t2 != null) {
            c0p0t2.dismiss();
        }
        this.LLLILZ = null;
        CommentContextSource commentContextSourceKp3 = kp();
        if (commentContextSourceKp3 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceKp3)) != null && C1354660lM8.LIZIZ(aweme3)) {
            if (C255830A0v.LIZ() != 0 && C255830A0v.LIZ() == 1) {
                i = 2131837124;
            } else {
                i = 2131837123;
            }
        } else {
            i = 2131839790;
        }
        Context context = getContext();
        if (context != null && (tuxIconView = this.LLJJIJIL) != null) {
            C450720Hlu c450720Hlu = new C450720Hlu(context);
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = tuxIconView;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c450720Hlu.LJIIJ(i);
            c450720Hlu.LJIIIZ(true, new ACListenerS155S0100000_21(this, 23));
            this.LLLILZ = c450720Hlu.LIZIZ();
        }
        C0P0T c0p0t3 = this.LLLILZ;
        if (c0p0t3 != null) {
            c0p0t3.show();
        }
        CommentContextSource commentContextSourceKp4 = kp();
        if (commentContextSourceKp4 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp4)) != null && (aid = aweme2.getAid()) != null) {
            C1342280l2A.LJ.add(aid);
        }
        return true;
    }

    public final boolean zq(boolean z) {
        TuxIconView tuxIconView;
        Aweme aweme;
        Boolean boolValueOf;
        AwemeStatistics statistics;
        C459990I2b c459990I2b;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || (tuxIconView = this.LLJJJIL) == null || tuxIconView.getVisibility() != 0) {
            return false;
        }
        String str = null;
        if (this.LLJLLIL != null) {
            CommentContextSource commentContextSourceKp = kp();
            if (commentContextSourceKp != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceKp2 = kp();
            if (commentContextSourceKp2 != null && (commonModel2 = commentContextSourceKp2.getCommonModel()) != null) {
                boolValueOf = Boolean.valueOf(commonModel2.isLandscapeMode());
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE) && aweme != null && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() > 0 && CommentWithStickerExp.LIZIZ()) {
                C0I05.LIZ.getClass();
                if (!C0I05.LJII()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C0I05.LIZLLL == -1) {
                        C0I05.LIZLLL = C0I05.LIZIZ().getLong("sticker_tip_show_time", 0L);
                    }
                    if (jCurrentTimeMillis - C0I05.LIZLLL > 86400000 && C0I05.LJI() < 3) {
                        if (z && (c459990I2b = this.LLJLLIL) != null) {
                            CommentContextSource commentContextSourceKp3 = kp();
                            if (commentContextSourceKp3 != null && (commonModel = commentContextSourceKp3.getCommonModel()) != null) {
                                str = commonModel.enterFrom;
                            }
                            TuxIconView tuxIconView2 = c459990I2b.LIZ;
                            if (tuxIconView2 != null) {
                                HandlerHook.viewPost(tuxIconView2, new ARunnableS11S1100000_6(c459990I2b, str, 5));
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem
    public final void Bp(String str, boolean z) {
        Editable editableLLLZZIL;
        if (C724240Sb0.LIZ(this) != null) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && c19egLIZ.isDestroyed()) {
                return;
            }
            C1353500lKG c1353500lKG = this.LLJJIJI;
            if ((c1353500lKG == null || (editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B/iQQ75hZheKFWxTo+nd3EM2rThec=", null))) == null || editableLLLZZIL.length() == 0) && lq()) {
                C1353500lKG c1353500lKG2 = this.LLJJIJI;
                if (c1353500lKG2 == null) {
                    return;
                }
                c1353500lKG2.setHint(mp(z));
                return;
            }
            super.Bp(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput
    public final C1346920l9e Tp(EnumC1341680l1C enumC1341680l1C, CommentStickerStruct commentStickerStruct) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        CommentKeyboardModel keyboardModel;
        CommentKeyboardModel keyboardModel2;
        CommentKeyboardModel keyboardModel3;
        Boolean boolValueOf3;
        CommentKeyboardModel keyboardModel4;
        CommentKeyboardModel keyboardModel5;
        Boolean boolValueOf4 = null;
        if (lq()) {
            CommentContextSource commentContextSourceKp = kp();
            if (commentContextSourceKp != null && (keyboardModel5 = commentContextSourceKp.getKeyboardModel()) != null) {
                boolValueOf3 = Boolean.valueOf(keyboardModel5.getForceDisableExposedEmoji());
            } else {
                boolValueOf3 = null;
            }
            boolean zLIZJ = C1346420l8q.LIZJ(boolValueOf3);
            CommentContextSource commentContextSourceKp2 = kp();
            if (commentContextSourceKp2 != null && (keyboardModel4 = commentContextSourceKp2.getKeyboardModel()) != null) {
                boolValueOf4 = Boolean.valueOf(keyboardModel4.getForceDisableMention());
            }
            return new C1346920l9e(false, false, false, false, zLIZJ, C1346420l8q.LIZJ(boolValueOf4), EnumC1346360l8k.COMMENT_PANEL, 0, enumC1341680l1C, false, new C1346910l9d("", null, commentStickerStruct, 0, EnumC1341680l1C.TEXT, "", null, "", null, ""), false);
        }
        CommentContextSource commentContextSourceKp3 = kp();
        if (commentContextSourceKp3 != null && (keyboardModel3 = commentContextSourceKp3.getKeyboardModel()) != null) {
            boolValueOf = Boolean.valueOf(keyboardModel3.isLandscapeMode());
        } else {
            boolValueOf = null;
        }
        boolean zLIZJ2 = C1346420l8q.LIZJ(boolValueOf);
        CommentContextSource commentContextSourceKp4 = kp();
        if (commentContextSourceKp4 != null && (keyboardModel2 = commentContextSourceKp4.getKeyboardModel()) != null) {
            boolValueOf2 = Boolean.valueOf(keyboardModel2.getForceDisableExposedEmoji());
        } else {
            boolValueOf2 = null;
        }
        boolean zLIZJ3 = C1346420l8q.LIZJ(boolValueOf2);
        CommentContextSource commentContextSourceKp5 = kp();
        if (commentContextSourceKp5 != null && (keyboardModel = commentContextSourceKp5.getKeyboardModel()) != null) {
            boolValueOf4 = Boolean.valueOf(keyboardModel.getForceDisableMention());
        }
        return new C1346920l9e(false, zLIZJ2, false, false, zLIZJ3, C1346420l8q.LIZJ(boolValueOf4), EnumC1346360l8k.COMMENT_PANEL, 0, enumC1341680l1C, false, new C1346910l9d("", null, commentStickerStruct, 0, EnumC1341680l1C.TEXT, "", null, "", null, ""), false);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility
    public final void V8(String str, String str2) {
        String str3 = str2;
        String str4 = str;
        if (str4 == null) {
            str4 = "click_input_box";
        }
        if (str3 == null) {
            str3 = "";
        }
        BaseFakeInput.Xp(this, null, str4, str3, null, 9);
    }
}
