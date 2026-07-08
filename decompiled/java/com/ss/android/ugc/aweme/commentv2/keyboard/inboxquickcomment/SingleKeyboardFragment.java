package com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment;

import X.AbstractC1387200mCc;
import X.AbstractC813200VvC;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0FNT;
import X.C0QSJ;
import X.C0TVI;
import X.C0WZX;
import X.C0XQ7;
import X.C0ZP4;
import X.C1075920e6Y;
import X.C1075930e6Z;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1341740l1I;
import X.C1341800l1O;
import X.C1344030l4z;
import X.C1345260l6y;
import X.C1345600l7W;
import X.C1345700l7g;
import X.C1345760l7m;
import X.C1346420l8q;
import X.C1346910l9d;
import X.C1346920l9e;
import X.C1346940l9g;
import X.C1347080l9u;
import X.C1347090l9v;
import X.C1347100l9w;
import X.C1347110l9x;
import X.C1347120l9y;
import X.C1347130l9z;
import X.C1347140lA0;
import X.C1347410lAR;
import X.C1347440lAU;
import X.C1347720lAw;
import X.C1350920lG6;
import X.C1353500lKG;
import X.C1354730lMF;
import X.C1357140lQ8;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C14K9;
import X.C15438062q;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1591860rWi;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C189200o6;
import X.C1906580ziK;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C201955140j;
import X.C2095008Iq;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C338520DOw;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C523420Kfs;
import X.C673150Qan;
import X.C687700QyG;
import X.C722580SWa;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1341680l1C;
import X.EnumC1346360l8k;
import X.EnumC454020HrE;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1348540lCG;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737440SwI;
import Y.ARunnableS39S0300000_6;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardEditAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.model.OptionCount;
import com.ss.android.ugc.aweme.comment.model.PollInfo;
import com.ss.android.ugc.aweme.comment.model.PollStyle;
import com.ss.android.ugc.aweme.comment.poll.CommentPollCreateViewModel;
import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.comment.poll.repository.CreatePollRequest;
import com.ss.android.ugc.aweme.comment.poll.repository.PollOption;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS104S1200000_21;
import kotlin.jvm.internal.AwS135S1100000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS456S0200000_21;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS57S0310000_19;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS79S0500000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class SingleKeyboardFragment extends AbsFragment implements InterfaceC724530SbT, InterfaceC737440SwI, InterfaceC1348540lCG, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjE6e2E4LTwuJi4hHELIOSLGslJy08MDQ5ICw4KyohJCo9PGsfICE0JCAHLDYxJyQ+LQkhKSIhLCEn";
    public Aweme LLILLJJLI;
    public Comment LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C736950SvV LLJIJIL;
    public Function1<? super CommentInputContent, Unit> LLJILJIL;
    public Function0<Unit> LLJILJILJ;
    public Function0<Unit> LLJILLL;
    public Function1<? super Comment, Unit> LLJJ;
    public Function1<? super Comment, Unit> LLJJI;
    public FrameLayout LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final C1346940l9g LLJJJIL;
    public ISingleCommentKeyboardAbility LLJJJJ;
    public final C722580SWa LL = new C722580SWa();
    public C1346920l9e LLIZ = new C1346920l9e(false, false, false, false, false, false, null, 0, EnumC1341680l1C.TEXT, false, null, false);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleKeyboardFragment.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC737440SwI
    public final void E7() {
        IRefactorKeyboardFragment iRefactorKeyboardFragmentLJIIJ = C1345760l7m.LJIIJ(this, C1558360qeg.LJFF(this, null));
        if (iRefactorKeyboardFragmentLJIIJ != null) {
            iRefactorKeyboardFragmentLJIIJ.E7();
        }
    }

    @Override // X.InterfaceC737440SwI
    public final SingleKeyboardFragment IC() {
        return this;
    }

    @Override // X.InterfaceC1348540lCG
    public final void bD() throws Throwable {
        MR(null, true, true);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == ISingleCommentKeyboardAbility.class) {
            this.LLJJJJ = (ISingleCommentKeyboardAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SingleCommentKeyboardVScope.class, SingleCommentKeyboardVScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == ISingleCommentKeyboardAbility.class) {
            return this.LLJJJJ;
        }
        return null;
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SingleCommentKeyboardVScope.class);
        arrayList.add(SingleCommentKeyboardVScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SingleCommentKeyboardVScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC737440SwI
    public final void hn() {
        IRefactorKeyboardFragment iRefactorKeyboardFragmentLJIIJ = C1345760l7m.LJIIJ(this, C1558360qeg.LJFF(this, null));
        if (iRefactorKeyboardFragmentLJIIJ != null) {
            iRefactorKeyboardFragmentLJIIJ.hn();
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLJJIII = null;
        this.LLJJIJIL = false;
        super.onDestroyView();
        FragmentManager fragmentManagerLJ = C1345700l7g.LJ(this);
        if (fragmentManagerLJ != null) {
            fragmentManagerLJ.LLIILZL(this.LLJJJIL);
        }
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == ISingleCommentKeyboardAbility.class) {
            this.LLJJJJ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [X.0l9g] */
    public SingleKeyboardFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 823);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(388);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ, awS560S0100000_16, aFwS259S0000000_21, (Function0) null, 18));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommentPublishViewModel.class);
        this.LLJ = C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ2, new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 823), aFwS259S0000000_21, (Function0) null, 20));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(CommentPollCreateViewModel.class);
        this.LLJI = C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ3, new AwS560S0100000_16((C13IQ) c19719912DlLIZ3, 823), aFwS259S0000000_21, (Function0) null, 22));
        this.LLJIJIL = new C736950SvV(C13LE.LIZ(CommentPollViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(135), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJJIL = new AbstractC813200VvC() { // from class: X.0l9g
            @Override // X.AbstractC813200VvC
            public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
                String tag = fragment.getTag();
                if (tag != null && C703302op.LIZ(tag) && Intrinsics.LJFF(fragment.getTag(), "StickerSearchFragment")) {
                    KeyboardVMV2.MQ2(this.LL.OR(), true);
                }
            }

            @Override // X.AbstractC813200VvC
            public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
                String tag = fragment.getTag();
                if (tag != null && C703302op.LIZ(tag) && Intrinsics.LJFF(fragment.getTag(), "StickerSearchFragment")) {
                    KeyboardVMV2.MQ2(this.LL.OR(), false);
                }
            }
        };
    }

    public final KeyboardVMV2 OR() {
        return (KeyboardVMV2) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC737440SwI
    public final void yj() {
        CommentPublishViewModel commentPublishViewModel = (CommentPublishViewModel) this.LLJ.getValue();
        KeyboardVMV2 keyboardVMV2OR = OR();
        EnumC1346360l8k enumC1346360l8k = EnumC1346360l8k.FEED_QUICK_COMMENT;
        C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
        commentPublishViewModel.Yb0(keyboardVMV2OR.DQ2(enumC1346360l8k, null), null, null);
    }

    @Override // X.InterfaceC737440SwI
    public final boolean Ld() {
        return C1345260l6y.LIZ(OR().getState().LL);
    }

    public final boolean PR() {
        View view;
        return !Intrinsics.LJFF(OR().getState().LL, C1347120l9y.LIZ) || this.LLJJIJIL || ((view = getView()) != null && view.getVisibility() == 0);
    }

    public final void SR() throws Throwable {
        C1353500lKG c1353500lKGZy1;
        View viewFindViewById;
        if (OR().getState().LL instanceof C1347130l9z) {
            View view = getView();
            if (view == null || (viewFindViewById = view.findViewById(R.id.qvp)) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            return;
        }
        IKeyboardEditAbility iKeyboardEditAbility = (IKeyboardEditAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IKeyboardEditAbility.class, null);
        if (iKeyboardEditAbility == null || (c1353500lKGZy1 = iKeyboardEditAbility.Zy1()) == null) {
            return;
        }
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKGZy1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iYCcP3Pbyg+2OqomiKMn1bUgrxffM1dVwbpARlKislA5nNM6F6h6tm+bLuLA3JF4CuWtEcX", null));
        int length = editableLLLZZIL != null ? editableLLLZZIL.length() : 0;
        int iLJ = C13LZ.LJ(this.LLJJIJI, 0, length);
        int iLJ2 = C13LZ.LJ(this.LLJJIJIIJIL, iLJ, length);
        c1353500lKGZy1.requestFocus();
        c1353500lKGZy1.setSelection(iLJ, iLJ2);
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbility = (IKeyboardInputPanelAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IKeyboardInputPanelAssemAbility.class, null);
        if (iKeyboardInputPanelAssemAbility != null) {
            iKeyboardInputPanelAssemAbility.N4();
        }
        if (OR().getState().LL instanceof C1347120l9y) {
            KeyboardVMV2 keyboardVMV2OR = OR();
            C1347110l9x c1347110l9x = C1347110l9x.LIZ;
            C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
            keyboardVMV2OR.SQ2(c1347110l9x, false);
        }
    }

    public final void UR() throws Throwable {
        View view = getView();
        if (view == null) {
            return;
        }
        MR(null, false, false);
        C786410Ut5.LJLLLLLL(8, view);
        Function0<Unit> function0 = this.LLJILLL;
        if (function0 != null) {
            function0.invoke();
        }
        IAIPhotoCommentService iAIPhotoCommentService = (IAIPhotoCommentService) PluggableExtentionKt.pluggableSpi$default(IAIPhotoCommentService.class, false, false, false, 14, null);
        if (iAIPhotoCommentService != null) {
            iAIPhotoCommentService.LIZ();
        }
        EnumC1346360l8k enumC1346360l8k = this.LLIZ.inputServiceType;
        if (enumC1346360l8k == null) {
            enumC1346360l8k = EnumC1346360l8k.COMMENT_PANEL;
        }
        KeyboardVMV2 keyboardVMV2OR = OR();
        keyboardVMV2OR.getClass();
        keyboardVMV2OR.withState(new AwS387S0200000_21(keyboardVMV2OR, enumC1346360l8k, 105));
        C1345600l7W c1345600l7W = C1345600l7W.LIZ;
        Comment comment = this.LLILLL;
        c1345600l7W.getClass();
        C1345600l7W.LIZJ(this, false, comment);
        C1344030l4z.LIZJ("CustomAction", "setupSingleKeyboardFragmentIfNeed SingleKeyboardFragment.onKeyboardDismiss");
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Activity activityLIZIZ;
        Activity activityLIZ;
        super.onDestroy();
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        String simpleName = (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C0FNT.LIZ(activityLIZIZ)) == null) ? null : activityLIZ.getClass().getSimpleName();
        String str = C1357140lQ8.LIZIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultCommentPageContainerFragment destroy; top activity is ");
        sbLIZ.append(simpleName);
        C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C1347440lAU c1347440lAU = C1347720lAw.LIZ;
        if (c1347440lAU != null) {
            c1347440lAU.LIZJ = "comment_fragment_destroy";
            C1347720lAw.LJIIL(c1347440lAU);
        }
    }

    @Override // X.InterfaceC737440SwI
    public final boolean Gl(Function1<? super CommentInputContent, Unit> function1) {
        if (Intrinsics.LJFF(function1, this.LLJILJIL)) {
            this.LLJILJIL = null;
            return true;
        }
        return false;
    }

    public final void NR(boolean z) throws Throwable {
        this.LLJJIJIL = false;
        FrameLayout frameLayout = this.LLJJIII;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        if (z) {
            SR();
        }
    }

    public final void VR(EnumC1341680l1C enumC1341680l1C) {
        CommentCommonModel commonModel;
        switch (C1341740l1I.LIZ[enumC1341680l1C.ordinal()]) {
            case 1:
                if (!Intrinsics.LJFF(OR().getState().LL, C1347110l9x.LIZ)) {
                    OR().QK0(this.LLILLL, this.LLILZIL);
                    break;
                }
                break;
            case 2:
                if (!Intrinsics.LJFF(OR().getState().LL, C1347100l9w.LIZ)) {
                    IKeyboardV2Ability iKeyboardV2Ability = (IKeyboardV2Ability) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IKeyboardV2Ability.class, null);
                    if (iKeyboardV2Ability != null) {
                        iKeyboardV2Ability.K41();
                    }
                    KeyboardVMV2 keyboardVMV2OR = OR();
                    String str = this.LLILZIL;
                    if (str == null) {
                        str = "";
                    }
                    keyboardVMV2OR.PQ2(str, "comment_panel_outer");
                    break;
                }
                break;
            case 3:
                if (CommentWithStickerExp.LIZIZ() && CommentWithStickerExp.LIZJ() == EnumC454020HrE.PIN_EMOJI.getType()) {
                    CommentService.LIZ.getClass();
                    C523420Kfs.LIZ().LJIILIIL();
                }
                if (!Intrinsics.LJFF(OR().getState().LL, C1347090l9v.LIZ)) {
                    KeyboardVMV2 keyboardVMV2OR2 = OR();
                    String str2 = this.LLILZIL;
                    keyboardVMV2OR2.getClass();
                    keyboardVMV2OR2.withState(new AwS135S1100000_21(keyboardVMV2OR2, str2, 19));
                    KeyboardVMV2 keyboardVMV2OR3 = OR();
                    Comment comment = this.LLILLL;
                    CommentContextSource commentContextSourceBQ2 = keyboardVMV2OR3.BQ2();
                    if (commentContextSourceBQ2 != null && (commonModel = commentContextSourceBQ2.getCommonModel()) != null && commonModel.isInPhotoCommentDetailPage()) {
                        keyboardVMV2OR3.setState(new AwS600S0100000_21(comment, 422));
                        break;
                    }
                }
                break;
            case 4:
                IKeyboardV2Ability iKeyboardV2Ability2 = (IKeyboardV2Ability) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IKeyboardV2Ability.class, null);
                if (iKeyboardV2Ability2 != null) {
                    iKeyboardV2Ability2.K41();
                }
                OR().TQ2(true);
                break;
            case 5:
                KeyboardVMV2 keyboardVMV2OR4 = OR();
                keyboardVMV2OR4.getClass();
                keyboardVMV2OR4.withState(new AwS600S0100000_21(keyboardVMV2OR4, 410));
                break;
            case 6:
                KeyboardVMV2 keyboardVMV2OR5 = OR();
                keyboardVMV2OR5.getClass();
                keyboardVMV2OR5.withState(new AwS600S0100000_21(keyboardVMV2OR5, 408));
                break;
        }
    }

    @Override // X.InterfaceC1348540lCG
    public final void dn(C1347410lAR c1347410lAR) throws Throwable {
        String aid;
        String str;
        int i;
        String uid;
        int awemeType;
        String str2;
        PollStyle pollStyle;
        AwemeCommentConfig commentConfig;
        int iIntValue;
        AwemeCommentConfig commentConfig2;
        User author;
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            int i2 = C1341740l1I.LIZIZ[c1347410lAR.LIZJ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            str = "no_limit";
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        str = "7d";
                    }
                } else {
                    str = "3d";
                }
            } else {
                str = "1d";
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            String string = a0.LJLIIIL(c1347410lAR.LIZ).toString();
            List<String> list = c1347410lAR.LIZIZ;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator<String> it2 = list.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (a0.LJLIIIL(it2.next()).toString().length() > 0 && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            List<String> list2 = c1347410lAR.LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (String str3 : list2) {
                if (a0.LJLIIIL(str3).toString().length() > 0) {
                    arrayList.add(str3);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            Aweme aweme2 = this.LLILLJJLI;
            if (aweme2 == null || (author = aweme2.getAuthor()) == null || (uid = author.getUid()) == null) {
                uid = "";
            }
            Aweme aweme3 = this.LLILLJJLI;
            if (aweme3 != null) {
                awemeType = aweme3.getAwemeType();
            } else {
                awemeType = 0;
            }
            c1350920lG6.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("question", string);
            c2344009Gk.LIZJ(i, "option_cnt");
            c2344009Gk.LJIIIIZZ("option", strLJJLIIIJ);
            c2344009Gk.LJIIIIZZ("valid_period", str);
            c2344009Gk.LJIIIIZZ("author_id", uid);
            c2344009Gk.LJIIIIZZ("group_id", aid);
            c2344009Gk.LIZJ(awemeType, "aweme_type");
            C1350920lG6.LJJJ(c2344009Gk, "ttinter_comment_poll_post");
            Long lLJIILIIL = C2095008Iq.LJIILIIL(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            CommentPollViewModel commentPollViewModel = (CommentPollViewModel) this.LLJIJIL.getValue();
            Aweme aweme4 = this.LLILLJJLI;
            if (aweme4 != null && (commentConfig2 = aweme4.getCommentConfig()) != null) {
                str2 = commentConfig2.pollBackgroundUrl;
            } else {
                str2 = null;
            }
            String string2 = a0.LJLIIIL(c1347410lAR.LIZ).toString();
            List<String> list3 = c1347410lAR.LIZIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<String> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(a0.LJLIIIL(it3.next()).toString());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList3.add(obj);
                }
            }
            if (string2.length() != 0 && arrayList3.size() >= 2) {
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                int i3 = 0;
                for (Object obj2 : arrayList3) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        arrayList4.add(new PollOption(Integer.valueOf(i3), (String) obj2));
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                CreatePollRequest createPollRequest = new CreatePollRequest(aid, string2, arrayList4, Long.valueOf(c1347410lAR.LIZJ.getExpireSeconds()));
                long andDecrement = CommentPollViewModel.LLILZ.getAndDecrement();
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                Long l = createPollRequest.expireTime;
                long j = 0;
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (jLongValue > 0) {
                        j = jLongValue;
                    }
                }
                if (str2 != null && str2.length() != 0) {
                    pollStyle = new PollStyle(str2, null);
                } else {
                    pollStyle = null;
                }
                String str4 = createPollRequest.title;
                List<PollOption> list4 = createPollRequest.pollOptionList;
                if (list4 == null) {
                    list4 = C13BV.INSTANCE;
                }
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                for (PollOption pollOption : list4) {
                    Integer num = pollOption.index;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    String str5 = pollOption.text;
                    if (str5 == null) {
                        str5 = "";
                    }
                    arrayList5.add(new OptionCount(iIntValue, 0, str5));
                }
                PollInfo pollInfo = new PollInfo(andDecrement, str4, arrayList5, 0, 0, Long.valueOf(j), -1, pollStyle, lLJIILIIL, Long.valueOf(jCurrentTimeMillis));
                commentPollViewModel.LLILLJJLI.put(Long.valueOf(andDecrement), new C1347140lA0(aid, createPollRequest));
                C1075920e6Y c1075920e6Y = new C1075920e6Y(aid, null, Long.valueOf(andDecrement), 2);
                commentPollViewModel.setStateImmediate(new AwS104S1200000_21(aid, pollInfo, c1075920e6Y, 5));
                try {
                    Aweme aweme5 = this.LLILLJJLI;
                    if (aweme5 != null && (commentConfig = aweme5.getCommentConfig()) != null) {
                        commentConfig.setPollId(lLJIILIIL);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                AssemViewModel assemViewModel = (AssemViewModel) this.LLJI.getValue();
                assemViewModel.getClass();
                assemViewModel.setStateImmediate(AFwS259S0000000_21.get$arr$(94));
                MR(new AwS565S0100000_21(this, 1237), true, false);
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1075930e6Z(this, aid, c1075920e6Y, null), 3);
            }
        }
    }

    @Override // X.InterfaceC737440SwI
    public final void e6(Function0<Unit> function0) {
        this.LLJILJILJ = function0;
    }

    @Override // X.InterfaceC737440SwI
    public final void hr(Function1<? super Comment, Unit> function1) {
        this.LLJJ = function1;
    }

    @Override // X.InterfaceC737440SwI
    public final void jg(Function1<? super Comment, Unit> function1) {
        this.LLJJI = function1;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CommentContextSource commentContextSource;
        String str;
        Aweme aweme;
        Comment comment;
        C1346920l9e c1346920l9e;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("aweme_args");
            if (serializable instanceof Aweme) {
                aweme = (Aweme) serializable;
            } else {
                aweme = null;
            }
            this.LLILLJJLI = aweme;
            Serializable serializable2 = arguments.getSerializable("comment_args");
            if (serializable2 instanceof Comment) {
                comment = (Comment) serializable2;
            } else {
                comment = null;
            }
            this.LLILLL = comment;
            String string = arguments.getString("enter_from");
            String str3 = "";
            if (string == null) {
                string = "";
            }
            this.LLILZ = string;
            String string2 = arguments.getString("enter_method");
            if (string2 == null) {
                string2 = "";
            }
            this.LLILZIL = string2;
            String string3 = arguments.getString("from_page");
            if (string3 != null) {
                str3 = string3;
            }
            this.LLILZLL = str3;
            Serializable serializable3 = arguments.getSerializable("keyboard_config");
            if ((serializable3 instanceof C1346920l9e) && (c1346920l9e = (C1346920l9e) serializable3) != null) {
                this.LLIZ = c1346920l9e;
            }
            Serializable serializable4 = arguments.getSerializable("keyboard_source");
            if (serializable4 instanceof CommentContextSource) {
                commentContextSource = (CommentContextSource) serializable4;
            } else {
                commentContextSource = null;
            }
            this.LLJJJ = arguments.getBoolean("is_pre_create", false);
        } else {
            commentContextSource = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        if (commentContextSource == null) {
            commentContextSource = new CommentContextSource();
            Aweme aweme2 = this.LLILLJJLI;
            String str4 = this.LLILZ;
            String str5 = this.LLILZIL;
            C1346910l9d c1346910l9d = this.LLIZ.extra;
            if (c1346910l9d != null) {
                str = c1346910l9d.accountType;
            } else {
                str = null;
            }
            String str6 = this.LLILZLL;
            if (c1346910l9d != null) {
                str2 = c1346910l9d.noticeId;
            }
            commentContextSource.setCommonModel(new CommentCommonModel(aweme2, null, str4, null, str5, null, str6, false, null, null, null, null, 0, str, false, false, true, false, 0, -1, -1, -1, false, false, false, false, false, false, false, null, null, 1, true, false, null, null, "", false, false, "", null, null, null, str2, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, false, false, "", null, null, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false));
        }
        C1554960qZC.LIZ(interfaceC665370Q7zLJFF, commentContextSource, CommentContextSource.class, "source_default_key");
        boolean z = C1354730lMF.LIZ;
        C1354730lMF.LIZJ = this.LLILZLL;
    }

    @Override // X.InterfaceC737440SwI
    public final void rn(Function1<? super CommentInputContent, Unit> function1) {
        this.LLJILJIL = function1;
    }

    @Override // X.InterfaceC737440SwI
    public final void sp(Function0<Unit> function0) {
        this.LLJILLL = function0;
    }

    @Override // X.InterfaceC737440SwI
    public final void yQ(boolean z) {
        if (this.LLJJIJIL) {
            MR(null, z, z);
            if (z) {
                return;
            }
        }
        if (!Intrinsics.LJFF(OR().getState().LL, C1347080l9u.LIZ)) {
            if (OR().getState().LL instanceof C1347120l9y) {
                UR();
                return;
            }
            View view = getView();
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            KeyboardVMV2 keyboardVMV2OR = OR();
            C1347120l9y c1347120l9y = C1347120l9y.LIZ;
            C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
            keyboardVMV2OR.SQ2(c1347120l9y, false);
        }
    }

    public final void WR(Aweme aweme, boolean z) {
        Integer numValueOf;
        String aid;
        Aweme aweme2;
        CharSequence charSequence;
        String str;
        String str2;
        List<String> list;
        List<String> list2;
        String str3;
        String str4;
        CommentStickerStruct commentStickerStruct;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str5;
        String tabName;
        String str6;
        String str7;
        if (aweme != null) {
            if (!isViewValid() || this.mStatusDestroyed) {
                return;
            }
            C722580SWa c722580SWa = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
            CommentContextSource commentContextSourceLIZ = c722580SWa.LIZ(this);
            if (commentContextSourceLIZ != null) {
                CommentKeyboardModel commentKeyboardModel = new CommentKeyboardModel();
                commentKeyboardModel.setForceDisableCommentPhoto(this.LLIZ.forceDisableCommentPhoto);
                commentKeyboardModel.setLandscapeMode(this.LLIZ.isLandScapeMode());
                commentKeyboardModel.setForceDisableReplyWithVideo(this.LLIZ.forceDisableReplyWithVideo);
                commentKeyboardModel.setForceEnableReplyWithVideo(this.LLIZ.forceEnableReplyWithVideo);
                commentKeyboardModel.setForceDisableExposedEmoji(this.LLIZ.forceDisableExposedEmoji);
                commentKeyboardModel.setForceDisableMention(this.LLIZ.forceDisableMention);
                commentKeyboardModel.setInputServiceType(this.LLIZ.inputServiceType);
                commentKeyboardModel.setFromGuideReplyUser(this.LLIZ.isClickFromGuideReplyUser());
                commentKeyboardModel.setPostMethod(this.LLIZ.postMethod);
                commentKeyboardModel.setInitKeyboardTypeName(this.LLIZ.initKeyboardType.name());
                if (!this.LLJJJ) {
                    EnumC1346360l8k enumC1346360l8k = this.LLIZ.inputServiceType;
                    if (enumC1346360l8k != EnumC1346360l8k.COMMENT_PANEL && enumC1346360l8k != EnumC1346360l8k.POST_MODE_FULL_PAGE) {
                        C2189821An6 c2189821An6 = commentContextSourceLIZ.getCommonModel().feedParam;
                        Aweme aweme3 = this.LLILLJJLI;
                        String str8 = this.LLILZ;
                        String str9 = this.LLILZIL;
                        C1346910l9d c1346910l9d = this.LLIZ.extra;
                        if (c1346910l9d != null) {
                            str5 = c1346910l9d.accountType;
                        } else {
                            str5 = null;
                        }
                        if (c2189821An6 != null) {
                            tabName = c2189821An6.getTabName();
                        } else {
                            tabName = null;
                        }
                        String str10 = this.LLILZLL;
                        C1346910l9d c1346910l9d2 = this.LLIZ.extra;
                        if (c1346910l9d2 != null) {
                            str6 = c1346910l9d2.noticeId;
                            str7 = c1346910l9d2.friendsV3TrackScene;
                            if (str7 == null) {
                            }
                            commentContextSourceLIZ.setCommonModel(new CommentCommonModel(aweme3, null, str8, null, str9, null, str10, false, null, null, tabName, null, 0, str5, false, false, true, false, 0, -1, -1, -1, false, false, false, false, false, false, false, null, null, 1, true, false, null, null, "", false, false, "", null, null, c2189821An6, str6, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, false, false, str7, null, null, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false));
                            boolean z2 = C1354730lMF.LIZ;
                            C1354730lMF.LIZJ = this.LLILZLL;
                        } else {
                            str6 = null;
                        }
                        str7 = "";
                        commentContextSourceLIZ.setCommonModel(new CommentCommonModel(aweme3, null, str8, null, str9, null, str10, false, null, null, tabName, null, 0, str5, false, false, true, false, 0, -1, -1, -1, false, false, false, false, false, false, false, null, null, 1, true, false, null, null, "", false, false, "", null, null, c2189821An6, str6, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, false, false, str7, null, null, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false));
                        boolean z22 = C1354730lMF.LIZ;
                        C1354730lMF.LIZJ = this.LLILZLL;
                    } else if (z) {
                        CommentCommonModel commonModel = commentContextSourceLIZ.getCommonModel();
                        commentContextSourceLIZ.setCommonModel(commonModel.copy(this.LLILLJJLI, commonModel.requestId, commonModel.enterFrom, commonModel.videoFrom, commonModel.enterMethod, commonModel.enterPosition, commonModel.fromPage, commonModel.fromViewPostEntry, commonModel.eventType, commonModel.isMyProfile, commonModel.tabName, commonModel.isSpiltMode, commonModel.pageType, commonModel.accountType, commonModel.commentClose, commonModel.commentLimited, commonModel.enableComment, commonModel.isLandscapeMode, commonModel.commentNotice, commonModel.inboxNoticeType, commonModel.inboxNoticeSubType, commonModel.innerPushType, commonModel.forceHideBatchManagementView, commonModel.forceOpenKeyboard, commonModel.forceHideAutoKeyboard, commonModel.forceHideCommentDesc, commonModel.shouldShowVideoDesc, commonModel.forceHideDonation, commonModel.forceHidePoi, commonModel.sessionId, commonModel.splitContainerTag, commonModel.locatePageType, commonModel.smoothScrollLocate, commonModel.isNoPermissionVideoFromCommentHistory, commonModel.showHeightChangeListener, commonModel.scrollStateChangedListener, commonModel.showCommentPostCid, commonModel.isPreCreate, commonModel.isPreBind, commonModel.channelNameForServer, commonModel.fypExposedCommentMobParams, commonModel.gdLabel, commonModel.feedParam, commonModel.noticeId, commonModel.holidayModel, commonModel.isInPhotoCommentDetailPage, commonModel.choosePhotoFromInnerPage, commonModel.createAIPhotoFromInnerPage, commonModel.createAIPhotoFromCommentAnchor, commonModel.postFromInnerPageAddPhoto, commonModel.enterPhotoDetailComment, commonModel.lastViewedPhotoComment, commonModel.scrollDirection, commonModel.innerChoosePhotoCache, commonModel.innerCreateAIPhotoCache, commonModel.panelSessionCode, commonModel.tempEnterMethod, commonModel.isFriendsSimpleDetail, commonModel.isFriendsV3Feed, commonModel.blockSortFeatInFriendsV3, commonModel.friendsV3TrackScene, commonModel.storyCommentPageParam, commonModel.titleClickMethod, commonModel.videoDescOnly, commonModel.videoDescViewHeight, commonModel.isVideoMusicTitleDisplayOnFeed, commonModel.fragmentReCreated, commonModel.navigationBarAutoColorOnHide, commonModel.reportPanelHeight, commonModel.commentStickerUniqueId, commonModel.wordsSource, commonModel.socialEntrance, commonModel.cmtInputPos, commonModel.offlineCommentMode));
                    }
                }
                C1346910l9d c1346910l9d3 = this.LLIZ.extra;
                if (c1346910l9d3 != null) {
                    charSequence = c1346910l9d3.initEditTextContent;
                } else {
                    charSequence = null;
                }
                if (charSequence != null && charSequence.length() != 0) {
                    KeyboardVMV2 keyboardVMV2OR = OR();
                    Aweme aweme4 = this.LLILLJJLI;
                    Editable.Factory factory = Editable.Factory.getInstance();
                    C1346910l9d c1346910l9d4 = this.LLIZ.extra;
                    if (c1346910l9d4 != null) {
                        charSequence2 = c1346910l9d4.initEditTextContent;
                    } else {
                        charSequence2 = null;
                    }
                    Editable editableNewEditable = factory.newEditable(charSequence2);
                    EnumC1346360l8k enumC1346360l8k2 = this.LLIZ.inputServiceType;
                    if (enumC1346360l8k2 == null) {
                        enumC1346360l8k2 = EnumC1346360l8k.COMMENT_PANEL;
                    }
                    keyboardVMV2OR.WQ2(aweme4, editableNewEditable, enumC1346360l8k2);
                    C1346910l9d c1346910l9d5 = this.LLIZ.extra;
                    if (c1346910l9d5 != null) {
                        charSequence3 = c1346910l9d5.initEditTextContent;
                    } else {
                        charSequence3 = null;
                    }
                    commentKeyboardModel.setInitEditTextContent(charSequence3);
                }
                C1346910l9d c1346910l9d6 = this.LLIZ.extra;
                if (c1346910l9d6 != null && c1346910l9d6.initSticker != null) {
                    KeyboardVMV2 keyboardVMV2OR2 = OR();
                    Aweme aweme5 = this.LLILLJJLI;
                    C1346920l9e c1346920l9e = this.LLIZ;
                    C1346910l9d c1346910l9d7 = c1346920l9e.extra;
                    if (c1346910l9d7 != null) {
                        commentStickerStruct = c1346910l9d7.initSticker;
                    } else {
                        commentStickerStruct = null;
                    }
                    EnumC1346360l8k enumC1346360l8k3 = c1346920l9e.inputServiceType;
                    if (enumC1346360l8k3 == null) {
                        enumC1346360l8k3 = EnumC1346360l8k.COMMENT_PANEL;
                    }
                    keyboardVMV2OR2.VQ2(aweme5, commentStickerStruct, enumC1346360l8k3);
                }
                C1346910l9d c1346910l9d8 = this.LLIZ.extra;
                if (c1346910l9d8 != null && (str3 = c1346910l9d8.quickCommentActionType) != null && str3.length() != 0) {
                    C1346910l9d c1346910l9d9 = this.LLIZ.extra;
                    if (c1346910l9d9 != null) {
                        str4 = c1346910l9d9.quickCommentActionType;
                    } else {
                        str4 = null;
                    }
                    commentKeyboardModel.setQuickCommentActionType(str4);
                }
                C1346910l9d c1346910l9d10 = this.LLIZ.extra;
                if (c1346910l9d10 != null && (list = c1346910l9d10.quickCommentEmojiString) != null && !list.isEmpty()) {
                    C1346910l9d c1346910l9d11 = this.LLIZ.extra;
                    if (c1346910l9d11 != null) {
                        list2 = c1346910l9d11.quickCommentEmojiString;
                    } else {
                        list2 = null;
                    }
                    commentKeyboardModel.setQuickCommentEmojiString(list2);
                }
                C1346910l9d c1346910l9d12 = this.LLIZ.extra;
                if (c1346910l9d12 != null && (str = c1346910l9d12.quickCommentShowType) != null && str.length() != 0) {
                    C1346910l9d c1346910l9d13 = this.LLIZ.extra;
                    if (c1346910l9d13 != null) {
                        str2 = c1346910l9d13.quickCommentShowType;
                    } else {
                        str2 = null;
                    }
                    commentKeyboardModel.setQuickCommentShowType(str2);
                }
                commentContextSourceLIZ.initKeyboardModel(commentKeyboardModel);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateSource ");
            CommentContextSource commentContextSourceLIZ2 = this.LL.LIZ(this);
            if (commentContextSourceLIZ2 != null) {
                numValueOf = Integer.valueOf(commentContextSourceLIZ2.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(' ');
            CommentContextSource commentContextSourceLIZ3 = this.LL.LIZ(this);
            if (commentContextSourceLIZ3 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceLIZ3)) != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        throw new NullPointerException(" SingleKeyboard updateSource aweme is null");
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        CommentKeyboardModel keyboardModel;
        int i;
        super.onViewCreated(view, bundle);
        this.LLJJIII = (FrameLayout) view.findViewById(R.id.rfh);
        if (getChildFragmentManager().LJJJJZI("comment_poll_create") != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIJIL = z;
        FrameLayout frameLayout = this.LLJJIII;
        if (frameLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZ(i, frameLayout);
        }
        int i2 = OR().getState().LLILLL;
        FrameLayout frameLayout2 = this.LLJJIII;
        if (frameLayout2 != null && frameLayout2.getPaddingBottom() != i2) {
            frameLayout2.setPadding(frameLayout2.getPaddingLeft(), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), i2);
        }
        if (!Intrinsics.LJFF(this.LLILZLL, "graphic_detail") && Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0l9m
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    view2.setPadding(0, 0, 0, c20246014Ju.LIZ(7).LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        WR(this.LLILLJJLI, false);
        Boolean boolValueOf = null;
        C723850SaN.LIZ(this, false, null, new AwS590S0100000_11(this, 43), 3);
        C722580SWa c722580SWa = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        CommentContextSource commentContextSourceLIZ = c722580SWa.LIZ(this);
        if (commentContextSourceLIZ != null && (keyboardModel = commentContextSourceLIZ.getKeyboardModel()) != null) {
            boolValueOf = Boolean.valueOf(keyboardModel.isLandscapeMode());
        }
        if (C1346420l8q.LIZJ(boolValueOf)) {
            C1591860rWi.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), view);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0l9D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C722650SWh) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 58), 4);
        C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.0SYc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 59), 4);
        C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.0l9i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1346950l9h) obj).LLILLL);
            }
        }, null, new AwS625S0100000_11(this, 5), 6);
        C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.0l6F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LL;
            }
        }, null, new AwS456S0200000_21(this, view, 4), 6);
        if (this.LLJJJ) {
            C786410Ut5.LJLLLLLL(8, view);
        } else {
            VR(this.LLIZ.initKeyboardType);
        }
        FragmentManager fragmentManagerLJ = C1345700l7g.LJ(this);
        if (fragmentManagerLJ != null) {
            fragmentManagerLJ.LJZL(this.LLJJJIL, false);
        }
    }

    public final void MR(Function0 function0, boolean z, boolean z2) throws Throwable {
        PollCreateFragment pollCreateFragment;
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI("comment_poll_create");
        if ((fragmentLJJJJZI instanceof PollCreateFragment) && (pollCreateFragment = (PollCreateFragment) fragmentLJJJJZI) != null) {
            if (z2) {
                SR();
            }
            AwS57S0310000_19 awS57S0310000_19 = new AwS57S0310000_19(this, (SingleKeyboardFragment) z2, (boolean) pollCreateFragment, (PollCreateFragment) function0, (Function0<Unit>) 0);
            if (z) {
                View view = pollCreateFragment.LLJI;
                if (view == null) {
                    awS57S0310000_19.invoke();
                    return;
                } else {
                    view.animate().cancel();
                    HandlerHook.viewPost(view, new ARunnableS39S0300000_6(pollCreateFragment, view, awS57S0310000_19, 1));
                    return;
                }
            }
            awS57S0310000_19.invoke();
            return;
        }
        NR(z2);
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        boolean z = C1354730lMF.LIZ;
        View viewLIZIZ = C21146717pB.LIZIZ(C1354730lMF.LIZIZ(requireContext()), R.layout.a4o, viewGroup, false);
        try {
            ViewTreeLifecycleOwner.set(viewLIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLIZIZ, this);
            viewLIZIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLIZIZ;
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

    public final void RR(Aweme aweme, Comment comment, String str, String str2, String str3, C1346920l9e c1346920l9e) throws Throwable {
        String aid;
        boolean z;
        String cid;
        String cid2;
        this.LLJJJ = false;
        if (aweme == null || !isViewValid()) {
            return;
        }
        MR(null, false, false);
        Aweme aweme2 = this.LLILLJJLI;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, aweme.getAid()) && c1346920l9e.inputServiceType == this.LLIZ.inputServiceType) {
            z = false;
        } else {
            z = true;
        }
        Comment comment2 = this.LLILLL;
        if (comment2 != null) {
            cid = comment2.getCid();
        } else {
            cid = null;
        }
        if (comment != null) {
            cid2 = comment.getCid();
        } else {
            cid2 = null;
        }
        boolean zLJFF = true ^ Intrinsics.LJFF(cid, cid2);
        OR().LL = C1558360qeg.LJFF(this, null);
        OR().LLILLJJLI = new WeakReference<>(this);
        this.LLILLL = comment;
        this.LLIZ = c1346920l9e;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLILLJJLI = aweme;
        if (zLJFF) {
            C1344030l4z.LIZJ("single_keyboard_input", "reset keyboard content");
            OR().OQ2();
            KeyboardVMV2 keyboardVMV2OR = OR();
            keyboardVMV2OR.getClass();
            keyboardVMV2OR.setState(AFwS259S0000000_21.get$arr$(440));
            keyboardVMV2OR.LLILZ.LJIIIZ(-1);
            keyboardVMV2OR.LLJJI = false;
            keyboardVMV2OR.LLJJ = false;
            keyboardVMV2OR.LLJJIII = "";
        }
        WR(aweme, z);
        ISingleCommentKeyboardAbility iSingleCommentKeyboardAbility = (ISingleCommentKeyboardAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISingleCommentKeyboardAbility.class, null);
        if (iSingleCommentKeyboardAbility != null) {
            iSingleCommentKeyboardAbility.tD2(Boolean.valueOf(z));
        }
        VR(c1346920l9e.initKeyboardType);
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
