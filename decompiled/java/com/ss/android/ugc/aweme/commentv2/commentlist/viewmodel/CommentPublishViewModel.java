package com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel;

import X.AbstractC1049450dPr;
import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C036E;
import X.C03H5;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09YA;
import X.C0AF1;
import X.C0O8X;
import X.C0SYU;
import X.C0TUM;
import X.C0XQ7;
import X.C0XTN;
import X.C0ZP4;
import X.C10EU;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1340400kz8;
import X.C1340410kz9;
import X.C1340420kzA;
import X.C1340430kzB;
import X.C1340440kzC;
import X.C1342260l28;
import X.C1342780l2y;
import X.C1344030l4z;
import X.C1344080l54;
import X.C1344110l57;
import X.C1344130l59;
import X.C1344420l5c;
import X.C1344530l5n;
import X.C1344860l6K;
import X.C1345110l6j;
import X.C1345120l6k;
import X.C1345150l6n;
import X.C1345170l6p;
import X.C1345430l7F;
import X.C1345700l7g;
import X.C1345760l7m;
import X.C1346420l8q;
import X.C1346550l93;
import X.C1348690lCV;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1352020lHs;
import X.C1353700lKa;
import X.C1354540lLw;
import X.C1354580lM0;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1498560p6E;
import X.C1558520qew;
import X.C15O7;
import X.C1770850wBP;
import X.C1906580ziK;
import X.C19474211Gy;
import X.C19719512Dh;
import X.C19EG;
import X.C19EH;
import X.C20600815jK;
import X.C20642515q3;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2208181Bbc;
import X.C2214201BlK;
import X.C2217381BqS;
import X.C2279851ELn;
import X.C23250099c;
import X.C23260099m;
import X.C2344009Gk;
import X.C259800zU;
import X.C452070Ho5;
import X.C452501pT;
import X.C523420Kfs;
import X.C722650SWh;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C756302xN;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1342450l2R;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2207911BbB;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACallableS426S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.comment.experiment.CommentImagePublishOptExp;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.ui.GiftAnimationFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IAudioEditAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IGiftSelectAbility;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.comment.quickmention.IQuickMentionLogicAbility;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS128S0101000_21;
import kotlin.jvm.internal.AwS230S0300000_21;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPublishViewModel extends AssemViewModel<C722650SWh> implements ICommentPublishViewModelAbility, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final Set<Integer> LLJJIJIL;
    public InterfaceC665370Q7z LLILLJJLI;
    public Fragment LLILLL;
    public final C736950SvV LLIZLLLIL;
    public final Map<String, C1345120l6k> LLJ;
    public Comment LLJI;
    public Comment LLJIJIL;
    public int LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public TuxSheet LLJJ;
    public int LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(224));
    public final C1342260l28 LLILZ = new C1342260l28(new AwS565S0100000_21(this, 507));
    public final C09YA LLILZIL = new C09YA(this, AFwS209S0000000_21.get$arr$(223));
    public final C09YA LLILZLL = new C09YA(this, AFwS209S0000000_21.get$arr$(222));
    public final C09YA LLIZ = new C09YA(this, AFwS209S0000000_21.get$arr$(221));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentPublishViewModel.class, "source", "getSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = C13LQ.LJLIIL(new Integer[]{0, 2});
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0l2l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C442480HWs) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 56), 4);
    }

    public final boolean CQ2() {
        ICommentPageContainer iCommentPageContainer;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
        if (interfaceC665370Q7z != null && (iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(interfaceC665370Q7z, ICommentPageContainer.class, null)) != null) {
            return iCommentPageContainer.l91();
        }
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        Fragment fragment = this.LLILLL;
        return commentServiceLIZ.LLFFF(fragment != null ? fragment.getContext() : null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C722650SWh(null);
    }

    public final Map<EnumC1342450l2R, C20600815jK<InterfaceC1891350zJl>> wQ2() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL;
        Aweme aweme;
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL2;
        InterfaceC665370Q7z interfaceC665370Q7z2 = this.LLILLJJLI;
        String aid = (interfaceC665370Q7z2 == null || (iCommentListAssemAbilityLIZLLL2 = C1345760l7m.LIZLLL(this.LLILLL, interfaceC665370Q7z2)) == null) ? null : iCommentListAssemAbilityLIZLLL2.getAid();
        CommentContextSource commentContextSourceYQ2 = yQ2();
        if (!Intrinsics.LJFF(aid, (commentContextSourceYQ2 == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceYQ2)) == null) ? null : aweme.getAid()) || (interfaceC665370Q7z = this.LLILLJJLI) == null || (iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(this.LLILLL, interfaceC665370Q7z)) == null) {
            return null;
        }
        return iCommentListAssemAbilityLIZLLL.Nk1();
    }

    public final CommentContextSource yQ2() {
        C1342260l28 c1342260l28 = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return c1342260l28.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentPublishViewModel() {
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(CommentSyncSharedVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS259S0000000_21.get$arr$(133), null, null, null);
        this.LLJ = new LinkedHashMap();
        this.LLJILJILJ = "";
        new LinkedHashMap();
        this.LLJJIII = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(220));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        CommentImagePublishOptExp.CommentImagePublishOptConfig commentImagePublishOptConfigLIZLLL = CommentImagePublishOptExp.LIZLLL();
        if (commentImagePublishOptConfigLIZLLL == null || commentImagePublishOptConfigLIZLLL.enableUploadInstanceReuse <= 0) {
            return;
        }
        ((C2208181Bbc) this.LL.getValue()).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentPublishViewModelAbility
    public final List<Comment> CW0(String str) {
        boolean z = C1344420l5c.LIZ;
        if (!C1344420l5c.LIZ) {
            return null;
        }
        LinkedHashMap<String, List<Comment>> linkedHashMap = C1344420l5c.LIZIZ;
        List<Comment> list = linkedHashMap.get(str);
        linkedHashMap.clear();
        return list;
    }

    public final void NQ2(int i) {
        runOnUIThread(new AwS128S0101000_21(this, i, 1));
    }

    public final void OQ2(CommentSurpriseStruct commentSurpriseStruct) {
        Context context = null;
        if (commentSurpriseStruct != null && commentSurpriseStruct.commentSurprise != null) {
            C1352020lHs.LIZJ(commentSurpriseStruct.commentSurprise);
            if (CQ2()) {
                CommentService.LIZ.getClass();
                CommentService commentServiceLIZ = C523420Kfs.LIZ();
                Fragment fragment = this.LLILLL;
                if (fragment != null) {
                    context = fragment.getContext();
                }
                commentServiceLIZ.LJLLJ(context, commentSurpriseStruct);
                return;
            }
            C1352020lHs.LIZIZ(commentSurpriseStruct, Boolean.FALSE, "comment_close");
        }
    }

    public final C1345120l6k xQ2(String str) {
        return (C1345120l6k) ((LinkedHashMap) this.LLJ).get(str);
    }

    public static void KQ2(C0O8X c0o8x, CommentResponse commentResponse) {
        Comment comment;
        c0o8x.LIZ();
        c0o8x.LIZLLL(commentResponse);
        String cid = null;
        if (commentResponse != null && (comment = commentResponse.comment) != null) {
            cid = comment.getCid();
        }
        c0o8x.LIZJ(cid, "cid");
        c0o8x.LJFF();
    }

    public static void LQ2(C0O8X c0o8x, Throwable th) {
        C844470XAv.LIZ.getClass();
        int iLIZ = C1498560p6E.LIZ(C844470XAv.LIZ(), th);
        c0o8x.LJI(iLIZ);
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C1344530l5n.LIZ.getClass();
                C1344530l5n.LIZ(iLIZ, "publish", th);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void BQ2(C1342780l2y c1342780l2y, CommentResponse commentResponse) {
        runOnUIThread(new AwS230S0300000_21(c1342780l2y, this, commentResponse, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d0 A[PHI: r7
      0x01d0: PHI (r7v10 boolean) = (r7v15 boolean), (r7v11 boolean) binds: [B:169:0x02dd, B:118:0x01ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020b A[PHI: r7
      0x020b: PHI (r7v9 boolean) = (r7v16 boolean), (r7v17 boolean) binds: [B:169:0x02dd, B:129:0x0208] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e9 A[PHI: r9
      0x02e9: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v23 java.lang.String), (r9v23 java.lang.String) binds: [B:173:0x02e5, B:103:0x0134, B:105:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f3 A[PHI: r37
      0x02f3: PHI (r37v1 X.0lAx) = (r37v0 X.0lAx), (r37v5 X.0lAx) binds: [B:177:0x02ef, B:91:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02f8 A[PHI: r10 r37
      0x02f8: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v10 java.lang.String), (r10v10 java.lang.String) binds: [B:180:0x02f4, B:94:0x0122, B:96:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x02f8: PHI (r37v2 X.0lAx) = (r37v1 X.0lAx), (r37v4 X.0lAx), (r37v4 X.0lAx) binds: [B:180:0x02f4, B:94:0x0122, B:96:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0kz8] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r42v0, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [X.05Vn, X.099V, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v19, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable[], java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FQ2(com.ss.android.ugc.aweme.comment.model.CommentResponse r43, boolean r44) {
        /*
            Method dump skipped, instruction units count: 1479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel.FQ2(com.ss.android.ugc.aweme.comment.model.CommentResponse, boolean):void");
    }

    public final void HQ2(Exception exc, Comment comment) throws Exception {
        String fakeId;
        Integer numValueOf;
        boolean zIsIgnoreToast;
        Context context;
        C1340400kz8 c1340400kz8LJIJ;
        C1340420kzA c1340420kzA;
        String fakeId2;
        String fakeId3;
        Map<String, C1345120l6k> map = this.LLJ;
        String fakeId4 = null;
        if (comment != null) {
            fakeId = comment.getFakeId();
        } else {
            fakeId = null;
        }
        C1345120l6k c1345120l6k = (C1345120l6k) ((LinkedHashMap) map).get(fakeId);
        if (c1345120l6k != null) {
            numValueOf = Integer.valueOf(c1345120l6k.LJIIIZ);
        } else {
            numValueOf = null;
        }
        if (comment != null) {
            zIsIgnoreToast = comment.isIgnoreToast();
        } else {
            zIsIgnoreToast = false;
        }
        boolean z = true;
        if (!zIsIgnoreToast && (numValueOf == null || numValueOf.intValue() != 1)) {
            z = false;
        }
        Fragment fragment = this.LLILLL;
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        if (C0XTN.LIZJ(context, exc, 2131829223, false, z)) {
            if (comment != null) {
                fakeId3 = comment.getFakeId();
            } else {
                fakeId3 = null;
            }
            BQ2(new C1342780l2y(4, null, fakeId3), null);
        } else {
            if (comment != null) {
                c1340400kz8LJIJ = C1345700l7g.LJIJ(3, comment, false);
                if (c1340400kz8LJIJ != null && (c1340420kzA = c1340400kz8LJIJ.LLILZ) != null) {
                    if (comment != null) {
                        fakeId2 = comment.getFakeId();
                    } else {
                        fakeId2 = null;
                    }
                    c1340420kzA.LIZ = xQ2(fakeId2);
                }
            } else {
                c1340400kz8LJIJ = null;
            }
            BQ2(new C1342780l2y(3, c1340400kz8LJIJ, null), null);
        }
        Map<String, C1345120l6k> map2 = this.LLJ;
        if (comment != null) {
            fakeId4 = comment.getFakeId();
        }
        C19719512Dh.LIZJ(map2).remove(fakeId4);
    }

    public final Comment vQ2(String str, C1345120l6k c1345120l6k) {
        User curUser;
        String string;
        CmtAudioStruct cmtAudioStruct;
        long j;
        int i;
        String authorUid;
        Aweme aweme;
        AudioCommentModel audioCommentModel;
        AccountUserService accountUserServiceLJIIJ;
        Comment comment = new Comment();
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        String string2 = null;
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            curUser = accountUserServiceLJIIJ.getCurUser();
        } else {
            curUser = null;
        }
        comment.setUser(curUser);
        CharSequence charSequence = c1345120l6k.LIZ;
        if (charSequence != null) {
            string = charSequence.toString();
        } else {
            string = null;
        }
        comment.setText(string);
        comment.setTextExtra(c1345120l6k.LIZIZ);
        comment.setImageList(C1345110l6j.LIZIZ(c1345120l6k.LIZJ));
        List<AudioCommentModel> list = c1345120l6k.LIZLLL;
        if (list != null && (audioCommentModel = (AudioCommentModel) C13LP.LJJJLL(list)) != null) {
            cmtAudioStruct = new CmtAudioStruct(audioCommentModel.vid, null, C13LP.LJJLIIIJ(audioCommentModel.waveformData, ",", null, null, 0, null, null, 62), Long.valueOf(audioCommentModel.totalDurationMillis), 0, null, null, audioCommentModel.audioFilePath, false, null, null);
        } else {
            cmtAudioStruct = null;
        }
        comment.setAudioStruct(cmtAudioStruct);
        comment.setEditImageBitmap(c1345120l6k.LJIILL);
        comment.setStickerStruct(c1345120l6k.LJ);
        comment.setGiftEffectPath(c1345120l6k.LJI);
        GiftStruct giftStruct = c1345120l6k.LJFF;
        if (giftStruct != null) {
            j = giftStruct.id;
        } else {
            j = 0;
        }
        comment.setFakeGiftId(j);
        if (c1345120l6k.LJIIIIZZ != null) {
            i = 2;
        } else {
            i = 1;
        }
        comment.setCommentType(i);
        comment.setAwemeId(str);
        Comment comment2 = c1345120l6k.LJIIIIZZ;
        boolean zIsFromGiftBag = false;
        if (comment2 != null && C1345700l7g.LIZLLL(comment2) == 1) {
            comment.setRootCommentId(c1345120l6k.LJIIIIZZ.getCid());
            comment.setReplyToReplyId(CardStruct.IStatusCode.DEFAULT);
        } else {
            Comment comment3 = c1345120l6k.LJIIIIZZ;
            if (comment3 != null && C1345700l7g.LIZLLL(comment3) == 2) {
                comment.setRootCommentId(c1345120l6k.LJIIIIZZ.getRootCommentId());
                comment.setReplyToReplyId(c1345120l6k.LJIIIIZZ.getCid());
                comment.setReplyToNickName(c1345120l6k.LJIIIIZZ.getUser().getNickname());
                comment.setReplyToUserName(c1345120l6k.LJIIIIZZ.getUser().getUniqueId());
                comment.setReplyToUserId(c1345120l6k.LJIIIIZZ.getUser().getUid());
            }
        }
        CommentContextSource commentContextSourceYQ2 = yQ2();
        if (commentContextSourceYQ2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceYQ2)) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (C10EU.LJIIZILJ(authorUid)) {
            Fragment fragment = this.LLILLL;
            if (fragment != null) {
                string2 = fragment.getString(2131826820);
            }
            comment.setLabelText(string2);
            comment.setLabelType(1);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(UUID.randomUUID());
        comment.setFakeId(C2188811AlT.LIZIZ(sbLIZ));
        GiftStruct giftStruct2 = c1345120l6k.LJFF;
        if (giftStruct2 != null) {
            zIsFromGiftBag = giftStruct2.isFromGiftBag();
        }
        comment.setFakeIsFromGiftBag(zIsFromGiftBag);
        comment.setIsCommentPostChecked(c1345120l6k.LJIIJJI);
        comment.userVoteInfo = c1345120l6k.LJIIZILJ;
        return comment;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ac A[PHI: r9
      0x01ac: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String), (r9v4 java.lang.String) binds: [B:125:0x01a8, B:96:0x0129, B:98:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b9 A[PHI: r36
      0x01b9: PHI (r36v1 X.0lAx) = (r36v0 X.0lAx), (r36v5 X.0lAx) binds: [B:130:0x01b5, B:83:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01be A[PHI: r10 r36
      0x01be: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:133:0x01ba, B:86:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r36v2 X.0lAx) = (r36v1 X.0lAx), (r36v4 X.0lAx) binds: [B:133:0x01ba, B:86:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQ2(java.lang.Throwable r43, com.ss.android.ugc.aweme.comment.model.Comment r44, java.lang.String r45) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel.DQ2(java.lang.Throwable, com.ss.android.ugc.aweme.comment.model.Comment, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0153 A[PHI: r36 r37
      0x0153: PHI (r36v8 java.lang.String) = (r36v1 java.lang.String), (r36v9 java.lang.String) binds: [B:99:0x0151, B:97:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r37v7 java.lang.String) = (r37v0 java.lang.String), (r37v8 java.lang.String) binds: [B:99:0x0151, B:97:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015d A[PHI: r36 r37
      0x015d: PHI (r36v2 java.lang.String) = (r36v1 java.lang.String), (r36v8 java.lang.String), (r36v8 java.lang.String) binds: [B:99:0x0151, B:101:0x0155, B:103:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r37v1 java.lang.String) = (r37v0 java.lang.String), (r37v7 java.lang.String), (r37v7 java.lang.String) binds: [B:99:0x0151, B:101:0x0155, B:103:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0161 A[PHI: r36 r37 r38
      0x0161: PHI (r36v7 java.lang.String) = (r36v2 java.lang.String), (r36v8 java.lang.String) binds: [B:105:0x015f, B:103:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r37v6 java.lang.String) = (r37v1 java.lang.String), (r37v7 java.lang.String) binds: [B:105:0x015f, B:103:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r38v5 java.lang.String) = (r38v0 java.lang.String), (r38v6 java.lang.String) binds: [B:105:0x015f, B:103:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0169 A[PHI: r36 r37 r38
      0x0169: PHI (r36v3 java.lang.String) = (r36v2 java.lang.String), (r36v7 java.lang.String), (r36v7 java.lang.String) binds: [B:105:0x015f, B:107:0x0163, B:109:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r37v2 java.lang.String) = (r37v1 java.lang.String), (r37v6 java.lang.String), (r37v6 java.lang.String) binds: [B:105:0x015f, B:107:0x0163, B:109:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r38v1 java.lang.String) = (r38v0 java.lang.String), (r38v5 java.lang.String), (r38v5 java.lang.String) binds: [B:105:0x015f, B:107:0x0163, B:109:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016c A[PHI: r15 r36 r37 r38
      0x016c: PHI (r15v3 java.lang.String) = (r15v0 java.lang.String), (r15v4 java.lang.String) binds: [B:111:0x016a, B:109:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x016c: PHI (r36v6 java.lang.String) = (r36v3 java.lang.String), (r36v7 java.lang.String) binds: [B:111:0x016a, B:109:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x016c: PHI (r37v5 java.lang.String) = (r37v2 java.lang.String), (r37v6 java.lang.String) binds: [B:111:0x016a, B:109:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x016c: PHI (r38v4 java.lang.String) = (r38v1 java.lang.String), (r38v5 java.lang.String) binds: [B:111:0x016a, B:109:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020c A[PHI: r49 r50
      0x020c: PHI (r49v4 java.lang.Long) = (r49v1 java.lang.Long), (r49v5 java.lang.Long) binds: [B:251:0x033b, B:165:0x0203] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r50v3 java.lang.Float) = (r50v0 java.lang.Float), (r50v4 java.lang.Float) binds: [B:251:0x033b, B:165:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x032f A[PHI: r4
      0x032f: PHI (r4v31 java.lang.String) = (r4v30 java.lang.String), (r4v53 java.lang.String), (r4v53 java.lang.String) binds: [B:244:0x032b, B:176:0x0220, B:178:0x0224] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0339 A[PHI: r49
      0x0339: PHI (r49v1 java.lang.Long) = (r49v0 java.lang.Long), (r49v5 java.lang.Long), (r49v5 java.lang.Long), (r49v5 java.lang.Long) binds: [B:248:0x0335, B:160:0x01f5, B:162:0x01fd, B:164:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x033f A[PHI: r49 r50
      0x033f: PHI (r49v2 java.lang.Long) = (r49v1 java.lang.Long), (r49v4 java.lang.Long), (r49v4 java.lang.Long) binds: [B:251:0x033b, B:167:0x020e, B:169:0x0212] A[DONT_GENERATE, DONT_INLINE]
      0x033f: PHI (r50v1 java.lang.Float) = (r50v0 java.lang.Float), (r50v3 java.lang.Float), (r50v3 java.lang.Float) binds: [B:251:0x033b, B:167:0x020e, B:169:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x034c A[PHI: r21
      0x034c: PHI (r21v1 java.lang.Boolean) = (r21v0 java.lang.Boolean), (r21v6 java.lang.Boolean) binds: [B:256:0x0348, B:123:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0352 A[PHI: r15 r36 r37 r38
      0x0352: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v3 java.lang.String), (r15v3 java.lang.String) binds: [B:111:0x016a, B:113:0x016e, B:115:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x0352: PHI (r36v4 java.lang.String) = (r36v3 java.lang.String), (r36v6 java.lang.String), (r36v6 java.lang.String) binds: [B:111:0x016a, B:113:0x016e, B:115:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x0352: PHI (r37v3 java.lang.String) = (r37v2 java.lang.String), (r37v5 java.lang.String), (r37v5 java.lang.String) binds: [B:111:0x016a, B:113:0x016e, B:115:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x0352: PHI (r38v2 java.lang.String) = (r38v1 java.lang.String), (r38v4 java.lang.String), (r38v4 java.lang.String) binds: [B:111:0x016a, B:113:0x016e, B:115:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x035c A[PHI: r16 r27 r28 r29
      0x035c: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v5 java.lang.String) binds: [B:67:0x00fe, B:69:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x035c: PHI (r27v4 java.lang.Boolean) = (r27v3 java.lang.Boolean), (r27v8 java.lang.Boolean) binds: [B:67:0x00fe, B:69:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x035c: PHI (r28v3 java.lang.String) = (r28v2 java.lang.String), (r28v8 java.lang.String) binds: [B:67:0x00fe, B:69:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x035c: PHI (r29v2 java.lang.String) = (r29v1 java.lang.String), (r29v7 java.lang.String) binds: [B:67:0x00fe, B:69:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x036b A[PHI: r27
      0x036b: PHI (r27v1 java.lang.Boolean) = (r27v0 java.lang.Boolean), (r27v11 java.lang.Boolean) binds: [B:269:0x0367, B:57:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0371 A[PHI: r27 r28
      0x0371: PHI (r27v2 java.lang.Boolean) = (r27v1 java.lang.Boolean), (r27v10 java.lang.Boolean) binds: [B:272:0x036d, B:60:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x0371: PHI (r28v1 java.lang.String) = (r28v0 java.lang.String), (r28v10 java.lang.String) binds: [B:272:0x036d, B:60:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x037f A[PHI: r24 r25
      0x037f: PHI (r24v2 java.lang.String) = (r24v1 java.lang.String), (r24v4 java.lang.String) binds: [B:279:0x037b, B:50:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x037f: PHI (r25v1 java.lang.String) = (r25v0 java.lang.String), (r25v3 java.lang.String) binds: [B:279:0x037b, B:50:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc A[PHI: r27 r28 r29
      0x00fc: PHI (r27v3 java.lang.Boolean) = (r27v2 java.lang.Boolean), (r27v9 java.lang.Boolean), (r27v9 java.lang.Boolean) binds: [B:275:0x0373, B:63:0x00f4, B:65:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r28v2 java.lang.String) = (r28v1 java.lang.String), (r28v9 java.lang.String), (r28v9 java.lang.String) binds: [B:275:0x0373, B:63:0x00f4, B:65:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r29v1 java.lang.String) = (r29v0 java.lang.String), (r29v8 java.lang.String), (r29v8 java.lang.String) binds: [B:275:0x0373, B:63:0x00f4, B:65:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100 A[PHI: r16 r27 r28 r29
      0x0100: PHI (r16v5 java.lang.String) = (r16v0 java.lang.String), (r16v6 java.lang.String) binds: [B:67:0x00fe, B:65:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r27v8 java.lang.Boolean) = (r27v3 java.lang.Boolean), (r27v9 java.lang.Boolean) binds: [B:67:0x00fe, B:65:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r28v8 java.lang.String) = (r28v2 java.lang.String), (r28v9 java.lang.String) binds: [B:67:0x00fe, B:65:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r29v7 java.lang.String) = (r29v1 java.lang.String), (r29v8 java.lang.String) binds: [B:67:0x00fe, B:65:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145 A[PHI: r36
      0x0145: PHI (r36v9 java.lang.String) = (r36v0 java.lang.String), (r36v10 java.lang.String) binds: [B:93:0x0143, B:91:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014f A[PHI: r36
      0x014f: PHI (r36v1 java.lang.String) = (r36v0 java.lang.String), (r36v9 java.lang.String), (r36v9 java.lang.String) binds: [B:93:0x0143, B:95:0x0147, B:97:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r56v0, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.ss.android.ugc.aweme.comment.model.CommentResponse, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EQ2(com.ss.android.ugc.aweme.comment.model.Comment r57, X.C1345120l6k r58, boolean r59) {
        /*
            Method dump skipped, instruction units count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel.EQ2(com.ss.android.ugc.aweme.comment.model.Comment, X.0l6k, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[PHI: r7
      0x00aa: PHI (r7v2 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:7:0x000b, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void JQ2(java.lang.Integer r9, long r10, java.lang.String r12) {
        /*
            r8 = this;
            java.lang.String r0 = "-1"
            if (r9 == 0) goto La
            java.lang.String r7 = r9.toString()
            if (r7 != 0) goto Laa
        La:
            r7 = r0
            if (r9 != 0) goto Laa
            r12 = r0
        Le:
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r8.yQ2()
            r4 = 0
            if (r0 == 0) goto La7
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)
        L19:
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r8.yQ2()
            if (r0 == 0) goto La4
            java.lang.String r3 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.enterFrom(r0)
        L23:
            java.lang.String r1 = java.lang.String.valueOf(r10)
            if (r6 == 0) goto L9d
            X.0Sti r2 = X.C735840Sti.LIZ
            X.09Gk r5 = new X.09Gk
            r5.<init>()
            java.lang.String r0 = "event_page"
            r5.LJIIIIZZ(r0, r3)
            java.lang.String r0 = "enter_from"
            r5.LJIIIIZZ(r0, r3)
            java.lang.String r0 = "comment_id"
            r5.LJIIIIZZ(r0, r1)
            java.lang.String r1 = r6.getAid()
            java.lang.String r0 = "group_id"
            r5.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.getAuthor()
            if (r0 == 0) goto L52
            java.lang.String r4 = r0.getUid()
        L52:
            java.lang.String r0 = "author_id"
            r5.LJIIIIZZ(r0, r4)
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.getAuthor()
            r2.getClass()
            int r1 = X.C735840Sti.LJIIIIZZ(r0)
            java.lang.String r0 = "follow_status"
            r5.LIZJ(r1, r0)
            boolean r0 = X.C729510SjV.LJJ(r6)
            if (r0 == 0) goto La1
            java.lang.String r1 = "story"
        L6f:
            java.lang.String r0 = "story_type"
            r5.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r6.getStatistics()
            r3 = 0
            if (r0 == 0) goto L9e
            long r1 = r0.getCommentCount()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L9e
            java.lang.String r1 = "0"
        L86:
            java.lang.String r0 = "is_zero_comment"
            r5.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "audio_asr_status"
            r5.LJIIIIZZ(r0, r7)
            java.lang.String r0 = "audio_asr_lang"
            r5.LJIIIIZZ(r0, r12)
            X.C735840Sti.LIZIZ(r6, r5)
            java.lang.String r0 = "ttinter_audio_cmt_asr_result"
            X.C1350920lG6.LJJJ(r5, r0)
        L9d:
            return
        L9e:
            java.lang.String r1 = "1"
            goto L86
        La1:
            java.lang.String r1 = "post"
            goto L6f
        La4:
            r3 = r4
            goto L23
        La7:
            r6 = r4
            goto L19
        Laa:
            if (r12 != 0) goto Le
            java.lang.String r12 = ""
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel.JQ2(java.lang.Integer, long, java.lang.String):void");
    }

    public final void MQ2(Comment comment, String str, Context context) {
        Aweme aweme;
        if (context == null || comment == null) {
            return;
        }
        Comment commentM169clone = comment.m169clone();
        if (commentM169clone.getStickerStruct() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(commentM169clone.getText());
            sbLIZ.append(C20642515q3.LJI(2131829123));
            commentM169clone.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        CommentContextSource commentContextSourceYQ2 = yQ2();
        String strEnterFrom = null;
        if (commentContextSourceYQ2 != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceYQ2);
        } else {
            aweme = null;
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        CommentContextSource commentContextSourceYQ22 = yQ2();
        if (commentContextSourceYQ22 != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceYQ22);
        }
        C1354580lM0 c1354580lM0 = new C1354580lM0(aweme, commentM169clone, activityLJFF, strEnterFrom, str, 416);
        C1354540lLw c1354540lLw = (C1354540lLw) this.LLJJIII.getValue();
        if (c1354540lLw != null) {
            c1354540lLw.LIZIZ(c1354580lM0, new AwS265S0300000_21(this, commentM169clone, context, 9));
        }
    }

    public final Object QQ2(final Comment comment, final CommentImageModel commentImageModel, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        String fakeId;
        boolean z;
        C2208181Bbc c2208181Bbc;
        C1345150l6n c1345150l6n;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (comment != null) {
            fakeId = comment.getFakeId();
        } else {
            fakeId = null;
        }
        C1345120l6k c1345120l6kXQ2 = xQ2(fakeId);
        if (c1345120l6kXQ2 != null && (c1345150l6n = c1345120l6kXQ2.LJIIL) != null && c1345150l6n.LIZ) {
            z = true;
        } else {
            z = false;
        }
        CommentImagePublishOptExp.CommentImagePublishOptConfig commentImagePublishOptConfigLIZLLL = CommentImagePublishOptExp.LIZLLL();
        if (commentImagePublishOptConfigLIZLLL != null && commentImagePublishOptConfigLIZLLL.enableUploadInstanceReuse > 0) {
            c2208181Bbc = (C2208181Bbc) this.LL.getValue();
        } else {
            c2208181Bbc = new C2208181Bbc();
        }
        c2208181Bbc.LJIIIIZZ(commentImageModel, new InterfaceC2207911BbB() { // from class: X.0l6l
            @Override // X.InterfaceC2207911BbB
            public final void onComplete(String str) {
                CommentImageModel commentImageModel2 = commentImageModel;
                if (commentImageModel2 != null) {
                    commentImageModel2.setUri(str);
                }
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(str);
                interfaceC1364105Vn2.resumeWith(str);
            }

            @Override // X.InterfaceC2207911BbB
            public final void onProgress(long j) throws Exception {
                C1340400kz8 c1340400kz8LJIJ;
                C1340410kz9 c1340410kz9LIZIZ;
                List<CommentImageStruct> imageList;
                CommentImageStruct commentImageStruct;
                Comment comment2 = comment;
                if (comment2 != null && (imageList = comment2.getImageList()) != null && (commentImageStruct = (CommentImageStruct) ListProtector.get(imageList, 0)) != null) {
                    commentImageStruct.setProgress((int) j);
                }
                Comment comment3 = comment;
                if (comment3 != null) {
                    c1340400kz8LJIJ = C1345700l7g.LJIJ(1, comment3, false);
                    if (c1340400kz8LJIJ != null && (c1340410kz9LIZIZ = c1340400kz8LJIJ.LIZIZ()) != null) {
                        c1340410kz9LIZIZ.LJIIJJI = j;
                    }
                } else {
                    c1340400kz8LJIJ = null;
                }
                C1342780l2y c1342780l2y = new C1342780l2y(1, c1340400kz8LJIJ, null);
                CommentPublishViewModel commentPublishViewModel = this;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentPublishViewModel.LLJJIJIIJIL;
                commentPublishViewModel.BQ2(c1342780l2y, null);
            }

            @Override // X.InterfaceC2207911BbB
            public final void LIZ(long j, String str) {
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                C098200Yq c098200Yq = new C098200Yq(new Exception(j, str) { // from class: X.0l6q
                    public static final int $stable = 8;
                    public final long LL;
                    public final String LLILLJJLI;

                    public final long getErrorCode() {
                        return this.LL;
                    }

                    public final String getMsg() {
                        return this.LLILLJJLI;
                    }

                    {
                        super(str);
                        this.LL = j;
                        this.LLILLJJLI = str;
                    }
                });
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn2.resumeWith(c098200Yq);
            }
        }, z);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentPublishViewModelAbility
    public final void Yb0(C1345120l6k c1345120l6k, Comment comment, Function1<? super Comment, Unit> function1) {
        Activity activityLIZ;
        C19EG c19eg;
        Boolean boolValueOf;
        CommentCommonModel commonModel;
        Aweme aweme;
        int length;
        String strEnterFrom;
        String cid;
        Boolean boolValueOf2;
        String strEnterFrom2;
        String cid2;
        long j;
        C19EH c19ehLJIIJ;
        List<AudioCommentModel> list;
        C19EG activity;
        FragmentManager supportFragmentManager;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IQuickMentionLogicAbility iQuickMentionLogicAbility;
        InterfaceC665370Q7z interfaceC665370Q7z2;
        ICommentListVMAbility iCommentListVMAbilityLJ;
        String str;
        Aweme aweme2;
        C19EG activity2;
        C19EG activity3;
        InterfaceC665370Q7z interfaceC665370Q7z3;
        IAudioEditAbility iAudioEditAbilityLIZ;
        String aid;
        CommentImageModel commentImageModel;
        IGiftSelectAbility iGiftSelectAbilityLJII;
        Activity activityLIZIZ;
        Comment commentVQ2 = comment;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        String strEnterFrom3 = null;
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        if (activityLIZ instanceof C19EG) {
            c19eg = (C19EG) activityLIZ;
        } else {
            c19eg = null;
        }
        if (C0SYU.LIZIZ(c19eg, CommentContextSourceKt.aweme(yQ2()), CommentContextSourceKt.enterFrom(yQ2()), "click_comment_send", yQ2()) && (c1345120l6k.LJIIJ == 0 || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin())) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7z4 = this.LLILLJJLI;
        if (interfaceC665370Q7z4 != null && (iGiftSelectAbilityLJII = C1345760l7m.LJII(this.LLILLL, interfaceC665370Q7z4)) != null) {
            boolValueOf = Boolean.valueOf(iGiftSelectAbilityLJII.T61());
        } else {
            boolValueOf = null;
        }
        if (C1346420l8q.LIZJ(boolValueOf)) {
            return;
        }
        if (C1351950lHl.LJIIIIZZ(c1345120l6k.LIZJ)) {
            int i = C1344860l6K.LIZ;
            Aweme aweme3 = CommentContextSourceKt.aweme(yQ2());
            if (aweme3 != null) {
                aid = aweme3.getAid();
            } else {
                aid = null;
            }
            List<CommentImageModel> list2 = c1345120l6k.LIZJ;
            if (list2 != null) {
                commentImageModel = (CommentImageModel) ListProtector.get(list2, 0);
            } else {
                commentImageModel = null;
            }
            if (C1344860l6K.LIZIZ(commentImageModel, aid)) {
                Fragment fragment = this.LLILLL;
                if (fragment != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                    c1389890mGx.LJIIIZ(2131834211);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            }
        }
        if (C756302xN.LIZ(c1345120l6k.LIZLLL) && (interfaceC665370Q7z3 = this.LLILLJJLI) != null && (iAudioEditAbilityLIZ = C1346550l93.LIZ(interfaceC665370Q7z3)) != null) {
            iAudioEditAbilityLIZ.dF();
        }
        CommentPerfMonitorUtil.LIZ.getClass();
        C1345430l7F c1345430l7F = CommentPerfMonitorUtil.LIZJ;
        c1345430l7F.LIZIZ();
        c1345430l7F.LIZIZ = System.currentTimeMillis();
        CommentContextSource commentContextSourceYQ2 = yQ2();
        if (commentContextSourceYQ2 != null && (commonModel = commentContextSourceYQ2.getCommonModel()) != null && (aweme = commonModel.aweme) != null) {
            if (C10EU.LJIIIIZZ()) {
                NQ2(2131828626);
                return;
            }
            Fragment fragment2 = this.LLILLL;
            if (fragment2 != null) {
                fragment2.getContext();
            }
            try {
                if (C036E.LIZ.LIZIZ()) {
                    if (C1348690lCV.LIZJ(aweme)) {
                        Fragment fragment3 = this.LLILLL;
                        if (fragment3 != null) {
                            activity3 = fragment3.getActivity();
                        } else {
                            activity3 = null;
                        }
                        Fragment fragment4 = this.LLILLL;
                        if (fragment4 != null) {
                            strEnterFrom3 = fragment4.getString(2131829236);
                        }
                        C1348690lCV.LJ(activity3, 2131829154, strEnterFrom3);
                        return;
                    }
                    if (!C1348690lCV.LIZ(aweme)) {
                        Fragment fragment5 = this.LLILLL;
                        if (fragment5 != null) {
                            activity2 = fragment5.getActivity();
                        } else {
                            activity2 = null;
                        }
                        Fragment fragment6 = this.LLILLL;
                        if (fragment6 != null) {
                            strEnterFrom3 = fragment6.getString(2131829170);
                        }
                        C1348690lCV.LJ(activity2, 2131829171, strEnterFrom3);
                        return;
                    }
                    CommentContextSource commentContextSourceYQ22 = yQ2();
                    if (commentContextSourceYQ22 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceYQ22)) != null) {
                        AwemeExtKt.getAuthorUid(aweme2);
                    }
                    int iLIZIZ = C1353700lKa.LIZIZ();
                    CharSequence charSequence = c1345120l6k.LIZ;
                    if (charSequence != null) {
                        length = charSequence.length();
                    } else {
                        length = 0;
                    }
                    if (length > iLIZIZ) {
                        NQ2(2131827367);
                        return;
                    }
                    if (((Number) C0AF1.LIZ.getValue()).intValue() != 0 && (interfaceC665370Q7z2 = this.LLILLJJLI) != null && (iCommentListVMAbilityLJ = C1345760l7m.LJ(this.LLILLL, interfaceC665370Q7z2)) != null && iCommentListVMAbilityLJ.isLoading()) {
                        NQ2(2131827289);
                        CommentContextSource commentContextSourceYQ23 = yQ2();
                        if (commentContextSourceYQ23 != null) {
                            strEnterFrom3 = CommentContextSourceKt.enterFrom(commentContextSourceYQ23);
                        }
                        if (c1345120l6k.LJFF != null) {
                            str = "click_gift";
                        } else {
                            str = "click_send_button";
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom3);
                        c2344009Gk.LJIIIIZZ("enter_method", str);
                        c2344009Gk.LJIIIIZZ("invalid_reason", "loading_comment");
                        C1350920lG6.LJJJ(c2344009Gk, "invalid_post_comment");
                        return;
                    }
                    if (C2279851ELn.LIZIZ() && (interfaceC665370Q7z = this.LLILLJJLI) != null && (iQuickMentionLogicAbility = (IQuickMentionLogicAbility) C1558520qew.LIZ(interfaceC665370Q7z, IQuickMentionLogicAbility.class, null)) != null) {
                        iQuickMentionLogicAbility.eA1(c1345120l6k);
                    }
                    if (c1345120l6k.LJFF != null) {
                        CommentContextSource commentContextSourceYQ24 = yQ2();
                        if (commentContextSourceYQ24 != null) {
                            strEnterFrom2 = CommentContextSourceKt.enterFrom(commentContextSourceYQ24);
                        } else {
                            strEnterFrom2 = null;
                        }
                        Comment comment2 = c1345120l6k.LJIIIIZZ;
                        if (comment2 != null) {
                            cid2 = comment2.getCid();
                        } else {
                            cid2 = null;
                        }
                        String aid2 = aweme.getAid();
                        C0O8X c0o8x = new C0O8X();
                        c0o8x.LJ();
                        c0o8x.LIZLLL = "ttk_comment_gift_send_api_monitor";
                        c0o8x.LIZIZ(strEnterFrom2, "enter_from");
                        if (cid2 != null) {
                            c0o8x.LIZJ(cid2, "cid");
                        }
                        c0o8x.LIZJ(aid2, "gid");
                        IVideoGiftService iVideoGiftServiceLJI = VideoGiftService.LJI();
                        if (!iVideoGiftServiceLJI.LIZJ()) {
                            iVideoGiftServiceLJI.LIZIZ();
                        }
                        Comment comment3 = new Comment();
                        GiftStruct giftStruct = c1345120l6k.LJFF;
                        if (giftStruct != null) {
                            j = giftStruct.id;
                        } else {
                            j = 0;
                        }
                        comment3.setFakeGiftId(j);
                        comment3.setGiftEffectPath(c1345120l6k.LJI);
                        Fragment fragment7 = this.LLILLL;
                        if (fragment7 != null && (activity = fragment7.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                            c19ehLJIIJ = supportFragmentManager.LJIIJ();
                        } else {
                            c19ehLJIIJ = null;
                        }
                        GiftAnimationFragment giftAnimationFragment = new GiftAnimationFragment();
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJIZ(bundle, "comment", comment3);
                        giftAnimationFragment.setArguments(bundle);
                        if (c19ehLJIIJ != null) {
                            giftAnimationFragment.show(c19ehLJIIJ, "GiftAnimationFragment");
                        }
                        CharSequence charSequence2 = c1345120l6k.LIZ;
                        if ((charSequence2 == null || charSequence2.length() == 0) && !C1351950lHl.LJIIIIZZ(c1345120l6k.LIZJ) && c1345120l6k.LJ == null && ((list = c1345120l6k.LIZLLL) == null || list.isEmpty())) {
                            if (commentVQ2 == null) {
                                commentVQ2 = vQ2(aweme.getAid(), c1345120l6k);
                            }
                            EQ2(commentVQ2, c1345120l6k, false);
                            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1344130l59(this, c1345120l6k, aweme, c0o8x, null), 3);
                        } else if (c1345120l6k.LJII == 0) {
                            if (commentVQ2 == null) {
                                commentVQ2 = vQ2(aweme.getAid(), c1345120l6k);
                            }
                            EQ2(commentVQ2, c1345120l6k, true);
                            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1344110l57(c1345120l6k, this, commentVQ2, aweme, c0o8x, function1, null), 3);
                        }
                    } else if (c1345120l6k.LJII == 0) {
                        CommentContextSource commentContextSourceYQ25 = yQ2();
                        if (commentContextSourceYQ25 != null) {
                            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceYQ25);
                        } else {
                            strEnterFrom = null;
                        }
                        Comment comment4 = c1345120l6k.LJIIIIZZ;
                        if (comment4 != null) {
                            cid = comment4.getCid();
                        } else {
                            cid = null;
                        }
                        String aid3 = aweme.getAid();
                        C0O8X c0o8x2 = new C0O8X();
                        c0o8x2.LJ();
                        c0o8x2.LIZLLL = "ttk_comment_publish_api_monitor";
                        c0o8x2.LIZIZ(strEnterFrom, "enter_from");
                        if (cid != null) {
                            c0o8x2.LIZJ(cid, "cid");
                        }
                        c0o8x2.LIZJ(aid3, "gid");
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (commentVQ2 == null) {
                            commentVQ2 = vQ2(aweme.getAid(), c1345120l6k);
                        }
                        CommentContextSource commentContextSourceYQ26 = yQ2();
                        if (commentContextSourceYQ26 != null) {
                            boolValueOf2 = Boolean.valueOf(CommentContextSourceKt.isFromTitlePanel(commentContextSourceYQ26));
                        } else {
                            boolValueOf2 = null;
                        }
                        EQ2(commentVQ2, c1345120l6k, true);
                        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1344080l54(c1345120l6k, this, commentVQ2, new C259800zU(), aweme, c0o8x2, jCurrentTimeMillis, boolValueOf2, function1, null), 3);
                    } else {
                        return;
                    }
                    C1345430l7F c1345430l7F2 = CommentPerfMonitorUtil.LIZJ;
                    c1345430l7F2.LIZJ = System.currentTimeMillis();
                    C15O7.LIZJ(new ACallableS426S0100000_21(c1345430l7F2, 10));
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            NQ2(2131837962);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void AQ2(X.C1340400kz8 r16, com.ss.android.ugc.aweme.comment.model.CommentResponse r17, int r18, X.C20600815jK r19) {
        /*
            r5 = r16
            boolean r1 = r5 instanceof X.C1340430kzB
            r4 = 1
            r2 = 0
            r0 = r17
            if (r1 == 0) goto L91
            if (r0 == 0) goto Lbb
            java.util.List<com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct> r0 = r0.userBadgeInfoList
            if (r0 == 0) goto Lbb
            java.util.Iterator r1 = r0.iterator()
        L14:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r3 = r1.next()
            r0 = r3
            com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct r0 = (com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct) r0
            if (r0 == 0) goto L14
            java.lang.Integer r0 = r0.level
            if (r0 == 0) goto L14
            int r0 = r0.intValue()
            if (r0 != r4) goto L14
        L2d:
            com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct r3 = (com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct) r3
        L2f:
            r4 = r5
            X.0kzB r4 = (X.C1340430kzB) r4
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r4.LLILZIL
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r0.m169clone()
            r1.setCmtUserBadgeInfoStruct(r3)
            X.0kz9 r6 = r4.LLILZLL
            r7 = 0
            r10 = 0
            if (r3 == 0) goto L8d
            java.lang.String r11 = r3.url
        L43:
            r15 = 0
            r17 = 16711679(0xfeffff, float:2.341805E-38)
            r8 = r7
            r9 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r16 = r15
            X.0kz9 r0 = X.C1340410kz9.LIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.0kzB r4 = new X.0kzB
            r4.<init>(r1, r0)
        L57:
            boolean r0 = r5 instanceof X.C1340440kzC
            if (r0 == 0) goto L8a
            X.0kzC r5 = (X.C1340440kzC) r5
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r5.LLILZIL
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r0.m169clone()
            r1.setCmtUserBadgeInfoStruct(r3)
            X.0kz9 r4 = r5.LLILZLL
            r5 = 0
            r8 = 0
            if (r3 == 0) goto L6e
            java.lang.String r2 = r3.url
        L6e:
            r13 = 0
            r15 = 16711679(0xfeffff, float:2.341805E-38)
            r6 = r5
            r7 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r14 = r13
            r9 = r2
            X.0kz9 r0 = X.C1340410kz9.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.0kzC r4 = new X.0kzC
            r4.<init>(r1, r0)
        L82:
            r0 = r19
            r1 = r18
            r0.LJIILJJIL(r1, r4)
        L89:
            return
        L8a:
            if (r4 == 0) goto L89
            goto L82
        L8d:
            r11 = r2
            goto L43
        L8f:
            r3 = r2
            goto L2d
        L91:
            if (r0 == 0) goto Lbb
            java.util.List<com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct> r0 = r0.userBadgeInfoList
            if (r0 == 0) goto Lbb
            java.util.Iterator r4 = r0.iterator()
        L9b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct r0 = (com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct) r0
            if (r0 == 0) goto L9b
            java.lang.Integer r0 = r0.level
            if (r0 == 0) goto L9b
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L9b
        Lb5:
            com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct r3 = (com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct) r3
        Lb7:
            r4 = r2
            goto L57
        Lb9:
            r3 = r2
            goto Lb5
        Lbb:
            r3 = r2
            if (r1 == 0) goto Lb7
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel.AQ2(X.0kz8, com.ss.android.ugc.aweme.comment.model.CommentResponse, int, X.15jK):void");
    }

    public static void IQ2(CommentPublishViewModel commentPublishViewModel, Comment comment, int i, int i2) {
        boolean z;
        String fakeId;
        String awemeId;
        int i3 = i;
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i3 = 0;
        }
        if (comment != null) {
            commentPublishViewModel.getClass();
            fakeId = comment.getFakeId();
        } else {
            fakeId = null;
        }
        C1345120l6k c1345120l6kXQ2 = commentPublishViewModel.xQ2(fakeId);
        if (c1345120l6kXQ2 != null) {
            commentPublishViewModel.Yb0(new C1345120l6k(c1345120l6kXQ2.LIZ, c1345120l6kXQ2.LIZIZ, c1345120l6kXQ2.LIZJ, c1345120l6kXQ2.LIZLLL, c1345120l6kXQ2.LJ, c1345120l6kXQ2.LJFF, c1345120l6kXQ2.LJI, c1345120l6kXQ2.LJII, c1345120l6kXQ2.LJIIIIZZ, c1345120l6kXQ2.LJIIIZ, 1, c1345120l6kXQ2.LJIIJJI, c1345120l6kXQ2.LJIIL, c1345120l6kXQ2.LJIILIIL, c1345120l6kXQ2.LJIILJJIL, c1345120l6kXQ2.LJIILL, c1345120l6kXQ2.LJIILLIIL, c1345120l6kXQ2.LJIIZILJ), comment, null);
        } else {
            C1344030l4z.LIZJ("CommentPublishVM", "publish param is null when post anyway");
        }
        commentPublishViewModel.LLJIJIL = null;
        if (z) {
            C0TUM c0tum = C0TUM.LIZ;
            boolean z2 = commentPublishViewModel.LLJILLL;
            if (comment == null || (awemeId = comment.getAwemeId()) == null) {
                awemeId = "";
            }
            c0tum.getClass();
            C2344009Gk c2344009GkLIZ = C0TUM.LIZ(i3, "comment", awemeId, z2);
            c2344009GkLIZ.LIZJ(0, "no_show");
            C20684815ws.LJIILLIIL("comment_rethink_hit", c2344009GkLIZ.LIZ);
        }
    }

    public static void zQ2(C1340400kz8 c1340400kz8, CommentResponse commentResponse, int i, C20600815jK c20600815jK) {
        String rootCommentId;
        Comment comment;
        Cloneable c1340440kzC = null;
        if (commentResponse != null && (comment = commentResponse.comment) != null) {
            rootCommentId = comment.getRootCommentId();
        } else {
            rootCommentId = null;
        }
        String cid = c1340400kz8.LIZ().getCid();
        String rootCommentId2 = c1340400kz8.LIZ().getRootCommentId();
        if (TextUtils.equals(rootCommentId, cid) || TextUtils.equals(rootCommentId, rootCommentId2)) {
            if (c1340400kz8 instanceof C1340430kzB) {
                C1340430kzB c1340430kzB = (C1340430kzB) c1340400kz8;
                Comment commentM169clone = c1340430kzB.LLILZIL.m169clone();
                commentM169clone.setEnableRemoveOtherSpan(true);
                c1340440kzC = new C1340430kzB(commentM169clone, C1340410kz9.LIZ(c1340430kzB.LLILZLL, false, false, 0, 0.0f, null, true, false, false, null, null, 16646143));
            }
            if (c1340400kz8 instanceof C1340440kzC) {
                C1340440kzC c1340440kzC2 = (C1340440kzC) c1340400kz8;
                Comment commentM169clone2 = c1340440kzC2.LLILZIL.m169clone();
                commentM169clone2.setEnableRemoveOtherSpan(true);
                c1340440kzC = new C1340440kzC(commentM169clone2, C1340410kz9.LIZ(c1340440kzC2.LLILZLL, false, false, 0, 0.0f, null, true, false, false, null, null, 16646143));
            } else if (c1340440kzC == null) {
                return;
            }
            c20600815jK.LJIILJJIL(i, c1340440kzC);
        }
    }

    public final void GQ2(C1345120l6k c1345120l6k, boolean z, boolean z2, int i) {
        Aweme aweme;
        String strEnterFrom;
        Aweme aweme2;
        String str;
        String aid;
        Long lValueOf;
        Integer numValueOf;
        String authorUid;
        GiftStruct giftStruct;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IGiftSelectAbility iGiftSelectAbilityLJII;
        CommentContextSource commentContextSourceYQ2 = yQ2();
        if (commentContextSourceYQ2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceYQ2)) != null) {
            int i2 = 1;
            if (z && (giftStruct = c1345120l6k.LJFF) != null && giftStruct.isFromGiftBag() && ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getGiftBagStatus() == 1) {
                ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setGiftBagStatus(0);
                String aid2 = aweme.getAid();
                if (aid2 != null && (interfaceC665370Q7z = this.LLILLJJLI) != null && (iGiftSelectAbilityLJII = C1345760l7m.LJII(this.LLILLL, interfaceC665370Q7z)) != null) {
                    iGiftSelectAbilityLJII.PF2(aid2, AwemeExtKt.getAuthorUid(aweme));
                }
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceYQ22 = yQ2();
            Integer num = null;
            if (commentContextSourceYQ22 != null) {
                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceYQ22);
            } else {
                strEnterFrom = null;
            }
            CommentContextSource commentContextSourceYQ23 = yQ2();
            if (commentContextSourceYQ23 != null) {
                aweme2 = CommentContextSourceKt.aweme(commentContextSourceYQ23);
            } else {
                aweme2 = null;
            }
            GiftStruct giftStruct2 = c1345120l6k.LJFF;
            C1345150l6n c1345150l6n = c1345120l6k.LJIIL;
            String str2 = "";
            if (c1345150l6n != null) {
                String str3 = c1345150l6n.LIZIZ;
                if (Intrinsics.LJFF(str3, "button_send")) {
                    str = "keyboard_dialog";
                } else if (!Intrinsics.LJFF(str3, "close_text")) {
                    str = "";
                } else {
                    str = "comment_panel";
                }
            } else {
                str = null;
            }
            c1350920lG6.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
            if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                aid = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            if (aweme2 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme2)) != null) {
                str2 = authorUid;
            }
            c2344009Gk.LJIIIIZZ("author_id", str2);
            c2344009Gk.LIZJ(z ? 1 : 0, "is_success");
            if (giftStruct2 != null) {
                lValueOf = Long.valueOf(giftStruct2.id);
            } else {
                lValueOf = null;
            }
            c2344009Gk.LJ(lValueOf, "gift_id");
            c2344009Gk.LIZJ(C1345170l6p.LIZ(aweme2), "is_follow");
            if (aweme2 == null || !aweme2.isLike()) {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_like");
            c2344009Gk.LIZJ(z2 ? 1 : 0, "is_comment");
            if (i != 0) {
                c2344009Gk.LIZJ(i, "error_code");
                c2344009Gk.LJ(C786410Ut5.e3(C2214201BlK.LJFF()), "newtork_condition");
            }
            c2344009Gk.LJFF("enter_method", str);
            if (giftStruct2 != null) {
                numValueOf = Integer.valueOf(giftStruct2.diamondCount);
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "gift_value");
            if (giftStruct2 != null) {
                num = giftStruct2.selectedIndex;
            }
            c2344009Gk.LJ(num, "gift_position");
            C1350920lG6.LJJJ(c2344009Gk, "send_gift");
        }
    }

    public final void PQ2(Integer num, String str, long j, String str2) {
        C1340400kz8 c1340400kz8;
        Cloneable cloneableLJ;
        CmtAudioStruct audioStruct;
        AbstractC1049450dPr abstractC1049450dPr;
        Comment commentLIZ;
        String strValueOf = String.valueOf(j);
        Map<EnumC1342450l2R, C20600815jK<InterfaceC1891350zJl>> mapWQ2 = wQ2();
        if (mapWQ2 != null) {
            for (Map.Entry<EnumC1342450l2R, C20600815jK<InterfaceC1891350zJl>> entry : mapWQ2.entrySet()) {
                entry.getKey();
                C20600815jK<InterfaceC1891350zJl> value = entry.getValue();
                if (value != null) {
                    List<InterfaceC1891350zJl> listLJII = value.LJII();
                    Iterator it2 = ((ArrayList) listLJII).iterator();
                    int i = 0;
                    while (true) {
                        String cid = null;
                        if (it2.hasNext()) {
                            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                            if ((interfaceC1891350zJl instanceof C1340400kz8) && (abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl) != null && (commentLIZ = abstractC1049450dPr.LIZ()) != null) {
                                cid = commentLIZ.getCid();
                            }
                            if (Intrinsics.LJFF(cid, strValueOf)) {
                                if (i >= 0) {
                                    Object obj = ListProtector.get(listLJII, i);
                                    if ((obj instanceof C1340400kz8) && (c1340400kz8 = (C1340400kz8) obj) != null) {
                                        c1340400kz8.LIZ().setFetchingAsrText(false);
                                        CmtAudioStruct audioStruct2 = c1340400kz8.LIZ().getAudioStruct();
                                        if (audioStruct2 != null) {
                                            audioStruct2.setAsrText(str);
                                        }
                                        CmtAudioStruct audioStruct3 = c1340400kz8.LIZ().getAudioStruct();
                                        if (audioStruct3 != null) {
                                            audioStruct3.setAsrStatus(num);
                                        }
                                        if (str2 != null && (audioStruct = c1340400kz8.LIZ().getAudioStruct()) != null) {
                                            audioStruct.setAsrLang(str2);
                                        }
                                        if (c1340400kz8 instanceof C1340430kzB) {
                                            C1340430kzB c1340430kzB = (C1340430kzB) c1340400kz8;
                                            cloneableLJ = C1340430kzB.LJ(c1340430kzB, C1340410kz9.LIZ(c1340430kzB.LLILZLL, false, false, 0, 0.0f, null, false, false, false, num, null, 14680063));
                                        } else if (c1340400kz8 instanceof C1340440kzC) {
                                            C1340440kzC c1340440kzC = (C1340440kzC) c1340400kz8;
                                            cloneableLJ = C1340440kzC.LJ(c1340440kzC, C1340410kz9.LIZ(c1340440kzC.LLILZLL, false, false, 0, 0.0f, null, false, false, false, num, null, 14680063));
                                        }
                                        value.LJIILJJIL(i, cloneableLJ);
                                    }
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
